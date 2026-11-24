package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yyd implements dzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7a f43461a;
    public final String b;

    public yyd(d7a d7aVar, String str) {
        d7aVar.getClass();
        this.f43461a = d7aVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyd)) {
            return false;
        }
        yyd yydVar = (yyd) obj;
        return Intrinsics.d(this.f43461a, yydVar.f43461a) && this.b.equals(yydVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43461a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCaptcha(captchaResult=" + this.f43461a + ", title=" + this.b + Separators.RPAREN;
    }
}
