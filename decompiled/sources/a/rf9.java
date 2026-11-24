package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class rf9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f30375a;

    public /* synthetic */ rf9(pzu pzuVar) {
        this.f30375a = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(int i, int i2, long j, zje zjeVar, Long l, boolean z) {
        ttu ttuVar;
        if (zjeVar instanceof ttu) {
            ttuVar = (ttu) zjeVar;
            int i3 = ttuVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ttuVar.k = i3 - Integer.MIN_VALUE;
            } else {
                ttuVar = new ttu(this, zjeVar);
            }
        } else {
            ttuVar = new ttu(this, zjeVar);
        }
        ttu ttuVar2 = ttuVar;
        Object objA0 = ttuVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = ttuVar2.k;
        if (i4 == 0) {
            z1x.P(objA0);
            ttuVar2.k = 1;
            objA0 = this.f30375a.a0(i, i2, j, ttuVar2, l, z);
            if (objA0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA0);
        }
        return CollectionsKt.A0((Iterable) objA0, new vvt((byte) 24));
    }
}
