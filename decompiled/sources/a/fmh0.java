package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fmh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9782a = 1;
    public final /* synthetic */ bmh0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fmh0(bmh0 bmh0Var, Function1 function1) {
        this.b = bmh0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9782a;
        Function1 function1 = this.c;
        bmh0 bmh0Var = this.b;
        switch (b) {
            case 0:
                ((jly) obj).getClass();
                function1.invoke(new ikh0((amh0) bmh0Var));
                return Unit.f46060a;
            default:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (bmh0Var instanceof xlh0) {
                    if (x5q0Var instanceof u5q0) {
                        function1.invoke(new gkh0((xlh0) bmh0Var));
                    }
                } else {
                    if (!(bmh0Var instanceof amh0)) {
                        t9f.b();
                        return null;
                    }
                    if (x5q0Var instanceof w5q0) {
                        String str = ((w5q0) x5q0Var).f38596a;
                        a8z a8zVar = dtm0.f6663a;
                        str.getClass();
                        function1.invoke(new lkh0(((Regex) dtm0.f6663a.getValue()).replace(StringsKt.x0(dtm0.b.replace(str, "")).toString(), Separators.SP), (amh0) bmh0Var));
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fmh0(Function1 function1, bmh0 bmh0Var) {
        this.c = function1;
        this.b = bmh0Var;
    }
}
