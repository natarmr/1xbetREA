package a;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class zlt0 implements u73, w7, efw0, mff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44598a;
    public final Object b;

    public zlt0(nfq nfqVar) {
        this.f44598a = (byte) 13;
        nfqVar.a();
        Context context = nfqVar.f23449a;
        tlw0 tlw0Var = new tlw0();
        tlw0.e.K("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        jaw0 jaw0Var = new jaw0(handlerThread.getLooper());
        Looper.getMainLooper();
        tlw0Var.c = jaw0Var;
        nfqVar.a();
        tlw0Var.d = new mfr(tlw0Var, nfqVar.b);
        this.b = tlw0Var;
        fc5.b((Application) context.getApplicationContext());
        fc5.e.a(new g9w0(this, (byte) 1));
    }

    @Override // a.efw0
    public void a(Status status) {
        dgw0 dgw0Var = (dgw0) this.b;
        String str = status.b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        if (dgw0Var.f6063a == 8) {
            dgw0Var.m = true;
            throw null;
        }
        amw0 amw0Var = dgw0Var.f;
        if (amw0Var != null) {
            amw0Var.a(status);
        }
        dgw0Var.c(status);
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
        lmx lmxVar = new lmx((TaskCompletionSource) obj2);
        uuw uuwVar = (uuw) ((rxw) obj).l();
        ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
        apiMetadata.c = false;
        suw suwVar = (suw) uuwVar;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i = onw0.f25568a;
        parcelObtain.writeStrongBinder(lmxVar);
        onw0.b(parcelObtain, getCredentialRequest);
        onw0.b(parcelObtain, apiMetadata);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            suwVar.f32839a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // a.efw0
    public void b(Status status, PhoneAuthCredential phoneAuthCredential) {
        dgw0 dgw0Var = (dgw0) this.b;
        byte b = dgw0Var.f6063a;
        s0x.J("Unexpected response type " + ((int) b), b == 2);
        amw0 amw0Var = dgw0Var.f;
        if (amw0Var != null) {
            amw0Var.a(status);
        }
        dgw0Var.j = phoneAuthCredential;
        amw0 amw0Var2 = dgw0Var.f;
        if (amw0Var2 != null) {
            amw0Var2.a(status);
        }
        dgw0Var.c(status);
    }

    @Override // a.efw0
    public void c(cmt0 cmt0Var) {
        dgw0 dgw0Var = (dgw0) this.b;
        dgw0Var.k = cmt0Var;
        dgw0Var.c(msm0.v("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // a.efw0
    public void d(zzaia zzaiaVar, biw0 biw0Var) {
        dgw0 dgw0Var = (dgw0) this.b;
        byte b = dgw0Var.f6063a;
        s0x.J("Unexpected response type: " + ((int) b), b == 2);
        dgw0Var.h = zzaiaVar;
        dgw0Var.i = biw0Var;
        dgw0Var.e();
        s0x.J("no success or failure set on method implementation", dgw0Var.m);
    }

    @Override // a.w7
    public boolean e(View view) {
        fht0 fht0Var = (fht0) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) fht0Var.d;
        if (viewPager2.r) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // a.efw0
    public void f(zzaia zzaiaVar) {
        dgw0 dgw0Var = (dgw0) this.b;
        byte b = dgw0Var.f6063a;
        s0x.J("Unexpected response type: " + ((int) b), b == 1);
        dgw0Var.h = zzaiaVar;
        dgw0Var.e();
        s0x.J("no success or failure set on method implementation", dgw0Var.m);
    }

    public List g(String str, boolean z) {
        Object next;
        List list;
        boolean zEquals;
        Iterator it = ((eja0) ((z220) this.b).d).b.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            z5i0 z5i0Var = (z5i0) next;
            if (z) {
                zEquals = z5i0Var.c.equals(str);
            } else {
                zEquals = !z5i0Var.c.equals(str);
            }
        } while (!zEquals);
        z5i0 z5i0Var2 = (z5i0) next;
        return (z5i0Var2 == null || (list = z5i0Var2.e) == null) ? iun.f15405a : list;
    }

    @Override // a.u73
    public xkq get(int i) {
        return (xkq) this.b;
    }

    @Override // a.efw0
    public void h(fht0 fht0Var) {
        Status status = (Status) fht0Var.f9559a;
        com.google.firebase.auth.zzc zzcVar = (com.google.firebase.auth.zzc) fht0Var.b;
        dgw0 dgw0Var = (dgw0) this.b;
        amw0 amw0Var = dgw0Var.f;
        if (amw0Var != null) {
            amw0Var.a(status);
        }
        dgw0Var.j = zzcVar;
        amw0 amw0Var2 = dgw0Var.f;
        if (amw0Var2 != null) {
            amw0Var2.a(status);
        }
        dgw0Var.c(status);
    }

    @Override // a.efw0
    public void i(jiw0 jiw0Var) {
        dgw0 dgw0Var = (dgw0) this.b;
        dgw0Var.l = jiw0Var;
        dgw0Var.e();
        s0x.J("no success or failure set on method implementation", dgw0Var.m);
    }

    public boolean j() {
        return ua80.x(((vlk) this.b).f37628a, "autoMaximum", false);
    }

    public boolean k() {
        return ua80.x(((vlk) this.b).f37628a, "vipBet", false);
    }

    public boolean l() {
        return ua80.x(((vlk) this.b).f37628a, "dropOnScoreChange", false);
    }

    public boolean m() {
        return ua80.x(((vlk) this.b).f37628a, "fromLineToLive", false);
    }

    public boolean n() {
        return ua80.x(((vlk) this.b).f37628a, "subscribeOnBetUpdates", false);
    }

    public void o() {
        ((WebSettingsBoundaryInterface) this.b).setPaymentRequestEnabled(true);
    }

    public void p(Bundle bundle, String str, String str2) {
        byte b = this.f44598a;
        Object obj = this.b;
        switch (b) {
            case 15:
                b1x0 b1x0Var = (b1x0) obj;
                if (!TextUtils.isEmpty(str)) {
                    jf4.n("Unexpected call on client side");
                } else {
                    b1x0Var.p1(bundle, "auto", "_err");
                }
                break;
            default:
                m6x0 m6x0Var = (m6x0) obj;
                if (!TextUtils.isEmpty(str)) {
                    m6x0Var.J().v1(new pb90((Object) this, (Object) str, (Object) str2, (Object) bundle, false, (byte) 16));
                } else {
                    kxw0 kxw0Var = m6x0Var.l;
                    if (kxw0Var != null) {
                        uuw0 uuw0Var = kxw0Var.f;
                        kxw0.g(uuw0Var);
                        uuw0Var.g.b(str2, "AppId not known when logging event");
                    }
                }
                break;
        }
    }

    public void q(int i, Object obj, dlw0 dlw0Var) {
        ojw0 ojw0Var = (ojw0) obj;
        p4 p4Var = (p4) this.b;
        p4Var.h1(i, 2);
        p4Var.g1(ojw0Var.b(dlw0Var));
        dlw0Var.c(ojw0Var, this);
    }

    public void r(Bundle bundle, String str) {
        String string;
        kxw0 kxw0Var = (kxw0) this.b;
        fxw0 fxw0Var = kxw0Var.g;
        wvw0 wvw0Var = kxw0Var.e;
        kxw0.g(fxw0Var);
        fxw0Var.m1();
        if (kxw0Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        kxw0.e(wvw0Var);
        wvw0Var.x.u(string);
        rvw0 rvw0Var = wvw0Var.y;
        kxw0Var.k.getClass();
        rvw0Var.b(System.currentTimeMillis());
    }

    public boolean s() {
        if (!t()) {
            return false;
        }
        kxw0 kxw0Var = (kxw0) this.b;
        kxw0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        wvw0 wvw0Var = kxw0Var.e;
        kxw0.e(wvw0Var);
        return jCurrentTimeMillis - wvw0Var.y.a() > kxw0Var.d.u1(null, btw0.i0);
    }

    public boolean t() {
        wvw0 wvw0Var = ((kxw0) this.b).e;
        kxw0.e(wvw0Var);
        return wvw0Var.y.a() > 0;
    }

    public /* synthetic */ zlt0(Object obj, byte b) {
        this.f44598a = b;
        this.b = obj;
    }

    public zlt0(p4 p4Var) {
        this.f44598a = (byte) 12;
        byte[] bArr = lkw0.f20222a;
        this.b = p4Var;
        p4Var.b = this;
    }

    public zlt0(gii0 gii0Var, byte b) {
        this.f44598a = b;
        gii0Var.getClass();
        switch (b) {
            case 8:
                this.b = new lkr0(gii0Var, (byte) 26);
                break;
            default:
                this.b = new lkr0(gii0Var, (byte) 24);
                break;
        }
    }

    public zlt0(td9 td9Var, qg00 qg00Var) {
        this.f44598a = (byte) 9;
        this.b = td9Var;
    }
}
