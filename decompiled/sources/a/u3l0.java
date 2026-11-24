package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class u3l0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35003a;
    public final /* synthetic */ xdr b;

    public /* synthetic */ u3l0(xdr xdrVar, byte b) {
        this.f35003a = b;
        this.b = xdrVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f35003a;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                xdrVar.F((List) ((Pair) obj).b, null, null);
                break;
            case 1:
                xdrVar.F((List) ((Pair) obj).b, null, null);
                break;
            case 2:
                xdrVar.F((List) ((Pair) obj).b, null, null);
                break;
            default:
                xdrVar.F((List) ((Pair) obj).b, null, null);
                break;
        }
        return Unit.f46060a;
    }
}
