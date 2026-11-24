package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class twf0 {
    public static final swf0 Companion = new swf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34648a;

    public /* synthetic */ twf0(int i, String str) {
        if (1 == (i & 1)) {
            this.f34648a = str;
        } else {
            m2x.I(i, 1, rwf0.f31215a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twf0) && Intrinsics.d(this.f34648a, ((twf0) obj).f34648a);
    }

    public final int hashCode() {
        return this.f34648a.hashCode();
    }

    public final String toString() {
        return kng0.l("RestoreByEmailRequest(email=", this.f34648a, Separators.RPAREN);
    }

    public twf0(String str) {
        str.getClass();
        this.f34648a = str;
    }
}
