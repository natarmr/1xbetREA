package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r93 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30058a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ short d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r93(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, int i) {
        this.f30058a = (byte) 10;
        this.b = mm40Var;
        this.e = l7m0Var;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30058a;
        short s = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                kc5.V(iL, fetVar, (xcz) obj4, (l7m0) obj5, (Function1) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kc5.M((a4x) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                unh0.k((mm40) obj5, (hdj) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                slb.e(iL2, fetVar2, (a4x) obj4, (mm40) obj5, (Function1) obj3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                fxb.f((foh) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(s | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lmc.i((mm40) obj5, (k9n) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                vfc.k((etk) obj5, (sip) obj4, (Function2) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                vfc.h((ctk) obj5, (sip) obj4, (Function2) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jeb.e((mm40) obj5, (hh80) obj4, (g4m) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                gzy.a((mm40) obj5, (hzy) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(s | 1);
                ntr.E(iL3, (fet) obj, (mm40) obj4, (l7m0) obj5, (Function1) obj3);
                break;
            case 11:
                ((Integer) obj2).getClass();
                qxw.e((mm40) obj5, (f6q0) obj4, (q7q0) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((qj50) obj5).a(obj4, (Function0) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                x8x.f((mm40) obj5, (List) obj4, (Function0) obj3, (fet) obj, x8x.L(s | 1));
                break;
            case 14:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(s | 1);
                d9x.m(iL4, fetVar3, (mm40) obj5, (d280) obj3, (String) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                vko0.a((mm40) obj5, (elo0) obj4, (Function1) obj3, (fet) obj, x8x.L(s | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r93(foh fohVar, Function1 function1, Function1 function2, int i) {
        this.f30058a = (byte) 4;
        this.e = fohVar;
        this.c = function1;
        this.b = function2;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r93(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f30058a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = i;
    }
}
