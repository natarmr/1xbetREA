package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bnw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2905a;
    public final String b;

    public bnw(int i, String str) {
        this.f2905a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnw)) {
            return false;
        }
        bnw bnwVar = (bnw) obj;
        return this.f2905a == bnwVar.f2905a && this.b.equals(bnwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f2905a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f2905a, "HorseMenuModel(type=", ", name=", this.b, Separators.RPAREN);
    }
}
