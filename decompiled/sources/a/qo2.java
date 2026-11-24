package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qo2;", "La/yx5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qo2 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public fiu0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final r34 P1;
    public final n0o0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(qo2.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryAlternativeInfoFragmentBinding;", 0), new ez40(qo2.class, "gameId", "getGameId()J", 0)};
    public static final jdk0 R1 = new jdk0();

    public qo2() {
        super(R.layout.history_alternative_info_fragment);
        this.K1 = hnm0.f13359a;
        this.L1 = true;
        oo2 oo2Var = new oo2(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 11), (byte) 12));
        this.N1 = agc.G(this, sre0.f32672a.b(gp2.class), new t51(a8zVarA, (byte) 4), new t51(a8zVarA, (byte) 5), oo2Var);
        this.O1 = ltt0.o(this, po2.f27311a);
        this.P1 = new r34("GAME_ID");
        this.Q1 = maz.b(new t32((byte) 15));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        DsNavigationBar dsNavigationBar = G0().e;
        String strH = H(R.string.additional_info);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(G0().e, new oo2(this, (byte) 0));
        RecyclerView recyclerView = G0().d;
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        recyclerView.setAdapter((mo2) this.Q1.getValue());
        vvw.o(recyclerView, true, 1);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ro2.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ro2 ro2Var = (ro2) (ze3Var instanceof ro2 ? ze3Var : null);
            if (ro2Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Long lN = this.P1.n(this, S1[1]);
                i1w0VarF.getClass();
                cad cadVar = ro2Var.f30816a;
                btt0 btt0Var = ro2Var.b;
                knf0 knf0Var = ro2Var.c;
                sa10 sa10Var = ro2Var.d;
                gii0 gii0Var = ro2Var.e;
                duj dujVar = ro2Var.f;
                r9u r9uVar = ro2Var.g;
                m1e m1eVar = ro2Var.h;
                btt0Var.getClass();
                knf0Var.getClass();
                r9uVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(gp2.class, (t5i) new o3c(cadVar, i1w0VarF, btt0Var, knf0Var, sa10Var, r9uVar, gii0Var, dujVar, m1eVar, lN).k));
                return;
            }
        }
        jf4.n(b1j.i(ro2.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((gp2) this.N1.getValue()).i;
        qa qaVar = new qa(this, null, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new y51(p7m0Var, clzVarW, qaVar, (yje) null), 3);
    }

    public final wyv G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (wyv) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
