package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42485a;
    public final String b;

    public yeh(int i, String str) {
        this.f42485a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeh)) {
            return false;
        }
        yeh yehVar = (yeh) obj;
        return this.f42485a == yehVar.f42485a && this.b.equals(yehVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f42485a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f42485a, "CyberStageTableTitleColumnModel(id=", ", title=", this.b, Separators.RPAREN);
    }
}
