package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c0l0 implements Iterator {
    public String b;
    public final CharSequence c;
    public final uub d;
    public final boolean e;
    public int g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3531a = 2;
    public int f = 0;

    public c0l0(qo8 qo8Var, CharSequence charSequence, Object obj, byte b) {
        this.h = b;
        this.i = obj;
        this.d = (uub) qo8Var.d;
        this.e = qo8Var.c;
        this.g = qo8Var.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int length;
        uub uubVar;
        x0x.K(this.f3531a != 4);
        int iE = hne.E(this.f3531a);
        if (iE == 0) {
            return true;
        }
        if (iE != 2) {
            this.f3531a = 4;
            int i = this.f;
            while (true) {
                int length2 = this.f;
                if (length2 != -1) {
                    byte b = this.h;
                    Object obj = this.i;
                    CharSequence charSequence = this.c;
                    switch (b) {
                        case 0:
                            vub vubVar = (vub) obj;
                            int length3 = charSequence.length();
                            x0x.H(length2, length3);
                            while (true) {
                                if (length2 >= length3) {
                                    length2 = -1;
                                } else if (!vubVar.a(charSequence.charAt(length2))) {
                                    length2++;
                                }
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            int length4 = str.length();
                            int length5 = charSequence.length() - length4;
                            while (true) {
                                if (length2 > length5) {
                                    length2 = -1;
                                    break;
                                } else {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length4) {
                                            break;
                                        } else if (charSequence.charAt(i2 + length2) != str.charAt(i2)) {
                                            length2++;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    if (length2 == -1) {
                        length2 = charSequence.length();
                        this.f = -1;
                        length = -1;
                    } else {
                        switch (b) {
                            case 0:
                                length = length2 + 1;
                                break;
                            default:
                                length = ((String) obj).length() + length2;
                                break;
                        }
                        this.f = length;
                    }
                    if (length == i) {
                        int i3 = length + 1;
                        this.f = i3;
                        if (i3 > charSequence.length()) {
                            this.f = -1;
                        }
                    } else {
                        while (true) {
                            uubVar = this.d;
                            if (i < length2 && uubVar.a(charSequence.charAt(i))) {
                                i++;
                            }
                        }
                        while (length2 > i && uubVar.a(charSequence.charAt(length2 - 1))) {
                            length2--;
                        }
                        if (this.e && i == length2) {
                            i = this.f;
                        } else {
                            int i4 = this.g;
                            if (i4 == 1) {
                                length2 = charSequence.length();
                                this.f = -1;
                                while (length2 > i && uubVar.a(charSequence.charAt(length2 - 1))) {
                                    length2--;
                                }
                            } else {
                                this.g = i4 - 1;
                            }
                            string = charSequence.subSequence(i, length2).toString();
                        }
                    }
                } else {
                    this.f3531a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.f3531a != 3) {
                this.f3531a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        this.f3531a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
