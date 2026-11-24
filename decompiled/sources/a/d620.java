package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d620 extends bnn0 implements Function2 {
    public svu i;
    public String j;
    public int k;
    public int l;
    public boolean m;
    public byte n;
    public final /* synthetic */ h620 o;
    public final /* synthetic */ oa20 p;
    public final /* synthetic */ q4f q;
    public final /* synthetic */ kuw r;
    public final /* synthetic */ ArrayList s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d620(h620 h620Var, oa20 oa20Var, q4f q4fVar, kuw kuwVar, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.o = h620Var;
        this.p = oa20Var;
        this.q = q4fVar;
        this.r = kuwVar;
        this.s = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new d620(this.o, this.p, this.q, this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        h620 h620Var;
        boolean z;
        Object objZ;
        svu svuVar;
        String str;
        int i2;
        int i3;
        boolean zA;
        Object objA;
        boolean z2;
        svu svuVar2;
        int i4;
        boolean z3;
        boolean z4;
        wne wneVar = wne.f39444a;
        byte b = this.n;
        oa20 oa20Var = this.p;
        h620 h620Var2 = this.o;
        if (b == 0) {
            z1x.P(obj);
            w5z w5zVar = h620Var2.v;
            String simpleName = rye.class.getSimpleName();
            List listC = oa20Var == null ? iun.f15405a : kotlin.collections.a.c(oa20Var.f24910a);
            g920 g920Var = g920.COEF;
            long jLongValue = ((Number) h620Var2.o0.getValue()).longValue();
            long jA = h620Var2.P.a();
            this.n = (byte) 1;
            i = 0;
            h620Var = h620Var2;
            if (w5zVar.V(listC, this.q, g920Var, this.r, jLongValue, simpleName, this.s, jA, this) != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
            i = 0;
            h620Var = h620Var2;
        } else {
            if (b == 2) {
                i2 = this.l;
                int i5 = this.k;
                str = this.j;
                svu svuVar3 = this.i;
                z1x.P(obj);
                i = 0;
                h620Var = h620Var2;
                i3 = i5;
                svuVar = svuVar3;
                z = true;
                objZ = obj;
                zA = ((ql5) objZ).i.a();
                u4a u4aVar = h620Var.w;
                this.i = svuVar;
                this.j = str;
                this.k = i3;
                this.l = i2;
                this.m = zA;
                this.n = (byte) 3;
                objA = u4aVar.a(this);
                if (objA != wneVar) {
                    z2 = zA;
                    svuVar2 = svuVar;
                    i4 = i2;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = this.m;
            i4 = this.l;
            int i6 = this.k;
            str = this.j;
            svu svuVar4 = this.i;
            z1x.P(obj);
            z2 = z5;
            i = 0;
            i3 = i6;
            svuVar2 = svuVar4;
            objA = obj;
            z = true;
        }
        String str2 = str;
        if (i3 != 0) {
            z3 = z;
        } else {
            z3 = i;
        }
        if (i4 != 0) {
            z4 = z;
        } else {
            z4 = i;
        }
        svuVar2.k(str2, z3, z4, z2, ((Boolean) objA).booleanValue());
        return Unit.f46060a;
        if (oa20Var != null) {
            svu svuVar5 = h620Var.K;
            String strName = h620Var.n.a().name();
            this.i = svuVar5;
            this.j = strName;
            this.k = i;
            z = true;
            this.l = 1;
            this.n = (byte) 2;
            objZ = h620Var.z(this);
            if (objZ != wneVar) {
                svuVar = svuVar5;
                str = strName;
                i2 = 1;
                i3 = i;
                zA = ((ql5) objZ).i.a();
                u4a u4aVar2 = h620Var.w;
                this.i = svuVar;
                this.j = str;
                this.k = i3;
                this.l = i2;
                this.m = zA;
                this.n = (byte) 3;
                objA = u4aVar2.a(this);
                if (objA != wneVar) {
                    z2 = zA;
                    svuVar2 = svuVar;
                    i4 = i2;
                    String str3 = str;
                    if (i3 != 0) {
                        z3 = z;
                    } else {
                        z3 = i;
                    }
                    if (i4 != 0) {
                        z4 = z;
                    } else {
                        z4 = i;
                    }
                    svuVar2.k(str3, z3, z4, z2, ((Boolean) objA).booleanValue());
                }
            }
            return wneVar;
        }
        return Unit.f46060a;
    }
}
