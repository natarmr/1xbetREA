package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class mrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f22289a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        gnv gnvVar;
        if (zjeVar instanceof gnv) {
            gnvVar = (gnv) zjeVar;
            int i = gnvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnvVar.k = i - Integer.MIN_VALUE;
            } else {
                gnvVar = new gnv(this, zjeVar);
            }
        } else {
            gnvVar = new gnv(this, zjeVar);
        }
        Object objI = gnvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = gnvVar.k;
        if (i2 == 0) {
            z1x.P(objI);
            tl5 tl5Var = tl5.c;
            gnvVar.k = 1;
            objI = this.f22289a.i(tl5Var, gnvVar);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objI) {
            if (((ql5) obj).i.e()) {
                arrayList.add(obj);
            }
        }
        return Boolean.valueOf(arrayList.size() > 1);
    }
}
