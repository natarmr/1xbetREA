package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class xjp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40997a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ grq c;

    public /* synthetic */ xjp(Function1 function1, grq grqVar, byte b) {
        this.f40997a = b;
        this.b = function1;
        this.c = grqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40997a) {
            case 0:
                this.b.invoke(new kjp(this.c.f11793a));
                break;
            default:
                this.b.invoke(new kjp(this.c.f11793a));
                break;
        }
        return Unit.f46060a;
    }
}
