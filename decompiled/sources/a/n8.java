package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23064a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ pqv c;

    public /* synthetic */ n8(Function1 function1, pqv pqvVar, byte b) {
        this.f23064a = b;
        this.b = function1;
        this.c = pqvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23064a) {
            case 0:
                this.b.invoke(new iu30(this.c.n()));
                break;
            default:
                this.b.invoke(new iu30(this.c.n()));
                break;
        }
        return Unit.f46060a;
    }
}
