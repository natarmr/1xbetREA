package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes3.dex */
public final class kki implements n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18441a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;

    public kki(p7l p7lVar, i8l i8lVar) {
        this.f18441a = (byte) 14;
        this.e = p7lVar;
        this.b = i8lVar;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new Rect();
        Iterator it = l1e0.o(0, 5).iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            ArrayList arrayList = (ArrayList) this.c;
            Context context = ((i8l) this.b).getContext();
            context.getClass();
            w6l w6lVar = new w6l(context);
            w6lVar.setHeroImage("");
            ((i8l) this.b).addView(w6lVar);
            p7l p7lVar2 = (p7l) this.e;
            int iB = si30.b(p7lVar2.p * p7lVar2.e);
            p7l p7lVar3 = (p7l) this.e;
            w6lVar.d(p7lVar3.q * p7lVar3.e, iB);
            arrayList.add(w6lVar);
        }
    }

    public fiu0 A() {
        iyk iykVar = new iyk(2);
        iykVar.b(ujp0.class, (msi) this.d);
        iykVar.b(hjp0.class, (msi) this.f);
        return new fiu0(iykVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(long j, h9n0 h9n0Var, zje zjeVar) throws Throwable {
        w8p w8pVar;
        Object g0g0Var;
        Integer num;
        if (zjeVar instanceof w8p) {
            w8pVar = (w8p) zjeVar;
            int i = w8pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8pVar.k = i - Integer.MIN_VALUE;
            } else {
                w8pVar = new w8p(this, zjeVar);
            }
        } else {
            w8pVar = new w8p(this, zjeVar);
        }
        w8p w8pVar2 = w8pVar;
        Object obj = w8pVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = w8pVar2.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                v8p v8pVar = (v8p) this.e;
                String strA = ((btt0) this.d).a();
                Boolean bool = h9n0Var instanceof e9n0 ? Boolean.TRUE : null;
                w8pVar2.k = 1;
                if (v8pVar.a(strA, j, bool, w8pVar2) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (!(thA instanceof zhi0)) {
            throw thA;
        }
        zhi0 zhi0Var = (zhi0) thA;
        uhi0 uhi0Var = zhi0Var.d;
        int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
        if (iIntValue == 409) {
            throw new ozn0();
        }
        if (iIntValue != 422) {
            throw zhi0Var;
        }
        String message = zhi0Var.getMessage();
        if (message == null) {
            message = "";
        }
        throw new n7p(message);
    }

    public void b(s0a s0aVar, s0a s0aVar2, cmn0 cmn0Var, cmn0 cmn0Var2, Map.Entry entry) {
        cmn0 cmn0Var3 = (cmn0) entry.getValue();
        l8x.U("DualSurfaceProcessorNode", "     -> outputEdge = " + cmn0Var3);
        i55 i55Var = new i55(cmn0Var.g.f12463a, ((k35) entry.getKey()).f17602a.d, cmn0Var.c ? s0aVar : null, ((k35) entry.getKey()).f17602a.f, ((k35) entry.getKey()).f17602a.g);
        i55 i55Var2 = new i55(cmn0Var2.g.f12463a, ((k35) entry.getKey()).b.d, cmn0Var2.c ? s0aVar2 : null, ((k35) entry.getKey()).b.f, ((k35) entry.getKey()).b.g);
        int i = ((k35) entry.getKey()).f17602a.c;
        cmn0Var3.getClass();
        ofm0.m();
        cmn0Var3.a();
        z1x.y("Consumer can only be linked once.", !cmn0Var3.j);
        cmn0Var3.j = true;
        bmn0 bmn0Var = cmn0Var3.l;
        qbb qbbVarK0 = ro4.k0(bmn0Var.c(), new amn0(cmn0Var3, bmn0Var, i, i55Var, i55Var2), j120.T());
        fhj fhjVar = new fhj();
        fhjVar.b = this;
        fhjVar.f9543a = cmn0Var3;
        qbbVarK0.a(new mfr((Object) qbbVarK0, (Object) fhjVar, (byte) 0), j120.T());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(List list, h9n0 h9n0Var, zje zjeVar) throws Throwable {
        x8p x8pVar;
        Object g0g0Var;
        Integer num;
        Object value;
        Object iapVar;
        if (zjeVar instanceof x8p) {
            x8pVar = (x8p) zjeVar;
            int i = x8pVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8pVar.l = i - Integer.MIN_VALUE;
            } else {
                x8pVar = new x8p(this, zjeVar);
            }
        } else {
            x8pVar = new x8p(this, zjeVar);
        }
        Object obj = x8pVar.j;
        wne wneVar = wne.f39444a;
        int i2 = x8pVar.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                v8p v8pVar = (v8p) this.e;
                String strA = ((btt0) this.d).a();
                Boolean boolValueOf = h9n0Var instanceof f9n0 ? Boolean.valueOf(((f9n0) h9n0Var).f9162a) : null;
                x8pVar.i = list;
                x8pVar.l = 1;
                if (v8pVar.b(strA, list, boolValueOf, x8pVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = x8pVar.i;
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            if (!(thA instanceof zhi0)) {
                throw thA;
            }
            zhi0 zhi0Var = (zhi0) thA;
            uhi0 uhi0Var = zhi0Var.d;
            int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
            if (iIntValue == 409) {
                throw new ozn0();
            }
            if (iIntValue != 422) {
                throw zhi0Var;
            }
            String message = zhi0Var.getMessage();
            if (message == null) {
                message = "";
            }
            throw new n7p(message);
        }
        if (!(g0g0Var instanceof g0g0)) {
            abp abpVar = (abp) this.b;
            abpVar.getClass();
            list.getClass();
            p7m0 p7m0Var = abpVar.b;
            do {
                value = p7m0Var.getValue();
                iapVar = (kap) value;
                if (iapVar instanceof iap) {
                    Iterable iterable = (Iterable) ((iap) iapVar).f14449a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (!list.contains(Long.valueOf(((k8p) obj2).f17883a))) {
                            arrayList.add(obj2);
                        }
                    }
                    iapVar = new iap(arrayList);
                }
            } while (!p7m0Var.m(value, iapVar));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable d(long j, zje zjeVar) {
        w4j w4jVar;
        Object g0g0Var;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof w4j) {
            w4jVar = (w4j) zjeVar;
            int i = w4jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4jVar.k = i - Integer.MIN_VALUE;
            } else {
                w4jVar = new w4j(this, zjeVar);
            }
        } else {
            w4jVar = new w4j(this, zjeVar);
        }
        w4j w4jVar2 = w4jVar;
        Object objB = w4jVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = w4jVar2.k;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objB);
            vqc vqcVar = (vqc) this.e;
            String strA = ((btt0) this.d).a();
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            w4jVar2.k = 1;
            objB = ((c4j) ((sza) vqcVar.b).invoke()).b(strA, j, strC, 22, iB, new fk9(false), w4jVar2);
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
        List<r85> list = ((u85) ((dx5) objB).a()).f35219a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (r85 r85Var : list) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = saj.i0(r85Var);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                n85 n85Var = (n85) g0g0Var;
                if (n85Var != null) {
                    arrayList2.add(n85Var);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0109 -> B:67:0x006d). Please report as a decompilation issue!!! */
    public Object e(long j, zje zjeVar, Long l) {
        z4j z4jVar;
        kki kkiVar;
        long j2;
        z4j z4jVar2;
        int i;
        int i2;
        Long l2;
        Long l3;
        kki kkiVar2;
        int i3;
        int i4;
        zhi0 th;
        boolean z;
        boolean z2;
        Object g0g0Var;
        kki kkiVar3;
        if (zjeVar instanceof z4j) {
            z4jVar = (z4j) zjeVar;
            int i5 = z4jVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                z4jVar.q = i5 - Integer.MIN_VALUE;
                kkiVar = this;
            } else {
                kkiVar = this;
                z4jVar = new z4j(kkiVar, zjeVar);
            }
        } else {
            kkiVar = this;
            z4jVar = new z4j(kkiVar, zjeVar);
        }
        Object objG = z4jVar.o;
        wne wneVar = wne.f39444a;
        int i6 = z4jVar.q;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 = z4jVar.n;
                    i3 = z4jVar.m;
                    j2 = z4jVar.i;
                    kkiVar3 = z4jVar.l;
                    kkiVar2 = z4jVar.k;
                    l3 = z4jVar.j;
                    try {
                        z1x.P(objG);
                    } catch (Throwable th2) {
                        th = th2;
                        if (i3 == 0 && (th instanceof zhi0) && th.e) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(th instanceof CancellationException) || (th instanceof ConnectException) || z) {
                            throw th;
                        }
                        if (th instanceof zhi0) {
                            zhi0 zhi0Var = th;
                            if (zhi0Var.f || zhi0Var.e) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else if (hic.C(th)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i7 = i4 + 1;
                        if (i7 <= 3 && !z2) {
                            System.out.println((Object) b1j.g(i7, "error (", "): ", th));
                            z4jVar.j = l3;
                            z4jVar.k = kkiVar2;
                            z4jVar.l = null;
                            z4jVar.i = j2;
                            z4jVar.m = i3;
                            z4jVar.n = i7;
                            z4jVar.q = 2;
                            if (qcc.O(3000L, z4jVar) != wneVar) {
                                i = i7;
                                kkiVar = kkiVar2;
                                i2 = i3;
                                z4jVar2 = z4jVar;
                                l2 = l3;
                                e0g0 e0g0Var = j0g0.b;
                                z4jVar2.j = l2;
                                z4jVar2.k = kkiVar;
                                z4jVar2.l = kkiVar;
                                z4jVar2.i = j2;
                                z4jVar2.m = i2;
                                z4jVar2.n = i;
                                z4jVar2.q = 1;
                                objG = kkiVar.g(j2, z4jVar2, l2);
                                if (objG != wneVar) {
                                    l3 = l2;
                                    i3 = i2;
                                    kkiVar2 = kkiVar;
                                    i4 = i;
                                    kkiVar3 = kkiVar2;
                                }
                            }
                            return wneVar;
                        }
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        z1x.P(g0g0Var);
                        return g0g0Var;
                    }
                } else {
                    if (i6 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = z4jVar.n;
                    int i9 = z4jVar.m;
                    j2 = z4jVar.i;
                    kki kkiVar4 = z4jVar.k;
                    Long l4 = z4jVar.j;
                    z1x.P(objG);
                    z4jVar2 = z4jVar;
                    l2 = l4;
                    i2 = i9;
                    i = i8;
                    kkiVar = kkiVar4;
                }
                List list = (List) objG;
                o0j o0jVar = (o0j) kkiVar3.c;
                o0jVar.getClass();
                list.getClass();
                o0jVar.e.o(null, list);
                g0g0Var = (List) objG;
                e0g0 e0g0Var3 = j0g0.b;
                z1x.P(g0g0Var);
                return g0g0Var;
            }
            z1x.P(objG);
            j2 = j;
            z4jVar2 = z4jVar;
            i = 0;
            i2 = 0;
            l2 = l;
        } catch (Throwable th3) {
            th = th3;
            l3 = l2;
            z4jVar = z4jVar2;
            i3 = i2;
            kkiVar2 = kkiVar;
            i4 = i;
            if (i3 == 0) {
                z = false;
            } else {
                z = false;
            }
            if (th instanceof CancellationException) {
            }
            throw th;
        }
        e0g0 e0g0Var4 = j0g0.b;
        z4jVar2.j = l2;
        z4jVar2.k = kkiVar;
        z4jVar2.l = kkiVar;
        z4jVar2.i = j2;
        z4jVar2.m = i2;
        z4jVar2.n = i;
        z4jVar2.q = 1;
        objG = kkiVar.g(j2, z4jVar2, l2);
        if (objG != wneVar) {
            l3 = l2;
            i3 = i2;
            kkiVar2 = kkiVar;
            i4 = i;
            kkiVar3 = kkiVar2;
            List list2 = (List) objG;
            o0j o0jVar2 = (o0j) kkiVar3.c;
            o0jVar2.getClass();
            list2.getClass();
            o0jVar2.e.o(null, list2);
            g0g0Var = (List) objG;
            e0g0 e0g0Var5 = j0g0.b;
            z1x.P(g0g0Var);
            return g0g0Var;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable f(long j, zje zjeVar) {
        a5j a5jVar;
        Object g0g0Var;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof a5j) {
            a5jVar = (a5j) zjeVar;
            int i = a5jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5jVar.k = i - Integer.MIN_VALUE;
            } else {
                a5jVar = new a5j(this, zjeVar);
            }
        } else {
            a5jVar = new a5j(this, zjeVar);
        }
        a5j a5jVar2 = a5jVar;
        Object objD = a5jVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = a5jVar2.k;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objD);
            vqc vqcVar = (vqc) this.e;
            String strA = ((btt0) this.d).a();
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            a5jVar2.k = 1;
            objD = ((c4j) ((sza) vqcVar.b).invoke()).d(strA, j, strC, 22, iB, new fk9(false), a5jVar2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        List<r85> list = ((u85) ((dx5) objD).a()).f35219a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (r85 r85Var : list) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = saj.i0(r85Var);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                n85 n85Var = (n85) g0g0Var;
                if (n85Var != null) {
                    arrayList2.add(n85Var);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Serializable g(long j, zje zjeVar, Long l) {
        b5j b5jVar;
        Object g0g0Var;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof b5j) {
            b5jVar = (b5j) zjeVar;
            int i = b5jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b5jVar.k = i - Integer.MIN_VALUE;
            } else {
                b5jVar = new b5j(this, zjeVar);
            }
        } else {
            b5jVar = new b5j(this, zjeVar);
        }
        b5j b5jVar2 = b5jVar;
        Object objA = b5jVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = b5jVar2.k;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objA);
            vqc vqcVar = (vqc) this.e;
            String strA = ((btt0) this.d).a();
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            b5jVar2.k = 1;
            objA = ((c4j) ((sza) vqcVar.b).invoke()).a(strA, j, strC, 22, iB, l, new fk9(false), b5jVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List<c7w> list = ((f7w) ((dx5) objA).a()).f9078a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (c7w c7wVar : list) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = tlb.k0(c7wVar);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                z6w z6wVar = (z6w) g0g0Var;
                if (z6wVar != null) {
                    arrayList2.add(z6wVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        dyw dywVar = hhn0Var.f13073a;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.e;
        Resources resources = dsCellLeftIcon.getContext().getResources();
        resources.getClass();
        Drawable drawableQ = c3x.q(dywVar, resources);
        Integer num = (Integer) this.f;
        dsCellLeftIcon.setIconDrawable(drawableQ);
        dsCellLeftIcon.setIconTint(num.intValue());
        dsCellLeftIcon.p = null;
    }

    public nku i() {
        return (nku) ((n5d0) this.c).get();
    }

    public f4u j() {
        return new f4u((m6d0) ((n5d0) this.b).get());
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.e;
        Integer num = (Integer) this.b;
        Integer num2 = (Integer) this.c;
        Integer num3 = (Integer) this.d;
        int i = DsCellLeftIcon.s;
        dsCellLeftIcon.q(num, num2, num3);
        dsCellLeftIcon.o = null;
        dsCellLeftIcon.p = null;
    }

    public dnq l() {
        yje yjeVar = null;
        byte b = 1;
        return new dnq(dub.f0(((nmt) this.f).a(), ((crt) this.c).a(), ((kc60) this.b).a(), new pbp(this, ((pru) this.d).a().b.z, yjeVar, b)), new oz0(3, yjeVar, (byte) 10), b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(long j, long j2, zje zjeVar, boolean z, boolean z2, boolean z3) {
        ost ostVar;
        long j3;
        boolean z4;
        long j4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j5;
        long j6;
        List list;
        if (zjeVar instanceof ost) {
            ostVar = (ost) zjeVar;
            int i = ostVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ostVar.q = i - Integer.MIN_VALUE;
            } else {
                ostVar = new ost(this, zjeVar);
            }
        } else {
            ostVar = new ost(this, zjeVar);
        }
        Object objB = ostVar.o;
        wne wneVar = wne.f39444a;
        int i2 = ostVar.q;
        if (i2 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.b;
            j3 = j;
            ostVar.i = j3;
            z4 = z;
            ostVar.k = z4;
            j4 = j2;
            ostVar.j = j4;
            z5 = z2;
            ostVar.l = z5;
            z6 = z3;
            ostVar.m = z6;
            ostVar.q = 1;
            objB = zfoVar.b(ostVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            boolean z8 = ostVar.m;
            boolean z9 = ostVar.l;
            long j7 = ostVar.j;
            boolean z10 = ostVar.k;
            long j8 = ostVar.i;
            z1x.P(objB);
            z6 = z8;
            z4 = z10;
            z5 = z9;
            j4 = j7;
            j3 = j8;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z11 = ostVar.m;
            boolean z12 = ostVar.l;
            long j9 = ostVar.j;
            boolean z13 = ostVar.k;
            long j10 = ostVar.i;
            List list2 = ostVar.n;
            z1x.P(objB);
            z7 = z13;
            j6 = j9;
            z6 = z11;
            z5 = z12;
            j5 = j10;
            list = list2;
        }
        List list3 = (List) objB;
        return new nst(new h2c(((yi6) this.e).f42671a.f40929a, (byte) 11), this, j5, z7, j6, ((us3) ((peg0) this.f).b).a(), list, list3, z5, z6);
        List list4 = (List) objB;
        edo edoVar = (edo) this.c;
        ostVar.n = list4;
        ostVar.i = j3;
        ostVar.k = z4;
        ostVar.j = j4;
        ostVar.l = z5;
        ostVar.m = z6;
        ostVar.q = 2;
        Object objB2 = edoVar.b(ostVar);
        if (objB2 != wneVar) {
            z7 = z4;
            j5 = j3;
            j6 = j4;
            list = list4;
            objB = objB2;
            List list5 = (List) objB;
            return new nst(new h2c(((yi6) this.e).f42671a.f40929a, (byte) 11), this, j5, z7, j6, ((us3) ((peg0) this.f).b).a(), list, list5, z5, z6);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(long j, zje zjeVar, boolean z) {
        gnt gntVar;
        ql5 ql5Var;
        boolean z2;
        if (zjeVar instanceof gnt) {
            gntVar = (gnt) zjeVar;
            int i = gntVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                gntVar.n = i - Integer.MIN_VALUE;
            } else {
                gntVar = new gnt(this, zjeVar);
            }
        } else {
            gntVar = new gnt(this, zjeVar);
        }
        Object objA = gntVar.l;
        Object obj = wne.f39444a;
        int i2 = gntVar.n;
        if (i2 == 0) {
            z1x.P(objA);
            if (!((iqt) this.e).f15225a.a()) {
                return u91.d;
            }
            urt urtVar = (urt) this.b;
            gntVar.i = j;
            gntVar.j = z;
            gntVar.n = 1;
            objA = urt.a(urtVar, gntVar);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = gntVar.j;
            j = gntVar.i;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = gntVar.j;
            ql5Var = gntVar.k;
            z1x.P(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            return u91.c;
        }
        return (z2 || !ql5Var.i.a()) ? new v91(ql5Var.f28916a) : u91.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objA) {
            txs0 txs0Var = ((ql5) obj2).i;
            if (txs0Var == txs0.f || txs0Var == txs0.d || txs0Var == txs0.g) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return u91.b;
        }
        if (arrayList.size() > 1) {
            return u91.f35259a;
        }
        ql5 ql5Var2 = (ql5) CollectionsKt.U(arrayList);
        gntVar.k = ql5Var2;
        gntVar.i = j;
        gntVar.j = z;
        gntVar.n = 2;
        Object objX = x(gntVar);
        if (objX != obj) {
            ql5Var = ql5Var2;
            objA = objX;
            z2 = z;
            if (((Boolean) objA).booleanValue()) {
                return u91.c;
            }
            if (z2) {
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[LOOP:0: B:28:0x008d->B:30:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object o(zje zjeVar) {
        xtt xttVar;
        List list;
        ArrayList arrayList;
        Iterator it;
        rkc0 rkc0Var = (rkc0) this.e;
        if (zjeVar instanceof xtt) {
            xttVar = (xtt) zjeVar;
            int i = xttVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xttVar.k = i - Integer.MIN_VALUE;
            } else {
                xttVar = new xtt(this, zjeVar);
            }
        } else {
            xttVar = new xtt(this, zjeVar);
        }
        Object objX = xttVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xttVar.k;
        if (i2 == 0) {
            z1x.P(objX);
            List list2 = rkc0Var.b.c;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            list = list2.isEmpty() ? null : list2;
            if (list == null) {
                fhj fhjVar = (fhj) this.b;
                String strA = ((ntu) this.c).a();
                ((iqt) this.d).f15225a.a();
                xttVar.k = 1;
                objX = fhjVar.x(strA, xttVar);
                if (objX == wneVar) {
                    return wneVar;
                }
            }
            if (((wtt) this.f).a()) {
                return list;
            }
            arrayList = new ArrayList(r3d.q(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(pe8.a((pe8) it.next(), true, false, 7167));
            }
            return arrayList;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objX);
        list = (List) objX;
        rkc0Var.getClass();
        list.getClass();
        dnc0 dnc0Var = rkc0Var.b;
        dnc0Var.getClass();
        dnc0Var.c = list;
        if (((wtt) this.f).a()) {
            return list;
        }
        arrayList = new ArrayList(r3d.q(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(pe8.a((pe8) it.next(), true, false, 7167));
        }
        return arrayList;
    }

    public pzu p() {
        return new pzu(new f4u(u(), (byte) 13), new jgu(u()), new rpt(u()), new x4u(u()), ((uii) ((iw20) this.d).f15470a).r(), ((xzp) ((epi0) this.f).b).C());
    }

    public p430 q() {
        return (p430) ((n5d0) this.b).get();
    }

    public pzu r() {
        h840 h840Var = (h840) this.e;
        gii0 gii0Var = (gii0) this.b;
        return new pzu(h840Var, new gsj(gii0Var), new eio(gii0Var), (knf0) this.c, (btt0) this.d, (mne) this.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public Object s(otc otcVar, yje yjeVar) {
        l4s l4sVar;
        otc otcVar2;
        FragmentScreen fragmentScreenH;
        zfm0 zfm0Var = (zfm0) this.e;
        qv2 qv2Var = (qv2) this.c;
        i1w0 i1w0Var = (i1w0) this.b;
        pv00 pv00Var = (pv00) this.d;
        if (yjeVar instanceof l4s) {
            l4sVar = (l4s) yjeVar;
            int i = l4sVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4sVar.l = i - Integer.MIN_VALUE;
            } else {
                l4sVar = new l4s(this, yjeVar);
            }
        } else {
            l4sVar = new l4s(this, yjeVar);
        }
        Object objB = l4sVar.j;
        wne wneVar = wne.f39444a;
        int i2 = l4sVar.l;
        if (i2 == 0) {
            z1x.P(objB);
            String str = otcVar.b;
            long j = otcVar.i;
            long j2 = otcVar.f25822a;
            if (Intrinsics.d(str, "") && j2 == 0) {
                return Unit.f46060a;
            }
            if (j2 == 0) {
                pv00Var.n(dub.u0(otcVar));
                i1w0Var.getClass();
                k0w0 k0w0Var = new k0w0(i1w0Var);
                k0w0Var.h(zfm0Var.a(j, otcVar.b));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            } else {
                h3c h3cVar = (h3c) this.f;
                l4sVar.i = otcVar;
                l4sVar.l = 1;
                objB = h3cVar.b(j, l4sVar);
                if (objB == wneVar) {
                    return wneVar;
                }
                otcVar2 = otcVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            otcVar2 = l4sVar.i;
            z1x.P(objB);
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        int iOrdinal = otcVar2.c.ordinal();
        if (iOrdinal == 1) {
            Parcelable.Creator<GameBroadcastType> creator = GameBroadcastType.CREATOR;
            grs grsVar = grs.b;
            ors orsVar = ors.f25750a;
            k1g k1gVar = k1g.UNKNOWN;
            long j3 = otcVar2.f25822a;
            fragmentScreenH = qv2Var.h(new GameScreenGeneralParams(j3, j3, otcVar2.i, 0L, zBooleanValue, 0L, false, GameBroadcastType.c, grsVar, "main_screen", "", orsVar, 0, false, k1gVar));
        } else if (iOrdinal != 2) {
            pv00Var.n(dub.u0(otcVar2));
            fragmentScreenH = zfm0Var.a(otcVar2.i, otcVar2.b);
        } else {
            Parcelable.Creator<GameBroadcastType> creator2 = GameBroadcastType.CREATOR;
            grs grsVar2 = grs.b;
            ors orsVar2 = ors.f25750a;
            k1g k1gVar2 = k1g.UNKNOWN;
            long j4 = otcVar2.f25822a;
            fragmentScreenH = qv2Var.h(new GameScreenGeneralParams(j4, j4, otcVar2.i, 0L, zBooleanValue, 0L, true, GameBroadcastType.c, grsVar2, "main_screen", "", orsVar2, 0, false, k1gVar2));
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (fragmentScreenH instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
        }
        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar2 = (paw) listIteratorO2;
            if (!pawVar2.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar2.next());
        }
    }

    public eu90 t() {
        return (eu90) ((n5d0) this.d).get();
    }

    public iw20 u() {
        return new iw20(new gxu((vwb0) this.e, (q7d0) this.b, (us00) this.c));
    }

    public m2c v() {
        return new m2c(r());
    }

    public erc w() {
        return new erc(r());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(zje zjeVar) {
        hnt hntVar;
        long j;
        if (zjeVar instanceof hnt) {
            hntVar = (hnt) zjeVar;
            int i = hntVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hntVar.l = i - Integer.MIN_VALUE;
            } else {
                hntVar = new hnt(this, zjeVar);
            }
        } else {
            hntVar = new hnt(this, zjeVar);
        }
        Object objB = hntVar.j;
        Object obj = wne.f39444a;
        int i2 = hntVar.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objB);
            xru xruVar = (xru) this.d;
            bm5 bm5Var = bm5.e;
            long jP = xruVar.f41388a.p(bm5Var);
            if (jP <= 0) {
                bm5Var = bm5.f2822a;
            }
            ahu ahuVar = (ahu) this.c;
            hntVar.i = jP;
            hntVar.l = 1;
            objB = ahuVar.b(bm5Var, hntVar);
            if (objB == obj) {
                return obj;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hntVar.i;
            z1x.P(objB);
        }
        txs0 txs0Var = ((ql5) objB).i;
        if ((txs0Var != txs0.e && txs0Var != txs0.h) || (!((wyb) this.f).a() && j != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public g5k y() {
        return new g5k(r());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:12|13|14|15|88|110|29|112|30|31|32|33|108|34|35|106|36|(1:38)(1:39)|(1:42)|86) */
    /* JADX WARN: Code duplicated, block: B:100:0x01df  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #2 {all -> 0x00f3, blocks: (B:36:0x00d3, B:39:0x00dc), top: B:106:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x003f, B:90:0x01a8, B:94:0x01cc, B:93:0x01c6, B:56:0x0116, B:58:0x011a, B:62:0x0124, B:64:0x0128, B:67:0x012e, B:69:0x0132, B:71:0x0139, B:80:0x014e, B:84:0x0157, B:89:0x019f, B:77:0x0147, B:95:0x01cf, B:27:0x007e), top: B:105:0x0029 }] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r7 = r20;
        r8 = r21;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
    
        r7 = r5;
        r5 = r9;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0106, code lost:
    
        r9 = r3;
        r3 = r11;
        r10 = r5;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        r17 = r6;
        r7 = r5;
        r5 = r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0192 -> B:15:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(int r20, long r21, long r23, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kki.z(int, long, long, a.zje):java.lang.Object");
    }

    public /* synthetic */ kki(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f18441a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }

    public kki(rkc0 rkc0Var, fhj fhjVar, ntu ntuVar, iqt iqtVar, wtt wttVar) {
        this.f18441a = (byte) 28;
        rkc0Var.getClass();
        this.e = rkc0Var;
        this.b = fhjVar;
        this.c = ntuVar;
        this.d = iqtVar;
        this.f = wttVar;
    }

    public kki(zri zriVar, knf0 knf0Var, sek sekVar, mne mneVar, btt0 btt0Var) {
        this.f18441a = (byte) 18;
        knf0Var.getClass();
        btt0Var.getClass();
        this.e = zriVar;
        this.b = knf0Var;
        this.c = sekVar;
        this.d = mneVar;
        this.f = btt0Var;
    }

    public kki(zfm0 zfm0Var, i1w0 i1w0Var, qv2 qv2Var, pv00 pv00Var, h3c h3cVar) {
        this.f18441a = (byte) 22;
        i1w0Var.getClass();
        this.e = zfm0Var;
        this.b = i1w0Var;
        this.c = qv2Var;
        this.d = pv00Var;
        this.f = h3cVar;
    }

    public kki(yi6 yi6Var, zfo zfoVar, edo edoVar, j1q0 j1q0Var, peg0 peg0Var) {
        this.f18441a = (byte) 26;
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.e = yi6Var;
        this.b = zfoVar;
        this.c = edoVar;
        this.d = j1q0Var;
        this.f = peg0Var;
    }

    public kki(kj5 kj5Var, r9u r9uVar, htz htzVar, do20 do20Var, sxs0 sxs0Var) {
        this.f18441a = (byte) 23;
        r9uVar.getClass();
        this.e = sxs0Var;
        this.b = do20Var;
        this.c = htzVar;
        this.d = r9uVar;
        this.f = kj5Var;
    }

    public kki(vqc vqcVar, knf0 knf0Var, o0j o0jVar, btt0 btt0Var, mne mneVar) {
        this.f18441a = (byte) 13;
        knf0Var.getClass();
        o0jVar.getClass();
        btt0Var.getClass();
        this.e = vqcVar;
        this.b = knf0Var;
        this.c = o0jVar;
        this.d = btt0Var;
        this.f = mneVar;
    }

    public kki(v8p v8pVar, abp abpVar, knf0 knf0Var, btt0 btt0Var, f8p f8pVar) {
        this.f18441a = (byte) 19;
        abpVar.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        f8pVar.getClass();
        this.e = v8pVar;
        this.b = abpVar;
        this.c = knf0Var;
        this.d = btt0Var;
        this.f = f8pVar;
    }

    public kki(Drawable.Callback callback) {
        this.f18441a = (byte) 21;
        this.e = new rd9((byte) 1);
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            xv00.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }

    public kki(cad cadVar, ctf0 ctf0Var, e1u e1uVar, i1w0 i1w0Var) {
        this.f18441a = (byte) 4;
        this.e = ctf0Var;
        this.b = cadVar;
        this.c = e1uVar;
        this.d = i1w0Var;
        this.f = new rki(this, (byte) 17);
    }

    public kki(uxs0 uxs0Var, g8i g8iVar) {
        this.f18441a = (byte) 12;
        this.e = g8iVar;
        byte b = 2;
        this.b = n0k0.a(new nyi(this, 3, b));
        this.c = n0k0.a(new nyi(this, b, b));
        this.d = n0k0.a(new nyi(this, 1, b));
        this.f = n0k0.a(new nyi(this, 0, b));
    }

    public kki(euc eucVar, azj0 azj0Var, mne mneVar, ntu ntuVar) {
        this.f18441a = (byte) 5;
        this.e = eucVar;
        this.c = azj0Var;
        this.d = mneVar;
        this.f = ntuVar;
        this.b = n0k0.a(new ppi(this, (byte) 4));
    }

    public kki(pcl0 pcl0Var, cad cadVar, sa10 sa10Var, ctf0 ctf0Var) {
        this.f18441a = (byte) 7;
        this.e = cadVar;
        this.b = pcl0Var;
        this.c = ctf0Var;
        this.d = sa10Var;
        this.f = new rti(this, (byte) 18);
    }

    public kki(cad cadVar, List list, ctf0 ctf0Var) {
        this.f18441a = (byte) 9;
        this.e = list;
        this.b = ctf0Var;
        this.c = cadVar;
        byte b = 8;
        this.d = new msi(this, 0, b);
        this.f = new msi(this, 1, b);
    }

    public kki(mne mneVar, rrc rrcVar) {
        this.f18441a = (byte) 1;
        this.e = rrcVar;
        this.f = mneVar;
        byte b = 24;
        this.b = mbl.b(new rii(this, 1, b));
        this.c = mbl.b(new rii(this, 0, b));
        this.d = mbl.b(new rii(this, 2, b));
    }

    public kki(cad cadVar, ioi ioiVar, ctf0 ctf0Var, Long l) {
        this.f18441a = (byte) 8;
        this.e = cadVar;
        this.b = ctf0Var;
        this.c = l;
        this.d = ioiVar;
        this.f = new rti(this, (byte) 25);
    }

    public kki(drm0 drm0Var, wyu wyuVar, Boolean bool, v6j0 v6j0Var) {
        this.f18441a = (byte) 10;
        this.e = drm0Var;
        this.b = v6j0Var;
        this.c = wyuVar;
        this.d = bool;
        this.f = new xvi(this, (byte) 19);
    }

    public kki(iw20 iw20Var, epi0 epi0Var, us00 us00Var, vwb0 vwb0Var, q7d0 q7d0Var) {
        this.f18441a = (byte) 6;
        this.e = vwb0Var;
        this.b = q7d0Var;
        this.c = us00Var;
        this.d = iw20Var;
        this.f = epi0Var;
    }

    public kki(s0a s0aVar, s0a s0aVar2, jmn0 jmn0Var) {
        this.f18441a = (byte) 17;
        this.b = s0aVar;
        this.c = s0aVar2;
        this.e = jmn0Var;
    }

    public kki(btt0 btt0Var, h840 h840Var, gii0 gii0Var, mne mneVar, knf0 knf0Var) {
        this.f18441a = (byte) 3;
        this.e = h840Var;
        this.b = gii0Var;
        this.c = knf0Var;
        this.d = btt0Var;
        this.f = mneVar;
    }

    public kki(fki fkiVar) {
        this.f18441a = (byte) 0;
        this.e = fkiVar;
        byte b = 10;
        this.b = n0k0.a(new c7i(fkiVar, this, 0, b));
        this.c = n0k0.a(new c7i(fkiVar, this, 1, b));
        this.d = n0k0.a(new c7i(fkiVar, this, 2, b));
        this.f = n0k0.a(new c7i(fkiVar, this, 3, b));
    }

    public kki(nli nliVar) {
        this.f18441a = (byte) 2;
        this.e = nliVar;
        byte b = 13;
        this.b = n0k0.a(new c7i(nliVar, this, 0, b));
        this.c = n0k0.a(new c7i(nliVar, this, 1, b));
        this.d = n0k0.a(new c7i(nliVar, this, 2, b));
        this.f = n0k0.a(new c7i(nliVar, this, 3, b));
    }

    public kki(iyi iyiVar) {
        this.f18441a = (byte) 11;
        this.e = iyiVar;
        byte b = 18;
        this.b = n0k0.a(new c7i(iyiVar, this, 0, b));
        this.c = n0k0.a(new c7i(iyiVar, this, 1, b));
        this.d = n0k0.a(new c7i(iyiVar, this, 2, b));
        this.f = n0k0.a(new c7i(iyiVar, this, 3, b));
    }
}
