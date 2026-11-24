package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ewv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dwv f8546a = new dwv(null);
    public static final ewv b;

    static {
        ewv ewvVar = new ewv();
        if (!mbc.W("")) {
            mbc.W("");
        }
        b = ewvVar;
    }

    public final void a(String str, StringBuilder sb) {
        f140.v(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
