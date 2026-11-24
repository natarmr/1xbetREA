package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tr extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(long j, long j2, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.k = j;
        this.l = j2;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                tr trVar = new tr(obj2, this.l, yjeVar, (byte) 0);
                trVar.k = ((Number) obj).longValue();
                return trVar;
            case 1:
                tr trVar2 = new tr(obj2, this.l, yjeVar, (byte) 1);
                trVar2.k = ((Number) obj).longValue();
                return trVar2;
            case 2:
                return new tr((qo0) obj2, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new tr((n21) obj2, this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new tr(this.k, this.l, (pz40) obj2, yjeVar);
            case 5:
                return new tr((spr) obj2, this.k, this.l, yjeVar, (byte) 5);
            case 6:
                return new tr((k4s) obj2, this.k, this.l, yjeVar, (byte) 6);
            case 7:
                return new tr((g9s) obj2, this.k, this.l, yjeVar, (byte) 7);
            case 8:
                return new tr((yks) obj2, this.k, this.l, yjeVar, (byte) 8);
            case 9:
                tr trVar3 = new tr(obj2, this.l, yjeVar, (byte) 9);
                trVar3.k = ((Number) obj).longValue();
                return trVar3;
            case 10:
                return new tr((eiz) obj2, this.k, this.l, yjeVar, (byte) 10);
            case 11:
                return new tr((l7b0) obj2, this.k, this.l, yjeVar, (byte) 11);
            case 12:
                tr trVar4 = new tr(obj2, this.l, yjeVar, (byte) 12);
                trVar4.k = ((Number) obj).longValue();
                return trVar4;
            case 13:
                tr trVar5 = new tr(obj2, this.l, yjeVar, (byte) 13);
                trVar5.k = ((Number) obj).longValue();
                return trVar5;
            default:
                return new tr((bwl0) obj2, this.k, this.l, yjeVar, (byte) 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tr) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tr) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((tr) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((tr) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((tr) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        Object value;
        long j;
        Object objB;
        Object objA;
        byte b = this.i;
        long j2 = this.l;
        Object obj2 = this.m;
        Integer numE = null;
        switch (b) {
            case 0:
                long j3 = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    m0o0 m0o0Var = (m0o0) ((xr) obj2).f41344a;
                    this.k = j3;
                    this.j = true;
                    Object objG = m0o0Var.b.g(this.l, j3, this);
                    if (objG != wneVar) {
                        objG = Unit.f46060a;
                    }
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                long j4 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    y3v y3vVar = (y3v) ((cu) obj2).c;
                    this.k = j4;
                    this.j = true;
                    Object objB2 = ((y9n0) y3vVar.b).b(this.l, j4, this);
                    if (objB2 != wneVar2) {
                        objB2 = Unit.f46060a;
                    }
                    if (objB2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                qo0 qo0Var = (qo0) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    mlr mlrVar = (mlr) ((ln0) qo0Var.D()).j.get(new Long(this.k));
                    if (mlrVar == null) {
                        return Unit.f46060a;
                    }
                    long j5 = mlrVar.f22006a;
                    yk0 yk0Var = ((ln0) qo0Var.D()).f20321a;
                    int iOrdinal = yk0Var.ordinal();
                    if (iOrdinal == 0) {
                        i = 8123;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        i = 8117;
                    }
                    int i2 = i;
                    p7m0 p7m0Var = qo0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        j = this.l;
                    } while (!p7m0Var.m(value, ln0.a((ln0) value, null, false, null, null, null, null, null, null, j, false, 49151)));
                    un0 un0VarS = qo0Var.S(yk0Var);
                    List list = un0VarS instanceof rn0 ? ((rn0) un0VarS).f30764a : iun.f15405a;
                    if (list.isEmpty()) {
                        j8b j8bVarN = qo0Var.N(mlrVar, j);
                        list = j8bVarN != null ? j8bVarN.c : null;
                    }
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                            } else if (((mlr) it.next()).f22006a != j5) {
                                i3++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i3);
                        if (i3 < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            numE = kng0.e(1, numValueOf);
                        }
                    }
                    Integer num = numE;
                    qo0Var.z.a((int) j5, i2, num, "aggregator_favorite", null);
                    u58 u58Var = qo0Var.w;
                    u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, mlrVar.f22006a, "aggregator_favorite", Long.valueOf(i2), null, num, null, 40));
                    pw70 pw70Var = qo0Var.s;
                    String strP = qo0Var.P(mlrVar, j, yk0Var);
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVar, strP, i2, false, false, this, 114) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                n21 n21Var = (n21) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    mlr mlrVar2 = (mlr) ((q11) n21Var.D()).k.get(new Long(this.k));
                    if (mlrVar2 != null) {
                        pw70 pw70Var2 = n21Var.s;
                        String strK = n21Var.I.k(n21Var.M(new Long(j2), mlrVar2.f22006a));
                        this.j = true;
                        if (pw70.b(pw70Var2, mlrVar2, strK, 0, false, false, this, 114) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                pz40 pz40Var = (pz40) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    pz40Var.setValue(new y3d(this.k));
                    this.j = true;
                    if (qcc.O(4000L, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                pz40Var.setValue(new y3d(j2));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    aqp aqpVar = ((spr) obj2).S;
                    long j6 = this.k;
                    this.j = true;
                    if (aqpVar.a(j6, this.l, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    aqp aqpVar2 = ((k4s) obj2).R;
                    long j7 = this.k;
                    this.j = true;
                    if (aqpVar2.a(j7, this.l, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    aqp aqpVar3 = ((g9s) obj2).U;
                    long j8 = this.k;
                    this.j = true;
                    if (aqpVar3.a(j8, this.l, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    aqp aqpVar4 = ((yks) obj2).U;
                    long j9 = this.k;
                    this.j = true;
                    if (aqpVar4.a(j9, this.l, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                long j10 = this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (z10) {
                    if (z10) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                o0u o0uVar = (o0u) ((ieu) obj2).c;
                this.k = j10;
                this.j = true;
                Object objA2 = o0uVar.f24447a.a(this.l, j10, this);
                return objA2 == wneVar10 ? wneVar10 : objA2;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (z11) {
                    if (z11) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                j3c j3cVar = ((eiz) obj2).s;
                long j11 = this.k;
                this.j = true;
                Object objA3 = j3cVar.a(j11, this.l, this);
                return objA3 == wneVar11 ? wneVar11 : objA3;
            case 11:
                long j12 = this.k;
                l7b0 l7b0Var = (l7b0) obj2;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    h3c h3cVar = l7b0Var.q;
                    this.j = true;
                    objB = h3cVar.b(j12, this);
                    if (objB == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                if (!((Boolean) objB).booleanValue()) {
                    return Unit.f46060a;
                }
                l7b0Var.p.k(pzb.C(new lf4((byte) 8, this.l, j12)));
                return Unit.f46060a;
            case 12:
                long j13 = this.k;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    m0o0 m0o0Var2 = (m0o0) ((lhf0) obj2).b;
                    this.k = j13;
                    this.j = true;
                    Object objG2 = m0o0Var2.b.g(this.l, j13, this);
                    if (objG2 != wneVar13) {
                        objG2 = Unit.f46060a;
                    }
                    if (objG2 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                long j14 = this.k;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    y3v y3vVar2 = (y3v) ((oif0) obj2).b;
                    this.k = j14;
                    this.j = true;
                    Object objB3 = ((y9n0) y3vVar2.b).b(this.l, j14, this);
                    if (objB3 != wneVar14) {
                        objB3 = Unit.f46060a;
                    }
                    if (objB3 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                bwl0 bwl0Var = (bwl0) obj2;
                knf0 knf0Var = bwl0Var.b;
                Object zvl0Var = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    pmi0 pmi0Var = bwl0Var.f3331a;
                    long j15 = this.k;
                    String strC = knf0Var.c();
                    knf0Var.getClass();
                    int iB = knf0Var.b();
                    this.j = true;
                    objA = ((qvl0) ((enj0) pmi0Var.f27236a).invoke()).a(j15, this.l, strC, 1, iB, this);
                    if (objA != zvl0Var) {
                    }
                    return zvl0Var;
                }
                if (!z15) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                kwl0 kwl0Var = ((nwl0) ((dx5) objA).a()).f24239a;
                if (kwl0Var == null) {
                    return null;
                }
                String str = kwl0Var.f19007a;
                String str2 = str == null ? "" : str;
                String str3 = kwl0Var.b;
                String str4 = str3 == null ? "" : str3;
                String str5 = kwl0Var.c;
                String str6 = str5 == null ? "" : str5;
                String str7 = kwl0Var.d;
                String str8 = str7 == null ? "" : str7;
                String str9 = kwl0Var.e;
                String str10 = str9 == null ? "" : str9;
                String str11 = kwl0Var.f;
                String str12 = str11 == null ? "" : str11;
                String str13 = kwl0Var.g;
                String str14 = str13 == null ? "" : str13;
                String str15 = kwl0Var.h;
                String str16 = str15 == null ? "" : str15;
                String str17 = kwl0Var.i;
                String str18 = str17 == null ? "" : str17;
                String str19 = kwl0Var.j;
                String str20 = str19 == null ? "" : str19;
                String str21 = kwl0Var.k;
                String str22 = str21 == null ? "" : str21;
                String str23 = kwl0Var.l;
                String str24 = str23 == null ? "" : str23;
                String str25 = kwl0Var.m;
                String str26 = str25 == null ? "" : str25;
                List list2 = kwl0Var.n;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                zvl0Var = new zvl0(str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, str24, str26, list2);
                return zvl0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr(Object obj, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = j;
        this.l = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.l = j;
    }
}
