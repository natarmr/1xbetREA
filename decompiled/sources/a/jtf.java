package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jtf {
    public static final itf Companion = new itf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17097a;

    public /* synthetic */ jtf(int i, String str) {
        if ((i & 1) == 0) {
            this.f17097a = null;
        } else {
            this.f17097a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtf) && Intrinsics.d(this.f17097a, ((jtf) obj).f17097a);
    }

    public final int hashCode() {
        String str = this.f17097a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("CupServicePersonalDataResponse(title=", this.f17097a, Separators.RPAREN);
    }
}
