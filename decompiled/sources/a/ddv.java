package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ddv;", "La/yx5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ddv extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final phf0 M1;
    public final r34 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(ddv.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ddv.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(ddv.class, "sportId", "getSportId()J", 0)};
    public static final art Q1 = new art();

    public ddv() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, cdv.f4182a);
        this.M1 = new phf0("GAME_ID");
        this.N1 = new r34("SPORT_ID");
        this.O1 = xbc.b0(this, sre0.f32672a.b(ndv.class), new bdv(this, (byte) 0));
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("REQUEST_SELECT_SEASON_FILTER_DIALOG_KEY", this, new viq(this, (byte) 7));
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1159651961, true, new jar(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lcv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lcv lcvVar = (lcv) (ze3Var instanceof lcv ? ze3Var : null);
            if (lcvVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.M1.n(this, iiyVarArr[1]);
                this.N1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = lcvVar.f19817a;
                duj dujVar = lcvVar.b;
                gii0 gii0Var = lcvVar.c;
                pcv pcvVar = lcvVar.d;
                m1e m1eVar = lcvVar.e;
                knf0 knf0Var = lcvVar.f;
                ctf0 ctf0Var = lcvVar.g;
                ocl oclVar = lcvVar.h;
                j1q0 j1q0Var = lcvVar.i;
                gii0Var.getClass();
                pcvVar.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                j1q0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(ndv.class, (ugi) new o3c(cadVar, i1w0VarF, dujVar, gii0Var, pcvVar, strN, m1eVar, knf0Var, ctf0Var, oclVar).k));
                return;
            }
        }
        jf4.n(b1j.i(lcv.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.P1;
    }
}
