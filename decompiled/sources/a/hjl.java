package a;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hjl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13165a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hjl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, byte b) {
        this.f13165a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13165a;
        int i = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                feb.k((ijl) obj8, (jjl) obj7, (gjl) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wvb.k((mm40) obj8, (dol) obj7, (d9z) obj6, (hh80) obj5, (Function1) obj4, (Function2) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                nkb.h((mm40) obj8, (jjm) obj7, (kjm) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                up90.a((mm40) obj8, (hr90) obj7, (Locale) obj6, (tcj) obj5, (rgq0) obj4, (kyf) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 4:
                ((Integer) obj2).getClass();
                e9x.u((my90) obj8, (mm40) obj7, (Function1) obj6, (Function2) obj5, (Function2) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                z1x.m((mm40) obj8, (ow3) obj7, (yx7) obj6, (ugd) obj5, (xdr) obj4, (xdr) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                idm0.j((mm40) obj8, (p6t0) obj7, (xdr) obj6, (Function1) obj5, (Function1) obj4, (Function2) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
        }
        return Unit.f46060a;
    }
}
