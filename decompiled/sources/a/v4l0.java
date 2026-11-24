package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v4l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36787a;

    public v4l0(boolean z) {
        this.f36787a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4l0) && this.f36787a == ((v4l0) obj).f36787a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36787a);
    }

    public final String toString() {
        return defpackage.c.d("AllChampsClick(isLive=", Separators.RPAREN, this.f36787a);
    }
}
