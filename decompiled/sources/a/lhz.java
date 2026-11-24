package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class lhz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20080a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nhz c;

    public /* synthetic */ lhz(Function1 function1, nhz nhzVar, byte b) {
        this.f20080a = b;
        this.b = function1;
        this.c = nhzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20080a;
        nhz nhzVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(nhzVar.f23559a);
                break;
            default:
                function1.invoke(nhzVar.f23559a);
                break;
        }
        return Unit.f46060a;
    }
}
