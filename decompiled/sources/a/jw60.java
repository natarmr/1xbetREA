package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f17237a;

    public jw60(pat patVar) {
        patVar.getClass();
        this.f17237a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw60) && Intrinsics.d(this.f17237a, ((jw60) obj).f17237a);
    }

    public final int hashCode() {
        return this.f17237a.hashCode();
    }

    public final String toString() {
        return "OnActionsStateChanged(state=" + this.f17237a + Separators.RPAREN;
    }
}
