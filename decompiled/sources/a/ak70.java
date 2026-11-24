package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ak70 extends bk70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1009a;

    public ak70(boolean z) {
        this.f1009a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak70) && this.f1009a == ((ak70) obj).f1009a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1009a);
    }

    public final String toString() {
        return defpackage.c.d("EnableClickableFragment(enable=", Separators.RPAREN, this.f1009a);
    }
}
