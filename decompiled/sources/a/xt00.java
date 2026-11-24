package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class xt00 extends cu00 {
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt00(eu00 eu00Var, Function0 function0, Object obj) {
        super(eu00Var, function0);
        this.d = obj;
    }

    @Override // a.bu00
    public final s88 c(boolean z) {
        return new s88(this.d, false, (byte) 7);
    }
}
