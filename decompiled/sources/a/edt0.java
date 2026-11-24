package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class edt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7635a;
    public final hcm b;
    public final String c;
    public final int d;

    public edt0(String str, hcm hcmVar, String str2, int i) {
        str.getClass();
        this.f7635a = str;
        this.b = hcmVar;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edt0)) {
            return false;
        }
        edt0 edt0Var = (edt0) obj;
        return Intrinsics.d(this.f7635a, edt0Var.f7635a) && this.b.equals(edt0Var.b) && this.c.equals(edt0Var.c) && this.d == edt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b((this.b.hashCode() + (this.f7635a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampToolbarUiModel(title=");
        sb.append(this.f7635a);
        sb.append(", topInfo=");
        sb.append(this.b);
        sb.append(", backgroundImage=");
        return brm0.j(this.d, this.c, ", placeholder=", Separators.RPAREN, sb);
    }
}
