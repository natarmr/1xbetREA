package a;

import android.text.Editable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fsp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10074a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fsp0(int i, Function1 function1) {
        this.b = i;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        byte b = this.f10074a;
        Function1 function1 = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ctp0 ctp0Var = (ctp0) obj;
                ctp0Var.getClass();
                function1.invoke(new wrp0(ctp0Var, i2));
                break;
            default:
                Editable editable = (Editable) obj;
                editable.getClass();
                int iU = StringsKt.U('.', 0, 6, editable.toString());
                if (iU > 0 && (i = iU + 1 + i2) < editable.length()) {
                    editable.delete(i, editable.length());
                }
                function1.invoke(editable);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fsp0(Function1 function1, int i) {
        this.c = function1;
        this.b = i;
    }
}
