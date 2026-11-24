package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nz0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a01 k;
    public final /* synthetic */ mlr l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(a01 a01Var, mlr mlrVar, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = a01Var;
        this.l = mlrVar;
        this.m = j;
        this.n = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new nz0(this.k, this.l, this.n, this.m, yjeVar, (byte) 0);
            case 1:
                return new nz0(this.k, this.l, this.m, this.n, yjeVar);
            default:
                return new nz0(this.k, this.l, this.n, this.m, yjeVar, (byte) 2);
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
        }
        return ((nz0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        long j = this.m;
        mlr mlrVar = this.l;
        a01 a01Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = a01Var.x;
                    String strO = a01Var.O(mlrVar, j);
                    this.j = true;
                    if (xexVar.I(mlrVar, this.n, strO, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                a01 a01Var2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    ytt yttVar = a01Var2.I;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                a01Var2.q.d(new zz0(a01Var2, this.l, this.m, this.n, (byte) 0));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    zn00 zn00Var = a01Var.y;
                    long j2 = mlrVar.f22006a;
                    String strO2 = a01Var.O(mlrVar, j);
                    this.j = true;
                    if (zn00Var.N0(this.n, j2, this, strO2) == wneVar3) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz0(a01 a01Var, mlr mlrVar, int i, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a01Var;
        this.l = mlrVar;
        this.n = i;
        this.m = j;
    }
}
