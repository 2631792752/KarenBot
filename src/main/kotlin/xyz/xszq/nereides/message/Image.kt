package xyz.xszq.nereides.message

interface Image: RichMedia {
    val id: String
    override fun contentToString(): String {
        return "[image:$id]"
    }
}