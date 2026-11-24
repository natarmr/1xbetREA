package a;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class mge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f21738a = edu.q("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:445:0x0772 A[LOOP:1: B:443:0x076c->B:445:0x0772, LOOP_END] */
    public static lge a(udy udyVar, fa10 fa10Var) throws l52, EOFException {
        String strV;
        lge kjcVar;
        lge gkj0Var;
        lge ikj0Var;
        lge zbvVar;
        int i;
        int i2;
        udyVar.c();
        int iR = 2;
        while (true) {
            if (!udyVar.l()) {
                strV = null;
                break;
            }
            int iY = udyVar.y(f21738a);
            if (iY == 0) {
                strV = udyVar.v();
                break;
            }
            if (iY != 1) {
                udyVar.F();
                udyVar.H();
            } else {
                iR = udyVar.r();
            }
        }
        if (strV == null) {
            return null;
        }
        boolean zN = false;
        boolean zN2 = false;
        int i3 = 0;
        int i4 = 3;
        switch (strV) {
            case "el":
                edu eduVar = mjc.f21890a;
                boolean z = iR == 3;
                boolean zN3 = false;
                String strV2 = null;
                b43 b43VarB = null;
                u33 u33VarS = null;
                while (udyVar.l()) {
                    int iY2 = udyVar.y(mjc.f21890a);
                    if (iY2 == 0) {
                        strV2 = udyVar.v();
                    } else if (iY2 == 1) {
                        b43VarB = w33.b(udyVar, fa10Var);
                    } else if (iY2 == 2) {
                        u33VarS = ju70.S(udyVar, fa10Var);
                    } else if (iY2 == 3) {
                        zN3 = udyVar.n();
                    } else if (iY2 != 4) {
                        udyVar.F();
                        udyVar.H();
                    } else {
                        z = udyVar.r() == 3;
                    }
                }
                kjcVar = new kjc(strV2, b43VarB, u33VarS, z, zN3);
                gkj0Var = kjcVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "fl":
                edu eduVar2 = hkj0.f13212a;
                int iR2 = 1;
                boolean zN4 = false;
                boolean zN5 = false;
                u33 u33Var = null;
                String strV3 = null;
                u33 u33VarO = null;
                while (udyVar.l()) {
                    int iY3 = udyVar.y(hkj0.f13212a);
                    if (iY3 == 0) {
                        strV3 = udyVar.v();
                    } else if (iY3 == 1) {
                        u33VarO = ju70.O(udyVar, fa10Var);
                    } else if (iY3 == 2) {
                        u33Var = ju70.R(udyVar, fa10Var);
                    } else if (iY3 == 3) {
                        zN4 = udyVar.n();
                    } else if (iY3 == 4) {
                        iR2 = udyVar.r();
                    } else if (iY3 != 5) {
                        udyVar.F();
                        udyVar.H();
                    } else {
                        zN5 = udyVar.n();
                    }
                }
                if (u33Var == null) {
                    u33Var = new u33(Collections.singletonList(new cmy(100)), (byte) 2);
                }
                gkj0Var = new gkj0(strV3, zN4, iR2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, u33VarO, u33Var, zN5);
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "gf":
                edu eduVar3 = ybv.f42357a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i5 = 0;
                boolean zN6 = false;
                u33 u33Var2 = null;
                String strV4 = null;
                u33 u33VarQ = null;
                u33 u33VarS2 = null;
                u33 u33VarS3 = null;
                while (udyVar.l()) {
                    switch (udyVar.y(ybv.f42357a)) {
                        case 0:
                            strV4 = udyVar.v();
                            break;
                        case 1:
                            udyVar.c();
                            int iR3 = -1;
                            while (udyVar.l()) {
                                int iY4 = udyVar.y(ybv.b);
                                if (iY4 == 0) {
                                    iR3 = udyVar.r();
                                } else if (iY4 != 1) {
                                    udyVar.F();
                                    udyVar.H();
                                } else {
                                    u33VarQ = ju70.Q(udyVar, fa10Var, iR3);
                                }
                            }
                            udyVar.e();
                            break;
                        case 2:
                            u33Var2 = ju70.R(udyVar, fa10Var);
                            break;
                        case 3:
                            i5 = udyVar.r() != 1 ? 2 : 1;
                            break;
                        case 4:
                            u33VarS2 = ju70.S(udyVar, fa10Var);
                            break;
                        case 5:
                            u33VarS3 = ju70.S(udyVar, fa10Var);
                            break;
                        case 6:
                            fillType = udyVar.r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zN6 = udyVar.n();
                            break;
                        default:
                            udyVar.F();
                            udyVar.H();
                            break;
                    }
                }
                if (u33Var2 == null) {
                    u33Var2 = new u33(Collections.singletonList(new cmy(100)), (byte) 2);
                }
                gkj0Var = new wbv(strV4, i5, fillType, u33VarQ, u33Var2, u33VarS2, u33VarS3, zN6);
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "gr":
                edu eduVar4 = jkj0.f16672a;
                ArrayList arrayList = new ArrayList();
                String strV5 = null;
                while (udyVar.l()) {
                    int iY5 = udyVar.y(jkj0.f16672a);
                    if (iY5 == 0) {
                        strV5 = udyVar.v();
                    } else if (iY5 == 1) {
                        zN = udyVar.n();
                    } else if (iY5 != 2) {
                        udyVar.H();
                    } else {
                        udyVar.a();
                        while (udyVar.l()) {
                            lge lgeVarA = a(udyVar, fa10Var);
                            if (lgeVarA != null) {
                                arrayList.add(lgeVarA);
                            }
                        }
                        udyVar.d();
                    }
                }
                ikj0Var = new ikj0(strV5, arrayList, zN);
                gkj0Var = ikj0Var;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "gs":
                edu eduVar5 = bcv.f2371a;
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean zN7 = false;
                u33 u33Var3 = null;
                String strV6 = null;
                u33 u33VarQ2 = null;
                u33 u33VarS4 = null;
                u33 u33VarS5 = null;
                v33 v33VarP = null;
                v33 v33Var = null;
                float fQ = 0.0f;
                while (udyVar.l()) {
                    switch (udyVar.y(bcv.f2371a)) {
                        case 0:
                            strV6 = udyVar.v();
                            break;
                        case 1:
                            udyVar.c();
                            int iR4 = -1;
                            while (udyVar.l()) {
                                int iY6 = udyVar.y(bcv.b);
                                if (iY6 == 0) {
                                    iR4 = udyVar.r();
                                } else if (iY6 != 1) {
                                    udyVar.F();
                                    udyVar.H();
                                } else {
                                    u33VarQ2 = ju70.Q(udyVar, fa10Var, iR4);
                                }
                            }
                            udyVar.e();
                            break;
                        case 2:
                            u33Var3 = ju70.R(udyVar, fa10Var);
                            break;
                        case 3:
                            i6 = udyVar.r() != 1 ? 2 : 1;
                            break;
                        case 4:
                            u33VarS4 = ju70.S(udyVar, fa10Var);
                            break;
                        case 5:
                            u33VarS5 = ju70.S(udyVar, fa10Var);
                            break;
                        case 6:
                            v33VarP = ju70.P(udyVar, fa10Var, true);
                            break;
                        case 7:
                            i7 = hne.H(3)[udyVar.r() - 1];
                            break;
                        case 8:
                            i8 = hne.H(3)[udyVar.r() - 1];
                            break;
                        case 9:
                            fQ = (float) udyVar.q();
                            break;
                        case 10:
                            zN7 = udyVar.n();
                            break;
                        case 11:
                            udyVar.a();
                            while (udyVar.l()) {
                                udyVar.c();
                                String strV7 = null;
                                v33 v33VarP2 = null;
                                while (udyVar.l()) {
                                    int iY7 = udyVar.y(bcv.c);
                                    if (iY7 == 0) {
                                        strV7 = udyVar.v();
                                    } else if (iY7 != 1) {
                                        udyVar.F();
                                        udyVar.H();
                                    } else {
                                        v33VarP2 = ju70.P(udyVar, fa10Var, true);
                                    }
                                }
                                udyVar.e();
                                if (strV7.equals("o")) {
                                    v33Var = v33VarP2;
                                } else if (strV7.equals("d") || strV7.equals("g")) {
                                    fa10Var.o = true;
                                    arrayList2.add(v33VarP2);
                                }
                            }
                            udyVar.d();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((v33) arrayList2.get(0));
                            }
                            break;
                        default:
                            udyVar.F();
                            udyVar.H();
                            break;
                    }
                }
                if (u33Var3 == null) {
                    u33Var3 = new u33(Collections.singletonList(new cmy(100)), (byte) 2);
                }
                zbvVar = new zbv(strV6, i6, u33VarQ2, u33Var3, u33VarS4, u33VarS5, v33VarP, i7, i8, fQ, arrayList2, v33Var, zN7);
                gkj0Var = zbvVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "mm":
                edu eduVar6 = n340.f22832a;
                boolean zN8 = false;
                String strV8 = null;
                while (udyVar.l()) {
                    int iY8 = udyVar.y(n340.f22832a);
                    if (iY8 == 0) {
                        strV8 = udyVar.v();
                    } else if (iY8 == 1) {
                        int iR5 = udyVar.r();
                        if (iR5 != 1) {
                            if (iR5 == 2) {
                                i3 = 2;
                            } else if (iR5 == 3) {
                                i3 = 3;
                            } else if (iR5 == 4) {
                                i3 = 4;
                            } else if (iR5 == 5) {
                                i3 = 5;
                            }
                        }
                        i3 = 1;
                    } else if (iY8 != 2) {
                        udyVar.F();
                        udyVar.H();
                    } else {
                        zN8 = udyVar.n();
                    }
                }
                l340 l340Var = new l340(strV8, i3, zN8);
                fa10Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                gkj0Var = l340Var;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "rc":
                edu eduVar7 = tge0.f33907a;
                boolean zN9 = false;
                String strV9 = null;
                b43 b43VarB2 = null;
                u33 u33VarS6 = null;
                v33 v33VarP3 = null;
                while (udyVar.l()) {
                    int iY9 = udyVar.y(tge0.f33907a);
                    if (iY9 == 0) {
                        strV9 = udyVar.v();
                    } else if (iY9 == 1) {
                        b43VarB2 = w33.b(udyVar, fa10Var);
                    } else if (iY9 == 2) {
                        u33VarS6 = ju70.S(udyVar, fa10Var);
                    } else if (iY9 == 3) {
                        v33VarP3 = ju70.P(udyVar, fa10Var, true);
                    } else if (iY9 != 4) {
                        udyVar.H();
                    } else {
                        zN9 = udyVar.n();
                    }
                }
                zbvVar = new sge0(strV9, b43VarB2, u33VarS6, v33VarP3, zN9);
                gkj0Var = zbvVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "rd":
                edu eduVar8 = zgg0.f44343a;
                String strV10 = null;
                v33 v33VarP4 = null;
                while (udyVar.l()) {
                    int iY10 = udyVar.y(zgg0.f44343a);
                    if (iY10 == 0) {
                        strV10 = udyVar.v();
                    } else if (iY10 == 1) {
                        v33VarP4 = ju70.P(udyVar, fa10Var, true);
                    } else if (iY10 != 2) {
                        udyVar.H();
                    } else {
                        zN2 = udyVar.n();
                    }
                }
                gkj0Var = zN2 ? null : new xgg0(strV10, v33VarP4);
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "rp":
                edu eduVar9 = wkf0.f39306a;
                boolean zN10 = false;
                String strV11 = null;
                v33 v33VarP5 = null;
                v33 v33VarP6 = null;
                z33 z33VarC = null;
                while (udyVar.l()) {
                    int iY11 = udyVar.y(wkf0.f39306a);
                    if (iY11 == 0) {
                        strV11 = udyVar.v();
                    } else if (iY11 == 1) {
                        v33VarP5 = ju70.P(udyVar, fa10Var, false);
                    } else if (iY11 == 2) {
                        v33VarP6 = ju70.P(udyVar, fa10Var, false);
                    } else if (iY11 == 3) {
                        z33VarC = a43.c(udyVar, fa10Var);
                    } else if (iY11 != 4) {
                        udyVar.H();
                    } else {
                        zN10 = udyVar.n();
                    }
                }
                zbvVar = new sge0(strV11, v33VarP5, v33VarP6, z33VarC, zN10);
                gkj0Var = zbvVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "sh":
                edu eduVar10 = vkj0.f37576a;
                int iR6 = 0;
                boolean zN11 = false;
                u33 u33Var4 = null;
                String strV12 = null;
                while (udyVar.l()) {
                    int iY12 = udyVar.y(vkj0.f37576a);
                    if (iY12 == 0) {
                        strV12 = udyVar.v();
                    } else if (iY12 == 1) {
                        iR6 = udyVar.r();
                    } else if (iY12 == 2) {
                        u33Var4 = new u33(gmy.a(udyVar, fa10Var, cut0.c(), ekj0.f7955a, false), (byte) 5);
                    } else if (iY12 != 3) {
                        udyVar.H();
                    } else {
                        zN11 = udyVar.n();
                    }
                }
                ikj0Var = new ukj0(strV12, iR6, u33Var4, zN11);
                gkj0Var = ikj0Var;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "sr":
                edu eduVar11 = xua0.f41500a;
                boolean z2 = iR == 3;
                int i9 = 0;
                boolean zN12 = false;
                String strV13 = null;
                v33 v33VarP7 = null;
                b43 b43VarB3 = null;
                v33 v33VarP8 = null;
                v33 v33VarP9 = null;
                v33 v33VarP10 = null;
                v33 v33VarP11 = null;
                v33 v33VarP12 = null;
                while (udyVar.l()) {
                    switch (udyVar.y(xua0.f41500a)) {
                        case 0:
                            strV13 = udyVar.v();
                            break;
                        case 1:
                            int iR7 = udyVar.r();
                            int[] iArrH = hne.H(2);
                            int length = iArrH.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    i9 = 0;
                                }
                                int i11 = iArrH[i10];
                                if (i11 == 1) {
                                    i = 1;
                                } else {
                                    if (i11 != 2) {
                                        throw null;
                                    }
                                    i = 2;
                                }
                                if (i == iR7) {
                                    i9 = i11;
                                }
                                i10++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            v33VarP7 = ju70.P(udyVar, fa10Var, false);
                            break;
                        case 3:
                            b43VarB3 = w33.b(udyVar, fa10Var);
                            break;
                        case 4:
                            v33VarP8 = ju70.P(udyVar, fa10Var, false);
                            break;
                        case 5:
                            v33VarP10 = ju70.P(udyVar, fa10Var, true);
                            break;
                        case 6:
                            v33VarP12 = ju70.P(udyVar, fa10Var, false);
                            break;
                        case 7:
                            v33VarP9 = ju70.P(udyVar, fa10Var, true);
                            break;
                        case 8:
                            v33VarP11 = ju70.P(udyVar, fa10Var, false);
                            break;
                        case 9:
                            zN12 = udyVar.n();
                            break;
                        case 10:
                            z2 = udyVar.r() == 3;
                            break;
                        default:
                            udyVar.F();
                            udyVar.H();
                            break;
                    }
                }
                zbvVar = new wua0(strV13, i9, v33VarP7, b43VarB3, v33VarP8, v33VarP9, v33VarP10, v33VarP11, v33VarP12, zN12, z2);
                gkj0Var = zbvVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "st":
                edu eduVar12 = xkj0.f41030a;
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                boolean zN13 = false;
                u33 u33Var5 = null;
                String strV14 = null;
                v33 v33Var2 = null;
                u33 u33VarO2 = null;
                v33 v33VarP13 = null;
                float fQ2 = 0.0f;
                while (udyVar.l()) {
                    switch (udyVar.y(xkj0.f41030a)) {
                        case 0:
                            strV14 = udyVar.v();
                            continue;
                        case 1:
                            u33VarO2 = ju70.O(udyVar, fa10Var);
                            continue;
                        case 2:
                            v33VarP13 = ju70.P(udyVar, fa10Var, true);
                            continue;
                        case 3:
                            u33Var5 = ju70.R(udyVar, fa10Var);
                            continue;
                        case 4:
                            i12 = hne.H(i4)[udyVar.r() - 1];
                            continue;
                        case 5:
                            i13 = hne.H(i4)[udyVar.r() - 1];
                            continue;
                        case 6:
                            i2 = i4;
                            fQ2 = (float) udyVar.q();
                            break;
                        case 7:
                            zN13 = udyVar.n();
                            continue;
                        case 8:
                            udyVar.a();
                            while (udyVar.l()) {
                                udyVar.c();
                                v33 v33VarP14 = null;
                                String strV15 = null;
                                while (udyVar.l()) {
                                    int i14 = i4;
                                    int iY13 = udyVar.y(xkj0.b);
                                    if (iY13 == 0) {
                                        strV15 = udyVar.v();
                                    } else if (iY13 != 1) {
                                        udyVar.F();
                                        udyVar.H();
                                    } else {
                                        v33VarP14 = ju70.P(udyVar, fa10Var, true);
                                    }
                                    i4 = i14;
                                }
                                int i15 = i4;
                                udyVar.e();
                                strV15.getClass();
                                switch (strV15) {
                                    case "d":
                                    case "g":
                                        fa10Var.o = true;
                                        arrayList3.add(v33VarP14);
                                        break;
                                    case "o":
                                        v33Var2 = v33VarP14;
                                        break;
                                }
                                i4 = i15;
                            }
                            i2 = i4;
                            udyVar.d();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((v33) arrayList3.get(0));
                            }
                            break;
                        default:
                            udyVar.H();
                            continue;
                    }
                    i4 = i2;
                }
                if (u33Var5 == null) {
                    u33Var5 = new u33(Collections.singletonList(new cmy(100)), (byte) 2);
                }
                gkj0Var = new wkj0(strV14, v33Var2, arrayList3, u33VarO2, u33Var5, v33VarP13, i12 == 0 ? 1 : i12, i13 == 0 ? 1 : i13, fQ2, zN13);
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "tm":
                edu eduVar13 = alj0.f1071a;
                int i16 = 0;
                boolean zN14 = false;
                String strV16 = null;
                v33 v33VarP15 = null;
                v33 v33VarP16 = null;
                v33 v33VarP17 = null;
                while (udyVar.l()) {
                    int iY14 = udyVar.y(alj0.f1071a);
                    if (iY14 == 0) {
                        v33VarP15 = ju70.P(udyVar, fa10Var, false);
                    } else if (iY14 == 1) {
                        v33VarP16 = ju70.P(udyVar, fa10Var, false);
                    } else if (iY14 == 2) {
                        v33VarP17 = ju70.P(udyVar, fa10Var, false);
                    } else if (iY14 == 3) {
                        strV16 = udyVar.v();
                    } else if (iY14 == 4) {
                        int iR8 = udyVar.r();
                        if (iR8 == 1) {
                            i16 = 1;
                        } else {
                            if (iR8 != 2) {
                                jf4.o(twn.m(iR8, "Unknown trim path type "));
                                return null;
                            }
                            i16 = 2;
                        }
                    } else if (iY14 != 5) {
                        udyVar.H();
                    } else {
                        zN14 = udyVar.n();
                    }
                }
                kjcVar = new zkj0(strV16, i16, v33VarP15, v33VarP16, v33VarP17, zN14);
                gkj0Var = kjcVar;
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            case "tr":
                gkj0Var = a43.c(udyVar, fa10Var);
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
            default:
                xv00.b("Unknown shape type ".concat(strV));
                while (udyVar.l()) {
                    udyVar.H();
                }
                udyVar.e();
                return gkj0Var;
        }
    }
}
