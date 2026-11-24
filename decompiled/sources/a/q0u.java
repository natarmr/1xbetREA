package a;

/* JADX INFO: loaded from: classes3.dex */
public final class q0u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f27921a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, zje zjeVar) {
        p0u p0uVar;
        if (zjeVar instanceof p0u) {
            p0uVar = (p0u) zjeVar;
            int i = p0uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0uVar.k = i - Integer.MIN_VALUE;
            } else {
                p0uVar = new p0u(this, zjeVar);
            }
        } else {
            p0uVar = new p0u(this, zjeVar);
        }
        Object objB = p0uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = p0uVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            p0uVar.k = 1;
            objB = this.f27921a.b(str, p0uVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((xuf) objB).f;
    }
}
