package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p4t0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26373a;
    public final /* synthetic */ wdr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p4t0(och ochVar, g2v g2vVar, xcz xczVar, Function1 function1, Function0 function0, int i) {
        this.f26373a = (byte) 3;
        this.d = ochVar;
        this.f = g2vVar;
        this.e = xczVar;
        this.g = function1;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26373a;
        int i = this.c;
        Object obj3 = this.g;
        wdr wdrVar = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                j5n0.c((mm40) obj6, (xcz) obj5, (pz40) obj4, (lh80) obj3, (ugd) wdrVar, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ibm0.e((o0x) obj6, (o0x) obj5, (Function1) obj4, (xdr) obj3, (ugd) wdrVar, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                atm0.e((mm40) obj6, (hh80) obj5, (ow3) obj4, (sw3) obj3, (ugd) wdrVar, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                zgc.m((och) obj6, (g2v) obj4, (xcz) obj5, (Function1) obj3, (Function0) wdrVar, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                nsm0.k((o0x) obj6, (o0x) obj5, (Function1) obj4, (ugd) wdrVar, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ p4t0(o0x o0xVar, o0x o0xVar2, Function1 function1, ugd ugdVar, ugd ugdVar2, int i) {
        this.f26373a = (byte) 4;
        this.d = o0xVar;
        this.e = o0xVar2;
        this.f = function1;
        this.b = ugdVar;
        this.g = ugdVar2;
        this.c = i;
    }

    public /* synthetic */ p4t0(Object obj, Object obj2, Object obj3, Object obj4, ugd ugdVar, int i, byte b) {
        this.f26373a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = ugdVar;
        this.c = i;
    }
}
