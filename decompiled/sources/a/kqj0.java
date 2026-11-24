package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kqj0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18726a;
    public final /* synthetic */ ugd b;

    public /* synthetic */ kqj0(ugd ugdVar, byte b) {
        this.f18726a = b;
        this.b = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18726a;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int i = ((pj30) CollectionsKt.U(c5n0Var.k("shimmerItem", ugdVar))).S(p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 11)).b;
                long j = p4eVar.f26347a;
                Integer numValueOf = Integer.valueOf((int) Math.ceil(((double) p4e.h(j)) / ((double) i)));
                if (i <= 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                int i2 = p4e.i(j);
                if (!((i2 >= 0) & (i >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                long jH = r4e.h(i2, i2, i, i);
                ArrayList arrayList = new ArrayList(iIntValue);
                for (int iE = 0; iE < iIntValue; iE = w6x.e((pj30) CollectionsKt.U(c5n0Var.k("shimmer_" + iE, ugdVar)), jH, arrayList, iE, 1)) {
                }
                return vj30.x(c5n0Var, p4e.i(j), p4e.h(j), new uy2(arrayList, (byte) 15));
            case 1:
                ((Integer) obj2).getClass();
                pzp0.b(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                pzp0.a(ugdVar, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                fet fetVar = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40.b);
                    zcl zclVar = qmk.f28987a;
                    ugdVar.F(s5x0.N(mm40VarW, 0.0f, 0.0f, 0.0f, 8.0f, 7), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar2 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ugdVar.invoke(fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar3 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ugdVar.invoke(fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ugdVar.invoke(fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar5 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ugdVar.invoke(fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar6 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ugdVar.invoke(fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kqj0(ugd ugdVar, int i, byte b) {
        this.f18726a = b;
        this.b = ugdVar;
    }
}
