package a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.localtimedif.impl.presentation.localtimediffworker.LocalTimeDiffWorker;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;
import org.xplatform.sportgame.bets_on_players.impl.navigation.BetsOnPlayersScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class km00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18515a;
    public final /* synthetic */ Object b;

    public /* synthetic */ km00(Object obj, byte b) {
        this.f18515a = b;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object c4nVar;
        byte b = this.f18515a;
        boolean z = true;
        z = true;
        z = true;
        boolean z2 = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xm00 xm00Var = (xm00) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                bby bbyVar = xm00Var.i;
                if (bbyVar != null) {
                    v3c.N(bbyVar);
                }
                sac.V(jiu0.a(xm00Var), vm00.f37653a, null, xm00Var.e.f22085a, new kaw(xm00Var, th, null == true ? 1 : 0, (byte) 22), 10);
                return Unit.f46060a;
            case 1:
                pzu pzuVar = (pzu) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                    ((ort) pzuVar.d).f25751a.h(false, false);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ((Throwable) obj).printStackTrace();
                dpi0 dpi0Var = ((LocalTimeDiffWorker) obj2).h;
                if (dpi0Var != null) {
                    ((es00) ((ieu) dpi0Var.f6468a).c).f8306a = System.currentTimeMillis();
                    return Unit.f46060a;
                }
                Intrinsics.h("setLastTimeUpdatedUseCase");
                throw null;
            case 3:
                v310 v310Var = (v310) obj2;
                long jLongValue = ((Long) obj).longValue();
                x510 x510Var = x510.STATISTIC;
                if (jLongValue != 1 ? jLongValue != 2 ? jLongValue != 14 || ucx.a0(v310Var) : ucx.Z(v310Var) : ucx.b0(v310Var)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                u610 u610Var = (u610) obj2;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var = u610Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    u610Var.f.getClass();
                    u610 u610Var2 = u610Var;
                    if (p7m0Var.m(value2, m310.a((m310) value2, null, null, null, null, null, xusVar, false, null, null, null, false, null, false, false, null, null, 33554367))) {
                        return Unit.f46060a;
                    }
                    u610Var = u610Var2;
                }
                break;
            case 5:
                ze10 ze10Var = (ze10) obj2;
                kf10 kf10Var = (kf10) obj;
                htz htzVar = ze10.Q1;
                kf10Var.getClass();
                if (kf10Var instanceof if10) {
                    ze10Var.G0(((if10) kf10Var).f14664a);
                } else if (kf10Var instanceof jf10) {
                    ze10Var.n0().r().t0(i120.U(), "LOYALTY_PROGRAM_CASHBACK_UPDATED_RESULT_KEY");
                    ze10Var.G0(((jf10) kf10Var).f16403a);
                } else if (kf10Var instanceof hf10) {
                    DialogFields dialogFields = ((hf10) kf10Var).f12952a;
                    String str = dialogFields.f;
                    if (str == null) {
                        str = "";
                    }
                    ccq0.V(ze10Var, str, new xe10(ze10Var, (byte) 1));
                    ze10Var.G0(dialogFields);
                }
                ((k3t0) ze10Var.M1.getValue()).x(ie10.f14611a);
                return Unit.f46060a;
            case 6:
                mg10 mg10Var = (mg10) obj2;
                fh10 fh10Var = (fh10) obj;
                uuz uuzVar = mg10.Q1;
                fh10Var.getClass();
                if (fh10Var instanceof dh10) {
                    DialogFields dialogFields2 = ((dh10) fh10Var).f6072a;
                    ii iiVar = mg10Var.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = mg10Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields2, eVarC);
                } else if (fh10Var instanceof eh10) {
                    mg10Var.n0().r().t0(i120.U(), "LOYALTY_PROGRAM_CASHBACK_UPDATED_RESULT_KEY");
                    DialogFields dialogFields3 = ((eh10) fh10Var).f7788a;
                    ii iiVar2 = mg10Var.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = mg10Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields3, eVarC2);
                }
                ((k3t0) mg10Var.M1.getValue()).x(xf10.f40770a);
                return Unit.f46060a;
            case 7:
                iqt0 iqt0Var = (iqt0) obj;
                htz htzVar2 = zp10.U1;
                iqt0Var.getClass();
                ((zp10) obj2).H0().k.a(iqt0Var);
                return Unit.f46060a;
            case 8:
                e000 e000Var = (e000) obj2;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new if6(cpVar, e000Var, cpVar, e000Var, (byte) 6));
                return Unit.f46060a;
            case 9:
                iqt0 iqt0Var2 = (iqt0) obj;
                evz evzVar = qr10.V1;
                iqt0Var2.getClass();
                ((qr10) obj2).I0().x(new i780(iqt0Var2));
                return Unit.f46060a;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                wsz wszVar = yr10.R1;
                ds10 ds10Var = (ds10) ((yr10) obj2).M1.getValue();
                ds10Var.d.w(iIntValue);
                p7m0 p7m0Var2 = ds10Var.e;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, ru9.a((ru9) value, null, iIntValue, 3)));
                return Unit.f46060a;
            case 11:
                hv10 hv10Var = (hv10) obj2;
                String str2 = (String) obj;
                atz atzVar = hv10.X1;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -2036991630:
                        if (str2.equals("FAVORITES_TAG")) {
                            hv10Var.J0(new ya50(0));
                        }
                        break;
                    case -1788704465:
                        if (str2.equals("HISTORY_TAG")) {
                            hv10Var.J0(new za50(0, 7, 0L, 0L));
                        }
                        break;
                    case -448992012:
                        if (str2.equals("POPULAR_TAG")) {
                            hv10Var.J0(new bb50(false));
                        }
                        break;
                    case 180140186:
                        if (str2.equals("MENU_TAG")) {
                            hv10Var.J0(new ab50(0));
                        }
                        break;
                    case 1096006625:
                        if (str2.equals("COUPON_TAG")) {
                            hv10Var.J0(new xa50());
                        }
                        break;
                }
                return Unit.f46060a;
            case 12:
                Context context = (Context) obj;
                context.getClass();
                ViewPager2 viewPager2 = new ViewPager2(context);
                viewPager2.setAdapter((nv10) obj2);
                viewPager2.setUserInputEnabled(false);
                View childAt = viewPager2.getChildAt(0);
                childAt.getClass();
                ((RecyclerView) childAt).setItemViewCacheSize(l4b.i.b());
                return viewPager2;
            case 13:
                ViewPager2 viewPager3 = (ViewPager2) obj;
                viewPager3.getClass();
                viewPager3.e(l4b.i.indexOf((l4b) obj2), false);
                return Unit.f46060a;
            case 14:
                uuz uuzVar2 = dw10.V1;
                ((View) obj).getClass();
                cx10 cx10VarI0 = ((dw10) obj2).I0();
                if (cx10VarI0.J) {
                    tzi tziVar = cx10VarI0.z;
                    i8i.D("screen", "menu", ((zg) tziVar.j).f44322a, "acc_pers_data_move");
                    b1j.v("menu", ((au0) tziVar.g).f1455a, 11012L);
                    i1w0 i1w0Var = cx10VarI0.d;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    PersonalScreen$PersonalDataScreen personalScreen$PersonalDataScreenJ = jh70.j(cx10VarI0.j, false);
                    if (personalScreen$PersonalDataScreenJ instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$PersonalDataScreenJ)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(personalScreen$PersonalDataScreenJ)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 15:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((cx10) obj2).v.b(th3, new gm10((byte) 5));
                return Unit.f46060a;
            case 16:
                ((Integer) obj).getClass();
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 17:
                PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                evz evzVar2 = b720.w2;
                promoCodeInfoUiModel.getClass();
                ((b720) obj2).Q0().x(new k420(new jdc0(promoCodeInfoUiModel.b, promoCodeInfoUiModel.e, promoCodeInfoUiModel.f46775a, promoCodeInfoUiModel.c, promoCodeInfoUiModel.d)));
                return Unit.f46060a;
            case 18:
                int iIntValue2 = ((Integer) obj).intValue();
                wsz wszVar2 = c720.p2;
                ((c720) obj2).Q0().e.setCurrentItem(iIntValue2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                PromoCodeInfoUiModel promoCodeInfoUiModel2 = (PromoCodeInfoUiModel) obj;
                uuz uuzVar3 = z620.u2;
                promoCodeInfoUiModel2.getClass();
                ((z620) obj2).Q0().x(new k420(new jdc0(promoCodeInfoUiModel2.b, promoCodeInfoUiModel2.e, promoCodeInfoUiModel2.f46775a, promoCodeInfoUiModel2.c, promoCodeInfoUiModel2.d)));
                return Unit.f46060a;
            case 20:
                y920 y920Var = (y920) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                y920Var.f.b(th4, new j920(y920Var, true ? (byte) 1 : (byte) 0));
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = ((kn20) obj2).j;
                p7m0Var3.getClass();
                p7m0Var3.o(null, li20.f20084a);
                return Unit.f46060a;
            case 22:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                y3j0 y3j0Var = ((mn20) obj2).f;
                bm5 bm5Var = bm5.b;
                y3j0Var.getClass();
                k0w0Var.h(new SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5Var));
                return Unit.f46060a;
            case 23:
                ((View) obj).getClass();
                Function0 function0 = ((bu20) obj2).i;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 24:
                qil0 qil0Var = (qil0) obj2;
                List list = (List) obj;
                list.getClass();
                a4x a4xVarO0 = dyb.o0(list);
                a4xVarO0.getClass();
                if (qil0Var instanceof hil0) {
                    c4nVar = new a4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                } else {
                    if (qil0Var instanceof eil0) {
                        return new z3n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c(), (eil0) qil0Var);
                    }
                    if (qil0Var instanceof lil0) {
                        c4nVar = new b4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                    } else {
                        if (!(qil0Var instanceof pil0)) {
                            if (qil0Var instanceof bil0) {
                                bil0 bil0Var = (bil0) qil0Var;
                                return new y3n(a4xVarO0, bil0Var.f2664a, bil0Var.b, bil0Var.c);
                            }
                            t9f.b();
                            return null;
                        }
                        c4nVar = new c4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                    }
                }
                return c4nVar;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                e730 e730Var = (e730) obj2;
                if (((Boolean) obj).booleanValue()) {
                    cyu cyuVar = e730Var.m;
                    wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                    cyuVar.C("market_set");
                } else if (((CharSequence) e730Var.q.getValue()).length() > 0) {
                    s31 s31Var = e730Var.l;
                    wgh0 wgh0Var2 = wgh0.MY_AGGREGATOR;
                    s31Var.getClass();
                    i8i.D("screen", "market_set", s31Var.f31532a, "search_call");
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                f730 f730Var = (f730) obj2;
                if (((Boolean) obj).booleanValue()) {
                    cyu cyuVar2 = f730Var.l;
                    wgh0 wgh0Var3 = wgh0.MY_AGGREGATOR;
                    cyuVar2.C("market_set");
                } else if (((CharSequence) f730Var.o.getValue()).length() > 0) {
                    s31 s31Var2 = f730Var.k;
                    wgh0 wgh0Var4 = wgh0.MY_AGGREGATOR;
                    s31Var2.getClass();
                    i8i.D("screen", "market_set", s31Var2.f31532a, "search_call");
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uz20 uz20Var = (uz20) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                cl5 cl5Var = uz20Var.C;
                MarketsCategoriesParams marketsCategoriesParams = uz20Var.q;
                BetsOnPlayersScreenParams betsOnPlayersScreenParams = new BetsOnPlayersScreenParams(marketsCategoriesParams.f46990a, marketsCategoriesParams.b, marketsCategoriesParams.d);
                cl5Var.getClass();
                k0w0Var2.h(new BetsOnPlayersScreenFactoryImpl$getScreen$1(betsOnPlayersScreenParams));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j230 j230Var = (j230) obj2;
                g7h g7hVar = (g7h) obj;
                g7hVar.getClass();
                th90 th90Var = g7hVar.e;
                th90 th90Var2 = (th90) th90Var.get(Long.valueOf(j230Var.c));
                if (th90Var2 == null) {
                    th90Var2 = uh90.g;
                    th90Var2.getClass();
                }
                return g7h.a(g7hVar, null, null, null, null, th90Var.put((Object) Long.valueOf(j230Var.c), (Object) th90Var2.put((Object) Long.valueOf(j230Var.f15763a), (Object) j230Var.b)), null, null, null, 0L, 495);
            default:
                b230 b230Var = (b230) obj2;
                g7h g7hVar2 = (g7h) obj;
                g7hVar2.getClass();
                List list2 = g7hVar2.c;
                th90 th90VarPut = g7hVar2.d;
                xum0 xum0Var = (xum0) CollectionsKt.firstOrNull(list2);
                Long lValueOf = xum0Var != null ? Long.valueOf(xum0Var.b) : null;
                if (b230Var.f1837a == -26 && lValueOf != null) {
                    th90VarPut = th90VarPut.put((Object) (-26L), (Object) lValueOf);
                }
                return g7h.a(g7hVar2, null, null, null, th90VarPut, null, null, null, null, b230Var.f1837a, 247);
        }
    }
}
