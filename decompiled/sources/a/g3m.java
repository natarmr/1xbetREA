package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f10616a;
    public final String b;
    public final String c;
    public final a4x d;

    public g3m(n0x n0xVar, String str, String str2, a4x a4xVar) {
        a4xVar.getClass();
        this.f10616a = n0xVar;
        this.b = str;
        this.c = str2;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3m)) {
            return false;
        }
        g3m g3mVar = (g3m) obj;
        return this.f10616a.equals(g3mVar.f10616a) && this.b.equals(g3mVar.b) && Intrinsics.d(this.c, g3mVar.c) && Intrinsics.d(this.d, g3mVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f10616a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "DsCyberBiographyItemUiModel(playerPicture=" + this.f10616a + ", mainLabel=" + this.b + ", secondaryLabel=" + this.c + ", cells=" + this.d + Separators.RPAREN;
    }
}
