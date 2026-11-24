package a;

import android.media.RingtoneManager;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ned0 extends w46 {
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final lbu b;
    public final qu c;
    public final ix0 d;
    public final rpt e;
    public final rou f;
    public final pru g;
    public final iqt h;
    public final mne i;
    public final vpt j;
    public final vpt k;
    public final k9u l;
    public final k9u m;
    public final vpt n;
    public final upt o;
    public final k9u p;
    public final x4u q;
    public final vpt r;
    public final iw20 s;
    public final n4u t;
    public final hru u;
    public final vpt v;
    public final sd60 w;
    public final i1w0 x;
    public final duj y;
    public final ol60 z;

    public ned0(lbu lbuVar, qu quVar, ix0 ix0Var, rpt rptVar, rou rouVar, pru pruVar, iqt iqtVar, mne mneVar, vpt vptVar, vpt vptVar2, k9u k9uVar, k9u k9uVar2, vpt vptVar3, upt uptVar, k9u k9uVar3, x4u x4uVar, vpt vptVar4, iw20 iw20Var, n4u n4uVar, hru hruVar, vpt vptVar5, sd60 sd60Var, i1w0 i1w0Var, duj dujVar) {
        i1w0Var.getClass();
        this.b = lbuVar;
        this.c = quVar;
        this.d = ix0Var;
        this.e = rptVar;
        this.f = rouVar;
        this.g = pruVar;
        this.h = iqtVar;
        this.i = mneVar;
        this.j = vptVar;
        this.k = vptVar2;
        this.l = k9uVar;
        this.m = k9uVar2;
        this.n = vptVar3;
        this.o = uptVar;
        this.p = k9uVar3;
        this.q = x4uVar;
        this.r = vptVar4;
        this.s = iw20Var;
        this.t = n4uVar;
        this.u = hruVar;
        this.v = vptVar5;
        this.w = sd60Var;
        this.x = i1w0Var;
        this.y = dujVar;
        this.z = new ol60(3);
        String path = RingtoneManager.getDefaultUri(2).getPath();
        if (path == null && (path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath()) == null) {
            path = "";
        }
        this.A = path;
        this.B = vptVar2.a();
        this.C = k9uVar.b();
        this.D = n4uVar.f();
        this.E = x4uVar.c(path);
    }

    public final void w() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(a760.f350a, new Pair(Boolean.valueOf(this.B), Boolean.valueOf(this.k.a())));
        linkedHashMap.put(a760.b, new Pair(Boolean.valueOf(this.C), Boolean.valueOf(this.l.b())));
        linkedHashMap.put(a760.c, new Pair(Boolean.valueOf(this.D), Boolean.valueOf(this.t.f())));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair = (Pair) entry.getValue();
            if (((Boolean) pair.f46059a).booleanValue() != ((Boolean) pair.b).booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(wp20.a(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Boolean bool = (Boolean) ((Pair) entry2.getValue()).b;
            bool.getClass();
            linkedHashMap3.put(key, bool);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
        if (!Intrinsics.d(this.E, this.q.c(this.A))) {
            linkedHashMap4.put(a760.d, Boolean.TRUE);
        }
        if (!linkedHashMap4.isEmpty()) {
            ArrayList arrayList = new ArrayList(linkedHashMap4.size());
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                a760 a760Var = (a760) entry3.getKey();
                boolean zBooleanValue = ((Boolean) entry3.getValue()).booleanValue();
                int iOrdinal = a760Var.ordinal();
                if (iOrdinal == 0) {
                    str = zBooleanValue ? "sports_on" : "sports_off";
                } else if (iOrdinal == 1) {
                    str = zBooleanValue ? "fav_games_on" : "fav_games_off";
                } else if (iOrdinal == 2) {
                    str = zBooleanValue ? "light_on" : "light_off";
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    str = "sound_choose";
                }
                arrayList.add(str);
            }
            qu quVar = this.c;
            quVar.getClass();
            quVar.f29324a.a("acc_settings_push_set", wp20.b(new Pair("option", arrayList)));
            ix0 ix0Var = this.d;
            ix0Var.getClass();
            ix0Var.f15516a.a(cui0.b(new j1p(CollectionsKt.b0(arrayList, null, null, null, null, 63), (byte) 0)), 11288L);
        }
        i1w0 i1w0Var = this.x;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void x(ked0 ked0Var) {
        sac.V(jiu0.a(this), new ljc0((byte) 22), null, this.i.f22085a, new s9c0(this, ked0Var, null, (byte) 10), 10);
    }

    public final void y(boolean z) {
        if (this.u.i() || !z) {
            ((q7d0) ((nw20) this.m.f17932a.b).f24215a).d("PUSH_TRACKING_FAVORITES", z);
        } else {
            x(new hed0(eed0.b));
        }
    }

    public final void z(boolean z) {
        if (!this.u.i() && z) {
            x(new hed0(eed0.f7667a));
            return;
        }
        this.o.a(z);
        this.p.a(z);
        if (!z) {
            ((vwb0) ((nw20) this.v.f37823a.b).b).g("SWITCH_OFF_TIME_KEY", System.currentTimeMillis());
        }
        sac.V(jiu0.a(this), med0.f21640a, null, this.i.f22085a, new led0(this, null, (byte) 1), 10);
    }
}
