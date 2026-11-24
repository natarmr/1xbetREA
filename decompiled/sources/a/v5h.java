package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36825a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ b7h d;

    public /* synthetic */ v5h(Function1 function1, long j, b7h b7hVar, byte b) {
        this.f36825a = b;
        this.b = function1;
        this.c = j;
        this.d = b7hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36825a;
        b7h b7hVar = this.d;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new v5h(this.b, this.c, this.d, (byte) 2)).a();
                break;
            case 1:
                fxb.D(ivb0.b, new v5h(this.b, this.c, this.d, (byte) 3)).a();
                break;
            case 2:
                function1.invoke(new i6h(this.c, !b7hVar.c, b7hVar.f2108a));
                break;
            default:
                function1.invoke(new k6h(!b7hVar.d, b7hVar.b, this.c, b7hVar.f2108a));
                break;
        }
        return Unit.f46060a;
    }
}
