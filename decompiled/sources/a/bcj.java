package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bcj extends bnn0 implements Function1 {
    public Object i;
    public Serializable j;
    public Object k;
    public Object l;
    public Iterator m;
    public int n;
    public byte o;
    public final /* synthetic */ ncj p;
    public final /* synthetic */ pmi q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcj(ncj ncjVar, pmi pmiVar, yje yjeVar) {
        super(1, yjeVar);
        this.p = ncjVar;
        this.q = pmiVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new bcj(this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((bcj) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009f->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        i050 k050Var;
        hie0 hie0Var;
        mie0 mie0Var;
        mie0 mie0Var2;
        i050 i050Var;
        Iterator it;
        i050 i050Var2;
        hie0 hie0Var2;
        mie0 mie0Var3;
        acj acjVar;
        mie0 mie0Var4;
        hie0 hie0Var3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Object objA;
        Object obj3;
        int i;
        wne wneVar = wne.f39444a;
        byte b = this.o;
        pmi pmiVar = this.q;
        ncj ncjVar = this.p;
        if (b == 0) {
            z1x.P(obj);
            k050Var = new k050();
            hie0Var = new hie0();
            mie0Var = new mie0();
            this.i = k050Var;
            this.j = hie0Var;
            this.k = mie0Var;
            this.l = mie0Var;
            this.o = (byte) 1;
            obj = ncjVar.h(true, this);
            if (obj != wneVar) {
                mie0Var2 = mie0Var;
            }
            return wneVar;
        }
        if (b == 1) {
            mie0Var = (mie0) this.l;
            mie0Var2 = (mie0) this.k;
            hie0Var = (hie0) this.j;
            k050Var = (i050) this.i;
            z1x.P(obj);
        } else {
            if (b == 2) {
                it = this.m;
                acjVar = (acj) this.l;
                mie0Var3 = (mie0) this.k;
                hie0Var2 = (hie0) this.j;
                i050Var2 = (i050) this.i;
                z1x.P(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.i = i050Var2;
                    this.j = hie0Var2;
                    this.k = mie0Var3;
                    this.l = acjVar;
                    this.m = it;
                    this.o = (byte) 2;
                    if (function2.invoke(acjVar, this) == wneVar) {
                        return wneVar;
                    }
                }
                mie0Var2 = mie0Var3;
                hie0Var = hie0Var2;
                i050Var = i050Var2;
                pmiVar.d = null;
                this.i = hie0Var;
                this.j = mie0Var2;
                this.k = i050Var;
                this.l = null;
                this.m = null;
                this.o = (byte) 3;
                if (i050Var.d(this) != wneVar) {
                    mie0Var4 = mie0Var2;
                    hie0Var3 = hie0Var;
                    hie0Var3.f13108a = true;
                    i050Var.c(null);
                    obj2 = mie0Var4.f21842a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    mlx mlxVarC = ncjVar.c();
                    this.i = obj2;
                    this.j = null;
                    this.k = null;
                    this.n = iHashCode;
                    this.o = (byte) 4;
                    objA = mlxVarC.a(this);
                    if (objA != wneVar) {
                        obj = objA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                }
                return wneVar;
            }
            if (b == 3) {
                i050Var = (i050) this.k;
                mie0Var4 = (mie0) this.j;
                hie0Var3 = (hie0) this.i;
                z1x.P(obj);
                try {
                    hie0Var3.f13108a = true;
                    i050Var.c(null);
                    obj2 = mie0Var4.f21842a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    mlx mlxVarC2 = ncjVar.c();
                    this.i = obj2;
                    this.j = null;
                    this.k = null;
                    this.n = iHashCode;
                    this.o = (byte) 4;
                    objA = mlxVarC2.a(this);
                    if (objA != wneVar) {
                        obj = objA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                    return wneVar;
                } catch (Throwable th) {
                    i050Var.c(null);
                    throw th;
                }
            }
            if (b != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.n;
            obj3 = this.i;
            z1x.P(obj);
        }
        return new naj(i, ((Number) obj).intValue(), obj3);
        mie0Var.f21842a = ((naj) obj).b;
        acj acjVar2 = new acj(k050Var, hie0Var, mie0Var2, ncjVar);
        List list = (List) pmiVar.d;
        if (list != null) {
            it = list.iterator();
            i050Var2 = k050Var;
            hie0Var2 = hie0Var;
            mie0Var3 = mie0Var2;
            acjVar = acjVar2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.i = i050Var2;
                this.j = hie0Var2;
                this.k = mie0Var3;
                this.l = acjVar;
                this.m = it;
                this.o = (byte) 2;
                if (function2.invoke(acjVar, this) == wneVar) {
                    return wneVar;
                }
            }
            mie0Var2 = mie0Var3;
            hie0Var = hie0Var2;
            i050Var = i050Var2;
        } else {
            i050Var = k050Var;
        }
        pmiVar.d = null;
        this.i = hie0Var;
        this.j = mie0Var2;
        this.k = i050Var;
        this.l = null;
        this.m = null;
        this.o = (byte) 3;
        if (i050Var.d(this) != wneVar) {
            mie0Var4 = mie0Var2;
            hie0Var3 = hie0Var;
            hie0Var3.f13108a = true;
            i050Var.c(null);
            obj2 = mie0Var4.f21842a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            mlx mlxVarC3 = ncjVar.c();
            this.i = obj2;
            this.j = null;
            this.k = null;
            this.n = iHashCode;
            this.o = (byte) 4;
            objA = mlxVarC3.a(this);
            if (objA != wneVar) {
                obj = objA;
                obj3 = obj2;
                i = iHashCode;
                return new naj(i, ((Number) obj).intValue(), obj3);
            }
        }
        return wneVar;
    }
}
