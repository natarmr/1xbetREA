package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends c2 {
    public final void Q(int i, StringBuilder sb) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        R(sb, i, length);
    }

    public final void R(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int iM = oif0.m((i3 * 10) + i, 10, (p68) ((oif0) this.b).b);
            if (iM / 100 == 0) {
                sb.append('0');
            }
            if (iM / 10 == 0) {
                sb.append('0');
            }
            sb.append(iM);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 13; i5++) {
            int iCharAt = sb.charAt(i5 + i2) - '0';
            if ((i5 & 1) == 0) {
                iCharAt *= 3;
            }
            i4 += iCharAt;
        }
        int i6 = 10 - (i4 % 10);
        sb.append(i6 != 10 ? i6 : 0);
    }
}
