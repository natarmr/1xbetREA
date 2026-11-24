package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gf3 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11187a;
    public final String b;

    public gf3(int i, String str) {
        this.f11187a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f11187a);
        sb.append(",url=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
