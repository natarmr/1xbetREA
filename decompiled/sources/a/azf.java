package a;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class azf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1715a;
    public final /* synthetic */ n5a b;

    public /* synthetic */ azf(n5a n5aVar, byte b) {
        this.f1715a = b;
        this.b = n5aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1715a;
        n5a n5aVar = this.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (n5aVar.q() instanceof j660) {
                    e0g0 e0g0Var = j0g0.b;
                    n5aVar.resumeWith(bitmap);
                }
                return Unit.f46060a;
            default:
                e0g0 e0g0Var2 = j0g0.b;
                Unit unit = Unit.f46060a;
                n5aVar.resumeWith(unit);
                return unit;
        }
    }
}
