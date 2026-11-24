package androidx.constraintlayout.widget;

import a.fqd0;
import a.jvv;
import a.k4e;
import a.l4e;
import a.m3e;
import a.n3e;
import a.n4e;
import a.zu5;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int h;
    public zu5 i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.i.x0;
    }

    public int getMargin() {
        return this.i.y0;
    }

    public int getType() {
        return this.h;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.i = new zu5();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fqd0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.i.x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.i.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.i;
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(m3e m3eVar, jvv jvvVar, n4e n4eVar, SparseArray sparseArray) {
        super.j(m3eVar, jvvVar, n4eVar, sparseArray);
        n3e n3eVar = m3eVar.e;
        if (jvvVar instanceof zu5) {
            zu5 zu5Var = (zu5) jvvVar;
            n(zu5Var, n3eVar.g0, ((l4e) jvvVar.V).z0);
            zu5Var.x0 = n3eVar.o0;
            zu5Var.y0 = n3eVar.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(k4e k4eVar, boolean z) {
        n(k4eVar, this.h, z);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public final void n(k4e k4eVar, int i, boolean z) {
        int i2 = this.h;
        if (z) {
            if (i2 == 5) {
                i = 1;
            } else if (i2 == 6) {
                i = 0;
            }
        } else if (i2 == 5) {
            i = 0;
        } else if (i2 == 6) {
            i = 1;
        }
        if (k4eVar instanceof zu5) {
            ((zu5) k4eVar).w0 = i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.x0 = z;
    }

    public void setDpMargin(int i) {
        this.i.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i.y0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
