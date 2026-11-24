package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class upa0 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36055a;
    public final fyl b;
    public final boolean c;

    public upa0(String str, fyl fylVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f36055a = str;
        this.b = fylVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upa0)) {
            return false;
        }
        upa0 upa0Var = (upa0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f36055a.equals(upa0Var.f36055a) && this.b.equals(upa0Var.b) && this.c == upa0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ua80.b(u0f0.Z.hashCode() * 31, 31, this.f36055a)) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.Z;
    }

    public final String toString() {
        return "PoliticalExposedPersonFieldUiModel(registrationFieldType=" + u0f0.Z + ", description=" + this.f36055a + ", dsChipUiModel=" + this.b + ", isError=" + this.c + Separators.RPAREN;
    }
}
