package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class msk implements qsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22324a;
    public final int b;
    public final String c;
    public final ppk d;
    public final qt20 e;

    public msk(String str, int i, String str2, ppk ppkVar, qt20 qt20Var) {
        this.f22324a = str;
        this.b = i;
        this.c = str2;
        this.d = ppkVar;
        this.e = qt20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msk)) {
            return false;
        }
        msk mskVar = (msk) obj;
        return this.f22324a.equals(mskVar.f22324a) && this.b == mskVar.b && this.c.equals(mskVar.c) && this.d.equals(mskVar.d) && this.e.equals(mskVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(twn.a(this.b, this.f22324a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Default(backgroundImageUrl=", this.f22324a, ", placeholderUrl=", ", name=");
        sbP.append(this.c);
        sbP.append(", chips=");
        sbP.append(this.d);
        sbP.append(", marketExpandButtonUiModel=");
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
