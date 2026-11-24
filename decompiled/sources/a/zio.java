package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44450a;
    public final String b;

    public zio(String str, boolean z) {
        this.f44450a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zio)) {
            return false;
        }
        zio zioVar = (zio) obj;
        return this.f44450a == zioVar.f44450a && this.b.equals(zioVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f44450a) * 31);
    }

    public final String toString() {
        return ua80.k("ExamAnswersModel(isTestSuccessful=", this.f44450a, ", questionsResult=", this.b, Separators.RPAREN);
    }
}
