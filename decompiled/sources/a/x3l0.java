package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class x3l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40226a;
    public final /* synthetic */ ngk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x3l0(ngk0 ngk0Var, String str, byte b) {
        this.f40226a = b;
        this.b = ngk0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40226a) {
            case 0:
                ((lwk) obj).getClass();
                return new w3l0(this.b, this.c, (byte) 0);
            case 1:
                ((lwk) obj).getClass();
                return new w3l0(this.b, this.c, (byte) 1);
            case 2:
                ((lwk) obj).getClass();
                return new w3l0(this.b, this.c, (byte) 2);
            default:
                ((lwk) obj).getClass();
                return new w3l0(this.b, this.c, (byte) 3);
        }
    }
}
