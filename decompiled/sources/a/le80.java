package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class le80 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19889a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ le80(List list, a4x a4xVar, Function2 function2, Function2 function3, byte b) {
        this.f19889a = b;
        this.b = list;
        this.c = a4xVar;
        this.d = function2;
        this.e = function3;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        byte b = this.f19889a;
        a4x a4xVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    zhr0 zhr0Var = (zhr0) list.get(iIntValue);
                    fetVar2.e0(1334492800);
                    if (zhr0Var != null) {
                        boolean z = zhr0Var instanceof ecb;
                        jm40 jm40Var = jm40.b;
                        ycl yclVar = null;
                        if (z) {
                            fetVar2.e0(1334543546);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            yclVar = iIntValue != 0 ? new ycl(4.0f) : null;
                            hxm0.j((ecb) zhr0Var, s5x0.N(mm40VarD, 0.0f, yclVar != null ? yclVar.f42389a : 0.0f, 0.0f, 0.0f, 13), fetVar2, 0);
                            fetVar2.r(false);
                            fetVar = fetVar2;
                        } else if (zhr0Var instanceof ae80) {
                            fetVar2.e0(1334850508);
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            ycl yclVar2 = new ycl(4.0f);
                            if (iIntValue != 0 && (a4xVar.get(iIntValue - 1) instanceof ae80)) {
                                yclVar = yclVar2;
                            }
                            q0x.q((ae80) zhr0Var, this.d, this.e, s5x0.N(mm40VarD2, 0.0f, yclVar != null ? yclVar.f42389a : 0.0f, 0.0f, 0.0f, 13), fetVar2, 0);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    }
                    throw b1j.f(320142819, fetVar2, false);
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
                    zhr0 zhr0Var2 = (zhr0) list.get(iIntValue3);
                    fetVar3.e0(-138121658);
                    nia0.X(iIntValue3, a4xVar, zhr0Var2, fetVar3, ((i2 & 126) >> 3) & 14);
                    nia0.W(zhr0Var2, this.d, this.e, null, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }
}
