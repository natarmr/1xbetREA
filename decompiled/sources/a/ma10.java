package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ma10 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21439a;
    public final /* synthetic */ na10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma10(na10 na10Var, byte b) {
        super(0);
        this.f21439a = b;
        this.b = na10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21439a;
        boolean z = false;
        na10 na10Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf((na10Var.b() == null && ((Throwable) ((hgk0) na10Var.c).getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) ((hgk0) na10Var.c).getValue()) != null);
            case 2:
                if (na10Var.b() == null && ((Throwable) ((hgk0) na10Var.c).getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(na10Var.b() != null);
        }
    }
}
