package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class syf0 {
    public static final ryf0 Companion = new ryf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33022a;

    public /* synthetic */ syf0(int i, String str) {
        if ((i & 1) == 0) {
            this.f33022a = null;
        } else {
            this.f33022a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syf0) && Intrinsics.d(this.f33022a, ((syf0) obj).f33022a);
    }

    public final int hashCode() {
        String str = this.f33022a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("RequestPayload(operationApprovalGuid=", this.f33022a, Separators.RPAREN);
    }

    public syf0(String str) {
        this.f33022a = str;
    }
}
