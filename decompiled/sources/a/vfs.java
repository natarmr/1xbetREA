package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37349a;
    public final String b;
    public final String c;

    public vfs(String str, String str2, String str3) {
        str2.getClass();
        this.f37349a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfs)) {
            return false;
        }
        vfs vfsVar = (vfs) obj;
        return this.f37349a.equals(vfsVar.f37349a) && Intrinsics.d(this.b, vfsVar.b) && this.c.equals(vfsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f37349a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("GameInfoHeaderUiModel(sportIconUrl=", this.f37349a, ", title=", this.b, ", subTitle="), this.c, Separators.RPAREN);
    }
}
