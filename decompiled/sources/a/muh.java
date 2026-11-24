package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/muh;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class muh extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final s0r N1;
    public final boolean O1;
    public fiu0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(muh.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(muh.class, "sportId", "getSportId()J", 0), new j0d0(muh.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kud R1 = new kud();

    public muh() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("GAME_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = ltt0.o(this, luh.f20672a);
        this.O1 = true;
        this.Q1 = xbc.b0(this, sre0.f32672a.b(dvh.class), new e8g(this, (byte) 17));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[2], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(1855251639, true, new yfg(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kuh.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kuh kuhVar = (kuh) (ze3Var instanceof kuh ? ze3Var : null);
            if (kuhVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.L1.n(this, iiyVarArr[0]);
                Long lN = this.M1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = kuhVar.f18909a;
                duj dujVar = kuhVar.b;
                gii0 gii0Var = kuhVar.c;
                m1e m1eVar = kuhVar.d;
                wyu wyuVar = kuhVar.e;
                pmi0 pmi0Var = kuhVar.g;
                pru pruVar = kuhVar.o;
                OnexDatabase onexDatabase = kuhVar.f;
                sjl0 sjl0Var = kuhVar.h;
                knf0 knf0Var = kuhVar.i;
                lme0 lme0Var = kuhVar.j;
                ctf0 ctf0Var = kuhVar.k;
                uyu uyuVar = kuhVar.l;
                ocl oclVar = kuhVar.m;
                qzt qztVar = kuhVar.n;
                r9u r9uVar = kuhVar.p;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                onexDatabase.getClass();
                sjl0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                this.P1 = new fiu0(Collections.singletonMap(dvh.class, (yei) new cr(cadVar, pmi0Var, lme0Var, strN, lN, i1w0VarF, dujVar, gii0Var, m1eVar, wyuVar, pruVar, knf0Var, ctf0Var, uyuVar, oclVar, qztVar, r9uVar).q));
                return;
            }
        }
        jf4.n(b1j.i(kuh.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
