package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class iz10 {
    public static final hz10 Companion = new hz10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15614a;

    public /* synthetic */ iz10(int i, String str) {
        if ((i & 1) == 0) {
            this.f15614a = null;
        } else {
            this.f15614a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz10) && Intrinsics.d(this.f15614a, ((iz10) obj).f15614a);
    }

    public final int hashCode() {
        String str = this.f15614a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MainResponse(addTime=", this.f15614a, Separators.RPAREN);
    }
}
