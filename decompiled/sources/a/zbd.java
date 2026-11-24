package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zbd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44109a;
    public final /* synthetic */ pl7 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zbd(pl7 pl7Var, Function1 function1, byte b) {
        this.f44109a = b;
        this.b = pl7Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44109a;
        Function1 function1 = this.c;
        pl7 pl7Var = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                ArrayList arrayList = ((ll7) pl7Var).d;
                hczVar.f(arrayList.size(), new at7(new y2d((byte) 7), arrayList, (byte) 22), new j13(arrayList, (byte) 11, false), new ugd(802480018, true, new sh0(arrayList, function1, (byte) 2)));
                break;
            case 1:
                hczVar.getClass();
                ArrayList arrayList2 = ((ll7) pl7Var).d;
                hczVar.f(arrayList2.size(), new m160(new mb50((byte) 21), arrayList2, (byte) 9), new j13(arrayList2, (byte) 19, false), new ugd(802480018, true, new sh0(arrayList2, function1, (byte) 5)));
                break;
            case 2:
                hczVar.getClass();
                ArrayList arrayList3 = ((ll7) pl7Var).d;
                hczVar.f(arrayList3.size(), new pwe0(new wtf0((byte) 27), arrayList3, (byte) 11), new j13(arrayList3, (byte) 26, false), new ugd(802480018, true, new sh0(arrayList3, function1, (byte) 9)));
                break;
            default:
                hczVar.getClass();
                ArrayList arrayList4 = ((ll7) pl7Var).d;
                hczVar.f(arrayList4.size(), new zcn0(new meo0((byte) 8), arrayList4, (byte) 9), new t9l0(arrayList4, (byte) 8), new ugd(802480018, true, new sh0(arrayList4, function1, (byte) 10)));
                break;
        }
        return Unit.f46060a;
    }
}
