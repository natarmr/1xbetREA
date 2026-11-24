package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class uzv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36554a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uzv0(Object obj, byte b) {
        this.f36554a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36554a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((avs0) obj).invoke();
            default:
                return (g80) obj;
        }
    }
}
