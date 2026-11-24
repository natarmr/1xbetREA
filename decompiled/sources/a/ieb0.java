package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ieb0 implements keb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14624a;
    public final ejm b;
    public final jjm c;
    public final String d;

    public ieb0(String str, ejm ejmVar, jjm jjmVar) {
        String strConcat;
        str.getClass();
        this.f14624a = str;
        this.b = ejmVar;
        this.c = jjmVar;
        if (jjmVar instanceof hjm) {
            strConcat = "WebGamesGameCollection".concat(str);
        } else {
            if (!(jjmVar instanceof ijm)) {
                t9f.b();
                throw null;
            }
            strConcat = "WebGamesGameCollectionShimmer".concat(str);
        }
        this.d = strConcat;
    }

    @Override // a.keb0
    public final String B() {
        return this.f14624a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieb0)) {
            return false;
        }
        ieb0 ieb0Var = (ieb0) obj;
        return Intrinsics.d(this.f14624a, ieb0Var.f14624a) && this.b.equals(ieb0Var.b) && this.c.equals(ieb0Var.c);
    }

    @Override // a.oeb0
    public final String getKey() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f14624a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebGamesGameCollection(categoryId=" + this.f14624a + ", uiModel=" + this.b + ", headerModel=" + this.c + Separators.RPAREN;
    }
}
