package a;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b50 {
    static {
        m50[] m50VarArr = {new m50(a50.class, (byte) 1)};
        HashMap map = new HashMap();
        m50 m50Var = m50VarArr[0];
        boolean zContainsKey = map.containsKey(m50Var.f21197a);
        Class cls = m50Var.f21197a;
        if (zContainsKey) {
            jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, m50Var);
        Class cls2 = m50VarArr[0].f21197a;
        Collections.unmodifiableMap(map);
        m50[] m50VarArr2 = {new m50(a50.class, (byte) 4)};
        HashMap map2 = new HashMap();
        m50 m50Var2 = m50VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(m50Var2.f21197a);
        Class cls3 = m50Var2.f21197a;
        if (zContainsKey2) {
            jf4.o(ohs0.l(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls3, m50Var2);
        Class cls4 = m50VarArr2[0].f21197a;
        Collections.unmodifiableMap(map2);
        m50[] m50VarArr3 = {new m50(a50.class, (byte) 5)};
        HashMap map3 = new HashMap();
        m50 m50Var3 = m50VarArr3[0];
        boolean zContainsKey3 = map3.containsKey(m50Var3.f21197a);
        Class cls5 = m50Var3.f21197a;
        if (zContainsKey3) {
            jf4.o(ohs0.l(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map3.put(cls5, m50Var3);
        Class cls6 = m50VarArr3[0].f21197a;
        Collections.unmodifiableMap(map3);
        m50[] m50VarArr4 = {new m50(a50.class, (byte) 3)};
        HashMap map4 = new HashMap();
        m50 m50Var4 = m50VarArr4[0];
        boolean zContainsKey4 = map4.containsKey(m50Var4.f21197a);
        Class cls7 = m50Var4.f21197a;
        if (zContainsKey4) {
            jf4.o(ohs0.l(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map4.put(cls7, m50Var4);
        Class cls8 = m50VarArr4[0].f21197a;
        Collections.unmodifiableMap(map4);
        m50[] m50VarArr5 = {new m50(a50.class, (byte) 9)};
        HashMap map5 = new HashMap();
        m50 m50Var5 = m50VarArr5[0];
        boolean zContainsKey5 = map5.containsKey(m50Var5.f21197a);
        Class cls9 = m50Var5.f21197a;
        if (zContainsKey5) {
            jf4.o(ohs0.l(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map5.put(cls9, m50Var5);
        Class cls10 = m50VarArr5[0].f21197a;
        Collections.unmodifiableMap(map5);
        m50[] m50VarArr6 = {new m50(a50.class, (byte) 10)};
        HashMap map6 = new HashMap();
        m50 m50Var6 = m50VarArr6[0];
        boolean zContainsKey6 = map6.containsKey(m50Var6.f21197a);
        Class cls11 = m50Var6.f21197a;
        if (zContainsKey6) {
            jf4.o(ohs0.l(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map6.put(cls11, m50Var6);
        Class cls12 = m50VarArr6[0].f21197a;
        Collections.unmodifiableMap(map6);
        m50[] m50VarArr7 = {new m50(a50.class, (byte) 7)};
        HashMap map7 = new HashMap();
        m50 m50Var7 = m50VarArr7[0];
        boolean zContainsKey7 = map7.containsKey(m50Var7.f21197a);
        Class cls13 = m50Var7.f21197a;
        if (zContainsKey7) {
            jf4.o(ohs0.l(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map7.put(cls13, m50Var7);
        Class cls14 = m50VarArr7[0].f21197a;
        Collections.unmodifiableMap(map7);
        m50[] m50VarArr8 = {new m50(a50.class, (byte) 11)};
        HashMap map8 = new HashMap();
        m50 m50Var8 = m50VarArr8[0];
        boolean zContainsKey8 = map8.containsKey(m50Var8.f21197a);
        Class cls15 = m50Var8.f21197a;
        if (zContainsKey8) {
            jf4.o(ohs0.l(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map8.put(cls15, m50Var8);
        Class cls16 = m50VarArr8[0].f21197a;
        Collections.unmodifiableMap(map8);
        int i = qcf0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        pcf0.h(f50.b);
        hp10.a();
        pcf0.f(new o50(v50.class, new m50[]{new m50(a50.class, (byte) 1)}, (byte) 2), true);
        Class<u60> cls = u60.class;
        pcf0.f(new o50(cls, new m50[]{new m50(a50.class, (byte) 4)}, (byte) 4), true);
        vo80 vo80Var = a70.f342a;
        jz40 jz40Var = jz40.b;
        jz40Var.e(a70.f342a);
        jz40Var.d(a70.b);
        jz40Var.c(a70.c);
        jz40Var.b(a70.d);
        if (foq0.a()) {
            return;
        }
        Class<i60> cls2 = i60.class;
        pcf0.f(new o50(cls2, new m50[]{new m50(a50.class, (byte) 3)}, (byte) 3), true);
        jz40Var.e(q60.f28177a);
        jz40Var.d(q60.b);
        jz40Var.c(q60.c);
        jz40Var.b(q60.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            Class<d70> cls3 = d70.class;
            pcf0.f(new o50(cls3, new m50[]{new m50(a50.class, (byte) 5)}, (byte) 5), true);
            jz40Var.e(j70.f16015a);
            jz40Var.d(j70.b);
            jz40Var.c(j70.c);
            jz40Var.b(j70.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        Class<dbb> cls4 = dbb.class;
        pcf0.f(new o50(cls4, new m50[]{new m50(a50.class, (byte) 7)}, (byte) 7), true);
        vo80 vo80Var2 = jbb.f16231a;
        jz40 jz40Var2 = jz40.b;
        jz40Var2.e(jbb.f16231a);
        jz40Var2.d(jbb.b);
        jz40Var2.c(jbb.c);
        jz40Var2.b(jbb.d);
        pcf0.f(new o50(pqy.class, new m50[]{new m50(a50.class, (byte) 9)}, (byte) 8), true);
        Class<uqy> cls5 = uqy.class;
        pcf0.f(new o50(cls5, new m50[]{new m50(a50.class, (byte) 10)}, (byte) 9), true);
        Class<vxv0> cls6 = vxv0.class;
        pcf0.f(new o50(cls6, new m50[]{new m50(a50.class, (byte) 11)}, (byte) 10), true);
        jz40Var2.e(zxv0.f45177a);
        jz40Var2.d(zxv0.b);
        jz40Var2.c(zxv0.c);
        jz40Var2.b(zxv0.d);
    }
}
