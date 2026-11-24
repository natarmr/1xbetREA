package a;

import android.content.Intent;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class hne implements uu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13348a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public static final int[] b = {2, 1, 4, 3};

    public static void A(StringBuilder sb, String str, String str2, double d) {
        sb.append(str);
        sb.append(str2);
        sb.append(d);
    }

    public static void B(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void C(List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
    }

    public static int D(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static /* synthetic */ int E(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int F(nw30 nw30Var) {
        if (nw30Var instanceof pv30) {
            return 0;
        }
        if (nw30Var instanceof ew30) {
            return 1;
        }
        if (nw30Var instanceof mw30) {
            return 2;
        }
        if (nw30Var instanceof fw30) {
            return 3;
        }
        if (nw30Var instanceof iw30) {
            return 4;
        }
        if (nw30Var instanceof qv30) {
            return 5;
        }
        if (nw30Var instanceof jw30) {
            return 6;
        }
        if (nw30Var instanceof dw30) {
            return 7;
        }
        if (nw30Var instanceof uv30) {
            return 8;
        }
        if (nw30Var instanceof ov30) {
            return 9;
        }
        if (nw30Var instanceof rv30) {
            return 10;
        }
        if (nw30Var instanceof sv30) {
            return 11;
        }
        if (nw30Var instanceof nv30) {
            return 12;
        }
        if (nw30Var instanceof tv30) {
            return 13;
        }
        if (nw30Var instanceof lw30) {
            return 14;
        }
        if (nw30Var instanceof vv30) {
            return 15;
        }
        if (nw30Var instanceof wv30) {
            return 16;
        }
        if (nw30Var instanceof xv30) {
            return 17;
        }
        if (nw30Var instanceof yv30) {
            return 18;
        }
        if (nw30Var instanceof zv30) {
            return 19;
        }
        if (nw30Var instanceof aw30) {
            return 20;
        }
        if (nw30Var instanceof bw30) {
            return 21;
        }
        if (nw30Var instanceof cw30) {
            return 22;
        }
        return nw30Var instanceof gw30 ? 23 : -2;
    }

    public static /* synthetic */ int G(String str) {
        if (str == null) {
            hny.u("Name is null");
            return 0;
        }
        if (str.equals(TokenNames.L)) {
            return 1;
        }
        if (str.equals(TokenNames.M)) {
            return 2;
        }
        if (str.equals("Q")) {
            return 3;
        }
        if (str.equals("H")) {
            return 4;
        }
        jf4.o("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(str));
        return 0;
    }

    public static /* synthetic */ int[] H(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f13348a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean b(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ byte c(int i) {
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 0;
        }
        if (i == 3) {
            return (byte) 3;
        }
        if (i == 4) {
            return (byte) 2;
        }
        throw null;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int e(hjm hjmVar, int i, int i2) {
        return (hjmVar.hashCode() + i) * i2;
    }

    public static int g(c280 c280Var, int i, int i2) {
        return (c280Var.hashCode() + i) * i2;
    }

    public static int h(dxh0 dxh0Var, int i, int i2) {
        return (dxh0Var.hashCode() + i) * i2;
    }

    public static mm40 i(float f, boolean z, String str) {
        return o2e.e0(new x7z(f, z), str);
    }

    public static Intent j(String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        return intent;
    }

    public static Object k(int i, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i);
    }

    public static String l(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(icy icyVar) {
        return ncy.j(icyVar.g()).b();
    }

    public static String n(String str, String str2, String str3, boolean z, boolean z2) {
        return str + z + str2 + z2 + str3;
    }

    public static String o(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String p(StringBuilder sb, y3d y3dVar, String str) {
        sb.append(y3dVar);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder q(String str, Integer num, String str2, Integer num2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(num2);
        sb.append(str3);
        return sb;
    }

    public static List r(long j, String str) {
        return kotlin.collections.a.c(new g3z(j, str));
    }

    public static void s(int i, int i2, int i3, int i4, int i5) {
        vtt0.H(i);
        vtt0.H(i2);
        vtt0.H(i3);
        vtt0.H(i4);
        vtt0.H(i5);
    }

    public static void t(long j, String str, StringBuilder sb, boolean z) {
        sb.append(j);
        sb.append(str);
        sb.append(z);
    }

    public static void u(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(str3);
    }

    public static void v(String str, String str2, StringBuilder sb, List list, List list2) {
        sb.append(str);
        sb.append(list);
        sb.append(str2);
        sb.append(list2);
    }

    public static void w(StringBuilder sb, double d, String str, String str2) {
        sb.append(d);
        sb.append(str);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, long j, String str, List list) {
        sb.append(j);
        sb.append(str);
        sb.append(list);
    }

    public static void y(StringBuilder sb, a4x a4xVar, String str, a4x a4xVar2, String str2) {
        sb.append(a4xVar);
        sb.append(str);
        sb.append(a4xVar2);
        sb.append(str2);
    }

    public static void z(StringBuilder sb, Integer num, String str, Double d, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }
}
