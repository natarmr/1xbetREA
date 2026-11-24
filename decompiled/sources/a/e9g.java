package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class e9g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9g(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object l(Object obj) {
        rek0 rek0Var = rek0.b;
        u8k u8kVar = (u8k) this.k;
        nak nakVar = (nak) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (nakVar != null) {
            if (nakVar instanceof kak) {
                String str = ((kak) nakVar).f17967a;
                kwd kwdVar = u8k.Q1;
                u8kVar.G0().e.setError(str);
                Context contextD = u8kVar.D();
                if (contextD != null) {
                    u8kVar.G0().e.setErrorIconDrawable(epv0.U(R.drawable.ic_warning, contextD));
                }
            } else if (nakVar instanceof jak) {
                String str2 = ((jak) nakVar).f16193a;
                kwd kwdVar2 = u8k.Q1;
                ii iiVar = u8kVar.L1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = u8kVar.H(R.string.error);
                String strH2 = u8kVar.H(R.string.ok_new);
                strH2.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str2, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                androidx.fragment.app.e eVarC = u8kVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
            } else if (nakVar instanceof mak) {
                String str3 = ((mak) nakVar).f21461a;
                kwd kwdVar3 = u8k.Q1;
                wdk0 wdk0Var = u8kVar.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var, new xdk0(rek0Var, str3, null, null, null, null, 124), u8kVar, null, null, false, null, 1020);
            } else if (nakVar instanceof lak) {
                kwd kwdVar4 = u8k.Q1;
                wdk0 wdk0Var2 = u8kVar.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                String strH3 = u8kVar.H(R.string.something_went_wrong);
                strH3.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH3, null, null, null, null, 124), u8kVar, null, null, false, null, 1020);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x041a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0433  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object m(Object obj) {
        Object obj2;
        j0g0 j0g0Var;
        String str;
        Object obj3;
        kuk kukVar;
        List list;
        List list2;
        Object obj4;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        Object value;
        Object next;
        Object obj5;
        List list3;
        List list4;
        Object next2;
        Object obj6;
        rek0 rek0Var = rek0.b;
        atk atkVar = (atk) this.k;
        luu luuVar = atkVar.w;
        ctf0 ctf0Var = atkVar.s;
        zr1 zr1Var = atkVar.y;
        ih5 ih5Var = atkVar.x;
        mne mneVar = atkVar.q;
        hzg hzgVar = atkVar.p;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        hpk hpkVar = (hpk) this.j;
        if (hpkVar.equals(pok.f27333a)) {
            int i = atk.J;
            ((uzg) hzgVar).a();
        } else if (hpkVar.equals(epk.f8191a)) {
            int i2 = atk.J;
            ((ise0) atkVar.H.getValue()).f();
            ((ise0) atkVar.I.getValue()).f();
        } else {
            byte b = 2;
            yje yjeVar = null;
            byte b2 = 0;
            if (hpkVar instanceof yok) {
                yok yokVar = (yok) hpkVar;
                int i3 = atk.J;
                try {
                    String str2 = yokVar.f42990a;
                    switch (str2.hashCode()) {
                        case -1844391406:
                            if (str2.equals("HEADER_CHAMPIONSHIPS_REAL_LINE")) {
                                atkVar.U(false);
                            }
                            break;
                        case -1844391158:
                            if (str2.equals("HEADER_CHAMPIONSHIPS_REAL_LIVE")) {
                                atkVar.U(true);
                            }
                            break;
                        case -1637770166:
                            if (str2.equals("EXPAND_MARKET_CHIP")) {
                                qjj.W(jiu0.a(atkVar), mneVar.f22085a, null, new ysk(atkVar, yjeVar, b), 2);
                            }
                            break;
                        case -1460972664:
                            if (str2.equals("HEADER_LINE_GAMES")) {
                                atkVar.N();
                            }
                            break;
                        case -1316278071:
                            if (str2.equals("META_HEROES_CHIP")) {
                                uzg uzgVar = (uzg) hzgVar;
                                uzgVar.f36533a.c().d(new pzg(uzgVar, atkVar.o.f46554a, b2));
                            }
                            break;
                        case -403391872:
                            if (str2.equals("HEADER_LIVE_GAMES")) {
                                atkVar.O();
                            }
                            break;
                        case 6064284:
                            if (str2.equals("HEADER_CHAMPIONSHIPS")) {
                                atkVar.M();
                            }
                            break;
                        case 789502958:
                            if (str2.equals("LEADERBOARD_CHIP")) {
                                atkVar.S(true);
                            }
                            break;
                        case 813478061:
                            if (str2.equals("CALENDAR_CHIP")) {
                                atkVar.Q();
                            }
                            break;
                        case 1131337760:
                            if (str2.equals("TRANSFER_CHIP")) {
                                atkVar.V();
                            }
                            break;
                        case 1945994132:
                            if (str2.equals("MATCH_RESULT_CHIP")) {
                                atkVar.T();
                            }
                            break;
                        case 1997368207:
                            if (str2.equals("HEADER_ACTIVE_TEAMS")) {
                                atkVar.P();
                            }
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            } else if (hpkVar instanceof wok) {
                int i4 = atk.J;
                atkVar.R((wok) hpkVar);
            } else {
                boolean z = hpkVar instanceof cpk;
                String str3 = "cyber_champs_games";
                yvg yvgVar = yvg.d;
                pug pugVar = pug.d;
                oxg oxgVar = oxg.d;
                trg trgVar = trg.d;
                ttg ttgVar = ttg.d;
                if (z) {
                    cpk cpkVar = (cpk) hpkVar;
                    int i5 = atk.J;
                    List listJ = q3d.j(ttgVar, trgVar, oxgVar, pugVar, yvgVar);
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    for (Iterator it = listJ.iterator(); it.hasNext(); it = it) {
                        arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
                    }
                    if (arrayList.contains(Long.valueOf(((ksk) atkVar.D()).f18817a.f46554a))) {
                        ih5Var.p(r1g.CYBERSPORT_CHAMPS_GAMES, ((ksk) atkVar.D()).f18817a.f46554a);
                        zr1Var.z(((ksk) atkVar.D()).f18817a.f46554a, "cyber_champs_games");
                        ((uzg) hzgVar).n(((ksk) atkVar.D()).f18817a.f46554a, cpkVar.f4751a, cpkVar.b, k1g.OPEN_REGULAR);
                    } else {
                        atkVar.G(new isk(new xdk0(rek0Var, ctf0Var.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                    }
                } else if (hpkVar instanceof tok) {
                    long j = ((tok) hpkVar).f34288a;
                    int i6 = atk.J;
                    j0g0 j0g0Var4 = ((ksk) atkVar.D()).d;
                    if (j0g0Var4 != null) {
                        Object obj7 = j0g0Var4.f15681a;
                        if (obj7 instanceof g0g0) {
                            obj7 = null;
                        }
                        kuk kukVar2 = (kuk) obj7;
                        if (kukVar2 != null) {
                            j0g0 j0g0Var5 = kukVar2.f18914a;
                            if (j0g0Var5 != null) {
                                Object obj8 = j0g0Var5.f15681a;
                                if (obj8 instanceof g0g0) {
                                    obj8 = null;
                                }
                                list3 = (List) obj8;
                            } else {
                                list3 = null;
                            }
                            if (list3 == null) {
                                list3 = iun.f15405a;
                            }
                            j0g0 j0g0Var6 = kukVar2.b;
                            if (j0g0Var6 != null) {
                                Object obj9 = j0g0Var6.f15681a;
                                if (obj9 instanceof g0g0) {
                                    obj9 = null;
                                }
                                list4 = (List) obj9;
                            } else {
                                list4 = null;
                            }
                            if (list4 == null) {
                                list4 = iun.f15405a;
                            }
                            Iterator it2 = CollectionsKt.q0(list3, list4).iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((nyg) next2).g != j);
                            nyg nygVar = (nyg) next2;
                            if (nygVar != null) {
                                boolean zContains = ((ksk) atkVar.D()).b.c.p.contains(Long.valueOf(j));
                                Iterator it3 = luuVar.f20692a.a().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj6 = null;
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    lok0 lok0Var = (lok0) next3;
                                    if (lok0Var.f20396a == nygVar.h && lok0Var.t.contains(1)) {
                                        obj6 = next3;
                                        break;
                                    }
                                }
                                lok0 lok0Var2 = (lok0) obj6;
                                long j2 = nygVar.i;
                                if (j2 == 40) {
                                    j2 = nygVar.l;
                                }
                                long j3 = j2;
                                if (zContains) {
                                    ((uzg) hzgVar).g();
                                } else if (lok0Var2 != null) {
                                    ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
                                } else {
                                    long j4 = nygVar.g;
                                    String str4 = nygVar.f;
                                    byte b3 = ((ksk) atkVar.D()).f18817a.b.f46556a;
                                    k1g k1gVar = k1g.OPEN_REGULAR;
                                    ((uzg) hzgVar).f(str4, j3, j4, b3);
                                }
                            }
                        }
                    }
                } else if (hpkVar instanceof dpk) {
                    long j5 = ((dpk) hpkVar).f6471a;
                    int i7 = atk.J;
                    j0g0 j0g0Var7 = ((ksk) atkVar.D()).d;
                    if (j0g0Var7 != null) {
                        Object obj10 = j0g0Var7.f15681a;
                        if (obj10 instanceof g0g0) {
                            obj10 = null;
                        }
                        kuk kukVar3 = (kuk) obj10;
                        if (kukVar3 != null) {
                            Object obj11 = kukVar3.j;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            List list5 = (List) obj11;
                            if (list5 != null) {
                                Iterator it4 = list5.iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it4.next();
                                } while (((xah) next).g != j5);
                                xah xahVar = (xah) next;
                                if (xahVar != null) {
                                    boolean zContains2 = ((ksk) atkVar.D()).b.c.p.contains(Long.valueOf(j5));
                                    Iterator it5 = luuVar.f20692a.a().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            obj5 = null;
                                            break;
                                        }
                                        Object next4 = it5.next();
                                        lok0 lok0Var3 = (lok0) next4;
                                        if (lok0Var3.f20396a == xahVar.h && lok0Var3.t.contains(1)) {
                                            obj5 = next4;
                                            break;
                                        }
                                    }
                                    lok0 lok0Var4 = (lok0) obj5;
                                    long j6 = xahVar.i;
                                    if (j6 == 40) {
                                        j6 = xahVar.k;
                                    }
                                    long j7 = j6;
                                    if (zContains2) {
                                        ((uzg) hzgVar).g();
                                    } else if (lok0Var4 != null) {
                                        ((uzg) hzgVar).o(lok0Var4.f20396a, lok0Var4.b);
                                    } else {
                                        long j8 = xahVar.g;
                                        String str5 = xahVar.f;
                                        byte b4 = ((ksk) atkVar.D()).f18817a.b.f46556a;
                                        k1g k1gVar2 = k1g.OPEN_REGULAR;
                                        ((uzg) hzgVar).f(str5, j7, j8, b4);
                                    }
                                }
                            }
                        }
                    }
                } else if (hpkVar instanceof bpk) {
                    bpk bpkVar = (bpk) hpkVar;
                    int i8 = atk.J;
                    p7m0 p7m0Var = atkVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        atkVar.f.getClass();
                    } while (!p7m0Var.m(value, ksk.a((ksk) value, null, null, bpkVar.f2988a, 383)));
                } else if (hpkVar instanceof gpk) {
                    gpk gpkVar = (gpk) hpkVar;
                    int i9 = atk.J;
                    j0g0 j0g0Var8 = ((ksk) atkVar.D()).d;
                    if (j0g0Var8 != null) {
                        Object obj12 = j0g0Var8.f15681a;
                        if (obj12 instanceof g0g0) {
                            obj12 = null;
                        }
                        kukVar = (kuk) obj12;
                    } else {
                        kukVar = null;
                    }
                    if (kukVar == null || (j0g0Var3 = kukVar.c) == null) {
                        list = null;
                    } else {
                        Object obj13 = j0g0Var3.f15681a;
                        if (obj13 instanceof g0g0) {
                            obj13 = null;
                        }
                        btk btkVar = (btk) obj13;
                        if (btkVar != null) {
                            list = btkVar.f3186a;
                        } else {
                            list = null;
                        }
                    }
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    if (kukVar == null || (j0g0Var2 = kukVar.d) == null) {
                        list2 = null;
                    } else {
                        Object obj14 = j0g0Var2.f15681a;
                        if (obj14 instanceof g0g0) {
                            obj14 = null;
                        }
                        btk btkVar2 = (btk) obj14;
                        if (btkVar2 != null) {
                            list2 = btkVar2.f3186a;
                        } else {
                            list2 = null;
                        }
                    }
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    Iterator it6 = CollectionsKt.q0(list, list2).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        Object next5 = it6.next();
                        if (((d0t) next5).f5282a == gpkVar.c) {
                            obj4 = next5;
                            break;
                        }
                    }
                    d0t d0tVar = (d0t) obj4;
                    if (d0tVar != null) {
                        atkVar.R(new uok(new pid(d0tVar.f5282a)));
                    }
                } else if (hpkVar instanceof fpk) {
                    int i10 = atk.J;
                    atkVar.V();
                } else if (hpkVar instanceof zok) {
                    m8m m8mVar = ((zok) hpkVar).f44724a;
                    int i11 = atk.J;
                    List listJ2 = q3d.j(ttgVar, trgVar, oxgVar, pugVar, yvgVar);
                    ArrayList arrayList2 = new ArrayList(r3d.q(listJ2, 10));
                    Iterator it7 = listJ2.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(Long.valueOf(((yxg) it7.next()).f43419a));
                    }
                    j0g0 j0g0Var9 = ((ksk) atkVar.D()).d;
                    if (j0g0Var9 != null) {
                        Object obj15 = j0g0Var9.f15681a;
                        if (obj15 instanceof g0g0) {
                            obj15 = null;
                        }
                        kuk kukVar4 = (kuk) obj15;
                        if (kukVar4 != null && (j0g0Var = kukVar4.i) != null) {
                            Object obj16 = j0g0Var.f15681a;
                            if (obj16 instanceof g0g0) {
                                obj16 = null;
                            }
                            List list6 = (List) obj16;
                            if (list6 != null) {
                                Iterator it8 = list6.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        str = str3;
                                        obj3 = null;
                                        break;
                                    }
                                    Object next6 = it8.next();
                                    str = str3;
                                    if (((esk) next6).b == m8mVar.f21377a) {
                                        obj3 = next6;
                                        break;
                                    }
                                    str3 = str;
                                }
                                esk eskVar = (esk) obj3;
                                if (eskVar != null) {
                                    if (arrayList2.contains(Long.valueOf(((ksk) atkVar.D()).f18817a.f46554a)) && eskVar.g) {
                                        ih5Var.p(r1g.CYBERSPORT_CHAMPS_GAMES, ((ksk) atkVar.D()).f18817a.f46554a);
                                        zr1Var.z(((ksk) atkVar.D()).f18817a.f46554a, str);
                                        ((uzg) hzgVar).n(((ksk) atkVar.D()).f18817a.f46554a, m8mVar.f21377a, m8mVar.b.f38729a, k1g.OPEN_REGULAR);
                                    } else {
                                        atkVar.G(new isk(new xdk0(rek0Var, ctf0Var.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                                    }
                                }
                            }
                        }
                    }
                } else if (hpkVar instanceof apk) {
                    int i12 = atk.J;
                    atkVar.S(false);
                } else if (hpkVar instanceof rok) {
                    long j9 = ((rok) hpkVar).f30842a;
                    int i13 = atk.J;
                    ((uzg) hzgVar).d(((ksk) atkVar.D()).f18817a.b.f46556a, kotlin.collections.a.c(Long.valueOf(j9)), true);
                } else if (hpkVar instanceof qok) {
                    long j10 = ((qok) hpkVar).f29076a;
                    int i14 = atk.J;
                    ((uzg) hzgVar).d(((ksk) atkVar.D()).f18817a.b.f46556a, kotlin.collections.a.c(Long.valueOf(j10)), false);
                } else if (hpkVar instanceof sok) {
                    sok sokVar = (sok) hpkVar;
                    int i15 = atk.J;
                    j0g0 j0g0Var10 = ((ksk) atkVar.D()).d;
                    if (j0g0Var10 != null) {
                        Object obj17 = j0g0Var10.f15681a;
                        if (obj17 instanceof g0g0) {
                            obj17 = null;
                        }
                        kuk kukVar5 = (kuk) obj17;
                        if (kukVar5 != null) {
                            Object obj18 = kukVar5.j;
                            if (obj18 instanceof g0g0) {
                                obj18 = null;
                            }
                            List list7 = (List) obj18;
                            if (list7 != null) {
                                Iterator it9 = list7.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    Object next7 = it9.next();
                                    if (((xah) next7).g == sokVar.f32546a) {
                                        obj2 = next7;
                                        break;
                                    }
                                }
                                xah xahVar2 = (xah) obj2;
                                if (xahVar2 != null) {
                                    long j11 = xahVar2.g;
                                    long j12 = xahVar2.i;
                                    Long lValueOf = Long.valueOf(xahVar2.k);
                                    boolean z2 = xahVar2.n;
                                    npn npnVar = new npn(j11, j12, lValueOf, z2);
                                    atkVar.x.b(xahVar2.i, xahVar2.k, xahVar2.g, r1g.CYBERSPORT_CHAMPS_GAMES, z2, xahVar2.m);
                                    atkVar.y.d(xahVar2.i, xahVar2.k, xahVar2.g, "cyber_champs_games", xahVar2.n, xahVar2.m);
                                    atkVar.C.c().d(new sw8((Object) atkVar, (Object) npnVar, (Object) xahVar2, (byte) 24));
                                }
                            }
                        }
                    }
                } else {
                    if (!hpkVar.equals(xok.f41224a)) {
                        t9f.b();
                        return null;
                    }
                    int i16 = atk.J;
                    qjj.W(jiu0.a(atkVar), mneVar.f22085a, null, new ysk(atkVar, null, b), 2);
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        cuk cukVar = (cuk) this.k;
        ruk rukVar = (ruk) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (rukVar != null) {
            if (rukVar instanceof puk) {
                ArrayList arrayList = ((puk) rukVar).f27621a;
                bek bekVar = cuk.l2;
                cukVar.L0().c.setVisibility(0);
                cukVar.L0().b.setVisibility(8);
                ((qnk) cukVar.h2.getValue()).A(arrayList);
            } else if (rukVar instanceof quk) {
                jkm jkmVar = ((quk) rukVar).f29350a;
                bek bekVar2 = cuk.l2;
                cukVar.L0().b.d(jkmVar);
                cukVar.L0().b.setCenterInParent(false);
                cukVar.L0().c.setVisibility(8);
                cukVar.L0().b.setVisibility(0);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                e9g e9gVar = new e9g((g9g) obj2, yjeVar, (byte) 0);
                e9gVar.j = obj;
                return e9gVar;
            case 1:
                e9g e9gVar2 = new e9g((dcg) obj2, yjeVar, (byte) 1);
                e9gVar2.j = obj;
                return e9gVar2;
            case 2:
                e9g e9gVar3 = new e9g((wcg) obj2, yjeVar, (byte) 2);
                e9gVar3.j = obj;
                return e9gVar3;
            case 3:
                return new e9g((teg) this.j, (jfg) obj2, yjeVar, (byte) 3);
            case 4:
                e9g e9gVar4 = new e9g((igg) obj2, yjeVar, (byte) 4);
                e9gVar4.j = ((j0g0) obj).f15681a;
                return e9gVar4;
            case 5:
                e9g e9gVar5 = new e9g((xig) obj2, yjeVar, (byte) 5);
                e9gVar5.j = obj;
                return e9gVar5;
            case 6:
                return new e9g((vqg) this.j, (String) obj2, yjeVar, (byte) 6);
            case 7:
                e9g e9gVar6 = new e9g((vqg) obj2, yjeVar, (byte) 7);
                e9gVar6.j = obj;
                return e9gVar6;
            case 8:
                return new e9g((k7h) this.j, (pz40) obj2, yjeVar, (byte) 8);
            case 9:
                e9g e9gVar7 = new e9g((lmh) obj2, yjeVar, (byte) 9);
                e9gVar7.j = obj;
                return e9gVar7;
            case 10:
                return new e9g((rsh) this.j, (o5s0) obj2, yjeVar, (byte) 10);
            case 11:
                return new e9g((q1j) this.j, (kwj) obj2, yjeVar, (byte) 11);
            case 12:
                e9g e9gVar8 = new e9g((j2j) obj2, yjeVar, (byte) 12);
                e9gVar8.j = obj;
                return e9gVar8;
            case 13:
                e9g e9gVar9 = new e9g((f3j) obj2, yjeVar, (byte) 13);
                e9gVar9.j = obj;
                return e9gVar9;
            case 14:
                e9g e9gVar10 = new e9g((f7j) obj2, yjeVar, (byte) 14);
                e9gVar10.j = obj;
                return e9gVar10;
            case 15:
                return new e9g((o7j) this.j, (String) obj2, yjeVar, (byte) 15);
            case 16:
                e9g e9gVar11 = new e9g((g7m0) obj2, yjeVar, (byte) 16);
                e9gVar11.j = obj;
                return e9gVar11;
            case 17:
                return new e9g((xgj) this.j, (bhj) obj2, yjeVar, (byte) 17);
            case 18:
                return new e9g((erj) this.j, (rlj) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new e9g((btj) this.j, (String) obj2, yjeVar, (byte) 19);
            case 20:
                e9g e9gVar12 = new e9g((c8k) obj2, yjeVar, (byte) 20);
                e9gVar12.j = obj;
                return e9gVar12;
            case 21:
                e9g e9gVar13 = new e9g((u8k) obj2, yjeVar, (byte) 21);
                e9gVar13.j = obj;
                return e9gVar13;
            case 22:
                return new e9g((p9k) this.j, (k9k) obj2, yjeVar, (byte) 22);
            case 23:
                return new e9g((iak) this.j, (dak) obj2, yjeVar, (byte) 23);
            case 24:
                return new e9g((pak) this.j, (nak) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                e9g e9gVar14 = new e9g((bbk) obj2, yjeVar, (byte) 25);
                e9gVar14.j = obj;
                return e9gVar14;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new e9g((jbk) this.j, (String) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new e9g((hpk) this.j, (atk) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                e9g e9gVar15 = new e9g((cuk) obj2, yjeVar, (byte) 28);
                e9gVar15.j = obj;
                return e9gVar15;
            default:
                e9g e9gVar16 = new e9g((gxk) obj2, yjeVar, (byte) 29);
                e9gVar16.j = obj;
                return e9gVar16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((e9g) create((c5g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((e9g) create(null, (yje) obj2)).invokeSuspend(Unit.f46060a);
                throw null;
            case 2:
                return ((e9g) create((cfb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((e9g) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((e9g) create((mig) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((e9g) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((e9g) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((e9g) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((e9g) create((vmt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((e9g) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((e9g) create((g7m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((e9g) create((j8k) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((e9g) create((nak) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((e9g) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((e9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((e9g) create((ruk) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e9g) create((nxk) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:278:0x0831  */
    /* JADX WARN: Code duplicated, block: B:282:0x083d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0850  */
    /* JADX WARN: Code duplicated, block: B:335:0x0956  */
    /* JADX WARN: Code duplicated, block: B:348:0x098e  */
    /* JADX WARN: Code duplicated, block: B:442:0x084b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v20 java.lang.Object, still in use, count: 2, list:
          (r7v20 java.lang.Object) from 0x082d: PHI (r7 I:??) = (r7v15 java.lang.Object), (r7v20 java.lang.Object) binds: [B:275:0x082c, B:439:0x082d] A[DONT_GENERATE, DONT_INLINE]
          (r7v20 java.lang.Object) from 0x0823: CHECK_CAST (java.lang.String) (r7v20 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e9g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9g(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
