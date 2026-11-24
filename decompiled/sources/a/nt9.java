package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nt9 implements qt9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24086a;

    public nt9(String str) {
        str.getClass();
        this.f24086a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt9) && Intrinsics.d(this.f24086a, ((nt9) obj).f24086a);
    }

    public final int hashCode() {
        return this.f24086a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRatingCommentChanged(commentText=", this.f24086a, Separators.RPAREN);
    }
}
