package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hnv0;", "La/yx5;", "<init>", "()V", "a/kys0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hnv0 extends yx5 {
    public final phf0 K1;
    public final r34 L1;
    public final s0r M1;
    public fiu0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(hnv0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(hnv0.class, "sportId", "getSportId()J", 0), new j0d0(hnv0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kys0 Q1 = new kys0((byte) 16);

    public hnv0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("game_id");
        this.L1 = new r34("sport_id");
        this.M1 = ltt0.o(this, gnv0.f11604a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(qnv0.class), new jmv0(this, (byte) 1));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[2], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1957154228, true, new ggt0(this, (byte) 27)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fnv0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fnv0 fnv0Var = (fnv0) (ze3Var instanceof fnv0 ? ze3Var : null);
            if (fnv0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                Long lN = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = fnv0Var.f9857a;
                duj dujVar = fnv0Var.b;
                gii0 gii0Var = fnv0Var.c;
                m1e m1eVar = fnv0Var.d;
                ocl oclVar = fnv0Var.e;
                ctf0 ctf0Var = fnv0Var.f;
                knf0 knf0Var = fnv0Var.g;
                nh70 nh70Var = fnv0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(qnv0.class, (msi) new daf(cadVar, nh70Var, strN, lN, i1w0VarF, dujVar, gii0Var, m1eVar, oclVar, ctf0Var, knf0Var).m));
                return;
            }
        }
        jf4.n(b1j.i(fnv0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.P1;
    }
}
