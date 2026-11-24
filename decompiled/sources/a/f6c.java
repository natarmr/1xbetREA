package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.impl.navigation.PasswordScreenFactoryImpl$getPasswordChangeFragment$1;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f6c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9001a;
    public final /* synthetic */ v7c b;

    public /* synthetic */ f6c(v7c v7cVar, byte b) {
        this.f9001a = b;
        this.b = v7cVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        we50 we50Var;
        we50 we50Var2;
        dci0 ybi0Var;
        byte b = this.f9001a;
        v7c v7cVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zn00 zn00Var = v7cVar.o;
                d6c d6cVar = v7cVar.d;
                if (d6cVar == null) {
                    we50Var = we50.d;
                } else if (d6cVar instanceof s5c) {
                    we50Var = ((s5c) d6cVar).j;
                } else if (d6cVar instanceof b6c) {
                    we50Var = ((b6c) d6cVar).h;
                } else {
                    we50Var = we50.d;
                }
                zn00Var.getClass();
                we50Var.getClass();
                k0w0Var.c(new PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00Var, we50Var));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                zn00 zn00Var2 = v7cVar.o;
                d6c d6cVar2 = v7cVar.d;
                if (d6cVar2 == null) {
                    we50Var2 = we50.d;
                } else if (d6cVar2 instanceof s5c) {
                    we50Var2 = ((s5c) d6cVar2).j;
                } else if (d6cVar2 instanceof b6c) {
                    we50Var2 = ((b6c) d6cVar2).h;
                } else {
                    we50Var2 = we50.d;
                }
                zn00Var2.getClass();
                we50Var2.getClass();
                k0w0Var2.h(new PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00Var2, we50Var2));
                return Unit.f46060a;
            default:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                mi70 mi70Var = v7cVar.r;
                d6c d6cVar3 = v7cVar.d;
                if (d6cVar3 != null) {
                    if (d6cVar3 instanceof o5c) {
                        o5c o5cVar = (o5c) d6cVar3;
                        swp0 swp0VarE = v7cVar.E();
                        swp0VarE.getClass();
                        String str = o5cVar.f24680a;
                        List list = o5cVar.d;
                        ybi0Var = new sbi0(str, swp0VarE, list, list, true, o5cVar.h, o5cVar.i);
                    } else if (d6cVar3 instanceof p5c) {
                        ybi0Var = new ubi0(((p5c) d6cVar3).f26398a, true);
                    } else if (d6cVar3 instanceof s5c) {
                        s5c s5cVar = (s5c) d6cVar3;
                        swp0 swp0VarE2 = v7cVar.E();
                        swp0VarE2.getClass();
                        String str2 = s5cVar.f31649a;
                        int i = s5cVar.c;
                        List list2 = s5cVar.e;
                        ybi0Var = new vbi0(str2, swp0VarE2, i, list2, list2, true, s5cVar.k, s5cVar.i, s5cVar.j);
                    } else if (d6cVar3 instanceof t5c) {
                        t5c t5cVar = (t5c) d6cVar3;
                        swp0 swp0VarE3 = v7cVar.E();
                        swp0VarE3.getClass();
                        String str3 = t5cVar.f33362a;
                        int i2 = t5cVar.c;
                        List list3 = t5cVar.e;
                        ybi0Var = new wbi0(str3, swp0VarE3, i2, list3, list3, true, t5cVar.j, t5cVar.h);
                    } else if (d6cVar3 instanceof z5c) {
                        z5c z5cVar = (z5c) d6cVar3;
                        ybi0Var = new xbi0(z5cVar.f43808a, z5cVar.c, true);
                    } else if (d6cVar3 instanceof a6c) {
                        a6c a6cVar = (a6c) d6cVar3;
                        swp0 swp0VarE4 = v7cVar.E();
                        swp0VarE4.getClass();
                        String str4 = a6cVar.f311a;
                        ArrayList arrayList = a6cVar.d;
                        ybi0Var = new zbi0(str4, swp0VarE4, arrayList, arrayList, true, a6cVar.g, a6cVar.h, a6cVar.i, a6cVar.j, a6cVar.k, a6cVar.l, a6cVar.m, a6cVar.n, a6cVar.o, a6cVar.p);
                    } else if (d6cVar3 instanceof b6c) {
                        b6c b6cVar = (b6c) d6cVar3;
                        swp0 swp0VarE5 = v7cVar.E();
                        swp0VarE5.getClass();
                        String str5 = b6cVar.f2045a;
                        we50 we50Var3 = b6cVar.h;
                        String str6 = b6cVar.i;
                        String str7 = b6cVar.j;
                        boolean z = b6cVar.k;
                        List list4 = b6cVar.d;
                        ybi0Var = new aci0(str5, swp0VarE5, list4, list4, true, str6, str7, z, we50Var3);
                    } else if (d6cVar3 instanceof c6c) {
                        c6c c6cVar = (c6c) d6cVar3;
                        swp0 swp0VarE6 = v7cVar.E();
                        swp0VarE6.getClass();
                        String str8 = c6cVar.f3812a;
                        int i3 = c6cVar.c;
                        List list5 = c6cVar.e;
                        ybi0Var = new bci0(str8, swp0VarE6, i3, list5, list5, true, c6cVar.i);
                    } else if (d6cVar3 instanceof q5c) {
                        ybi0Var = new ubi0(((q5c) d6cVar3).f28145a, true);
                    } else if (d6cVar3 instanceof u5c) {
                        u5c u5cVar = (u5c) d6cVar3;
                        String str9 = u5cVar.f35086a;
                        swp0 swp0Var = u5cVar.b;
                        int i4 = u5cVar.c;
                        List list6 = u5cVar.e;
                        ybi0Var = new wbi0(str9, swp0Var, i4, list6, list6, true, str9, u5cVar.g);
                    } else if (d6cVar3 instanceof x5c) {
                        x5c x5cVar = (x5c) d6cVar3;
                        swp0 swp0VarE7 = v7cVar.E();
                        swp0VarE7.getClass();
                        String str10 = x5cVar.f40308a;
                        List list7 = x5cVar.d;
                        ybi0Var = new cci0(str10, swp0VarE7, list7, list7, true, x5cVar.g);
                    } else if (d6cVar3 instanceof w5c) {
                        ybi0Var = new ybi0(((w5c) d6cVar3).f38575a, true);
                    }
                    mi70Var.getClass();
                    k0w0Var3.k(new SendConfirmationSMSScreen(ybi0Var));
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
