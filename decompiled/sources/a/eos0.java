package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class eos0 {
    public static final dos0 Companion = new dos0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8151a;
    public final Integer b;

    public /* synthetic */ eos0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f8151a = null;
        } else {
            this.f8151a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eos0)) {
            return false;
        }
        eos0 eos0Var = (eos0) obj;
        return Intrinsics.d(this.f8151a, eos0Var.f8151a) && Intrinsics.d(this.b, eos0Var.b);
    }

    public final int hashCode() {
        String str = this.f8151a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationValueResponse(text=" + this.f8151a + ", language=" + this.b + Separators.RPAREN;
    }
}
