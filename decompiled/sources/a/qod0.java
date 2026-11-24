package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qod0 extends bnn0 implements Function2 {
    public double i;
    public int j;
    public int k;
    public byte l;
    public final /* synthetic */ tod0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qod0(tod0 tod0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = tod0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qod0(this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qod0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.vpu] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ?? r10;
        int i;
        double d;
        int i2;
        int i3;
        double d2;
        boolean z;
        String str;
        boolean z2;
        Object value;
        mod0 mod0Var;
        String str2;
        tod0 tod0Var = this.m;
        mne mneVar = tod0Var.b;
        p7m0 p7m0Var = tod0Var.m;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        if (b == 0) {
            z1x.P(obj);
            bby bbyVar = tod0Var.o;
            if (bbyVar != null) {
                v3c.N(bbyVar);
            }
            tod0Var.o = sac.f0(jiu0.a(tod0Var), 200L, TimeUnit.MILLISECONDS, mneVar.b, new znd0(tod0Var, (byte) 5), new d7a0(tod0Var, null, (byte) 17), 32);
            Object value2 = p7m0Var.getValue();
            mod0 mod0Var2 = value2 instanceof mod0 ? (mod0) value2 : null;
            if (mod0Var2 == null) {
                return Unit.f46060a;
            }
            double d3 = mod0Var2.f;
            Object value3 = p7m0Var.getValue();
            mod0 mod0Var3 = value3 instanceof mod0 ? (mod0) value3 : null;
            ?? r5 = mod0Var3 != null ? mod0Var3.b : 0;
            int i4 = tod0Var.d.g() != r5 ? 1 : 0;
            ?? r13 = tod0Var.e;
            this.i = d3;
            this.j = r5;
            this.k = i4;
            this.l = (byte) 1;
            if (r13.b(r5, this) != wneVar) {
                r10 = r5;
                i = i4;
                d = d3;
            }
            return wneVar;
        }
        if (b == 1) {
            i = this.k;
            int i5 = this.j;
            d = this.i;
            z1x.P(obj);
            r10 = i5;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.k;
            i3 = this.j;
            d2 = this.i;
            z1x.P(obj);
        }
        d = d2;
        r10 = i3;
        i = i2;
        if (i != 0) {
            s31 s31Var = tod0Var.l;
            if (r10 != 0) {
                z = true;
            } else {
                z = false;
            }
            kt2 kt2Var = s31Var.f31532a;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            i8i.D("option", str, kt2Var, "acc_settings_oneclick_set");
            if (r10 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            value = p7m0Var.getValue();
            if (value instanceof mod0) {
                mod0Var = (mod0) value;
            } else {
                mod0Var = null;
            }
            str2 = mod0Var != null ? mod0Var.d : null;
            if (str2 == null) {
                str2 = "";
            }
            sac.V(jiu0.a(tod0Var), rod0.f30832a, null, mneVar.c, new sod0(z2, tod0Var, d, str2, null), 10);
        }
        tod0Var.g.f31684a.a(cui0.b(new j1p(r10 != 0 ? "on" : "off", (byte) 0)), 3286L);
        tod0Var.n.f(cod0.f4694a);
        return Unit.f46060a;
        bby bbyVar2 = tod0Var.o;
        if (bbyVar2 != null) {
            v3c.N(bbyVar2);
        }
        if (r10 != 0) {
            cmt0 cmt0Var = tod0Var.f;
            this.i = d;
            this.j = r10 == true ? 1 : 0;
            this.k = i;
            this.l = (byte) 2;
            if (cmt0Var.c(d, this) != wneVar) {
                i2 = i;
                i3 = r10 == true ? 1 : 0;
                d2 = d;
                d = d2;
                r10 = i3;
                i = i2;
            }
            return wneVar;
        }
        if (i != 0) {
            s31 s31Var2 = tod0Var.l;
            if (r10 != 0) {
                z = true;
            } else {
                z = false;
            }
            kt2 kt2Var2 = s31Var2.f31532a;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            i8i.D("option", str, kt2Var2, "acc_settings_oneclick_set");
            if (r10 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            value = p7m0Var.getValue();
            if (value instanceof mod0) {
                mod0Var = (mod0) value;
            } else {
                mod0Var = null;
            }
            if (mod0Var != null) {
            }
            if (str2 == null) {
                str2 = "";
            }
            sac.V(jiu0.a(tod0Var), rod0.f30832a, null, mneVar.c, new sod0(z2, tod0Var, d, str2, null), 10);
        }
        tod0Var.g.f31684a.a(cui0.b(new j1p(r10 != 0 ? "on" : "off", (byte) 0)), 3286L);
        tod0Var.n.f(cod0.f4694a);
        return Unit.f46060a;
    }
}
