package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai10 f42614a;
    public final ei10 b;
    public final wi10 c;

    public yh10(ai10 ai10Var, ei10 ei10Var, wi10 wi10Var) {
        this.f42614a = ai10Var;
        this.b = ei10Var;
        this.c = wi10Var;
    }

    public static yh10 a(yh10 yh10Var, wi10 wi10Var) {
        ai10 ai10Var = yh10Var.f42614a;
        ei10 ei10Var = yh10Var.b;
        yh10Var.getClass();
        wi10Var.getClass();
        return new yh10(ai10Var, ei10Var, wi10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh10)) {
            return false;
        }
        yh10 yh10Var = (yh10) obj;
        return this.f42614a.equals(yh10Var.f42614a) && this.b.equals(yh10Var.b) && this.c.equals(yh10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f42614a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoyaltyProgramFullInfoModel(programInfo=" + this.f42614a + ", activeLevel=" + this.b + ", userInfo=" + this.c + Separators.RPAREN;
    }
}
