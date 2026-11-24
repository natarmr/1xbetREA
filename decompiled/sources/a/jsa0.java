package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jsa0 implements msa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17042a;

    public jsa0(String str) {
        str.getClass();
        this.f17042a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsa0) && Intrinsics.d(this.f17042a, ((jsa0) obj).f17042a);
    }

    public final int hashCode() {
        return this.f17042a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f17042a, Separators.RPAREN);
    }
}
