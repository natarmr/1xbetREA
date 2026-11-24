package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13512a;

    public hr4(boolean z) {
        this.f13512a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr4) && this.f13512a == ((hr4) obj).f13512a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13512a);
    }

    public final String toString() {
        return defpackage.c.d("AuthenticatorPermissionModel(enableAuthenticator=", Separators.RPAREN, this.f13512a);
    }
}
