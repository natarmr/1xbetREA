package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45123a;
    public final int b;
    public final int c;

    public zws(int i, int i2, int i3) {
        this.f45123a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zws)) {
            return false;
        }
        zws zwsVar = (zws) obj;
        return this.f45123a == zwsVar.f45123a && this.b == zwsVar.b && this.c == zwsVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f45123a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("GameVideoPlayerErrorConfig(backgroundColor=", this.f45123a, ", textColor=", ", iconTint=", this.b));
    }
}
