package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cf7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4246a;
    public final /* synthetic */ imm b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ cf7(imm immVar, mdm mdmVar, Function1 function1, int i, byte b) {
        this.f4246a = b;
        this.b = immVar;
        this.c = mdmVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4246a;
        int i = this.e;
        Function1 function1 = this.d;
        mdm mdmVar = this.c;
        imm immVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nia0.m(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                hmw0.i(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ro4.k(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                ccq0.d(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                x8f.h(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                cwr0.j(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 6:
                f1t0.f(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 7:
                i4w0.h(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                cjx.i(immVar, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
