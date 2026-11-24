package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sui0 implements vui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32822a;
    public final String b;
    public final String c;

    public sui0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f32822a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.vui0
    public final String a() {
        return this.f32822a;
    }

    @Override // a.vui0
    public final y3d b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sui0)) {
            return false;
        }
        sui0 sui0Var = (sui0) obj;
        return Intrinsics.d(this.f32822a, sui0Var.f32822a) && Intrinsics.d(this.b, sui0Var.b) && Intrinsics.d(this.c, sui0Var.c);
    }

    public final int hashCode() {
        return ua80.b(ua80.b(this.f32822a.hashCode() * 961, 923521, this.b), 31, this.c);
    }

    public final String toString() {
        return axq.n(b1j.n("SubtitleTitleCaption(titleText=", this.f32822a, ", titleColor=null, subTitleText=", this.b, ", subTitleColor=null, subtitleIconRes=null, subtitleIconTintColor=null, captionText="), this.c, ", captionColor=null)");
    }
}
