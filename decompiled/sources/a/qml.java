package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qml extends bnn0 implements Function2 {
    public int i;
    public float j;
    public Iterator k;
    public byte l;
    public final /* synthetic */ w6k m;
    public final /* synthetic */ List n;
    public final /* synthetic */ cgk0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qml(w6k w6kVar, List list, cgk0 cgk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = w6kVar;
        this.n = list;
        this.o = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qml(this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qml) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:19:0x006e->B:29:?, LOOP_END, SYNTHETIC] */
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
        if (b == 0) {
            z1x.P(obj);
            cgk0 cgk0Var = this.o;
            if (cgk0Var.l() > 0) {
                zcl zclVar = qmk.f28987a;
                int iT = this.m.T(6.0f);
                float fL = cgk0Var.l() + iT;
                it = list.iterator();
                i = iT;
                f = fL;
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
        return Unit.f46060a;
    }
}
