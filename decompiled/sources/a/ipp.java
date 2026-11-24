package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ipp extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hpp f15175a;
    public String b;
    public final StringBuilder c;

    public ipp(char c, int i, int i2) {
        hpp hppVar = new hpp();
        this.f15175a = hppVar;
        this.c = new StringBuilder();
        hppVar.g = c;
        hppVar.h = i;
        hppVar.i = i2;
    }

    @Override // a.a1
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // a.a1
    public final void c() {
        String strA = k2o.a(this.b.trim());
        hpp hppVar = this.f15175a;
        hppVar.j = strA;
        hppVar.k = this.c.toString();
    }

    @Override // a.a1
    public final p78 d() {
        return this.f15175a;
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        int i = yxkVar.e;
        int i2 = yxkVar.b;
        CharSequence charSequence = yxkVar.f43426a;
        int i3 = yxkVar.g;
        hpp hppVar = this.f15175a;
        if (i3 < 4) {
            char c = hppVar.g;
            int i4 = hppVar.h;
            int iZ = x8x.z(c, i, charSequence.length(), charSequence) - i;
            if (iZ >= i4 && x8x.A(charSequence, i + iZ, charSequence.length()) == charSequence.length()) {
                return new iyc(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = hppVar.i; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return iyc.a(i2);
    }
}
