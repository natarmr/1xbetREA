package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v8h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36983a;

    public v8h0(boolean z) {
        this.f36983a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v8h0) && this.f36983a == ((v8h0) obj).f36983a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36983a);
    }

    public final String toString() {
        return defpackage.c.d("ShowAgreementDocsDialog(withStatusError=", Separators.RPAREN, this.f36983a);
    }
}
