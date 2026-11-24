package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14033a;
    public final ypl b;
    public final bql c;

    public i250(String str, ypl yplVar, bql bqlVar) {
        str.getClass();
        yplVar.getClass();
        this.f14033a = str;
        this.b = yplVar;
        this.c = bqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i250)) {
            return false;
        }
        i250 i250Var = (i250) obj;
        return Intrinsics.d(this.f14033a, i250Var.f14033a) && this.b == i250Var.b && this.c.equals(i250Var.c);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f14033a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f14033a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserTournamentsCarousel(key=" + this.f14033a + ", style=" + this.b + ", uiModel=" + this.c + Separators.RPAREN;
    }
}
