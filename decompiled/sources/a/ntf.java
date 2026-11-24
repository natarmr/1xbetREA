package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ntf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24097a;
    public final /* synthetic */ t33 b;
    public final /* synthetic */ float c;

    public /* synthetic */ ntf(byte b, float f, t33 t33Var) {
        this.f24097a = b;
        this.b = t33Var;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w6k w6kVar = (w6k) obj;
        switch (this.f24097a) {
            case 0:
                w6kVar.getClass();
                break;
            case 1:
                w6kVar.getClass();
                break;
            default:
                w6kVar.getClass();
                break;
        }
        return new ikx(((long) ((int) (((Number) this.b.d()).floatValue() * this.c))) << 32);
    }
}
