package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pf {
    public static final of Companion = new of();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26876a;

    public /* synthetic */ pf(int i, String str) {
        if ((i & 1) == 0) {
            this.f26876a = null;
        } else {
            this.f26876a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf) && Intrinsics.d(this.f26876a, ((pf) obj).f26876a);
    }

    public final int hashCode() {
        String str = this.f26876a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("AccountNumberUrlValue(authUrl=", this.f26876a, Separators.RPAREN);
    }
}
