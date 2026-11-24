package a;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class zwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udg f45124a;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(int i, int i2, long j, zje zjeVar, Date date) {
        ywt ywtVar;
        if (zjeVar instanceof ywt) {
            ywtVar = (ywt) zjeVar;
            int i3 = ywtVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ywtVar.k = i3 - Integer.MIN_VALUE;
            } else {
                ywtVar = new ywt(this, zjeVar);
            }
        } else {
            ywtVar = new ywt(this, zjeVar);
        }
        ywt ywtVar2 = ywtVar;
        Object obj = ywtVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = ywtVar2.k;
        if (i4 == 0) {
            z1x.P(obj);
            ywtVar2.k = 1;
            Object objB = this.f45124a.b(i, i2, j, ywtVar2, date);
            return objB == wneVar ? wneVar : objB;
        }
        if (i4 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
