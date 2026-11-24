package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qe1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28559a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ bpl c;

    public /* synthetic */ qe1(Function1 function1, bpl bplVar, byte b) {
        this.f28559a = b;
        this.b = function1;
        this.c = bplVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28559a;
        bpl bplVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new rd1(bplVar));
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(bplVar);
                }
                break;
            default:
                if (function1 != null) {
                    function1.invoke(bplVar);
                }
                break;
        }
        return Unit.f46060a;
    }
}
