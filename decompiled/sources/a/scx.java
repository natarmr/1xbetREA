package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class scx extends zna0 {
    public final boolean l;

    public scx(String str, pjt pjtVar) {
        super(str, pjtVar, 1);
        this.l = true;
    }

    @Override // a.zna0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof scx) {
            ugi0 ugi0Var = (ugi0) obj;
            if (Intrinsics.d(this.f44667a, ugi0Var.h())) {
                scx scxVar = (scx) obj;
                if (scxVar.l && Arrays.equals((ugi0[]) this.j.getValue(), (ugi0[]) scxVar.j.getValue())) {
                    int iD = ugi0Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.d(g(i2).h(), ugi0Var.g(i2).h()) && Intrinsics.d(g(i2).l(), ugi0Var.g(i2).l())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // a.zna0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // a.ugi0
    public final boolean isInline() {
        return this.l;
    }
}
