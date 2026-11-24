package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {
    public final String c;
    public final String d;

    public g(p68 p68Var, String str, String str2) {
        super(p68Var);
        this.c = str2;
        this.d = str;
    }

    @Override // a.c2
    public final String C() throws o660 {
        if (((p68) this.f3600a).b != 84) {
            throw o660.a();
        }
        StringBuilder sb = new StringBuilder();
        Q(8, sb);
        U(sb, 48, 20);
        int iM = oif0.m(68, 16, (p68) ((oif0) this.b).b);
        if (iM != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i = iM % 32;
            int i2 = iM / 32;
            int i3 = (i2 % 12) + 1;
            int i4 = i2 / 12;
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
            if (i / 10 == 0) {
                sb.append('0');
            }
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // a.i
    public final void S(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }
}
