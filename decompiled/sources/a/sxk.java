package a;

import android.content.Context;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.limits.ie.impl.navigation.LimitsIeScreens$LimitsIeFragmentScreen;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentUiModel;
import org.xplatform.ui_core.viewcomponents.views.BalanceView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class sxk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxk(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new sxk((txk) this.j, (PersonalDocumentRedesignUiModel) obj2, yjeVar, (byte) 0);
            case 1:
                return new sxk((w6l) this.j, (String) obj2, yjeVar, (byte) 1);
            case 2:
                return new sxk((j8l) this.j, (String) obj2, yjeVar, (byte) 2);
            case 3:
                return new sxk((j8l) this.j, (Function0) obj2, yjeVar, (byte) 3);
            case 4:
                return new sxk((rcl) this.j, (gcl) obj2, yjeVar, (byte) 4);
            case 5:
                sxk sxkVar = new sxk((kin) obj2, yjeVar, (byte) 5);
                sxkVar.j = obj;
                return sxkVar;
            case 6:
                sxk sxkVar2 = new sxk((mpn) obj2, yjeVar, (byte) 6);
                sxkVar2.j = obj;
                return sxkVar2;
            case 7:
                sxk sxkVar3 = new sxk((d4o) obj2, yjeVar, (byte) 7);
                sxkVar3.j = ((j0g0) obj).f15681a;
                return sxkVar3;
            case 8:
                sxk sxkVar4 = new sxk((cwo) obj2, yjeVar, (byte) 8);
                sxkVar4.j = obj;
                return sxkVar4;
            case 9:
                sxk sxkVar5 = new sxk((nzo) obj2, yjeVar, (byte) 9);
                sxkVar5.j = obj;
                return sxkVar5;
            case 10:
                sxk sxkVar6 = new sxk((e0p) obj2, yjeVar, (byte) 10);
                sxkVar6.j = obj;
                return sxkVar6;
            case 11:
                sxk sxkVar7 = new sxk((s1p) obj2, yjeVar, (byte) 11);
                sxkVar7.j = obj;
                return sxkVar7;
            case 12:
                sxk sxkVar8 = new sxk((org.xplatform.favorites.impl.presentation.category.a) obj2, yjeVar, (byte) 12);
                sxkVar8.j = obj;
                return sxkVar8;
            case 13:
                sxk sxkVar9 = new sxk((ccp) obj2, yjeVar, (byte) 13);
                sxkVar9.j = obj;
                return sxkVar9;
            case 14:
                return new sxk((ccp) this.j, (mlr) obj2, yjeVar, (byte) 14);
            case 15:
                sxk sxkVar10 = new sxk((bep) obj2, yjeVar, (byte) 15);
                sxkVar10.j = obj;
                return sxkVar10;
            case 16:
                sxk sxkVar11 = new sxk((org.xplatform.favorites.impl.presentation.category.e) obj2, yjeVar, (byte) 16);
                sxkVar11.j = obj;
                return sxkVar11;
            case 17:
                sxk sxkVar12 = new sxk((org.xplatform.favorites.impl.presentation.category.f) obj2, yjeVar, (byte) 17);
                sxkVar12.j = obj;
                return sxkVar12;
            case 18:
                sxk sxkVar13 = new sxk((khp) obj2, yjeVar, (byte) 18);
                sxkVar13.j = obj;
                return sxkVar13;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sxk sxkVar14 = new sxk((nnp) obj2, yjeVar, (byte) 19);
                sxkVar14.j = obj;
                return sxkVar14;
            case 20:
                sxk sxkVar15 = new sxk((pmi) obj2, yjeVar, (byte) 20);
                sxkVar15.j = obj;
                return sxkVar15;
            case 21:
                sxk sxkVar16 = new sxk((pup) obj2, yjeVar, (byte) 21);
                sxkVar16.j = obj;
                return sxkVar16;
            case 22:
                sxk sxkVar17 = new sxk((typ) obj2, yjeVar, (byte) 22);
                sxkVar17.j = obj;
                return sxkVar17;
            case 23:
                sxk sxkVar18 = new sxk((r8q) obj2, yjeVar, (byte) 23);
                sxkVar18.j = obj;
                return sxkVar18;
            case 24:
                return new sxk((ro30) this.j, (xoq) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new sxk((ro30) this.j, (ee60) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sxk sxkVar19 = new sxk((ivq) obj2, yjeVar, (byte) 26);
                sxkVar19.j = obj;
                return sxkVar19;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sxk sxkVar20 = new sxk((vjr) obj2, yjeVar, (byte) 27);
                sxkVar20.j = obj;
                return sxkVar20;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new sxk((vkr) this.j, (ukr) obj2, yjeVar, (byte) 28);
            default:
                return new sxk((dnr) this.j, (l7m0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((sxk) create((zy5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((sxk) create((ion) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((sxk) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((sxk) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((sxk) create((b0p) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((sxk) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((sxk) create((l1p) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((sxk) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((sxk) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((sxk) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((sxk) create((pep) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((sxk) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((sxk) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((sxk) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((sxk) create((m9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((sxk) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((sxk) create((xwp) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((sxk) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((sxk) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((sxk) create((dkr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x06d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
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
        Object value;
        String str;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        xmp xmpVar;
        Object value10;
        Object value11;
        Object value12;
        byte b = 24;
        byte b2 = 12;
        int i = 0;
        ?? r8 = 0;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = ((txk) this.j).f;
                PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel = (PersonalDocumentRedesignUiModel) this.k;
                int i2 = personalDocumentRedesignUiModel.f46783a;
                String str2 = personalDocumentRedesignUiModel.b;
                boolean z = personalDocumentRedesignUiModel.c;
                ol60Var.f(new lxk(new PersonalDocumentUiModel(i2, z ? R.attr.uikitPrimary : R.attr.uikitTextPrimary, str2, z)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((w6l) this.j).getBinding().e.setText((String) this.k);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                j8l j8lVar = (j8l) this.j;
                j8lVar.setText((String) this.k);
                j8lVar.setCompoundDrawablePadding(j8lVar.k);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                j8l j8lVar2 = (j8l) this.j;
                j8lVar2.setText("");
                j8lVar2.setCompoundDrawablePadding(0);
                ((Function0) this.k).invoke();
                return Unit.f46060a;
            case 4:
                gcl gclVar = (gcl) this.k;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                rcl rclVar = (rcl) this.j;
                if (rclVar != null) {
                    if (rclVar instanceof pcl) {
                        Context applicationContext = gclVar.f11068a.getApplicationContext();
                        applicationContext.getClass();
                        cpv0 cpv0VarD = cpv0.d(applicationContext);
                        cpv0VarD.getClass();
                        pcl pclVar = (pcl) rclVar;
                        String str3 = pclVar.b;
                        String str4 = pclVar.f26765a;
                        long j = pclVar.c;
                        str3.getClass();
                        str4.getClass();
                        obc.I(cpv0VarD, str3, "", str4, j);
                    } else if (rclVar instanceof qcl) {
                        Context applicationContext2 = gclVar.f11068a.getApplicationContext();
                        applicationContext2.getClass();
                        cpv0 cpv0VarD2 = cpv0.d(applicationContext2);
                        cpv0VarD2.getClass();
                        qcl qclVar = (qcl) rclVar;
                        obc.I(cpv0VarD2, qclVar.b, qclVar.d.f38422a, qclVar.f28488a, qclVar.c);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                kin kinVar = (kin) this.k;
                p7m0 p7m0Var = kinVar.x;
                lzt lztVar = kinVar.d;
                mne mneVar = kinVar.f;
                zy5 zy5Var = (zy5) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (zy5Var != null) {
                    if (zy5Var instanceof fy5) {
                        if (!kinVar.c.a() && lztVar.a()) {
                            kinVar.e.a(true);
                            sac.V(jiu0.a(kinVar), new k0l(1, kinVar, kin.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.b, new bin(kinVar, r8, (byte) 2), 10);
                        }
                    } else if (zy5Var instanceof yy5) {
                        if (lztVar.a()) {
                            sac.V(jiu0.a(kinVar), new k0l(1, kinVar, kin.class, "handleEasternNightsError", "handleEasternNightsError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new fr9(kinVar, r8, b), 10);
                        }
                    } else if (zy5Var instanceof ny5) {
                        kinVar.w();
                    } else if (zy5Var instanceof ky5) {
                        Boolean bool = Boolean.FALSE;
                        p7m0Var.getClass();
                        p7m0Var.o(null, bool);
                    } else if (zy5Var instanceof jy5) {
                        Boolean bool2 = Boolean.TRUE;
                        p7m0Var.getClass();
                        p7m0Var.o(null, bool2);
                    } else if ((zy5Var instanceof ty5) || (zy5Var instanceof ry5)) {
                        ((nin) ((ali) kinVar.q.f10231a).b).f23598a = null;
                        p7m0 p7m0Var2 = kinVar.w;
                        ajn ajnVar = ajn.f985a;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, ajnVar);
                    } else if (zy5Var instanceof uy5) {
                        sac.V(jiu0.a(kinVar), new k0l(1, kinVar, kin.class, "handleEasternNightsError", "handleEasternNightsError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, mneVar.b, new j0l(kinVar, r8, b2), 10);
                    }
                }
                return Unit.f46060a;
            case 6:
                ion ionVar = (ion) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                mpn mpnVar = (mpn) this.k;
                int i3 = mpn.K;
                if (ionVar.b.isEmpty()) {
                    mpnVar.M();
                    p7m0 p7m0Var3 = mpnVar.i.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        mpnVar.f.getClass();
                    } while (!p7m0Var3.m(value, ipn.a((ipn) value, kon.f18639a)));
                } else {
                    mpnVar.H(new mxm(ionVar, b));
                }
                bby bbyVar = mpnVar.J;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 7:
                d4o d4oVar = (d4o) this.k;
                ocj ocjVar = d4oVar.i;
                Object obj2 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                boolean z2 = obj2 instanceof g0g0;
                if (z2) {
                    str = ((y3o) d4oVar.D()).j;
                } else {
                    m3o m3oVar = (m3o) (z2 ? 0 : obj2);
                    if (m3oVar == null || (str = m3oVar.c) == null) {
                        str = ((y3o) d4oVar.D()).j;
                    }
                }
                String str5 = str;
                if (((y3o) d4oVar.D()).f41962a.getC()) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, y3o.a((y3o) value3, null, new j0g0(obj2), null, 0, false, false, null, str5, 0L, 0L, false, false, false, 64957)));
                } else {
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var5.getValue();
                        value2.getClass();
                    } while (!p7m0Var5.m(value2, y3o.a((y3o) value2, null, null, new j0g0(obj2), 0, false, false, null, str5, 0L, 0L, false, false, false, 64955)));
                }
                return Unit.f46060a;
            case 8:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                cwo cwoVar = (cwo) this.k;
                nc5 nc5VarS = cwoVar.w.s(cwoVar.o, cwoVar.p, uaq0Var, 0L);
                p7m0 p7m0Var6 = cwoVar.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                } while (!p7m0Var6.m(value4, mvo.a((mvo) value4, false, false, false, null, null, nc5VarS, 31)));
                return Unit.f46060a;
            case 9:
                nzo nzoVar = (nzo) this.k;
                b0p b0pVar = (b0p) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (b0pVar instanceof xzo) {
                    String str6 = ((xzo) b0pVar).f41762a;
                    pek pekVar = nzo.P1;
                    nzoVar.G0().g.c(str6);
                } else if (b0pVar instanceof zzo) {
                    String str7 = ((zzo) b0pVar).f45264a;
                    pek pekVar2 = nzo.P1;
                    nzoVar.G0().f.setVisibility(8);
                    ii iiVar = nzoVar.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = nzoVar.H(R.string.error);
                    String strH2 = nzoVar.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str7, (CharSequence) strH2, (String) null, (String) null, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = nzoVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (b0pVar instanceof a0p) {
                    ql5 ql5Var = ((a0p) b0pVar).f35a;
                    pek pekVar3 = nzo.P1;
                    BalanceView balanceView = nzoVar.G0().b;
                    double d = ql5Var.b;
                    String str8 = ql5Var.f;
                    str8.getClass();
                    balanceView.setVisibility(0);
                    qn5 qn5Var = balanceView.f47207a;
                    TextView textView = qn5Var.c;
                    pn40 pn40Var = pn40.f27267a;
                    textView.setText(pn40.c(d, p3u0.c));
                    qn5Var.d.setText(str8);
                } else if (Intrinsics.d(b0pVar, yzo.f43524a)) {
                    pek pekVar4 = nzo.P1;
                    nzoVar.H0();
                }
                return Unit.f46060a;
            case 10:
                ql5 ql5Var2 = (ql5) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                e0p e0pVar = (e0p) this.k;
                e0pVar.j = ql5Var2.f28916a;
                e0pVar.w(new a0p(ql5Var2));
                zn00 zn00Var = e0pVar.b;
                long j2 = e0pVar.j;
                kki kkiVar = (kki) zn00Var.f44650a;
                slb.U(new dnq(new a1g(ulb.L(new a1g(new vsg0(new ze1((Object) kkiVar, j2, (Object) ((v8d) zn00Var.b).b, (yje) null, (byte) 2)), (sek) kkiVar.c, (byte) 11), ((mne) kkiVar.d).b), e0pVar, b2), new rj((Object) e0pVar, (yje) r8, (byte) 21), (byte) 1), jiu0.a(e0pVar));
                return Unit.f46060a;
            case 11:
                l1p l1pVar = (l1p) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                s1p s1pVar = (s1p) this.k;
                synchronized (s1pVar.j) {
                    s1pVar.j.add(l1pVar);
                }
                bby bbyVar2 = ((s1p) this.k).l;
                if (bbyVar2 != null && bbyVar2.isActive()) {
                    return Unit.f46060a;
                }
                ((s1p) this.k).d();
                return Unit.f46060a;
            case 12:
                List list = (List) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                org.xplatform.favorites.impl.presentation.category.a aVar = (org.xplatform.favorites.impl.presentation.category.a) this.k;
                i3t0.A(aVar, aVar.q, new did(list), null, null, 6);
                p7m0 p7m0Var7 = aVar.i.f25029a;
                do {
                    value5 = p7m0Var7.getValue();
                    value5.getClass();
                } while (!p7m0Var7.m(value5, x4p.a((x4p) value5, null, null, list, list.isEmpty() ? f4p.c : f4p.f8926a, null, null, false, false, false, false, null, false, false, 16115)));
                return Unit.f46060a;
            case 13:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ccp ccpVar = (ccp) this.k;
                int i4 = ccp.u0;
                p7m0 p7m0Var8 = ccpVar.i.f25029a;
                do {
                    value6 = p7m0Var8.getValue();
                    value6.getClass();
                } while (!p7m0Var8.m(value6, dd80.a((dd80) value6, false, false, false, sw00Var.f32897a, false, false, null, null, false, 8175)));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ccp ccpVar2 = (ccp) this.j;
                mlr mlrVar = (mlr) this.k;
                long j3 = mlrVar.f22006a;
                int i5 = ccp.u0;
                hc80 hc80Var = ((dd80) ccpVar2.D()).h;
                Iterator it = (hc80Var instanceof ec80 ? ((ec80) hc80Var).d : iun.f15405a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (((mlr) it.next()).f22006a != j3) {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (i < 0) {
                    numValueOf = null;
                }
                Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
                ccpVar2.T.a((int) j3, 8201, numE, "favorite", null);
                ccpVar2.U.n(j3, numE);
                ccpVar2.I.d(new f5p(ccpVar2, mlrVar, (byte) 4));
                return Unit.f46060a;
            case 15:
                sw00 sw00Var2 = (sw00) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                bep bepVar = (bep) this.k;
                int i6 = bep.I;
                p7m0 p7m0Var9 = bepVar.i.f25029a;
                do {
                    value7 = p7m0Var9.getValue();
                    value7.getClass();
                } while (!p7m0Var9.m(value7, e2p.a((e2p) value7, false, false, sw00Var2.f32897a, false, false, false, null, null, null, false, 65503)));
                return Unit.f46060a;
            case 16:
                org.xplatform.favorites.impl.presentation.category.e eVar = (org.xplatform.favorites.impl.presentation.category.e) this.k;
                n0o0 n0o0Var = eVar.R1;
                pep pepVar = (pep) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(pepVar, lep.f19914a)) {
                    sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                    yzq yzqVarG0 = eVar.G0();
                    yzqVarG0.b.setVisibility(8);
                    yzqVarG0.e.setRefreshing(false);
                    yzqVarG0.d.setVisibility(0);
                    ((y3p) n0o0Var.getValue()).A(kotlin.collections.a.c(z4p.f43781a));
                    eVar.G0().c.d();
                } else if (pepVar instanceof mep) {
                    sek sekVar2 = org.xplatform.favorites.impl.presentation.category.e.V1;
                    mep mepVar = (mep) pepVar;
                    ((y3p) n0o0Var.getValue()).A(mepVar.f21658a);
                    yzq yzqVarG1 = eVar.G0();
                    yzqVarG1.b.setVisibility(8);
                    yzqVarG1.d.setVisibility(0);
                    yzqVarG1.e.setRefreshing(false);
                    boolean z3 = mepVar.b;
                    DsNavigationBar dsNavigationBar = eVar.G0().c;
                    if (z3) {
                        Iterator it2 = dsNavigationBar.c.d.e.iterator();
                        while (it2.hasNext()) {
                            ((e1i) it2.next()).setVisibility(0);
                        }
                    } else {
                        dsNavigationBar.d();
                    }
                } else if (pepVar instanceof nep) {
                    jkm jkmVar = ((nep) pepVar).f23397a;
                    sek sekVar3 = org.xplatform.favorites.impl.presentation.category.e.V1;
                    yzq yzqVarG2 = eVar.G0();
                    yzqVarG2.d.setVisibility(8);
                    DSLottieEmptyContainer dSLottieEmptyContainer = yzqVarG2.b;
                    dSLottieEmptyContainer.a(jkmVar);
                    dSLottieEmptyContainer.setVisibility(0);
                    eVar.G0().e.setRefreshing(false);
                } else {
                    if (!(pepVar instanceof oep)) {
                        t9f.b();
                        return null;
                    }
                    jkm jkmVar2 = ((oep) pepVar).f25135a;
                    sek sekVar4 = org.xplatform.favorites.impl.presentation.category.e.V1;
                    yzq yzqVarG3 = eVar.G0();
                    yzqVarG3.d.setVisibility(8);
                    DSLottieEmptyContainer dSLottieEmptyContainer2 = yzqVarG3.b;
                    int i7 = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer2.b(jkmVar2, 10000L, new bmh(b2));
                    dSLottieEmptyContainer2.setVisibility(0);
                    eVar.G0().e.setRefreshing(false);
                }
                return Unit.f46060a;
            case 17:
                List list2 = (List) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var10 = ((org.xplatform.favorites.impl.presentation.category.f) this.k).x;
                mep mepVar2 = new mep(list2, false);
                p7m0Var10.getClass();
                p7m0Var10.o(null, mepVar2);
                return Unit.f46060a;
            case 18:
                List list3 = (List) this.j;
                wne wneVar19 = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj3 : list3) {
                    if (((xgp) obj3).f40850a.b.length() > 0) {
                        arrayListT.add(obj3);
                    }
                }
                khp khpVar = (khp) this.k;
                int i8 = khp.q;
                p7m0 p7m0Var11 = khpVar.i.f25029a;
                do {
                    value8 = p7m0Var11.getValue();
                    value8.getClass();
                } while (!p7m0Var11.m(value8, hhp.a((hhp) value8, null, arrayListT, 1)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str9 = (String) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                nnp nnpVar = (nnp) this.k;
                int i9 = nnp.a0;
                String str10 = ((xmp) nnpVar.D()).c;
                p7m0 p7m0Var12 = nnpVar.i.f25029a;
                do {
                    value9 = p7m0Var12.getValue();
                    value9.getClass();
                    xmpVar = (xmp) value9;
                    nnpVar.f.getClass();
                } while (!p7m0Var12.m(value9, xmp.a(xmpVar, null, null, str9, null, null, false, false, null, false, null, str10.length() > 0 && str9.length() == 0, 8187)));
                return Unit.f46060a;
            case 20:
                m9s m9sVar = (m9s) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (m9sVar != null) {
                    ((iw20) ((pmi) this.k).e).i(xww.Z(m9sVar));
                }
                return Unit.f46060a;
            case 21:
                uaq0 uaq0Var2 = (uaq0) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                pup pupVar = (pup) this.k;
                j9m0 j9m0VarC0 = ydx.c0(pupVar.v.s(pupVar.o, pupVar.p, uaq0Var2, 0L));
                p7m0 p7m0Var13 = pupVar.i.f25029a;
                do {
                    value10 = p7m0Var13.getValue();
                    value10.getClass();
                } while (!p7m0Var13.m(value10, hup.a((hup) value10, null, j9m0VarC0, null, 13)));
                return Unit.f46060a;
            case 22:
                xwp xwpVar = (xwp) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                typ typVar = (typ) this.k;
                int i10 = typ.E;
                p7m0 p7m0Var14 = typVar.i.f25029a;
                do {
                    value11 = p7m0Var14.getValue();
                    value11.getClass();
                } while (!p7m0Var14.m(value11, kxp.a((kxp) value11, false, xwpVar, 0L, null, 253)));
                return Unit.f46060a;
            case 23:
                ql5 ql5Var3 = (ql5) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var15 = ((r8q) this.k).S;
                Object value13 = p7m0Var15.getValue();
                value13.getClass();
                if (((q7q) value13).f28264a.f28916a == ql5Var3.f28916a) {
                    q7q q7qVar = new q7q(ql5Var3);
                    p7m0Var15.getClass();
                    p7m0Var15.o(null, q7qVar);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                ((ro30) this.j).f((xoq) this.k);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((ro30) this.j).j((ee60) this.k);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uaq0 uaq0Var3 = (uaq0) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ivq ivqVar = (ivq) this.k;
                nc5 nc5VarS2 = ivqVar.t.s(ivqVar.p, ivqVar.q, uaq0Var3, 0L);
                p7m0 p7m0Var16 = ivqVar.i.f25029a;
                do {
                    value12 = p7m0Var16.getValue();
                    value12.getClass();
                } while (!p7m0Var16.m(value12, suq.a((suq) value12, false, false, false, false, null, null, null, nc5VarS2, false, 383)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                vjr vjrVar = (vjr) this.k;
                dkr dkrVar = (dkr) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                if (dkrVar instanceof ckr) {
                    String str11 = ((ckr) dkrVar).f4521a;
                    xak xakVar = vjr.P1;
                    ii iiVar2 = vjrVar.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = vjrVar.H(R.string.attention);
                    String strH4 = vjrVar.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) str11, (CharSequence) strH4, (String) null, (String) null, "REQUEST_RESULT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC2 = vjrVar.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (dkrVar instanceof bkr) {
                    String str12 = ((bkr) dkrVar).f2763a;
                    xak xakVar2 = vjr.P1;
                    ii iiVar3 = vjrVar.L1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = vjrVar.H(R.string.attention);
                    String strH6 = vjrVar.H(R.string.ok_upper);
                    strH6.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH5, (CharSequence) str12, (CharSequence) strH6, (String) null, (String) null, "REQUEST_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC3 = vjrVar.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                } else {
                    if (!Intrinsics.d(dkrVar, akr.f1035a)) {
                        t9f.b();
                        return null;
                    }
                    xak xakVar3 = vjr.P1;
                    vjrVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    i1w0 i1w0VarF = a4n0.f(vjrVar);
                    i1w0VarF.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0VarF);
                    if (vjrVar.M1 == null) {
                        Intrinsics.h("screenFactory");
                        throw null;
                    }
                    k0w0Var.c(new LimitsIeScreens$LimitsIeFragmentScreen());
                    ListIterator listIteratorO = b1j.o(i1w0VarF, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarF.a((oe50) pawVar.next());
                        }
                    }
                }
                ((k3t0) vjrVar.N1.getValue()).x(njr.f23649a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                ((vkr) this.j).j.f((ukr) this.k);
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                dnr dnrVar = (dnr) this.j;
                ddk ddkVar = dnr.c2;
                k3t0 k3t0VarI0 = dnrVar.I0();
                List list4 = (List) ((l7m0) this.k).getValue();
                list4.getClass();
                k3t0VarI0.x(new tmr(list4));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxk(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
