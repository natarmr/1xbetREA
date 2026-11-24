package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes4.dex */
public final class sr extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr(i3t0 i3t0Var, Object obj, long j, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = i3t0Var;
        this.m = obj;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 0);
            case 1:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 1);
            case 2:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 2);
            case 3:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 3);
            case 4:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 4);
            case 5:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 5);
            case 6:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 6);
            case 7:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 7);
            case 8:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 8);
            case 9:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 9);
            case 10:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 10);
            case 11:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 11);
            case 12:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 12);
            case 13:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 13);
            case 14:
                return new sr(obj2, this.l, obj, yjeVar, (byte) 14);
            case 15:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 15);
            default:
                return new sr((i3t0) obj2, obj, this.l, yjeVar, (byte) 16);
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
        }
        return ((sr) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        Object objB5;
        Object objB6;
        Object objB7;
        byte b = this.i;
        byte b2 = 16;
        long j = this.l;
        Object obj3 = this.k;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var = (m0o0) ((xr) obj3).f41344a;
                this.j = true;
                Object objB8 = m0o0Var.b.b(this.l, true, (xvs) obj4, this);
                return objB8 == wneVar ? wneVar : objB8;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (((kki) ((xr) obj3).b).a(j, (h9n0) obj4, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    Object obj5 = ((j0g0) obj).f15681a;
                }
                return Unit.f46060a;
            case 2:
                n21 n21Var = (n21) obj3;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pw70 pw70Var = n21Var.s;
                js0 js0Var = (js0) obj4;
                mlr mlrVarA = mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), js0Var.f17026a, js0Var.f, js0Var.e, null, js0Var.g, js0Var.h, false, 255992);
                eyg0 eyg0Var = n21Var.I;
                int iOrdinal = ((q11) n21Var.D()).b.ordinal();
                if (iOrdinal == 0) {
                    str = "aggregator_gifts_all";
                } else if (iOrdinal == 1) {
                    str = "aggregator_gifts_bonuses";
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    str = "aggregator_gifts_freespins";
                }
                String str2 = str;
                Iterator it = ((q11) n21Var.D()).w.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((g3z) next).f10637a == j) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                String strK = eyg0Var.k(new lu0(0L, 1, str2, q3d.k((g3z) obj2)));
                this.j = true;
                if (pw70.b(pw70Var, mlrVarA, strK, 0, true, false, this, 82) == wneVar3) {
                    return wneVar3;
                }
                return Unit.f46060a;
            case 3:
                mlr mlrVar = (mlr) obj4;
                dp1 dp1Var = (dp1) obj3;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    pw70 pw70Var2 = dp1Var.s;
                    ((bo1) dp1Var.D()).getClass();
                    String strN = dp1Var.N(mlrVar, j);
                    this.j = true;
                    if (pw70.b(pw70Var2, mlrVar, strN, 0, false, false, this, 114) == wneVar4) {
                        return wneVar4;
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
                szj0 szj0Var = (szj0) obj4;
                rnf rnfVar = (rnf) obj3;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    h3c h3cVar = rnfVar.Q;
                    long j2 = szj0Var.c;
                    this.j = true;
                    objB = h3cVar.b(j2, this);
                    if (objB == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                qv2 qv2Var = rnfVar.R;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.UNKNOWN;
                long j3 = szj0Var.c;
                Long l = szj0Var.d;
                rnfVar.O.c().d(new sw8(szj0Var, rnfVar, qv2Var.h(new GameScreenGeneralParams(this.l, 0L, j3, l != null ? l.longValue() : 0L, zBooleanValue, 0L, kpb.u(szj0Var.b), gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, k1gVar)), b2));
                return Unit.f46060a;
            case 5:
                xig xigVar = (xig) obj3;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    boolean zY = axq.y(j, ((sig) xigVar.D()).j);
                    this.j = true;
                    if (xigVar.O((npn) obj4, zY, this) == wneVar6) {
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
                szj0 szj0Var2 = (szj0) obj4;
                ebl eblVar = (ebl) obj3;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    h3c h3cVar2 = eblVar.S;
                    long j4 = szj0Var2.c;
                    this.j = true;
                    objB2 = h3cVar2.b(j4, this);
                    if (objB2 == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objB2).booleanValue();
                qv2 qv2Var2 = eblVar.U;
                GameBroadcastType gameBroadcastType2 = GameBroadcastType.c;
                grs grsVar2 = grs.b;
                ors orsVar2 = ors.f25750a;
                k1g k1gVar2 = k1g.UNKNOWN;
                long j5 = szj0Var2.c;
                Long l2 = szj0Var2.d;
                eblVar.P.c().d(new sw8((Object) szj0Var2, (Object) eblVar, (Object) qv2Var2.h(new GameScreenGeneralParams(this.l, 0L, j5, l2 != null ? l2.longValue() : 0L, zBooleanValue2, 0L, kpb.u(szj0Var2.b), gameBroadcastType2, grsVar2, "main_screen", "", orsVar2, 0, false, k1gVar2)), (byte) 25));
                return Unit.f46060a;
            case 7:
                szj0 szj0Var3 = (szj0) obj4;
                b7o b7oVar = (b7o) obj3;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    h3c h3cVar3 = b7oVar.M;
                    long j6 = szj0Var3.c;
                    this.j = true;
                    objB3 = h3cVar3.b(j6, this);
                    if (objB3 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB3 = obj;
                }
                boolean zBooleanValue3 = ((Boolean) objB3).booleanValue();
                qv2 qv2Var3 = b7oVar.N;
                GameBroadcastType gameBroadcastType3 = GameBroadcastType.c;
                grs grsVar3 = grs.b;
                ors orsVar3 = ors.f25750a;
                k1g k1gVar3 = k1g.UNKNOWN;
                long j7 = szj0Var3.c;
                Long l3 = szj0Var3.d;
                b7oVar.L.c().d(new f8m(szj0Var3, b7oVar, qv2Var3.h(new GameScreenGeneralParams(this.l, 0L, j7, l3 != null ? l3.longValue() : 0L, zBooleanValue3, 0L, kpb.u(szj0Var3.b), gameBroadcastType3, grsVar3, "main_screen", "", orsVar3, 0, false, k1gVar3)), b2));
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    if (((k4s) obj3).B.w(j, (q5z) obj4, this) == wneVar9) {
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
                szj0 szj0Var4 = (szj0) obj4;
                u610 u610Var = (u610) obj3;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    h3c h3cVar4 = u610Var.S;
                    long j8 = szj0Var4.c;
                    this.j = true;
                    objB4 = h3cVar4.b(j8, this);
                    if (objB4 == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB4 = obj;
                }
                boolean zBooleanValue4 = ((Boolean) objB4).booleanValue();
                qv2 qv2Var4 = u610Var.T;
                GameBroadcastType gameBroadcastType4 = GameBroadcastType.c;
                grs grsVar4 = grs.b;
                ors orsVar4 = ors.f25750a;
                k1g k1gVar4 = k1g.UNKNOWN;
                long j9 = szj0Var4.c;
                Long l4 = szj0Var4.d;
                u610Var.P.c().d(new k9v((Object) szj0Var4, (Object) u610Var, (Object) qv2Var4.h(new GameScreenGeneralParams(this.l, 0L, j9, l4 != null ? l4.longValue() : 0L, zBooleanValue4, 0L, kpb.u(szj0Var4.b), gameBroadcastType4, grsVar4, "main_screen", "", orsVar4, 0, false, k1gVar4)), (byte) 21));
                return Unit.f46060a;
            case 10:
                szj0 szj0Var5 = (szj0) obj4;
                nl40 nl40Var = (nl40) obj3;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    h3c h3cVar5 = nl40Var.N;
                    long j10 = szj0Var5.c;
                    this.j = true;
                    objB5 = h3cVar5.b(j10, this);
                    if (objB5 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB5 = obj;
                }
                boolean zBooleanValue5 = ((Boolean) objB5).booleanValue();
                qv2 qv2Var5 = nl40Var.O;
                GameBroadcastType gameBroadcastType5 = GameBroadcastType.c;
                grs grsVar5 = grs.b;
                ors orsVar5 = ors.f25750a;
                k1g k1gVar5 = k1g.UNKNOWN;
                long j11 = szj0Var5.c;
                Long l5 = szj0Var5.d;
                nl40Var.L.c().d(new jl40((Object) szj0Var5, (Object) nl40Var, (Object) qv2Var5.h(new GameScreenGeneralParams(this.l, 0L, j11, l5 != null ? l5.longValue() : 0L, zBooleanValue5, 0L, kpb.u(szj0Var5.b), gameBroadcastType5, grsVar5, "main_screen", "", orsVar5, 0, false, k1gVar5)), (byte) 0));
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    eu90 eu90Var = ((g7a0) obj3).r;
                    vt20 vt20Var = new vt20(0, this.l, (String) obj4, false);
                    this.j = true;
                    if (eu90Var.a(vt20Var, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                szj0 szj0Var6 = (szj0) obj4;
                d1e0 d1e0Var = (d1e0) obj3;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    h3c h3cVar6 = d1e0Var.S;
                    long j12 = szj0Var6.c;
                    this.j = true;
                    objB6 = h3cVar6.b(j12, this);
                    if (objB6 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB6 = obj;
                }
                boolean zBooleanValue6 = ((Boolean) objB6).booleanValue();
                qv2 qv2Var6 = d1e0Var.T;
                GameBroadcastType gameBroadcastType6 = GameBroadcastType.c;
                grs grsVar6 = grs.b;
                ors orsVar6 = ors.f25750a;
                k1g k1gVar6 = k1g.UNKNOWN;
                long j13 = szj0Var6.c;
                Long l6 = szj0Var6.d;
                d1e0Var.P.c().d(new zlb0(szj0Var6, d1e0Var, qv2Var6.h(new GameScreenGeneralParams(this.l, 0L, j13, l6 != null ? l6.longValue() : 0L, zBooleanValue6, 0L, kpb.u(szj0Var6.b), gameBroadcastType6, grsVar6, "main_screen", "", orsVar6, 0, false, k1gVar6)), (byte) 9));
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (z14) {
                    if (z14) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var2 = (m0o0) ((lhf0) obj3).b;
                this.j = true;
                Object objB9 = m0o0Var2.b.b(this.l, false, (xvs) obj4, this);
                return objB9 == wneVar14 ? wneVar14 : objB9;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    this.j = true;
                    if (((kki) ((lhf0) obj3).c).c(cs0.u(j), (h9n0) obj4, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                m5r0 m5r0Var = (m5r0) obj3;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    hjd hjdVar = m5r0Var.q;
                    cid cidVar = new cid((String) obj4, new ks2());
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                pid pidVar = new pid(j);
                int i = m5r0.E;
                m5r0Var.N(pidVar);
                return Unit.f46060a;
            default:
                szj0 szj0Var7 = (szj0) obj4;
                f2u0 f2u0Var = (f2u0) obj3;
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    h3c h3cVar7 = f2u0Var.S;
                    long j14 = szj0Var7.c;
                    this.j = true;
                    objB7 = h3cVar7.b(j14, this);
                    if (objB7 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB7 = obj;
                }
                boolean zBooleanValue7 = ((Boolean) objB7).booleanValue();
                qv2 qv2Var7 = f2u0Var.T;
                GameBroadcastType gameBroadcastType7 = GameBroadcastType.c;
                grs grsVar7 = grs.b;
                ors orsVar7 = ors.f25750a;
                k1g k1gVar7 = k1g.UNKNOWN;
                long j15 = szj0Var7.c;
                Long l7 = szj0Var7.d;
                f2u0Var.P.c().d(new m8s0(szj0Var7, f2u0Var, qv2Var7.h(new GameScreenGeneralParams(this.l, 0L, j15, l7 != null ? l7.longValue() : 0L, zBooleanValue7, 0L, kpb.u(szj0Var7.b), gameBroadcastType7, grsVar7, "main_screen", "", orsVar7, 0, false, k1gVar7)), (byte) 6));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = j;
        this.m = obj2;
    }
}
