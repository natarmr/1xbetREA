package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class tpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f34337a = ro4.m0(300, 0, ihn.f14788a, 2);

    public static final void a(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(1033612924);
        if (fetVar.U(i & 1, (i & 19) != 18)) {
            String strJ = jtt0.j(R.string.m3c_bottom_sheet_drag_handle_description, fetVar);
            wkw wkwVar = new wkw(gqw0.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, wkwVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            float f = vwq0.f38165a;
            lh80 lh80Var = xwq0.f41622a;
            int iT = ((w6k) fetVar.k(bmd.h)).T(4.0f);
            boolean zE = fetVar.e(iT);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                objP = new zwq0(iT);
                fetVar.o0(objP);
            }
            zwq0 zwq0Var = (zwq0) objP;
            ugd ugdVarM = u1c.M(2059851063, new bkh(strJ, (byte) 4), fetVar);
            g050 g050Var = ja6.f16174a;
            boolean zH = fetVar.h(false) | fetVar.g(g050Var);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj) {
                objP2 = new bxq0(g050Var);
                fetVar.o0(objP2);
            }
            xwq0.b(zwq0Var, ugdVarM, (bxq0) objP2, null, false, ugdVar, fetVar, 100663344);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, (byte) 29);
        }
    }

    public static final xpj0 b(final Function1 function1, final ypj0 ypj0Var, boolean z, fet fetVar, int i, int i2) {
        final byte b = 0;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        final float f = uo8.d;
        final float f2 = uo8.e;
        final w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(w6kVar) | fetVar.d(f);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        Object obj2 = objP;
        if (zG || objP == obj) {
            Object obj3 = new Function0() { // from class: a.qpj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float fW0;
                    byte b2 = b;
                    float f3 = f;
                    w6k w6kVar2 = w6kVar;
                    switch (b2) {
                        case 0:
                            fW0 = w6kVar2.w0(f3);
                            break;
                        default:
                            fW0 = w6kVar2.w0(f3);
                            break;
                    }
                    return Float.valueOf(fW0);
                }
            };
            fetVar.o0(obj3);
            obj2 = obj3;
        }
        final Function0 function0 = (Function0) obj2;
        boolean zG2 = fetVar.g(w6kVar) | fetVar.d(f2);
        Object objP2 = fetVar.P();
        final byte b2 = 1;
        Object obj4 = objP2;
        if (zG2 || objP2 == obj) {
            Object obj5 = new Function0() { // from class: a.qpj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float fW0;
                    byte b3 = b2;
                    float f3 = f2;
                    w6k w6kVar2 = w6kVar;
                    switch (b3) {
                        case 0:
                            fW0 = w6kVar2.w0(f3);
                            break;
                        default:
                            fW0 = w6kVar2.w0(f3);
                            break;
                    }
                    return Float.valueOf(fW0);
                }
            };
            fetVar.o0(obj5);
            obj4 = obj5;
        }
        final Function0 function2 = (Function0) obj4;
        final boolean z3 = false;
        Object[] objArr = {false, function1, Boolean.valueOf(z2)};
        v0h0 v0h0Var = new v0h0(new f160(z3, function0, function2, function1, z2), new ogj0((byte) 7));
        int i3 = (((fetVar.h(false) ? 1 : 0) | (fetVar.g(function0) ? 1 : 0)) | (fetVar.g(function2) ? 1 : 0) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !fetVar.e(ypj0Var.ordinal())) && (i & 384) != 256) ? (char) 0 : (char) 1) | (fetVar.g(function1) ? 1 : 0);
        if ((((i & 7168) ^ 3072) <= 2048 || !fetVar.h(z2)) && (i & 3072) != 2048) {
            b2 = 0;
        }
        int i4 = (i3 == true ? 1 : 0) | b2;
        Object objP3 = fetVar.P();
        if (i4 != 0 || objP3 == obj) {
            final boolean z4 = z2;
            Object obj6 = new Function0() { // from class: a.rpj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new xpj0(z3, function0, function2, ypj0Var, function1, z4);
                }
            };
            fetVar.o0(obj6);
            objP3 = obj6;
        }
        return (xpj0) e9x.R(objArr, v0h0Var, (Function0) objP3, fetVar, 0);
    }
}
