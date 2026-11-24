package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r910 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30055a;
    public final /* synthetic */ u910 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r910(u910 u910Var, int i, byte b) {
        super(1);
        this.f30055a = b;
        this.b = u910Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30055a;
        int i = this.c;
        u910 u910Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Boolean.valueOf(u910Var.h(i, ((Number) obj).longValue()));
    }
}
