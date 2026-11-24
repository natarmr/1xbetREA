package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fow;", "La/yx5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fow extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(fow.class, "horseId", "getHorseId()Ljava/lang/String;", 0), new j0d0(fow.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final art P1 = new art();

    public fow() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("HORSE_ID");
        this.L1 = ltt0.o(this, eow.f8156a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(yow.class), new bdv(this, (byte) 20));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(559815688, true, new xxv(this, (byte) 10)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dow.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dow dowVar = (dow) (ze3Var instanceof dow ? ze3Var : null);
            if (dowVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.K1.n(this, Q1[0]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = dowVar.b;
                gii0 gii0Var = dowVar.f6431a;
                m1e m1eVar = dowVar.c;
                duj dujVar = dowVar.d;
                ocl oclVar = dowVar.e;
                ctf0 ctf0Var = dowVar.f;
                knf0 knf0Var = dowVar.g;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = strN;
                ruVar.c = gii0Var;
                ruVar.d = knf0Var;
                ruVar.b = dujVar;
                ruVar.f = oclVar;
                ruVar.g = i1w0VarF;
                ruVar.h = m1eVar;
                ruVar.e = ctf0Var;
                ruVar.i = cadVar;
                ruVar.j = new tii(ruVar, (byte) 4);
                this.M1 = new fiu0(Collections.singletonMap(yow.class, (tii) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(dow.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.N1.getValue()).x(vnw.f37737a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(wnw.f39467a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
