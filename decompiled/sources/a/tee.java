package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tee implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33816a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ks9 c;

    public /* synthetic */ tee(Function1 function1, ks9 ks9Var, byte b) {
        this.f33816a = b;
        this.b = function1;
        this.c = ks9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33816a) {
            case 0:
                this.b.invoke(new kq9(((gs9) this.c).f11818a));
                break;
            default:
                this.b.invoke(new iq9(((hs9) this.c).f13569a));
                break;
        }
        return Unit.f46060a;
    }
}
