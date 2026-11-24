package a;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j02 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15662a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ m02 c;
    public final /* synthetic */ Context d;

    public /* synthetic */ j02(Function1 function1, m02 m02Var, Context context, byte b) {
        this.f15662a = b;
        this.b = function1;
        this.c = m02Var;
        this.d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15662a;
        Context context = this.d;
        m02 m02Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                new bjj(ymx.INTERVAL_750, true, new j02(function1, m02Var, context, (byte) 1)).a();
                break;
            default:
                u0f0 u0f0Var = m02Var.f20933a;
                File filesDir = context.getFilesDir();
                filesDir.getClass();
                function1.invoke(new m8f0(u0f0Var, filesDir));
                break;
        }
        return Unit.f46060a;
    }
}
