package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pml extends bnn0 implements Function2 {
    public int i;
    public float j;
    public Iterator k;
    public byte l;
    public final /* synthetic */ w6k m;
    public final /* synthetic */ List n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ cgk0 p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pml(w6k w6kVar, List list, pz40 pz40Var, cgk0 cgk0Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.m = w6kVar;
        this.n = list;
        this.o = pz40Var;
        this.p = cgk0Var;
        this.q = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pml(this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pml) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:23:0x0081->B:34:?, LOOP_END, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        float f;
        Iterator it2;
        int i2;
        pzh pzhVar;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        List list = this.n;
        pz40 pz40Var = this.o;
        if (b == 0) {
            z1x.P(obj);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                cgk0 cgk0Var = this.p;
                if (cgk0Var.l() > 0) {
                    zcl zclVar = qmk.f28987a;
                    int iT = this.m.T(6.0f);
                    float fL = cgk0Var.l() + iT;
                    if (fL > 0.0f) {
                        it = list.iterator();
                        i = iT;
                        f = fL;
                    }
                    Boolean bool = Boolean.FALSE;
                    this.q.setValue(bool);
                    pz40Var.setValue(bool);
                }
            }
            return Unit.f46060a;
        }
        if (b == 1) {
            f = this.j;
            i = this.i;
            it = this.k;
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.j;
            i2 = this.i;
            it2 = this.k;
            z1x.P(obj);
        }
        while (it2.hasNext()) {
            pzhVar = (pzh) it2.next();
            this.k = it2;
            this.i = i2;
            this.j = f;
            this.l = (byte) 2;
            if (hkb.L(pzhVar, this) == wneVar) {
                return wneVar;
            }
        }
        Boolean bool2 = Boolean.FALSE;
        this.q.setValue(bool2);
        pz40Var.setValue(bool2);
        return Unit.f46060a;
        while (it.hasNext()) {
            xcz xczVar = ((pzh) it.next()).b;
            this.k = it;
            this.i = i;
            this.j = f;
            this.l = (byte) 1;
            if (hkb.y(xczVar, f, this) == wneVar) {
                return wneVar;
            }
        }
        it2 = list.iterator();
        i2 = i;
        while (it2.hasNext()) {
            pzhVar = (pzh) it2.next();
            this.k = it2;
            this.i = i2;
            this.j = f;
            this.l = (byte) 2;
            if (hkb.L(pzhVar, this) == wneVar) {
                return wneVar;
            }
        }
        Boolean bool3 = Boolean.FALSE;
        this.q.setValue(bool3);
        pz40Var.setValue(bool3);
        return Unit.f46060a;
    }
}
