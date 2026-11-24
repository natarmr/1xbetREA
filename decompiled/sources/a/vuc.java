package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vuc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38041a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ xpj0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ vuc(vne vneVar, xpj0 xpj0Var, Function1 function1, byte b) {
        this.f38041a = b;
        this.b = vneVar;
        this.c = xpj0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38041a;
        final Function1 function1 = this.d;
        final xpj0 xpj0Var = this.c;
        vne vneVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 5), 3).invokeOnCompletion(new Function1() { // from class: a.wuc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        Function1 function2 = function1;
                        xpj0 xpj0Var2 = xpj0Var;
                        switch (b3) {
                            case 0:
                                if (!xpj0Var2.e()) {
                                    function2.invoke(a74.f346a);
                                }
                                break;
                            default:
                                if (!xpj0Var2.e()) {
                                    function2.invoke(b74.f2084a);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                final byte b3 = 1;
                qjj.W(vneVar, null, null, new xp8(xpj0Var, null, (byte) 6), 3).invokeOnCompletion(new Function1() { // from class: a.wuc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        Function1 function2 = function1;
                        xpj0 xpj0Var2 = xpj0Var;
                        switch (b4) {
                            case 0:
                                if (!xpj0Var2.e()) {
                                    function2.invoke(a74.f346a);
                                }
                                break;
                            default:
                                if (!xpj0Var2.e()) {
                                    function2.invoke(b74.f2084a);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }
}
