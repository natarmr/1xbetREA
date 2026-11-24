package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rvt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvu f31187a;

    public /* synthetic */ rvt(nvu nvuVar) {
        this.f31187a = nvuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(long j, long j2, zje zjeVar, boolean z) {
        wcu wcuVar;
        if (zjeVar instanceof wcu) {
            wcuVar = (wcu) zjeVar;
            int i = wcuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcuVar.l = i - Integer.MIN_VALUE;
            } else {
                wcuVar = new wcu(this, zjeVar);
            }
        } else {
            wcuVar = new wcu(this, zjeVar);
        }
        Object objY = wcuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = wcuVar.l;
        if (i2 == 0) {
            z1x.P(objY);
            wcuVar.i = z;
            wcuVar.l = 1;
            objY = this.f31187a.y(j2, wcuVar, z);
            if (objY == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = wcuVar.i;
            z1x.P(objY);
        }
        pts ptsVar = (pts) objY;
        return new zts(new ots(z, ptsVar.f27580a), ptsVar.b);
    }
}
