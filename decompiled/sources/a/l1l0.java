package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l1l0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ m1l0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1l0(m1l0 m1l0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = m1l0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        m1l0 m1l0Var = this.k;
        switch (b) {
            case 0:
                l1l0 l1l0Var = new l1l0(m1l0Var, yjeVar, (byte) 0);
                l1l0Var.j = ((Boolean) obj).booleanValue();
                return l1l0Var;
            case 1:
                return new l1l0(m1l0Var, yjeVar, (byte) 1);
            default:
                return new l1l0(m1l0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((l1l0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l1l0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l1l0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        m1l0 m1l0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = m1l0.z;
                ocj ocjVar = m1l0Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, c1l0.a((c1l0) value, null, null, false, null, false, false, z, 255)));
                if (!z || ((c1l0) m1l0Var.D()).e) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, c1l0.a((c1l0) value2, null, null, false, null, false, false, false, 479)));
                } else {
                    m1l0Var.P();
                }
                return Unit.f46060a;
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
                cmt cmtVar = m1l0Var.r;
                this.j = true;
                Object objE = ((c5k) cmtVar.b).e(this);
                return objE == wneVar2 ? wneVar2 : objE;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                f4u f4uVar = m1l0Var.s;
                this.j = true;
                Serializable serializableL = ((c5k) f4uVar.b).l(this);
                return serializableL == wneVar3 ? wneVar3 : serializableL;
        }
    }
}
