package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ere0 implements dre0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rgy f8277a;
    public final mre0 b;

    public ere0(rgy rgyVar) {
        rgyVar.getClass();
        this.f8277a = rgyVar;
        this.b = bww.S(null, new b0c0(0, this, fre0.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, (byte) 17));
    }

    @Override // a.dre0
    public List a() {
        return getParameters();
    }

    @Override // a.qgy
    public final Object call(Object... objArr) throws c44 {
        objArr.getClass();
        try {
            return x().call(objArr);
        } catch (IllegalAccessException e) {
            throw new c44(e, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    @Override // a.qgy
    public final Object callBy(Map map) throws c44 {
        int i;
        Object objM;
        map.getClass();
        boolean z = false;
        if (fre0.V(this)) {
            List<hre0> parameters = getParameters();
            ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
            for (hre0 hre0Var : parameters) {
                if (map.containsKey(hre0Var)) {
                    objM = map.get(hre0Var);
                    if (objM == null) {
                        e9d0.f(41, "Annotation argument value cannot be null (", hre0Var);
                        return null;
                    }
                } else if (hre0Var.q()) {
                    objM = null;
                } else {
                    if (!hre0Var.u()) {
                        e9d0.i(hre0Var, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objM = fre0.M(hre0Var.p());
                }
                arrayList.add(objM);
            }
            bv9 bv9VarG = G();
            if (bv9VarG == null) {
                ohq.u(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return bv9VarG.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new c44(e, (byte) 6);
            }
        }
        List<hre0> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return x().call(isSuspend() ? new yje[]{null} : new yje[0]);
            } catch (IllegalAccessException e2) {
                throw new c44(e2, (byte) 6);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        if (fre0.X(this)) {
            Member memberB = x().b();
            Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
            if (constructor == null || !acb.V(constructor)) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        int i2 = size + i;
        Object[] objArr = (Object[]) ((Object[]) this.b.invoke()).clone();
        if (isSuspend() || i != 0) {
            objArr[parameters2.size()] = null;
        }
        int i3 = 0;
        for (hre0 hre0Var2 : parameters2) {
            if (map.containsKey(hre0Var2)) {
                objArr[hre0Var2.j()] = map.get(hre0Var2);
            } else if (hre0Var2.q()) {
                int i4 = (i3 / 32) + i2;
                Object obj = objArr[i4];
                obj.getClass();
                objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                z = true;
            } else if (!hre0Var2.u()) {
                e9d0.i(hre0Var2, "No argument provided for a required parameter: ");
                return null;
            }
            if (hre0Var2.n() == aiy.d || hre0Var2.n() == aiy.b) {
                i3++;
            }
        }
        if (!z) {
            try {
                return x().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new c44(e3, (byte) 6);
            }
        }
        bv9 bv9VarG2 = G();
        if (bv9VarG2 == null) {
            ohq.u(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return bv9VarG2.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new c44(e4, (byte) 6);
        }
    }

    @Override // a.qgy
    public final boolean isAbstract() {
        return m() == fm40.ABSTRACT;
    }

    @Override // a.qgy
    public final boolean isFinal() {
        return m() == fm40.FINAL;
    }

    @Override // a.qgy
    public final boolean isOpen() {
        return m() == fm40.OPEN;
    }
}
