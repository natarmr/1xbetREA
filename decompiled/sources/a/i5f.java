package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i5f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ r7f k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5f(r7f r7fVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r7fVar;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new i5f(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new i5f(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new i5f(this.k, this.l, yjeVar, (byte) 2);
            default:
                return new i5f(this.k, this.l, yjeVar, (byte) 3);
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
        }
        return ((i5f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objP;
        qu6 qu6Var;
        boolean z;
        byte b = this.i;
        r7f r7fVar = this.k;
        long j = this.l;
        Object obj2 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    r7fVar.g0();
                    qv2 qv2Var = r7fVar.K;
                    this.j = true;
                    if (qv2Var.s(j, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                r7fVar.b0.b();
                r7fVar.h0(false, false, new s4f(r7fVar, (byte) 8));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p0f p0fVar = p0f.CANCEL;
                    this.j = true;
                    if (r7fVar.U(p0fVar, j, this) == wneVar2) {
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
                long j2 = this.l;
                r7f r7fVar2 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    p0f p0fVar2 = p0f.CONFIRM;
                    this.j = true;
                    if (r7fVar2.U(p0fVar2, j2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                sac.V(jiu0.a(r7fVar2), h5f.f12477a, new s4f(r7fVar2, (byte) 2), r7fVar2.Y0.b, new i5f(r7fVar2, j2, null, (byte) 0), 8);
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                r7f r7fVar3 = this.k;
                if (!z5) {
                    z1x.P(obj);
                    znt zntVar = r7fVar3.e;
                    this.j = true;
                    objP = zntVar.f44690a.p(this);
                    if (objP == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objP = obj;
                }
                for (Object obj3 : (Iterable) objP) {
                    if (((qu6) obj3).c == j) {
                        obj2 = obj3;
                        qu6Var = (qu6) obj2;
                        if (qu6Var != null) {
                            vb9 vb9Var = r7fVar3.d.c().g0;
                            long j3 = qu6Var.c;
                            long j4 = qu6Var.b;
                            long j5 = qu6Var.e;
                            if (qu6Var.w == uoy.LIVE || (vb9Var != null && vb9Var.d)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            sac.V(jiu0.a(r7fVar3), null, null, r7fVar3.Y0.f22085a, new w6f(r7fVar3, j5, j3, j4, 0L, z, null), 11);
                        }
                        return Unit.f46060a;
                    }
                }
                qu6Var = (qu6) obj2;
                if (qu6Var != null) {
                    vb9 vb9Var2 = r7fVar3.d.c().g0;
                    long j6 = qu6Var.c;
                    long j7 = qu6Var.b;
                    long j8 = qu6Var.e;
                    if (qu6Var.w == uoy.LIVE) {
                        z = false;
                    } else {
                        z = false;
                    }
                    sac.V(jiu0.a(r7fVar3), null, null, r7fVar3.Y0.f22085a, new w6f(r7fVar3, j8, j6, j7, 0L, z, null), 11);
                }
                return Unit.f46060a;
        }
    }
}
