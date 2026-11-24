package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class lv1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(f1b0 f1b0Var, jic0 jic0Var, boolean z, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.m = f1b0Var;
        this.n = jic0Var;
        this.l = z;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new lv1((uv1) this.m, this.k, this.l, (bv1) obj2, yjeVar, (byte) 0);
            case 1:
                return new lv1((yn2) this.m, this.k, this.l, (String) obj2, yjeVar, (byte) 1);
            case 2:
                lv1 lv1Var = new lv1((dk6) obj2, this.k, this.l, yjeVar);
                lv1Var.m = obj;
                return lv1Var;
            case 3:
                return new lv1((ieu) this.m, this.k, this.l, (are) obj2, yjeVar, (byte) 3);
            case 4:
                return new lv1((f1b0) this.m, (jic0) obj2, this.l, this.k, yjeVar);
            default:
                return new lv1((g9b0) this.m, this.k, this.l, (String) obj2, yjeVar, (byte) 5);
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
        }
        return ((lv1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objC0;
        Object objC2;
        Object objA;
        byte b = this.i;
        boolean z = this.l;
        long j = this.k;
        byte b2 = 0;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                uv1 uv1Var = (uv1) this.m;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mlr mlrVar = (mlr) ((yu1) uv1Var.D()).q.get(new Long(j));
                    if (mlrVar != null) {
                        String strM = uv1Var.M(j, (bv1) obj2);
                        this.j = true;
                        if (uv1Var.t.m(mlrVar, !z, 0, strM, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                yn2 yn2Var = (yn2) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    uf3 uf3Var = yn2Var.F;
                    this.j = true;
                    objC = uxs0.c(uf3Var.f35560a.f25044a, this.k, null, this.l, (String) obj2, 6);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                m7h0 m7h0Var = (m7h0) objC;
                i1w0 i1w0Var = yn2Var.I;
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                m7h0Var.getClass();
                if (m7h0Var instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(m7h0Var)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 2:
                dk6 dk6Var = (dk6) obj2;
                vne vneVar = (vne) this.m;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    pzu pzuVar = dk6Var.s;
                    long j2 = dk6Var.o.f47009a;
                    boolean z5 = ((hj6) dk6Var.D()).l;
                    boolean z6 = ((hj6) dk6Var.D()).m;
                    this.m = vneVar;
                    this.j = true;
                    objC0 = pzuVar.c0(this.k, j2, this, this.l, z5, z6);
                    if (objC0 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC0 = obj;
                }
                yje yjeVar = null;
                sac.T(new fnq((gmq) objC0, new qj6(dk6Var, yjeVar, b2), (byte) 4), vneVar, new zg0((diu0) dk6Var, this.k, yjeVar, (byte) 1));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    this.j = true;
                    objC2 = ((bl6) ((ieu) this.m).b).c(this.k, this.l, (are) obj2, this);
                    if (objC2 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC2 = ((j0g0) obj).f15681a;
                }
                return new j0g0(objC2);
            case 4:
                f1b0 f1b0Var = (f1b0) this.m;
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    String strK = f1b0Var.X.k(new lu0(0L, null, "popular_new_aggregator", hne.r(0L, "weekly_game")));
                    this.j = true;
                    if (f1b0Var.P.m(vdb.o0((jic0) obj2), !z, 0, strK, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z9 = !z;
                int i = f1b0.w0;
                u58 u58Var = f1b0Var.y;
                long j3 = this.k;
                u58Var.j(j3, z9, 0, "popular_new_aggregator", "game_banner");
                y1p y1pVar = y1p.MAIN;
                f1b0Var.D.h((int) j3, 0, "popular_new_aggregator", "game_banner", z9);
                return Unit.f46060a;
            default:
                g9b0 g9b0Var = (g9b0) this.m;
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    z4u z4uVar = g9b0Var.n;
                    this.j = true;
                    objA = z4uVar.a(j, this);
                    if (objA == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                g9b0Var.y.d(new k1b(g9b0Var, this.k, this.l, (String) obj2, !((Boolean) objA).booleanValue(), (byte) 4));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv1(dk6 dk6Var, long j, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.n = dk6Var;
        this.k = j;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv1(Object obj, long j, boolean z, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = j;
        this.l = z;
        this.n = obj2;
    }
}
