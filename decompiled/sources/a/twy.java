package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class twy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34673a;
    public final /* synthetic */ o6w b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ twy(o6w o6wVar, Function1 function1, byte b) {
        this.f34673a = b;
        this.b = o6wVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34673a;
        Function1 function1 = this.c;
        o6w o6wVar = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                a4x a4xVar = o6wVar.f24758a;
                hczVar.f(a4xVar.size(), null, new far(a4xVar, (byte) 28), new ugd(802480018, true, new yul(a4xVar, function1, (byte) 14)));
                break;
            case 1:
                hczVar.getClass();
                a4x a4xVar2 = o6wVar.f24758a;
                hczVar.f(a4xVar2.size(), null, new ap30(a4xVar2, (byte) 2), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) o6wVar, function1, (byte) 7)));
                break;
            case 2:
                hczVar.getClass();
                a4x a4xVar3 = o6wVar.f24758a;
                hczVar.f(a4xVar3.size(), null, new ap30(a4xVar3, (byte) 4), new ugd(802480018, true, new a100(a4xVar3, function1, (byte) 8)));
                break;
            default:
                hczVar.getClass();
                a4x a4xVar4 = o6wVar.f24758a;
                hczVar.f(a4xVar4.size(), null, new y9k0(a4xVar4, (byte) 2), new ugd(802480018, true, new njh0(a4xVar4, function1, (byte) 9)));
                break;
        }
        return Unit.f46060a;
    }
}
