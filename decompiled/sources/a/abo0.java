package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class abo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f589a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ i3t0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ abo0(vne vneVar, i3t0 i3t0Var, Function1 function1, byte b) {
        this.f589a = b;
        this.b = vneVar;
        this.c = i3t0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f589a;
        Function1 function1 = this.d;
        i3t0 i3t0Var = this.c;
        yje yjeVar = null;
        vne vneVar = this.b;
        switch (b) {
            case 0:
                ((lwk) obj).getClass();
                return new fgc0(qjj.W(vneVar, null, null, new zao0(i3t0Var, function1, yjeVar, (byte) 0), 3), (byte) 12);
            default:
                ((lwk) obj).getClass();
                return new fgc0(qjj.W(vneVar, null, null, new zao0(i3t0Var, function1, yjeVar, (byte) 1), 3), (byte) 18);
        }
    }
}
