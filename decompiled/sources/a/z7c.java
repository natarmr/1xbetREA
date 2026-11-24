package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class z7c {
    public static final y7c Companion = new y7c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43911a;

    public /* synthetic */ z7c(int i, String str) {
        if (1 == (i & 1)) {
            this.f43911a = str;
        } else {
            m2x.I(i, 1, x7c.f40406a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7c) && Intrinsics.d(this.f43911a, ((z7c) obj).f43911a);
    }

    public final int hashCode() {
        return this.f43911a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckDataRequest(code=", this.f43911a, Separators.RPAREN);
    }

    public z7c(String str) {
        str.getClass();
        this.f43911a = str;
    }
}
