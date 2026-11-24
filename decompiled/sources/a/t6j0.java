package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f33419a;
    public final rqm b;
    public final rqm c;
    public final rqm d;
    public final String e;
    public final boolean f;

    public t6j0(imm immVar, rqm rqmVar, rqm rqmVar2, rqm rqmVar3, String str, boolean z) {
        str.getClass();
        this.f33419a = immVar;
        this.b = rqmVar;
        this.c = rqmVar2;
        this.d = rqmVar3;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6j0)) {
            return false;
        }
        t6j0 t6j0Var = (t6j0) obj;
        return this.f33419a.equals(t6j0Var.f33419a) && this.b.equals(t6j0Var.b) && this.c.equals(t6j0Var.c) && this.d.equals(t6j0Var.d) && Intrinsics.d(this.e, t6j0Var.e) && this.f == t6j0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f33419a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPinCodeUiState(navigationBarUiModel=");
        sb.append(this.f33419a);
        sb.append(", activationPinCodeStyle=");
        sb.append(this.b);
        sb.append(", changePinCodeStyle=");
        sb.append(this.c);
        sb.append(", useBiometricStyle=");
        sb.append(this.d);
        sb.append(", descriptionPinCodeSettings=");
        return defpackage.c.c(this.e, ", isShowFingerPrint=", Separators.RPAREN, sb, this.f);
    }
}
