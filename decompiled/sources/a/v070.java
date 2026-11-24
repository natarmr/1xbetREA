package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v070 implements j170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f36568a;

    public v070(pat patVar) {
        patVar.getClass();
        this.f36568a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v070) && Intrinsics.d(this.f36568a, ((v070) obj).f36568a);
    }

    public final int hashCode() {
        return this.f36568a.hashCode();
    }

    public final String toString() {
        return "OnPreviewStateChange(state=" + this.f36568a + Separators.RPAREN;
    }
}
