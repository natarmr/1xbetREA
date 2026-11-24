package a;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class twu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ twu(Object obj, Object obj2, boolean z, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.o = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        Object obj5 = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                twu twuVar = new twu((yhi) obj5, (hie0) obj4, this.o, yjeVar, (byte) 0);
                twuVar.k = kmqVar;
                twuVar.l = obj2;
                return twuVar.invokeSuspend(Unit.f46060a);
            case 1:
                twu twuVar2 = new twu((yhi) obj5, (hie0) obj4, this.o, yjeVar, (byte) 1);
                twuVar2.k = kmqVar;
                twuVar2.l = obj2;
                return twuVar2.invokeSuspend(Unit.f46060a);
            default:
                twu twuVar3 = new twu((tzi) obj5, (sgs) obj4, this.o, yjeVar, (byte) 2);
                twuVar3.k = kmqVar;
                twuVar3.l = obj2;
                return twuVar3.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.kmq, java.lang.Object] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gmq eu4Var;
        gmq dnqVar;
        ?? r4;
        byte b = this.i;
        byte b2 = 3;
        Object obj2 = this.n;
        Object obj3 = this.m;
        byte b3 = 12;
        yje yjeVar = null;
        byte b4 = 1;
        switch (b) {
            case 0:
                yhi yhiVar = (yhi) obj3;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    yje yjeVar2 = null;
                    gmq eu4Var2 = ((Set) this.l).isEmpty() ? new eu4(iun.f15405a, (byte) 12) : aoq.c(bkb.j0(new vsg0(new fhq(yhiVar, yjeVar2, b3)), "GetSubscriptionsGamesScenario.loadGames", null, 56), new twu(yhiVar, (hie0) obj2, this.o, yjeVar2, (byte) 1));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, eu4Var2, this) == wneVar) {
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
                hie0 hie0Var = (hie0) obj2;
                yhi yhiVar2 = (yhi) obj3;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    String str = (String) this.l;
                    int iA = ((rpt) yhiVar2.n).a();
                    yje yjeVar3 = null;
                    fs fsVar = new fs((Object) yhiVar2, (Serializable) str, iA, (Object) new xvu(hie0Var, (byte) 1), yjeVar3, (byte) 7);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    utb utbVarC = aoq.c(new p6d(bkb.h0(8L, timeUnit, fsVar), bkb.h0(30L, timeUnit, new fs((Object) yhiVar2, (Serializable) str, iA, (Object) new xvu(hie0Var, (byte) 2), yjeVar3, (byte) 6)), new y8p(b2, yjeVar, (byte) 7), (byte) 1), new qwu(yjeVar, yhiVar2, this.o, b4));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, utbVarC, this) == wneVar2) {
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
            default:
                tzi tziVar = (tzi) obj3;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar3 = this.k;
                    gps gpsVar = (gps) this.l;
                    if (gpsVar != null) {
                        yje yjeVar4 = null;
                        if (gpsVar instanceof zos) {
                            pmi pmiVar = (pmi) tziVar.c;
                            zos zosVar = (zos) gpsVar;
                            sgs sgsVar = (sgs) obj2;
                            boolean z4 = ((yiu) tziVar.d).a() || ((pru) tziVar.e).a().O1;
                            sgsVar.getClass();
                            yje yjeVar5 = null;
                            dnqVar = new dnq(new a1g(new fnq(aoq.c(i120.W(new i89(((cmt) pmiVar.e).a(), (byte) 20)), new npp(null, pmiVar, zosVar, sgsVar, this.o, z4, (byte) 0)), new ic1((Object) pmiVar, (Object) zosVar, (Object) sgsVar, yjeVar4, (byte) 28), (byte) 4), zosVar, (byte) 18), new zo1((Object) zosVar, yjeVar5, (byte) 21), (byte) 1);
                            r4 = yjeVar5;
                        } else {
                            yje yjeVar6 = null;
                            if (gpsVar instanceof cps) {
                                cps cpsVar = (cps) gpsVar;
                                ros rosVar = ((ndq) tziVar.f).f23348a;
                                rosVar.getClass();
                                a1g a1gVar = new a1g(new vsg0(new cbq(new n1((Object) rosVar.f30853a, cpsVar.f4763a, yjeVar6, (byte) 9), yjeVar6, b2)), new pos(4, null), (byte) 20);
                                int i = hps.b;
                                uen uenVar = wen.b;
                                dnqVar = new dnq(new mdq(new dnq(new le0(new eu4(new anq(wen.j(cpsVar.d, ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS)), a1gVar, null), (byte) 9), (byte) 3), new qos((Object) cpsVar, yjeVar6, (byte) 0), (byte) 1), (byte) 0), new zo1((Object) cpsVar, yjeVar6, (byte) 26), (byte) 1);
                                r4 = yjeVar6;
                            } else if (gpsVar instanceof fps) {
                                fps fpsVar = (fps) gpsVar;
                                sos sosVar = fpsVar.d;
                                long j = fpsVar.f9943a;
                                int iOrdinal = sosVar.ordinal();
                                if (iOrdinal == 0) {
                                    eu4Var = new eu4(new clr(j), (byte) 12);
                                } else if (iOrdinal == 1) {
                                    eu4Var = new eu4(new elr(j), (byte) 12);
                                } else {
                                    if (iOrdinal != 2) {
                                        t9f.b();
                                        return null;
                                    }
                                    eu4Var = new i89(((b8u) tziVar.g).d(), (byte) 22);
                                }
                                dnqVar = eu4Var;
                                r4 = yjeVar6;
                            }
                        }
                        this.k = r4;
                        this.l = r4;
                        this.j = true;
                        if (slb.Q(kmqVar3, dnqVar, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
        }
    }
}
