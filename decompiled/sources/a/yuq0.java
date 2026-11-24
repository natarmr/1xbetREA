package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yuq0 extends bvq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43281a;
    public final String b;
    public final uwx c;

    public yuq0(String str, boolean z) {
        uwx uwxVar = uwx.b;
        str.getClass();
        this.f43281a = z;
        this.b = str;
        this.c = uwxVar;
    }

    @Override // a.bvq0
    public final uwx c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuq0)) {
            return false;
        }
        yuq0 yuq0Var = (yuq0) obj;
        return this.f43281a == yuq0Var.f43281a && Intrinsics.d(this.b, yuq0Var.b) && this.c == yuq0Var.c;
    }

    @Override // a.bvq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f43281a) * 31, 31, this.b);
    }

    @Override // a.bvq0
    public final boolean i() {
        return this.f43281a;
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ShowPushInfoUiModel(enable=", ", title=", this.b, this.f43281a, ", itemPosition=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
