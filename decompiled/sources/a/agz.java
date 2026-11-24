package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class agz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f849a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ fgz c;

    public /* synthetic */ agz(Function1 function1, fgz fgzVar, byte b) {
        this.f849a = b;
        this.b = function1;
        this.c = fgzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f849a;
        fgz fgzVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Long.valueOf(fgzVar.f9518a));
                break;
            default:
                function1.invoke(Long.valueOf(fgzVar.f9518a));
                break;
        }
        return Unit.f46060a;
    }
}
