package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/u020;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u020 extends yx5 {
    public final i9o0 K1;
    public fiu0 L1;
    public final boolean M1;
    public final a8z N1;
    public final s0r O1;
    public final phf0 P1;
    public final r34 Q1;
    public final yzn0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(u020.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(u020.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(u020.class, "sportId", "getSportId()J", 0), new ez40(u020.class, "screenType", "getScreenType()Lorg/xplatform/remoteconfig/domain/models/StatisticsMainScreenStyle;", 0)};
    public static final atz S1 = new atz();

    public u020() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.M1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(f120.class), new s020(this, (byte) 0));
        this.O1 = ltt0.o(this, t020.f33098a);
        this.P1 = new phf0("GAME_ID");
        this.Q1 = new r34("SPORT_ID");
        this.R1 = new yzn0("SCREEN_TYPE");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1929802144, true, new g2z(this, (byte) 29)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(cfm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            cfm0 cfm0Var = (cfm0) (ze3Var instanceof cfm0 ? ze3Var : null);
            if (cfm0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.P1.n(this, iiyVarArr[1]);
                Long lN = this.Q1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = cfm0Var.f4269a;
                duj dujVar = cfm0Var.b;
                fsd fsdVar = cfm0Var.c;
                gii0 gii0Var = cfm0Var.d;
                g9m0 g9m0Var = cfm0Var.n;
                nh70 nh70Var = cfm0Var.j;
                uyu uyuVar = cfm0Var.e;
                oeg0 oeg0Var = cfm0Var.J;
                wyu wyuVar = cfm0Var.f;
                m1e m1eVar = cfm0Var.g;
                u58 u58Var = cfm0Var.h;
                r9u r9uVar = cfm0Var.i;
                knf0 knf0Var = cfm0Var.k;
                ctf0 ctf0Var = cfm0Var.l;
                bst bstVar = cfm0Var.m;
                lme0 lme0Var = cfm0Var.o;
                ilp0 ilp0Var = cfm0Var.p;
                ddk ddkVar = cfm0Var.H;
                iw20 iw20Var = cfm0Var.q;
                s2m0 s2m0Var = cfm0Var.r;
                nai naiVar = cfm0Var.s;
                s9m0 s9m0Var = cfm0Var.t;
                ix0 ix0Var = cfm0Var.u;
                nv20 nv20Var = cfm0Var.v;
                gl5 gl5Var = cfm0Var.w;
                g9m0 g9m0Var2 = cfm0Var.x;
                atz atzVar = cfm0Var.y;
                ddk ddkVar2 = cfm0Var.z;
                nmo nmoVar = cfm0Var.A;
                ani0 ani0Var = cfm0Var.B;
                xak xakVar = cfm0Var.C;
                g2v g2vVar = cfm0Var.D;
                g2v g2vVar2 = cfm0Var.E;
                roi0 roi0Var = cfm0Var.F;
                pmi0 pmi0Var = cfm0Var.G;
                ocl oclVar = cfm0Var.I;
                kki kkiVarA = ((daf) roi0Var.f30839a).j().a(i1w0VarF);
                oeg0Var.getClass();
                fsdVar.getClass();
                gii0Var.getClass();
                wyuVar.getClass();
                m1eVar.getClass();
                r9uVar.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(f120.class, new xui(cadVar, nh70Var, lme0Var, ilp0Var, iw20Var, nv20Var, nmoVar, ani0Var, g2vVar, g2vVar2, roi0Var, ddkVar, pmi0Var, kkiVarA, g9m0Var, i1w0VarF, oeg0Var, dujVar, strN, uyuVar, wyuVar, m1eVar, lN, u58Var, r9uVar, ctf0Var, bstVar, s2m0Var, naiVar, s9m0Var, ix0Var, gl5Var, g9m0Var2, atzVar, ddkVar2, xakVar, oclVar).H));
                return;
            }
        }
        jf4.n(b1j.i(cfm0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.N1.getValue()).x(gu30.f11912a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(fu30.f10144a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
