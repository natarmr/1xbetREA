package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dzl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzl(bzl bzlVar, float f, sjj sjjVar, nul0 nul0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = bzlVar;
        this.k = f;
        this.m = sjjVar;
        this.n = nul0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new dzl((bzl) this.l, this.k, (sjj) obj3, (nul0) obj2, yjeVar);
            default:
                dzl dzlVar = new dzl(this.k, (j73) obj3, (jie0) obj2, yjeVar);
                dzlVar.l = obj;
                return dzlVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dzl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dzl) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (mbc.b0(((bzl) this.l).f3474a, this.k, (sjj) obj3, (nul0) obj2, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vs90 vs90Var = new vs90((jie0) obj2, (qah0) this.l, (byte) 1);
                    this.j = true;
                    if (hhm0.n(0.0f, this.k, (j73) obj3, vs90Var, this, 4) == wneVar2) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzl(float f, j73 j73Var, jie0 jie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = f;
        this.m = j73Var;
        this.n = jie0Var;
    }
}
