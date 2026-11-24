package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class o2v extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public byte k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2v(yje yjeVar, wdu wduVar, boolean z) {
        super(3, yjeVar);
        this.i = (byte) 0;
        this.n = wduVar;
        this.j = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                o2v o2vVar = new o2v((yje) obj3, (wdu) obj4, this.j);
                o2vVar.l = (sw00) obj;
                o2vVar.m = (gu1) obj2;
                return o2vVar.invokeSuspend(Unit.f46060a);
            case 1:
                o2v o2vVar2 = new o2v(obj4, (yje) obj3, (byte) 1);
                o2vVar2.l = (kmq) obj;
                o2vVar2.m = (List) obj2;
                return o2vVar2.invokeSuspend(Unit.f46060a);
            case 2:
                o2v o2vVar3 = new o2v(obj4, (yje) obj3, (byte) 2);
                o2vVar3.l = (kmq) obj;
                o2vVar3.m = (List) obj2;
                return o2vVar3.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                o2v o2vVar4 = new o2v((mgo0) this.m, (fho0) obj4, (yje) obj3);
                o2vVar4.l = (kmq) obj;
                o2vVar4.j = zBooleanValue;
                return o2vVar4.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (a.slb.Q(r1, r4, r20) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r1.a(r2, r20) == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        if (a.slb.Q(r1, r3, r20) == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016b, code lost:
    
        if (r1.a(r2, r20) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d4, code lost:
    
        if (a.slb.Q(r1, r4, r20) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0212, code lost:
    
        if (r0 == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0223, code lost:
    
        if (r0 == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return r9;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o2v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2v(mgo0 mgo0Var, fho0 fho0Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 3;
        this.m = mgo0Var;
        this.n = fho0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2v(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
    }
}
