package a;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final class ji30 extends zjb {
    public final int e;

    public ji30(int i) {
        this.e = i;
    }

    @Override // a.zjb
    public final float I(Object obj) {
        float[] fArr = ((ki30) obj).Y;
        if (fArr != null) {
            return fArr[this.e];
        }
        return 0.0f;
    }

    @Override // a.zjb
    public final void M(Object obj, float f) {
        ki30 ki30Var = (ki30) obj;
        float[] fArr = ki30Var.Y;
        if (fArr != null) {
            int i = this.e;
            if (fArr[i] != f) {
                fArr[i] = f;
                viq viqVar = ki30Var.f1;
                if (viqVar != null) {
                    float fI = ki30Var.i();
                    MaterialButton materialButton = (MaterialButton) viqVar.b;
                    int[] iArr = MaterialButton.r1;
                    int i2 = (int) (fI * 0.11f);
                    if (materialButton.i1 != i2) {
                        materialButton.i1 = i2;
                        materialButton.w();
                        materialButton.invalidate();
                    }
                }
                ki30Var.invalidateSelf();
            }
        }
    }
}
