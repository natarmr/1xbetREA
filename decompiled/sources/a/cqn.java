package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cqn extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4803a;
    public final String b;

    public cqn(String str, String str2) {
        this.f4803a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqn)) {
            return false;
        }
        cqn cqnVar = (cqn) obj;
        return this.f4803a.equals(cqnVar.f4803a) && this.b.equals(cqnVar.b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f4803a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4803a.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return b1j.k("EditProfileErrorModel(message=", this.f4803a, ", key=", this.b, Separators.RPAREN);
    }
}
