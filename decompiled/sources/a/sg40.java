package a;

/* JADX INFO: loaded from: classes.dex */
public final class sg40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hm40 f32143a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ ouu e;

    public sg40(ouu ouuVar, hm40 hm40Var, int i, int i2, int i3) {
        this.e = ouuVar;
        this.f32143a = hm40Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        hm40 hm40Var = this.f32143a;
        hm40 hm40Var2 = hm40.BYTE;
        int i = this.d;
        if (hm40Var != hm40Var2) {
            return i;
        }
        qo8 qo8Var = (qo8) this.e.d;
        rgn rgnVar = (rgn) qo8Var.e;
        String str = (String) qo8Var.d;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(rgnVar.f30446a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        hm40 hm40Var = this.f32143a;
        sb.append(hm40Var);
        sb.append('(');
        qo8 qo8Var = (qo8) this.e.d;
        if (hm40Var == hm40.ECI) {
            rgn rgnVar = (rgn) qo8Var.e;
            sb.append(rgnVar.f30446a[this.c].charset().displayName());
        } else {
            String str = (String) qo8Var.d;
            int i = this.d;
            int i2 = this.b;
            String strSubstring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) < ' ' || strSubstring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
