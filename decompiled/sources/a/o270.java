package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o270 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24519a;
    public final /* synthetic */ gxu b;

    public /* synthetic */ o270(gxu gxuVar, byte b) {
        this.f24519a = b;
        this.b = gxuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24519a;
        gxu gxuVar = this.b;
        switch (b) {
            case 0:
                return (nz60) ((gii0) gxuVar.f12096a).b(sre0.f32672a.b(nz60.class));
            default:
                return (is60) ((gii0) gxuVar.f12096a).b(sre0.f32672a.b(is60.class));
        }
    }
}
