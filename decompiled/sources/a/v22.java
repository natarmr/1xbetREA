package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class v22 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36663a;
    public final /* synthetic */ nla b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ v22(nla nlaVar, Function1 function1, byte b) {
        this.f36663a = b;
        this.b = nlaVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36663a;
        nla nlaVar = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (nlaVar instanceof lla) {
                    if (bemVar instanceof wdm) {
                        function1.invoke(new m22(new hll0(((lla) nlaVar).a())));
                    } else if ((bemVar instanceof rdm) || (bemVar instanceof xdm)) {
                        function1.invoke(new m22(new gll0(((lla) nlaVar).a())));
                    }
                }
                break;
            case 1:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                if (nlaVar instanceof lla) {
                    if (bemVar2 instanceof wdm) {
                        function1.invoke(new m5g0(new hll0(((lla) nlaVar).a())));
                    } else if ((bemVar2 instanceof rdm) || (bemVar2 instanceof xdm)) {
                        function1.invoke(new m5g0(new gll0(((lla) nlaVar).a())));
                    }
                }
                break;
            default:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                if (nlaVar instanceof lla) {
                    if (bemVar3 instanceof wdm) {
                        function1.invoke(new qeh0(new hll0(((lla) nlaVar).a())));
                    } else if ((bemVar3 instanceof rdm) || (bemVar3 instanceof xdm)) {
                        function1.invoke(new qeh0(new gll0(((lla) nlaVar).a())));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
