package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iw40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ lw40 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw40(lw40 lw40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = lw40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lw40 lw40Var = this.j;
        switch (b) {
            case 0:
                return new iw40(lw40Var, yjeVar, (byte) 0);
            default:
                return new iw40(lw40Var, yjeVar, (byte) 1);
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
        return ((iw40) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        lw40 lw40Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                joj0 joj0Var = (joj0) ((koj0) lw40Var.i.getValue());
                return new Integer(joj0Var.b.nativeGetCounterValue(joj0Var.c));
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                joj0 joj0Var2 = (joj0) ((koj0) lw40Var.i.getValue());
                return new Integer(joj0Var2.b.nativeIncrementAndGetCounterValue(joj0Var2.c));
        }
    }
}
