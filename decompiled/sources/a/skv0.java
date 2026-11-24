package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class skv0 {
    public static final rkv0 Companion = new rkv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f32371a;
    public final String b;

    public /* synthetic */ skv0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f32371a = null;
        } else {
            this.f32371a = num;
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
        if (!(obj instanceof skv0)) {
            return false;
        }
        skv0 skv0Var = (skv0) obj;
        return Intrinsics.d(this.f32371a, skv0Var.f32371a) && Intrinsics.d(this.b, skv0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f32371a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f32371a, "WinterGameMenuResponse(type=", ", name=", this.b, Separators.RPAREN);
    }
}
