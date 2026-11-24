package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fy7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10347a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ short c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fy7(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f10347a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10347a;
        short s = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ry7.a((mm40) obj6, (e960) obj5, (g960) obj4, (nrq) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hkb.x((mm40) obj6, (qzh) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                wzb.q((mm40) obj6, (m8m) obj5, (n8m) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                q8x.i((mm40) obj6, (j43) obj5, (xdr) obj4, (ugd) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rsr0.w((d9z) obj6, (vdt) obj5, (jn5) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zvw.n((mm40) obj6, (String) obj5, (String) obj4, (y9q0) obj3, (fet) obj, x8x.L(s | 1));
                break;
        }
        return Unit.f46060a;
    }
}
