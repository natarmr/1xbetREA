package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bof0 {
    public static final aof0 Companion = new aof0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2931a;

    public /* synthetic */ bof0(int i, String str) {
        if ((i & 1) == 0) {
            this.f2931a = null;
        } else {
            this.f2931a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bof0) && Intrinsics.d(this.f2931a, ((bof0) obj).f2931a);
    }

    public final int hashCode() {
        String str = this.f2931a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("RequestPayload(operationApprovalGuid=", this.f2931a, Separators.RPAREN);
    }

    public bof0(String str) {
        this.f2931a = str;
    }
}
