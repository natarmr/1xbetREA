package a;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x7t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40430a;
    public final /* synthetic */ b8t b;

    public /* synthetic */ x7t(b8t b8tVar, byte b) {
        this.f40430a = b;
        this.b = b8tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f40430a;
        b8t b8tVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                iiy[] iiyVarArr = b8t.Q1;
                list.getClass();
                b8tVar.I0().D = list;
                break;
            case 1:
                iiy[] iiyVarArr2 = b8t.Q1;
                ((View) obj).getClass();
                b8tVar.I0().A(false, true);
                break;
            case 2:
                iiy[] iiyVarArr3 = b8t.Q1;
                ((View) obj).getClass();
                a9t a9tVarI0 = b8tVar.I0();
                p7m0 p7m0Var = a9tVarI0.q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, m8t.a((m8t) value, false, null, false, 6)));
                if (!a9tVarI0.y) {
                    a9tVarI0.x = false;
                    a9tVarI0.z();
                }
                break;
            default:
                List list2 = (List) obj;
                iiy[] iiyVarArr4 = b8t.Q1;
                list2.getClass();
                b8tVar.I0().v = list2;
                break;
        }
        return Unit.f46060a;
    }
}
