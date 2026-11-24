package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cv70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5018a;
    public final /* synthetic */ bb00 b;

    public /* synthetic */ cv70(bb00 bb00Var, byte b) {
        this.f5018a = b;
        this.b = bb00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size;
        byte b = this.f5018a;
        bb00 bb00Var = this.b;
        switch (b) {
            case 0:
                size = bb00Var.d.size();
                break;
            default:
                size = bb00Var.d.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
