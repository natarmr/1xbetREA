package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tf30 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33848a;
    public final /* synthetic */ xcz b;

    public /* synthetic */ tf30(xcz xczVar, byte b) {
        this.f33848a = b;
        this.b = xczVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f33848a;
        xcz xczVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                int i = xczVar.j().o - 1;
                if (i < 0) {
                    return Unit.f46060a;
                }
                Object objL = xczVar.l(i, 0, yjeVar);
                return objL == wne.f39444a ? objL : Unit.f46060a;
            default:
                ((Number) obj).intValue();
                int i2 = xczVar.j().o - 1;
                if (i2 < 0) {
                    return Unit.f46060a;
                }
                Object objL2 = xczVar.l(i2, 0, yjeVar);
                return objL2 == wne.f39444a ? objL2 : Unit.f46060a;
        }
    }
}
