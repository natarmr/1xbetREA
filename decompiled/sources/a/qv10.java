package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La/qv10;", "La/yx5;", "<init>", "()V", "a/nv10", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qv10 extends yx5 {
    public final cgx0 K1;
    public m9i L1;
    public final kiu0 M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new ez40(qv10.class, "onlyArchive", "getOnlyArchive()Z", 0), new j0d0(qv10.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz O1 = new htz();

    public qv10() {
        super(R.layout.compose_fragment);
        this.K1 = new cgx0("BUNDLE_ARCHIVE");
        mv10 mv10Var = new mv10(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pv10(new be00(this, (byte) 29), (byte) 0));
        this.M1 = agc.G(this, sre0.f32672a.b(rv10.class), new j210(a8zVarA, (byte) 20), new j210(a8zVarA, (byte) 21), mv10Var);
        this.N1 = ltt0.o(this, ov10.f25903a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        n6r n6rVarK = K();
        n6rVarK.b();
        nv10 nv10Var = new nv10(this, eVarC, n6rVarK.c, l4b.i);
        Object objN = this.N1.n(P1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-156982074, true, new k110((Object) nv10Var, (Object) this, (byte) 10)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ti5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ti5)) {
                ze3Var = null;
            }
            ti5 ti5Var = (ti5) ze3Var;
            if (ti5Var != null) {
                this.L1 = (m9i) ti5.a(ti5Var, null, false, null, 15).K.get();
                return;
            }
        }
        jf4.n(b1j.i(ti5.class, "Cannot create dependency "));
    }
}
