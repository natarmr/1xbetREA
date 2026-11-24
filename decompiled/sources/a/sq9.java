package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sq9 implements tq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32617a;

    public sq9(String str) {
        this.f32617a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq9) && this.f32617a.equals(((sq9) obj).f32617a);
    }

    public final int hashCode() {
        return this.f32617a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowRequestCanceledSnackBar(message=", this.f32617a, Separators.RPAREN);
    }
}
