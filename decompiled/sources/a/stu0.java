package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class stu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f32791a;
    public final String b;
    public final fyl c;
    public final a4x d;

    public stu0(hjm hjmVar, String str, fyl fylVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f32791a = hjmVar;
        this.b = str;
        this.c = fylVar;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stu0)) {
            return false;
        }
        stu0 stu0Var = (stu0) obj;
        return this.f32791a.equals(stu0Var.f32791a) && Intrinsics.d(this.b, stu0Var.b) && this.c.equals(stu0Var.c) && Intrinsics.d(this.d, stu0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f32791a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "VirtualSportRulesScreenUiModel(gameTitle=" + this.f32791a + ", subtitle=" + this.b + ", chips=" + this.c + ", sections=" + this.d + Separators.RPAREN;
    }
}
