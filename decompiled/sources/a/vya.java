package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vya implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38238a;
    public final /* synthetic */ yya b;

    public /* synthetic */ vya(yya yyaVar, byte b) {
        this.f38238a = b;
        this.b = yyaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38238a;
        yya yyaVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                yyaVar.f.a(th);
                yyaVar.k.b(th, new bna(yyaVar, (byte) 5));
                break;
            default:
                th.getClass();
                yyaVar.k.b(th, new kea(yyaVar, th, (byte) 8));
                yyaVar.f.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
