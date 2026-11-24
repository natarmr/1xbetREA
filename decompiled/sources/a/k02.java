package a;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k02 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17443a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ n02 c;
    public final /* synthetic */ Context d;

    public /* synthetic */ k02(Function1 function1, n02 n02Var, Context context, byte b) {
        this.f17443a = b;
        this.b = function1;
        this.c = n02Var;
        this.d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17443a;
        Context context = this.d;
        n02 n02Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                new bjj(ymx.INTERVAL_750, true, new k02(function1, n02Var, context, (byte) 1)).a();
                break;
            default:
                u0f0 u0f0Var = n02Var.f22680a;
                File filesDir = context.getFilesDir();
                filesDir.getClass();
                function1.invoke(new ave0(u0f0Var, filesDir));
                break;
        }
        return Unit.f46060a;
    }
}
