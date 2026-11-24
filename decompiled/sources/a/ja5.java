package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ja5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ja5.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jzj[] f16173a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public ja5(jzj[] jzjVarArr) {
        this.f16173a = jzjVarArr;
        this.notCompletedCount$volatile = jzjVarArr.length;
    }

    public final Object a(zje zjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(zjeVar));
        n5aVar.r();
        jzj[] jzjVarArr = this.f16173a;
        int length = jzjVarArr.length;
        ha5[] ha5VarArr = new ha5[length];
        for (int i = 0; i < length; i++) {
            jzj jzjVar = jzjVarArr[i];
            jzjVar.start();
            ha5 ha5Var = new ha5(this, n5aVar);
            ha5Var.f = zvw.W(jzjVar, true, ha5Var);
            ha5VarArr[i] = ha5Var;
        }
        ia5 ia5Var = new ia5(ha5VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ha5 ha5Var2 = ha5VarArr[i2];
            ha5Var2.getClass();
            defpackage.a.f0a.putObjectVolatile(ha5Var2, ha5.h, ia5Var);
        }
        if (n5aVar.x()) {
            ia5Var.a();
        } else {
            n5aVar.u(ia5Var);
        }
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }
}
