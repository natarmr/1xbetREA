package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class gfw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hfw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfw(hfw hfwVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hfwVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hfw hfwVar = this.k;
        switch (b) {
            case 0:
                gfw gfwVar = new gfw(hfwVar, yjeVar, (byte) 0);
                gfwVar.j = obj;
                return gfwVar;
            default:
                gfw gfwVar2 = new gfw(hfwVar, yjeVar, (byte) 1);
                gfwVar2.j = obj;
                return gfwVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gfw) create((edw) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gfw) create((tew) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        lew lewVar;
        LinkedHashMap linkedHashMap;
        vcw vcwVar;
        byte b = this.i;
        hfw hfwVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                edw edwVar = (edw) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = hfw.J;
                p7m0 p7m0Var = hfwVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    lewVar = (lew) value;
                    hfwVar.f.getClass();
                    linkedHashMap = new LinkedHashMap(lewVar.d);
                    linkedHashMap.put(Long.valueOf(lewVar.f19925a), edwVar);
                } while (!p7m0Var.m(value, lew.a(lewVar, 0L, null, linkedHashMap, 7)));
                break;
            default:
                tew tewVar = (tew) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                j0g0 j0g0Var = tewVar.f33842a;
                if (j0g0Var != null && (j0g0Var.f15681a instanceof g0g0) && hfwVar.I) {
                    hfwVar.O();
                } else {
                    xxv xxvVar = new xxv(tewVar, (byte) 4);
                    int i2 = hfw.J;
                    hfwVar.H(xxvVar);
                    j0g0 j0g0Var2 = tewVar.f33842a;
                    long j = 0;
                    if (j0g0Var2 != null) {
                        Object obj3 = j0g0Var2.f15681a;
                        if (obj3 instanceof g0g0) {
                            obj3 = null;
                        }
                        Cnew cnew = (Cnew) obj3;
                        if (cnew != null) {
                            long j2 = ((lew) hfwVar.D()).f19925a;
                            if (j2 != 0) {
                                j = j2;
                            } else {
                                List list = cnew.b;
                                if (list != null && (vcwVar = (vcw) CollectionsKt.firstOrNull(list)) != null) {
                                    j = vcwVar.f37207a;
                                }
                            }
                        }
                    }
                    hfwVar.Q(j);
                }
                break;
        }
        return Unit.f46060a;
    }
}
