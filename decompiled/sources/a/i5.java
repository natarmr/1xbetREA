package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14168a;
    public final int b;
    public final Object c;
    public final Object d;

    public i5(int i, a4x a4xVar, ud80 ud80Var) {
        this.f14168a = (byte) 3;
        this.b = i;
        this.c = a4xVar;
        this.d = ud80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14168a;
        yje yjeVar = null;
        boolean z = false;
        byte b2 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                q8a q8aVar = (q8a) obj2;
                j5 j5Var = (j5) ((ArrayList) obj).get(i);
                q8aVar.getClass();
                x83 x83VarX = ((j5Var.c == null) || (q8aVar.X() == x83.TYPE_PARAMETER_BOUNDS)) ? q8aVar.X() : x83.TYPE_USE;
                jay jayVar = j5Var.b;
                if (jayVar != null) {
                    return (t8y) jayVar.f16212a.get(x83VarX);
                }
                return null;
            case 1:
                ((Function2) obj2).invoke(Integer.valueOf(i), Long.valueOf(((ah7) obj).f859a));
                return Unit.f46060a;
            case 2:
                qjj.W((vne) obj2, null, null, new jcc((xcz) obj, i, yjeVar, b2), 3);
                return Unit.f46060a;
            default:
                if (i != 0 && (((a4x) obj2).get(i - 1) instanceof zd80) && !(((ud80) obj) instanceof rd80)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ i5(Object obj, Object obj2, int i, byte b) {
        this.f14168a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public i5(Function2 function2, int i, ah7 ah7Var) {
        this.f14168a = (byte) 1;
        this.c = function2;
        this.b = i;
        this.d = ah7Var;
    }
}
