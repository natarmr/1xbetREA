package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class l57 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z77 j;
    public final /* synthetic */ w2d k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l57(z77 z77Var, w2d w2dVar, xcz xczVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z77Var;
        this.k = w2dVar;
        this.l = xczVar;
        this.m = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new l57(this.j, this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new l57(this.j, this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new l57(this.j, this.k, this.l, this.m, yjeVar, (byte) 2);
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
        return ((l57) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a37 a37Var = a37.f159a;
        Function1 function1 = this.m;
        xcz xczVar = this.l;
        w2d w2dVar = this.k;
        z77 z77Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z77Var.e()) {
                    w2dVar.f38442a.b(1.0f);
                    v0h0 v0h0Var = xcz.y;
                    xczVar.k(0, 0);
                    function1.invoke(a37Var);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z77Var.e()) {
                    w2dVar.f38442a.b(1.0f);
                    v0h0 v0h0Var2 = xcz.y;
                    xczVar.k(0, 0);
                    function1.invoke(a37Var);
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z77Var.e()) {
                    w2dVar.f38442a.b(1.0f);
                    v0h0 v0h0Var3 = xcz.y;
                    xczVar.k(0, 0);
                    function1.invoke(a37Var);
                }
                break;
        }
        return Unit.f46060a;
    }
}
