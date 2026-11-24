package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Trace;
import android.text.format.DateUtils;
import android.util.Range;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;

/* JADX INFO: loaded from: classes.dex */
public final class rrd implements e2a {
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30978a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public rrd(ArrayList arrayList, wju0 wju0Var, List list) {
        Object next;
        String strConcat;
        String str;
        String str2;
        boolean zF;
        this.f30978a = (byte) 22;
        Object obj = h55.h;
        obj.getClass();
        xun xunVar = xun.f41520a;
        iun iunVar = iun.f15405a;
        xunVar.getClass();
        iunVar.getClass();
        this.b = wju0Var;
        this.c = list;
        this.d = obj;
        this.e = xunVar;
        this.f = iunVar;
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
        this.g = listL0;
        this.h = new jhk((byte) 3);
        ScheduledExecutorService scheduledExecutorServiceT = j120.T();
        scheduledExecutorServiceT.getClass();
        this.i = scheduledExecutorServiceT;
        if (!obj.equals(obj)) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((fot0) it.next()).g.f(fpt0.I0)) {
                    jf4.o("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list2 = (List) this.f;
        Set set = (Set) this.e;
        if (set.isEmpty() && list2.isEmpty()) {
            return;
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(r3d.q(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((giv) it2.next()).a());
        }
        for (lhp lhpVar : CollectionsKt.L0(CollectionsKt.O0(arrayList2))) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : set2) {
                if (((giv) obj2).a() == lhpVar) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() > 1) {
                hny.v(arrayList3, "requiredFeatures has conflicting feature values: ");
                throw null;
            }
        }
        if (CollectionsKt.N(list2).size() != list2.size()) {
            ohq.i(41, "Duplicate values in preferredFeatures(", list2);
            throw null;
        }
        LinkedHashSet linkedHashSetZ = CollectionsKt.Z(set2, list2);
        if (!linkedHashSetZ.isEmpty()) {
            hny.v(linkedHashSetZ, "requiredFeatures and preferredFeatures have duplicate values: ");
            throw null;
        }
        for (fot0 fot0Var : (List) this.g) {
            upt0.b.getClass();
            if (sxs0.a(fot0Var) == upt0.h) {
                throw new IllegalArgumentException((fot0Var + " is not supported with feature group").toString());
            }
            String str3 = fot0Var instanceof oub0 ? "Preview" : fot0Var instanceof mzw ? "ImageCapture" : fot0Var instanceof jyw ? "ImageAnalysis" : qsm0.v(fot0Var) ? "VideoCapture" : "UseCase";
            Iterator it3 = lhp.f.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                upt0.b.getClass();
                int iOrdinal = ((lhp) next).ordinal();
                if (iOrdinal == 0) {
                    zF = fot0Var.g.f(h0x.j0);
                } else if (iOrdinal == 1) {
                    zF = fot0Var.g.f(fpt0.I0);
                } else if (iOrdinal == 2) {
                    zF = fot0Var.g.f(fpt0.O0) || fot0Var.g.f(fpt0.P0);
                } else if (iOrdinal == 3) {
                    zF = fot0Var.g.f(nzw.f);
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        throw null;
                    }
                    zF = Intrinsics.d(fot0Var.g.e(fpt0.Q0, Boolean.TRUE), Boolean.FALSE);
                }
            } while (!zF);
            lhp lhpVar2 = (lhp) next;
            if (lhpVar2 != null) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(lhpVar2.name());
                sb.append(" value is set to ");
                sb.append(str3);
                sb.append(" despite using feature groups. Do not use APIs like ");
                int iOrdinal2 = lhpVar2.ordinal();
                if (iOrdinal2 == 0) {
                    strConcat = str3.concat(".Builder.setDynamicRange");
                } else if (iOrdinal2 == 1) {
                    strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                } else if (iOrdinal2 == 2) {
                    strConcat = qsm0.v(fot0Var) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                } else if (iOrdinal2 == 3) {
                    strConcat = str3.concat(".Builder.setOutputFormat");
                } else {
                    if (iOrdinal2 != 4) {
                        t9f.b();
                        throw null;
                    }
                    strConcat = "Recorder.Builder.setQualitySelector";
                }
                sb.append(strConcat);
                sb.append(" while using feature groups. If, for example, ");
                int iOrdinal3 = lhpVar2.ordinal();
                if (iOrdinal3 == 0) {
                    str = "HDR";
                } else if (iOrdinal3 == 1) {
                    str = "60 FPS";
                } else if (iOrdinal3 == 2) {
                    str = "stabilization";
                } else if (iOrdinal3 == 3) {
                    str = "JPEG_R output format";
                } else {
                    if (iOrdinal3 != 4) {
                        t9f.b();
                        throw null;
                    }
                    str = "UHD recording quality";
                }
                sb.append(str);
                sb.append(" is required, instead set ");
                int iOrdinal4 = lhpVar2.ordinal();
                if (iOrdinal4 == 0) {
                    str2 = "GroupableFeature.HDR_HLG10";
                } else if (iOrdinal4 == 1) {
                    str2 = "GroupableFeature.FPS_60";
                } else if (iOrdinal4 == 2) {
                    str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else if (iOrdinal4 == 3) {
                    str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                } else {
                    if (iOrdinal4 != 4) {
                        t9f.b();
                        throw null;
                    }
                    str2 = "GroupableFeatures.UHD_RECORDING";
                }
                c99.s(axq.n(sb, str2, " as either a required or preferred feature."));
                throw null;
            }
        }
    }

    public static Object E(Object obj, List list, List list2) {
        long j2;
        Iterator it;
        boolean z;
        Iterator it2;
        xt20 xt20Var;
        Iterator it3;
        boolean z2;
        e0g0 e0g0Var = j0g0.b;
        if (obj instanceof g0g0) {
            return obj;
        }
        m9s m9sVar = (m9s) obj;
        List list3 = m9sVar.H;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            xum0 xum0Var = (xum0) it4.next();
            List list4 = xum0Var.f;
            long j3 = xum0Var.b;
            ArrayList arrayList2 = new ArrayList(r3d.q(list4, i));
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                xt20 xt20Var2 = (xt20) it5.next();
                List list5 = xt20Var2.f41445a;
                ArrayList arrayList3 = new ArrayList(r3d.q(list5, i));
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    List<dao> list6 = (List) it6.next();
                    ArrayList arrayList4 = new ArrayList(r3d.q(list6, i));
                    for (dao daoVar : list6) {
                        if (list == null || !list.isEmpty()) {
                            Iterator it7 = list.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    j2 = j3;
                                    it = it5;
                                    z = false;
                                    break;
                                }
                                ru6 ru6Var = (ru6) it7.next();
                                j2 = j3;
                                it = it5;
                                if (ru6Var.d == j2 && ru6Var.h == daoVar.b && ru6Var.g == daoVar.m.f32198a && ru6Var.f == daoVar.f) {
                                    z = true;
                                    break;
                                }
                                it5 = it;
                                j3 = j2;
                            }
                        } else {
                            j2 = j3;
                            z = false;
                            it = it5;
                        }
                        if (list2 != null && list2.isEmpty()) {
                            it3 = it4;
                            it2 = it6;
                            xt20Var = xt20Var2;
                            z2 = false;
                            break;
                            break;
                        }
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                it3 = it4;
                                it2 = it6;
                                xt20Var = xt20Var2;
                                z2 = false;
                                break;
                            }
                            m97 m97Var = ((pbs0) it8.next()).b;
                            it2 = it6;
                            xt20Var = xt20Var2;
                            if (m97Var.f21398a == j2 && m97Var.h == daoVar.b) {
                                it3 = it4;
                                if (m97Var.f == daoVar.m.f32198a) {
                                    if (m97Var.k == daoVar.f) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                it8 = it8;
                                xt20Var2 = xt20Var;
                                it6 = it2;
                                it4 = it3;
                            } else {
                                it3 = it4;
                            }
                            it8 = it8;
                            xt20Var2 = xt20Var;
                            it6 = it2;
                            it4 = it3;
                        }
                        arrayList4.add(dao.a(daoVar, z, z2, 475135));
                        it5 = it;
                        xt20Var2 = xt20Var;
                        it6 = it2;
                        j3 = j2;
                        it4 = it3;
                    }
                    arrayList3.add(arrayList4);
                    j3 = j3;
                    i = 10;
                }
                arrayList2.add(xt20.a(xt20Var2, arrayList3, false, 0L, 0.0d, 254));
                it5 = it5;
                j3 = j3;
                it4 = it4;
                i = 10;
            }
            arrayList.add(new xum0(xum0Var.b, xum0Var.c, xum0Var.d, xum0Var.f41519a, arrayList2, xum0Var.e));
            it4 = it4;
            i = 10;
        }
        return m9s.a(m9sVar, null, arrayList, -1, 253);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0074, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:5:0x003d, B:7:0x0050, B:9:0x005c, B:11:0x0060, B:17:0x006e, B:18:0x0071, B:22:0x0077), top: B:72:0x003d, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [a.s0a, a.zo] */
    public static okz a(rrd rrdVar, clz clzVar, n2a n2aVar, rrd rrdVar2) {
        okz okzVarB;
        Collection collectionUnmodifiableCollection;
        Object obj;
        boolean zContains;
        ap apVar;
        c5k c5kVar = c5k.c;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            ofm0.m();
            j4a j4aVar = (j4a) rrdVar.e;
            j4aVar.getClass();
            s0a s0aVarC = n2aVar.c(j4aVar.f15874a.c());
            s0aVarC.getClass();
            s0aVarC.r(true);
            zo zoVarN = rrdVar.n(n2aVar);
            Object obj2 = null;
            h0a h0aVarM = xf0.M(zoVarN, null);
            skz skzVar = (skz) rrdVar.f;
            skzVar.getClass();
            synchronized (skzVar.f32373a) {
                try {
                    okzVarB = (okz) skzVar.b.get(new f45(System.identityHashCode(clzVar), h0aVarM));
                    if (okzVarB != null) {
                        t3a t3aVar = okzVarB.c;
                        if (t3aVar.f33257a.f1226a.m() || ((apVar = t3aVar.b) != null && apVar.f1226a.m())) {
                            skzVar.k(okzVarB);
                            okzVarB = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            skz skzVar2 = (skz) rrdVar.f;
            skzVar2.getClass();
            synchronized (skzVar2.f32373a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(skzVar2.b.values());
            }
            for (fot0 fot0Var : (List) rrdVar2.g) {
                for (Object obj3 : collectionUnmodifiableCollection) {
                    obj3.getClass();
                    okz okzVar = (okz) obj3;
                    synchronized (okzVar.f25429a) {
                        obj = obj2;
                        zContains = ((ArrayList) okzVar.c.y()).contains(fot0Var);
                    }
                    if (zContains && !okzVar.i().equals(clzVar)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{fot0Var}, 1)));
                    }
                    obj2 = obj;
                }
            }
            ?? r18 = obj2;
            if (okzVarB == null) {
                skz skzVar3 = (skz) rrdVar.f;
                skzVar3.getClass();
                j4a j4aVar2 = (j4a) rrdVar.e;
                j4aVar2.getClass();
                nhf0 nhf0Var = j4aVar2.k;
                if (nhf0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                t3a t3aVar2 = new t3a(s0aVarC, r18, zoVarN, r18, c5kVar, c5kVar, (wy9) nhf0Var.b, (trm0) nhf0Var.d, (ipt0) nhf0Var.c);
                j4a j4aVar3 = (j4a) rrdVar.e;
                j4aVar3.getClass();
                okzVarB = skzVar3.b(clzVar, t3aVar2, (veg0) j4aVar3.o.getValue());
            }
            if (!((List) rrdVar2.g).isEmpty()) {
                skz skzVar4 = (skz) rrdVar.f;
                skzVar4.getClass();
                j4a j4aVar4 = (j4a) rrdVar.e;
                j4aVar4.getClass();
                ru ruVar = j4aVar4.g;
                if (ruVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                skzVar4.a(okzVarB, rrdVar2, (wy9) ruVar.e);
                ((HashSet) rrdVar.i).add(new f45(System.identityHashCode(clzVar), h0aVarM));
            }
            Trace.endSection();
            return okzVarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A(int i) {
        j2a j2aVar;
        j4a j4aVar = (j4a) this.e;
        if (j4aVar != null) {
            j4aVar.getClass();
            ru ruVar = j4aVar.g;
            if (ruVar == null) {
                jf4.n("CameraX not initialized yet.");
                return;
            }
            wy9 wy9Var = (wy9) ruVar.e;
            synchronized (wy9Var.b) {
                wy9Var.f = i;
                j2aVar = wy9Var.c;
            }
            if (j2aVar == null) {
                return;
            }
            boolean z = i == 2;
            wy9Var.g = z;
            if (!z) {
                wy9Var.d = iun.f15405a;
            }
            Iterator it = j2aVar.c().iterator();
            it.getClass();
            while (it.hasNext()) {
                s0a s0aVar = (s0a) it.next();
                u0a u0aVar = s0aVar instanceof u0a ? (u0a) s0aVar : null;
                if (u0aVar != null) {
                    if (i == 1) {
                        ppt0 ppt0Var = u0aVar.f34846a;
                        synchronized (ppt0Var.k) {
                            ppt0Var.o = true;
                        }
                    } else if (i != 2) {
                        continue;
                    } else {
                        ppt0 ppt0Var2 = u0aVar.f34846a;
                        synchronized (ppt0Var2.k) {
                            ppt0Var2.o = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object B(String str, int i, long j2, ex9 ex9Var, x34 x34Var, zje zjeVar) {
        v2a v2aVar;
        ex9 ex9Var2;
        x34 x34Var2;
        long j3;
        int i2;
        String str2;
        if (zjeVar instanceof v2a) {
            v2aVar = (v2a) zjeVar;
            int i3 = v2aVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2aVar.p = i3 - Integer.MIN_VALUE;
            } else {
                v2aVar = new v2a(this, zjeVar);
            }
        } else {
            v2aVar = new v2a(this, zjeVar);
        }
        Object objD0 = v2aVar.n;
        wne wneVar = wne.f39444a;
        int i4 = v2aVar.p;
        yje yjeVar = null;
        if (i4 == 0) {
            z1x.P(objD0);
            ix9 ix9Var = (ix9) this.c;
            v2aVar.i = str;
            v2aVar.j = ex9Var;
            v2aVar.k = x34Var;
            v2aVar.l = i;
            v2aVar.m = j2;
            v2aVar.p = 1;
            synchronized (ix9Var.f) {
                c1a c1aVar = (c1a) ix9Var.f.get(str);
                objD0 = c1aVar != null ? c1aVar : qjj.d0(ix9Var.b.f, new yp6(ix9Var, str, yjeVar, (byte) 24), v2aVar);
            }
            if (objD0 != wneVar) {
                ex9Var2 = ex9Var;
                x34Var2 = x34Var;
                j3 = j2;
                i2 = i;
                str2 = str;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objD0);
                return objD0;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j4 = v2aVar.m;
        int i5 = v2aVar.l;
        x34 x34Var3 = v2aVar.k;
        ex9 ex9Var3 = v2aVar.j;
        String str3 = v2aVar.i;
        z1x.P(objD0);
        i2 = i5;
        x34Var2 = x34Var3;
        ex9Var2 = ex9Var3;
        j3 = j4;
        str2 = str3;
        cao0 cao0Var = (cao0) this.f;
        gx9 gx9Var = (gx9) this.d;
        jx9 jx9Var = (jx9) this.e;
        qcq0 qcq0Var = (qcq0) this.h;
        h1a h1aVar = (h1a) this.g;
        dj3 dj3Var = new dj3(this, str2, new tw2(str2, (c1a) objD0, i2, j3, cao0Var, gx9Var, ex9Var2, jx9Var, qcq0Var, x34Var2, h1aVar.f12273a, h1aVar.b), null);
        v2aVar.i = null;
        v2aVar.j = null;
        v2aVar.k = null;
        v2aVar.p = 2;
        Object objS = qem0.s(dj3Var, v2aVar);
        return objS == wneVar ? wneVar : objS;
    }

    public void C() {
        Trace.beginSection("CX:unbindAll");
        try {
            ofm0.m();
            A(0);
            skz skzVar = (skz) this.f;
            skzVar.getClass();
            skzVar.j((HashSet) this.i);
        } finally {
            Trace.endSection();
        }
    }

    public void D(ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ql5) next).i != txs0.d);
        ql5 ql5Var = (ql5) next;
        if (ql5Var != null) {
            ((gst0) this.e).h(ql5Var.c, ql5Var.d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        w1v w1vVar;
        if (zjeVar instanceof w1v) {
            w1vVar = (w1v) zjeVar;
            int i = w1vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1vVar.k = i - Integer.MIN_VALUE;
            } else {
                w1vVar = new w1v(this, zjeVar);
            }
        } else {
            w1vVar = new w1v(this, zjeVar);
        }
        Object objM = w1vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = w1vVar.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objM);
            ivn ivnVar = (ivn) this.e;
            gmq gmqVarR = ((w5z) ivnVar.f15453a).r(y9s.b);
            w1vVar.k = 1;
            objM = ntb.M(gmqVarR, w1vVar);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        Collection collection = (Collection) objM;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean c() {
        kvt kvtVar = (kvt) this.e;
        y9s y9sVar = y9s.c;
        w5z w5zVar = kvtVar.f18970a;
        return w5zVar.s(y9sVar).isEmpty() && w5zVar.s(y9s.d).isEmpty();
    }

    public qrd d(String str, String str2, Date date, HashMap map) throws ahq, chq, ygq {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = ((ConfigFetchHttpClient) this.g).b();
            ConfigFetchHttpClient configFetchHttpClient = (ConfigFetchHttpClient) this.g;
            HashMap mapR = r();
            String string = ((msd) this.h).f22313a.getString("last_fetch_etag", null);
            vp2 vp2Var = (vp2) ((p5d0) this.c).get();
            qrd qrdVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapR, string, map, vp2Var != null ? (Long) ((wp2) vp2Var).f39524a.f45538a.a(null, null, true).get("_fot") : null, date, ((msd) this.h).b());
            mrd mrdVar = qrdVarFetch.b;
            if (mrdVar != null) {
                msd msdVar = (msd) this.h;
                long j2 = mrdVar.f;
                synchronized (msdVar.b) {
                    msdVar.f22313a.edit().putLong("last_template_version", j2).apply();
                }
            }
            String str4 = qrdVarFetch.c;
            if (str4 != null) {
                msd msdVar2 = (msd) this.h;
                synchronized (msdVar2.b) {
                    msdVar2.f22313a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            ((msd) this.h).d(0, msd.f);
            return qrdVarFetch;
        } catch (chq e) {
            int i = e.b;
            msd msdVar3 = (msd) this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = msdVar3.a().f20573a + 1;
                long millis = TimeUnit.MINUTES.toMillis(j[Math.min(i2, 8) - 1]);
                msdVar3.d(i2, new Date(date.getTime() + (millis / 2) + ((long) ((Random) this.e).nextInt((int) millis))));
            }
            lsd lsdVarA = msdVar3.a();
            int i3 = e.b;
            if (lsdVarA.f20573a > 1 || i3 == 429) {
                lsdVarA.b.getTime();
                throw new ahq("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new ygq("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case Response.BAD_GATEWAY /* 502 */:
                        case Response.SERVICE_UNAVAILABLE /* 503 */:
                        case Response.SERVER_TIMEOUT /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new chq(e.b, "Fetch failed: ".concat(str3), e);
        }
    }

    public Task e(Task task, long j2, HashMap map) {
        rrd rrdVar;
        Task taskContinueWithTask;
        boolean zBefore;
        Executor executor = (Executor) this.d;
        dgq dgqVar = (dgq) this.b;
        msd msdVar = (msd) this.h;
        Date date = new Date(System.currentTimeMillis());
        if (task.isSuccessful()) {
            Date date2 = new Date(msdVar.f22313a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(msd.e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new qrd(2, null, null));
            }
        }
        Date date3 = msdVar.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new ahq(str));
            rrdVar = this;
        } else {
            cgq cgqVar = (cgq) dgqVar;
            Task taskC = cgqVar.c();
            Task taskD = cgqVar.d();
            rrdVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskD}).continueWithTask(executor, new prd(rrdVar, taskC, taskD, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new uq((Object) rrdVar, (Object) date, (byte) 6));
    }

    public Task f(int i) {
        HashMap map = new HashMap((Map) this.i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return ((krd) this.f).b().continueWithTask((Executor) this.d, new uq((Object) this, (Object) map, (byte) 7));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable g(long j2, tl5 tl5Var, yje yjeVar) {
        vl5 vl5Var;
        if (yjeVar instanceof vl5) {
            vl5Var = (vl5) yjeVar;
            int i = vl5Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl5Var.l = i - Integer.MIN_VALUE;
            } else {
                vl5Var = new vl5(this, yjeVar);
            }
        } else {
            vl5Var = new vl5(this, yjeVar);
        }
        Object objI = vl5Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vl5Var.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objI);
            vl5Var.i = j2;
            vl5Var.l = 1;
            objI = i(tl5Var, vl5Var);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = vl5Var.i;
            z1x.P(objI);
        }
        for (Object obj2 : (Iterable) objI) {
            if (((ql5) obj2).f28916a == j2) {
                obj = obj2;
                break;
            }
        }
        ql5 ql5Var = (ql5) obj;
        if (ql5Var != null) {
            return ql5Var;
        }
        throw new ss3();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0200  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:117:0x0207  */
    /* JADX WARN: Code duplicated, block: B:120:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:123:0x0218  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:130:0x0227  */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:136:0x024b A[LOOP:3: B:134:0x0245->B:136:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea A[LOOP:0: B:33:0x00e4->B:35:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[LOOP:1: B:40:0x010e->B:42:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable h(String str, zje zjeVar) {
        wl5 wl5Var;
        int i;
        Object objD;
        List<am5> list;
        ArrayList arrayList;
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        ArrayList<ql5> arrayList2;
        LinkedHashMap linkedHashMap2;
        Integer num;
        Long l;
        xuf xufVar;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Long l2;
        String str4;
        String str5;
        long jLongValue;
        Double d;
        double dDoubleValue;
        Boolean bool;
        boolean zBooleanValue;
        Boolean bool2;
        boolean zBooleanValue2;
        Integer num2;
        int iIntValue;
        Integer num3;
        int iIntValue2;
        Integer num4;
        int iIntValue3;
        txs0 txs0Var;
        String str6;
        String str7;
        Boolean bool3;
        boolean zBooleanValue3;
        Object obj3;
        String str8;
        int length;
        tg5 tg5Var = (tg5) this.b;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof wl5) {
            wl5Var = (wl5) zjeVar;
            int i2 = wl5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wl5Var.l = i2 - Integer.MIN_VALUE;
            } else {
                wl5Var = new wl5(this, zjeVar);
            }
        } else {
            wl5Var = new wl5(this, zjeVar);
        }
        wl5 wl5Var2 = wl5Var;
        Object objW0 = wl5Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = wl5Var2.l;
        Long l3 = null;
        if (i3 == 0) {
            z1x.P(objW0);
            bbw0 bbw0Var = (bbw0) this.c;
            knf0Var.getClass();
            String strC = knf0Var.c();
            wl5Var2.l = 1;
            i = 10;
            objD = bbw0Var.d(str, 1, 1357, 22, strC, wl5Var2);
            if (objD != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            z1x.P(objW0);
            objD = objW0;
            i = 10;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return l3;
            }
            list = wl5Var2.i;
            z1x.P(objW0);
            i = 10;
            l3 = l3;
        }
        Iterable iterable = (Iterable) objW0;
        arrayList = new ArrayList(r3d.q(iterable, i));
        it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ulb.d0((tuf) it.next()));
        }
        iA = wp20.a(r3d.q(arrayList, i));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        for (Object obj4 : arrayList) {
            linkedHashMap.put(new Long(((xuf) obj4).f41508a), obj4);
        }
        arrayList2 = new ArrayList(r3d.q(list, i));
        for (am5 am5Var : list) {
            num = am5Var.e;
            if (num != null) {
                l = new Long(num.intValue());
            } else {
                l = l3;
            }
            xufVar = (xuf) linkedHashMap.get(l);
            if (xufVar != null) {
                obj = xufVar.f;
            } else {
                obj = l3;
            }
            if (obj == null) {
                str2 = "";
            } else {
                str2 = obj;
            }
            if (xufVar != null) {
                obj2 = xufVar.b;
            } else {
                obj2 = l3;
            }
            if (obj2 == null) {
                str3 = "";
            } else {
                str3 = obj2;
            }
            l2 = am5Var.f1093a;
            str4 = am5Var.i;
            str5 = am5Var.h;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            d = am5Var.b;
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            double d2 = dDoubleValue;
            bool = am5Var.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            bool2 = am5Var.d;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            num2 = am5Var.e;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            long j2 = iIntValue;
            num3 = am5Var.f;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            sxs0 sxs0Var = txs0.f34717a;
            num4 = am5Var.g;
            if (num4 != null) {
                iIntValue3 = num4.intValue();
            } else {
                iIntValue3 = -2;
            }
            sxs0Var.getClass();
            if (iIntValue3 != -1) {
                txs0Var = txs0.c;
            } else if (iIntValue3 != 0) {
                txs0Var = txs0.d;
            } else if (iIntValue3 != 4) {
                txs0Var = txs0.e;
            } else if (iIntValue3 != 7) {
                txs0Var = txs0.f;
            } else if (iIntValue3 != 9) {
                txs0Var = txs0.g;
            } else if (iIntValue3 != 13) {
                txs0Var = txs0.b;
            } else {
                txs0Var = txs0.h;
            }
            txs0 txs0Var2 = txs0Var;
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            if (str4 == null) {
                str7 = "";
            } else {
                str7 = str4;
            }
            bool3 = am5Var.j;
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            if (str5 != null) {
                length = str5.length();
                obj3 = str5;
                if (length <= 0) {
                    obj3 = l3;
                }
            } else {
                obj3 = l3;
            }
            if (obj3 == null) {
                str8 = obj3;
            } else if (str4 == null) {
                str8 = "";
            } else {
                str8 = str4;
            }
            arrayList2.add(new ql5(jLongValue, d2, zBooleanValue, zBooleanValue2, j2, str2, str3, iIntValue2, txs0Var2, str6, str7, zBooleanValue3, str8));
        }
        tg5Var.getClass();
        linkedHashMap2 = tg5Var.f33892a;
        linkedHashMap2.clear();
        for (ql5 ql5Var : arrayList2) {
            linkedHashMap2.put(Long.valueOf(ql5Var.f28916a), ql5Var);
        }
        tg5Var.b();
        tg5Var.b = System.currentTimeMillis();
        return arrayList2;
        List list2 = (List) objD;
        ArrayList arrayList3 = new ArrayList(r3d.q(list2, i));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num5 = ((am5) it2.next()).e;
            axq.t(num5 != null ? num5.intValue() : 0L, arrayList3);
        }
        Set setP0 = CollectionsKt.P0(arrayList3);
        ruf rufVar = (ruf) this.i;
        wl5Var2.i = list2;
        wl5Var2.l = 2;
        rufVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("select * from currencies where id in (");
        tnq0.h(setP0.size(), sb);
        sb.append(Separators.RPAREN);
        objW0 = sj3.w0(wl5Var2, rufVar.f31125a, new ee0(sb.toString(), setP0, l3), true, false);
        if (objW0 != wneVar) {
            list = list2;
            Iterable iterable2 = (Iterable) objW0;
            arrayList = new ArrayList(r3d.q(iterable2, i));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(ulb.d0((tuf) it.next()));
            }
            iA = wp20.a(r3d.q(arrayList, i));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            while (r1.hasNext()) {
                linkedHashMap.put(new Long(((xuf) obj4).f41508a), obj4);
            }
            arrayList2 = new ArrayList(r3d.q(list, i));
            while (r0.hasNext()) {
                num = am5Var.e;
                if (num != null) {
                    l = new Long(num.intValue());
                } else {
                    l = l3;
                }
                xufVar = (xuf) linkedHashMap.get(l);
                if (xufVar != null) {
                    obj = xufVar.f;
                } else {
                    obj = l3;
                }
                if (obj == null) {
                    str2 = "";
                } else {
                    str2 = obj;
                }
                if (xufVar != null) {
                    obj2 = xufVar.b;
                } else {
                    obj2 = l3;
                }
                if (obj2 == null) {
                    str3 = "";
                } else {
                    str3 = obj2;
                }
                l2 = am5Var.f1093a;
                str4 = am5Var.i;
                str5 = am5Var.h;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                d = am5Var.b;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                double d3 = dDoubleValue;
                bool = am5Var.c;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                bool2 = am5Var.d;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                num2 = am5Var.e;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                long j3 = iIntValue;
                num3 = am5Var.f;
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                sxs0 sxs0Var2 = txs0.f34717a;
                num4 = am5Var.g;
                if (num4 != null) {
                    iIntValue3 = num4.intValue();
                } else {
                    iIntValue3 = -2;
                }
                sxs0Var2.getClass();
                if (iIntValue3 != -1) {
                    txs0Var = txs0.c;
                } else if (iIntValue3 != 0) {
                    txs0Var = txs0.d;
                } else if (iIntValue3 != 4) {
                    txs0Var = txs0.e;
                } else if (iIntValue3 != 7) {
                    txs0Var = txs0.f;
                } else if (iIntValue3 != 9) {
                    txs0Var = txs0.g;
                } else if (iIntValue3 != 13) {
                    txs0Var = txs0.b;
                } else {
                    txs0Var = txs0.h;
                }
                txs0 txs0Var3 = txs0Var;
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                if (str4 == null) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                bool3 = am5Var.j;
                if (bool3 != null) {
                    zBooleanValue3 = bool3.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                if (str5 != null) {
                    length = str5.length();
                    obj3 = str5;
                    if (length <= 0) {
                        obj3 = l3;
                    }
                } else {
                    obj3 = l3;
                }
                if (obj3 == null) {
                    str8 = obj3;
                } else if (str4 == null) {
                    str8 = "";
                } else {
                    str8 = str4;
                }
                arrayList2.add(new ql5(jLongValue, d3, zBooleanValue, zBooleanValue2, j3, str2, str3, iIntValue2, txs0Var3, str6, str7, zBooleanValue3, str8));
            }
            tg5Var.getClass();
            linkedHashMap2 = tg5Var.f33892a;
            linkedHashMap2.clear();
            while (r3.hasNext()) {
                linkedHashMap2.put(Long.valueOf(ql5Var.f28916a), ql5Var);
            }
            tg5Var.b();
            tg5Var.b = System.currentTimeMillis();
            return arrayList2;
        }
        return wneVar;
    }

    public Object i(tl5 tl5Var, zje zjeVar) {
        return qjj.d0(((mne) this.h).b, new me5((Object) this, (Object) tl5Var, (yje) null, (byte) 23), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r2 == r5) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r18, a.tl5 r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rrd.j(java.lang.String, a.tl5, a.zje):java.lang.Object");
    }

    public Object k(String str, long j2, s77 s77Var, String str2, int i, boolean z, List list, List list2, List list3, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        return qjj.d0(((mne) this.b).b, new c6w(this, str, j2, s77Var, str2, i, z, list, list2, list3, z2, z3, z4, null), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable l(String str, long j2, s77 s77Var, String str2, int i, boolean z, List list, List list2, List list3, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        d6w d6wVar;
        String str3;
        List list4;
        List list5;
        boolean z5;
        s77 s77Var2;
        List list6;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj;
        int iIndexOf;
        if (zjeVar instanceof d6w) {
            d6wVar = (d6w) zjeVar;
            int i2 = d6wVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6wVar.t = i2 - Integer.MIN_VALUE;
            } else {
                d6wVar = new d6w(this, zjeVar);
            }
        } else {
            d6wVar = new d6w(this, zjeVar);
        }
        Object objA = d6wVar.r;
        wne wneVar = wne.f39444a;
        int i3 = d6wVar.t;
        if (i3 == 0) {
            z1x.P(objA);
            g2v g2vVar = (g2v) this.d;
            String strA = ((btt0) this.i).a();
            ctt cttVar = new ctt(i, new Long(j2), cs0.u(Long.parseLong(str)));
            d6wVar.i = s77Var;
            str3 = str2;
            d6wVar.j = str3;
            list4 = list;
            d6wVar.k = list4;
            list5 = list2;
            d6wVar.l = list5;
            d6wVar.m = list3;
            d6wVar.n = z;
            d6wVar.o = z2;
            d6wVar.p = z3;
            d6wVar.q = z4;
            d6wVar.t = 1;
            objA = ((x0w) ((tpv) g2vVar.f10580a).invoke()).a(strA, cttVar, d6wVar);
            if (objA == wneVar) {
                return wneVar;
            }
            z5 = z4;
            s77Var2 = s77Var;
            list6 = list3;
            z6 = z;
            z7 = z2;
            z8 = z3;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z5 = d6wVar.q;
            z8 = d6wVar.p;
            z7 = d6wVar.o;
            z6 = d6wVar.n;
            list6 = d6wVar.m;
            List list7 = d6wVar.l;
            list4 = d6wVar.k;
            String str4 = d6wVar.j;
            s77Var2 = d6wVar.i;
            z1x.P(objA);
            list5 = list7;
            str3 = str4;
        }
        rg7 rg7Var = (rg7) CollectionsKt.firstOrNull(((sg7) objA).a());
        if (rg7Var == null) {
            jf4.k(r5);
            return r5;
        }
        m0w m0wVar = (m0w) this.g;
        m0wVar.getClass();
        ArrayList arrayList = m0wVar.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            rg7 rg7Var2 = (rg7) next;
            if (Intrinsics.d(rg7Var2.f30419a, rg7Var.f30419a) && Intrinsics.d(rg7Var2.v, rg7Var.v)) {
                obj = next;
                break;
            }
        }
        rg7 rg7Var3 = (rg7) obj;
        if (rg7Var3 != null && (iIndexOf = arrayList.indexOf(rg7Var3)) >= 0) {
            arrayList.set(iIndexOf, rg7Var);
        }
        return bkb.r0(rg7Var, s77Var2, str3, z6, list4, list5, z7, list6, z8, z5);
    }

    public jy9 m(n2a n2aVar) {
        Iterator it = n2aVar.f22788a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            y35 y35Var = gz9.f12170a;
            if (!Intrinsics.d(y35Var, y35Var)) {
                synchronized (yro.f43130a) {
                }
                ((Context) this.g).getClass();
            }
        }
        return ky9.f19096a;
    }

    public zo n(n2a n2aVar) {
        Object zoVar;
        n2aVar.getClass();
        Trace.beginSection("CX:getCameraInfo");
        try {
            j4a j4aVar = (j4a) this.e;
            j4aVar.getClass();
            n0a n0aVarH = n2aVar.c(j4aVar.f15874a.c()).h();
            n0aVarH.getClass();
            jy9 jy9VarM = m(n2aVar);
            String strE = n0aVarH.e();
            strE.getClass();
            h0a h0aVarH = xf0.H(strE, null, jy9VarM.f17348a);
            synchronized (this.b) {
                zoVar = ((HashMap) this.h).get(h0aVarH);
                if (zoVar == null) {
                    zoVar = new zo(n0aVarH, jy9VarM);
                    ((HashMap) this.h).put(h0aVarH, zoVar);
                }
            }
            zo zoVar2 = (zo) zoVar;
            Trace.endSection();
            return zoVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object o(long j2, sip sipVar, zje zjeVar) {
        tfu tfuVar;
        long j3;
        sip sipVar2;
        Object g0g0Var;
        Object g0g0Var2;
        xyt xytVar = (xyt) this.c;
        ort ortVar = (ort) this.b;
        if (zjeVar instanceof tfu) {
            tfuVar = (tfu) zjeVar;
            int i = tfuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfuVar.m = i - Integer.MIN_VALUE;
            } else {
                tfuVar = new tfu(this, zjeVar);
            }
        } else {
            tfuVar = new tfu(this, zjeVar);
        }
        Object obj = tfuVar.k;
        wne wneVar = wne.f39444a;
        int i2 = tfuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            pmi pmiVar = (pmi) this.g;
            tfuVar.j = sipVar;
            tfuVar.i = j2;
            tfuVar.m = 1;
            Serializable serializableX = pmiVar.x(tfuVar);
            if (serializableX == wneVar) {
                return wneVar;
            }
            j3 = j2;
            sipVar2 = sipVar;
            obj = serializableX;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = tfuVar.i;
            sip sipVar3 = tfuVar.j;
            z1x.P(obj);
            sipVar2 = sipVar3;
            j3 = j4;
        }
        int iIntValue = ((Number) obj).intValue();
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = new Long(ortVar.b());
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
            g0g0Var2 = Boolean.valueOf(ortVar.f25751a.d(kpb.u(sipVar2)));
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = obj2;
        }
        return new sgs(j3, sipVar2, xytVar.a(), xytVar.f41721a.a(), ((Boolean) g0g0Var2).booleanValue(), jLongValue, iIntValue, 40L);
    }

    public long p(bm5 bm5Var) {
        vwb0 vwb0Var = (vwb0) this.f;
        bm5Var.getClass();
        int iOrdinal = bm5Var.ordinal();
        if (iOrdinal == 3) {
            vwb0Var.getClass();
            return vwb0Var.b().getLong("GAMES_BALANCE_ID", 0L);
        }
        if (iOrdinal != 4) {
            if (iOrdinal != 7) {
                return vwb0.a(vwb0Var, "last_balance_id");
            }
            vwb0Var.getClass();
            return vwb0Var.b().getLong("PROMO_GAMES_BALANCE_ID", 0L);
        }
        vwb0Var.getClass();
        long j2 = vwb0Var.b().getLong("SLOTS_BALANCE_ID", 0L);
        ql5 ql5Var = (ql5) ((tg5) this.b).f33892a.get(Long.valueOf(j2));
        if (ql5Var != null) {
            txs0 txs0Var = ql5Var.i;
            if (!txs0Var.e() && (txs0Var != txs0.f || !ql5Var.l)) {
                return 0L;
            }
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object q(int i, zje zjeVar) throws Throwable {
        dd60 dd60Var;
        Object g0g0Var;
        Object g0g0Var2;
        id60 id60Var;
        Object g0g0Var3;
        Object g0g0Var4;
        switch (this.f30978a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (zjeVar instanceof dd60) {
                    dd60Var = (dd60) zjeVar;
                    int i2 = dd60Var.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        dd60Var.l = i2 - Integer.MIN_VALUE;
                    } else {
                        dd60Var = new dd60(this, zjeVar);
                    }
                } else {
                    dd60Var = new dd60(this, zjeVar);
                }
                Object objA = dd60Var.j;
                wne wneVar = wne.f39444a;
                int i3 = dd60Var.l;
                try {
                    if (i3 == 0) {
                        z1x.P(objA);
                        e0g0 e0g0Var = j0g0.b;
                        rou rouVar = (rou) this.h;
                        dd60Var.i = i;
                        dd60Var.l = 1;
                        objA = rouVar.a(false, dd60Var);
                        if (objA == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (i3 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = dd60Var.i;
                        z1x.P(objA);
                    }
                    Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
                    g0g0Var = new Integer(intOrNull != null ? intOrNull.intValue() : 0);
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Object num = new Integer(0);
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = num;
                }
                int iIntValue = ((Number) g0g0Var).intValue();
                try {
                    krt0 krt0VarA = ((x4v) this.i).a();
                    g0g0Var2 = new c3c0(iIntValue, krt0VarA.f18785a, krt0VarA.b);
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                Throwable thA = j0g0.a(g0g0Var2);
                if (thA != null) {
                    if (!(thA instanceof j7t0)) {
                        throw thA;
                    }
                    g0g0Var2 = new c3c0(0, 0L, false);
                }
                c3c0 c3c0Var = (c3c0) g0g0Var2;
                return c3c0Var.f3668a == 0 ? new c3c0(i, 0L, false) : c3c0Var;
            default:
                if (zjeVar instanceof id60) {
                    id60Var = (id60) zjeVar;
                    int i4 = id60Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        id60Var.l = i4 - Integer.MIN_VALUE;
                    } else {
                        id60Var = new id60(this, zjeVar);
                    }
                } else {
                    id60Var = new id60(this, zjeVar);
                }
                Object objA2 = id60Var.j;
                wne wneVar2 = wne.f39444a;
                int i5 = id60Var.l;
                try {
                    if (i5 == 0) {
                        z1x.P(objA2);
                        e0g0 e0g0Var5 = j0g0.b;
                        rou rouVar2 = (rou) this.h;
                        id60Var.i = i;
                        id60Var.l = 1;
                        objA2 = rouVar2.a(false, id60Var);
                        if (objA2 == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (i5 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = id60Var.i;
                        z1x.P(objA2);
                    }
                    Integer intOrNull2 = StringsKt.toIntOrNull(((m2c0) objA2).c);
                    g0g0Var3 = new Integer(intOrNull2 != null ? intOrNull2.intValue() : 0);
                    e0g0 e0g0Var6 = j0g0.b;
                    break;
                } catch (Throwable th3) {
                    e0g0 e0g0Var7 = j0g0.b;
                    g0g0Var3 = new g0g0(th3);
                }
                Object num2 = new Integer(0);
                if (g0g0Var3 instanceof g0g0) {
                    g0g0Var3 = num2;
                }
                int iIntValue2 = ((Number) g0g0Var3).intValue();
                try {
                    krt0 krt0VarA2 = ((x4v) this.i).a();
                    g0g0Var4 = new c3c0(iIntValue2, krt0VarA2.f18785a, krt0VarA2.c);
                    break;
                } catch (Throwable th4) {
                    e0g0 e0g0Var8 = j0g0.b;
                    g0g0Var4 = new g0g0(th4);
                }
                Throwable thA2 = j0g0.a(g0g0Var4);
                if (thA2 != null) {
                    if (!(thA2 instanceof j7t0)) {
                        throw thA2;
                    }
                    g0g0Var4 = new c3c0(0, 0L, false);
                }
                c3c0 c3c0Var2 = (c3c0) g0g0Var4;
                return c3c0Var2.f3668a == 0 ? new c3c0(i, 0L, false) : c3c0Var2;
        }
    }

    public HashMap r() {
        HashMap map = new HashMap();
        vp2 vp2Var = (vp2) ((p5d0) this.c).get();
        if (vp2Var != null) {
            for (Map.Entry entry : ((wp2) vp2Var).f39524a.f45538a.a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(vlq0 vlq0Var, long j2, zje zjeVar) {
        i6w i6wVar;
        if (zjeVar instanceof i6w) {
            i6wVar = (i6w) zjeVar;
            int i = i6wVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i6wVar.k = i - Integer.MIN_VALUE;
            } else {
                i6wVar = new i6w(this, zjeVar);
            }
        } else {
            i6wVar = new i6w(this, zjeVar);
        }
        Object obj = i6wVar.i;
        wne wneVar = wne.f39444a;
        int i2 = i6wVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            dvj dvjVar = ((mne) this.b).b;
            ir irVar = new ir((Object) this, (Object) vlq0Var, j2, (yje) null, (byte) 18);
            i6wVar.k = 1;
            if (qjj.d0(dvjVar, irVar, i6wVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(long j2, zje zjeVar, String str) {
        j6w j6wVar;
        if (zjeVar instanceof j6w) {
            j6wVar = (j6w) zjeVar;
            int i = j6wVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j6wVar.k = i - Integer.MIN_VALUE;
            } else {
                j6wVar = new j6w(this, zjeVar);
            }
        } else {
            j6wVar = new j6w(this, zjeVar);
        }
        Object obj = j6wVar.i;
        wne wneVar = wne.f39444a;
        int i2 = j6wVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            dvj dvjVar = ((mne) this.b).b;
            ir irVar = new ir((Object) this, (Object) str, j2, (yje) null, (byte) 19);
            j6wVar.k = 1;
            if (qjj.d0(dvjVar, irVar, j6wVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public String toString() {
        switch (this.f30978a) {
            case 22:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.g) + ", frameRateRange=" + ((Range) this.d) + ", requiredFeatureGroup=" + ((Set) this.e) + ", preferredFeatureGroup=" + ((List) this.f) + ", effects=" + ((List) this.c) + ", viewPort=" + ((wju0) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public void u(j4a j4aVar, Context context) {
        z1a z1aVar;
        synchronized (this.b) {
            this.e = j4aVar;
            this.g = context;
            if (j4aVar != null && (z1aVar = j4aVar.n) != null) {
                ScheduledExecutorService scheduledExecutorServiceT = j120.T();
                scheduledExecutorServiceT.getClass();
                z1aVar.n.add(new x1a(this, scheduledExecutorServiceT));
                ((lmv) scheduledExecutorServiceT).execute(new u1a(z1aVar, this));
            }
        }
    }

    public utb v(boolean z, boolean z2, boolean z3, boolean z4, Function1 function1) {
        hie0 hie0Var = new hie0();
        if (z3) {
            ((yqc) this.g).w(y9s.b);
        }
        vsg0 vsg0Var = new vsg0(new lyh(z, this, function1, z2, (yje) null));
        byte b = 1;
        yje yjeVar = null;
        return aoq.c(aoq.b(vsg0Var, uvw.O(new i89(new p1v(new i89(((w5z) ((ivn) this.e).f15453a).r(y9s.b), (byte) 23), hie0Var, b), (byte) 22), function1 == null ? new x1v(this, yjeVar, b) : function1, new oz0(3, yjeVar, (byte) 19))), new xpp(yjeVar, (Object) this, z4, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r5 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r5 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
    
        if (r5 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        if (r5 == r7) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(int r19, long r20, a.xg8 r22, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rrd.w(int, long, a.xg8, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x021b  */
    /* JADX WARN: Code duplicated, block: B:70:0x022b A[LOOP:0: B:68:0x0225->B:70:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0255  */
    /* JADX WARN: Code duplicated, block: B:75:0x0259  */
    /* JADX WARN: Code duplicated, block: B:79:0x027e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0280, code lost:
    
        if (r0 == r6) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r29, a.zje r31) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rrd.x(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object y(String str, zje zjeVar) {
        rc60 rc60Var;
        n0o0 n0o0Var = (n0o0) this.i;
        if (zjeVar instanceof rc60) {
            rc60Var = (rc60) zjeVar;
            int i = rc60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc60Var.l = i - Integer.MIN_VALUE;
            } else {
                rc60Var = new rc60(this, zjeVar);
            }
        } else {
            rc60Var = new rc60(this, zjeVar);
        }
        Object objV = rc60Var.j;
        wne wneVar = wne.f39444a;
        int i2 = rc60Var.l;
        if (i2 == 0) {
            z1x.P(objV);
            dgu dguVar = (dgu) this.b;
            boolean z = ((sff0) n0o0Var.getValue()).J1;
            boolean z2 = ((sff0) n0o0Var.getValue()).O1;
            rc60Var.i = str;
            rc60Var.l = 1;
            objV = dguVar.v(rc60Var, str, z, z2);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = rc60Var.i;
            z1x.P(objV);
        }
        gmq gmqVar = (gmq) objV;
        eu4 eu4VarA = ((h9c) this.c).a();
        eu4 eu4VarA2 = ((reu) this.d).a();
        n8u n8uVar = (n8u) this.e;
        str.getClass();
        noo nooVar = n8uVar.f23107a;
        nooVar.getClass();
        moo mooVar = nooVar.f23877a;
        mooVar.getClass();
        return dub.d0(gmqVar, eu4VarA, eu4VarA2, new a1g(mooVar.f22144a, str, (byte) 10), ((nku) this.f).a(), new sc60(this, str, null));
    }

    public void z(bm5 bm5Var, long j2) {
        vwb0 vwb0Var = (vwb0) this.f;
        bm5Var.getClass();
        int iOrdinal = bm5Var.ordinal();
        if (iOrdinal == 3) {
            vwb0Var.g("GAMES_BALANCE_ID", j2);
            return;
        }
        if (iOrdinal == 4) {
            vwb0Var.g("SLOTS_BALANCE_ID", j2);
            return;
        }
        if (iOrdinal == 7) {
            vwb0Var.g("PROMO_GAMES_BALANCE_ID", j2);
            return;
        }
        vwb0Var.getClass();
        if (vwb0Var.b().getLong("last_balance_id", 0L) != j2 || vwb0Var.b().getLong("SLOTS_BALANCE_ID", 0L) == 0) {
            vwb0Var.g("SLOTS_BALANCE_ID", j2);
        }
        vwb0Var.getClass();
        if (vwb0Var.b().getLong("last_balance_id", 0L) != j2 || vwb0Var.b().getLong("GAMES_BALANCE_ID", 0L) == 0) {
            vwb0Var.g("GAMES_BALANCE_ID", j2);
        }
        vwb0Var.g("last_balance_id", j2);
    }

    public rrd(f7u f7uVar, h9c h9cVar, reu reuVar, n1d n1dVar, bwl bwlVar, rrc rrcVar, pru pruVar) {
        this.f30978a = (byte) 26;
        this.b = f7uVar;
        this.c = h9cVar;
        this.d = reuVar;
        this.e = n1dVar;
        this.f = bwlVar;
        this.g = rrcVar;
        this.h = pruVar;
        this.i = maz.b(new pu50(this, (byte) 5));
    }

    public rrd(dgu dguVar, h9c h9cVar, reu reuVar, n8u n8uVar, nku nkuVar, pru pruVar, omo omoVar) {
        this.f30978a = (byte) 27;
        this.b = dguVar;
        this.c = h9cVar;
        this.d = reuVar;
        this.e = n8uVar;
        this.f = nkuVar;
        this.g = pruVar;
        this.h = omoVar;
        this.i = maz.b(new pu50(this, (byte) 10));
    }

    public rrd(tg5 tg5Var, bbw0 bbw0Var, knf0 knf0Var, gst0 gst0Var, vwb0 vwb0Var, btt0 btt0Var, mne mneVar, rrc rrcVar) {
        this.f30978a = (byte) 2;
        tg5Var.getClass();
        knf0Var.getClass();
        gst0Var.getClass();
        vwb0Var.getClass();
        btt0Var.getClass();
        this.b = tg5Var;
        this.c = bbw0Var;
        this.d = knf0Var;
        this.e = gst0Var;
        this.f = vwb0Var;
        this.g = btt0Var;
        this.h = mneVar;
        this.i = ((OnexDatabase) rrcVar.b).l();
    }

    public rrd(mne mneVar, pyu pyuVar, g2v g2vVar, dpi0 dpi0Var, tnm0 tnm0Var, m0w m0wVar, y2m0 y2m0Var, knf0 knf0Var, btt0 btt0Var) {
        this.f30978a = (byte) 20;
        tnm0Var.getClass();
        m0wVar.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = mneVar;
        this.c = pyuVar;
        this.d = g2vVar;
        this.e = dpi0Var;
        this.f = tnm0Var;
        this.g = m0wVar;
        this.h = knf0Var;
        this.i = btt0Var;
    }

    public rrd(byte b) {
        this.f30978a = b;
        switch (b) {
            case 23:
                this.b = new Object();
                this.d = m3x.c;
                this.h = new HashMap();
                this.i = new HashSet();
                break;
        }
    }

    public rrd(duj dujVar, String str, sa10 sa10Var, m1e m1eVar, mne mneVar, pyu pyuVar, iqt iqtVar) {
        this.f30978a = (byte) 16;
        this.b = str;
        this.c = pyuVar;
        this.d = iqtVar;
        this.e = sa10Var;
        this.f = m1eVar;
        this.g = mneVar;
        this.h = dujVar;
        this.i = n0k0.a(new kzi(this, (byte) 0));
    }

    public rrd(mne mneVar, pv00 pv00Var, String str, nr nrVar, duj dujVar, rqj0 rqj0Var, zsr zsrVar) {
        this.f30978a = (byte) 15;
        this.b = str;
        this.c = nrVar;
        this.d = zsrVar;
        this.e = dujVar;
        this.f = rqj0Var;
        this.g = mneVar;
        this.h = pv00Var;
        this.i = new xvi(this, (byte) 18);
    }

    public rrd(d1p d1pVar, cad cadVar, List list, ctf0 ctf0Var, i1w0 i1w0Var, peg0 peg0Var, b4j b4jVar) {
        this.f30978a = (byte) 5;
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = peg0Var;
        this.e = b4jVar;
        this.f = d1pVar;
        this.g = list;
        this.h = cadVar;
        this.i = new t5i(this, (byte) 22);
    }

    public rrd(cad cadVar, pcl0 pcl0Var, eai eaiVar, ctf0 ctf0Var, s64 s64Var, kt2 kt2Var, ChooseSubGameParams chooseSubGameParams) {
        this.f30978a = (byte) 7;
        this.b = ctf0Var;
        this.c = cadVar;
        this.d = pcl0Var;
        this.e = eaiVar;
        this.f = s64Var;
        this.g = kt2Var;
        this.h = chooseSubGameParams;
        this.i = new pai(this, (byte) 22);
    }

    public rrd(pzu pzuVar, btt0 btt0Var, gii0 gii0Var, m1e m1eVar, duj dujVar, sa10 sa10Var, ioe0 ioe0Var) {
        this.f30978a = (byte) 14;
        this.b = ioe0Var;
        this.c = gii0Var;
        this.d = btt0Var;
        this.e = pzuVar;
        this.f = m1eVar;
        this.g = dujVar;
        this.h = sa10Var;
        this.i = new ppi(this, (byte) 26);
    }

    public rrd(mne mneVar, iw20 iw20Var, m6m0 m6m0Var, i1w0 i1w0Var, ctf0 ctf0Var, vwb0 vwb0Var, q7d0 q7d0Var, us00 us00Var) {
        this.f30978a = (byte) 13;
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = iw20Var;
        this.e = vwb0Var;
        this.f = q7d0Var;
        this.g = us00Var;
        this.h = mneVar;
        this.i = new ppi(this, (byte) 17);
    }

    public rrd(cad cadVar, ehf0 ehf0Var, ctf0 ctf0Var, oeg0 oeg0Var, duj dujVar, bzt bztVar, gw8 gw8Var) {
        this.f30978a = (byte) 6;
        this.b = dujVar;
        this.c = oeg0Var;
        this.d = ctf0Var;
        this.e = cadVar;
        this.f = bztVar;
        this.g = gw8Var;
        this.h = ehf0Var;
        this.i = new n8i(this, (byte) 29);
    }

    public rrd(wsz wszVar, cad cadVar, btt0 btt0Var, gii0 gii0Var, kuy kuyVar, e400 e400Var) {
        this.f30978a = (byte) 10;
        this.b = wszVar;
        this.c = gii0Var;
        this.d = btt0Var;
        this.e = e400Var;
        this.f = cadVar;
        this.g = kuyVar;
        byte b = 3;
        this.h = mbl.b(new gji(this, 1, b));
        this.i = mbl.b(new gji(this, 0, b));
    }

    public rrd(ii iiVar, duj dujVar, xio xioVar, czz czzVar, dzz dzzVar, knf0 knf0Var, gii0 gii0Var, wdk0 wdk0Var, btt0 btt0Var) {
        this.f30978a = (byte) 8;
        this.b = gii0Var;
        this.c = xioVar;
        this.d = btt0Var;
        this.e = knf0Var;
        this.f = dzzVar;
        this.g = czzVar;
        this.h = dujVar;
        this.i = n0k0.a(new yei(this, (byte) 8));
    }

    public rrd(String str, ctf0 ctf0Var, gii0 gii0Var, mne mneVar, ii iiVar, wdk0 wdk0Var, ol olVar) {
        this.f30978a = (byte) 11;
        this.b = ctf0Var;
        this.c = gii0Var;
        this.d = olVar;
        this.e = str;
        this.f = mneVar;
        byte b = 4;
        this.g = n0k0.a(new omi(this, 1, b));
        this.h = n0k0.a(new omi(this, 2, b));
        this.i = new omi(this, 0, b);
    }

    public /* synthetic */ rrd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.f30978a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public rrd(cad cadVar, wsf0 wsf0Var, d1p d1pVar, fnd0 fnd0Var, ctf0 ctf0Var, duj dujVar, wdk0 wdk0Var, s31 s31Var) {
        this.f30978a = (byte) 12;
        this.b = cadVar;
        this.c = dujVar;
        this.d = fnd0Var;
        this.e = wsf0Var;
        this.f = d1pVar;
        this.g = ctf0Var;
        this.h = s31Var;
        this.i = new ppi(this, (byte) 14);
    }

    public rrd(onv onvVar, lef0 lef0Var, cad cadVar, ii iiVar, otn otnVar, qgd qgdVar, ctf0 ctf0Var, m1e m1eVar, zn00 zn00Var) {
        this.f30978a = (byte) 9;
        this.b = lef0Var;
        this.c = zn00Var;
        this.d = qgdVar;
        this.e = otnVar;
        this.f = ctf0Var;
        this.g = m1eVar;
        this.h = cadVar;
        this.i = n0k0.a(new yei(this, (byte) 19));
    }

    public rrd(c5k c5kVar, ix9 ix9Var, gx9 gx9Var, jx9 jx9Var, cao0 cao0Var, h1a h1aVar, qcq0 qcq0Var) {
        this.f30978a = (byte) 4;
        ix9Var.getClass();
        gx9Var.getClass();
        jx9Var.getClass();
        cao0Var.getClass();
        qcq0Var.getClass();
        this.b = c5kVar;
        this.c = ix9Var;
        this.d = gx9Var;
        this.e = jx9Var;
        this.f = cao0Var;
        this.g = h1aVar;
        this.h = qcq0Var;
        this.i = new odd();
    }
}
