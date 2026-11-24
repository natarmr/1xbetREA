package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qdy extends ody {
    public final edy j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdy(vby vbyVar, edy edyVar) {
        super(vbyVar, edyVar, (String) null, 12);
        vbyVar.getClass();
        this.j = edyVar;
        List listL0 = CollectionsKt.L0(edyVar.f7643a.keySet());
        this.k = listL0;
        this.l = listL0.size() * 2;
        this.m = -1;
    }

    @Override // a.ody, a.t2
    public final mcy F(String str) {
        str.getClass();
        return this.m % 2 == 0 ? ncy.c(str) : (mcy) xp20.d(this.j, str);
    }

    @Override // a.ody, a.t2
    public final String R(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // a.ody, a.t2
    public final mcy T() {
        return this.j;
    }

    @Override // a.ody
    /* JADX INFO: renamed from: Y */
    public final edy T() {
        return this.j;
    }

    @Override // a.ody, a.t2, a.bld
    public final void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
    }

    @Override // a.ody, a.bld
    public final int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
