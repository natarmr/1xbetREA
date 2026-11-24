package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class au20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1459a;
    public final /* synthetic */ bu20 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ au20(bu20 bu20Var, int i, int i2, byte b) {
        this.f1459a = b;
        this.b = bu20Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1459a;
        int i = this.d;
        int i2 = this.c;
        bu20 bu20Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                Function2 function2 = bu20Var.g;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i2), Integer.valueOf(i));
                }
                return Unit.f46060a;
            default:
                view.getClass();
                Function2 function3 = bu20Var.h;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(i2), Integer.valueOf(i));
                }
                return Boolean.TRUE;
        }
    }
}
