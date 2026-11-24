package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class wta implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39731a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ wta(pz40 pz40Var, byte b) {
        this.f39731a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39731a) {
            case 0:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) this.b.getValue()).floatValue())) & 4294967295L);
            case 1:
                this.b.setValue((String) obj);
                return Unit.f46060a;
            default:
                this.b.setValue((String) obj);
                return Unit.f46060a;
        }
    }
}
