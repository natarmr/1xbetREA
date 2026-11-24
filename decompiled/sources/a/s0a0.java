package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31402a;

    public s0a0(String str) {
        this.f31402a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0a0) && this.f31402a.equals(((s0a0) obj).f31402a);
    }

    public final int hashCode() {
        return this.f31402a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerRoleUiModel(roleName=", this.f31402a, Separators.RPAREN);
    }
}
