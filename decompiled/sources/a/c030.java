package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c030 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f3505a = new zfn(new j6g0((byte) 17), (byte) 0);

    public static final void a(final mm40 mm40Var, final l7m0 l7m0Var, hh80 hh80Var, final xcz xczVar, final ugd ugdVar, final ugd ugdVar2, final ugd ugdVar3, final ugd ugdVar4, final ugd ugdVar5, fet fetVar, final int i, final int i2) {
        int i3;
        Object obj;
        hh80 hh80VarU;
        Object obj2;
        Object obj3;
        Object obj4;
        final hh80 hh80Var2;
        l7m0Var.getClass();
        fetVar.g0(-2090959211);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            obj = l7m0Var;
            i3 |= fetVar.g(obj) ? 32 : 16;
        } else {
            obj = l7m0Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                hh80VarU = hh80Var;
                int i4 = fetVar.g(hh80VarU) ? 256 : 128;
                i3 |= i4;
            } else {
                hh80VarU = hh80Var;
            }
            i3 |= i4;
        } else {
            hh80VarU = hh80Var;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj2 = ugdVar;
            i3 |= fetVar.i(obj2) ? 16384 : 8192;
        } else {
            obj2 = ugdVar;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj3 = ugdVar3;
            i3 |= fetVar.i(obj3) ? 1048576 : 524288;
        } else {
            obj3 = ugdVar3;
        }
        if ((12582912 & i) == 0) {
            obj4 = ugdVar4;
            i3 |= fetVar.i(obj4) ? 8388608 : 4194304;
        } else {
            obj4 = ugdVar4;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.i(ugdVar5) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                zcl zclVar = qmk.f28987a;
                hh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                i3 &= -897;
            }
            hh80 hh80Var3 = hh80VarU;
            fetVar.s();
            mm40 mm40VarE0 = o2e.e0(lgb.K(cjx.V(mm40Var, x0x.a0(fetVar), null)), "LAZY_COLUMN");
            int i5 = i3 >> 6;
            ch80 ch80VarG = knm0.g(hh80Var3, fetVar);
            boolean zBooleanValue = ((Boolean) fetVar.k(f3505a)).booleanValue();
            boolean z = ((i3 & 112) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && fetVar.g(xczVar)) || (i3 & 3072) == 2048) | ((234881024 & i3) == 67108864) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((i3 & 29360128) == 8388608);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                tg4 tg4Var = new tg4(obj, (Object) xczVar, (Object) ugdVar5, obj4, obj2, (Object) ugdVar2, obj3, (byte) 7);
                fetVar.o0(tg4Var);
                objP = tg4Var;
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarG, null, null, null, zBooleanValue, null, (Function1) objP, fetVar, i5 & 112, 376);
            hh80Var2 = hh80Var3;
        } else {
            fetVar.X();
            hh80Var2 = hh80VarU;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.zz20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    c030.a(mm40Var, l7m0Var, hh80Var2, xczVar, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5, (fet) obj5, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }
}
