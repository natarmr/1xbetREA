package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dic;", "La/iw5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dic extends iw5 {
    public fiu0 k2;
    public final khf0 l2 = new khf0("PARAMS_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(lic.class), new cic(this, (byte) 2));
    public static final /* synthetic */ iiy[] o2 = {new ez40(dic.class, "params", "getParams()Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;", 0)};
    public static final kj5 n2 = new kj5();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-694831228);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object zhbVar = new zhb(1, this, dic.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/bets_on_players/impl/presentation/choose_subgame/ChooseSubGameSideEffect;)V", 0, (byte) 27);
            fetVar.o0(zhbVar);
            objP = zhbVar;
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0Var, clzVar, pz40VarF, null, (byte) 10);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-2129571725, new v7i0(pz40VarY, (byte) 20), fetVar), (ugd) null, u1c.M(1501403253, new ab4((Object) pz40VarY, (Object) this, (byte) 24), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        LinkedHashMap linkedHashMap = tt7.f34496a;
        iiy[] iiyVarArr = o2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.l2;
        eai eaiVarA = tt7.a(dw9.o(((ChooseSubGameParams) khf0Var.n(this, iiyVar)).f46989a, efx.v(this).f4046a), new cic(this, (byte) 0));
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(eic.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof eic)) {
                ze3Var = null;
            }
            eic eicVar = (eic) ze3Var;
            if (eicVar != null) {
                androidx.fragment.app.e eVarF = F();
                while (eVarF != null) {
                    for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                        i0h0 i0h0VarJ = eVarF.J(eVarF.O(iP).i);
                        if (i0h0VarJ instanceof ocl0) {
                            pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new cic(this, (byte) 1));
                            ChooseSubGameParams chooseSubGameParams = (ChooseSubGameParams) khf0Var.n(this, iiyVarArr[0]);
                            pcl0VarU.getClass();
                            cad cadVar = eicVar.f7852a;
                            ctf0 ctf0Var = eicVar.b;
                            s64 s64Var = eicVar.c;
                            kt2 kt2Var = eicVar.d;
                            ctf0Var.getClass();
                            kt2Var.getClass();
                            this.k2 = new fiu0(Collections.singletonMap(lic.class, (pai) new rrd(cadVar, pcl0VarU, eaiVarA, ctf0Var, s64Var, kt2Var, chooseSubGameParams).i));
                            super.W(bundle);
                            return;
                        }
                    }
                    Fragment fragment = this.y;
                    eVarF = fragment != null ? fragment.F() : null;
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(eic.class, "Cannot create dependency "));
    }
}
