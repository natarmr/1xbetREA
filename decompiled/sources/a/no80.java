package a;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class no80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f23858a;
    public final int b;
    public final String c;
    public final boolean d;

    public no80(Method method, int i, String str, boolean z) {
        this.f23858a = method;
        this.b = i;
        Objects.requireNonNull(str, "name == null");
        this.c = str;
        this.d = z;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) throws EOFException {
        String strO;
        String str = this.c;
        if (obj == null) {
            throw ay3.Z(this.f23858a, this.b, kng0.l("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String string = obj.toString();
        if (emf0Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strO = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.d;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                f99 f99Var = new f99();
                f99Var.b0(0, iCharCount, string);
                f99 f99Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (f99Var2 == null) {
                                f99Var2 = new f99();
                            }
                            f99Var2.e0(iCodePointAt2);
                            long j = f99Var2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bN = f99Var2.n(j2);
                                f99Var.V(37);
                                char[] cArr = emf0.l;
                                f99Var.V(cArr[((bN & 255) >> 4) & 15]);
                                f99Var.V(cArr[bN & 15]);
                                j2++;
                                f99Var2 = f99Var2;
                            }
                            f99Var2.a();
                        } else {
                            f99Var.e0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strO = f99Var.O();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = emf0Var.c.replace("{" + str + "}", strO);
        if (emf0.m.matcher(strReplace).matches()) {
            jf4.o("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            emf0Var.c = strReplace;
        }
    }
}
