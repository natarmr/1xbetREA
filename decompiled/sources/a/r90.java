package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class r90 extends bnn0 implements Function2 {
    public esr i;
    public z70 j;
    public double k;
    public boolean l;
    public final /* synthetic */ u90 m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(u90 u90Var, double d, yje yjeVar) {
        super(2, yjeVar);
        this.m = u90Var;
        this.n = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new r90(this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        z70 z70Var;
        esr esrVar;
        double d;
        Object next;
        u90 u90Var = this.m;
        p80 p80Var = u90Var.b;
        wne wneVar = wne.f39444a;
        boolean z = this.l;
        double d2 = this.n;
        if (!z) {
            z1x.P(obj);
            z70 z70Var2 = p80Var.d.c.b;
            if (z70Var2 != z70.v) {
                esr esrVar2 = u90Var.f.a().f4905a.f3145a;
                p80Var.getClass();
                p80Var.d.c.c = esrVar2;
                if (esrVar2 == esr.DOUBLE_BONUS || esrVar2 == esr.FREE_BET || esrVar2 == esr.RETURN_HALF || esrVar2 == esr.WILD_FREE_BET) {
                    p80Var.d.c.f5619a.n(iun.f15405a);
                }
                t0u t0uVar = u90Var.q;
                this.i = esrVar2;
                this.j = z70Var2;
                this.k = d2;
                this.l = true;
                Object objA = t0uVar.a(this);
                if (objA == wneVar) {
                    return wneVar;
                }
                z70Var = z70Var2;
                esrVar = esrVar2;
                d = d2;
                obj = objA;
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        double d3 = this.k;
        z70 z70Var3 = this.j;
        esr esrVar3 = this.i;
        z1x.P(obj);
        esrVar = esrVar3;
        d = d3;
        z70Var = z70Var3;
        t70 t70Var = new t70(d, z70Var, (String) obj, esrVar);
        p80Var.getClass();
        d80 d80Var = p80Var.d.c;
        ArrayList arrayListA = d80Var.a();
        Iterator it = arrayListA.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((t70) next).b != t70Var.b);
        int iIndexOf = arrayListA.indexOf((t70) next);
        if (iIndexOf > -1) {
            arrayListA.set(iIndexOf, t70Var);
        } else {
            arrayListA.add(t70Var);
        }
        d80Var.f5619a.o(null, arrayListA);
        u90Var.k.a(d2);
        p80Var.d.c.b = z70.v;
        u90Var.G(d90.f5675a);
        return Unit.f46060a;
    }
}
