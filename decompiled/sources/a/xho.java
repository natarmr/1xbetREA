package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xho implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40903a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ xho(ArrayList arrayList, Function2 function2, byte b) {
        this.f40903a = b;
        this.b = arrayList;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40903a;
        Function2 function2 = this.c;
        ArrayList arrayList = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                hczVar.f(arrayList.size(), new ctl(new x6o((byte) 9), arrayList, (byte) 28), new j13(arrayList, (byte) 14, false), new ugd(2039820996, true, new fda(arrayList, function2, (byte) 2)));
                break;
            default:
                hczVar.getClass();
                hczVar.f(arrayList.size(), null, new j13(arrayList, (byte) 23, false), new ugd(802480018, true, new fda(arrayList, function2, (byte) 3)));
                break;
        }
        return Unit.f46060a;
    }
}
