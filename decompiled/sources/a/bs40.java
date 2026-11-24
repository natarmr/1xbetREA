package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bs40 implements Comparable {
    public byte b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3110a = 1.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public final LinkedHashMap m = new LinkedHashMap();

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i) {
        for (String str : map.keySet()) {
            zzk0 zzk0Var = (zzk0) map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = 11;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b = 12;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    zzk0Var.b(Float.isNaN(this.d) ? 0.0f : this.d, i);
                    break;
                case 1:
                    zzk0Var.b(Float.isNaN(this.e) ? 0.0f : this.e, i);
                    break;
                case 2:
                    zzk0Var.b(Float.isNaN(this.c) ? 0.0f : this.c, i);
                    break;
                case 3:
                    zzk0Var.b(Float.isNaN(this.j) ? 0.0f : this.j, i);
                    break;
                case 4:
                    zzk0Var.b(Float.isNaN(this.k) ? 0.0f : this.k, i);
                    break;
                case 5:
                    zzk0Var.b(Float.isNaN(this.l) ? 0.0f : this.l, i);
                    break;
                case 6:
                    zzk0Var.b(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                case 7:
                    zzk0Var.b(Float.isNaN(this.h) ? 0.0f : this.h, i);
                    break;
                case 8:
                    zzk0Var.b(Float.isNaN(this.i) ? 0.0f : this.i, i);
                    break;
                case 9:
                    zzk0Var.b(Float.isNaN(this.f) ? 1.0f : this.f, i);
                    break;
                case 10:
                    zzk0Var.b(Float.isNaN(this.g) ? 1.0f : this.g, i);
                    break;
                case 11:
                    zzk0Var.b(Float.isNaN(this.f3110a) ? 1.0f : this.f3110a, i);
                    break;
                case 12:
                    zzk0Var.b(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(Separators.COMMA)[1];
                        LinkedHashMap linkedHashMap = this.m;
                        if (linkedHashMap.containsKey(str2)) {
                            iyf iyfVar = (iyf) linkedHashMap.get(str2);
                            if (zzk0Var instanceof yzk0) {
                                ((yzk0) zzk0Var).f.b(i, iyfVar);
                            } else {
                                hxm0.u("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + iyfVar.b() + zzk0Var);
                            }
                        }
                    } else {
                        hxm0.u("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    public final void c(ywu ywuVar) {
        short s;
        vdv0 vdv0Var = (vdv0) ywuVar.b;
        byte b = ((wv00) ywuVar.d).f39816a;
        this.b = b;
        this.f3110a = b != 4 ? 0.0f : vdv0Var.p;
        this.c = vdv0Var.j;
        this.d = vdv0Var.h;
        this.e = vdv0Var.i;
        this.f = vdv0Var.n;
        this.g = vdv0Var.o;
        this.h = vdv0Var.f;
        this.i = vdv0Var.g;
        this.j = vdv0Var.k;
        this.k = vdv0Var.l;
        this.l = vdv0Var.m;
        for (String str : vdv0Var.r.keySet()) {
            iyf iyfVar = (iyf) ((vdv0) ywuVar.b).r.get(str);
            if (iyfVar != null && (s = iyfVar.b) != 903 && s != 904 && s != 906) {
                this.m.put(str, iyfVar);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((bs40) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
