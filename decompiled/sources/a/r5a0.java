package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r5a0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r5a0 extends yx5 {
    public final phf0 K1;
    public final phf0 L1;
    public final r34 M1;
    public final yzn0 N1;
    public final s0r O1;
    public final boolean P1;
    public fiu0 Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(r5a0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new ez40(r5a0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(r5a0.class, "sportId", "getSportId()J", 0), new ez40(r5a0.class, "screenType", "getScreenType()Lorg/xplatform/statistic/player/model/PlayerScreenType;", 0), new j0d0(r5a0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final mi70 S1 = new mi70();

    public r5a0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("PLAYER_ID");
        this.L1 = new phf0("GAME_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = new yzn0("SCREEN_TYPE");
        this.O1 = ltt0.o(this, q5a0.f28142a);
        this.P1 = true;
        this.R1 = xbc.b0(this, sre0.f32672a.b(d6a0.class), new l3a0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(U1[4], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1539378482, true, new cz90(this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p5a0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p5a0 p5a0Var = (p5a0) (ze3Var instanceof p5a0 ? ze3Var : null);
            if (p5a0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                String strN2 = this.L1.n(this, iiyVarArr[1]);
                Long lN = this.M1.n(this, iiyVarArr[2]);
                oaa0 oaa0Var = (oaa0) this.N1.n(this, iiyVarArr[3]);
                i1w0VarF.getClass();
                strN.getClass();
                strN2.getClass();
                cad cadVar = p5a0Var.f26396a;
                duj dujVar = p5a0Var.b;
                gii0 gii0Var = p5a0Var.c;
                m1e m1eVar = p5a0Var.d;
                wyu wyuVar = p5a0Var.e;
                pmi0 pmi0Var = p5a0Var.g;
                OnexDatabase onexDatabase = p5a0Var.f;
                sjl0 sjl0Var = p5a0Var.h;
                knf0 knf0Var = p5a0Var.i;
                ctf0 ctf0Var = p5a0Var.j;
                uyu uyuVar = p5a0Var.k;
                ocl oclVar = p5a0Var.l;
                r9u r9uVar = p5a0Var.m;
                d1p d1pVar = p5a0Var.n;
                sxs0 sxs0Var = p5a0Var.o;
                yo4 yo4Var = p5a0Var.p;
                d1pVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                onexDatabase.getClass();
                sjl0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                this.Q1 = new fiu0(Collections.singletonMap(d6a0.class, (eni) new mci(cadVar, d1pVar, pmi0Var, sxs0Var, strN, strN2, lN, oaa0Var, i1w0VarF, dujVar, gii0Var, m1eVar, wyuVar, knf0Var, ctf0Var, uyuVar, oclVar, yo4Var).r));
                return;
            }
        }
        jf4.n(b1j.i(p5a0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
