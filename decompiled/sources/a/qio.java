package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28800a;
    public final boolean b;

    public qio(int i, boolean z) {
        this.f28800a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qio)) {
            return false;
        }
        qio qioVar = (qio) obj;
        return this.f28800a == qioVar.f28800a && this.b == qioVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f28800a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f28800a, "ExamAnswerParams(id=", ", value=", Separators.RPAREN, this.b);
    }
}
