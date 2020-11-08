package buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
    get() {return material.numberNeeded * baseMaterialsNeeded}
    fun build() {
        println("type: ${material::class.simpleName}, needs $actualMaterialsNeeded")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if ( building.actualMaterialsNeeded < 500 ) print("small") else print("big")
}

fun main() {

    val wood = Wood()
    val building = Building(wood)
    building.build()
    isSmallBuilding(building)
    isSmallBuilding(Building(Brick()))
}