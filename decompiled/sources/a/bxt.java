package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bxt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udg f3391a;

    public bxt(udg udgVar) {
        this.f3391a = udgVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, int i2, long j, zje zjeVar) {
        axt axtVar;
        if (zjeVar instanceof axt) {
            axtVar = (axt) zjeVar;
            int i3 = axtVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                axtVar.k = i3 - Integer.MIN_VALUE;
            } else {
                axtVar = new axt(this, zjeVar);
            }
        } else {
            axtVar = new axt(this, zjeVar);
        }
        axt axtVar2 = axtVar;
        Object obj = axtVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = axtVar2.k;
        if (i4 == 0) {
            z1x.P(obj);
            axtVar2.k = 1;
            Object objC = this.f3391a.c(i, i2, j, axtVar2);
            return objC == wneVar ? wneVar : objC;
        }
        if (i4 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
