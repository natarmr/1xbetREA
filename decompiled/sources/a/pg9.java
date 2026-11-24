package a;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pg9 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nh00 f26941a = new nh00(new byte[0]);

    public static pg9 b(Iterator it, int i) {
        if (i == 1) {
            return (pg9) it.next();
        }
        int i2 = i >>> 1;
        return b(it, i2).c(b(it, i - i2));
    }

    public static ng9 j() {
        return new ng9();
    }

    public final pg9 c(pg9 pg9Var) {
        int size = size();
        int size2 = pg9Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = seg0.h;
        seg0 seg0Var = this instanceof seg0 ? (seg0) this : null;
        if (pg9Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return pg9Var;
        }
        int size3 = pg9Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = pg9Var.size();
            byte[] bArr = new byte[size4 + size5];
            e(0, bArr, 0, size4);
            pg9Var.e(0, bArr, size4, size5);
            return new nh00(bArr);
        }
        if (seg0Var != null) {
            pg9 pg9Var2 = seg0Var.d;
            if (pg9Var.size() + pg9Var2.size() < 128) {
                int size6 = pg9Var2.size();
                int size7 = pg9Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                pg9Var2.e(0, bArr2, 0, size6);
                pg9Var.e(0, bArr2, size6, size7);
                return new seg0(seg0Var.c, new nh00(bArr2));
            }
        }
        if (seg0Var != null) {
            pg9 pg9Var3 = seg0Var.d;
            pg9 pg9Var4 = seg0Var.c;
            if (pg9Var4.g() > pg9Var3.g() && seg0Var.f > pg9Var.g()) {
                return new seg0(pg9Var4, new seg0(pg9Var3, pg9Var));
            }
        }
        if (size3 >= seg0.h[Math.max(g(), pg9Var.g()) + 1]) {
            return new seg0(this, pg9Var);
        }
        lef0 lef0Var = new lef0((byte) 4);
        lef0Var.e(this);
        lef0Var.e(pg9Var);
        Stack stack = (Stack) lef0Var.f19899a;
        pg9 seg0Var2 = (pg9) stack.pop();
        while (!stack.isEmpty()) {
            seg0Var2 = new seg0((pg9) stack.pop(), seg0Var2);
        }
        return seg0Var2;
    }

    public final void e(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            c99.j(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            c99.j(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            c99.j(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            c99.j(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            c99.j(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            f(i, bArr, i2, i3);
        }
    }

    public abstract void f(int i, byte[] bArr, int i2, int i3);

    public int g() {
        return 0;
    }

    public boolean h() {
        return true;
    }

    public abstract boolean i();

    public abstract int k(int i, int i2, int i3);

    public abstract int l(int i, int i2, int i3);

    public abstract int m();

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return emx.f8067a;
        }
        byte[] bArr = new byte[size];
        f(0, bArr, 0, size);
        return bArr;
    }

    public String p() {
        return new String(o(), "UTF-8");
    }

    public final String q() {
        try {
            return p();
        } catch (UnsupportedEncodingException e) {
            e9d0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
