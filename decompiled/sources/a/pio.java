package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27051a;
    public final boolean b;

    public pio(int i, boolean z) {
        this.f27051a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pio)) {
            return false;
        }
        pio pioVar = (pio) obj;
        return this.f27051a == pioVar.f27051a && this.b == pioVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f27051a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f27051a, "ExamAnswerParams(id=", ", value=", Separators.RPAREN, this.b);
    }
}
