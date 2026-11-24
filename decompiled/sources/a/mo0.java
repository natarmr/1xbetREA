package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(f7u f7uVar, boolean z, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.n = f7uVar;
        this.l = z;
        this.k = j;
        this.m = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new mo0((qo0) obj2, this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new mo0((dp1) obj2, this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                return new mo0(this.l, this.k, this.m, (t33) obj2, yjeVar);
            default:
                return new mo0((f7u) obj2, this.l, this.k, this.m, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mo0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mo0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mo0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mo0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        byte b = this.i;
        long j = this.m;
        long j2 = this.k;
        boolean z = this.l;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                qo0 qo0Var = (qo0) obj2;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mlr mlrVar = (mlr) ((ln0) qo0Var.D()).j.get(new Long(j2));
                    if (mlrVar != null) {
                        yk0 yk0Var = ((ln0) qo0Var.D()).f20321a;
                        xr xrVar = qo0Var.G;
                        boolean z3 = !z;
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
                        String strP = qo0Var.P(mlrVar, j, yk0Var);
                        this.j = true;
                        if (xrVar.m(mlrVar, z3, i, strP, this) == wneVar) {
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
                dp1 dp1Var = (dp1) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    mlr mlrVar2 = (mlr) ((bo1) dp1Var.D()).g.get(new Long(j2));
                    if (mlrVar2 != null) {
                        xr xrVar2 = dp1Var.z;
                        boolean z5 = !z;
                        ((bo1) dp1Var.D()).getClass();
                        String strN = dp1Var.N(mlrVar2, j);
                        this.j = true;
                        if (xrVar2.m(mlrVar2, z5, 0, strN, this) == wneVar2) {
                            return wneVar2;
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (z) {
                        j = j2;
                    }
                    if (!h2t0.a(((y3d) ((hgk0) ((t33) obj2).e).getValue()).f41946a, j)) {
                        y3d y3dVar = new y3d(j);
                        uts0 uts0VarM0 = ro4.m0(700, 0, ihn.f14788a, 2);
                        this.j = true;
                        if (t33.a((t33) obj2, y3dVar, uts0VarM0, null, null, this, 12) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                f7u f7uVar = (f7u) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                krt0 krt0VarA = ((gst0) f7uVar.b).f11847a.a();
                boolean z8 = this.l;
                boolean z9 = z8 ? krt0VarA.c : krt0VarA.b;
                wdu wduVar = (wdu) f7uVar.d;
                long j3 = krt0VarA.f18785a;
                jvn jvnVarB = ((uzc) f7uVar.c).b();
                this.j = true;
                Serializable serializableG = wduVar.g(z8, this.k, j3, z9, jvnVarB, this.m, this);
                return serializableG == wneVar4 ? wneVar4 : serializableG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo0(i3t0 i3t0Var, long j, boolean z, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = i3t0Var;
        this.k = j;
        this.l = z;
        this.m = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(boolean z, long j, long j2, t33 t33Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = z;
        this.k = j;
        this.m = j2;
        this.n = t33Var;
    }
}
