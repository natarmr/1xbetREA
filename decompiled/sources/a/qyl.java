package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qyl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29539a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ qyl(Function2 function2, byte b) {
        this.f29539a = b;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fzg0 fzg0Var;
        byte b = this.f29539a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                mxl mxlVar = (mxl) obj;
                Integer num = (Integer) obj2;
                num.intValue();
                mxlVar.getClass();
                function2.invoke(mxlVar, num);
                return Unit.f46060a;
            case 1:
                azg0 azg0Var = (azg0) obj;
                List list = (List) function2.invoke(azg0Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (fzg0Var = azg0Var.b) != null && !fzg0Var.d(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 2:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) function2.invoke((azg0) obj, obj2)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            case 3:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (function2 == null) {
                        fetVar.e0(-1318105135);
                    } else {
                        fetVar.e0(511669808);
                        function2.invoke(fetVar, 0);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                pvm0.e(function2, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                pvm0.e(function2, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    function2.invoke(fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    function2.invoke(fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qyl(Function2 function2, int i, byte b) {
        this.f29539a = b;
        this.b = function2;
    }
}
