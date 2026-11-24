package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rfd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30382a;
    public final /* synthetic */ agd b;

    public /* synthetic */ rfd(agd agdVar, byte b) {
        this.f30382a = b;
        this.b = agdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30382a;
        byte b2 = 0;
        agd agdVar = this.b;
        switch (b) {
            case 0:
                agdVar.reportFullyDrawn();
                return Unit.f46060a;
            case 1:
                return new zcr(agdVar.f, new rfd(agdVar, b2));
            case 2:
                cnk cnkVar = new cnk();
                agdVar.b().b(cnkVar);
                return cnkVar;
            case 3:
                return new r0h0(agdVar.getApplication(), agdVar, agdVar.getIntent() != null ? agdVar.getIntent().getExtras() : null);
            default:
                jg60 jg60Var = new jg60(new qfd(agdVar, (byte) 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                        agdVar.f44297a.a(new sfd(jg60Var, agdVar, b2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fy2(agdVar, jg60Var, (byte) 27));
                    }
                }
                return jg60Var;
        }
    }
}
