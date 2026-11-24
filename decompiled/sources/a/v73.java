package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class v73 {
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(oms0 oms0Var, j8m0 j8m0Var, int i, fet fetVar, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        fet fetVar2 = fetVar;
        fetVar2.g0(1894587123);
        int i8 = i2 | (fetVar2.g(oms0Var) ? 4 : 2) | (fetVar2.i(j8m0Var) ? 32 : 16) | (fetVar2.e(i7) ? 256 : 128) | (fetVar2.g(this) ? 2048 : 1024);
        if (fetVar2.U(i8 & 1, (i8 & 1171) != 1170)) {
            boolean z = (i8 & 896) == 256;
            Object objP = fetVar2.P();
            if (z) {
                long[] jArr = u1h0.f34903a;
                hz40 hz40Var = new hz40();
                b(hz40Var, i7, 0);
                fetVar2.o0(hz40Var);
                obj = hz40Var;
            } else {
                obj = objP;
                if (objP == ukd.f35823a) {
                    long[] jArr2 = u1h0.f34903a;
                    hz40 hz40Var2 = new hz40();
                    b(hz40Var2, i7, 0);
                    fetVar2.o0(hz40Var2);
                    obj = hz40Var2;
                }
            }
            hz40 hz40Var3 = (hz40) obj;
            Object[] objArr = hz40Var3.b;
            Object[] objArr2 = hz40Var3.c;
            long[] jArr3 = hz40Var3.f13891a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                fet fetVar3 = fetVar2;
                while (true) {
                    long j = jArr3[i9];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        long j2 = j;
                        int i12 = 0;
                        fet fetVar4 = fetVar3;
                        while (i12 < i11) {
                            if ((j2 & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                Object obj2 = objArr[i13];
                                o0d0 o0d0Var = (o0d0) objArr2[i13];
                                String str = (String) obj2;
                                i5 = i10;
                                ArrayList arrayList = o0d0Var.f24419a;
                                if (arrayList.size() > 1) {
                                    v3d.t(new s7f((byte) 14), arrayList);
                                }
                                i4 = i12;
                                i6 = i9;
                                l7m0 l7m0VarA = o0d0Var.a(oms0Var, str, i7, fetVar4, i8 & 910);
                                switch (str.hashCode()) {
                                    case -1721943862:
                                        if (!str.equals("translateX")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.f = l7m0VarA;
                                        }
                                        break;
                                    case -1721943861:
                                        if (!str.equals("translateY")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.g = l7m0VarA;
                                        }
                                        break;
                                    case -1143814757:
                                        if (!str.equals("fillAlpha")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.m = l7m0VarA;
                                        }
                                        break;
                                    case -1141881952:
                                        if (!str.equals("fillColor")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.i = l7m0VarA;
                                        }
                                        break;
                                    case -1121758502:
                                        if (!str.equals("trimPathOffset")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.p = l7m0VarA;
                                        }
                                        break;
                                    case -987906986:
                                        if (!str.equals("pivotX")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.b = l7m0VarA;
                                        }
                                        break;
                                    case -987906985:
                                        if (!str.equals("pivotY")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.c = l7m0VarA;
                                        }
                                        break;
                                    case -908189618:
                                        if (!str.equals("scaleX")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.d = l7m0VarA;
                                        }
                                        break;
                                    case -908189617:
                                        if (!str.equals("scaleY")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.e = l7m0VarA;
                                        }
                                        break;
                                    case -170626757:
                                        if (!str.equals("trimPathStart")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.n = l7m0VarA;
                                        }
                                        break;
                                    case -40300674:
                                        if (!str.equals("rotation")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.f16091a = l7m0VarA;
                                        }
                                        break;
                                    case 1233923439:
                                        if (!str.equals("pathData")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.h = l7m0VarA;
                                        }
                                        break;
                                    case 1903848966:
                                        if (!str.equals("strokeAlpha")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.l = l7m0VarA;
                                        }
                                        break;
                                    case 1905781771:
                                        if (!str.equals("strokeColor")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.j = l7m0VarA;
                                        }
                                        break;
                                    case 1924065902:
                                        if (!str.equals("strokeWidth")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.k = l7m0VarA;
                                        }
                                        break;
                                    case 2136119284:
                                        if (!str.equals("trimPathEnd")) {
                                            jf4.n("Unknown propertyName: ".concat(str));
                                            return;
                                        } else {
                                            l7m0VarA.getClass();
                                            j8m0Var.o = l7m0VarA;
                                        }
                                        break;
                                    default:
                                        jf4.n("Unknown propertyName: ".concat(str));
                                        return;
                                }
                            } else {
                                i4 = i12;
                                i5 = i10;
                                i6 = i9;
                            }
                            j2 >>= i5;
                            i12 = i4 + 1;
                            i7 = i;
                            fetVar4 = fetVar;
                            i9 = i6;
                            i10 = i5;
                        }
                        int i14 = i10;
                        i3 = i9;
                        if (i11 == i14) {
                        }
                    } else {
                        i3 = i9;
                    }
                    if (i3 != length) {
                        i9 = i3 + 1;
                        i7 = i;
                        fetVar3 = fetVar;
                    }
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00(this, oms0Var, j8m0Var, i, i2);
        }
    }

    public abstract void b(hz40 hz40Var, int i, int i2);

    public abstract int c();
}
