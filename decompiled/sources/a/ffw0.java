package a;

import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ffw0 {
    public static final zz2 b = new zz2("FirebaseAuth", "FirebaseAuthFallback:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmt0 f9464a;

    public ffw0(nfq nfqVar, ScheduledExecutorService scheduledExecutorService) throws Throwable {
        s0x.H(nfqVar);
        nfqVar.a();
        s0x.H(nfqVar.f23449a);
        x860 x860VarI = x860.i();
        ywq0 ywq0Var = new ywq0();
        ywq0Var.e = nfqVar;
        nfqVar.a();
        String str = nfqVar.c.f21755a;
        ywq0Var.f = str;
        nfqVar.a();
        String str2 = nfqVar.c.h;
        ywq0Var.d = x860VarI;
        ywq0Var.c = null;
        ywq0Var.f43384a = null;
        ywq0Var.b = null;
        String strW = qim0.w("firebear.secureToken");
        if (TextUtils.isEmpty(strW)) {
            gx3 gx3Var = xgw0.f40860a;
            synchronized (gx3Var) {
                if (gx3Var.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            strW = "https://securetoken.googleapis.com/v1";
        } else {
            f140.r("Found hermetic configuration for secureToken URL: ", strW, "LocalClient");
        }
        if (((rfw0) ywq0Var.c) == null) {
            ywq0Var.c = new rfw0(strW, ywq0Var.J());
        }
        String strW2 = qim0.w("firebear.identityToolkit");
        if (TextUtils.isEmpty(strW2)) {
            xgw0.b(str);
            strW2 = "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
        } else {
            f140.r("Found hermetic configuration for identityToolkit URL: ", strW2, "LocalClient");
        }
        if (((rfw0) ywq0Var.f43384a) == null) {
            ywq0Var.f43384a = new rfw0(strW2, ywq0Var.J());
        }
        String strW3 = qim0.w("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strW3)) {
            gx3 gx3Var2 = xgw0.f40860a;
            synchronized (gx3Var2) {
                if (gx3Var2.get(str) != null) {
                    throw new ClassCastException();
                }
            }
            strW3 = "https://identitytoolkit.googleapis.com/v2";
        } else {
            f140.r("Found hermetic configuration for identityToolkitV2 URL: ", strW3, "LocalClient");
        }
        if (((rfw0) ywq0Var.b) == null) {
            ywq0Var.b = new rfw0(strW3, ywq0Var.J());
        }
        ((zdw0) nfqVar.b(zdw0.class)).getClass();
        gx3 gx3Var3 = xgw0.b;
        synchronized (gx3Var3) {
            try {
                if (gx3Var3.containsKey(str)) {
                    ((List) gx3Var3.get(str)).add(new WeakReference(ywq0Var));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(ywq0Var));
                    gx3Var3.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9464a = new nmt0(ywq0Var);
        new tgw0(scheduledExecutorService);
    }

    public final void a(mhw0 mhw0Var, efw0 efw0Var) {
        s0x.H(efw0Var);
        s0x.H(mhw0Var.c);
        EmailAuthCredential emailAuthCredential = mhw0Var.c;
        String str = mhw0Var.e;
        hcp0 hcp0Var = new hcp0(efw0Var, b);
        s0x.H(emailAuthCredential);
        boolean z = emailAuthCredential.e;
        nmt0 nmt0Var = this.f9464a;
        if (!z) {
            nmt0Var.f(new mhw0(emailAuthCredential, null, str), hcp0Var);
            return;
        }
        String str2 = emailAuthCredential.d;
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = emailAuthCredential;
        h0q0Var.b = str;
        h0q0Var.c = hcp0Var;
        h0q0Var.d = nmt0Var;
        nmt0Var.h(str2, h0q0Var);
    }

    public final void b(zzajg zzajgVar, efw0 efw0Var) {
        s0x.H(zzajgVar);
        s0x.H(efw0Var);
        hcp0 hcp0Var = new hcp0(efw0Var, b);
        zzajgVar.o = true;
        nmt0 nmt0Var = this.f9464a;
        ywq0 ywq0Var = (ywq0) nmt0Var.f23789a;
        afm0 afm0Var = new afm0(nmt0Var, hcp0Var);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/verifyAssertion", (String) ywq0Var.f), zzajgVar, afm0Var, new ljw0(), (fht0) rfw0Var.b);
    }

    public final void c(PhoneAuthCredential phoneAuthCredential, String str, efw0 efw0Var) {
        s0x.H(efw0Var);
        s0x.H(phoneAuthCredential);
        lsj lsjVarR = ihm0.r(phoneAuthCredential);
        lsjVarR.g = str;
        hcp0 hcp0Var = new hcp0(efw0Var, b);
        nmt0 nmt0Var = this.f9464a;
        ywq0 ywq0Var = (ywq0) nmt0Var.f23789a;
        okt0 okt0Var = new okt0(nmt0Var, hcp0Var, false);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/verifyPhoneNumber", (String) ywq0Var.f), lsjVarR, okt0Var, new njw0(), (fht0) rfw0Var.b);
    }

    public final void d(String str, String str2, String str3, String str4, efw0 efw0Var) {
        s0x.E(str);
        s0x.E(str2);
        s0x.H(efw0Var);
        hcp0 hcp0Var = new hcp0(efw0Var, b);
        s0x.E(str);
        s0x.E(str2);
        v35 v35Var = new v35();
        s0x.E(str);
        v35Var.f36718a = str;
        s0x.E(str2);
        v35Var.b = str2;
        v35Var.c = str3;
        v35Var.d = str4;
        nmt0 nmt0Var = this.f9464a;
        ywq0 ywq0Var = (ywq0) nmt0Var.f23789a;
        trm0 trm0Var = new trm0((Object) nmt0Var, (Object) hcp0Var, false, (byte) 18);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/verifyPassword", (String) ywq0Var.f), v35Var, trm0Var, new mjw0(), (fht0) rfw0Var.b);
    }
}
