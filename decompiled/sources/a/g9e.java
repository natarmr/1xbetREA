package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g9e implements k9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10910a;

    public g9e(boolean z) {
        this.f10910a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9e) && this.f10910a == ((g9e) obj).f10910a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10910a);
    }

    public final String toString() {
        return defpackage.c.d("ScrollToBottom(needDelay=", Separators.RPAREN, this.f10910a);
    }
}
