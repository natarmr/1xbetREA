package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20711a;
    public final String b;

    public lve0(int i, String str) {
        this.f20711a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lve0)) {
            return false;
        }
        lve0 lve0Var = (lve0) obj;
        return this.f20711a == lve0Var.f20711a && this.b.equals(lve0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f20711a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f20711a, "OnDialogBonusClick(selectedBonusId=", ", selectedBonusName=", this.b, Separators.RPAREN);
    }
}
