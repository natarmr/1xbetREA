package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l4 implements jiy {
    public jiy a(bld bldVar, String str) {
        qaj qajVarB = bldVar.b();
        sgy sgyVarC = c();
        qajVarB.getClass();
        sgyVarC.getClass();
        Map map = (Map) ((Map) qajVarB.e).get(sgyVarC);
        jiy jiyVar = map != null ? (jiy) map.get(str) : null;
        if (!(jiyVar instanceof jiy)) {
            jiyVar = null;
        }
        if (jiyVar != null) {
            return jiyVar;
        }
        Object obj = ((Map) qajVarB.f).get(sgyVarC);
        Function1 function1 = zys0.f(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (jiy) function1.invoke(str);
        }
        return null;
    }

    public jiy b(bwn bwnVar, Object obj) {
        jiy jiyVar;
        obj.getClass();
        qaj qajVarB = bwnVar.b();
        sgy sgyVarC = c();
        qajVarB.getClass();
        sgyVarC.getClass();
        if (sgyVarC.r(obj)) {
            Map map = (Map) ((Map) qajVarB.b).get(sgyVarC);
            if (map != null) {
                jiyVar = (jiy) map.get(sre0.f32672a.b(obj.getClass()));
            } else {
                jiyVar = null;
            }
            jiy jiyVar2 = jiyVar instanceof jiy ? jiyVar : null;
            if (jiyVar2 != null) {
                return jiyVar2;
            }
            Object obj2 = ((Map) qajVarB.d).get(sgyVarC);
            Function1 function1 = zys0.f(1, obj2) ? (Function1) obj2 : null;
            if (function1 != null) {
                return (jiy) function1.invoke(obj);
            }
        }
        return null;
    }

    public abstract sgy c();

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 descriptor = getDescriptor();
        bld bldVarA = rkjVar.a(descriptor);
        mie0 mie0Var = new mie0();
        Object objM = null;
        while (true) {
            int iF = bldVarA.f(getDescriptor());
            if (iF == -1) {
                if (objM != null) {
                    bldVarA.c(descriptor);
                    return objM;
                }
                hny.v((String) mie0Var.f21842a, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iF != 0) {
                Object obj = mie0Var.f21842a;
                if (iF != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) obj;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iF);
                    throw new fhi0(sb.toString());
                }
                if (obj == null) {
                    jf4.o("Cannot read polymorphic value before its type token");
                    return null;
                }
                mie0Var.f21842a = obj;
                objM = bldVarA.m(getDescriptor(), iF, a8k0.t(this, bldVarA, (String) obj), null);
            } else {
                mie0Var.f21842a = bldVarA.x(getDescriptor(), iF);
            }
        }
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        obj.getClass();
        jiy jiyVarU = a8k0.u(this, bwnVar, obj);
        ugi0 descriptor = getDescriptor();
        cld cldVarA = bwnVar.a(descriptor);
        cldVarA.z(getDescriptor(), 0, jiyVarU.getDescriptor().h());
        cldVarA.m(getDescriptor(), 1, jiyVarU, obj);
        cldVarA.c(descriptor);
    }
}
