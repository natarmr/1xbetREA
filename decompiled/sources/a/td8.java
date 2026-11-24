package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class td8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33754a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ td8(ArrayList arrayList, Function1 function1, byte b) {
        this.f33754a = b;
        this.b = arrayList;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33754a;
        Function1 function1 = this.c;
        ArrayList arrayList = this.b;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(arrayList.size(), new at7(new i87((byte) 25), arrayList, (byte) 2), new j13(arrayList, (byte) 2, false), new ugd(2039820996, true, new sh0(arrayList, function1, b2)));
                break;
            case 1:
                xdz xdzVar = (xdz) obj;
                xdzVar.getClass();
                xdzVar.e(arrayList.size(), null, new j13(arrayList, (byte) 12, false), null, new ugd(-334987442, true, new sh0(arrayList, function1, (byte) 3)));
                break;
            case 2:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(arrayList.size(), null, new j13(arrayList, (byte) 21, false), new ugd(802480018, true, new sh0(arrayList, function1, (byte) 6)));
                break;
            case 3:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(arrayList.size(), new zu90((byte) 28, new bue0(b3), arrayList), new j13(arrayList, (byte) 24, false), new ugd(802480018, true, new sh0(arrayList, function1, (byte) 7)));
                break;
            case 4:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(arrayList.size(), null, new j13(arrayList, (byte) 25, false), new ugd(802480018, true, new sh0(arrayList, function1, (byte) 8)));
                break;
            default:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(arrayList.size(), new o3l0(new acm0((byte) 0), arrayList, (byte) 27), new t9l0(arrayList, (byte) 5), new ugd(2039820996, true, new h8w((List) arrayList, (Object) arrayList, function1, (byte) 26)));
                break;
        }
        return Unit.f46060a;
    }
}
