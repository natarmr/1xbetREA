package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19995a;
    public final String b;

    public lg8(int i, String str) {
        str.getClass();
        this.f19995a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg8)) {
            return false;
        }
        lg8 lg8Var = (lg8) obj;
        return this.f19995a == lg8Var.f19995a && Intrinsics.d(this.b, lg8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f19995a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f19995a, "CloseDialog(selectedBonusId=", ", selectedBonusName=", this.b, Separators.RPAREN);
    }
}
