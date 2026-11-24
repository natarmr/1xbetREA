package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xky extends rjy {
    public int f = -1;
    public String g = null;
    public int h = -1;
    public int i = 0;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public int n = 0;

    public xky() {
        this.d = (byte) 2;
    }

    @Override // a.rjy
    public final void a(HashMap map) {
        throw null;
    }

    @Override // a.rjy
    /* JADX INFO: renamed from: b */
    public final rjy clone() {
        xky xkyVar = new xky();
        super.c(this);
        xkyVar.g = this.g;
        xkyVar.h = this.h;
        xkyVar.i = this.i;
        xkyVar.j = this.j;
        xkyVar.k = Float.NaN;
        xkyVar.l = this.l;
        xkyVar.m = this.m;
        return xkyVar;
    }

    @Override // a.rjy
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fqd0.h);
        SparseIntArray sparseIntArray = wky.f39330a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = wky.f39330a;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.g = fhn.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                    break;
                case 6:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 7:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    this.j = f;
                    this.k = f;
                    break;
                case 9:
                    this.n = typedArrayObtainStyledAttributes.getInt(index, this.n);
                    break;
                case 10:
                    this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    break;
                case 11:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 12:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f30620a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
