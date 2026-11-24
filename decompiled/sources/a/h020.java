package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h020 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12212a;
    public final /* synthetic */ l020 b;

    public /* synthetic */ h020(l020 l020Var, byte b) {
        this.f12212a = b;
        this.b = l020Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12212a;
        l020 l020Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                l020Var.j.b(th, new gm10((byte) 7));
                break;
            case 1:
                th.getClass();
                l020Var.j.b(th, new gm10((byte) 6));
                break;
            default:
                th.getClass();
                l020Var.j.b(th, new g2z(l020Var, (byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}
