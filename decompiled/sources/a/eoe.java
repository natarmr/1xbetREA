package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eoe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public int j;
    public int k;
    public byte l;
    public /* synthetic */ Object m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoe(Function2 function2, List list, String str, yje yjeVar) {
        super(2, yjeVar);
        this.n = function2;
        this.o = list;
        this.p = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                eoe eoeVar = new eoe((Function2) this.n, (List) this.o, (String) obj2, yjeVar);
                eoeVar.m = obj;
                return eoeVar;
            default:
                eoe eoeVar2 = new eoe((d650) obj2, yjeVar);
                eoeVar2.m = obj;
                return eoeVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((eoe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|57|131|17|(1:20)|55|142) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:88|89|90|127|91|(1:94)|115|144) */
    /* JADX WARN: Code duplicated, block: B:105:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0202  */
    /* JADX WARN: Code duplicated, block: B:137:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        r17 = r14;
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01f2 -> B:117:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00f1 -> B:57:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x019b -> B:117:0x01f4). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eoe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoe(d650 d650Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = d650Var;
    }
}
