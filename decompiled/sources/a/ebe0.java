package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ebe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gbe0 k;
    public final /* synthetic */ o1x l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebe0(gbe0 gbe0Var, o1x o1xVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gbe0Var;
        this.l = o1xVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o1x o1xVar = this.l;
        gbe0 gbe0Var = this.k;
        switch (b) {
            case 0:
                return new ebe0(gbe0Var, o1xVar, yjeVar, (byte) 0);
            case 1:
                return new ebe0(gbe0Var, o1xVar, yjeVar, (byte) 1);
            default:
                return new ebe0(gbe0Var, o1xVar, yjeVar, (byte) 2);
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
        return ((ebe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        o1x o1xVar = this.l;
        gbe0 gbe0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i = gbe0.f;
                Object objB = gbe0Var.b(o1xVar, 0, this);
                return objB == wneVar ? wneVar : objB;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i2 = gbe0.f;
                Object objB2 = gbe0Var.b(o1xVar, 1, this);
                return objB2 == wneVar2 ? wneVar2 : objB2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    Object objC = gbe0Var.c(o1xVar, this);
                    return objC == wneVar3 ? wneVar3 : objC;
                }
                if (z3) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
