package a;

import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.ui.platform.AndroidComposeView;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f42 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8891a;
    public final Object b;

    public /* synthetic */ f42(Object obj, byte b) {
        this.f8891a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        iun iunVar;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        iun iunVar2;
        Object value13;
        Object value14;
        Object value15;
        iun iunVar3;
        byte b = this.f8891a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                w32 w32Var = new w32(m32.b, iun.f15405a);
                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                ((org.xplatform.special_event.impl.alleventsgames.presentation.f) obj3).R(w32Var);
                break;
            case 1:
                int i2 = ((jpq) obj).f16914a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numC = spq.c(i2);
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    ((AndroidComposeView) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? la3.f19687a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                boolean z = th instanceof ff5;
                gfd gfdVar = (gfd) obj3;
                oyg0 oyg0Var = gfdVar.f;
                ocj ocjVar = gfdVar.i;
                if (z) {
                    int i3 = gfd.u;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, cfd.a((cfd) value2, 0L, false, false, true, null, 17)));
                } else {
                    int i4 = gfd.u;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, cfd.a((cfd) value, 0L, false, true, false, null, 17)));
                }
                break;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                boolean z2 = th2 instanceof ff5;
                kfd kfdVar = (kfd) obj3;
                oyg0 oyg0Var2 = kfdVar.f;
                ocj ocjVar2 = kfdVar.i;
                if (z2) {
                    int i5 = kfd.w;
                    p7m0 p7m0Var3 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var2.getClass();
                        iunVar = iun.f15405a;
                        iunVar.getClass();
                    } while (!p7m0Var3.m(value4, new sed(iunVar, false, false)));
                } else {
                    int i6 = kfd.w;
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var4.m(value3, sed.a((sed) value3, false, true)));
                }
                break;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    nkb.d(null, (fuf) obj3, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 5:
                fet fetVar2 = (fet) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lw3 lw3Var = uc9.b;
                    yx7 yx7Var = gqw0.k;
                    ugd ugdVar = ((m3k0) obj3).f;
                    thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 54);
                    int iX = e3c.x(fetVar2);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar2, iX, shdVar);
                    }
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    h97.p(6, ugdVar, zhg0.f44392a, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                boolean z3 = th3 instanceof ff5;
                wgp wgpVar = (wgp) obj3;
                oyg0 oyg0Var3 = wgpVar.f;
                ocj ocjVar3 = wgpVar.i;
                if (z3) {
                    int i7 = wgp.v;
                    p7m0 p7m0Var5 = ocjVar3.f25029a;
                    do {
                        value6 = p7m0Var5.getValue();
                        value6.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var5.m(value6, rgp.a((rgp) value6, false, false, true)));
                } else {
                    int i8 = wgp.v;
                    p7m0 p7m0Var6 = ocjVar3.f25029a;
                    do {
                        value5 = p7m0Var6.getValue();
                        value5.getClass();
                        oyg0Var3.getClass();
                    } while (!p7m0Var6.m(value5, rgp.a((rgp) value5, false, true, false)));
                }
                break;
            case 7:
                Throwable th4 = (Throwable) obj;
                r8q r8qVar = (r8q) obj3;
                th4.getClass();
                ((String) obj2).getClass();
                if (th4 instanceof zhi0) {
                    wej wejVar = new wej(0, r8qVar, r8q.class, "setErrorState", "setErrorState()V", 0, (byte) 15);
                    ocq ocqVar = r8q.Y;
                    r8qVar.B((zhi0) th4, wejVar);
                } else if (th4 instanceof UnknownHostException) {
                    ocq ocqVar2 = r8q.Y;
                    r8qVar.F();
                } else {
                    ocq ocqVar3 = r8q.Y;
                    r8qVar.F();
                }
                break;
            case 8:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((String) obj2).getClass();
                boolean z4 = th5 instanceof ff5;
                wzy wzyVar = (wzy) obj3;
                oyg0 oyg0Var4 = wzyVar.f;
                ocj ocjVar4 = wzyVar.i;
                if (z4) {
                    int i9 = wzy.v;
                    p7m0 p7m0Var7 = ocjVar4.f25029a;
                    do {
                        value8 = p7m0Var7.getValue();
                        value8.getClass();
                        oyg0Var4.getClass();
                    } while (!p7m0Var7.m(value8, rzy.a((rzy) value8, false, false, true)));
                } else {
                    int i10 = wzy.v;
                    p7m0 p7m0Var8 = ocjVar4.f25029a;
                    do {
                        value7 = p7m0Var8.getValue();
                        value7.getClass();
                        oyg0Var4.getClass();
                    } while (!p7m0Var8.m(value7, rzy.a((rzy) value7, false, true, false)));
                }
                break;
            case 9:
                fet fetVar3 = (fet) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objP = fetVar3.P();
                    if (objP == ukd.f35823a) {
                        objP = new da40((byte) 8);
                        fetVar3.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(jm40Var, false, (Function1) objP);
                    pz40 pz40Var = (pz40) obj3;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iX2 = e3c.x(fetVar3);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarA);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    shd shdVar2 = gqw0.y;
                    if (fetVar3.S || !Intrinsics.d(fetVar3.P(), Integer.valueOf(iX2))) {
                        rw2.t(iX2, fetVar3, iX2, shdVar2);
                    }
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    h97.q(0, fetVar3, (Function2) pz40Var.getValue(), true);
                } else {
                    fetVar3.X();
                }
                break;
            case 10:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((String) obj2).getClass();
                boolean z5 = th6 instanceof ff5;
                esd0 esd0Var = (esd0) obj3;
                oyg0 oyg0Var5 = esd0Var.f;
                ocj ocjVar5 = esd0Var.i;
                if (z5) {
                    int i11 = esd0.v;
                    p7m0 p7m0Var9 = ocjVar5.f25029a;
                    do {
                        value10 = p7m0Var9.getValue();
                        value10.getClass();
                        oyg0Var5.getClass();
                    } while (!p7m0Var9.m(value10, yrd0.a((yrd0) value10, false, false, null, 0L, 8)));
                } else {
                    int i12 = esd0.v;
                    p7m0 p7m0Var10 = ocjVar5.f25029a;
                    do {
                        value9 = p7m0Var10.getValue();
                        value9.getClass();
                        oyg0Var5.getClass();
                    } while (!p7m0Var10.m(value9, yrd0.a((yrd0) value9, false, true, null, 0L, 12)));
                }
                break;
            case 11:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((String) obj2).getClass();
                boolean z6 = th7 instanceof ff5;
                kje0 kje0Var = (kje0) obj3;
                oyg0 oyg0Var6 = kje0Var.f;
                ocj ocjVar6 = kje0Var.i;
                if (z6) {
                    int i13 = kje0.u;
                    p7m0 p7m0Var11 = ocjVar6.f25029a;
                    do {
                        value12 = p7m0Var11.getValue();
                        value12.getClass();
                        oyg0Var6.getClass();
                        iunVar2 = iun.f15405a;
                        iunVar2.getClass();
                    } while (!p7m0Var11.m(value12, new dje0(iunVar2, false, false)));
                } else {
                    int i14 = kje0.u;
                    p7m0 p7m0Var12 = ocjVar6.f25029a;
                    do {
                        value11 = p7m0Var12.getValue();
                        value11.getClass();
                        oyg0Var6.getClass();
                    } while (!p7m0Var12.m(value11, dje0.a((dje0) value11, false, true)));
                }
                break;
            case 12:
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    bkg0 bkg0Var = (bkg0) obj3;
                    j120.y(bkg0Var.f2745a, bkg0Var.b, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                zjs0 zjs0Var = (zjs0) obj3;
                int i15 = zjs0.t;
                p7m0 p7m0Var13 = zjs0Var.i.f25029a;
                do {
                    value13 = p7m0Var13.getValue();
                    value13.getClass();
                    zjs0Var.f.getClass();
                } while (!p7m0Var13.m(value13, tjs0.a((tjs0) value13, false, true)));
                break;
            default:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((String) obj2).getClass();
                xgt0 xgt0Var = (xgt0) obj3;
                int i16 = xgt0.w;
                oyg0 oyg0Var7 = xgt0Var.f;
                ocj ocjVar7 = xgt0Var.i;
                if (th8 instanceof ff5) {
                    p7m0 p7m0Var14 = ocjVar7.f25029a;
                    do {
                        value15 = p7m0Var14.getValue();
                        value15.getClass();
                        oyg0Var7.getClass();
                        iunVar3 = iun.f15405a;
                        iunVar3.getClass();
                    } while (!p7m0Var14.m(value15, new sgt0(iunVar3, false, false)));
                } else {
                    p7m0 p7m0Var15 = ocjVar7.f25029a;
                    do {
                        value14 = p7m0Var15.getValue();
                        value14.getClass();
                        oyg0Var7.getClass();
                    } while (!p7m0Var15.m(value14, sgt0.a((sgt0) value14, false, true)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
