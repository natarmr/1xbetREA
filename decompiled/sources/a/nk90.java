package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nk90 implements Serializable {
    public static final mk90 Companion = new mk90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23672a;
    public final String b;

    public /* synthetic */ nk90(int i, int i2, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, lk90.f20190a.getDescriptor());
            throw null;
        }
        this.f23672a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk90)) {
            return false;
        }
        nk90 nk90Var = (nk90) obj;
        return this.f23672a == nk90Var.f23672a && Intrinsics.d(this.b, nk90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f23672a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f23672a, "PersonalGenderChoice(id=", ", name=", this.b, Separators.RPAREN);
    }

    public nk90(int i, String str) {
        str.getClass();
        this.f23672a = i;
        this.b = str;
    }
}
