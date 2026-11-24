package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xon;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xon extends yx5 {
    public final r34 K1;
    public final cgx0 L1;
    public final r34 M1;
    public fiu0 N1;
    public ii O1;
    public wdk0 P1;
    public final s0r Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(xon.class, "gameId", "getGameId()J", 0), new ez40(xon.class, "isLive", "isLive()Z", 0), new ez40(xon.class, "sportId", "getSportId()J", 0), new j0d0(xon.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bek S1 = new bek();

    public xon() {
        super(R.layout.compose_fragment);
        this.K1 = new r34("GAME_ID");
        this.L1 = new cgx0("IS_LIVE");
        this.M1 = new r34("SPORT_ID");
        this.Q1 = ltt0.o(this, won.f39506a);
        this.R1 = xbc.b0(this, sre0.f32672a.b(mpn.class), new von(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        jg60 jg60VarK = n0().k();
        jg60VarK.getClass();
        bdx.O(jg60VarK, K(), new yhn((Object) this, (byte) 4));
        ccq0.T(this, "EDIT_EVENT_INITIAL_ALERT_DIALOG_REQUEST_KEY", new von(this, (byte) 3));
        Object objN = this.Q1.n(U1[3], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(722984347, true, new mxm(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yon.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yon yonVar = (yon) (ze3Var instanceof yon ? ze3Var : null);
            if (yonVar != null) {
                iiy[] iiyVarArr = U1;
                Long lN = this.K1.n(this, iiyVarArr[0]);
                Boolean boolN = this.L1.n(this, iiyVarArr[1]);
                Long lN2 = this.M1.n(this, iiyVarArr[2]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = yonVar.f42995a;
                ctf0 ctf0Var = yonVar.b;
                ii iiVar = yonVar.c;
                duj dujVar = yonVar.e;
                wdk0 wdk0Var = yonVar.f;
                kt2 kt2Var = yonVar.d;
                lsn lsnVar = yonVar.g;
                vqc vqcVar = yonVar.h;
                btt0 btt0Var = yonVar.i;
                gii0 gii0Var = yonVar.j;
                pru pruVar = yonVar.k;
                d1p d1pVar = yonVar.l;
                jw20 jw20Var = yonVar.m;
                ieu ieuVar = yonVar.n;
                rtu rtuVar = yonVar.o;
                ort ortVar = yonVar.p;
                lbu lbuVar = yonVar.q;
                ap80 ap80Var = yonVar.r;
                knf0 knf0Var = yonVar.s;
                edo edoVar = yonVar.t;
                zfo zfoVar = yonVar.u;
                m1e m1eVar = yonVar.v;
                yox yoxVar = yonVar.x;
                epi0 epi0Var = yonVar.y;
                pv00 pv00Var = yonVar.z;
                fsd fsdVar = yonVar.w;
                j1q0 j1q0Var = yonVar.A;
                sln slnVar = yonVar.B;
                gst0 gst0Var = yonVar.C;
                peg0 peg0Var = yonVar.D;
                d1pVar.getClass();
                j1q0Var.getClass();
                fsdVar.getClass();
                m1eVar.getClass();
                iiVar.getClass();
                ctf0Var.getClass();
                kt2Var.getClass();
                wdk0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                edoVar.getClass();
                zfoVar.getClass();
                slnVar.getClass();
                gst0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(mpn.class, (yei) new o9i(epi0Var, cadVar, lsnVar, vqcVar, d1pVar, jw20Var, pv00Var, fsdVar, yoxVar, m1eVar, i1w0VarF, iiVar, lN, boolN, lN2, ctf0Var, kt2Var, dujVar, wdk0Var, btt0Var, gii0Var, pruVar, ieuVar, rtuVar, ortVar, lbuVar, ap80Var, knf0Var, slnVar, gst0Var, peg0Var).D));
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(yon.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }
}
