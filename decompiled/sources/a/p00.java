package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26123a;
    public final /* synthetic */ short b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p00(String str, d280 d280Var, String str2, d280 d280Var2, String str3, int i) {
        this.f26123a = (byte) 0;
        this.c = str;
        this.f = d280Var;
        this.d = str2;
        this.g = d280Var2;
        this.e = str3;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26123a;
        short s = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kc5.n0((String) obj7, (d280) obj4, (String) obj6, (d280) obj3, (String) obj5, (fet) obj, x8x.L(s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uzb.t((mm40) obj7, (kzc0) obj6, (izc0) obj5, (Integer) obj4, (Function2) obj3, (fet) obj, x8x.L(s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x1x.j((mm40) obj7, (ugd) obj6, (ugd) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, x8x.L(s | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p00(mm40 mm40Var, Object obj, Object obj2, Object obj3, Function2 function2, int i, byte b) {
        this.f26123a = b;
        this.c = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = function2;
        this.b = i;
    }
}
