package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a790 implements d790 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f356a;

    public a790(boolean z) {
        this.f356a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a790) && this.f356a == ((a790) obj).f356a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f356a);
    }

    public final String toString() {
        return defpackage.c.d("Content(reloadButtonEnabled=", Separators.RPAREN, this.f356a);
    }
}
