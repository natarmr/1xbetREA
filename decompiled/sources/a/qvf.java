package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qvf implements vuu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29384a;
    public final smk0 b;
    public final String c;
    public final long d;

    public qvf(boolean z, smk0 smk0Var, String str, long j) {
        str.getClass();
        this.f29384a = z;
        this.b = smk0Var;
        this.c = str;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    @Override // a.vuu0
    public final nls0 a(j83 j83Var) {
        j83 j83VarH;
        j83Var.getClass();
        if (j83Var.b.length() > 0) {
            String str = this.c;
            int length = str.length();
            boolean z = this.f29384a;
            if (length <= 0 && !z) {
                j83VarH = j83Var;
            } else {
                h83 h83Var = new h83();
                h83Var.b(j83Var);
                if (str.length() > 0) {
                    h83Var.c(Separators.SP);
                    int iG = h83Var.g(new smk0(this.d, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
                    try {
                        h83Var.c(str);
                        h83Var.d(iG);
                    } catch (Throwable th) {
                        h83Var.d(iG);
                        throw th;
                    }
                }
                if (z) {
                    h83Var.c(Separators.SP);
                    int iG2 = h83Var.g(this.b);
                    try {
                        h83Var.c("x2");
                        h83Var.d(iG2);
                    } catch (Throwable th2) {
                        h83Var.d(iG2);
                        throw th2;
                    }
                }
                j83VarH = h83Var.h();
            }
        } else {
            j83VarH = j83Var;
        }
        return new nls0(j83VarH, new rrc(j83Var, (byte) 8));
    }
}
