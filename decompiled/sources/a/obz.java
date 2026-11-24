package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class obz extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public byte k;
    public /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obz(zz2 zz2Var, cgx0 cgx0Var, p5q0 p5q0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = (byte) 1;
        this.m = zz2Var;
        this.n = cgx0Var;
        this.o = p5q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                obz obzVar = new obz((xk80) obj2, yjeVar, (byte) 0);
                obzVar.l = obj;
                return obzVar;
            case 1:
                obz obzVar2 = new obz((zz2) this.m, (cgx0) this.n, (p5q0) obj2, yjeVar);
                obzVar2.l = obj;
                return obzVar2;
            default:
                obz obzVar3 = new obz((oum0) obj2, yjeVar, (byte) 2);
                obzVar3.l = obj;
                return obzVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((obz) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:224:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03de A[LOOP:9: B:223:0x03cf->B:227:0x03de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x0238 -> B:139:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x03c2 -> B:222:0x03c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ce -> B:40:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.obz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obz(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.o = obj;
    }
}
