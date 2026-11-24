package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class qf9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f28620a;

    public /* synthetic */ qf9(pzu pzuVar) {
        this.f28620a = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(int i, long j, zje zjeVar, boolean z) {
        mpu mpuVar;
        if (zjeVar instanceof mpu) {
            mpuVar = (mpu) zjeVar;
            int i2 = mpuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mpuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                mpuVar = new mpu(this, zjeVar);
            }
        } else {
            mpuVar = new mpu(this, zjeVar);
        }
        mpu mpuVar2 = mpuVar;
        Object objX = mpuVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = mpuVar2.k;
        if (i3 == 0) {
            z1x.P(objX);
            mpuVar2.k = 1;
            objX = this.f28620a.X(i, j, mpuVar2, z);
            if (objX == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        return CollectionsKt.A0((Iterable) objX, new vvt((byte) 21));
    }
}
