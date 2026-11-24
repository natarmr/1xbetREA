package a;

import a.m1r;
import a.m7p0;
import a.obt0;
import a.sap0;
import a.uat0;
import a.ufx;
import a.y9t0;
import android.hardware.camera2.CameraDevice;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.navigation.CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampInfoParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampPrizePoolParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsAchievementParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$transferScreen$1;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineDialogParams;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineLineupModel;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;
import org.xplatform.results.impl.di.navigation.ResultsScreenFactoryImpl$getChampsScreen$1;
import org.xplatform.ufc.impl.navigation.UfcInternalScreensFactory$getUfcRatingScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r72 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r72(Object obj, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object G(Object obj) {
        List list;
        List list2;
        dat0 dat0Var = (dat0) this.k;
        hzg hzgVar = dat0Var.p;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        s9t0 s9t0Var = (s9t0) this.j;
        if (s9t0Var.equals(p9t0.f26625a)) {
            int i = dat0.y;
            ((uzg) hzgVar).a();
        } else if (s9t0Var.equals(q9t0.f28365a)) {
            int i2 = dat0.y;
            dat0Var.M();
        } else {
            fn9 fn9Var = null;
            if (!s9t0Var.equals(r9t0.f30103a)) {
                t9f.b();
                return null;
            }
            int i3 = dat0.y;
            UniversalChampInfoParams universalChampInfoParams = dat0Var.o;
            j0g0 j0g0Var = ((aat0) dat0Var.D()).b;
            if (j0g0Var != null) {
                Object obj2 = j0g0Var.f15681a;
                fn9Var = (fn9) (obj2 instanceof g0g0 ? null : obj2);
            }
            long j = fn9Var != null ? fn9Var.c : 0L;
            long j2 = fn9Var != null ? fn9Var.p : 0L;
            String str = universalChampInfoParams.d;
            boolean zK = false;
            boolean z = (fn9Var == null || (list2 = fn9Var.r) == null) ? false : !jiq0.p0(list2).isEmpty();
            if (fn9Var != null && (list = fn9Var.r) != null) {
                zK = vsm0.k(list);
            }
            if (j > 0 && universalChampInfoParams.c == 46 && z && zK) {
                ih5 ih5Var = dat0Var.t;
                r1g r1gVar = r1g.CYBERSPORT_MAIN;
                ih5Var.o("descrip_cyber_tournament");
                dat0Var.s.x("descrip_cyber_tournament");
                ((uzg) hzgVar).p(j, universalChampInfoParams.c, 0L, j2, str, true);
            }
        }
        return Unit.f46060a;
    }

    private final Object H(Object obj) {
        yat0 yat0Var = (yat0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        nat0 nat0Var = (nat0) this.j;
        if (nat0Var.equals(lat0.f19722a)) {
            int i = yat0.w;
            ((uzg) yat0Var.p).a();
        } else {
            if (!nat0Var.equals(mat0.f21476a)) {
                t9f.b();
                return null;
            }
            int i2 = yat0.w;
            yat0Var.M();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object I(Object obj) {
        String str;
        Object next;
        Date date;
        Object value;
        wbt0 wbt0Var = (wbt0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ibt0 ibt0Var = (ibt0) this.j;
        if (ibt0Var.equals(ebt0.f7535a)) {
            int i = wbt0.E;
            ((uzg) wbt0Var.q).a();
        } else if (ibt0Var.equals(gbt0.f11029a)) {
            int i2 = wbt0.E;
            wbt0Var.M();
        } else {
            Object obj2 = null;
            Object[] objArr = 0;
            if (ibt0Var instanceof fbt0) {
                fbt0 fbt0Var = (fbt0) ibt0Var;
                int i3 = wbt0.E;
                j0g0 j0g0Var = ((ubt0) wbt0Var.D()).c;
                if (j0g0Var != null) {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    List list = (List) obj3;
                    if (list == null || (date = (Date) CollectionsKt.W(fbt0Var.f9278a, list)) == null) {
                        date = new Date();
                    }
                } else {
                    date = new Date();
                }
                Date date2 = date;
                p7m0 p7m0Var = wbt0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wbt0Var.f.getClass();
                } while (!p7m0Var.m(value, ubt0.a((ubt0) value, false, date2, null, null, 125)));
                qjj.W(jiu0.a(wbt0Var), null, null, new n7t0(wbt0Var, date2, objArr == true ? 1 : 0, (byte) 1), 3);
            } else {
                if (!(ibt0Var instanceof hbt0)) {
                    t9f.b();
                    return null;
                }
                hbt0 hbt0Var = (hbt0) ibt0Var;
                long j = hbt0Var.f12787a;
                int i4 = wbt0.E;
                qbt0 qbt0Var = ((ubt0) wbt0Var.D()).e;
                if (qbt0Var != null) {
                    Object obj4 = qbt0Var.b;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj4 instanceof g0g0) {
                        obj4 = null;
                    }
                    List list2 = (List) obj4;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((icg) next).f14535a != j);
                        icg icgVar = (icg) next;
                        if (icgVar != null) {
                            str = icgVar.n;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (str2.length() == 0) {
                    wbt0Var.G(new tbt0(wbt0Var.p.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                } else {
                    kie0 kie0Var = new kie0();
                    qbt0 qbt0Var2 = ((ubt0) wbt0Var.D()).e;
                    if (qbt0Var2 != null) {
                        Object obj5 = qbt0Var2.b;
                        e0g0 e0g0Var2 = j0g0.b;
                        if (obj5 instanceof g0g0) {
                            obj5 = null;
                        }
                        List list3 = (List) obj5;
                        if (list3 != null) {
                            for (Object obj6 : list3) {
                                if (((icg) obj6).f14535a == j) {
                                    obj2 = obj6;
                                    break;
                                }
                            }
                            icg icgVar2 = (icg) obj2;
                            if (icgVar2 != null) {
                                kie0Var.f18333a = icgVar2.p;
                                wbt0Var.r.n(vfc.Q(icgVar2, wbt0Var.o.b));
                            }
                        }
                    }
                    wbt0Var.s.d(new l0i0((Object) wbt0Var, (Object) str2, (Object) kie0Var, (Object) hbt0Var, (byte) 13));
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0442  */
    /* JADX WARN: Code duplicated, block: B:187:0x0476  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object J(Object obj) {
        List list;
        phk0 phk0Var;
        Object value;
        long j;
        boolean z;
        List list2;
        List list3;
        List list4;
        Object next;
        List list5;
        String str;
        Object next2;
        Date date;
        Date date2;
        final jdt0 jdt0Var = (jdt0) this.k;
        oyg0 oyg0Var = jdt0Var.f;
        ocj ocjVar = jdt0Var.i;
        i1w0 i1w0Var = jdt0Var.u;
        hjd hjdVar = jdt0Var.t;
        ctf0 ctf0Var = jdt0Var.q;
        zr1 zr1Var = jdt0Var.G;
        ih5 ih5Var = jdt0Var.F;
        UniversalChampParams universalChampParams = jdt0Var.o;
        hzg hzgVar = jdt0Var.s;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        u8t0 u8t0Var = (u8t0) this.j;
        if (u8t0Var.equals(h8t0.f12645a)) {
            int i = jdt0.N;
            ((uzg) hzgVar).a();
        } else if (u8t0Var.equals(p8t0.f26576a)) {
            int i2 = jdt0.N;
            jdt0Var.M();
        } else {
            final byte b = 2;
            final byte b2 = 1;
            Object obj2 = null;
            Object[] objArr = 0;
            boolean zK = false;
            zK = false;
            zK = false;
            if (u8t0Var instanceof m8t0) {
                m8t0 m8t0Var = (m8t0) u8t0Var;
                int i3 = jdt0.N;
                if (m8t0Var instanceof k8t0) {
                    i3t0.B(jdt0Var, hjdVar, new vid[]{new did(hfm0.s(((cdt0) jdt0Var.D()).c)), ((k8t0) m8t0Var).f17888a});
                } else {
                    if (!(m8t0Var instanceof l8t0)) {
                        t9f.b();
                        return null;
                    }
                    i3t0.B(jdt0Var, hjdVar, new vid[]{new did(hfm0.s(((cdt0) jdt0Var.D()).c)), ebc.n0(((l8t0) m8t0Var).f19621a)});
                }
            } else if (u8t0Var instanceof o8t0) {
                int i4 = jdt0.N;
                String str2 = ((o8t0) u8t0Var).f24849a;
                switch (str2.hashCode()) {
                    case -1626773468:
                        if (str2.equals("HEADER_RESULTS")) {
                            final byte b3 = zK ? (byte) 1 : (byte) 0;
                            i1w0Var.d(new Function1() { // from class: a.hdt0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    String strValueOf;
                                    String strValueOf2;
                                    byte b4 = b3;
                                    jdt0 jdt0Var2 = jdt0Var;
                                    k0w0 k0w0Var = (k0w0) obj3;
                                    switch (b4) {
                                        case 0:
                                            k0w0Var.getClass();
                                            final vqc vqcVar = jdt0Var2.B;
                                            UniversalChampParams universalChampParams2 = jdt0Var2.o;
                                            long j2 = universalChampParams2.f46551a;
                                            String str3 = universalChampParams2.b;
                                            long j3 = universalChampParams2.c;
                                            Date date3 = ((cdt0) jdt0Var2.D()).j;
                                            final UniversalChampResultsParams universalChampResultsParams = new UniversalChampResultsParams(j2, j3, date3 != null ? date3.getTime() : 0L, str3);
                                            vqcVar.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampResultsScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar.b;
                                                    obt0.R1.getClass();
                                                    obt0 obt0Var = new obt0();
                                                    obt0Var.Q1.J(obt0Var, obt0.S1[0], universalChampResultsParams);
                                                    return obt0Var;
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
                                            final vqc vqcVar2 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams3 = jdt0Var2.o;
                                            long j4 = universalChampParams3.f46551a;
                                            String str4 = universalChampParams3.b;
                                            long j5 = universalChampParams3.c;
                                            xbt0 xbt0Var = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var == null || (strValueOf = String.valueOf(hfm0.r(xbt0Var))) == null) {
                                                strValueOf = "";
                                            }
                                            xbt0 xbt0Var2 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampInfoParams universalChampInfoParams = new UniversalChampInfoParams(j4, j5, str4, strValueOf, xbt0Var2 != null ? xbt0Var2.k : "");
                                            vqcVar2.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampInfoScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar2.b;
                                                    y9t0.Q1.getClass();
                                                    y9t0 y9t0Var = new y9t0();
                                                    y9t0Var.P1.J(y9t0Var, y9t0.R1[0], universalChampInfoParams);
                                                    return y9t0Var;
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
                                            final vqc vqcVar3 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams4 = jdt0Var2.o;
                                            long j6 = universalChampParams4.f46551a;
                                            String str5 = universalChampParams4.b;
                                            long j7 = universalChampParams4.c;
                                            xbt0 xbt0Var3 = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var3 == null || (strValueOf2 = String.valueOf(hfm0.r(xbt0Var3))) == null) {
                                                strValueOf2 = "";
                                            }
                                            xbt0 xbt0Var4 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampPrizePoolParams universalChampPrizePoolParams = new UniversalChampPrizePoolParams(j6, j7, str5, strValueOf2, xbt0Var4 != null ? xbt0Var4.k : "");
                                            vqcVar3.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampPrizePoolScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar3.b;
                                                    uat0.Q1.getClass();
                                                    uat0 uat0Var = new uat0();
                                                    uat0Var.P1.J(uat0Var, uat0.R1[0], universalChampPrizePoolParams);
                                                    return uat0Var;
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
                        }
                        break;
                    case -1460972664:
                        if (str2.equals("HEADER_LINE_GAMES")) {
                            ((uzg) hzgVar).d(CyberGamesPage.Real.INSTANCE.f46556a, kotlin.collections.a.c(Long.valueOf(universalChampParams.f46551a)), false);
                        }
                        break;
                    case -1168536686:
                        if (str2.equals("HEADER_TOURNAMENT_INFO")) {
                            i1w0Var.d(new Function1() { // from class: a.hdt0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    String strValueOf;
                                    String strValueOf2;
                                    byte b4 = b2;
                                    jdt0 jdt0Var2 = jdt0Var;
                                    k0w0 k0w0Var = (k0w0) obj3;
                                    switch (b4) {
                                        case 0:
                                            k0w0Var.getClass();
                                            final vqc vqcVar = jdt0Var2.B;
                                            UniversalChampParams universalChampParams2 = jdt0Var2.o;
                                            long j2 = universalChampParams2.f46551a;
                                            String str3 = universalChampParams2.b;
                                            long j3 = universalChampParams2.c;
                                            Date date3 = ((cdt0) jdt0Var2.D()).j;
                                            final UniversalChampResultsParams universalChampResultsParams = new UniversalChampResultsParams(j2, j3, date3 != null ? date3.getTime() : 0L, str3);
                                            vqcVar.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampResultsScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar.b;
                                                    obt0.R1.getClass();
                                                    obt0 obt0Var = new obt0();
                                                    obt0Var.Q1.J(obt0Var, obt0.S1[0], universalChampResultsParams);
                                                    return obt0Var;
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
                                            final vqc vqcVar2 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams3 = jdt0Var2.o;
                                            long j4 = universalChampParams3.f46551a;
                                            String str4 = universalChampParams3.b;
                                            long j5 = universalChampParams3.c;
                                            xbt0 xbt0Var = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var == null || (strValueOf = String.valueOf(hfm0.r(xbt0Var))) == null) {
                                                strValueOf = "";
                                            }
                                            xbt0 xbt0Var2 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampInfoParams universalChampInfoParams = new UniversalChampInfoParams(j4, j5, str4, strValueOf, xbt0Var2 != null ? xbt0Var2.k : "");
                                            vqcVar2.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampInfoScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar2.b;
                                                    y9t0.Q1.getClass();
                                                    y9t0 y9t0Var = new y9t0();
                                                    y9t0Var.P1.J(y9t0Var, y9t0.R1[0], universalChampInfoParams);
                                                    return y9t0Var;
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
                                            final vqc vqcVar3 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams4 = jdt0Var2.o;
                                            long j6 = universalChampParams4.f46551a;
                                            String str5 = universalChampParams4.b;
                                            long j7 = universalChampParams4.c;
                                            xbt0 xbt0Var3 = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var3 == null || (strValueOf2 = String.valueOf(hfm0.r(xbt0Var3))) == null) {
                                                strValueOf2 = "";
                                            }
                                            xbt0 xbt0Var4 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampPrizePoolParams universalChampPrizePoolParams = new UniversalChampPrizePoolParams(j6, j7, str5, strValueOf2, xbt0Var4 != null ? xbt0Var4.k : "");
                                            vqcVar3.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampPrizePoolScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar3.b;
                                                    uat0.Q1.getClass();
                                                    uat0 uat0Var = new uat0();
                                                    uat0Var.P1.J(uat0Var, uat0.R1[0], universalChampPrizePoolParams);
                                                    return uat0Var;
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
                        }
                        break;
                    case -722400965:
                        if (str2.equals("HEADER_PRIZE_POOL")) {
                            i1w0Var.d(new Function1() { // from class: a.hdt0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    String strValueOf;
                                    String strValueOf2;
                                    byte b4 = b;
                                    jdt0 jdt0Var2 = jdt0Var;
                                    k0w0 k0w0Var = (k0w0) obj3;
                                    switch (b4) {
                                        case 0:
                                            k0w0Var.getClass();
                                            final vqc vqcVar = jdt0Var2.B;
                                            UniversalChampParams universalChampParams2 = jdt0Var2.o;
                                            long j2 = universalChampParams2.f46551a;
                                            String str3 = universalChampParams2.b;
                                            long j3 = universalChampParams2.c;
                                            Date date3 = ((cdt0) jdt0Var2.D()).j;
                                            final UniversalChampResultsParams universalChampResultsParams = new UniversalChampResultsParams(j2, j3, date3 != null ? date3.getTime() : 0L, str3);
                                            vqcVar.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampResultsScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar.b;
                                                    obt0.R1.getClass();
                                                    obt0 obt0Var = new obt0();
                                                    obt0Var.Q1.J(obt0Var, obt0.S1[0], universalChampResultsParams);
                                                    return obt0Var;
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
                                            final vqc vqcVar2 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams3 = jdt0Var2.o;
                                            long j4 = universalChampParams3.f46551a;
                                            String str4 = universalChampParams3.b;
                                            long j5 = universalChampParams3.c;
                                            xbt0 xbt0Var = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var == null || (strValueOf = String.valueOf(hfm0.r(xbt0Var))) == null) {
                                                strValueOf = "";
                                            }
                                            xbt0 xbt0Var2 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampInfoParams universalChampInfoParams = new UniversalChampInfoParams(j4, j5, str4, strValueOf, xbt0Var2 != null ? xbt0Var2.k : "");
                                            vqcVar2.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampInfoScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar2.b;
                                                    y9t0.Q1.getClass();
                                                    y9t0 y9t0Var = new y9t0();
                                                    y9t0Var.P1.J(y9t0Var, y9t0.R1[0], universalChampInfoParams);
                                                    return y9t0Var;
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
                                            final vqc vqcVar3 = jdt0Var2.B;
                                            UniversalChampParams universalChampParams4 = jdt0Var2.o;
                                            long j6 = universalChampParams4.f46551a;
                                            String str5 = universalChampParams4.b;
                                            long j7 = universalChampParams4.c;
                                            xbt0 xbt0Var3 = ((cdt0) jdt0Var2.D()).c;
                                            if (xbt0Var3 == null || (strValueOf2 = String.valueOf(hfm0.r(xbt0Var3))) == null) {
                                                strValueOf2 = "";
                                            }
                                            xbt0 xbt0Var4 = ((cdt0) jdt0Var2.D()).c;
                                            final UniversalChampPrizePoolParams universalChampPrizePoolParams = new UniversalChampPrizePoolParams(j6, j7, str5, strValueOf2, xbt0Var4 != null ? xbt0Var4.k : "");
                                            vqcVar3.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$universalChampPrizePoolScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj4 = vqcVar3.b;
                                                    uat0.Q1.getClass();
                                                    uat0 uat0Var = new uat0();
                                                    uat0Var.P1.J(uat0Var, uat0.R1[0], universalChampPrizePoolParams);
                                                    return uat0Var;
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
                        }
                        break;
                    case -403391872:
                        if (str2.equals("HEADER_LIVE_GAMES")) {
                            ((uzg) hzgVar).d(CyberGamesPage.Real.INSTANCE.f46556a, kotlin.collections.a.c(Long.valueOf(universalChampParams.f46551a)), true);
                        }
                        break;
                }
            } else if (u8t0Var instanceof j8t0) {
                j8t0 j8t0Var = (j8t0) u8t0Var;
                int i5 = jdt0.N;
                j0g0 j0g0Var = ((cdt0) jdt0Var.D()).k;
                if (j0g0Var != null) {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    List list6 = (List) obj3;
                    if (list6 == null || (date = (Date) CollectionsKt.W(j8t0Var.f16103a, list6)) == null) {
                        date = new Date();
                    }
                } else {
                    date = new Date();
                }
                qjj.W(jiu0.a(jdt0Var), null, null, new n7t0(jdt0Var, date, objArr == true ? 1 : 0, b), 3);
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    date2 = date;
                    if (p7m0Var.m(value2, cdt0.a((cdt0) value2, false, null, 0, date2, null, 3583))) {
                        break;
                    }
                    date = date2;
                }
                String strC = rdj.c(rdj.f30294a, sdj.UNIVERSAL, date2, null, 60);
                ih5Var.n(strC);
                zr1Var.o(strC);
            } else {
                String str3 = "";
                if (u8t0Var instanceof q8t0) {
                    q8t0 q8t0Var = (q8t0) u8t0Var;
                    long j2 = q8t0Var.f28315a;
                    int i6 = jdt0.N;
                    xbt0 xbt0Var = ((cdt0) jdt0Var.D()).c;
                    if (xbt0Var != null) {
                        Object obj4 = xbt0Var.j;
                        e0g0 e0g0Var = j0g0.b;
                        if (obj4 instanceof g0g0) {
                            obj4 = null;
                        }
                        qbt0 qbt0Var = (qbt0) obj4;
                        if (qbt0Var != null) {
                            Object obj5 = qbt0Var.b;
                            if (obj5 instanceof g0g0) {
                                obj5 = null;
                            }
                            List list7 = (List) obj5;
                            if (list7 != null) {
                                Iterator it = list7.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                } while (((icg) next2).f14535a != j2);
                                icg icgVar = (icg) next2;
                                if (icgVar != null) {
                                    str = icgVar.n;
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        jdt0Var.G(new dct0(ctf0Var.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                    } else {
                        kie0 kie0Var = new kie0();
                        xbt0 xbt0Var2 = ((cdt0) jdt0Var.D()).c;
                        if (xbt0Var2 != null) {
                            Object obj6 = xbt0Var2.j;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj6 instanceof g0g0) {
                                obj6 = null;
                            }
                            qbt0 qbt0Var2 = (qbt0) obj6;
                            if (qbt0Var2 != null) {
                                Object obj7 = qbt0Var2.b;
                                if (obj7 instanceof g0g0) {
                                    obj7 = null;
                                }
                                List list8 = (List) obj7;
                                if (list8 != null) {
                                    for (Object obj8 : list8) {
                                        if (((icg) obj8).f14535a == j2) {
                                            obj2 = obj8;
                                            break;
                                        }
                                    }
                                    icg icgVar2 = (icg) obj2;
                                    if (icgVar2 != null) {
                                        kie0Var.f18333a = icgVar2.p;
                                        jdt0Var.v.n(vfc.Q(icgVar2, universalChampParams.b));
                                    }
                                }
                            }
                        }
                        kt2 kt2Var = ih5Var.f14765a;
                        r1g r1gVar = r1g.CYBERSPORT_MAIN;
                        kt2Var.c("cyber_result_match_stat");
                        zr1Var.f44833a.a(xun.f41520a, 12016L);
                        i1w0Var.d(new l0i0((Object) jdt0Var, (Object) str, (Object) kie0Var, (Object) q8t0Var, (byte) 14));
                    }
                } else if (u8t0Var instanceof i8t0) {
                    int i7 = ((i8t0) u8t0Var).f14357a;
                    int i8 = jdt0.N;
                    xbt0 xbt0Var3 = ((cdt0) jdt0Var.D()).c;
                    if (xbt0Var3 != null && (list4 = xbt0Var3.d) != null) {
                        Iterator it2 = list4.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((uog) next).f36012a != i7);
                        uog uogVar = (uog) next;
                        if (uogVar != null) {
                            boolean z2 = uogVar.f;
                            String str4 = uogVar.g;
                            int i9 = uogVar.f36012a;
                            xbt0 xbt0Var4 = ((cdt0) jdt0Var.D()).c;
                            int iIndexOf = (xbt0Var4 == null || (list5 = xbt0Var4.d) == null) ? 0 : list5.indexOf(uogVar);
                            ih5Var.f14765a.a("cyber_champ_actions_call", xp20.f(new Pair("championship_id", Long.valueOf(universalChampParams.f46551a)), new Pair("promo_id", Long.valueOf(i7))));
                            zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p((int) universalChampParams.f46551a, (byte) 2), new i1p(i9, (byte) 0)}), 12080L);
                            if (((cdt0) jdt0Var.D()).f.O0) {
                                if (str4.length() <= 0) {
                                    mvc mvcVar = mvc.CMS_CODE_CYBER;
                                    uzg uzgVar = (uzg) hzgVar;
                                    uzgVar.getClass();
                                    i1w0 i1w0VarC = uzgVar.f36533a.c();
                                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                                    PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(i9, iIndexOf, mvcVar, true);
                                    if (promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1)));
                                    }
                                    ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                                    while (true) {
                                        paw pawVar = (paw) listIteratorO;
                                        if (!pawVar.hasNext()) {
                                            break;
                                        }
                                        i1w0VarC.a((oe50) pawVar.next());
                                    }
                                } else {
                                    jdt0Var.A.a(str4);
                                }
                                i3t0.K(jdt0Var, null, null, new idt0(jdt0Var, uogVar, null, zK ? (byte) 1 : (byte) 0), 3);
                            } else {
                                String str5 = uogVar.h;
                                if (z2 && str4.length() > 0) {
                                    uzg uzgVar2 = (uzg) hzgVar;
                                    uzgVar2.getClass();
                                    uzgVar2.i.a(str4);
                                } else if (!z2 || str5.length() <= 0) {
                                    i1w0 i1w0VarC2 = ((uzg) hzgVar).f36533a.c();
                                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                                    PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1 promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1(i9, iIndexOf, 46, false, true);
                                    if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                                    }
                                    ListIterator listIteratorO2 = b1j.o(i1w0VarC2, copyOnWriteArrayListQ2, 0);
                                    while (true) {
                                        paw pawVar2 = (paw) listIteratorO2;
                                        if (!pawVar2.hasNext()) {
                                            break;
                                        }
                                        i1w0VarC2.a((oe50) pawVar2.next());
                                    }
                                } else {
                                    ((uzg) hzgVar).m(str5);
                                }
                                i3t0.K(jdt0Var, null, null, new idt0(jdt0Var, uogVar, null, (byte) 1), 3);
                            }
                        }
                    }
                } else if (u8t0Var.equals(s8t0.f31820a)) {
                    int i10 = jdt0.N;
                    xbt0 xbt0Var5 = ((cdt0) jdt0Var.D()).c;
                    long j3 = 0;
                    if (xbt0Var5 != null) {
                        Object obj9 = xbt0Var5.f40616a;
                        e0g0 e0g0Var3 = j0g0.b;
                        if (obj9 instanceof g0g0) {
                            obj9 = null;
                        }
                        fn9 fn9Var = (fn9) obj9;
                        if (fn9Var != null) {
                            j = fn9Var.c;
                        } else {
                            j = 0;
                        }
                    } else {
                        j = 0;
                    }
                    String strValueOf = String.valueOf(hfm0.r(((cdt0) jdt0Var.D()).c));
                    xbt0 xbt0Var6 = ((cdt0) jdt0Var.D()).c;
                    if (xbt0Var6 != null) {
                        Object obj10 = xbt0Var6.f40616a;
                        e0g0 e0g0Var4 = j0g0.b;
                        if (obj10 instanceof g0g0) {
                            obj10 = null;
                        }
                        fn9 fn9Var2 = (fn9) obj10;
                        if (fn9Var2 == null || (list3 = fn9Var2.r) == null) {
                            z = false;
                        } else {
                            z = !list3.isEmpty();
                        }
                    } else {
                        z = false;
                    }
                    xbt0 xbt0Var7 = ((cdt0) jdt0Var.D()).c;
                    if (xbt0Var7 != null) {
                        Object obj11 = xbt0Var7.f40616a;
                        e0g0 e0g0Var5 = j0g0.b;
                        if (obj11 instanceof g0g0) {
                            obj11 = null;
                        }
                        fn9 fn9Var3 = (fn9) obj11;
                        if (fn9Var3 != null && (list2 = fn9Var3.r) != null) {
                            zK = vsm0.k(list2);
                        }
                    }
                    if (j > 0 && universalChampParams.c == 46 && z && zK) {
                        r1g r1gVar2 = r1g.CYBERSPORT_MAIN;
                        ih5Var.o("cybersport_champ");
                        zr1Var.x("cybersport_champ");
                        xbt0 xbt0Var8 = ((cdt0) jdt0Var.D()).c;
                        if (xbt0Var8 != null) {
                            Object obj12 = xbt0Var8.f40616a;
                            e0g0 e0g0Var6 = j0g0.b;
                            fn9 fn9Var4 = (fn9) (obj12 instanceof g0g0 ? null : obj12);
                            if (fn9Var4 != null) {
                                j3 = fn9Var4.p;
                            }
                        }
                        ((uzg) hzgVar).p(j, universalChampParams.c, 0L, j3, strValueOf, true);
                    }
                } else if (u8t0Var instanceof t8t0) {
                    t8t0 t8t0Var = (t8t0) u8t0Var;
                    int i11 = jdt0.N;
                    List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    Iterator it3 = listJ.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Long.valueOf(((yxg) it3.next()).f43419a));
                    }
                    if (arrayList.contains(Long.valueOf(((cdt0) jdt0Var.D()).b.c))) {
                        ih5Var.p(r1g.CYBERSPORT_TEAM_CALL, ((cdt0) jdt0Var.D()).b.c);
                        zr1Var.z(((cdt0) jdt0Var.D()).b.c, "cyber_team_call");
                        ((uzg) hzgVar).n(universalChampParams.c, t8t0Var.f33529a, t8t0Var.b, k1g.OPEN_REGULAR);
                    } else {
                        jdt0Var.G(new dct0(ctf0Var.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
                    }
                } else if (u8t0Var instanceof n8t0) {
                    n8t0 n8t0Var = (n8t0) u8t0Var;
                    int i12 = jdt0.N;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, cdt0.a((cdt0) value, false, null, n8t0Var.f23106a, null, null, 3839)));
                } else {
                    if (!(u8t0Var instanceof r8t0)) {
                        t9f.b();
                        return null;
                    }
                    r8t0 r8t0Var = (r8t0) u8t0Var;
                    int i13 = jdt0.N;
                    xbt0 xbt0Var9 = ((cdt0) jdt0Var.D()).c;
                    if (xbt0Var9 != null && (list = xbt0Var9.h) != null && (phk0Var = (phk0) CollectionsKt.W(r8t0Var.f30044a, list)) != null) {
                        String str6 = phk0Var.f27002a;
                        ctf0Var.getClass();
                        lsm0 lsm0Var = ctf0Var.b;
                        if (str6.equals(lsm0Var.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                            str3 = "org.telegram.messenger";
                        } else if (str6.equals(lsm0Var.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                            str3 = "com.instagram.android";
                        } else if (str6.equals(lsm0Var.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                            str3 = "com.twitter.android";
                        } else if (str6.equals(lsm0Var.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0)))) {
                            str3 = "com.discord";
                        }
                        jdt0Var.G(new cct0(str6, str3, phk0Var.c));
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object K(Object obj) {
        Object value;
        ztu0 ztu0Var = (ztu0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        osu0 osu0Var = (osu0) this.j;
        if (osu0Var.equals(lsu0.f20599a)) {
            int i = ztu0.w;
            i1w0 i1w0Var = ztu0Var.o;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (osu0Var.equals(msu0.f22340a)) {
            int i2 = ztu0.w;
            ztu0Var.M();
        } else {
            if (!(osu0Var instanceof nsu0)) {
                t9f.b();
                return null;
            }
            long j = ((nsu0) osu0Var).f24067a;
            int i3 = ztu0.w;
            p7m0 p7m0Var = ztu0Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                ztu0Var.f.getClass();
            } while (!p7m0Var.m(value, wtu0.a((wtu0) value, false, j, null, 11)));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    private final Object l(Object obj) {
        viw viwVar;
        j700 j700Var;
        List list;
        tkw tkwVar = (tkw) this.k;
        hjd hjdVar = tkwVar.q;
        i1w0 i1w0Var = tkwVar.o;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        vhw vhwVar = (vhw) this.j;
        if (vhwVar.equals(phw.f27017a)) {
            int i = tkw.C;
            tkwVar.M();
        } else if (vhwVar.equals(ngw.f23504a)) {
            int i2 = tkw.C;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            byte b = 1;
            m7h0 ufcInternalScreensFactory$getUfcRatingScreen$1 = null;
            Object obj2 = null;
            if (vhwVar.equals(ihw.f14800a)) {
                int i3 = tkw.C;
                viw viwVar2 = ((yjw) tkwVar.D()).h;
                if (viwVar2 != null) {
                    Object obj3 = viwVar2.f37502a;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    List list2 = (List) obj3;
                    if (list2 == null || !(!list2.isEmpty())) {
                        viwVar = ((yjw) tkwVar.D()).h;
                        if (viwVar != null) {
                            Object obj4 = viwVar.b;
                            e0g0 e0g0Var2 = j0g0.b;
                            list = (List) (obj4 instanceof g0g0 ? null : obj4);
                            if (list == null && (!list.isEmpty())) {
                                j700Var = j700.f16016a;
                            } else {
                                j700Var = j700.b;
                            }
                        } else {
                            j700Var = j700.b;
                        }
                    } else {
                        j700Var = j700.b;
                    }
                } else {
                    viwVar = ((yjw) tkwVar.D()).h;
                    if (viwVar != null) {
                        Object obj5 = viwVar.b;
                        e0g0 e0g0Var3 = j0g0.b;
                        list = (List) (obj5 instanceof g0g0 ? null : obj5);
                        if (list == null) {
                            j700Var = j700.b;
                        } else {
                            j700Var = j700.b;
                        }
                    } else {
                        j700Var = j700.b;
                    }
                }
                i1w0Var.d(new okw(tkwVar, j700Var, b));
            } else {
                byte b2 = 2;
                if (vhwVar instanceof jhw) {
                    jhw jhwVar = (jhw) vhwVar;
                    int i4 = tkw.C;
                    viw viwVar3 = ((yjw) tkwVar.D()).h;
                    if (viwVar3 != null) {
                        Object obj6 = viwVar3.f37502a;
                        e0g0 e0g0Var4 = j0g0.b;
                        if (obj6 instanceof g0g0) {
                            obj6 = null;
                        }
                        Collection collection = (List) obj6;
                        if (collection == null) {
                            collection = iun.f15405a;
                        }
                        Object obj7 = viwVar3.b;
                        if (obj7 instanceof g0g0) {
                            obj7 = null;
                        }
                        Iterable iterable = (List) obj7;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        for (Object obj8 : CollectionsKt.q0(collection, iterable)) {
                            if (Intrinsics.d(String.valueOf(((tiw) obj8).d), jhwVar.f16547a)) {
                                obj2 = obj8;
                                break;
                            }
                        }
                        tiw tiwVar = (tiw) obj2;
                        if (tiwVar != null) {
                            i1w0Var.d(new okw(tkwVar, tiwVar, b2));
                        }
                    }
                } else if (vhwVar instanceof pgw) {
                    int i5 = tkw.C;
                    long j = ((pgw) vhwVar).f26970a;
                    if (j == 3) {
                        gle0 gle0Var = tkwVar.x;
                        List listC = kotlin.collections.a.c(189L);
                        gle0Var.getClass();
                        listC.getClass();
                        ufcInternalScreensFactory$getUfcRatingScreen$1 = new ResultsScreenFactoryImpl$getChampsScreen$1(listC);
                    } else if (j == 2) {
                        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                        int i6 = calendar.get(1);
                        int i7 = calendar.get(2) + 1;
                        y9g y9gVar = tkwVar.w;
                        CyberCalendarParams cyberCalendarParams = new CyberCalendarParams(i6, i7, iun.f15405a, true);
                        y9gVar.getClass();
                        ufcInternalScreensFactory$getUfcRatingScreen$1 = new CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1(cyberCalendarParams);
                    } else if (j == 1) {
                        tkwVar.u.getClass();
                        ufcInternalScreensFactory$getUfcRatingScreen$1 = new UfcInternalScreensFactory$getUfcRatingScreen$1();
                    }
                    if (ufcInternalScreensFactory$getUfcRatingScreen$1 != null) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                        if (ufcInternalScreensFactory$getUfcRatingScreen$1 instanceof DialogScreen) {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) ufcInternalScreensFactory$getUfcRatingScreen$1)));
                        } else {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(ufcInternalScreensFactory$getUfcRatingScreen$1)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO;
                            if (!pawVar2.hasNext()) {
                                break;
                            }
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    if (!(vhwVar instanceof fhw)) {
                        t9f.b();
                        return null;
                    }
                    fhw fhwVar = (fhw) vhwVar;
                    int i8 = tkw.C;
                    if (fhwVar instanceof bhw) {
                        i3t0.B(tkwVar, hjdVar, new vid[]{new did(wzb.K(((yjw) tkwVar.D()).h)), ((bhw) fhwVar).f2628a});
                    } else {
                        if (!(fhwVar instanceof dhw)) {
                            t9f.b();
                            return null;
                        }
                        i3t0.B(tkwVar, hjdVar, new vid[]{new did(wzb.K(((yjw) tkwVar.D()).h)), ebc.n0(((dhw) fhwVar).f6112a)});
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        Object value;
        ryy ryyVar = (ryy) this.k;
        i1w0 i1w0Var = ryyVar.o;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        dyy dyyVar = (dyy) this.j;
        if (dyyVar.equals(ayy.f1692a)) {
            int i = ryy.z;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (dyyVar.equals(byy.f3440a)) {
            int i2 = ryy.z;
            ryyVar.M();
        } else {
            d2w d2wVar = null;
            Object obj2 = null;
            d2wVar = null;
            if (!(dyyVar instanceof cyy)) {
                t9f.b();
                return null;
            }
            ill0 ill0Var = ((cyy) dyyVar).f5199a;
            int i3 = ryy.z;
            if (ill0Var instanceof hll0) {
                hll0 hll0Var = (hll0) ill0Var;
                j0g0 j0g0Var = ((pyy) ryyVar.D()).c;
                if (j0g0Var != null) {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    List list = (List) obj3;
                    if (list != null) {
                        for (Object obj4 : list) {
                            if (((d2w) obj4).b() == hll0Var.f13268a) {
                                obj2 = obj4;
                                break;
                            }
                        }
                        d2wVar = (d2w) obj2;
                    }
                }
                if (d2wVar == null || d2wVar.f().length() <= 0) {
                    ryyVar.G(new oyy(ryyVar.q.b.a(R.string.statistics_for_this_battle_are_not_available, Arrays.copyOf(new Object[0], 0))));
                } else {
                    i1w0Var.d(new okw(ryyVar, d2wVar, (byte) 16));
                }
            } else {
                if (!(ill0Var instanceof gll0)) {
                    t9f.b();
                    return null;
                }
                long j = ((gll0) ill0Var).f11497a;
                Set set = ((pyy) ryyVar.D()).d;
                LinkedHashSet linkedHashSetE = set.contains(Long.valueOf(j)) ? eui0.e(set, Long.valueOf(j)) : eui0.h(set, Long.valueOf(j));
                p7m0 p7m0Var = ryyVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ryyVar.f.getClass();
                } while (!p7m0Var.m(value, pyy.a((pyy) value, false, null, null, linkedHashSetE, 119)));
            }
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        Object value;
        long j;
        Object value2;
        Date date = (Date) this.j;
        iwk0 iwk0Var = (iwk0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (date != null) {
            p7m0 p7m0Var = ((jtk0) ((dpi0) iwk0Var.l0.f6568a).f6468a).f17105a;
            do {
                value = p7m0Var.getValue();
                ktk0 ktk0Var = (ktk0) value;
                j = ktk0Var.b;
                ktk0Var.getClass();
            } while (!p7m0Var.m(value, new ktk0(j, date)));
            if (!Intrinsics.d(((dvk0) iwk0Var.D()).b.b, date)) {
                ywu ywuVar = iwk0Var.K;
                int i = iwk0Var.p.f46974a;
                ywuVar.getClass();
                date.getClass();
                String strC = rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 56);
                kt2 kt2Var = ((yo4) ywuVar.b).f42966a;
                jo20 jo20Var = new jo20();
                jo20Var.put("championship_id", Integer.valueOf(i));
                if (strC.length() > 0) {
                    jo20Var.put("option", strC);
                }
                kt2Var.a("sport_champ_sсhedule", jo20Var.b());
                s1p s1pVar = ((zr1) ywuVar.c).f44833a;
                yni0 yni0Var = new yni0();
                yni0Var.add(new i1p(i, (byte) 2));
                if (strC.length() > 0) {
                    yni0Var.add(new j1p(strC, (byte) 0));
                }
                s1pVar.a(cui0.a(yni0Var), 3100L);
                p7m0 p7m0Var2 = iwk0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, dvk0.a((dvk0) value2, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822)));
            }
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        Object value;
        m7o0 m7o0Var = (m7o0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        w6o0 w6o0Var = (w6o0) this.j;
        if (w6o0Var.equals(u6o0.f35147a)) {
            int i = m7o0.A;
            m7o0Var.M();
        } else if (w6o0Var instanceof t6o0) {
            int i2 = ((t6o0) w6o0Var).f33428a;
            int i3 = m7o0.A;
            p7m0 p7m0Var = m7o0Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                m7o0Var.f.getClass();
            } while (!p7m0Var.m(value, i7o0.a((i7o0) value, false, Integer.valueOf(i2), null, null, false, 253)));
            bby bbyVar = m7o0Var.z;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            m7o0Var.z = i3t0.K(m7o0Var, null, new ttn0(m7o0Var, (byte) 5), new l7o0(m7o0Var, i2, null), 1);
            Date date = (Date) CollectionsKt.W(i2, ((i7o0) m7o0Var.D()).e);
            if (date == null) {
                date = new Date();
            }
            String strC = rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60);
            m7o0Var.u.n(strC);
            m7o0Var.v.o(strC);
        } else {
            if (!(w6o0Var instanceof v6o0)) {
                t9f.b();
                return null;
            }
            int i4 = m7o0.A;
            m7o0Var.G(new h7o0(m7o0Var.t.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    private final Object s(Object obj) {
        String str;
        Object next;
        Object value;
        zap0 zap0Var = (zap0) this.k;
        i1w0 i1w0Var = zap0Var.q;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        map0 map0Var = (map0) this.j;
        if (map0Var.equals(iap0.f14450a)) {
            int i = zap0.A;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (map0Var.equals(kap0.f17975a)) {
            int i2 = zap0.A;
            zap0Var.M();
        } else if (map0Var instanceof jap0) {
            jap0 jap0Var = (jap0) map0Var;
            int i3 = zap0.A;
            p7m0 p7m0Var = zap0Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                zap0Var.f.getClass();
            } while (!p7m0Var.m(value, wap0.a((wap0) value, false, Integer.valueOf(jap0Var.f16202a), null, 29)));
        } else {
            if (!(map0Var instanceof lap0)) {
                t9f.b();
                return null;
            }
            lap0 lap0Var = (lap0) map0Var;
            long j = lap0Var.f19716a;
            int i4 = zap0.A;
            j0g0 j0g0Var = ((wap0) zap0Var.D()).c;
            if (j0g0Var != null) {
                Object obj2 = j0g0Var.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((k9p0) next).f17926a != j);
                    k9p0 k9p0Var = (k9p0) next;
                    if (k9p0Var != null) {
                        str = k9p0Var.n;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                zap0Var.G(new vap0(zap0Var.p.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
            } else {
                Object obj3 = null;
                String str2 = str;
                kie0 kie0Var = new kie0();
                j0g0 j0g0Var2 = ((wap0) zap0Var.D()).c;
                if (j0g0Var2 != null) {
                    Object obj4 = j0g0Var2.f15681a;
                    if (obj4 instanceof g0g0) {
                        obj4 = null;
                    }
                    List list2 = (List) obj4;
                    if (list2 != null) {
                        for (Object obj5 : list2) {
                            if (((k9p0) obj5).f17926a == j) {
                                obj3 = obj5;
                                break;
                            }
                        }
                        k9p0 k9p0Var2 = (k9p0) obj3;
                        if (k9p0Var2 != null) {
                            kie0Var.f18333a = k9p0Var2.o;
                            zap0Var.t.n(hhm0.A(k9p0Var2, k9p0Var2.e));
                        }
                    }
                }
                i1w0Var.d(new l0i0((Object) zap0Var, (Object) str2, (Object) kie0Var, (Object) lap0Var, (byte) 6));
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01c0  */
    private final Object t(Object obj) {
        String str;
        Object next;
        Object value;
        final wbp0 wbp0Var = (wbp0) this.k;
        ctf0 ctf0Var = wbp0Var.q;
        hjd hjdVar = wbp0Var.v;
        oyg0 oyg0Var = wbp0Var.f;
        ocj ocjVar = wbp0Var.i;
        TeamDetailsParams teamDetailsParams = wbp0Var.p;
        i1w0 i1w0Var = wbp0Var.x;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        m8p0 m8p0Var = (m8p0) this.j;
        final byte b = 0;
        if (m8p0Var.equals(y7p0.f42164a)) {
            int i = wbp0.L;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (m8p0Var.equals(g8p0.f10877a)) {
            int i2 = wbp0.L;
            wbp0Var.M();
        } else {
            final byte b2 = 1;
            if (m8p0Var instanceof i8p0) {
                int i3 = wbp0.L;
                fbp0 fbp0Var = ((i8p0) m8p0Var).f14351a == 1 ? ebp0.c : dbp0.c;
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    fbp0 fbp0Var2 = fbp0Var;
                    if (p7m0Var.m(value2, mbp0.a((mbp0) value2, false, null, null, fbp0Var, null, null, null, null, 32639))) {
                        break;
                    }
                    fbp0Var = fbp0Var2;
                }
                wbp0Var.M();
            } else {
                final byte b3 = 2;
                if (m8p0Var instanceof e8p0) {
                    int i4 = wbp0.L;
                    String str2 = ((e8p0) m8p0Var).f7386a;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1626773468) {
                        if (iHashCode != 728989025) {
                            if (iHashCode == 1949409174 && str2.equals("HEADER_ACHIEVEMENTS")) {
                                i1w0Var.d(new Function1() { // from class: a.tbp0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b4 = b;
                                        wbp0 wbp0Var2 = wbp0Var;
                                        k0w0 k0w0Var = (k0w0) obj2;
                                        switch (b4) {
                                            case 0:
                                                k0w0Var.getClass();
                                                final vqc vqcVar = wbp0Var2.u;
                                                TeamDetailsParams teamDetailsParams2 = wbp0Var2.p;
                                                final TeamDetailsAchievementParams teamDetailsAchievementParams = new TeamDetailsAchievementParams(teamDetailsParams2.f46569a, teamDetailsParams2.c);
                                                vqcVar.getClass();
                                                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsAchievementScreen$1
                                                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                    public final Fragment a(m1r m1rVar) {
                                                        m1rVar.getClass();
                                                        Object obj3 = vqcVar.b;
                                                        m7p0.P1.getClass();
                                                        m7p0 m7p0Var = new m7p0();
                                                        m7p0Var.O1.J(m7p0Var, m7p0.Q1[0], teamDetailsAchievementParams);
                                                        return m7p0Var;
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
                                                vqc vqcVar2 = wbp0Var2.u;
                                                TransferScreenParams transferScreenParams = new TransferScreenParams(wbp0Var2.p.f46569a, 40L);
                                                vqcVar2.getClass();
                                                k0w0Var.h(new CyberGamesScreenFactoryImpl$transferScreen$1(vqcVar2, transferScreenParams));
                                                break;
                                            default:
                                                k0w0Var.getClass();
                                                final vqc vqcVar3 = wbp0Var2.u;
                                                TeamDetailsParams teamDetailsParams3 = wbp0Var2.p;
                                                final TeamDetailsResultsParams teamDetailsResultsParams = new TeamDetailsResultsParams(teamDetailsParams3.f46569a, teamDetailsParams3.b, ((mbp0) wbp0Var2.D()).m);
                                                vqcVar3.getClass();
                                                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsResultsScreen$1
                                                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                    public final Fragment a(m1r m1rVar) {
                                                        m1rVar.getClass();
                                                        Object obj3 = vqcVar3.b;
                                                        sap0.R1.getClass();
                                                        sap0 sap0Var = new sap0();
                                                        sap0Var.Q1.J(sap0Var, sap0.S1[0], teamDetailsResultsParams);
                                                        return sap0Var;
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
                            }
                        } else if (str2.equals("TRANSFER_HEADER")) {
                            i1w0Var.d(new Function1() { // from class: a.tbp0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    byte b4 = b2;
                                    wbp0 wbp0Var2 = wbp0Var;
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    switch (b4) {
                                        case 0:
                                            k0w0Var.getClass();
                                            final vqc vqcVar = wbp0Var2.u;
                                            TeamDetailsParams teamDetailsParams2 = wbp0Var2.p;
                                            final TeamDetailsAchievementParams teamDetailsAchievementParams = new TeamDetailsAchievementParams(teamDetailsParams2.f46569a, teamDetailsParams2.c);
                                            vqcVar.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsAchievementScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj3 = vqcVar.b;
                                                    m7p0.P1.getClass();
                                                    m7p0 m7p0Var = new m7p0();
                                                    m7p0Var.O1.J(m7p0Var, m7p0.Q1[0], teamDetailsAchievementParams);
                                                    return m7p0Var;
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
                                            vqc vqcVar2 = wbp0Var2.u;
                                            TransferScreenParams transferScreenParams = new TransferScreenParams(wbp0Var2.p.f46569a, 40L);
                                            vqcVar2.getClass();
                                            k0w0Var.h(new CyberGamesScreenFactoryImpl$transferScreen$1(vqcVar2, transferScreenParams));
                                            break;
                                        default:
                                            k0w0Var.getClass();
                                            final vqc vqcVar3 = wbp0Var2.u;
                                            TeamDetailsParams teamDetailsParams3 = wbp0Var2.p;
                                            final TeamDetailsResultsParams teamDetailsResultsParams = new TeamDetailsResultsParams(teamDetailsParams3.f46569a, teamDetailsParams3.b, ((mbp0) wbp0Var2.D()).m);
                                            vqcVar3.getClass();
                                            k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsResultsScreen$1
                                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                                public final Fragment a(m1r m1rVar) {
                                                    m1rVar.getClass();
                                                    Object obj3 = vqcVar3.b;
                                                    sap0.R1.getClass();
                                                    sap0 sap0Var = new sap0();
                                                    sap0Var.Q1.J(sap0Var, sap0.S1[0], teamDetailsResultsParams);
                                                    return sap0Var;
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
                        }
                    } else if (str2.equals("HEADER_RESULTS")) {
                        i1w0Var.d(new Function1() { // from class: a.tbp0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b4 = b3;
                                wbp0 wbp0Var2 = wbp0Var;
                                k0w0 k0w0Var = (k0w0) obj2;
                                switch (b4) {
                                    case 0:
                                        k0w0Var.getClass();
                                        final vqc vqcVar = wbp0Var2.u;
                                        TeamDetailsParams teamDetailsParams2 = wbp0Var2.p;
                                        final TeamDetailsAchievementParams teamDetailsAchievementParams = new TeamDetailsAchievementParams(teamDetailsParams2.f46569a, teamDetailsParams2.c);
                                        vqcVar.getClass();
                                        k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsAchievementScreen$1
                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                Object obj3 = vqcVar.b;
                                                m7p0.P1.getClass();
                                                m7p0 m7p0Var = new m7p0();
                                                m7p0Var.O1.J(m7p0Var, m7p0.Q1[0], teamDetailsAchievementParams);
                                                return m7p0Var;
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
                                        vqc vqcVar2 = wbp0Var2.u;
                                        TransferScreenParams transferScreenParams = new TransferScreenParams(wbp0Var2.p.f46569a, 40L);
                                        vqcVar2.getClass();
                                        k0w0Var.h(new CyberGamesScreenFactoryImpl$transferScreen$1(vqcVar2, transferScreenParams));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        final vqc vqcVar3 = wbp0Var2.u;
                                        TeamDetailsParams teamDetailsParams3 = wbp0Var2.p;
                                        final TeamDetailsResultsParams teamDetailsResultsParams = new TeamDetailsResultsParams(teamDetailsParams3.f46569a, teamDetailsParams3.b, ((mbp0) wbp0Var2.D()).m);
                                        vqcVar3.getClass();
                                        k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsResultsScreen$1
                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                Object obj3 = vqcVar3.b;
                                                sap0.R1.getClass();
                                                sap0 sap0Var = new sap0();
                                                sap0Var.Q1.J(sap0Var, sap0.S1[0], teamDetailsResultsParams);
                                                return sap0Var;
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
                    }
                } else {
                    Object obj2 = null;
                    if (m8p0Var instanceof d8p0) {
                        d8p0 d8p0Var = (d8p0) m8p0Var;
                        int i5 = wbp0.L;
                        if (d8p0Var instanceof b8p0) {
                            i3t0.B(wbp0Var, hjdVar, new vid[]{new did(dnm0.h(((mbp0) wbp0Var.D()).k)), ((b8p0) d8p0Var).f2167a});
                        } else {
                            if (!(d8p0Var instanceof c8p0)) {
                                t9f.b();
                                return null;
                            }
                            i3t0.B(wbp0Var, hjdVar, new vid[]{new did(dnm0.h(((mbp0) wbp0Var.D()).k)), ebc.n0(((c8p0) d8p0Var).f3925a)});
                        }
                    } else if (m8p0Var instanceof z7p0) {
                        z7p0 z7p0Var = (z7p0) m8p0Var;
                        int i6 = wbp0.L;
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var2.m(value, mbp0.a((mbp0) value, false, null, null, null, null, null, Integer.valueOf(z7p0Var.f43929a), null, 28671)));
                    } else if (m8p0Var instanceof h8p0) {
                        h8p0 h8p0Var = (h8p0) m8p0Var;
                        long j = h8p0Var.f12639a;
                        int i7 = wbp0.L;
                        e9p0 e9p0Var = ((mbp0) wbp0Var.D()).k;
                        if (e9p0Var != null) {
                            Object obj3 = e9p0Var.d;
                            e0g0 e0g0Var = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = null;
                            }
                            List list = (List) obj3;
                            if (list != null) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((k9p0) next).f17926a != j);
                                k9p0 k9p0Var = (k9p0) next;
                                if (k9p0Var != null) {
                                    str = k9p0Var.n;
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            wbp0Var.G(new jbp0(ctf0Var.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                        } else {
                            kie0 kie0Var = new kie0();
                            e9p0 e9p0Var2 = ((mbp0) wbp0Var.D()).k;
                            if (e9p0Var2 != null) {
                                Object obj4 = e9p0Var2.d;
                                e0g0 e0g0Var2 = j0g0.b;
                                if (obj4 instanceof g0g0) {
                                    obj4 = null;
                                }
                                List list2 = (List) obj4;
                                if (list2 != null) {
                                    for (Object obj5 : list2) {
                                        if (((k9p0) obj5).f17926a == j) {
                                            obj2 = obj5;
                                            break;
                                        }
                                    }
                                    k9p0 k9p0Var2 = (k9p0) obj2;
                                    if (k9p0Var2 != null) {
                                        kie0Var.f18333a = k9p0Var2.o;
                                        wbp0Var.w.n(hhm0.A(k9p0Var2, k9p0Var2.e));
                                    }
                                }
                            }
                            i1w0Var.d(new l0i0((Object) wbp0Var, (Object) str, (Object) kie0Var, (Object) h8p0Var, (byte) 7));
                        }
                    } else if (m8p0Var instanceof a8p0) {
                        a8p0 a8p0Var = (a8p0) m8p0Var;
                        int i8 = wbp0.L;
                        if (teamDetailsParams.f46569a != a8p0Var.f438a) {
                            i1w0Var.d(new itn0(wbp0Var, a8p0Var, (byte) 22));
                        }
                    } else if (m8p0Var instanceof k8p0) {
                        int i9 = wbp0.L;
                        if (((k8p0) m8p0Var).f17884a == 1 && ((mbp0) wbp0Var.D()).n.size() > 1) {
                            wbp0Var.G(new ibp0(new TeamDetailsDisciplineDialogParams(teamDetailsParams.f46569a, ((mbp0) wbp0Var.D()).n)));
                        }
                    } else if (m8p0Var instanceof l8p0) {
                        int i10 = wbp0.L;
                        i1w0Var.d(new itn0(wbp0Var, (l8p0) m8p0Var, (byte) 23));
                    } else if (m8p0Var instanceof f8p0) {
                        f8p0 f8p0Var = (f8p0) m8p0Var;
                        int i11 = wbp0.L;
                        for (Object obj6 : ((mbp0) wbp0Var.D()).n) {
                            if (((TeamDetailsDisciplineLineupModel) obj6).f46613a == f8p0Var.f9119a) {
                                obj2 = obj6;
                                break;
                            }
                        }
                        TeamDetailsDisciplineLineupModel teamDetailsDisciplineLineupModel = (TeamDetailsDisciplineLineupModel) obj2;
                        if (teamDetailsDisciplineLineupModel != null) {
                            TeamDetailsParams teamDetailsParams2 = new TeamDetailsParams(teamDetailsDisciplineLineupModel.f46613a, teamDetailsParams.b, teamDetailsParams.c);
                            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                            vqc vqcVar = wbp0Var.u;
                            vqcVar.getClass();
                            FragmentScreen cyberGamesScreenFactoryImpl$teamDetailsScreen$1 = new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(vqcVar, teamDetailsParams2);
                            if (cyberGamesScreenFactoryImpl$teamDetailsScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGamesScreenFactoryImpl$teamDetailsScreen$1)));
                            } else {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(cyberGamesScreenFactoryImpl$teamDetailsScreen$1)));
                            }
                            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                            while (true) {
                                paw pawVar2 = (paw) listIteratorO;
                                if (!pawVar2.hasNext()) {
                                    break;
                                }
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        if (!(m8p0Var instanceof j8p0)) {
                            t9f.b();
                            return null;
                        }
                        j8p0 j8p0Var = (j8p0) m8p0Var;
                        int i12 = wbp0.L;
                        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                        Iterator it2 = listJ.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(((yxg) it2.next()).f43419a));
                        }
                        if (arrayList.contains(Long.valueOf(((mbp0) wbp0Var.D()).b.f46569a)) && j8p0Var.c) {
                            ((uzg) wbp0Var.B).n(((mbp0) wbp0Var.D()).b.f46569a, j8p0Var.f16097a, j8p0Var.b, k1g.UNKNOWN);
                        } else {
                            wbp0Var.G(new jbp0(ctf0Var.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
                        }
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ArrayList arrayList = (ArrayList) this.j;
        boolean zIsEmpty = arrayList.isEmpty();
        ofr0 ofr0Var = (ofr0) this.k;
        if (zIsEmpty) {
            y0r0 y0r0Var = new y0r0(g1r0.f10530a, iun.f15405a);
            int i = ofr0.U0;
            ofr0Var.V(y0r0Var);
        } else {
            y0r0 y0r0Var2 = new y0r0(f1r0.f8780a, arrayList);
            int i2 = ofr0.U0;
            ofr0Var.V(y0r0Var2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v13, types: [a.m7h0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    private final Object y(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        a6t0 a6t0Var = (a6t0) this.k;
        kys0 kys0Var = a6t0Var.A;
        mne mneVar = a6t0Var.p;
        oeg0 oeg0Var = a6t0Var.u;
        oyg0 oyg0Var = a6t0Var.f;
        ocj ocjVar = a6t0Var.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        d5t0 d5t0Var = (d5t0) this.j;
        if (d5t0Var instanceof v4t0) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0VarC.a((oe50) pawVar.next());
            }
        } else if (d5t0Var instanceof z4t0) {
            int i = a6t0.K;
            a6t0Var.M();
        } else {
            ?? ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 = 0;
            ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 = 0;
            if (d5t0Var instanceof y4t0) {
                ims imsVar = ((y4t0) d5t0Var).f42021a;
                int i2 = a6t0.K;
                if (!(imsVar instanceof gms)) {
                    if (imsVar instanceof hms) {
                        long j = ((hms) imsVar).f13322a;
                        i1w0 i1w0VarC2 = oeg0Var.c();
                        i1w0VarC2.getClass();
                        k0w0 k0w0Var = new k0w0(i1w0VarC2);
                        kys0Var.getClass();
                        k0w0Var.h(new UfcScreensFactoryImpl$getFighterFragmentScreen$1(j));
                        ListIterator listIteratorO = b1j.o(i1w0VarC2, k0w0Var.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO;
                            if (!pawVar2.hasNext()) {
                                break;
                            }
                            i1w0VarC2.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    sac.V(jiu0.a(a6t0Var), null, null, mneVar.f22085a, new wn10(a6t0Var, ((gms) imsVar).f11554a, ufcScreensFactoryImpl$getChampionshipFragmentScreen$1, (byte) 21), 11);
                }
            } else if (d5t0Var instanceof w4t0) {
                hdb hdbVar = ((w4t0) d5t0Var).f38558a;
                int i3 = a6t0.K;
                if (hdbVar instanceof fdb) {
                    kys0Var.getClass();
                    ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 = new UfcScreensFactoryImpl$getHomeFragmentScreen$1();
                } else if (hdbVar instanceof edb) {
                    i6t0 i6t0Var = ((s5t0) a6t0Var.D()).c;
                    long j2 = i6t0Var != null ? i6t0Var.g : 0L;
                    if (j2 != 0) {
                        i6t0 i6t0Var2 = ((s5t0) a6t0Var.D()).c;
                        String str = i6t0Var2 != null ? i6t0Var2.f : "";
                        kys0Var.getClass();
                        ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 = new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(j2, str);
                    }
                }
                if (ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 != 0) {
                    i1w0 i1w0VarC3 = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC3);
                    if (ufcScreensFactoryImpl$getChampionshipFragmentScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) ufcScreensFactoryImpl$getChampionshipFragmentScreen$1)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(ufcScreensFactoryImpl$getChampionshipFragmentScreen$1)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0VarC3, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (!pawVar3.hasNext()) {
                            break;
                        }
                        i1w0VarC3.a((oe50) pawVar3.next());
                    }
                }
            } else if (d5t0Var instanceof b5t0) {
                int i4 = a6t0.K;
                sac.V(jiu0.a(a6t0Var), null, null, mneVar.c, new wup0(a6t0Var, ufcScreensFactoryImpl$getChampionshipFragmentScreen$1, (byte) 8), 11);
            } else if (d5t0Var instanceof a5t0) {
                int i5 = a6t0.K;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, s5t0.a((s5t0) value5, null, null, null, null, null, null, null, null, null, false, 0L, 0L, 0L, 0L, 129023)));
            } else if (d5t0Var instanceof c5t0) {
                c5t0 c5t0Var = (c5t0) d5t0Var;
                int i6 = a6t0.K;
                String str2 = c5t0Var.f3790a;
                switch (str2.hashCode()) {
                    case -866992519:
                        if (str2.equals("GENERAL_STATISTIC")) {
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value = p7m0Var2.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var2.m(value, s5t0.a((s5t0) value, null, null, null, null, null, null, null, null, null, false, c5t0Var.b, 0L, 0L, 0L, 126975)));
                        }
                        break;
                    case -153024607:
                        if (str2.equals("FIGHT_STATISTIC")) {
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var3.getValue();
                                value2.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var3.m(value2, s5t0.a((s5t0) value2, null, null, null, null, null, null, null, null, null, false, 0L, c5t0Var.b, 0L, 0L, 114687)));
                        }
                        break;
                    case 442310263:
                        if (str2.equals("SHOT_MAP")) {
                            p7m0 p7m0Var4 = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var4.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var4.m(value3, s5t0.a((s5t0) value3, null, null, null, null, null, null, null, null, null, false, 0L, 0L, 0L, c5t0Var.b, 65535)));
                        }
                        break;
                    case 743909174:
                        if (str2.equals("HEAD_TO_HEAD_STATISTIC")) {
                            p7m0 p7m0Var5 = ocjVar.f25029a;
                            do {
                                value4 = p7m0Var5.getValue();
                                value4.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var5.m(value4, s5t0.a((s5t0) value4, null, null, null, null, null, null, null, null, null, false, 0L, 0L, c5t0Var.b, 0L, 98303)));
                        }
                        break;
                }
            } else {
                if (!(d5t0Var instanceof x4t0)) {
                    t9f.b();
                    return null;
                }
                x4t0 x4t0Var = (x4t0) d5t0Var;
                int i7 = a6t0.K;
                if (x4t0Var.f40283a.length() == 0) {
                    a6t0Var.G(new r5t0(a6t0Var.v.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0))));
                } else {
                    oeg0Var.c().d(new xis0((Object) a6t0Var, (Object) x4t0Var, (byte) 10));
                }
            }
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new r72((s72) obj2, (s62) obj, yjeVar, (byte) 0);
            case 1:
                return new r72((n92) obj2, (uf50) obj, yjeVar, (byte) 1);
            case 2:
                return new r72((qbs0) obj2, (ul2) obj, yjeVar, (byte) 2);
            case 3:
                return new r72((t33) obj2, obj, yjeVar, (byte) 3);
            case 4:
                return new r72((CameraDevice) obj2, (hie0) obj, yjeVar, (byte) 4);
            case 5:
                return new r72((r9a) obj2, (n9a) obj, yjeVar, (byte) 5);
            case 6:
                return new r72((r9a) obj2, (ucs0) obj, yjeVar, (byte) 6);
            case 7:
                return new r72((njb) obj2, (plb) obj, yjeVar, (byte) 7);
            case 8:
                return new r72((rfg) obj2, (igg) obj, yjeVar, (byte) 8);
            case 9:
                return new r72((r7o) obj2, (k9o) obj, yjeVar, (byte) 9);
            case 10:
                return new r72((kvp) obj2, (typ) obj, yjeVar, (byte) 10);
            case 11:
                return new r72((vhw) obj2, (tkw) obj, yjeVar, (byte) 11);
            case 12:
                return new r72((dyy) obj2, (ryy) obj, yjeVar, (byte) 12);
            case 13:
                return new r72((qbs0) obj2, (v360) obj, yjeVar, (byte) 13);
            case 14:
                return new r72((pa20) obj2, (lpb0) obj, yjeVar, (byte) 14);
            case 15:
                return new r72((Date) obj2, (iwk0) obj, yjeVar, (byte) 15);
            case 16:
                return new r72((w6o0) obj2, (m7o0) obj, yjeVar, (byte) 16);
            case 17:
                return new r72((map0) obj2, (zap0) obj, yjeVar, (byte) 17);
            case 18:
                return new r72((m8p0) obj2, (wbp0) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new r72((ArrayList) obj2, (ofr0) obj, yjeVar, (byte) 19);
            case 20:
                return new r72((d5t0) obj2, (a6t0) obj, yjeVar, (byte) 20);
            case 21:
                return new r72((s9t0) obj2, (dat0) obj, yjeVar, (byte) 21);
            case 22:
                return new r72((nat0) obj2, (yat0) obj, yjeVar, (byte) 22);
            case 23:
                return new r72((ibt0) obj2, (wbt0) obj, yjeVar, (byte) 23);
            case 24:
                return new r72((u8t0) obj2, (jdt0) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new r72((osu0) obj2, (ztu0) obj, yjeVar, (byte) 25);
            default:
                return new r72((u0v0) obj2, (yzu0) obj, yjeVar, (byte) 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
        }
        return ((r72) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0306  */
    /* JADX WARN: Code duplicated, block: B:194:0x052d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0626  */
    /* JADX WARN: Code duplicated, block: B:229:0x0629  */
    /* JADX WARN: Code duplicated, block: B:246:0x067c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0740  */
    /* JADX WARN: Code duplicated, block: B:278:0x074a  */
    /* JADX WARN: Code duplicated, block: B:280:0x0750  */
    /* JADX WARN: Code duplicated, block: B:293:0x076e  */
    /* JADX WARN: Code duplicated, block: B:306:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:308:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:310:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:323:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:340:0x0857  */
    /* JADX WARN: Code duplicated, block: B:342:0x0861  */
    /* JADX WARN: Code duplicated, block: B:344:0x0867  */
    /* JADX WARN: Code duplicated, block: B:357:0x0885  */
    /* JADX WARN: Code duplicated, block: B:409:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:422:0x0a19  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v8 java.lang.Object, still in use, count: 2, list:
          (r6v8 java.lang.Object) from 0x09e6: PHI (r6 I:??) = (r6v5 java.lang.Object), (r6v8 java.lang.Object) binds: [B:407:0x09e5, B:521:0x09e6] A[DONT_GENERATE, DONT_INLINE]
          (r6v8 java.lang.Object) from 0x09da: CHECK_CAST (a.d2w) (r6v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 3172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
