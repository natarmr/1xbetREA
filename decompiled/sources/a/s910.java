package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class s910 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31830a;
    public final /* synthetic */ u910 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s910(u910 u910Var, byte b) {
        super(0);
        this.f31830a = b;
        this.b = u910Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31830a;
        u910 u910Var = this.b;
        switch (b) {
            case 0:
                float f = 0.0f;
                if (u910Var.c() != null) {
                    if (u910Var.g() < 0.0f) {
                        u910Var.b();
                    } else {
                        u910Var.b();
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                return Float.valueOf((((Boolean) ((hgk0) u910Var.d).getValue()).booleanValue() && u910Var.e() % 2 == 0) ? -u910Var.g() : u910Var.g());
            default:
                return Boolean.valueOf(u910Var.e() == ((Number) ((hgk0) u910Var.c).getValue()).intValue() && u910Var.f() == ((Number) u910Var.m.getValue()).floatValue());
        }
    }
}
