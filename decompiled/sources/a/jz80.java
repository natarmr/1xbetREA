package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jz80 implements v9e0, iva0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17398a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz80(Object obj, byte b) {
        this.f17398a = b;
        this.b = obj;
    }

    @Override // a.iva0
    public final Object a(String str, Function2 function2, zje zjeVar) {
        byte b = this.f17398a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((mz80) obj).a(str, function2, zjeVar);
            default:
                return ((xva0) obj).a(str, function2, zjeVar);
        }
    }

    @Override // a.v9e0
    public final Object c(kyh kyhVar, yje yjeVar) {
        byte b = this.f17398a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return kyhVar.invoke(((mz80) obj).b, yjeVar);
            default:
                return ((xva0) obj).c(kyhVar, yjeVar);
        }
    }
}
