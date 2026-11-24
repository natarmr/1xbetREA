package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class m3b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v3b0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3b0(v3b0 v3b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = v3b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v3b0 v3b0Var = this.l;
        switch (b) {
            case 0:
                m3b0 m3b0Var = new m3b0(v3b0Var, yjeVar, (byte) 0);
                m3b0Var.k = obj;
                return m3b0Var;
            default:
                m3b0 m3b0Var2 = new m3b0(v3b0Var, yjeVar, (byte) 1);
                m3b0Var2.k = obj;
                return m3b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sw00 sw00Var = (sw00) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((m3b0) create(sw00Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objE;
        Object value;
        Object value2;
        u2b0 u2b0Var;
        byte b = this.i;
        v3b0 v3b0Var = this.l;
        switch (b) {
            case 0:
                sw00 sw00Var = (sw00) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!sw00Var.b && sw00Var.f32897a) {
                        wsf0 wsf0Var = v3b0Var.M;
                        this.k = null;
                        this.j = true;
                        if (wsf0Var.o(this) == wneVar) {
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
                int i = v3b0.W;
                v3b0Var.T();
                return Unit.f46060a;
            default:
                LinkedHashMap linkedHashMap = v3b0Var.Q;
                ocj ocjVar = v3b0Var.i;
                sw00 sw00Var2 = (sw00) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ouu ouuVar = v3b0Var.C;
                    this.k = sw00Var2;
                    this.j = true;
                    objE = ouuVar.E(this);
                    if (objE == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                boolean zBooleanValue = ((Boolean) objE).booleanValue();
                int i2 = v3b0.W;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u2b0.a((u2b0) value, false, false, false, zBooleanValue, null, null, null, 4079)));
                if (((u2b0) v3b0Var.D()).f34938a != sw00Var2.f32897a) {
                    for (bby bbyVar : linkedHashMap.values()) {
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                    }
                    linkedHashMap.clear();
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        u2b0Var = (u2b0) value2;
                    } while (!p7m0Var2.m(value2, u2b0.a(u2b0Var, sw00Var2.f32897a, false, false, false, null, null, g8x.x(u2b0Var.c), 2046)));
                    v3b0Var.Q();
                }
                return Unit.f46060a;
        }
    }
}
