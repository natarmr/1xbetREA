package a;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.javax.sip.message.Request;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class krs0 {
    public static final String[] l = {"INSERT", Request.UPDATE, "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18784a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public krs0(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, n5w n5wVar) {
        String lowerCase;
        this.b = workDatabase_Impl;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.f18784a = z;
        this.f = n5wVar;
        this.j = new AtomicBoolean(false);
        this.k = new zxb((byte) 28);
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
        this.g = strArr2;
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
        int length2 = ((String[]) this.g).length;
        o24 o24Var = new o24();
        o24Var.b = new ReentrantLock();
        o24Var.c = new long[length2];
        o24Var.d = new boolean[length2];
        this.h = o24Var;
        this.i = new s2g(((String[]) this.g).length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(jva0 jva0Var, zje zjeVar) {
        vqs0 vqs0Var;
        if (zjeVar instanceof vqs0) {
            vqs0Var = (vqs0) zjeVar;
            int i = vqs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqs0Var.l = i - Integer.MIN_VALUE;
            } else {
                vqs0Var = new vqs0(this, zjeVar);
            }
        } else {
            vqs0Var = new vqs0(this, zjeVar);
        }
        Object objB = vqs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vqs0Var.l;
        if (i2 == 0) {
            z1x.P(objB);
            g4s0 g4s0Var = new g4s0((byte) 25);
            vqs0Var.i = jva0Var;
            vqs0Var.l = 1;
            objB = jva0Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", g4s0Var, vqs0Var);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) vqs0Var.i;
            z1x.P(objB);
            return set;
        }
        jva0Var = (jva0) vqs0Var.i;
        z1x.P(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            vqs0Var.i = set2;
            vqs0Var.l = 2;
            if (xnm0.i(jva0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", vqs0Var) == wneVar) {
                return wneVar;
            }
        }
        return set2;
    }

    public List b() {
        o24 o24Var;
        Spatializer spatializer;
        int i = Build.VERSION.SDK_INT;
        if (i < 32 || (o24Var = (o24) this.h) == null) {
            v3x v3xVar = b4x.b;
            return rcf0.e;
        }
        Spatializer spatializer2 = (Spatializer) o24Var.b;
        if (spatializer2 == null || !o24Var.f24513a || !spatializer2.isAvailable() || (spatializer = (Spatializer) o24Var.b) == null || !spatializer.isEnabled()) {
            v3x v3xVar2 = b4x.b;
            return rcf0.e;
        }
        if (i < 36) {
            return b4x.t(252);
        }
        Spatializer spatializer3 = (Spatializer) o24Var.b;
        spatializer3.getClass();
        return b7.d(spatializer3).getSpatializedChannelMasks();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x0087, B:37:0x0092, B:50:0x00ca, B:40:0x00a0, B:41:0x00a2, B:43:0x00af, B:45:0x00b9, B:47:0x00bf, B:46:0x00bd, B:48:0x00c4, B:20:0x0049, B:22:0x0053, B:27:0x005f, B:29:0x006f, B:32:0x0075), top: B:59:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x0087, B:37:0x0092, B:50:0x00ca, B:40:0x00a0, B:41:0x00a2, B:43:0x00af, B:45:0x00b9, B:47:0x00bf, B:46:0x00bd, B:48:0x00c4, B:20:0x0049, B:22:0x0053, B:27:0x005f, B:29:0x006f, B:32:0x0075), top: B:59:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x0087, B:37:0x0092, B:50:0x00ca, B:40:0x00a0, B:41:0x00a2, B:43:0x00af, B:45:0x00b9, B:47:0x00bf, B:46:0x00bd, B:48:0x00c4, B:20:0x0049, B:22:0x0053, B:27:0x005f, B:29:0x006f, B:32:0x0075), top: B:59:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x0087, B:37:0x0092, B:50:0x00ca, B:40:0x00a0, B:41:0x00a2, B:43:0x00af, B:45:0x00b9, B:47:0x00bf, B:46:0x00bd, B:48:0x00c4, B:20:0x0049, B:22:0x0053, B:27:0x005f, B:29:0x006f, B:32:0x0075), top: B:59:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x0087, B:37:0x0092, B:50:0x00ca, B:40:0x00a0, B:41:0x00a2, B:43:0x00af, B:45:0x00b9, B:47:0x00bf, B:46:0x00bd, B:48:0x00c4, B:20:0x0049, B:22:0x0053, B:27:0x005f, B:29:0x006f, B:32:0x0075), top: B:59:0x0049 }] */
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
    public Object c(zje zjeVar) throws Throwable {
        ars0 ars0Var;
        yzn0 yzn0Var;
        Throwable th;
        yzn0 yzn0Var2;
        Object objR;
        Set set;
        s2g s2gVar;
        p7m0 p7m0Var;
        Object value;
        int[] iArr;
        int length;
        int[] iArr2;
        int i;
        int i2;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        if (zjeVar instanceof ars0) {
            ars0Var = (ars0) zjeVar;
            int i3 = ars0Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ars0Var.m = i3 - Integer.MIN_VALUE;
            } else {
                ars0Var = new ars0(this, zjeVar);
            }
        } else {
            ars0Var = new ars0(this, zjeVar);
        }
        Object obj = ars0Var.k;
        wne wneVar = wne.f39444a;
        int i4 = ars0Var.m;
        yje yjeVar = null;
        byte b = 0;
        if (i4 != 0) {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yzn0Var2 = ars0Var.j;
            krs0 krs0Var = ars0Var.i;
            try {
                z1x.P(obj);
                yzn0Var = yzn0Var2;
                this = krs0Var;
                objR = obj;
                set = (Set) objR;
                if (!set.isEmpty()) {
                    s2gVar = (s2g) this.i;
                    set.getClass();
                    if (set.isEmpty()) {
                        p7m0Var = s2gVar.f31500a;
                        do {
                            value = p7m0Var.getValue();
                            iArr = (int[]) value;
                            length = iArr.length;
                            iArr2 = new int[length];
                            for (i = 0; i < length; i++) {
                                if (set.contains(Integer.valueOf(i))) {
                                    i2 = iArr[i] + 1;
                                } else {
                                    i2 = iArr[i];
                                }
                                iArr2[i] = i2;
                            }
                        } while (!p7m0Var.m(value, iArr2));
                    }
                    ((n5w) this.f).invoke(set);
                }
                yzn0Var.w();
                return set;
            } catch (Throwable th2) {
                th = th2;
                yzn0Var2.w();
                throw th;
            }
        }
        z1x.P(obj);
        yzn0Var = workDatabase_Impl.g;
        if (!yzn0Var.a()) {
            return xun.f41520a;
        }
        try {
            if (!((AtomicBoolean) this.j).compareAndSet(true, false)) {
                xun xunVar = xun.f41520a;
                yzn0Var.w();
                return xunVar;
            }
            if (!((Boolean) ((Function0) this.k).invoke()).booleanValue()) {
                xun xunVar2 = xun.f41520a;
                yzn0Var.w();
                return xunVar2;
            }
            brs0 brs0Var = new brs0(this, yjeVar, b);
            ars0Var.i = this;
            ars0Var.j = yzn0Var;
            ars0Var.m = 1;
            objR = workDatabase_Impl.r(false, brs0Var, ars0Var);
            if (objR == wneVar) {
                return wneVar;
            }
            set = (Set) objR;
            if (!set.isEmpty()) {
                s2gVar = (s2g) this.i;
                set.getClass();
                if (set.isEmpty()) {
                    p7m0Var = s2gVar.f31500a;
                    do {
                        value = p7m0Var.getValue();
                        iArr = (int[]) value;
                        length = iArr.length;
                        iArr2 = new int[length];
                        while (i < length) {
                            if (set.contains(Integer.valueOf(i))) {
                                i2 = iArr[i] + 1;
                            } else {
                                i2 = iArr[i];
                            }
                            iArr2[i] = i2;
                        }
                    } while (!p7m0Var.m(value, iArr2));
                }
                ((n5w) this.f).invoke(set);
            }
            yzn0Var.w();
            return set;
        } catch (Throwable th3) {
            th = th3;
            yzn0Var2 = yzn0Var;
            yzn0Var2.w();
            throw th;
        }
    }

    public void d(q24 q24Var) {
        if (!this.f18784a || q24Var.equals((q24) this.i)) {
            return;
        }
        this.i = q24Var;
        n44 n44Var = (n44) ((gne) this.c).b;
        n44Var.f();
        q24 q24Var2 = n44Var.g;
        if (q24Var2 == null || q24Var.equals(q24Var2)) {
            return;
        }
        n44Var.g = q24Var;
        vg00 vg00Var = n44Var.e;
        if (vg00Var != null) {
            vg00Var.e(-1, new jf4((byte) 20));
        }
    }

    public b1x e(s45 s45Var) throws Exception {
        n45 n45VarL;
        l8x.U("ProcessingNode", "processInMemoryCapture: request ID = " + s45Var.f31589a.f6936a);
        dzb0 dzb0Var = s45Var.f31589a;
        n45 n45Var = (n45) ((xi70) this.d).b(s45Var);
        ArrayList arrayList = ((r45) this.c).d;
        z1x.u(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((n45Var.c == 35 || this.f18784a) && iIntValue == 256) {
            hnu hnuVar = (hnu) this.e;
            z35 z35Var = new z35(n45Var, dzb0Var.e);
            hnuVar.getClass();
            try {
                Object obj = n45Var.f22883a;
                int i = n45Var.c;
                if (i != 35) {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i);
                    }
                    n45VarL = hnuVar.k(z35Var, i);
                } else {
                    n45VarL = hnu.l(z35Var);
                }
                ((b1x) obj).close();
                ((gst) this.i).getClass();
                ibe0 ibe0Var = new ibe0(g1x.r(n45VarL.d.getWidth(), n45VarL.d.getHeight(), 256, 2));
                b1x b1xVarA = ImageProcessingUtil.a(ibe0Var, (byte[]) n45VarL.f22883a);
                ibe0Var.e();
                Objects.requireNonNull(b1xVarA);
                fko fkoVar = n45VarL.b;
                Objects.requireNonNull(fkoVar);
                Rect rect = n45VarL.e;
                int i2 = n45VarL.f;
                Matrix matrix = n45VarL.g;
                cy9 cy9Var = n45VarL.h;
                jwq jwqVar = (jwq) b1xVarA;
                Size size = new Size(jwqVar.j(), jwqVar.f());
                jwqVar.getFormat();
                n45Var = new n45(b1xVarA, fkoVar, jwqVar.getFormat(), size, rect, i2, matrix, cy9Var);
            } catch (Throwable th) {
                ((b1x) n45Var.f22883a).close();
                throw th;
            }
        }
        ((rqt) this.h).getClass();
        b1x b1xVar = (b1x) n45Var.f22883a;
        gui0 gui0Var = new gui0(b1xVar, n45Var.d, new a45(b1xVar.K0().f(), b1xVar.K0().h(), n45Var.f, n45Var.g, b1xVar.K0().c()));
        Rect rect2 = new Rect(n45Var.e);
        if (!rect2.intersect(0, 0, gui0Var.g, gui0Var.h)) {
            rect2.setEmpty();
        }
        synchronized (gui0Var.d) {
            gui0Var.f = rect2;
        }
        if (arrayList.size() > 1) {
            dzb0Var.b.b(gui0Var.getFormat());
        }
        return gui0Var;
    }

    public void f(Function0 function0, Function0 function1) {
        function0.getClass();
        function1.getClass();
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            function0.invoke();
            qjj.W(((WorkDatabase_Impl) this.b).f(), new rne("Room Invalidation Tracker Refresh"), null, new meq0((Object) this, (Object) function1, (yje) null, (byte) 25), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (a.xnm0.i(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        if (a.xnm0.i(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00dd -> B:28:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(a.ghs0 r18, int r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.krs0.g(a.ghs0, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object h(a.ghs0 r9, int r10, a.zje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.frs0
            if (r0 == 0) goto L13
            r0 = r11
            a.frs0 r0 = (a.frs0) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.frs0 r0 = new a.frs0
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
            a.jva0 r4 = r0.i
            a.z1x.P(r11)
            r11 = r10
            r10 = r4
            goto L83
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L3a:
            a.z1x.P(r11)
            java.lang.Object r8 = r8.g
            java.lang.String[] r8 = (java.lang.String[]) r8
            r8 = r8[r10]
            java.lang.String[] r10 = a.krs0.l
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
            if (r9 >= r8) goto L85
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = a.hne.l(r6, r5, r4)
            r0.i = r10
            r0.j = r2
            r0.k = r11
            r0.l = r9
            r0.m = r8
            r0.p = r3
            java.lang.Object r4 = a.xnm0.i(r10, r4, r0)
            if (r4 != r1) goto L83
            return r1
        L83:
            int r9 = r9 + r3
            goto L4e
        L85:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.krs0.h(a.ghs0, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(zje zjeVar) throws Throwable {
        hrs0 hrs0Var;
        Throwable th;
        yzn0 yzn0Var;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        if (zjeVar instanceof hrs0) {
            hrs0Var = (hrs0) zjeVar;
            int i = hrs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrs0Var.l = i - Integer.MIN_VALUE;
            } else {
                hrs0Var = new hrs0(this, zjeVar);
            }
        } else {
            hrs0Var = new hrs0(this, zjeVar);
        }
        Object obj = hrs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = hrs0Var.l;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            yzn0 yzn0Var2 = workDatabase_Impl.g;
            if (yzn0Var2.a()) {
                try {
                    brs0 brs0Var = new brs0(this, yjeVar, b);
                    hrs0Var.i = yzn0Var2;
                    hrs0Var.l = 1;
                    if (workDatabase_Impl.r(false, brs0Var, hrs0Var) == wneVar) {
                        return wneVar;
                    }
                    yzn0Var = yzn0Var2;
                    yzn0Var.w();
                } catch (Throwable th2) {
                    th = th2;
                    yzn0Var = yzn0Var2;
                    yzn0Var.w();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yzn0Var = hrs0Var.i;
            try {
                z1x.P(obj);
                yzn0Var.w();
            } catch (Throwable th3) {
                th = th3;
                yzn0Var.w();
                throw th;
            }
        }
        return Unit.f46060a;
    }

    public void j() {
        List listB = b();
        Context context = (Context) this.b;
        m24 m24Var = (m24) this.k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.j;
        rcf0 rcf0Var = q24.e;
        d(q24.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), m24Var, audioDeviceInfo, listB));
    }

    public Pair k(String[] strArr) {
        yni0 yni0Var = new yni0();
        for (String str : strArr) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                yni0Var.addAll(set);
            } else {
                yni0Var.add(str);
            }
        }
        String[] strArr2 = (String[]) cui0.a(yni0Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.e;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                jf4.o("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }

    public krs0(Context context, gne gneVar, m24 m24Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = gneVar;
        this.k = m24Var;
        this.j = audioDeviceInfo;
        Handler handler = new Handler(vtt0.u(), null);
        this.d = handler;
        this.e = new r24(this);
        this.f = new md3(this, (byte) 1);
        rcf0 rcf0Var = q24.e;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new s24(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public krs0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        kpd0 kpd0Var = khk.f18297a;
        if (khk.f18297a.b(LowMemoryQuirk.class) != null) {
            this.b = new rgi0(executor);
        } else {
            this.b = executor;
        }
        this.k = kpd0Var;
        this.f18784a = kpd0Var.a(IncorrectJpegMetadataQuirk.class);
    }
}
