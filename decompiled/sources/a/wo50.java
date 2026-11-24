package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class wo50 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39477a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ wo50(Function0 function0, byte b) {
        this.f39477a = b;
        this.b = function0;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f39477a) {
            case 0:
                if (((nlx) obj) instanceof nel) {
                    this.b.invoke();
                }
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    this.b.invoke();
                }
                break;
            default:
                ((Number) obj).intValue();
                this.b.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
