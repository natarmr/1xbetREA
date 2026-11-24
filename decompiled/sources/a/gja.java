package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gja implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11387a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gja(byte b, int i, int i2, wdr wdrVar, mm40 mm40Var, Object obj, Object obj2, Object obj3) {
        this.f11387a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = wdrVar;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11387a;
        byte b2 = this.c;
        Object obj3 = this.e;
        wdr wdrVar = this.g;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                hew0.e((mm40) obj6, (yjj0) obj5, (lca) obj3, (jfa) obj4, (ugd) wdrVar, (fet) obj, x8x.L(196609), this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dyb.k((mm40) obj6, (ypl) obj5, (bql) obj3, (Function0) obj4, (Function2) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                acb.m((mm40) obj6, (l9n) obj5, (Function2) obj3, (Function1) obj4, (Function1) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                gsl.a((mm40) obj6, (ry1) obj5, (Function0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(1), this.c);
                break;
            case 4:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                s0x.g(iL, fetVar, (clz) obj4, (Boolean) obj6, (Boolean) obj5, this.e, (Function1) wdrVar);
                break;
            case 5:
                ((Integer) obj2).getClass();
                h8x.d((mm40) obj6, (pz40) obj5, (bil0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                l8x.n((mm40) obj6, (pz40) obj5, (eil0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                m8x.h((mm40) obj6, (pz40) obj5, (hil0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                q8x.a((mm40) obj6, (bhl0) obj5, (s0) obj3, (ahl0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                q8x.c((mm40) obj6, (pz40) obj5, (lil0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                r8x.f((mm40) obj6, (pz40) obj5, (pil0) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gja(Object obj, Object obj2, Object obj3, Object obj4, wdr wdrVar, int i, byte b) {
        this.f11387a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = wdrVar;
        this.c = i;
    }
}
