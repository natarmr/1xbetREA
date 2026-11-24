package a;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aw9 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sje f1562a;
    public final CopyOnWriteArrayList b;

    public aw9(mii0 mii0Var, String str) {
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(((qcq0) mii0Var.c).f, new kin0((bby) mii0Var.d)));
        this.f1562a = sjeVarA;
        this.b = new CopyOnWriteArrayList();
        qjj.W(sjeVarA, null, null, new l19((Object) mii0Var, (Object) str, (Object) this, (yje) null, (byte) 15), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j, zje zjeVar) {
        yv9 yv9Var;
        Object obj;
        if (zjeVar instanceof yv9) {
            yv9Var = (yv9) zjeVar;
            int i = yv9Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv9Var.l = i - Integer.MIN_VALUE;
            } else {
                yv9Var = new yv9(this, zjeVar);
            }
        } else {
            yv9Var = new yv9(this, zjeVar);
        }
        Object obj2 = yv9Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yv9Var.l;
        Object[] objArr = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj2);
            odd oddVar = new odd();
            copyOnWriteArrayList.add(oddVar);
            zv9 zv9Var = new zv9(oddVar, yjeVar, objArr == true ? 1 : 0);
            yv9Var.i = oddVar;
            yv9Var.l = 1;
            Object objU = msm0.u(j, zv9Var, yv9Var);
            if (objU == wneVar) {
                return wneVar;
            }
            obj2 = objU;
            obj = oddVar;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = yv9Var.i;
            z1x.P(obj2);
        }
        boolean z = obj2 != null;
        copyOnWriteArrayList.remove(obj);
        return Boolean.valueOf(z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d5c.G(this.f1562a, null);
    }
}
