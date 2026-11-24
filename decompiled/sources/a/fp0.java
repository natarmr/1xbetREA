package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fp0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9908a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ fp0(mm40 mm40Var, byte b) {
        this.f9908a = b;
        this.b = mm40Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = this.f9908a;
        jm40 jm40Var = jm40.b;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar = qmk.g;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                j83 j83Var = (j83) obj;
                j83 j83Var2 = (j83) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                j83Var.getClass();
                j83Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(j83Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.g(j83Var2) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    zfn zfnVar = j1t0.e;
                    ((g1t0) fetVar2.k(zfnVar)).getClass();
                    ucx.E(mm40Var, j83Var, g1t0.d(), fetVar2, ((i << 3) & 112) | 6);
                    ((g1t0) fetVar2.k(zfnVar)).getClass();
                    ucx.E(mm40Var, j83Var2, g1t0.d(), fetVar2, (i & 112) | 6);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                j83 j83Var3 = (j83) obj;
                j83 j83Var4 = (j83) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                j83Var3.getClass();
                j83Var4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (fetVar3.g(j83Var3) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= fetVar3.g(j83Var4) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40Var2 = this.b;
                    mm40 mm40VarE = o7k0.e(s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
                    zfn zfnVar2 = j1t0.e;
                    ((g1t0) fetVar3.k(zfnVar2)).getClass();
                    t9x.u(mm40VarE, j83Var3, g1t0.d(), fetVar3, (i2 << 3) & 112);
                    qxw.o(fetVar3, o7k0.e(jm40Var, 5.0f));
                    mm40 mm40VarE2 = o7k0.e(mm40Var2, 24.0f);
                    ((g1t0) fetVar3.k(zfnVar2)).getClass();
                    t9x.u(mm40VarE2, j83Var4, g1t0.d(), fetVar3, i2 & 112);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                j83 j83Var5 = (j83) obj;
                j83 j83Var6 = (j83) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                j83Var5.getClass();
                j83Var6.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (fetVar4.g(j83Var5) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= fetVar4.g(j83Var6) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40Var3 = this.b;
                    mm40 mm40VarE3 = o7k0.e(s5x0.N(mm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
                    zfn zfnVar3 = j1t0.e;
                    ((g1t0) fetVar4.k(zfnVar3)).getClass();
                    t9x.u(mm40VarE3, j83Var5, g1t0.g(), fetVar4, (i3 << 3) & 112);
                    qxw.o(fetVar4, o7k0.e(jm40Var, 5.0f));
                    mm40 mm40VarE4 = o7k0.e(mm40Var3, 24.0f);
                    ((g1t0) fetVar4.k(zfnVar3)).getClass();
                    t9x.u(mm40VarE4, j83Var6, g1t0.g(), fetVar4, i3 & 112);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                j83 j83Var7 = (j83) obj;
                j83 j83Var8 = (j83) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                j83Var7.getClass();
                j83Var8.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i4 = iIntValue5 | (fetVar5.g(j83Var7) ? 4 : 2);
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= fetVar5.g(j83Var8) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40Var4 = this.b;
                    mm40 mm40VarE5 = o7k0.e(s5x0.N(mm40Var4, 0.0f, 8.0f, 0.0f, 0.0f, 13), 32.0f);
                    zfn zfnVar4 = j1t0.e;
                    ((g1t0) fetVar5.k(zfnVar4)).getClass();
                    t9x.u(mm40VarE5, j83Var7, g1t0.g(), fetVar5, (i4 << 3) & 112);
                    qxw.o(fetVar5, o7k0.e(jm40Var, 17.0f));
                    mm40 mm40VarE6 = o7k0.e(mm40Var4, 32.0f);
                    ((g1t0) fetVar5.k(zfnVar4)).getClass();
                    t9x.u(mm40VarE6, j83Var8, g1t0.g(), fetVar5, i4 & 112);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                pm80 pm80Var = (pm80) obj;
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                pm80Var.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? fetVar6.g(pm80Var) : fetVar6.i(pm80Var) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 131) != 130)) {
                    zcl zclVar5 = qmk.f28987a;
                    j0x.b(pm80Var, null, lgb.J(o7k0.n(s5x0.J(mm40Var, 12.0f), 60.0f), vgg0.a(12.0f)), null, gqw0.A, 0.0f, null, fetVar6, 24632 | (iIntValue6 & 14), 104);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                pm80 pm80Var2 = (pm80) obj;
                fet fetVar7 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                pm80Var2.getClass();
                ((o0x) obj2).getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? fetVar7.g(pm80Var2) : fetVar7.i(pm80Var2) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 131) != 130)) {
                    j0x.b(pm80Var2, null, this.b, null, gqw0.A, 0.0f, null, fetVar7, 24632 | (iIntValue7 & 14), 104);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                j83 j83Var9 = (j83) obj;
                j83 j83Var10 = (j83) obj2;
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                j83Var9.getClass();
                j83Var10.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i5 = iIntValue8 | (fetVar8.g(j83Var9) ? 4 : 2);
                } else {
                    i5 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i5 |= fetVar8.g(j83Var10) ? 32 : 16;
                }
                if (fetVar8.U(i5 & 1, (i5 & 147) != 146)) {
                    zfn zfnVar5 = j1t0.e;
                    ((g1t0) fetVar8.k(zfnVar5)).getClass();
                    kcx.r(mm40Var, j83Var9, g1t0.d(), fetVar8, ((i5 << 3) & 112) | 6);
                    ((g1t0) fetVar8.k(zfnVar5)).getClass();
                    kcx.r(mm40Var, j83Var10, g1t0.d(), fetVar8, (i5 & 112) | 6);
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                j83 j83Var11 = (j83) obj;
                j83 j83Var12 = (j83) obj2;
                fet fetVar9 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                j83Var11.getClass();
                j83Var12.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i6 = iIntValue9 | (fetVar9.g(j83Var11) ? 4 : 2);
                } else {
                    i6 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i6 |= fetVar9.g(j83Var12) ? 32 : 16;
                }
                if (fetVar9.U(i6 & 1, (i6 & 147) != 146)) {
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40Var5 = this.b;
                    mm40 mm40VarE7 = o7k0.e(s5x0.N(mm40Var5, 0.0f, 8.0f, 0.0f, 0.0f, 13), 32.0f);
                    zfn zfnVar6 = j1t0.e;
                    ((g1t0) fetVar9.k(zfnVar6)).getClass();
                    t9x.u(mm40VarE7, j83Var11, g1t0.g(), fetVar9, (i6 << 3) & 112);
                    qxw.o(fetVar9, o7k0.e(jm40Var, 17.0f));
                    mm40 mm40VarE8 = o7k0.e(mm40Var5, 32.0f);
                    ((g1t0) fetVar9.k(zfnVar6)).getClass();
                    t9x.u(mm40VarE8, j83Var12, g1t0.g(), fetVar9, i6 & 112);
                } else {
                    fetVar9.X();
                }
                break;
            case 9:
                j83 j83Var13 = (j83) obj;
                j83 j83Var14 = (j83) obj2;
                fet fetVar10 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                j83Var13.getClass();
                j83Var14.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i7 = iIntValue10 | (fetVar10.g(j83Var13) ? 4 : 2);
                } else {
                    i7 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i7 |= fetVar10.g(j83Var14) ? 32 : 16;
                }
                if (fetVar10.U(i7 & 1, (i7 & 147) != 146)) {
                    zfn zfnVar7 = j1t0.e;
                    ((g1t0) fetVar10.k(zfnVar7)).getClass();
                    x9x.w(mm40Var, j83Var13, g1t0.d(), fetVar10, ((i7 << 3) & 112) | 6);
                    ((g1t0) fetVar10.k(zfnVar7)).getClass();
                    x9x.w(mm40Var, j83Var14, g1t0.d(), fetVar10, (i7 & 112) | 6);
                } else {
                    fetVar10.X();
                }
                break;
            default:
                j83 j83Var15 = (j83) obj;
                j83 j83Var16 = (j83) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                j83Var15.getClass();
                j83Var16.getClass();
                if ((iIntValue11 & 6) == 0) {
                    i8 = iIntValue11 | (fetVar11.g(j83Var15) ? 4 : 2);
                } else {
                    i8 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i8 |= fetVar11.g(j83Var16) ? 32 : 16;
                }
                if (fetVar11.U(i8 & 1, (i8 & 147) != 146)) {
                    zfn zfnVar8 = j1t0.e;
                    ((g1t0) fetVar11.k(zfnVar8)).getClass();
                    w9x.s(mm40Var, j83Var15, g1t0.d(), fetVar11, ((i8 << 3) & 112) | 6);
                    ((g1t0) fetVar11.k(zfnVar8)).getClass();
                    w9x.s(mm40Var, j83Var16, g1t0.d(), fetVar11, (i8 & 112) | 6);
                } else {
                    fetVar11.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
