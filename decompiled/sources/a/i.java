package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends h {
    public abstract void S(int i, StringBuilder sb);

    public int T(int i) {
        return i % 100000;
    }

    public final void U(StringBuilder sb, int i, int i2) {
        int iM = oif0.m(i, i2, (p68) ((oif0) this.b).b);
        S(iM, sb);
        int iT = T(iM);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iT / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iT);
    }
}
