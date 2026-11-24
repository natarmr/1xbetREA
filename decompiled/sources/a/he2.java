package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class he2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12900a;
    public final /* synthetic */ le2 b;

    public /* synthetic */ he2(le2 le2Var, byte b) {
        this.f12900a = b;
        this.b = le2Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        byte b = this.f12900a;
        le2 le2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList, ((fhb) it.next()).h);
                }
                int i = le2.F;
                p7m0 p7m0Var = le2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    le2Var.f.getClass();
                } while (!p7m0Var.m(value, ce2.a((ce2) value, null, false, new yhe(arrayList), 0, false, null, null, false, false, 16377)));
                i3t0.K(le2Var, null, null, new za(le2Var, arrayList, null, (byte) 8), 3);
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = le2.F;
                    le2Var.M(false);
                }
                break;
        }
        return Unit.f46060a;
    }
}
