package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class phs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uhs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ phs(uhs uhsVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uhsVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uhs uhsVar = this.k;
        switch (b) {
            case 0:
                phs phsVar = new phs(uhsVar, yjeVar, (byte) 0);
                phsVar.j = obj;
                return phsVar;
            default:
                phs phsVar2 = new phs(uhsVar, yjeVar, (byte) 1);
                phsVar2.j = obj;
                return phsVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((phs) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((phs) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        p7m0 p7m0Var;
        Object value2;
        byte b = this.i;
        uhs uhsVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = uhs.J;
                if (uhsVar.o.f46664a.size() == 1 && ((cis) uhsVar.D()).f4427a.length() == 0) {
                    klr klrVar = (klr) CollectionsKt.firstOrNull(list);
                    String strC = klrVar != null ? klrVar.c() : null;
                    if (strC == null) {
                        strC = "";
                    }
                    String str = strC;
                    p7m0 p7m0Var2 = uhsVar.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        uhsVar.f.getClass();
                    } while (!p7m0Var2.m(value, cis.a((cis) value, str, null, null, null, false, false, 126)));
                    imf0 imf0Var = uhsVar.t;
                    imf0Var.getClass();
                    gkp gkpVar = imf0Var.f15023a.f13218a;
                    gkpVar.getClass();
                    gkpVar.d.f(str);
                }
                break;
            default:
                String str2 = (String) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = uhs.J;
                qz40 qz40Var = uhsVar.D;
                do {
                    p7m0Var = (p7m0) qz40Var;
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, str2));
                break;
        }
        return Unit.f46060a;
    }
}
