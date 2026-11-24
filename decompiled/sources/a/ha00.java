package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ha00;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ha00 extends yx5 {
    public final i9o0 K1;
    public fiu0 L1;
    public final s0r M1;
    public final phf0 N1;
    public final r34 O1;
    public final zz2 P1;
    public final a8z Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(ha00.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ha00.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(ha00.class, "sportId", "getSportId()J", 0), new ez40(ha00.class, "selectedTab", "getSelectedTab()I", 0)};
    public static final xuz S1 = new xuz();

    public ha00() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, ga00.f10943a);
        this.N1 = new phf0("GAME_ID");
        this.O1 = new r34("SPORT_ID");
        this.P1 = new zz2("SELECTED_TAB");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(gb00.class), new rcz(this, (byte) 18));
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(U1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-348223123, true, new g2z(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t800.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t800 t800Var = (t800) (ze3Var instanceof t800 ? ze3Var : null);
            if (t800Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                Long lN = this.O1.n(this, iiyVarArr[2]);
                Integer numN = this.P1.n(this, iiyVarArr[3]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = t800Var.f33492a;
                duj dujVar = t800Var.b;
                nh70 nh70Var = t800Var.d;
                ctf0 ctf0Var = t800Var.c;
                m1e m1eVar = t800Var.e;
                ocl oclVar = t800Var.f;
                wyu wyuVar = t800Var.g;
                knf0 knf0Var = t800Var.i;
                gii0 gii0Var = t800Var.j;
                uyu uyuVar = t800Var.h;
                r9u r9uVar = t800Var.k;
                ctf0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(gb00.class, (tii) new v7i(cadVar, nh70Var, i1w0VarF, dujVar, strN, lN, numN, ctf0Var, m1eVar, oclVar, wyuVar, knf0Var, gii0Var, uyuVar, r9uVar).o));
                return;
            }
        }
        jf4.n(b1j.i(t800.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.Q1.getValue()).x(u900.f35258a);
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
