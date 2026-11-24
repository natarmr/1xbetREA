package a;

import android.gov.nist.core.LexerCore;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class waq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ebq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ waq(ebq ebqVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ebqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ebq ebqVar = this.k;
        switch (b) {
            case 0:
                waq waqVar = new waq(ebqVar, yjeVar, (byte) 0);
                waqVar.j = ((Boolean) obj).booleanValue();
                return waqVar;
            case 1:
                return new waq(ebqVar, yjeVar, (byte) 1);
            default:
                waq waqVar2 = new waq(ebqVar, yjeVar, (byte) 2);
                waqVar2.j = ((Boolean) obj).booleanValue();
                return waqVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((waq) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((waq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((waq) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objH;
        Object value2;
        byte b = this.i;
        ebq ebqVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = ebq.f0;
                p7m0 p7m0Var = ebqVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, oaq.a((oaq) value, null, z, null, null, null, null, null, false, false, 0, null, false, LexerCore.ID_NO_WHITESPACE)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    xex xexVar = ebqVar.X;
                    this.j = true;
                    objH = xexVar.H(this);
                    if (objH == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                if (((Boolean) objH).booleanValue()) {
                    int i2 = ebq.f0;
                    ebqVar.G(eaq.f7480a);
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = (z3 || ((oaq) ebqVar.D()).h) ? false : true;
                if (z3 && ((oaq) ebqVar.D()).i) {
                    int i3 = ebq.f0;
                    ebqVar.Q();
                    ebqVar.T();
                } else if (z4) {
                    int i4 = ebq.f0;
                    ebqVar.G(caq.f4024a);
                    p7m0 p7m0Var2 = ebqVar.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        ebqVar.f.getClass();
                    } while (!p7m0Var2.m(value2, oaq.a((oaq) value2, null, false, null, null, null, null, null, false, true, 0, null, false, 3711)));
                }
                return Unit.f46060a;
        }
    }
}
