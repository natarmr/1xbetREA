package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fkb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9682a;
    public final /* synthetic */ nla b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fkb(nla nlaVar, Function1 function1, byte b) {
        this.f9682a = b;
        this.b = nlaVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9682a;
        Function1 function1 = this.c;
        nla nlaVar = this.b;
        bem bemVar = (bem) obj;
        switch (b) {
            case 0:
                bemVar.getClass();
                if (nlaVar instanceof lla) {
                    if (bemVar instanceof wdm) {
                        function1.invoke(new mjb(new hll0(((lla) nlaVar).a())));
                    } else if ((bemVar instanceof rdm) || (bemVar instanceof xdm)) {
                        function1.invoke(new mjb(new gll0(((lla) nlaVar).a())));
                    }
                }
                break;
            default:
                bemVar.getClass();
                if (nlaVar instanceof lla) {
                    if (bemVar instanceof wdm) {
                        function1.invoke(new cyy(new hll0(((lla) nlaVar).a())));
                    } else if ((bemVar instanceof rdm) || (bemVar instanceof xdm)) {
                        function1.invoke(new cyy(new gll0(((lla) nlaVar).a())));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
