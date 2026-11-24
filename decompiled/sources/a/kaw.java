package a;

import a.eru0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.localtimedif.impl.presentation.localtimediffworker.LocalTimeDiffWorker;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class kaw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kaw(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:288:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:292:0x07e4 A[LOOP:9: B:290:0x07db->B:292:0x07e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:537:0x0d1f A[EDGE_INSN: B:537:0x0d1f->B:513:0x0d1f BREAK  A[LOOP:9: B:290:0x07db->B:292:0x07e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0258  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object l(Object obj) {
        Object next;
        Object obj2;
        Object obj3;
        r1g r1gVar;
        Object next2;
        List list;
        List list2;
        Object obj4;
        Object obj5;
        r1g r1gVar2;
        FragmentScreen fragmentScreenH;
        i1w0 i1w0VarC;
        CopyOnWriteArrayList copyOnWriteArrayListQ;
        ListIterator listIteratorO;
        paw pawVar;
        r1g r1gVar3;
        Object value;
        zjw zjwVar;
        LinkedHashMap linkedHashMapP;
        Object next3;
        Object obj6;
        Object obj7;
        r1g r1gVar4;
        Object next4;
        int iIndexOf;
        String str;
        long j;
        long j2;
        ekw ekwVar;
        ukw ukwVar = (ukw) this.k;
        luu luuVar = ukwVar.u;
        vqc vqcVar = ukwVar.H;
        oyg0 oyg0Var = ukwVar.f;
        ocj ocjVar = ukwVar.i;
        final vqc vqcVar2 = ukwVar.G;
        zr1 zr1Var = ukwVar.y;
        ih5 ih5Var = ukwVar.w;
        oeg0 oeg0Var = ukwVar.E;
        hzg hzgVar = ukwVar.p;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        whw whwVar = (whw) this.j;
        if (whwVar instanceof ogw) {
            int i = ukw.X;
            ((uzg) hzgVar).a();
        } else if (whwVar instanceof mhw) {
            ekw ekwVar2 = ((mhw) whwVar).f21817a;
            int i2 = ukw.X;
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
                ekwVar = ekwVar2;
                if (p7m0Var.m(value2, zjw.a((zjw) value2, null, ekwVar, null, false, null, false, null, null, null, null, null, null, 524223))) {
                    break;
                }
                ekwVar2 = ekwVar;
            }
            i3t0.K(ukwVar, null, null, new pkw(ukwVar, null), 3);
            ukwVar.O(((zjw) ukwVar.D()).i, ekwVar);
            ukwVar.Z();
        } else if (whwVar instanceof qhw) {
            int i3 = ukw.X;
            ukwVar.O(((zjw) ukwVar.D()).i, ((zjw) ukwVar.D()).g);
        } else if (whwVar instanceof ghw) {
            int i4 = ukw.X;
            ukwVar.T((ghw) whwVar);
        } else {
            byte b = 0;
            if (whwVar instanceof khw) {
                int i5 = ukw.X;
                String str2 = ((khw) whwVar).f18309a;
                switch (str2.hashCode()) {
                    case -1844391406:
                        if (str2.equals("HEADER_CHAMPIONSHIPS_REAL_LINE")) {
                            ukwVar.V(false);
                        }
                        break;
                    case -1844391158:
                        if (str2.equals("HEADER_CHAMPIONSHIPS_REAL_LIVE")) {
                            ukwVar.V(true);
                        }
                        break;
                    case -639640461:
                        if (str2.equals("HEADER_DISCIPLINES_ALL")) {
                            ukwVar.Q();
                        }
                        break;
                    case -121779796:
                        if (str2.equals("ITEM_VIRTUAL_BANNER")) {
                            vqcVar.k(pzb.C(new h7w((byte) 6)));
                            uzg uzgVar = (uzg) hzgVar;
                            uzgVar.f36533a.c().d(new hfg(uzgVar, (byte) 10));
                        }
                        break;
                    case 6064284:
                        if (str2.equals("HEADER_CHAMPIONSHIPS")) {
                            ukwVar.P();
                        }
                        break;
                    case 122538680:
                        if (str2.equals("HEADER_PARTNER_ALL")) {
                            zr1Var.f44833a.a(xun.f41520a, 12021L);
                            ih5Var.f14765a.c("cyber_partner_call");
                            ((uzg) hzgVar).i("");
                        }
                        break;
                }
            } else if (whwVar instanceof shw) {
                shw shwVar = (shw) whwVar;
                long j3 = shwVar.f32235a;
                int i6 = ukw.X;
                byte b2 = ((zjw) ukwVar.D()).g.f7971a.f46556a;
                CyberGamesPage cyberGamesPage = ((zjw) ukwVar.D()).g.f7971a;
                CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
                long j4 = Intrinsics.d(cyberGamesPage, real) ? 40L : j3;
                if (!Intrinsics.d(((zjw) ukwVar.D()).g.f7971a, real)) {
                    j3 = -1;
                }
                long j5 = j3;
                if (((zjw) ukwVar.D()).f) {
                    ukwVar.z.i0(shwVar.b ? i1g.POPULAR_LIVE : i1g.POPULAR_LINE, 40L, shwVar.f32235a);
                    j = j5;
                    j2 = j4;
                } else {
                    j = j5;
                    j2 = j4;
                    ukwVar.z.h0(j2, j, org.xplatform.cyber.section.api.domain.entity.d.e(b2));
                }
                ((uzg) hzgVar).e(b2, j2, j, shwVar.b);
            } else if (whwVar instanceof qgw) {
                qgw qgwVar = (qgw) whwVar;
                int i7 = ukw.X;
                jih jihVar = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar != null) {
                    Object obj8 = jihVar.f16574a;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj8 instanceof g0g0) {
                        obj8 = null;
                    }
                    List list3 = (List) obj8;
                    if (list3 != null) {
                        Iterator it = list3.iterator();
                        do {
                            if (!it.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it.next();
                        } while (((uog) next4).f36012a != qgwVar.f28706a);
                        uog uogVar = (uog) next4;
                        if (uogVar != null) {
                            int i8 = uogVar.f36012a;
                            String str3 = uogVar.g;
                            jih jihVar2 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                            if (jihVar2 != null) {
                                Object obj9 = jihVar2.f16574a;
                                if (obj9 instanceof g0g0) {
                                    obj9 = null;
                                }
                                List list4 = (List) obj9;
                                if (list4 != null) {
                                    iIndexOf = list4.indexOf(uogVar);
                                } else {
                                    iIndexOf = 0;
                                }
                            } else {
                                iIndexOf = 0;
                            }
                            String str4 = qgwVar.b;
                            String strW = c3x.w(str3);
                            bj5 bj5Var = oo5.b;
                            Integer numValueOf = Integer.valueOf(uogVar.i);
                            bj5Var.getClass();
                            oo5 oo5VarC = bj5.c(numValueOf);
                            if (oo5VarC == null) {
                                oo5VarC = oo5.ACTION_INFO;
                            }
                            Integer numA = ks60.a(oo5VarC, str4);
                            zr1 zr1Var2 = ukwVar.y;
                            int i9 = uogVar.f36012a;
                            if (((zjw) ukwVar.D()).f) {
                                y1p y1pVar = y1p.MAIN;
                                str = "popular_new_esports";
                            } else {
                                y1p y1pVar2 = y1p.MAIN;
                                str = "cybersport_main";
                            }
                            zr1Var2.b(i9, iIndexOf, strW, str, ((zjw) ukwVar.D()).f, numA != null ? Float.valueOf(numA.intValue()) : null);
                            if (((zjw) ukwVar.D()).f) {
                                ukwVar.x.o(uogVar.f36012a, iIndexOf, numA, strW, "popular_new_esports");
                            }
                            int i10 = iIndexOf;
                            if (((zjw) ukwVar.D()).b.O0) {
                                if (str3.length() <= 0) {
                                    mvc mvcVar = mvc.CMS_CODE_CYBER;
                                    uzg uzgVar2 = (uzg) hzgVar;
                                    uzgVar2.getClass();
                                    i1w0 i1w0VarC2 = uzgVar2.f36533a.c();
                                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                                    FragmentScreen promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(i8, i10, mvcVar, true);
                                    if (promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1)));
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
                                    ukwVar.A.a(str3);
                                }
                                sac.V(jiu0.a(ukwVar), null, null, null, new rkw(ukwVar, uogVar, null, b), 15);
                            } else {
                                String str5 = uogVar.h;
                                ih5Var.j(i8, r1g.CYBERSPORT_MAIN);
                                boolean z = uogVar.f;
                                if (z && str3.length() > 0) {
                                    uzg uzgVar3 = (uzg) hzgVar;
                                    uzgVar3.getClass();
                                    uzgVar3.i.a(str3);
                                } else if (!z || str5.length() <= 0) {
                                    CyberGamesPage cyberGamesPage2 = ((zjw) ukwVar.D()).g.f7971a;
                                    int i11 = Intrinsics.d(cyberGamesPage2, CyberGamesPage.Real.INSTANCE) ? 45 : Intrinsics.d(cyberGamesPage2, CyberGamesPage.Virtual.INSTANCE) ? 86 : 46;
                                    i1w0 i1w0VarC3 = ((uzg) hzgVar).f36533a.c();
                                    CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0VarC3);
                                    FragmentScreen promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1(i8, i10, i11, false, true);
                                    if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                                    }
                                    ListIterator listIteratorO3 = b1j.o(i1w0VarC3, copyOnWriteArrayListQ3, 0);
                                    while (true) {
                                        paw pawVar3 = (paw) listIteratorO3;
                                        if (!pawVar3.hasNext()) {
                                            break;
                                        }
                                        i1w0VarC3.a((oe50) pawVar3.next());
                                    }
                                } else {
                                    ((uzg) hzgVar).m(str5);
                                }
                                sac.V(jiu0.a(ukwVar), null, null, null, new rkw(ukwVar, uogVar, null, (byte) 1), 15);
                            }
                        }
                    }
                }
            } else if (whwVar instanceof jgw) {
                int i12 = ukw.X;
                ukwVar.Q();
            } else if (whwVar instanceof zgw) {
                int i13 = ukw.X;
                long j6 = ((zgw) whwVar).f44363a;
                if (j6 == -10) {
                    i1w0 i1w0VarC4 = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0VarC4);
                    vqcVar2.getClass();
                    FragmentScreen fragmentScreen = new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1
                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            Object obj10 = vqcVar2.b;
                            eru0.Q1.getClass();
                            return new eru0();
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
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                    }
                    ListIterator listIteratorO4 = b1j.o(i1w0VarC4, copyOnWriteArrayListQ4, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO4;
                        if (!pawVar4.hasNext()) {
                            break;
                        }
                        i1w0VarC4.a((oe50) pawVar4.next());
                    }
                } else if (j6 == -11) {
                    ukwVar.Q();
                } else {
                    jih jihVar3 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                    if (jihVar3 != null) {
                        Object obj10 = jihVar3.b;
                        e0g0 e0g0Var2 = j0g0.b;
                        if (obj10 instanceof g0g0) {
                            obj10 = null;
                        }
                        List list5 = (List) obj10;
                        if (list5 != null) {
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj7 = null;
                                    break;
                                }
                                Object next5 = it2.next();
                                if (((ypl0) next5).f43037a == j6) {
                                    obj7 = next5;
                                    break;
                                }
                            }
                            ypl0 ypl0Var = (ypl0) obj7;
                            if (ypl0Var != null) {
                                long j7 = ypl0Var.f43037a;
                                Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(j7, ((zjw) ukwVar.D()).g.f7971a);
                                long jLongValue = ((Number) pairC.f46059a).longValue();
                                long jLongValue2 = ((Number) pairC.b).longValue();
                                if (((zjw) ukwVar.D()).f) {
                                    r1gVar4 = r1g.POPULAR_NEW_ESPORTS;
                                } else if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Real) {
                                    r1gVar4 = r1g.CYBERSPORT_REAL;
                                } else if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Virtual) {
                                    r1gVar4 = r1g.CYBERSPORT_VIRTUAL;
                                } else {
                                    if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.OneXCyber) {
                                        r1gVar4 = r1g.CYBER;
                                    }
                                    ((uzg) hzgVar).c(j7, ((zjw) ukwVar.D()).g.f7971a, k1g.OPEN_REGULAR);
                                }
                                r1g r1gVar5 = r1gVar4;
                                ukwVar.w.l(jLongValue, jLongValue2, r1gVar5, null, null);
                                ukwVar.y.m(jLongValue, jLongValue2, r1gVar5.f29679a, null, null);
                                ((uzg) hzgVar).c(j7, ((zjw) ukwVar.D()).g.f7971a, k1g.OPEN_REGULAR);
                            }
                        }
                    }
                }
            } else if (whwVar instanceof kgw) {
                int i14 = ukw.X;
                zr1Var.f44833a.a(xun.f41520a, 12021L);
                ih5Var.f14765a.c("cyber_partner_call");
                ((uzg) hzgVar).i("");
            } else if (whwVar instanceof nhw) {
                int i15 = ukw.X;
                zr1Var.f44833a.a(xun.f41520a, 12021L);
                ih5Var.f14765a.c("cyber_partner_call");
                ((uzg) hzgVar).i(((nhw) whwVar).f23555a);
            } else if (whwVar instanceof hhw) {
                int i16 = ukw.X;
                ukwVar.U();
            } else if (whwVar instanceof rgw) {
                int i17 = ukw.X;
                ukwVar.S();
            } else if (whwVar instanceof xgw) {
                long j8 = ((xgw) whwVar).f40859a;
                int i18 = ukw.X;
                jih jihVar4 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar4 != null) {
                    Object obj11 = jihVar4.f;
                    e0g0 e0g0Var3 = j0g0.b;
                    if (obj11 instanceof g0g0) {
                        obj11 = null;
                    }
                    Collection collection = (List) obj11;
                    if (collection == null) {
                        collection = iun.f15405a;
                    }
                    Object obj12 = jihVar4.g;
                    if (obj12 instanceof g0g0) {
                        obj12 = null;
                    }
                    Iterable iterable = (List) obj12;
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    Iterator it3 = CollectionsKt.q0(collection, iterable).iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (((nyg) next3).g != j8);
                    nyg nygVar = (nyg) next3;
                    if (nygVar != null) {
                        boolean zContains = ((zjw) ukwVar.D()).b.c.p.contains(Long.valueOf(j8));
                        Iterator it4 = luuVar.f20692a.a().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            Object next6 = it4.next();
                            lok0 lok0Var = (lok0) next6;
                            if (lok0Var.f20396a == nygVar.h && lok0Var.t.contains(1)) {
                                obj6 = next6;
                                break;
                            }
                        }
                        lok0 lok0Var2 = (lok0) obj6;
                        long j9 = nygVar.i;
                        if (j9 == 40) {
                            j9 = nygVar.l;
                        }
                        if (zContains) {
                            ((uzg) hzgVar).g();
                        } else if (lok0Var2 != null) {
                            long j10 = lok0Var2.f20396a;
                            ukwVar.N(j10, lok0Var2.f, lok0Var2.g, ((zjw) ukwVar.D()).f, nygVar.m);
                            ((uzg) hzgVar).o(j10, lok0Var2.b);
                        } else {
                            ukwVar.N(nygVar.g, nygVar.i, nygVar.l, ((zjw) ukwVar.D()).f, nygVar.m);
                            long j11 = nygVar.g;
                            String str6 = nygVar.f;
                            byte b3 = ((zjw) ukwVar.D()).g.f7971a.f46556a;
                            k1g k1gVar = k1g.OPEN_REGULAR;
                            ((uzg) hzgVar).f(str6, j9, j11, b3);
                        }
                    }
                }
            } else if (whwVar instanceof lhw) {
                lhw lhwVar = (lhw) whwVar;
                int i19 = ukw.X;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    zjwVar = (zjw) value;
                    oyg0Var.getClass();
                    linkedHashMapP = xp20.p(zjwVar.l);
                    linkedHashMapP.put(zjwVar.g.f7971a, lhwVar.f20077a);
                } while (!p7m0Var2.m(value, zjw.a(zjwVar, null, null, null, false, null, false, linkedHashMapP, null, null, null, null, null, 522239)));
            } else if (whwVar instanceof rhw) {
                rhw rhwVar = (rhw) whwVar;
                int i20 = rhwVar.f30508a;
                int i21 = ukw.X;
                boolean z2 = ((zjw) ukwVar.D()).f;
                if (z2) {
                    r1gVar2 = r1g.POPULAR_ESPORT;
                } else if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Real) {
                    r1gVar2 = r1g.CYBERSPORT_REAL;
                } else if (!(((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Virtual)) {
                    if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.OneXCyber) {
                        r1gVar2 = r1g.CYBER_VIRTUAL;
                    }
                    fragmentScreenH = ukwVar.F.h(i20, rhwVar.b);
                    i1w0VarC = oeg0Var.c();
                    copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    if (fragmentScreenH instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                    }
                    listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        pawVar = (paw) listIteratorO;
                        if (!pawVar.hasNext()) {
                            break;
                        }
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                } else {
                    r1gVar2 = r1g.CYBERSPORT_VIRTUAL;
                }
                if (z2) {
                    r1gVar3 = r1g.POPULAR_ESPORT;
                } else if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Real) {
                    r1gVar3 = r1g.CYBERSPORT_REAL;
                } else if (!(((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Virtual)) {
                    if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.OneXCyber) {
                        r1gVar3 = r1g.CYBER_VIRTUAL;
                    }
                    fragmentScreenH = ukwVar.F.h(i20, rhwVar.b);
                    i1w0VarC = oeg0Var.c();
                    copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    if (fragmentScreenH instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                    }
                    listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        pawVar = (paw) listIteratorO;
                        if (!pawVar.hasNext()) {
                            break;
                            break;
                        }
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                } else {
                    r1gVar3 = r1g.CYBERSPORT_VIRTUAL;
                }
                ih5Var.getClass();
                ih5Var.f14765a.a("cyber_champ_call", xp20.f(new Pair("championship_id", Integer.valueOf(i20)), new Pair("screen", r1gVar2.f29679a)));
                String str7 = r1gVar3.f29679a;
                zr1Var.getClass();
                zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(i20, (byte) 2), new j1p(str7, (byte) 0)}), 11102L);
                fragmentScreenH = ukwVar.F.h(i20, rhwVar.b);
                i1w0VarC = oeg0Var.c();
                copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                if (fragmentScreenH instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                }
                listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                        break;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
            } else if (whwVar instanceof mgw) {
                int i22 = ukw.X;
                ukwVar.R();
            } else if (whwVar instanceof igw) {
                int i23 = ukw.X;
                i1w0 i1w0VarC5 = oeg0Var.c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC5, i1w0VarC5);
                vqcVar2.getClass();
                k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        Object obj13 = vqcVar2.b;
                        eru0.Q1.getClass();
                        return new eru0();
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
                ListIterator listIteratorO5 = b1j.o(i1w0VarC5, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO5;
                    if (!pawVar5.hasNext()) {
                        break;
                    }
                    i1w0VarC5.a((oe50) pawVar5.next());
                }
            } else if (whwVar instanceof sgw) {
                sgw sgwVar = (sgw) whwVar;
                int i24 = ukw.X;
                jih jihVar5 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar5 != null) {
                    Object obj13 = jihVar5.h;
                    e0g0 e0g0Var4 = j0g0.b;
                    if (obj13 instanceof g0g0) {
                        obj13 = null;
                    }
                    List list6 = (List) obj13;
                    if (list6 != null) {
                        Iterator it5 = list6.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            Object next7 = it5.next();
                            if (((oru0) next7).f25753a == sgwVar.f32182a) {
                                obj5 = next7;
                                break;
                            }
                        }
                        oru0 oru0Var = (oru0) obj5;
                        if (oru0Var != null) {
                            oeg0Var.c().d(new okw(ukwVar, oru0Var, b));
                            vqcVar.k(pzb.C(new h7w((byte) 8)));
                        }
                    }
                }
            } else if (whwVar instanceof ygw) {
                int i25 = ukw.X;
                int iOrdinal = ((ygw) whwVar).f42606a.ordinal();
                if (iOrdinal == 0) {
                    ukwVar.P();
                } else if (iOrdinal == 1) {
                    ukwVar.U();
                } else if (iOrdinal == 2) {
                    ukwVar.S();
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    i1w0 i1w0VarC6 = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0VarC6);
                    vqcVar2.getClass();
                    FragmentScreen fragmentScreen2 = new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1
                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                        public final Fragment a(m1r m1rVar) {
                            m1rVar.getClass();
                            Object obj14 = vqcVar2.b;
                            eru0.Q1.getClass();
                            return new eru0();
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
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen2)));
                    } else {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen2)));
                    }
                    ListIterator listIteratorO6 = b1j.o(i1w0VarC6, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (!pawVar6.hasNext()) {
                            break;
                        }
                        i1w0VarC6.a((oe50) pawVar6.next());
                    }
                }
            } else if (whwVar instanceof thw) {
                int i26 = ukw.X;
                fdv0 fdv0Var = ((thw) whwVar).f33980a;
                if (Intrinsics.d(fdv0Var, adv0.f699a)) {
                    ukwVar.S();
                } else if (Intrinsics.d(fdv0Var, cdv0.f4183a)) {
                    ukwVar.U();
                } else if (Intrinsics.d(fdv0Var, edv0.f7639a)) {
                    ukwVar.R();
                }
            } else if (whwVar instanceof uhw) {
                uhw uhwVar = (uhw) whwVar;
                int i27 = ukw.X;
                jih jihVar6 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar6 != null) {
                    Object obj14 = jihVar6.c;
                    e0g0 e0g0Var5 = j0g0.b;
                    if (obj14 instanceof g0g0) {
                        obj14 = null;
                    }
                    list = (List) obj14;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                if (jihVar6 != null) {
                    Object obj15 = jihVar6.d;
                    e0g0 e0g0Var6 = j0g0.b;
                    if (obj15 instanceof g0g0) {
                        obj15 = null;
                    }
                    list2 = (List) obj15;
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(list, list2);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
                Iterator it6 = arrayListQ0.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((eih) it6.next()).e);
                }
                Iterator it7 = r3d.r(arrayList).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    Object next8 = it7.next();
                    if (((d0t) next8).f5282a == uhwVar.c) {
                        obj4 = next8;
                        break;
                    }
                }
                d0t d0tVar = (d0t) obj4;
                if (d0tVar != null) {
                    ukwVar.T(new chw(new pid(d0tVar.f5282a)));
                }
            } else if (whwVar instanceof ahw) {
                ahw ahwVar = (ahw) whwVar;
                int i28 = ukw.X;
                boolean zU = kpb.u(ahwVar.f895a);
                long j12 = ahwVar.b;
                if (zU) {
                    ukwVar.H(new a21((byte) 19, j12));
                } else {
                    ukwVar.H(new a21((byte) 20, j12));
                }
            } else if (whwVar instanceof lgw) {
                int i29 = ukw.X;
                CyberGamesPage cyberGamesPage3 = ((zjw) ukwVar.D()).g.f7971a;
                boolean zU2 = kpb.u(((lgw) whwVar).f20025a);
                Long l = zU2 ? (Long) ((zjw) ukwVar.D()).m.get(cyberGamesPage3) : (Long) ((zjw) ukwVar.D()).n.get(cyberGamesPage3);
                if (l != null) {
                    Pair pairC2 = org.xplatform.cyber.section.api.domain.entity.d.c(l.longValue(), cyberGamesPage3);
                    long jLongValue3 = ((Number) pairC2.f46059a).longValue();
                    long jLongValue4 = ((Number) pairC2.b).longValue();
                    byte b4 = cyberGamesPage3.f46556a;
                    if (((zjw) ukwVar.D()).f) {
                        ukwVar.z.i0(zU2 ? i1g.POPULAR_LIVE : i1g.POPULAR_LINE, jLongValue3, jLongValue4);
                    } else {
                        ukwVar.z.h0(jLongValue3, jLongValue4, org.xplatform.cyber.section.api.domain.entity.d.e(b4));
                        jLongValue4 = jLongValue4;
                        jLongValue3 = jLongValue3;
                    }
                    ((uzg) hzgVar).e(b4, jLongValue3, jLongValue4, zU2);
                }
            } else if (whwVar instanceof wgw) {
                int i30 = ukw.X;
                ((uzg) hzgVar).d(((zjw) ukwVar.D()).g.f7971a.f46556a, kotlin.collections.a.c(Long.valueOf(((wgw) whwVar).f39136a)), true);
            } else if (whwVar instanceof vgw) {
                int i31 = ukw.X;
                ((uzg) hzgVar).d(((zjw) ukwVar.D()).g.f7971a.f46556a, kotlin.collections.a.c(Long.valueOf(((vgw) whwVar).f37402a)), false);
            } else if (whwVar instanceof ugw) {
                ugw ugwVar = (ugw) whwVar;
                int i32 = ukw.X;
                jih jihVar7 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar7 != null) {
                    Object obj16 = jihVar7.i;
                    e0g0 e0g0Var7 = j0g0.b;
                    if (obj16 instanceof g0g0) {
                        obj16 = null;
                    }
                    List list7 = (List) obj16;
                    if (list7 != null) {
                        Iterator it8 = list7.iterator();
                        do {
                            if (!it8.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it8.next();
                        } while (((xah) next2).g != ugwVar.f35646a);
                        xah xahVar = (xah) next2;
                        if (xahVar != null) {
                            CyberGamesParentSectionModel cyberGamesParentSectionModel = ukwVar.o.b;
                            if (Intrinsics.d(cyberGamesParentSectionModel, CyberGamesParentSectionModel.FromNewPopular.INSTANCE)) {
                                ukwVar.W(xahVar, r1g.POPULAR_NEW_ESPORTS);
                            } else if (Intrinsics.d(cyberGamesParentSectionModel, CyberGamesParentSectionModel.FromMain.INSTANCE) || Intrinsics.d(cyberGamesParentSectionModel, CyberGamesParentSectionModel.FromSection.INSTANCE)) {
                                ukwVar.W(xahVar, r1g.CYBERSPORT_MAIN);
                            } else if (!Intrinsics.d(cyberGamesParentSectionModel, CyberGamesParentSectionModel.FromGame.INSTANCE) && !Intrinsics.d(cyberGamesParentSectionModel, CyberGamesParentSectionModel.FromPopular.INSTANCE)) {
                                t9f.b();
                                return null;
                            }
                            oeg0Var.c().d(new k9v((Object) ukwVar, (Object) new npn(xahVar.g, xahVar.i, Long.valueOf(xahVar.k), xahVar.n), (Object) xahVar, (byte) 4));
                        }
                    }
                }
            } else if (whwVar instanceof tgw) {
                tgw tgwVar = (tgw) whwVar;
                int i33 = ukw.X;
                jih jihVar8 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar8 != null) {
                    Object obj17 = jihVar8.i;
                    e0g0 e0g0Var8 = j0g0.b;
                    if (obj17 instanceof g0g0) {
                        obj17 = null;
                    }
                    List list8 = (List) obj17;
                    if (list8 != null) {
                        Iterator it9 = list8.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            Object next9 = it9.next();
                            if (((xah) next9).g == tgwVar.f33934a) {
                                obj3 = next9;
                                break;
                            }
                        }
                        xah xahVar2 = (xah) obj3;
                        if (xahVar2 != null) {
                            if (((zjw) ukwVar.D()).f) {
                                r1gVar = r1g.POPULAR_NEW_ESPORTS;
                            } else {
                                if (((zjw) ukwVar.D()).g.f7971a instanceof CyberGamesPage.Real) {
                                    r1gVar = r1g.CYBERSPORT_REAL;
                                }
                                ((uzg) hzgVar).c(xahVar2.k, ((zjw) ukwVar.D()).g.f7971a, k1g.OPEN_REGULAR);
                            }
                            r1g r1gVar6 = r1gVar;
                            ih5 ih5Var2 = ukwVar.w;
                            long j13 = xahVar2.i;
                            boolean z3 = xahVar2.n;
                            long j14 = xahVar2.g;
                            ih5Var2.l(j13, xahVar2.k, r1gVar6, Long.valueOf(j14), Boolean.valueOf(z3));
                            ukwVar.y.m(xahVar2.i, xahVar2.k, r1gVar6.f29679a, Long.valueOf(j14), Boolean.valueOf(z3));
                            ((uzg) hzgVar).c(xahVar2.k, ((zjw) ukwVar.D()).g.f7971a, k1g.OPEN_REGULAR);
                        }
                    }
                }
            } else {
                if (!(whwVar instanceof ohw)) {
                    t9f.b();
                    return null;
                }
                long j15 = ((ohw) whwVar).f25285a;
                int i34 = ukw.X;
                jih jihVar9 = (jih) ((zjw) ukwVar.D()).h.get(((zjw) ukwVar.D()).g.f7971a);
                if (jihVar9 != null) {
                    Object obj18 = jihVar9.i;
                    e0g0 e0g0Var9 = j0g0.b;
                    if (obj18 instanceof g0g0) {
                        obj18 = null;
                    }
                    List list9 = (List) obj18;
                    if (list9 != null) {
                        Iterator it10 = list9.iterator();
                        do {
                            if (!it10.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it10.next();
                        } while (((xah) next).g != j15);
                        xah xahVar3 = (xah) next;
                        if (xahVar3 != null) {
                            boolean zContains2 = ((zjw) ukwVar.D()).b.c.p.contains(Long.valueOf(j15));
                            Iterator it11 = luuVar.f20692a.a().iterator();
                            while (true) {
                                if (!it11.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next10 = it11.next();
                                lok0 lok0Var3 = (lok0) next10;
                                if (lok0Var3.f20396a == xahVar3.h && lok0Var3.t.contains(1)) {
                                    obj2 = next10;
                                    break;
                                }
                            }
                            lok0 lok0Var4 = (lok0) obj2;
                            long j16 = xahVar3.i;
                            if (j16 == 40) {
                                j16 = xahVar3.k;
                            }
                            if (zContains2) {
                                ((uzg) hzgVar).g();
                            } else if (lok0Var4 != null) {
                                long j17 = lok0Var4.f20396a;
                                ukwVar.N(j17, lok0Var4.f, lok0Var4.g, ((zjw) ukwVar.D()).f, xahVar3.n);
                                ((uzg) hzgVar).o(j17, lok0Var4.b);
                            } else {
                                ukwVar.N(xahVar3.g, xahVar3.i, xahVar3.k, ((zjw) ukwVar.D()).f, xahVar3.n);
                                long j18 = xahVar3.g;
                                String str8 = xahVar3.f;
                                byte b5 = ((zjw) ukwVar.D()).g.f7971a.f46556a;
                                k1g k1gVar2 = k1g.OPEN_REGULAR;
                                ((uzg) hzgVar).f(str8, j16, j18, b5);
                            }
                        }
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new kaw((naw) this.j, (n3w) obj2, yjeVar, (byte) 0);
            case 1:
                return new kaw((scw) this.j, (hfw) obj2, yjeVar, (byte) 1);
            case 2:
                return new kaw((Function1) this.j, (bjw) obj2, yjeVar, (byte) 2);
            case 3:
                kaw kawVar = new kaw((tkw) obj2, yjeVar, (byte) 3);
                kawVar.j = obj;
                return kawVar;
            case 4:
                return new kaw((whw) this.j, (ukw) obj2, yjeVar, (byte) 4);
            case 5:
                kaw kawVar2 = new kaw((snw) obj2, yjeVar, (byte) 5);
                kawVar2.j = obj;
                return kawVar2;
            case 6:
                kaw kawVar3 = new kaw((yow) obj2, yjeVar, (byte) 6);
                kawVar3.j = obj;
                return kawVar3;
            case 7:
                kaw kawVar4 = new kaw((qqw) obj2, yjeVar, (byte) 7);
                kawVar4.j = obj;
                return kawVar4;
            case 8:
                kaw kawVar5 = new kaw((yax) obj2, yjeVar, (byte) 8);
                kawVar5.j = obj;
                return kawVar5;
            case 9:
                kaw kawVar6 = new kaw((Function0) obj2, yjeVar, (byte) 9);
                kawVar6.j = obj;
                return kawVar6;
            case 10:
                kaw kawVar7 = new kaw((hzx) obj2, yjeVar, (byte) 10);
                kawVar7.j = obj;
                return kawVar7;
            case 11:
                kaw kawVar8 = new kaw((a2y) obj2, yjeVar, (byte) 11);
                kawVar8.j = obj;
                return kawVar8;
            case 12:
                kaw kawVar9 = new kaw((d4y) obj2, yjeVar, (byte) 12);
                kawVar9.j = obj;
                return kawVar9;
            case 13:
                kaw kawVar10 = new kaw((c5y) obj2, yjeVar, (byte) 13);
                kawVar10.j = obj;
                return kawVar10;
            case 14:
                kaw kawVar11 = new kaw((e6y) obj2, yjeVar, (byte) 14);
                kawVar11.j = obj;
                return kawVar11;
            case 15:
                kaw kawVar12 = new kaw((jty) obj2, yjeVar, (byte) 15);
                kawVar12.j = obj;
                return kawVar12;
            case 16:
                kaw kawVar13 = new kaw((u1z) obj2, yjeVar, (byte) 16);
                kawVar13.j = obj;
                return kawVar13;
            case 17:
                kaw kawVar14 = new kaw((tkz) obj2, yjeVar, (byte) 17);
                kawVar14.j = obj;
                return kawVar14;
            case 18:
                kaw kawVar15 = new kaw((gb00) obj2, yjeVar, (byte) 18);
                kawVar15.j = obj;
                return kawVar15;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kaw kawVar16 = new kaw((ef00) obj2, yjeVar, (byte) 19);
                kawVar16.j = obj;
                return kawVar16;
            case 20:
                kaw kawVar17 = new kaw((qi00) obj2, yjeVar, (byte) 20);
                kawVar17.j = obj;
                return kawVar17;
            case 21:
                kaw kawVar18 = new kaw((yl00) obj2, yjeVar, (byte) 21);
                kawVar18.j = obj;
                return kawVar18;
            case 22:
                return new kaw((xm00) this.j, (Throwable) obj2, yjeVar, (byte) 22);
            case 23:
                kaw kawVar19 = new kaw((co00) obj2, yjeVar, (byte) 23);
                kawVar19.j = obj;
                return kawVar19;
            case 24:
                kaw kawVar20 = new kaw((bq00) obj2, yjeVar, (byte) 24);
                kawVar20.j = obj;
                return kawVar20;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kaw kawVar21 = new kaw((LocalTimeDiffWorker) obj2, yjeVar, (byte) 25);
                kawVar21.j = obj;
                return kawVar21;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kaw kawVar22 = new kaw((ct00) obj2, yjeVar, (byte) 26);
                kawVar22.j = obj;
                return kawVar22;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kaw kawVar23 = new kaw((k210) obj2, yjeVar, (byte) 27);
                kawVar23.j = obj;
                return kawVar23;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kaw kawVar24 = new kaw((b310) obj2, yjeVar, (byte) 28);
                kawVar24.j = obj;
                return kawVar24;
            default:
                return new kaw((ge10) this.j, (List) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kaw) create((viw) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kaw) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kaw) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((kaw) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((kaw) create((fbx) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((kaw) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((kaw) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((kaw) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((kaw) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((kaw) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((kaw) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((kaw) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((kaw) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((kaw) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((kaw) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((kaw) create((tm00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((kaw) create((sf50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((kaw) create((jt00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((kaw) create((w210) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((kaw) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kaw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0841  */
    /* JADX WARN: Code duplicated, block: B:281:0x084f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0851  */
    /* JADX WARN: Code duplicated, block: B:285:0x0856 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x0859  */
    /* JADX WARN: Code duplicated, block: B:290:0x085e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0900  */
    /* JADX WARN: Code duplicated, block: B:315:0x090e  */
    /* JADX WARN: Code duplicated, block: B:316:0x0910  */
    /* JADX WARN: Code duplicated, block: B:319:0x0915 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x0917  */
    /* JADX WARN: Code duplicated, block: B:323:0x091c  */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0612, code lost:
    
        if ((r0 instanceof a.bbx) != false) goto L202;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kaw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kaw(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
