package androidx.constraintlayout.helper.widget;

import a.fqd0;
import a.hmq;
import a.jvv;
import a.k4e;
import a.m3e;
import a.n4e;
import a.yru0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends yru0 {
    public hmq j;

    public Flow(Context context) {
        super(context);
    }

    @Override // a.yru0, androidx.constraintlayout.widget.ConstraintHelper
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.j = new hmq();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fqd0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.j.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    hmq hmqVar = this.j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hmqVar.w0 = dimensionPixelSize;
                    hmqVar.x0 = dimensionPixelSize;
                    hmqVar.y0 = dimensionPixelSize;
                    hmqVar.z0 = dimensionPixelSize;
                } else if (index == 18) {
                    hmq hmqVar2 = this.j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hmqVar2.y0 = dimensionPixelSize2;
                    hmqVar2.A0 = dimensionPixelSize2;
                    hmqVar2.B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.j;
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(m3e m3eVar, jvv jvvVar, n4e n4eVar, SparseArray sparseArray) {
        super.j(m3eVar, jvvVar, n4eVar, sparseArray);
        if (jvvVar instanceof hmq) {
            hmq hmqVar = (hmq) jvvVar;
            int i = n4eVar.V;
            if (i != -1) {
                hmqVar.Z0 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(k4e k4eVar, boolean z) {
        hmq hmqVar = this.j;
        int i = hmqVar.y0;
        if (i > 0 || hmqVar.z0 > 0) {
            if (z) {
                hmqVar.A0 = hmqVar.z0;
                hmqVar.B0 = i;
            } else {
                hmqVar.A0 = i;
                hmqVar.B0 = hmqVar.z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        n(this.j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.j.P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.j.J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.j.Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.j.K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.j.V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.j.N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.j.T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.j.H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.j.R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.j.L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.j.S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.j.M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.j.Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.j.Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        hmq hmqVar = this.j;
        hmqVar.w0 = i;
        hmqVar.x0 = i;
        hmqVar.y0 = i;
        hmqVar.z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.j.x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.j.A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.j.B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.j.w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.j.W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.j.O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.j.U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.j.I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.j.X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
