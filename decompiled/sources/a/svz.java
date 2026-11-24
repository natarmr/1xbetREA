package a;

import a.c9k;
import a.ke7;
import a.m1r;
import a.u8k;
import a.ufx;
import android.content.Context;
import android.gov.nist.core.LexerCore;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.game.lol.api.LolPostGameStatScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsRSScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$RealityScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$SelfLimitsScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$SessionTimeLimitsScreen;
import org.xplatform.responsible_game.impl.presentation.limits.deposit_limit.gambling_exam.models.DepositLimitScreenParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class svz extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svz(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f32894a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object Q(Object obj) {
        List list;
        hzg hzgVar;
        Object next;
        String str;
        Object value;
        Object value2;
        n110 n110Var;
        Object value3;
        Object value4;
        n110 n110Var2;
        ArrayList arrayListR0;
        Object next2;
        long j;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object value5;
        n110 n110Var3;
        Object value6;
        f210 f210Var = (f210) obj;
        f210Var.getClass();
        b310 b310Var = (b310) this.receiver;
        ol60 ol60Var = b310Var.E;
        zr1 zr1Var = b310Var.t;
        ih5 ih5Var = b310Var.s;
        mne mneVar = b310Var.g;
        p7m0 p7m0Var = b310Var.K;
        hzg hzgVar2 = b310Var.d;
        LolPostGameStatScreenParams lolPostGameStatScreenParams = b310Var.b;
        p7m0 p7m0Var2 = b310Var.H;
        Object obj2 = null;
        if (f210Var instanceof s110) {
            s110 s110Var = (s110) f210Var;
            if (s110Var.equals(r110.f29656a)) {
                ((uzg) hzgVar2).c(lolPostGameStatScreenParams.b, CyberGamesPage.Real.INSTANCE, k1g.OPEN_REGULAR);
            } else {
                if (!(s110Var instanceof q110)) {
                    t9f.b();
                    return null;
                }
                q110 q110Var = (q110) s110Var;
                for (Object obj3 : b310Var.n.f20692a.a()) {
                    lok0 lok0Var = (lok0) obj3;
                    if (lok0Var.f20396a == lolPostGameStatScreenParams.c && lok0Var.t.contains(1)) {
                        obj2 = obj3;
                        break;
                    }
                }
                lok0 lok0Var2 = (lok0) obj2;
                if (lok0Var2 != null) {
                    ((uzg) hzgVar2).o(lok0Var2.f20396a, lok0Var2.b);
                } else {
                    long j2 = lolPostGameStatScreenParams.b;
                    long j3 = q110Var.f27929a;
                    String str2 = q110Var.b;
                    byte b = CyberGamesPage.Real.INSTANCE.f46556a;
                    k1g k1gVar = k1g.OPEN_REGULAR;
                    ((uzg) hzgVar2).f(str2, j2, j3, b);
                }
            }
        } else if (f210Var instanceof b210) {
            int i = ((b210) f210Var).f1835a;
            if (((n110) p7m0Var2.getValue()).f22726a != i) {
                do {
                    value6 = p7m0Var.getValue();
                    ((Boolean) value6).getClass();
                } while (!p7m0Var.m(value6, Boolean.TRUE));
                while (true) {
                    Object value7 = p7m0Var2.getValue();
                    int i2 = i;
                    if (p7m0Var2.m(value7, n110.a((n110) value7, i, 0L, 0L, null, 0L, null, 0L, false, 0L, false, 0L, 4094))) {
                        break;
                    }
                    i = i2;
                }
            }
        } else if (f210Var instanceof z110) {
            String str3 = ((z110) f210Var).f43596a;
            n210 n210Var = b310Var.F;
            if (n210Var != null) {
                qjj.W(jiu0.a(b310Var), mneVar.f22085a, null, new khx(b310Var, n210Var, str3, null == true ? 1 : 0, (byte) 6), 2);
            }
        } else if (f210Var instanceof x110) {
            x110 x110Var = (x110) f210Var;
            if (x110Var.equals(v110.f36607a)) {
                do {
                    value5 = p7m0Var2.getValue();
                    n110Var3 = (n110) value5;
                } while (!p7m0Var2.m(value5, n110.a(n110Var3, 0, 0L, 0L, null, 0L, null, 0L, !n110Var3.h, 0L, false, 0L, 3839)));
            } else {
                if (!(x110Var instanceof w110)) {
                    t9f.b();
                    return null;
                }
                String str4 = ((w110) x110Var).f38376a;
                if (str4.length() == 0) {
                    ol60Var.f(new w210(R.string.statistics_dont_found_for_event));
                } else {
                    ((uzg) hzgVar2).h(str4, lolPostGameStatScreenParams.c, lolPostGameStatScreenParams.b);
                }
            }
        } else if (f210Var instanceof a210) {
            long j4 = ((a210) f210Var).f102a;
            while (true) {
                Object value8 = p7m0Var2.getValue();
                n110 n110VarA = (n110) value8;
                Iterator it = g210.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((l2z) next2).f19335a != j4);
                if (next2 != null) {
                    long j5 = j4;
                    n110VarA = n110.a(n110VarA, 0, 0L, 0L, null, 0L, null, j5, false, 0L, false, 0L, 3967);
                    j = j5;
                } else {
                    j = j4;
                    Iterator it2 = g210.c.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                    } while (((r2g) next3).f29732a != j);
                    if (next3 != null) {
                        n110VarA = n110.a(n110VarA, 0, 0L, 0L, null, j, null, 0L, false, 0L, false, 0L, 4063);
                        j = j;
                    } else {
                        Iterator it3 = g210.d.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it3.next();
                        } while (((vev) next4).f37302a != j);
                        if (next4 != null) {
                            n110VarA = n110.a(n110VarA, 0, 0L, j, null, 0L, null, 0L, false, 0L, false, 0L, 4087);
                            j = j;
                        } else {
                            Iterator it4 = g210.f10540a.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it4.next();
                            } while (((mog) next5).f22133a != j);
                            if (next5 != null) {
                                n110VarA = n110.a(n110VarA, 0, 0L, 0L, null, 0L, null, 0L, false, j, false, 0L, 3583);
                                j = j;
                            } else {
                                Iterator it5 = g210.e.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next6 = null;
                                        break;
                                    }
                                    next6 = it5.next();
                                } while (((aco0) next6).f639a != j);
                                if (next6 != null) {
                                    n110VarA = n110.a(n110VarA, 0, j, 0L, null, 0L, null, 0L, false, 0L, false, 0L, LexerCore.ID_NO_WHITESPACE);
                                }
                            }
                        }
                    }
                }
                if (p7m0Var2.m(value8, n110VarA)) {
                    break;
                }
                j4 = j;
            }
        } else if (f210Var instanceof p110) {
            String str5 = ((p110) f210Var).f26178a;
            do {
                value4 = p7m0Var2.getValue();
                n110Var2 = (n110) value4;
                boolean zContains = n110Var2.f.contains(str5);
                List list2 = n110Var2.f;
                if (zContains) {
                    arrayListR0 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (!Intrinsics.d((String) obj4, str5)) {
                            arrayListR0.add(obj4);
                        }
                    }
                } else {
                    arrayListR0 = CollectionsKt.r0(list2, str5);
                }
            } while (!p7m0Var2.m(value4, n110.a(n110Var2, 0, 0L, 0L, null, 0L, arrayListR0, 0L, false, 0L, false, 0L, 4031)));
        } else if (f210Var instanceof t110) {
            if (!((t110) f210Var).equals(t110.f33147a)) {
                t9f.b();
                return null;
            }
            p7m0 p7m0Var3 = b310Var.I;
            do {
                value3 = p7m0Var3.getValue();
            } while (!p7m0Var3.m(value3, da10.TIMER_ERROR));
            b310Var.w();
        } else if (f210Var instanceof o110) {
            o110 o110Var = (o110) f210Var;
            ox oxVar = o110Var.f24456a;
            if (oxVar.equals(hx.f13788a)) {
                s4v0 s4v0VarH = b310Var.j.H((int) lolPostGameStatScreenParams.b, o110Var.b, lolPostGameStatScreenParams.f46515a, cy7.c());
                ih5Var.f14765a.c("cyber_result_full_stat_call");
                zr1Var.f44833a.a(xun.f41520a, 12017L);
                ((uzg) hzgVar2).j(s4v0VarH.b, s4v0VarH.f31627a);
            } else if (oxVar.equals(nx.f24259a)) {
                ((uzg) hzgVar2).l(lolPostGameStatScreenParams.b, lolPostGameStatScreenParams.c, lolPostGameStatScreenParams.f46515a);
            } else {
                if (!oxVar.equals(mx.f22528a)) {
                    t9f.b();
                    return null;
                }
                qjj.W(jiu0.a(b310Var), null, null, new slx(b310Var, null == true ? 1 : 0, (byte) 23), 3);
            }
        } else if (f210Var instanceof u110) {
            do {
                value2 = p7m0Var2.getValue();
                n110Var = (n110) value2;
            } while (!p7m0Var2.m(value2, n110.a(n110Var, 0, 0L, 0L, null, 0L, null, 0L, false, 0L, !n110Var.j, 0L, 3071)));
        } else if (f210Var instanceof e210) {
            long j6 = ((e210) f210Var).f7063a;
            while (true) {
                Object value9 = p7m0Var2.getValue();
                long j7 = j6;
                if (p7m0Var2.m(value9, n110.a((n110) value9, 0, 0L, 0L, null, 0L, null, 0L, false, 0L, false, j7, 2047))) {
                    break;
                }
                j6 = j7;
            }
        } else if (f210Var instanceof y110) {
            do {
                value = p7m0Var.getValue();
                ((Boolean) value).getClass();
            } while (!p7m0Var.m(value, Boolean.FALSE));
        } else if (f210Var instanceof d210) {
            sac.V(jiu0.a(b310Var), null, null, mneVar.f22085a, new ey((Object) b310Var, ((d210) f210Var).f5335a, (yje) (null == true ? 1 : 0), (byte) 28), 11);
        } else {
            if (!(f210Var instanceof c210)) {
                t9f.b();
                return null;
            }
            long j8 = ((c210) f210Var).f3603a;
            Object value10 = b310Var.D.getValue();
            q210 q210Var = value10 instanceof q210 ? (q210) value10 : null;
            if (q210Var != null && (list = q210Var.c) != null) {
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        hzgVar = hzgVar2;
                        next = null;
                        break;
                    }
                    next = it6.next();
                    hzgVar = hzgVar2;
                    if (((f2h) next).b == j8) {
                        break;
                    }
                    hzgVar2 = hzgVar;
                }
                f2h f2hVar = (f2h) next;
                if (f2hVar != null && (str = f2hVar.c) != null) {
                    List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    Iterator it7 = listJ.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(Long.valueOf(((yxg) it7.next()).f43419a));
                    }
                    long j9 = lolPostGameStatScreenParams.b;
                    long j10 = lolPostGameStatScreenParams.b;
                    if (arrayList.contains(Long.valueOf(j9)) && j8 != 0) {
                        ih5Var.p(r1g.CYBERSPORT_POSTMATCH_STATISTIC, j10);
                        zr1Var.z(j10, "сyber_postmatch_statistics");
                        ((uzg) hzgVar).n(lolPostGameStatScreenParams.b, j8, str, k1g.OPEN_REGULAR);
                    } else if (arrayList.contains(Long.valueOf(j10)) && j8 == 0) {
                        ol60Var.f(new w210(R.string.snackbar_no_info_for_selected_team));
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v26, types: [a.m7h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [a.m7h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [a.m7h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [a.m7h0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        Object value;
        byte b = 29;
        final byte b2 = 2;
        final byte b3 = 1;
        final byte b4 = 0;
        ?? H = 0;
        switch (this.f32894a) {
            case 0:
                final LimitTypeEnum limitTypeEnum = (LimitTypeEnum) obj;
                limitTypeEnum.getClass();
                final g500 g500Var = (g500) this.receiver;
                sff0 sff0Var = g500Var.k;
                i1w0 i1w0Var = g500Var.b;
                int iOrdinal = limitTypeEnum.ordinal();
                final int i = limitTypeEnum.f46888a;
                switch (iOrdinal) {
                    case 0:
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreen = new FragmentScreen(limitTypeEnum) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$BetLimitScreen

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final LimitTypeEnum f46889a;

                            {
                                this.f46889a = limitTypeEnum;
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            public final Fragment a(m1r m1rVar) {
                                m1rVar.getClass();
                                ke7.R1.getClass();
                                ke7 ke7Var = new ke7();
                                ke7Var.Q1.J(ke7Var, ke7.S1[1], this.f46889a);
                                return ke7Var;
                            }

                            @Override // a.m7h0
                            /* JADX INFO: renamed from: b */
                            public final String getF45455a() {
                                return ufx.C(this);
                            }

                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                            /* JADX INFO: renamed from: g */
                            public final /* bridge */ boolean getB() {
                                return true;
                            }
                        };
                        if (fragmentScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 7:
                        if (!sff0Var.f.p) {
                            i1w0Var.d(new Function1() { // from class: a.y400
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    byte b5 = b4;
                                    g500 g500Var2 = g500Var;
                                    LimitTypeEnum limitTypeEnum2 = limitTypeEnum;
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    switch (b5) {
                                        case 0:
                                            k0w0Var.getClass();
                                            int i2 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams = new DepositLimitScreenParams(i2, g500Var2.x(i2));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                        case 1:
                                            k0w0Var.getClass();
                                            int i3 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams2 = new DepositLimitScreenParams(i3, g500Var2.x(i3));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams2) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams2;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                        default:
                                            k0w0Var.getClass();
                                            int i4 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams3 = new DepositLimitScreenParams(i4, g500Var2.x(i4));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams3) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams3;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                            FragmentScreen fragmentScreen2 = new FragmentScreen(i) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsKzScreen

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f46890a;

                                {
                                    this.f46890a = i;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    c9k.Q1.getClass();
                                    c9k c9kVar = new c9k();
                                    c9kVar.O1.I(c9kVar, c9k.R1[0], this.f46890a);
                                    return c9kVar;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF45455a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen2 instanceof DialogScreen) {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen2)));
                            } else {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen2)));
                            }
                            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                            while (true) {
                                paw pawVar2 = (paw) listIteratorO2;
                                if (pawVar2.hasNext()) {
                                    i1w0Var.a((oe50) pawVar2.next());
                                }
                            }
                        }
                        break;
                    case 8:
                        ucq ucqVar = sff0Var.f;
                        if (ucqVar.e) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                            ?? responsibleGamblingScreens$DepositLimitsRSScreen = new ResponsibleGamblingScreens$DepositLimitsRSScreen();
                            if (responsibleGamblingScreens$DepositLimitsRSScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$DepositLimitsRSScreen)));
                            } else {
                                copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$DepositLimitsRSScreen)));
                            }
                            ListIterator listIteratorO3 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                            while (true) {
                                paw pawVar3 = (paw) listIteratorO3;
                                if (pawVar3.hasNext()) {
                                    i1w0Var.a((oe50) pawVar3.next());
                                }
                            }
                        } else if (!ucqVar.p) {
                            i1w0Var.d(new Function1() { // from class: a.y400
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    byte b5 = b2;
                                    g500 g500Var2 = g500Var;
                                    LimitTypeEnum limitTypeEnum2 = limitTypeEnum;
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    switch (b5) {
                                        case 0:
                                            k0w0Var.getClass();
                                            int i2 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams = new DepositLimitScreenParams(i2, g500Var2.x(i2));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                        case 1:
                                            k0w0Var.getClass();
                                            int i3 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams2 = new DepositLimitScreenParams(i3, g500Var2.x(i3));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams2) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams2;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                        default:
                                            k0w0Var.getClass();
                                            int i4 = limitTypeEnum2.f46888a;
                                            final DepositLimitScreenParams depositLimitScreenParams3 = new DepositLimitScreenParams(i4, g500Var2.x(i4));
                                            k0w0Var.h(new FragmentScreen(depositLimitScreenParams3) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public final DepositLimitScreenParams f46891a;

                                                {
                                                    this.f46891a = depositLimitScreenParams3;
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    u8k.Q1.getClass();
                                                    u8k u8kVar = new u8k();
                                                    u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                    return u8kVar;
                                                }

                                                @Override // a.m7h0
                                                /* JADX INFO: renamed from: b */
                                                public final String getF45455a() {
                                                    return ufx.C(this);
                                                }

                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                /* JADX INFO: renamed from: g */
                                                public final /* bridge */ boolean getB() {
                                                    return true;
                                                }
                                            });
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
                            FragmentScreen fragmentScreen3 = new FragmentScreen(i) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsKzScreen

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f46890a;

                                {
                                    this.f46890a = i;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    c9k.Q1.getClass();
                                    c9k c9kVar = new c9k();
                                    c9kVar.O1.I(c9kVar, c9k.R1[0], this.f46890a);
                                    return c9kVar;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF45455a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen3 instanceof DialogScreen) {
                                copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen3)));
                            } else {
                                copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen3)));
                            }
                            ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
                            while (true) {
                                paw pawVar4 = (paw) listIteratorO4;
                                if (pawVar4.hasNext()) {
                                    i1w0Var.a((oe50) pawVar4.next());
                                }
                            }
                        }
                        break;
                    case 9:
                        i1w0Var.d(new Function1() { // from class: a.y400
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b5 = b3;
                                g500 g500Var2 = g500Var;
                                LimitTypeEnum limitTypeEnum2 = limitTypeEnum;
                                k0w0 k0w0Var = (k0w0) obj2;
                                switch (b5) {
                                    case 0:
                                        k0w0Var.getClass();
                                        int i2 = limitTypeEnum2.f46888a;
                                        final DepositLimitScreenParams depositLimitScreenParams = new DepositLimitScreenParams(i2, g500Var2.x(i2));
                                        k0w0Var.h(new FragmentScreen(depositLimitScreenParams) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DepositLimitScreenParams f46891a;

                                            {
                                                this.f46891a = depositLimitScreenParams;
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                u8k.Q1.getClass();
                                                u8k u8kVar = new u8k();
                                                u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                return u8kVar;
                                            }

                                            @Override // a.m7h0
                                            /* JADX INFO: renamed from: b */
                                            public final String getF45455a() {
                                                return ufx.C(this);
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            /* JADX INFO: renamed from: g */
                                            public final /* bridge */ boolean getB() {
                                                return true;
                                            }
                                        });
                                        break;
                                    case 1:
                                        k0w0Var.getClass();
                                        int i3 = limitTypeEnum2.f46888a;
                                        final DepositLimitScreenParams depositLimitScreenParams2 = new DepositLimitScreenParams(i3, g500Var2.x(i3));
                                        k0w0Var.h(new FragmentScreen(depositLimitScreenParams2) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DepositLimitScreenParams f46891a;

                                            {
                                                this.f46891a = depositLimitScreenParams2;
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                u8k.Q1.getClass();
                                                u8k u8kVar = new u8k();
                                                u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                return u8kVar;
                                            }

                                            @Override // a.m7h0
                                            /* JADX INFO: renamed from: b */
                                            public final String getF45455a() {
                                                return ufx.C(this);
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            /* JADX INFO: renamed from: g */
                                            public final /* bridge */ boolean getB() {
                                                return true;
                                            }
                                        });
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        int i4 = limitTypeEnum2.f46888a;
                                        final DepositLimitScreenParams depositLimitScreenParams3 = new DepositLimitScreenParams(i4, g500Var2.x(i4));
                                        k0w0Var.h(new FragmentScreen(depositLimitScreenParams3) { // from class: org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$DepositLimitsScreen

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DepositLimitScreenParams f46891a;

                                            {
                                                this.f46891a = depositLimitScreenParams3;
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                u8k.Q1.getClass();
                                                u8k u8kVar = new u8k();
                                                u8kVar.P1.J(u8kVar, u8k.R1[1], this.f46891a);
                                                return u8kVar;
                                            }

                                            @Override // a.m7h0
                                            /* JADX INFO: renamed from: b */
                                            public final String getF45455a() {
                                                return ufx.C(this);
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            /* JADX INFO: renamed from: g */
                                            public final /* bridge */ boolean getB() {
                                                return true;
                                            }
                                        });
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        break;
                    case 10:
                        g500Var.d.f37210a.c("acc_responsible_gambling_limit_call");
                        if (!sff0Var.f.e) {
                            CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                            ?? responsibleGamblingScreens$SelfLimitsScreen = new ResponsibleGamblingScreens$SelfLimitsScreen();
                            if (responsibleGamblingScreens$SelfLimitsScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$SelfLimitsScreen)));
                            } else {
                                copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$SelfLimitsScreen)));
                            }
                            ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                            while (true) {
                                paw pawVar5 = (paw) listIteratorO5;
                                if (pawVar5.hasNext()) {
                                    i1w0Var.a((oe50) pawVar5.next());
                                }
                            }
                        } else {
                            bvc bvcVarA = jiu0.a(g500Var);
                            rwj rwjVar = tvk.f34603a;
                            sac.V(bvcVarA, new z400(g500Var, b3), new a500(g500Var, (byte) 1), dvj.c, new f500(g500Var, H, b4), 8);
                        }
                        break;
                    case 11:
                        CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
                        ?? responsibleGamblingScreens$SessionTimeLimitsScreen = new ResponsibleGamblingScreens$SessionTimeLimitsScreen();
                        if (responsibleGamblingScreens$SessionTimeLimitsScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$SessionTimeLimitsScreen)));
                        } else {
                            copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$SessionTimeLimitsScreen)));
                        }
                        ListIterator listIteratorO6 = b1j.o(i1w0Var, copyOnWriteArrayListQ6, 0);
                        while (true) {
                            paw pawVar6 = (paw) listIteratorO6;
                            if (pawVar6.hasNext()) {
                                i1w0Var.a((oe50) pawVar6.next());
                            }
                            break;
                        }
                        break;
                    case 12:
                        CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
                        ?? responsibleGamblingScreens$RealityScreen = new ResponsibleGamblingScreens$RealityScreen();
                        if (responsibleGamblingScreens$RealityScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$RealityScreen)));
                        } else {
                            copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$RealityScreen)));
                        }
                        ListIterator listIteratorO7 = b1j.o(i1w0Var, copyOnWriteArrayListQ7, 0);
                        while (true) {
                            paw pawVar7 = (paw) listIteratorO7;
                            if (pawVar7.hasNext()) {
                                i1w0Var.a((oe50) pawVar7.next());
                            }
                            break;
                        }
                        break;
                    case 13:
                        bvc bvcVarA2 = jiu0.a(g500Var);
                        rwj rwjVar2 = tvk.f34603a;
                        sac.V(bvcVarA2, new z400(g500Var, b2), new a500(g500Var, (byte) 2), dvj.c, new f500(g500Var, H, b3), 8);
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return Unit.f46060a;
            case 1:
                cwz cwzVar = (cwz) obj;
                cwzVar.getClass();
                ((k3t0) this.receiver).x(cwzVar);
                return Unit.f46060a;
            case 2:
                vxz vxzVar = (vxz) obj;
                vxzVar.getClass();
                sxz sxzVar = (sxz) this.receiver;
                xuz xuzVar = sxz.o2;
                vcc.f0(i120.V(new Pair("NEW_LIMIT_RESULT", vxzVar.f38223a)), sxzVar, sxzVar.n2.n(sxzVar, sxz.p2[1]));
                sxzVar.y0();
                ((k3t0) sxzVar.l2.getValue()).x(nxz.f24306a);
                return Unit.f46060a;
            case 3:
                qyz qyzVar = (qyz) obj;
                qyzVar.getClass();
                eyz eyzVar = (eyz) this.receiver;
                evz evzVar = eyz.O1;
                eyzVar.getClass();
                boolean z = qyzVar instanceof myz;
                dxz dxzVar = dxz.f6869a;
                if (z) {
                    uxz uxzVar = ((myz) qyzVar).f22627a;
                    xuz xuzVar2 = sxz.o2;
                    androidx.fragment.app.e eVarC = eyzVar.C();
                    eVarC.getClass();
                    xuzVar2.getClass();
                    String str = sxz.q2;
                    if (eVarC.J(str) == null) {
                        sxz sxzVar2 = new sxz();
                        iiy[] iiyVarArr = sxz.p2;
                        sxzVar2.m2.u(sxzVar2, iiyVarArr[0], uxzVar);
                        sxzVar2.n2.x(sxzVar2, iiyVarArr[1], "REQUEST_SET_LIMIT_KEY");
                        sxzVar2.H0(eVarC, str);
                    }
                    eyzVar.G0().x(dxzVar);
                } else if (qyzVar.equals(nyz.f24351a)) {
                    ii iiVar = eyzVar.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = eyzVar.H(R.string.attention);
                    String strH2 = eyzVar.H(R.string.change_the_limit_question);
                    String strH3 = eyzVar.H(R.string.yes);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, eyzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = eyzVar.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                    eyzVar.G0().x(dxzVar);
                } else if (qyzVar.equals(oyz.f26081a)) {
                    ii iiVar2 = eyzVar.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = eyzVar.H(R.string.attention);
                    String strH5 = eyzVar.H(R.string.change_limit_affect_all_limits);
                    String strH6 = eyzVar.H(R.string.continue_action);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, eyzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_ALL_LIMITS_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = eyzVar.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                    eyzVar.G0().x(dxzVar);
                } else if (qyzVar instanceof pyz) {
                    String str2 = ((pyz) qyzVar).f27821a;
                    ii iiVar3 = eyzVar.L1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = eyzVar.H(R.string.error);
                    H = StringsKt.W(str2) ? 0 : str2;
                    if (H == 0) {
                        H = eyzVar.H(R.string.error_something_went_wrong);
                        H.getClass();
                    }
                    String strH8 = eyzVar.H(R.string.ok);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) H, (CharSequence) strH8, (String) null, (String) null, "", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC4 = eyzVar.C();
                    eVarC4.getClass();
                    iiVar3.d(dialogFields3, eVarC4);
                    eyzVar.G0().x(dxzVar);
                }
                return Unit.f46060a;
            case 4:
                mxz mxzVar = (mxz) obj;
                mxzVar.getClass();
                ((k3t0) this.receiver).x(mxzVar);
                return Unit.f46060a;
            case 5:
                d100 d100Var = (d100) obj;
                d100Var.getClass();
                f000 f000Var = (f000) this.receiver;
                atz atzVar = f000.O1;
                f000Var.getClass();
                boolean zEquals = d100Var.equals(b100.f1785a);
                ozz ozzVar = ozz.f26121a;
                if (zEquals) {
                    ii iiVar4 = f000Var.L1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH9 = f000Var.H(R.string.attention);
                    String strH10 = f000Var.H(R.string.change_the_limit_question);
                    String strH11 = f000Var.H(R.string.yes);
                    strH11.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, f000Var.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = f000Var.C();
                    eVarC5.getClass();
                    iiVar4.d(dialogFields4, eVarC5);
                    f000Var.G0().x(ozzVar);
                } else if (d100Var instanceof c100) {
                    String str3 = ((c100) d100Var).f3550a;
                    ii iiVar5 = f000Var.L1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH12 = f000Var.H(R.string.error);
                    String strH13 = StringsKt.W(str3) ? null : str3;
                    if (strH13 == null) {
                        strH13 = f000Var.H(R.string.error_something_went_wrong);
                        strH13.getClass();
                    }
                    String strH14 = f000Var.H(R.string.ok);
                    strH14.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC6 = f000Var.C();
                    eVarC6.getClass();
                    iiVar5.d(dialogFields5, eVarC6);
                    f000Var.G0().x(ozzVar);
                }
                return Unit.f46060a;
            case 6:
                yzz yzzVar = (yzz) obj;
                yzzVar.getClass();
                ((k3t0) this.receiver).x(yzzVar);
                return Unit.f46060a;
            case 7:
                ((t000) obj).getClass();
                q000 q000Var = (q000) this.receiver;
                htz htzVar = q000.P1;
                ii iiVar6 = q000Var.N1;
                if (iiVar6 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH15 = q000Var.H(R.string.attention);
                String strH16 = q000Var.H(R.string.something_went_wrong);
                String strH17 = q000Var.H(R.string.ok_new);
                strH17.getClass();
                DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                androidx.fragment.app.e eVarC7 = q000Var.C();
                eVarC7.getClass();
                iiVar6.d(dialogFields6, eVarC7);
                ((k3t0) q000Var.O1.getValue()).x(m000.f20930a);
                return Unit.f46060a;
            case 8:
                n000 n000Var = (n000) obj;
                n000Var.getClass();
                ((k3t0) this.receiver).x(n000Var);
                return Unit.f46060a;
            case 9:
                x300 x300Var = (x300) obj;
                x300Var.getClass();
                ((k3t0) this.receiver).x(x300Var);
                return Unit.f46060a;
            case 10:
                aa00 aa00Var = (aa00) obj;
                aa00Var.getClass();
                ((k3t0) this.receiver).x(aa00Var);
                return Unit.f46060a;
            case 11:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((ef00) this.receiver).x(th);
                return Unit.f46060a;
            case 12:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((ef00) this.receiver).x(th2);
                return Unit.f46060a;
            case 13:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((ef00) this.receiver).x(th3);
                return Unit.f46060a;
            case 14:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((ef00) this.receiver).x(th4);
                return Unit.f46060a;
            case 15:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((ef00) this.receiver).x(th5);
                return Unit.f46060a;
            case 16:
                wo00 wo00Var = (wo00) obj;
                wo00Var.getClass();
                co00 co00Var = (co00) this.receiver;
                xuz xuzVar3 = co00.R1;
                co00Var.getClass();
                if (wo00Var.equals(to00.f34261a)) {
                    ndk0 ndk0Var = co00Var.Q1;
                    if (ndk0Var != null) {
                        ndk0Var.dismiss();
                    }
                    co00Var.G0().x(lk00.f20176a);
                } else if (wo00Var instanceof uo00) {
                    Context contextD = co00Var.D();
                    if (contextD != null) {
                        k9x.P(contextD, ((uo00) wo00Var).b);
                    }
                    if (((uo00) wo00Var).f35988a) {
                        wdk0 wdk0Var = co00Var.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH18 = co00Var.H(R.string.no_connection_title_with_hyphen);
                        strH18.getClass();
                        String strH19 = co00Var.H(R.string.no_connection_description);
                        strH19.getClass();
                        rv00 rv00Var = rv00.B;
                        String strH20 = co00Var.H(R.string.proxy_settings_starter_button);
                        strH20.getClass();
                        co00Var.Q1 = wdk0.k(wdk0Var, new xdk0(pek0Var, strH18, strH19, new hdk0(strH20, new ao00(co00Var, (byte) 0)), rv00Var, null, 96), co00Var, null, null, false, null, 1020);
                    }
                } else {
                    if (!wo00Var.equals(vo00.f37743a)) {
                        t9f.b();
                        return null;
                    }
                    if (co00Var.B() != null && co00Var.O1 == null) {
                        Intrinsics.h("consentManager");
                        throw null;
                    }
                }
                return Unit.f46060a;
            case 17:
                String str4 = (String) obj;
                str4.getClass();
                nt00 nt00Var = (nt00) this.receiver;
                nt00Var.getClass();
                String string = StringsKt.u0(str4).toString();
                nt00Var.f.e("QUERY_KEY", string);
                nt00Var.x(string);
                return Unit.f46060a;
            case 18:
                qk90 qk90Var = (qk90) obj;
                qk90Var.getClass();
                nt00 nt00Var2 = (nt00) this.receiver;
                nt00Var2.getClass();
                sac.V(jiu0.a(nt00Var2), new svz(1, nt00Var2, nt00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, nt00Var2.e.f22085a, new juy((Object) nt00Var2, (Object) qk90Var, (yje) H, (byte) 17), 10);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Throwable) obj).getClass();
                nt00 nt00Var3 = (nt00) this.receiver;
                nt00Var3.getClass();
                sac.V(jiu0.a(nt00Var3), lt00.f20607a, null, nt00Var3.e.f22085a, new cin(nt00Var3, H, b), 10);
                return Unit.f46060a;
            case 20:
                ((Throwable) obj).getClass();
                nt00 nt00Var4 = (nt00) this.receiver;
                nt00Var4.getClass();
                sac.V(jiu0.a(nt00Var4), lt00.f20607a, null, nt00Var4.e.f22085a, new cin(nt00Var4, H, b), 10);
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                nt00 nt00Var5 = (nt00) this.receiver;
                nt00Var5.getClass();
                sac.V(jiu0.a(nt00Var5), new svz(1, nt00Var5, nt00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, nt00Var5.e.f22085a, new slx(nt00Var5, H, (byte) 20), 10);
                return Unit.f46060a;
            case 22:
                yy00 yy00Var = (yy00) obj;
                yy00Var.getClass();
                ((k3t0) this.receiver).x(yy00Var);
                return Unit.f46060a;
            case 23:
                return Q(obj);
            case 24:
                sd10 sd10Var = (sd10) obj;
                sd10Var.getClass();
                uc10 uc10Var = (uc10) this.receiver;
                wsz wszVar = uc10.R1;
                uc10Var.H0(sd10Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hc10 hc10Var = (hc10) obj;
                hc10Var.getClass();
                ((k3t0) this.receiver).x(hc10Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sd10 sd10Var2 = (sd10) obj;
                sd10Var2.getClass();
                uc10 uc10Var2 = (uc10) this.receiver;
                wsz wszVar2 = uc10.R1;
                uc10Var2.H0(sd10Var2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                be10 be10Var = (be10) this.receiver;
                be10Var.x.b(th6, new g2z((Object) be10Var, (byte) 22));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pe10 pe10Var = (pe10) obj;
                pe10Var.getClass();
                ((k3t0) this.receiver).x(pe10Var);
                return Unit.f46060a;
            default:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                sf10 sf10Var = (sf10) this.receiver;
                duj dujVar = sf10Var.x;
                ctf0 ctf0Var = sf10Var.t;
                if (th7 instanceof zhi0) {
                    zg zgVar = sf10Var.v;
                    int i2 = ((zhi0) th7).b;
                    b1j.w("error_code", Integer.valueOf(i2), zgVar.f44322a, "promo_VIP_cashback_reject");
                    sf10Var.w.f1455a.a(cui0.b(new i1p(i2, (byte) 2)), 11315L);
                    strA = th7.getMessage();
                    if (strA == null) {
                        strA = "";
                    }
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                    }
                } else if (th7 instanceof UnknownHostException) {
                    dujVar.b(th7, new kyz((byte) 25));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                } else {
                    dujVar.b(th7, new kyz((byte) 26));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                }
                sf10Var.G(new if10(new DialogFields((CharSequence) ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) strA, (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                p7m0 p7m0Var = sf10Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sf10Var.f.getClass();
                } while (!p7m0Var.m(value, lf10.a((lf10) value, null, false, 127)));
                return Unit.f46060a;
        }
    }
}
