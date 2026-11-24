package a;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class awh implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1573a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awh(Object obj, byte b) {
        this.f1573a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object value;
        Object value2;
        String string;
        int i2;
        int i3;
        int i4;
        byte b = this.f1573a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        boolean z = false;
        final byte b3 = 1;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ewh ewhVar = (ewh) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    a4x a4xVar = (a4x) ewhVar.d.get(iIntValue);
                    n0q n0qVar = o7k0.c;
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean zG = fetVar.g(a4xVar);
                    Object objP = fetVar.P();
                    Object obj6 = objP;
                    if (zG || objP == cl5Var) {
                        oea oeaVar = new oea(a4xVar, (byte) 5);
                        fetVar.o0(oeaVar);
                        obj6 = oeaVar;
                    }
                    b8k0.e(n0qVar, null, lh80VarU, null, null, null, false, null, (Function1) obj6, fetVar, 6, 506);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                xw50 xw50Var = (xw50) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (!fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    fetVar2.X();
                } else if (iIntValue3 == 0) {
                    fetVar2.e0(-585006283);
                    q5x.m(o7k0.c, xw50Var.e, fetVar2, 6);
                    fetVar2.r(false);
                } else if (iIntValue3 != 1) {
                    fetVar2.e0(-584616086);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-584803915);
                    q5x.m(o7k0.c, xw50Var.f, fetVar2, 6);
                    fetVar2.r(false);
                }
                return Unit.f46060a;
            case 2:
                v03 v03Var = (v03) obj5;
                b1t0 b1t0VarB = ((orq) v03Var.e).b((nrq) obj, (psq) obj2, ((lsq) obj3).f20592a, ((msq) obj4).f22332a);
                if (b1t0VarB instanceof a1t0) {
                    Object obj7 = ((a1t0) b1t0VarB).f90a;
                    obj7.getClass();
                    return (Typeface) obj7;
                }
                y3v y3vVar = new y3v(b1t0VarB, v03Var.j);
                v03Var.j = y3vVar;
                Object obj8 = y3vVar.d;
                obj8.getClass();
                return (Typeface) obj8;
            case 3:
                d54 d54Var = (d54) obj5;
                mm40 mm40Var = (mm40) obj;
                Function1 function1 = (Function1) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                gfk0 gfk0Var = d54.R1;
                mm40Var.getClass();
                function1.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i = iIntValue5 | (fetVar3.g(mm40Var) ? 4 : 2);
                } else {
                    i = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i |= fetVar3.i(function1) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    jdk0 jdk0Var = d54Var.M1;
                    if (jdk0Var == null) {
                        Intrinsics.h("authLoginDefaultFactory");
                        throw null;
                    }
                    boolean zI = fetVar3.i(d54Var);
                    Object objP2 = fetVar3.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new b54(d54Var, b2);
                        fetVar3.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zI2 = fetVar3.i(d54Var);
                    Object objP3 = fetVar3.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new b33((Object) d54Var, (byte) 13);
                        fetVar3.o0(objP3);
                    }
                    jdk0Var.a(mm40Var, d54Var, function0, (Function1) objP3, function1, fetVar3, (i & 14) | ((i << 9) & 57344));
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                a4x a4xVar2 = ((qj8) obj5).e;
                int iIntValue6 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= fetVar4.e(iIntValue6) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    pan panVar = (pan) a4xVar2.get(iIntValue6);
                    jm40 jm40Var = jm40.b;
                    f1t0.q(o7k0.d(jm40Var, 1.0f), panVar, fetVar4, 6);
                    if (iIntValue6 != q3d.i(a4xVar2)) {
                        fetVar4.e0(-726751072);
                        zcl zclVar2 = qmk.f28987a;
                        rz4.t(jm40Var, 8.0f, fetVar4, false);
                    } else {
                        fetVar4.e0(-726673231);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                vaa vaaVar = (vaa) obj5;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar5 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD & 48) == 0) {
                    iD |= fetVar5.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar5.U(iD & 1, (iD & 145) != 144)) {
                    knx.l(mm40Var2, vaaVar.h, fetVar5, (iD >> 3) & 14);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                ria riaVar = (ria) obj5;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar6 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar6.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar6.U(iD2 & 1, (iD2 & 145) != 144)) {
                    unh0.i(mm40Var3, riaVar.c, fetVar6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 7:
                sia siaVar = (sia) obj5;
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar7 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var4);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar7.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar7.U(iD3 & 1, (iD3 & 145) != 144)) {
                    ccq0.e(mm40Var4, siaVar.c, fetVar7);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 8:
                ija ijaVar = (ija) obj5;
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iD4 = dw9.d((Integer) obj4, (y5d) obj, mm40Var5);
                if ((iD4 & 48) == 0) {
                    iD4 |= fetVar8.g(mm40Var5) ? 32 : 16;
                }
                if (fetVar8.U(iD4 & 1, (iD4 & 145) != 144)) {
                    unh0.i(mm40Var5, ijaVar.b, fetVar8);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 9:
                jja jjaVar = (jja) obj5;
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar9 = (fet) obj3;
                int iD5 = dw9.d((Integer) obj4, (y5d) obj, mm40Var6);
                if ((iD5 & 48) == 0) {
                    iD5 |= fetVar9.g(mm40Var6) ? 32 : 16;
                }
                if (fetVar9.U(iD5 & 1, (iD5 & 145) != 144)) {
                    ccq0.e(mm40Var6, jjaVar.b, fetVar9);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 10:
                zja zjaVar = (zja) obj5;
                mm40 mm40Var7 = (mm40) obj2;
                fet fetVar10 = (fet) obj3;
                int iD6 = dw9.d((Integer) obj4, (y5d) obj, mm40Var7);
                if ((iD6 & 48) == 0) {
                    iD6 |= fetVar10.g(mm40Var7) ? 32 : 16;
                }
                if (fetVar10.U(iD6 & 1, (iD6 & 145) != 144)) {
                    unh0.i(mm40Var7, zjaVar.b, fetVar10);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 11:
                aka akaVar = (aka) obj5;
                mm40 mm40Var8 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iD7 = dw9.d((Integer) obj4, (y5d) obj, mm40Var8);
                if ((iD7 & 48) == 0) {
                    iD7 |= fetVar11.g(mm40Var8) ? 32 : 16;
                }
                if (fetVar11.U(iD7 & 1, (iD7 & 145) != 144)) {
                    ccq0.e(mm40Var8, akaVar.b, fetVar11);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 12:
                ina inaVar = (ina) obj5;
                mm40 mm40Var9 = (mm40) obj2;
                fet fetVar12 = (fet) obj3;
                int iD8 = dw9.d((Integer) obj4, (y5d) obj, mm40Var9);
                if ((iD8 & 48) == 0) {
                    iD8 |= fetVar12.g(mm40Var9) ? 32 : 16;
                }
                if (fetVar12.U(iD8 & 1, (iD8 & 145) != 144)) {
                    unh0.i(mm40Var9, inaVar.c, fetVar12);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 13:
                jna jnaVar = (jna) obj5;
                mm40 mm40Var10 = (mm40) obj2;
                fet fetVar13 = (fet) obj3;
                int iD9 = dw9.d((Integer) obj4, (y5d) obj, mm40Var10);
                if ((iD9 & 48) == 0) {
                    iD9 |= fetVar13.g(mm40Var10) ? 32 : 16;
                }
                if (fetVar13.U(iD9 & 1, (iD9 & 145) != 144)) {
                    ccq0.e(mm40Var10, jnaVar.c, fetVar13);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 14:
                ioa ioaVar = (ioa) obj5;
                mm40 mm40Var11 = (mm40) obj2;
                fet fetVar14 = (fet) obj3;
                int iD10 = dw9.d((Integer) obj4, (y5d) obj, mm40Var11);
                if ((iD10 & 48) == 0) {
                    iD10 |= fetVar14.g(mm40Var11) ? 32 : 16;
                }
                if (fetVar14.U(iD10 & 1, (iD10 & 145) != 144)) {
                    unh0.i(mm40Var11, ioaVar.d, fetVar14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 15:
                joa joaVar = (joa) obj5;
                mm40 mm40Var12 = (mm40) obj2;
                fet fetVar15 = (fet) obj3;
                int iD11 = dw9.d((Integer) obj4, (y5d) obj, mm40Var12);
                if ((iD11 & 48) == 0) {
                    iD11 |= fetVar15.g(mm40Var12) ? 32 : 16;
                }
                if (fetVar15.U(iD11 & 1, (iD11 & 145) != 144)) {
                    ccq0.e(mm40Var12, joaVar.d, fetVar15);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 16:
                xra xraVar = (xra) obj5;
                bzl bzlVar = (bzl) obj2;
                fet fetVar16 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                cl5 cl5Var2 = xra.X1;
                ((ir8) obj).getClass();
                bzlVar.getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar16.g(bzlVar) ? 32 : 16;
                }
                if (fetVar16.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    xraVar.G0(bzlVar, fetVar16, (iIntValue8 >> 3) & 14);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 17:
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                kl5 kl5Var = l5c.W1;
                v7c v7cVarI0 = ((l5c) obj5).I0();
                p7m0 p7m0Var = v7cVarI0.Q;
                String str = (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, i7c.a((i7c) value, str, null, null, null, str.length() > 0, false, false, 14319)));
                v7cVarI0.O("");
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, i7c.a((i7c) value2, null, null, v7cVarI0.D(), null, false, false, false, 16127)));
                return Unit.f46060a;
            case 18:
                gnc gncVar = (gnc) obj5;
                y5d y5dVar = (y5d) obj;
                ClassicFavoriteTab classicFavoriteTab = (ClassicFavoriteTab) obj2;
                fet fetVar17 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                kl5 kl5Var2 = gnc.Z1;
                y5dVar.getClass();
                classicFavoriteTab.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i2 = iIntValue9 | (fetVar17.g(y5dVar) ? 4 : 2);
                } else {
                    i2 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i2 |= fetVar17.e(classicFavoriteTab.ordinal()) ? 32 : 16;
                }
                if (fetVar17.U(i2 & 1, (i2 & 147) != 146)) {
                    gncVar.M1.J(gncVar, gnc.a2[1], classicFavoriteTab);
                    int iOrdinal = classicFavoriteTab.ordinal();
                    if (iOrdinal == 0) {
                        fetVar17.e0(460900374);
                        gncVar.H0(0, fetVar17);
                        fetVar17.r(false);
                    } else if (iOrdinal == 1) {
                        fetVar17.e0(460902099);
                        gncVar.G0(0, fetVar17);
                        fetVar17.r(false);
                    } else if (iOrdinal == 2) {
                        fetVar17.e0(460903799);
                        gncVar.I0(0, fetVar17);
                        fetVar17.r(false);
                    } else {
                        if (iOrdinal != 3) {
                            throw b1j.f(460898623, fetVar17, false);
                        }
                        fetVar17.e0(460905588);
                        gncVar.J0(0, fetVar17);
                        fetVar17.r(false);
                    }
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                god godVar = (god) obj5;
                mm40 mm40Var13 = (mm40) obj2;
                fet fetVar18 = (fet) obj3;
                int iD12 = dw9.d((Integer) obj4, (y5d) obj, mm40Var13);
                if ((iD12 & 48) == 0) {
                    iD12 |= fetVar18.g(mm40Var13) ? 32 : 16;
                }
                if (fetVar18.U(iD12 & 1, (iD12 & 145) != 144)) {
                    zcl zclVar3 = qmk.f28987a;
                    vbc.j(o7k0.e(mm40Var13, 12.0f), godVar.c, fetVar18);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 20:
                pod podVar = (pod) obj5;
                mm40 mm40Var14 = (mm40) obj2;
                fet fetVar19 = (fet) obj3;
                int iD13 = dw9.d((Integer) obj4, (y5d) obj, mm40Var14);
                if ((iD13 & 48) == 0) {
                    iD13 |= fetVar19.g(mm40Var14) ? 32 : 16;
                }
                if (fetVar19.U(iD13 & 1, (iD13 & 145) != 144)) {
                    zcl zclVar4 = qmk.f28987a;
                    vbc.j(o7k0.e(mm40Var14, 12.0f), podVar.f, fetVar19);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case 21:
                qod qodVar = (qod) obj5;
                mm40 mm40Var15 = (mm40) obj2;
                fet fetVar20 = (fet) obj3;
                int iD14 = dw9.d((Integer) obj4, (y5d) obj, mm40Var15);
                if ((iD14 & 48) == 0) {
                    iD14 |= fetVar20.g(mm40Var15) ? 32 : 16;
                }
                if (fetVar20.U(iD14 & 1, (iD14 & 145) != 144)) {
                    zcl zclVar5 = qmk.f28987a;
                    vbc.j(o7k0.e(mm40Var15, 12.0f), qodVar.d, fetVar20);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 22:
                rod rodVar = (rod) obj5;
                mm40 mm40Var16 = (mm40) obj2;
                fet fetVar21 = (fet) obj3;
                int iD15 = dw9.d((Integer) obj4, (y5d) obj, mm40Var16);
                if ((iD15 & 48) == 0) {
                    iD15 |= fetVar21.g(mm40Var16) ? 32 : 16;
                }
                if (fetVar21.U(iD15 & 1, (iD15 & 145) != 144)) {
                    zcl zclVar6 = qmk.f28987a;
                    vbc.j(o7k0.e(mm40Var16, 12.0f), rodVar.d, fetVar21);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 23:
                j83 j83Var = (j83) obj5;
                mm40 mm40Var17 = (mm40) obj2;
                fet fetVar22 = (fet) obj3;
                int iD16 = dw9.d((Integer) obj4, (y5d) obj, mm40Var17);
                if ((iD16 & 48) == 0) {
                    iD16 |= fetVar22.g(mm40Var17) ? 32 : 16;
                }
                if (fetVar22.U(iD16 & 1, (iD16 & 145) != 144)) {
                    wdx.m(mm40Var17, j83Var, fetVar22, (iD16 >> 3) & 14);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
            case 24:
                final epd epdVar = (epd) obj5;
                y5d y5dVar2 = (y5d) obj;
                mm40 mm40Var18 = (mm40) obj2;
                fet fetVar23 = (fet) obj3;
                int iD17 = dw9.d((Integer) obj4, y5dVar2, mm40Var18);
                if ((iD17 & 6) == 0) {
                    i3 = iD17 | (fetVar23.g(y5dVar2) ? (byte) 4 : (byte) 2);
                } else {
                    i3 = iD17;
                }
                if ((iD17 & 48) == 0) {
                    i3 |= fetVar23.g(mm40Var18) ? 32 : 16;
                }
                if (fetVar23.U(i3 & 1, (i3 & 147) != 146)) {
                    mm40 mm40VarB = y5dVar2.b(o7k0.d(mm40Var18, 1.0f), true);
                    final byte b4 = z ? (byte) 1 : (byte) 0;
                    agc.i(3456, u1c.M(1511107635, new xdr() { // from class: a.dpd
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // a.xdr
                        public final Object F(Object obj9, Object obj10, Object obj11) {
                            ugd ugdVar;
                            ugd ugdVar2;
                            ugd ugdVar3;
                            byte b5 = b4;
                            byte b6 = 3;
                            epd epdVar2 = epdVar;
                            byte b7 = 2;
                            byte b8 = 1;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var19 = (mm40) obj9;
                                    fet fetVar24 = (fet) obj10;
                                    int iIntValue10 = ((Integer) obj11).intValue();
                                    mm40Var19.getClass();
                                    if ((iIntValue10 & 6) == 0) {
                                        iIntValue10 |= fetVar24.g(mm40Var19) ? 4 : 2;
                                    }
                                    if (fetVar24.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                                        l5d0 l5d0VarA = cn80.b.a(w6n.k);
                                        l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                        l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                        l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar24.k(bmd.n));
                                        zfn zfnVar = kcp0.b;
                                        zcl zclVar7 = qmk.f28987a;
                                        l5d0 l5d0VarA4 = zfnVar.a(new ycl(2.0f));
                                        l5d0 l5d0VarA5 = kcp0.f18071a.a(new ycl(24.0f));
                                        l5d0 l5d0VarA6 = kcp0.c.a(Boolean.TRUE);
                                        l5d0 l5d0VarA7 = egp0.d.a(2);
                                        zfn zfnVar2 = egp0.c;
                                        ((g1t0) fetVar24.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarA6, l5d0VarA7, zfnVar2.a(g1t0.h())}, u1c.M(76451699, new eod(mm40Var19, epdVar2, b6), fetVar24), fetVar24, 48);
                                    } else {
                                        fetVar24.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    mm40 mm40Var20 = (mm40) obj9;
                                    fet fetVar25 = (fet) obj10;
                                    int iIntValue11 = ((Integer) obj11).intValue();
                                    mm40Var20.getClass();
                                    if ((iIntValue11 & 6) == 0) {
                                        iIntValue11 |= fetVar25.g(mm40Var20) ? 4 : 2;
                                    }
                                    if (fetVar25.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                                        t5h0 t5h0Var = epdVar2.c;
                                        boolean z2 = t5h0Var instanceof r5h0;
                                        jm40 jm40Var2 = jm40.b;
                                        cl5 cl5Var3 = ukd.f35823a;
                                        ugd ugdVarM = null;
                                        if (z2) {
                                            fetVar25.e0(1896285799);
                                            zcl zclVar8 = qmk.f28987a;
                                            mm40 mm40VarN = s5x0.N(mm40Var20, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                            r5h0 r5h0Var = (r5h0) t5h0Var;
                                            Object objP4 = fetVar25.P();
                                            if (objP4 == cl5Var3) {
                                                objP4 = o7k0.s(jm40Var2, 24.0f);
                                                fetVar25.o0(objP4);
                                            }
                                            mm40 mm40Var21 = (mm40) objP4;
                                            Object objP5 = fetVar25.P();
                                            if (objP5 == cl5Var3) {
                                                objP5 = o7k0.s(jm40Var2, 32.0f);
                                                fetVar25.o0(objP5);
                                            }
                                            mm40 mm40Var22 = (mm40) objP5;
                                            pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar25);
                                            w0s w0sVar = r5h0Var.d;
                                            if (w0sVar == null) {
                                                fetVar25.e0(318468650);
                                                fetVar25.r(false);
                                                ugdVar3 = null;
                                            } else {
                                                fetVar25.e0(318468651);
                                                ugd ugdVarM2 = u1c.M(-1647656218, new hqd(mm40Var22, w0sVar, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar3 = ugdVarM2;
                                            }
                                            koa0 koa0Var = r5h0Var.e;
                                            if (koa0Var == null) {
                                                fetVar25.e0(319280199);
                                                fetVar25.r(false);
                                            } else {
                                                fetVar25.e0(319280200);
                                                ugdVarM = u1c.M(-1932062985, new iqd(mm40Var22, koa0Var, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                            }
                                            qxw.q(mm40VarN, false, ugdVar3, ugdVarM, u1c.M(1841575672, new jqd(r5h0Var, null == true ? 1 : 0), fetVar25), u1c.M(1680994206, new ypd(b8, mm40Var21, pz40VarF), fetVar25), u1c.M(-1366432074, new kqd(mm40Var22, r5h0Var, null == true ? 1 : 0), fetVar25), fetVar25, 1794048);
                                            fetVar25.r(false);
                                        } else {
                                            if (!(t5h0Var instanceof q5h0)) {
                                                throw b1j.f(1896283262, fetVar25, false);
                                            }
                                            fetVar25.e0(1896293284);
                                            zcl zclVar9 = qmk.f28987a;
                                            mm40 mm40VarN2 = s5x0.N(mm40Var20, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                            q5h0 q5h0Var = (q5h0) t5h0Var;
                                            Object objP6 = fetVar25.P();
                                            if (objP6 == cl5Var3) {
                                                objP6 = o7k0.s(jm40Var2, 24.0f);
                                                fetVar25.o0(objP6);
                                            }
                                            mm40 mm40Var23 = (mm40) objP6;
                                            Object objP7 = fetVar25.P();
                                            if (objP7 == cl5Var3) {
                                                objP7 = o7k0.s(jm40Var2, 32.0f);
                                                fetVar25.o0(objP7);
                                            }
                                            mm40 mm40Var24 = (mm40) objP7;
                                            pz40 pz40VarF2 = androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar25);
                                            tsq tsqVar = q5h0Var.c;
                                            if (tsqVar == null) {
                                                fetVar25.e0(-528455055);
                                                fetVar25.r(false);
                                                ugdVar = null;
                                            } else {
                                                fetVar25.e0(-528455054);
                                                ugd ugdVarM3 = u1c.M(-91060733, new xpd(mm40Var23, tsqVar, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar = ugdVarM3;
                                            }
                                            tsq tsqVar2 = q5h0Var.d;
                                            if (tsqVar2 == null) {
                                                fetVar25.e0(-527831707);
                                                fetVar25.r(false);
                                                ugdVar2 = null;
                                            } else {
                                                fetVar25.e0(-527831706);
                                                ugd ugdVarM4 = u1c.M(-225643422, new xpd(mm40Var23, tsqVar2, b7), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar2 = ugdVarM4;
                                            }
                                            tsq tsqVar3 = q5h0Var.e;
                                            if (tsqVar3 == null) {
                                                fetVar25.e0(-527205259);
                                                fetVar25.r(false);
                                            } else {
                                                fetVar25.e0(-527205258);
                                                ugdVarM = u1c.M(-360226111, new xpd(mm40Var23, tsqVar3, b6), fetVar25);
                                                fetVar25.r(false);
                                            }
                                            aac.t(mm40VarN2, false, ugdVar, ugdVar2, ugdVarM, u1c.M(-253346602, new ypd(null == true ? 1 : 0, mm40Var23, pz40VarF2), fetVar25), u1c.M(-1259726866, new zpd(mm40Var24, q5h0Var, null == true ? 1 : 0), fetVar25), fetVar25, 1769472);
                                            fetVar25.r(false);
                                        }
                                    } else {
                                        fetVar25.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar23), u1c.M(118174226, new xdr() { // from class: a.dpd
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // a.xdr
                        public final Object F(Object obj9, Object obj10, Object obj11) {
                            ugd ugdVar;
                            ugd ugdVar2;
                            ugd ugdVar3;
                            byte b5 = b3;
                            byte b6 = 3;
                            epd epdVar2 = epdVar;
                            byte b7 = 2;
                            byte b8 = 1;
                            switch (b5) {
                                case 0:
                                    mm40 mm40Var19 = (mm40) obj9;
                                    fet fetVar24 = (fet) obj10;
                                    int iIntValue10 = ((Integer) obj11).intValue();
                                    mm40Var19.getClass();
                                    if ((iIntValue10 & 6) == 0) {
                                        iIntValue10 |= fetVar24.g(mm40Var19) ? 4 : 2;
                                    }
                                    if (fetVar24.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                                        l5d0 l5d0VarA = cn80.b.a(w6n.k);
                                        l5d0 l5d0VarA2 = egp0.f7775a.a(gqw0.d);
                                        l5d0 l5d0VarK = dw9.k(5, egp0.b);
                                        l5d0 l5d0VarA3 = cn80.f4642a.a(fetVar24.k(bmd.n));
                                        zfn zfnVar = kcp0.b;
                                        zcl zclVar7 = qmk.f28987a;
                                        l5d0 l5d0VarA4 = zfnVar.a(new ycl(2.0f));
                                        l5d0 l5d0VarA5 = kcp0.f18071a.a(new ycl(24.0f));
                                        l5d0 l5d0VarA6 = kcp0.c.a(Boolean.TRUE);
                                        l5d0 l5d0VarA7 = egp0.d.a(2);
                                        zfn zfnVar2 = egp0.c;
                                        ((g1t0) fetVar24.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarK, l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarA6, l5d0VarA7, zfnVar2.a(g1t0.h())}, u1c.M(76451699, new eod(mm40Var19, epdVar2, b6), fetVar24), fetVar24, 48);
                                    } else {
                                        fetVar24.X();
                                    }
                                    return Unit.f46060a;
                                default:
                                    mm40 mm40Var20 = (mm40) obj9;
                                    fet fetVar25 = (fet) obj10;
                                    int iIntValue11 = ((Integer) obj11).intValue();
                                    mm40Var20.getClass();
                                    if ((iIntValue11 & 6) == 0) {
                                        iIntValue11 |= fetVar25.g(mm40Var20) ? 4 : 2;
                                    }
                                    if (fetVar25.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                                        t5h0 t5h0Var = epdVar2.c;
                                        boolean z2 = t5h0Var instanceof r5h0;
                                        jm40 jm40Var2 = jm40.b;
                                        cl5 cl5Var3 = ukd.f35823a;
                                        ugd ugdVarM = null;
                                        if (z2) {
                                            fetVar25.e0(1896285799);
                                            zcl zclVar8 = qmk.f28987a;
                                            mm40 mm40VarN = s5x0.N(mm40Var20, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                            r5h0 r5h0Var = (r5h0) t5h0Var;
                                            Object objP4 = fetVar25.P();
                                            if (objP4 == cl5Var3) {
                                                objP4 = o7k0.s(jm40Var2, 24.0f);
                                                fetVar25.o0(objP4);
                                            }
                                            mm40 mm40Var21 = (mm40) objP4;
                                            Object objP5 = fetVar25.P();
                                            if (objP5 == cl5Var3) {
                                                objP5 = o7k0.s(jm40Var2, 32.0f);
                                                fetVar25.o0(objP5);
                                            }
                                            mm40 mm40Var22 = (mm40) objP5;
                                            pz40 pz40VarF = androidx.compose.runtime.e.f(r5h0Var.b, fetVar25);
                                            w0s w0sVar = r5h0Var.d;
                                            if (w0sVar == null) {
                                                fetVar25.e0(318468650);
                                                fetVar25.r(false);
                                                ugdVar3 = null;
                                            } else {
                                                fetVar25.e0(318468651);
                                                ugd ugdVarM2 = u1c.M(-1647656218, new hqd(mm40Var22, w0sVar, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar3 = ugdVarM2;
                                            }
                                            koa0 koa0Var = r5h0Var.e;
                                            if (koa0Var == null) {
                                                fetVar25.e0(319280199);
                                                fetVar25.r(false);
                                            } else {
                                                fetVar25.e0(319280200);
                                                ugdVarM = u1c.M(-1932062985, new iqd(mm40Var22, koa0Var, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                            }
                                            qxw.q(mm40VarN, false, ugdVar3, ugdVarM, u1c.M(1841575672, new jqd(r5h0Var, null == true ? 1 : 0), fetVar25), u1c.M(1680994206, new ypd(b8, mm40Var21, pz40VarF), fetVar25), u1c.M(-1366432074, new kqd(mm40Var22, r5h0Var, null == true ? 1 : 0), fetVar25), fetVar25, 1794048);
                                            fetVar25.r(false);
                                        } else {
                                            if (!(t5h0Var instanceof q5h0)) {
                                                throw b1j.f(1896283262, fetVar25, false);
                                            }
                                            fetVar25.e0(1896293284);
                                            zcl zclVar9 = qmk.f28987a;
                                            mm40 mm40VarN2 = s5x0.N(mm40Var20, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                            q5h0 q5h0Var = (q5h0) t5h0Var;
                                            Object objP6 = fetVar25.P();
                                            if (objP6 == cl5Var3) {
                                                objP6 = o7k0.s(jm40Var2, 24.0f);
                                                fetVar25.o0(objP6);
                                            }
                                            mm40 mm40Var23 = (mm40) objP6;
                                            Object objP7 = fetVar25.P();
                                            if (objP7 == cl5Var3) {
                                                objP7 = o7k0.s(jm40Var2, 32.0f);
                                                fetVar25.o0(objP7);
                                            }
                                            mm40 mm40Var24 = (mm40) objP7;
                                            pz40 pz40VarF2 = androidx.compose.runtime.e.f(q5h0Var.f28152a, fetVar25);
                                            tsq tsqVar = q5h0Var.c;
                                            if (tsqVar == null) {
                                                fetVar25.e0(-528455055);
                                                fetVar25.r(false);
                                                ugdVar = null;
                                            } else {
                                                fetVar25.e0(-528455054);
                                                ugd ugdVarM3 = u1c.M(-91060733, new xpd(mm40Var23, tsqVar, null == true ? 1 : 0), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar = ugdVarM3;
                                            }
                                            tsq tsqVar2 = q5h0Var.d;
                                            if (tsqVar2 == null) {
                                                fetVar25.e0(-527831707);
                                                fetVar25.r(false);
                                                ugdVar2 = null;
                                            } else {
                                                fetVar25.e0(-527831706);
                                                ugd ugdVarM4 = u1c.M(-225643422, new xpd(mm40Var23, tsqVar2, b7), fetVar25);
                                                fetVar25.r(false);
                                                ugdVar2 = ugdVarM4;
                                            }
                                            tsq tsqVar3 = q5h0Var.e;
                                            if (tsqVar3 == null) {
                                                fetVar25.e0(-527205259);
                                                fetVar25.r(false);
                                            } else {
                                                fetVar25.e0(-527205258);
                                                ugdVarM = u1c.M(-360226111, new xpd(mm40Var23, tsqVar3, b6), fetVar25);
                                                fetVar25.r(false);
                                            }
                                            aac.t(mm40VarN2, false, ugdVar, ugdVar2, ugdVarM, u1c.M(-253346602, new ypd(null == true ? 1 : 0, mm40Var23, pz40VarF2), fetVar25), u1c.M(-1259726866, new zpd(mm40Var24, q5h0Var, null == true ? 1 : 0), fetVar25), fetVar25, 1769472);
                                            fetVar25.r(false);
                                        }
                                    } else {
                                        fetVar25.X();
                                    }
                                    return Unit.f46060a;
                            }
                        }
                    }, fetVar23), fetVar23, mm40VarB, false);
                } else {
                    fetVar23.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gy30 gy30Var = (gy30) obj5;
                mm40 mm40Var19 = (mm40) obj;
                wx30 wx30Var = (wx30) obj2;
                fet fetVar24 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                mm40Var19.getClass();
                wx30Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i4 = iIntValue10 | (fetVar24.g(mm40Var19) ? (byte) 4 : (byte) 2);
                } else {
                    i4 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i4 |= fetVar24.g(wx30Var) ? 32 : 16;
                }
                if (fetVar24.U(i4 & 1, (i4 & 147) != 146)) {
                    jiq0.L((gy30Var.c instanceof zx30 ? s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 0.0f, 11) : new x7z(1.0f, true)).e(mm40Var19), wx30Var, fetVar24, i4 & 112);
                } else {
                    fetVar24.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lq5 lq5Var = (lq5) obj5;
                ((Integer) obj2).getClass();
                fet fetVar25 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar25.U(iIntValue11 & 1, (iIntValue11 & 129) != 128)) {
                    q0x.C(null, ((jq5) lq5Var).f16933a, fetVar25, 0);
                } else {
                    fetVar25.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uzb uzbVar = (uzb) obj5;
                ((Integer) obj2).getClass();
                fet fetVar26 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar26.U(iIntValue12 & 1, (iIntValue12 & 129) != 128)) {
                    pzb.m(uzbVar, fetVar26, 8);
                } else {
                    fetVar26.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ejm ejmVar = (ejm) obj5;
                ((Integer) obj2).getClass();
                fet fetVar27 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar27.U(iIntValue13 & 1, (iIntValue13 & 129) != 128)) {
                    int iOrdinal2 = ((djm) ejmVar).f6194a.ordinal();
                    if (iOrdinal2 == 0) {
                        fetVar27.e0(-544606337);
                        vzb.k(0, fetVar27);
                        fetVar27.r(false);
                    } else if (iOrdinal2 == 1) {
                        fetVar27.e0(-544603808);
                        e3c.j(0, fetVar27);
                        fetVar27.r(false);
                    } else if (iOrdinal2 == 2) {
                        fetVar27.e0(-544601248);
                        u1c.k(0, fetVar27);
                        fetVar27.r(false);
                    } else {
                        if (iOrdinal2 != 3) {
                            throw b1j.f(-544607776, fetVar27, false);
                        }
                        fetVar27.e0(-544598622);
                        wzb.u(0, fetVar27);
                        fetVar27.r(false);
                    }
                } else {
                    fetVar27.X();
                }
                return Unit.f46060a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((vkn0) obj5).y(new c8r(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
