package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jyf0 implements kyf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17357a;

    public jyf0(String str) {
        str.getClass();
        this.f17357a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyf0) && Intrinsics.d(this.f17357a, ((jyf0) obj).f17357a);
    }

    public final int hashCode() {
        return this.f17357a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f17357a, Separators.RPAREN);
    }
}
