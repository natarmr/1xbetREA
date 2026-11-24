package a;

import android.content.ComponentCallbacks2;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La/rvt0;", "La/by5;", "La/eun;", "<init>", "()V", "a/pvt0", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rvt0 extends by5<eun> {
    public final nae0 b2 = ltt0.p(this, qvt0.f29404a);
    public boolean c2;
    public final ywq d2;
    public vby e2;
    public static final /* synthetic */ iiy[] g2 = {new j0d0(rvt0.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/EmptyFrameLayoutBinding;", 0)};
    public static final sxs0 f2 = new sxs0((byte) 5);

    public rvt0() {
        fvt0 fvt0Var = tut0.c;
        if (fvt0Var == null) {
            Intrinsics.h("authManager");
            throw null;
        }
        this.d2 = m0(new yl3(this, (byte) 13), new gvt0(fvt0Var));
    }

    @Override // a.by5
    public final yfu0 I0() {
        Object objN = this.b2.n(g2[0], this);
        objN.getClass();
        return (eun) objN;
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hhk0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hhk0 hhk0Var = (hhk0) (ze3Var instanceof hhk0 ? ze3Var : null);
            if (hhk0Var != null) {
                this.e2 = (vby) hhk0Var.a().d;
                return;
            }
        }
        jf4.n(b1j.i(hhk0.class, "Cannot create dependency "));
    }

    public final void R0(awt0 awt0Var, String str, String str2) {
        String str3 = awt0Var.f1591a;
        String str4 = str3 == null ? "" : str3;
        String str5 = awt0Var.b;
        String str6 = str5 == null ? "" : str5;
        String str7 = awt0Var.c;
        F().t0(i120.V(new Pair("SUCCESS_SOCIAL", new ghk0(1, str, str2, String.valueOf(awt0Var.d), str4, str6, null, str7 == null ? "" : str7, 64))), "SUCCESS_SOCIAL");
        y0();
    }

    @Override // a.by5, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (bundle == null || !bundle.getBoolean("HAS_BEEN_CREATED")) {
            this.d2.a(q3d.e(xvt0.b, xvt0.f41578a));
            this.c2 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        if (tut0.c()) {
            fvt0 fvt0Var = tut0.c;
            if (fvt0Var == null) {
                Intrinsics.h("authManager");
                throw null;
            }
            List list = uut0.j;
            nmt0 nmt0Var = (nmt0) fvt0Var.f10231a;
            nmt0Var.getClass();
            for (String str : uut0.j) {
                str.getClass();
                ((SharedPreferences) nmt0Var.f23789a).edit().remove(str).apply();
            }
            CookieManager.getInstance().removeAllCookies(null);
        }
        this.j1 = true;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putBoolean("HAS_BEEN_CREATED", this.c2);
        super.f0(bundle);
    }
}
