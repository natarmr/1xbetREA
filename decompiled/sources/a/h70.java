package a;

import android.content.Intent;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.yandex.authsdk.YandexAuthToken;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h70 implements uw00, ufw0 {
    public static final h70 c;
    public static final h70 d;
    public static final h70 e;
    public static final h70 f;
    public static final h70 g;
    public static final h70 h;
    public static final h70 i;
    public static final h70 j;
    public static final h70 k;
    public static final h70 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12553a;
    public String b;

    static {
        byte b = 0;
        c = new h70("TINK", b);
        d = new h70("CRUNCHY", b);
        e = new h70("NO_PREFIX", b);
        byte b2 = 1;
        f = new h70("SHA1", b2);
        g = new h70("SHA224", b2);
        h = new h70("SHA256", b2);
        i = new h70("SHA384", b2);
        j = new h70("SHA512", b2);
        byte b3 = 2;
        k = new h70("TINK", b3);
        l = new h70("NO_PREFIX", b3);
    }

    public h70(String str) {
        this.f12553a = (byte) 4;
        str.getClass();
        this.b = str;
    }

    public byte[] a(int i2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        gix0 gix0Var = gix0.c;
        String str = this.b;
        Mac mac = (Mac) gix0Var.f11371a.zza(str);
        if (i2 > mac.getMacLength() * 255) {
            hny.o("size too large");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i3 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i3);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i2) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i2 - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i3++;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        gix0 gix0Var = gix0.c;
        String str = this.b;
        Mac mac = (Mac) gix0Var.f11371a.zza(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    @Override // a.uw00
    public YandexAuthToken k(Intent intent) {
        intent.getClass();
        String stringExtra = intent.getStringExtra("com.yandex.auth.EXTRA_OAUTH_TOKEN");
        long longExtra = intent.getLongExtra("com.yandex.auth.OAUTH_TOKEN_EXPIRES", 0L);
        if (stringExtra != null) {
            return new YandexAuthToken(longExtra, stringExtra, this.b);
        }
        return null;
    }

    @Override // a.uw00
    public d2w0 l(Intent intent) {
        intent.getClass();
        if (!intent.getBooleanExtra("com.yandex.auth.OAUTH_TOKEN_ERROR", false)) {
            return null;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES");
        return stringArrayExtra != null ? new d2w0(stringArrayExtra) : new d2w0("connection.error");
    }

    public String toString() {
        boolean zContainsAlias;
        switch (this.f12553a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.b;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                return rw2.p(sb, zContainsAlias, "}");
            default:
                return super.toString();
        }
    }

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CommonConstant.KEY_ID_TOKEN, this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ h70(String str, byte b) {
        this.f12553a = b;
        this.b = str;
    }

    public /* synthetic */ h70() {
        this.f12553a = (byte) 5;
    }

    public h70(String str, Object obj) {
        this.f12553a = (byte) 3;
        this.b = str;
    }
}
