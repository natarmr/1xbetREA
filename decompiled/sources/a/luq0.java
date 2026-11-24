package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class luq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20685a;

    public luq0(boolean z) {
        this.f20685a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luq0) && this.f20685a == ((luq0) obj).f20685a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20685a);
    }

    public final String toString() {
        return defpackage.c.d("ShowPushInfoModel(enable=", Separators.RPAREN, this.f20685a);
    }
}
