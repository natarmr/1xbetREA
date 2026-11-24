package a;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.javax.sip.message.Request;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.onexdatabase.OnexDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class jrs0 implements da60 {
    public static final String[] k = {"INSERT", Request.UPDATE, "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17020a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public jrs0(OnexDatabase_Impl onexDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z) {
        String lowerCase;
        this.b = onexDatabase_Impl;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.f17020a = z;
        this.i = new AtomicBoolean(false);
        this.j = new xal((byte) 3);
        this.e = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            ((LinkedHashMap) this.e).put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) ((LinkedHashMap) this.c).get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f = strArr2;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (((LinkedHashMap) this.e).containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.e;
                linkedHashMap3.put(lowerCase4, xp20.d(linkedHashMap3, lowerCase3));
            }
        }
        this.g = new be60(((String[]) this.f).length);
        this.h = new imb(((String[]) this.f).length);
    }

    public static wn00 c(mq80 mq80Var, long j, long j2) {
        vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
        enm0 enm0Var = mq80Var.d;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        return new wn00(vn00Var);
    }

    @Override // a.da60
    public void a(ca60 ca60Var) {
        c1 c1Var;
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        do {
            if (!it.hasNext()) {
                c1Var = null;
                break;
            }
            c1Var = (c1) it.next();
        } while (!c1Var.b.equals(ca60Var));
        if (c1Var != null) {
            ((CopyOnWriteArrayList) this.c).remove(c1Var);
        }
        synchronized (this.b) {
            try {
                if (this.f17020a && ((CopyOnWriteArrayList) this.c).isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f17020a = false;
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (((AtomicBoolean) this.i).compareAndSet(true, false)) {
                        c4m0 c4m0Var = (c4m0) this.h;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        this.h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.da60
    public void b(Executor executor, ca60 ca60Var) {
        List listUnmodifiableList;
        Throwable th;
        executor.getClass();
        ((CopyOnWriteArrayList) this.c).add(new c1(executor, ca60Var));
        synchronized (this.b) {
            try {
                if (!this.f17020a && !((CopyOnWriteArrayList) this.c).isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f17020a = true;
                    i();
                }
                listUnmodifiableList = Collections.unmodifiableList((List) this.d);
                th = (Throwable) this.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new b1(th, new c1(executor, ca60Var), listUnmodifiableList, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(iva0 iva0Var, zje zjeVar) {
        uqs0 uqs0Var;
        if (zjeVar instanceof uqs0) {
            uqs0Var = (uqs0) zjeVar;
            int i = uqs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqs0Var.l = i - Integer.MIN_VALUE;
            } else {
                uqs0Var = new uqs0(this, zjeVar);
            }
        } else {
            uqs0Var = new uqs0(this, zjeVar);
        }
        Object objA = uqs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = uqs0Var.l;
        yje yjeVar = null;
        int i3 = 2;
        if (i2 == 0) {
            z1x.P(objA);
            tri0 tri0Var = new tri0(i3, yjeVar, (byte) 23);
            uqs0Var.i = iva0Var;
            uqs0Var.l = 1;
            objA = iva0Var.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", tri0Var, uqs0Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) uqs0Var.i;
            z1x.P(objA);
            return set;
        }
        iva0Var = (iva0) uqs0Var.i;
        z1x.P(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            uqs0Var.i = set2;
            uqs0Var.l = 2;
            if (knm0.l(iva0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", uqs0Var) == wneVar) {
                return wneVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a A[PHI: r10
  0x008a: PHI (r10v4 a.qpg0) = (r10v3 a.qpg0), (r10v10 a.qpg0) binds: [B:33:0x0087, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (a.j0x.s(r10, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)") == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (a.j0x.s(r10, r11) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(a.qpg0 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jrs0.e(a.qpg0, a.zje):java.lang.Object");
    }

    public ig00 f() {
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            qjj.W((sje) this.g, null, null, new s980(this, tu9Var, null, (byte) 13), 3);
            tu9Var.f34540a = "FetchData for PipeCameraPresence0";
            return wu9Var;
        } catch (Exception e) {
            wu9Var.b(e);
            return wu9Var;
        }
    }

    public void g() {
        x0x.K(this.f17020a);
        Uri uri = (Uri) this.e;
        uri.getClass();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        hru hruVar = (hru) this.f;
        hruVar.getClass();
        xaw xawVar = (xaw) hruVar.f13549a;
        x0x.K(xawVar.k);
        for (Map.Entry entry : new TreeMap(wcf0.g("_HLS_pathway", xawVar.l, "_HLS_throughput", String.valueOf(xawVar.c.a()))).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri uriBuild = builderBuildUpon.build();
        uriBuild.getClass();
        mq80 mq80Var = new mq80(((viq) this.b).d(), new mbj(uriBuild, 1, null, map, 0L, -1L, 0), 8, new m6m0((byte) 2));
        lhf0 lhf0Var = (lhf0) this.j;
        lhf0Var.getClass();
        lhf0Var.J(mq80Var, (pmi0) this.c, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object h(zje zjeVar) throws Throwable {
        zqs0 zqs0Var;
        cu cuVar;
        Object value;
        int[] iArr;
        OnexDatabase_Impl onexDatabase_Impl = (OnexDatabase_Impl) this.b;
        if (zjeVar instanceof zqs0) {
            zqs0Var = (zqs0) zjeVar;
            int i = zqs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqs0Var.l = i - Integer.MIN_VALUE;
            } else {
                zqs0Var = new zqs0(this, zjeVar);
            }
        } else {
            zqs0Var = new zqs0(this, zjeVar);
        }
        Object obj = zqs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zqs0Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            cu cuVar2 = onexDatabase_Impl.e;
            if (!cuVar2.a()) {
                return xun.f41520a;
            }
            try {
                if (!((AtomicBoolean) this.i).compareAndSet(true, false)) {
                    xun xunVar = xun.f41520a;
                    cuVar2.s();
                    return xunVar;
                }
                if (!((Boolean) ((Function0) this.j).invoke()).booleanValue()) {
                    xun xunVar2 = xun.f41520a;
                    cuVar2.s();
                    return xunVar2;
                }
                wbl0 wbl0Var = new wbl0(this, yjeVar, (byte) 13);
                zqs0Var.i = cuVar2;
                zqs0Var.l = 1;
                Object objH = onexDatabase_Impl.h(false, wbl0Var, zqs0Var);
                if (objH == wneVar) {
                    return wneVar;
                }
                cuVar = cuVar2;
                obj = objH;
            } catch (Throwable th) {
                th = th;
                cuVar = cuVar2;
                cuVar.s();
                throw th;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cuVar = zqs0Var.i;
            try {
                z1x.P(obj);
            } catch (Throwable th2) {
                th = th2;
                cuVar.s();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            imb imbVar = (imb) this.h;
            set.getClass();
            if (!set.isEmpty()) {
                p7m0 p7m0Var = imbVar.f15016a;
                do {
                    value = p7m0Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!p7m0Var.m(value, iArr));
            }
        }
        cuVar.s();
        return set;
    }

    public void i() {
        byte b = 1;
        if (!((AtomicBoolean) this.i).compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        c4m0 c4m0Var = (c4m0) this.h;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        this.h = slb.U(new dnq(new fnq(new wk30((gmq) this.f, (byte) 16), new w090((Object) this, (Serializable) hie0Var, yjeVar, (byte) 24), (byte) 4), new qos((Object) this, yjeVar, (byte) 29), b), (sje) this.g);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (a.knm0.l(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (a.knm0.l(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c9 -> B:28:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.fhs0 r18, int r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jrs0.j(a.fhs0, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object k(a.fhs0 r9, int r10, a.zje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.ers0
            if (r0 == 0) goto L13
            r0 = r11
            a.ers0 r0 = (a.ers0) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.ers0 r0 = new a.ers0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.n
            a.wne r1 = a.wne.f39444a
            int r2 = r0.p
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            int r8 = r0.m
            int r9 = r0.l
            java.lang.String[] r10 = r0.k
            java.lang.String r2 = r0.j
            a.iva0 r4 = r0.i
            a.z1x.P(r11)
            r11 = r10
            r10 = r4
            goto L75
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L3a:
            a.z1x.P(r11)
            java.lang.Object r8 = r8.f
            java.lang.String[] r8 = (java.lang.String[]) r8
            r8 = r8[r10]
            java.lang.String[] r10 = a.jrs0.k
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4e:
            if (r9 >= r8) goto L77
            r4 = r11[r9]
            java.lang.String r5 = "room_table_modification_trigger_"
            java.lang.String r6 = "_"
            java.lang.String r4 = a.ua80.i(r5, r2, r6, r4)
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            java.lang.String r6 = "`"
            java.lang.String r4 = a.kng0.l(r5, r4, r6)
            r0.i = r10
            r0.j = r2
            r0.k = r11
            r0.l = r9
            r0.m = r8
            r0.p = r3
            java.lang.Object r4 = a.knm0.l(r10, r4, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            int r9 = r9 + r3
            goto L4e
        L77:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jrs0.k(a.fhs0, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object l(zje zjeVar) throws Throwable {
        grs0 grs0Var;
        Throwable th;
        cu cuVar;
        OnexDatabase_Impl onexDatabase_Impl = (OnexDatabase_Impl) this.b;
        if (zjeVar instanceof grs0) {
            grs0Var = (grs0) zjeVar;
            int i = grs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                grs0Var.l = i - Integer.MIN_VALUE;
            } else {
                grs0Var = new grs0(this, zjeVar);
            }
        } else {
            grs0Var = new grs0(this, zjeVar);
        }
        Object obj = grs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = grs0Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            cu cuVar2 = onexDatabase_Impl.e;
            if (cuVar2.a()) {
                try {
                    kv kvVar = new kv(this, yjeVar, (byte) 22);
                    grs0Var.i = cuVar2;
                    grs0Var.l = 1;
                    if (onexDatabase_Impl.h(false, kvVar, grs0Var) == wneVar) {
                        return wneVar;
                    }
                    cuVar = cuVar2;
                    cuVar.s();
                } catch (Throwable th2) {
                    th = th2;
                    cuVar = cuVar2;
                    cuVar.s();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cuVar = grs0Var.i;
            try {
                z1x.P(obj);
                cuVar.s();
            } catch (Throwable th3) {
                th = th3;
                cuVar.s();
                throw th;
            }
        }
        return Unit.f46060a;
    }

    public void m(Throwable th, List list) {
        byte b;
        boolean z;
        List list2;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.b) {
            b = 0;
            try {
                if (th != null) {
                    z = ((Throwable) this.e) == null || !((List) this.d).isEmpty();
                    this.e = th;
                    list2 = Collections.EMPTY_LIST;
                    this.d = list2;
                } else {
                    list.getClass();
                    boolean z2 = (((Throwable) this.e) == null && ((List) this.d).equals(list)) ? false : true;
                    this.e = null;
                    this.d = list;
                    z = z2;
                    list2 = list;
                }
                listUnmodifiableList = Collections.unmodifiableList(list2);
                th2 = (Throwable) this.e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(((CopyOnWriteArrayList) this.c).size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            for (c1 c1Var : (CopyOnWriteArrayList) this.c) {
                c1Var.f3548a.execute(new b1(th2, c1Var, listUnmodifiableList, b));
            }
        }
    }

    public jrs0(vae0 vae0Var, sje sjeVar, List list, Context context) {
        vae0Var.getClass();
        list.getClass();
        context.getClass();
        this.b = new Object();
        this.c = new CopyOnWriteArrayList();
        this.e = null;
        this.f17020a = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(xf0.H(str, null, null));
        }
        this.d = arrayList;
        this.f = vae0Var;
        this.g = sjeVar;
        this.i = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.j = (CameraManager) systemService;
    }

    public jrs0(viq viqVar) {
        this.b = viqVar;
        this.c = new pmi0(this);
        this.d = new q9o0(new Handler(vtt0.u(), null));
    }

    public jrs0(q0a q0aVar, qkj qkjVar, Handler handler) {
        this.f17020a = false;
        this.h = new Object();
        this.i = new mz4(this, (byte) 1);
        this.j = new yqc(this, (byte) 22);
        cvm0.q();
        this.b = q0aVar;
        this.e = qkjVar;
        this.f = handler;
    }
}
