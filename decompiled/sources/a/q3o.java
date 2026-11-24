package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q3o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28062a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    public /* synthetic */ q3o(bdz bdzVar, boolean z, a4x a4xVar, boolean z2, Function0 function0, Function1 function1, Function1 function2, int i) {
        this.d = bdzVar;
        this.b = z;
        this.e = a4xVar;
        this.c = z2;
        this.f = function0;
        this.h = function1;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28062a;
        Object obj3 = this.g;
        wdr wdrVar = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                t3o.c((mm40) obj6, (a4x) obj5, (d9z) obj4, (CyberGamesPage) obj3, this.b, this.c, (Function1) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1797505);
                s5x0.s(this.b, this.c, (ugd) obj6, (ugd) obj5, (ugd) obj4, (ugd) obj3, (ugd) wdrVar, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                epv0.s((bdz) obj6, this.b, (a4x) obj5, this.c, (Function0) obj4, (Function1) wdrVar, (Function1) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q3o(mm40 mm40Var, a4x a4xVar, d9z d9zVar, CyberGamesPage cyberGamesPage, boolean z, boolean z2, Function1 function1, int i) {
        this.d = mm40Var;
        this.e = a4xVar;
        this.f = d9zVar;
        this.g = cyberGamesPage;
        this.b = z;
        this.c = z2;
        this.h = function1;
    }

    public /* synthetic */ q3o(boolean z, boolean z2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, int i) {
        this.b = z;
        this.c = z2;
        this.d = ugdVar;
        this.e = ugdVar2;
        this.f = ugdVar3;
        this.g = ugdVar4;
        this.h = ugdVar5;
    }
}
