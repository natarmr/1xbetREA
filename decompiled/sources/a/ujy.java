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
public final class ujy extends rjy {
    public int f = -1;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;

    public ujy() {
        this.d = (byte) 1;
        this.e = new HashMap();
    }

    @Override // a.rjy
    public final void a(HashMap map) {
        for (String str : map.keySet()) {
            zzk0 zzk0Var = (zzk0) map.get(str);
            if (zzk0Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                zzk0Var.b(this.j, this.f30620a);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                zzk0Var.b(this.k, this.f30620a);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                zzk0Var.b(this.q, this.f30620a);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                zzk0Var.b(this.r, this.f30620a);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                zzk0Var.b(this.s, this.f30620a);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.t)) {
                                break;
                            } else {
                                zzk0Var.b(this.t, this.f30620a);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                zzk0Var.b(this.o, this.f30620a);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                zzk0Var.b(this.p, this.f30620a);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                zzk0Var.b(this.l, this.f30620a);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                zzk0Var.b(this.m, this.f30620a);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                zzk0Var.b(this.i, this.f30620a);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                zzk0Var.b(this.h, this.f30620a);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                zzk0Var.b(this.n, this.f30620a);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                zzk0Var.b(this.g, this.f30620a);
                                break;
                            }
                            break;
                    }
                } else {
                    x2e x2eVar = (x2e) this.e.get(str.substring(7));
                    if (x2eVar != null) {
                        ((alu0) zzk0Var).f.append(this.f30620a, x2eVar);
                    }
                }
            }
        }
    }

    @Override // a.rjy
    /* JADX INFO: renamed from: b */
    public final rjy clone() {
        ujy ujyVar = new ujy();
        super.c(this);
        ujyVar.f = this.f;
        ujyVar.g = this.g;
        ujyVar.h = this.h;
        ujyVar.i = this.i;
        ujyVar.j = this.j;
        ujyVar.k = this.k;
        ujyVar.l = this.l;
        ujyVar.m = this.m;
        ujyVar.n = this.n;
        ujyVar.o = this.o;
        ujyVar.p = this.p;
        ujyVar.q = this.q;
        ujyVar.r = this.r;
        ujyVar.s = this.s;
        ujyVar.t = this.t;
        return ujyVar;
    }

    @Override // a.rjy
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fqd0.f);
        SparseIntArray sparseIntArray = tjy.f34071a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = tjy.f34071a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 2:
                    this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 5:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 6:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 8:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f30620a = typedArrayObtainStyledAttributes.getInt(index, this.f30620a);
                    break;
                case 13:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 14:
                    this.p = typedArrayObtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 16:
                    this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 17:
                    this.s = typedArrayObtainStyledAttributes.getDimension(index, this.s);
                    break;
                case 18:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 20:
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                    break;
            }
        }
    }

    @Override // a.rjy
    public final void f(HashMap map) {
        if (this.f == -1) {
            return;
        }
        if (!Float.isNaN(this.g)) {
            map.put("alpha", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.h)) {
            map.put("elevation", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotation", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.k)) {
            map.put("rotationY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.l)) {
            map.put("transformPivotX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transformPivotY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.r)) {
            map.put("translationY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.s)) {
            map.put("translationZ", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.p)) {
            map.put("scaleY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.t)) {
            map.put("progress", Integer.valueOf(this.f));
        }
        if (this.e.size() > 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                map.put(kng0.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f));
            }
        }
    }
}
