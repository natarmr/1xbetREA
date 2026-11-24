package a;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hty implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13657a;
    public final /* synthetic */ jty b;

    public /* synthetic */ hty(jty jtyVar, byte b) {
        this.f13657a = b;
        this.b = jtyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intentQ;
        byte b = this.f13657a;
        jty jtyVar = this.b;
        switch (b) {
            case 0:
                gst gstVar = jty.f2;
                fiu0 fiu0Var = jtyVar.d2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gst gstVar2 = jty.f2;
                Context contextD = jtyVar.D();
                if (contextD != null && (intentQ = j120.Q(contextD)) != null) {
                    Intent intentPutExtra = intentQ.putExtra("OPEN_PAYMENT", true);
                    intentPutExtra.getClass();
                    jtyVar.w0(intentPutExtra);
                }
                return Unit.f46060a;
            default:
                gst gstVar3 = jty.f2;
                if (!jtyVar.R()) {
                    jtyVar.x0();
                }
                return Unit.f46060a;
        }
    }
}
