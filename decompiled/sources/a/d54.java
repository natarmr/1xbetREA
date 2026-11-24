package a;

import android.content.ComponentCallbacks2;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.core.navigation.authorization.model.AuthType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/d54;", "La/yx5;", "<init>", "()V", "a/gfk0", "La/p54;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d54 extends yx5 {
    public final e9o0 K1;
    public x8i L1;
    public jdk0 M1;
    public cge0 N1;
    public final s0r O1;
    public final khf0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(d54.class, "binding", "getBinding()Lorg/xplatform/auth/impl/databinding/FragmentAuthDefaultComposeBinding;", 0), new ez40(d54.class, "authType", "getAuthType()Lorg/xplatform/core/navigation/authorization/model/AuthType;", 0)};
    public static final gfk0 R1 = new gfk0((byte) 24);

    public d54() {
        super(R.layout.fragment_auth_default_compose);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 12);
        this.O1 = ltt0.o(this, c54.f3753a);
        this.P1 = new khf0("KEY_PARAMS_AUTH_SCREEN");
        this.Q1 = xbc.a0(this, sre0.f32672a.b(q54.class), null, new b54(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vn4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vn4 vn4Var = (vn4) (ze3Var instanceof vn4 ? ze3Var : null);
            if (vn4Var != null) {
                AuthType authType = (AuthType) this.P1.n(this, S1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = vn4Var.f37699a;
                s9m0 s9m0Var = vn4Var.b;
                jdk0 jdk0Var = vn4Var.c;
                cge0 cge0Var = vn4Var.d;
                peg0 peg0Var = vn4Var.e;
                pru pruVar = vn4Var.f;
                fsd fsdVar = vn4Var.g;
                j1q0 j1q0Var = vn4Var.h;
                dpc dpcVar = vn4Var.i;
                fsdVar.getClass();
                j1q0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = i1w0VarF;
                g45Var.b = peg0Var;
                g45Var.c = s9m0Var;
                g45Var.d = dpcVar;
                g45Var.e = pruVar;
                g45Var.f = fsdVar;
                g45Var.g = authType;
                g45Var.h = cadVar;
                g45Var.i = n0k0.a(new n8i(g45Var, (byte) 8));
                this.L1 = (x8i) ((n5d0) g45Var.i).get();
                this.M1 = jdk0Var;
                this.N1 = cge0Var;
                return;
            }
        }
        jf4.n(b1j.i(vn4.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        pkd.i(((cyq) objN).b, null, new ugd(-1832544872, true, new tx(this, (byte) 6)));
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        n0().getWindow().setSoftInputMode(32);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        n0().getWindow().setSoftInputMode(16);
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
