package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x840 implements z840 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40446a;

    public x840(boolean z) {
        this.f40446a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x840) && this.f40446a == ((x840) obj).f40446a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40446a);
    }

    public final String toString() {
        return defpackage.c.d("ShowDeleteMessageDialog(isDeleteAllMessages=", Separators.RPAREN, this.f40446a);
    }
}
