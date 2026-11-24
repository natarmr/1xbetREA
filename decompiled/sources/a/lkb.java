package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lkb implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20192a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ lkb(l7m0 l7m0Var, float f, float f2, Function1 function1, byte b) {
        this.f20192a = b;
        this.b = l7m0Var;
        this.c = f;
        this.d = f2;
        this.e = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.f20192a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.e;
        l7m0 l7m0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                int i8 = 256;
                l7m0 l7m0Var2 = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                l7m0Var2.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (fetVar.g(l7m0Var2) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 384) == 0) {
                    if (!fetVar.d(yclVar.f42389a)) {
                        i8 = 128;
                    }
                    i |= i8;
                }
                if (fetVar.U(i & 1, (i & 1155) != 1154)) {
                    gnm0.b(l7m0Var2, fetVar, i & 14);
                    flb flbVar = (flb) ((klb) l7m0Var.getValue()).f18478a.getValue();
                    float f = yclVar.f42389a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dib(function1, (byte) 5);
                        fetVar.o0(objP);
                    }
                    ntr.o(null, flbVar, l7m0Var2, this.c, this.d, f, (Function0) objP, fetVar, ((i << 6) & 896) | ((i << 9) & 458752));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int i9 = 256;
                l7m0 l7m0Var3 = (l7m0) obj;
                ycl yclVar2 = (ycl) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var3.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (fetVar2.g(l7m0Var3) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (!fetVar2.d(yclVar2.f42389a)) {
                        i9 = 128;
                    }
                    i2 |= i9;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1155) != 1154)) {
                    f9o f9oVar = (f9o) ((g9o) l7m0Var.getValue()).f10924a.getValue();
                    float f2 = yclVar2.f42389a;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new s8o(function1, b2);
                        fetVar2.o0(objP2);
                    }
                    b34.t(null, f9oVar, l7m0Var3, this.c, this.d, f2, (Function0) objP2, fetVar2, ((i2 << 6) & 896) | ((i2 << 9) & 458752));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int i10 = 256;
                l7m0 l7m0Var4 = (l7m0) obj;
                ycl yclVar3 = (ycl) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                l7m0Var4.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (fetVar3.g(l7m0Var4) ? 4 : 2);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 384) == 0) {
                    if (!fetVar3.d(yclVar3.f42389a)) {
                        i10 = 128;
                    }
                    i3 |= i10;
                }
                if (fetVar3.U(i3 & 1, (i3 & 1155) != 1154)) {
                    l7m0 l7m0Var5 = ((zew) l7m0Var.getValue()).f44273a;
                    float f3 = yclVar3.f42389a;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dht(function1, (byte) 13);
                        fetVar3.o0(objP3);
                    }
                    Function1 function2 = (Function1) objP3;
                    boolean zG4 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new i8v(function1, (byte) 11);
                        fetVar3.o0(objP4);
                    }
                    fxb.u(null, l7m0Var5, l7m0Var4, this.c, this.d, f3, function2, (Function0) objP4, fetVar3, ((i3 << 6) & 896) | ((i3 << 9) & 458752), 1);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                int i11 = 256;
                l7m0 l7m0Var6 = (l7m0) obj;
                ycl yclVar4 = (ycl) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                l7m0Var6.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue4 & 6) == 0) {
                    i4 = iIntValue4 | (fetVar4.g(l7m0Var6) ? 4 : 2);
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    if (!fetVar4.d(yclVar4.f42389a)) {
                        i11 = 128;
                    }
                    i4 |= i11;
                }
                if (fetVar4.U(i4 & 1, (i4 & 1155) != 1154)) {
                    l7m0 l7m0Var7 = ((vzh0) l7m0Var.getValue()).f38300a;
                    float f4 = yclVar4.f42389a;
                    boolean zG5 = fetVar4.g(function1);
                    Object objP5 = fetVar4.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new dng0(function1, (byte) 22);
                        fetVar4.o0(objP5);
                    }
                    fxb.u(null, l7m0Var7, l7m0Var6, this.c, this.d, f4, null, (Function0) objP5, fetVar4, ((i4 << 6) & 896) | ((i4 << 9) & 458752), 65);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                int i12 = 256;
                l7m0 l7m0Var8 = (l7m0) obj;
                ycl yclVar5 = (ycl) obj3;
                fet fetVar5 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                l7m0Var8.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue5 & 6) == 0) {
                    i5 = iIntValue5 | (fetVar5.g(l7m0Var8) ? 4 : 2);
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    if (!fetVar5.d(yclVar5.f42389a)) {
                        i12 = 128;
                    }
                    i5 |= i12;
                }
                if (fetVar5.U(i5 & 1, (i5 & 1155) != 1154)) {
                    rq8.E(null, (qbp0) ((sbp0) l7m0Var.getValue()).f31946a.getValue(), l7m0Var8, this.c, this.d, yclVar5.f42389a, this.e, fetVar5, ((i5 << 6) & 896) | ((i5 << 9) & 458752));
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                l7m0 l7m0Var9 = (l7m0) obj;
                ycl yclVar6 = (ycl) obj3;
                int i13 = 256;
                fet fetVar6 = (fet) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                l7m0Var9.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue6 & 6) == 0) {
                    i6 = iIntValue6 | (fetVar6.g(l7m0Var9) ? 4 : 2);
                } else {
                    i6 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    if (!fetVar6.d(yclVar6.f42389a)) {
                        i13 = 128;
                    }
                    i6 |= i13;
                }
                if (fetVar6.U(i6 & 1, (i6 & 1155) != 1154)) {
                    gnm0.b(l7m0Var9, fetVar6, i6 & 14);
                    edt0 edt0Var = (edt0) ((fdt0) l7m0Var.getValue()).f9374a.getValue();
                    float f5 = yclVar6.f42389a;
                    boolean zG6 = fetVar6.g(function1);
                    Object objP6 = fetVar6.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new nas0(function1, (byte) 29);
                        fetVar6.o0(objP6);
                    }
                    aad.E(null, edt0Var, l7m0Var9, this.c, this.d, f5, (Function0) objP6, fetVar6, ((i6 << 6) & 896) | ((i6 << 9) & 458752));
                } else {
                    fetVar6.X();
                }
                break;
            default:
                pz40 pz40Var = (pz40) l7m0Var;
                l7m0 l7m0Var10 = (l7m0) obj;
                ycl yclVar7 = (ycl) obj3;
                fet fetVar7 = (fet) obj4;
                int iIntValue7 = ((Integer) obj5).intValue();
                l7m0Var10.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue7 & 6) == 0) {
                    i7 = (fetVar7.g(l7m0Var10) ? 4 : 2) | iIntValue7;
                } else {
                    i7 = iIntValue7;
                }
                if ((iIntValue7 & 384) == 0) {
                    i7 |= fetVar7.d(yclVar7.f42389a) ? 256 : 128;
                }
                if (fetVar7.U(i7 & 1, (i7 & 1155) != 1154)) {
                    wpu0 wpu0Var = ((xpu0) pz40Var.getValue()).f41284a;
                    float f6 = yclVar7.f42389a;
                    boolean zG7 = fetVar7.g(function1);
                    Object objP7 = fetVar7.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new zbt0(function1, (byte) 22);
                        fetVar7.o0(objP7);
                    }
                    q8a.J(null, wpu0Var, l7m0Var10, this.c, this.d, f6, (Function0) objP7, fetVar7, ((i7 << 6) & 896) | ((i7 << 9) & 458752));
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
