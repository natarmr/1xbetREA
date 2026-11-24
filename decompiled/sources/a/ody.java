package a;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ody extends t2 {
    public final edy f;
    public final ugi0 g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ody(vby vbyVar, edy edyVar, String str, ugi0 ugi0Var) {
        super(vbyVar, str);
        vbyVar.getClass();
        this.f = edyVar;
        this.g = ugi0Var;
    }

    @Override // a.t2, a.rkj
    public final boolean A() {
        return !this.i && super.A();
    }

    @Override // a.t2
    public mcy F(String str) {
        str.getClass();
        return (mcy) xp20.d(T(), str);
    }

    @Override // a.t2
    public String R(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        vby vbyVar = this.c;
        ady.d(vbyVar, ugi0Var);
        String strE = ugi0Var.e(i);
        if (this.e.g && !T().f7643a.keySet().contains(strE)) {
            vqc vqcVar = vbyVar.c;
            wqv wqvVar = new wqv(ugi0Var, vbyVar, (byte) 19);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) vqcVar.b;
            Map map = (Map) concurrentHashMap.get(ugi0Var);
            Object obj = null;
            nek nekVar = ady.f702a;
            Object objInvoke = map != null ? map.get(nekVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = wqvVar.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(ugi0Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(ugi0Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(nekVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : T().f7643a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    @Override // a.t2
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public edy T() {
        return this.f;
    }

    public final boolean Z(ugi0 ugi0Var, int i) {
        boolean z = (this.c.f37162a.c || ugi0Var.i(i) || !ugi0Var.g(i).b()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // a.t2, a.rkj
    public final bld a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        ugi0 ugi0Var2 = this.g;
        if (ugi0Var != ugi0Var2) {
            return super.a(ugi0Var);
        }
        mcy mcyVarG = G();
        String strH = ugi0Var2.h();
        boolean z = mcyVarG instanceof edy;
        vby vbyVar = this.c;
        if (z) {
            return new ody(vbyVar, (edy) mcyVarG, this.d, ugi0Var2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        tre0 tre0Var = sre0.f32672a;
        sb.append(tre0Var.b(edy.class).J());
        sb.append(", but had ");
        sb.append(tre0Var.b(mcyVarG.getClass()).J());
        throw new kcy(xww.B(-1, axq.n(sb, " as the serialized body of ", strH), V(), null, vbyVar.f37162a.i ? xww.R(-1, mcyVarG.toString()).toString() : null));
    }

    @Override // a.t2, a.bld
    public void c(ugi0 ugi0Var) {
        Set setG;
        ugi0Var.getClass();
        vby vbyVar = this.c;
        if (ady.c(vbyVar, ugi0Var) || (ugi0Var.l() instanceof tua0)) {
            return;
        }
        ady.d(vbyVar, ugi0Var);
        if (this.e.g) {
            Set setJ = j2e.J(ugi0Var);
            Map map = (Map) ((ConcurrentHashMap) vbyVar.c.b).get(ugi0Var);
            Object obj = map != null ? map.get(ady.f702a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = xun.f41520a;
            }
            setG = eui0.g(setJ, setKeySet);
        } else {
            setG = j2e.J(ugi0Var);
        }
        for (String str : T().f7643a.keySet()) {
            if (!setG.contains(str) && !Intrinsics.d(str, this.d)) {
                throw new kcy(xww.B(-1, hne.l('\'', "Encountered an unknown key '", str), V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", vbyVar.f37162a.i ? xww.R(-1, T().toString()).toString() : null));
            }
        }
    }

    @Override // a.bld
    public int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        while (this.h < ugi0Var.d()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(ugi0Var, i);
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(strS) || Z(ugi0Var, i2)) {
                if (this.e.e) {
                    boolean zI = ugi0Var.i(i2);
                    ugi0 ugi0VarG = ugi0Var.g(i2);
                    if (!zI || ugi0VarG.b() || !(((mcy) T().get(strS)) instanceof bdy)) {
                        if (Intrinsics.d(ugi0VarG.l(), zgi0.b) && (!ugi0VarG.b() || !(((mcy) T().get(strS)) instanceof bdy))) {
                            mcy mcyVar = (mcy) T().get(strS);
                            String strB = null;
                            jdy jdyVar = mcyVar instanceof jdy ? (jdy) mcyVar : null;
                            if (jdyVar != null) {
                                scx scxVar = ncy.f23316a;
                                if (!(jdyVar instanceof bdy)) {
                                    strB = jdyVar.b();
                                }
                            }
                            if (strB != null) {
                                vby vbyVar = this.c;
                                int iA = ady.a(ugi0VarG, vbyVar, strB);
                                boolean z = !vbyVar.f37162a.c && ugi0VarG.b();
                                if (iA != -3 || ((!zI && !z) || Z(ugi0Var, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public /* synthetic */ ody(vby vbyVar, edy edyVar, String str, int i) {
        this(vbyVar, edyVar, (i & 4) != 0 ? null : str, (ugi0) null);
    }
}
