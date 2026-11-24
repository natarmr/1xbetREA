package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class l6b implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19498a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l6b(List list, ugd ugdVar, ugd ugdVar2, Object obj, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, byte b) {
        this.f19498a = b;
        this.g = list;
        this.b = ugdVar;
        this.c = ugdVar2;
        this.h = obj;
        this.d = ugdVar3;
        this.e = ugdVar4;
        this.f = ugdVar5;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        byte b = this.f19498a;
        Object obj5 = this.h;
        ugd ugdVar = this.f;
        ugd ugdVar2 = this.e;
        List list = this.g;
        ugd ugdVar3 = this.b;
        ugd ugdVar4 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    int i3 = i & 126;
                    y2b y2bVar = (y2b) ((a4x) list).get(iIntValue);
                    fetVar3.e0(1703224892);
                    if (y2bVar != null) {
                        if (y2bVar instanceof i3b) {
                            fetVar3.e0(747681642);
                            ugdVar3.F(y2bVar, fetVar3, 0);
                            fetVar3.r(false);
                            fetVar = fetVar3;
                        } else if (y2bVar instanceof m3b) {
                            fetVar3.e0(747684286);
                            this.c.O(y2bVar, ((s6b) ((w6b) obj5)).c, Integer.valueOf(iIntValue), fetVar3, Integer.valueOf((i3 << 3) & 896));
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (y2bVar instanceof x5b) {
                                fetVar.e0(747688170);
                                ugdVar4.F(y2bVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (y2bVar instanceof i8b) {
                                fetVar.e0(747690922);
                                ugdVar2.F(y2bVar, fetVar, 0);
                                fetVar.r(false);
                            } else if (y2bVar instanceof d4b) {
                                fetVar.e0(747693606);
                                ugdVar.invoke(fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar3;
                    }
                    throw b1j.f(747679399, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    gy20 gy20Var = (gy20) list.get(iIntValue3);
                    fetVar4.e0(67929211);
                    if (iIntValue3 != 0) {
                        fetVar4.e0(67909897);
                        ugdVar3.F(g9zVar2, fetVar4, Integer.valueOf(i2 & 14));
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(67951220);
                        fetVar4.r(false);
                    }
                    if (gy20Var != null) {
                        boolean z = gy20Var instanceof fv20;
                        jm40 jm40Var = jm40.b;
                        if (z) {
                            fetVar4.e0(68034052);
                            n2x.d(3456, u1c.M(1350169056, new a030(ugdVar4, gy20Var, (byte) 0), fetVar4), u1c.M(1836783985, new b030(gy20Var, ugdVar2), fetVar4), fetVar4, g9z.b(g9zVar2, jm40Var, null, 7), ((fv20) gy20Var).f10194a.d);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar4;
                            if (gy20Var instanceof or20) {
                                fetVar2.e0(68570786);
                                n2x.d(3456, u1c.M(-266401001, new a030(ugdVar4, gy20Var, (byte) 1), fetVar2), u1c.M(-780889496, new b030(ugdVar, gy20Var), fetVar2), fetVar2, g9z.b(g9zVar2, jm40Var, null, 7), ((or20) gy20Var).f25717a.d);
                                fetVar2.r(false);
                            } else if (gy20Var instanceof vwv) {
                                fetVar2.e0(-829060160);
                                this.c.F(gy20Var, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        if (iIntValue3 == q3d.i((List) ((l7m0) obj5).getValue())) {
                            fetVar2.e0(69019945);
                            ugdVar3.F(g9zVar2, fetVar2, Integer.valueOf(i2 & 14));
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(69061268);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar4;
                    }
                    throw b1j.f(-829090588, fetVar2, false);
                }
                fetVar4.X();
                return Unit.f46060a;
        }
    }
}
