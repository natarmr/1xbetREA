package a;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class jo60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lo60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo60(lo60 lo60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lo60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lo60 lo60Var = this.k;
        switch (b) {
            case 0:
                jo60 jo60Var = new jo60(lo60Var, yjeVar, (byte) 0);
                jo60Var.j = obj;
                return jo60Var;
            case 1:
                jo60 jo60Var2 = new jo60(lo60Var, yjeVar, (byte) 1);
                jo60Var2.j = obj;
                return jo60Var2;
            default:
                jo60 jo60Var3 = new jo60(lo60Var, yjeVar, (byte) 2);
                jo60Var3.j = obj;
                return jo60Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jo60) create((ip70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jo60) create((hp70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jo60) create((cp70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        lo60 lo60Var = this.k;
        switch (b) {
            case 0:
                ip70 ip70Var = (ip70) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ip70Var.b;
                htz htzVar = lo60.U1;
                lo60Var.I0(z);
                boolean z2 = ip70Var.c;
                Drawable navigationIcon = lo60Var.G0().f32431a.getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setAlpha(z2 ? 128 : 255);
                }
                lo60Var.G0().b.setVisibility(ip70Var.f15149a ? 0 : 8);
                lo60Var.G0().b.setBonusSelected(ip70Var.d);
                return Unit.f46060a;
            case 1:
                pek0 pek0Var = pek0.f26859a;
                hp70 hp70Var = (hp70) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (hp70Var != null) {
                    boolean z3 = hp70Var instanceof dp70;
                    lo60 lo60Var2 = this.k;
                    if (z3) {
                        htz htzVar2 = lo60.U1;
                        wdk0 wdk0Var = lo60Var2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH = lo60Var2.H(R.string.bonus_game_warning);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), lo60Var2, null, null, false, null, 1020);
                    } else if (hp70Var instanceof fp70) {
                        htz htzVar3 = lo60.U1;
                        wdk0 wdk0Var2 = lo60Var2.N1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH2 = lo60Var2.H(R.string.warning_disabled_bonus_on_autospin);
                        strH2.getClass();
                        wdk0.k(wdk0Var2, new xdk0(pek0Var, strH2, null, null, null, null, 124), lo60Var2, null, null, false, null, 1020);
                    } else if (hp70Var instanceof gp70) {
                        htz htzVar4 = lo60.U1;
                        ii iiVar = lo60Var2.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        int i = xgs.f2;
                        String strH3 = lo60Var2.H(R.string.unfinished_game_attention);
                        String strH4 = lo60Var2.H(R.string.game_is_not_finished_dialog_text);
                        String strH5 = lo60Var2.H(R.string.game_is_not_finsihed_btn_continue);
                        strH5.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, lo60Var2.H(R.string.game_is_not_finsihed_btn_exit), (String) null, "GameIsNotFinishedDialog.REQUEST_KEY", lo60Var2.H(R.string.game_is_not_finsihed_dont_show_again_text), (ActionDialogButtonStyle) null, n12.f22727a, false, 1424);
                        xgs xgsVar = new xgs();
                        xgsVar.R0(dialogFields);
                        androidx.fragment.app.e eVarC = lo60Var2.C();
                        eVarC.getClass();
                        iiVar.c(xgsVar, eVarC);
                    } else if (hp70Var instanceof ep70) {
                        htz htzVar5 = lo60.U1;
                        ii iiVar2 = lo60Var2.M1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = lo60Var2.H(R.string.attention);
                        String strH7 = lo60Var2.H(R.string.one_x_games_game_bonus_reset_after_account_change);
                        String strH8 = lo60Var2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC2 = lo60Var2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                cp70 cp70Var = (cp70) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (cp70Var instanceof bp70) {
                    htz htzVar6 = lo60.U1;
                    lo60Var.G0().c.c();
                    lo60Var.G0().f.c();
                    lo60Var.G0().c.setVisibility(8);
                    lo60Var.G0().f.setVisibility(8);
                    lo60Var.G0().e.setVisibility(0);
                    sp70 sp70VarH0 = lo60Var.H0();
                    p7m0 p7m0Var = sp70VarH0.U;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ip70.a((ip70) value, sp70VarH0.O, false, false, null, 14)));
                }
                return Unit.f46060a;
        }
    }
}
