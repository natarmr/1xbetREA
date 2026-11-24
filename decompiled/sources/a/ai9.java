package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ai9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ci9 f912a;
    public xqg0 b;
    public int c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(String.valueOf(this.f912a));
        sb.append(" {...} (src=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
