package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pmh implements rmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27234a;

    public pmh(String str) {
        str.getClass();
        this.f27234a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmh) && Intrinsics.d(this.f27234a, ((pmh) obj).f27234a);
    }

    public final int hashCode() {
        return this.f27234a.hashCode();
    }

    public final String toString() {
        return kng0.l("Content(tagLabel=", this.f27234a, Separators.RPAREN);
    }
}
