package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5035a;
    public final n0x b;
    public final Integer c;
    public final String d;

    public cvl(int i, n0x n0xVar, Integer num, String str) {
        str.getClass();
        this.f5035a = i;
        this.b = n0xVar;
        this.c = num;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvl)) {
            return false;
        }
        cvl cvlVar = (cvl) obj;
        return this.f5035a == cvlVar.f5035a && this.b.equals(cvlVar.b) && this.c.equals(cvlVar.c) && Intrinsics.d(this.d, cvlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f140.f(this.b, Integer.hashCode(this.f5035a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DsCategoryCardUiModel(bannerId=" + this.f5035a + ", image=" + this.b + ", placeholderResId=" + this.c + ", label=" + this.d + Separators.RPAREN;
    }
}
