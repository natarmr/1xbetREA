package a;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qkh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28884a;
    public final /* synthetic */ klh b;

    public /* synthetic */ qkh(klh klhVar, byte b) {
        this.f28884a = b;
        this.b = klhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28884a;
        klh klhVar = this.b;
        switch (b) {
            case 0:
                ojh ojhVar = (ojh) obj;
                ojhVar.getClass();
                return pgi0.p(CollectionsKt.I(ojhVar.f), new qkh(klhVar, (byte) 1));
            default:
                zjh zjhVar = (zjh) obj;
                zjhVar.getClass();
                return new Pair(klhVar.f18487a, zjhVar);
        }
    }
}
