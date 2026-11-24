package a;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c23 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3604a;
    public final /* synthetic */ h23 b;

    public /* synthetic */ c23(h23 h23Var, byte b) {
        this.f3604a = b;
        this.b = h23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3604a;
        byte b2 = 2;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = h23Var.f12312a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fx2(function0, (byte) 2));
                    }
                }
                return Unit.f46060a;
            case 1:
                ActionMode actionMode = h23Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.f46060a;
            case 2:
                ActionMode actionMode2 = h23Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.f46060a;
            default:
                h23Var.e.e();
                return new ty2(h23Var, b2);
        }
    }
}
