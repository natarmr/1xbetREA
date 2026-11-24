package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xxa implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41647a;
    public final /* synthetic */ aya b;

    public /* synthetic */ xxa(aya ayaVar, byte b) {
        this.f41647a = b;
        this.b = ayaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        wya wyaVar;
        ArrayList arrayList;
        byte b = this.f41647a;
        aya ayaVar = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = aya.S1;
                ayaVar.I0().x();
                return Unit.f46060a;
            case 1:
                bj5 bj5Var2 = aya.S1;
                yya yyaVarI0 = ayaVar.I0();
                ArrayList arrayList2 = yyaVarI0.n;
                arrayList2.clear();
                p7m0 p7m0Var = yyaVarI0.u;
                do {
                    value = p7m0Var.getValue();
                    wyaVar = (wya) value;
                    List list = wyaVar.f39964a;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(i1b.c((i1b) it.next(), true, false));
                    }
                } while (!p7m0Var.m(value, wya.a(wyaVar, arrayList, arrayList2.size(), null, 4)));
                return Unit.f46060a;
            case 2:
                bj5 bj5Var3 = aya.S1;
                i1w0 i1w0VarF = a4n0.f(ayaVar);
                sbi sbiVar = ayaVar.M1;
                if (sbiVar != null) {
                    return new ry3(i1w0VarF, sbiVar);
                }
                Intrinsics.h("cashBackChoosingViewModelFactory");
                throw null;
            default:
                bj5 bj5Var4 = aya.S1;
                vra vraVar = new vra(1, ayaVar.I0(), yya.class, "onGameChecked", "onGameChecked(Lorg/xplatform/onexuser/domain/entity/onexgame/configs/OneXGamesTypeCommon;)V", 0, (byte) 10);
                lza lzaVar = new lza();
                lzaVar.d.b(new gbn(new cr60((byte) 7), new iv60(3, (byte) 0), new cd60(vraVar, (byte) 8), xk60.c));
                lzaVar.f = iun.f15405a;
                return lzaVar;
        }
    }
}
