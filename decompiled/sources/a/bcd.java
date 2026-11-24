package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class bcd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2352a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tjz c;

    public /* synthetic */ bcd(Function1 function1, tjz tjzVar, byte b) {
        this.f2352a = b;
        this.b = function1;
        this.c = tjzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2352a;
        tjz tjzVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(tjzVar);
                break;
            default:
                fxb.D(ivb0.b, new bcd(function1, tjzVar, (byte) 0)).a();
                break;
        }
        return Unit.f46060a;
    }
}
