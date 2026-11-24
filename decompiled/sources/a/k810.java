package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k810 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17851a;
    public final int b;
    public final int c;
    public final CharSequence d;
    public final /* synthetic */ gxu e;

    public k810(gxu gxuVar, int i, int i2, int i3) {
        this.e = gxuVar;
        this.f17851a = i;
        this.b = i2;
        this.c = i3;
        CharSequence charSequence = (CharSequence) ((ArrayList) gxuVar.b).get(i);
        this.d = charSequence;
        if (i2 < -1 || i2 >= charSequence.length()) {
            throw new byw("");
        }
    }

    public final Integer a() {
        int i = this.b;
        int iMax = Math.max(i, 0);
        while (true) {
            CharSequence charSequence = this.d;
            if (iMax >= charSequence.length()) {
                return null;
            }
            char cCharAt = charSequence.charAt(iMax);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return Integer.valueOf(iMax - i);
            }
            iMax++;
        }
    }

    public final Integer b() {
        if (this.f17851a + 1 < ((ArrayList) this.e.b).size()) {
            return Integer.valueOf((this.d.length() - this.b) + this.c);
        }
        return null;
    }

    public final int c() {
        return (this.d.length() - this.b) + this.c;
    }

    public final k810 d() {
        Integer numB = b();
        if (numB != null) {
            return e(numB.intValue() - this.c);
        }
        return null;
    }

    public final k810 e(int i) {
        k810 k810Var = this;
        while (i != 0) {
            int i2 = k810Var.b;
            int i3 = i2 + i;
            CharSequence charSequence = k810Var.d;
            int length = charSequence.length();
            gxu gxuVar = this.e;
            int i4 = k810Var.c;
            int i5 = k810Var.f17851a;
            if (i3 < length) {
                return new k810(gxuVar, i5, i3, i4 + i);
            }
            if (k810Var.b() == null) {
                return null;
            }
            int length2 = charSequence.length() - i2;
            i -= length2;
            k810Var = new k810(gxuVar, i5 + 1, -1, i4 + length2);
        }
        return k810Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && obj.getClass() == k810.class && this.c == ((k810) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("Position: '");
        int i = this.b;
        CharSequence charSequence = this.d;
        if (i == -1) {
            string = "\\n" + ((Object) charSequence);
        } else {
            string = charSequence.subSequence(i, charSequence.length()).toString();
        }
        return axq.m(sb, string, '\'');
    }
}
