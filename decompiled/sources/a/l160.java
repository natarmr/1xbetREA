package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19234a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ jlb c;

    public /* synthetic */ l160(Function1 function1, jlb jlbVar, byte b) {
        this.f19234a = b;
        this.b = function1;
        this.c = jlbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19234a;
        jlb jlbVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((h2l0) obj).getClass();
                function1.invoke(new uy50(((hlb) jlbVar).f13250a));
                break;
            default:
                ((h2l0) obj).getClass();
                function1.invoke(new mb80(((hlb) jlbVar).f13250a));
                break;
        }
        return Unit.f46060a;
    }
}
