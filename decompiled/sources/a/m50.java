package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class m50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21197a;
    public final /* synthetic */ byte b;

    public m50(Class cls, byte b) {
        this.b = b;
        this.f21197a = cls;
    }

    public final Object a(x3 x3Var) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                i50 i50Var = (i50) x3Var;
                return new mvb0(new ywu(i50Var.x().h()), i50Var.y().y());
            case 1:
                v50 v50Var = (v50) x3Var;
                m50[] m50VarArr = {new m50(z50.class, (byte) 2)};
                HashMap map = new HashMap();
                for (m50 m50Var : m50VarArr) {
                    boolean zContainsKey = map.containsKey(m50Var.f21197a);
                    Class cls = m50Var.f21197a;
                    if (zContainsKey) {
                        jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, m50Var);
                }
                if (m50VarArr.length > 0) {
                    Class cls2 = m50VarArr[0].f21197a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                b60 b60VarX = v50Var.x();
                m50 m50Var2 = (m50) mapUnmodifiableMap.get(z50.class);
                if (m50Var2 == null) {
                    e9d0.w(z50.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                    return null;
                }
                z50 z50Var = (z50) m50Var2.a(b60VarX);
                m50[] m50VarArr2 = {new m50(gp10.class, (byte) 8)};
                HashMap map2 = new HashMap();
                for (m50 m50Var3 : m50VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(m50Var3.f21197a);
                    Class cls3 = m50Var3.f21197a;
                    if (zContainsKey2) {
                        jf4.o(ohs0.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, m50Var3);
                }
                if (m50VarArr2.length > 0) {
                    Class cls4 = m50VarArr2[0].f21197a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                lfw lfwVarY = v50Var.y();
                m50 m50Var4 = (m50) mapUnmodifiableMap2.get(gp10.class);
                if (m50Var4 != null) {
                    return new iwn(z50Var, (gp10) m50Var4.a(lfwVarY), v50Var.y().z().z());
                }
                e9d0.w(gp10.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            case 2:
                b60 b60Var = (b60) x3Var;
                return new z50(b60Var.y().h(), b60Var.z().y());
            case 3:
                i60 i60Var = (i60) x3Var;
                return new g60(i60Var.x().h(), i60Var.y().y());
            case 4:
                return new r60(((u60) x3Var).x().h(), (byte) 0);
            case 5:
                return new b70(((d70) x3Var).x().h());
            case 6:
                return new l70(((n70) x3Var).x().h());
            case 7:
                return new r60(((dbb) x3Var).x().h(), (byte) 2);
            case 8:
                lfw lfwVar = (lfw) x3Var;
                jnv jnvVarY = lfwVar.z().y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(lfwVar.y().h(), "HMAC");
                int iZ = lfwVar.z().z();
                int iOrdinal = jnvVarY.ordinal();
                if (iOrdinal == 1) {
                    return new mvb0(new lvb0("HMACSHA1", secretKeySpec, (byte) 0), iZ);
                }
                if (iOrdinal == 2) {
                    return new mvb0(new lvb0("HMACSHA384", secretKeySpec, (byte) 0), iZ);
                }
                if (iOrdinal == 3) {
                    return new mvb0(new lvb0("HMACSHA256", secretKeySpec, (byte) 0), iZ);
                }
                if (iOrdinal == 4) {
                    return new mvb0(new lvb0("HMACSHA512", secretKeySpec, (byte) 0), iZ);
                }
                if (iOrdinal == 5) {
                    return new mvb0(new lvb0("HMACSHA224", secretKeySpec, (byte) 0), iZ);
                }
                hny.o("unknown hash");
                return null;
            case 9:
                String strY = ((pqy) x3Var).x().y();
                return rqy.a(strY).c(strY);
            case 10:
                uqy uqyVar = (uqy) x3Var;
                String strZ = uqyVar.x().z();
                return new sqy(uqyVar.x().y(), rqy.a(strZ).c(strZ));
            default:
                return new r60(((vxv0) x3Var).x().h(), (byte) 3);
        }
    }
}
