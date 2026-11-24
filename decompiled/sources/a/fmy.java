package a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class fmy {
    public static gnk0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f9807a = new LinearInterpolator();
    public static final edu c = edu.q("t", "s", "e", "o", "i", "h", RemoteMessageConst.TO, "ti");
    public static final edu d = edu.q("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = ah40.b(pointF.x, -1.0f, 1.0f);
        pointF.y = ah40.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = ah40.b(pointF2.x, -1.0f, 1.0f);
        float fB = ah40.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = cut0.f5002a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (fmy.class) {
            gnk0 gnk0Var = b;
            if (gnk0Var == null) {
                gnk0Var = new gnk0(0);
                b = gnk0Var;
            }
            weakReference = (WeakReference) j2e.L(gnk0Var, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (fmy.class) {
                b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static cmy b(ndy ndyVar, fa10 fa10Var, float f, l3u0 l3u0Var, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Object obj2;
        cmy cmyVar;
        edu eduVar;
        edu eduVar2;
        PointF pointF;
        edu eduVar3 = c;
        LinearInterpolator linearInterpolator = f9807a;
        if (!z || !z2) {
            edu eduVar4 = eduVar3;
            if (!z) {
                return new cmy(l3u0Var.z0(ndyVar, f));
            }
            ndyVar.c();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z3 = false;
            Object objZ0 = null;
            float fQ = 0.0f;
            Object objZ1 = null;
            while (ndyVar.l()) {
                eduVar4 = eduVar4;
                switch (ndyVar.y(eduVar4)) {
                    case 0:
                        fQ = (float) ndyVar.q();
                        continue;
                    case 1:
                        objZ0 = l3u0Var.z0(ndyVar, f);
                        break;
                    case 2:
                        objZ1 = l3u0Var.z0(ndyVar, f);
                        break;
                    case 3:
                        pointFB4 = vdy.b(ndyVar, 1.0f);
                        break;
                    case 4:
                        pointFB = vdy.b(ndyVar, 1.0f);
                        break;
                    case 5:
                        z3 = ndyVar.r() == 1;
                        break;
                    case 6:
                        pointFB2 = vdy.b(ndyVar, f);
                        break;
                    case 7:
                        pointFB3 = vdy.b(ndyVar, f);
                        break;
                    default:
                        ndyVar.H();
                        break;
                }
            }
            ndyVar.e();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objZ1;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    obj = objZ1;
                }
                cmy cmyVar2 = new cmy(fa10Var, objZ0, obj, interpolatorA, fQ, (Float) null);
                cmyVar2.o = pointFB2;
                cmyVar2.p = pointFB3;
                return cmyVar2;
            }
            obj = objZ0;
            interpolatorA = linearInterpolator;
            cmy cmyVar3 = new cmy(fa10Var, objZ0, obj, interpolatorA, fQ, (Float) null);
            cmyVar3.o = pointFB2;
            cmyVar3.p = pointFB3;
            return cmyVar3;
        }
        ndyVar.c();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objZ2 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fQ2 = 0.0f;
        Object objZ3 = null;
        while (ndyVar.l()) {
            int iY = ndyVar.y(eduVar3);
            edu eduVar5 = d;
            linearInterpolator = linearInterpolator;
            switch (iY) {
                case 0:
                    eduVar = eduVar3;
                    fQ2 = (float) ndyVar.q();
                    eduVar3 = eduVar;
                    break;
                case 1:
                    eduVar = eduVar3;
                    objZ2 = l3u0Var.z0(ndyVar, f);
                    eduVar3 = eduVar;
                    break;
                case 2:
                    eduVar = eduVar3;
                    objZ3 = l3u0Var.z0(ndyVar, f);
                    eduVar3 = eduVar;
                    break;
                case 3:
                    eduVar = eduVar3;
                    boolean z5 = z4;
                    Object obj3 = objZ2;
                    PointF pointF6 = pointF4;
                    if (ndyVar.w() == 3) {
                        ndyVar.c();
                        float fQ3 = 0.0f;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        float fQ6 = 0.0f;
                        while (ndyVar.l()) {
                            int iY2 = ndyVar.y(eduVar5);
                            if (iY2 != 0) {
                                if (iY2 != 1) {
                                    ndyVar.H();
                                } else if (ndyVar.w() == 7) {
                                    fQ6 = (float) ndyVar.q();
                                    fQ4 = fQ6;
                                } else {
                                    ndyVar.a();
                                    fQ4 = (float) ndyVar.q();
                                    fQ6 = ndyVar.w() == 7 ? (float) ndyVar.q() : fQ4;
                                    ndyVar.d();
                                }
                            } else if (ndyVar.w() == 7) {
                                fQ5 = (float) ndyVar.q();
                                fQ3 = fQ5;
                            } else {
                                ndyVar.a();
                                fQ3 = (float) ndyVar.q();
                                fQ5 = ndyVar.w() == 7 ? (float) ndyVar.q() : fQ3;
                                ndyVar.d();
                            }
                        }
                        PointF pointF7 = new PointF(fQ3, fQ4);
                        pointF4 = new PointF(fQ5, fQ6);
                        ndyVar.e();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = vdy.b(ndyVar, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objZ2 = obj3;
                    eduVar3 = eduVar;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (ndyVar.w() == 3) {
                        ndyVar.c();
                        float fQ7 = 0.0f;
                        float fQ8 = 0.0f;
                        float fQ9 = 0.0f;
                        float fQ10 = 0.0f;
                        while (ndyVar.l()) {
                            Object obj4 = objZ2;
                            int iY3 = ndyVar.y(eduVar5);
                            if (iY3 != 0) {
                                eduVar2 = eduVar3;
                                if (iY3 != 1) {
                                    ndyVar.H();
                                } else if (ndyVar.w() == 7) {
                                    fQ10 = (float) ndyVar.q();
                                    pointF4 = pointF4;
                                    fQ8 = fQ10;
                                } else {
                                    pointF = pointF4;
                                    ndyVar.a();
                                    fQ8 = (float) ndyVar.q();
                                    fQ10 = ndyVar.w() == 7 ? (float) ndyVar.q() : fQ8;
                                    ndyVar.d();
                                    pointF4 = pointF;
                                }
                            } else {
                                eduVar2 = eduVar3;
                                pointF = pointF4;
                                if (ndyVar.w() == 7) {
                                    fQ9 = (float) ndyVar.q();
                                    pointF4 = pointF;
                                    fQ7 = fQ9;
                                } else {
                                    ndyVar.a();
                                    fQ7 = (float) ndyVar.q();
                                    fQ9 = ndyVar.w() == 7 ? (float) ndyVar.q() : fQ7;
                                    ndyVar.d();
                                    pointF4 = pointF;
                                }
                            }
                            objZ2 = obj4;
                            eduVar3 = eduVar2;
                        }
                        eduVar = eduVar3;
                        PointF pointF8 = new PointF(fQ7, fQ8);
                        pointF2 = new PointF(fQ9, fQ10);
                        ndyVar.e();
                        pointF5 = pointF8;
                    } else {
                        eduVar = eduVar3;
                        pointFB8 = vdy.b(ndyVar, f);
                    }
                    z4 = z6;
                    eduVar3 = eduVar;
                    break;
                case 5:
                    z4 = ndyVar.r() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = vdy.b(ndyVar, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = vdy.b(ndyVar, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    ndyVar.H();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objZ2;
        PointF pointF9 = pointF4;
        ndyVar.e();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    interpolatorA2 = a(pointF3, pointF5);
                    interpolatorA3 = a(pointF9, pointF2);
                    obj2 = objZ3;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    cmyVar = new cmy(fa10Var, obj5, obj2, interpolatorA4, fQ2, (Float) null);
                } else {
                    cmyVar = new cmy(fa10Var, obj5, obj2, interpolatorA2, interpolatorA3, fQ2);
                }
                cmyVar.o = pointFB5;
                cmyVar.p = pointFB6;
                return cmyVar;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objZ3;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            cmyVar = new cmy(fa10Var, obj5, obj2, interpolatorA4, fQ2, (Float) null);
        } else {
            cmyVar = new cmy(fa10Var, obj5, obj2, interpolatorA4, fQ2, (Float) null);
        }
        cmyVar.o = pointFB5;
        cmyVar.p = pointFB6;
        return cmyVar;
    }
}
