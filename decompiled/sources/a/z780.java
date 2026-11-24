package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z780 implements c880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43906a;
    public final String b;
    public final hnm c;
    public final boolean d;
    public final s6q0 e;
    public final x6q0 f;
    public final mtl g;

    public z780(boolean z, String str, hnm hnmVar, boolean z2, s6q0 s6q0Var, x6q0 x6q0Var, mtl mtlVar) {
        str.getClass();
        this.f43906a = z;
        this.b = str;
        this.c = hnmVar;
        this.d = z2;
        this.e = s6q0Var;
        this.f = x6q0Var;
        this.g = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z780)) {
            return false;
        }
        z780 z780Var = (z780) obj;
        return this.f43906a == z780Var.f43906a && Intrinsics.d(this.b, z780Var.b) && this.c.equals(z780Var.c) && this.d == z780Var.d && this.e.equals(z780Var.e) && this.f.equals(z780Var.f) && this.g.equals(z780Var.g);
    }

    public final int hashCode() {
        return this.g.f22376a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + brm0.e((this.c.hashCode() + ua80.b(Boolean.hashCode(this.f43906a) * 31, 31, this.b)) * 31, 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("Content(isLoading=", ", topNotifyText=", this.b, this.f43906a, ", phoneTextFieldModel=");
        sbQ.append(this.c);
        sbQ.append(", isLanguageOperatorVisible=");
        sbQ.append(this.d);
        sbQ.append(", languageOperatorModel=");
        sbQ.append(this.e);
        sbQ.append(", messageModel=");
        sbQ.append(this.f);
        sbQ.append(", bottomMenuModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
