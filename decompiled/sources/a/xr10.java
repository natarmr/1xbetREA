package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class xr10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr10(pz40 pz40Var, w2d w2dVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.k = pz40Var;
        this.j = w2dVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new xr10((ViewPager2) this.j, (pz40) obj2, yjeVar, (byte) 0);
            case 1:
                xr10 xr10Var = new xr10(obj2, yjeVar, (byte) 1);
                xr10Var.j = obj;
                return xr10Var;
            case 2:
                return new xr10((w220) this.j, (za50) obj2, yjeVar, (byte) 2);
            case 3:
                return new xr10((w220) this.j, (String) obj2, yjeVar, (byte) 3);
            case 4:
                xr10 xr10Var2 = new xr10(obj2, yjeVar, (byte) 4);
                xr10Var2.j = obj;
                return xr10Var2;
            case 5:
                xr10 xr10Var3 = new xr10(obj2, yjeVar, (byte) 5);
                xr10Var3.j = obj;
                return xr10Var3;
            case 6:
                xr10 xr10Var4 = new xr10(obj2, yjeVar, (byte) 6);
                xr10Var4.j = obj;
                return xr10Var4;
            case 7:
                return new xr10((qg20) this.j, (ql5) obj2, yjeVar, (byte) 7);
            case 8:
                return new xr10((mn20) this.j, (m97) obj2, yjeVar, (byte) 8);
            case 9:
                xr10 xr10Var5 = new xr10(obj2, yjeVar, (byte) 9);
                xr10Var5.j = obj;
                return xr10Var5;
            case 10:
                xr10 xr10Var6 = new xr10(obj2, yjeVar, (byte) 10);
                xr10Var6.j = obj;
                return xr10Var6;
            case 11:
                return new xr10((ln20) this.j, (jdc0) obj2, yjeVar, (byte) 11);
            case 12:
                xr10 xr10Var7 = new xr10(obj2, yjeVar, (byte) 12);
                xr10Var7.j = obj;
                return xr10Var7;
            case 13:
                xr10 xr10Var8 = new xr10(obj2, yjeVar, (byte) 13);
                xr10Var8.j = obj;
                return xr10Var8;
            case 14:
                xr10 xr10Var9 = new xr10(obj2, yjeVar, (byte) 14);
                xr10Var9.j = obj;
                return xr10Var9;
            case 15:
                xr10 xr10Var10 = new xr10(obj2, yjeVar, (byte) 15);
                xr10Var10.j = obj;
                return xr10Var10;
            case 16:
                return new xr10((c8n) this.j, (pz40) obj2, yjeVar, (byte) 16);
            case 17:
                return new xr10((d650) this.j, (Throwable) obj2, yjeVar, (byte) 17);
            case 18:
                return new xr10((d650) this.j, (lr5) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new xr10((d650) this.j, (mqv) obj2, yjeVar, (byte) 19);
            case 20:
                return new xr10((p850) this.j, (Throwable) obj2, yjeVar, (byte) 20);
            case 21:
                xr10 xr10Var11 = new xr10(obj2, yjeVar, (byte) 21);
                xr10Var11.j = obj;
                return xr10Var11;
            case 22:
                return new xr10((ArrayList) this.j, (SnapshotStateList) obj2, yjeVar, (byte) 22);
            case 23:
                return new xr10((po50) this.j, (w2d) obj2, yjeVar, (byte) 23);
            case 24:
                return new xr10((pz40) obj2, (w2d) this.j, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new xr10((l7m0) this.j, (w2d) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new xr10((uv50) this.j, (w2d) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new xr10((m2c0) this.j, (kw50) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                xr10 xr10Var12 = new xr10(obj2, yjeVar, (byte) 28);
                xr10Var12.j = obj;
                return xr10Var12;
            default:
                return new xr10((v360) this.j, (mlr) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xr10) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xr10) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xr10) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((xr10) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((xr10) create((sbq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((xr10) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((xr10) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((xr10) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((xr10) create((tk40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((xr10) create((fp40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((xr10) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((xr10) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xr10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02da  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0301  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v94, types: [a.m7h0, org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v26, types: [androidx.compose.runtime.snapshots.SnapshotStateList, java.lang.Object] */
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
        v020 v020Var;
        long j;
        l720 i720Var;
        l720 l720VarW;
        Object value2;
        StepInputUiModel stepInputUiModel;
        age ageVar;
        ha8 ha8Var;
        ha8 da8Var;
        Object value3;
        byte b = this.i;
        byte b2 = 2;
        boolean z = true;
        z = true;
        int i = 0;
        ?? r8 = 0;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ViewPager2 viewPager2 = (ViewPager2) this.j;
                wsz wszVar = yr10.R1;
                viewPager2.setCurrentItem(((ru9) ((pz40) obj2).getValue()).c);
                return Unit.f46060a;
            case 1:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f120 f120Var = (f120) obj2;
                nc5 nc5VarS = f120Var.d0.s(f120Var.o, f120Var.p, uaq0Var, ((v020) f120Var.D()).h.s);
                p7m0 p7m0Var = f120Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    v020Var = (v020) value;
                    j = v020Var.c;
                    uaq0.f35345a.getClass();
                } while (!p7m0Var.m(value, v020.a(v020Var, false, false, j, s9m0.l(uaq0Var), 0, null, null, null, nc5VarS, null, null, null, null, null, null, null, null, null, null, uaq0Var, 6290419)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                w220 w220Var = (w220) this.j;
                za50 za50Var = (za50) obj2;
                ((t47) w220Var.t.f19975a.e).c = za50Var.b;
                ((t47) w220Var.u.f13444a.e).d = za50Var.c;
                xex xexVar = w220Var.v;
                f8w f8wVar = f8w.f9129a;
                xexVar.J();
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                w220 w220Var2 = (w220) this.j;
                bu6 bu6Var = w220Var2.c1.g.c;
                ol60 ol60Var = w220Var2.x1;
                String str = (String) obj2;
                if (bu6Var != bu6.BOTTOM_SHEET_BLACK_TEXT && bu6Var != bu6.BOTTOM_SHEET_COLORED_TEXT) {
                    z = false;
                }
                ol60Var.f(new x8h0(str, z));
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                h620 h620Var = (h620) obj2;
                h620Var.e.b(th, new q520(h620Var, (byte) 2));
                return Unit.f46060a;
            case 5:
                jg7 jg7Var = (jg7) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                o720 o720Var = (o720) obj2;
                p7m0 p7m0Var2 = o720Var.c;
                if (Intrinsics.d(jg7Var, jg7.i)) {
                    l720VarW = new j720(o720Var.b.f(R.string.error_something_went_wrong, new Object[0]));
                } else {
                    if (!jg7Var.d) {
                        l720 l720Var = (l720) p7m0Var2.getValue();
                        if (l720Var != null) {
                            if (l720Var instanceof k720) {
                                i720Var = new i720(jg7Var);
                            } else if (l720Var instanceof g720) {
                                Object value4 = p7m0Var2.getValue();
                                value4.getClass();
                                jg7 jg7Var2 = ((g720) value4).b;
                                l720VarW = o720Var.w(jg7Var2.f16467a, jg7Var2.f, jg7Var);
                            } else if (l720Var instanceof h720) {
                                Object value5 = p7m0Var2.getValue();
                                value5.getClass();
                                jg7 jg7Var3 = ((h720) value5).b;
                                l720VarW = o720Var.w(jg7Var3.f16467a, jg7Var3.f, jg7Var);
                            } else if (l720Var instanceof i720) {
                                Object value6 = p7m0Var2.getValue();
                                value6.getClass();
                                jg7 jg7Var4 = ((i720) value6).f14270a;
                                l720VarW = o720Var.w(jg7Var4.f16467a, jg7Var4.f, jg7Var);
                            } else if ((l720Var instanceof j720) || (l720Var instanceof f720)) {
                                i720Var = new i720(jg7Var);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                    i720Var = new f720(jg7Var);
                    l720VarW = i720Var;
                }
                p7m0Var2.getClass();
                p7m0Var2.o(null, l720VarW);
                return Unit.f46060a;
            case 6:
                Throwable th2 = (Throwable) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                x920 x920Var = (x920) obj2;
                x920Var.c.b(th2, new i920(x920Var, true ? (byte) 1 : (byte) 0));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ((qg20) this.j).d1;
                ql5 ql5Var = (ql5) obj2;
                do {
                    value2 = p7m0Var3.getValue();
                    stepInputUiModel = (StepInputUiModel) value2;
                } while (!p7m0Var3.m(value2, stepInputUiModel.p ? StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 229375) : StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, ql5Var.f, false, false, null, false, false, false, false, false, false, false, 225216)));
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                mn20 mn20Var = (mn20) this.j;
                boolean zB = mn20Var.k.b(new pbs0(xcm0.v(mn20Var.b), (m97) obj2));
                p7m0 p7m0Var4 = mn20Var.S;
                Object obj3 = zB ? wi20.f39194a : vi20.f37457a;
                p7m0Var4.getClass();
                p7m0Var4.o(null, obj3);
                return Unit.f46060a;
            case 9:
                sbq sbqVar = (sbq) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                kn20 kn20Var = (kn20) obj2;
                double d = sbqVar.b;
                p7m0 p7m0Var5 = kn20Var.h;
                Object value7 = p7m0Var5.getValue();
                oi20 oi20Var = value7 instanceof oi20 ? (oi20) value7 : null;
                double dA = oi20Var != null ? oi20Var.b : ((ri20) p7m0Var5.getValue()).a();
                int id = kn20Var.f.f17841a.b().getId();
                if (d != dA && dA == 0.0d) {
                    p7m0Var5.o(null, new qi20(d, id));
                } else if (d != dA) {
                    if (d == 0.0d) {
                        p7m0Var5.o(null, new pi20(dA, id));
                    } else {
                        p7m0Var5.o(null, new oi20(dA, d, d > dA ? l0d.b : l0d.c, id));
                    }
                }
                double d2 = sbqVar.c;
                p7m0 p7m0Var6 = kn20Var.i;
                Double dValueOf = Double.valueOf(d2);
                p7m0Var6.getClass();
                p7m0Var6.o(null, dValueOf);
                return Unit.f46060a;
            case 10:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                mn20 mn20Var2 = (mn20) obj2;
                p7m0 p7m0Var7 = mn20Var2.W;
                Object obj4 = sw00Var.f32897a ? do4.f6399a : fo4.f9863a;
                p7m0Var7.getClass();
                p7m0Var7.o(null, obj4);
                if (sw00Var.f32897a) {
                    sac.T(new fnq(mn20Var2.q.b(), new il20(mn20Var2, r8, b2), (byte) 4), d5c.S(jiu0.a(mn20Var2), mn20Var2.i.f22085a), new sax(b2, r8, (byte) 21));
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ln20 ln20Var = (ln20) this.j;
                double d3 = ((sg20) ln20Var.D()).e.d.f5262a;
                jdc0 jdc0Var = (jdc0) obj2;
                ln20Var.H(new lm20(jdc0Var, ln20Var.M.c().f24244a, d3, jdc0Var.b * d3, (byte) 0));
                return Unit.f46060a;
            case 12:
                List list = (List) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                e730 e730Var = (e730) obj2;
                if (!Intrinsics.d(e730Var.p, list) || list.isEmpty()) {
                    ArrayList arrayListN0 = CollectionsKt.N0(list);
                    e730Var.p = arrayListN0;
                    boolean zIsEmpty = arrayListN0.isEmpty();
                    p7m0 p7m0Var8 = e730Var.s;
                    if (zIsEmpty) {
                        o630 o630Var = new o630(sa10.b(e730Var.i, pb10.e, R.string.nothing_found, 0, null, 28));
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, o630Var);
                    } else {
                        m630 m630Var = new m630(e730Var.p);
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, m630Var);
                    }
                }
                return Unit.f46060a;
            case 13:
                List list2 = (List) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                f730 f730Var = (f730) obj2;
                if (!Intrinsics.d(f730Var.n, list2) || list2.isEmpty()) {
                    ArrayList arrayListN1 = CollectionsKt.N0(list2);
                    f730Var.n = arrayListN1;
                    boolean zIsEmpty2 = arrayListN1.isEmpty();
                    p7m0 p7m0Var9 = f730Var.p;
                    if (zIsEmpty2) {
                        p630 p630Var = new p630(g2v.d(f730Var.i, pb10.e, null, null, R.string.nothing_found, 0, null, 478));
                        p7m0Var9.getClass();
                        p7m0Var9.o(null, p630Var);
                    } else {
                        n630 n630Var = new n630(f730Var.n);
                        p7m0Var9.getClass();
                        p7m0Var9.o(null, n630Var);
                    }
                }
                return Unit.f46060a;
            case 14:
                tk40 tk40Var = (tk40) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (tk40Var == null) {
                    t9f.b();
                    return null;
                }
                ik40 ik40Var = (ik40) obj2;
                String string = ik40Var.G().getString(tk40Var.f34077a);
                string.getClass();
                wdk0 wdk0Var = ik40Var.M1;
                if (wdk0Var != null) {
                    wdk0.k(wdk0Var, new xdk0(rek0.b, string, null, null, null, null, 124), ik40Var, null, null, false, null, 1020);
                    return Unit.f46060a;
                }
                Intrinsics.h("snackbarManager");
                throw null;
            case 15:
                yo40 yo40Var = (yo40) obj2;
                fp40 fp40Var = (fp40) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(fp40Var, dp40.f6444a)) {
                    atz atzVar = yo40.P1;
                    ii iiVar = yo40Var.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = yo40Var.H(R.string.timeout_dialog_message);
                    String strH2 = yo40Var.H(R.string.confirm);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) null, (CharSequence) strH, (CharSequence) strH2, yo40Var.H(R.string.cancel), (String) null, "REQUEST_CONFIRMATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1489);
                    androidx.fragment.app.e eVarC = yo40Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (fp40Var instanceof ep40) {
                    String str2 = ((ep40) fp40Var).f8169a;
                    atz atzVar2 = yo40.P1;
                    ii iiVar2 = yo40Var.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = yo40Var.H(R.string.attention);
                    String strH4 = yo40Var.H(R.string.ok_upper);
                    strH4.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) str2, (CharSequence) strH4, (String) null, (String) null, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC2 = yo40Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else {
                    if (!Intrinsics.d(fp40Var, cp40.f4727a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(yo40Var);
                    atz atzVar3 = yo40.P1;
                    yo40Var.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    yo40Var.G0().x(to40.f34265a);
                }
                yo40Var.G0().x(mo40.f22118a);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                c8n c8nVar = (c8n) this.j;
                if ((c8nVar != null ? c8nVar.b.b : 0L) > 0) {
                    ((pz40) obj2).setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                d650 d650Var = (d650) this.j;
                Throwable th3 = (Throwable) obj2;
                d650Var.Z.getClass();
                th3.getClass();
                th3.printStackTrace();
                String message = th3.getMessage();
                if (message != null && !StringsKt.W(message)) {
                    d650Var.h1.f(new v450(o050.U(th3, d650Var.M)));
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                d650 d650Var2 = (d650) this.j;
                b1j.r(530, d650Var2.x0.f7161a, 11992L);
                i8i.D("jackpot_id", "530", d650Var2.y0.f31532a, "jackpot_call");
                d650Var2.G.y((lr5) obj2, 0, d650Var2.Z(new Integer(1), hne.r(0L, "jackpot"), d650Var2.r0.f15225a.a() ? "my_aggregator" : "my_aggregator_anonim"), jiu0.a(d650Var2), new f340(1, (d650) this.j, d650.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                d650 d650Var3 = (d650) this.j;
                mqv mqvVar = (mqv) obj2;
                int i2 = d650.k1;
                s91 s91Var = d650Var3.H;
                s91 s91Var2 = d650Var3.H;
                u58 u58Var = d650Var3.J;
                ix0 ix0Var = d650Var3.b0;
                if (mqvVar.equals(hqv.f13502a)) {
                    d650Var3.k0.c(String.valueOf(nw80.w.getId()), "my_aggregator");
                    int id2 = (int) nw80.u.getId();
                    y1p y1pVar = y1p.MAIN;
                    ix0Var.d(id2);
                    s91.d(s91Var2, new jr1(), false, false, 12);
                } else if (mqvVar.equals(jqv.f16974a)) {
                    i8i.D("screen", "my_aggregator", u58Var.f35083a, "tournaments_open");
                    d650Var3.K.f11237a.a(cui0.b(new j1p("my_aggregator", (byte) 0)), 3329L);
                    s91Var.c(new AggregatorScreenModel(null, null, 0L, new sm1(-1L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                } else if (mqvVar.equals(kqv.f18738a)) {
                    s91Var.c(new AggregatorScreenModel(null, null, 0L, new sm1(-1L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                } else if (mqvVar instanceof fqv) {
                    x4t x4tVar = ((fqv) mqvVar).f9994a;
                    long jB = d650.B(x4tVar);
                    h97.x("category_id", Long.valueOf(jB), u58Var.f35083a, "my_aggregator_block_all_call");
                    b1j.r((int) jB, ix0Var.f15516a, 3054L);
                    ctf0 ctf0Var = d650Var3.M;
                    if (x4tVar instanceof p4t) {
                        s91.d(s91Var2, new gr1(mdp.f21607a), false, false, 12);
                    } else if (x4tVar instanceof s4t) {
                        s91.d(s91Var2, new gr1(mdp.b), false, false, 12);
                    } else if (x4tVar instanceof v4t) {
                        s91Var2.c(new AggregatorScreenModel(null, null, 0L, new lm1(nw80.t.getId()), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                    } else if (x4tVar instanceof i4t) {
                        String strA = ctf0Var.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0));
                        long id3 = nw80.f24223a.getId();
                        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                        s91Var2.c(new AggregatorScreenModel(strA, strA2, id3, new hm1(2, kotlin.collections.a.c(17L), null), null, 0L, 0L, null, false, 496));
                    } else if (x4tVar instanceof l4t) {
                        String strA3 = ctf0Var.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0));
                        String strA4 = ctf0Var.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0));
                        long id4 = nw80.b.getId();
                        s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
                        s91Var2.c(new AggregatorScreenModel(strA3, strA4, id4, new hm1(2, kotlin.collections.a.c(17L), null), null, 0L, 0L, null, false, 496));
                    } else if (x4tVar instanceof o4t) {
                        s91Var2.c(new AggregatorScreenModel(ctf0Var.b.a(R.string.crash_aggregator_title, Arrays.copyOf(new Object[0], 0)), null, nw80.k.getId(), new im1(false, true), null, 0L, 0L, "", false, WarningHeader.INSUFFICIENT_BANDWIDTH));
                    } else if (x4tVar instanceof r4t) {
                        r4t r4tVar = (r4t) x4tVar;
                        s91Var2.c(new AggregatorScreenModel(r4tVar.b, null, r4tVar.f29854a, new im1(false, true), null, 0L, 0L, "", false, WarningHeader.INSUFFICIENT_BANDWIDTH));
                    }
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                p850 p850Var = (p850) this.j;
                Throwable th4 = (Throwable) obj2;
                p850Var.h0.getClass();
                th4.printStackTrace();
                p850Var.G(new l650(o050.U(th4, p850Var.e0)));
                return Unit.f46060a;
            case 21:
                List list3 = (List) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                p850 p850Var2 = (p850) obj2;
                bo0 bo0Var = new bo0(list3, (byte) 28);
                int i3 = p850.p0;
                p850Var2.H(bo0Var);
                List list4 = ((p650) p850Var2.D()).h;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list4) {
                    if (obj5 instanceof age) {
                        arrayList.add(obj5);
                    }
                }
                for (Object obj6 : arrayList) {
                    Integer num = ((xi0) ((age) obj6).f819a.a()).c;
                    if (num != null && num.intValue() == 825) {
                        r8 = obj6;
                        ageVar = (age) r8;
                        if (ageVar != null) {
                            ha8Var = ageVar.f819a;
                            if (list3.isEmpty()) {
                                da8Var = new y98(ha8Var.a());
                            } else if (ha8Var instanceof da8) {
                                da8 da8Var2 = (da8) ha8Var;
                                da8Var = da8.b(da8Var2, CollectionsKt.D0(list3, ((xi0) da8Var2.f5734a).d));
                            } else {
                                da8Var = new da8(ha8Var.a(), CollectionsKt.D0(list3, ((xi0) ha8Var.a()).d), false);
                            }
                            p850Var2.H(new l750(ageVar.getKey(), da8Var, (byte) 11));
                        }
                        return Unit.f46060a;
                    }
                }
                ageVar = (age) r8;
                if (ageVar != null) {
                    ha8Var = ageVar.f819a;
                    if (list3.isEmpty()) {
                        da8Var = new y98(ha8Var.a());
                    } else if (ha8Var instanceof da8) {
                        da8 da8Var3 = (da8) ha8Var;
                        da8Var = da8.b(da8Var3, CollectionsKt.D0(list3, ((xi0) da8Var3.f5734a).d));
                    } else {
                        da8Var = new da8(ha8Var.a(), CollectionsKt.D0(list3, ((xi0) ha8Var.a()).d), false);
                    }
                    p850Var2.H(new l750(ageVar.getKey(), da8Var, (byte) 11));
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList2 = (ArrayList) this.j;
                ?? r9 = (SnapshotStateList) obj2;
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    pf80 pf80Var = (pf80) arrayList2.get(i4);
                    r9.getClass();
                    j4 j4Var = p8a.V(r9).c;
                    ArrayList arrayList3 = new ArrayList(j4Var.size());
                    int size2 = j4Var.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        arrayList3.add(((pf80) j4Var.get(i5)).getKey());
                    }
                    if (!arrayList3.contains(pf80Var.getKey())) {
                        r9.add(pf80Var);
                    }
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                po50 po50Var = (po50) this.j;
                htz htzVar = po50.S1;
                po50Var.G0().x(((w2d) obj2).f38442a.a() == 0.0f ? jo50.f16842a : io50.f15104a);
                return Unit.f46060a;
            case 24:
                w2d w2dVar = (w2d) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                cp50 cp50Var = (cp50) ((pz40) obj2).getValue();
                if (cp50Var instanceof zo50) {
                    w2dVar.d = true;
                } else {
                    if (!(cp50Var instanceof ap50) && !Intrinsics.d(cp50Var, bp50.f2965a)) {
                        t9f.b();
                        return null;
                    }
                    w2dVar.d = false;
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                w2d w2dVar2 = (w2d) obj2;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                kr50 kr50Var = (kr50) ((l7m0) this.j).getValue();
                if (kr50Var != null) {
                    if (kr50Var instanceof jr50) {
                        w2dVar2.d = true;
                    } else if (kr50Var instanceof ir50) {
                        w2dVar2.d = false;
                    } else if (kr50Var instanceof hr50) {
                        w2dVar2.d = true;
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                uv50 uv50Var = (uv50) this.j;
                xuz xuzVar = uv50.U1;
                uv50Var.G0().x(((w2d) obj2).f38442a.a() == 1.0f ? bv50.f3265a : cv50.f5016a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kw50 kw50Var = (kw50) obj2;
                i1w0 i1w0Var = kw50Var.C;
                rek0 rek0Var = kw50Var.u;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                m2c0 m2c0Var = (m2c0) this.j;
                if (a8k0.B(m2c0Var) || !m2c0Var.n0) {
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    rek0Var.getClass();
                    k0w0VarI.h(new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(true));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    int i6 = kw50.N;
                    if (kw50Var.v.f15225a.a()) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ?? B = rek0.b(rek0Var, mq4.b);
                        if (B instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) B)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(B)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                        rek0Var.getClass();
                        k0w0VarI2.h(new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(true));
                        ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO3;
                            if (pawVar3.hasNext()) {
                                i1w0Var.a((oe50) pawVar3.next());
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                uaq0 uaq0Var2 = (uaq0) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                gx50 gx50Var = (gx50) obj2;
                nc5 nc5VarS2 = gx50Var.w.s(gx50Var.o, gx50Var.p, uaq0Var2, 0L);
                p7m0 p7m0Var10 = gx50Var.i.f25029a;
                do {
                    value3 = p7m0Var10.getValue();
                    value3.getClass();
                } while (!p7m0Var10.m(value3, pw50.a((pw50) value3, false, false, false, 0, null, null, nc5VarS2, 63)));
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                v360 v360Var = (v360) this.j;
                mlr mlrVar = (mlr) obj2;
                long j2 = mlrVar.f22006a;
                int i7 = v360.x0;
                tz50 tz50Var = ((c260) v360Var.D()).j;
                Iterator it = (tz50Var instanceof rz50 ? m7x.A(((rz50) tz50Var).f) : iun.f15405a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (((mlr) it.next()).f22006a != j2) {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (i < 0) {
                    numValueOf = null;
                }
                Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
                ix0.c(v360Var.e0, (int) j2, numE);
                v360Var.f0.n(j2, numE);
                v360Var.S.d(new rw40(v360Var, mlrVar, (byte) 19));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr10(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr10(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }
}
