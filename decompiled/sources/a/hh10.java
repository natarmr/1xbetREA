package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13040a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hh10(Object obj, float f, Object obj2, byte b) {
        this.f13040a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        byte b = this.f13040a;
        Object obj = this.d;
        float f = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(((w6k) obj2).w0(((Number) ((l7m0) obj).getValue()).floatValue() * f));
            default:
                a8x a8xVar = (a8x) obj;
                int iE = ys90.e((xcz) obj2, f);
                if (a8xVar != null && (iE = iE % (i = a8xVar.f450a)) < 0) {
                    iE += i;
                }
                return Integer.valueOf(iE);
        }
    }
}
