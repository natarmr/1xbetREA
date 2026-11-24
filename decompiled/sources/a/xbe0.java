package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.widget.Button;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/xbe0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xbe0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(xbe0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentRealityBinding;", 0)};
    public cri K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;

    public xbe0() {
        super(R.layout.fragment_reality);
        ube0 ube0Var = new ube0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 27), (byte) 28));
        this.N1 = agc.G(this, sre0.f32672a.b(nde0.class), new wbe0(a8zVarA, (byte) 0), new wbe0(a8zVarA, (byte) 1), ube0Var);
        this.O1 = ltt0.o(this, vbe0.f37139a);
        this.P1 = maz.b(new ube0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        dyb.c0(G0().b, new v6d0(this, (byte) 20));
        G0().e.setNavigationOnClickListener(new l910(this, (byte) 27));
        G0().d.setAdapter((isz) this.P1.getValue());
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new ube0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ybe0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ybe0 ybe0Var = (ybe0) (ze3Var instanceof ybe0 ? ze3Var : null);
            if (ybe0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                xio xioVar = ybe0Var.f42340a;
                czz czzVar = ybe0Var.b;
                duj dujVar = ybe0Var.c;
                ii iiVar = ybe0Var.g;
                btt0 btt0Var = ybe0Var.d;
                dzz dzzVar = ybe0Var.e;
                gii0 gii0Var = ybe0Var.f;
                knf0 knf0Var = ybe0Var.h;
                wdk0 wdk0Var = ybe0Var.i;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                dzzVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (cri) new dri(iiVar, xioVar, czzVar, i1w0VarF, dujVar, btt0Var, dzzVar, gii0Var, knf0Var, wdk0Var, (byte) 0).i.get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(ybe0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().g;
        jjc0 jjc0Var = new jjc0(2, this, xbe0.class, "showProgress", "showProgress(Z)V", 4, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0(p7m0Var, clzVarW, jjc0Var, (yje) null), 3);
        ol60 ol60Var = H0().j;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 24);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g4e0(ol60Var, clzVarW2, s9c0Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().h;
        int i = 4;
        int i2 = 2;
        jjc0 jjc0Var2 = new jjc0(i2, (isz) this.P1.getValue(), isz.class, "setItems", "setItems(Ljava/util/List;)V", i, (byte) 16);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g4e0((gmq) p7m0Var2, clzVarW3, jjc0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().i;
        jjc0 jjc0Var3 = new jjc0(i2, G0().b, Button.class, "setEnabled", "setEnabled(Z)V", i, (byte) 17);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new g4e0((gmq) p7m0Var3, clzVarW4, jjc0Var3, (yje) null, (char) 0), 3);
    }

    public final s3r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (s3r) objN;
    }

    public final nde0 H0() {
        return (nde0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().d.setAdapter(null);
        super.Z();
    }
}
