package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d8l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5655a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ v2n c;

    public /* synthetic */ d8l0(Function1 function1, v2n v2nVar, byte b) {
        this.f5655a = b;
        this.b = function1;
        this.c = v2nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5655a;
        v2n v2nVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (function1 != null) {
                    function1.invoke(v2nVar);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(v2nVar);
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(v2nVar);
                }
                break;
        }
        return Unit.f46060a;
    }
}
