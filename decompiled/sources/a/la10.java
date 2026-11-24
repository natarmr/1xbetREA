package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class la10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f19684a = edu.q("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final edu b = edu.q(ParameterNames.ID, "layers", "w", "h", "p", "u");
    public static final edu c = edu.q("list");
    public static final edu d = edu.q("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static fa10 a(udy udyVar) throws l52, EOFException {
        fa10 fa10Var;
        int i;
        float f;
        fa10 fa10Var2;
        float f2;
        float f3;
        float fC = cut0.c();
        u710 u710Var = new u710((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        gnk0 gnk0Var = new gnk0(0);
        fa10 fa10Var3 = new fa10();
        udyVar.c();
        int iQ = 0;
        int iQ2 = 0;
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (udyVar.l()) {
            switch (udyVar.y(f19684a)) {
                case 0:
                    iQ = (int) udyVar.q();
                    fa10Var3 = fa10Var3;
                    break;
                case 1:
                    iQ2 = (int) udyVar.q();
                    fa10Var3 = fa10Var3;
                    break;
                case 2:
                    fQ2 = (float) udyVar.q();
                    fa10Var3 = fa10Var3;
                    break;
                case 3:
                    fQ = ((float) udyVar.q()) - 0.01f;
                    fa10Var3 = fa10Var3;
                    fC = fC;
                    break;
                case 4:
                    fQ3 = (float) udyVar.q();
                    fa10Var3 = fa10Var3;
                    fC = fC;
                    break;
                case 5:
                    fC = fC;
                    fa10Var = fa10Var3;
                    i = iQ2;
                    f = fQ2;
                    String[] strArrSplit = udyVar.v().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    int i4 = Integer.parseInt(strArrSplit[2]);
                    if (i2 < 4 || (i2 <= 4 && (i3 < 4 || (i3 <= 4 && i4 < 0)))) {
                        fa10Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                case 6:
                    fC = fC;
                    fa10 fa10Var4 = fa10Var3;
                    i = iQ2;
                    f = fQ2;
                    udyVar.a();
                    int i5 = 0;
                    while (udyVar.l()) {
                        fa10 fa10Var5 = fa10Var4;
                        y5z y5zVarA = a6z.a(udyVar, fa10Var5);
                        if (y5zVarA.e == 3) {
                            i5++;
                        }
                        arrayList.add(y5zVarA);
                        u710Var.f(y5zVarA, y5zVarA.d);
                        if (i5 > 4) {
                            xv00.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        fa10Var4 = fa10Var5;
                    }
                    fa10Var = fa10Var4;
                    udyVar.d();
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                case 7:
                    fC = fC;
                    i = iQ2;
                    f = fQ2;
                    udyVar.a();
                    while (udyVar.l()) {
                        ArrayList arrayList3 = new ArrayList();
                        u710 u710Var2 = new u710((Object) null);
                        udyVar.c();
                        String strV = null;
                        String strV2 = null;
                        String strV3 = null;
                        int iR = 0;
                        int iR2 = 0;
                        while (udyVar.l()) {
                            int iY = udyVar.y(b);
                            if (iY != 0) {
                                if (iY == 1) {
                                    udyVar.a();
                                    while (udyVar.l()) {
                                        y5z y5zVarA2 = a6z.a(udyVar, fa10Var3);
                                        u710Var2.f(y5zVarA2, y5zVarA2.d);
                                        arrayList3.add(y5zVarA2);
                                        fa10Var3 = fa10Var3;
                                    }
                                    fa10Var2 = fa10Var3;
                                    udyVar.d();
                                } else if (iY == 2) {
                                    iR = udyVar.r();
                                } else if (iY == 3) {
                                    iR2 = udyVar.r();
                                } else if (iY == 4) {
                                    strV2 = udyVar.v();
                                } else if (iY != 5) {
                                    udyVar.F();
                                    udyVar.H();
                                    fa10Var2 = fa10Var3;
                                } else {
                                    strV3 = udyVar.v();
                                }
                                fa10Var3 = fa10Var2;
                            } else {
                                strV = udyVar.v();
                            }
                        }
                        fa10 fa10Var6 = fa10Var3;
                        udyVar.e();
                        if (strV2 != null) {
                            map2.put(strV, new hb10(strV, iR, strV2, strV3, iR2));
                        } else {
                            map.put(strV, arrayList3);
                        }
                        fa10Var3 = fa10Var6;
                    }
                    udyVar.d();
                    fa10Var = fa10Var3;
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                case 8:
                    fC = fC;
                    i = iQ2;
                    float f4 = fQ2;
                    udyVar.c();
                    while (udyVar.l()) {
                        if (udyVar.y(c) != 0) {
                            udyVar.F();
                            udyVar.H();
                        } else {
                            udyVar.a();
                            while (udyVar.l()) {
                                edu eduVar = trq.f34430a;
                                udyVar.c();
                                String strV4 = null;
                                String strV5 = null;
                                String strV6 = null;
                                while (udyVar.l()) {
                                    int iY2 = udyVar.y(trq.f34430a);
                                    if (iY2 != 0) {
                                        float f5 = f4;
                                        if (iY2 == 1) {
                                            strV5 = udyVar.v();
                                        } else if (iY2 == 2) {
                                            strV6 = udyVar.v();
                                        } else if (iY2 != 3) {
                                            udyVar.F();
                                            udyVar.H();
                                        } else {
                                            udyVar.q();
                                        }
                                        f4 = f5;
                                    } else {
                                        strV4 = udyVar.v();
                                    }
                                }
                                udyVar.e();
                                map3.put(strV5, new irq(strV4, strV5, strV6));
                                f4 = f4;
                            }
                            udyVar.d();
                        }
                    }
                    f = f4;
                    udyVar.e();
                    fa10Var = fa10Var3;
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                case 9:
                    fC = fC;
                    i = iQ2;
                    f2 = fQ2;
                    udyVar.a();
                    while (udyVar.l()) {
                        edu eduVar2 = lrq.f20545a;
                        ArrayList arrayList4 = new ArrayList();
                        udyVar.c();
                        double dQ = 0.0d;
                        char cCharAt = 0;
                        String strV7 = null;
                        String strV8 = null;
                        while (udyVar.l()) {
                            int iY3 = udyVar.y(lrq.f20545a);
                            if (iY3 == 0) {
                                cCharAt = udyVar.v().charAt(0);
                            } else if (iY3 == 1) {
                                udyVar.q();
                            } else if (iY3 == 2) {
                                dQ = udyVar.q();
                            } else if (iY3 == 3) {
                                strV7 = udyVar.v();
                            } else if (iY3 == 4) {
                                strV8 = udyVar.v();
                            } else if (iY3 != 5) {
                                udyVar.F();
                                udyVar.H();
                            } else {
                                udyVar.c();
                                while (udyVar.l()) {
                                    if (udyVar.y(lrq.b) != 0) {
                                        udyVar.F();
                                        udyVar.H();
                                    } else {
                                        udyVar.a();
                                        while (udyVar.l()) {
                                            arrayList4.add((ikj0) mge.a(udyVar, fa10Var3));
                                        }
                                        udyVar.d();
                                    }
                                }
                                udyVar.e();
                            }
                        }
                        udyVar.e();
                        krq krqVar = new krq(arrayList4, cCharAt, dQ, strV7, strV8);
                        gnk0Var.c(krqVar.hashCode(), krqVar);
                    }
                    udyVar.d();
                    f = f2;
                    fa10Var = fa10Var3;
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                case 10:
                    udyVar.a();
                    while (udyVar.l()) {
                        udyVar.c();
                        String strV9 = null;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        while (udyVar.l()) {
                            int iY4 = udyVar.y(d);
                            if (iY4 != 0) {
                                f3 = fC;
                                if (iY4 == 1) {
                                    fQ2 = fQ2;
                                    fQ4 = (float) udyVar.q();
                                } else if (iY4 != 2) {
                                    udyVar.F();
                                    udyVar.H();
                                } else {
                                    fQ2 = fQ2;
                                    fQ5 = (float) udyVar.q();
                                }
                                iQ2 = iQ2;
                            } else {
                                f3 = fC;
                                strV9 = udyVar.v();
                            }
                            fC = f3;
                        }
                        udyVar.e();
                        arrayList2.add(new gr20(strV9, fQ4, fQ5));
                        fQ2 = fQ2;
                        iQ2 = iQ2;
                        fC = fC;
                    }
                    fC = fC;
                    i = iQ2;
                    f2 = fQ2;
                    udyVar.d();
                    f = f2;
                    fa10Var = fa10Var3;
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
                default:
                    udyVar.F();
                    udyVar.H();
                    fC = fC;
                    fa10Var = fa10Var3;
                    i = iQ2;
                    f = fQ2;
                    fa10Var3 = fa10Var;
                    iQ2 = i;
                    fQ2 = f;
                    fC = fC;
                    break;
            }
        }
        float f6 = fC;
        fa10 fa10Var7 = fa10Var3;
        Rect rect = new Rect(0, 0, (int) (iQ * f6), (int) (iQ2 * f6));
        float fC2 = cut0.c();
        fa10Var7.k = rect;
        fa10Var7.l = fQ2;
        fa10Var7.m = fQ;
        fa10Var7.n = fQ3;
        fa10Var7.j = arrayList;
        fa10Var7.i = u710Var;
        fa10Var7.c = map;
        fa10Var7.d = map2;
        fa10Var7.e = fC2;
        fa10Var7.h = gnk0Var;
        fa10Var7.f = map3;
        fa10Var7.g = arrayList2;
        return fa10Var7;
    }
}
