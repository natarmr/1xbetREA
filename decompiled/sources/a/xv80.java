package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xv80 {
    public static final wv80 Companion = new wv80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41547a;

    public /* synthetic */ xv80(int i, String str) {
        if ((i & 1) == 0) {
            this.f41547a = null;
        } else {
            this.f41547a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv80) && Intrinsics.d(this.f41547a, ((xv80) obj).f41547a);
    }

    public final int hashCode() {
        String str = this.f41547a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("Action(type=", this.f41547a, Separators.RPAREN);
    }
}
