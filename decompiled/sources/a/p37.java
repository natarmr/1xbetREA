package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class p37 extends x2t0 {
    public final q37 h;

    public p37(q37 q37Var) {
        super(new t07((byte) 3));
        this.h = q37Var;
    }

    @Override // a.j3t0
    public final Object a(Object obj, bnn0 bnn0Var) {
        String strA;
        s1p s1pVar;
        long j;
        byv byvVar;
        long j2;
        s1p s1pVar2;
        long j3;
        String str;
        kt2 kt2Var;
        String str2;
        String strA2;
        s1p s1pVar3;
        f4w f4wVar;
        u1k u1kVar = (u1k) obj;
        boolean z = u1kVar instanceof i1k;
        q37 q37Var = this.h;
        if (z) {
            i1k i1kVar = (i1k) u1kVar;
            n3w n3wVar = i1kVar.f14002a;
            q37Var.c(vfc.R(n3wVar.g1), bfb.n0(n3wVar.l), slb.d0(i1kVar.b), xkb.N(n3wVar), xkb.f0(n3wVar));
        } else {
            String strB0 = "";
            if (u1kVar instanceof h1k) {
                h1k h1kVar = (h1k) u1kVar;
                a5w a5wVar = h1kVar.f12287a;
                HistoryTypeModel historyTypeModel = h1kVar.b;
                List list = h1kVar.c;
                ozv ozvVarR = vfc.R(a5wVar.c());
                z5w z5wVarP = nkb.P(a5wVar.b());
                r6w r6wVarD0 = slb.d0(historyTypeModel);
                String strD = a5wVar.d();
                if (a5wVar instanceof kzv) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((xco) obj2).e) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            kzv kzvVar = (kzv) a5wVar;
                            if (((xco) it.next()).f40655a == kzvVar.T) {
                                List list2 = kzvVar.Y;
                                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(Long.valueOf(((z0w) it2.next()).G));
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : arrayList2) {
                                    if (((Number) obj3).longValue() != 0) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                strB0 = CollectionsKt.b0(arrayList3, null, null, null, null, 63);
                                break;
                            }
                        }
                    }
                }
                q37Var.c(ozvVarR, z5wVarP, r6wVarD0, strD, strB0);
            } else {
                if (u1kVar instanceof y0k) {
                    strA = ((y0k) u1kVar).f41809a ? "all" : "compact";
                    q37Var.getClass();
                    i8i.D("option", strA, q37Var.b.f1961a, "bet_history_select_view");
                    s1pVar = q37Var.c.f1455a;
                    j = 3203;
                } else if (u1kVar instanceof p1k) {
                    HistoryTypeModel historyTypeModel2 = ((p1k) u1kVar).f26205a;
                    a1w a1wVar = a1w.f;
                    r6w r6wVarD1 = slb.d0(historyTypeModel2);
                    strA = slb.d0(historyTypeModel2).a();
                    q37Var.getClass();
                    b4j.h(q37Var.b, a1wVar, r6wVarD1);
                    s1pVar = q37Var.c.f1455a;
                    j = 3201;
                } else if (u1kVar instanceof g1k) {
                    int iOrdinal = ((g1k) u1kVar).f10516a.ordinal();
                    if (iOrdinal == 0) {
                        f4wVar = f4w.b;
                    } else if (iOrdinal == 1) {
                        f4wVar = f4w.c;
                    } else if (iOrdinal == 2) {
                        f4wVar = f4w.e;
                    } else if (iOrdinal == 3) {
                        f4wVar = f4w.g;
                    } else if (iOrdinal == 5) {
                        f4wVar = f4w.f;
                    } else if (iOrdinal == 6) {
                        f4wVar = f4w.d;
                    }
                    i8i.D("point", f4wVar.a(), q37Var.b.f1961a, f4w.f8934a.a());
                    au0 au0Var = q37Var.c;
                    strA2 = f4wVar.a();
                    s1pVar3 = au0Var.f1455a;
                    b1j.v(strA2, s1pVar3, 3199L);
                } else if (Intrinsics.d(u1kVar, f1k.f8767a)) {
                    f4w f4wVar2 = f4w.h;
                    i8i.D("point", f4wVar2.a(), q37Var.b.f1961a, f4w.f8934a.a());
                    au0 au0Var2 = q37Var.c;
                    strA2 = f4wVar2.a();
                    s1pVar3 = au0Var2.f1455a;
                    b1j.v(strA2, s1pVar3, 3199L);
                } else {
                    if (u1kVar instanceof s1k) {
                        str = ((s1k) u1kVar).f31460a;
                        q37Var.getClass();
                        str.getClass();
                        b1j.v(str, q37Var.c.f1455a, 3194L);
                        kt2Var = q37Var.b.f1961a;
                        str2 = "bet_history_winback_banner_click";
                    } else if (u1kVar instanceof t1k) {
                        str = ((t1k) u1kVar).f33170a;
                        q37Var.getClass();
                        b1j.v(str, q37Var.c.f1455a, 10631L);
                        kt2Var = q37Var.b.f1961a;
                        str2 = "bet_history_winback_banner_shown";
                    } else if (Intrinsics.d(u1kVar, z0k.f43571a)) {
                        q37Var.c.f1455a.a(xun.f41520a, 3200L);
                        q37Var.b.f1961a.c("bet_history_date_filter");
                    } else if (u1kVar instanceof e1k) {
                        e1k e1kVar = (e1k) u1kVar;
                        boolean z2 = e1kVar.f7039a;
                        String str3 = e1kVar.b;
                        a1w a1wVar2 = z2 ? a1w.h : a1w.i;
                        q37Var.getClass();
                        str3.getClass();
                        q37Var.b.i(a1wVar2, str3);
                    } else {
                        if (u1kVar instanceof q1k) {
                            String str4 = ((q1k) u1kVar).f27957a;
                            q37Var.getClass();
                            str4.getClass();
                            ix0 ix0Var = q37Var.i;
                            j2 = Long.parseLong(str4);
                            s1pVar2 = ix0Var.f15516a;
                            j3 = 3366;
                        } else if (u1kVar instanceof r1k) {
                            String str5 = ((r1k) u1kVar).f29684a;
                            q37Var.getClass();
                            str5.getClass();
                            ix0 ix0Var2 = q37Var.i;
                            j2 = Long.parseLong(str5);
                            s1pVar2 = ix0Var2.f15516a;
                            j3 = 3367;
                        } else if (Intrinsics.d(u1kVar, j1k.f15739a)) {
                            y1p y1pVar = y1p.MAIN;
                            q37Var.getClass();
                            i8i.D("screen", "history_anonim", q37Var.b.f1961a, "login_page_call");
                            q37Var.d.c("history_anonim");
                        } else if (u1kVar instanceof m1k) {
                            String str6 = ((m1k) u1kVar).f21012a;
                            y1p y1pVar2 = y1p.HISTORY_ANONIM;
                            q37Var.getClass();
                            i8i.D("screen", "history_anonim", q37Var.b.f1961a, "reg_page_call");
                            q37Var.d.d(y1pVar2, str6);
                        } else if (u1kVar instanceof b1k) {
                            String str7 = ((b1k) u1kVar).f1809a;
                            y1p y1pVar3 = y1p.MAIN;
                            q37Var.getClass();
                            i8i.D("screen", "history_user", q37Var.e.f14765a, "deposit_call");
                            q37Var.f.b("history_user", str7);
                        } else if (u1kVar instanceof v0k) {
                            v0k v0kVar = (v0k) u1kVar;
                            String str8 = v0kVar.f36584a;
                            boolean z3 = v0kVar.b;
                            String str9 = v0kVar.c;
                            q37Var.getClass();
                            str8.getClass();
                            q37Var.g.a(str8, str9, z3);
                            q37Var.h.a(str9, Long.parseLong(str8), z3);
                        } else if (u1kVar instanceof x0k) {
                            x0k x0kVar = (x0k) u1kVar;
                            HistoryMenuItem historyMenuItem = x0kVar.f40074a;
                            HistoryTypeModel historyTypeModel3 = x0kVar.b;
                            e4f e4fVar = x0kVar.c;
                            historyMenuItem.getClass();
                            switch (historyMenuItem.ordinal()) {
                                case 1:
                                    byvVar = byv.j;
                                    break;
                                case 2:
                                    byvVar = byv.c;
                                    break;
                                case 3:
                                    byvVar = byv.d;
                                    break;
                                case 4:
                                    byvVar = byv.f;
                                    break;
                                case 5:
                                    byvVar = byv.g;
                                    break;
                                case 6:
                                    byvVar = byv.h;
                                    break;
                                case 7:
                                    byvVar = byv.e;
                                    break;
                                case 8:
                                    byvVar = byv.i;
                                    break;
                                case 9:
                                    byvVar = byv.k;
                                    break;
                                case 10:
                                    byvVar = byv.m;
                                    break;
                                case 11:
                                    byvVar = byv.l;
                                    break;
                                default:
                                    byvVar = byv.b;
                                    break;
                            }
                            q37Var.a(byvVar, bfb.n0(e4fVar), slb.d0(historyTypeModel3));
                        } else if (Intrinsics.d(u1kVar, c1k.f3575a)) {
                            a1w a1wVar3 = a1w.j;
                            q37Var.getClass();
                            q37Var.b.f1961a.c(a1wVar3.a());
                            q37Var.c.f1455a.a(xun.f41520a, 3206L);
                        } else if (Intrinsics.d(u1kVar, w0k.f38352a)) {
                            a1w a1wVar4 = a1w.w;
                            q37Var.getClass();
                            q37Var.b.f1961a.c(a1wVar4.a());
                        } else if (Intrinsics.d(u1kVar, n1k.f22753a)) {
                            q37Var.c.f1455a.a(xun.f41520a, 3193L);
                            q37Var.b.f1961a.c(a1w.g.a());
                        } else if (u1kVar instanceof a1k) {
                            HistoryDateFilterTypeModel historyDateFilterTypeModel = ((a1k) u1kVar).f74a;
                            q37Var.getClass();
                            int iOrdinal2 = historyDateFilterTypeModel.ordinal();
                            if (iOrdinal2 == 0) {
                                strA = "day";
                            } else if (iOrdinal2 == 1) {
                                strA = "month";
                            } else if (iOrdinal2 == 2) {
                                strA = "set";
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                strA = "email";
                            }
                            i8i.D("option", strA, q37Var.b.f1961a, "bet_history_period_click");
                            s1pVar = q37Var.c.f1455a;
                            j = 11097;
                        } else if (u1kVar instanceof d1k) {
                            boolean z4 = ((d1k) u1kVar).f5312a;
                            q37Var.getClass();
                            strA = z4 ? "link" : "cancel";
                            i8i.D("action", strA, q37Var.b.f1961a, "bet_history_link_mail");
                            s1pVar = q37Var.c.f1455a;
                            j = 11098;
                        } else if (u1kVar instanceof o1k) {
                            o1k o1kVar = (o1k) u1kVar;
                            HistoryTypeModel historyTypeModel4 = o1kVar.f24483a;
                            List list3 = o1kVar.b;
                            q37Var.getClass();
                            list3.getClass();
                            r6w r6wVarD2 = slb.d0(historyTypeModel4);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : list3) {
                                if (((h0w) obj4).b) {
                                    arrayList4.add(obj4);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(nkb.P(((h0w) it3.next()).f12253a));
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : arrayList5) {
                                if (((z5w) obj5) != z5w.b) {
                                    arrayList6.add(obj5);
                                }
                            }
                            q37Var.b.b(r6wVarD2, arrayList6);
                            au0 au0Var3 = q37Var.c;
                            String strA3 = r6wVarD2.a();
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it4 = arrayList6.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(((z5w) it4.next()).a());
                            }
                            au0Var3.c(strA3, arrayList7);
                        } else if (u1kVar instanceof k1k) {
                            switch (((k1k) u1kVar).f17528a.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                    strB0 = "bet_history";
                                    break;
                                case 4:
                                    strB0 = "unsettled_bets";
                                    break;
                                case 8:
                                    strB0 = "bet_history_details";
                                    break;
                                case 10:
                                    strB0 = "bet_sell";
                                    break;
                            }
                            q37Var.getClass();
                            q37Var.b.o(strB0);
                            q37Var.c.m(strB0);
                        } else if (u1kVar instanceof l1k) {
                            switch (((l1k) u1kVar).f19258a.ordinal()) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                    strB0 = "bet_history";
                                    break;
                                case 4:
                                    strB0 = "unsettled_bets";
                                    break;
                                case 8:
                                    strB0 = "bet_history_details";
                                    break;
                                case 10:
                                    strB0 = "bet_sell";
                                    break;
                            }
                            q37Var.getClass();
                            q37Var.b.p(strB0);
                            q37Var.c.n(strB0);
                        }
                        h97.r(j2, s1pVar2, j3);
                    }
                    i8i.D("option", str, kt2Var, str2);
                }
                b1j.v(strA, s1pVar, j);
            }
        }
        return Unit.f46060a;
    }
}
