package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c560 implements i560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3756a;

    public c560(boolean z) {
        this.f3756a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c560) && this.f3756a == ((c560) obj).f3756a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3756a);
    }

    public final String toString() {
        return defpackage.c.d("OnBackClicked(isSystem=", Separators.RPAREN, this.f3756a);
    }
}
