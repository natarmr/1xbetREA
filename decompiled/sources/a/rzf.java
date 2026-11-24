package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f31356a = new k050();
    public Boolean b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, zje zjeVar) {
        qzf qzfVar;
        k050 k050Var;
        if (zjeVar instanceof qzf) {
            qzfVar = (qzf) zjeVar;
            int i = qzfVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzfVar.m = i - Integer.MIN_VALUE;
            } else {
                qzfVar = new qzf(this, zjeVar);
            }
        } else {
            qzfVar = new qzf(this, zjeVar);
        }
        Object obj = qzfVar.k;
        wne wneVar = wne.f39444a;
        int i2 = qzfVar.m;
        boolean z2 = true;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f31356a;
            qzfVar.j = k050Var2;
            qzfVar.i = z;
            qzfVar.m = 1;
            if (k050Var2.d(qzfVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = qzfVar.i;
            k050Var = qzfVar.j;
            z1x.P(obj);
        }
        try {
            Boolean bool = this.b;
            this.b = Boolean.valueOf(z);
            if (!Intrinsics.d(bool, Boolean.TRUE) || z) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } finally {
            k050Var.c(null);
        }
    }
}
