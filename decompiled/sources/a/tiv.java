package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tiv implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34024a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public tiv(List list, boolean z, float f, Function1 function1) {
        this.b = list;
        this.c = z;
        this.d = f;
        this.e = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f34024a;
        Object obj5 = this.e;
        float f = this.d;
        boolean z = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    djv djvVar = (djv) list.get(iIntValue);
                    fetVar.e0(912918451);
                    String str = djvVar.f6204a;
                    acb.B(null, str, z && str.equals((String) obj5), u1c.M(1353814709, new qp8(f, djvVar, (byte) 2), fetVar), fetVar, 3072);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                g9zVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (fetVar2.g(g9zVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    e2e0 e2e0Var = (e2e0) list.get(iIntValue3);
                    fetVar2.e0(-733582575);
                    n7x.j(z ? g9zVar2.d(1.0f) : o7k0.s(jm40.b, f), e2e0Var, (Function1) obj5, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public tiv(List list, boolean z, String str, float f) {
        this.b = list;
        this.c = z;
        this.e = str;
        this.d = f;
    }
}
