package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class izb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15627a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ szb c;

    public /* synthetic */ izb(Function1 function1, szb szbVar, byte b) {
        this.f15627a = b;
        this.b = function1;
        this.c = szbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15627a;
        szb szbVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new jve0(szbVar.f33064a));
                break;
            default:
                function1.invoke(new jve0(szbVar.f33064a));
                break;
        }
        return Unit.f46060a;
    }
}
