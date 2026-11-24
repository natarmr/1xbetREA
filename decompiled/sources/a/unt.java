package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class unt extends bnn0 implements Function2 {
    public int i;
    public int j;
    public int k;
    public ocl l;
    public byte m;
    public /* synthetic */ boolean n;
    public final /* synthetic */ ali o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unt(ali aliVar, yje yjeVar) {
        super(2, yjeVar);
        this.o = aliVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        unt untVar = new unt(this.o, yjeVar);
        untVar.n = ((Boolean) obj).booleanValue();
        return untVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((unt) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[RETURN] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        ocl oclVar;
        int i;
        boolean z;
        Integer num;
        int i2;
        int i3;
        int i4;
        Object objD0;
        boolean z2 = this.n;
        wne wneVar = wne.f39444a;
        byte b = this.m;
        ali aliVar = this.o;
        if (b == 0) {
            z1x.P(obj);
            pmi pmiVar = (pmi) aliVar.b;
            this.n = z2;
            this.m = (byte) 1;
            obj = pmiVar.x(this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = this.k;
            i2 = this.j;
            i3 = this.i;
            oclVar = this.l;
            z1x.P(obj);
        }
        boolean z3 = i4 != 0;
        num = new Integer((int) ((ql5) obj).e);
        i = i2;
        iIntValue = i3;
        z = z3;
        this.l = null;
        this.n = z2;
        this.i = iIntValue;
        this.m = (byte) 3;
        h0q0 h0q0Var = (h0q0) oclVar.f25032a;
        objD0 = qjj.d0(((mne) h0q0Var.c).b, new m9s0(h0q0Var, z, num, i, null), this);
        if (objD0 == wneVar) {
            return wneVar;
        }
        return objD0;
        iIntValue = ((Number) obj).intValue();
        oclVar = (ocl) aliVar.f1068a;
        if (z2) {
            nou nouVar = (nou) aliVar.d;
            this.l = oclVar;
            this.n = z2;
            this.i = iIntValue;
            this.j = iIntValue;
            this.k = z2 ? 1 : 0;
            this.m = (byte) 2;
            Serializable serializableA = nouVar.a(tl5.c, this);
            if (serializableA != wneVar) {
                i2 = iIntValue;
                i3 = i2;
                obj = serializableA;
                i4 = z2 ? 1 : 0;
                if (i4 != 0) {
                }
                num = new Integer((int) ((ql5) obj).e);
                i = i2;
                iIntValue = i3;
                z = z3;
                this.l = null;
                this.n = z2;
                this.i = iIntValue;
                this.m = (byte) 3;
                h0q0 h0q0Var2 = (h0q0) oclVar.f25032a;
                objD0 = qjj.d0(((mne) h0q0Var2.c).b, new m9s0(h0q0Var2, z, num, i, null), this);
                if (objD0 == wneVar) {
                    return objD0;
                }
            }
        } else {
            i = iIntValue;
            z = z2 ? 1 : 0;
            num = null;
            this.l = null;
            this.n = z2;
            this.i = iIntValue;
            this.m = (byte) 3;
            h0q0 h0q0Var3 = (h0q0) oclVar.f25032a;
            objD0 = qjj.d0(((mne) h0q0Var3.c).b, new m9s0(h0q0Var3, z, num, i, null), this);
            if (objD0 == wneVar) {
                return objD0;
            }
        }
        return wneVar;
    }
}
