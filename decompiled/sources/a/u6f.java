package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u6f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public r7f j;
    public boolean k;
    public final /* synthetic */ r7f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6f(r7f r7fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = r7fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r7f r7fVar = this.l;
        switch (b) {
            case 0:
                return new u6f(r7fVar, yjeVar, (byte) 0);
            default:
                return new u6f(r7fVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((u6f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        r7f r7fVar;
        byte b = this.i;
        r7f r7fVar2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    khf0 khf0Var = r7fVar2.w0;
                    bm5 bm5Var = bm5.i;
                    this.j = r7fVar2;
                    this.k = true;
                    obj = khf0.G(khf0Var, bm5Var, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                    r7fVar = r7fVar2;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7fVar = this.j;
                    z1x.P(obj);
                }
                r7fVar.i0((ql5) obj);
                r7fVar2.R(j3f.f15829a);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    khf0 khf0Var2 = r7fVar2.w0;
                    bm5 bm5Var2 = bm5.i;
                    this.j = r7fVar2;
                    this.k = true;
                    obj = khf0.G(khf0Var2, bm5Var2, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7fVar2 = this.j;
                    z1x.P(obj);
                }
                r7fVar2.i0((ql5) obj);
                return Unit.f46060a;
        }
    }
}
