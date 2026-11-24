package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hzi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13908a;
    public final String b;

    public hzi0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13908a = str;
        this.b = str2;
    }

    @Override // a.hej0
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzi0)) {
            return false;
        }
        hzi0 hzi0Var = (hzi0) obj;
        return Intrinsics.d(this.f13908a, hzi0Var.f13908a) && Intrinsics.d(this.b, hzi0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.banner_time) + ua80.b(ua80.b(Integer.hashCode(R.drawable.glyph_exclamation) * 31, 31, this.f13908a), 31, this.b);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return brm0.j(R.drawable.banner_time, this.b, ", banner=", Separators.RPAREN, vqd.r(R.drawable.glyph_exclamation, "WrongTimeAlertModel(icon=", ", subTitle=", this.f13908a, ", title="));
    }
}
