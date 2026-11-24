package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class b1z implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1830a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ b1z(Function1 function1, byte b) {
        this.f1830a = b;
        this.b = function1;
    }

    @Override // a.kwk
    public final void a() {
        byte b = this.f1830a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(d0z.f5287a);
                break;
            default:
                function1.invoke(ty20.e);
                break;
        }
    }
}
