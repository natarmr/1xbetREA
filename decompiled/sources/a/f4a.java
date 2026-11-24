package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f4a implements h4a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2a f8904a;

    public f4a(n2a n2aVar) {
        n2aVar.getClass();
        this.f8904a = n2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4a) && Intrinsics.d(this.f8904a, ((f4a) obj).f8904a);
    }

    public final int hashCode() {
        return this.f8904a.hashCode();
    }

    public final String toString() {
        return "Preparing(cameraSelector=" + this.f8904a + Separators.RPAREN;
    }
}
