package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aiq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f936a;
    public final /* synthetic */ jjl b;
    public final /* synthetic */ long c;

    public /* synthetic */ aiq(jjl jjlVar, long j, byte b) {
        this.f936a = b;
        this.b = jjlVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f936a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        jjl jjlVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = jjlVar.f16624a;
                    String str2 = jjlVar.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    paq0.b(jm40.b, str, str2, this.c, g1t0.m(), qmk.r, qmk.q, 0.0f, fetVar, 6, 128);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                    String str3 = jjlVar.f16624a;
                    String str4 = jjlVar.b;
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    paq0.b(mm40VarL, str3, str4, this.c, g1t0.m(), qmk.r, qmk.q, 0.0f, fetVar2, 0, 128);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var2);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    String str5 = jjlVar.f16624a;
                    String str6 = jjlVar.b;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    paq0.b(jm40Var2, str5, str6, this.c, g1t0.j(), qmk.r, qmk.q, 0.0f, fetVar3, 6, 128);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7);
                    String str7 = jjlVar.f16624a;
                    String str8 = jjlVar.b;
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    paq0.b(mm40VarN, str7, str8, this.c, g1t0.j(), qmk.r, qmk.q, 0.0f, fetVar4, 0, 128);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.l, fetVar5, 54);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    mm40 mm40VarE0 = o2e.e0(ohs0.i(fetVar5, mm40VarC1, gqw0.v, 1.0f, false), "DS_ACCOUNT_SELECTION_TITLE");
                    String str9 = jjlVar.d;
                    if (str9 == null) {
                        str9 = "";
                    }
                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                    v8q0.a(str9, mm40VarE0, this.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar5, 0, 24960, 110584);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String str10 = jjlVar.f16624a;
                    String str11 = jjlVar.b;
                    ((g1t0) fetVar6.k(j1t0.e)).getClass();
                    paq0.b(jm40.b, str10, str11, this.c, g1t0.m(), qmk.r, qmk.q, 0.0f, fetVar6, 6, 128);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
