package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class lnx extends yzf0 {
    public byte i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ yje k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnx(yje yjeVar, yje yjeVar2, Function2 function2) {
        super(yjeVar);
        this.j = function2;
        this.k = yjeVar2;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        if (b != 0) {
            if (b != 1) {
                jf4.n("This coroutine had already completed");
                return null;
            }
            this.i = (byte) 2;
            z1x.P(obj);
            return obj;
        }
        this.i = (byte) 1;
        z1x.P(obj);
        Function2 function2 = this.j;
        function2.getClass();
        zys0.e(2, function2);
        return function2.invoke(this.k, this);
    }
}
