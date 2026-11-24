package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class h6q extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i6q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6q(i6q i6qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i6qVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        i6q i6qVar = this.k;
        switch (b) {
            case 0:
                h6q h6qVar = new h6q(i6qVar, yjeVar, (byte) 0);
                h6qVar.j = obj;
                return h6qVar;
            case 1:
                h6q h6qVar2 = new h6q(i6qVar, yjeVar, (byte) 1);
                h6qVar2.j = obj;
                return h6qVar2;
            case 2:
                h6q h6qVar3 = new h6q(i6qVar, yjeVar, (byte) 2);
                h6qVar3.j = obj;
                return h6qVar3;
            case 3:
                h6q h6qVar4 = new h6q(i6qVar, yjeVar, (byte) 3);
                h6qVar4.j = obj;
                return h6qVar4;
            default:
                h6q h6qVar5 = new h6q(i6qVar, yjeVar, (byte) 4);
                h6qVar5.j = obj;
                return h6qVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h6q) create((o7q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((h6q) create((s7q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((h6q) create((e8q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((h6q) create((j8q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h6q) create((r7q) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        Object obj2;
        String str;
        boolean z;
        i6q i6qVar;
        Iterator it;
        long j;
        iuw iuwVar;
        List list;
        byte b = this.i;
        String str2 = "";
        i6q i6qVar2 = this.k;
        switch (b) {
            case 0:
                o7q o7qVar = (o7q) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(o7qVar, n7q.f23053a)) {
                    iiy[] iiyVarArr = i6q.V1;
                    i6qVar2.J0(false);
                } else if (Intrinsics.d(o7qVar, m7q.f21332a)) {
                    iiy[] iiyVarArr2 = i6q.V1;
                    i6qVar2.I0(true);
                } else {
                    if (!(o7qVar instanceof l7q)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr3 = i6q.V1;
                    i6qVar2.I0(false);
                    l7q l7qVar = (l7q) o7qVar;
                    boolean z2 = l7qVar.b;
                    boolean z3 = l7qVar.f19571a;
                    i6qVar2.G0().l.setBackgroundResource(z3 ? R.drawable.ic_quick_bet_active : R.drawable.ic_quick_bet);
                    int i = z3 ? R.attr.uikitPrimary : R.attr.uikitSecondary;
                    View view = i6qVar2.G0().l;
                    TypedValue typedValue = j5d.f15927a;
                    view.setBackgroundTintList(j5d.d(i6qVar2.o0(), i, i));
                    Iterator it2 = l7qVar.c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (((FinInstrumentUIModel) next).e) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FinInstrumentUIModel finInstrumentUIModel = (FinInstrumentUIModel) obj2;
                    if (finInstrumentUIModel != null && (str = finInstrumentUIModel.b) != null) {
                        str2 = str;
                    }
                    if (!i6qVar2.G0().t.getText().equals(str2)) {
                        i6qVar2.G0().t.setText(str2);
                    }
                    i6qVar2.G0().l.setEnabled(z2);
                    i6qVar2.G0().k.setEnabled(z2);
                    if (!z2) {
                        View view2 = i6qVar2.G0().l;
                        TypedValue typedValue2 = j5d.f15927a;
                        view2.setBackgroundTintList(j5d.d(i6qVar2.o0(), R.attr.uikitSecondary60, R.attr.uikitSecondary60));
                    }
                }
                return Unit.f46060a;
            case 1:
                s7q s7qVar = (s7q) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr4 = i6q.V1;
                i6qVar2.G0().e.setLastClickedCoefficient(s7qVar.f31762a);
                return Unit.f46060a;
            case 2:
                e8q e8qVar = (e8q) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = e8qVar instanceof v7q;
                i6q i6qVar3 = this.k;
                if (z4) {
                    v7q v7qVar = (v7q) e8qVar;
                    String str3 = v7qVar.e;
                    ql5 ql5Var = v7qVar.b;
                    i6qVar3.K0(v7qVar.c, ql5Var.f28916a, str3, ql5Var.f, v7qVar.d, v7qVar.g, v7qVar.f, v7qVar.h);
                } else if (Intrinsics.d(e8qVar, a8q.f439a)) {
                    iiy[] iiyVarArr5 = i6q.V1;
                    wdk0 wdk0Var = i6qVar3.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH = i6qVar3.H(R.string.one_click_bet_disabled_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), i6qVar3, null, null, false, null, 1020);
                } else if (Intrinsics.d(e8qVar, b8q.f2168a)) {
                    iiy[] iiyVarArr6 = i6q.V1;
                    if (i6qVar3.N1 == null) {
                        Intrinsics.h("quickBetDialogProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = i6qVar3.C();
                    eVarC.getClass();
                    xi70.h(eVarC);
                } else if (e8qVar instanceof w7q) {
                    w7q w7qVar = (w7q) e8qVar;
                    List list2 = w7qVar.f38687a;
                    boolean z5 = w7qVar.b;
                    iiy[] iiyVarArr7 = i6q.V1;
                    if (i6qVar3.G0().d.getVisibility() != 0 || z5) {
                        sqt sqtVar = pjx.h2;
                        androidx.fragment.app.e eVarC2 = i6qVar3.C();
                        eVarC2.getClass();
                        sqtVar.getClass();
                        list2.getClass();
                        pjx pjxVar = new pjx();
                        iiy[] iiyVarArr8 = pjx.i2;
                        pjxVar.f2.D(pjxVar, iiyVarArr8[1], list2);
                        pjxVar.e2.x(pjxVar, iiyVarArr8[0], "CHOOSE_INSTRUMENTS_DIALOG_KEY");
                        pjxVar.H0(eVarC2, "InstrumentsDialog");
                    }
                } else if (e8qVar instanceof x7q) {
                    x7q x7qVar = (x7q) e8qVar;
                    iiy[] iiyVarArr9 = i6q.V1;
                    d720 d720Var = i6qVar3.R1;
                    if (d720Var == null) {
                        Intrinsics.h("makeBetBottomSheetProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = i6qVar3.C();
                    eVarC3.getClass();
                    d720Var.a(eVarC3, x7qVar.f40424a);
                } else if (e8qVar instanceof y7q) {
                    String str4 = ((y7q) e8qVar).f42165a;
                    iiy[] iiyVarArr10 = i6q.V1;
                    ii iiVar = i6qVar3.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = i6qVar3.H(R.string.error);
                    String strH3 = i6qVar3.H(R.string.yes);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str4, (CharSequence) strH3, i6qVar3.H(R.string.no), (String) null, "BET_ALREADY_DONE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC4 = i6qVar3.C();
                    eVarC4.getClass();
                    iiVar.d(dialogFields, eVarC4);
                } else if (e8qVar instanceof z7q) {
                    String str5 = ((z7q) e8qVar).f43930a;
                    iiy[] iiyVarArr11 = i6q.V1;
                    ii iiVar2 = i6qVar3.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = i6qVar3.H(R.string.error);
                    String strH5 = i6qVar3.H(R.string.replenish);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str5, (CharSequence) strH5, i6qVar3.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC5 = i6qVar3.C();
                    eVarC5.getClass();
                    iiVar2.d(dialogFields2, eVarC5);
                } else if (e8qVar instanceof c8q) {
                    String str6 = ((c8q) e8qVar).f3926a;
                    iiy[] iiyVarArr12 = i6q.V1;
                    wdk0 wdk0Var2 = i6qVar3.P1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, str6, null, null, null, null, 124), i6qVar3, null, null, false, null, 1020);
                } else if (e8qVar instanceof d8q) {
                    gnm0.s(i6qVar3.C());
                } else if (e8qVar instanceof u7q) {
                    gnm0.i(i6qVar3.C());
                } else {
                    if (!(e8qVar instanceof t7q)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr13 = i6q.V1;
                    ii iiVar3 = i6qVar3.O1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH6 = i6qVar3.H(R.string.attention);
                    String strH7 = i6qVar3.H(R.string.unacceptable_account_for_section);
                    String strH8 = i6qVar3.H(R.string.ok);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC6 = i6qVar3.C();
                    eVarC6.getClass();
                    iiVar3.d(dialogFields3, eVarC6);
                }
                return Unit.f46060a;
            case 3:
                j8q j8qVar = (j8q) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr14 = i6q.V1;
                boolean z6 = j8qVar instanceof f8q;
                i6qVar2.G0().d.setVisibility(z6 ? 0 : 8);
                i6qVar2.G0().f.setVisibility(j8qVar instanceof h8q ? 0 : 8);
                boolean z7 = j8qVar instanceof i8q;
                i6qVar2.G0().c.setVisibility((z7 || (j8qVar instanceof g8q)) ? 0 : 8);
                if (!Intrinsics.d(j8qVar, h8q.f12640a) && !Intrinsics.d(j8qVar, g8q.f10878a)) {
                    if (z6) {
                        i6qVar2.G0().i.v(((f8q) j8qVar).f9120a);
                    } else {
                        if (!z7) {
                            t9f.b();
                            return null;
                        }
                        i8q i8qVar = (i8q) j8qVar;
                        zwb zwbVar = i8qVar.f14352a;
                        if (zwbVar != null) {
                            List list3 = zwbVar.i;
                            ib8 ib8Var = i8qVar.b;
                            if (ib8Var != null) {
                                List list4 = ib8Var.f14474a;
                                int i2 = ib8Var.h;
                                if (list4.isEmpty()) {
                                    j6q j6qVarG0 = i6qVar2.G0();
                                    j6qVarG0.v.setText("00:00:00");
                                    j6qVarG0.s.setText("0");
                                    j6qVarG0.q.setText("0");
                                } else {
                                    float f = ib8Var.c;
                                    if (Float.isInfinite(f)) {
                                        i6qVar2.G0().r.setText("");
                                        i6qVar2.G0().g.setVisibility(8);
                                    } else if (f < 0.0f) {
                                        i6qVar2.G0().r.setTextColor(i6qVar2.o0().getColor(R.color.static_red));
                                        i6qVar2.G0().r.setText(String.format(Locale.ENGLISH, "%2.4f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)).concat(Separators.PERCENT));
                                        i6qVar2.G0().g.setVisibility(0);
                                        i6qVar2.M0(true);
                                    } else {
                                        i6qVar2.G0().r.setTextColor(i6qVar2.o0().getColor(R.color.static_green));
                                        i6qVar2.G0().r.setText(kng0.l("+", String.format(Locale.ENGLISH, "%2.4f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), Separators.PERCENT));
                                        i6qVar2.G0().g.setVisibility(0);
                                        i6qVar2.M0(false);
                                    }
                                    TextView textView = i6qVar2.G0().s;
                                    pn40 pn40Var = pn40.f27267a;
                                    textView.setText(pn40.j(wvb.N(ib8Var.f), i2, true));
                                    i6qVar2.G0().q.setText(pn40.j(wvb.N(ib8Var.g), i2, true));
                                    TextView textView2 = i6qVar2.G0().v;
                                    rdj rdjVar = rdj.f30294a;
                                    long j2 = ib8Var.b;
                                    ykq0 ykq0Var = ykq0.UNIQUE_1;
                                    TimeZone timeZone = TimeZone.getTimeZone("UTC");
                                    timeZone.getClass();
                                    Locale.US.getClass();
                                    textView2.setText(rdj.h(new ynq0(j2), ykq0Var, Boolean.TRUE, timeZone, 56));
                                    i6qVar2.G0().u.setText(i6qVar2.H(ib8Var.i ? R.string.trade_open_new : R.string.trade_closing));
                                    FinBetView finBetView = i6qVar2.G0().e;
                                    List list5 = zwbVar.f45097a;
                                    boolean z8 = zwbVar.f;
                                    FinBetChartView finBetChartView = finBetView.z;
                                    xju0 xju0Var = finBetChartView.r;
                                    ArrayList arrayList = finBetChartView.A;
                                    xju0 xju0Var2 = finBetChartView.r;
                                    finBetChartView.V1 = zwbVar;
                                    a2w0 axisLeft = finBetChartView.getAxisLeft();
                                    List list6 = list5;
                                    double d = zwbVar.c;
                                    boolean z9 = zwbVar.h;
                                    float f2 = (float) d;
                                    axisLeft.r = true;
                                    axisLeft.s = f2;
                                    axisLeft.u = Math.abs(f2 - axisLeft.t);
                                    a2w0 axisLeft2 = finBetChartView.getAxisLeft();
                                    float f3 = (float) zwbVar.d;
                                    axisLeft2.q = true;
                                    axisLeft2.t = f3;
                                    axisLeft2.u = Math.abs(axisLeft2.s - f3);
                                    if (z8) {
                                        u500 u500Var = (u500) finBetChartView.getData();
                                        ArrayList arrayList2 = u500Var.i;
                                        if (arrayList2 != null) {
                                            arrayList2.clear();
                                        }
                                        u500Var.a();
                                        a2w0 axisLeft3 = finBetChartView.getAxisLeft();
                                        int size = list6.size() / 2;
                                        axisLeft3.getClass();
                                        if (size > 25) {
                                            size = 25;
                                        }
                                        if (size < 2) {
                                            size = 2;
                                        }
                                        axisLeft3.l = size;
                                        axisLeft3.m = true;
                                        urv0 xAxis = finBetChartView.getXAxis();
                                        float f4 = zwbVar.b;
                                        xAxis.r = true;
                                        xAxis.s = f4;
                                        xAxis.u = Math.abs(f4 - xAxis.t);
                                        finBetChartView.h(z9);
                                    }
                                    u500 u500Var2 = (u500) finBetChartView.getData();
                                    if (u500Var2 == null) {
                                        i6qVar = i6qVar2;
                                        z = z8;
                                    } else {
                                        List list7 = zwbVar.e;
                                        Long l = (Long) CollectionsKt.W(1, list3);
                                        long jLongValue = l != null ? l.longValue() : 0L;
                                        Long l2 = (Long) CollectionsKt.W(2, list3);
                                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                                        ArrayList arrayList3 = u500Var2.i;
                                        if (arrayList3.size() > 0 && (iuwVar = (iuw) arrayList3.get(0)) != null && arrayList3.remove(iuwVar)) {
                                            u500Var2.a();
                                        }
                                        v500 v500Var = new v500();
                                        v500Var.f36806a = null;
                                        v500Var.b = null;
                                        v500Var.c = "DataSet";
                                        v500Var.d = 1;
                                        v500Var.e = true;
                                        v500Var.g = 3;
                                        v500Var.h = Float.NaN;
                                        v500Var.i = Float.NaN;
                                        v500Var.j = true;
                                        v500Var.k = true;
                                        v500Var.l = new cp10();
                                        v500Var.m = 17.0f;
                                        v500Var.n = true;
                                        v500Var.f36806a = new ArrayList();
                                        ArrayList arrayList4 = new ArrayList();
                                        v500Var.b = arrayList4;
                                        z = z8;
                                        i6qVar = i6qVar2;
                                        v500Var.f36806a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
                                        arrayList4.add(-16777216);
                                        v500Var.c = "";
                                        v500Var.p = -3.4028235E38f;
                                        v500Var.q = Float.MAX_VALUE;
                                        v500Var.r = -3.4028235E38f;
                                        v500Var.s = Float.MAX_VALUE;
                                        v500Var.o = null;
                                        ArrayList<Entry> arrayList5 = new ArrayList();
                                        v500Var.o = arrayList5;
                                        if (!arrayList5.isEmpty()) {
                                            v500Var.p = -3.4028235E38f;
                                            v500Var.q = Float.MAX_VALUE;
                                            v500Var.r = -3.4028235E38f;
                                            v500Var.s = Float.MAX_VALUE;
                                            for (Entry entry : arrayList5) {
                                                if (entry != null) {
                                                    float f5 = entry.c;
                                                    if (f5 < v500Var.s) {
                                                        v500Var.s = f5;
                                                    }
                                                    if (f5 > v500Var.r) {
                                                        v500Var.r = f5;
                                                    }
                                                    float f6 = entry.f45454a;
                                                    if (f6 < v500Var.q) {
                                                        v500Var.q = f6;
                                                    }
                                                    if (f6 > v500Var.p) {
                                                        v500Var.p = f6;
                                                    }
                                                }
                                            }
                                        }
                                        v500Var.t = Color.rgb(255, 187, 115);
                                        v500Var.u = true;
                                        v500Var.v = true;
                                        v500Var.w = 0.5f;
                                        v500Var.w = dut0.c(0.5f);
                                        v500Var.x = Color.rgb(140, 234, 255);
                                        v500Var.y = (byte) 85;
                                        v500Var.z = 2.5f;
                                        v500Var.A = false;
                                        v500Var.B = 1;
                                        v500Var.C = null;
                                        v500Var.D = -1;
                                        v500Var.E = 8.0f;
                                        v500Var.F = 4.0f;
                                        v500Var.G = 0.2f;
                                        v500Var.H = new usd();
                                        v500Var.I = true;
                                        v500Var.J = true;
                                        ArrayList arrayList6 = new ArrayList();
                                        v500Var.C = arrayList6;
                                        arrayList6.clear();
                                        arrayList6.add(Integer.valueOf(Color.rgb(140, 234, 255)));
                                        v500Var.d = 1;
                                        v500Var.I = false;
                                        TypedValue typedValue3 = j5d.f15927a;
                                        Context context = finBetChartView.getContext();
                                        context.getClass();
                                        int iA = j5d.a(context, R.attr.uikitPrimary, false);
                                        ArrayList arrayList7 = v500Var.f36806a;
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                            v500Var.f36806a = arrayList7;
                                        }
                                        arrayList7.clear();
                                        v500Var.f36806a.add(Integer.valueOf(iA));
                                        v500Var.z = dut0.c(2.0f);
                                        v500Var.y = (byte) 51;
                                        Context context2 = finBetChartView.getContext();
                                        context2.getClass();
                                        v500Var.x = j5d.a(context2, R.attr.uikitPrimary, false);
                                        v500Var.m = dut0.c(9.0f);
                                        v500Var.j = false;
                                        v500Var.A = true;
                                        u500Var2.b(v500Var);
                                        arrayList3.add(v500Var);
                                        ybq ybqVar = (ybq) list7.get(0);
                                        RectF rectF = xju0Var.b;
                                        long j3 = ybqVar.b;
                                        float f7 = jLongValue2 - j3;
                                        float fWidth = rectF.width() / f7;
                                        urv0 xAxis2 = finBetChartView.getXAxis();
                                        float f8 = f7 * fWidth;
                                        xAxis2.r = true;
                                        xAxis2.s = f8;
                                        xAxis2.u = Math.abs(f8 - xAxis2.t);
                                        urv0 xAxis3 = finBetChartView.getXAxis();
                                        xAxis3.q = true;
                                        xAxis3.t = 0.0f;
                                        xAxis3.u = Math.abs(xAxis3.s - 0.0f);
                                        Iterator it3 = list7.iterator();
                                        while (it3.hasNext()) {
                                            ybq ybqVar2 = (ybq) it3.next();
                                            float f9 = (ybqVar2.b - j3) * fWidth;
                                            float f10 = ybqVar2.f42350a;
                                            Entry entry2 = new Entry();
                                            entry2.b = null;
                                            entry2.f45454a = f10;
                                            entry2.c = f9;
                                            if (arrayList3.size() > 0) {
                                                iuw iuwVar2 = (iuw) arrayList3.get(0);
                                                v500 v500Var2 = (v500) iuwVar2;
                                                it = it3;
                                                ArrayList arrayList8 = v500Var2.o;
                                                if (arrayList8 == null) {
                                                    arrayList8 = new ArrayList();
                                                }
                                                j = j3;
                                                if (f9 < v500Var2.s) {
                                                    v500Var2.s = f9;
                                                }
                                                if (f9 > v500Var2.r) {
                                                    v500Var2.r = f9;
                                                }
                                                float f11 = entry2.f45454a;
                                                if (f11 < v500Var2.q) {
                                                    v500Var2.q = f11;
                                                }
                                                if (f11 > v500Var2.p) {
                                                    v500Var2.p = f11;
                                                }
                                                if (arrayList8.add(entry2)) {
                                                    int i3 = ((v500) iuwVar2).d;
                                                    float f12 = u500Var2.f22495a;
                                                    float f13 = entry2.f45454a;
                                                    if (f12 < f13) {
                                                        u500Var2.f22495a = f13;
                                                    }
                                                    if (u500Var2.b > f13) {
                                                        u500Var2.b = f13;
                                                    }
                                                    if (u500Var2.c < f9) {
                                                        u500Var2.c = f9;
                                                    }
                                                    if (u500Var2.d > f9) {
                                                        u500Var2.d = f9;
                                                    }
                                                    if (i3 == 1) {
                                                        if (u500Var2.e < f13) {
                                                            u500Var2.e = f13;
                                                        }
                                                        if (u500Var2.f > f13) {
                                                            u500Var2.f = f13;
                                                        }
                                                    } else {
                                                        if (u500Var2.g < f13) {
                                                            u500Var2.g = f13;
                                                        }
                                                        if (u500Var2.h > f13) {
                                                            u500Var2.h = f13;
                                                        }
                                                    }
                                                }
                                            } else {
                                                it = it3;
                                                j = j3;
                                                Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
                                            }
                                            it3 = it;
                                            j3 = j;
                                        }
                                        long j4 = j3;
                                        float f14 = (jLongValue - j4) * fWidth;
                                        if (f14 < finBetChartView.S1.right) {
                                            finBetChartView.N1 = f14;
                                        }
                                        zwb zwbVar2 = finBetChartView.V1;
                                        finBetChartView.W1 = ((jLongValue2 - ((long) (zwbVar2 != null ? zwbVar2.g : 0))) - j4) * fWidth;
                                        finBetChartView.h(z9);
                                        u500Var2.a();
                                        finBetChartView.d();
                                        float fD = u500Var2.d();
                                        ywq0 ywq0Var = finBetChartView.z1;
                                        z960 z960Var = wu40.h;
                                        wu40 wu40Var = (wu40) z960Var.b();
                                        wu40Var.c = xju0Var;
                                        wu40Var.d = fD;
                                        wu40Var.e = 0.0f;
                                        wu40Var.f = ywq0Var;
                                        wu40Var.g = finBetChartView;
                                        if (xju0Var2.d <= 0.0f || xju0Var2.c <= 0.0f) {
                                            arrayList.add(wu40Var);
                                        } else {
                                            finBetChartView.post(wu40Var);
                                        }
                                        Entry entryB = ((v500) u500Var2.c(0)).b(u500Var2.d() - 1);
                                        float f15 = entryB.c;
                                        float f16 = ((finBetChartView.v1.u / xju0Var.h) / 2.0f) + entryB.f45454a;
                                        ywq0 ywq0Var2 = finBetChartView.z1;
                                        wu40 wu40Var2 = (wu40) z960Var.b();
                                        wu40Var2.c = xju0Var;
                                        wu40Var2.d = f15;
                                        wu40Var2.e = f16;
                                        wu40Var2.f = ywq0Var2;
                                        wu40Var2.g = finBetChartView;
                                        if (xju0Var2.d <= 0.0f || xju0Var2.c <= 0.0f) {
                                            arrayList.add(wu40Var2);
                                        } else {
                                            finBetChartView.post(wu40Var2);
                                        }
                                    }
                                    FinBetView finBetView2 = i6qVar.G0().e;
                                    list6.getClass();
                                    finBetView2.l1 = i2;
                                    CarriageContainer carriageContainer = finBetView2.A;
                                    carriageContainer.getClass();
                                    if (z) {
                                        carriageContainer.removeAllViews();
                                    }
                                    int iJ = g8x.J(0, list6.size() - 1, 2);
                                    if (iJ >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            int i5 = i4 / 2;
                                            if (carriageContainer.getChildCount() - 1 < i5) {
                                                Context context3 = carriageContainer.getContext();
                                                context3.getClass();
                                                qva qvaVar = new qva(context3, carriageContainer.c);
                                                qvaVar.setTag(Integer.valueOf(i5));
                                                qvaVar.setOnClickListener(new nva(carriageContainer, i5, (byte) 0));
                                                carriageContainer.addView(qvaVar);
                                                if (((Number) carriageContainer.e.f46059a).intValue() != -1) {
                                                    carriageContainer.f46649a = ((Number) carriageContainer.e.f46059a).intValue();
                                                }
                                                if (carriageContainer.f46649a == i5) {
                                                    qvaVar.b();
                                                    if (((Number) carriageContainer.e.f46059a).intValue() != -1) {
                                                        qvaVar.a((qic) carriageContainer.e.b);
                                                        carriageContainer.e = new Pair(-1, qic.c);
                                                    }
                                                }
                                                list = list6;
                                                qvaVar.c((sbq) list.get(i4), (sbq) list.get(i4 + 1));
                                            } else {
                                                list = list6;
                                                View childAt = carriageContainer.getChildAt(i5);
                                                childAt.getClass();
                                                ((qva) childAt).c((sbq) list.get(i4), (sbq) list.get(i4 + 1));
                                            }
                                            if (i4 != iJ) {
                                                i4 += 2;
                                                list6 = list;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.f46060a;
            default:
                r7q r7qVar = (r7q) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr15 = i6q.V1;
                boolean z10 = r7qVar instanceof q7q;
                i6qVar2.G0().b.setVisibility(z10 ? 0 : 8);
                if (!Intrinsics.d(r7qVar, p7q.f26519a)) {
                    if (!z10) {
                        t9f.b();
                        return null;
                    }
                    ql5 ql5Var2 = ((q7q) r7qVar).f28264a;
                    TextView textView3 = i6qVar2.G0().p;
                    pn40 pn40Var2 = pn40.f27267a;
                    textView3.setText(pn40.d(ql5Var2.b, ql5Var2.f, p3u0.c));
                    i6qVar2.G0().o.setText(ql5Var2.m);
                }
                return Unit.f46060a;
        }
    }
}
