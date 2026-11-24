package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f32906a;

    public sw60(pat patVar) {
        patVar.getClass();
        this.f32906a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw60) && Intrinsics.d(this.f32906a, ((sw60) obj).f32906a);
    }

    public final int hashCode() {
        return this.f32906a.hashCode();
    }

    public final String toString() {
        return "OnPreviewStateChanged(state=" + this.f32906a + Separators.RPAREN;
    }
}
