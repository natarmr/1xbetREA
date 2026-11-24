package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tav extends hxf {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public tav(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super(bundle, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL");
        this.c = str;
        this.d = str2;
        this.e = str4;
        this.f = str5;
        if (str.length() <= 0) {
            jf4.o("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            jf4.o("idToken should not be empty");
            throw null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{Separators.DOT}, false, 0, 6, null);
        if (listSplit$default.size() != 3) {
            jf4.o("Invalid token format");
            throw null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listSplit$default.get(1), 8);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("email");
            strOptString = strOptString.length() == 0 ? null : strOptString;
            String strOptString2 = jSONObject.optString("sub");
            if ((strOptString2.length() != 0 ? strOptString2 : null) == null) {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
            this.g = strOptString;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
