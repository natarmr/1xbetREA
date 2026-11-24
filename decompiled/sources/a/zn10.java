package a;

import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes3.dex */
public final class zn10 extends zje {
    public WebGameScreenFactoryImpl$getWebGameScreen$2 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bo10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn10(bo10 bo10Var, zje zjeVar) {
        super(zjeVar);
        this.k = bo10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.H(0L, null, false, null, this);
    }
}
