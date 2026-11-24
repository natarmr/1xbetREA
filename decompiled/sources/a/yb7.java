package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yb7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42327a;

    public yb7(String str) {
        str.getClass();
        this.f42327a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb7) && Intrinsics.d(this.f42327a, ((yb7) obj).f42327a);
    }

    public final int hashCode() {
        return this.f42327a.hashCode();
    }

    public final String toString() {
        return kng0.l("Copy(betIdNumber=", this.f42327a, Separators.RPAREN);
    }
}
