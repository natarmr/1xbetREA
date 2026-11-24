package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lm0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dn0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm0(dn0 dn0Var, String str, boolean z, boolean z2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dn0Var;
        this.l = str;
        this.m = z;
        this.n = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new lm0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new lm0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((lm0) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    dn0 dn0Var = this.k;
                    Object objA = dn0Var.c.a(new jm0(dn0Var, this.l, this.m, this.n, null), this);
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar) {
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
                    this.j = true;
                    dn0 dn0Var2 = this.k;
                    Object objB = dn0Var2.c.b(new km0(dn0Var2, this.l, this.m, this.n, null), this);
                    if (objB != wneVar2) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar2) {
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
}
