package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12899a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ he10(byte b, int i, Function0 function0) {
        this.f12899a = b;
        this.b = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12899a) {
            case 0:
                return new bwj(this.b, 0.0f, this.c);
            default:
                return new kwj(this.b, 0.0f, this.c);
        }
    }
}
