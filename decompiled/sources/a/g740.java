package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class g740 {
    public static final d740 Companion = new d740();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10797a;

    public /* synthetic */ g740(int i, String str) {
        if ((i & 1) == 0) {
            this.f10797a = null;
        } else {
            this.f10797a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g740) && Intrinsics.d(this.f10797a, ((g740) obj).f10797a);
    }

    public final int hashCode() {
        String str = this.f10797a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("MessageTypeDto(type=", this.f10797a, Separators.RPAREN);
    }
}
