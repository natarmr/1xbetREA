package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class as40 implements Comparable {
    public int c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1376a = 0.0f;
    public int b = 0;
    public final LinkedHashMap d = new LinkedHashMap();
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = Float.NaN;
    public float q = Float.NaN;

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i) {
        for (String str : map.keySet()) {
            dlu0 dlu0Var = (dlu0) map.get(str);
            if (dlu0Var != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        dlu0Var.b(Float.isNaN(this.h) ? 0.0f : this.h, i);
                        break;
                    case 1:
                        dlu0Var.b(Float.isNaN(this.f1376a) ? 0.0f : this.f1376a, i);
                        break;
                    case 2:
                        dlu0Var.b(Float.isNaN(this.m) ? 0.0f : this.m, i);
                        break;
                    case 3:
                        dlu0Var.b(Float.isNaN(this.n) ? 0.0f : this.n, i);
                        break;
                    case 4:
                        dlu0Var.b(Float.isNaN(this.o) ? 0.0f : this.o, i);
                        break;
                    case 5:
                        dlu0Var.b(Float.isNaN(this.q) ? 0.0f : this.q, i);
                        break;
                    case 6:
                        dlu0Var.b(Float.isNaN(this.i) ? 1.0f : this.i, i);
                        break;
                    case 7:
                        dlu0Var.b(Float.isNaN(this.j) ? 1.0f : this.j, i);
                        break;
                    case 8:
                        dlu0Var.b(Float.isNaN(this.k) ? 0.0f : this.k, i);
                        break;
                    case 9:
                        dlu0Var.b(Float.isNaN(this.l) ? 0.0f : this.l, i);
                        break;
                    case 10:
                        dlu0Var.b(Float.isNaN(this.g) ? 0.0f : this.g, i);
                        break;
                    case 11:
                        dlu0Var.b(Float.isNaN(this.f) ? 0.0f : this.f, i);
                        break;
                    case 12:
                        dlu0Var.b(Float.isNaN(this.p) ? 0.0f : this.p, i);
                        break;
                    case 13:
                        dlu0Var.b(Float.isNaN(this.e) ? 1.0f : this.e, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(Separators.COMMA)[1];
                            LinkedHashMap linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                x2e x2eVar = (x2e) linkedHashMap.get(str2);
                                if (dlu0Var instanceof alu0) {
                                    ((alu0) dlu0Var).f.append(i, x2eVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + x2eVar.a() + dlu0Var);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    public final void c(Rect rect, r3e r3eVar, int i, int i2) {
        rect.width();
        rect.height();
        m3e m3eVarH = r3eVar.h(i2);
        p3e p3eVar = m3eVarH.c;
        o3e o3eVar = m3eVarH.d;
        int i3 = p3eVar.c;
        this.b = i3;
        int i4 = p3eVar.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? p3eVar.d : 0.0f;
        q3e q3eVar = m3eVarH.f;
        this.f = q3eVar.n;
        this.g = q3eVar.b;
        this.h = q3eVar.c;
        this.f1376a = q3eVar.d;
        this.i = q3eVar.e;
        this.j = q3eVar.f;
        this.k = q3eVar.g;
        this.l = q3eVar.h;
        this.m = q3eVar.j;
        this.n = q3eVar.k;
        this.o = q3eVar.l;
        fhn.f(o3eVar.d);
        this.p = o3eVar.h;
        this.q = m3eVarH.c.e;
        for (String str : m3eVarH.g.keySet()) {
            x2e x2eVar = (x2e) m3eVarH.g.get(str);
            int iE = hne.E(x2eVar.c);
            if (iE != 4 && iE != 5 && iE != 7) {
                this.d.put(str, x2eVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.g + 90.0f;
            this.g = f;
            if (f > 180.0f) {
                this.g = f - 360.0f;
                return;
            }
            return;
        }
        this.g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((as40) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
