package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sgm implements xgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zgm f32169a;
    public final float b;
    public final float c;

    public sgm(zgm zgmVar, float f, float f2) {
        this.f32169a = zgmVar;
        this.b = f;
        this.c = f2;
    }

    @Override // a.xgm
    public final float a() {
        return this.c;
    }

    @Override // a.xgm
    public final float b() {
        return this.b;
    }

    @Override // a.xgm
    public final ahm c() {
        return this.f32169a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgm)) {
            return false;
        }
        sgm sgmVar = (sgm) obj;
        return Intrinsics.d(this.f32169a, sgmVar.f32169a) && ycl.b(this.b, sgmVar.b) && ycl.b(this.c, sgmVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(this.f32169a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(this.c);
        StringBuilder sb = new StringBuilder("Other(indicatorType=");
        sb.append(this.f32169a);
        sb.append(", paddingTop=");
        sb.append(strC);
        sb.append(", height=");
        return axq.n(sb, strC2, Separators.RPAREN);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sgm(zgm zgmVar) {
        this(zgmVar, 16.0f, 56.0f);
        zcl zclVar = qmk.f28987a;
    }
}
