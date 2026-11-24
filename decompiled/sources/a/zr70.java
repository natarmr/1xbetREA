package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zr70 implements cs70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44839a;

    public zr70(String str) {
        str.getClass();
        this.f44839a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr70) && Intrinsics.d(this.f44839a, ((zr70) obj).f44839a);
    }

    public final int hashCode() {
        return this.f44839a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRatingCommentChanged(commentText=", this.f44839a, Separators.RPAREN);
    }
}
