package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ddk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5901a;
    public final g7n b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final wul h;
    public final wul i;
    public final wul j;

    public ddk0(String str, g7n g7nVar, boolean z, boolean z2, boolean z3, String str2, boolean z4, wul wulVar, wul wulVar2, wul wulVar3) {
        str.getClass();
        this.f5901a = str;
        this.b = g7nVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = z4;
        this.h = wulVar;
        this.i = wulVar2;
        this.j = wulVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddk0)) {
            return false;
        }
        ddk0 ddk0Var = (ddk0) obj;
        return Intrinsics.d(this.f5901a, ddk0Var.f5901a) && this.b.equals(ddk0Var.b) && this.c == ddk0Var.c && this.d == ddk0Var.d && this.e == ddk0Var.e && Intrinsics.d(this.f, ddk0Var.f) && this.g == ddk0Var.g && this.h.equals(ddk0Var.h) && this.i.equals(ddk0Var.i) && this.j.equals(ddk0Var.j);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f5901a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.j.hashCode() + i8i.a(this.i, i8i.a(this.h, brm0.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmsSendUiState(title=");
        sb.append(this.f5901a);
        sb.append(", codeTextFieldModel=");
        sb.append(this.b);
        sb.append(", isConfirmEnabled=");
        ua80.u(", isLoading=", ", resendButtonVisible=", sb, this.c, this.d);
        f140.s(", resendStatusText=", this.f, ", autoFocus=", sb, this.e);
        sb.append(this.g);
        sb.append(", confirmButtonModel=");
        sb.append(this.h);
        sb.append(", cancelButtonModel=");
        sb.append(this.i);
        sb.append(", resendButtonModel=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
