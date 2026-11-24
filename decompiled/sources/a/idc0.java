package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/idc0;", "La/zz5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class idc0 extends zz5 {
    public fiu0 M1;
    public ii N1;
    public final s0r O1;
    public final kiu0 P1;
    public final khf0 Q1;
    public final jt6 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(idc0.class, "binding", "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentPromoBetBinding;", 0), new ez40(idc0.class, "finBetInfoModel", "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;", 0)};
    public static final jh70 S1 = new jh70();

    public idc0() {
        super(R.layout.fin_bet_fragment_promo_bet);
        this.O1 = ltt0.o(this, hdc0.f12863a);
        gdc0 gdc0Var = new gdc0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 13), (byte) 14));
        this.P1 = agc.G(this, sre0.f32672a.b(kvc0.class), new x6b0(a8zVarA, (byte) 16), new x6b0(a8zVarA, (byte) 17), gdc0Var);
        this.Q1 = new khf0("EXTRA_BET_INFO");
        this.R1 = new jt6(this, (byte) 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        dyb.O(L0().b, new ppb0(this, (byte) 14));
        L0().c.a(this.R1);
        L0().c.setEndViewVisible(false);
        ccq0.T(this, "BET_ALREADY_DONE_REQUEST_KEY_PROMO", new gdc0(this, (byte) 0));
        ccq0.V(this, "BET_ALREADY_DONE_REQUEST_KEY_PROMO", new gdc0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r6q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r6q r6qVar = (r6q) (ze3Var instanceof r6q ? ze3Var : null);
            if (r6qVar != null) {
                hhi hhiVarA = r6qVar.a(a4n0.f(this), (FinBetInfoModel) this.Q1.n(this, U1[1]), idc0.class.getSimpleName(), ua20.MEDIUM_NO_GAME_INFO);
                this.M1 = hhiVarA.c();
                this.N1 = hhiVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(r6q.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = M0().D;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(p7m0Var, clzVarW, s9c0Var, (yje) null), 3);
        gmq gmqVarS = sj3.S(M0().o, 100L);
        p6b0 p6b0Var = new p6b0(2, this, idc0.class, "handleEvents", "handleEvents(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/MakeBetAction;)V", 4, (byte) 28);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(gmqVarS, clzVarW2, p6b0Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(M0().E);
        c670 c670Var = new c670(this, null, (byte) 27);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new p8c0(xae0VarN, clzVarW3, c670Var, (yje) null), 3);
        ol60 ol60Var = M0().p;
        p6b0 p6b0Var2 = new p6b0(2, this, idc0.class, "handleErrors", "handleErrors(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_action/ErrorAction;)V", 4, (byte) 29);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new p8c0(ol60Var, clzVarW4, p6b0Var2, (yje) null, (byte) 0), 3);
    }

    @Override // a.zz5
    public final View I0() {
        return L0().c;
    }

    @Override // a.zz5
    public final void J0(r0o r0oVar) {
        r0oVar.getClass();
        if (!(r0oVar instanceof o0o)) {
            super.J0(r0oVar);
            return;
        }
        String str = ((o0o) r0oVar).f24437a;
        ii iiVar = this.N1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.error);
        String strH2 = H(R.string.ok_new);
        strH2.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, H(R.string.cancel), (String) null, "BET_ALREADY_DONE_REQUEST_KEY_PROMO", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    public final l6q L0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (l6q) objN;
    }

    public final kvc0 M0() {
        return (kvc0) this.P1.getValue();
    }
}
