package a;

import android.javax.sip.header.WarningHeader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rs40 extends qs40 {
    public int d;
    public float e;
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

    @Override // a.qs40
    public final void a(HashSet hashSet) {
        if (!Float.isNaN(this.e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("progress");
        }
        if (this.c.size() > 0) {
            Iterator it = this.c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // a.qs40
    public final void b(HashMap map) {
        if (!Float.isNaN(this.e)) {
            map.put("alpha", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.f)) {
            map.put("elevation", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.g)) {
            map.put("rotationZ", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotationX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotationY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.j)) {
            map.put("pivotX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.k)) {
            map.put("pivotY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationZ", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.l)) {
            map.put("pathRotate", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.m)) {
            map.put("scaleX", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.n)) {
            map.put("scaleY", Integer.valueOf(this.d));
        }
        if (!Float.isNaN(this.r)) {
            map.put("progress", Integer.valueOf(this.d));
        }
        if (this.c.size() > 0) {
            Iterator it = this.c.keySet().iterator();
            while (it.hasNext()) {
                map.put(kng0.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.d));
            }
        }
    }

    @Override // a.l0t0
    public final boolean c(int i, int i2) {
        if (i == 100) {
            this.f29242a = i2;
        } else if (i == 301) {
            this.d = i2;
        } else if (i != 302 && !c(i, i2)) {
            if (i != 100) {
                return false;
            }
            this.f29242a = i2;
            return true;
        }
        return true;
    }

    public final Object clone() {
        return null;
    }

    @Override // a.l0t0
    public final boolean d(float f, int i) {
        if (i == 100) {
            this.l = f;
            return true;
        }
        switch (i) {
            case WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS /* 303 */:
                this.e = f;
                return true;
            case WarningHeader.MEDIA_TYPE_NOT_AVAILABLE /* 304 */:
                this.o = f;
                return true;
            case 305:
                this.p = f;
                return true;
            case WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD /* 306 */:
                this.q = f;
                return true;
            case WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD /* 307 */:
                this.f = f;
                return true;
            case 308:
                this.h = f;
                return true;
            case 309:
                this.i = f;
                return true;
            case 310:
                this.g = f;
                return true;
            case 311:
                this.m = f;
                return true;
            case 312:
                this.n = f;
                return true;
            case 313:
                this.j = f;
                return true;
            case 314:
                this.k = f;
                return true;
            case 315:
                this.r = f;
                return true;
            case 316:
                this.l = f;
                return true;
            default:
                return false;
        }
    }

    @Override // a.l0t0
    public final boolean e(int i, String str) {
        return i == 101 || i == 317 || i == 101;
    }
}
