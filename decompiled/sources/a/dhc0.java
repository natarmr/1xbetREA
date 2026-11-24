package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class dhc0 extends bnn0 implements Function2 {
    public jhc0 i;
    public Collection j;
    public Iterator k;
    public ctf0 l;
    public afc0 m;
    public qz40 n;
    public Collection o;
    public long p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ jhc0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhc0(jhc0 jhc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = jhc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        dhc0 dhc0Var = new dhc0(this.s, yjeVar);
        dhc0Var.r = obj;
        return dhc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dhc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x016f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0198  */
    /* JADX WARN: Code duplicated, block: B:44:0x01be  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x020c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0214  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0198 -> B:42:0x019d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dhc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
