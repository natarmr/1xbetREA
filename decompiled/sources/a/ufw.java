package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ufw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35595a;
    public final /* synthetic */ pa00 b;

    public /* synthetic */ ufw(pa00 pa00Var, byte b) {
        this.f35595a = b;
        this.b = pa00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        byte b = this.f35595a;
        pa00 pa00Var = this.b;
        switch (b) {
            case 0:
                size = pa00Var.c.size();
                break;
            default:
                size = pa00Var.c.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
