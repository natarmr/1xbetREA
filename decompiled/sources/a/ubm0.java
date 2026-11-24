package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ubm0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ubm0 extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final phf0 N1;
    public final r34 O1;
    public final boolean P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ubm0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ubm0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(ubm0.class, "sportId", "getSportId()J", 0)};
    public static final y2m0 R1 = new y2m0((byte) 1);

    public ubm0() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, tbm0.f33671a);
        this.N1 = new phf0("GAME_ID");
        this.O1 = new r34("SPORT_ID");
        this.P1 = true;
        this.Q1 = xbc.b0(this, sre0.f32672a.b(ybm0.class), new goi0(this, (byte) 28));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("SELECT_MENU_REQUEST_KEY", this, new b0l0(this, (byte) 4));
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-1825117239, true, new edk0(this, (byte) 22)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(nfb.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            nfb nfbVar = (nfb) (ze3Var instanceof nfb ? ze3Var : null);
            if (nfbVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                Long lN = this.O1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = nfbVar.f23427a;
                duj dujVar = nfbVar.b;
                gii0 gii0Var = nfbVar.c;
                m1e m1eVar = nfbVar.d;
                sjl0 sjl0Var = nfbVar.e;
                knf0 knf0Var = nfbVar.f;
                OnexDatabase onexDatabase = nfbVar.g;
                wyu wyuVar = nfbVar.j;
                r9u r9uVar = nfbVar.h;
                pru pruVar = nfbVar.i;
                u58 u58Var = nfbVar.l;
                nai naiVar = nfbVar.m;
                svs0 svs0Var = nfbVar.n;
                kl5 kl5Var = nfbVar.o;
                ocl oclVar = nfbVar.p;
                pmi0 pmi0Var = nfbVar.q;
                ctf0 ctf0Var = nfbVar.r;
                uyu uyuVar = nfbVar.k;
                r9uVar.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                sjl0Var.getClass();
                onexDatabase.getClass();
                wyuVar.getClass();
                ctf0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(ybm0.class, (pai) new gbi(cadVar, pmi0Var, i1w0VarF, pruVar, r9uVar, dujVar, knf0Var, gii0Var, strN, m1eVar, wyuVar, lN, u58Var, naiVar, svs0Var, kl5Var, oclVar, uyuVar).s));
                return;
            }
        }
        jf4.n(b1j.i(nfb.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(mbm0.f21517a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(mbm0.f21517a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
