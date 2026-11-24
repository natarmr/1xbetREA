package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1368a;
    public final lzt b;
    public final pbt c;

    public as(lzt lztVar, pbt pbtVar, byte b) {
        this.f1368a = b;
        pbtVar.getClass();
        switch (b) {
            case 1:
                this.b = lztVar;
                this.c = pbtVar;
                break;
            default:
                this.b = lztVar;
                this.c = pbtVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(long j, zje zjeVar) {
        zr zrVar;
        ohf0 ohf0Var;
        byte b = this.f1368a;
        pbt pbtVar = this.c;
        lzt lztVar = this.b;
        switch (b) {
            case 0:
                if (zjeVar instanceof zr) {
                    zrVar = (zr) zjeVar;
                    int i = zrVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zrVar.k = i - Integer.MIN_VALUE;
                    } else {
                        zrVar = new zr(this, zjeVar);
                    }
                } else {
                    zrVar = new zr(this, zjeVar);
                }
                Object obj = zrVar.i;
                wne wneVar = wne.f39444a;
                int i2 = zrVar.k;
                if (i2 == 0) {
                    z1x.P(obj);
                    if (!lztVar.a()) {
                        return Unit.f46060a;
                    }
                    zrVar.k = 1;
                    if (pbtVar.a(j, zrVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                if (zjeVar instanceof ohf0) {
                    ohf0Var = (ohf0) zjeVar;
                    int i3 = ohf0Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ohf0Var.k = i3 - Integer.MIN_VALUE;
                    } else {
                        ohf0Var = new ohf0(this, zjeVar);
                    }
                } else {
                    ohf0Var = new ohf0(this, zjeVar);
                }
                Object obj2 = ohf0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ohf0Var.k;
                if (i4 == 0) {
                    z1x.P(obj2);
                    if (!lztVar.a()) {
                        return Unit.f46060a;
                    }
                    ohf0Var.k = 1;
                    if (pbtVar.u(j, ohf0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
