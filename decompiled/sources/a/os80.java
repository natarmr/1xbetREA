package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class os80 implements qs80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25771a;

    public os80(String str) {
        str.getClass();
        this.f25771a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os80) && Intrinsics.d(this.f25771a, ((os80) obj).f25771a);
    }

    public final int hashCode() {
        return this.f25771a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f25771a, Separators.RPAREN);
    }
}
