package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zsu0 {
    public static final ysu0 Companion = new ysu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44924a;

    public /* synthetic */ zsu0(int i, String str) {
        if ((i & 1) == 0) {
            this.f44924a = null;
        } else {
            this.f44924a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsu0) && Intrinsics.d(this.f44924a, ((zsu0) obj).f44924a);
    }

    public final int hashCode() {
        String str = this.f44924a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("InfoItem(description=", this.f44924a, Separators.RPAREN);
    }
}
