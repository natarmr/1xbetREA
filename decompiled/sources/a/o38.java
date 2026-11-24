package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o38 implements u38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f24570a;
    public final String b;

    public o38(d7a d7aVar, String str) {
        d7aVar.getClass();
        str.getClass();
        this.f24570a = d7aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o38)) {
            return false;
        }
        o38 o38Var = (o38) obj;
        return Intrinsics.d(this.f24570a, o38Var.f24570a) && Intrinsics.d(this.b, o38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24570a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCaptcha(captchaResult=" + this.f24570a + ", title=" + this.b + Separators.RPAREN;
    }
}
