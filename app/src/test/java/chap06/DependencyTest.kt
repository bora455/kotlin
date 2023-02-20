package chap06

class Patient2(val name: String, var id: Int) {
    fun doctorList2(d: Doctor) {
        println("Patient2: $name, Doctor2: ${d.name}")
    }
}
class Doctor2(val name: String, val p: Patient2) {
    val customerId: Int = p.id
    fun patientList2() {
        println("Doctor2: $name, Patient2: ${p.name}")
        println("Patient2 Id: $customerId")
    }
}
fun main() {
    val patient2 = Patient2("kildong", 1234)
    val doc2 = Doctor2("KimSabu", patient2)
    doc2.patientList2()
}