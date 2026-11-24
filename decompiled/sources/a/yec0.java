package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f42480a;
    public final String b;
    public final wul c;
    public final wul d;

    public yec0(a4x a4xVar, String str, wul wulVar, wul wulVar2) {
        a4xVar.getClass();
        str.getClass();
        this.f42480a = a4xVar;
        this.b = str;
        this.c = wulVar;
        this.d = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yec0)) {
            return false;
        }
        yec0 yec0Var = (yec0) obj;
        return Intrinsics.d(this.f42480a, yec0Var.f42480a) && Intrinsics.d(this.b, yec0Var.b) && this.c.equals(yec0Var.c) && this.d.equals(yec0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i8i.a(this.c, ua80.b(this.f42480a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "PromoCodeMessageUiState(descriptions=" + this.f42480a + ", title=" + this.b + ", firstButtonModel=" + this.c + ", secondButtonModel=" + this.d + Separators.RPAREN;
    }
}
