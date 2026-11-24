package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class hdr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12883a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ qpo c;

    public /* synthetic */ hdr0(Function1 function1, qpo qpoVar, byte b) {
        this.f12883a = b;
        this.b = function1;
        this.c = qpoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12883a;
        qpo qpoVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ckb0(new vfj(qpoVar.f29130a)));
                break;
            default:
                function1.invoke(new ckb0(new sfj(qpoVar.f29130a)));
                break;
        }
        return Unit.f46060a;
    }
}
