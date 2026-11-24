package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21780a;
    public final int b;
    public final int c;

    public mha(String str, int i, int i2) {
        this.f21780a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mha)) {
            return false;
        }
        mha mhaVar = (mha) obj;
        return this.f21780a.equals(mhaVar.f21780a) && this.b == mhaVar.b && this.c == mhaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f21780a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "CardFootballPeriodUiModel(text=", this.f21780a, ", background=", ", textColor="));
    }
}
