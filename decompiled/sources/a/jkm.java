package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okm f16676a;
    public final ikm b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Function0 g;

    public jkm(okm okmVar, ikm ikmVar, int i, int i2, int i3, int i4, Function0 function0) {
        this.f16676a = okmVar;
        this.b = ikmVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = function0;
    }

    public static jkm a(jkm jkmVar, Function0 function0) {
        okm okmVar = jkmVar.f16676a;
        ikm ikmVar = jkmVar.b;
        int i = jkmVar.c;
        int i2 = jkmVar.d;
        jkmVar.getClass();
        int i3 = jkmVar.e;
        jkmVar.getClass();
        jkmVar.getClass();
        return new jkm(okmVar, ikmVar, i, i2, i3, R.string.try_again_text, function0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkm)) {
            return false;
        }
        jkm jkmVar = (jkm) obj;
        return this.f16676a == jkmVar.f16676a && this.b == jkmVar.b && this.c == jkmVar.c && this.d == jkmVar.d && this.e == jkmVar.e && this.f == jkmVar.f && Intrinsics.d(this.g, jkmVar.g);
    }

    public final int hashCode() {
        int iA = twn.a(this.f, twn.a(R.string.empty_str, twn.a(this.e, twn.a(R.string.empty_str, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f16676a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31);
        Function0 function0 = this.g;
        return iA + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsLottieEmptyConfig(styleType=");
        sb.append(this.f16676a);
        sb.append(", colorType=");
        sb.append(this.b);
        sb.append(", lottie=");
        axq.r(this.c, this.d, ", iconRes=", ", titleText=", sb);
        axq.r(R.string.empty_str, this.e, ", subtitleText=", ", captionText=", sb);
        axq.r(R.string.empty_str, this.f, ", buttonText=", ", onButtonClick=", sb);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
