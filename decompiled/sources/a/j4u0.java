package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j4u0 extends i4u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a390[] f15902a;
    public String b;
    public int c;

    public j4u0(j4u0 j4u0Var) {
        this.f15902a = null;
        this.c = 0;
        this.b = j4u0Var.b;
        a390[] a390VarArr = j4u0Var.f15902a;
        a390[] a390VarArr2 = new a390[a390VarArr.length];
        for (int i = 0; i < a390VarArr.length; i++) {
            a390VarArr2[i] = new a390(a390VarArr[i]);
        }
        this.f15902a = a390VarArr2;
    }

    public a390[] getPathData() {
        return this.f15902a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(a390[] a390VarArr) {
        a390[] a390VarArr2 = this.f15902a;
        if (a390VarArr2 != null && a390VarArr != null && a390VarArr2.length == a390VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= a390VarArr2.length) {
                    a390[] a390VarArr3 = this.f15902a;
                    for (int i2 = 0; i2 < a390VarArr.length; i2++) {
                        a390VarArr3[i2].f161a = a390VarArr[i2].f161a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = a390VarArr[i2].b;
                            if (i3 < fArr.length) {
                                a390VarArr3[i2].b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                a390 a390Var = a390VarArr2[i];
                char c = a390Var.f161a;
                a390 a390Var2 = a390VarArr[i];
                if (c != a390Var2.f161a || a390Var.b.length != a390Var2.b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        a390[] a390VarArr4 = new a390[a390VarArr.length];
        for (int i4 = 0; i4 < a390VarArr.length; i4++) {
            a390VarArr4[i4] = new a390(a390VarArr[i4]);
        }
        this.f15902a = a390VarArr4;
    }

    public j4u0() {
        this.f15902a = null;
        this.c = 0;
    }
}
