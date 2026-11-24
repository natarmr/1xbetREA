package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class he9 {
    public static final ge9 Companion = new ge9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12911a;

    public /* synthetic */ he9(int i, String str) {
        if ((i & 1) == 0) {
            this.f12911a = null;
        } else {
            this.f12911a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he9) && Intrinsics.d(this.f12911a, ((he9) obj).f12911a);
    }

    public final int hashCode() {
        String str = this.f12911a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("ButtonDescriptionResponse(title=", this.f12911a, Separators.RPAREN);
    }
}
