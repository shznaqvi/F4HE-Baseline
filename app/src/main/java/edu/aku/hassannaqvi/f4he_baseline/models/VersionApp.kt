package edu.aku.hassannaqvi.f4he_baseline.models

import android.database.Cursor
import edu.aku.hassannaqvi.f4he_baseline.contracts.TableContracts.VersionTable
import org.json.JSONException
import org.json.JSONObject

class VersionApp {
    var versioncode: String = _EMPTY_
    var versionname: String = _EMPTY_
    var pathname: String = _EMPTY_

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): VersionApp {
        versioncode = jsonObject.getString(VersionTable.COLUMN_VERSION_CODE)
        pathname = jsonObject.getString(VersionTable.COLUMN_PATH_NAME)
        versionname = jsonObject.getString(VersionTable.COLUMN_VERSION_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): VersionApp {
        versioncode =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_CODE))
        pathname = cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_PATH_NAME))
        versionname =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_NAME))
        return this
    }


}