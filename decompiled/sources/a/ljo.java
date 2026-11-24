package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ljo {
    public static final jjo Companion = new jjo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f20161a;
    public final String b;

    public /* synthetic */ ljo(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f20161a = null;
        } else {
            this.f20161a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljo)) {
            return false;
        }
        ljo ljoVar = (ljo) obj;
        return Intrinsics.d(this.f20161a, ljoVar.f20161a) && Intrinsics.d(this.b, ljoVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.f20161a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ExamAnswersResponse(success=" + this.f20161a + ", questionsResult=" + this.b + Separators.RPAREN;
    }
}
