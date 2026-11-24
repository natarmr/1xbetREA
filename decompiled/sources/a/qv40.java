package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qv40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29372a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ qv40(a4x a4xVar, Function2 function2, byte b) {
        this.f29372a = b;
        this.b = a4xVar;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29372a;
        Function2 function2 = this.c;
        a4x a4xVar = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new ygy(new da40((byte) 12), a4xVar, (byte) 24), new ap30(a4xVar, (byte) 15), new ugd(802480018, true, new o0i(a4xVar, function2, (byte) 3)));
                break;
            default:
                hczVar.getClass();
                hczVar.f(a4xVar.size(), null, new a580(a4xVar, (byte) 4), new ugd(2039820996, true, new h8w((List) a4xVar, (Object) function2, (Object) a4xVar, (byte) 14)));
                break;
        }
        return Unit.f46060a;
    }
}
