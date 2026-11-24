package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nf4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23417a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ wdr f;
    public final /* synthetic */ wdr g;
    public final /* synthetic */ wdr h;
    public final /* synthetic */ wdr i;
    public final /* synthetic */ wdr j;
    public final /* synthetic */ wdr k;

    public /* synthetic */ nf4(Object obj, Object obj2, Object obj3, Function0 function0, wdr wdrVar, wdr wdrVar2, wdr wdrVar3, wdr wdrVar4, wdr wdrVar5, wdr wdrVar6, int i, byte b) {
        this.f23417a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = function0;
        this.f = wdrVar;
        this.g = wdrVar2;
        this.h = wdrVar3;
        this.i = wdrVar4;
        this.j = wdrVar5;
        this.k = wdrVar6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23417a;
        wdr wdrVar = this.k;
        wdr wdrVar2 = this.j;
        wdr wdrVar3 = this.i;
        wdr wdrVar4 = this.h;
        wdr wdrVar5 = this.g;
        wdr wdrVar6 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1794049);
                qjj.e((mm40) obj5, (ujv0) obj4, (l7m0) obj3, this.b, (ugd) wdrVar6, (ugd) wdrVar5, (ugd) wdrVar4, (xdr) wdrVar3, (xdr) wdrVar2, (xdr) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                lgb.k((uhm) obj5, (bzl) obj4, (Function1) obj3, this.b, (Function0) wdrVar6, (Function0) wdrVar5, (Function1) wdrVar4, (Function0) wdrVar3, (Function1) wdrVar2, (Function0) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
