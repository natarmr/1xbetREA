package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class j3u extends bnn0 implements Function2 {
    public Object i;
    public CyberGamesPage j;
    public Object k;
    public int l;
    public boolean m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ d4u p;
    public final /* synthetic */ CyberGamesPage q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3u(yje yjeVar, d4u d4uVar, CyberGamesPage cyberGamesPage, boolean z) {
        super(2, yjeVar);
        this.p = d4uVar;
        this.q = cyberGamesPage;
        this.r = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        j3u j3uVar = new j3u(yjeVar, this.p, this.q, this.r);
        j3uVar.o = obj;
        return j3uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j3u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0172 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0034, B:55:0x0161, B:56:0x016c, B:58:0x0172, B:60:0x0181, B:66:0x01ae, B:61:0x0191, B:63:0x019b, B:67:0x01b2, B:16:0x004a, B:30:0x00c9, B:32:0x00ce, B:34:0x00d6, B:36:0x00f2, B:37:0x00fd, B:39:0x0103, B:41:0x010e, B:44:0x0115, B:45:0x0119, B:47:0x011f, B:49:0x0134, B:52:0x0142, B:35:0x00e9), top: B:79:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0181 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0034, B:55:0x0161, B:56:0x016c, B:58:0x0172, B:60:0x0181, B:66:0x01ae, B:61:0x0191, B:63:0x019b, B:67:0x01b2, B:16:0x004a, B:30:0x00c9, B:32:0x00ce, B:34:0x00d6, B:36:0x00f2, B:37:0x00fd, B:39:0x0103, B:41:0x010e, B:44:0x0115, B:45:0x0119, B:47:0x011f, B:49:0x0134, B:52:0x0142, B:35:0x00e9), top: B:79:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0191 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0034, B:55:0x0161, B:56:0x016c, B:58:0x0172, B:60:0x0181, B:66:0x01ae, B:61:0x0191, B:63:0x019b, B:67:0x01b2, B:16:0x004a, B:30:0x00c9, B:32:0x00ce, B:34:0x00d6, B:36:0x00f2, B:37:0x00fd, B:39:0x0103, B:41:0x010e, B:44:0x0115, B:45:0x0119, B:47:0x011f, B:49:0x0134, B:52:0x0142, B:35:0x00e9), top: B:79:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019b A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0034, B:55:0x0161, B:56:0x016c, B:58:0x0172, B:60:0x0181, B:66:0x01ae, B:61:0x0191, B:63:0x019b, B:67:0x01b2, B:16:0x004a, B:30:0x00c9, B:32:0x00ce, B:34:0x00d6, B:36:0x00f2, B:37:0x00fd, B:39:0x0103, B:41:0x010e, B:44:0x0115, B:45:0x0119, B:47:0x011f, B:49:0x0134, B:52:0x0142, B:35:0x00e9), top: B:79:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d4, code lost:
    
        if (r6.a(r0, r18) == r7) goto L74;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j3u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
