package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f1v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5z f8785a;
    public final uzc b;
    public final b3c0 c;
    public final gst0 d;
    public final v7i e;

    public f1v(uzc uzcVar, uqe uqeVar, v7i v7iVar, w5z w5zVar, b3c0 b3c0Var, gst0 gst0Var) {
        uzcVar.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        this.f8785a = w5zVar;
        this.b = uzcVar;
        this.c = b3c0Var;
        this.d = gst0Var;
        this.e = v7iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        a1v a1vVar;
        int iIntValue;
        if (zjeVar instanceof a1v) {
            a1vVar = (a1v) zjeVar;
            int i = a1vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1vVar.k = i - Integer.MIN_VALUE;
            } else {
                a1vVar = new a1v(this, zjeVar);
            }
        } else {
            a1vVar = new a1v(this, zjeVar);
        }
        Object objA = a1vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = a1vVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (this.d.a()) {
                a1vVar.k = 1;
                objA = this.c.a(false, a1vVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }
}
