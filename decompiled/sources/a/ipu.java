package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ipu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f15180a;
    public final gst0 b;

    public ipu(pbt pbtVar, gst0 gst0Var) {
        pbtVar.getClass();
        gst0Var.getClass();
        this.f15180a = pbtVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        hpu hpuVar;
        if (zjeVar instanceof hpu) {
            hpuVar = (hpu) zjeVar;
            int i = hpuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hpuVar.k = i - Integer.MIN_VALUE;
            } else {
                hpuVar = new hpu(this, zjeVar);
            }
        } else {
            hpuVar = new hpu(this, zjeVar);
        }
        Object objK = hpuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = hpuVar.k;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objK);
            boolean zA = this.b.a();
            hpuVar.k = 1;
            objK = this.f15180a.k(zA, hpuVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        c5q c5qVarH = pgi0.h(pgi0.p(CollectionsKt.I((Iterable) objK), new umu(b)), new umu((byte) 2));
        vvt vvtVar = new vvt((byte) 20);
        ArrayList arrayListU = pgi0.u(c5qVarH);
        v3d.t(vvtVar, arrayListU);
        Iterator it = arrayListU.iterator();
        if (!it.hasNext()) {
            return iun.f15405a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
