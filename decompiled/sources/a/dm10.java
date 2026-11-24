package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;
import org.xplatform.lucky_wheel.presentation.views.WheelView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dm10 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dm10(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0508  */
    /* JADX WARN: Code duplicated, block: B:188:0x0515  */
    /* JADX WARN: Code duplicated, block: B:190:0x051b  */
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Fragment fragmentI;
        Function0 zv10Var;
        String str;
        zb5 zb5Var;
        Fragment fragmentJ;
        Object next;
        byte b = this.h;
        String str2 = "COUPON_TAG";
        byte b2 = 11;
        String name = "";
        byte b3 = 3;
        byte b4 = 2;
        Object obj3 = null;
        Object obj4 = this.f41192a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr = fm10.S1;
                ((fm10) obj4).G0().e.setVisibility(zBooleanValue ? 0 : 4);
                return Unit.f46060a;
            case 1:
                fm10 fm10Var = (fm10) obj4;
                iiy[] iiyVarArr2 = fm10.S1;
                fm10Var.getClass();
                if (!Intrinsics.d((rn10) obj, rn10.f30766a)) {
                    t9f.b();
                    return null;
                }
                if (fm10Var.O1 == null) {
                    Intrinsics.h("wildFreeBetScreenFactory");
                    throw null;
                }
                ffv0 ffv0Var = new ffv0();
                androidx.fragment.app.e eVarC = fm10Var.C();
                eVarC.getClass();
                sj3.D0(ffv0Var, eVarC);
                return Unit.f46060a;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr3 = fm10.S1;
                ((fm10) obj4).G0().t.setNewYearMode(zBooleanValue2);
                return Unit.f46060a;
            case 3:
                mav0 mav0Var = (mav0) obj;
                fm10 fm10Var2 = (fm10) obj4;
                iiy[] iiyVarArr4 = fm10.S1;
                fm10Var2.G0().t.setVisibility(mav0Var.f21478a ? 0 : 8);
                fm10Var2.G0().t.setWheelItems(mav0Var.b);
                esr esrVar = mav0Var.c;
                if (esrVar != null) {
                    LuckyWheelView luckyWheelView = fm10Var2.G0().t;
                    if (luckyWheelView.r == null) {
                        ValueAnimator valueAnimatorA = ((WheelView) luckyWheelView.q.f).a(2, esrVar);
                        luckyWheelView.u(valueAnimatorA, luckyWheelView.v, luckyWheelView.s);
                        luckyWheelView.r = valueAnimatorA;
                        valueAnimatorA.start();
                    }
                }
                esr esrVar2 = mav0Var.d;
                if (esrVar2 != null) {
                    LuckyWheelView luckyWheelView2 = fm10Var2.G0().t;
                    uk5 uk5Var = luckyWheelView2.q;
                    if (luckyWheelView2.r == null) {
                        WheelView wheelView = (WheelView) uk5Var.f;
                        View view = uk5Var.d;
                        ValueAnimator valueAnimatorA2 = wheelView.a(7, esrVar2);
                        luckyWheelView2.u(valueAnimatorA2, luckyWheelView2.w, luckyWheelView2.t);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{0.0f, 1.0f}, 2));
                        valueAnimatorOfFloat.addUpdateListener(new ro10(view, (byte) 0));
                        valueAnimatorOfFloat.setDuration(500L);
                        valueAnimatorOfFloat.addListener(new po10(luckyWheelView2, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{1.0f, 0.0f}, 2));
                        valueAnimatorOfFloat2.addUpdateListener(new ro10(view, (byte) 0));
                        valueAnimatorOfFloat2.setDuration(500L);
                        valueAnimatorOfFloat2.setStartDelay(1000L);
                        valueAnimatorOfFloat2.addListener(new po10(luckyWheelView2, (byte) 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorA2, valueAnimatorOfFloat2);
                        animatorSet.start();
                        luckyWheelView2.r = animatorSet;
                    }
                }
                if (mav0Var.e) {
                    ((WheelView) fm10Var2.G0().t.q.f).setShowActiveSector(true);
                } else {
                    ((WheelView) fm10Var2.G0().t.q.f).setShowActiveSector(false);
                }
                return Unit.f46060a;
            case 4:
                gzk0 gzk0Var = (gzk0) obj;
                fm10 fm10Var3 = (fm10) obj4;
                iiy[] iiyVarArr5 = fm10.S1;
                Button button = fm10Var3.G0().g;
                c8h0 c8h0Var = gzk0Var.f12183a;
                String str3 = gzk0Var.b;
                c8h0 c8h0Var2 = c8h0.f3914a;
                button.setVisibility(c8h0Var == c8h0Var2 ? 0 : 8);
                Button button2 = fm10Var3.G0().f;
                c8h0 c8h0Var3 = c8h0.b;
                button2.setVisibility(c8h0Var != c8h0Var3 ? 4 : 0);
                if (c8h0Var == c8h0Var2) {
                    fm10Var3.G0().g.setText(str3);
                }
                if (c8h0Var == c8h0Var3) {
                    fm10Var3.G0().f.setText(str3);
                }
                return Unit.f46060a;
            case 5:
                rxk0 rxk0Var = (rxk0) obj;
                fm10 fm10Var4 = (fm10) obj4;
                iiy[] iiyVarArr6 = fm10.S1;
                fm10Var4.G0().h.setVisibility(rxk0Var.f31269a ? 0 : 8);
                fm10Var4.G0().h.setText(rxk0Var.b);
                return Unit.f46060a;
            case 6:
                snq0 snq0Var = (snq0) obj;
                fm10 fm10Var5 = (fm10) obj4;
                iiy[] iiyVarArr7 = fm10.S1;
                LinearLayout linearLayout = fm10Var5.G0().n;
                c8h0 c8h0Var4 = snq0Var.f32507a;
                xmq0 xmq0Var = snq0Var.b;
                linearLayout.setVisibility(c8h0Var4 != c8h0.f3914a ? 4 : 0);
                fm10Var5.G0().o.setVisibility(c8h0Var4 != c8h0.b ? 4 : 0);
                int iOrdinal = c8h0Var4.ordinal();
                if (iOrdinal == 0) {
                    fm10Var5.G0().r.b(xmq0Var);
                } else if (iOrdinal == 1) {
                    fm10Var5.G0().q.b(xmq0Var);
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 7:
                fqs fqsVar = (fqs) obj;
                fm10 fm10Var6 = (fm10) obj4;
                iiy[] iiyVarArr8 = fm10.S1;
                fm10Var6.getClass();
                boolean z = fqsVar.f9989a;
                boolean z2 = fqsVar.f;
                if (z) {
                    r3e r3eVar = new r3e();
                    int id = z2 ? fm10Var6.G0().d.getId() : fm10Var6.G0().e.getId();
                    r3eVar.e(fm10Var6.G0().j);
                    int id2 = fm10Var6.G0().f.getId();
                    Integer numValueOf = Integer.valueOf(id2);
                    HashMap map = r3eVar.g;
                    if (!map.containsKey(numValueOf)) {
                        map.put(Integer.valueOf(id2), new m3e());
                    }
                    m3e m3eVar = (m3e) map.get(Integer.valueOf(id2));
                    if (m3eVar != null) {
                        n3e n3eVar = m3eVar.e;
                        n3eVar.o = id;
                        n3eVar.p = -1;
                        n3eVar.q = -1;
                        n3eVar.r = -1;
                        n3eVar.s = -1;
                    }
                    r3eVar.b(fm10Var6.G0().j);
                    fm10Var6.G0().s.setText(fqsVar.c);
                    fm10Var6.G0().s.setTextColor(fm10Var6.o0().getColor(fqsVar.d));
                    fm10Var6.G0().l.setImageResource(fqsVar.b);
                    fm10Var6.G0().p.setText(fqsVar.e);
                    fm10Var6.G0().d.setVisibility(z2 ? 0 : 8);
                }
                fm10Var6.G0().j.setVisibility(fqsVar.f9989a ? 0 : 4);
                return Unit.f46060a;
            case 8:
                fyb0 fyb0Var = (fyb0) obj;
                fm10 fm10Var7 = (fm10) obj4;
                iiy[] iiyVarArr9 = fm10.S1;
                fm10Var7.getClass();
                if (fyb0Var.f10352a) {
                    dyb0 dyb0Var = (dyb0) fm10Var7.R1.getValue();
                    List list = fyb0Var.b;
                    dyb0Var.getClass();
                    list.getClass();
                    ArrayList arrayList = dyb0Var.e;
                    arrayList.clear();
                    arrayList.addAll(list);
                    dyb0Var.g();
                }
                fm10Var7.G0().i.setVisibility(fyb0Var.f10352a ? 0 : 4);
                return Unit.f46060a;
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr10 = fm10.S1;
                ((fm10) obj4).G0().b.setVisibility(zBooleanValue3 ? 0 : 8);
                return Unit.f46060a;
            case 10:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr11 = fm10.S1;
                ((fm10) obj4).G0().d.setVisibility(zBooleanValue4 ? 0 : 4);
                return Unit.f46060a;
            case 11:
                mao0 mao0Var = (mao0) obj;
                hv10 hv10Var = (hv10) obj4;
                atz atzVar = hv10.X1;
                hv10Var.getClass();
                lao0 lao0Var = mao0Var.b;
                if (!Intrinsics.d(hv10Var.V1, lao0Var)) {
                    hv10Var.V1 = lao0Var;
                    hv10Var.H0().b.setTabBarDSModel(lao0Var);
                    hv10Var.H0().b.setOnTabClickListener(new km00(hv10Var, b2));
                }
                hv10Var.H0().b.setVisibility(mao0Var.f21469a ? 0 : 8);
                return Unit.f46060a;
            case 12:
                h120 h120Var = (h120) obj;
                hv10 hv10Var2 = (hv10) obj4;
                atz atzVar2 = hv10.X1;
                hv10Var2.getClass();
                w950 w950Var = h120Var.f12261a;
                DsTabBar dsTabBar = hv10Var2.H0().b;
                cb50 cb50Var = w950Var.f38762a;
                if (cb50Var instanceof bb50) {
                    str2 = "POPULAR_TAG";
                } else if (cb50Var instanceof ya50) {
                    str2 = "FAVORITES_TAG";
                } else if (!(cb50Var instanceof xa50)) {
                    if (cb50Var instanceof za50) {
                        str2 = "HISTORY_TAG";
                    } else {
                        if (!(cb50Var instanceof ab50)) {
                            t9f.b();
                            return null;
                        }
                        str2 = "MENU_TAG";
                    }
                }
                dsTabBar.setSelectedTab(str2);
                androidx.fragment.app.e eVarC2 = hv10Var2.C();
                eVarC2.getClass();
                w950 w950Var2 = h120Var.f12261a;
                String str4 = w950Var2.f38762a.f4046a;
                List listP = eVarC2.c.p();
                ArrayList<Fragment> arrayListU = twn.u(listP);
                for (Object obj5 : listP) {
                    Fragment fragment = (Fragment) obj5;
                    if (!fragment.O() && !Intrinsics.d(fragment.B, str4)) {
                        arrayListU.add(obj5);
                    }
                }
                Fragment fragmentJ2 = eVarC2.J(str4);
                if (!arrayListU.isEmpty() || fragmentJ2 == null || !fragmentJ2.S()) {
                    zb5 zb5Var2 = new zb5(eVarC2);
                    zb5Var2.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
                    if (fragmentJ2 == null) {
                        m6m0 m6m0Var = sao0.V1;
                        cb50 cb50Var2 = h120Var.b;
                        m6m0Var.getClass();
                        cb50Var2.getClass();
                        sao0 sao0Var = new sao0();
                        iiy[] iiyVarArr12 = sao0.W1;
                        sao0Var.O1.x(sao0Var, iiyVarArr12[0], str4);
                        sao0Var.Q1.u(sao0Var, iiyVarArr12[2], cb50Var2);
                        sao0Var.P1.v(sao0Var, iiyVarArr12[1], false);
                        zb5Var2.k(R.id.fragmentContainer, sao0Var, str4, 1);
                    } else if (!fragmentJ2.S() || fragmentJ2.O()) {
                        zb5Var2.q(fragmentJ2, lkz.e);
                        zb5Var2.r(fragmentJ2);
                        if ((fragmentJ2 instanceof sao0) && (fragmentI = ((sao0) fragmentJ2).C().I(R.id.container)) != null && (fragmentI instanceof ygt0) && !w950Var2.b) {
                            ((ygt0) fragmentI).e();
                        }
                    }
                    for (Fragment fragment2 : arrayListU) {
                        zb5Var2.q(fragment2, lkz.c);
                        zb5Var2.m(fragment2);
                    }
                    zb5Var2.g(true, true);
                }
                return Unit.f46060a;
            case 13:
                atz atzVar3 = hv10.X1;
                DsTabBar dsTabBar2 = ((hv10) obj4).H0().b;
                int i = (int) ((lm7) obj).f20283a;
                dsTabBar2.g.put("COUPON_TAG", Integer.valueOf(i));
                kao0 kao0Var = dsTabBar2.m;
                if (kao0Var != null) {
                    kao0Var.b(i, "COUPON_TAG");
                }
                return Unit.f46060a;
            case 14:
                rw10 rw10Var = (rw10) obj;
                dw10 dw10Var = (dw10) obj4;
                uuz uuzVar = dw10.V1;
                FrameLayout frameLayout = dw10Var.G0().f.b;
                boolean z3 = rw10Var.e;
                String str5 = rw10Var.f31199a;
                boolean z4 = rw10Var.d;
                boolean z5 = rw10Var.c;
                boolean z6 = rw10Var.f;
                qw10 qw10Var = rw10Var.j;
                frameLayout.setVisibility(z3 ? 0 : 8);
                dw10Var.G0().b.setVisibility(z6 ? 0 : 8);
                if (z6) {
                    dw10Var.G0().b.setAccountTitle(rw10Var.k);
                    dw10Var.G0().b.x(rw10Var.l, rw10Var.m);
                }
                dw10Var.G0().c.setVisibility(z5 ? 0 : 8);
                dw10Var.G0().g.setVisibility(z5 ? 0 : 8);
                dw10Var.G0().d.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    e1i e1iVarB = dw10Var.G0().d.b(CrashHianalyticsData.MESSAGE);
                    if (e1iVarB != null) {
                        e1iVarB.setVisibility(rw10Var.g ? 0 : 8);
                    }
                    if (e1iVarB != null) {
                        e1iVarB.setCount(rw10Var.h);
                    }
                    y2c0 y2c0Var = dw10Var.Q1;
                    if (y2c0Var == null) {
                        y2c0Var = new y2c0(dw10Var.o0());
                    }
                    n2c0 n2c0Var = dw10Var.R1;
                    if (n2c0Var == null) {
                        n2c0Var = new n2c0(dw10Var.o0());
                    }
                    DsNavigationBar dsNavigationBar = dw10Var.G0().d;
                    if (qw10Var instanceof ow10) {
                        Context context = y2c0Var.getContext();
                        y2c0Var.setProfileIcon(context != null ? context.getDrawable(((ow10) qw10Var).f25950a) : null);
                    } else {
                        if (!(qw10Var instanceof pw10)) {
                            t9f.b();
                            return null;
                        }
                        pw10 pw10Var = (pw10) qw10Var;
                        String str6 = pw10Var.f27689a;
                        Context context2 = y2c0Var.getContext();
                        Drawable drawable = context2 != null ? context2.getDrawable(pw10Var.b) : null;
                        l2c0 l2c0Var = y2c0Var.c;
                        gbe0 gbe0VarA = o5k0.a(l2c0Var.getContext());
                        k1x k1xVar = new k1x(l2c0Var.getContext());
                        k1xVar.c = str6;
                        t1x.h(k1xVar, l2c0Var);
                        t1x.d(k1xVar, drawable);
                        t1x.g(k1xVar, drawable);
                        gbe0VarA.a(k1xVar.a());
                    }
                    dw10Var.Q1 = y2c0Var;
                    dsNavigationBar.b.setCustomView(y2c0Var);
                    DsNavigationBar dsNavigationBar2 = dw10Var.G0().d;
                    n2c0Var.setTitle(str5);
                    n2c0Var.setSubTitle(rw10Var.b);
                    dw10Var.R1 = n2c0Var;
                    dsNavigationBar2.d.setCustomView(n2c0Var);
                    e1i e1iVarB2 = dw10Var.G0().d.b("settings");
                    if (e1iVarB2 != null) {
                        e1iVarB2.k.d(rw10Var.i, e1iVarB2.g, e1iVarB2.f);
                    }
                } else {
                    dw10Var.G0().g.setTitle(str5);
                }
                return Unit.f46060a;
            case 15:
                nw10 nw10Var = (nw10) obj;
                dw10 dw10Var2 = (dw10) obj4;
                uuz uuzVar2 = dw10.V1;
                if (nw10Var instanceof iw10) {
                    iw10 iw10Var = (iw10) nw10Var;
                    ynb ynbVarI = ((yzn0) dw10Var2.H0().D.b).i();
                    x1x.x(ynbVarI);
                    String strH = dw10Var2.H(R.string.attention);
                    strH.getClass();
                    String str7 = iw10Var.f15468a;
                    androidx.fragment.app.e eVarC3 = dw10Var2.C();
                    eVarC3.getClass();
                    String strH2 = dw10Var2.H(R.string.ok_new);
                    strH2.getClass();
                    String strH3 = dw10Var2.H(R.string.cancel);
                    strH3.getClass();
                    ynbVarI.a(strH, str7, eVarC3, strH2, strH3, iw10Var.b);
                } else if (nw10Var instanceof gw10) {
                    dw10Var2.C().t0(i120.V(new Pair("UPDATED_BALANCE_KEY", Boolean.TRUE)), "UPDATED_BALANCE_KEY");
                } else if (nw10Var instanceof jw10) {
                    ynb ynbVarI2 = ((yzn0) dw10Var2.H0().D.b).i();
                    x1x.x(ynbVarI2);
                    bm5 bm5Var = bm5.g;
                    androidx.fragment.app.e eVarC4 = dw10Var2.C();
                    eVarC4.getClass();
                    ynb.b(ynbVarI2, bm5Var, null, eVarC4, false, "SELECT_BALANCE_REQUEST_KEY", 430);
                } else if (nw10Var instanceof hw10) {
                    dw10Var2.G0().e.setVisibility(((hw10) nw10Var).f13750a ? 0 : 8);
                } else if (nw10Var instanceof kw10) {
                    wdk0.k(dw10Var2.H0().C, new xdk0(rek0.b, ((kw10) nw10Var).f18980a, null, null, null, null, 124), dw10Var2, null, null, false, null, 1020);
                } else if (nw10Var instanceof mw10) {
                    nr00 nr00Var = dw10Var2.H0().F;
                    androidx.fragment.app.e eVarC5 = dw10Var2.C();
                    eVarC5.getClass();
                    jvp0 jvp0Var = jvp0.f17215a;
                    s9m0.m(eVarC5);
                } else {
                    dw10Var2.getClass();
                    if (!Intrinsics.d(nw10Var, lw10.f20740a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar = dw10Var2.H0().E;
                    String strH4 = dw10Var2.H(R.string.alert_call_pass_identification_title);
                    String strH5 = dw10Var2.H(R.string.alert_call_pass_identification_message);
                    String strH6 = dw10Var2.H(R.string.pass_identification);
                    strH6.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, dw10Var2.H(R.string.later), (String) null, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 464);
                    androidx.fragment.app.e eVarC6 = dw10Var2.C();
                    eVarC6.getClass();
                    iiVar.d(dialogFields, eVarC6);
                }
                return Unit.f46060a;
            case 16:
                dw10 dw10Var3 = (dw10) obj4;
                uuz uuzVar3 = dw10.V1;
                dw10Var3.G0().f.c.setText(dw10Var3.I(R.string.session_timer_title_v2, (String) obj));
                return Unit.f46060a;
            case 17:
                dw10 dw10Var4 = (dw10) obj4;
                uuz uuzVar4 = dw10.V1;
                dw10Var4.getClass();
                byte b5 = 10;
                switch ((ay10) obj) {
                    case TABS_LINE_ITEMS:
                        name = jho0.class.getName();
                        zv10Var = new zv10(dw10Var4, b4);
                        break;
                    case TABS_CARD_ITEMS:
                        name = ufo0.class.getName();
                        zv10Var = new zv10(dw10Var4, b3);
                        break;
                    case ACCORDEON_LINE_ITEMS_BACKGROUND:
                        name = t9.class.getName();
                        zv10Var = new sv10(b5);
                        break;
                    case ACCORDEON_LINE_ITEMS_OFFSET:
                        name = y8.class.getName();
                        zv10Var = new sv10((byte) 13);
                        break;
                    case ACCORDEON_CARDS:
                        name = f9.class.getName();
                        zv10Var = new sv10(b2);
                        break;
                    case ACCORDEON_COMPACT_CARDS:
                        name = l8.class.getName();
                        zv10Var = new sv10((byte) 12);
                        break;
                    case PLAIN_CATEGORIZED_CARDS:
                        name = xsq0.class.getName();
                        zv10Var = new sv10((byte) 14);
                        break;
                    case PLAIN_LIST_ITEMS:
                        name = ce00.class.getSimpleName();
                        zv10Var = new sv10((byte) 15);
                        break;
                    default:
                        zv10Var = new sv10((byte) 16);
                        break;
                }
                androidx.fragment.app.e eVarC7 = dw10Var4.C();
                eVarC7.getClass();
                IntRange intRangeO = l1e0.o(0, eVarC7.P());
                ArrayList arrayList2 = new ArrayList(r3d.q(intRangeO, 10));
                Iterator it = intRangeO.iterator();
                while (((kkx) it).c) {
                    arrayList2.add(eVarC7.O(((bkx) it).nextInt()).i);
                }
                for (Object obj6 : arrayList2) {
                    if (Intrinsics.d((String) obj6, name)) {
                        obj3 = obj6;
                        str = (String) obj3;
                        zb5Var = new zb5(eVarC7);
                        zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
                        if (str == null) {
                            zb5Var.o(R.id.menuFragmentContainer, (Fragment) zv10Var.invoke(), name);
                            zb5Var.c(name);
                        } else {
                            fragmentJ = eVarC7.J(name);
                            if (fragmentJ != null) {
                                zb5Var.o(R.id.menuFragmentContainer, fragmentJ, name);
                            }
                        }
                        zb5Var.g(true, true);
                        return Unit.f46060a;
                    }
                }
                str = (String) obj3;
                zb5Var = new zb5(eVarC7);
                zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
                if (str == null) {
                    zb5Var.o(R.id.menuFragmentContainer, (Fragment) zv10Var.invoke(), name);
                    zb5Var.c(name);
                } else {
                    fragmentJ = eVarC7.J(name);
                    if (fragmentJ != null) {
                        zb5Var.o(R.id.menuFragmentContainer, fragmentJ, name);
                    }
                }
                zb5Var.g(true, true);
                return Unit.f46060a;
            case 18:
                ((cx10) obj4).y((Throwable) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((cx10) obj4).y((Throwable) obj);
                return Unit.f46060a;
            case 20:
                ((cx10) obj4).y((Throwable) obj);
                return Unit.f46060a;
            case 21:
                ((cx10) obj4).y((Throwable) obj);
                return Unit.f46060a;
            case 22:
                ((cx10) obj4).y((Throwable) obj);
                return Unit.f46060a;
            case 23:
                g020 g020Var = (g020) obj;
                c020 c020Var = (c020) obj4;
                wsz wszVar = c020.U1;
                c020Var.getClass();
                if (Intrinsics.d(g020Var, f020.f8699a)) {
                    c020Var.G0(null);
                } else {
                    if (!(g020Var instanceof e020)) {
                        t9f.b();
                        return null;
                    }
                    c020Var.G0(Integer.valueOf(((e020) g020Var).f6970a));
                }
                return Unit.f46060a;
            case 24:
                zz10 zz10Var = (zz10) obj;
                c020 c020Var2 = (c020) obj4;
                wsz wszVar2 = c020.U1;
                c020Var2.getClass();
                uz10 uz10Var = uz10.f36515a;
                if (!Intrinsics.d(zz10Var, uz10Var)) {
                    if (Intrinsics.d(zz10Var, xz10.f41733a)) {
                        if (c020Var2.O1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC8 = c020Var2.C();
                        eVarC8.getClass();
                        uuz uuzVar5 = fk60.b;
                        noq0.m2.getClass();
                        if (eVarC8.J("TipsDialogTag") == null) {
                            noq0 noq0Var = new noq0();
                            iiy[] iiyVarArr13 = noq0.n2;
                            noq0Var.h2.I(noq0Var, iiyVarArr13[3], 1);
                            noq0Var.i2.x(noq0Var, iiyVarArr13[4], "");
                            sj3.E0(noq0Var, eVarC8, "TipsDialogTag");
                        }
                    } else if (Intrinsics.d(zz10Var, yz10.f43495a)) {
                        wdk0 wdk0Var = c020Var2.P1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH7 = c020Var2.H(R.string.old_os_tip_title);
                        strH7.getClass();
                        String strH8 = c020Var2.H(R.string.old_os_tip_description);
                        strH8.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH7, strH8, null, null, null, 120), c020Var2, null, null, false, null, 1020);
                    } else if (zz10Var instanceof vz10) {
                        String str8 = ((vz10) zz10Var).f38277a;
                        ii iiVar2 = c020Var2.Q1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH9 = c020Var2.H(R.string.detailed_app_info_title);
                        Spanned spannedFromHtml = Html.fromHtml(str8, 0);
                        spannedFromHtml.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml);
                        String strH10 = c020Var2.H(R.string.copy_info);
                        strH10.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH9, (CharSequence) spannableString, (CharSequence) strH10, c020Var2.H(R.string.cancel), (String) null, "REQUEST_APP_INFO_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC9 = c020Var2.C();
                        eVarC9.getClass();
                        iiVar2.d(dialogFields2, eVarC9);
                    } else if (zz10Var instanceof tz10) {
                        String str9 = ((tz10) zz10Var).f34784a;
                        wdk0 wdk0Var2 = c020Var2.P1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        Spanned spannedFromHtml2 = Html.fromHtml(str9, 0);
                        spannedFromHtml2.getClass();
                        String string = spannedFromHtml2.toString();
                        String strH11 = c020Var2.H(R.string.data_copied_to_clipboard);
                        strH11.getClass();
                        j120.M(c020Var2, wdk0Var2, "", string, strH11, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                    } else {
                        if (!(zz10Var instanceof wz10)) {
                            t9f.b();
                            return null;
                        }
                        String str10 = ((wz10) zz10Var).f39999a;
                        wdk0 wdk0Var3 = c020Var2.P1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var3, new xdk0(rek0.b, str10, null, null, null, null, 124), c020Var2, null, null, false, null, 1020);
                    }
                    p7m0 p7m0Var = c020Var2.I0().t;
                    p7m0Var.getClass();
                    p7m0Var.o(null, uz10Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((ol60) obj4).f((e9h0) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mi20 mi20Var = (mi20) obj;
                c720 c720Var = (c720) obj4;
                wsz wszVar3 = c720.p2;
                c6q c6qVarV0 = c720Var.Q0();
                DsSegmentedGroup dsSegmentedGroup = c6qVarV0.b;
                pls0 pls0Var = new pls0(pym0.i(c720Var.P0().c).iterator());
                View view2 = (View) (!pls0Var.hasNext() ? null : pls0Var.next());
                if (view2 != null) {
                    view2.setVisibility(mi20Var instanceof li20 ? 0 : 8);
                }
                ViewPager2 viewPager2 = c6qVarV0.e;
                boolean z7 = mi20Var instanceof ki20;
                dsSegmentedGroup.setVisibility(z7 ? 0 : 8);
                c6qVarV0.d.setVisibility(mi20Var instanceof li20 ? 0 : 8);
                viewPager2.setVisibility(z7 ? 0 : 8);
                if (z7) {
                    xze xzeVar = c720Var.l2;
                    ArrayList arrayList3 = xzeVar != null ? (ArrayList) xzeVar.n : null;
                    ki20 ki20Var = (ki20) mi20Var;
                    List<y6q> list2 = ki20Var.d;
                    if (!Intrinsics.d(arrayList3, list2)) {
                        boolean z8 = ki20Var.c;
                        xze xzeVar2 = c720Var.l2;
                        if (xzeVar2 != null) {
                            xzeVar2.H(list2);
                        }
                        if (viewPager2.getAdapter() == null) {
                            viewPager2.setAdapter(c720Var.l2);
                        }
                        dsSegmentedGroup.setVisibility(z8 ? 0 : 8);
                        viewPager2.setOffscreenPageLimit(list2.size());
                        c6q c6qVarV1 = c720Var.Q0();
                        DsSegmentedGroup dsSegmentedGroup2 = c6qVarV1.b;
                        dsSegmentedGroup2.k.clear();
                        dsSegmentedGroup2.removeAllViews();
                        for (y6q y6qVar : list2) {
                            vvh0 vvh0Var = new vvh0();
                            vvh0Var.a(c720Var.H(y6qVar.a()));
                            DsSegmentedGroup.a(dsSegmentedGroup2, vvh0Var, false, 6);
                        }
                        if (!list2.isEmpty()) {
                            dsSegmentedGroup2.setSelectedPosition(c6qVarV1.e.getCurrentItem());
                        }
                        DsSegmentedGroup.f(dsSegmentedGroup2, new caz(c6qVarV1, b3));
                    }
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ri20 ri20Var = (ri20) obj;
                wsz wszVar4 = c720.p2;
                Iterator it2 = pym0.i(((c720) obj4).P0().f).iterator();
                ArrayList arrayList4 = new ArrayList();
                if (it2.hasNext()) {
                    next = it2.next();
                    View view3 = (View) next;
                    view3.getClass();
                    ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                    jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
                    if (jhu0Var == null || !jhu0Var.hasNext()) {
                        while (!it2.hasNext() && !arrayList4.isEmpty()) {
                            it2 = (Iterator) CollectionsKt.d0(arrayList4);
                            w3d.z(arrayList4);
                        }
                    } else {
                        arrayList4.add(it2);
                    }
                } else {
                    next = null;
                }
                View view4 = (View) next;
                s6q s6qVar = view4 instanceof s6q ? (s6q) view4 : null;
                if (s6qVar != null) {
                    if (ri20Var != null) {
                        if (ri20Var instanceof pi20) {
                            pek pekVar = jvn.f17210a;
                            pi20 pi20Var = (pi20) ri20Var;
                            int i2 = pi20Var.b;
                            pekVar.getClass();
                            s6qVar.a("", ahb.C(pek.k(i2), pi20Var.f27024a, p3u0.e), l0d.f);
                        } else if (ri20Var instanceof qi20) {
                            pek pekVar2 = jvn.f17210a;
                            qi20 qi20Var = (qi20) ri20Var;
                            int i3 = qi20Var.b;
                            pekVar2.getClass();
                            s6qVar.a(ahb.C(pek.k(i3), qi20Var.f28769a, p3u0.e), "", l0d.f19195a);
                        } else if (ri20Var instanceof oi20) {
                            pek pekVar3 = jvn.f17210a;
                            oi20 oi20Var = (oi20) ri20Var;
                            int i4 = oi20Var.d;
                            pekVar3.getClass();
                            jvn jvnVarK = pek.k(i4);
                            double d = oi20Var.b;
                            p3u0 p3u0Var = p3u0.e;
                            s6qVar.a(ahb.C(jvnVarK, d, p3u0Var), ahb.C(pek.k(i4), oi20Var.f25291a, p3u0Var), oi20Var.c);
                        }
                    }
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                double dDoubleValue = ((Number) obj).doubleValue();
                wsz wszVar5 = c720.p2;
                ((c720) obj4).X0(dDoubleValue);
                return Unit.f46060a;
            default:
                Throwable th = (Throwable) obj;
                qg20 qg20Var = (qg20) obj4;
                if (th instanceof CancellationException) {
                    qg20Var.getClass();
                } else {
                    qg20Var.t.b(th, new ed20(qg20Var, b4));
                }
                return Unit.f46060a;
        }
    }
}
