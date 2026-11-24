package a;

import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes3.dex */
public final class nn10 extends zje {
    public WebGameScreenFactoryImpl$getWebGameScreen$2 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pn10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.k = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.X(0L, null, false, null, this);
    }
}
