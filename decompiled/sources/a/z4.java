package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ lbh0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(lbh0 lbh0Var, float f, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = lbh0Var;
        this.k = f;
        this.l = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new z4(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.k)) << 32) | (((long) Float.floatToRawIntBits(this.l)) & 4294967295L);
            this.i = true;
            if (fbh0.c(this.j.s1, jFloatToRawIntBits, this) == wneVar) {
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
    }
}
