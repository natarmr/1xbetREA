package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yaz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42317a;
    public final /* synthetic */ dfv b;
    public final /* synthetic */ zaz c;

    public /* synthetic */ yaz(dfv dfvVar, zaz zazVar, byte b) {
        this.f42317a = b;
        this.b = dfvVar;
        this.c = zazVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42317a;
        zaz zazVar = this.c;
        dfv dfvVar = this.b;
        t33 t33Var = (t33) obj;
        switch (b) {
            case 0:
                dfvVar.g(((Number) t33Var.d()).floatValue());
                zazVar.c.invoke();
                break;
            default:
                dfvVar.g(((Number) t33Var.d()).floatValue());
                zazVar.c.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
