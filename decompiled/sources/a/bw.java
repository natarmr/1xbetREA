package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3300a = 1;
    public final /* synthetic */ ow b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bw(ow owVar, Function1 function1) {
        this.b = owVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3300a;
        Function1 function1 = this.c;
        ow owVar = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.c)) {
                    function1.invoke(new tv(((mw) owVar).f));
                }
                break;
            default:
                ((jly) obj).getClass();
                mw mwVar = (mw) owVar;
                if (mwVar.g) {
                    function1.invoke(new tv(mwVar.f));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bw(Function1 function1, ow owVar) {
        this.c = function1;
        this.b = owVar;
    }
}
