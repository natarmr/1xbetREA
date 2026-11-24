package a;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class nex0 implements Iterator {
    public String b;
    public final CharSequence c;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23409a = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public nex0(ikt0 ikt0Var, CharSequence charSequence, Object obj, byte b) {
        this.f = b;
        this.g = obj;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iEnd;
        byte b = this.f23409a;
        if (b == 4) {
            v4i0.e();
            return false;
        }
        int i = b - 1;
        if (i == 0) {
            return true;
        }
        if (i != 2) {
            this.f23409a = (byte) 4;
            int i2 = this.d;
            while (true) {
                int iStart = this.d;
                if (iStart != -1) {
                    byte b2 = this.f;
                    CharSequence charSequence = this.c;
                    Object obj = this.g;
                    switch (b2) {
                        case 0:
                            Matcher matcher = (Matcher) ((nmt0) obj).f23789a;
                            iStart = !matcher.find(iStart) ? -1 : matcher.start();
                            break;
                        default:
                            gvw0 gvw0Var = (gvw0) obj;
                            int length = charSequence.length();
                            if (iStart >= 0 && iStart <= length) {
                                while (true) {
                                    if (iStart < length) {
                                        if (!(charSequence.charAt(iStart) == gvw0Var.f11995a)) {
                                            iStart++;
                                        }
                                    }
                                }
                            } else {
                                v4i0.m(dem0.z(iStart, length, "index"));
                                iStart = 0;
                            }
                            break;
                    }
                    if (iStart == -1) {
                        iStart = charSequence.length();
                        this.d = -1;
                        iEnd = -1;
                    } else {
                        switch (b2) {
                            case 0:
                                iEnd = ((Matcher) ((nmt0) obj).f23789a).end();
                                break;
                            default:
                                iEnd = iStart + 1;
                                break;
                        }
                        this.d = iEnd;
                    }
                    if (iEnd == i2) {
                        int i3 = iEnd + 1;
                        this.d = i3;
                        if (i3 > charSequence.length()) {
                            this.d = -1;
                        }
                    } else {
                        if (i2 < iStart) {
                            charSequence.charAt(i2);
                        }
                        if (iStart > i2) {
                            charSequence.charAt(iStart - 1);
                        }
                        int i4 = this.e;
                        if (i4 == 1) {
                            iStart = charSequence.length();
                            this.d = -1;
                            if (iStart > i2) {
                                charSequence.charAt(iStart - 1);
                            }
                        } else {
                            this.e = i4 - 1;
                        }
                        string = charSequence.subSequence(i2, iStart).toString();
                    }
                } else {
                    this.f23409a = (byte) 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.f23409a != 3) {
                this.f23409a = (byte) 1;
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
        this.f23409a = (byte) 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
