package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ndn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sdn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndn(sdn sdnVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = sdnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sdn sdnVar = this.l;
        switch (b) {
            case 0:
                ndn ndnVar = new ndn(sdnVar, yjeVar, (byte) 0);
                ndnVar.k = obj;
                return ndnVar;
            default:
                ndn ndnVar2 = new ndn(sdnVar, yjeVar, (byte) 1);
                ndnVar2.k = obj;
                return ndnVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ndn) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ndn) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        sdn sdnVar = this.l;
        switch (b) {
            case 0:
                l9s l9sVar = (l9s) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = sdn.B;
                    p7m0 p7m0Var = sdnVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, cdn.a((cdn) value, null, null, l9sVar, false, null, null, 251)));
                    o030 o030Var = sdnVar.s;
                    t030 t030Var = new t030(l9sVar);
                    this.k = null;
                    this.j = true;
                    if (o030Var.a(t030Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = sdn.B;
                    p7m0 p7m0Var2 = sdnVar.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, cdn.a((cdn) value2, null, list, null, false, null, null, 237)));
                    if (list.isEmpty()) {
                        sdnVar.w.g(idf0.f14583a);
                    } else {
                        o030 o030Var2 = sdnVar.s;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(r3d.r(((mu20) it.next()).f22394a));
                        }
                        s030 s030Var = new s030(r3d.r(arrayList));
                        this.k = null;
                        this.j = true;
                        if (o030Var2.a(s030Var, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
