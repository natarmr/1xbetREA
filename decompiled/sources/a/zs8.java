package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zs8 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ float k;
    public final /* synthetic */ g6u0 l;
    public final /* synthetic */ et8 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs8(int i, float f, g6u0 g6u0Var, et8 et8Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.j = i;
        this.k = f;
        this.l = g6u0Var;
        this.m = et8Var;
        this.n = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zs8(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zs8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            float fB = ((float) Math.abs(this.j)) < this.k ? 0.0f : g6u0.b(this.l.f10786a);
            float fAbs = Math.abs(fB);
            et8 et8Var = this.m;
            if (fAbs > 0.0f) {
                this.i = true;
                if (et8Var.a(fB, this.n, this) == wneVar) {
                    return wneVar;
                }
            } else {
                zr8 zr8Var = et8Var.b;
                if (zr8Var != null) {
                    zr8Var.c();
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
