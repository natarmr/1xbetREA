package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u6t0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ o0x k;
    public final /* synthetic */ o0x l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6t0(Function1 function1, o0x o0xVar, o0x o0xVar2, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
        this.k = o0xVar;
        this.l = o0xVar2;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new u6t0(this.j, this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new u6t0(this.j, this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((u6t0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        o0x o0xVar = this.l;
        o0x o0xVar2 = this.k;
        pz40 pz40Var = this.m;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    o0xVar = o0xVar2;
                }
                function1.invoke(o0xVar);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    o0xVar = o0xVar2;
                }
                function1.invoke(o0xVar);
                break;
        }
        return Unit.f46060a;
    }
}
