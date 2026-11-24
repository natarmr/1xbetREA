package a;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bk5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk5(jt80 jt80Var, boolean z, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.m = jt80Var;
        this.l = z;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new bk5((byte) 0, this.k, yjeVar, (dk5) obj2, this.l);
            case 1:
                bk5 bk5Var = new bk5((w6l) obj2, this.l, yjeVar);
                bk5Var.k = ((Number) obj).longValue();
                return bk5Var;
            case 2:
                return new bk5((byte) 2, this.k, yjeVar, (spr) obj2, this.l);
            case 3:
                return new bk5((byte) 3, this.k, yjeVar, (k4s) obj2, this.l);
            case 4:
                return new bk5((byte) 4, this.k, yjeVar, (g9s) obj2, this.l);
            case 5:
                return new bk5((byte) 5, this.k, yjeVar, (yks) obj2, this.l);
            case 6:
                return new bk5((jt80) obj2, this.l, this.k, yjeVar);
            default:
                return new bk5((byte) 7, this.k, yjeVar, (ncl0) obj2, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bk5) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bk5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        mlr mlrVar;
        int iU;
        String strK;
        byte b = this.i;
        boolean z = this.l;
        Object obj2 = this.m;
        byte b2 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                long j = this.k;
                dk5 dk5Var = (dk5) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sp spVar = dk5Var.k;
                    this.j = true;
                    objA = spVar.a(j, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                if (((Boolean) objA).booleanValue()) {
                    l7k l7kVar = dk5Var.A;
                    if (z) {
                        i8i.D("screen", "bill_management", dk5Var.l.f14765a, "deposit_call");
                        y1p y1pVar = y1p.MAIN;
                        l7kVar.b("bill_management", dk5Var.K.g());
                    } else {
                        i8i.D("screen", "bill_management", dk5Var.j.f14765a, "withdraw_call");
                        y1p y1pVar2 = y1p.MAIN;
                        l7kVar.c("bill_management");
                    }
                    dk5Var.m.a(dk5Var.b, z, j);
                } else {
                    p7m0 p7m0Var = dk5Var.Z;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                }
                return Unit.f46060a;
            case 1:
                w6l w6lVar = (w6l) obj2;
                long j2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (!w6lVar.isAttachedToWindow()) {
                        return Unit.f46060a;
                    }
                    long j3 = j2 / 1000;
                    long j4 = j3 / 60;
                    long seconds = j3 - TimeUnit.MINUTES.toSeconds(j4);
                    if (j4 == 0 || z) {
                        str = new DecimalFormat().format(j3);
                        str.getClass();
                    } else {
                        str = String.format(Locale.getDefault(), w6lVar.d, Arrays.copyOf(new Object[]{new DecimalFormat().format(j4), w6lVar.e.format(seconds)}, 2));
                    }
                    rwj rwjVar = tvk.f34603a;
                    vs10 vs10Var = ys10.f43147a;
                    sxk sxkVar = new sxk(w6lVar, str, objArr == true ? 1 : 0, b2);
                    this.k = j2;
                    this.j = true;
                    if (qjj.d0(vs10Var, sxkVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    spr sprVar = (spr) obj2;
                    hcp0 hcp0Var = sprVar.u;
                    long j5 = sprVar.p.f46985a;
                    long j6 = this.k;
                    this.j = true;
                    if (hcp0Var.p(j6, this.l, j5, 0L, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    k4s k4sVar = (k4s) obj2;
                    hcp0 hcp0Var2 = k4sVar.w;
                    long j7 = k4sVar.o.b;
                    long j8 = this.k;
                    this.j = true;
                    if (hcp0Var2.p(j8, this.l, j7, 0L, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    g9s g9sVar = (g9s) obj2;
                    hcp0 hcp0Var3 = g9sVar.u;
                    long j9 = g9sVar.p.f47002a;
                    long j10 = this.k;
                    this.j = true;
                    if (hcp0Var3.p(j10, this.l, j9, 0L, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    yks yksVar = (yks) obj2;
                    hcp0 hcp0Var4 = yksVar.u;
                    long j11 = yksVar.p.f47004a;
                    long j12 = this.k;
                    this.j = true;
                    if (hcp0Var4.p(j12, this.l, j11, 0L, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                jt80 jt80Var = (jt80) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (!jt80Var.V.c()) {
                        return Unit.f46060a;
                    }
                    List list = ((rs80) jt80Var.D()).r;
                    long j13 = this.k;
                    for (Object obj4 : list) {
                        if (((mlr) obj4).f22006a == j13) {
                            obj3 = obj4;
                            mlrVar = (mlr) obj3;
                            if (mlrVar == null) {
                                return Unit.f46060a;
                            }
                            iU = jt80Var.U();
                            strK = jt80Var.Z.k(jt80Var.O(mlrVar.f22006a));
                            this.j = true;
                            if (jt80Var.T.m(mlrVar, !z, iU, strK, this) == wneVar7) {
                                return wneVar7;
                            }
                        }
                    }
                    mlrVar = (mlr) obj3;
                    if (mlrVar == null) {
                        return Unit.f46060a;
                    }
                    iU = jt80Var.U();
                    strK = jt80Var.Z.k(jt80Var.O(mlrVar.f22006a));
                    this.j = true;
                    if (jt80Var.T.m(mlrVar, !z, iU, strK, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    ncl0 ncl0Var = (ncl0) obj2;
                    hcp0 hcp0Var5 = ncl0Var.g;
                    long j14 = ((zqs) ((p7m0) ncl0Var.w()).getValue()).c;
                    long j15 = this.k;
                    this.j = true;
                    if (hcp0Var5.p(j15, this.l, j14, 0L, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk5(w6l w6lVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.m = w6lVar;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk5(byte b, long j, yje yjeVar, diu0 diu0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.m = diu0Var;
        this.k = j;
        this.l = z;
    }
}
