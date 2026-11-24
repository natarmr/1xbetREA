package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zwl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45111a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ int d;

    public /* synthetic */ zwl0(byte b, int i, a4x a4xVar, Function1 function1) {
        this.f45111a = b;
        this.b = function1;
        this.c = a4xVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45111a) {
            case 0:
                this.b.invoke(this.c.get(this.d));
                break;
            default:
                this.b.invoke(this.c.get(this.d));
                break;
        }
        return Unit.f46060a;
    }
}
