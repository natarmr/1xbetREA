package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FlexibleDecrypt implements AesDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45683a;
    public final String b;
    public DecryptLocalResource c;

    public FlexibleDecrypt(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", "init");
        this.f45683a = context;
        this.b = str;
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public final String a(String str) {
        DecryptLocalResource decryptLocalResource;
        DecryptLocalResource decryptLocalResource2 = this.c;
        String str2 = this.b;
        Context context = this.f45683a;
        IDecrypt iDecryptB = decryptLocalResource2;
        if (decryptLocalResource2 == null) {
            String strB = ResourcesUtils.b(context, str2, "agc_plugin_", "crypto_component");
            if (strB != null) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Hex.a(strB), "utf-8"));
                    decryptLocalResource = new DecryptLocalResource(new AesParam(jSONObject.getInt("iterationCount"), jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm")));
                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                    Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e.getMessage());
                    decryptLocalResource = null;
                }
            } else {
                decryptLocalResource = null;
            }
            this.c = decryptLocalResource;
            iDecryptB = decryptLocalResource;
        }
        if (iDecryptB == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            iDecryptB = new FixedDecrypt(context, str2).b();
            this.c = (DecryptLocalResource) iDecryptB;
        }
        return ((DecryptLocalResource) iDecryptB).a(ResourcesUtils.b(context, str2, "agc_plugin_", str));
    }
}
