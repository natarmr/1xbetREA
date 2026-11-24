package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class iqe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kqe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqe(kqe kqeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kqeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kqe kqeVar = this.j;
        switch (b) {
            case 0:
                return new iqe(kqeVar, yjeVar, (byte) 0);
            case 1:
                return new iqe(kqeVar, yjeVar, (byte) 1);
            default:
                return new iqe(kqeVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((iqe) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((iqe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((iqe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        lak0 lak0Var;
        byte b = this.i;
        fqe fqeVar = fqe.f9971a;
        kqe kqeVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = (String) kqeVar.e.a("QUERY_KEY");
                if (str == null) {
                    str = "";
                }
                kqeVar.w(str);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kqeVar.g.f(fqeVar);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = kqeVar.f;
                do {
                    value = p7m0Var.getValue();
                    lak0Var = lak0.c;
                    ((hqe) value).getClass();
                    lak0Var.getClass();
                } while (!p7m0Var.m(value, new hqe(lak0Var, false)));
                kqeVar.g.f(fqeVar);
                break;
        }
        return Unit.f46060a;
    }
}
