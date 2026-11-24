package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20397a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ qol g;
    public final /* synthetic */ tol h;
    public final /* synthetic */ iol i;
    public final /* synthetic */ int j;

    public /* synthetic */ lol(mm40 mm40Var, int i, int i2, int i3, int i4, qol qolVar, tol tolVar, iol iolVar, int i5, byte b) {
        this.f20397a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = qolVar;
        this.h = tolVar;
        this.i = iolVar;
        this.j = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20397a;
        int i = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wwb.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dyb.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
