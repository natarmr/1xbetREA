package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qrb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xcz f29202a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function1 d;

    public qrb0(xcz xczVar, vne vneVar, int i, Function1 function1) {
        this.f29202a = xczVar;
        this.b = vneVar;
        this.c = i;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xcz xczVar = this.f29202a;
        int i = this.c;
        qjj.W(this.b, null, null, new u52(xczVar, i, (yje) null, (byte) 18), 3);
        this.d.invoke(Integer.valueOf(i));
        return Unit.f46060a;
    }
}
