package a;

import android.app.ActivityManager;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mkg implements n5d0 {
    public static zoq0 A() {
        return new zoq0();
    }

    public static gzq0 B(mne mneVar) {
        return new gzq0(mneVar);
    }

    public static s5r0 C(mne mneVar) {
        return new s5r0(mneVar);
    }

    public static p2v0 D() {
        return new p2v0();
    }

    public static l6a a() {
        return new l6a();
    }

    public static o0j b() {
        return new o0j();
    }

    public static tj60 c(q7d0 q7d0Var) {
        q7d0Var.getClass();
        return new tj60(q7d0Var);
    }

    public static my60 d() {
        my60 my60Var = new my60();
        my60Var.b = qg40.c;
        return my60Var;
    }

    public static uwb0 e(us00 us00Var) {
        String packageName = us00Var.getPackageName();
        packageName.getClass();
        return new uwb0(us00Var, packageName);
    }

    public static xep f(q7d0 q7d0Var) {
        q7d0Var.getClass();
        return new xep(q7d0Var);
    }

    public static fq g(sek sekVar, lzt lztVar, zmi0 zmi0Var, pbt pbtVar, xyb xybVar, yyb yybVar, fpi0 fpi0Var, nqt nqtVar, spx spxVar, oqt oqtVar, hni0 hni0Var, vcu vcuVar, d3c d3cVar, wni0 wni0Var, ztt zttVar, pqt pqtVar, itt ittVar, q78 q78Var, gmt gmtVar, ecs ecsVar) {
        sekVar.getClass();
        lztVar.getClass();
        zmi0Var.getClass();
        xybVar.getClass();
        yybVar.getClass();
        fpi0Var.getClass();
        nqtVar.getClass();
        spxVar.getClass();
        oqtVar.getClass();
        hni0Var.getClass();
        vcuVar.getClass();
        d3cVar.getClass();
        wni0Var.getClass();
        zttVar.getClass();
        pqtVar.getClass();
        ittVar.getClass();
        q78Var.getClass();
        gmtVar.getClass();
        ecsVar.getClass();
        return new fq(lztVar, zmi0Var, pbtVar, xybVar, yybVar, fpi0Var, nqtVar, spxVar, oqtVar, hni0Var, vcuVar, d3cVar, wni0Var, zttVar, pqtVar, ittVar, q78Var, gmtVar, ecsVar);
    }

    public static c49 h() {
        return new c49();
    }

    public static ppb i(sek sekVar, l1u l1uVar, qni0 qni0Var, itt ittVar, pbt pbtVar) {
        sekVar.getClass();
        l1uVar.getClass();
        qni0Var.getClass();
        ittVar.getClass();
        return new ppb(l1uVar, qni0Var, ittVar, pbtVar);
    }

    public static phj j(us00 us00Var, vby vbyVar, mne mneVar) {
        vbyVar.getClass();
        return new phj(us00Var, vbyVar, mneVar);
    }

    public static shk k(sek sekVar, us00 us00Var, tkz tkzVar) {
        return new shk(new Configuration(us00Var.getResources().getConfiguration()), us00Var.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"), tkzVar);
    }

    public static ewk l(sek sekVar, shk shkVar) {
        shkVar.getClass();
        return new ewk(shkVar);
    }

    public static fwk m(sek sekVar, shk shkVar) {
        shkVar.getClass();
        return new fwk(shkVar);
    }

    public static s1p n(d1p d1pVar) {
        d1pVar.getClass();
        s1p s1pVarO0 = d1pVar.o0();
        x1x.y(s1pVarO0);
        return s1pVarO0;
    }

    public static q6q o() {
        return new q6q();
    }

    public static zsr p(ivn ivnVar) {
        return ((v5i) ivnVar.f15453a).e();
    }

    public static dev q() {
        return new dev();
    }

    public static lxv r(mne mneVar) {
        return new lxv(mneVar);
    }

    public static es00 s() {
        return new es00();
    }

    public static eb50 t() {
        return new eb50();
    }

    public static OnexDatabase u(us00 us00Var) {
        String name;
        boolean zContainsKey;
        OnexDatabase onexDatabase;
        dg40[] dg40VarArr = OnexDatabase.j;
        OnexDatabase onexDatabase2 = null;
        if (StringsKt.W("onexdatabase.name")) {
            jf4.o("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        xdg0 xdg0Var = xdg0.f40691a;
        ajc ajcVar = new ajc((byte) 2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        sgy sgyVarB = sre0.f32672a.b(OnexDatabase.class);
        dg40[] dg40VarArr2 = (dg40[]) Arrays.copyOf(OnexDatabase.j, 45);
        final byte b = 0;
        for (dg40 dg40Var : dg40VarArr2) {
            linkedHashSet2.add(Integer.valueOf(dg40Var.f6030a));
            linkedHashSet2.add(Integer.valueOf(dg40Var.b));
        }
        for (dg40 dg40Var2 : (dg40[]) Arrays.copyOf(dg40VarArr2, dg40VarArr2.length)) {
            ajcVar.b(dg40Var2);
        }
        if (!linkedHashSet2.isEmpty()) {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    c99.s(twn.m(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        q13 q13Var = new q13();
        xdg0 xdg0Var2 = xdg0.f40691a;
        Object systemService = us00Var.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        xdg0 xdg0Var3 = (activityManager == null || !activityManager.isLowRamDevice()) ? xdg0.b : xdg0.f40691a;
        u1e ox40Var = xdg0Var3 == xdg0.f40691a ? p0k0.f26156a : new ox40();
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        pwi pwiVar = new pwi(us00Var, ajcVar, arrayList, xdg0Var3, linkedHashSet, arrayList2, arrayList3, arrayList4, q13Var, dvjVar, ox40Var);
        Class clsG = azw.G(sgyVarB);
        Package r0 = clsG.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsG.getCanonicalName();
        canonicalName.getClass();
        final byte b2 = 1;
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + Separators.DOT + strConcat, true, clsG.getClassLoader());
            cls.getClass();
            final zdg0 zdg0Var = (zdg0) cls.getDeclaredConstructor(null).newInstance(null);
            zdg0Var.getClass();
            zdg0Var.i = true;
            ke70 ke70VarC = zdg0Var.c();
            ke70VarC.getClass();
            zdg0Var.c = new tdg0(pwiVar, ke70VarC, new due0(2, zdg0Var, ccq0.class, "withTransactionContext", "withTransactionContext(Landroidx/room3/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 11));
            zdg0Var.d = zdg0Var.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setE = zdg0Var.e();
            int size = arrayList4.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setE.iterator();
            while (true) {
                int i = -1;
                if (!it2.hasNext()) {
                    OnexDatabase onexDatabase3 = onexDatabase2;
                    int size2 = arrayList4.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                jf4.o("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return onexDatabase3;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    for (dg40 dg40Var3 : zdg0Var.a(linkedHashMap)) {
                        byte b3 = dg40Var3.f6030a;
                        byte b4 = dg40Var3.b;
                        Integer numValueOf = Integer.valueOf(b3);
                        LinkedHashMap linkedHashMap2 = ajcVar.f967a;
                        if (linkedHashMap2.containsKey(numValueOf)) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(b3));
                            if (map == null) {
                                map = lun.f20680a;
                                map.getClass();
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(b4));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            ajcVar.b(dg40Var3);
                        }
                    }
                    u7x.L(zdg0Var.f(), (List) pwiVar.i, new vtf0((byte) 13), new wtf0((byte) 14), new Function2() { // from class: a.beg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b2;
                            zdg0 zdg0Var2 = zdg0Var;
                            sgy sgyVar = (sgy) obj;
                            switch (b5) {
                                case 0:
                                    sgyVar.getClass();
                                    obj2.getClass();
                                    zdg0Var2.h.put(sgyVar, obj2);
                                    break;
                                default:
                                    sgyVar.getClass();
                                    obj2.getClass();
                                    zdg0Var2.g.put(sgyVar, obj2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    u7x.L(zdg0Var.g(), (List) pwiVar.d, new vtf0((byte) 12), new wtf0((byte) 13), new Function2() { // from class: a.beg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b;
                            zdg0 zdg0Var2 = zdg0Var;
                            sgy sgyVar = (sgy) obj;
                            switch (b5) {
                                case 0:
                                    sgyVar.getClass();
                                    obj2.getClass();
                                    zdg0Var2.h.put(sgyVar, obj2);
                                    break;
                                default:
                                    sgyVar.getClass();
                                    obj2.getClass();
                                    zdg0Var2.g.put(sgyVar, obj2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    zdg0Var.f44213a = d5c.a(kotlin.coroutines.e.c(dvjVar, new kin0((bby) dvjVar.get(gqw0.o1))));
                    CoroutineContext.Element element = dvjVar.get(kotlin.coroutines.d.d1);
                    element.getClass();
                    zdg0Var.b = obb.I((lne) element);
                    return (OnexDatabase) zdg0Var;
                }
                sgy sgyVar = (sgy) it2.next();
                int size3 = arrayList4.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i3 = size3 - 1;
                        onexDatabase = onexDatabase2;
                        if (sgyVar.r(arrayList4.get(size3))) {
                            zArr[size3] = true;
                            i = size3;
                            break;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size3 = i3;
                        onexDatabase2 = onexDatabase;
                    }
                } else {
                    onexDatabase = onexDatabase2;
                }
                if (i < 0) {
                    sgyVar.getClass();
                    c99.s(kng0.l("A required auto migration spec (", sgyVar.v(), ") is missing in the database configuration."));
                    return onexDatabase;
                }
                linkedHashMap.put(sgyVar, arrayList4.get(i));
                onexDatabase2 = onexDatabase;
            }
        } catch (ClassNotFoundException e) {
            e9d0.m(b1j.k("Cannot find implementation for ", clsG.getCanonicalName(), ". ", strConcat, " does not exist. Is Room annotation processor correctly configured?"), e);
            return null;
        } catch (IllegalAccessException e2) {
            e9d0.m(kng0.k("Cannot access the constructor ", clsG.getCanonicalName()), e2);
            return null;
        } catch (InstantiationException e3) {
            e9d0.m(kng0.k("Failed to create an instance of ", clsG.getCanonicalName()), e3);
            return null;
        }
    }

    public static wwb0 v(us00 us00Var) {
        String packageName = us00Var.getPackageName();
        packageName.getClass();
        return new wwb0(us00Var, packageName);
    }

    public static ioe0 w() {
        return new ioe0();
    }

    public static OkHttpClient x() {
        return new OkHttpClient();
    }

    public static crq y() {
        return new crq();
    }

    public static ivp0 z() {
        ivp0 ivp0Var = new ivp0();
        ivp0Var.f15457a = "";
        return ivp0Var;
    }
}
