package a;

import android.media.MediaCodec;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f44440a;
    public final boolean b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;

    public zii0(Collection collection, boolean z) {
        collection.getClass();
        this.f44440a = collection;
        this.b = z;
        final byte b = 0;
        this.c = maz.b(new Function0(this) { // from class: a.yii0
            public final /* synthetic */ zii0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027b  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027b, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                zii0 zii0Var = this.b;
                switch (b2) {
                    case 0:
                        ArrayList<xii0> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (fot0 fot0Var : zii0Var.f44440a) {
                            boolean z2 = zii0Var.b;
                            fot0Var.getClass();
                            xii0 xii0Var = z2 ? fot0Var.p : fot0Var.q;
                            xii0Var.getClass();
                            arrayList.add(xii0Var);
                            fpt0 fpt0Var = fot0Var.i;
                            fpt0Var.getClass();
                            arrayList2.add(fpt0Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((xii0) it.next()).g.c == 5) {
                                    if (l8x.g0()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    return lunVar;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        u15 u15Var = vrm0.f37906a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (xii0 xii0Var2 : arrayList) {
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var) && xii0Var2.b().size() != 1) {
                                if (!l8x.g0()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + xii0Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var)) {
                                int i = 0;
                                for (xii0 xii0Var3 : arrayList) {
                                    if (((fpt0) arrayList3.get(i)).v() == hpt0.f) {
                                        List listB = xii0Var3.b();
                                        listB.getClass();
                                        z1x.y("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(xii0Var3.b().get(0), 1L);
                                    } else if (xii0Var3.g.b.f2093a.containsKey(u15Var)) {
                                        List listB2 = xii0Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = xii0Var3.b().get(0);
                                            Object objD = xii0Var3.g.b.d(u15Var);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (l8x.f0("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (l8x.f0("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<fot0> collection2 = zii0Var.f44440a;
                        ArrayList<xii0> arrayList4 = new ArrayList(r3d.q(collection2, 10));
                        for (fot0 fot0Var2 : collection2) {
                            boolean z3 = zii0Var.b;
                            fot0Var2.getClass();
                            xii0 xii0Var4 = z3 ? fot0Var2.p : fot0Var2.q;
                            xii0Var4.getClass();
                            arrayList4.add(xii0Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (xii0 xii0Var5 : arrayList4) {
                            List<hzj> listB3 = xii0Var5.b();
                            t7a t7aVar = xii0Var5.g;
                            for (hzj hzjVar : listB3) {
                                b780 b780Var = t7aVar.b;
                                u15 u15Var2 = hx9.i;
                                if (!b780Var.f2093a.containsKey(u15Var2) || b780Var.d(u15Var2) == null) {
                                    linkedHashMap2.put(hzjVar, Long.valueOf(Intrinsics.d(hzjVar.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = b780Var.d(u15Var2);
                                    objD2.getClass();
                                    linkedHashMap2.put(hzjVar, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        wii0 wii0Var = new wii0();
                        for (fot0 fot0Var3 : zii0Var.f44440a) {
                            boolean z4 = zii0Var.b;
                            fot0Var3.getClass();
                            xii0 xii0Var6 = z4 ? fot0Var3.p : fot0Var3.q;
                            xii0Var6.getClass();
                            wii0Var.a(xii0Var6);
                        }
                        return wii0Var;
                    case 3:
                        n0o0 n0o0Var = zii0Var.e;
                        if (((wii0) n0o0Var.getValue()).c()) {
                            return ((wii0) n0o0Var.getValue()).b();
                        }
                        jf4.n("Check failed.");
                        return null;
                    default:
                        n0o0 n0o0Var2 = zii0Var.f;
                        if (!((wii0) zii0Var.e.getValue()).c()) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        a55 a55Var = ((xii0) n0o0Var2.getValue()).b;
                        if (a55Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((xii0) n0o0Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            hzj hzjVar2 = a55Var.f252a;
                            hzjVar2.getClass();
                            arrayList5.add(hzjVar2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((xii0) n0o0Var2.getValue()).b();
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.yii0
            public final /* synthetic */ zii0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027b  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027b, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                zii0 zii0Var = this.b;
                switch (b3) {
                    case 0:
                        ArrayList<xii0> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (fot0 fot0Var : zii0Var.f44440a) {
                            boolean z2 = zii0Var.b;
                            fot0Var.getClass();
                            xii0 xii0Var = z2 ? fot0Var.p : fot0Var.q;
                            xii0Var.getClass();
                            arrayList.add(xii0Var);
                            fpt0 fpt0Var = fot0Var.i;
                            fpt0Var.getClass();
                            arrayList2.add(fpt0Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((xii0) it.next()).g.c == 5) {
                                    if (l8x.g0()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    return lunVar;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        u15 u15Var = vrm0.f37906a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (xii0 xii0Var2 : arrayList) {
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var) && xii0Var2.b().size() != 1) {
                                if (!l8x.g0()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + xii0Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var)) {
                                int i = 0;
                                for (xii0 xii0Var3 : arrayList) {
                                    if (((fpt0) arrayList3.get(i)).v() == hpt0.f) {
                                        List listB = xii0Var3.b();
                                        listB.getClass();
                                        z1x.y("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(xii0Var3.b().get(0), 1L);
                                    } else if (xii0Var3.g.b.f2093a.containsKey(u15Var)) {
                                        List listB2 = xii0Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = xii0Var3.b().get(0);
                                            Object objD = xii0Var3.g.b.d(u15Var);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (l8x.f0("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (l8x.f0("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<fot0> collection2 = zii0Var.f44440a;
                        ArrayList<xii0> arrayList4 = new ArrayList(r3d.q(collection2, 10));
                        for (fot0 fot0Var2 : collection2) {
                            boolean z3 = zii0Var.b;
                            fot0Var2.getClass();
                            xii0 xii0Var4 = z3 ? fot0Var2.p : fot0Var2.q;
                            xii0Var4.getClass();
                            arrayList4.add(xii0Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (xii0 xii0Var5 : arrayList4) {
                            List<hzj> listB3 = xii0Var5.b();
                            t7a t7aVar = xii0Var5.g;
                            for (hzj hzjVar : listB3) {
                                b780 b780Var = t7aVar.b;
                                u15 u15Var2 = hx9.i;
                                if (!b780Var.f2093a.containsKey(u15Var2) || b780Var.d(u15Var2) == null) {
                                    linkedHashMap2.put(hzjVar, Long.valueOf(Intrinsics.d(hzjVar.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = b780Var.d(u15Var2);
                                    objD2.getClass();
                                    linkedHashMap2.put(hzjVar, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        wii0 wii0Var = new wii0();
                        for (fot0 fot0Var3 : zii0Var.f44440a) {
                            boolean z4 = zii0Var.b;
                            fot0Var3.getClass();
                            xii0 xii0Var6 = z4 ? fot0Var3.p : fot0Var3.q;
                            xii0Var6.getClass();
                            wii0Var.a(xii0Var6);
                        }
                        return wii0Var;
                    case 3:
                        n0o0 n0o0Var = zii0Var.e;
                        if (((wii0) n0o0Var.getValue()).c()) {
                            return ((wii0) n0o0Var.getValue()).b();
                        }
                        jf4.n("Check failed.");
                        return null;
                    default:
                        n0o0 n0o0Var2 = zii0Var.f;
                        if (!((wii0) zii0Var.e.getValue()).c()) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        a55 a55Var = ((xii0) n0o0Var2.getValue()).b;
                        if (a55Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((xii0) n0o0Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            hzj hzjVar2 = a55Var.f252a;
                            hzjVar2.getClass();
                            arrayList5.add(hzjVar2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((xii0) n0o0Var2.getValue()).b();
                }
            }
        });
        final byte b3 = 2;
        this.e = maz.b(new Function0(this) { // from class: a.yii0
            public final /* synthetic */ zii0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027b  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027b, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                zii0 zii0Var = this.b;
                switch (b4) {
                    case 0:
                        ArrayList<xii0> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (fot0 fot0Var : zii0Var.f44440a) {
                            boolean z2 = zii0Var.b;
                            fot0Var.getClass();
                            xii0 xii0Var = z2 ? fot0Var.p : fot0Var.q;
                            xii0Var.getClass();
                            arrayList.add(xii0Var);
                            fpt0 fpt0Var = fot0Var.i;
                            fpt0Var.getClass();
                            arrayList2.add(fpt0Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((xii0) it.next()).g.c == 5) {
                                    if (l8x.g0()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    return lunVar;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        u15 u15Var = vrm0.f37906a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (xii0 xii0Var2 : arrayList) {
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var) && xii0Var2.b().size() != 1) {
                                if (!l8x.g0()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + xii0Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var)) {
                                int i = 0;
                                for (xii0 xii0Var3 : arrayList) {
                                    if (((fpt0) arrayList3.get(i)).v() == hpt0.f) {
                                        List listB = xii0Var3.b();
                                        listB.getClass();
                                        z1x.y("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(xii0Var3.b().get(0), 1L);
                                    } else if (xii0Var3.g.b.f2093a.containsKey(u15Var)) {
                                        List listB2 = xii0Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = xii0Var3.b().get(0);
                                            Object objD = xii0Var3.g.b.d(u15Var);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (l8x.f0("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (l8x.f0("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<fot0> collection2 = zii0Var.f44440a;
                        ArrayList<xii0> arrayList4 = new ArrayList(r3d.q(collection2, 10));
                        for (fot0 fot0Var2 : collection2) {
                            boolean z3 = zii0Var.b;
                            fot0Var2.getClass();
                            xii0 xii0Var4 = z3 ? fot0Var2.p : fot0Var2.q;
                            xii0Var4.getClass();
                            arrayList4.add(xii0Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (xii0 xii0Var5 : arrayList4) {
                            List<hzj> listB3 = xii0Var5.b();
                            t7a t7aVar = xii0Var5.g;
                            for (hzj hzjVar : listB3) {
                                b780 b780Var = t7aVar.b;
                                u15 u15Var2 = hx9.i;
                                if (!b780Var.f2093a.containsKey(u15Var2) || b780Var.d(u15Var2) == null) {
                                    linkedHashMap2.put(hzjVar, Long.valueOf(Intrinsics.d(hzjVar.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = b780Var.d(u15Var2);
                                    objD2.getClass();
                                    linkedHashMap2.put(hzjVar, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        wii0 wii0Var = new wii0();
                        for (fot0 fot0Var3 : zii0Var.f44440a) {
                            boolean z4 = zii0Var.b;
                            fot0Var3.getClass();
                            xii0 xii0Var6 = z4 ? fot0Var3.p : fot0Var3.q;
                            xii0Var6.getClass();
                            wii0Var.a(xii0Var6);
                        }
                        return wii0Var;
                    case 3:
                        n0o0 n0o0Var = zii0Var.e;
                        if (((wii0) n0o0Var.getValue()).c()) {
                            return ((wii0) n0o0Var.getValue()).b();
                        }
                        jf4.n("Check failed.");
                        return null;
                    default:
                        n0o0 n0o0Var2 = zii0Var.f;
                        if (!((wii0) zii0Var.e.getValue()).c()) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        a55 a55Var = ((xii0) n0o0Var2.getValue()).b;
                        if (a55Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((xii0) n0o0Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            hzj hzjVar2 = a55Var.f252a;
                            hzjVar2.getClass();
                            arrayList5.add(hzjVar2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((xii0) n0o0Var2.getValue()).b();
                }
            }
        });
        final byte b4 = 3;
        this.f = maz.b(new Function0(this) { // from class: a.yii0
            public final /* synthetic */ zii0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027b  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027b, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                zii0 zii0Var = this.b;
                switch (b5) {
                    case 0:
                        ArrayList<xii0> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (fot0 fot0Var : zii0Var.f44440a) {
                            boolean z2 = zii0Var.b;
                            fot0Var.getClass();
                            xii0 xii0Var = z2 ? fot0Var.p : fot0Var.q;
                            xii0Var.getClass();
                            arrayList.add(xii0Var);
                            fpt0 fpt0Var = fot0Var.i;
                            fpt0Var.getClass();
                            arrayList2.add(fpt0Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((xii0) it.next()).g.c == 5) {
                                    if (l8x.g0()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    return lunVar;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        u15 u15Var = vrm0.f37906a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (xii0 xii0Var2 : arrayList) {
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var) && xii0Var2.b().size() != 1) {
                                if (!l8x.g0()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + xii0Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var)) {
                                int i = 0;
                                for (xii0 xii0Var3 : arrayList) {
                                    if (((fpt0) arrayList3.get(i)).v() == hpt0.f) {
                                        List listB = xii0Var3.b();
                                        listB.getClass();
                                        z1x.y("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(xii0Var3.b().get(0), 1L);
                                    } else if (xii0Var3.g.b.f2093a.containsKey(u15Var)) {
                                        List listB2 = xii0Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = xii0Var3.b().get(0);
                                            Object objD = xii0Var3.g.b.d(u15Var);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (l8x.f0("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (l8x.f0("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<fot0> collection2 = zii0Var.f44440a;
                        ArrayList<xii0> arrayList4 = new ArrayList(r3d.q(collection2, 10));
                        for (fot0 fot0Var2 : collection2) {
                            boolean z3 = zii0Var.b;
                            fot0Var2.getClass();
                            xii0 xii0Var4 = z3 ? fot0Var2.p : fot0Var2.q;
                            xii0Var4.getClass();
                            arrayList4.add(xii0Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (xii0 xii0Var5 : arrayList4) {
                            List<hzj> listB3 = xii0Var5.b();
                            t7a t7aVar = xii0Var5.g;
                            for (hzj hzjVar : listB3) {
                                b780 b780Var = t7aVar.b;
                                u15 u15Var2 = hx9.i;
                                if (!b780Var.f2093a.containsKey(u15Var2) || b780Var.d(u15Var2) == null) {
                                    linkedHashMap2.put(hzjVar, Long.valueOf(Intrinsics.d(hzjVar.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = b780Var.d(u15Var2);
                                    objD2.getClass();
                                    linkedHashMap2.put(hzjVar, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        wii0 wii0Var = new wii0();
                        for (fot0 fot0Var3 : zii0Var.f44440a) {
                            boolean z4 = zii0Var.b;
                            fot0Var3.getClass();
                            xii0 xii0Var6 = z4 ? fot0Var3.p : fot0Var3.q;
                            xii0Var6.getClass();
                            wii0Var.a(xii0Var6);
                        }
                        return wii0Var;
                    case 3:
                        n0o0 n0o0Var = zii0Var.e;
                        if (((wii0) n0o0Var.getValue()).c()) {
                            return ((wii0) n0o0Var.getValue()).b();
                        }
                        jf4.n("Check failed.");
                        return null;
                    default:
                        n0o0 n0o0Var2 = zii0Var.f;
                        if (!((wii0) zii0Var.e.getValue()).c()) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        a55 a55Var = ((xii0) n0o0Var2.getValue()).b;
                        if (a55Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((xii0) n0o0Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            hzj hzjVar2 = a55Var.f252a;
                            hzjVar2.getClass();
                            arrayList5.add(hzjVar2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((xii0) n0o0Var2.getValue()).b();
                }
            }
        });
        final byte b5 = 4;
        this.g = maz.b(new Function0(this) { // from class: a.yii0
            public final /* synthetic */ zii0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x027b  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:101:0x027b, please report this as an issue */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                zii0 zii0Var = this.b;
                switch (b6) {
                    case 0:
                        ArrayList<xii0> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (fot0 fot0Var : zii0Var.f44440a) {
                            boolean z2 = zii0Var.b;
                            fot0Var.getClass();
                            xii0 xii0Var = z2 ? fot0Var.p : fot0Var.q;
                            xii0Var.getClass();
                            arrayList.add(xii0Var);
                            fpt0 fpt0Var = fot0Var.i;
                            fpt0Var.getClass();
                            arrayList2.add(fpt0Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((xii0) it.next()).g.c == 5) {
                                    if (l8x.g0()) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    return lunVar;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        u15 u15Var = vrm0.f37906a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        for (xii0 xii0Var2 : arrayList) {
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var) && xii0Var2.b().size() != 1) {
                                if (!l8x.g0()) {
                                    return linkedHashMap;
                                }
                                Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + xii0Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                return linkedHashMap;
                            }
                            if (xii0Var2.g.b.f2093a.containsKey(u15Var)) {
                                int i = 0;
                                for (xii0 xii0Var3 : arrayList) {
                                    if (((fpt0) arrayList3.get(i)).v() == hpt0.f) {
                                        List listB = xii0Var3.b();
                                        listB.getClass();
                                        z1x.y("MeteringRepeating should contain a surface", !listB.isEmpty());
                                        linkedHashMap.put(xii0Var3.b().get(0), 1L);
                                    } else if (xii0Var3.g.b.f2093a.containsKey(u15Var)) {
                                        List listB2 = xii0Var3.b();
                                        listB2.getClass();
                                        if (!listB2.isEmpty()) {
                                            Object obj = xii0Var3.b().get(0);
                                            Object objD = xii0Var3.g.b.d(u15Var);
                                            objD.getClass();
                                            linkedHashMap.put(obj, objD);
                                        }
                                    }
                                    i++;
                                }
                                if (l8x.f0("CXCP")) {
                                    return linkedHashMap;
                                }
                                Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                                return linkedHashMap;
                            }
                        }
                        if (l8x.f0("CXCP")) {
                            return linkedHashMap;
                        }
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    case 1:
                        Collection<fot0> collection2 = zii0Var.f44440a;
                        ArrayList<xii0> arrayList4 = new ArrayList(r3d.q(collection2, 10));
                        for (fot0 fot0Var2 : collection2) {
                            boolean z3 = zii0Var.b;
                            fot0Var2.getClass();
                            xii0 xii0Var4 = z3 ? fot0Var2.p : fot0Var2.q;
                            xii0Var4.getClass();
                            arrayList4.add(xii0Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (xii0 xii0Var5 : arrayList4) {
                            List<hzj> listB3 = xii0Var5.b();
                            t7a t7aVar = xii0Var5.g;
                            for (hzj hzjVar : listB3) {
                                b780 b780Var = t7aVar.b;
                                u15 u15Var2 = hx9.i;
                                if (!b780Var.f2093a.containsKey(u15Var2) || b780Var.d(u15Var2) == null) {
                                    linkedHashMap2.put(hzjVar, Long.valueOf(Intrinsics.d(hzjVar.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = b780Var.d(u15Var2);
                                    objD2.getClass();
                                    linkedHashMap2.put(hzjVar, objD2);
                                }
                            }
                        }
                        return linkedHashMap2;
                    case 2:
                        wii0 wii0Var = new wii0();
                        for (fot0 fot0Var3 : zii0Var.f44440a) {
                            boolean z4 = zii0Var.b;
                            fot0Var3.getClass();
                            xii0 xii0Var6 = z4 ? fot0Var3.p : fot0Var3.q;
                            xii0Var6.getClass();
                            wii0Var.a(xii0Var6);
                        }
                        return wii0Var;
                    case 3:
                        n0o0 n0o0Var = zii0Var.e;
                        if (((wii0) n0o0Var.getValue()).c()) {
                            return ((wii0) n0o0Var.getValue()).b();
                        }
                        jf4.n("Check failed.");
                        return null;
                    default:
                        n0o0 n0o0Var2 = zii0Var.f;
                        if (!((wii0) zii0Var.e.getValue()).c()) {
                            jf4.n("Check failed.");
                            return null;
                        }
                        a55 a55Var = ((xii0) n0o0Var2.getValue()).b;
                        if (a55Var != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List listB4 = ((xii0) n0o0Var2.getValue()).b();
                            listB4.getClass();
                            arrayList5.addAll(listB4);
                            hzj hzjVar2 = a55Var.f252a;
                            hzjVar2.getClass();
                            arrayList5.add(hzjVar2);
                            List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (listUnmodifiableList != null) {
                                return listUnmodifiableList;
                            }
                        }
                        return ((xii0) n0o0Var2.getValue()).b();
                }
            }
        });
    }

    public final void a(hzj hzjVar) {
        yje yjeVar;
        Object next;
        xii0 xii0Var;
        hzjVar.getClass();
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Unavailable " + hzjVar + ", notify SessionConfig invalid");
        }
        Iterator it = this.f44440a.iterator();
        do {
            yjeVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            fot0 fot0Var = (fot0) next;
            fot0Var.getClass();
            xii0Var = this.b ? fot0Var.p : fot0Var.q;
            xii0Var.getClass();
        } while (!xii0Var.b().contains(hzjVar));
        fot0 fot0Var2 = (fot0) next;
        xii0 xii0Var2 = fot0Var2 != null ? fot0Var2.p : null;
        rwj rwjVar = tvk.f34603a;
        qjj.W(d5c.a(ys10.f43147a.x()), null, null, new tmg0(xii0Var2, yjeVar, (byte) 6), 3);
    }
}
