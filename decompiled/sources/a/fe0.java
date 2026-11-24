package a;

import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class fe0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(hie0 hie0Var, oe0 oe0Var, hie0 hie0Var2, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 0;
        this.l = hie0Var;
        this.n = oe0Var;
        this.m = hie0Var2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                fe0 fe0Var = new fe0((hie0) this.l, (oe0) obj4, (hie0) this.m, (yje) obj3);
                fe0Var.k = (String) obj;
                fe0Var.j = zBooleanValue;
                return fe0Var.invokeSuspend(Unit.f46060a);
            case 1:
                ((Boolean) obj2).getClass();
                fe0 fe0Var2 = new fe0(obj4, (yje) obj3, (byte) 1);
                fe0Var2.m = (ql5) obj;
                return fe0Var2.invokeSuspend(Unit.f46060a);
            case 2:
                fe0 fe0Var3 = new fe0((yje) obj3, (eqb) obj4, (String) this.k);
                fe0Var3.l = (kmq) obj;
                fe0Var3.m = obj2;
                return fe0Var3.invokeSuspend(Unit.f46060a);
            case 3:
                fe0 fe0Var4 = new fe0((yje) obj3, this.m, obj4, (byte) 3);
                fe0Var4.k = (kmq) obj;
                fe0Var4.l = (Object[]) obj2;
                return fe0Var4.invokeSuspend(Unit.f46060a);
            case 4:
                fe0 fe0Var5 = new fe0((yje) obj3, this.m, obj4, (byte) 4);
                fe0Var5.k = (kmq) obj;
                fe0Var5.l = obj2;
                return fe0Var5.invokeSuspend(Unit.f46060a);
            case 5:
                fe0 fe0Var6 = new fe0((yje) obj3, this.m, obj4, (byte) 5);
                fe0Var6.k = (kmq) obj;
                fe0Var6.l = obj2;
                return fe0Var6.invokeSuspend(Unit.f46060a);
            case 6:
                fe0 fe0Var7 = new fe0((yje) obj3, this.m, obj4, (byte) 6);
                fe0Var7.k = (kmq) obj;
                fe0Var7.l = obj2;
                return fe0Var7.invokeSuspend(Unit.f46060a);
            case 7:
                fe0 fe0Var8 = new fe0((yje) obj3, this.m, obj4, (byte) 7);
                fe0Var8.k = (kmq) obj;
                fe0Var8.l = obj2;
                return fe0Var8.invokeSuspend(Unit.f46060a);
            case 8:
                fe0 fe0Var9 = new fe0(obj4, (yje) obj3, (byte) 8);
                fe0Var9.l = (Set) obj;
                fe0Var9.m = (Set) obj2;
                return fe0Var9.invokeSuspend(Unit.f46060a);
            case 9:
                fe0 fe0Var10 = new fe0((yje) obj3, this.m, obj4, (byte) 9);
                fe0Var10.k = (kmq) obj;
                fe0Var10.l = obj2;
                return fe0Var10.invokeSuspend(Unit.f46060a);
            case 10:
                fe0 fe0Var11 = new fe0((yje) obj3, this.m, obj4, (byte) 10);
                fe0Var11.k = (kmq) obj;
                fe0Var11.l = obj2;
                return fe0Var11.invokeSuspend(Unit.f46060a);
            case 11:
                fe0 fe0Var12 = new fe0((yje) obj3, this.m, obj4, (byte) 11);
                fe0Var12.k = (kmq) obj;
                fe0Var12.l = obj2;
                return fe0Var12.invokeSuspend(Unit.f46060a);
            case 12:
                fe0 fe0Var13 = new fe0((v360) this.m, obj4, (yje) obj3, (byte) 12);
                fe0Var13.k = (kmq) obj;
                fe0Var13.l = (Throwable) obj2;
                return fe0Var13.invokeSuspend(Unit.f46060a);
            case 13:
                fe0 fe0Var14 = new fe0((v360) this.m, obj4, (yje) obj3, (byte) 13);
                fe0Var14.k = (kmq) obj;
                fe0Var14.l = (Throwable) obj2;
                return fe0Var14.invokeSuspend(Unit.f46060a);
            case 14:
                fe0 fe0Var15 = new fe0((yje) obj3, this.m, obj4, (byte) 14);
                fe0Var15.k = (kmq) obj;
                fe0Var15.l = obj2;
                return fe0Var15.invokeSuspend(Unit.f46060a);
            case 15:
                fe0 fe0Var16 = new fe0((yje) obj3, this.m, obj4, (byte) 15);
                fe0Var16.k = (kmq) obj;
                fe0Var16.l = (Object[]) obj2;
                return fe0Var16.invokeSuspend(Unit.f46060a);
            case 16:
                fe0 fe0Var17 = new fe0((yje) obj3, this.m, obj4, (byte) 16);
                fe0Var17.k = (kmq) obj;
                fe0Var17.l = obj2;
                return fe0Var17.invokeSuspend(Unit.f46060a);
            case 17:
                fe0 fe0Var18 = new fe0(obj4, (yje) obj3, (byte) 17);
                fe0Var18.m = (List) obj;
                fe0Var18.k = (String) obj2;
                return fe0Var18.invokeSuspend(Unit.f46060a);
            case 18:
                fe0 fe0Var19 = new fe0((yje) obj3, this.m, obj4, (byte) 18);
                fe0Var19.k = (kmq) obj;
                fe0Var19.l = obj2;
                return fe0Var19.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fe0 fe0Var20 = new fe0((yje) obj3, this.m, obj4, (byte) 19);
                fe0Var20.k = (kmq) obj;
                fe0Var20.l = obj2;
                return fe0Var20.invokeSuspend(Unit.f46060a);
            default:
                fe0 fe0Var21 = new fe0((yje) obj3, this.m, obj4, (byte) 20);
                fe0Var21.k = (kmq) obj;
                fe0Var21.l = obj2;
                return fe0Var21.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0323  */
    /* JADX WARN: Code duplicated, block: B:155:0x032d  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b;
        p7m0 p7m0Var;
        Object objA;
        ke keVar;
        or30 or30Var;
        edu eduVar;
        Object objA2;
        gmq txtVar;
        gmq vsg0Var;
        xum0 xum0Var;
        dvm0 dvm0Var;
        String name;
        eu4 eu4Var;
        byte b2 = this.i;
        long j = 30;
        byte b3 = 2;
        byte b4 = 12;
        boolean z = false;
        Object obj2 = this.n;
        byte b5 = 1;
        yje yjeVar = null;
        switch (b2) {
            case 0:
                hie0 hie0Var = (hie0) this.m;
                oe0 oe0Var = (oe0) obj2;
                String str = (String) this.k;
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hie0 hie0Var2 = (hie0) this.l;
                boolean z3 = (Intrinsics.d(((wd0) oe0Var.D()).d, str) || hie0Var.f13108a || (hie0Var2.f13108a != z2 && z2)) ? false : true;
                hie0Var.f13108a = false;
                hie0Var2.f13108a = z2;
                hl1 hl1Var = oe0Var.A.a().b;
                boolean z4 = hl1Var.f13233a.k;
                c4m0 c4m0Var = oe0Var.D;
                if (c4m0Var != null) {
                    e3c.n(c4m0Var);
                }
                wti wtiVar = oe0Var.y;
                String strB = r7x.B(uzb0.f36529a);
                boolean z5 = !h97.A(oe0Var.z, uaq0.f35345a);
                th1 th1Var = hl1Var.v;
                gmq gmqVarJ = wtiVar.j(0L, strB, str, Integer.MAX_VALUE, "", z4, z5, th1Var == th1.BRAND_S_EXTENDED || th1Var == th1.BRAND_M || th1Var == th1.BRAND_M_EXTENDED, true);
                if (z3) {
                    b = 0;
                    gmqVarJ = u1c.I(gmqVarJ, new de0(oe0Var, yjeVar, b));
                } else {
                    b = 0;
                }
                oe0Var.D = sac.T(new fnq(gmqVarJ, new ee0(oe0Var, str, yjeVar, b), (byte) 4), jiu0.a(oe0Var), new i8(2, oe0Var, oe0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 8));
                return Unit.f46060a;
            case 1:
                fy4 fy4Var = (fy4) obj2;
                p7m0 p7m0Var2 = fy4Var.Y;
                ql5 ql5Var = (ql5) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    p7m0Var = fy4Var.X;
                    pn40 pn40Var = pn40.f27267a;
                    ke keVar2 = new ke(pn40.c(ql5Var.b, p3u0.c), ql5Var.f);
                    u4a u4aVar = fy4Var.q;
                    this.m = ql5Var;
                    this.k = p7m0Var;
                    this.l = keVar2;
                    this.j = true;
                    objA = u4aVar.a(this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                    keVar = keVar2;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    keVar = (ke) this.l;
                    p7m0 p7m0Var3 = (p7m0) this.k;
                    z1x.P(obj);
                    p7m0Var = p7m0Var3;
                    objA = obj;
                }
                mm5 mm5Var = new mm5(keVar, ql5Var, ((Boolean) objA).booleanValue());
                long j2 = ql5Var.f28916a;
                p7m0Var.getClass();
                p7m0Var.o(null, mm5Var);
                if (((Number) p7m0Var2.getValue()).longValue() != j2) {
                    sac.V(jiu0.a(fy4Var), new sx4(fy4Var, (byte) 5), new pw4(0, fy4Var, fy4.class, "observeUpdateCouponModel", "observeUpdateCouponModel()V", 0, (byte) 1), fy4Var.g.b, new cm3(fy4Var, ql5Var, yjeVar, (byte) 15), 8);
                }
                Long l = new Long(j2);
                p7m0Var2.getClass();
                p7m0Var2.o(null, l);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.l;
                    ynb0 ynb0Var = (ynb0) this.m;
                    lef0 lef0Var = ((eqb) obj2).d;
                    String str2 = (String) this.k;
                    lef0Var.getClass();
                    ynb0Var.getClass();
                    vsg0 vsg0Var2 = new vsg0(new kv(lef0Var, str2, ynb0Var, null, (byte) 17));
                    List listJ = q3d.j(UnknownHostException.class, oqt0.class);
                    ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.L0(pnm0.c), kotlin.collections.a.c(Integer.valueOf(i2o.LoginCreationFailed.getErrorCode())));
                    rnp rnpVar = new rnp(b4);
                    listJ.getClass();
                    a1g a1gVar = new a1g(vsg0Var2, new jmq(rnpVar, listJ, arrayListQ0, null), (byte) 20);
                    this.l = null;
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar, a1gVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    kmq kmqVar2 = (kmq) this.k;
                    i8d[] i8dVarArr = (i8d[]) ((Object[]) this.l);
                    int length = i8dVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            ((vw5) this.m).a(((g8d) obj2).b);
                        } else if (i8dVarArr[i] == i8d.c) {
                            i++;
                        }
                    }
                    Unit unit = Unit.f46060a;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar2.a(unit, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    kmq kmqVar3 = (kmq) this.k;
                    long jLongValue = ((Number) this.l).longValue();
                    pzu pzuVar = ((a8h) this.m).t;
                    long j3 = ((xum0) obj2).b;
                    n530 n530Var = ((q530) ((pv00) pzuVar.b).f27640a).f28131a;
                    n530Var.getClass();
                    p7m0 p7m0VarB = n530Var.b(new i530(jLongValue, j3));
                    vno vnoVar = ((got) pzuVar.d).f11649a.f13403a;
                    vnoVar.getClass();
                    p7m0 p7m0VarA = vnoVar.a(new ono(jLongValue, j3));
                    eu4 eu4VarA = ((h9c) pzuVar.f27863a).a();
                    i89 i89VarB = ((qj9) ((jru) pzuVar.c).b).b();
                    q430 q430Var = ((mku) pzuVar.f).f21960a;
                    t7h t7hVar = new t7h(dub.d0(p7m0VarB, p7m0VarA, eu4VarA, i89VarB, new m430(wwb.C(q430Var.f28079a.a().f34491a, new String[]{"market_filter"}, new sax(b3, yjeVar, (byte) 28)), q430Var, (byte) 0), new mc60(jLongValue, pzuVar, j3, null)), jLongValue, (byte) 2);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar3, t7hVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                xzp xzpVar = (xzp) obj2;
                n0o0 n0o0Var = (n0o0) xzpVar.g;
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    kmq kmqVar4 = (kmq) this.k;
                    jxt jxtVar = new jxt(((v7i) xzpVar.c).k((List) this.l, ((sff0) n0o0Var.getValue()).J1, ((sff0) n0o0Var.getValue()).O1), ((ypl0) this.m).c.j, (byte) 0);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar4, jxtVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    kmq kmqVar5 = (kmq) this.k;
                    c3c0 c3c0Var = (c3c0) this.l;
                    u8u u8uVar = (u8u) ((a6u) this.m).e;
                    sip sipVar = (sip) obj2;
                    c3c0Var.getClass();
                    a6u a6uVar = (a6u) u8uVar.c;
                    jvn jvnVarB = ((uzc) u8uVar.b).b();
                    lnf0 lnf0VarD = ((knf0) a6uVar.b).d();
                    jo20 jo20Var = new jo20();
                    qbt.a(jo20Var, jvnVarB);
                    qbt.c(c3c0Var.f3668a, jo20Var);
                    qbt.g(lnf0VarD.b, jo20Var);
                    qbt.h(jo20Var);
                    qbt.j(lnf0VarD.f20342a, jo20Var);
                    qbt.l(jo20Var);
                    jo20Var.put("sportId", 189L);
                    qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
                    qbt.p(jo20Var);
                    jo20 jo20VarB = jo20Var.b();
                    iiw iiwVar = (iiw) a6uVar.d;
                    iiwVar.getClass();
                    int iOrdinal = sipVar.ordinal();
                    if (iOrdinal == 0) {
                        or30Var = iiwVar.b;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        or30Var = iiwVar.f14848a;
                    }
                    vsg0 vsg0VarR = gfx.R(or30Var, kpb.v(sipVar), null, new xg0(a6uVar, sipVar, jo20VarB, null, (byte) 12), 252);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar5, vsg0VarR, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                a6u a6uVar2 = (a6u) obj2;
                n0o0 n0o0Var2 = (n0o0) a6uVar2.f;
                wne wneVar8 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    kmq kmqVar6 = (kmq) this.k;
                    List list = (List) this.l;
                    String str3 = ((ypl0) this.m).c.j;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w3d.u(arrayList, ((giw) it.next()).e);
                    }
                    zj2 zj2Var = new zj2(((v7i) a6uVar2.d).k(arrayList, ((sff0) n0o0Var2.getValue()).J1, ((sff0) n0o0Var2.getValue()).O1), list, str3, (byte) 11);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar6, zj2Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                Set set = (Set) this.l;
                Set set2 = (Set) this.m;
                wne wneVar9 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    if (set2.size() <= 1) {
                        return iun.f15405a;
                    }
                    eduVar = (edu) obj2;
                    sjl0 sjl0Var = (sjl0) eduVar.b;
                    List listL0 = CollectionsKt.L0(set);
                    this.l = null;
                    this.m = null;
                    this.k = eduVar;
                    this.j = true;
                    objA2 = sjl0Var.a(listL0, this);
                    if (objA2 == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    edu eduVar2 = (edu) this.k;
                    z1x.P(obj);
                    eduVar = eduVar2;
                    objA2 = obj;
                }
                List<ril0> list2 = (List) objA2;
                eduVar.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (ril0 ril0Var : list2) {
                    arrayList2.add(new cok0(ril0Var.f30549a, ril0Var.b));
                }
                return arrayList2;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    kmq kmqVar7 = (kmq) this.k;
                    List list3 = (List) this.l;
                    Integer num = (Integer) this.m;
                    if (num != null && num.intValue() == 2) {
                        nvu nvuVar = (nvu) obj2;
                        mci mciVar = (mci) nvuVar.d;
                        boolean z15 = ((pru) nvuVar.c).a().J1;
                        list3.getClass();
                        txtVar = new txt((gmq) ((n0o0) mciVar.q).getValue(), list3, mciVar, z15, (byte) 1);
                    } else {
                        txtVar = new eu4(list3, b4);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar7, txtVar, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                nc0 nc0Var = (nc0) obj2;
                n0o0 n0o0Var3 = (n0o0) nc0Var.n;
                wne wneVar11 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    kmq kmqVar8 = (kmq) this.k;
                    jxt jxtVar2 = new jxt(((v7i) nc0Var.g).k((List) this.l, ((sff0) n0o0Var3.getValue()).J1, ((sff0) n0o0Var3.getValue()).O1), ((ypl0) this.m).c.j, (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar8, jxtVar2, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    kmq kmqVar9 = (kmq) this.k;
                    List list4 = (List) this.l;
                    ieu ieuVar = (ieu) ((wdu) this.m).b;
                    rh6 rh6Var = (rh6) obj2;
                    list4.getClass();
                    boolean z18 = rh6Var.g;
                    vsg0 vsg0VarH = nkb.H(z18 ? 8L : 30L, z18 ? i2o.LiveGameFinished : i2o.LineGameFinished, new djx((byte) 24), new pcy((byte) 17), new xg0(ieuVar, rh6Var, list4, null, (byte) 14));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar9, vsg0VarH, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                kmq kmqVar10 = (kmq) this.k;
                Throwable th = (Throwable) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    v360 v360Var = (v360) this.m;
                    int i2 = v360.x0;
                    v360Var.b0(th);
                    lz50 lz50Var = new lz50(obj2, th);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar10.a(lz50Var, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                kmq kmqVar11 = (kmq) this.k;
                Throwable th2 = (Throwable) this.l;
                wne wneVar14 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    v360 v360Var2 = (v360) this.m;
                    int i3 = v360.x0;
                    v360Var2.b0(th2);
                    qz50 qz50Var = new qz50((Throwable) obj2, iun.f15405a);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar11.a(qz50Var, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    kmq kmqVar12 = (kmq) this.k;
                    if (((sw00) this.l).f32897a) {
                        w5z w5zVar = (w5z) this.m;
                        boolean z22 = ((sff0) obj2).b.N;
                        String strA = ((ntu) w5zVar.c).a();
                        vsg0Var = aoq.a(new vsg0(new kb60(w5zVar, strA, z22, null)), new tu3(w5zVar, strA, z22, (yje) null));
                    } else {
                        vsg0Var = new vsg0(new fot(b3, yjeVar, (byte) 8));
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar12, vsg0Var, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    kmq kmqVar13 = (kmq) this.k;
                    o530[] o530VarArr = (o530[]) ((Object[]) this.l);
                    int length2 = o530VarArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            o530 o530Var = o530VarArr[i4];
                            if (!o530Var.f24669a) {
                                List list5 = o530Var.b;
                                if (!list5.isEmpty() && !list5.isEmpty()) {
                                    Iterator it2 = list5.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            continue;
                                        } else if (!((xt20) it2.next()).f41445a.isEmpty()) {
                                        }
                                    }
                                }
                            }
                            i4++;
                        } else {
                            List list6 = (List) obj2;
                            int length3 = o530VarArr.length;
                            ArrayList<Pair> arrayList3 = new ArrayList(Math.min(r3d.q(list6, 10), length3));
                            int i5 = 0;
                            for (Object obj3 : list6) {
                                if (i5 < length3) {
                                    arrayList3.add(new Pair(obj3, o530VarArr[i5]));
                                    i5++;
                                } else if (!arrayList3.isEmpty()) {
                                    for (Pair pair : arrayList3) {
                                        xum0Var = (xum0) pair.f46059a;
                                        o530 o530Var2 = (o530) pair.b;
                                        if (xum0Var.b != xum0Var.c || !o530Var2.f24669a) {
                                        }
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                while (r3.hasNext()) {
                                    xum0Var = (xum0) pair.f46059a;
                                    o530 o530Var3 = (o530) pair.b;
                                    if (xum0Var.b != xum0Var.c) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar13.a(boolValueOf, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    kmq kmqVar14 = (kmq) this.k;
                    gmq gmqVarV = (!((Boolean) this.l).booleanValue() || ((Boolean) ((pz40) this.m).getValue()).booleanValue()) ? dun.f6704a : ydx.V(null, new wz80((xk80) obj2, (byte) 14));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar14, gmqVarV, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                jvm0 jvm0Var = (jvm0) obj2;
                ctf0 ctf0Var = jvm0Var.b;
                List list7 = (List) this.m;
                String str4 = (String) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z25 = this.j;
                if (z25) {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList4 = (ArrayList) this.l;
                    z1x.P(obj);
                    return arrayList4;
                }
                ArrayList arrayListT = twn.t(obj);
                for (Object obj4 : list7) {
                    if (!(((xvm0) obj4) instanceof svm0)) {
                        arrayListT.add(obj4);
                    }
                }
                ArrayList<xvm0> arrayList5 = new ArrayList();
                for (Object obj5 : arrayListT) {
                    if (!(((xvm0) obj5) instanceof rvm0)) {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (xvm0 xvm0Var : arrayList5) {
                    long id = xvm0Var.getId();
                    if ((xvm0Var instanceof rvm0) || (xvm0Var instanceof svm0)) {
                        dvm0Var = null;
                    } else {
                        if (xvm0Var instanceof tvm0) {
                            name = ((tvm0) xvm0Var).d;
                            if (name == null) {
                                name = ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                            }
                        } else {
                            if (!(xvm0Var instanceof wvm0)) {
                                t9f.b();
                                return null;
                            }
                            name = ((wvm0) xvm0Var).getName();
                            if (name == null) {
                                name = ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        dvm0Var = new dvm0(id, name);
                    }
                    if (dvm0Var != null) {
                        arrayList6.add(dvm0Var);
                    }
                }
                ArrayList<dvm0> arrayList7 = new ArrayList();
                for (Object obj6 : arrayList6) {
                    dvm0 dvm0Var2 = (dvm0) obj6;
                    if (str4.length() == 0 || StringsKt.O(dvm0Var2.b, str4, true)) {
                        arrayList7.add(obj6);
                    }
                }
                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                for (dvm0 dvm0Var3 : arrayList7) {
                    arrayList8.add(new uxm0(dvm0Var3.f6751a, dvm0Var3.b));
                }
                if (arrayList8.isEmpty()) {
                    qoj0 qoj0Var = jvm0Var.e;
                    ra10 ra10Var = jvm0Var.d;
                    this.m = null;
                    this.k = null;
                    this.l = arrayList8;
                    this.j = true;
                    if (qoj0Var.a(ra10Var, this) == wneVar18) {
                        return wneVar18;
                    }
                }
                return arrayList8;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    kmq kmqVar15 = (kmq) this.k;
                    if (((Boolean) this.l).booleanValue()) {
                        zco0 zco0Var = (zco0) this.m;
                        int i6 = zco0.r0;
                        eu4Var = new eu4(new rf0(new fnq(new omi0(vtb.N(((tj60) zco0Var.S.f30285a.f24171a).b), (sh60) obj2, (byte) 9), new din0(zco0Var, yjeVar, b3), (byte) 4), b4), (byte) 29);
                    } else {
                        eu4Var = new eu4(Unit.f46060a, b4);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar15, eu4Var, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rio0 rio0Var = (rio0) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    kmq kmqVar16 = (kmq) this.k;
                    boolean zBooleanValue = ((Boolean) this.l).booleanValue();
                    gmq p6dVar = (mgo0) this.m;
                    if (zBooleanValue) {
                        p6dVar = new p6d(p6dVar, rio0Var.p0.a(), new p4b0(rio0Var, yjeVar, b4), b5);
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar16, p6dVar, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                sip sipVar2 = (sip) this.m;
                wne wneVar21 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    kmq kmqVar17 = (kmq) this.k;
                    jvn jvnVar = (jvn) this.l;
                    int iOrdinal2 = sipVar2.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            t9f.b();
                            return null;
                        }
                        j = 8;
                    }
                    vsg0 vsg0VarH0 = bkb.h0(j, TimeUnit.SECONDS, new v2r0((z2r0) obj2, sipVar2, jvnVar, null));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar17, vsg0VarH0, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe0(yje yjeVar, Object obj, Object obj2, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe0(v360 v360Var, Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = v360Var;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(yje yjeVar, eqb eqbVar, String str) {
        super(3, yjeVar);
        this.i = (byte) 2;
        this.n = eqbVar;
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe0(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
    }
}
