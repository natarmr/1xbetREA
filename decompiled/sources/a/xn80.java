package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xn80 {
    public static final wn80 Companion = new wn80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41162a;

    public /* synthetic */ xn80(int i, String str) {
        if ((i & 1) == 0) {
            this.f41162a = null;
        } else {
            this.f41162a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn80) && Intrinsics.d(this.f41162a, ((xn80) obj).f41162a);
    }

    public final int hashCode() {
        String str = this.f41162a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("ParagraphDataResponse(text=", this.f41162a, Separators.RPAREN);
    }
}
