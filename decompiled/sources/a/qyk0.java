package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qyk0 extends bnn0 implements Function2 {
    public yxk0 i;
    public esr j;
    public boolean k;
    public final /* synthetic */ tyk0 l;
    public final /* synthetic */ double m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyk0(tyk0 tyk0Var, double d, yje yjeVar) {
        super(2, yjeVar);
        this.l = tyk0Var;
        this.m = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qyk0(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qyk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        yxk0 yxk0Var;
        esr esrVar;
        Object next;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        tyk0 tyk0Var = this.l;
        if (!z) {
            z1x.P(obj);
            yxk0Var = tyk0Var.n.f43187a.d.b;
            yxk0 yxk0Var2 = yxk0.g;
            if (yxk0Var != yxk0Var2) {
                esr esrVar2 = tyk0Var.e.a().f4905a.f3145a;
                if (esrVar2 == esr.DOUBLE_BONUS || esrVar2 == esr.FREE_BET || esrVar2 == esr.RETURN_HALF || esrVar2 == esr.WILD_FREE_BET) {
                    tyk0Var.q.f9538a.d.f36493a.n(iun.f15405a);
                    tyk0Var.D(new acs(yxk0Var2));
                }
                t0u t0uVar = tyk0Var.y;
                this.i = yxk0Var;
                this.j = esrVar2;
                this.k = true;
                obj = t0uVar.a(this);
                if (obj == wneVar) {
                    return wneVar;
                }
                esrVar = esrVar2;
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        esr esrVar3 = this.j;
        yxk0Var = this.i;
        z1x.P(obj);
        esrVar = esrVar3;
        yxk0 yxk0Var3 = yxk0Var;
        xxk0 xxk0Var = new xxk0(this.m, yxk0Var3, (String) obj, esrVar, true);
        js jsVar = tyk0Var.j;
        jsVar.getClass();
        p7m0 p7m0Var = jsVar.f17025a.d.f36493a;
        ArrayList arrayListN0 = CollectionsKt.N0((Collection) p7m0Var.getValue());
        Iterator it = arrayListN0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xxk0) next).b != xxk0Var.b);
        int iIndexOf = arrayListN0.indexOf((xxk0) next);
        if (iIndexOf > -1) {
            arrayListN0.set(iIndexOf, xxk0Var);
        } else {
            arrayListN0.add(xxk0Var);
        }
        p7m0Var.o(null, arrayListN0);
        wkt0 wkt0Var = tyk0Var.b;
        double d = this.m;
        wkt0Var.a(d);
        tyk0Var.D(new zbs(yxk0Var3, new Double(d)));
        return Unit.f46060a;
    }
}
