package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class o2b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24524a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ o2b0(byte b, long j, Function1 function1) {
        this.f24524a = b;
        this.b = function1;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24524a) {
            case 0:
                this.b.invoke(new y1b0(this.c));
                break;
            case 1:
                this.b.invoke(new y1b0(this.c));
                break;
            default:
                this.b.invoke(new v1b0(this.c));
                break;
        }
        return Unit.f46060a;
    }
}
