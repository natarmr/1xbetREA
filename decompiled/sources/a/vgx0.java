package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class vgx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37405a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public vgx0(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            jf4.o("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                jf4.o("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f37405a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Iterator it, whx0 whx0Var) {
        while (it.hasNext()) {
            b(it.next(), whx0Var);
        }
    }

    public void b(Object obj, whx0 whx0Var) {
        whx0Var.a(obj, this.f37405a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f37405a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        f140.v(sb, name, Separators.SLASH, str, "[");
        return axq.n(sb, name2, "]");
    }
}
