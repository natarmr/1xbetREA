package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42290a;

    public yad0(String str) {
        this.f42290a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yad0) && Intrinsics.d(this.f42290a, ((yad0) obj).f42290a);
    }

    public final int hashCode() {
        String str = this.f42290a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("GamesCategoryGroup(categoryId=", this.f42290a, Separators.RPAREN);
    }
}
