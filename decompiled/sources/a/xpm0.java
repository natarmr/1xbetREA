package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41277a;
    public final int b;
    public final int c;
    public final odd d;

    public xpm0(ArrayList arrayList, int i, int i2, odd oddVar) {
        this.f41277a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = oddVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xpm0) {
            xpm0 xpm0Var = (xpm0) obj;
            return this.f41277a.equals(xpm0Var.f41277a) && this.b == xpm0Var.b && this.c == xpm0Var.c && this.d == xpm0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f41277a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CaptureRequest(captureConfigs=" + this.f41277a + ", captureMode=" + this.b + ", flashType=" + this.c + ", result=" + this.d + ')';
    }
}
