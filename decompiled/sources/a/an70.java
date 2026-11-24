package a;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Xml;
import android.view.InflateException;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class an70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bn70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an70(bn70 bn70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bn70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bn70 bn70Var = this.k;
        switch (b) {
            case 0:
                an70 an70Var = new an70(bn70Var, yjeVar, (byte) 0);
                an70Var.j = obj;
                return an70Var;
            case 1:
                an70 an70Var2 = new an70(bn70Var, yjeVar, (byte) 1);
                an70Var2.j = obj;
                return an70Var2;
            case 2:
                an70 an70Var3 = new an70(bn70Var, yjeVar, (byte) 2);
                an70Var3.j = obj;
                return an70Var3;
            case 3:
                an70 an70Var4 = new an70(bn70Var, yjeVar, (byte) 3);
                an70Var4.j = obj;
                return an70Var4;
            case 4:
                an70 an70Var5 = new an70(bn70Var, yjeVar, (byte) 4);
                an70Var5.j = obj;
                return an70Var5;
            default:
                an70 an70Var6 = new an70(bn70Var, yjeVar, (byte) 5);
                an70Var6.j = obj;
                return an70Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((an70) create((in70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((an70) create((io70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((an70) create((kn70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((an70) create((hn70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((an70) create((qn70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((an70) create((jn70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strH;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 1;
        bn70 bn70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                in70 in70Var = (in70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(in70Var, in70.f15059a)) {
                    iiy[] iiyVarArr = bn70.S1;
                    Context contextD = bn70Var.D();
                    kpb.w0(bn70Var, contextD != null ? sj3.J(contextD) : true, new xm70(bn70Var, b3), new xm70(bn70Var, b2), bn70Var.K0());
                } else {
                    if (!Intrinsics.d(in70Var, in70.b)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr2 = bn70.S1;
                    ii iiVarK0 = bn70Var.K0();
                    String strH2 = bn70Var.H(R.string.attention);
                    String strH3 = bn70Var.H(R.string.unacceptable_bonus_account_for_web_game);
                    String strH4 = bn70Var.H(R.string.ok);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC = bn70Var.C();
                    eVarC.getClass();
                    iiVarK0.d(dialogFields, eVarC);
                }
                return Unit.f46060a;
            case 1:
                io70 io70Var = (io70) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (io70Var instanceof do70) {
                    boolean z = ((do70) io70Var).f6403a;
                    if (bn70Var.D() != null) {
                        if (z) {
                            ii iiVarK1 = bn70Var.K0();
                            String strH5 = bn70Var.H(R.string.not_enough_money);
                            String strH6 = bn70Var.H(R.string.insufficient_balance_dialog_body);
                            String strH7 = bn70Var.H(R.string.replenish);
                            strH7.getClass();
                            DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, bn70Var.H(R.string.cancel), (String) null, "NOT_ENOUGH_FUNDS", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                            androidx.fragment.app.e eVarC2 = bn70Var.C();
                            eVarC2.getClass();
                            iiVarK1.d(dialogFields2, eVarC2);
                        } else {
                            ii iiVarK2 = bn70Var.K0();
                            String strH8 = bn70Var.H(R.string.error);
                            String strH9 = bn70Var.H(R.string.not_enough_cash);
                            String strH10 = bn70Var.H(R.string.cancel);
                            strH10.getClass();
                            DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC3 = bn70Var.C();
                            eVarC3.getClass();
                            iiVarK2.d(dialogFields3, eVarC3);
                        }
                    }
                } else if (io70Var instanceof co70) {
                    iiy[] iiyVarArr3 = bn70.S1;
                    ii iiVarK3 = bn70Var.K0();
                    int i = xgs.f2;
                    String strH11 = bn70Var.H(R.string.unfinished_game_attention);
                    String strH12 = bn70Var.H(R.string.game_is_not_finished_dialog_text);
                    String strH13 = bn70Var.H(R.string.game_is_not_finsihed_btn_continue);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, bn70Var.H(R.string.game_is_not_finsihed_btn_exit), (String) null, "GameIsNotFinishedDialog.REQUEST_KEY", bn70Var.H(R.string.game_is_not_finsihed_dont_show_again_text), (ActionDialogButtonStyle) null, n12.f22727a, false, 1424);
                    xgs xgsVar = new xgs();
                    xgsVar.R0(dialogFields4);
                    androidx.fragment.app.e eVarC4 = bn70Var.C();
                    eVarC4.getClass();
                    iiVarK3.c(xgsVar, eVarC4);
                } else if (io70Var instanceof ho70) {
                    iiy[] iiyVarArr4 = bn70.S1;
                    ii iiVarK4 = bn70Var.K0();
                    String strH14 = bn70Var.H(R.string.unfinished_game_attention);
                    String strH15 = bn70Var.H(R.string.unfinished_game_dialog_text);
                    String strH16 = bn70Var.H(R.string.unfinished_game_dialog_ok);
                    strH16.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, (String) null, (String) null, "UNFINISHED_GAME_DIALOG_RESULT", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC5 = bn70Var.C();
                    eVarC5.getClass();
                    iiVarK4.d(dialogFields5, eVarC5);
                } else if (io70Var instanceof bo70) {
                    boolean z2 = ((bo70) io70Var).f2919a;
                    iiy[] iiyVarArr5 = bn70.S1;
                    ii iiVarK5 = bn70Var.K0();
                    String strH17 = bn70Var.H(R.string.attention);
                    String strH18 = z2 ? bn70Var.H(R.string.bonus_not_applied_bonus_account_warning_message_web_game) : bn70Var.H(R.string.bonus_not_applied_warning_message_web_game);
                    String strH19 = bn70Var.H(R.string.ok_new);
                    strH19.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC6 = bn70Var.C();
                    eVarC6.getClass();
                    iiVarK5.d(dialogFields6, eVarC6);
                } else if (io70Var instanceof eo70) {
                    iiy[] iiyVarArr6 = bn70.S1;
                    if (bn70Var.D() != null) {
                        ii iiVarK6 = bn70Var.K0();
                        String strH20 = bn70Var.H(R.string.error);
                        String strH21 = bn70Var.H(R.string.exceeded_max_amount_bet);
                        String strH22 = bn70Var.H(R.string.ok);
                        strH22.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH20, (CharSequence) strH21, (CharSequence) strH22, (String) null, (String) null, "INSUFFICIENT_DIALOG_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC7 = bn70Var.C();
                        eVarC7.getClass();
                        iiVarK6.d(dialogFields7, eVarC7);
                    }
                } else if (io70Var instanceof rn70) {
                    bn70Var.G0(((rn70) io70Var).f30775a);
                } else if (io70Var instanceof sn70) {
                    qh70.O1.getClass();
                    bn70Var.I0(R.id.onex_holder_menu_container, new qh70());
                } else if (io70Var instanceof tn70) {
                    s470 s470Var = ((tn70) io70Var).f34221a;
                    s470Var.getClass();
                    htz htzVar = lo60.U1;
                    csr csrVar = (csr) bn70Var.O1.n(bn70Var, bn70.S1[0]);
                    htzVar.getClass();
                    lo60 lo60Var = new lo60();
                    iiy[] iiyVarArr7 = lo60.V1;
                    lo60Var.R1.u(lo60Var, iiyVarArr7[1], csrVar);
                    lo60Var.S1.u(lo60Var, iiyVarArr7[2], s470Var);
                    bn70Var.I0(R.id.game_holder_toolbar, lo60Var);
                } else if (io70Var instanceof un70) {
                    iiy[] iiyVarArr8 = bn70.S1;
                    bn70Var.R0();
                } else if (io70Var instanceof ao70) {
                    iiy[] iiyVarArr9 = bn70.S1;
                    FrameLayout frameLayout = bn70Var.L0().d;
                    TextView textView = bn70Var.L0().e;
                    ao70 ao70Var = (ao70) io70Var;
                    double d = ao70Var.f1189a;
                    boolean z3 = ao70Var.b;
                    String str = ao70Var.c;
                    str.getClass();
                    x1h0 x1h0Var = new x1h0();
                    x1h0Var.f40122a = frameLayout;
                    if (d > 0.0d && z3) {
                        Locale locale = Locale.ENGLISH;
                        String strH23 = bn70Var.H(R.string.draw_game);
                        strH23.getClass();
                        strH = String.format(locale, strH23, Arrays.copyOf(new Object[0], 0));
                    } else if (d <= 0.0d || z3) {
                        strH = bn70Var.H(R.string.lose_title);
                        strH.getClass();
                    } else {
                        Locale locale2 = Locale.ENGLISH;
                        String strH24 = bn70Var.H(R.string.win_twenty_one_message);
                        strH24.getClass();
                        strH = String.format(locale2, strH24, Arrays.copyOf(new Object[]{Double.valueOf(d), str}, 2));
                    }
                    textView.setText(strH);
                    Context contextO0 = bn70Var.o0();
                    nms0 nms0Var = new nms0(contextO0);
                    XmlResourceParser xml = contextO0.getResources().getXml(R.transition.fade_in_fade_out);
                    try {
                        try {
                            gms0 gms0VarB = nms0Var.b(xml, Xml.asAttributeSet(xml), null);
                            xml.close();
                            ArrayList arrayList = tms0.c;
                            if (!arrayList.contains(frameLayout)) {
                                x1h0 x1h0Var2 = (x1h0) frameLayout.getTag(R.id.transition_current_scene);
                                if (gms0VarB == null) {
                                    if (x1h0Var2 != null) {
                                    }
                                    frameLayout.setTag(R.id.transition_current_scene, x1h0Var);
                                } else {
                                    arrayList.add(frameLayout);
                                    gms0 gms0VarClone = gms0VarB.clone();
                                    tms0.d(frameLayout, gms0VarClone);
                                    frameLayout.setTag(R.id.transition_current_scene, x1h0Var);
                                    tms0.c(frameLayout, gms0VarClone);
                                }
                            }
                            frameLayout.setVisibility(0);
                        } catch (IOException e) {
                            throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
                        } catch (XmlPullParserException e2) {
                            throw new InflateException(e2.getMessage(), e2);
                        }
                    } catch (Throwable th) {
                        xml.close();
                        throw th;
                    }
                } else if (io70Var instanceof go70) {
                    iiy[] iiyVarArr10 = bn70.S1;
                    ii iiVarK7 = bn70Var.K0();
                    String strH25 = bn70Var.H(R.string.technical_works);
                    String strH26 = bn70Var.H(R.string.game_technical_works);
                    String strH27 = bn70Var.H(R.string.continue_action);
                    strH27.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH25, (CharSequence) strH26, (CharSequence) strH27, (String) null, (String) null, "HOLDER_TECHNICAL_WORKS_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC8 = bn70Var.C();
                    eVarC8.getClass();
                    iiVarK7.d(dialogFields8, eVarC8);
                } else if (io70Var instanceof vn70) {
                    iiy[] iiyVarArr11 = bn70.S1;
                    bn70Var.Q0().B(bn70Var.o0());
                } else if (io70Var instanceof wn70) {
                    iiy[] iiyVarArr12 = bn70.S1;
                    bn70Var.w0(new Intent("android.settings.SETTINGS"));
                } else if (io70Var instanceof fo70) {
                    iiy[] iiyVarArr13 = bn70.S1;
                    ii iiVarK8 = bn70Var.K0();
                    String strH28 = bn70Var.H(R.string.error);
                    String strH29 = bn70Var.H(R.string.request_error);
                    String strH30 = bn70Var.H(R.string.ok);
                    strH30.getClass();
                    DialogFields dialogFields9 = new DialogFields((CharSequence) strH28, (CharSequence) strH29, (CharSequence) strH30, (String) null, (String) null, "REQUEST_DIALOG_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC9 = bn70Var.C();
                    eVarC9.getClass();
                    iiVarK8.d(dialogFields9, eVarC9);
                } else if (io70Var instanceof yn70) {
                    o2t.b(bn70Var.F(), ((yn70) io70Var).f42925a, "");
                } else if (Intrinsics.d(io70Var, zn70.f44661a)) {
                    o2t.c(bn70Var.F(), GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a, "");
                } else {
                    if (!(io70Var instanceof xn70)) {
                        t9f.b();
                        return null;
                    }
                    csr csrVar2 = ((xn70) io70Var).f41160a;
                    iiy[] iiyVarArr14 = bn70.S1;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY", csrVar2);
                    vcc.f0(bundle, bn70Var, "OneXGames.BONUS_NOT_USED_RESULT_KEY");
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = ((kn70) obj2).f18570a;
                iiy[] iiyVarArr15 = bn70.S1;
                bn70Var.V0(z4);
                return Unit.f46060a;
            case 3:
                hn70 hn70Var = (hn70) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (hn70Var != null) {
                    if (hn70Var instanceof gn70) {
                        gn70 gn70Var = (gn70) hn70Var;
                        String str2 = gn70Var.f11573a;
                        int i2 = gn70Var.b;
                        iiy[] iiyVarArr16 = bn70.S1;
                        AppCompatImageView appCompatImageView = bn70Var.L0().b;
                        gbe0 gbe0VarA = o5k0.a(appCompatImageView.getContext());
                        k1x k1xVar = new k1x(appCompatImageView.getContext());
                        k1xVar.c = str2;
                        t1x.h(k1xVar, appCompatImageView);
                        if (i2 != 0) {
                            t1x.f(k1xVar, i2);
                        }
                        q1x.a(k1xVar);
                        gbe0VarA.a(k1xVar.a());
                    } else if (hn70Var instanceof fn70) {
                        iiy[] iiyVarArr17 = bn70.S1;
                        bn70Var.O0(bn70Var.L0().b, ((fn70) hn70Var).f9820a);
                    }
                }
                return Unit.f46060a;
            case 4:
                qn70 qn70Var = (qn70) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr18 = bn70.S1;
                if (qn70Var != null) {
                    if (qn70Var instanceof ln70) {
                        ln70 ln70Var = (ln70) qn70Var;
                        boolean z5 = ln70Var.f20331a;
                        boolean z6 = ln70Var.b;
                        bn70Var.T0(false);
                        bn70Var.R0();
                        bn70Var.U0(z6);
                        bn70Var.V0(z5);
                    } else if (qn70Var instanceof pn70) {
                        bn70Var.T0(false);
                        bn70Var.R0();
                        bn70Var.U0(false);
                    } else if (qn70Var instanceof mn70) {
                        boolean z7 = ((mn70) qn70Var).f22075a;
                        bn70Var.V0(!z7);
                        bn70Var.T0(false);
                        bn70Var.R0();
                        bn70Var.U0(z7);
                    } else if (qn70Var instanceof nn70) {
                        bn70Var.T0(((nn70) qn70Var).f23807a);
                    } else if (qn70Var instanceof on70) {
                        String str3 = ((on70) qn70Var).f25534a;
                        ii iiVarK9 = bn70Var.K0();
                        String strH31 = bn70Var.H(R.string.error);
                        String strH32 = bn70Var.H(R.string.ok);
                        strH32.getClass();
                        DialogFields dialogFields10 = new DialogFields((CharSequence) strH31, (CharSequence) str3, (CharSequence) strH32, (String) null, (String) null, "ONE_X_GAME_HOLDER_ERROR", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC10 = bn70Var.C();
                        eVarC10.getClass();
                        iiVarK9.d(dialogFields10, eVarC10);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                jn70 jn70Var = (jn70) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr19 = bn70.S1;
                bn70Var.L0().j.setUiModel(new pvo0(jn70Var.b, jn70Var.f16800a));
                return Unit.f46060a;
        }
    }
}
