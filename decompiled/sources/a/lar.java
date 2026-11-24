package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lar;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lar extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final s0r M1;
    public fiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(lar.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(lar.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak Q1 = new xak((byte) 20);

    public lar() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("PLAYER_ID");
        this.M1 = ltt0.o(this, kar.f17978a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(abr.class), new yip(this, (byte) 15));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1072419427, true, new jar(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mar.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mar marVar = (mar) (ze3Var instanceof mar ? ze3Var : null);
            if (marVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.L1.n(this, R1[0]);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = marVar.f21472a;
                gii0 gii0Var = marVar.b;
                duj dujVar = marVar.f;
                m1e m1eVar = marVar.c;
                ocl oclVar = marVar.d;
                knf0 knf0Var = marVar.e;
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                g45 g45Var = new g45();
                g45Var.g = strN;
                g45Var.f10647a = cadVar;
                g45Var.b = gii0Var;
                g45Var.c = knf0Var;
                g45Var.d = dujVar;
                g45Var.e = oclVar;
                g45Var.f = m1eVar;
                g45Var.h = i1w0VarF;
                g45Var.i = new ugi(g45Var, (byte) 9);
                this.N1 = new fiu0(Collections.singletonMap(abr.class, (ugi) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(mar.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.O1.getValue()).x(bar.f2274a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.O1.getValue()).x(car.f4026a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
