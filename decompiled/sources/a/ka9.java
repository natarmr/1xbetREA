package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.playersduel.api.presentation.PlayerDuelParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ka9;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ka9 extends yx5 {
    public final boolean K1;
    public fiu0 L1;
    public final khf0 M1;
    public final phf0 N1;
    public final phf0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(ka9.class, "params", "getParams()Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;", 0), new ez40(ka9.class, "storedInternalComponentKey", "getStoredInternalComponentKey()Ljava/lang/String;", 0), new ez40(ka9.class, "storedPlayersDuelComponentKey", "getStoredPlayersDuelComponentKey()Ljava/lang/String;", 0)};
    public static final cl5 Q1 = new cl5((byte) 13);

    public ka9() {
        super(R.layout.fragment_build_duel);
        this.K1 = true;
        this.M1 = new khf0("BUILD_DUEL_FRAGMENT_PARAMS_KEY");
        this.N1 = new phf0("BUILD_DUEL_INTERNAL_COMPONENT_KEY");
        this.O1 = new phf0("BUILD_DUEL_PLAYERS_DUEL_COMPONENT_KEY");
        this.P1 = xbc.b0(this, sre0.f32672a.b(ab9.class), new ja9(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new ja9(this, (byte) 2));
        pkd.h((ComposeView) q0(), new owp0(this), null, new ugd(-1698088680, true, new m87(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        cb50 cb50VarV = efx.v(this);
        ioi ioiVarH0 = H0();
        G0();
        androidx.fragment.app.e eVarF = F();
        while (eVarF != null) {
            int iP = eVarF.P();
            while (true) {
                iP--;
                if (iP >= 0) {
                    i0h0 i0h0VarJ = eVarF.J(eVarF.O(iP).i);
                    if (i0h0VarJ instanceof ocl0) {
                        pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new ja9(this, (byte) 0));
                        ComponentCallbacks2 application = n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ia9.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            ia9 ia9Var = (ia9) (ze3Var instanceof ia9 ? ze3Var : null);
                            if (ia9Var != null) {
                                PlayerDuelParams playerDuelParams = (PlayerDuelParams) this.M1.n(this, R1[0]);
                                i1w0 i1w0VarF = a4n0.f(this);
                                String str = cb50VarV.f4046a;
                                i1w0VarF.getClass();
                                pcl0VarU.getClass();
                                cad cadVar = ia9Var.f14426a;
                                ocl oclVar = ia9Var.b;
                                wdk0 wdk0Var = ia9Var.c;
                                ctf0 ctf0Var = ia9Var.d;
                                rl70 rl70Var = ia9Var.e;
                                wdk0Var.getClass();
                                ctf0Var.getClass();
                                g45 g45Var = new g45();
                                g45Var.f10647a = cadVar;
                                g45Var.b = playerDuelParams;
                                g45Var.c = ctf0Var;
                                g45Var.d = oclVar;
                                g45Var.e = i1w0VarF;
                                g45Var.f = pcl0VarU;
                                g45Var.g = ioiVarH0;
                                g45Var.h = rl70Var;
                                g45Var.i = new pai(g45Var, (byte) 2);
                                this.L1 = new fiu0(Collections.singletonMap(ab9.class, (pai) g45Var.i));
                                return;
                            }
                        }
                        jf4.n(b1j.i(ia9.class, "Cannot create dependency "));
                        return;
                    }
                }
            }
            Fragment fragment = this.y;
            eVarF = fragment != null ? fragment.F() : null;
        }
        jf4.n("Can't find feature provider!");
    }

    public final hoi G0() {
        iiy[] iiyVarArr = R1;
        iiy iiyVar = iiyVarArr[2];
        phf0 phf0Var = this.O1;
        if (phf0Var.n(this, iiyVar).length() == 0) {
            LinkedHashMap linkedHashMap = lfa0.f19944a;
            phf0Var.x(this, iiyVarArr[2], dw9.o(((PlayerDuelParams) this.M1.n(this, iiyVarArr[0])).f46823a, efx.v(this).f4046a));
        }
        androidx.fragment.app.e eVarF = F();
        while (eVarF != null) {
            for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                i0h0 i0h0VarJ = eVarF.J(eVarF.O(iP).i);
                if (i0h0VarJ instanceof ocl0) {
                    pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new ja9(this, (byte) 3));
                    ioi ioiVarH0 = H0();
                    LinkedHashMap linkedHashMap2 = lfa0.f19944a;
                    String strN = phf0Var.n(this, iiyVarArr[2]);
                    h7u h7uVar = (h7u) ioiVarH0.k.get();
                    strN.getClass();
                    h7uVar.getClass();
                    pcl0VarU.getClass();
                    LinkedHashMap linkedHashMap3 = lfa0.f19944a;
                    hoi hoiVar = (hoi) linkedHashMap3.get(strN);
                    if (hoiVar != null) {
                        return hoiVar;
                    }
                    ComponentCallbacks2 application = n0().getApplication();
                    application.getClass();
                    af3 af3Var = application instanceof af3 ? (af3) application : null;
                    if (af3Var != null) {
                        o5d0 o5d0Var = (o5d0) af3Var.d().get(nfa0.class);
                        ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                        if (!(ze3Var instanceof nfa0)) {
                            ze3Var = null;
                        }
                        nfa0 nfa0Var = (nfa0) ze3Var;
                        if (nfa0Var != null) {
                            gii0 gii0Var = nfa0Var.f23426a;
                            btt0 btt0Var = nfa0Var.b;
                            knf0 knf0Var = nfa0Var.c;
                            gst0 gst0Var = nfa0Var.d;
                            us3 us3Var = nfa0Var.e;
                            gii0Var.getClass();
                            btt0Var.getClass();
                            gst0Var.getClass();
                            knf0Var.getClass();
                            us3Var.getClass();
                            hoi hoiVar2 = new hoi(gii0Var, knf0Var, us3Var, h7uVar);
                            linkedHashMap3.put(strN, hoiVar2);
                            return hoiVar2;
                        }
                    }
                    jf4.n(b1j.i(nfa0.class, "Cannot create dependency "));
                    return null;
                }
            }
            Fragment fragment = this.y;
            eVarF = fragment != null ? fragment.F() : null;
        }
        jf4.n("Can't find feature provider!");
        return null;
    }

    public final ioi H0() {
        iiy[] iiyVarArr = R1;
        iiy iiyVar = iiyVarArr[1];
        phf0 phf0Var = this.N1;
        if (phf0Var.n(this, iiyVar).length() == 0) {
            LinkedHashMap linkedHashMap = ofa0.f25156a;
            phf0Var.x(this, iiyVarArr[1], dw9.o(((PlayerDuelParams) this.M1.n(this, iiyVarArr[0])).f46823a, efx.v(this).f4046a));
        }
        LinkedHashMap linkedHashMap2 = ofa0.f25156a;
        String strN = phf0Var.n(this, iiyVarArr[1]);
        strN.getClass();
        LinkedHashMap linkedHashMap3 = ofa0.f25156a;
        ioi ioiVar = (ioi) linkedHashMap3.get(strN);
        if (ioiVar != null) {
            return ioiVar;
        }
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pfa0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof pfa0)) {
                ze3Var = null;
            }
            pfa0 pfa0Var = (pfa0) ze3Var;
            if (pfa0Var != null) {
                mne mneVar = pfa0Var.f26892a;
                gii0 gii0Var = pfa0Var.b;
                btt0 btt0Var = pfa0Var.c;
                knf0 knf0Var = pfa0Var.d;
                gii0Var.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                ioi ioiVar2 = new ioi(mneVar, gii0Var, knf0Var);
                linkedHashMap3.put(strN, ioiVar2);
                return ioiVar2;
            }
        }
        jf4.n(b1j.i(pfa0.class, "Cannot create dependency "));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if (F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) {
            iiy[] iiyVarArr = R1;
            iiy iiyVar = iiyVarArr[1];
            phf0 phf0Var = this.N1;
            if (phf0Var.n(this, iiyVar).length() > 0) {
                LinkedHashMap linkedHashMap = ofa0.f25156a;
                String strN = phf0Var.n(this, iiyVarArr[1]);
                strN.getClass();
                ofa0.f25156a.remove(strN);
            }
            iiy iiyVar2 = iiyVarArr[2];
            phf0 phf0Var2 = this.O1;
            if (phf0Var2.n(this, iiyVar2).length() > 0) {
                LinkedHashMap linkedHashMap2 = lfa0.f19944a;
                String strN2 = phf0Var2.n(this, iiyVarArr[2]);
                strN2.getClass();
                lfa0.f19944a.remove(strN2);
            }
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        View view = this.l1;
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            composeView.e();
        }
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.K1;
    }
}
