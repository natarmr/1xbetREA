package a;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kur0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18926a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ kur0(hie0 hie0Var, long j, lie0 lie0Var, zae0 zae0Var, lie0 lie0Var2, lie0 lie0Var3, mie0 mie0Var, mie0 mie0Var2, mie0 mie0Var3) {
        this.c = hie0Var;
        this.b = j;
        this.d = lie0Var;
        this.e = zae0Var;
        this.f = lie0Var2;
        this.g = lie0Var3;
        this.h = mie0Var;
        this.i = mie0Var2;
        this.j = mie0Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.f18926a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (b) {
            case 0:
                nyq0 nyq0Var = (nyq0) obj10;
                a050 a050Var = (a050) obj9;
                Function0 function0 = (Function0) obj8;
                ugd ugdVar = (ugd) obj7;
                ugd ugdVar2 = (ugd) obj6;
                ugd ugdVar3 = (ugd) obj5;
                ugd ugdVar4 = (ugd) obj4;
                ugd ugdVar5 = (ugd) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcm0.e(nyq0Var, a050Var, this.b, function0, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                hie0 hie0Var = (hie0) obj10;
                lie0 lie0Var = (lie0) obj9;
                zae0 zae0Var = (zae0) obj8;
                lie0 lie0Var2 = (lie0) obj7;
                lie0 lie0Var3 = (lie0) obj6;
                mie0 mie0Var = (mie0) obj5;
                mie0 mie0Var2 = (mie0) obj4;
                mie0 mie0Var3 = (mie0) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    if (iIntValue2 == 10) {
                        if (jLongValue < 4) {
                            ohq.l("bad zip: NTFS extra too short");
                            return null;
                        }
                        zae0Var.skip(4L);
                        s7n0.v(zae0Var, (int) (jLongValue - 4), new f3w0(mie0Var, zae0Var, mie0Var2, mie0Var3));
                    }
                } else {
                    if (hie0Var.f13108a) {
                        ohq.l("bad zip: zip64 extra repeated");
                        return null;
                    }
                    hie0Var.f13108a = true;
                    if (jLongValue < this.b) {
                        ohq.l("bad zip: zip64 extra too short");
                        return null;
                    }
                    long jK = lie0Var.f20100a;
                    if (jK == 4294967295L) {
                        jK = zae0Var.k();
                    }
                    lie0Var.f20100a = jK;
                    lie0Var2.f20100a = lie0Var2.f20100a == 4294967295L ? zae0Var.k() : 0L;
                    lie0Var3.f20100a = lie0Var3.f20100a == 4294967295L ? zae0Var.k() : 0L;
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kur0(nyq0 nyq0Var, a050 a050Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5) {
        this.c = nyq0Var;
        this.d = a050Var;
        this.b = j;
        this.e = function0;
        this.f = ugdVar;
        this.g = ugdVar2;
        this.h = ugdVar3;
        this.i = ugdVar4;
        this.j = ugdVar5;
    }
}
