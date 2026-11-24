package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class dld0 {
    public static final bld0 Companion = new bld0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6275a;
    public final String b;

    public /* synthetic */ dld0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f6275a = null;
        } else {
            this.f6275a = num;
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
        if (!(obj instanceof dld0)) {
            return false;
        }
        dld0 dld0Var = (dld0) obj;
        return Intrinsics.d(this.f6275a, dld0Var.f6275a) && Intrinsics.d(this.b, dld0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f6275a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f6275a, "QuestionResponse(questionId=", ", questionText=", this.b, Separators.RPAREN);
    }
}
