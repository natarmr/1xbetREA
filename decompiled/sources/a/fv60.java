package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fv60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10200a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ql5 c;

    public /* synthetic */ fv60(String str, ql5 ql5Var, byte b) {
        this.f10200a = b;
        this.b = str;
        this.c = ql5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10200a;
        ql5 ql5Var = this.c;
        switch (b) {
            case 0:
                ru60 ru60Var = (ru60) obj2;
                ewa ewaVar = ru60Var.f31111a;
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str = ql5Var.f;
                String str2 = this.b;
                str2.getClass();
                str.getClass();
                return ru60.a(ru60Var, new ewa(str2, strC, str), false, false, false, 0L, null, null, null, null, null, null, 0L, 8190);
            default:
                pn40 pn40Var2 = pn40.f27267a;
                return tcj0.a((tcj0) obj2, false, false, null, this.b, pn40.c(ql5Var.b, p3u0.c), ql5Var.f, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -449, 2097151);
        }
    }
}
