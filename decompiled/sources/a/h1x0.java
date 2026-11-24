package a;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h1x0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12306a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1x0(Object obj, byte b) {
        this.f12306a = b;
        this.b = obj;
    }

    @Override // a.lin0
    public final Object get() {
        byte b = this.f12306a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object obj2 = c1x0.j;
                return new x8x0((ArrayList) obj);
            default:
                i8x0 i8x0Var = (i8x0) obj;
                fr40 fr40Var = (fr40) i8x0Var.c.get();
                fr40Var.getClass();
                y2x0 y2x0Var = (y2x0) i8x0Var.b.get();
                y2x0Var.getClass();
                tzw0 tzw0Var = y2x0Var.f41927a;
                euo0 euo0VarA = s9w0.a();
                euo0VarA.f8431a = new w4p0(tzw0Var, (byte) 25);
                euo0VarA.d = new Feature[]{f1t0.k};
                euo0VarA.c = true;
                euo0VarA.b = false;
                d1 d1VarB = y2x0.b(tzw0Var.b(0, euo0VarA.a()));
                e1 e1Var = new e1(d1VarB, s2x0.class, wgw0.e);
                d1VarB.a(e1Var, n2x.I(fr40Var, e1Var));
                a6x0 a6x0Var = new a6x0(i8x0Var, (byte) 1);
                int i = n5.k;
                m5 m5Var = new m5(e1Var, a6x0Var);
                e1Var.a(m5Var, n2x.I(fr40Var, m5Var));
                m5Var.a(new fju0(m5Var, (byte) 15), fr40Var);
                return m5Var;
        }
    }
}
