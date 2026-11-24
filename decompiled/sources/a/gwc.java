package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gwc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ iwc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gwc(iwc iwcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = iwcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        iwc iwcVar = this.k;
        switch (b) {
            case 0:
                return new gwc(iwcVar, yjeVar, (byte) 0);
            default:
                gwc gwcVar = new gwc(iwcVar, yjeVar, (byte) 1);
                gwcVar.j = ((Boolean) obj).booleanValue();
                return gwcVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gwc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((gwc) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        iwc iwcVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                p7m0 p7m0Var = iwcVar.o;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gyt gytVar = iwcVar.f;
                    int i = iwcVar.b;
                    this.j = true;
                    obj = gytVar.b(i, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                uvc uvcVar = (uvc) obj;
                String str = uvcVar.k;
                String str2 = uvcVar.l;
                if (str.length() == 0 && str2.length() > 0) {
                    iwcVar.j.a(str2);
                    i1w0 i1w0Var = iwcVar.e;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (uvcVar.k.length() > 0) {
                    dwc dwcVar = new dwc(uvcVar, iwcVar.h.a());
                    p7m0Var.getClass();
                    p7m0Var.o(null, dwcVar);
                } else {
                    ewc ewcVar = new ewc(iwcVar.m);
                    p7m0Var.getClass();
                    p7m0Var.o(null, ewcVar);
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = iwcVar.o;
                p7m0Var2.getClass();
                cwc cwcVar = cwc.f5074a;
                p7m0Var2.o(null, cwcVar);
                if (z2) {
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, cwcVar);
                    sac.V(jiu0.a(iwcVar), new lya(iwcVar, (byte) 21), null, iwcVar.d.b, new gwc(iwcVar, yjeVar, b2), 10);
                } else {
                    ewc ewcVar2 = new ewc(iwcVar.n);
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, ewcVar2);
                }
                return Unit.f46060a;
        }
    }
}
