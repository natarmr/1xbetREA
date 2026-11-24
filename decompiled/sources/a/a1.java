package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a1 {
    public boolean b(p78 p78Var) {
        return this instanceof g98;
    }

    public abstract p78 d();

    public boolean e() {
        return this instanceof g98;
    }

    public iyc g(yxk yxkVar) {
        char cCharAt;
        int i = yxkVar.e;
        CharSequence charSequence = yxkVar.f43426a;
        if (yxkVar.g >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = yxkVar.c + yxkVar.g;
        int i3 = i2 + 1;
        CharSequence charSequence2 = yxkVar.f43426a;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new iyc(-1, i3, false);
    }

    public void c() {
    }

    public void a(CharSequence charSequence) {
    }

    public void f(kdx kdxVar) {
    }
}
