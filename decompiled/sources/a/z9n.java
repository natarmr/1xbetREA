package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z9n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44028a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ z9n(Function2 function2, pz40 pz40Var, byte b) {
        this.f44028a = b;
        this.b = function2;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44028a;
        pz40 pz40Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                function2.invoke(num, pz40Var.getValue());
                break;
            case 1:
                q9v q9vVar = (q9v) obj;
                function2.invoke(q9vVar != null ? Integer.valueOf(q9vVar.f28366a.f31866a) : null, null);
                if (q9vVar != null && q9vVar.f28366a.f31866a == 20) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                q9v q9vVar2 = (q9v) obj;
                function2.invoke(null, q9vVar2 != null ? Integer.valueOf(q9vVar2.f28366a.f31866a) : null);
                if (q9vVar2 != null && q9vVar2.f28366a.f31866a == 20) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
