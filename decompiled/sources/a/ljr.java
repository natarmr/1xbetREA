package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ljr;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ljr extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ljr.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentGamblingExamBinding;", 0)};
    public khi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;

    public ljr() {
        super(R.layout.fragment_gambling_exam);
        hjr hjrVar = new hjr(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 21), (byte) 22));
        this.N1 = agc.G(this, sre0.f32672a.b(vkr.class), new r6p(a8zVarA, (byte) 8), new r6p(a8zVarA, (byte) 9), hjrVar);
        this.O1 = ltt0.o(this, ijr.f14889a);
        this.P1 = maz.b(new hjr(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.setAdapter((cjr) this.P1.getValue());
        dyb.O(G0().b, new g7p((Object) this, (byte) 13));
        G0().e.setNavigationOnClickListener(new q10(this, (byte) 22));
        ccq0.V(this, "EVENT_DIALOG_REQUEST_KEY", new hjr(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mjr.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mjr mjrVar = (mjr) (ze3Var instanceof mjr ? ze3Var : null);
            if (mjrVar != null) {
                a4n0.f(this).getClass();
                xio xioVar = mjrVar.f21910a;
                czz czzVar = mjrVar.b;
                btt0 btt0Var = mjrVar.c;
                gii0 gii0Var = mjrVar.d;
                ii iiVar = mjrVar.f;
                duj dujVar = mjrVar.e;
                knf0 knf0Var = mjrVar.g;
                wdk0 wdk0Var = mjrVar.h;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = gii0Var;
                esg0Var.b = xioVar;
                esg0Var.c = btt0Var;
                esg0Var.d = knf0Var;
                esg0Var.e = dujVar;
                esg0Var.f = n0k0.a(new ugi(esg0Var, (byte) 11));
                this.K1 = (khi) ((n5d0) esg0Var.f).get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(mjr.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().g);
        yje yjeVar = null;
        jjr jjrVar = new jjr(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g6q(xae0VarN, clzVarW, jjrVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().h);
        kjr kjrVar = new kjr(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g6q(xae0VarN2, clzVarW2, kjrVar, (yje) null), 3);
        xae0 xae0VarN3 = vtb.N(H0().i);
        jjr jjrVar2 = new jjr(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g6q(xae0VarN3, clzVarW3, jjrVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().j;
        kjr kjrVar2 = new kjr(this, yjeVar, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new g6q(ol60Var, clzVarW4, kjrVar2, (yje) null), 3);
    }

    public final a0r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (a0r) objN;
    }

    public final vkr H0() {
        return (vkr) this.N1.getValue();
    }

    public final void I0(String str) {
        ii iiVar = this.L1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.attention);
        String strH2 = H(R.string.ok_new);
        strH2.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, "EVENT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }
}
