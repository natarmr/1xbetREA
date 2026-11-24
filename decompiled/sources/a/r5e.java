package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2c f29880a;

    public r5e(a2c a2cVar) {
        a2cVar.getClass();
        this.f29880a = a2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5e) && Intrinsics.d(this.f29880a, ((r5e) obj).f29880a);
    }

    public final int hashCode() {
        return this.f29880a.hashCode();
    }

    public final String toString() {
        return "ValidateFileError(status=" + this.f29880a + Separators.RPAREN;
    }
}
