package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class bwv {
    public static final awv d = new awv(null);
    public static final bwv e = new bwv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3346a = true;
    public final boolean b = true;
    public final boolean c;

    public bwv() {
        boolean z = true;
        if (!mbc.W("  ") && !mbc.W("") && !mbc.W("") && !mbc.W("")) {
            z = false;
        }
        this.c = z;
    }

    public final void a(String str, StringBuilder sb) {
        twn.w(Integer.MAX_VALUE, str, "bytesPerLine = ", Separators.COMMA, sb);
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(Separators.COMMA);
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        f140.v(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append(Separators.DOUBLE_QUOTE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
