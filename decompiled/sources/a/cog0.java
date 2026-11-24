package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cog0 implements fog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4699a;

    public cog0(Uri uri) {
        uri.getClass();
        this.f4699a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cog0) && Intrinsics.d(this.f4699a, ((cog0) obj).f4699a);
    }

    public final int hashCode() {
        return this.f4699a.hashCode();
    }

    public final String toString() {
        return "SendDialAction(uri=" + this.f4699a + Separators.RPAREN;
    }
}
