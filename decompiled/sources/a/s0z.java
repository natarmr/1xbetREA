package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s0z;", "La/yx5;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s0z extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final phf0 N1;
    public final r34 O1;
    public final yzn0 P1;
    public final zz2 Q1;
    public final boolean R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(s0z.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(s0z.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(s0z.class, "sportId", "getSportId()J", 0), new ez40(s0z.class, "filterModel", "getFilterModel()Lorg/xplatform/statistic/lastgames/domain/model/FilterModel;", 0), new ez40(s0z.class, "tabId", "getTabId()I", 0)};
    public static final bst U1 = new bst();

    public s0z() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, r0z.f29653a);
        this.N1 = new phf0("GAME_ID");
        this.O1 = new r34("SPORT_ID");
        this.P1 = new yzn0("FILTER_TYPE");
        this.Q1 = new zz2("TAB_ID");
        this.R1 = true;
        this.S1 = xbc.b0(this, sre0.f32672a.b(u1z.class), new y2x(this, (byte) 23));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yyy.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yyy yyyVar = (yyy) (ze3Var instanceof yyy ? ze3Var : null);
            if (yyyVar != null) {
                iiy[] iiyVarArr = V1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                lgp0 lgp0Var = lgp0.f20019a;
                Long lN = this.O1.n(this, iiyVarArr[2]);
                n3q n3qVar = (n3q) this.P1.n(this, iiyVarArr[3]);
                Integer numN = this.Q1.n(this, iiyVarArr[4]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = yyyVar.f43491a;
                gii0 gii0Var = yyyVar.b;
                pmi0 pmi0Var = yyyVar.d;
                pru pruVar = yyyVar.g;
                r9u r9uVar = yyyVar.e;
                ctf0 ctf0Var = yyyVar.i;
                m1e m1eVar = yyyVar.f;
                uyu uyuVar = yyyVar.h;
                knf0 knf0Var = yyyVar.j;
                roi0 roi0Var = yyyVar.k;
                ((daf) roi0Var.f30839a).j().a(i1w0VarF);
                ocl oclVar = yyyVar.c;
                wyu wyuVar = yyyVar.l;
                r9uVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(u1z.class, (gji) new gbi(cadVar, pmi0Var, roi0Var, r9uVar, pruVar, gii0Var, strN, m1eVar, uyuVar, lN, i1w0VarF, ctf0Var, knf0Var, n3qVar, numN, oclVar, wyuVar).s));
                return;
            }
        }
        jf4.n(b1j.i(yyy.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        C().u0("FILTER_RESULT_KEY", this, new viq(this, (byte) 12));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.L1.n(V1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(254701179, true, new xxv(this, (byte) 27)));
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
