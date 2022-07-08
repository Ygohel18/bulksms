package `in`.planckstudio.bulksms.model

import org.json.JSONObject

class UserModel {
    private var id: Int = 0
    private var uuid: String = ""
    private var email: String = ""
    private var password: String = ""
    private var createdAt: String = ""
    private var isPremium: Boolean = false
    private var isBanned: Boolean = false
    private var credit: Int = 0

    constructor()

    constructor(user: JSONObject) {
        setId(user.getInt("id"))
        setEmail(user.getString("email"))
        setPassword(user.getString("password"))
        setUuid(user.getString("uuid"))
        setCreatedAt(user.getString("created_at"))
        setCredit(user.getInt("credit"))
        setIsPremium(user.getBoolean("is_premium"))
        setIsBanned(user.getBoolean("is_banned"))
    }

    private fun setId(id: Int) {
        this.id = id
    }

    private fun setEmail(email: String) {
        this.email = email
    }

    private fun setPassword(password: String) {
        this.password = password
    }

    private fun setUuid(uuid: String) {
        this.uuid = uuid
    }

    private fun setCreatedAt(createdAt: String) {
        this.createdAt = createdAt
    }

    private fun setIsPremium(isPremium: Boolean) {
        this.isPremium = isPremium
    }

    private fun setIsBanned(isBanned: Boolean) {
        this.isBanned = isBanned
    }

    private fun setCredit(credit: Int) {
        this.credit = credit
    }

    private fun getId(): Int {
        return this.id
    }

    private fun getCredit(): Int {
        return this.credit
    }

    private fun getUuid(): String {
        return this.uuid
    }

    private fun getEmail(): String {
        return this.email
    }

    private fun getPassword(): String {
        return this.password
    }

    private fun getCreatedAt(): String {
        return this.createdAt
    }

    private fun getIsPremium(): Boolean {
        return this.isPremium
    }

    private fun getIsBanned(): Boolean {
        return this.isBanned
    }

    private fun getUser(): JSONObject {
        return JSONObject()
            .put("id", getId())
            .put("uuid", getUuid())
            .put("email", getEmail())
            .put("password", getPassword())
            .put("createdAt", getCreatedAt())
            .put("credit", getCredit())
            .put("isPremium", getIsPremium())
            .put("isBanned", getIsBanned())
    }
}