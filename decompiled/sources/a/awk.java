package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class awk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvk f1578a;

    static {
        new awk("", 0, 0);
    }

    public awk(String str, int i, int i2) {
        this.f1578a = new zvk(str, i, i2);
    }

    public static awk a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbT = dw9.t("M0,", i8, " A", Separators.COMMA, i7);
            axq.r(i8, i, " 0 1,1 ", Separators.COMMA, sbT);
            axq.r(i8, i7, " A", Separators.COMMA, sbT);
            string = w6x.o(i8, i8, " 0 1,1 0,", " Z", sbT);
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                rw2.s(iMin3, iMin3, " A ", Separators.COMMA, sb);
                rw2.s(i, iMin3, " 0 0,1 ", Separators.COMMA, sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(Separators.COMMA);
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                rw2.s(iMin4, iMin4, " A ", Separators.COMMA, sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(Separators.COMMA);
                sb.append(i2);
            }
            rw2.s(iMin5, i2, " L ", Separators.COMMA, sb);
            if (iMin5 > 0) {
                rw2.s(iMin5, iMin5, " A ", Separators.COMMA, sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                rw2.s(iMin2, iMin2, " L 0,", " A ", sb);
                rw2.s(iMin2, iMin2, Separators.COMMA, " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new awk(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof awk) {
            return this.f1578a.equals(((awk) obj).f1578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1578a.hashCode();
    }

    public final String toString() {
        return this.f1578a.toString();
    }
}
