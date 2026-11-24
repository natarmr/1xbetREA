package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h2z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12360a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ y1z c;

    public /* synthetic */ h2z(Function1 function1, y1z y1zVar, byte b) {
        this.f12360a = b;
        this.b = function1;
        this.c = y1zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12360a;
        y1z y1zVar = this.c;
        Function1 function1 = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                function1.invoke(((x1z) y1zVar).f40142a);
                break;
            default:
                str.getClass();
                function1.invoke(((w1z) y1zVar).f38425a);
                break;
        }
        return Unit.f46060a;
    }
}
