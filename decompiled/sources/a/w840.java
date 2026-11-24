package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w840 implements z840 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38704a;

    public w840(String str) {
        str.getClass();
        this.f38704a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w840) && Intrinsics.d(this.f38704a, ((w840) obj).f38704a);
    }

    public final int hashCode() {
        return this.f38704a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenUrl(url=", this.f38704a, Separators.RPAREN);
    }
}
