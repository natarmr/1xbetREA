package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ehj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7812a;
    public final /* synthetic */ j5b0 b;

    public /* synthetic */ ehj(j5b0 j5b0Var, byte b) {
        this.f7812a = b;
        this.b = j5b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7812a;
        j5b0 j5b0Var = this.b;
        switch (b) {
            case 0:
                j5b0Var.y();
                return Unit.f46060a;
            case 1:
                iij iijVar = j5b0Var.h;
                qjj.W(jiu0.a(iijVar.s()), ((mne) iijVar.e).b, null, new hij(iijVar, null, (byte) 0), 2);
                return Unit.f46060a;
            case 2:
                ((ouu) j5b0Var.h.f).q(new xa50(), true);
                return Unit.f46060a;
            case 3:
                return j5b0Var.l.a();
            case 4:
                j5b0Var.x(y4b0.f41994a);
                return Unit.f46060a;
            default:
                j5b0Var.x(y4b0.c);
                return Unit.f46060a;
        }
    }
}
