package a;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vmd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37671a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vmd0(int i, BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.b = i;
        this.d = bottomSheetBehavior;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.f37671a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                fl70 fl70Var = ymd0.o2;
                if (i2 <= 0) {
                    bottomSheetBehavior.M(-1);
                } else {
                    bottomSheetBehavior.M(i);
                }
                break;
            default:
                cmn0 cmn0Var = (cmn0) obj;
                boolean z2 = true;
                if (cmn0Var.i != i2) {
                    cmn0Var.i = i2;
                    z = true;
                } else {
                    z = false;
                }
                if (cmn0Var.h != i) {
                    cmn0Var.h = i;
                } else {
                    z2 = z;
                }
                if (z2) {
                    cmn0Var.e();
                }
                break;
        }
    }

    public /* synthetic */ vmd0(cmn0 cmn0Var, int i, int i2) {
        this.d = cmn0Var;
        this.b = i;
        this.c = i2;
    }
}
