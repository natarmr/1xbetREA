package a;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class oiv0 extends niv0 {
    public oiv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
    }

    @Override // a.uiv0
    public xiv0 a() {
        return xiv0.h(this.c.consumeDisplayCutout(), null);
    }

    @Override // a.miv0, a.uiv0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiv0)) {
            return false;
        }
        oiv0 oiv0Var = (oiv0) obj;
        return Objects.equals(this.c, oiv0Var.c) && Objects.equals(this.g, oiv0Var.g) && miv0.M(this.h, oiv0Var.h);
    }

    @Override // a.uiv0
    public vvk h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new vvk(displayCutout);
    }

    @Override // a.uiv0
    public int hashCode() {
        return this.c.hashCode();
    }

    public oiv0(xiv0 xiv0Var, oiv0 oiv0Var) {
        super(xiv0Var, oiv0Var);
    }
}
