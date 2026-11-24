package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d1q0 {
    public static final c1q0 Companion = new c1q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5322a;
    public final String b;

    public /* synthetic */ d1q0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f5322a = "";
        } else {
            this.f5322a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1q0)) {
            return false;
        }
        d1q0 d1q0Var = (d1q0) obj;
        return Intrinsics.d(this.f5322a, d1q0Var.f5322a) && Intrinsics.d(this.b, d1q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5322a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TestCredModel(login=", this.f5322a, ", password=", this.b, Separators.RPAREN);
    }

    public d1q0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5322a = str;
        this.b = str2;
    }
}
