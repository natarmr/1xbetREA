package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tqe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uqe k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqe(uqe uqeVar, List list, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uqeVar;
        this.l = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        List list = this.l;
        uqe uqeVar = this.k;
        switch (b) {
            case 0:
                return new tqe(uqeVar, list, yjeVar, (byte) 0);
            default:
                return new tqe(uqeVar, list, yjeVar, (byte) 1);
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
        return ((tqe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        List<cm90> list = this.l;
        uqe uqeVar = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xqe xqeVar = uqeVar.f36115a;
                    this.j = true;
                    nqe nqeVarC = xqeVar.c();
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        tkt tktVar = (tkt) it.next();
                        tktVar.getClass();
                        int i = tktVar.f34113a;
                        String str = tktVar.b;
                        int i2 = tktVar.c;
                        arrayList.add(new skt(str, i, tktVar.d, tktVar.f, i2, tktVar.e));
                    }
                    Object objW0 = sj3.w0(this, nqeVarC.f23955a, new mqe(nqeVarC, arrayList, yjeVar, b2), false, true);
                    Object obj3 = wne.f39444a;
                    if (objW0 != obj3) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj3) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 == obj2) {
                        return obj2;
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
                Object obj4 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    xqe xqeVar2 = uqeVar.f36115a;
                    this.j = true;
                    nqe nqeVarC2 = xqeVar2.c();
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    for (cm90 cm90Var : list) {
                        cm90Var.getClass();
                        arrayList2.add(new dm90(cm90Var.f4593a, cm90Var.c, cm90Var.b, cm90Var.d));
                    }
                    Object objW1 = sj3.w0(this, nqeVarC2.f23955a, new mqe(nqeVarC2, arrayList2, yjeVar, (byte) 2), false, true);
                    Object obj5 = wne.f39444a;
                    if (objW1 != obj5) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 != obj5) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 == obj4) {
                        return obj4;
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
