package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class quq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29358a;

    public quq0(boolean z) {
        this.f29358a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quq0) && this.f29358a == ((quq0) obj).f29358a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29358a);
    }

    public final String toString() {
        return defpackage.c.d("TestRemoteConfigEnabledModel(enable=", Separators.RPAREN, this.f29358a);
    }
}
