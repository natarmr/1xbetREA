package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pvf implements vuu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27660a;
    public final String b;
    public final long c;

    public pvf(String str, long j, byte b) {
        this.f27660a = b;
        str.getClass();
        switch (b) {
            case 1:
                this.b = str;
                this.c = j;
                break;
            case 2:
                this.b = str;
                this.c = j;
                break;
            default:
                this.b = str;
                this.c = j;
                break;
        }
    }

    @Override // a.vuu0
    public final nls0 a(j83 j83Var) {
        j83 j83VarH;
        j83 j83VarH2;
        j83 j83VarH3;
        byte b = this.f27660a;
        String str = this.b;
        j83Var.getClass();
        switch (b) {
            case 0:
                if (j83Var.b.length() <= 0 || str.length() <= 0) {
                    j83VarH = j83Var;
                } else {
                    h83 h83Var = new h83();
                    h83Var.b(j83Var);
                    h83Var.c(Separators.SP);
                    int iG = h83Var.g(new smk0(this.c, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
                    try {
                        h83Var.c(str);
                        h83Var.d(iG);
                        j83VarH = h83Var.h();
                    } catch (Throwable th) {
                        h83Var.d(iG);
                        throw th;
                    }
                }
                return new nls0(j83VarH, new vqc(j83Var, (byte) 11));
            case 1:
                if (j83Var.b.length() <= 0 || str.length() <= 0) {
                    j83VarH2 = j83Var;
                } else {
                    h83 h83Var2 = new h83();
                    h83Var2.b(j83Var);
                    h83Var2.c(Separators.SP);
                    int iG2 = h83Var2.g(new smk0(this.c, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
                    try {
                        h83Var2.c(str);
                        h83Var2.d(iG2);
                        j83VarH2 = h83Var2.h();
                    } catch (Throwable th2) {
                        h83Var2.d(iG2);
                        throw th2;
                    }
                }
                return new nls0(j83VarH2, new cad(j83Var, (byte) 4));
            default:
                if (j83Var.b.length() <= 0 || str.length() <= 0) {
                    j83VarH3 = j83Var;
                } else {
                    h83 h83Var3 = new h83();
                    h83Var3.b(j83Var);
                    h83Var3.c(Separators.SP);
                    int iG3 = h83Var3.g(new smk0(this.c, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
                    try {
                        h83Var3.c(str);
                        h83Var3.d(iG3);
                        j83VarH3 = h83Var3.h();
                    } catch (Throwable th3) {
                        h83Var3.d(iG3);
                        throw th3;
                    }
                }
                return new nls0(j83VarH3, new a1d(j83Var, (byte) 4));
        }
    }
}
