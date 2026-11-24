package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sgh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32160a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ h7h c;

    public /* synthetic */ sgh(Function1 function1, h7h h7hVar, byte b) {
        this.f32160a = b;
        this.b = function1;
        this.c = h7hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32160a;
        h7h h7hVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new sgh(function1, h7hVar, (byte) 1)).a();
                break;
            default:
                function1.invoke(Long.valueOf(h7hVar.f12573a));
                break;
        }
        return Unit.f46060a;
    }
}
