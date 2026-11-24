package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f14308a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final String h;

    public i7t(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z, String str, String str2) {
        str.getClass();
        this.f14308a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7t)) {
            return false;
        }
        i7t i7tVar = (i7t) obj;
        return this.f14308a.equals(i7tVar.f14308a) && this.b == i7tVar.b && this.c == i7tVar.c && this.d == i7tVar.d && this.e == i7tVar.e && this.f == i7tVar.f && Intrinsics.d(this.g, i7tVar.g) && this.h.equals(i7tVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(brm0.e(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f14308a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesManiaDialogResult(image=");
        sb.append(this.f14308a);
        sb.append(", startX=");
        sb.append(this.b);
        sb.append(", startY=");
        axq.r(this.c, this.d, ", dialogWidth=", ", dialogHeight=", sb);
        brm0.w(this.e, ", extraThrow=", ", text=", sb, this.f);
        return ua80.m(sb, this.g, ", bonusText=", this.h, Separators.RPAREN);
    }
}
