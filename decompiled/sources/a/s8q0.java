package a;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class s8q0 extends zn00 {
    public final /* synthetic */ gb10 c;
    public final /* synthetic */ zn00 d;
    public final /* synthetic */ uxk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8q0(gb10 gb10Var, zn00 zn00Var, uxk uxkVar) {
        super((byte) 2);
        this.c = gb10Var;
        this.d = zn00Var;
        this.e = uxkVar;
    }

    @Override // a.zn00
    public final Object K0(gb10 gb10Var) {
        float f = gb10Var.f10994a;
        float f2 = gb10Var.b;
        String str = ((uxk) gb10Var.f).f36444a;
        String str2 = ((uxk) gb10Var.g).f36444a;
        float f3 = gb10Var.c;
        float f4 = gb10Var.d;
        float f5 = gb10Var.e;
        gb10 gb10Var2 = this.c;
        gb10Var2.f10994a = f;
        gb10Var2.b = f2;
        gb10Var2.f = str;
        gb10Var2.g = str2;
        gb10Var2.c = f3;
        gb10Var2.d = f4;
        gb10Var2.e = f5;
        String str3 = (String) ((ayj0) this.d.b);
        uxk uxkVar = (uxk) (gb10Var.d == 1.0f ? gb10Var.g : gb10Var.f);
        String str4 = uxkVar.b;
        float f6 = uxkVar.c;
        int i = uxkVar.d;
        int i2 = uxkVar.e;
        float f7 = uxkVar.f;
        float f8 = uxkVar.g;
        int i3 = uxkVar.h;
        int i4 = uxkVar.i;
        float f9 = uxkVar.j;
        boolean z = uxkVar.k;
        PointF pointF = uxkVar.l;
        PointF pointF2 = uxkVar.m;
        uxk uxkVar2 = this.e;
        uxkVar2.f36444a = str3;
        uxkVar2.b = str4;
        uxkVar2.c = f6;
        uxkVar2.d = i;
        uxkVar2.e = i2;
        uxkVar2.f = f7;
        uxkVar2.g = f8;
        uxkVar2.h = i3;
        uxkVar2.i = i4;
        uxkVar2.j = f9;
        uxkVar2.k = z;
        uxkVar2.l = pointF;
        uxkVar2.m = pointF2;
        return uxkVar2;
    }
}
