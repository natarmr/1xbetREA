package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lbg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19752a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ q5h c;

    public /* synthetic */ lbg(Function1 function1, q5h q5hVar, byte b) {
        this.f19752a = b;
        this.b = function1;
        this.c = q5hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19752a;
        q5h q5hVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new lbg(function1, q5hVar, (byte) 1)).a();
                break;
            default:
                function1.invoke(Long.valueOf(q5hVar.f28151a));
                break;
        }
        return Unit.f46060a;
    }
}
