package a;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ma extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(mdm mdmVar, vne vneVar, pz40 pz40Var, String str, pz40 pz40Var2, pz40 pz40Var3, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.n = mdmVar;
        this.k = vneVar;
        this.l = pz40Var;
        this.m = str;
        this.o = pz40Var2;
        this.j = pz40Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.o;
        switch (b) {
            case 0:
                return new ma((r040) this.n, (List) obj4, (ab) obj5, (List) obj3, (List) obj6, (String) obj2, yjeVar, (byte) 0);
            case 1:
                ma maVar = new ma((Map) obj6, (w46) obj5, (List) obj4, (List) obj3, (String) obj2, yjeVar, (byte) 1);
                maVar.n = obj;
                return maVar;
            case 2:
                return new ma((mdm) this.n, (vne) obj4, (pz40) obj3, (String) obj2, (pz40) obj6, (pz40) obj5, yjeVar);
            case 3:
                ma maVar2 = new ma((yyo) obj4, (cqq) obj3, (cqq) obj6, (cqq) obj5, (Function1) obj2, yjeVar);
                maVar2.n = obj;
                return maVar2;
            case 4:
                return new ma((r040) this.n, (List) obj4, (ef00) obj5, (List) obj3, (List) obj6, (String) obj2, yjeVar, (byte) 4);
            case 5:
                ma maVar3 = new ma((Map) obj6, (w46) obj5, (List) obj4, (List) obj3, (String) obj2, yjeVar, (byte) 5);
                maVar3.n = obj;
                return maVar3;
            case 6:
                return new ma((w940) this.n, (String) obj2, (Intent) obj4, (String) obj3, (String) obj6, (k9h0) obj5, yjeVar);
            case 7:
                return new ma((r040) this.n, (List) obj4, (fho0) obj5, (List) obj3, (List) obj6, (String) obj2, yjeVar, (byte) 7);
            case 8:
                ma maVar4 = new ma((Map) obj6, (w46) obj5, (List) obj4, (List) obj3, (String) obj2, yjeVar, (byte) 8);
                maVar4.n = obj;
                return maVar4;
            case 9:
                return new ma((r040) this.n, (List) obj4, (rio0) obj5, (List) obj3, (List) obj6, (String) obj2, yjeVar, (byte) 9);
            case 10:
                ma maVar5 = new ma((Map) obj6, (w46) obj5, (List) obj4, (List) obj3, (String) obj2, yjeVar, (byte) 10);
                maVar5.n = obj;
                return maVar5;
            case 11:
                return new ma((r040) this.n, (List) obj4, (xtq0) obj5, (List) obj3, (List) obj6, (String) obj2, yjeVar, (byte) 11);
            default:
                ma maVar6 = new ma((Map) obj6, (w46) obj5, (List) obj4, (List) obj3, (String) obj2, yjeVar, (byte) 12);
                maVar6.n = obj;
                return maVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
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
        }
        return ((ma) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        f240 f240VarT;
        r040 r040Var;
        String str;
        boolean z;
        cqq cqqVar;
        r040 r040Var2;
        List list2;
        f240 f240VarT2;
        r040 r040Var3;
        boolean z2;
        w140 w140Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.o;
        Object obj6 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                r040 r040Var4 = (r040) this.n;
                List<yx10> list3 = (List) obj3;
                ab abVar = (ab) obj4;
                ctf0 ctf0Var = abVar.w;
                List list4 = (List) obj6;
                List list5 = (List) obj5;
                String str2 = (String) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                for (yx10 yx10Var : list3) {
                    qho qhoVar = abVar.h0;
                    boolean z7 = abVar.Q;
                    String strA = abVar.c.a().Z1;
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                    }
                    String str3 = strA;
                    yx10Var.getClass();
                    ctf0Var.getClass();
                    qhoVar.getClass();
                    list4.getClass();
                    r040Var4.getClass();
                    list5.getClass();
                    str2.getClass();
                    switch (r040Var4) {
                        case SPORTS:
                        case AGGREGATOR:
                        case GAMES:
                        case OTHER:
                        case TOP:
                        case VIRTUAL:
                            ctf0 ctf0Var2 = ctf0Var;
                            List list6 = list4;
                            String str4 = str2;
                            list = list5;
                            if (yx10Var instanceof nx10) {
                                iz30 iz30Var = ((nx10) yx10Var).f24262a;
                                h240 h240Var = new h240(1, qhoVar, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 0);
                                if (list6.isEmpty()) {
                                    z = false;
                                } else {
                                    Iterator it = list6.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z = false;
                                        } else if (((iz30) it.next()) == iz30Var) {
                                            z = true;
                                        }
                                    }
                                }
                                int iIntValue = ((Number) h240Var.invoke(Integer.valueOf(R.drawable.ic_glyph_games))).intValue();
                                lsm0 lsm0Var = ctf0Var2.b;
                                r040 r040Var5 = r040Var4;
                                w140 w140Var2 = new w140(iz30Var, z, r040Var5, iIntValue, lsm0Var.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.menu_one_x_games_description, Arrays.copyOf(new Object[0], 0)));
                                ctf0Var = ctf0Var2;
                                str = str4;
                                f240VarT = w140Var2;
                                r040Var = r040Var5;
                                list4 = list6;
                            } else {
                                ctf0Var = ctf0Var2;
                                list4 = list6;
                                f240VarT = qxw.T(yx10Var, ctf0Var, qhoVar, list4, r040Var4, z7, list, str4, str3);
                                r040Var = r040Var4;
                                str = str4;
                                list = list;
                            }
                            break;
                        case SINGLE_SPORTS:
                        case SINGLE_AGGREGATOR:
                        case SINGLE_GAMES:
                        case SINGLE_OTHER:
                        case SINGLE_TOP:
                        case SINGLE_VIRTUAL:
                            str = str2;
                            list = list5;
                            f240VarT = qxw.Y(yx10Var, ctf0Var, qhoVar, list4, r040Var4, z7, qxw.K(ctf0Var), list, str, str3);
                            r040Var = r040Var4;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    arrayList.add(f240VarT);
                    r040Var4 = r040Var;
                    list5 = list;
                    str2 = str;
                }
                return new Pair(r040Var4, arrayList);
            case 1:
                vne vneVar = (vne) this.n;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Map map = (Map) obj5;
                ab abVar2 = (ab) obj4;
                List list7 = (List) obj3;
                List list8 = (List) obj6;
                String str5 = (String) obj2;
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList2.add(qjj.M(vneVar, null, new ma((r040) entry.getKey(), (List) entry.getValue(), abVar2, list7, list8, str5, null, (byte) 0), 3));
                }
                return arrayList2;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                mdm mdmVar = (mdm) this.n;
                long jCurrentTimeMillis = mdmVar.j - System.currentTimeMillis();
                if (mdmVar.j == 0) {
                    jCurrentTimeMillis = mdmVar.i;
                }
                long j = jCurrentTimeMillis;
                bby bbyVar = (bby) ((pz40) obj6).getValue();
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                pz40 pz40Var = (pz40) obj6;
                pz40Var.setValue(qjj.W((vne) obj3, null, null, new eh1(j, (String) obj2, (pz40) obj5, (pz40) obj4, pz40Var, null), 3));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yxo yxoVar = ((yyo) obj3).j;
                int i = yxoVar == null ? -1 : ryo.f31322a[yxoVar.ordinal()];
                if (i == -1) {
                    return Unit.f46060a;
                }
                if (i == 1) {
                    cqqVar = (cqq) obj6;
                } else if (i == 2) {
                    cqqVar = (cqq) obj5;
                } else {
                    if (i != 3) {
                        t9f.b();
                        return null;
                    }
                    cqqVar = (cqq) obj4;
                }
                try {
                    e0g0 e0g0Var = j0g0.b;
                    cqq.a(cqqVar);
                    break;
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                ((Function1) obj2).invoke(jxo.f17317a);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                r040 r040Var6 = (r040) this.n;
                List<yx10> list9 = (List) obj3;
                ef00 ef00Var = (ef00) obj4;
                List list10 = (List) obj6;
                List list11 = (List) obj5;
                String str6 = (String) obj2;
                ArrayList arrayList3 = new ArrayList(r3d.q(list9, 10));
                for (yx10 yx10Var2 : list9) {
                    ctf0 ctf0Var3 = ef00Var.O;
                    qho qhoVar2 = ef00Var.h0;
                    String strA2 = ef00Var.g.a().Z1;
                    if (strA2.length() == 0) {
                        strA2 = ef00Var.O.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                    }
                    arrayList3.add(qxw.T(yx10Var2, ctf0Var3, qhoVar2, list10, r040Var6, true, list11, str6, strA2));
                }
                return new Pair(r040Var6, arrayList3);
            case 5:
                vne vneVar2 = (vne) this.n;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                Map map2 = (Map) obj5;
                ef00 ef00Var2 = (ef00) obj4;
                List list12 = (List) obj3;
                List list13 = (List) obj6;
                String str7 = (String) obj2;
                ArrayList arrayList4 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    arrayList4.add(qjj.M(vneVar2, null, new ma((r040) entry2.getKey(), (List) entry2.getValue(), ef00Var2, list12, list13, str7, null, (byte) 4), 3));
                }
                return arrayList4;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                List list14 = u0d.f34849a;
                w940 w940Var = (w940) this.n;
                u0d.h(w940Var.f38760a, (String) obj2, new dg(w940Var, (Intent) obj3, (String) obj6, (String) obj5, (k9h0) obj4));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                r040 r040Var7 = (r040) this.n;
                List<yx10> list15 = (List) obj3;
                fho0 fho0Var = (fho0) obj4;
                ctf0 ctf0Var4 = fho0Var.w;
                List list16 = (List) obj6;
                List list17 = (List) obj5;
                String str8 = (String) obj2;
                ArrayList arrayList5 = new ArrayList(r3d.q(list15, 10));
                for (yx10 yx10Var3 : list15) {
                    qho qhoVar3 = fho0Var.h0;
                    String strA3 = fho0Var.c.a().Z1;
                    if (strA3.length() == 0) {
                        strA3 = ctf0Var4.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                    }
                    String str9 = strA3;
                    yx10Var3.getClass();
                    ctf0Var4.getClass();
                    qhoVar3.getClass();
                    list16.getClass();
                    r040Var7.getClass();
                    list17.getClass();
                    str8.getClass();
                    switch (r040Var7) {
                        case SPORTS:
                        case AGGREGATOR:
                        case GAMES:
                        case OTHER:
                        case TOP:
                        case VIRTUAL:
                            ctf0 ctf0Var5 = ctf0Var4;
                            String str10 = str8;
                            List list18 = list17;
                            if (yx10Var3 instanceof ux10) {
                                iz30 iz30Var2 = ((ux10) yx10Var3).f36419a;
                                int iIntValue2 = ((Number) new h240(1, qhoVar3, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 17).invoke(Integer.valueOf(R.drawable.ic_glyph_swipex))).intValue();
                                lsm0 lsm0Var2 = ctf0Var5.b;
                                String strA4 = lsm0Var2.a(R.string.swipex, Arrays.copyOf(new Object[0], 0));
                                String strA5 = lsm0Var2.a(R.string.bet_with_one_swipe, Arrays.copyOf(new Object[0], 0));
                                if (list16.isEmpty()) {
                                    z6 = false;
                                } else {
                                    Iterator it2 = list16.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z6 = false;
                                        } else if (((iz30) it2.next()) == iz30Var2) {
                                            z6 = true;
                                        }
                                    }
                                }
                                w140Var = new w140(iz30Var2, z6, r040Var7, iIntValue2, strA4, strA5);
                            } else if (yx10Var3 instanceof mx10) {
                                iz30 iz30Var3 = ((mx10) yx10Var3).f22532a;
                                int iIntValue3 = ((Number) new h240(1, qhoVar3, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 18).invoke(Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad))).intValue();
                                lsm0 lsm0Var3 = ctf0Var5.b;
                                String strA6 = lsm0Var3.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0));
                                String strA7 = lsm0Var3.a(R.string.menu_cyber_description, Arrays.copyOf(new Object[0], 0));
                                if (list16.isEmpty()) {
                                    z5 = false;
                                } else {
                                    Iterator it3 = list16.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z5 = false;
                                        } else if (((iz30) it3.next()) == iz30Var3) {
                                            z5 = true;
                                        }
                                    }
                                }
                                w140Var = new w140(iz30Var3, z5, r040Var7, iIntValue3, strA6, strA7);
                            } else if (yx10Var3 instanceof wx10) {
                                iz30 iz30Var4 = ((wx10) yx10Var3).f39910a;
                                int iIntValue4 = ((Number) new h240(1, qhoVar3, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 19).invoke(Integer.valueOf(R.drawable.ic_glyph_ufc))).intValue();
                                lsm0 lsm0Var4 = ctf0Var5.b;
                                String strA8 = lsm0Var4.a(R.string.ufc_title, Arrays.copyOf(new Object[0], 0));
                                String strA9 = lsm0Var4.a(R.string.menu_ufc_description, Arrays.copyOf(new Object[0], 0));
                                if (list16.isEmpty()) {
                                    z4 = false;
                                } else {
                                    Iterator it4 = list16.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z4 = false;
                                        } else if (((iz30) it4.next()) == iz30Var4) {
                                            z4 = true;
                                        }
                                    }
                                }
                                w140Var = new w140(iz30Var4, z4, r040Var7, iIntValue4, strA8, strA9);
                            } else if (!(yx10Var3 instanceof ox10)) {
                                if (yx10Var3 instanceof sx10) {
                                    iz30 iz30Var5 = ((sx10) yx10Var3).f32951a;
                                    iz30 iz30Var6 = iz30.v;
                                    if (iz30Var5 == iz30Var6) {
                                        int iIntValue5 = ((Number) new h240(1, qhoVar3, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 21).invoke(Integer.valueOf(R.drawable.ic_glyph_champions_club))).intValue();
                                        String strA10 = ctf0Var5.b.a(R.string.promo_menu_champions_club_subtitle, Arrays.copyOf(new Object[0], 0));
                                        if (list16.isEmpty()) {
                                            z2 = false;
                                        } else {
                                            Iterator it5 = list16.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    z2 = false;
                                                } else if (((iz30) it5.next()) == iz30.v) {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        w140Var = new w140(iz30Var6, z2, r040Var7, iIntValue5, str9, strA10);
                                    } else {
                                        ctf0Var4 = ctf0Var5;
                                        r040Var2 = r040Var7;
                                        list17 = list18;
                                        str8 = str10;
                                        list2 = list16;
                                        f240VarT2 = qxw.T(yx10Var3, ctf0Var4, qhoVar3, list2, r040Var2, true, list17, str8, str9);
                                    }
                                } else {
                                    ctf0Var4 = ctf0Var5;
                                    list17 = list18;
                                    str8 = str10;
                                    r040Var2 = r040Var7;
                                    list2 = list16;
                                    f240VarT2 = qxw.T(yx10Var3, ctf0Var4, qhoVar3, list2, r040Var2, true, list17, str8, str9);
                                }
                                r040Var3 = r040Var2;
                            } else {
                                iz30 iz30Var7 = ((ox10) yx10Var3).f25991a;
                                int iIntValue6 = ((Number) new h240(1, qhoVar3, qho.class, "getEventStyledDrawableResId", "getEventStyledDrawableResId(I)I", 0, (byte) 20).invoke(Integer.valueOf(R.drawable.ic_glyph_polybet))).intValue();
                                lsm0 lsm0Var5 = ctf0Var5.b;
                                String strA11 = lsm0Var5.a(R.string.polybet, Arrays.copyOf(new Object[0], 0));
                                String strA12 = lsm0Var5.a(R.string.menu_polybet_description, Arrays.copyOf(new Object[0], 0));
                                if (list16.isEmpty()) {
                                    z3 = false;
                                } else {
                                    Iterator it6 = list16.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            z3 = false;
                                        } else if (((iz30) it6.next()) == iz30Var7) {
                                            z3 = true;
                                        }
                                    }
                                }
                                w140Var = new w140(iz30Var7, z3, r040Var7, iIntValue6, strA11, strA12);
                            }
                            ctf0Var4 = ctf0Var5;
                            f240VarT2 = w140Var;
                            r040Var3 = r040Var7;
                            list17 = list18;
                            str8 = str10;
                            list2 = list16;
                            break;
                        case SINGLE_SPORTS:
                        case SINGLE_AGGREGATOR:
                        case SINGLE_GAMES:
                        case SINGLE_OTHER:
                        case SINGLE_TOP:
                        case SINGLE_VIRTUAL:
                            List list19 = list17;
                            r040 r040Var8 = r040Var7;
                            list2 = list16;
                            String str11 = str8;
                            f240VarT2 = qxw.Y(yx10Var3, ctf0Var4, qhoVar3, list2, r040Var8, true, qxw.K(ctf0Var4), list19, str11, str9);
                            r040Var3 = r040Var8;
                            list17 = list19;
                            str8 = str11;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    arrayList5.add(f240VarT2);
                    list16 = list2;
                    r040Var7 = r040Var3;
                }
                return new Pair(r040Var7, arrayList5);
            case 8:
                vne vneVar3 = (vne) this.n;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                Map map3 = (Map) obj5;
                fho0 fho0Var2 = (fho0) obj4;
                List list20 = (List) obj3;
                List list21 = (List) obj6;
                String str12 = (String) obj2;
                ArrayList arrayList6 = new ArrayList(map3.size());
                for (Map.Entry entry3 : map3.entrySet()) {
                    arrayList6.add(qjj.M(vneVar3, null, new ma((r040) entry3.getKey(), (List) entry3.getValue(), fho0Var2, list20, list21, str12, null, (byte) 7), 3));
                }
                return arrayList6;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                r040 r040Var9 = (r040) this.n;
                List<yx10> list22 = (List) obj3;
                rio0 rio0Var = (rio0) obj4;
                List list23 = (List) obj6;
                List list24 = (List) obj5;
                String str13 = (String) obj2;
                ArrayList arrayList7 = new ArrayList(r3d.q(list22, 10));
                for (yx10 yx10Var4 : list22) {
                    ctf0 ctf0Var6 = rio0Var.x;
                    qho qhoVar4 = rio0Var.v0;
                    String strA13 = rio0Var.c.a().Z1;
                    if (strA13.length() == 0) {
                        strA13 = rio0Var.x.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                    }
                    arrayList7.add(qxw.T(yx10Var4, ctf0Var6, qhoVar4, list23, r040Var9, true, list24, str13, strA13));
                }
                return new Pair(r040Var9, arrayList7);
            case 10:
                vne vneVar4 = (vne) this.n;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                Map map4 = (Map) obj5;
                rio0 rio0Var2 = (rio0) obj4;
                List list25 = (List) obj3;
                List list26 = (List) obj6;
                String str14 = (String) obj2;
                ArrayList arrayList8 = new ArrayList(map4.size());
                for (Map.Entry entry4 : map4.entrySet()) {
                    arrayList8.add(qjj.M(vneVar4, null, new ma((r040) entry4.getKey(), (List) entry4.getValue(), rio0Var2, list25, list26, str14, null, (byte) 9), 3));
                }
                return arrayList8;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                r040 r040Var10 = (r040) this.n;
                List<yx10> list27 = (List) obj3;
                xtq0 xtq0Var = (xtq0) obj4;
                List list28 = (List) obj6;
                List list29 = (List) obj5;
                String str15 = (String) obj2;
                ArrayList arrayList9 = new ArrayList(r3d.q(list27, 10));
                for (yx10 yx10Var5 : list27) {
                    ctf0 ctf0Var7 = xtq0Var.w;
                    qho qhoVar5 = xtq0Var.h0;
                    boolean z8 = xtq0Var.R;
                    String strA14 = xtq0Var.c.a().Z1;
                    if (strA14.length() == 0) {
                        strA14 = xtq0Var.w.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                    }
                    arrayList9.add(qxw.T(yx10Var5, ctf0Var7, qhoVar5, list28, r040Var10, z8, list29, str15, strA14));
                }
                return new Pair(r040Var10, arrayList9);
            default:
                vne vneVar5 = (vne) this.n;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                Map map5 = (Map) obj5;
                xtq0 xtq0Var2 = (xtq0) obj4;
                List list30 = (List) obj3;
                List list31 = (List) obj6;
                String str16 = (String) obj2;
                ArrayList arrayList10 = new ArrayList(map5.size());
                for (Map.Entry entry5 : map5.entrySet()) {
                    arrayList10.add(qjj.M(vneVar5, null, new ma((r040) entry5.getKey(), (List) entry5.getValue(), xtq0Var2, list30, list31, str16, null, (byte) 11), 3));
                }
                return arrayList10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(yyo yyoVar, cqq cqqVar, cqq cqqVar2, cqq cqqVar3, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.k = yyoVar;
        this.l = cqqVar;
        this.o = cqqVar2;
        this.j = cqqVar3;
        this.m = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(r040 r040Var, List list, w46 w46Var, List list2, List list3, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = r040Var;
        this.k = list;
        this.j = w46Var;
        this.l = list2;
        this.o = list3;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(w940 w940Var, String str, Intent intent, String str2, String str3, k9h0 k9h0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.n = w940Var;
        this.m = str;
        this.k = intent;
        this.l = str2;
        this.o = str3;
        this.j = k9h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(Map map, w46 w46Var, List list, List list2, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = map;
        this.j = w46Var;
        this.k = list;
        this.l = list2;
        this.m = str;
    }
}
