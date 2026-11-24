package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class jgb0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgb0(w5z w5zVar, iuy iuyVar, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 18;
        this.j = w5zVar;
        this.k = iuyVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.i) {
            case 0:
                jgb0 jgb0Var = new jgb0(this.k, (yje) obj3, (byte) 0);
                jgb0Var.j = (Throwable) obj2;
                return jgb0Var.invokeSuspend(Unit.f46060a);
            case 1:
                jgb0 jgb0Var2 = new jgb0(this.k, (yje) obj3, (byte) 1);
                jgb0Var2.j = (Throwable) obj2;
                return jgb0Var2.invokeSuspend(Unit.f46060a);
            case 2:
                jgb0 jgb0Var3 = new jgb0((int) b, (yje) obj3, (byte) 2);
                jgb0Var3.j = (a4x) obj;
                jgb0Var3.k = (List) obj2;
                return jgb0Var3.invokeSuspend(Unit.f46060a);
            case 3:
                jgb0 jgb0Var4 = new jgb0((sec0) this.k, (yje) obj3, b);
                jgb0Var4.j = (Throwable) obj2;
                return jgb0Var4.invokeSuspend(Unit.f46060a);
            case 4:
                jgb0 jgb0Var5 = new jgb0(this.k, (yje) obj3, (byte) 4);
                jgb0Var5.j = (Throwable) obj2;
                return jgb0Var5.invokeSuspend(Unit.f46060a);
            case 5:
                jgb0 jgb0Var6 = new jgb0(this.k, (yje) obj3, (byte) 5);
                jgb0Var6.j = (Throwable) obj2;
                return jgb0Var6.invokeSuspend(Unit.f46060a);
            case 6:
                jgb0 jgb0Var7 = new jgb0(this.k, (yje) obj3, (byte) 6);
                jgb0Var7.j = (Throwable) obj2;
                return jgb0Var7.invokeSuspend(Unit.f46060a);
            case 7:
                jgb0 jgb0Var8 = new jgb0(this.k, (yje) obj3, (byte) 7);
                jgb0Var8.j = (Throwable) obj2;
                return jgb0Var8.invokeSuspend(Unit.f46060a);
            case 8:
                jgb0 jgb0Var9 = new jgb0(this.k, (yje) obj3, (byte) 8);
                jgb0Var9.j = (Throwable) obj2;
                return jgb0Var9.invokeSuspend(Unit.f46060a);
            case 9:
                jgb0 jgb0Var10 = new jgb0(this.k, (yje) obj3, (byte) 9);
                jgb0Var10.j = (Throwable) obj2;
                return jgb0Var10.invokeSuspend(Unit.f46060a);
            case 10:
                jgb0 jgb0Var11 = new jgb0(this.k, (yje) obj3, (byte) 10);
                jgb0Var11.j = (Throwable) obj2;
                return jgb0Var11.invokeSuspend(Unit.f46060a);
            case 11:
                jgb0 jgb0Var12 = new jgb0(this.k, (yje) obj3, (byte) 11);
                jgb0Var12.j = (Throwable) obj2;
                return jgb0Var12.invokeSuspend(Unit.f46060a);
            case 12:
                jgb0 jgb0Var13 = new jgb0(this.k, (yje) obj3, (byte) 12);
                jgb0Var13.j = (Throwable) obj2;
                return jgb0Var13.invokeSuspend(Unit.f46060a);
            case 13:
                jgb0 jgb0Var14 = new jgb0(this.k, (yje) obj3, (byte) 13);
                jgb0Var14.j = (Throwable) obj2;
                return jgb0Var14.invokeSuspend(Unit.f46060a);
            case 14:
                jgb0 jgb0Var15 = new jgb0(this.k, (yje) obj3, (byte) 14);
                jgb0Var15.j = (Throwable) obj2;
                return jgb0Var15.invokeSuspend(Unit.f46060a);
            case 15:
                jgb0 jgb0Var16 = new jgb0((int) b, (yje) obj3, (byte) 15);
                jgb0Var16.j = (bpj0) obj;
                jgb0Var16.k = (az40) obj2;
                return jgb0Var16.invokeSuspend(Unit.f46060a);
            case 16:
                jgb0 jgb0Var17 = new jgb0((int) b, (yje) obj3, (byte) 16);
                jgb0Var17.j = (bm80) obj;
                jgb0Var17.k = (ik5) obj2;
                return jgb0Var17.invokeSuspend(Unit.f46060a);
            case 17:
                jgb0 jgb0Var18 = new jgb0(this.k, (yje) obj3, (byte) 17);
                jgb0Var18.j = (Throwable) obj2;
                return jgb0Var18.invokeSuspend(Unit.f46060a);
            case 18:
                return new jgb0((w5z) this.j, (iuy) this.k, (yje) obj3).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jgb0 jgb0Var19 = new jgb0(this.k, (yje) obj3, (byte) 19);
                jgb0Var19.j = (Throwable) obj2;
                return jgb0Var19.invokeSuspend(Unit.f46060a);
            case 20:
                jgb0 jgb0Var20 = new jgb0((int) b, (yje) obj3, (byte) 20);
                jgb0Var20.j = (Set) obj;
                jgb0Var20.k = (List) obj2;
                return jgb0Var20.invokeSuspend(Unit.f46060a);
            case 21:
                jgb0 jgb0Var21 = new jgb0(this.k, (yje) obj3, (byte) 21);
                jgb0Var21.j = (Throwable) obj2;
                return jgb0Var21.invokeSuspend(Unit.f46060a);
            case 22:
                jgb0 jgb0Var22 = new jgb0(this.k, (yje) obj3, (byte) 22);
                jgb0Var22.j = (Throwable) obj2;
                return jgb0Var22.invokeSuspend(Unit.f46060a);
            case 23:
                jgb0 jgb0Var23 = new jgb0(this.k, (yje) obj3, (byte) 23);
                jgb0Var23.j = (Throwable) obj2;
                return jgb0Var23.invokeSuspend(Unit.f46060a);
            case 24:
                jgb0 jgb0Var24 = new jgb0(this.k, (yje) obj3, (byte) 24);
                jgb0Var24.j = (Throwable) obj2;
                return jgb0Var24.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jgb0 jgb0Var25 = new jgb0((int) b, (yje) obj3, (byte) 25);
                jgb0Var25.j = (pdr0) obj;
                jgb0Var25.k = (List) obj2;
                return jgb0Var25.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jgb0 jgb0Var26 = new jgb0(this.k, (yje) obj3, (byte) 26);
                jgb0Var26.j = (Throwable) obj2;
                return jgb0Var26.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jgb0 jgb0Var27 = new jgb0(this.k, (yje) obj3, (byte) 27);
                jgb0Var27.j = (Throwable) obj2;
                return jgb0Var27.invokeSuspend(Unit.f46060a);
            default:
                jgb0 jgb0Var28 = new jgb0(this.k, (yje) obj3, (byte) 28);
                jgb0Var28.j = (Throwable) obj2;
                return jgb0Var28.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        String strA;
        byte b = 16;
        byte b2 = 1;
        byte b3 = 24;
        byte b4 = 2;
        byte b5 = 0;
        switch (this.i) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kgb0 kgb0Var = (kgb0) this.k;
                int i = kgb0.k0;
                kgb0Var.Q(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((lpb0) this.k).C.b(th2, new j3b0(b));
                return Unit.f46060a;
            case 2:
                a4x a4xVar = (a4x) this.j;
                List list = (List) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return new Pair(a4xVar, list);
            case 3:
                Throwable th3 = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ((sec0) this.k).u.b(th3, new t4c0(b));
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((kvc0) this.k).y(th4);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                gxc0 gxc0Var = (gxc0) this.k;
                int i2 = gxc0.M;
                gxc0Var.N(th5);
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ayc0 ayc0Var = (ayc0) this.k;
                int i3 = ayc0.O;
                ayc0Var.P(th6);
                return Unit.f46060a;
            case 7:
                Throwable th7 = (Throwable) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                th7.printStackTrace();
                p7m0 p7m0Var = ((rnf0) this.k).g;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, i8d.c));
                return Unit.f46060a;
            case 8:
                Throwable th8 = (Throwable) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ((jwf0) this.k).f.b(th8, new vtf0(b2));
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ((cxg0) this.k).y(th9);
                return Unit.f46060a;
            case 10:
                Throwable th10 = (Throwable) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((dxg0) this.k).C.b(th10, new xwg0(b5));
                return Unit.f46060a;
            case 11:
                Throwable th11 = (Throwable) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                iph0 iph0Var = (iph0) this.k;
                iph0Var.u.b(th11, new poh0(iph0Var, b4));
                iph0Var.x();
                return Unit.f46060a;
            case 12:
                Throwable th12 = (Throwable) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                irh0 irh0Var = (irh0) this.k;
                irh0Var.t.b(th12, new qqh0(irh0Var, b4));
                irh0Var.y();
                return Unit.f46060a;
            case 13:
                Throwable th13 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                zuh0 zuh0Var = (zuh0) this.k;
                zuh0Var.s.b(th13, new fuh0(zuh0Var, b4));
                zuh0Var.y();
                return Unit.f46060a;
            case 14:
                Throwable th14 = (Throwable) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((hoj0) this.k).k.a(th14);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                bpj0 bpj0Var = (bpj0) this.j;
                az40 az40Var = (az40) this.k;
                Set setKeySet = az40Var.a().keySet();
                ArrayList arrayList = new ArrayList(r3d.q(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zsb0) it.next()).f44898a);
                }
                Map<String, ?> all = bpj0Var.f2987a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = bpj0Var.b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value3 = entry2.getValue();
                    if (value3 instanceof Set) {
                        value3 = CollectionsKt.P0((Iterable) value3);
                    }
                    linkedHashMap2.put(key2, value3);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                az40 az40Var2 = new az40(new LinkedHashMap(az40Var.a()), false);
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value4 = entry4.getValue();
                    if (value4 instanceof Boolean) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), value4);
                    } else if (value4 instanceof Float) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), value4);
                    } else if (value4 instanceof Integer) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), value4);
                    } else if (value4 instanceof Long) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), value4);
                    } else if (value4 instanceof String) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), value4);
                    } else if (value4 instanceof Set) {
                        str.getClass();
                        az40Var2.d(new zsb0(str), (Set) value4);
                    }
                }
                return new az40(new LinkedHashMap(az40Var2.a()), true);
            case 16:
                bm80 bm80Var = (bm80) this.j;
                ik5 ik5Var = (ik5) this.k;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                return new Pair(bm80Var, ik5Var);
            case 17:
                Throwable th15 = (Throwable) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((fdk0) this.k).v.a(th15);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((q7d0) ((w5z) this.j).d).a().unregisterOnSharedPreferenceChangeListener((iuy) this.k);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th16 = (Throwable) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                rdn0 rdn0Var = (rdn0) this.k;
                int i4 = rdn0.I;
                rdn0Var.M(th16);
                return Unit.f46060a;
            case 20:
                Set set2 = (Set) this.j;
                List list2 = (List) this.k;
                wne wneVar21 = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj2 : list2) {
                    if (((o8n0) obj2).b) {
                        arrayListT.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayListT, 10));
                Iterator it2 = arrayListT.iterator();
                while (it2.hasNext()) {
                    axq.t(((o8n0) it2.next()).f24839a, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!((o8n0) obj3).b) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    axq.t(((o8n0) it3.next()).f24839a, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : set2) {
                    if (!arrayList4.contains(new Long(((Number) obj4).longValue()))) {
                        arrayList5.add(obj4);
                    }
                }
                return CollectionsKt.L0(CollectionsKt.O0(CollectionsKt.q0(arrayList5, arrayList2)));
            case 21:
                Throwable th17 = (Throwable) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                ren0 ren0Var = (ren0) this.k;
                int i5 = ren0.D;
                ren0Var.M(th17);
                return Unit.f46060a;
            case 22:
                Throwable th18 = (Throwable) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ven0 ven0Var = (ven0) this.k;
                int i6 = ven0.K;
                ven0Var.M(th18);
                return Unit.f46060a;
            case 23:
                Throwable th19 = (Throwable) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                zco0 zco0Var = (zco0) this.k;
                int i7 = zco0.r0;
                zco0Var.p.b(th19, new abn0(zco0Var, (byte) 14));
                return Unit.f46060a;
            case 24:
                Throwable th20 = (Throwable) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                b0p0 b0p0Var = (b0p0) this.k;
                int i8 = b0p0.I;
                b0p0Var.D.b(th20, new abn0(b0p0Var, b3));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pdr0 pdr0Var = (pdr0) this.j;
                List list3 = (List) this.k;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                if (pdr0Var != null) {
                    if (pdr0Var instanceof odr0) {
                        Iterable<xah> iterable = (Iterable) ((odr0) pdr0Var).f25090a;
                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable, 10));
                        for (xah xahVar : iterable) {
                            arrayList6.add(xah.a(xahVar, null, null, null, axq.y(xahVar.g, list3), 49151));
                        }
                        return new odr0(arrayList6);
                    }
                    if (pdr0Var instanceof ndr0) {
                        return pdr0Var;
                    }
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th21 = (Throwable) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                m5r0 m5r0Var = (m5r0) this.k;
                int i9 = m5r0.E;
                m5r0Var.O(th21);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th22 = (Throwable) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                wfs0 wfs0Var = (wfs0) this.k;
                wfs0Var.w.b(th22, new efr0(b3));
                p7m0 p7m0Var2 = wfs0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ifs0.a((ifs0) value2, false, igs0.f14749a, null, false, null, null, null, 509)));
                return Unit.f46060a;
            default:
                Throwable th23 = (Throwable) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                dyu0 dyu0Var = (dyu0) this.k;
                dyu0Var.y.a(th23);
                ctf0 ctf0Var = dyu0Var.G;
                if ((th23 instanceof SocketTimeoutException) || (th23 instanceof ConnectException) || (th23 instanceof UnknownHostException)) {
                    strA = ctf0Var.b.a(R.string.data_retrieval_error, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = th23.getMessage();
                    if (strA == null) {
                        strA = ctf0Var.b.a(R.string.data_retrieval_error, Arrays.copyOf(new Object[0], 0));
                    }
                }
                dyu0Var.G(new oxu0(strA));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgb0(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgb0(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
