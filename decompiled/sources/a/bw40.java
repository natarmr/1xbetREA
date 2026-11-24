package a;

import android.gov.nist.core.Separators;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5z f3309a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public bw40(w5z w5zVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iH;
        int i5;
        this.f3309a = w5zVar;
        this.b = i;
        if (p4e.k(j) != 0 || p4e.j(j) != 0) {
            ycx.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) w5zVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            zn80 zn80Var = (zn80) arrayList2.get(i6);
            v03 v03Var = zn80Var.f44663a;
            int i8 = p4e.i(j);
            if (p4e.d(j)) {
                i4 = i6;
                iH = p4e.h(j) - ((int) Math.ceil(f));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i4 = i6;
                iH = p4e.h(j);
            }
            i3 = 0;
            s03 s03Var = new s03(v03Var, this.b - i7, i2, r4e.b(0, i8, 0, iH, 5));
            float f2 = s03Var.f + f;
            y8q0 y8q0Var = s03Var.d;
            int i9 = i7 + y8q0Var.g;
            arrayList.add(new yn80(s03Var, zn80Var.b, zn80Var.c, i7, i9, f, f2));
            if (!y8q0Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != q3d.i((ArrayList) this.f3309a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = f2;
            }
            z = true;
            i7 = i9;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = p4e.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            yn80 yn80Var = (yn80) arrayList.get(i10);
            List list = yn80Var.f42927a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                jge0 jge0Var = (jge0) list.get(i11);
                arrayList4.add(jge0Var != null ? yn80Var.a(jge0Var) : null);
            }
            w3d.u(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f3309a.b).size()) {
            int size4 = ((List) this.f3309a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.q0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public final void a(long j, float[] fArr) {
        j(o9q0.f(j));
        k(o9q0.e(j));
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = 0;
        b8k0.E(this.h, j, new as0(j, fArr, kie0Var, new jie0()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        return s03Var.d.d(i - yn80Var.d) + yn80Var.f;
    }

    public final int c(int i, boolean z) {
        int iE;
        l(i);
        ArrayList arrayList = this.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        int i2 = i - yn80Var.d;
        y8q0 y8q0Var = s03Var.d;
        if (z) {
            Layout layout = y8q0Var.f;
            ThreadLocal threadLocal = c9q0.f3974a;
            if (layout.getEllipsisCount(i2) <= 0 || y8q0Var.b != TextUtils.TruncateAt.END) {
                w5z w5zVarC = y8q0Var.c();
                Layout layout2 = (Layout) w5zVarC.f38604a;
                iE = w5zVarC.X(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iE = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iE = y8q0Var.e(i2);
        }
        return iE + yn80Var.b;
    }

    public final int d(int i) {
        int iB;
        int length = ((j83) this.f3309a.f38604a).b.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iB = arrayList.size() - 1;
        } else {
            iB = i < 0 ? 0 : b8k0.B(i, arrayList);
        }
        yn80 yn80Var = (yn80) arrayList.get(iB);
        return yn80Var.f42927a.d.f(yn80Var.d(i)) + yn80Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.D(f, arrayList));
        int i = yn80Var.c - yn80Var.b;
        int i2 = yn80Var.d;
        if (i == 0) {
            return i2;
        }
        s03 s03Var = yn80Var.f42927a;
        float f2 = f - yn80Var.f;
        y8q0 y8q0Var = s03Var.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = y8q0Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = y8q0Var.f.getLineForVertical(i3 - y8q0Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.C(i, arrayList));
        s03 s03Var = yn80Var.f42927a;
        return s03Var.d.h(i - yn80Var.d) + yn80Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        yn80 yn80Var = (yn80) arrayList.get(b8k0.D(fIntBitsToFloat, arrayList));
        int i2 = yn80Var.c;
        int i3 = yn80Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        s03 s03Var = yn80Var.f42927a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - yn80Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        y8q0 y8q0Var = s03Var.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = y8q0Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - y8q0Var.h);
        if (lineForVertical >= y8q0Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (y8q0Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(jge0 jge0Var, int i, v4i0 v4i0Var) {
        long jB;
        long j;
        float f = jge0Var.b;
        ArrayList arrayList = this.h;
        int iD = b8k0.D(f, arrayList);
        float f2 = ((yn80) arrayList.get(iD)).g;
        float f3 = jge0Var.d;
        if (f2 >= f3 || iD == arrayList.size() - 1) {
            yn80 yn80Var = (yn80) arrayList.get(iD);
            return yn80Var.b(true, yn80Var.f42927a.b(yn80Var.c(jge0Var), i, v4i0Var));
        }
        int iD2 = b8k0.D(f3, arrayList);
        long jB2 = o9q0.b;
        while (true) {
            jB = o9q0.b;
            if (!o9q0.b(jB2, jB) || iD > iD2) {
                break;
            }
            yn80 yn80Var2 = (yn80) arrayList.get(iD);
            jB2 = yn80Var2.b(true, yn80Var2.f42927a.b(yn80Var2.c(jge0Var), i, v4i0Var));
            iD++;
        }
        if (o9q0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = o9q0.b;
            if (!o9q0.b(jB, j) || iD > iD2) {
                break;
            }
            yn80 yn80Var3 = (yn80) arrayList.get(iD2);
            jB = yn80Var3.b(true, yn80Var3.f42927a.b(yn80Var3.c(jge0Var), i, v4i0Var));
            iD2--;
        }
        return o9q0.b(jB, j) ? jB2 : s7n0.e((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(x5a x5aVar, long j, ljj0 ljj0Var, k5q0 k5q0Var, agc agcVar) {
        x5aVar.l();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yn80 yn80Var = (yn80) arrayList.get(i);
            yn80Var.f42927a.e(x5aVar, j, ljj0Var, k5q0Var, agcVar);
            x5aVar.g(0.0f, yn80Var.f42927a.f);
        }
        x5aVar.i();
    }

    public final void j(int i) {
        j83 j83Var = (j83) this.f3309a.f38604a;
        if (i < 0 || i >= j83Var.b.length()) {
            ycx.a("offset(" + i + ") is out of bounds [0, " + j83Var.b.length() + Separators.RPAREN);
        }
    }

    public final void k(int i) {
        j83 j83Var = (j83) this.f3309a.f38604a;
        if (i < 0 || i > j83Var.b.length()) {
            ycx.a("offset(" + i + ") is out of bounds [0, " + j83Var.b.length() + "]");
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        ycx.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + Separators.RPAREN);
    }
}
