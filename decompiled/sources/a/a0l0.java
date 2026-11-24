package a;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class a0l0 extends sz5 {
    public final PointF i;
    public final PointF j;
    public final hlq k;
    public final hlq l;
    public zn00 m;
    public zn00 n;

    public a0l0(hlq hlqVar, hlq hlqVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = hlqVar;
        this.l = hlqVar2;
        i(this.d);
    }

    @Override // a.sz5
    public final Object e() {
        return l();
    }

    @Override // a.sz5
    public final /* bridge */ /* synthetic */ Object f(cmy cmyVar, float f) {
        return l();
    }

    @Override // a.sz5
    public final void i(float f) {
        hlq hlqVar = this.k;
        hlqVar.i(f);
        hlq hlqVar2 = this.l;
        hlqVar2.i(f);
        this.i.set(((Float) hlqVar.e()).floatValue(), ((Float) hlqVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f33053a;
            if (i >= arrayList.size()) {
                return;
            }
            ((oz5) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final PointF l() {
        Float f;
        Float f2 = null;
        if (this.m != null) {
            hlq hlqVar = this.k;
            cmy cmyVarB = hlqVar.c.b();
            if (cmyVarB != null) {
                Float f3 = cmyVarB.h;
                zn00 zn00Var = this.m;
                float f4 = cmyVarB.g;
                f = (Float) zn00Var.L0(f4, f3 == null ? f4 : f3.floatValue(), (Float) cmyVarB.b, (Float) cmyVarB.c, hlqVar.c(), hlqVar.d(), hlqVar.d);
            } else {
                f = null;
            }
        } else {
            f = null;
        }
        if (this.n != null) {
            hlq hlqVar2 = this.l;
            cmy cmyVarB2 = hlqVar2.c.b();
            if (cmyVarB2 != null) {
                Float f5 = cmyVarB2.h;
                zn00 zn00Var2 = this.n;
                float f6 = cmyVarB2.g;
                f2 = (Float) zn00Var2.L0(f6, f5 == null ? f6 : f5.floatValue(), (Float) cmyVarB2.b, (Float) cmyVarB2.c, hlqVar2.c(), hlqVar2.d(), hlqVar2.d);
            }
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }
}
