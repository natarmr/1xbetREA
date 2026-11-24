package a;

import android.os.SystemClock;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vpj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37809a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ vpj0(Function0 function0, byte b) {
        this.f37809a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37809a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) function0.invoke()).floatValue());
            case 1:
                function0.invoke();
                return Boolean.FALSE;
            case 2:
                ((String) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 3:
                ((wgl0) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 4:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 5:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 6:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 7:
                return (ne60) function0.invoke();
            case 8:
                int i = TextInputEditTextNew.j2;
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 9:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 10:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 11:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 12:
                ((iz3) obj).getClass();
                function0.invoke();
                return Unit.f46060a;
            case 13:
                if (((Integer) obj).intValue() == 0) {
                    ymx ymxVar = ymx.INTERVAL_100;
                    if (SystemClock.uptimeMillis() - ivb0.c > 400) {
                        function0.invoke();
                        dyb.u0();
                    }
                }
                return Unit.f46060a;
            default:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(((Number) function0.invoke()).floatValue());
                return Unit.f46060a;
        }
    }
}
