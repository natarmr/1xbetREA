package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yjy extends rjy {
    public int f = 0;
    public int g = -1;
    public String h = null;
    public float i = Float.NaN;
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = Float.NaN;
    public int m = -1;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public float x = Float.NaN;

    public yjy() {
        this.d = (byte) 4;
        this.e = new HashMap();
    }

    @Override // a.rjy
    /* JADX INFO: renamed from: b */
    public final rjy clone() {
        yjy yjyVar = new yjy();
        super.c(this);
        yjyVar.f = this.f;
        yjyVar.g = this.g;
        yjyVar.h = this.h;
        yjyVar.i = this.i;
        yjyVar.j = this.j;
        yjyVar.k = this.k;
        yjyVar.l = this.l;
        yjyVar.m = this.m;
        yjyVar.n = this.n;
        yjyVar.o = this.o;
        yjyVar.p = this.p;
        yjyVar.q = this.q;
        yjyVar.r = this.r;
        yjyVar.s = this.s;
        yjyVar.t = this.t;
        yjyVar.u = this.u;
        yjyVar.v = this.v;
        yjyVar.w = this.w;
        yjyVar.x = this.x;
        return yjyVar;
    }

    @Override // a.rjy
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationZ");
        }
        if (this.e.size() > 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // a.rjy
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fqd0.g);
        SparseIntArray sparseIntArray = xjy.f41008a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = xjy.f41008a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.Y1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 2:
                    this.f30620a = typedArrayObtainStyledAttributes.getInt(index, this.f30620a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.h = typedArrayObtainStyledAttributes.getString(index);
                        this.g = 7;
                    } else {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    }
                    break;
                case 6:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 7:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f = this.j;
                    if (i2 == 5) {
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, f);
                    } else {
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, f);
                    }
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                    break;
                case 9:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 10:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 11:
                    this.p = typedArrayObtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 12:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 13:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 14:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 15:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 16:
                    this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                    break;
                case 17:
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 18:
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    this.x = typedArrayObtainStyledAttributes.getDimension(index, this.x);
                    break;
                case 20:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 21:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    public final void g(HashMap map) {
        eju0 eju0Var;
        float f;
        eju0 eju0Var2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                x2e x2eVar = (x2e) this.e.get(str.substring(7));
                if (x2eVar != null && x2eVar.c == 2 && (eju0Var = (eju0) map.get(str)) != null) {
                    int i = this.f30620a;
                    int i2 = this.g;
                    String str2 = this.h;
                    int i3 = this.m;
                    eju0Var.f.add(new bky(this.i, this.j, this.k, x2eVar.a(), i));
                    if (i3 != -1) {
                        eju0Var.e = i3;
                    }
                    eju0Var.c = i2;
                    eju0Var.b(x2eVar);
                    eju0Var.d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.r;
                        break;
                    case "rotationY":
                        f = this.s;
                        break;
                    case "translationX":
                        f = this.v;
                        break;
                    case "translationY":
                        f = this.w;
                        break;
                    case "translationZ":
                        f = this.x;
                        break;
                    case "progress":
                        f = this.l;
                        break;
                    case "scaleX":
                        f = this.t;
                        break;
                    case "scaleY":
                        f = this.u;
                        break;
                    case "rotation":
                        f = this.p;
                        break;
                    case "elevation":
                        f = this.o;
                        break;
                    case "transitionPathRotate":
                        f = this.q;
                        break;
                    case "alpha":
                        f = this.n;
                        break;
                    case "waveOffset":
                        f = this.j;
                        break;
                    case "wavePhase":
                        f = this.k;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                        }
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (eju0Var2 = (eju0) map.get(str)) != null) {
                    int i4 = this.f30620a;
                    int i5 = this.g;
                    String str3 = this.h;
                    int i6 = this.m;
                    eju0Var2.f.add(new bky(this.i, this.j, this.k, f2, i4));
                    if (i6 != -1) {
                        eju0Var2.e = i6;
                    }
                    eju0Var2.c = i5;
                    eju0Var2.d = str3;
                }
            }
        }
    }
}
