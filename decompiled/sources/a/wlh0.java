package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wlh0 {
    public static final vlh0 Companion = new vlh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39354a;
    public final String b;

    public /* synthetic */ wlh0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f39354a = null;
        } else {
            this.f39354a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlh0)) {
            return false;
        }
        wlh0 wlh0Var = (wlh0) obj;
        return Intrinsics.d(this.f39354a, wlh0Var.f39354a) && Intrinsics.d(this.b, wlh0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f39354a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f39354a, "SecretQuestionGetResponse(questionId=", ", questionText=", this.b, Separators.RPAREN);
    }
}
