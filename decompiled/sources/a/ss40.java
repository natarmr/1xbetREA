package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ss40 extends qs40 {
    public int d;
    public String e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;

    @Override // a.qs40
    public final void a(HashSet hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationZ");
        }
        if (this.c.size() > 0) {
            Iterator it = this.c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // a.l0t0
    public final boolean c(int i, int i2) {
        if (i != 401) {
            if (i == 421) {
                this.d = i2;
            } else if (!d(i2, i)) {
                if (i != 100) {
                    return false;
                }
                this.f29242a = i2;
                return true;
            }
        }
        return true;
    }

    public final Object clone() {
        return null;
    }

    @Override // a.l0t0
    public final boolean d(float f, int i) {
        if (i == 315) {
            this.i = f;
            return true;
        }
        if (i == 403) {
            this.j = f;
            return true;
        }
        if (i == 416) {
            this.m = f;
            return true;
        }
        switch (i) {
            case WarningHeader.MEDIA_TYPE_NOT_AVAILABLE /* 304 */:
                this.r = f;
                return true;
            case 305:
                this.s = f;
                return true;
            case WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD /* 306 */:
                this.t = f;
                return true;
            case WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD /* 307 */:
                this.k = f;
                return true;
            case 308:
                this.n = f;
                return true;
            case 309:
                this.o = f;
                return true;
            case 310:
                this.l = f;
                return true;
            case 311:
                this.p = f;
                return true;
            case 312:
                this.q = f;
                return true;
            default:
                switch (i) {
                    case Response.INTERVAL_TOO_BRIEF /* 423 */:
                        this.f = f;
                        return true;
                    case 424:
                        this.g = f;
                        return true;
                    case 425:
                        this.h = f;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // a.l0t0
    public final boolean e(int i, String str) {
        if (i != 420) {
            if (i != 422) {
                return i == 101;
            }
            this.e = str;
        }
        return true;
    }

    public final void f(HashMap map) {
        cky ckyVar;
        float f;
        cky ckyVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                iyf iyfVar = (iyf) this.c.get(str.substring(7));
                if (iyfVar != null && iyfVar.b == 901 && (ckyVar = (cky) map.get(str)) != null) {
                    int i = this.f29242a;
                    int i2 = this.d;
                    String str2 = this.e;
                    ckyVar.f.add(new bky(this.f, this.g, this.h / 360.0f, iyfVar.b(), i));
                    ckyVar.c = i2;
                    ckyVar.b(iyfVar);
                    ckyVar.d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.n;
                        break;
                    case "rotationY":
                        f = this.o;
                        break;
                    case "rotationZ":
                        f = this.l;
                        break;
                    case "translationX":
                        f = this.r;
                        break;
                    case "translationY":
                        f = this.s;
                        break;
                    case "translationZ":
                        f = this.t;
                        break;
                    case "offset":
                        f = this.g;
                        break;
                    case "progress":
                        f = this.i;
                        break;
                    case "scaleX":
                        f = this.p;
                        break;
                    case "scaleY":
                        f = this.q;
                        break;
                    case "elevation":
                        f = this.k;
                        break;
                    case "alpha":
                        f = this.j;
                        break;
                    case "phase":
                        f = this.h;
                        break;
                    case "pathRotate":
                        f = this.m;
                        break;
                    default:
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (ckyVar2 = (cky) map.get(str)) != null) {
                    int i3 = this.f29242a;
                    int i4 = this.d;
                    String str3 = this.e;
                    ckyVar2.f.add(new bky(this.f, this.g, this.h / 360.0f, f2, i3));
                    ckyVar2.c = i4;
                    ckyVar2.d = str3;
                }
            }
        }
    }
}
