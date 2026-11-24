package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qbx implements miu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iiu0[] f28460a;

    public qbx(iiu0... iiu0VarArr) {
        this.f28460a = iiu0VarArr;
    }

    @Override // a.miu0
    public final diu0 c(Class cls, by40 by40Var) {
        iiu0 iiu0Var;
        sgy sgyVarB = sre0.f32672a.b(cls);
        iiu0[] iiu0VarArr = this.f28460a;
        iiu0[] iiu0VarArr2 = (iiu0[]) Arrays.copyOf(iiu0VarArr, iiu0VarArr.length);
        int length = iiu0VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iiu0Var = null;
                break;
            }
            iiu0Var = iiu0VarArr2[i];
            if (Intrinsics.d(iiu0Var.f14846a, sgyVarB)) {
                break;
            }
            i++;
        }
        diu0 diu0Var = iiu0Var != null ? (diu0) iiu0Var.b.invoke(by40Var) : null;
        if (diu0Var != null) {
            return diu0Var;
        }
        c99.s(kng0.k("No initializer set for given class ", sgyVarB.v()));
        return null;
    }
}
