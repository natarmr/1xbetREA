package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class v20 {
    public static final u20 Companion = new u20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36659a;

    public /* synthetic */ v20(int i, String str) {
        if ((i & 1) == 0) {
            this.f36659a = null;
        } else {
            this.f36659a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v20) && Intrinsics.d(this.f36659a, ((v20) obj).f36659a);
    }

    public final int hashCode() {
        String str = this.f36659a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Address(country=", this.f36659a, Separators.RPAREN);
    }

    public v20(String str) {
        this.f36659a = str;
    }
}
