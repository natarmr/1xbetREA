package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ubd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ z77 k;
    public final /* synthetic */ w2d l;
    public final /* synthetic */ xcz m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubd(z77 z77Var, w2d w2dVar, xcz xczVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z77Var;
        this.l = w2dVar;
        this.m = xczVar;
        this.n = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ubd(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new ubd(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((ubd) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a37 a37Var = a37.f159a;
        Function1 function1 = this.n;
        xcz xczVar = this.m;
        w2d w2dVar = this.l;
        z77 z77Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (z77Var.e()) {
                        w2dVar.f38442a.b(1.0f);
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.f(0, 0, this) == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(a37Var);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (z77Var.g()) {
                        w2dVar.f38442a.b(1.0f);
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar.f(0, 0, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                function1.invoke(a37Var);
                return Unit.f46060a;
        }
    }
}
