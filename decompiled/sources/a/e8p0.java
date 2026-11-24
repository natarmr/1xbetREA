package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e8p0 implements m8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7386a;

    public e8p0(String str) {
        str.getClass();
        this.f7386a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8p0) && Intrinsics.d(this.f7386a, ((e8p0) obj).f7386a);
    }

    public final int hashCode() {
        return this.f7386a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemWithKeyClick(idKey=", this.f7386a, Separators.RPAREN);
    }
}
