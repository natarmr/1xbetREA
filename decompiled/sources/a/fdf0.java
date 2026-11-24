package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fdf0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fdf0 extends yx5 {
    public fiu0 K1;
    public cge0 L1;
    public wdk0 M1;
    public final boolean N1;
    public final khf0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(fdf0.class, "relatedParams", "getRelatedParams()Lorg/xplatform/related/api/presentation/RelatedParams;", 0), new j0d0(fdf0.class, "viewBinding", "getViewBinding()Lorg/xplatform/related/impl/databinding/FragmentRelatedBinding;", 0)};
    public static final lme0 R1 = new lme0((byte) 5);

    public fdf0() {
        super(R.layout.fragment_related);
        this.N1 = true;
        this.O1 = new khf0("KEY_RELATED_PARAMS");
        ddf0 ddf0Var = new ddf0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 12), (byte) 13));
        this.P1 = agc.G(this, sre0.f32672a.b(yef0.class), new wbe0(a8zVarA, (byte) 14), new wbe0(a8zVarA, (byte) 15), ddf0Var);
        this.Q1 = ltt0.o(this, edf0.f7615a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        View viewQ0 = q0();
        o470 o470Var = new o470(this);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, o470Var);
        Object objN = this.Q1.n(S1[1], this);
        objN.getClass();
        ((c4r) objN).b.b(new ddf0(this, (byte) 1));
        qcc.X(this, new ddf0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uef0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uef0 uef0Var = (uef0) (ze3Var instanceof uef0 ? ze3Var : null);
            if (uef0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                zx10 zx10Var = uef0Var.f35526a;
                wdk0 wdk0Var = uef0Var.b;
                wdk0Var.getClass();
                xr xrVar = new xr();
                xrVar.f41344a = i1w0VarF;
                xrVar.b = new fri(xrVar, (byte) 8);
                this.K1 = new fiu0(Collections.singletonMap(yef0.class, (fri) xrVar.b));
                this.L1 = new cge0((byte) 6);
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(uef0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        if (this.M1 != null) {
            vcc.C(this, "request_key_notification_updated");
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.Q1.n(S1[1], this);
        objN.getClass();
        pkd.i(((c4r) objN).c, null, new ugd(-2135652330, true, new iob0((Object) this, (byte) 6)));
        wdk0 wdk0Var = this.M1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.N1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.N1;
    }
}
