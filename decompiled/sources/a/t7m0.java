package a;

import android.util.StateSet;

/* JADX INFO: loaded from: classes2.dex */
public final class t7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33476a;
    public akj0 b;
    public int[][] c;
    public akj0[] d;
    public s7m0 e;
    public s7m0 f;
    public s7m0 g;
    public s7m0 h;

    public t7m0(akj0 akj0Var) {
        c();
        a(StateSet.WILD_CARD, akj0Var);
    }

    public final void a(int[] iArr, akj0 akj0Var) {
        int i = this.f33476a;
        if (i == 0 || iArr.length == 0) {
            this.b = akj0Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            akj0[] akj0VarArr = new akj0[i2];
            System.arraycopy(this.d, 0, akj0VarArr, 0, i);
            this.d = akj0VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.f33476a;
        iArr4[i3] = iArr;
        this.d[i3] = akj0Var;
        this.f33476a = i3 + 1;
    }

    public final u7m0 b() {
        if (this.f33476a == 0) {
            return null;
        }
        return new u7m0(this);
    }

    public final void c() {
        this.b = new akj0();
        this.c = new int[10][];
        this.d = new akj0[10];
    }
}
