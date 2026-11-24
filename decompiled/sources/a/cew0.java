package a;

import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public final class cew0 extends dgw0 {
    public final /* synthetic */ byte n;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cew0(String str, byte b) {
        super(1);
        this.n = b;
        switch (b) {
            case 1:
                super(10);
                s0x.E("RECAPTCHA_ENTERPRISE");
                this.o = new hbb(str, (byte) 6);
                break;
            default:
                s0x.F(str, "refresh token cannot be null");
                this.o = str;
                break;
        }
    }

    @Override // a.dgw0
    public final String a() {
        switch (this.n) {
            case 0:
                return "getAccessToken";
            case 1:
                return "getRecaptchaConfig";
            case 2:
                return "linkPhoneAuthCredential";
            default:
                return "linkEmailAuthCredential";
        }
    }

    @Override // a.dgw0
    public final void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var) {
        byte b = this.n;
        zlt0 zlt0Var = this.b;
        Object obj = this.o;
        byte b2 = 19;
        switch (b) {
            case 0:
                this.g = new trm0(this, taskCompletionSource, b2);
                String str = (String) obj;
                ffw0Var.getClass();
                s0x.E(str);
                s0x.H(zlt0Var);
                nmt0 nmt0Var = ffw0Var.f9464a;
                hcp0 hcp0Var = new hcp0(zlt0Var, ffw0.b);
                s0x.E(str);
                y60 y60Var = new y60(str);
                ywq0 ywq0Var = (ywq0) nmt0Var.f23789a;
                ilp0 ilp0Var = new ilp0(nmt0Var, hcp0Var);
                rfw0 rfw0Var = (rfw0) ywq0Var.c;
                hhm0.G(rfw0Var.M("/token", (String) ywq0Var.f), y60Var, ilp0Var, new zzaia(), (fht0) rfw0Var.b);
                break;
            case 1:
                this.g = new trm0(this, taskCompletionSource, b2);
                hbb hbbVar = (hbb) obj;
                ffw0Var.getClass();
                s0x.H(hbbVar);
                nmt0 nmt0Var2 = ffw0Var.f9464a;
                hcp0 hcp0Var2 = new hcp0(zlt0Var, ffw0.b);
                ywq0 ywq0Var2 = (ywq0) nmt0Var2.f23789a;
                drm0 drm0Var = new drm0(nmt0Var2, hcp0Var2);
                rfw0 rfw0Var2 = (rfw0) ywq0Var2.b;
                String strConcat = rfw0Var2.M("/recaptchaConfig", (String) ywq0Var2.f).concat("&clientType=CLIENT_TYPE_ANDROID&version=RECAPTCHA_ENTERPRISE");
                String str2 = hbbVar.b;
                if (str2 != null && !str2.isEmpty()) {
                    strConcat = kng0.l(strConcat, "&tenantId=", str2);
                }
                jiw0 jiw0Var = new jiw0();
                fht0 fht0Var = (fht0) rfw0Var2.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strConcat).openConnection();
                    httpURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                    httpURLConnection.setReadTimeout(60000);
                    fht0Var.w(httpURLConnection);
                    hhm0.H(httpURLConnection, drm0Var, jiw0Var);
                } catch (SocketTimeoutException unused) {
                    drm0Var.mo2zza(Payload.RESPONSE_TIMEOUT);
                    return;
                } catch (UnknownHostException unused2) {
                    drm0Var.mo2zza("<<Network Error>>");
                    return;
                } catch (IOException e) {
                    drm0Var.mo2zza(e.getMessage());
                    return;
                }
                break;
            case 2:
                this.g = new trm0(this, taskCompletionSource, b2);
                String strO = ((zzad) this.d).f45652a.o();
                lsj lsjVarR = ihm0.r((PhoneAuthCredential) obj);
                s0x.E(strO);
                ffw0Var.getClass();
                s0x.H(zlt0Var);
                s0x.E(strO);
                nmt0 nmt0Var3 = ffw0Var.f9464a;
                hcp0 hcp0Var3 = new hcp0(zlt0Var, ffw0.b);
                s0x.E(strO);
                x4w0 x4w0Var = new x4w0();
                x4w0Var.f40287a = lsjVarR;
                x4w0Var.b = hcp0Var3;
                x4w0Var.c = nmt0Var3;
                nmt0Var3.h(strO, x4w0Var);
                break;
            default:
                this.g = new trm0(this, taskCompletionSource, b2);
                EmailAuthCredential emailAuthCredential = (EmailAuthCredential) obj;
                FirebaseUser firebaseUser = this.d;
                emailAuthCredential.getClass();
                emailAuthCredential.d = ((zzad) firebaseUser).f45652a.o();
                emailAuthCredential.e = true;
                ffw0Var.a(new mhw0(emailAuthCredential, null, null), zlt0Var);
                break;
        }
    }

    @Override // a.dgw0
    public final void e() {
        switch (this.n) {
            case 0:
                if (TextUtils.isEmpty(this.h.f45523a)) {
                    zzaia zzaiaVar = this.h;
                    String str = (String) this.o;
                    zzaiaVar.getClass();
                    s0x.E(str);
                    zzaiaVar.f45523a = str;
                }
                this.e.b(this.h, this.d);
                f(qmw0.a(this.h.b));
                break;
            case 1:
                f(this.l);
                break;
            case 2:
                zzad zzadVarT = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT));
                break;
            default:
                zzad zzadVarT2 = fck0.t(this.c, this.i);
                this.e.b(this.h, zzadVarT2);
                f(new com.google.firebase.auth.internal.zzx(zzadVarT2));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cew0(AuthCredential authCredential, byte b) {
        super(2);
        this.n = b;
        this.o = authCredential;
    }
}
