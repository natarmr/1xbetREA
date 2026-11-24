package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yw8 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43358a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fy8 f;

    public /* synthetic */ yw8(fy8 fy8Var, float f, float f2, Function1 function1, boolean z, byte b) {
        this.f43358a = b;
        this.f = fy8Var;
        this.b = f;
        this.c = f2;
        this.d = function1;
        this.e = z;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        byte b = this.f43358a;
        boolean z = this.e;
        fy8 fy8Var = this.f;
        switch (b) {
            case 0:
                cy8 cy8Var = (cy8) fy8Var;
                l7m0 l7m0Var = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                l7m0Var.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (fetVar.g(l7m0Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    i |= fetVar.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1155) != 1154)) {
                    xf0.f(null, cy8Var.b, cy8Var.f, cy8Var.c, cy8Var.d, l7m0Var, this.b, this.c, yclVar.f42389a, this.d, u1c.M(-1066717438, new m87(cy8Var, (byte) 19), fetVar), fetVar, (458752 & (i << 15)) | ((i << 18) & 234881024));
                    vbc.f(l7m0Var, z ? R.attr.uikitBackgroundContent : R.attr.uikitStaticTransparent, fetVar, i & 14);
                } else {
                    fetVar.X();
                }
                break;
            default:
                dy8 dy8Var = (dy8) fy8Var;
                l7m0 l7m0Var2 = (l7m0) obj;
                ycl yclVar2 = (ycl) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var2.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = (fetVar2.g(l7m0Var2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= fetVar2.d(yclVar2.f42389a) ? 256 : 128;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1155) != 1154)) {
                    xf0.f(null, dy8Var.b, dy8Var.f, dy8Var.c, dy8Var.d, l7m0Var2, this.b, this.c, yclVar2.f42389a, this.d, u1c.M(2070937670, new m87(dy8Var, (byte) 20), fetVar2), fetVar2, (458752 & (i2 << 15)) | ((i2 << 18) & 234881024));
                    vbc.f(l7m0Var2, z ? R.attr.uikitBackgroundContent : R.attr.uikitBackground, fetVar2, i2 & 14);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
