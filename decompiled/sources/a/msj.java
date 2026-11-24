package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class msj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22322a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public msj(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.f22322a = 2;
        this.b = 2;
    }

    public void a(xhe0 xhe0Var, boolean z) {
        RecyclerView.q(xhe0Var);
        View view = xhe0Var.f40887a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        zhe0 zhe0Var = recyclerView.O1;
        if (zhe0Var != null) {
            yhe0 yhe0Var = zhe0Var.e;
            rgu0.o(view, yhe0Var != null ? (p6) yhe0Var.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                hny.b();
                return;
            }
            yge0 yge0Var = recyclerView.m;
            if (yge0Var != null) {
                yge0Var.u(xhe0Var);
            }
            if (recyclerView.H1 != null) {
                recyclerView.g.p(xhe0Var);
            }
            if (RecyclerView.e2) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + xhe0Var);
            }
        }
        xhe0Var.s = null;
        xhe0Var.r = null;
        nhe0 nhe0VarD = d();
        nhe0VarD.getClass();
        int i = xhe0Var.f;
        ArrayList arrayList2 = nhe0VarD.b(i).f21789a;
        if (((mhe0) nhe0VarD.f23528a.get(i)).b <= arrayList2.size()) {
            b8k0.y(view);
        } else if (RecyclerView.d2 && arrayList2.contains(xhe0Var)) {
            jf4.o("this scrap item already exists");
        } else {
            xhe0Var.p();
            arrayList2.add(xhe0Var);
        }
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        the0 the0Var = recyclerView.H1;
        if (i >= 0 && i < the0Var.b()) {
            return !the0Var.g ? i : recyclerView.e.u(i, 0);
        }
        StringBuilder sbM = b1j.m(i, "invalid position ", ". State item count is ");
        sbM.append(the0Var.b());
        sbM.append(recyclerView.H());
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public msj c(k34 k34Var) {
        return new msj((androidx.media3.common.b) this.c, (androidx.media3.common.b) this.d, this.f22322a, this.b, k34Var, (p34) this.f, (bmq0) this.g, this.h);
    }

    public nhe0 d() {
        if (((nhe0) this.g) == null) {
            this.g = new nhe0();
            g();
        }
        return (nhe0) this.g;
    }

    public View e(int i) {
        return o(i, Long.MAX_VALUE).f40887a;
    }

    public boolean f() {
        return Objects.equals(((androidx.media3.common.b) this.c).p, "audio/raw");
    }

    public void g() {
        RecyclerView recyclerView;
        yge0 yge0Var;
        nhe0 nhe0Var = (nhe0) this.g;
        if (nhe0Var == null || (yge0Var = (recyclerView = (RecyclerView) this.h).m) == null || !recyclerView.s) {
            return;
        }
        nhe0Var.c.add(yge0Var);
    }

    public void h(yge0 yge0Var, boolean z) {
        nhe0 nhe0Var = (nhe0) this.g;
        if (nhe0Var != null) {
            SparseArray sparseArray = nhe0Var.f23528a;
            Set set = nhe0Var.c;
            set.remove(yge0Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((mhe0) sparseArray.get(sparseArray.keyAt(i))).f21789a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    b8k0.y(((xhe0) arrayList.get(i2)).f40887a);
                }
            }
        }
    }

    public void i() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j(size);
        }
        arrayList.clear();
        if (RecyclerView.i2) {
            yjc yjcVar = ((RecyclerView) this.h).G1;
            int[] iArr = yjcVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            yjcVar.d = 0;
        }
    }

    public void j(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (RecyclerView.e2) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        xhe0 xhe0Var = (xhe0) arrayList.get(i);
        if (RecyclerView.e2) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + xhe0Var);
        }
        a(xhe0Var, true);
        arrayList.remove(i);
    }

    public void k(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        xhe0 xhe0VarX = RecyclerView.X(view);
        if (xhe0VarX.m()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (xhe0VarX.l()) {
            xhe0VarX.n.p(xhe0VarX);
        } else if (xhe0VarX.s()) {
            xhe0VarX.j &= -33;
        }
        l(xhe0VarX);
        if (recyclerView.p1 == null || xhe0VarX.j()) {
            return;
        }
        recyclerView.p1.d(xhe0VarX);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[LOOP:2: B:64:0x00d0->B:68:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00de A[EDGE_INSN: B:93:0x00de->B:69:0x00de BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00d8, LOOP_LABEL: LOOP:1: B:60:0x00bd->B:67:0x00d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00de A[EDGE_INSN: B:95:0x00de->B:69:0x00de BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00d8], SYNTHETIC] */
    public void l(xhe0 xhe0Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        yjc yjcVar = recyclerView.G1;
        boolean zL = xhe0Var.l();
        View view = xhe0Var.f40887a;
        boolean z3 = false;
        boolean z4 = true;
        if (zL || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(xhe0Var.l());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.H());
            throw new IllegalArgumentException(sb.toString());
        }
        if (xhe0Var.m()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(xhe0Var);
            c99.q(sb2, recyclerView.H());
            return;
        }
        if (xhe0Var.r()) {
            jf4.o("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.H()));
            return;
        }
        if ((xhe0Var.j & 16) == 0) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        yge0 yge0Var = recyclerView.m;
        boolean z5 = yge0Var != null && z && yge0Var.r(xhe0Var);
        if (RecyclerView.d2 && arrayList.contains(xhe0Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(xhe0Var);
            c99.q(sb3, recyclerView.H());
            return;
        }
        if (z5 || xhe0Var.j()) {
            if (this.b <= 0 || (xhe0Var.j & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.b && size > 0) {
                    j(0);
                    size--;
                }
                if (RecyclerView.i2 && size > 0) {
                    int i5 = xhe0Var.c;
                    if (yjcVar.c != null) {
                        int i6 = yjcVar.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((xhe0) arrayList.get(i)).c;
                                    if (yjcVar.c != null) {
                                        break;
                                    }
                                    i3 = yjcVar.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (yjcVar.c[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (yjcVar.c[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((xhe0) arrayList.get(i)).c;
                            if (yjcVar.c != null) {
                                break;
                                break;
                            }
                            i3 = yjcVar.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (yjcVar.c[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, xhe0Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(xhe0Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.e2) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.H()));
            }
            z4 = false;
        }
        recyclerView.g.p(xhe0Var);
        if (z3 || z4 || !z) {
            return;
        }
        b8k0.y(view);
        xhe0Var.s = null;
        xhe0Var.r = null;
    }

    public void m(View view) {
        ehe0 ehe0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        xhe0 xhe0VarX = RecyclerView.X(view);
        if ((xhe0VarX.j & 12) == 0 && xhe0VarX.n() && (ehe0Var = recyclerView.p1) != null) {
            kvj kvjVar = (kvj) ehe0Var;
            if (xhe0VarX.f().isEmpty() && kvjVar.g && !xhe0VarX.i()) {
                ArrayList arrayList = (ArrayList) this.d;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.d = arrayList;
                }
                xhe0VarX.n = this;
                xhe0VarX.o = true;
                arrayList.add(xhe0VarX);
                return;
            }
        }
        if (xhe0VarX.i() && !xhe0VarX.k() && !recyclerView.m.b) {
            jf4.o("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.H()));
            return;
        }
        xhe0VarX.n = this;
        xhe0VarX.o = false;
        ((ArrayList) this.c).add(xhe0VarX);
    }

    public boolean n(xhe0 xhe0Var, int i, int i2, long j) {
        p6 p6Var = null;
        xhe0Var.s = null;
        View view = xhe0Var.f40887a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        xhe0Var.r = recyclerView;
        int i3 = xhe0Var.f;
        long nanoTime = recyclerView.getNanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = ((nhe0) this.g).b(i3).d;
            if (j2 != 0 && j2 + nanoTime >= j) {
                return false;
            }
        }
        if (xhe0Var.m()) {
            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
            z = true;
        }
        recyclerView.m.a(xhe0Var, i);
        if (z) {
            recyclerView.detachViewFromParent(view);
        }
        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
        mhe0 mhe0VarB = ((nhe0) this.g).b(xhe0Var.f);
        long j3 = mhe0VarB.d;
        if (j3 != 0) {
            nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
        }
        mhe0VarB.d = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.B;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            zhe0 zhe0Var = recyclerView.O1;
            if (zhe0Var != null) {
                yhe0 yhe0Var = zhe0Var.e;
                if (yhe0Var != null) {
                    View.AccessibilityDelegate accessibilityDelegateE = rgu0.e(view);
                    if (accessibilityDelegateE != null) {
                        p6Var = accessibilityDelegateE instanceof o6 ? ((o6) accessibilityDelegateE).f24709a : new p6(accessibilityDelegateE);
                    }
                    if (p6Var != null && p6Var != yhe0Var) {
                        yhe0Var.e.put(view, p6Var);
                    }
                }
                rgu0.o(view, yhe0Var);
            }
        }
        if (recyclerView.H1.g) {
            xhe0Var.g = i2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:188:0x0363 A[EDGE_INSN: B:188:0x0363->B:189:0x0364 BREAK  A[LOOP:3: B:183:0x034b->B:187:0x0360]] */
    /* JADX WARN: Code duplicated, block: B:251:0x047f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0489  */
    /* JADX WARN: Code duplicated, block: B:254:0x048f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0499  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[EDGE_INSN: B:36:0x0096->B:37:0x009a BREAK  A[LOOP:0: B:14:0x0031->B:20:0x0050]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public xhe0 o(int i, long j) {
        xhe0 xhe0Var;
        boolean z;
        boolean z2;
        xhe0 xhe0Var2;
        xhe0 xhe0Var3;
        xhe0 xhe0VarB;
        boolean z3;
        boolean zN;
        ViewGroup.LayoutParams layoutParams;
        hhe0 hhe0Var;
        String str;
        xhe0 xhe0Var4;
        String str2;
        RecyclerView recyclerViewN;
        xhe0 xhe0Var5;
        xhe0 xhe0Var6;
        xhe0 xhe0Var7;
        View view;
        xhe0 xhe0Var8;
        xhe0 xhe0Var9;
        boolean z4;
        xhe0 xhe0Var10;
        xhe0 xhe0Var11;
        int size;
        int iU;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        the0 the0Var = recyclerView.H1;
        if (i < 0 || i >= the0Var.b()) {
            StringBuilder sbT = dw9.t("Invalid item position ", i, Separators.LPAREN, "). Item count:", i);
            sbT.append(the0Var.b());
            sbT.append(recyclerView.H());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (the0Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (recyclerView.m.b && (iU = recyclerView.e.u(i, 0)) > 0 && iU < recyclerView.m.d()) {
                            long jE = recyclerView.m.e(iU);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    xhe0Var10 = null;
                                    z = true;
                                    xhe0Var11 = null;
                                    break;
                                }
                                xhe0 xhe0Var12 = (xhe0) ((ArrayList) this.d).get(i3);
                                if (!xhe0Var12.s()) {
                                    xhe0Var10 = null;
                                    z = true;
                                    if (xhe0Var12.e == jE) {
                                        xhe0Var12.b(32);
                                        xhe0Var11 = xhe0Var12;
                                        break;
                                    }
                                }
                                i3++;
                            }
                        } else {
                            xhe0Var10 = null;
                            z = true;
                            xhe0Var11 = null;
                            break;
                        }
                    } else {
                        xhe0 xhe0Var13 = (xhe0) ((ArrayList) this.d).get(i2);
                        if (!xhe0Var13.s() && xhe0Var13.e() == i) {
                            xhe0Var13.b(32);
                            xhe0Var10 = null;
                            z = true;
                            xhe0Var11 = xhe0Var13;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                xhe0Var10 = null;
                z = true;
                xhe0Var11 = null;
                break;
            }
            if (xhe0Var11 != null) {
                z2 = z;
                xhe0Var2 = xhe0Var11;
                xhe0Var = xhe0Var10;
            } else {
                z2 = false;
                xhe0Var2 = xhe0Var11;
                xhe0Var = xhe0Var10;
            }
        } else {
            xhe0Var = null;
            z = true;
            z2 = false;
            xhe0Var2 = null;
        }
        String str3 = "RecyclerView";
        if (xhe0Var2 == null) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ArrayList arrayList4 = recyclerView.f.c;
                    int size3 = arrayList4.size();
                    int i5 = 0;
                    xhe0 xhe0Var14 = xhe0Var;
                    while (true) {
                        if (i5 >= size3) {
                            xhe0Var7 = xhe0Var14;
                            view = xhe0Var14;
                            break;
                        }
                        View view2 = (View) arrayList4.get(i5);
                        xhe0 xhe0VarX = RecyclerView.X(view2);
                        xhe0 xhe0Var15 = xhe0Var14;
                        if (xhe0VarX.e() == i && !xhe0VarX.i() && !xhe0VarX.k()) {
                            view = view2;
                            xhe0Var7 = xhe0Var15;
                            break;
                        }
                        i5++;
                        xhe0Var14 = xhe0Var15;
                    }
                    if (view == null) {
                        int size4 = arrayList2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                xhe0Var8 = xhe0Var7;
                                xhe0Var9 = xhe0Var7;
                                break;
                            }
                            xhe0 xhe0Var16 = (xhe0) arrayList2.get(i6);
                            if (!xhe0Var16.i() && xhe0Var16.e() == i && !xhe0Var16.g()) {
                                arrayList2.remove(i6);
                                xhe0Var8 = xhe0Var16;
                                xhe0Var9 = xhe0Var7;
                                if (!RecyclerView.e2) {
                                    break;
                                }
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + xhe0Var16);
                                xhe0Var8 = xhe0Var16;
                                xhe0Var9 = xhe0Var7;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        xhe0 xhe0VarX2 = RecyclerView.X(view);
                        iac iacVar = recyclerView.f;
                        hac hacVar = iacVar.b;
                        int iIndexOfChild = ((RecyclerView) iacVar.f14431a.b).indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            e9d0.i(view, "view is not a child, cannot hide ");
                            return xhe0Var7;
                        }
                        if (!hacVar.t(iIndexOfChild)) {
                            e9d0.r(view, "trying to unhide a view that was not hidden");
                            return xhe0Var7;
                        }
                        hacVar.p(iIndexOfChild);
                        iacVar.l(view);
                        int iJ = recyclerView.f.j(view);
                        if (iJ == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(xhe0VarX2);
                            itt0.n(sb, recyclerView.H());
                            return xhe0Var7;
                        }
                        recyclerView.f.c(iJ);
                        m(view);
                        xhe0VarX2.b(8224);
                        xhe0Var8 = xhe0VarX2;
                        xhe0Var9 = xhe0Var7;
                        break;
                    }
                } else {
                    xhe0 xhe0Var17 = (xhe0) arrayList.get(i4);
                    if (!xhe0Var17.s() && xhe0Var17.e() == i && !xhe0Var17.i() && (the0Var.g || !xhe0Var17.k())) {
                        xhe0Var17.b(32);
                        xhe0Var9 = xhe0Var;
                        xhe0Var8 = xhe0Var17;
                        break;
                    }
                    i4++;
                }
            }
            if (xhe0Var8 != null) {
                if (!xhe0Var8.k()) {
                    int i7 = xhe0Var8.c;
                    if (i7 < 0 || i7 >= recyclerView.m.d()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + xhe0Var8 + recyclerView.H());
                    }
                    if (the0Var.g || recyclerView.m.f(xhe0Var8.c) == xhe0Var8.f) {
                        yge0 yge0Var = recyclerView.m;
                        if (!yge0Var.b || xhe0Var8.e == yge0Var.e(xhe0Var8.c)) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                } else {
                    if (RecyclerView.d2 && !the0Var.g) {
                        jf4.n("should not receive a removed view unless it is pre layout".concat(recyclerView.H()));
                        return xhe0Var9;
                    }
                    z4 = the0Var.g;
                }
                if (z4) {
                    xhe0VarB = xhe0Var8;
                    z2 = z;
                    xhe0Var3 = xhe0Var9;
                } else {
                    xhe0Var8.b(4);
                    if (xhe0Var8.l()) {
                        recyclerView.removeDetachedView(xhe0Var8.f40887a, false);
                        xhe0Var8.n.p(xhe0Var8);
                    } else if (xhe0Var8.s()) {
                        xhe0Var8.j &= -33;
                    }
                    l(xhe0Var8);
                    xhe0VarB = xhe0Var9;
                    xhe0Var3 = xhe0Var9;
                }
            } else {
                xhe0VarB = xhe0Var8;
                xhe0Var3 = xhe0Var9;
            }
        } else {
            xhe0Var3 = xhe0Var;
            xhe0VarB = xhe0Var2;
        }
        if (xhe0VarB == null) {
            int iU2 = recyclerView.e.u(i, 0);
            if (iU2 < 0 || iU2 >= recyclerView.m.d()) {
                StringBuilder sbT2 = dw9.t("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iU2);
                sbT2.append(the0Var.b());
                sbT2.append(recyclerView.H());
                throw new IndexOutOfBoundsException(sbT2.toString());
            }
            int iF = recyclerView.m.f(iU2);
            yge0 yge0Var2 = recyclerView.m;
            if (yge0Var2.b) {
                long jE2 = yge0Var2.e(iU2);
                int size5 = arrayList.size() - 1;
                xhe0 xhe0Var18 = xhe0Var3;
                while (true) {
                    if (size5 < 0) {
                        str = str3;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                xhe0Var6 = (xhe0) arrayList2.get(size6);
                                long j2 = jE2;
                                if (xhe0Var6.e != j2 || xhe0Var6.g()) {
                                    size6--;
                                    jE2 = j2;
                                } else {
                                    if (iF == xhe0Var6.f) {
                                        arrayList2.remove(size6);
                                        break;
                                    }
                                    j(size6);
                                }
                            }
                            xhe0Var6 = null;
                            break;
                        }
                    }
                    xhe0 xhe0Var19 = (xhe0) arrayList.get(size5);
                    str = str3;
                    long j3 = xhe0Var19.e;
                    View view3 = xhe0Var19.f40887a;
                    if (j3 == jE2 && !xhe0Var19.s()) {
                        if (iF == xhe0Var19.f) {
                            xhe0Var19.b(32);
                            if (xhe0Var19.k() && !the0Var.g) {
                                xhe0Var19.j = (xhe0Var19.j & (-15)) | 2;
                            }
                            xhe0Var6 = xhe0Var19;
                            break;
                        }
                        arrayList.remove(size5);
                        recyclerView.removeDetachedView(view3, false);
                        xhe0 xhe0VarX3 = RecyclerView.X(view3);
                        xhe0VarX3.n = xhe0Var18;
                        xhe0VarX3.o = false;
                        xhe0VarX3.j &= -33;
                        l(xhe0VarX3);
                    }
                    size5--;
                    str3 = str;
                    xhe0Var18 = null;
                }
                if (xhe0Var6 != null) {
                    xhe0Var6.c = iU2;
                    xhe0Var4 = xhe0Var6;
                    z2 = z;
                } else {
                    xhe0Var4 = xhe0Var6;
                }
            } else {
                str = "RecyclerView";
                xhe0Var4 = xhe0VarB;
            }
            if (xhe0Var4 == null) {
                if (RecyclerView.e2) {
                    str2 = str;
                    Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                } else {
                    str2 = str;
                }
                mhe0 mhe0Var = (mhe0) d().f23528a.get(iF);
                if (mhe0Var == null) {
                    xhe0Var5 = null;
                    break;
                }
                ArrayList arrayList5 = mhe0Var.f21789a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            xhe0Var5 = null;
                            break;
                        }
                        if (!((xhe0) arrayList5.get(size7)).g()) {
                            xhe0Var5 = (xhe0) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    xhe0Var5 = null;
                    break;
                }
                if (xhe0Var5 != null) {
                    xhe0Var5.p();
                    boolean z5 = RecyclerView.d2;
                }
                xhe0VarB = xhe0Var5;
            } else {
                str2 = str;
                xhe0VarB = xhe0Var4;
            }
            if (xhe0VarB == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = ((nhe0) this.g).b(iF).c;
                    if (j4 != 0 && j4 + nanoTime >= j) {
                        return null;
                    }
                }
                xhe0VarB = recyclerView.m.b(recyclerView, iF);
                if (RecyclerView.i2 && (recyclerViewN = RecyclerView.N(xhe0VarB.f40887a)) != null) {
                    xhe0VarB.b = new WeakReference(recyclerViewN);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                mhe0 mhe0VarB = ((nhe0) this.g).b(iF);
                long j5 = mhe0VarB.c;
                if (j5 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                }
                mhe0VarB.c = nanoTime2;
                if (RecyclerView.e2) {
                    Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                }
            }
        }
        boolean z6 = z2;
        xhe0 xhe0Var20 = xhe0VarB;
        View view4 = xhe0Var20.f40887a;
        if (z6 && !the0Var.g) {
            int i8 = xhe0Var20.j;
            if ((i8 & 8192) != 0) {
                xhe0Var20.j = i8 & (-8193);
                if (the0Var.j) {
                    ehe0.b(xhe0Var20);
                    ehe0 ehe0Var = recyclerView.p1;
                    xhe0Var20.f();
                    ehe0Var.getClass();
                    eld0 eld0Var = new eld0((byte) 10);
                    eld0Var.b(xhe0Var20);
                    recyclerView.o0(xhe0Var20, eld0Var);
                }
            }
        }
        if (!the0Var.g || !xhe0Var20.h()) {
            if (!xhe0Var20.h() || (xhe0Var20.j & 2) != 0 || xhe0Var20.i()) {
                if (RecyclerView.d2 && xhe0Var20.k()) {
                    StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb2.append(xhe0Var20);
                    itt0.n(sb2, recyclerView.H());
                    return null;
                }
                z3 = false;
                zN = n(xhe0Var20, recyclerView.e.u(i, 0), i, j);
            }
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
                hhe0Var = (hhe0) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(hhe0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                hhe0Var = (hhe0) layoutParams;
            } else {
                hhe0Var = (hhe0) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(hhe0Var);
            }
            hhe0Var.f13060a = xhe0Var20;
            if (z6 && zN) {
                z3 = z;
            }
            hhe0Var.d = z3;
            return xhe0Var20;
        }
        xhe0Var20.g = i;
        zN = false;
        z3 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
            hhe0Var = (hhe0) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(hhe0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            hhe0Var = (hhe0) recyclerView.generateLayoutParams(layoutParams);
            view4.setLayoutParams(hhe0Var);
        } else {
            hhe0Var = (hhe0) layoutParams;
        }
        hhe0Var.f13060a = xhe0Var20;
        if (z6) {
            z3 = z;
        }
        hhe0Var.d = z3;
        return xhe0Var20;
    }

    public void p(xhe0 xhe0Var) {
        if (xhe0Var.o) {
            ((ArrayList) this.d).remove(xhe0Var);
        } else {
            ((ArrayList) this.c).remove(xhe0Var);
        }
        xhe0Var.n = null;
        xhe0Var.o = false;
        xhe0Var.j &= -33;
    }

    public void q() {
        ArrayList arrayList = (ArrayList) this.e;
        androidx.recyclerview.widget.b bVar = ((RecyclerView) this.h).n;
        this.b = this.f22322a + (bVar != null ? bVar.j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            j(size);
        }
    }

    public msj(androidx.media3.common.b bVar, androidx.media3.common.b bVar2, int i, int i2, k34 k34Var, p34 p34Var, bmq0 bmq0Var, Object obj) {
        this.c = bVar;
        this.d = bVar2;
        this.f22322a = i;
        this.b = i2;
        this.e = k34Var;
        this.f = p34Var;
        this.g = bmq0Var;
        this.h = obj;
    }
}
