package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bt60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f3167a;

    public bt60(pat patVar) {
        patVar.getClass();
        this.f3167a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt60) && Intrinsics.d(this.f3167a, ((bt60) obj).f3167a);
    }

    public final int hashCode() {
        return this.f3167a.hashCode();
    }

    public final String toString() {
        return "OnPreviewStateChanged(state=" + this.f3167a + Separators.RPAREN;
    }
}
