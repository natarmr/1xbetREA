package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t5p0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t5p0 extends yx5 {
    public final phf0 K1;
    public final r34 L1;
    public final s0r M1;
    public fiu0 N1;
    public final kiu0 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(t5p0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(t5p0.class, "sportId", "getSportId()J", 0), new j0d0(t5p0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final g9m0 Q1 = new g9m0();

    public t5p0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("GAME_ID");
        this.L1 = new r34("SPORT_ID");
        this.M1 = ltt0.o(this, s5p0.f31664a);
        nxo0 nxo0Var = new nxo0(this, (byte) 6);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 7), (byte) 8));
        this.O1 = agc.G(this, sre0.f32672a.b(o6p0.class), new r5p0(a8zVarA, (byte) 0), new r5p0(a8zVarA, (byte) 1), nxo0Var);
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(app0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            app0 app0Var = (app0) (ze3Var instanceof app0 ? ze3Var : null);
            if (app0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                Long lN = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = app0Var.f1264a;
                gii0 gii0Var = app0Var.b;
                duj dujVar = app0Var.d;
                sjl0 sjl0Var = app0Var.c;
                r9u r9uVar = app0Var.g;
                ctf0 ctf0Var = app0Var.h;
                OnexDatabase onexDatabase = app0Var.f;
                m1e m1eVar = app0Var.j;
                uyu uyuVar = app0Var.i;
                ocl oclVar = app0Var.e;
                knf0 knf0Var = app0Var.k;
                pmi0 pmi0Var = app0Var.l;
                qzt qztVar = app0Var.m;
                wyu wyuVar = app0Var.n;
                wyuVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                sjl0Var.getClass();
                r9uVar.getClass();
                onexDatabase.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(o6p0.class, (xvi) new h6i(cadVar, pmi0Var, qztVar, wyuVar, i1w0VarF, ctf0Var, gii0Var, dujVar, r9uVar, strN, m1eVar, oclVar, uyuVar, lN, knf0Var).c));
                return;
            }
        }
        jf4.n(b1j.i(app0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.M1.n(R1[2], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(957807681, true, new abn0(this, (byte) 29)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
