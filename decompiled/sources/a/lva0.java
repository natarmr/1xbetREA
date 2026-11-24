package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lva0 implements w9e0, jva0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20705a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lva0(Object obj, byte b) {
        this.f20705a = b;
        this.b = obj;
    }

    @Override // a.jva0
    public final Object b(String str, Function1 function1, zje zjeVar) {
        byte b = this.f20705a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((yva0) obj).b(str, function1, zjeVar);
            default:
                return ((tkn0) obj).b(str, function1, zjeVar);
        }
    }

    @Override // a.w9e0
    public final qpg0 d() {
        byte b = this.f20705a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((yva0) obj).f43310a;
            default:
                return ((tkn0) obj).f34104a;
        }
    }
}
