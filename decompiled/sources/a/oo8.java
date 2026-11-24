package a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class oo8 implements w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25582a;
    public final Object b;

    public oo8(rbu0 rbu0Var, rbu0 rbu0Var2) {
        this.f25582a = (byte) 62;
        this.b = new rbu0[]{rbu0Var, rbu0Var2};
    }

    @Override // a.w7
    public boolean e(View view) {
        ((BottomSheetBehavior) this.b).N(this.f25582a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo8(int i, rbu0 rbu0Var) {
        this.f25582a = i;
        this.b = new rbu0[]{rbu0Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oo8(int i, Object obj) {
        this.f25582a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo8(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.f25582a = i;
    }
}
