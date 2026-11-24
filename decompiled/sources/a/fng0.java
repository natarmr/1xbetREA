package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fng0 implements ing0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9836a;

    public fng0(Uri uri) {
        uri.getClass();
        this.f9836a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fng0) && Intrinsics.d(this.f9836a, ((fng0) obj).f9836a);
    }

    public final int hashCode() {
        return this.f9836a.hashCode();
    }

    public final String toString() {
        return "SendDialAction(uri=" + this.f9836a + Separators.RPAREN;
    }
}
