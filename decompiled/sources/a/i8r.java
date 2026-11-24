package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class i8r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8r f14353a;
    public final h8r b;

    public i8r(h8r h8rVar, h8r h8rVar2) {
        this.f14353a = h8rVar;
        this.b = h8rVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8r)) {
            return false;
        }
        i8r i8rVar = (i8r) obj;
        return this.f14353a.equals(i8rVar.f14353a) && this.b.equals(i8rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14353a.hashCode() * 31);
    }

    public final String toString() {
        return "FreeValueConfigurationModel(min=" + this.f14353a + ", max=" + this.b + Separators.RPAREN;
    }
}
