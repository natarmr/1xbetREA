package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class en implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8069a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ xcz e;

    public /* synthetic */ en(Function1 function1, vne vneVar, pz40 pz40Var, xcz xczVar) {
        this.f8069a = (byte) 0;
        this.c = function1;
        this.b = vneVar;
        this.d = pz40Var;
        this.e = xczVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8069a;
        Function1 function1 = this.c;
        vne vneVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                function1.invoke(new pm(str));
                qjj.W(vneVar, null, null, new in(this.d, str, this.e, null, (byte) 0), 3);
                break;
            case 1:
                str.getClass();
                qjj.W(vneVar, null, null, new in(this.d, str, this.e, null, (byte) 1), 3);
                function1.invoke(str);
                break;
            default:
                str.getClass();
                qjj.W(vneVar, null, null, new in(this.d, str, this.e, null, (byte) 2), 3);
                function1.invoke(str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ en(vne vneVar, Function1 function1, pz40 pz40Var, xcz xczVar, byte b) {
        this.f8069a = b;
        this.b = vneVar;
        this.c = function1;
        this.d = pz40Var;
        this.e = xczVar;
    }
}
