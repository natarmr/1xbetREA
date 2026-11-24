package a;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yma implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42879a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yma(Window window, boolean z, byte b) {
        this.f42879a = b;
        this.b = window;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        byte b = this.f42879a;
        boolean z = this.c;
        Window window = this.b;
        switch (b) {
            case 0:
                Window window2 = this.b;
                if (window2 != null) {
                    Context context = window2.getContext();
                    context.getClass();
                    TypedValue typedValue = j5d.f15927a;
                    Context context2 = window2.getContext();
                    context2.getClass();
                    ofm0.A(window2, context, R.color.static_transparent, j5d.a(context2, R.attr.uikitBackgroundContent, true), false, this.c);
                }
                break;
            case 1:
                window.getClass();
                ani0 ani0Var = new ani0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    ziv0Var = new bjv0(window, ani0Var);
                } else if (i >= 30) {
                    ziv0Var = new ajv0(window, ani0Var);
                } else {
                    ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                }
                ziv0Var.w(!z);
                break;
            default:
                window.getClass();
                ani0 ani0Var2 = new ani0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    ziv0Var2 = new bjv0(window, ani0Var2);
                } else if (i2 >= 30) {
                    ziv0Var2 = new ajv0(window, ani0Var2);
                } else {
                    ziv0Var2 = i2 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
                }
                ziv0Var2.w(!z);
                break;
        }
        return Unit.f46060a;
    }
}
