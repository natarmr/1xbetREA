package a;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class glz {
    public final boolean b;
    public final w4p0 d;
    public int e;
    public boolean f;
    public boolean g;
    public lkz i;
    public final p7m0 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yk50 f11517a = new yk50((byte) 8);
    public cu c = new cu((byte) 19);
    public final ArrayList h = new ArrayList();

    public glz(clz clzVar, boolean z) {
        this.b = z;
        this.d = new w4p0(clzVar);
        lkz lkzVar = lkz.b;
        this.i = lkzVar;
        this.j = q7m0.a(lkzVar);
    }

    public final void a(blz blzVar) {
        zkz lz2Var;
        flz flzVar;
        clz clzVar;
        kkz kkzVar;
        blzVar.getClass();
        c("addObserver");
        lkz lkzVar = this.i;
        lkz lkzVar2 = lkz.f20223a;
        if (lkzVar != lkzVar2) {
            lkzVar2 = lkz.b;
        }
        flz flzVar2 = new flz();
        flzVar2.f9760a = lkzVar2;
        HashMap map = rlz.f30721a;
        boolean z = blzVar instanceof zkz;
        boolean z2 = blzVar instanceof qvj;
        byte b = 2;
        Object obj = null;
        byte b2 = 1;
        if (z && z2) {
            lz2Var = new lz2((qvj) blzVar, (zkz) blzVar, b2);
        } else if (z2) {
            lz2Var = new lz2((qvj) blzVar, obj, b2);
        } else if (z) {
            lz2Var = (zkz) blzVar;
        } else {
            Class<?> cls = blzVar.getClass();
            if (rlz.b(cls) == 2) {
                Object obj2 = rlz.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    rlz.a((Constructor) list.get(0), blzVar);
                    throw null;
                }
                int size = list.size();
                uit[] uitVarArr = new uit[size];
                if (size > 0) {
                    rlz.a((Constructor) list.get(0), blzVar);
                    throw null;
                }
                lz2Var = new ige0(uitVarArr, b);
            } else {
                lz2Var = new lz2(blzVar);
            }
        }
        flzVar2.b = lz2Var;
        cu cuVar = this.c;
        cuVar.getClass();
        hz40 hz40Var = (hz40) cuVar.b;
        l0p l0pVar = (l0p) hz40Var.g(blzVar);
        if (l0pVar != null) {
            flzVar = l0pVar.b;
        } else {
            l0p l0pVar2 = new l0p(blzVar, flzVar2);
            hz40Var.n(blzVar, l0pVar2);
            l0p l0pVar3 = (l0p) cuVar.d;
            if (l0pVar3 == null) {
                cuVar.c = l0pVar2;
                cuVar.d = l0pVar2;
            } else {
                l0pVar3.c = l0pVar2;
                l0pVar2.d = l0pVar3;
                cuVar.d = l0pVar2;
            }
            flzVar = null;
        }
        if (flzVar == null && (clzVar = (clz) ((WeakReference) this.d.b).get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            lkz lkzVarB = b(blzVar);
            this.e++;
            while (flzVar2.f9760a.compareTo(lkzVarB) < 0) {
                cu cuVar2 = this.c;
                cuVar2.getClass();
                if (!((hz40) cuVar2.b).c(blzVar)) {
                    break;
                }
                lkz lkzVar3 = flzVar2.f9760a;
                ArrayList arrayList = this.h;
                arrayList.add(lkzVar3);
                ikz ikzVar = kkz.Companion;
                lkz lkzVar4 = flzVar2.f9760a;
                ikzVar.getClass();
                lkzVar4.getClass();
                int iOrdinal = lkzVar4.ordinal();
                if (iOrdinal == 1) {
                    kkzVar = kkz.ON_CREATE;
                } else if (iOrdinal != 2) {
                    kkzVar = iOrdinal != 3 ? null : kkz.ON_RESUME;
                } else {
                    kkzVar = kkz.ON_START;
                }
                if (kkzVar == null) {
                    hny.w(flzVar2.f9760a, "no event up from ");
                    return;
                } else {
                    flzVar2.a(clzVar, kkzVar);
                    w3d.A(arrayList);
                    lkzVarB = b(blzVar);
                }
            }
            if (!z3) {
                h();
            }
            this.e--;
        }
    }

    public final lkz b(blz blzVar) {
        cu cuVar = this.c;
        cuVar.getClass();
        blzVar.getClass();
        l0p l0pVar = (l0p) ((hz40) cuVar.b).g(blzVar);
        l0p l0pVar2 = l0pVar != null ? l0pVar.d : null;
        lkz lkzVar = l0pVar2 != null ? l0pVar2.b.f9760a : null;
        ArrayList arrayList = this.h;
        lkz lkzVar2 = arrayList.isEmpty() ? null : (lkz) dw9.l(1, arrayList);
        lkz lkzVar3 = this.i;
        if (lkzVar == null || lkzVar.compareTo(lkzVar3) >= 0) {
            lkzVar = lkzVar3;
        }
        return (lkzVar2 == null || lkzVar2.compareTo(lkzVar) >= 0) ? lkzVar : lkzVar2;
    }

    public final void c(String str) {
        if (this.b) {
            vxj vxjVar = fw3.y().f10239a;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            c99.v(kng0.l("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(kkz kkzVar) {
        kkzVar.getClass();
        c("handleLifecycleEvent");
        e(kkzVar.a());
    }

    public final void e(lkz lkzVar) {
        if (this.i == lkzVar) {
            return;
        }
        clz clzVar = (clz) ((WeakReference) this.d.b).get();
        lkz lkzVar2 = this.i;
        if (lkzVar2 == lkz.b && lkzVar == lkz.f20223a) {
            throw new IllegalStateException(("State must be at least '" + lkz.c + "' to be moved to '" + lkzVar + "' in component " + clzVar).toString());
        }
        lkz lkzVar3 = lkz.f20223a;
        if (lkzVar2 == lkzVar3 && lkzVar2 != lkzVar) {
            throw new IllegalStateException(("State is '" + lkzVar3 + "' and cannot be moved to `" + lkzVar + "` in component " + clzVar).toString());
        }
        this.i = lkzVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.i == lkzVar3) {
            this.c = new cu((byte) 19);
        }
    }

    public final void f(blz blzVar) {
        blzVar.getClass();
        c("removeObserver");
        cu cuVar = this.c;
        cuVar.getClass();
        l0p l0pVar = (l0p) ((hz40) cuVar.b).l(blzVar);
        if (l0pVar == null) {
            return;
        }
        l0p l0pVar2 = l0pVar.d;
        l0p l0pVar3 = l0pVar.c;
        if (l0pVar2 == null) {
            cuVar.c = l0pVar3;
        } else {
            l0pVar2.c = l0pVar3;
        }
        l0p l0pVar4 = l0pVar.c;
        if (l0pVar4 == null) {
            cuVar.d = l0pVar2;
        } else {
            l0pVar4.d = l0pVar2;
        }
        l0pVar.e = true;
    }

    public final void g(lkz lkzVar) {
        lkzVar.getClass();
        c("setCurrentState");
        e(lkzVar);
    }

    public final void h() {
        Object obj = ((WeakReference) this.d.b).get();
        if (obj == null) {
            jf4.n("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final clz clzVar = (clz) obj;
        while (true) {
            cu cuVar = this.c;
            final byte b = 0;
            if (((hz40) cuVar.b).e == 0) {
                break;
            }
            l0p l0pVar = (l0p) cuVar.c;
            if (l0pVar == null) {
                v4i0.o("Collection is empty.");
                return;
            }
            lkz lkzVar = l0pVar.b.f9760a;
            l0p l0pVar2 = (l0p) cuVar.d;
            if (l0pVar2 == null) {
                v4i0.o("Collection is empty.");
                return;
            }
            lkz lkzVar2 = l0pVar2.b.f9760a;
            if (lkzVar == lkzVar2 && this.i == lkzVar2) {
                break;
            }
            this.g = false;
            lkz lkzVar3 = this.i;
            if (l0pVar == null) {
                v4i0.o("Collection is empty.");
                return;
            }
            if (lkzVar3.compareTo(lkzVar) < 0) {
                cu cuVar2 = this.c;
                Function1 function1 = new Function1(this) { // from class: a.elz
                    public final /* synthetic */ glz b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        kkz kkzVar;
                        kkz kkzVar2;
                        byte b2 = b;
                        clz clzVar2 = clzVar;
                        glz glzVar = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b2) {
                            case 0:
                                entry.getClass();
                                blz blzVar = (blz) entry.getKey();
                                flz flzVar = (flz) entry.getValue();
                                while (true) {
                                    lkz lkzVar4 = flzVar.f9760a;
                                    lkz lkzVar5 = glzVar.i;
                                    ArrayList arrayList = glzVar.h;
                                    if (lkzVar4.compareTo(lkzVar5) > 0 && !glzVar.g) {
                                        cu cuVar3 = glzVar.c;
                                        cuVar3.getClass();
                                        blzVar.getClass();
                                        if (((hz40) cuVar3.b).c(blzVar)) {
                                            ikz ikzVar = kkz.Companion;
                                            lkz lkzVar6 = flzVar.f9760a;
                                            ikzVar.getClass();
                                            lkzVar6.getClass();
                                            int iOrdinal = lkzVar6.ordinal();
                                            if (iOrdinal == 2) {
                                                kkzVar = kkz.ON_DESTROY;
                                            } else if (iOrdinal != 3) {
                                                kkzVar = iOrdinal != 4 ? null : kkz.ON_PAUSE;
                                            } else {
                                                kkzVar = kkz.ON_STOP;
                                            }
                                            if (kkzVar == null) {
                                                hny.t(flzVar.f9760a, "no event down from ");
                                                return null;
                                            }
                                            arrayList.add(kkzVar.a());
                                            flzVar.a(clzVar2, kkzVar);
                                            w3d.A(arrayList);
                                        }
                                    }
                                    return Unit.f46060a;
                                }
                            default:
                                entry.getClass();
                                blz blzVar2 = (blz) entry.getKey();
                                flz flzVar2 = (flz) entry.getValue();
                                while (true) {
                                    lkz lkzVar7 = flzVar2.f9760a;
                                    lkz lkzVar8 = glzVar.i;
                                    ArrayList arrayList2 = glzVar.h;
                                    if (lkzVar7.compareTo(lkzVar8) < 0 && !glzVar.g) {
                                        cu cuVar4 = glzVar.c;
                                        cuVar4.getClass();
                                        blzVar2.getClass();
                                        if (((hz40) cuVar4.b).c(blzVar2)) {
                                            arrayList2.add(flzVar2.f9760a);
                                            ikz ikzVar2 = kkz.Companion;
                                            lkz lkzVar9 = flzVar2.f9760a;
                                            ikzVar2.getClass();
                                            lkzVar9.getClass();
                                            int iOrdinal2 = lkzVar9.ordinal();
                                            if (iOrdinal2 == 1) {
                                                kkzVar2 = kkz.ON_CREATE;
                                            } else if (iOrdinal2 != 2) {
                                                kkzVar2 = iOrdinal2 != 3 ? null : kkz.ON_RESUME;
                                            } else {
                                                kkzVar2 = kkz.ON_START;
                                            }
                                            if (kkzVar2 == null) {
                                                hny.t(flzVar2.f9760a, "no event up from ");
                                                return null;
                                            }
                                            flzVar2.a(clzVar2, kkzVar2);
                                            w3d.A(arrayList2);
                                        }
                                    }
                                }
                                return Unit.f46060a;
                        }
                    }
                };
                cuVar2.getClass();
                for (l0p l0pVar3 = (l0p) cuVar2.d; l0pVar3 != null; l0pVar3 = l0pVar3.d) {
                    if (!l0pVar3.e) {
                        function1.invoke(l0pVar3);
                    }
                }
            }
            l0p l0pVar4 = (l0p) this.c.d;
            if (!this.g && l0pVar4 != null && this.i.compareTo(l0pVar4.b.f9760a) > 0) {
                cu cuVar3 = this.c;
                final byte b2 = 1;
                Function1 function2 = new Function1(this) { // from class: a.elz
                    public final /* synthetic */ glz b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        kkz kkzVar;
                        kkz kkzVar2;
                        byte b3 = b2;
                        clz clzVar2 = clzVar;
                        glz glzVar = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b3) {
                            case 0:
                                entry.getClass();
                                blz blzVar = (blz) entry.getKey();
                                flz flzVar = (flz) entry.getValue();
                                while (true) {
                                    lkz lkzVar4 = flzVar.f9760a;
                                    lkz lkzVar5 = glzVar.i;
                                    ArrayList arrayList = glzVar.h;
                                    if (lkzVar4.compareTo(lkzVar5) > 0 && !glzVar.g) {
                                        cu cuVar4 = glzVar.c;
                                        cuVar4.getClass();
                                        blzVar.getClass();
                                        if (((hz40) cuVar4.b).c(blzVar)) {
                                            ikz ikzVar = kkz.Companion;
                                            lkz lkzVar6 = flzVar.f9760a;
                                            ikzVar.getClass();
                                            lkzVar6.getClass();
                                            int iOrdinal = lkzVar6.ordinal();
                                            if (iOrdinal == 2) {
                                                kkzVar = kkz.ON_DESTROY;
                                            } else if (iOrdinal != 3) {
                                                kkzVar = iOrdinal != 4 ? null : kkz.ON_PAUSE;
                                            } else {
                                                kkzVar = kkz.ON_STOP;
                                            }
                                            if (kkzVar == null) {
                                                hny.t(flzVar.f9760a, "no event down from ");
                                                return null;
                                            }
                                            arrayList.add(kkzVar.a());
                                            flzVar.a(clzVar2, kkzVar);
                                            w3d.A(arrayList);
                                        }
                                    }
                                    return Unit.f46060a;
                                }
                            default:
                                entry.getClass();
                                blz blzVar2 = (blz) entry.getKey();
                                flz flzVar2 = (flz) entry.getValue();
                                while (true) {
                                    lkz lkzVar7 = flzVar2.f9760a;
                                    lkz lkzVar8 = glzVar.i;
                                    ArrayList arrayList2 = glzVar.h;
                                    if (lkzVar7.compareTo(lkzVar8) < 0 && !glzVar.g) {
                                        cu cuVar5 = glzVar.c;
                                        cuVar5.getClass();
                                        blzVar2.getClass();
                                        if (((hz40) cuVar5.b).c(blzVar2)) {
                                            arrayList2.add(flzVar2.f9760a);
                                            ikz ikzVar2 = kkz.Companion;
                                            lkz lkzVar9 = flzVar2.f9760a;
                                            ikzVar2.getClass();
                                            lkzVar9.getClass();
                                            int iOrdinal2 = lkzVar9.ordinal();
                                            if (iOrdinal2 == 1) {
                                                kkzVar2 = kkz.ON_CREATE;
                                            } else if (iOrdinal2 != 2) {
                                                kkzVar2 = iOrdinal2 != 3 ? null : kkz.ON_RESUME;
                                            } else {
                                                kkzVar2 = kkz.ON_START;
                                            }
                                            if (kkzVar2 == null) {
                                                hny.t(flzVar2.f9760a, "no event up from ");
                                                return null;
                                            }
                                            flzVar2.a(clzVar2, kkzVar2);
                                            w3d.A(arrayList2);
                                        }
                                    }
                                }
                                return Unit.f46060a;
                        }
                    }
                };
                cuVar3.getClass();
                for (l0p l0pVar5 = (l0p) cuVar3.c; l0pVar5 != null; l0pVar5 = l0pVar5.c) {
                    if (!l0pVar5.e) {
                        function2.invoke(l0pVar5);
                    }
                }
            }
        }
        this.g = false;
        this.j.n(this.i);
    }
}
