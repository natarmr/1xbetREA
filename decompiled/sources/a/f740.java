package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class f740 {
    public static final c740 Companion = new c740();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9042a;

    public /* synthetic */ f740(int i, String str) {
        if ((i & 1) == 0) {
            this.f9042a = null;
        } else {
            this.f9042a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f740) && Intrinsics.d(this.f9042a, ((f740) obj).f9042a);
    }

    public final int hashCode() {
        String str = this.f9042a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MessageTypeDto(type=", this.f9042a, Separators.RPAREN);
    }
}
