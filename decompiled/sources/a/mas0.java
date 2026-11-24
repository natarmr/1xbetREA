package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mas0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mas0 extends yx5 {
    public final r34 K1;
    public final phf0 L1;
    public fiu0 M1;
    public ii N1;
    public final a8z O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(mas0.class, "tournamentId", "getTournamentId()J", 0), new ez40(mas0.class, "tournamentTitle", "getTournamentTitle()Ljava/lang/String;", 0), new j0d0(mas0.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentTournamentsProvidersBinding;", 0)};
    public static final g9m0 Q1 = new g9m0();

    public mas0() {
        super(R.layout.fragment_tournaments_providers);
        this.K1 = new r34("TOURNAMENT_ID_KEY");
        this.L1 = new phf0("TOURNAMENT_TITLE_KEY");
        this.O1 = xbc.b0(this, sre0.f32672a.b(yas0.class), new qir0(this, (byte) 14));
        this.P1 = ltt0.o(this, kas0.f17981a);
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = e9s0.f7438a;
        iiy[] iiyVarArr = R1;
        Long lN = this.K1.n(this, iiyVarArr[0]);
        long jLongValue = lN.longValue();
        String strN = this.L1.n(this, iiyVarArr[1]);
        s9s0 s9s0Var = s9s0.f31863a;
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        strN.getClass();
        LinkedHashMap linkedHashMap2 = e9s0.f7438a;
        eyi eyiVar = (eyi) linkedHashMap2.get(String.valueOf(jLongValue));
        if (eyiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(d9s0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                d9s0 d9s0Var = (d9s0) (ze3Var instanceof d9s0 ? ze3Var : null);
                if (d9s0Var != null) {
                    ehf0 ehf0Var = d9s0Var.f5717a;
                    cad cadVar = d9s0Var.b;
                    gii0 gii0Var = d9s0Var.c;
                    oeg0 oeg0Var = d9s0Var.l;
                    btt0 btt0Var = d9s0Var.d;
                    s91 s91Var = d9s0Var.e;
                    kt2 kt2Var = d9s0Var.f;
                    ii iiVar = d9s0Var.i;
                    r9u r9uVar = d9s0Var.g;
                    m1e m1eVar = d9s0Var.h;
                    duj dujVar = d9s0Var.j;
                    knf0 knf0Var = d9s0Var.k;
                    ctf0 ctf0Var = d9s0Var.m;
                    kc60 kc60Var = d9s0Var.n;
                    gst0 gst0Var = d9s0Var.o;
                    wdk0 wdk0Var = d9s0Var.p;
                    zr1 zr1Var = d9s0Var.q;
                    r2v r2vVar = d9s0Var.r;
                    bzt bztVar = d9s0Var.s;
                    iiVar.getClass();
                    gii0Var.getClass();
                    oeg0Var.getClass();
                    btt0Var.getClass();
                    s91Var.getClass();
                    kt2Var.getClass();
                    r9uVar.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    ctf0Var.getClass();
                    gst0Var.getClass();
                    wdk0Var.getClass();
                    eyi eyiVar2 = new eyi(cadVar, ehf0Var, iiVar, oeg0Var, s91Var, kt2Var, dujVar, lN, strN, ctf0Var, kc60Var, zr1Var, r2vVar, bztVar);
                    linkedHashMap2.put(String.valueOf(jLongValue), eyiVar2);
                    eyiVar = eyiVar2;
                }
            }
            jf4.n(b1j.i(d9s0.class, "Cannot create dependency "));
            return;
        }
        this.M1 = new fiu0(Collections.singletonMap(yas0.class, eyiVar.r));
        this.N1 = eyiVar.n;
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        jg60 jg60VarK;
        view.getClass();
        super.i0(view, bundle);
        n0().r().u0("REQUEST_KEY_TOURNAMENT_ACTION", K(), new b0l0(this, (byte) 25));
        kxq kxqVarB = B();
        if (kxqVarB != null && (jg60VarK = kxqVarB.k()) != null) {
            bdx.O(jg60VarK, K(), new lcr0(this, (byte) 10));
        }
        Object objN = this.P1.n(R1[2], this);
        objN.getClass();
        pkd.h(((g6r) objN).f10781a, new owp0(this), null, new ugd(-1093957979, true, new iob0((Object) this, (byte) 14)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return true;
    }
}
