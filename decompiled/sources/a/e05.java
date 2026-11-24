package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e05 extends bnn0 implements Function2 {
    public final /* synthetic */ a4x i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ vne m;
    public final /* synthetic */ int n;
    public final /* synthetic */ pz40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(a4x a4xVar, boolean z, boolean z2, xcz xczVar, vne vneVar, int i, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = a4xVar;
        this.j = z;
        this.k = z2;
        this.l = xczVar;
        this.m = vneVar;
        this.n = i;
        this.o = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new e05(this.i, this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e05) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        int i;
        int i2;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ArrayList arrayList = new ArrayList();
        a4x a4xVar = this.i;
        for (Object obj2 : a4xVar) {
            if (((lxl) obj2).b()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((List) this.o.getValue()).contains((lxl) next));
        lxl lxlVar = (lxl) next;
        int i3 = this.n;
        vne vneVar = this.m;
        xcz xczVar = this.l;
        if (lxlVar != null) {
            Iterator it2 = a4xVar.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = 0;
                    i2 = -1;
                    break;
                }
                i = 0;
                if (((lxl) it2.next()).f20819a == lxlVar.f20819a) {
                    i2 = i4;
                    break;
                }
                i4++;
            }
            if (i2 != -1) {
                qjj.W(vneVar, null, null, new f05(true, xczVar, i2, i3, null), 3);
            }
        } else {
            i = 0;
        }
        if (this.j && this.k && lxlVar == null && !a4xVar.isEmpty()) {
            qjj.W(vneVar, null, null, new f05(i, xczVar, i, i3, null), 3);
        }
        return Unit.f46060a;
    }
}
