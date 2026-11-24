package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lop0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lop0 extends yx5 {
    public final s0r K1;
    public final phf0 L1;
    public final r34 M1;
    public final boolean N1;
    public fiu0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(lop0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(lop0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(lop0.class, "sportId", "getSportId()J", 0)};
    public static final s9m0 Q1 = new s9m0();

    public lop0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, kop0.f18641a);
        this.L1 = new phf0("KEY_GAME_ID");
        this.M1 = new r34("KEY_SPORT_ID");
        this.N1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(zop0.class), new nxo0(this, (byte) 19));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jop0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jop0 jop0Var = (jop0) (ze3Var instanceof jop0 ? ze3Var : null);
            if (jop0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.L1.n(this, iiyVarArr[1]);
                Long lN = this.M1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = jop0Var.f16870a;
                duj dujVar = jop0Var.b;
                gii0 gii0Var = jop0Var.d;
                r9u r9uVar = jop0Var.h;
                ctf0 ctf0Var = jop0Var.c;
                m1e m1eVar = jop0Var.e;
                pru pruVar = jop0Var.i;
                sjl0 sjl0Var = jop0Var.f;
                OnexDatabase onexDatabase = jop0Var.g;
                uyu uyuVar = jop0Var.k;
                ocl oclVar = jop0Var.j;
                knf0 knf0Var = jop0Var.l;
                pmi0 pmi0Var = jop0Var.m;
                wyu wyuVar = jop0Var.n;
                r9uVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                sjl0Var.getClass();
                onexDatabase.getClass();
                knf0Var.getClass();
                wyuVar.getClass();
                this.O1 = new fiu0(Collections.singletonMap(zop0.class, (xvi) new h6i(cadVar, pmi0Var, r9uVar, ctf0Var, pruVar, i1w0VarF, dujVar, gii0Var, strN, m1eVar, oclVar, uyuVar, lN, knf0Var, wyuVar).c));
                return;
            }
        }
        jf4.n(b1j.i(jop0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-630353338, true, new l7p0(this, (byte) 8)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
