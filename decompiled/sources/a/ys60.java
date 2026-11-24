package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ys60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pat f43155a;

    public ys60(pat patVar) {
        patVar.getClass();
        this.f43155a = patVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys60) && Intrinsics.d(this.f43155a, ((ys60) obj).f43155a);
    }

    public final int hashCode() {
        return this.f43155a.hashCode();
    }

    public final String toString() {
        return "OnActionsStateChanged(state=" + this.f43155a + Separators.RPAREN;
    }
}
