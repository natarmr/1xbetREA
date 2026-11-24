package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class geb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11145a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ char c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ geb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.f11145a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11145a;
        char c = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ieb.i((mm40) obj7, (o7p) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                mbc.i((mm40) obj7, (u3i) obj6, (u3i) obj5, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b34.n((l7m0) obj7, (xcz) obj6, (qdz) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                pzb.t((mm40) obj7, (String) obj6, (rab) obj5, (String) obj4, (String) obj3, (fet) obj, x8x.L(c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                d9x.z((mm40) obj7, (q7p) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ny9.D((l7m0) obj7, (xcz) obj6, (gou0) obj5, (lou0) obj4, (Function1) obj3, (fet) obj, x8x.L(c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y9a.J((l7m0) obj7, (xcz) obj6, (bru0) obj5, (gru0) obj4, (Function1) obj3, (fet) obj, x8x.L(c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
