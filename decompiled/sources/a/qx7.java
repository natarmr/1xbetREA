package a;

import java.util.Iterator;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qx7 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29467a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ qx7(a4x a4xVar, a4x a4xVar2, byte b) {
        this.f29467a = b;
        this.b = a4xVar;
        this.c = a4xVar2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f29467a;
        a4x a4xVar = this.c;
        a4x a4xVar2 = this.b;
        switch (b) {
            case 0:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                lr8 lr8Var = (lr8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xx7 xx7Var = gqw0.m;
                nw3 nw3Var = uc9.g;
                lr8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fC = lr8Var.c() / 12.0f;
                    if (ycl.a(fC, 40.0f) >= 0) {
                        fC = 40.0f;
                    }
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                    thg0 thg0VarA = shg0.a(uc9.f, gqw0.j, fetVar, 6);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar);
                    mm40 mm40VarN = s5x0.N(o7k0.c(jm40Var, 1.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11);
                    x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 6);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                    Iterator itO = h97.o(fetVar, mm40VarC1, shdVar, -1683150403, a4xVar2);
                    while (itO.hasNext()) {
                        bsr0.r((k9q) itO.next(), fC, fetVar, 0);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                    mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarC, 2.0f, 0.0f, 0.0f, 0.0f, 14);
                    x5d x5dVarA2 = w5d.a(nw3Var, xx7Var, fetVar, 6);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA2, shdVar4);
                    jpm0.o(fetVar, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                    Iterator itO2 = h97.o(fetVar, mm40VarC2, shdVar, -369908844, a4xVar);
                    while (itO2.hasNext()) {
                        bsr0.r((k9q) itO2.next(), fC, fetVar, 0);
                    }
                    ohs0.x(fetVar, false, true, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_placeholder, 100, fetVar2, 48);
                    aph aphVar = aph.f1252a;
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_first_head, v3c.j0(a4xVar2, aphVar), fetVar2, 0);
                    aph aphVar2 = aph.b;
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_first_body, v3c.j0(a4xVar2, aphVar2), fetVar2, 0);
                    aph aphVar3 = aph.c;
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_first_legs, v3c.j0(a4xVar2, aphVar3), fetVar2, 0);
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_second_head, v3c.j0(a4xVar, aphVar), fetVar2, 0);
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_second_body, v3c.j0(a4xVar, aphVar2), fetVar2, 0);
                    v3c.c(R.drawable.ufc_statistics_beat_map_opponents_second_legs, v3c.j0(a4xVar, aphVar3), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
