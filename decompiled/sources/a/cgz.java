package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.discipline_filter.model.LeaderboardDisciplineFilterParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cgz;", "La/iw5;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cgz extends iw5 {
    public g2v k2;
    public final khf0 l2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] n2 = {new ez40(cgz.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;", 0)};
    public static final sqt m2 = new sqt();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-2002324144);
        qs00 qs00Var = (qs00) wv90.f39830a.u().f31011a.get(0);
        iiy[] iiyVarArr = n2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.l2;
        long j = ((LeaderboardDisciplineFilterParams) khf0Var.n(this, iiyVar)).f46578a;
        a4x a4xVarO0 = dyb.o0(((LeaderboardDisciplineFilterParams) khf0Var.n(this, iiyVarArr[0])).b);
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new zfz(this, (byte) 0);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        qs00Var.getClass();
        a4xVarO0.getClass();
        function0.getClass();
        boolean zF = fetVar.f(j);
        Object objP2 = fetVar.P();
        if (zF || objP2 == obj) {
            objP2 = androidx.compose.runtime.e.e("");
            fetVar.o0(objP2);
        }
        pz40 pz40Var = (pz40) objP2;
        boolean zF2 = fetVar.f(j);
        Object objP3 = fetVar.P();
        if (zF2 || objP3 == obj) {
            objP3 = androidx.compose.runtime.e.e(new wfz(lak0.c));
            fetVar.o0(objP3);
        }
        pz40 pz40Var2 = (pz40) objP3;
        Unit unit = Unit.f46060a;
        boolean zG = fetVar.g(pz40Var) | fetVar.i(a4xVarO0) | fetVar.f(j) | fetVar.g(pz40Var2) | fetVar.g(function0);
        Object objP4 = fetVar.P();
        if (zG || objP4 == obj) {
            objP4 = new se5(pz40Var, a4xVarO0, pz40Var2, function0, j, (yje) null);
            fetVar.o0(objP4);
        }
        m0x0.t(fetVar, unit, (Function2) objP4);
        boolean zG2 = fetVar.g(qs00Var) | fetVar.f(j);
        Object objP5 = fetVar.P();
        if (zG2 || objP5 == obj) {
            objP5 = new egz(qs00Var, pz40Var2, pz40Var);
            fetVar.o0(objP5);
        }
        egz egzVar = (egz) objP5;
        xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
        Object objP6 = fetVar.P();
        if (objP6 == obj) {
            objP6 = new ebz(this, (byte) 9);
            fetVar.o0(objP6);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-993395199, new rgh(egzVar, this, (byte) 29), fetVar), (ugd) null, u1c.M(1698113215, new qb((Object) egzVar, (Object) xczVarA, objP6, false, (byte) 7), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dgz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dgz dgzVar = (dgz) (ze3Var instanceof dgz ? ze3Var : null);
            if (dgzVar != null) {
                this.k2 = dgzVar.f6067a;
                return;
            }
        }
        jf4.n(b1j.i(dgz.class, "Cannot create dependency "));
    }
}
