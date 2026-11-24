package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class udg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35477a;
    public boolean b;
    public final rcj c;
    public final pa80 d;
    public final List e;
    public final t1e f;
    public w7r g;

    public udg0(rcj rcjVar, pa80 pa80Var) {
        int i;
        t1e a2eVar;
        this.c = rcjVar;
        this.d = pa80Var;
        List list = rcjVar.e;
        ydg0 ydg0Var = rcjVar.g;
        qkn0 qkn0Var = rcjVar.c;
        String str = rcjVar.b;
        this.e = list == null ? iun.f15405a : list;
        spg0 spg0Var = rcjVar.p;
        if (spg0Var != null) {
            if (spg0Var instanceof q13) {
                a2eVar = new r13(new ehf0(this, spg0Var), str == null ? ":memory:" : str);
            } else if (str == null) {
                a2eVar = new a2e(new ehf0(this, spg0Var));
            } else {
                ehf0 ehf0Var = new ehf0(this, spg0Var);
                int iOrdinal = ydg0Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        e9d0.y(ydg0Var, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = ydg0Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    e9d0.y(ydg0Var, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                a2eVar = new a2e(ehf0Var, str, i);
            }
            this.f = a2eVar;
        } else {
            if (qkn0Var == null) {
                jf4.o("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            rkn0 rkn0VarL = qkn0Var.l(new m9c(rcjVar.f30242a, str, new y78(this, pa80Var.f26643a), false, false));
            rkn0VarL.getClass();
            roi0 roi0Var = new roi0();
            roi0Var.f30839a = rkn0VarL;
            this.f = new pkn0(roi0Var);
        }
        boolean z = ydg0Var == ydg0.b;
        rkn0 rkn0VarC = c();
        if (rkn0VarC != null) {
            rkn0VarC.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(qpg0 qpg0Var) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA busy_timeout");
        try {
            xpg0VarZ0.W0();
            long j = xpg0VarZ0.getLong(0);
            ay3.L(xpg0VarZ0, null);
            if (j < 3000) {
                n2x.x(qpg0Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public final void b(qpg0 qpg0Var) throws Throwable {
        Object g0g0Var;
        rcj rcjVar = this.c;
        ydg0 ydg0Var = rcjVar.g;
        ydg0 ydg0Var2 = ydg0.b;
        if (ydg0Var == ydg0Var2) {
            n2x.x(qpg0Var, "PRAGMA journal_mode = WAL");
        } else {
            n2x.x(qpg0Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (rcjVar.g == ydg0Var2) {
            n2x.x(qpg0Var, "PRAGMA synchronous = NORMAL");
        } else {
            n2x.x(qpg0Var, "PRAGMA synchronous = FULL");
        }
        a(qpg0Var);
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA user_version");
        try {
            xpg0VarZ0.W0();
            int i = (int) xpg0VarZ0.getLong(0);
            ay3.L(xpg0VarZ0, null);
            pa80 pa80Var = this.d;
            int i2 = pa80Var.f26643a;
            int i3 = pa80Var.f26643a;
            if (i != i2) {
                n2x.x(qpg0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    if (i == 0) {
                        d(qpg0Var);
                    } else {
                        e(qpg0Var, i, i3);
                    }
                    n2x.x(qpg0Var, "PRAGMA user_version = " + i3);
                    g0g0Var = Unit.f46060a;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (!(g0g0Var instanceof g0g0)) {
                    n2x.x(qpg0Var, "END TRANSACTION");
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    n2x.x(qpg0Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            f(qpg0Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ay3.L(xpg0VarZ0, th2);
                throw th3;
            }
        }
    }

    public final rkn0 c() {
        t1e t1eVar = this.f;
        pkn0 pkn0Var = t1eVar instanceof pkn0 ? (pkn0) t1eVar : null;
        if (pkn0Var != null) {
            return (rkn0) pkn0Var.f27144a.f30839a;
        }
        return null;
    }

    public final void d(qpg0 qpg0Var) {
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (xpg0VarZ0.W0() && xpg0VarZ0.getLong(0) == 0) {
                z = true;
            }
            ay3.L(xpg0VarZ0, null);
            pa80 pa80Var = this.d;
            pa80Var.a(qpg0Var);
            if (!z) {
                t40 t40VarW = pa80Var.w(qpg0Var);
                if (!t40VarW.b) {
                    e9d0.x(t40VarW.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            g(qpg0Var);
            pa80Var.s(qpg0Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((wdg0) it.next()).getClass();
                if (qpg0Var instanceof okn0) {
                    ((okn0) qpg0Var).f25413a.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[LOOP:4: B:9:0x001b->B:132:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    public final void e(qpg0 qpg0Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        Pair pair;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        boolean z2;
        qpg0Var.getClass();
        rcj rcjVar = this.c;
        ea70 ea70Var = rcjVar.d;
        if (i == i2) {
            iterable = iun.f15405a;
        } else {
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z3) {
                    if (i3 < i2) {
                        linkedHashMap = ea70Var.f7454a;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                pair = null;
                            } else {
                                pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                pair = null;
                            } else {
                                pair = new Pair(treeMap, treeMap.keySet());
                            }
                        }
                        if (pair == null) {
                            Map map = (Map) pair.f46059a;
                            it = ((Iterable) pair.b).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = ea70Var.f7454a;
                    if (z3) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            pair = null;
                        } else {
                            pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            pair = null;
                        } else {
                            pair = new Pair(treeMap, treeMap.keySet());
                        }
                    }
                    if (pair == null) {
                        Map map2 = (Map) pair.f46059a;
                        it = ((Iterable) pair.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z3) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        pa80 pa80Var = this.d;
        if (iterable != null) {
            pa80Var.v(qpg0Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((eg40) it2.next()).b(qpg0Var);
            }
            t40 t40VarW = pa80Var.w(qpg0Var);
            if (!t40VarW.b) {
                e9d0.x(t40VarW.c, "Migration didn't properly handle: ");
                return;
            } else {
                pa80Var.u(qpg0Var);
                g(qpg0Var);
                return;
            }
        }
        rcjVar.getClass();
        if (i <= i2 || !rcjVar.k) {
            Set set = rcjVar.l;
            if (!rcjVar.j || (set != null && set.contains(Integer.valueOf(i)))) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (rcjVar.o) {
            xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                lc00 lc00VarB = kotlin.collections.a.b();
                while (xpg0VarZ0.W0()) {
                    String strJ0 = xpg0VarZ0.J0(0);
                    if (!kotlin.text.c.x(strJ0, "sqlite_", false) && !strJ0.equals("android_metadata")) {
                        lc00VarB.add(new Pair(strJ0, Boolean.valueOf(Intrinsics.d(xpg0VarZ0.J0(1), "view"))));
                    }
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                ay3.L(xpg0VarZ0, null);
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    Pair pair2 = (Pair) pawVar.next();
                    String str = (String) pair2.f46059a;
                    if (((Boolean) pair2.b).booleanValue()) {
                        n2x.x(qpg0Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        n2x.x(qpg0Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ay3.L(xpg0VarZ0, th);
                    throw th2;
                }
            }
        } else {
            pa80Var.c(qpg0Var);
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((wdg0) it3.next()).getClass();
            if (qpg0Var instanceof okn0) {
                ((okn0) qpg0Var).f25413a.getClass();
            }
        }
        pa80Var.a(qpg0Var);
    }

    public final void f(qpg0 qpg0Var) throws Throwable {
        Object g0g0Var;
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = xpg0VarZ0.W0() && xpg0VarZ0.getLong(0) != 0;
            ay3.L(xpg0VarZ0, null);
            pa80 pa80Var = this.d;
            if (z) {
                xpg0 xpg0VarZ1 = qpg0Var.Z0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strJ0 = xpg0VarZ1.W0() ? xpg0VarZ1.J0(0) : null;
                    ay3.L(xpg0VarZ1, null);
                    if (!((String) pa80Var.b).equals(strJ0) && !((String) pa80Var.c).equals(strJ0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) pa80Var.b) + ", found: " + strJ0).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ay3.L(xpg0VarZ1, th);
                        throw th2;
                    }
                }
            } else {
                n2x.x(qpg0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    t40 t40VarW = pa80Var.w(qpg0Var);
                    if (!t40VarW.b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + t40VarW.c).toString());
                    }
                    pa80Var.u(qpg0Var);
                    g(qpg0Var);
                    g0g0Var = Unit.f46060a;
                    if (!(g0g0Var instanceof g0g0)) {
                        n2x.x(qpg0Var, "END TRANSACTION");
                    }
                    Throwable thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        n2x.x(qpg0Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th3);
                }
            }
            pa80Var.t(qpg0Var);
            for (wdg0 wdg0Var : this.e) {
                wdg0Var.getClass();
                if (qpg0Var instanceof okn0) {
                    wdg0Var.a(((okn0) qpg0Var).f25413a);
                }
            }
            this.f35477a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ay3.L(xpg0VarZ0, th4);
                throw th5;
            }
        }
    }

    public final void g(qpg0 qpg0Var) {
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n2x.x(qpg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.d.b) + "')");
    }

    public udg0(rcj rcjVar, wtf0 wtf0Var) {
        this.c = rcjVar;
        this.d = new qdg0(-1, "", "");
        List list = rcjVar.e;
        this.e = list == null ? iun.f15405a : list;
        CollectionsKt.r0(list == null ? iun.f15405a : list, new rdg0(new eme0(this, (byte) 22)));
        Executor executor = rcjVar.h;
        Executor executor2 = rcjVar.i;
        executor.getClass();
        executor2.getClass();
        throw new q660(null, 1, null);
    }
}
