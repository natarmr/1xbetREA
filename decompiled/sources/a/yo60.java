package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yo60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f42970a;

    public yo60(pat patVar) {
        patVar.getClass();
        this.f42970a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo60) && Intrinsics.d(this.f42970a, ((yo60) obj).f42970a);
    }

    public final int hashCode() {
        return this.f42970a.hashCode();
    }

    public final String toString() {
        return "OnActionsStateChanged(state=" + this.f42970a + Separators.RPAREN;
    }
}
