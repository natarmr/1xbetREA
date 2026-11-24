package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ojl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25364a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ bkl c;

    public /* synthetic */ ojl(Function1 function1, bkl bklVar, byte b) {
        this.f25364a = b;
        this.b = function1;
        this.c = bklVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25364a) {
            case 0:
                this.b.invoke(this.c);
                break;
            case 1:
                this.b.invoke(this.c);
                break;
            case 2:
                this.b.invoke(this.c);
                break;
            case 3:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
        return Unit.f46060a;
    }
}
