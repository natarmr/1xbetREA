package a;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class es implements nae0 {
    public static final z7f d = new z7f((byte) 0);
    public static final l13 e = new l13((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8305a;
    public Object b;
    public Object c;

    public es(sln slnVar, ocl oclVar, btt0 btt0Var) {
        slnVar.getClass();
        btt0Var.getClass();
        this.f8305a = slnVar;
        this.b = oclVar;
        this.c = btt0Var;
    }

    public static Object y(dqk0 dqk0Var) {
        if (dqk0Var != null) {
            if (dqk0Var instanceof bqk0) {
                return null;
            }
            if (dqk0Var instanceof cqk0) {
                return ((cqk0) dqk0Var).f4798a;
            }
        }
        t9f.b();
        return null;
    }

    public static void z(xzp xzpVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            xzpVar.G(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public void A(long j) {
        Object value;
        Integer numValueOf;
        ArrayList arrayListN0;
        p7m0 p7m0Var = ((sln) this.f8305a).b;
        do {
            value = p7m0Var.getValue();
            List list = (List) value;
            if (list != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((pln) it.next()).c == j) {
                        break;
                    } else {
                        i++;
                    }
                }
                numValueOf = Integer.valueOf(i);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            arrayListN0 = CollectionsKt.N0(list);
            arrayListN0.remove(numValueOf.intValue());
        } while (!p7m0Var.m(value, arrayListN0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:25|74|26|27|(1:30)|63) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(4:(1:(1:13)(2:14|15))(1:16)|51|41|(6:25|74|26|27|(1:30)|63)(1:(2:67|68)(1:69)))(4:17|70|18|19))(2:23|(6:25|74|26|27|(1:30)|63)(1:(2:67|68)(1:69)))|72|31|32|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:30:0x0122  */
    /* JADX WARN: Code duplicated, block: B:39:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0141  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:45:0x0157  */
    /* JADX WARN: Code duplicated, block: B:48:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x017c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0186  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0137, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0177, code lost:
    
        if (a.qcc.P(r11, r8) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        if (a.qcc.P(r11, r8) == r1) goto L63;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0141 -> B:41:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0177 -> B:51:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x017c -> B:51:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01b6 -> B:51:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01b9 -> B:51:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01c1 -> B:51:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(int r22, long r23, long r25, a.zje r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es.B(int, long, long, a.zje):java.lang.Object");
    }

    public void C(List list) {
        list.getClass();
        sln slnVar = (sln) this.f8305a;
        if (slnVar.f32408a.isEmpty() && !list.isEmpty()) {
            slnVar.f32408a = list;
        }
        slnVar.b.o(null, list);
    }

    public void D(Fragment fragment, iiy iiyVar, List list) {
        fragment.getClass();
        iiyVar.getClass();
        list.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        String str = (String) this.f8305a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        bundle.putSerializable(str, arrayList);
        this.c = list;
    }

    public cyu E() {
        btt0 btt0Var = (btt0) this.f8305a;
        wq10 wq10Var = new wq10((gii0) this.b, (byte) 0);
        ivp0 ivp0Var = (ivp0) this.c;
        btt0Var.getClass();
        ivp0Var.getClass();
        cyu cyuVar = new cyu();
        cyuVar.f5196a = btt0Var;
        cyuVar.b = wq10Var;
        cyuVar.c = ivp0Var;
        return cyuVar;
    }

    public xg9 a() {
        ycl yclVar = (ycl) this.f8305a;
        if (yclVar != null) {
            return new zg9(yclVar.f42389a);
        }
        String str = (String) this.b;
        if (str != null) {
            return eh9.i(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.c) + ". Using WrapContent.");
        return eh9.i("wrap");
    }

    public v60 b() throws GeneralSecurityException {
        iw20 iw20Var;
        z60 z60Var = (z60) this.f8305a;
        if (z60Var == null || (iw20Var = (iw20) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (z60Var.b != ((sg9) iw20Var.f15470a).f32150a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        y60 y60Var = z60Var.e;
        y60 y60Var2 = y60.e;
        if (y60Var != y60Var2 && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (y60Var == y60Var2 && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (y60Var == y60Var2) {
            sg9.a(new byte[0]);
        } else if (y60Var == y60.d) {
            sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.c).intValue()).array());
        } else {
            if (y60Var != y60.c) {
                hny.w(((z60) this.f8305a).e, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.c).intValue()).array());
        }
        return new v60();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object c(long j, long j2, zje zjeVar, String str) {
        fx4 fx4Var;
        zw4 zw4Var;
        uw4 uw4Var;
        int iOrdinal;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof fx4) {
            fx4Var = (fx4) zjeVar;
            int i = fx4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fx4Var.k = i - Integer.MIN_VALUE;
            } else {
                fx4Var = new fx4(this, zjeVar);
            }
        } else {
            fx4Var = new fx4(this, zjeVar);
        }
        Object objB = fx4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fx4Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            ehf0 ehf0Var = (ehf0) this.f8305a;
            String strA = ((btt0) this.b).a();
            ov4 ov4Var = new ov4(j, j2, knf0Var.a(), knf0Var.c(), str);
            fx4Var.k = 1;
            objB = ((hv4) ((zo4) ehf0Var.c).invoke()).b(strA, ov4Var, fx4Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        uv4 uv4Var = (uv4) ((q16) objB).a();
        String str2 = uv4Var.f36330a;
        if (str2 == null) {
            str2 = "";
        }
        Long l = uv4Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue == 0) {
            zw4Var = zw4.f45089a;
        } else {
            zw4Var = jLongValue == -1 ? zw4.c : zw4.b;
        }
        zv4 zv4Var = uv4Var.c;
        if (zv4Var == null || (iOrdinal = zv4Var.ordinal()) == 0) {
            uw4Var = uw4.f36376a;
        } else if (iOrdinal == 1) {
            uw4Var = uw4.b;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            uw4Var = uw4.c;
        }
        Integer num = uv4Var.d;
        return new tw4(str2, zw4Var, uw4Var, num != null ? num.intValue() : 0);
    }

    public Object d(long j, boolean z, long j2, int i, List list, List list2, mpp mppVar) {
        Object g0g0Var;
        Object g0g0Var2;
        gst0 gst0Var = (gst0) this.f8305a;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = new Long(gst0Var.e());
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object l = new Long(0L);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = l;
        }
        long jLongValue = ((Number) g0g0Var).longValue();
        try {
            g0g0Var2 = Boolean.valueOf(gst0Var.d(z));
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Object obj = Boolean.FALSE;
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = obj;
        }
        Object objA = ((adn) this.b).a(new r530(j2, j, jLongValue, ((Boolean) g0g0Var2).booleanValue(), z, i, !gst0Var.a(), ((uzc) this.c).b().getId(), list, list2), mppVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(zje zjeVar) {
        gh7 gh7Var;
        if (zjeVar instanceof gh7) {
            gh7Var = (gh7) zjeVar;
            int i = gh7Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gh7Var.k = i - Integer.MIN_VALUE;
            } else {
                gh7Var = new gh7(this, zjeVar);
            }
        } else {
            gh7Var = new gh7(this, zjeVar);
        }
        Object objW0 = gh7Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gh7Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            nqe nqeVarK = ((OnexDatabase) ((rrc) this.c).b).k();
            gh7Var.k = 1;
            objW0 = sj3.w0(gh7Var, nqeVarK.f23955a, new f1e(2, yjeVar, (byte) 3), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable<oqe> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (oqe oqeVar : iterable) {
            oqeVar.getClass();
            arrayList.add(new frq(oqeVar.f25683a, oqeVar.b, oqeVar.f));
        }
        return arrayList;
    }

    public ieu f() {
        return new ieu((Object) ((uii) ((iw20) this.b).f15470a).r(), this.c, (byte) 20);
    }

    public abu g() {
        return new abu(((uii) ((iw20) this.b).f15470a).r(), (rou) this.c, (byte) 20);
    }

    public bzu h() {
        return new bzu((rou) this.c, (byte) 18);
    }

    public List i() {
        List list = (List) ((sln) this.f8305a).b.getValue();
        return list == null ? iun.f15405a : list;
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public List n(Fragment fragment, iiy iiyVar) {
        Serializable g0g0Var;
        fragment.getClass();
        iiyVar.getClass();
        List list = (List) this.c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = null;
        try {
            e0g0 e0g0Var = j0g0.b;
            Bundle bundle = fragment.g;
            g0g0Var = bundle != null ? bundle.getSerializable((String) this.f8305a) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        ArrayList arrayList2 = g0g0Var instanceof ArrayList ? (ArrayList) g0g0Var : null;
        if (arrayList2 != null) {
            this.c = arrayList2;
            arrayList = arrayList2;
        }
        return arrayList != null ? arrayList : (List) this.b;
    }

    public drm0 k() {
        return new drm0(((xzp) ((epi0) this.f8305a).b).C());
    }

    public double l(double d2) {
        List listE = ((x4u) this.f8305a).e(((hst) this.c).f13600a.n(), ((j9c) this.b).a(), d2);
        listE.getClass();
        Iterator it = listE.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00df A[LOOP:0: B:37:0x00d9->B:39:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable m(int i, zje zjeVar) {
        lnu lnuVar;
        LinkedHashMap linkedHashMap;
        if (zjeVar instanceof lnu) {
            lnuVar = (lnu) zjeVar;
            int i2 = lnuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lnuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                lnuVar = new lnu(this, zjeVar);
            }
        } else {
            lnuVar = new lnu(this, zjeVar);
        }
        lnu lnuVar2 = lnuVar;
        Object objJ = lnuVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = lnuVar2.k;
        if (i3 == 0) {
            z1x.P(objJ);
            mnu mnuVar = new mnu(this, ((ntu) this.b).a(), i, ((pru) this.c).a(), null);
            lnuVar2.k = 1;
            objJ = d5c.J(lnuVar2, mnuVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        Map map = (Map) objJ;
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object obj = ((j0g0) entry.getValue()).f15681a;
                z1x.P(obj);
                linkedHashMap.put(key, (List) obj);
            }
        } else {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                    while (r0.hasNext()) {
                        Object key2 = entry.getKey();
                        Object obj2 = ((j0g0) entry.getValue()).f15681a;
                        z1x.P(obj2);
                        linkedHashMap.put(key2, (List) obj2);
                    }
                } else if (!(((j0g0) it.next()).f15681a instanceof g0g0)) {
                    linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key3 = entry2.getKey();
                        Object obj3 = ((j0g0) entry2.getValue()).f15681a;
                        if (j0g0.a(obj3) != null) {
                            obj3 = iun.f15405a;
                        }
                        linkedHashMap.put(key3, (List) obj3);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            jnu jnuVar = (jnu) entry3.getKey();
            List list = (List) entry3.getValue();
            long j = jnuVar.f16827a;
            iun iunVar = iun.f15405a;
            arrayList.add(new nza0(new vh0(j, "", "", "", 0, 0L, 0L, 0L, false, false, "", iunVar, iunVar, false), jnuVar.b, list));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable o(String str, zje zjeVar) {
        jwt jwtVar;
        if (zjeVar instanceof jwt) {
            jwtVar = (jwt) zjeVar;
            int i = jwtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwtVar.l = i - Integer.MIN_VALUE;
            } else {
                jwtVar = new jwt(this, zjeVar);
            }
        } else {
            jwtVar = new jwt(this, zjeVar);
        }
        Object objA = jwtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jwtVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            kwt kwtVar = (kwt) this.f8305a;
            String strA = ((ntu) this.b).a();
            boolean zA = ((k9c) this.c).a();
            jwtVar.i = str;
            jwtVar.l = 1;
            objA = kwtVar.f19019a.a(jwtVar, strA, zA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = jwtVar.i;
            z1x.P(objA);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            pbv pbvVar = (pbv) obj;
            if (str.length() != 0) {
                String str2 = pbvVar.c;
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                String lowerCase2 = str.toLowerCase(locale2);
                lowerCase2.getClass();
                if (StringsKt.O(lowerCase, lowerCase2, false)) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:38:0x00d6->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0131 A[EDGE_INSN: B:102:0x0131->B:57:0x0131 BREAK  A[LOOP:2: B:44:0x00fb->B:56:0x0127], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x018d A[EDGE_INSN: B:109:0x018d->B:68:0x018d BREAK  A[LOOP:5: B:65:0x016f->B:67:0x017a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144 A[LOOP:4: B:58:0x013e->B:60:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a A[LOOP:5: B:65:0x016f->B:67:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e8 A[SYNTHETIC] */
    public Serializable p(List list, List list2, zje zjeVar) {
        h1u h1uVar;
        List list3;
        List list4;
        elt eltVar;
        List list5;
        Object objB;
        List list6;
        List list7;
        elt eltVar2;
        List list8;
        List list9;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean z;
        ArrayList arrayList3;
        Iterator it2;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it3;
        iil iilVar;
        List listA0;
        qkt qktVar;
        String str;
        boolean zContains;
        qkt qktVar2;
        Iterator it4;
        Object next;
        p52 p52Var;
        qkt qktVar3;
        Iterator it5;
        if (zjeVar instanceof h1u) {
            h1uVar = (h1u) zjeVar;
            int i = h1uVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1uVar.o = i - Integer.MIN_VALUE;
            } else {
                h1uVar = new h1u(this, zjeVar);
            }
        } else {
            h1uVar = new h1u(this, zjeVar);
        }
        Object objI = h1uVar.m;
        wne wneVar = wne.f39444a;
        int i2 = h1uVar.o;
        Object obj = null;
        byte b = 3;
        if (i2 == 0) {
            z1x.P(objI);
            ieu ieuVar = (ieu) this.f8305a;
            list3 = list;
            h1uVar.i = list3;
            list4 = list2;
            h1uVar.j = list4;
            h1uVar.o = 1;
            objI = ieuVar.i(h1uVar);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            List list10 = h1uVar.j;
            List list11 = h1uVar.i;
            z1x.P(objI);
            list4 = list10;
            list3 = list11;
        } else {
            if (i2 == 2) {
                elt eltVar3 = h1uVar.k;
                List list12 = h1uVar.j;
                List list13 = h1uVar.i;
                z1x.P(objI);
                eltVar = eltVar3;
                list3 = list13;
                list4 = list12;
                list5 = (List) objI;
                kpt kptVar = (kpt) this.c;
                h1uVar.i = list3;
                h1uVar.j = list4;
                h1uVar.k = eltVar;
                h1uVar.l = list5;
                h1uVar.o = 3;
                objB = kptVar.f18690a.b(h1uVar);
                if (objB != wneVar) {
                    objI = objB;
                    list6 = list5;
                    list7 = list3;
                    eltVar2 = eltVar;
                    list8 = list4;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list6 = h1uVar.l;
            eltVar2 = h1uVar.k;
            list8 = h1uVar.j;
            list7 = h1uVar.i;
            z1x.P(objI);
        }
        list9 = (List) objI;
        arrayList = new ArrayList();
        for (Object obj2 : list6) {
            qktVar3 = (qkt) obj2;
            if (list9 != null || !list9.isEmpty()) {
                it5 = list9.iterator();
                while (it5.hasNext()) {
                    if (qktVar3.f28902a == ((p52) it5.next()).f26383a) {
                        arrayList.add(obj2);
                        break;
                    }
                }
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        it = arrayList.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                break;
            }
            qktVar2 = (qkt) it.next();
            it4 = list9.iterator();
            do {
                if (it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (qktVar2.f28902a != ((p52) next).f26383a);
            p52Var = (p52) next;
            if (p52Var != null) {
                z = p52Var.e;
            }
            arrayList2.add(qkt.a(qktVar2, null, z, 191));
        }
        arrayList3 = new ArrayList(r3d.q(list9, 10));
        it2 = list9.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new Integer(((p52) it2.next()).f26383a));
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
        iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it3 = rx3VarS0.iterator();
        while (true) {
            iilVar = (iil) it3;
            if (iilVar.b.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put(indexedValue.b, new Integer(indexedValue.f46061a));
        }
        listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, b));
        for (Object obj3 : listA0) {
            if (((qkt) obj3).f28902a == eltVar2.e) {
                str = eltVar2.f8017a;
                if (!list7.isEmpty()) {
                    zContains = list7.contains(str);
                } else if (list8.isEmpty() && list8.contains(str)) {
                    zContains = false;
                } else {
                    zContains = true;
                }
                if (zContains) {
                    obj = obj3;
                    break;
                }
            }
        }
        qktVar = (qkt) obj;
        if (qktVar == null) {
            return qktVar;
        }
        if (listA0.size() == 1) {
            return (qkt) CollectionsKt.U(listA0);
        }
        cm90.Companion.getClass();
        return new qkt(-1, 0L, am90.a(), "", "", "", "", false);
        elt eltVar4 = (elt) objI;
        bot botVar = (bot) this.b;
        h1uVar.i = list3;
        h1uVar.j = list4;
        h1uVar.k = eltVar4;
        h1uVar.o = 2;
        Serializable serializableD = botVar.f2951a.d(h1uVar);
        if (serializableD != wneVar) {
            eltVar = eltVar4;
            objI = serializableD;
            list5 = (List) objI;
            kpt kptVar2 = (kpt) this.c;
            h1uVar.i = list3;
            h1uVar.j = list4;
            h1uVar.k = eltVar;
            h1uVar.l = list5;
            h1uVar.o = 3;
            objB = kptVar2.f18690a.b(h1uVar);
            if (objB != wneVar) {
                objI = objB;
                list6 = list5;
                list7 = list3;
                eltVar2 = eltVar;
                list8 = list4;
                list9 = (List) objI;
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    qktVar3 = (qkt) obj2;
                    if (list9 != null) {
                    }
                    it5 = list9.iterator();
                    while (it5.hasNext()) {
                        if (qktVar3.f28902a == ((p52) it5.next()).f26383a) {
                            arrayList.add(obj2);
                            break;
                            break;
                        }
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                it = arrayList.iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    qktVar2 = (qkt) it.next();
                    it4 = list9.iterator();
                    do {
                        if (it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (qktVar2.f28902a != ((p52) next).f26383a);
                    p52Var = (p52) next;
                    if (p52Var != null) {
                        z = p52Var.e;
                    }
                    arrayList2.add(qkt.a(qktVar2, null, z, 191));
                }
                arrayList3 = new ArrayList(r3d.q(list9, 10));
                it2 = list9.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new Integer(((p52) it2.next()).f26383a));
                }
                rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
                iA = wp20.a(r3d.q(rx3VarS1, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                it3 = rx3VarS1.iterator();
                while (true) {
                    iilVar = (iil) it3;
                    if (iilVar.b.hasNext()) {
                        break;
                        break;
                    }
                    IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
                    linkedHashMap.put(indexedValue2.b, new Integer(indexedValue2.f46061a));
                }
                listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, b));
                while (r1.hasNext()) {
                    if (((qkt) obj3).f28902a == eltVar2.e) {
                        str = eltVar2.f8017a;
                        if (!list7.isEmpty()) {
                            zContains = list7.contains(str);
                        } else if (list8.isEmpty()) {
                            zContains = true;
                        } else {
                            zContains = true;
                        }
                        if (zContains) {
                            obj = obj3;
                            break;
                        }
                    }
                }
                qktVar = (qkt) obj;
                if (qktVar == null) {
                    return qktVar;
                }
                if (listA0.size() == 1) {
                    return (qkt) CollectionsKt.U(listA0);
                }
                cm90.Companion.getClass();
                return new qkt(-1, 0L, am90.a(), "", "", "", "", false);
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable q(CyberGamesPage cyberGamesPage, zje zjeVar) {
        w5u w5uVar;
        CyberGamesPage cyberGamesPage2;
        Map map;
        Map map2;
        ArrayList arrayList;
        Iterator it;
        ypl0 ypl0Var;
        if (zjeVar instanceof w5u) {
            w5uVar = (w5u) zjeVar;
            int i = w5uVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5uVar.m = i - Integer.MIN_VALUE;
            } else {
                w5uVar = new w5u(this, zjeVar);
            }
        } else {
            w5uVar = new w5u(this, zjeVar);
        }
        Object objA = w5uVar.k;
        wne wneVar = wne.f39444a;
        int i2 = w5uVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            gvu gvuVar = (gvu) this.b;
            byte b = cyberGamesPage.f46556a;
            w5uVar.i = cyberGamesPage;
            w5uVar.m = 1;
            objA = ((ivu) gvuVar).a(b, w5uVar);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            cyberGamesPage = w5uVar.i;
            z1x.P(objA);
        } else {
            if (i2 == 2) {
                map = w5uVar.j;
                cyberGamesPage2 = w5uVar.i;
                z1x.P(objA);
                int iIntValue = ((Number) objA).intValue();
                ivn ivnVar = (ivn) this.f8305a;
                w5uVar.i = null;
                w5uVar.j = map;
                w5uVar.m = 3;
                objA = ivnVar.j(iIntValue, w5uVar, cyberGamesPage2);
                if (objA != wneVar) {
                    map2 = map;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map2 = w5uVar.j;
            z1x.P(objA);
        }
        arrayList = new ArrayList();
        it = ((Iterable) objA).iterator();
        while (it.hasNext()) {
            ypl0Var = (ypl0) map2.get(new Long(((cmg) it.next()).f4602a));
            if (ypl0Var != null) {
                arrayList.add(ypl0Var);
            }
        }
        return arrayList;
        Map map3 = (Map) objA;
        pmi pmiVar = (pmi) this.c;
        w5uVar.i = cyberGamesPage;
        w5uVar.j = map3;
        w5uVar.m = 2;
        Serializable serializableX = pmiVar.x(w5uVar);
        if (serializableX != wneVar) {
            cyberGamesPage2 = cyberGamesPage;
            map = map3;
            objA = serializableX;
            int iIntValue2 = ((Number) objA).intValue();
            ivn ivnVar2 = (ivn) this.f8305a;
            w5uVar.i = null;
            w5uVar.j = map;
            w5uVar.m = 3;
            objA = ivnVar2.j(iIntValue2, w5uVar, cyberGamesPage2);
            if (objA != wneVar) {
                map2 = map;
                arrayList = new ArrayList();
                it = ((Iterable) objA).iterator();
                while (it.hasNext()) {
                    ypl0Var = (ypl0) map2.get(new Long(((cmg) it.next()).f4602a));
                    if (ypl0Var != null) {
                        arrayList.add(ypl0Var);
                    }
                }
                return arrayList;
            }
        }
        return wneVar;
    }

    public Object r(long j, bnn0 bnn0Var) {
        return ((abu) this.f8305a).v(j, bnn0Var, ((ntu) this.b).a(), ((pru) this.c).a().b.N);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r6 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r6.d(r7, r9, r10, r12, r13, r14, r15) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(long r7, boolean r9, long r10, int r12, java.util.List r13, java.util.List r14, a.zje r15) throws a.zhi0 {
        /*
            r6 = this;
            boolean r0 = r15 instanceof a.mpp
            if (r0 == 0) goto L14
            r0 = r15
            a.mpp r0 = (a.mpp) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.q = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            a.mpp r0 = new a.mpp
            r0.<init>(r6, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.o
            a.wne r1 = a.wne.f39444a
            int r2 = r15.q
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            a.z1x.P(r0)
            goto L85
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L33:
            int r12 = r15.l
            long r10 = r15.j
            boolean r9 = r15.k
            long r7 = r15.i
            java.util.List r14 = r15.n
            java.util.List r13 = r15.m
            a.z1x.P(r0)     // Catch: a.zhi0 -> L43
            goto L85
        L43:
            r0 = move-exception
            goto L5d
        L45:
            a.z1x.P(r0)
            r15.m = r13     // Catch: a.zhi0 -> L43
            r15.n = r14     // Catch: a.zhi0 -> L43
            r15.i = r7     // Catch: a.zhi0 -> L43
            r15.k = r9     // Catch: a.zhi0 -> L43
            r15.j = r10     // Catch: a.zhi0 -> L43
            r15.l = r12     // Catch: a.zhi0 -> L43
            r15.q = r4     // Catch: a.zhi0 -> L43
            java.lang.Object r6 = r6.d(r7, r9, r10, r12, r13, r14, r15)     // Catch: a.zhi0 -> L43
            if (r6 != r1) goto L85
            goto L84
        L5d:
            a.kuw r2 = r0.c
            a.i2o r4 = a.i2o.IncorrectDataError
            if (r2 != r4) goto L88
            java.lang.Object r0 = r6.f8305a
            a.gst0 r0 = (a.gst0) r0
            if (r9 == 0) goto L6d
            r0.j()
            goto L70
        L6d:
            r0.i()
        L70:
            r15.m = r5
            r15.n = r5
            r15.i = r7
            r15.k = r9
            r15.j = r10
            r15.l = r12
            r15.q = r3
            java.lang.Object r6 = r6.d(r7, r9, r10, r12, r13, r14, r15)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es.s(long, boolean, long, int, java.util.List, java.util.List, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(zje zjeVar) {
        vyb vybVar;
        if (zjeVar instanceof vyb) {
            vybVar = (vyb) zjeVar;
            int i = vybVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vybVar.k = i - Integer.MIN_VALUE;
            } else {
                vybVar = new vyb(this, zjeVar);
            }
        } else {
            vybVar = new vyb(this, zjeVar);
        }
        Object objB = vybVar.i;
        Object obj = wne.f39444a;
        int i2 = vybVar.k;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objB);
            boolean zA = ((ort) this.c).f25751a.a();
            if (zA) {
                ahu ahuVar = (ahu) this.f8305a;
                xru xruVar = (xru) this.b;
                bm5 bm5Var = bm5.e;
                if (xruVar.f41388a.p(bm5Var) <= 0) {
                    bm5Var = bm5.f2822a;
                }
                vybVar.k = 1;
                objB = ahuVar.b(bm5Var, vybVar);
                if (objB == obj) {
                    return obj;
                }
            } else if (zA) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objB);
        txs0 txs0Var = ((ql5) objB).i;
        if (txs0Var == txs0.e || txs0Var == txs0.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (r0 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0134, code lost:
    
        if (r1 == r2) goto L57;
     */
    /* JADX WARN: Type inference failed for: r14v5, types: [a.tnp0, a.yje] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(a.tnp0 r21, a.yje r22) throws a.n7p {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es.u(a.tnp0, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object v(List list, cne0 cne0Var, ynb0 ynb0Var, int i, boolean z, boolean z2, zje zjeVar) {
        cqt cqtVar;
        bwl bwlVar;
        List listL0;
        cne0 cne0Var2;
        boolean z3;
        ynb0 ynb0Var2;
        boolean z4;
        Object obj;
        int i2;
        int i3 = i;
        if (zjeVar instanceof cqt) {
            cqtVar = (cqt) zjeVar;
            int i4 = cqtVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cqtVar.s = i4 - Integer.MIN_VALUE;
            } else {
                cqtVar = new cqt(this, zjeVar);
            }
        } else {
            cqtVar = new cqt(this, zjeVar);
        }
        Object obj2 = cqtVar.q;
        wne wneVar = wne.f39444a;
        int i5 = cqtVar.s;
        if (i5 == 0) {
            z1x.P(obj2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : linkedHashSet) {
                if (obj3 instanceof s1q) {
                    arrayList.add(obj3);
                }
            }
            s1q s1qVar = (s1q) CollectionsKt.firstOrNull(arrayList);
            if (s1qVar != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                String strG = wxs0.g(jCurrentTimeMillis, s1qVar.b);
                linkedHashSet.remove(s1qVar);
                linkedHashSet.add(new t1q(jCurrentTimeMillis));
                linkedHashSet.add(new s1q(strG, s1qVar.f31470a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof j1q) {
                    arrayList2.add(obj4);
                }
            }
            ((l1f0) ((pmi0) this.b).f27236a).f19249a.getClass();
            bwlVar = (bwl) this.f8305a;
            listL0 = CollectionsKt.L0(linkedHashSet);
            umt umtVar = (umt) this.c;
            cqtVar.i = bwlVar;
            cqtVar.j = listL0;
            cqtVar.k = cne0Var;
            cqtVar.l = ynb0Var;
            cqtVar.m = i3;
            cqtVar.o = z;
            cqtVar.p = z2;
            cqtVar.n = i3;
            cqtVar.s = 1;
            Object objA = umtVar.a(cqtVar);
            if (objA != wneVar) {
                cne0Var2 = cne0Var;
                z3 = z2;
                ynb0Var2 = ynb0Var;
                z4 = z;
                obj = objA;
                i2 = i3;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                z1x.P(obj2);
                return obj2;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = cqtVar.n;
        boolean z5 = cqtVar.p;
        z4 = cqtVar.o;
        int i6 = cqtVar.m;
        ynb0Var2 = cqtVar.l;
        cne0Var2 = cqtVar.k;
        listL0 = cqtVar.j;
        bwlVar = cqtVar.i;
        z1x.P(obj2);
        z3 = z5;
        i3 = i6;
        obj = obj2;
        cqtVar.i = null;
        cqtVar.j = null;
        cqtVar.k = null;
        cqtVar.l = null;
        cqtVar.m = i3;
        cqtVar.o = z4;
        cqtVar.p = z3;
        cqtVar.s = 2;
        y1f0 y1f0Var = (y1f0) bwlVar.f3330a;
        y1f0Var.getClass();
        Object objD0 = qjj.d0(y1f0Var.b.b, new w1f0(z3, y1f0Var, (String) obj, efx.R(listL0, cne0Var2, i2, q7f0.FULL, z4), ynb0Var2, null, (byte) 0), cqtVar);
        return objD0 == wneVar ? wneVar : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7.B(r5, r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(long[] r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.xp
            if (r0 == 0) goto L13
            r0 = r9
            a.xp r0 = (a.xp) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.xp r0 = new a.xp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L6c
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L31:
            long[] r8 = r0.i
            a.z1x.P(r9)
            goto L4b
        L37:
            a.z1x.P(r9)
            java.lang.Object r9 = r7.b
            a.khf0 r9 = (a.khf0) r9
            a.bm5 r2 = a.bm5.c
            r0.i = r8
            r0.l = r5
            java.io.Serializable r9 = a.khf0.G(r9, r2, r0)
            if (r9 != r1) goto L4b
            goto L6b
        L4b:
            a.ql5 r9 = (a.ql5) r9
            java.lang.Object r2 = r7.c
            a.trm0 r2 = (a.trm0) r2
            a.bm5 r5 = a.bm5.c
            r2.l(r5, r9)
            java.lang.Object r7 = r7.f8305a
            a.h03 r7 = (a.h03) r7
            long r5 = r9.f28916a
            int r9 = r8.length
            long[] r8 = java.util.Arrays.copyOf(r8, r9)
            r0.i = r3
            r0.l = r4
            java.lang.Object r7 = r7.B(r5, r8, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es.w(long[], a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|95|25|103|26|27|101|28|29|99|30|31|97|32|33|(1:113)(1:36)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:(2:13|88)(2:14|15))(2:16|111))(4:17|105|18|19)|107|37|38|109|39|40|41) */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x016a  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x026e  */
    /* JADX WARN: Code duplicated, block: B:64:0x028a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0291  */
    /* JADX WARN: Code duplicated, block: B:67:0x0293  */
    /* JADX WARN: Code duplicated, block: B:70:0x0298  */
    /* JADX WARN: Code duplicated, block: B:72:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0318  */
    /* JADX WARN: Code duplicated, block: B:78:0x0327  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0330  */
    /* JADX WARN: Code duplicated, block: B:81:0x0332  */
    /* JADX WARN: Code duplicated, block: B:84:0x0337  */
    /* JADX WARN: Code duplicated, block: B:87:0x036f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0398  */
    /* JADX WARN: Code duplicated, block: B:90:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x03eb  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
    
        r3 = r30;
        r8 = r31;
        r9 = r32;
        r18 = r33;
        r23 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
    
        r2 = r7;
        r29 = r10;
        r7 = r3;
        r10 = r4;
        r3 = r19;
        r4 = r0;
        r0 = r12;
        r24 = r21;
        r21 = r1;
        r1 = r15;
        r14 = r13;
        r12 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fb, code lost:
    
        r24 = r23;
        r23 = r3;
        r3 = r18;
        r18 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0204, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0205, code lost:
    
        r15 = r30;
        r5 = r31;
        r18 = r33;
        r3 = r35;
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0215, code lost:
    
        r2 = r3;
        r3 = r15;
        r1 = r29;
        r29 = r10;
        r14 = r13;
        r10 = r4;
        r4 = r0;
        r0 = r12;
        r12 = r18;
        r18 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0225, code lost:
    
        r29 = r15;
        r15 = r3;
        r3 = r29;
        r29 = r1;
        r18 = r5;
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0235, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0236, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023d, code lost:
    
        r18 = r5;
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0245, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0246, code lost:
    
        r3 = r15;
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0251, code lost:
    
        r29 = r15;
        r15 = r3;
        r3 = r29;
        r29 = r19;
        r4 = r20;
        r18 = r5;
        r5 = r1;
        r21 = r21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x026e -> B:23:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02f3 -> B:23:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x036f -> B:88:0x0381). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0398 -> B:23:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x03bf -> B:23:0x0168). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r29, int r31, long r32, boolean r34, boolean r35, boolean r36, java.util.Map r37, java.util.LinkedHashMap r38, a.zje r39) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es.x(long, int, long, boolean, boolean, boolean, java.util.Map, java.util.LinkedHashMap, a.zje):java.lang.Object");
    }

    public /* synthetic */ es(Object obj, Object obj2, Object obj3) {
        this.f8305a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public es(ehf0 ehf0Var, btt0 btt0Var, knf0 knf0Var) {
        btt0Var.getClass();
        knf0Var.getClass();
        this.f8305a = ehf0Var;
        this.b = btt0Var;
        this.c = knf0Var;
    }

    public es(String str) {
        iun iunVar = iun.f15405a;
        iunVar.getClass();
        this.f8305a = str;
        this.b = iunVar;
    }
}
