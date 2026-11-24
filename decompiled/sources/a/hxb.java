package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hxb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13807a;
    public final /* synthetic */ yxb b;

    public /* synthetic */ hxb(yxb yxbVar, byte b) {
        this.f13807a = b;
        this.b = yxbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ArrayList arrayListN0;
        Object value2;
        ArrayList arrayListN1;
        bby bbyVar;
        byte b = this.f13807a;
        yxb yxbVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = yxbVar.o;
                do {
                    value = p7m0Var.getValue();
                    arrayListN0 = CollectionsKt.N0((List) value);
                    arrayListN0.remove(ixb.f15534a);
                } while (!p7m0Var.m(value, arrayListN0));
                break;
            case 1:
                yxbVar.b();
                break;
            case 2:
                p7m0 p7m0Var2 = yxbVar.o;
                do {
                    value2 = p7m0Var2.getValue();
                    arrayListN1 = CollectionsKt.N0((List) value2);
                    arrayListN1.remove(ixb.b);
                } while (!p7m0Var2.m(value2, arrayListN1));
                break;
            case 3:
                if (!yxbVar.C && ((bbyVar = yxbVar.y) == null || !bbyVar.isActive())) {
                    yxbVar.y = sac.V(yxbVar.n, sxb.f32968a, null, null, new mxb(yxbVar, null, (byte) 3), 14);
                }
                break;
            default:
                yxbVar.b();
                break;
        }
        return Unit.f46060a;
    }
}
