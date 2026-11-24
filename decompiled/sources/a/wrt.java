package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bwl f39662a;
    public final pmi b;

    public wrt(bwl bwlVar, pmi pmiVar) {
        this.f39662a = bwlVar;
        this.b = pmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) {
        vrt vrtVar;
        bwl bwlVar;
        int i2;
        if (zjeVar instanceof vrt) {
            vrtVar = (vrt) zjeVar;
            int i3 = vrtVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vrtVar.n = i3 - Integer.MIN_VALUE;
            } else {
                vrtVar = new vrt(this, zjeVar);
            }
        } else {
            vrtVar = new vrt(this, zjeVar);
        }
        Object objX = vrtVar.l;
        Object obj = wne.f39444a;
        int i4 = vrtVar.n;
        if (i4 == 0) {
            z1x.P(objX);
            bwlVar = this.f39662a;
            vrtVar.k = bwlVar;
            vrtVar.i = i;
            vrtVar.j = i;
            vrtVar.n = 1;
            objX = this.b.x(vrtVar);
            if (objX != obj) {
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objX);
                return objX;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = vrtVar.j;
        i2 = vrtVar.i;
        bwlVar = vrtVar.k;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        vrtVar.k = null;
        vrtVar.i = i2;
        vrtVar.n = 2;
        Object objG = ((cu5) bwlVar.f3330a).g(i, iIntValue, vrtVar);
        return objG == obj ? obj : objG;
    }
}
