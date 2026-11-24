package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class onc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ymc f25540a;
    public final ClassicFavoriteTab b;
    public final kmc c;
    public final int d;
    public final zpv e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public onc(ymc ymcVar, ClassicFavoriteTab classicFavoriteTab, kmc kmcVar, int i, zpv zpvVar, boolean z, boolean z2, String str, boolean z3) {
        this.f25540a = ymcVar;
        this.b = classicFavoriteTab;
        this.c = kmcVar;
        this.d = i;
        this.e = zpvVar;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = z3;
    }

    public static onc a(onc oncVar, ymc ymcVar, ClassicFavoriteTab classicFavoriteTab, kmc kmcVar, int i, zpv zpvVar, boolean z, boolean z2, String str, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            ymcVar = oncVar.f25540a;
        }
        ymc ymcVar2 = ymcVar;
        if ((i2 & 2) != 0) {
            classicFavoriteTab = oncVar.b;
        }
        ClassicFavoriteTab classicFavoriteTab2 = classicFavoriteTab;
        if ((i2 & 4) != 0) {
            kmcVar = oncVar.c;
        }
        kmc kmcVar2 = kmcVar;
        if ((i2 & 8) != 0) {
            i = oncVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            zpvVar = oncVar.e;
        }
        zpv zpvVar2 = zpvVar;
        boolean z4 = (i2 & 32) != 0 ? oncVar.f : z;
        boolean z5 = (i2 & 64) != 0 ? oncVar.g : z2;
        String str2 = (i2 & 128) != 0 ? oncVar.h : str;
        boolean z6 = (i2 & 256) != 0 ? oncVar.i : z3;
        oncVar.getClass();
        kmcVar2.getClass();
        return new onc(ymcVar2, classicFavoriteTab2, kmcVar2, i3, zpvVar2, z4, z5, str2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onc)) {
            return false;
        }
        onc oncVar = (onc) obj;
        return Intrinsics.d(this.f25540a, oncVar.f25540a) && this.b == oncVar.b && this.c.equals(oncVar.c) && this.d == oncVar.d && this.e.equals(oncVar.e) && this.f == oncVar.f && this.g == oncVar.g && this.h.equals(oncVar.h) && this.i == oncVar.i;
    }

    public final int hashCode() {
        ymc ymcVar = this.f25540a;
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(brm0.e((this.e.hashCode() + twn.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((ymcVar == null ? 0 : ymcVar.hashCode()) * 31)) * 31)) * 31, 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassicFavoritesContainerState(config=");
        sb.append(this.f25540a);
        sb.append(", favoriteTab=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", trackedItemsCount=");
        sb.append(this.d);
        sb.append(", headerActionsState=");
        sb.append(this.e);
        sb.append(", authorizedUser=");
        sb.append(this.f);
        sb.append(", activeSearchField=");
        f140.s(", searchQuery=", this.h, ", contentCanScroollToTop=", sb, this.g);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
