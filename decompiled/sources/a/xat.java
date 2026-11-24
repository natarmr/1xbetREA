package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xat implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40573a;
    public final /* synthetic */ pbt b;

    public /* synthetic */ xat(pbt pbtVar, byte b) {
        this.f40573a = b;
        this.b = pbtVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40573a;
        pbt pbtVar = this.b;
        switch (b) {
            case 0:
                g7d g7dVar = pbtVar.c;
                g7dVar.c = false;
                g7dVar.e = null;
                break;
            case 1:
                g7d g7dVar2 = pbtVar.c;
                g7dVar2.c = false;
                g7dVar2.e = null;
                break;
            default:
                pbtVar.f.f29753a.n(null);
                break;
        }
        return Unit.f46060a;
    }
}
