package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kfm0 extends bnn0 implements Function2 {
    public Map i;
    public nfm0 j;
    public Throwable k;
    public long l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public byte q;
    public final /* synthetic */ String r;
    public final /* synthetic */ nfm0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfm0(String str, nfm0 nfm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.r = str;
        this.s = nfm0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new kfm0(this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kfm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009f A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:18:0x009f, B:21:0x00ca, B:12:0x0067), top: B:59:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x016a  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (a.qcc.P(r9, r18) == r2) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:17:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015b -> B:37:0x0115). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kfm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
