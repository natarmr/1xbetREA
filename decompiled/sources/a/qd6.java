package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28520a;
    public final /* synthetic */ wd6 b;

    public /* synthetic */ qd6(wd6 wd6Var, byte b) {
        this.f28520a = b;
        this.b = wd6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28520a;
        wd6 wd6Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = wd6Var.j2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                cl5 cl5Var = wd6.o2;
                me6 me6VarW0 = wd6Var.W0();
                String text = wd6Var.V0().b.getText();
                lsn lsnVar = me6VarW0.p;
                text.getClass();
                int iD = me6VarW0.s.d(me6VarW0.b);
                if (1 <= iD && iD < ((ArrayList) lsnVar.e()).size()) {
                    me6VarW0.r.l(me6VarW0.b, text);
                    me6VarW0.b = ((q88) ((ArrayList) lsnVar.e()).get(iD - 1)).f28287a;
                    me6VarW0.z(new xd6(me6VarW0, (byte) 0));
                    p7m0 p7m0Var = me6VarW0.B;
                    String strC = me6VarW0.C();
                    p7m0Var.getClass();
                    p7m0Var.o(null, strC);
                    p7m0 p7m0Var2 = me6VarW0.C;
                    Boolean boolValueOf = Boolean.valueOf(me6VarW0.u.c(me6VarW0.b));
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, boolValueOf);
                    me6VarW0.w();
                    me6VarW0.x();
                }
                return Unit.f46060a;
            default:
                cl5 cl5Var2 = wd6.o2;
                me6 me6VarW1 = wd6Var.W0();
                String text2 = wd6Var.V0().b.getText();
                lsn lsnVar2 = me6VarW1.p;
                text2.getClass();
                int iD2 = me6VarW1.s.d(me6VarW1.b);
                if (iD2 >= 0 && iD2 < ((ArrayList) lsnVar2.e()).size() - 1) {
                    me6VarW1.r.l(me6VarW1.b, text2);
                    me6VarW1.b = ((q88) ((ArrayList) lsnVar2.e()).get(iD2 + 1)).f28287a;
                    me6VarW1.z(new xd6(me6VarW1, (byte) 1));
                    p7m0 p7m0Var3 = me6VarW1.B;
                    String strC2 = me6VarW1.C();
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, strC2);
                    p7m0 p7m0Var4 = me6VarW1.C;
                    Boolean boolValueOf2 = Boolean.valueOf(me6VarW1.u.c(me6VarW1.b));
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, boolValueOf2);
                    me6VarW1.w();
                    me6VarW1.x();
                }
                return Unit.f46060a;
        }
    }
}
