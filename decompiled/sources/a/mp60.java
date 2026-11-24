package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f22165a;

    public mp60(pat patVar) {
        patVar.getClass();
        this.f22165a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp60) && Intrinsics.d(this.f22165a, ((mp60) obj).f22165a);
    }

    public final int hashCode() {
        return this.f22165a.hashCode();
    }

    public final String toString() {
        return "OnPreviewStateChanged(state=" + this.f22165a + Separators.RPAREN;
    }
}
