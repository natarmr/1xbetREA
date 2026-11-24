package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f28837a;
    public final e8g b;

    public qjg(gii0 gii0Var) {
        gii0Var.getClass();
        this.f28837a = gii0Var;
        this.b = new e8g(this, (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, int i, int i2, String str2, zje zjeVar) {
        pjg pjgVar;
        if (zjeVar instanceof pjg) {
            pjgVar = (pjg) zjeVar;
            int i3 = pjgVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pjgVar.k = i3 - Integer.MIN_VALUE;
            } else {
                pjgVar = new pjg(this, zjeVar);
            }
        } else {
            pjgVar = new pjg(this, zjeVar);
        }
        pjg pjgVar2 = pjgVar;
        Object objA = pjgVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = pjgVar2.k;
        if (i4 == 0) {
            z1x.P(objA);
            sfh sfhVar = (sfh) this.b.invoke();
            pjgVar2.k = 1;
            objA = sfhVar.a(str, i, i2, str2, pjgVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }
}
