package a;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zkn0 extends bln0 {
    public int[] e;
    public long[] f;
    public double[] g;
    public String[] h;
    public byte[][] i;
    public Cursor j;

    public static void e(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            m2x.J(25, "column index out of range");
            throw null;
        }
    }

    @Override // a.xpg0
    public final String J0(int i) {
        a();
        Cursor cursorK = k();
        e(cursorK, i);
        String string = cursorK.getString(i);
        string.getClass();
        return string;
    }

    @Override // a.xpg0
    public final boolean W0() {
        a();
        d();
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        jf4.n("Required value was null.");
        return false;
    }

    public final void c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.e;
        if (iArr.length < i3) {
            this.e = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f;
            if (jArr.length < i3) {
                this.f = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.g;
            if (dArr.length < i3) {
                this.g = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.h;
            if (strArr.length < i3) {
                this.h = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.i;
        if (bArr.length < i3) {
            this.i = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.d) {
            t();
            reset();
        }
        this.d = true;
    }

    public final void d() {
        if (this.j == null) {
            this.j = this.b.q(new ugf0(this));
        }
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        a();
        Cursor cursorK = k();
        e(cursorK, i);
        byte[] blob = cursorK.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        a();
        d();
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        a();
        d();
        Cursor cursor = this.j;
        if (cursor == null) {
            jf4.n("Required value was null.");
            return null;
        }
        e(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        a();
        Cursor cursorK = k();
        e(cursorK, i);
        return cursorK.getDouble(i);
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        a();
        Cursor cursorK = k();
        e(cursorK, i);
        return cursorK.getLong(i);
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        a();
        c(4, i);
        this.e[i] = 4;
        this.i[i] = bArr;
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        a();
        Cursor cursorK = k();
        e(cursorK, i);
        return cursorK.isNull(i);
    }

    public final Cursor k() {
        Cursor cursor = this.j;
        if (cursor != null) {
            return cursor;
        }
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        a();
        c(1, i);
        this.e[i] = 1;
        this.f[i] = j;
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        a();
        c(2, i);
        this.e[i] = 2;
        this.g[i] = d;
    }

    @Override // a.bln0, a.xpg0
    public final void reset() {
        a();
        Cursor cursor = this.j;
        if (cursor != null) {
            cursor.close();
        }
        this.j = null;
    }

    @Override // a.xpg0
    public final void s(int i) {
        a();
        c(5, i);
        this.e[i] = 5;
    }

    @Override // a.bln0, a.xpg0
    public final void t() {
        a();
        this.e = new int[0];
        this.f = new long[0];
        this.g = new double[0];
        this.h = new String[0];
        this.i = new byte[0][];
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        str.getClass();
        a();
        c(3, i);
        this.e[i] = 3;
        this.h[i] = str;
    }
}
