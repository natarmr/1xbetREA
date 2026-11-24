package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p6p0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26468a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ p6p0(List list, Function0 function0, Function1 function1, byte b) {
        this.f26468a = b;
        this.b = list;
        this.c = function0;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        byte b = this.f26468a;
        Function1 function1 = this.d;
        List list = this.b;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                g9zVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    s6p0 s6p0Var = (s6p0) list.get(iIntValue);
                    fetVar2.e0(-1635751469);
                    if (s6p0Var != null) {
                        boolean z = s6p0Var instanceof q6p0;
                        jm40 jm40Var = jm40.b;
                        cl5 cl5Var = ukd.f35823a;
                        if (z) {
                            fetVar2.e0(-1635679550);
                            boolean zG = fetVar2.g(function0);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new cym0(0, this.c, Function0.class, "invoke", "invoke()Ljava/lang/Object;", 0, (byte) 9);
                                fetVar2.o0(objP);
                            }
                            mbc.w(y860.W(jm40Var, null, null, false, null, (Function0) ((jhy) objP), 28), (q6p0) s6p0Var, fetVar2, 0);
                            fetVar2.r(false);
                        } else if (s6p0Var instanceof r6p0) {
                            fetVar2.e0(-1635278131);
                            boolean zG2 = fetVar2.g(function1) | fetVar2.g(s6p0Var);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new ywm0(function1, s6p0Var, (byte) 9);
                                fetVar2.o0(objP2);
                            }
                            u4n0.f(y860.W(jm40Var, null, null, false, null, (Function0) objP2, 28), (r6p0) s6p0Var, fetVar2, 0);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    }
                    throw b1j.f(501423152, fetVar2, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue3);
                    fetVar3.e0(1196274871);
                    if (p6t0Var == null) {
                        fetVar = fetVar3;
                    } else {
                        if (p6t0Var instanceof wks0) {
                            fetVar3.e0(1196346263);
                            if (iIntValue3 != 0) {
                                fetVar3.e0(1196419547);
                                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                                zcl zclVar = qmk.f28987a;
                                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD, 12.0f, 0.0f, 2), false, fetVar3, 6, 4);
                                fetVar = fetVar3;
                                fetVar.r(false);
                            } else {
                                fetVar = fetVar3;
                                fetVar.e0(1196777132);
                                fetVar.r(false);
                            }
                            yqm0.e((wks0) p6t0Var, function0, function1, fetVar, 432);
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (p6t0Var instanceof yks0) {
                                fetVar.e0(1197184844);
                                msm0.d((yks0) p6t0Var, function0, fetVar, 48);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(1197467626);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }
}
