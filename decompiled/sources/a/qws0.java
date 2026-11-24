package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29450a;

    public qws0(String str) {
        str.getClass();
        this.f29450a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qws0) && Intrinsics.d(this.f29450a, ((qws0) obj).f29450a);
    }

    public final int hashCode() {
        return this.f29450a.hashCode();
    }

    public final String toString() {
        return kng0.l("V1(opponentLabel=", this.f29450a, Separators.RPAREN);
    }
}
