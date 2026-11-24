package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class czg0 implements bzg0 {
    public static final v0h0 e = new v0h0(new awg0(6), new xwg0(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5222a;
    public final hz40 b;
    public fzg0 c;
    public final gwg0 d;

    public czg0(Map map) {
        this.f5222a = map;
        long[] jArr = u1h0.f34903a;
        this.b = new hz40();
        this.d = new gwg0((Object) this, (byte) 1);
    }

    @Override // a.bzg0
    public final void b(Object obj, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(533563200);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(this) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.h0(obj);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                gwg0 gwg0Var = this.d;
                if (!((Boolean) gwg0Var.invoke(obj)).booleanValue()) {
                    c99.s(f140.k(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.f5222a.get(obj);
                zfn zfnVar = hzg0.f13904a;
                izg0 izg0Var = new izg0(new gzg0(map, gwg0Var));
                fetVar.o0(izg0Var);
                objP = izg0Var;
            }
            izg0 izg0Var2 = (izg0) objP;
            obc.e(new l5d0[]{hzg0.f13904a.a(izg0Var2), xr00.f41346a.a(izg0Var2)}, ugdVar, fetVar, (i2 & 112) | 8);
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(this) | fetVar.i(obj) | fetVar.i(izg0Var2);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new zlb0(this, obj, izg0Var2, (byte) 22);
                fetVar.o0(objP2);
            }
            m0x0.o(unit, (Function1) objP2, fetVar);
            if (fetVar.y && fetVar.G.i == fetVar.z) {
                fetVar.z = -1;
                fetVar.y = false;
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) this, obj, (Object) ugdVar, i, (byte) 5);
        }
    }

    @Override // a.bzg0
    public final void c(Object obj) {
        if (this.b.l(obj) == null) {
            this.f5222a.remove(obj);
        }
    }
}
