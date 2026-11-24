package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xqd0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xqd0 extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final yzn0 N1;
    public final s0r O1;
    public fiu0 P1;
    public final a8z Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(xqd0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(xqd0.class, "sportId", "getSportId()J", 0), new ez40(xqd0.class, "screenType", "getScreenType()Lorg/xplatform/remoteconfig/domain/models/StatisticsMainScreenStyle;", 0), new j0d0(xqd0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final jh70 S1 = new jh70();

    public xqd0() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("GAME_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = new yzn0("SCREEN_TYPE");
        this.O1 = ltt0.o(this, wqd0.f39586a);
        this.Q1 = xbc.b0(this, sre0.f32672a.b(lrd0.class), new p7d0(this, (byte) 6));
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(U1[3], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(204724858, true, new nrc0(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jtd0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jtd0 jtd0Var = (jtd0) (ze3Var instanceof jtd0 ? ze3Var : null);
            if (jtd0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = jtd0Var.f17094a;
                tgk tgkVar = jtd0Var.b;
                gii0 gii0Var = jtd0Var.c;
                m1e m1eVar = jtd0Var.d;
                wyu wyuVar = jtd0Var.e;
                ctf0 ctf0Var = jtd0Var.f;
                knf0 knf0Var = jtd0Var.g;
                pmi0 pmi0Var = jtd0Var.h;
                lme0 lme0Var = jtd0Var.i;
                s9m0 s9m0Var = jtd0Var.j;
                tqt tqtVar = jtd0Var.k;
                ocl oclVar = jtd0Var.l;
                uyu uyuVar = jtd0Var.m;
                pru pruVar = jtd0Var.n;
                r9u r9uVar = jtd0Var.o;
                tgkVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                this.P1 = new fiu0(Collections.singletonMap(lrd0.class, (ppi) new mci(cadVar, pmi0Var, lme0Var, i1w0VarF, tgkVar, gii0Var, strN, m1eVar, wyuVar, ctf0Var, lN, knf0Var, s9m0Var, tqtVar, oclVar, uyuVar, pruVar, r9uVar).r));
                return;
            }
        }
        jf4.n(b1j.i(jtd0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.Q1.getValue()).x(tqd0.f34377a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.Q1.getValue()).x(uqd0.f36114a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
