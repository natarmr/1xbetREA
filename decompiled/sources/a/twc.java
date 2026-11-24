package a;

/* JADX INFO: loaded from: classes5.dex */
public final class twc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yuu f34644a;

    public twc(yuu yuuVar) {
        this.f34644a = yuuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) {
        swc swcVar;
        if (zjeVar instanceof swc) {
            swcVar = (swc) zjeVar;
            int i2 = swcVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swcVar.k = i2 - Integer.MIN_VALUE;
            } else {
                swcVar = new swc(this, zjeVar);
            }
        } else {
            swcVar = new swc(this, zjeVar);
        }
        Object objB = swcVar.i;
        wne wneVar = wne.f39444a;
        int i3 = swcVar.k;
        if (i3 == 0) {
            z1x.P(objB);
            swcVar.k = 1;
            objB = this.f34644a.b(i, swcVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return Boolean.valueOf(((vac0) objB).f37078a);
    }
}
