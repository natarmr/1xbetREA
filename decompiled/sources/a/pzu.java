package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import java.math.RoundingMode;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.authreminder.impl.data.AuthReminderBroadcastReceiver;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes4.dex */
public final class pzu implements dgd, rkr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27863a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public pzu(pfd pfdVar, dgd dgdVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<c7k> set = pfdVar.c;
        Set set2 = pfdVar.g;
        for (c7k c7kVar : set) {
            byte b = c7kVar.c;
            byte b2 = c7kVar.b;
            boolean z = b == 0;
            jkd0 jkd0Var = c7kVar.f3867a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(jkd0Var);
                } else {
                    hashSet.add(jkd0Var);
                }
            } else if (b == 2) {
                hashSet3.add(jkd0Var);
            } else if (b2 == 2) {
                hashSet5.add(jkd0Var);
            } else {
                hashSet2.add(jkd0Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(jkd0.a(r7d0.class));
        }
        this.f27863a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = dgdVar;
    }

    public static ArrayList C(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zlb) it.next()).c);
        }
        return r3d.r(arrayList);
    }

    public static knb t(knb knbVar, List list) {
        List list2 = knbVar.f18576a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list2) {
            Long lValueOf = Long.valueOf(((rbb) obj).n);
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list3 = (List) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
            if (list3 != null) {
                arrayList2.add(list3);
            }
        }
        ArrayList arrayListR = r3d.r(arrayList2);
        return arrayListR.isEmpty() ? knbVar : knb.a(knbVar, arrayListR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(List list, zje zjeVar) {
        j840 j840Var;
        if (zjeVar instanceof j840) {
            j840Var = (j840) zjeVar;
            int i = j840Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j840Var.k = i - Integer.MIN_VALUE;
            } else {
                j840Var = new j840(this, zjeVar);
            }
        } else {
            j840Var = new j840(this, zjeVar);
        }
        Object objA = j840Var.i;
        wne wneVar = wne.f39444a;
        int i2 = j840Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            eio eioVar = (eio) this.c;
            String strA = ((btt0) this.e).a();
            l5k l5kVar = new l5k(list);
            j840Var.k = 1;
            objA = ((exa0) eioVar.f7869a.getValue()).a(strA, l5kVar, j840Var);
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
        if (((o5k) ((dx5) objA).a()).f24690a != null) {
            return Unit.f46060a;
        }
        jf4.k(null);
        return null;
    }

    public void B() {
        i1w0 i1w0VarC = ((oeg0) this.f27863a).c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(boolean z, yz5 yz5Var, uu4 uu4Var, zje zjeVar) {
        fw00 fw00Var;
        Object g0g0Var;
        uu4 tu4Var;
        if (zjeVar instanceof fw00) {
            fw00Var = (fw00) zjeVar;
            int i = fw00Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw00Var.l = i - Integer.MIN_VALUE;
            } else {
                fw00Var = new fw00(this, zjeVar);
            }
        } else {
            fw00Var = new fw00(this, zjeVar);
        }
        Object objN = fw00Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fw00Var.l;
        try {
            if (i2 == 0) {
                z1x.P(objN);
                e0g0 e0g0Var = j0g0.b;
                svu svuVar = (svu) this.d;
                fw00Var.i = uu4Var;
                fw00Var.l = 1;
                objN = svuVar.n(z, yz5Var, fw00Var);
                if (objN == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uu4Var = fw00Var.i;
                z1x.P(objN);
            }
            g0g0Var = x8x.D(q8x.A((q16) objN));
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (!(g0g0Var instanceof g0g0)) {
            kx00 kx00Var = (kx00) g0g0Var;
            if (uu4Var instanceof tu4) {
                tu4 tu4Var2 = (tu4) uu4Var;
                String strValueOf = String.valueOf(kx00Var.d);
                if (StringsKt.W(strValueOf)) {
                    strValueOf = tu4Var2.f34533a;
                }
                String str = tu4Var2.b;
                String str2 = tu4Var2.c;
                String str3 = tu4Var2.d;
                strValueOf.getClass();
                str.getClass();
                str2.getClass();
                str3.getClass();
                tu4Var = new tu4(strValueOf, str, str2, str3);
            } else {
                tu4Var = uu4Var;
            }
            o0(tu4Var);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            wwb0 wwb0Var = (wwb0) this.e;
            if (thA instanceof fn50) {
                o0(uu4Var);
                wwb0Var.b("USER_TEMPORARY_PASS_TOKEN", ((fn50) thA).f9817a);
            } else if (thA instanceof kj50) {
                o0(uu4Var);
                wwb0Var.b("USER_TEMPORARY_PASS_TOKEN", ((kj50) thA).f18370a);
            }
        }
        z1x.P(g0g0Var);
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.concurrent.CopyOnWriteArrayList] */
    public Serializable E(zje zjeVar) {
        e200 e200Var;
        ?? arrayList;
        czz czzVar = (czz) this.d;
        if (zjeVar instanceof e200) {
            e200Var = (e200) zjeVar;
            int i = e200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e200Var.k = i - Integer.MIN_VALUE;
            } else {
                e200Var = new e200(this, zjeVar);
            }
        } else {
            e200Var = new e200(this, zjeVar);
        }
        Object objD = e200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = e200Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            arrayList = czzVar.f5246a;
            if (arrayList.isEmpty()) {
                abu abuVar = (abu) this.f27863a;
                String strA = ((btt0) this.e).a();
                e200Var.k = 1;
                objD = ((kuz) ((rcz) abuVar.c).invoke()).d(strA, e200Var);
                if (objD == wneVar) {
                    return wneVar;
                }
            }
            return arrayList;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objD);
        Iterable<wqt> iterable = (Iterable) ((dx5) objD).a();
        arrayList = new ArrayList(r3d.q(iterable, 10));
        for (wqt wqtVar : iterable) {
            wqtVar.getClass();
            String str = wqtVar.f39608a;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Integer num = wqtVar.b;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            LimitTypeEnum.b.getClass();
            LimitTypeEnum limitTypeEnumC = art.c(iIntValue);
            List list = wqtVar.c;
            if (list == null) {
                list = iun.f15405a;
            }
            String str3 = wqtVar.d;
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new h85(str, limitTypeEnumC, list, str2));
        }
        czzVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = czzVar.f5246a;
        copyOnWriteArrayList.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add((h85) it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object F(long j, ljg ljgVar, zje zjeVar) {
        m4z m4zVar;
        Object g0g0Var;
        if (zjeVar instanceof m4z) {
            m4zVar = (m4z) zjeVar;
            int i = m4zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4zVar.k = i - Integer.MIN_VALUE;
            } else {
                m4zVar = new m4z(this, zjeVar);
            }
        } else {
            m4zVar = new m4z(this, zjeVar);
        }
        m4z m4zVar2 = m4zVar;
        Object objJ = m4zVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = m4zVar2.k;
        try {
            if (i2 == 0) {
                z1x.P(objJ);
                f2h f2hVar = ljgVar.b;
                f2h f2hVar2 = ljgVar.c;
                if (f2hVar.c.length() == 0 || f2hVar2.c.length() == 0) {
                    iun iunVar = iun.f15405a;
                    return new d4g(0, 0, new s8h(0, 0, 0L, "", "", iunVar), new s8h(0, 0, 0L, "", "", iunVar), iunVar);
                }
                if (j != 46) {
                    iun iunVar2 = iun.f15405a;
                    return new d4g(0, 0, new s8h(0, 0, 0L, "", "", iunVar2), new s8h(0, 0, 0L, "", "", iunVar2), iunVar2);
                }
                e0g0 e0g0Var = j0g0.b;
                uyn uynVar = (uyn) this.d;
                String str = ljgVar.b.c;
                String str2 = f2hVar2.c;
                long j2 = ljgVar.f.f44687a;
                m4zVar2.k = 1;
                objJ = ((prc) uynVar.f36498a).j(str, str2, j2, m4zVar2);
                if (objJ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objJ);
            }
            g0g0Var = (d4g) objJ;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iun iunVar3 = iun.f15405a;
        Object d4gVar = new d4g(0, 0, new s8h(0, 0, 0L, "", "", iunVar3), new s8h(0, 0, 0L, "", "", iunVar3), iunVar3);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = d4gVar;
        }
        return (d4g) g0g0Var;
    }

    public krr0 G() {
        return (krr0) ((hqr0) this.b).f13498a.getValue();
    }

    public y680 H(Class cls) {
        return q(jkd0.a(cls));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object I(long j, ljg ljgVar, zje zjeVar) {
        n4z n4zVar;
        Object g0g0Var;
        if (zjeVar instanceof n4z) {
            n4zVar = (n4z) zjeVar;
            int i = n4zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4zVar.k = i - Integer.MIN_VALUE;
            } else {
                n4zVar = new n4z(this, zjeVar);
            }
        } else {
            n4zVar = new n4z(this, zjeVar);
        }
        Object objK = n4zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = n4zVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objK);
                f2h f2hVar = ljgVar.b;
                String str = ljgVar.c.c;
                if (f2hVar.c.length() == 0 || str.length() == 0) {
                    iun iunVar = iun.f15405a;
                    return new omg(0, 0, new s8h(0, 0, 0L, "", "", iunVar), new s8h(0, 0, 0L, "", "", iunVar), "", 0, 0, "", iunVar);
                }
                if (j != 1) {
                    iun iunVar2 = iun.f15405a;
                    return new omg(0, 0, new s8h(0, 0, 0L, "", "", iunVar2), new s8h(0, 0, 0L, "", "", iunVar2), "", 0, 0, "", iunVar2);
                }
                e0g0 e0g0Var = j0g0.b;
                bwl bwlVar = (bwl) this.c;
                String str2 = ljgVar.b.c;
                znq0 znq0Var = ljgVar.f;
                dfj dfjVar = dfj.UNIQUE_4;
                Locale.ENGLISH.getClass();
                String strK0 = jtv.K0(znq0Var, dfjVar, 4);
                n4zVar.k = 1;
                objK = ((prc) bwlVar.f3330a).k(str2, str, strK0, n4zVar);
                if (objK == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objK);
            }
            g0g0Var = (omg) objK;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iun iunVar3 = iun.f15405a;
        Object omgVar = new omg(0, 0, new s8h(0, 0, 0L, "", "", iunVar3), new s8h(0, 0, 0L, "", "", iunVar3), "", 0, 0, "", iunVar3);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = omgVar;
        }
        return (omg) g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(long j, ljg ljgVar, zje zjeVar) {
        o4z o4zVar;
        Object g0g0Var;
        if (zjeVar instanceof o4z) {
            o4zVar = (o4z) zjeVar;
            int i = o4zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                o4zVar.k = i - Integer.MIN_VALUE;
            } else {
                o4zVar = new o4z(this, zjeVar);
            }
        } else {
            o4zVar = new o4z(this, zjeVar);
        }
        Object objA = o4zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = o4zVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                f2h f2hVar = ljgVar.b;
                String str = ljgVar.c.c;
                if (f2hVar.c.length() == 0 || str.length() == 0) {
                    iun iunVar = iun.f15405a;
                    return new smg("", "", iunVar, "", "", iunVar);
                }
                if (j != 1) {
                    iun iunVar2 = iun.f15405a;
                    return new smg("", "", iunVar2, "", "", iunVar2);
                }
                e0g0 e0g0Var = j0g0.b;
                k6u k6uVar = (k6u) this.e;
                String str2 = ljgVar.b.c;
                o4zVar.k = 1;
                objA = k6uVar.f17789a.a(str2, str, o4zVar);
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
            g0g0Var = (smg) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iun iunVar3 = iun.f15405a;
        Object smgVar = new smg("", "", iunVar3, "", "", iunVar3);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = smgVar;
        }
        return (smg) g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable K(zje zjeVar) {
        i200 i200Var;
        if (zjeVar instanceof i200) {
            i200Var = (i200) zjeVar;
            int i = i200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i200Var.k = i - Integer.MIN_VALUE;
            } else {
                i200Var = new i200(this, zjeVar);
            }
        } else {
            i200Var = new i200(this, zjeVar);
        }
        Object objA = i200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = i200Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            dzz dzzVar = (dzz) this.b;
            dzzVar.getClass();
            dzzVar.g = System.currentTimeMillis();
            abu abuVar = (abu) this.f27863a;
            String strA = ((btt0) this.e).a();
            String strC = ((knf0) this.f).c();
            i200Var.k = 1;
            objA = ((kuz) ((rcz) abuVar.c).invoke()).a(strA, strC, i200Var);
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
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a8k0.M((qhu) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object L(zje zjeVar, String str, String str2, boolean z) {
        vmg0 vmg0Var;
        String str3;
        boolean z2;
        blg0 blg0Var;
        rns0 rns0Var;
        if (zjeVar instanceof vmg0) {
            vmg0Var = (vmg0) zjeVar;
            int i = vmg0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmg0Var.o = i - Integer.MIN_VALUE;
            } else {
                vmg0Var = new vmg0(this, zjeVar);
            }
        } else {
            vmg0Var = new vmg0(this, zjeVar);
        }
        vmg0 vmg0Var2 = vmg0Var;
        Object objD0 = vmg0Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = vmg0Var2.o;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            emg0 emg0Var = (emg0) this.f27863a;
            emg0Var.getClass();
            str2.getClass();
            str.getClass();
            rns0 rns0Var2 = (rns0) emg0Var.f8045a.get(str2 + BundleUtil.UNDERLINE_TAG + str);
            if (rns0Var2 != null) {
                return rns0Var2;
            }
            dvj dvjVar = ((mne) this.e).b;
            kmg0 kmg0Var = new kmg0((Object) this, str2, str, yjeVar, (byte) 3);
            vmg0Var2.i = str;
            vmg0Var2.j = str2;
            vmg0Var2.k = this;
            vmg0Var2.l = z;
            vmg0Var2.o = 1;
            objD0 = qjj.d0(dvjVar, kmg0Var, vmg0Var2);
            if (objD0 == wneVar) {
                return wneVar;
            }
            str3 = str2;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = vmg0Var2.l;
            pzu pzuVar = vmg0Var2.k;
            str3 = vmg0Var2.j;
            String str4 = vmg0Var2.i;
            z1x.P(objD0);
            z2 = z3;
            this = pzuVar;
            str = str4;
        }
        List list = (List) ((dx5) objD0).b;
        if (list == null || (blg0Var = (blg0) CollectionsKt.firstOrNull(list)) == null || (rns0Var = blg0Var.b) == null) {
            jf4.k(null);
            return null;
        }
        if (z2) {
            emg0 emg0Var2 = (emg0) this.f27863a;
            emg0Var2.getClass();
            str3.getClass();
            str.getClass();
            emg0Var2.f8045a.put(str3 + BundleUtil.UNDERLINE_TAG + str, rns0Var);
        }
        return rns0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object M(jvn jvnVar, List list, Set set, int i, ygq0 ygq0Var, List list2, boolean z, long j, Pair pair, Integer num, zje zjeVar) {
        o600 o600Var;
        jvn jvnVar2;
        List list3;
        ygq0 ygq0Var2;
        List list4;
        Integer num2;
        int i2;
        boolean z2;
        long j2;
        Object obj;
        Pair pair2;
        Set set2;
        pzu pzuVar;
        List list5;
        List list6;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof o600) {
            o600Var = (o600) zjeVar;
            int i3 = o600Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o600Var.w = i3 - Integer.MIN_VALUE;
            } else {
                o600Var = new o600(this, zjeVar);
            }
        } else {
            o600Var = new o600(this, zjeVar);
        }
        Object objA = o600Var.u;
        wne wneVar = wne.f39444a;
        int i4 = o600Var.w;
        if (i4 != 0) {
            if (i4 == 1) {
                long j3 = o600Var.t;
                boolean z3 = o600Var.s;
                int i5 = o600Var.r;
                Integer num3 = o600Var.o;
                Pair pair3 = o600Var.n;
                List list7 = o600Var.m;
                ygq0Var2 = o600Var.l;
                set2 = o600Var.k;
                list3 = o600Var.j;
                jvn jvnVar3 = o600Var.i;
                z1x.P(objA);
                obj = objA;
                pair2 = pair3;
                z2 = z3;
                jvnVar2 = jvnVar3;
                list4 = list7;
                i2 = i5;
                num2 = num3;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = o600Var.q;
                list6 = o600Var.p;
                list5 = o600Var.m;
                Set set3 = o600Var.k;
                z1x.P(objA);
            }
            knb knbVarK = d7x.K((List) ((dx5) objA).a(), list6, false);
            pzuVar.getClass();
            return t(knbVarK, list5);
        }
        z1x.P(objA);
        sjl0 sjl0Var = (sjl0) this.e;
        jvnVar2 = jvnVar;
        o600Var.i = jvnVar2;
        list3 = list;
        o600Var.j = list3;
        o600Var.k = set;
        ygq0Var2 = ygq0Var;
        o600Var.l = ygq0Var2;
        list4 = list2;
        o600Var.m = list4;
        o600Var.n = pair;
        num2 = num;
        o600Var.o = num2;
        i2 = i;
        o600Var.r = i2;
        z2 = z;
        o600Var.s = z2;
        j2 = j;
        o600Var.t = j2;
        o600Var.w = 1;
        Serializable serializableD = sjl0Var.d(o600Var);
        if (serializableD == wneVar) {
            return wneVar;
        }
        obj = serializableD;
        pair2 = pair;
        set2 = set;
        List list8 = (List) obj;
        ok50 ok50Var = (ok50) this.f27863a;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) this.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        set2.getClass();
        ygq0Var2.getClass();
        list4.getClass();
        pair2.getClass();
        boolean z4 = z2;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        tlb.H(treeMap, set2);
        if (ygq0Var2 == ygq0.CUSTOM_DATE) {
            ulb.J(treeMap, pair2);
        }
        ulb.P(treeMap);
        ulb.W(strA, treeMap);
        ulb.X(treeMap, ygq0Var2);
        treeMap.put("ref", 1);
        ulb.a0(treeMap, list4);
        if (z4) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        o600Var.i = null;
        o600Var.j = null;
        o600Var.k = null;
        o600Var.l = null;
        o600Var.m = list4;
        o600Var.n = null;
        o600Var.o = null;
        o600Var.p = list8;
        pzuVar = this;
        o600Var.q = pzuVar;
        o600Var.r = i2;
        o600Var.s = z4;
        o600Var.t = j2;
        o600Var.w = 2;
        objA = ((gmb) ((sza) ok50Var.f25390a).invoke()).a(treeMap, o600Var);
        if (objA == wneVar) {
            return wneVar;
        }
        list5 = list4;
        list6 = list8;
        knb knbVarK2 = d7x.K((List) ((dx5) objA).a(), list6, false);
        pzuVar.getClass();
        return t(knbVarK2, list5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object N(jvn jvnVar, List list, Set set, int i, ygq0 ygq0Var, List list2, boolean z, long j, Pair pair, Integer num, zje zjeVar) {
        p600 p600Var;
        jvn jvnVar2;
        List list3;
        ygq0 ygq0Var2;
        List list4;
        Integer num2;
        int i2;
        boolean z2;
        long j2;
        Object obj;
        Pair pair2;
        Set set2;
        pzu pzuVar;
        List list5;
        List list6;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof p600) {
            p600Var = (p600) zjeVar;
            int i3 = p600Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p600Var.w = i3 - Integer.MIN_VALUE;
            } else {
                p600Var = new p600(this, zjeVar);
            }
        } else {
            p600Var = new p600(this, zjeVar);
        }
        Object objD = p600Var.u;
        wne wneVar = wne.f39444a;
        int i4 = p600Var.w;
        if (i4 != 0) {
            if (i4 == 1) {
                long j3 = p600Var.t;
                boolean z3 = p600Var.s;
                int i5 = p600Var.r;
                Integer num3 = p600Var.o;
                Pair pair3 = p600Var.n;
                List list7 = p600Var.m;
                ygq0Var2 = p600Var.l;
                set2 = p600Var.k;
                list3 = p600Var.j;
                jvn jvnVar3 = p600Var.i;
                z1x.P(objD);
                obj = objD;
                pair2 = pair3;
                z2 = z3;
                jvnVar2 = jvnVar3;
                list4 = list7;
                i2 = i5;
                num2 = num3;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = p600Var.q;
                list6 = p600Var.p;
                list5 = p600Var.m;
                Set set3 = p600Var.k;
                z1x.P(objD);
            }
            knb knbVarN0 = n6x.n0((List) ((dx5) objD).a(), list6, false);
            pzuVar.getClass();
            return t(knbVarN0, list5);
        }
        z1x.P(objD);
        sjl0 sjl0Var = (sjl0) this.e;
        jvnVar2 = jvnVar;
        p600Var.i = jvnVar2;
        list3 = list;
        p600Var.j = list3;
        p600Var.k = set;
        ygq0Var2 = ygq0Var;
        p600Var.l = ygq0Var2;
        list4 = list2;
        p600Var.m = list4;
        p600Var.n = pair;
        num2 = num;
        p600Var.o = num2;
        i2 = i;
        p600Var.r = i2;
        z2 = z;
        p600Var.s = z2;
        j2 = j;
        p600Var.t = j2;
        p600Var.w = 1;
        Serializable serializableD = sjl0Var.d(p600Var);
        if (serializableD == wneVar) {
            return wneVar;
        }
        obj = serializableD;
        pair2 = pair;
        set2 = set;
        List list8 = (List) obj;
        ok50 ok50Var = (ok50) this.f27863a;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) this.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        set2.getClass();
        ygq0Var2.getClass();
        list4.getClass();
        pair2.getClass();
        boolean z4 = z2;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        tlb.H(treeMap, set2);
        if (ygq0Var2 == ygq0.CUSTOM_DATE) {
            ulb.J(treeMap, pair2);
        }
        ulb.P(treeMap);
        ulb.W(strA, treeMap);
        ulb.X(treeMap, ygq0Var2);
        treeMap.put("ref", 1);
        ulb.a0(treeMap, list4);
        if (z4) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        p600Var.i = null;
        p600Var.j = null;
        p600Var.k = null;
        p600Var.l = null;
        p600Var.m = list4;
        p600Var.n = null;
        p600Var.o = null;
        p600Var.p = list8;
        pzuVar = this;
        p600Var.q = pzuVar;
        p600Var.r = i2;
        p600Var.s = z4;
        p600Var.t = j2;
        p600Var.w = 2;
        objD = ((gmb) ((sza) ok50Var.f25390a).invoke()).d(treeMap, p600Var);
        if (objD == wneVar) {
            return wneVar;
        }
        list5 = list4;
        list6 = list8;
        knb knbVarN1 = n6x.n0((List) ((dx5) objD).a(), list6, false);
        pzuVar.getClass();
        return t(knbVarN1, list5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object O(jvn jvnVar, List list, Set set, int i, List list2, boolean z, long j, boolean z2, Integer num, zje zjeVar) {
        q600 q600Var;
        jvn jvnVar2;
        List list3;
        List list4;
        Integer num2;
        int i2;
        boolean z3;
        long j2;
        boolean z4;
        Set set2;
        boolean z5;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof q600) {
            q600Var = (q600) zjeVar;
            int i3 = q600Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q600Var.v = i3 - Integer.MIN_VALUE;
            } else {
                q600Var = new q600(pzuVar, zjeVar);
            }
        } else {
            q600Var = new q600(pzuVar, zjeVar);
        }
        Object objD = q600Var.t;
        wne wneVar = wne.f39444a;
        int i4 = q600Var.v;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z6 = q600Var.r;
                long j3 = q600Var.s;
                z3 = q600Var.q;
                int i5 = q600Var.p;
                Integer num3 = q600Var.m;
                List list7 = q600Var.l;
                set2 = q600Var.k;
                list3 = q600Var.j;
                jvn jvnVar3 = q600Var.i;
                z1x.P(objD);
                z4 = z6;
                jvnVar2 = jvnVar3;
                list4 = list7;
                i2 = i5;
                num2 = num3;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = q600Var.o;
                list5 = q600Var.n;
                list6 = q600Var.l;
                Set set3 = q600Var.k;
                z1x.P(objD);
                z5 = true;
            }
            knb knbVarK = d7x.K((List) ((dx5) objD).a(), list5, z5);
            pzuVar.getClass();
            return t(knbVarK, list6);
        }
        z1x.P(objD);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        q600Var.i = jvnVar2;
        list3 = list;
        q600Var.j = list3;
        q600Var.k = set;
        list4 = list2;
        q600Var.l = list4;
        num2 = num;
        q600Var.m = num2;
        i2 = i;
        q600Var.p = i2;
        z3 = z;
        q600Var.q = z3;
        j2 = j;
        q600Var.s = j2;
        z4 = z2;
        q600Var.r = z4;
        q600Var.v = 1;
        objD = sjl0Var.d(q600Var);
        if (objD == wneVar) {
            return wneVar;
        }
        set2 = set;
        List list8 = (List) objD;
        z5 = true;
        yk50 yk50Var = (yk50) pzuVar.b;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        set2.getClass();
        list4.getClass();
        boolean z7 = z3;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        tlb.H(treeMap, set2);
        ulb.P(treeMap);
        ulb.S(treeMap, z4);
        ulb.W(strA, treeMap);
        treeMap.put("ref", 1);
        ulb.a0(treeMap, list4);
        if (z7) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        q600Var.i = null;
        q600Var.j = null;
        q600Var.k = null;
        q600Var.l = list4;
        q600Var.m = null;
        q600Var.n = list8;
        q600Var.o = pzuVar;
        q600Var.p = i2;
        q600Var.q = z7;
        q600Var.s = j2;
        q600Var.r = z4;
        q600Var.v = 2;
        Object objA = ((hmb) ((sza) yk50Var.b).invoke()).a(treeMap, q600Var);
        if (objA == wneVar) {
            return wneVar;
        }
        list5 = list8;
        objD = objA;
        list6 = list4;
        knb knbVarK2 = d7x.K((List) ((dx5) objD).a(), list5, z5);
        pzuVar.getClass();
        return t(knbVarK2, list6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object P(jvn jvnVar, List list, Set set, int i, List list2, boolean z, long j, boolean z2, Integer num, zje zjeVar) {
        r600 r600Var;
        jvn jvnVar2;
        List list3;
        List list4;
        Integer num2;
        int i2;
        boolean z3;
        long j2;
        boolean z4;
        Set set2;
        boolean z5;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof r600) {
            r600Var = (r600) zjeVar;
            int i3 = r600Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r600Var.v = i3 - Integer.MIN_VALUE;
            } else {
                r600Var = new r600(pzuVar, zjeVar);
            }
        } else {
            r600Var = new r600(pzuVar, zjeVar);
        }
        Object objD = r600Var.t;
        wne wneVar = wne.f39444a;
        int i4 = r600Var.v;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z6 = r600Var.r;
                long j3 = r600Var.s;
                z3 = r600Var.q;
                int i5 = r600Var.p;
                Integer num3 = r600Var.m;
                List list7 = r600Var.l;
                set2 = r600Var.k;
                list3 = r600Var.j;
                jvn jvnVar3 = r600Var.i;
                z1x.P(objD);
                z4 = z6;
                jvnVar2 = jvnVar3;
                list4 = list7;
                i2 = i5;
                num2 = num3;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = r600Var.o;
                list5 = r600Var.n;
                list6 = r600Var.l;
                Set set3 = r600Var.k;
                z1x.P(objD);
                z5 = true;
            }
            knb knbVarN0 = n6x.n0((List) ((dx5) objD).a(), list5, z5);
            pzuVar.getClass();
            return t(knbVarN0, list6);
        }
        z1x.P(objD);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        r600Var.i = jvnVar2;
        list3 = list;
        r600Var.j = list3;
        r600Var.k = set;
        list4 = list2;
        r600Var.l = list4;
        num2 = num;
        r600Var.m = num2;
        i2 = i;
        r600Var.p = i2;
        z3 = z;
        r600Var.q = z3;
        j2 = j;
        r600Var.s = j2;
        z4 = z2;
        r600Var.r = z4;
        r600Var.v = 1;
        objD = sjl0Var.d(r600Var);
        if (objD == wneVar) {
            return wneVar;
        }
        set2 = set;
        List list8 = (List) objD;
        z5 = true;
        yk50 yk50Var = (yk50) pzuVar.b;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        set2.getClass();
        list4.getClass();
        boolean z7 = z3;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        tlb.H(treeMap, set2);
        ulb.P(treeMap);
        ulb.S(treeMap, z4);
        ulb.W(strA, treeMap);
        treeMap.put("ref", 1);
        ulb.a0(treeMap, list4);
        if (z7) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        r600Var.i = null;
        r600Var.j = null;
        r600Var.k = null;
        r600Var.l = list4;
        r600Var.m = null;
        r600Var.n = list8;
        r600Var.o = pzuVar;
        r600Var.p = i2;
        r600Var.q = z7;
        r600Var.s = j2;
        r600Var.r = z4;
        r600Var.v = 2;
        Object objB = ((hmb) ((sza) yk50Var.b).invoke()).b(treeMap, r600Var);
        if (objB == wneVar) {
            return wneVar;
        }
        list5 = list8;
        objD = objB;
        list6 = list4;
        knb knbVarN1 = n6x.n0((List) ((dx5) objD).a(), list5, z5);
        pzuVar.getClass();
        return t(knbVarN1, list6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object Q(jvn jvnVar, List list, int i, ygq0 ygq0Var, List list2, boolean z, long j, Pair pair, Integer num, zje zjeVar) {
        s600 s600Var;
        jvn jvnVar2;
        List list3;
        ygq0 ygq0Var2;
        List list4;
        int i2;
        boolean z2;
        Object obj;
        Pair pair2;
        Integer num2;
        long j2;
        boolean z3;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof s600) {
            s600Var = (s600) zjeVar;
            int i3 = s600Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s600Var.v = i3 - Integer.MIN_VALUE;
            } else {
                s600Var = new s600(pzuVar, zjeVar);
            }
        } else {
            s600Var = new s600(pzuVar, zjeVar);
        }
        Object objC = s600Var.t;
        wne wneVar = wne.f39444a;
        int i4 = s600Var.v;
        if (i4 != 0) {
            if (i4 == 1) {
                j2 = s600Var.s;
                boolean z4 = s600Var.r;
                i2 = s600Var.q;
                Integer num3 = s600Var.n;
                pair2 = s600Var.m;
                List list7 = s600Var.l;
                ygq0Var2 = s600Var.k;
                List list8 = s600Var.j;
                jvn jvnVar3 = s600Var.i;
                z1x.P(objC);
                obj = objC;
                num2 = num3;
                z2 = z4;
                jvnVar2 = jvnVar3;
                list3 = list8;
                list4 = list7;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = s600Var.p;
                list6 = s600Var.o;
                list5 = s600Var.l;
                z1x.P(objC);
                z3 = false;
            }
            knb knbVarK = d7x.K((List) ((dx5) objC).a(), list6, z3);
            pzuVar.getClass();
            return t(knbVarK, list5);
        }
        z1x.P(objC);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        s600Var.i = jvnVar2;
        list3 = list;
        s600Var.j = list3;
        ygq0Var2 = ygq0Var;
        s600Var.k = ygq0Var2;
        list4 = list2;
        s600Var.l = list4;
        s600Var.m = pair;
        s600Var.n = num;
        i2 = i;
        s600Var.q = i2;
        z2 = z;
        s600Var.r = z2;
        s600Var.s = j;
        s600Var.v = 1;
        Serializable serializableD = sjl0Var.d(s600Var);
        if (serializableD == wneVar) {
            return wneVar;
        }
        obj = serializableD;
        pair2 = pair;
        num2 = num;
        j2 = j;
        List list9 = (List) obj;
        ok50 ok50Var = (ok50) pzuVar.f27863a;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        ygq0Var2.getClass();
        pair2.getClass();
        boolean z5 = z2;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        if (ygq0Var2 == ygq0.CUSTOM_DATE) {
            ulb.J(treeMap, pair2);
        }
        ulb.P(treeMap);
        treeMap.put("groupChamps", Boolean.TRUE);
        ulb.W(strA, treeMap);
        ulb.X(treeMap, ygq0Var2);
        treeMap.put("ref", 1);
        if (z5) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        s600Var.i = null;
        s600Var.j = null;
        s600Var.k = null;
        s600Var.l = list4;
        s600Var.m = null;
        s600Var.n = null;
        s600Var.o = list9;
        s600Var.p = pzuVar;
        s600Var.q = i2;
        s600Var.r = z5;
        s600Var.s = j2;
        s600Var.v = 2;
        z3 = false;
        objC = ((gmb) ((sza) ok50Var.f25390a).invoke()).c(treeMap, new fk9(false), s600Var);
        if (objC == wneVar) {
            return wneVar;
        }
        list5 = list4;
        list6 = list9;
        knb knbVarK2 = d7x.K((List) ((dx5) objC).a(), list6, z3);
        pzuVar.getClass();
        return t(knbVarK2, list5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object R(jvn jvnVar, List list, int i, ygq0 ygq0Var, List list2, boolean z, long j, Pair pair, Integer num, zje zjeVar) {
        t600 t600Var;
        jvn jvnVar2;
        List list3;
        ygq0 ygq0Var2;
        List list4;
        int i2;
        boolean z2;
        Object obj;
        Pair pair2;
        Integer num2;
        long j2;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof t600) {
            t600Var = (t600) zjeVar;
            int i3 = t600Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t600Var.v = i3 - Integer.MIN_VALUE;
            } else {
                t600Var = new t600(pzuVar, zjeVar);
            }
        } else {
            t600Var = new t600(pzuVar, zjeVar);
        }
        Object objB = t600Var.t;
        wne wneVar = wne.f39444a;
        int i4 = t600Var.v;
        if (i4 != 0) {
            if (i4 == 1) {
                j2 = t600Var.s;
                boolean z3 = t600Var.r;
                i2 = t600Var.q;
                Integer num3 = t600Var.n;
                pair2 = t600Var.m;
                List list7 = t600Var.l;
                ygq0Var2 = t600Var.k;
                List list8 = t600Var.j;
                jvn jvnVar3 = t600Var.i;
                z1x.P(objB);
                obj = objB;
                num2 = num3;
                z2 = z3;
                jvnVar2 = jvnVar3;
                list3 = list8;
                list4 = list7;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = t600Var.p;
                list6 = t600Var.o;
                list5 = t600Var.l;
                z1x.P(objB);
            }
            knb knbVarN0 = n6x.n0((List) ((dx5) objB).a(), list6, false);
            pzuVar.getClass();
            return t(knbVarN0, list5);
        }
        z1x.P(objB);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        t600Var.i = jvnVar2;
        list3 = list;
        t600Var.j = list3;
        ygq0Var2 = ygq0Var;
        t600Var.k = ygq0Var2;
        list4 = list2;
        t600Var.l = list4;
        t600Var.m = pair;
        t600Var.n = num;
        i2 = i;
        t600Var.q = i2;
        z2 = z;
        t600Var.r = z2;
        t600Var.s = j;
        t600Var.v = 1;
        Serializable serializableD = sjl0Var.d(t600Var);
        if (serializableD == wneVar) {
            return wneVar;
        }
        obj = serializableD;
        pair2 = pair;
        num2 = num;
        j2 = j;
        List list9 = (List) obj;
        ok50 ok50Var = (ok50) pzuVar.f27863a;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        ygq0Var2.getClass();
        pair2.getClass();
        boolean z4 = z2;
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        if (ygq0Var2 == ygq0.CUSTOM_DATE) {
            ulb.J(treeMap, pair2);
        }
        ulb.P(treeMap);
        ulb.W(strA, treeMap);
        ulb.X(treeMap, ygq0Var2);
        treeMap.put("ref", 1);
        if (z4) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        t600Var.i = null;
        t600Var.j = null;
        t600Var.k = null;
        t600Var.l = list4;
        t600Var.m = null;
        t600Var.n = null;
        t600Var.o = list9;
        t600Var.p = pzuVar;
        t600Var.q = i2;
        t600Var.r = z4;
        t600Var.s = j2;
        t600Var.v = 2;
        objB = ((gmb) ((sza) ok50Var.f25390a).invoke()).b(treeMap, t600Var);
        if (objB == wneVar) {
            return wneVar;
        }
        list5 = list4;
        list6 = list9;
        knb knbVarN1 = n6x.n0((List) ((dx5) objB).a(), list6, false);
        pzuVar.getClass();
        return t(knbVarN1, list5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object S(jvn jvnVar, List list, int i, List list2, boolean z, long j, boolean z2, Integer num, zje zjeVar) {
        u600 u600Var;
        jvn jvnVar2;
        List list3;
        List list4;
        Integer num2;
        int i2;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof u600) {
            u600Var = (u600) zjeVar;
            int i3 = u600Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u600Var.u = i3 - Integer.MIN_VALUE;
            } else {
                u600Var = new u600(pzuVar, zjeVar);
            }
        } else {
            u600Var = new u600(pzuVar, zjeVar);
        }
        Object objD = u600Var.s;
        wne wneVar = wne.f39444a;
        int i4 = u600Var.u;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z6 = u600Var.q;
                long j3 = u600Var.r;
                boolean z7 = u600Var.p;
                int i5 = u600Var.o;
                Integer num3 = u600Var.l;
                List list7 = u600Var.k;
                List list8 = u600Var.j;
                jvn jvnVar3 = u600Var.i;
                z1x.P(objD);
                z4 = z6;
                jvnVar2 = jvnVar3;
                list3 = list8;
                z3 = z7;
                i2 = i5;
                num2 = num3;
                list4 = list7;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = u600Var.n;
                list5 = u600Var.m;
                list6 = u600Var.k;
                z1x.P(objD);
                z5 = true;
            }
            knb knbVarK = d7x.K((List) ((dx5) objD).a(), list5, z5);
            pzuVar.getClass();
            return t(knbVarK, list6);
        }
        z1x.P(objD);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        u600Var.i = jvnVar2;
        list3 = list;
        u600Var.j = list3;
        list4 = list2;
        u600Var.k = list4;
        num2 = num;
        u600Var.l = num2;
        i2 = i;
        u600Var.o = i2;
        z3 = z;
        u600Var.p = z3;
        j2 = j;
        u600Var.r = j2;
        z4 = z2;
        u600Var.q = z4;
        u600Var.u = 1;
        objD = sjl0Var.d(u600Var);
        if (objD == wneVar) {
            return wneVar;
        }
        List list9 = (List) objD;
        z5 = true;
        yk50 yk50Var = (yk50) pzuVar.b;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        ulb.P(treeMap);
        treeMap.put("groupChamps", Boolean.TRUE);
        ulb.S(treeMap, z4);
        ulb.W(strA, treeMap);
        treeMap.put("ref", 1);
        if (z3) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        u600Var.i = null;
        u600Var.j = null;
        u600Var.k = list4;
        u600Var.l = null;
        u600Var.m = list9;
        u600Var.n = pzuVar;
        u600Var.o = i2;
        u600Var.p = z3;
        u600Var.r = j2;
        u600Var.q = z4;
        u600Var.u = 2;
        Object objD2 = ((hmb) ((sza) yk50Var.b).invoke()).d(treeMap, u600Var);
        if (objD2 == wneVar) {
            return wneVar;
        }
        list5 = list9;
        objD = objD2;
        list6 = list4;
        knb knbVarK2 = d7x.K((List) ((dx5) objD).a(), list5, z5);
        pzuVar.getClass();
        return t(knbVarK2, list6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object T(jvn jvnVar, List list, int i, List list2, boolean z, long j, boolean z2, Integer num, zje zjeVar) {
        v600 v600Var;
        jvn jvnVar2;
        List list3;
        List list4;
        Integer num2;
        int i2;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        List list5;
        List list6;
        pzu pzuVar = this;
        knf0 knf0Var = (knf0) pzuVar.d;
        if (zjeVar instanceof v600) {
            v600Var = (v600) zjeVar;
            int i3 = v600Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v600Var.u = i3 - Integer.MIN_VALUE;
            } else {
                v600Var = new v600(pzuVar, zjeVar);
            }
        } else {
            v600Var = new v600(pzuVar, zjeVar);
        }
        Object objD = v600Var.s;
        wne wneVar = wne.f39444a;
        int i4 = v600Var.u;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z6 = v600Var.q;
                long j3 = v600Var.r;
                boolean z7 = v600Var.p;
                int i5 = v600Var.o;
                Integer num3 = v600Var.l;
                List list7 = v600Var.k;
                List list8 = v600Var.j;
                jvn jvnVar3 = v600Var.i;
                z1x.P(objD);
                z4 = z6;
                jvnVar2 = jvnVar3;
                list3 = list8;
                z3 = z7;
                i2 = i5;
                num2 = num3;
                list4 = list7;
                j2 = j3;
            } else {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pzuVar = v600Var.n;
                list5 = v600Var.m;
                list6 = v600Var.k;
                z1x.P(objD);
                z5 = true;
            }
            knb knbVarN0 = n6x.n0((List) ((dx5) objD).a(), list5, z5);
            pzuVar.getClass();
            return t(knbVarN0, list6);
        }
        z1x.P(objD);
        sjl0 sjl0Var = (sjl0) pzuVar.e;
        jvnVar2 = jvnVar;
        v600Var.i = jvnVar2;
        list3 = list;
        v600Var.j = list3;
        list4 = list2;
        v600Var.k = list4;
        num2 = num;
        v600Var.l = num2;
        i2 = i;
        v600Var.o = i2;
        z3 = z;
        v600Var.p = z3;
        j2 = j;
        v600Var.r = j2;
        z4 = z2;
        v600Var.q = z4;
        v600Var.u = 1;
        objD = sjl0Var.d(v600Var);
        if (objD == wneVar) {
            return wneVar;
        }
        List list9 = (List) objD;
        z5 = true;
        yk50 yk50Var = (yk50) pzuVar.b;
        Set setP0 = CollectionsKt.P0(list3);
        knf0Var.getClass();
        String strA = ((kuy) pzuVar.f).a();
        int iB = knf0Var.b();
        jvnVar2.getClass();
        setP0.getClass();
        TreeMap treeMap = new TreeMap();
        xp20.l(treeMap, new Pair[0]);
        e3c.p(treeMap, setP0);
        ulb.m0(treeMap, i2);
        tlb.I(treeMap, iB);
        ulb.P(treeMap);
        ulb.S(treeMap, z4);
        ulb.W(strA, treeMap);
        treeMap.put("ref", 1);
        if (z3) {
            e3c.O(treeMap, j2);
        }
        tlb.m0(22, treeMap);
        e3c.o(treeMap, jvnVar2);
        ulb.Y(treeMap, num2);
        v600Var.i = null;
        v600Var.j = null;
        v600Var.k = list4;
        v600Var.l = null;
        v600Var.m = list9;
        v600Var.n = pzuVar;
        v600Var.o = i2;
        v600Var.p = z3;
        v600Var.r = j2;
        v600Var.q = z4;
        v600Var.u = 2;
        Object objC = ((hmb) ((sza) yk50Var.b).invoke()).c(treeMap, v600Var);
        if (objC == wneVar) {
            return wneVar;
        }
        list5 = list9;
        objD = objC;
        list6 = list4;
        knb knbVarN1 = n6x.n0((List) ((dx5) objD).a(), list5, z5);
        pzuVar.getClass();
        return t(knbVarN1, list6);
    }

    public Map U() {
        return (Map) ((hqr0) this.b).b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable V(double d, int i, zje zjeVar) {
        k840 k840Var;
        pwa0 pwa0Var;
        ArrayList arrayList;
        if (zjeVar instanceof k840) {
            k840Var = (k840) zjeVar;
            int i2 = k840Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k840Var.k = i2 - Integer.MIN_VALUE;
            } else {
                k840Var = new k840(this, zjeVar);
            }
        } else {
            k840Var = new k840(this, zjeVar);
        }
        k840 k840Var2 = k840Var;
        Object objB = k840Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = k840Var2.k;
        if (i3 == 0) {
            z1x.P(objB);
            eio eioVar = (eio) this.c;
            String strA = ((btt0) this.e).a();
            String strC = ((knf0) this.d).c();
            k840Var2.k = 1;
            objB = ((exa0) eioVar.f7869a.getValue()).b(strA, strC, d, new Integer(i), k840Var2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable<dxa0> iterable = (Iterable) ((dx5) objB).a();
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        for (dxa0 dxa0Var : iterable) {
            dxa0Var.getClass();
            String str = dxa0Var.f6839a;
            if (str == null) {
                jf4.k(null);
                return null;
            }
            String str2 = dxa0Var.b;
            String str3 = str2 == null ? "" : str2;
            Integer num = dxa0Var.c;
            int iIntValue = num != null ? num.intValue() : 0;
            String str4 = dxa0Var.d;
            String str5 = str4 == null ? "" : str4;
            Integer num2 = dxa0Var.e;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            axa0 axa0Var = dxa0Var.f;
            if (axa0Var != null) {
                List<xwa0> list = axa0Var.f1615a;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (xwa0 xwa0Var : list) {
                        String str6 = xwa0Var.f41601a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = xwa0Var.b;
                        if (str7 == null) {
                            str7 = "";
                        }
                        arrayList.add(new jwa0(str6, str7));
                    }
                } else {
                    arrayList = null;
                }
                Long l = axa0Var.b;
                pwa0Var = new pwa0(l != null ? l.longValue() : 0L, arrayList);
            } else {
                pwa0Var = null;
            }
            arrayList2.add(new qwa0(str, str3, iIntValue, str5, iIntValue2, pwa0Var));
        }
        qwa0 qwa0Var = (qwa0) CollectionsKt.firstOrNull(arrayList2);
        if (qwa0Var != null) {
            h840 h840Var = (h840) this.f27863a;
            h840Var.getClass();
            h840Var.d = qwa0Var;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object W(zje zjeVar) {
        dsc0 dsc0Var;
        if (zjeVar instanceof dsc0) {
            dsc0Var = (dsc0) zjeVar;
            int i = dsc0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dsc0Var.k = i - Integer.MIN_VALUE;
            } else {
                dsc0Var = new dsc0(this, zjeVar);
            }
        } else {
            dsc0Var = new dsc0(this, zjeVar);
        }
        Object objB = dsc0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dsc0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            jw20 jw20Var = (jw20) this.d;
            String strA = ((btt0) this.f).a();
            String strC = ((knf0) this.c).c();
            dsc0Var.k = 1;
            objB = ((ufc0) ((rta0) jw20Var.b).invoke()).b(strA, strC, "application/vnd.xenvelop+json", dsc0Var);
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
        j7c0 j7c0Var = (j7c0) ((dx5) objB).a();
        Integer num = j7c0Var.f16034a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = j7c0Var.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num2 = j7c0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = j7c0Var.d;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = j7c0Var.e;
        return new o7c0(iIntValue, iIntValue2, iIntValue3, num4 != null ? num4.intValue() : 0, str2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public Object X(int i, long j, zje zjeVar, boolean z) {
        esc0 esc0Var;
        vrc0 trc0Var;
        knf0 knf0Var = (knf0) this.c;
        bqc0 bqc0Var = (bqc0) this.b;
        if (zjeVar instanceof esc0) {
            esc0Var = (esc0) zjeVar;
            int i2 = esc0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esc0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                esc0Var = new esc0(this, zjeVar);
            }
        } else {
            esc0Var = new esc0(this, zjeVar);
        }
        esc0 esc0Var2 = esc0Var;
        Object objD = esc0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = esc0Var2.k;
        if (i3 == 0) {
            z1x.P(objD);
            if (!z && !bqc0Var.f3022a.isEmpty()) {
                return bqc0Var.f3022a;
            }
            jw20 jw20Var = (jw20) this.d;
            knf0Var.getClass();
            String strC = knf0Var.c();
            esc0Var2.k = 1;
            objD = ((ufc0) ((rta0) jw20Var.b).invoke()).d(1, 1357, strC, j, i, "application/vnd.xenvelop+json", esc0Var2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        List<jsc0> list = (List) ((dx5) objD).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jsc0 jsc0Var : list) {
            Long l = jsc0Var.e;
            long jLongValue = l != null ? l.longValue() : 0L;
            asc0 asc0Var = (asc0) linkedHashMap.get(Long.valueOf(jLongValue));
            if (asc0Var == null) {
                String str = jsc0Var.f;
                if (str == null) {
                    str = "";
                }
                asc0Var = new asc0(jLongValue, str, new ArrayList());
            }
            List list2 = asc0Var.c;
            list2.getClass();
            List listB = zys0.b(list2);
            Long l2 = jsc0Var.e;
            Integer num = jsc0Var.g;
            Integer num2 = jsc0Var.c;
            String str2 = jsc0Var.d;
            String str3 = jsc0Var.b;
            Long l3 = jsc0Var.f17046a;
            if (l2 != null && l2.longValue() == 2) {
                long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                long jLongValue3 = l2.longValue();
                String str4 = str3 == null ? "" : str3;
                String str5 = str2 == null ? "" : str2;
                String str6 = str2 == null ? "" : str2;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                xg8 xg8Var = xg8.NONE;
                Long l4 = jsc0Var.h;
                long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                hds.Companion.getClass();
                trc0Var = new urc0(jLongValue2, jLongValue3, str4, str5, str6, iIntValue, "", iIntValue2, xg8Var, null, jLongValue4, dds.a());
            } else {
                trc0Var = new trc0(l3 != null ? l3.longValue() : 0L, l2 != null ? l2.longValue() : 0L, str3 == null ? "" : str3, str2 == null ? "" : str2, str2 == null ? "" : str2, num2 != null ? num2.intValue() : 0, "", num != null ? num.intValue() : 0, xg8.NONE, null, "", "");
            }
            listB.add(trc0Var);
            linkedHashMap.put(Long.valueOf(jLongValue), asc0Var);
        }
        List listL0 = CollectionsKt.L0(linkedHashMap.values());
        bqc0Var.getClass();
        listL0.getClass();
        bqc0Var.f3022a = listL0;
        return listL0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r48v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Object Y(String str, String str2, long j, zje zjeVar) {
        jqr0 jqr0Var;
        long j2;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        ?? arrayList2;
        ?? arrayList3;
        knf0 knf0Var = (knf0) this.e;
        if (zjeVar instanceof jqr0) {
            jqr0Var = (jqr0) zjeVar;
            int i = jqr0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqr0Var.m = i - Integer.MIN_VALUE;
            } else {
                jqr0Var = new jqr0(this, zjeVar);
            }
        } else {
            jqr0Var = new jqr0(this, zjeVar);
        }
        jqr0 jqr0Var2 = jqr0Var;
        Object objC = jqr0Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = jqr0Var2.m;
        String str6 = null;
        if (i2 == 0) {
            z1x.P(objC);
            epi0 epi0Var = (epi0) this.d;
            knf0Var.getClass();
            String strC = knf0Var.c();
            int i3 = ((csr0) this.c).f4906a;
            jqr0Var2.i = str2;
            jqr0Var2.j = j;
            jqr0Var2.m = 1;
            objC = ((nqr0) ((lkr0) epi0Var.b).invoke()).c(22, strC, str, i3, jqr0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
            j2 = j;
            str3 = str2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = jqr0Var2.j;
            String str7 = jqr0Var2.i;
            z1x.P(objC);
            j2 = j3;
            str3 = str7;
        }
        nrr0 nrr0Var = (nrr0) ((dx5) objC).a();
        boolean zIs24HourFormat = DateFormat.is24HourFormat(((tgk) this.f).f33916a);
        str3.getClass();
        Long l = nrr0Var.f24019a;
        Long l2 = nrr0Var.f;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str8 = nrr0Var.e;
        String str9 = "";
        String str10 = str8 == null ? "" : str8;
        Long l3 = nrr0Var.b;
        if (l3 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l3.longValue();
        Long l4 = nrr0Var.c;
        if (l4 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue3 = l4.longValue();
        String str11 = nrr0Var.d;
        if (str11 == null) {
            jf4.k(null);
            return null;
        }
        Double d = nrr0Var.i;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        Date date = new Date(l2.longValue() * 1000);
        Double d2 = nrr0Var.g;
        if (d2 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        Double d3 = nrr0Var.h;
        if (d3 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue3 = d3.doubleValue();
        List list = nrr0Var.j;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                brr0 brr0Var = (brr0) it.next();
                brr0Var.getClass();
                Long l5 = brr0Var.f3093a;
                String str12 = str6;
                Integer num = brr0Var.e;
                String str13 = brr0Var.d;
                Iterator it2 = it;
                String str14 = brr0Var.c;
                String str15 = brr0Var.b;
                if (l5 == null) {
                    jf4.k(str12);
                    return str12;
                }
                long jLongValue4 = l5.longValue();
                if (str15 == null) {
                    jf4.k(str12);
                    return str12;
                }
                String str16 = str14 == null ? str9 : str14;
                String str17 = str13 == null ? str9 : str13;
                if (num == null) {
                    jf4.k(str12);
                    return str12;
                }
                int iIntValue = num.intValue();
                List list2 = brr0Var.f;
                if (list2 != null) {
                    str5 = str9;
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        jrr0 jrr0Var = (jrr0) it3.next();
                        jrr0Var.getClass();
                        Integer num2 = jrr0Var.f17018a;
                        Iterator it4 = it3;
                        Long l6 = jrr0Var.b;
                        if (num2 == null) {
                            jf4.k(str12);
                            return str12;
                        }
                        int iIntValue2 = num2.intValue();
                        long jLongValue5 = 0;
                        if ((l6 != null && l6.longValue() == 0) || l6 == null) {
                            jf4.k(str12);
                            return str12;
                        }
                        long jLongValue6 = l6.longValue();
                        Long l7 = l5;
                        double d4 = dDoubleValue2;
                        Date date2 = new Date(jLongValue6 * 1000);
                        long jLongValue7 = l7.longValue();
                        String str18 = str13 == null ? str5 : str13;
                        String str19 = str14 == null ? str5 : str14;
                        int iIntValue3 = num.intValue();
                        String str20 = jrr0Var.d;
                        if (str20 == null) {
                            str20 = str5;
                        }
                        String str21 = jrr0Var.e;
                        String str22 = str21 == null ? str5 : str21;
                        Integer num3 = jrr0Var.f;
                        int iIntValue4 = num3 != null ? num3.intValue() : 0;
                        Integer num4 = jrr0Var.g;
                        if (num4 == null) {
                            jf4.k(str12);
                            return str12;
                        }
                        int iIntValue5 = num4.intValue();
                        String str23 = jrr0Var.h;
                        if (str23 == null) {
                            jf4.k(str12);
                            return str12;
                        }
                        String str24 = jrr0Var.i;
                        if (str24 == null) {
                            jf4.k(str12);
                            return str12;
                        }
                        String str25 = jrr0Var.k;
                        String str26 = str25 == null ? str5 : str25;
                        Integer num5 = jrr0Var.j;
                        int iIntValue6 = num5 != null ? num5.intValue() : 0;
                        List list3 = jrr0Var.l;
                        Date date3 = date;
                        if (list3 != null) {
                            arrayList3 = new ArrayList(r3d.q(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                grr0 grr0Var = (grr0) it5.next();
                                grr0Var.getClass();
                                Iterator it6 = it5;
                                Integer num6 = grr0Var.f11796a;
                                if (num6 == null) {
                                    jf4.k(str12);
                                    return str12;
                                }
                                int iIntValue7 = num6.intValue();
                                String str27 = str23;
                                Double d5 = grr0Var.b;
                                double dDoubleValue4 = d5 != null ? d5.doubleValue() : 0.0d;
                                Integer num7 = grr0Var.c;
                                if (num7 == null) {
                                    jf4.k(str12);
                                    return str12;
                                }
                                arrayList3.add(new drr0(dDoubleValue4, iIntValue7, num7.intValue()));
                                it5 = it6;
                                str23 = str27;
                                str24 = str24;
                            }
                        } else {
                            arrayList3 = str12;
                        }
                        String str28 = str23;
                        String str29 = str24;
                        ?? r5 = arrayList3;
                        if (arrayList3 == 0) {
                            r5 = iun.f15405a;
                        }
                        iun iunVar = iun.f15405a;
                        Long l8 = jrr0Var.m;
                        long jLongValue8 = l8 != null ? l8.longValue() : 0L;
                        Long l9 = jrr0Var.n;
                        long jLongValue9 = l9 != null ? l9.longValue() : 0L;
                        String str30 = jrr0Var.o;
                        String str31 = str30 == null ? str5 : str30;
                        String str32 = jrr0Var.p;
                        String str33 = str32 == null ? str5 : str32;
                        Long l10 = jrr0Var.q;
                        long jLongValue10 = l10 != null ? l10.longValue() : 0L;
                        Long l11 = jrr0Var.r;
                        long jLongValue11 = l11 != null ? l11.longValue() : 0L;
                        Long l12 = jrr0Var.s;
                        if (l12 != null) {
                            jLongValue5 = l12.longValue();
                        }
                        arrayList2.add(new crr0(iIntValue2, date2, str20, jLongValue7, str15, str18, str19, iIntValue3, str22, iIntValue4, iIntValue5, str28, str29, iIntValue6, str26, r5, iunVar, jLongValue8, jLongValue9, str31, str33, jLongValue10, jLongValue11, jLongValue5));
                        it3 = it4;
                        dDoubleValue2 = d4;
                        l5 = l7;
                        date = date3;
                    }
                } else {
                    str5 = str9;
                    arrayList2 = str12;
                }
                Date date4 = date;
                double d6 = dDoubleValue2;
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                arrayList4.add(new xqr0(jLongValue4, str15, str16, str17, iIntValue, arrayList2));
                it = it2;
                str6 = str12;
                str11 = str11;
                str9 = str5;
                dDoubleValue2 = d6;
                date = date4;
            }
            str4 = str6;
            arrayList = arrayList4;
        } else {
            str4 = null;
            arrayList = null;
        }
        String str34 = str11;
        Date date5 = date;
        double d7 = dDoubleValue2;
        List list4 = arrayList;
        if (arrayList == null) {
            list4 = iun.f15405a;
        }
        krr0 krr0Var = new krr0(str3, j2, jLongValue, str10, jLongValue2, jLongValue3, zIs24HourFormat, str34, dDoubleValue, date5, d7, dDoubleValue3, list4);
        hqr0 hqr0Var = (hqr0) this.b;
        hqr0Var.getClass();
        hqr0Var.f13498a.o(str4, krr0Var);
        return krr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [a.iun] */
    public Object Z(boolean z, zje zjeVar) {
        fsc0 fsc0Var;
        ?? arrayList;
        cqc0 cqc0Var = (cqc0) this.e;
        if (zjeVar instanceof fsc0) {
            fsc0Var = (fsc0) zjeVar;
            int i = fsc0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fsc0Var.k = i - Integer.MIN_VALUE;
            } else {
                fsc0Var = new fsc0(this, zjeVar);
            }
        } else {
            fsc0Var = new fsc0(this, zjeVar);
        }
        Object objG = fsc0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fsc0Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            if (!z && !cqc0Var.f4787a.isEmpty()) {
                return cqc0Var.f4787a;
            }
            jw20 jw20Var = (jw20) this.d;
            String strC = ((knf0) this.c).c();
            fsc0Var.k = 1;
            objG = ((ufc0) ((rta0) jw20Var.b).invoke()).g("application/vnd.xenvelop+json", strC, fsc0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        List<etj0> list = ((btj0) ((dx5) objG).a()).f3185a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (etj0 etj0Var : list) {
                Long l = etj0Var.f8379a;
                long jLongValue = l != null ? l.longValue() : 0L;
                String str = etj0Var.b;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new dqc0(jLongValue, str));
            }
        } else {
            arrayList = iun.f15405a;
        }
        cqc0Var.getClass();
        arrayList.getClass();
        cqc0Var.f4787a = arrayList;
        return arrayList;
    }

    @Override // a.dgd
    public Object a(Class cls) {
        if (!((Set) this.f27863a).contains(jkd0.a(cls))) {
            e9d0.q(cls, Separators.DOT, "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((dgd) this.f).a(cls);
        if (!cls.equals(r7d0.class)) {
            return objA;
        }
        return new xzf0();
    }

    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: java.lang.Integer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: java.lang.Integer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public java.lang.Object a0(int r41, int r42, long r43, a.zje r45, java.lang.Long r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pzu.a0(int, int, long, a.zje, java.lang.Long, boolean):java.lang.Object");
    }

    @Override // a.rkr0
    public bn7 b() {
        return ((gkr0) this.d).a();
    }

    public p6d b0(boolean z, boolean z2, Function1 function1) {
        return new p6d(((m0o0) ((ocl) this.c).f25032a).b(), new vsg0(new ozu(this, z, z2, function1, null)), new y8p(3, null, (byte) 8), (byte) 1);
    }

    @Override // a.rkr0
    public List c() {
        return ((gkr0) this.d).c();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object c0(long j, long j2, zje zjeVar, boolean z, boolean z2, boolean z3) {
        ea60 ea60Var;
        if (zjeVar instanceof ea60) {
            ea60Var = (ea60) zjeVar;
            int i = ea60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ea60Var.l = i - Integer.MIN_VALUE;
            } else {
                ea60Var = new ea60(this, zjeVar);
            }
        } else {
            ea60Var = new ea60(this, zjeVar);
        }
        ea60 ea60Var2 = ea60Var;
        Object objM = ea60Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = ea60Var2.l;
        if (i2 == 0) {
            z1x.P(objM);
            kki kkiVar = (kki) this.f27863a;
            ea60Var2.i = j;
            ea60Var2.l = 1;
            objM = kkiVar.m(j, j2, ea60Var2, z, z2, z3);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ea60Var2.i;
            z1x.P(objM);
        }
        chf0 chf0Var = ((h9c) this.b).f12667a;
        return dub.e0((gmq) objM, i120.W(new c00(chf0Var.u(owe.b), chf0Var, (byte) 17)), ((goo) ((f4u) this.c).b).f11640a.a(j).f22099a, ((nku) this.d).a(), new fa60(this, j, null, (byte) 0));
    }

    @Override // a.rkr0
    public Object d(yje yjeVar) {
        if (((gkr0) this.d).f11458a.getValue() != null) {
            return Unit.f46060a;
        }
        Object objD0 = qjj.d0(((mne) this.f27863a).b, new vmq0(this, null, (byte) 2), yjeVar);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d0(zje zjeVar) {
        al00 al00Var;
        sff0 sff0Var;
        ql5 ql5Var;
        sff0 sff0Var2;
        cau0 cau0Var;
        cau0 cau0Var2;
        boolean z;
        boolean z2;
        boolean z3;
        v8d v8dVarA;
        lc00 lc00VarB;
        if (zjeVar instanceof al00) {
            al00Var = (al00) zjeVar;
            int i = al00Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                al00Var.m = i - Integer.MIN_VALUE;
            } else {
                al00Var = new al00(this, zjeVar);
            }
        } else {
            al00Var = new al00(this, zjeVar);
        }
        Object obj = al00Var.k;
        wne wneVar = wne.f39444a;
        int i2 = al00Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ((hk5) ((yk50) ((h03) this.b).b).b).f13192a.n(null);
            sff0 sff0VarA = ((pru) this.c).a();
            ahu ahuVar = (ahu) this.e;
            al00Var.i = sff0VarA;
            al00Var.m = 1;
            Serializable serializableB = ahuVar.b(bm5.f2822a, al00Var);
            if (serializableB != wneVar) {
                sff0Var = sff0VarA;
                obj = serializableB;
            }
            return wneVar;
        }
        if (i2 == 1) {
            sff0Var = al00Var.i;
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = al00Var.j;
            sff0Var2 = al00Var.i;
            z1x.P(obj);
        }
        cau0Var = ((m2c0) obj).e0;
        cau0Var2 = cau0.h;
        z = false;
        if (cau0Var == cau0Var2) {
            z2 = true;
        } else {
            z2 = false;
        }
        epi0 epi0Var = (epi0) this.f27863a;
        if (!ql5Var.i.a() || (sff0Var2.s0 && cau0Var != cau0Var2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = !z3;
        if (ql5Var.i.a() || (sff0Var2.t0 && cau0Var != cau0Var2)) {
            z = true;
        }
        boolean z5 = !z;
        v8dVarA = ((bzt) this.f).f3488a.a();
        sff0Var2.getClass();
        v8dVarA.getClass();
        lc00VarB = kotlin.collections.a.b();
        if (sff0Var2.r0) {
            lc00VarB.add(yi5.f42670a);
        }
        if (sff0Var2.b0) {
            lc00VarB.add(yi5.b);
        }
        if (sff0Var2.L0) {
            lc00VarB.add(yi5.c);
        }
        if (sff0Var2.B) {
            lc00VarB.add(yi5.d);
        }
        if (sff0Var2.Y0) {
            lc00VarB.add(yi5.e);
        }
        if (v8dVarA.O && sff0Var2.d1) {
            lc00VarB.add(yi5.f);
        }
        ik5 ik5Var = new ik5(z4, z5, z2, kotlin.collections.a.a(lc00VarB));
        hk5 hk5Var = (hk5) ((yk50) epi0Var.b).b;
        hk5Var.getClass();
        hk5Var.f13192a.o(null, ik5Var);
        return Unit.f46060a;
        ql5 ql5Var2 = (ql5) obj;
        rou rouVar = (rou) this.d;
        boolean z6 = sff0Var.r0;
        al00Var.i = sff0Var;
        al00Var.j = ql5Var2;
        al00Var.m = 2;
        Object objA = rouVar.a(z6, al00Var);
        if (objA != wneVar) {
            ql5Var = ql5Var2;
            obj = objA;
            sff0Var2 = sff0Var;
            cau0Var = ((m2c0) obj).e0;
            cau0Var2 = cau0.h;
            z = false;
            if (cau0Var == cau0Var2) {
                z2 = true;
            } else {
                z2 = false;
            }
            epi0 epi0Var2 = (epi0) this.f27863a;
            if (ql5Var.i.a()) {
                z3 = true;
            } else {
                z3 = true;
            }
            boolean z7 = !z3;
            if (ql5Var.i.a()) {
                z = true;
            } else {
                z = true;
            }
            boolean z8 = !z;
            v8dVarA = ((bzt) this.f).f3488a.a();
            sff0Var2.getClass();
            v8dVarA.getClass();
            lc00VarB = kotlin.collections.a.b();
            if (sff0Var2.r0) {
                lc00VarB.add(yi5.f42670a);
            }
            if (sff0Var2.b0) {
                lc00VarB.add(yi5.b);
            }
            if (sff0Var2.L0) {
                lc00VarB.add(yi5.c);
            }
            if (sff0Var2.B) {
                lc00VarB.add(yi5.d);
            }
            if (sff0Var2.Y0) {
                lc00VarB.add(yi5.e);
            }
            if (v8dVarA.O) {
                lc00VarB.add(yi5.f);
            }
            ik5 ik5Var2 = new ik5(z7, z8, z2, kotlin.collections.a.a(lc00VarB));
            hk5 hk5Var2 = (hk5) ((yk50) epi0Var2.b).b;
            hk5Var2.getClass();
            hk5Var2.f13192a.o(null, ik5Var2);
            return Unit.f46060a;
        }
        return wneVar;
    }

    @Override // a.dgd
    public Object e(jkd0 jkd0Var) {
        if (((Set) this.f27863a).contains(jkd0Var)) {
            return ((dgd) this.f).e(jkd0Var);
        }
        e9d0.q(jkd0Var, Separators.DOT, "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e0(j700 j700Var, Set set, Set set2, boolean z, boolean z2, zje zjeVar) {
        eo00 eo00Var;
        j700 j700Var2;
        boolean z3;
        boolean z4;
        Throwable th;
        boolean z5;
        boolean z6;
        Set set3;
        Set set4;
        j700 j700Var3;
        boolean z7;
        Set set5;
        Set set6;
        boolean z8;
        Object obj;
        Integer intOrNull;
        int iIntValue;
        long j;
        if (zjeVar instanceof eo00) {
            eo00Var = (eo00) zjeVar;
            int i = eo00Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo00Var.p = i - Integer.MIN_VALUE;
            } else {
                eo00Var = new eo00(this, zjeVar);
            }
        } else {
            eo00Var = new eo00(this, zjeVar);
        }
        Object objA = eo00Var.n;
        wne wneVar = wne.f39444a;
        int i2 = eo00Var.p;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objA);
            try {
                e0g0 e0g0Var = j0g0.b;
                try {
                    reu reuVar = (reu) this.f;
                    j700Var2 = j700Var;
                    try {
                        eo00Var.i = j700Var2;
                        try {
                            eo00Var.j = set;
                            eo00Var.k = set2;
                            z3 = z;
                            try {
                                eo00Var.l = z3;
                                z4 = z2;
                                try {
                                    eo00Var.m = z4;
                                    eo00Var.p = 1;
                                    objA = ((b3c0) reuVar.b).a(false, eo00Var);
                                    if (objA == wneVar) {
                                        return wneVar;
                                    }
                                    j700Var3 = j700Var2;
                                    z7 = z3;
                                    z6 = z4;
                                    set3 = set;
                                    set4 = set2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    z5 = z3;
                                    z6 = z4;
                                    set3 = set;
                                    set4 = set2;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    Object g0g0Var = new g0g0(th);
                                    j700Var3 = j700Var2;
                                    set5 = set3;
                                    set6 = set4;
                                    z8 = z5;
                                    obj = g0g0Var;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z4 = z2;
                                th = th;
                                z5 = z3;
                                z6 = z4;
                                set3 = set;
                                set4 = set2;
                                e0g0 e0g0Var3 = j0g0.b;
                                Object g0g0Var2 = new g0g0(th);
                                j700Var3 = j700Var2;
                                set5 = set3;
                                set6 = set4;
                                z8 = z5;
                                obj = g0g0Var2;
                                boolean z9 = z6;
                                if (obj instanceof g0g0) {
                                    obj = "0";
                                }
                                intOrNull = StringsKt.toIntOrNull((String) obj);
                                if (intOrNull != null) {
                                    iIntValue = intOrNull.intValue();
                                } else {
                                    iIntValue = 225;
                                }
                                int i3 = iIntValue;
                                j700Var3.getClass();
                                if (t9x.J(j700Var3)) {
                                    j = 8;
                                } else {
                                    j = 30;
                                }
                                return bkb.i0(aoq.c(new vsg0(new coe(j, (yje) null)), new kh1(yjeVar, (Object) new fo00(this, j700Var3, i3, set5, z8, set6, z9, null), (byte) 4)), kng0.l("LoadGamesScenarioImpl.withRetry(", j700Var3.name(), Separators.RPAREN), 3, 0L, q3d.j(oqt0.class, UnknownHostException.class), null, new km00(this, b), 20);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z3 = z;
                            z4 = z2;
                            th = th;
                            z5 = z3;
                            z6 = z4;
                            set3 = set;
                            set4 = set2;
                            e0g0 e0g0Var4 = j0g0.b;
                            Object g0g0Var3 = new g0g0(th);
                            j700Var3 = j700Var2;
                            set5 = set3;
                            set6 = set4;
                            z8 = z5;
                            obj = g0g0Var3;
                            boolean z10 = z6;
                            if (obj instanceof g0g0) {
                                obj = "0";
                            }
                            intOrNull = StringsKt.toIntOrNull((String) obj);
                            if (intOrNull != null) {
                                iIntValue = intOrNull.intValue();
                            } else {
                                iIntValue = 225;
                            }
                            int i4 = iIntValue;
                            j700Var3.getClass();
                            if (t9x.J(j700Var3)) {
                                j = 8;
                            } else {
                                j = 30;
                            }
                            return bkb.i0(aoq.c(new vsg0(new coe(j, (yje) null)), new kh1(yjeVar, (Object) new fo00(this, j700Var3, i4, set5, z8, set6, z10, null), (byte) 4)), kng0.l("LoadGamesScenarioImpl.withRetry(", j700Var3.name(), Separators.RPAREN), 3, 0L, q3d.j(oqt0.class, UnknownHostException.class), null, new km00(this, b), 20);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z3 = z;
                        z4 = z2;
                        th = th;
                        z5 = z3;
                        z6 = z4;
                        set3 = set;
                        set4 = set2;
                        e0g0 e0g0Var5 = j0g0.b;
                        Object g0g0Var4 = new g0g0(th);
                        j700Var3 = j700Var2;
                        set5 = set3;
                        set6 = set4;
                        z8 = z5;
                        obj = g0g0Var4;
                        boolean z11 = z6;
                        if (obj instanceof g0g0) {
                            obj = "0";
                        }
                        intOrNull = StringsKt.toIntOrNull((String) obj);
                        if (intOrNull != null) {
                            iIntValue = intOrNull.intValue();
                        } else {
                            iIntValue = 225;
                        }
                        int i5 = iIntValue;
                        j700Var3.getClass();
                        if (t9x.J(j700Var3)) {
                            j = 8;
                        } else {
                            j = 30;
                        }
                        return bkb.i0(aoq.c(new vsg0(new coe(j, (yje) null)), new kh1(yjeVar, (Object) new fo00(this, j700Var3, i5, set5, z8, set6, z11, null), (byte) 4)), kng0.l("LoadGamesScenarioImpl.withRetry(", j700Var3.name(), Separators.RPAREN), 3, 0L, q3d.j(oqt0.class, UnknownHostException.class), null, new km00(this, b), 20);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j700Var2 = j700Var;
                }
            } catch (Throwable th7) {
                th = th7;
                j700Var2 = j700Var;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z6 = eo00Var.m;
            z7 = eo00Var.l;
            set4 = eo00Var.k;
            set3 = eo00Var.j;
            j700Var3 = eo00Var.i;
            try {
                z1x.P(objA);
            } catch (Throwable th8) {
                j700 j700Var4 = j700Var3;
                th = th8;
                z5 = z7;
                j700Var2 = j700Var4;
                e0g0 e0g0Var6 = j0g0.b;
                Object g0g0Var5 = new g0g0(th);
                j700Var3 = j700Var2;
                set5 = set3;
                set6 = set4;
                z8 = z5;
                obj = g0g0Var5;
            }
        }
        obj = ((m2c0) objA).c;
        e0g0 e0g0Var7 = j0g0.b;
        Set set7 = set4;
        z8 = z7;
        set5 = set3;
        set6 = set7;
        boolean z12 = z6;
        if (obj instanceof g0g0) {
            obj = "0";
        }
        intOrNull = StringsKt.toIntOrNull((String) obj);
        if (intOrNull != null) {
            iIntValue = intOrNull.intValue();
        } else {
            iIntValue = 225;
        }
        int i6 = iIntValue;
        j700Var3.getClass();
        if (t9x.J(j700Var3)) {
            j = 8;
        } else {
            j = 30;
        }
        return bkb.i0(aoq.c(new vsg0(new coe(j, (yje) null)), new kh1(yjeVar, (Object) new fo00(this, j700Var3, i6, set5, z8, set6, z12, null), (byte) 4)), kng0.l("LoadGamesScenarioImpl.withRetry(", j700Var3.name(), Separators.RPAREN), 3, 0L, q3d.j(oqt0.class, UnknownHostException.class), null, new km00(this, b), 20);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // a.rkr0
    public Object f(long j, zje zjeVar, String str) {
        wkr0 wkr0Var;
        gkr0 gkr0Var = (gkr0) this.d;
        if (zjeVar instanceof wkr0) {
            wkr0Var = (wkr0) zjeVar;
            int i = wkr0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkr0Var.k = i - Integer.MIN_VALUE;
            } else {
                wkr0Var = new wkr0(this, zjeVar);
            }
        } else {
            wkr0Var = new wkr0(this, zjeVar);
        }
        Object objD = wkr0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wkr0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            owp0 owp0Var = (owp0) this.c;
            String strA = ((btt0) this.b).a();
            Long l = new Long(j);
            Integer num = new Integer(gkr0Var.b().f20312a);
            okr0 okr0Var = (okr0) gkr0Var.b.getValue();
            Long l2 = new Long(okr0Var != null ? okr0Var.c : 0L);
            Map mapA = ((sd80) this.e).a();
            ArrayList arrayList = new ArrayList(mapA.size());
            Iterator it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(jtt0.t((Map.Entry) it.next()));
            }
            zkr0 zkr0Var = new zkr0(l, num, l2, arrayList, new Double(0.0d), str);
            wkr0Var.k = 1;
            objD = ((gir0) ((lkr0) owp0Var.b).invoke()).d(strA, zkr0Var, wkr0Var);
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
        return epv0.Z((nu) ((dx5) objD).a());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00eb A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x0050, B:51:0x0124, B:61:0x0157, B:36:0x00e5, B:38:0x00eb, B:40:0x00f3, B:44:0x00fc, B:46:0x0116, B:47:0x011b, B:53:0x012c, B:55:0x0146, B:60:0x0154, B:56:0x014b, B:62:0x015d, B:63:0x0160, B:64:0x0161, B:23:0x0072, B:35:0x00d1), top: B:73:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x0050, B:51:0x0124, B:61:0x0157, B:36:0x00e5, B:38:0x00eb, B:40:0x00f3, B:44:0x00fc, B:46:0x0116, B:47:0x011b, B:53:0x012c, B:55:0x0146, B:60:0x0154, B:56:0x014b, B:62:0x015d, B:63:0x0160, B:64:0x0161, B:23:0x0072, B:35:0x00d1), top: B:73:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x0050, B:51:0x0124, B:61:0x0157, B:36:0x00e5, B:38:0x00eb, B:40:0x00f3, B:44:0x00fc, B:46:0x0116, B:47:0x011b, B:53:0x012c, B:55:0x0146, B:60:0x0154, B:56:0x014b, B:62:0x015d, B:63:0x0160, B:64:0x0161, B:23:0x0072, B:35:0x00d1), top: B:73:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146 A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x0050, B:51:0x0124, B:61:0x0157, B:36:0x00e5, B:38:0x00eb, B:40:0x00f3, B:44:0x00fc, B:46:0x0116, B:47:0x011b, B:53:0x012c, B:55:0x0146, B:60:0x0154, B:56:0x014b, B:62:0x015d, B:63:0x0160, B:64:0x0161, B:23:0x0072, B:35:0x00d1), top: B:73:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x0050, B:51:0x0124, B:61:0x0157, B:36:0x00e5, B:38:0x00eb, B:40:0x00f3, B:44:0x00fc, B:46:0x0116, B:47:0x011b, B:53:0x012c, B:55:0x0146, B:60:0x0154, B:56:0x014b, B:62:0x015d, B:63:0x0160, B:64:0x0161, B:23:0x0072, B:35:0x00d1), top: B:73:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0194: RETURN (r9 I:java.lang.Object) (LINE:750), block:B:72:0x0194 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f9 -> B:61:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0122 -> B:51:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object f0(java.util.Set r18, a.zje r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pzu.f0(java.util.Set, a.zje):java.lang.Object");
    }

    @Override // a.rkr0
    public void g() {
        gkr0 gkr0Var = (gkr0) this.d;
        gkr0Var.f11458a.n(null);
        gkr0Var.b.n(null);
        ((sd80) this.e).f32021a.g(new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g0(boolean z, zje zjeVar) {
        ihn0 ihn0Var;
        if (zjeVar instanceof ihn0) {
            ihn0Var = (ihn0) zjeVar;
            int i = ihn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ihn0Var.k = i - Integer.MIN_VALUE;
            } else {
                ihn0Var = new ihn0(this, zjeVar);
            }
        } else {
            ihn0Var = new ihn0(this, zjeVar);
        }
        Object objA = ihn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ihn0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            on4 on4Var = (on4) ((wsf0) this.e).b;
            for (fzs0 fzs0Var : fzs0.c) {
                fzs0Var.getClass();
                if (on4Var.c(fzs0Var)) {
                    us00 us00Var = on4Var.f25529a.f20325a;
                    int iB = fzs0Var.b() + 13579;
                    Object systemService = us00Var.getSystemService("alarm");
                    AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
                    if (alarmManager != null) {
                        PendingIntent broadcast = PendingIntent.getBroadcast(us00Var, iB, new Intent(us00Var, (Class<?>) AuthReminderBroadcastReceiver.class), 67108864);
                        broadcast.getClass();
                        alarmManager.cancel(broadcast);
                    }
                }
            }
            t760 t760Var = on4Var.c;
            gle0 gle0Var = k9h0.f17916a;
            ((u760) t760Var).b("REGISTRATION", kotlin.collections.a.c(1257));
            uwb0 uwb0Var = (uwb0) ((owp0) ((lef0) this.b).f19899a).b;
            uwb0Var.getClass();
            SharedPreferences.Editor editorEdit = uwb0Var.a().edit();
            editorEdit.getClass();
            editorEdit.putBoolean("REGISTER_BY_SOCIAL", z);
            editorEdit.apply();
            ((rqj0) this.c).b(true);
            ((g860) this.d).f10850a.f11847a.b(true);
            rou rouVar = (rou) this.f27863a;
            ihn0Var.k = 1;
            objA = rouVar.a(false, ihn0Var);
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
        ((kt2) this.f).d(((m2c0) objA).S);
        return objA;
    }

    @Override // a.rkr0
    public Object h(bnn0 bnn0Var) {
        Object objA = ((sd80) this.e).f32021a.a(new HashMap(), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ec  */
    public boolean h0() {
        bfn bfnVar;
        long jF;
        boolean z;
        sff0 sff0VarA = ((pru) this.e).a();
        r9u r9uVar = (r9u) this.f;
        ygp ygpVar = ygp.r;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        int i = sff0VarA.A1;
        int i2 = sff0VarA.z1;
        if (!axq.z((q7d0) ((gxu) ((jgu) this.b).f16498a.f15470a).b, "RATE_APP_PERFORMED_KEY", false) && (!ua80.x((vwb0) ((gxu) ((iw20) ((f4u) this.f27863a).b).f15470a).f12096a, "RATE_APP_DIALOG_SHOWN_KEY", false) || i2 != 0)) {
            iw20 iw20Var = (iw20) ((rpt) this.c).f30901a;
            if (zD) {
                us00 us00Var = (us00) ((gxu) iw20Var.f15470a).c;
                long jCurrentTimeMillis = System.currentTimeMillis() - us00Var.getPackageManager().getPackageInfo(us00Var.getPackageName(), 0).firstInstallTime;
                uen uenVar = wen.b;
                bfnVar = bfn.MILLISECONDS;
                jF = l1e0.f(wen.l(ibc.w0(jCurrentTimeMillis, bfnVar), bfn.MINUTES), -2147483648L, 2147483647L);
            } else {
                us00 us00Var2 = (us00) ((gxu) iw20Var.f15470a).c;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - us00Var2.getPackageManager().getPackageInfo(us00Var2.getPackageName(), 0).firstInstallTime;
                uen uenVar2 = wen.b;
                bfnVar = bfn.MILLISECONDS;
                jF = l1e0.f(wen.l(ibc.w0(jCurrentTimeMillis2, bfnVar), bfn.DAYS), -2147483648L, 2147483647L);
            }
            boolean z2 = ((int) jF) >= i;
            vwb0 vwb0Var = (vwb0) ((gxu) ((iw20) ((x4u) this.d).f40284a).f15470a).f12096a;
            vwb0Var.getClass();
            long j = vwb0Var.b().getLong("RATE_APP_DIALOG_SHOWN_TIME_KEY", 0L);
            if (j != 0) {
                if (i2 > 0) {
                    if (((int) (zD ? l1e0.f(wen.l(ibc.w0(System.currentTimeMillis() - j, bfnVar), bfn.MINUTES), -2147483648L, 2147483647L) : l1e0.f(wen.l(ibc.w0(System.currentTimeMillis() - j, bfnVar), bfn.DAYS), -2147483648L, 2147483647L))) >= i2) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (z2 && z) {
                return true;
            }
        }
        return false;
    }

    @Override // a.rkr0
    public Unit i(int i, bnn0 bnn0Var) {
        Unit unitD = ((gkr0) this.d).d(i);
        return unitD == wne.f39444a ? unitD : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object i0(s470 s470Var, zje zjeVar) {
        hx90 hx90Var;
        xfq0 xfq0Var;
        kgq0 kgq0Var = (kgq0) this.e;
        if (zjeVar instanceof hx90) {
            hx90Var = (hx90) zjeVar;
            int i = hx90Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx90Var.l = i - Integer.MIN_VALUE;
            } else {
                hx90Var = new hx90(this, zjeVar);
            }
        } else {
            hx90Var = new hx90(this, zjeVar);
        }
        hx90 hx90Var2 = hx90Var;
        Object objD = hx90Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = hx90Var2.l;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(objD);
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xfq0Var = hx90Var2.i;
                z1x.P(objD);
            }
            kgq0Var.f(xfq0Var);
            return Unit.f46060a;
        }
        z1x.P(objD);
        csr csrVarA = ((ztt) this.c).a();
        double dA = ((itt) this.f27863a).a();
        ql5 ql5VarA = ((gmt) this.b).a();
        if (ql5VarA == null) {
            throw new ss3();
        }
        long j = ql5VarA.f28916a;
        long j2 = ((gst0) this.f).f11847a.a().f18785a;
        hx90Var2.l = 1;
        objD = kgq0Var.d(csrVarA, dA, j, s470Var, j2, hx90Var2);
        if (objD != wneVar) {
        }
        return wneVar;
        xfq0 xfq0Var2 = (xfq0) objD;
        fq fqVar = (fq) this.d;
        hx90Var2.i = xfq0Var2;
        hx90Var2.l = 2;
        if (fqVar.f(my5.f22588a, hx90Var2) != wneVar) {
            xfq0Var = xfq0Var2;
            kgq0Var.f(xfq0Var);
            return Unit.f46060a;
        }
        return wneVar;
    }

    @Override // a.dgd
    public p5d0 j(Class cls) {
        return l(jkd0.a(cls));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object j0(double d, Map map, int i, krr0 krr0Var, long j, zje zjeVar) {
        kqr0 kqr0Var;
        knf0 knf0Var = (knf0) this.e;
        if (zjeVar instanceof kqr0) {
            kqr0Var = (kqr0) zjeVar;
            int i2 = kqr0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kqr0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                kqr0Var = new kqr0(this, zjeVar);
            }
        } else {
            kqr0Var = new kqr0(this, zjeVar);
        }
        Object objD = kqr0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = kqr0Var.k;
        if (i3 == 0) {
            z1x.P(objD);
            long j2 = krr0Var.c;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Integer(((iqr0) it.next()).f15223a));
                }
                arrayList.add(new mpr0(iIntValue, arrayList2));
            }
            qpr0 qpr0Var = new qpr0(j, i, j2, arrayList, d);
            epi0 epi0Var = (epi0) this.d;
            String strA = ((btt0) this.f27863a).a();
            knf0Var.getClass();
            kqr0Var.k = 1;
            objD = ((nqr0) ((lkr0) epi0Var.b).invoke()).d(strA, 1, 22, qpr0Var, kqr0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        tpr0 tpr0Var = (tpr0) ((dx5) objD).a();
        String str = tpr0Var.f34348a;
        if (str == null) {
            str = "";
        }
        String str2 = tpr0Var.b;
        String str3 = str2 != null ? str2 : "";
        Double d2 = tpr0Var.c;
        return new npr0(d2 != null ? d2.doubleValue() : 0.0d, str, str3);
    }

    @Override // a.rkr0
    public Object k(String str, String str2, int i, yje yjeVar) {
        Object objD0 = qjj.d0(((mne) this.f27863a).b, new xn2(this, str, i, str2, null), yjeVar);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }

    public Object k0(cvv0 cvv0Var, zje zjeVar) {
        hu5 hu5Var;
        glt0 glt0Var = (glt0) this.c;
        lxv0 lxv0VarD = glt0Var.d();
        if (!Intrinsics.d(lxv0VarD, jxv0.f17330a) && !Intrinsics.d(lxv0VarD, kxv0.f19078a)) {
            if (!Intrinsics.d(lxv0VarD, ixv0.f15562a)) {
                t9f.b();
                return null;
            }
            if (ktt0.o(cvv0Var) == null && (hu5Var = (hu5) ((fht0) this.b).d) != null) {
                float fFloatValue = ((Number) ((t33) glt0Var.c).d()).floatValue();
                ((h0q0) this.f27863a).m().getClass();
                lxv0 lxv0VarZ = hu5Var.Z(fFloatValue, 0.0f, false);
                if (lxv0VarZ != null) {
                    lxv0VarD = lxv0VarZ;
                }
            }
        }
        if (!Intrinsics.d(lxv0VarD, glt0Var.d())) {
            lxv0VarD.getClass();
            ((hgk0) ((pz40) glt0Var.d)).setValue(lxv0VarD);
        }
        Object objC = glt0Var.c(lxv0VarD, zjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    @Override // a.dgd
    public p5d0 l(jkd0 jkd0Var) {
        if (((Set) this.b).contains(jkd0Var)) {
            return ((dgd) this.f).l(jkd0Var);
        }
        e9d0.q(jkd0Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (k0(r4, r1) == r2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l0(a.zje r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            a.ruv0 r0 = (a.ruv0) r0
            boolean r1 = r8 instanceof a.jwv0
            if (r1 == 0) goto L17
            r1 = r8
            a.jwv0 r1 = (a.jwv0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.jwv0 r1 = new a.jwv0
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.k
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            a.z1x.P(r8)
            goto L8d
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L35:
            a.z1x.P(r8)
            goto L60
        L39:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.e
            a.buv0 r8 = (a.buv0) r8
            a.pz40 r3 = r8.i
            a.hgk0 r3 = (a.hgk0) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L57
            boolean r8 = r8.g
            if (r8 == 0) goto L57
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L57:
            r1.k = r6
            java.lang.Object r8 = r7.u(r1)
            if (r8 != r2) goto L60
            goto L8c
        L60:
            java.lang.Object r8 = r7.b
            a.fht0 r8 = (a.fht0) r8
            a.cvv0 r8 = r8.f()
            if (r8 == 0) goto L90
            java.lang.Object r3 = r7.c
            a.glt0 r3 = (a.glt0) r3
            boolean r3 = r3.f()
            if (r3 == 0) goto L75
            r4 = r8
        L75:
            if (r4 != 0) goto L78
            goto L90
        L78:
            boolean r8 = r0.g()
            if (r8 == 0) goto L84
            r0.m(r4)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L84:
            r1.k = r5
            java.lang.Object r7 = r7.k0(r4, r1)
            if (r7 != r2) goto L8d
        L8c:
            return r2
        L8d:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L90:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pzu.l0(a.zje):java.lang.Object");
    }

    @Override // a.dgd
    public Set m(jkd0 jkd0Var) {
        if (((Set) this.d).contains(jkd0Var)) {
            return ((dgd) this.f).m(jkd0Var);
        }
        e9d0.q(jkd0Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:45:0x019c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0215  */
    /* JADX WARN: Code duplicated, block: B:77:0x022e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x026e A[LOOP:1: B:81:0x0268->B:83:0x026e, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public Object m0(String str, Map map, String str2, Function2 function2, String str3, Function2 function3, boolean z, String str4, int i, String str5, zje zjeVar) {
        wmg0 wmg0Var;
        String str6;
        Function2 function4;
        String str7;
        Object objL;
        String str8;
        boolean z2;
        Function2 function5;
        String str9;
        Map map2;
        long j;
        Map map3;
        Function2 function6;
        String str10;
        String str11;
        rns0 rns0Var;
        String str12;
        rns0 rns0Var2;
        String str13;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        String lowerCase;
        Object objInvoke;
        Map map4;
        String str14;
        String str15;
        String str16;
        String str17;
        int i2;
        double dDoubleValue;
        String strR;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        ivf ivfVar;
        Map map11;
        ArrayList arrayList;
        double dDoubleValue2;
        double dN;
        boolean z6 = z;
        if (zjeVar instanceof wmg0) {
            wmg0Var = (wmg0) zjeVar;
            int i3 = wmg0Var.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wmg0Var.A = i3 - Integer.MIN_VALUE;
            } else {
                wmg0Var = new wmg0(this, zjeVar);
            }
        } else {
            wmg0Var = new wmg0(this, zjeVar);
        }
        Object obj = wmg0Var.y;
        Object obj2 = wne.f39444a;
        int i4 = wmg0Var.A;
        if (i4 == 0) {
            z1x.P(obj);
            wmg0Var.i = map;
            wmg0Var.j = str2;
            wmg0Var.k = function2;
            str6 = str3;
            wmg0Var.l = str6;
            function4 = function3;
            wmg0Var.m = function4;
            str7 = str4;
            wmg0Var.n = str7;
            wmg0Var.o = str5;
            wmg0Var.u = z6;
            wmg0Var.v = i;
            wmg0Var.A = 1;
            objL = L(wmg0Var, str, str2, z6);
            if (objL != obj2) {
                str8 = str2;
                z2 = i;
                function5 = function2;
                str9 = str5;
                map2 = map;
            }
            return obj2;
        }
        if (i4 == 1) {
            boolean z7 = wmg0Var.v;
            z6 = wmg0Var.u;
            String str18 = wmg0Var.o;
            String str19 = wmg0Var.n;
            Function2 function7 = wmg0Var.m;
            String str20 = wmg0Var.l;
            function5 = wmg0Var.k;
            str8 = wmg0Var.j;
            map2 = wmg0Var.i;
            z1x.P(obj);
            objL = obj;
            str9 = str18;
            str6 = str20;
            str7 = str19;
            function4 = function7;
            z2 = z7;
        } else {
            if (i4 == 2) {
                j2 = wmg0Var.x;
                z3 = wmg0Var.v;
                z4 = wmg0Var.u;
                rns0Var2 = wmg0Var.p;
                str10 = wmg0Var.o;
                str12 = wmg0Var.n;
                function6 = wmg0Var.k;
                str13 = wmg0Var.j;
                map3 = wmg0Var.i;
                z1x.P(obj);
                str11 = (String) obj;
                z6 = z4;
                j = j2;
                z5 = z3;
                rns0Var = rns0Var2;
                str7 = str12;
                str8 = str13;
                Locale locale = Locale.getDefault();
                locale.getClass();
                lowerCase = str7.toLowerCase(locale);
                lowerCase.getClass();
                Long l = new Long(j);
                wmg0Var.i = map3;
                wmg0Var.j = null;
                wmg0Var.k = null;
                wmg0Var.l = null;
                wmg0Var.m = null;
                wmg0Var.n = null;
                wmg0Var.o = str10;
                wmg0Var.p = null;
                wmg0Var.q = str11;
                wmg0Var.r = rns0Var;
                wmg0Var.s = str8;
                wmg0Var.t = lowerCase;
                wmg0Var.u = z6;
                wmg0Var.v = z5;
                wmg0Var.x = j;
                wmg0Var.w = z5;
                wmg0Var.A = 3;
                objInvoke = function6.invoke(l, wmg0Var);
                if (objInvoke != obj2) {
                    map4 = map3;
                    str14 = str10;
                    str15 = str8;
                    str16 = str11;
                    obj = objInvoke;
                    str17 = lowerCase;
                    i2 = z5;
                }
                return obj2;
            }
            if (i4 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z8 = wmg0Var.w;
            str17 = wmg0Var.t;
            str15 = wmg0Var.s;
            rns0Var = wmg0Var.r;
            str16 = wmg0Var.q;
            str14 = wmg0Var.o;
            map4 = wmg0Var.i;
            z1x.P(obj);
            i2 = z8;
        }
        dDoubleValue = ((Number) obj).doubleValue();
        vby vbyVar = (vby) this.f;
        rns0Var.getClass();
        str15.getClass();
        str17.getClass();
        str16.getClass();
        map4.getClass();
        str14.getClass();
        vbyVar.getClass();
        strR = rns0Var.f30805a;
        if (strR == null) {
            strR = "";
        }
        String strValueOf = String.valueOf(i2);
        map5 = rns0Var.e;
        map6 = rns0Var.d;
        map7 = rns0Var.c;
        if ((map7 != null || (map8 = (Map) map7.get(str15)) == null) && (map7 == null || (map8 = (Map) map7.get("en")) == null)) {
            map8 = lun.f20680a;
            map8.getClass();
        }
        if ((map6 != null || (map9 = (Map) map6.get(str17)) == null) && (map6 == null || (map9 = (Map) map6.get("default")) == null)) {
            map9 = lun.f20680a;
            map9.getClass();
        }
        LinkedHashMap linkedHashMapJ = xp20.j(map8, map9);
        if ((map5 != null || (map10 = (Map) map5.get(strValueOf)) == null) && (map5 == null || (map10 = (Map) map5.get("default")) == null)) {
            map10 = lun.f20680a;
            map10.getClass();
        }
        LinkedHashMap linkedHashMapJ2 = xp20.j(linkedHashMapJ, map10);
        ivfVar = rns0Var.b;
        if (ivfVar != null || (map11 = ivfVar.b) == null) {
            map11 = lun.f20680a;
            map11.getClass();
        }
        arrayList = new ArrayList(map11.size());
        for (Map.Entry entry : map11.entrySet()) {
            dDoubleValue2 = ((Number) entry.getValue()).doubleValue() * dDoubleValue;
            pn40 pn40Var = pn40.f27267a;
            if (dDoubleValue2 > 1.0d) {
                dN = pn40.m(dDoubleValue2, p3u0.j, RoundingMode.UP);
            } else {
                RoundingMode roundingMode = RoundingMode.UP;
                dN = pn40.n(dDoubleValue2, 2);
            }
            arrayList.add(new Pair(entry.getKey(), pn40.d(dN, str16, p3u0.c)));
        }
        for (Map.Entry entry2 : xp20.j(xp20.j(linkedHashMapJ2, xp20.m(arrayList)), map4).entrySet()) {
            strR = kotlin.text.c.r(strR, (String) entry2.getKey(), kotlin.text.c.r((String) entry2.getValue(), Separators.DOUBLE_QUOTE, Separators.QUOTE, false), false);
        }
        return atm0.q(new wns0(ncy.i(vbyVar.e(strR)), str14));
        rns0 rns0Var3 = (rns0) objL;
        ivf ivfVar2 = rns0Var3.b;
        j = ivfVar2 != null ? ivfVar2.f15443a : 0L;
        if (str6.length() != 0 || j == 0) {
            map3 = map2;
            function6 = function5;
            str10 = str9;
            str11 = str6;
            rns0Var = rns0Var3;
            z5 = z2;
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            lowerCase = str7.toLowerCase(locale2);
            lowerCase.getClass();
            Long l2 = new Long(j);
            wmg0Var.i = map3;
            wmg0Var.j = null;
            wmg0Var.k = null;
            wmg0Var.l = null;
            wmg0Var.m = null;
            wmg0Var.n = null;
            wmg0Var.o = str10;
            wmg0Var.p = null;
            wmg0Var.q = str11;
            wmg0Var.r = rns0Var;
            wmg0Var.s = str8;
            wmg0Var.t = lowerCase;
            wmg0Var.u = z6;
            wmg0Var.v = z5;
            wmg0Var.x = j;
            wmg0Var.w = z5;
            wmg0Var.A = 3;
            objInvoke = function6.invoke(l2, wmg0Var);
            if (objInvoke != obj2) {
                map4 = map3;
                str14 = str10;
                str15 = str8;
                str16 = str11;
                obj = objInvoke;
                str17 = lowerCase;
                i2 = z5;
                dDoubleValue = ((Number) obj).doubleValue();
                vby vbyVar2 = (vby) this.f;
                rns0Var.getClass();
                str15.getClass();
                str17.getClass();
                str16.getClass();
                map4.getClass();
                str14.getClass();
                vbyVar2.getClass();
                strR = rns0Var.f30805a;
                if (strR == null) {
                    strR = "";
                }
                String strValueOf2 = String.valueOf(i2);
                map5 = rns0Var.e;
                map6 = rns0Var.d;
                map7 = rns0Var.c;
                if (map7 != null) {
                    map8 = lun.f20680a;
                    map8.getClass();
                } else {
                    map8 = lun.f20680a;
                    map8.getClass();
                }
                if (map6 != null) {
                    map9 = lun.f20680a;
                    map9.getClass();
                } else {
                    map9 = lun.f20680a;
                    map9.getClass();
                }
                LinkedHashMap linkedHashMapJ3 = xp20.j(map8, map9);
                if (map5 != null) {
                    map10 = lun.f20680a;
                    map10.getClass();
                } else {
                    map10 = lun.f20680a;
                    map10.getClass();
                }
                LinkedHashMap linkedHashMapJ4 = xp20.j(linkedHashMapJ3, map10);
                ivfVar = rns0Var.b;
                if (ivfVar != null) {
                    map11 = lun.f20680a;
                    map11.getClass();
                } else {
                    map11 = lun.f20680a;
                    map11.getClass();
                }
                arrayList = new ArrayList(map11.size());
                while (r2.hasNext()) {
                    dDoubleValue2 = ((Number) entry.getValue()).doubleValue() * dDoubleValue;
                    pn40 pn40Var2 = pn40.f27267a;
                    if (dDoubleValue2 > 1.0d) {
                        dN = pn40.m(dDoubleValue2, p3u0.j, RoundingMode.UP);
                    } else {
                        RoundingMode roundingMode2 = RoundingMode.UP;
                        dN = pn40.n(dDoubleValue2, 2);
                    }
                    arrayList.add(new Pair(entry.getKey(), pn40.d(dN, str16, p3u0.c)));
                }
                while (r1.hasNext()) {
                    strR = kotlin.text.c.r(strR, (String) entry2.getKey(), kotlin.text.c.r((String) entry2.getValue(), Separators.DOUBLE_QUOTE, Separators.QUOTE, false), false);
                }
                return atm0.q(new wns0(ncy.i(vbyVar2.e(strR)), str14));
            }
        } else {
            Long l3 = new Long(j);
            wmg0Var.i = map2;
            wmg0Var.j = str8;
            wmg0Var.k = function5;
            wmg0Var.l = null;
            wmg0Var.m = null;
            wmg0Var.n = str7;
            wmg0Var.o = str9;
            wmg0Var.p = rns0Var3;
            wmg0Var.u = z6;
            wmg0Var.v = z2;
            wmg0Var.x = j;
            wmg0Var.A = 2;
            Object objInvoke2 = function4.invoke(l3, wmg0Var);
            if (objInvoke2 != obj2) {
                String str21 = str8;
                str12 = str7;
                rns0Var2 = rns0Var3;
                str13 = str21;
                map3 = map2;
                function6 = function5;
                str10 = str9;
                obj = objInvoke2;
                z3 = z2 ? 1 : 0;
                z4 = z6;
                j2 = j;
                str11 = (String) obj;
                z6 = z4;
                j = j2;
                z5 = z3;
                rns0Var = rns0Var2;
                str7 = str12;
                str8 = str13;
                Locale locale3 = Locale.getDefault();
                locale3.getClass();
                lowerCase = str7.toLowerCase(locale3);
                lowerCase.getClass();
                Long l4 = new Long(j);
                wmg0Var.i = map3;
                wmg0Var.j = null;
                wmg0Var.k = null;
                wmg0Var.l = null;
                wmg0Var.m = null;
                wmg0Var.n = null;
                wmg0Var.o = str10;
                wmg0Var.p = null;
                wmg0Var.q = str11;
                wmg0Var.r = rns0Var;
                wmg0Var.s = str8;
                wmg0Var.t = lowerCase;
                wmg0Var.u = z6;
                wmg0Var.v = z5;
                wmg0Var.x = j;
                wmg0Var.w = z5;
                wmg0Var.A = 3;
                objInvoke = function6.invoke(l4, wmg0Var);
                if (objInvoke != obj2) {
                    map4 = map3;
                    str14 = str10;
                    str15 = str8;
                    str16 = str11;
                    obj = objInvoke;
                    str17 = lowerCase;
                    i2 = z5;
                    dDoubleValue = ((Number) obj).doubleValue();
                    vby vbyVar3 = (vby) this.f;
                    rns0Var.getClass();
                    str15.getClass();
                    str17.getClass();
                    str16.getClass();
                    map4.getClass();
                    str14.getClass();
                    vbyVar3.getClass();
                    strR = rns0Var.f30805a;
                    if (strR == null) {
                        strR = "";
                    }
                    String strValueOf3 = String.valueOf(i2);
                    map5 = rns0Var.e;
                    map6 = rns0Var.d;
                    map7 = rns0Var.c;
                    if (map7 != null) {
                        map8 = lun.f20680a;
                        map8.getClass();
                    } else {
                        map8 = lun.f20680a;
                        map8.getClass();
                    }
                    if (map6 != null) {
                        map9 = lun.f20680a;
                        map9.getClass();
                    } else {
                        map9 = lun.f20680a;
                        map9.getClass();
                    }
                    LinkedHashMap linkedHashMapJ5 = xp20.j(map8, map9);
                    if (map5 != null) {
                        map10 = lun.f20680a;
                        map10.getClass();
                    } else {
                        map10 = lun.f20680a;
                        map10.getClass();
                    }
                    LinkedHashMap linkedHashMapJ6 = xp20.j(linkedHashMapJ5, map10);
                    ivfVar = rns0Var.b;
                    if (ivfVar != null) {
                        map11 = lun.f20680a;
                        map11.getClass();
                    } else {
                        map11 = lun.f20680a;
                        map11.getClass();
                    }
                    arrayList = new ArrayList(map11.size());
                    while (r2.hasNext()) {
                        dDoubleValue2 = ((Number) entry.getValue()).doubleValue() * dDoubleValue;
                        pn40 pn40Var3 = pn40.f27267a;
                        if (dDoubleValue2 > 1.0d) {
                            dN = pn40.m(dDoubleValue2, p3u0.j, RoundingMode.UP);
                        } else {
                            RoundingMode roundingMode3 = RoundingMode.UP;
                            dN = pn40.n(dDoubleValue2, 2);
                        }
                        arrayList.add(new Pair(entry.getKey(), pn40.d(dN, str16, p3u0.c)));
                    }
                    while (r1.hasNext()) {
                        strR = kotlin.text.c.r(strR, (String) entry2.getKey(), kotlin.text.c.r((String) entry2.getValue(), Separators.DOUBLE_QUOTE, Separators.QUOTE, false), false);
                    }
                    return atm0.q(new wns0(ncy.i(vbyVar3.e(strR)), str14));
                }
            }
        }
        return obj2;
    }

    @Override // a.rkr0
    public Object n(HashMap map, bnn0 bnn0Var) {
        Object objA = ((sd80) this.e).f32021a.a(map, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable n0(String str, Map map, tr trVar, String str2, String str3, int i, String str4, Function2 function2, boolean z, String str5, String str6, zje zjeVar) {
        xmg0 xmg0Var;
        String str7;
        String str8;
        String str9;
        ykg0 ykg0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof xmg0) {
            xmg0Var = (xmg0) zjeVar;
            int i2 = xmg0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xmg0Var.m = i2 - Integer.MIN_VALUE;
            } else {
                xmg0Var = new xmg0(this, zjeVar);
            }
        } else {
            xmg0Var = new xmg0(this, zjeVar);
        }
        xmg0 xmg0Var2 = xmg0Var;
        Object objM0 = xmg0Var2.k;
        wne wneVar = wne.f39444a;
        int i3 = xmg0Var2.m;
        String str10 = null;
        if (i3 == 0) {
            z1x.P(objM0);
            String strC = knf0Var.c();
            str7 = str3;
            xmg0Var2.i = str7;
            str8 = str4;
            xmg0Var2.j = str8;
            xmg0Var2.m = 1;
            objM0 = m0(str, map, strC, trVar, str2, function2, z, str5, 1, str6, xmg0Var2);
            if (objM0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str11 = xmg0Var2.j;
            String str12 = xmg0Var2.i;
            z1x.P(objM0);
            str8 = str11;
            str7 = str12;
        }
        tns0 tns0Var = (tns0) objM0;
        tns0Var.getClass();
        str7.getClass();
        str8.getClass();
        ArrayList<tns0> arrayListH = zsm0.h(tns0Var);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListH, 10));
        for (tns0 tns0Var2 : arrayListH) {
            ysw yswVar = tns0Var2.g;
            clg0 clg0Var = tns0Var2.i;
            String str13 = tns0Var2.f34251a;
            String str14 = tns0Var2.c;
            Map map2 = tns0Var2.d;
            ysw yswVar2 = yswVar.a() ? new ysw(tns0Var2.e, 4) : tns0Var2.g;
            if (map2.isEmpty() || (str9 = (String) map2.get("loc_".concat(str7))) == null) {
                str9 = str14;
            }
            ykg0 ykg0Var2 = (str14.length() == 0 && yswVar2.a()) ? null : new ykg0(false, str9, yswVar2, yswVar2, clg0Var);
            if (ykg0Var2 != null) {
                yswVar2 = new ysw(str10, 15);
            }
            if (str13.length() > 0) {
                String str15 = (String) tns0Var2.b.get("loc_".concat(str7));
                if (str15 != null) {
                    str13 = str15;
                }
                ykg0Var = new ykg0(true, str13, yswVar2, yswVar2, clg0Var);
            } else {
                ykg0Var = null;
            }
            arrayList.add(tx3.z(new ykg0[]{ykg0Var, ykg0Var2}));
        }
        ArrayList arrayListR = r3d.r(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListR, 10));
        int i4 = 0;
        for (Object obj : arrayListR) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            ykg0 ykg0Var3 = (ykg0) obj;
            String str16 = (str8.length() <= 0 || i4 != 0) ? ykg0Var3.c.d : str8;
            ysw yswVar3 = ykg0Var3.c;
            ysw yswVar4 = new ysw(yswVar3.f43189a, yswVar3.b, yswVar3.c, str16);
            arrayList2.add(new ykg0(ykg0Var3.f42786a, ykg0Var3.b, yswVar4, yswVar4, ykg0Var3.e));
            i4 = i5;
        }
        return arrayList2;
    }

    @Override // a.dgd
    public p5d0 o(jkd0 jkd0Var) {
        if (((Set) this.e).contains(jkd0Var)) {
            return ((dgd) this.f).o(jkd0Var);
        }
        e9d0.q(jkd0Var, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public void o0(uu4 uu4Var) {
        wwb0 wwb0Var = (wwb0) this.e;
        if (uu4Var != null) {
            if (uu4Var instanceof su4) {
                int i = ((su4) uu4Var).b;
                wwb0Var.getClass();
                ((SharedPreferences) wwb0Var.c.getValue()).edit().putInt("USER_TEMPORARY_EN_SOCIAL", i).apply();
                return;
            } else {
                if (uu4Var instanceof tu4) {
                    tu4 tu4Var = (tu4) uu4Var;
                    wwb0Var.b("USER_TEMPORARY_LOGIN", tu4Var.f34533a);
                    wwb0Var.b("USER_TEMPORARY_PASS", tu4Var.b);
                    wwb0Var.b("USER_TEMPORARY_PASS_PHONE_CODE", tu4Var.c);
                    wwb0Var.b("USER_TEMPORARY_PASS_PHONE_BODY", tu4Var.d);
                    return;
                }
                if (uu4Var instanceof ru4) {
                    return;
                }
            }
        }
        t9f.b();
    }

    @Override // a.rkr0
    public void p() {
        ((gkr0) this.d).b.n(null);
    }

    public void p0(String str, Bundle bundle, boolean z) {
        String str2;
        String strEncodeToString;
        boolean zE;
        int i;
        char c;
        bundle.putString(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, Separators.STAR);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        nfq nfqVar = (nfq) this.f27863a;
        nfqVar.a();
        bundle.putString("gmp_app_id", nfqVar.c.b);
        bundle.putString("gmsv", Integer.toString(((fd40) this.b).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((fd40) this.b).a());
        fd40 fd40Var = (fd40) this.b;
        synchronized (fd40Var) {
            try {
                if (fd40Var.c == null) {
                    fd40Var.f();
                }
                str2 = fd40Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("app_ver_name", str2);
        nfq nfqVar2 = (nfq) this.f27863a;
        nfqVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(nfqVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        if (z) {
            nfq nfqVar3 = (nfq) this.f27863a;
            nfqVar3.a();
            bundle.putString("Goog-Api-Key", nfqVar3.c.f21755a);
        }
        try {
            String str3 = ((d45) Tasks.await(((cgq) ((dgq) this.f)).d())).f5438a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) Tasks.await(((cgq) ((dgq) this.f)).c()));
        bundle.putString("cliv", "fcm-25.1.3");
        ltv ltvVar = (ltv) ((p5d0) this.e).get();
        yyj yyjVar = (yyj) ((p5d0) this.d).get();
        if (ltvVar == null || yyjVar == null) {
            return;
        }
        quj qujVar = (quj) ltvVar;
        synchronized (qujVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            mtv mtvVar = (mtv) qujVar.f29348a.get();
            synchronized (mtvVar) {
                zE = mtvVar.e(mtv.b, jCurrentTimeMillis);
            }
            i = 1;
            if (zE) {
                synchronized (mtvVar) {
                    mtvVar.f22386a.a(new ka6(mtvVar, mtv.b(System.currentTimeMillis())));
                }
                c = 3;
            } else {
                c = 1;
            }
        }
        if (c != 1) {
            if (c == 1) {
                i = 0;
            } else if (c != 2) {
                if (c != 3) {
                    throw null;
                }
                i = 2;
            }
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(i));
            bundle.putString("Firebase-Client", yyjVar.a());
        }
    }

    @Override // a.dgd
    public y680 q(jkd0 jkd0Var) {
        if (((Set) this.c).contains(jkd0Var)) {
            return ((dgd) this.f).q(jkd0Var);
        }
        e9d0.q(jkd0Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable q0(List list, zje zjeVar) {
        l200 l200Var;
        List list2;
        if (zjeVar instanceof l200) {
            l200Var = (l200) zjeVar;
            int i = l200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l200Var.k = i - Integer.MIN_VALUE;
            } else {
                l200Var = new l200(this, zjeVar);
            }
        } else {
            l200Var = new l200(this, zjeVar);
        }
        Object objF = l200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = l200Var.k;
        if (i2 == 0) {
            z1x.P(objF);
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q100 q100Var = (q100) it.next();
                q100Var.getClass();
                arrayList.add(new znz(q100Var.f27927a, q100Var.b));
            }
            qpi0 qpi0Var = new qpi0(arrayList);
            abu abuVar = (abu) this.f27863a;
            String strA = ((btt0) this.e).a();
            String strC = ((knf0) this.f).c();
            l200Var.k = 1;
            objF = ((kuz) ((rcz) abuVar.c).invoke()).f(strA, strC, qpi0Var, l200Var);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        p300 p300Var = ((tpi0) ((dx5) objF).a()).f34335a;
        if (p300Var == null || (list2 = p300Var.f26275a) == null) {
            return iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a8k0.M((qhu) it2.next()));
        }
        return arrayList2;
    }

    @Override // a.rkr0
    public lmr0 r() {
        return ((gkr0) this.d).b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [a.iun] */
    public Object r0(List list, zje zjeVar) {
        m200 m200Var;
        ?? arrayList;
        ?? arrayList2;
        List<cld0> list2;
        List list3;
        if (zjeVar instanceof m200) {
            m200Var = (m200) zjeVar;
            int i = m200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m200Var.k = i - Integer.MIN_VALUE;
            } else {
                m200Var = new m200(this, zjeVar);
            }
        } else {
            m200Var = new m200(this, zjeVar);
        }
        Object objC = m200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = m200Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q100 q100Var = (q100) it.next();
                q100Var.getClass();
                arrayList3.add(new znz(q100Var.f27927a, q100Var.b));
            }
            qpi0 qpi0Var = new qpi0(arrayList3);
            abu abuVar = (abu) this.f27863a;
            String strA = ((btt0) this.e).a();
            String strC = ((knf0) this.f).c();
            m200Var.k = 1;
            objC = ((kuz) ((rcz) abuVar.c).invoke()).c(strA, strC, qpi0Var, m200Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        ypi0 ypi0Var = (ypi0) ((dx5) objC).a();
        p300 p300Var = ypi0Var.f43032a;
        if (p300Var == null || (list3 = p300Var.f26275a) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(a8k0.M((qhu) it2.next()));
            }
        }
        vkd0 vkd0Var = ypi0Var.b;
        String str = vkd0Var != null ? vkd0Var.f37567a : null;
        if (str == null) {
            str = "";
        }
        if (vkd0Var == null || (list2 = vkd0Var.b) == null) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (cld0 cld0Var : list2) {
                cld0Var.getClass();
                Integer num = cld0Var.f4552a;
                if (num == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num.intValue();
                String str2 = cld0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new xkd0(iIntValue, str2));
            }
        }
        h500 h500Var = new h500(str, arrayList, arrayList2);
        xio xioVar = (xio) this.c;
        xioVar.getClass();
        xioVar.f40954a = str;
        return h500Var;
    }

    @Override // a.rkr0
    public Map s() {
        return ((sd80) this.e).a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Serializable s0(ArrayList arrayList, HashMap map, long j, long j2, zje zjeVar) {
        oc60 oc60Var;
        ArrayList<xt20> arrayList2;
        Map map2;
        ArrayList arrayList3;
        Boolean bool;
        boolean zBooleanValue;
        HashMap map3 = map;
        if (zjeVar instanceof oc60) {
            oc60Var = (oc60) zjeVar;
            int i = oc60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                oc60Var.n = i - Integer.MIN_VALUE;
            } else {
                oc60Var = new oc60(this, zjeVar);
            }
        } else {
            oc60Var = new oc60(this, zjeVar);
        }
        Object obj = oc60Var.l;
        wne wneVar = wne.f39444a;
        int i2 = oc60Var.n;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                xt20 xt20Var = (xt20) obj2;
                Pair pair = map3.containsKey(new Long(xt20Var.b)) ? null : new Pair(new Long(xt20Var.b), Boolean.valueOf(i3 < 3));
                if (pair != null) {
                    arrayListT.add(pair);
                }
                i3 = i4;
            }
            Map mapM = xp20.m(arrayListT);
            if (mapM.isEmpty()) {
                arrayList2 = arrayList;
            } else {
                ub60 ub60Var = (ub60) this.e;
                arrayList2 = arrayList;
                oc60Var.i = arrayList2;
                oc60Var.j = map3;
                oc60Var.k = mapM;
                oc60Var.n = 1;
                Unit unitB = ub60Var.f35365a.f13403a.b(j, j2, mapM);
                wne wneVar2 = wne.f39444a;
                if (unitB != wneVar2) {
                    unitB = Unit.f46060a;
                }
                if (unitB != wneVar2) {
                    unitB = Unit.f46060a;
                }
                if (unitB == wneVar) {
                    return wneVar;
                }
                map2 = mapM;
            }
            arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (xt20 xt20Var2 : arrayList2) {
                bool = (Boolean) map3.get(new Long(xt20Var2.b));
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                arrayList3.add(xt20.a(xt20Var2, null, zBooleanValue, 0L, 0.0d, 247));
            }
            return arrayList3;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        map2 = oc60Var.k;
        map3 = oc60Var.j;
        ArrayList arrayList4 = oc60Var.i;
        z1x.P(obj);
        arrayList2 = arrayList4;
        HashMap map4 = new HashMap(map3);
        map4.putAll(map2);
        map3 = map4;
        arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        while (r2.hasNext()) {
            bool = (Boolean) map3.get(new Long(xt20Var2.b));
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            arrayList3.add(xt20.a(xt20Var2, null, zBooleanValue, 0L, 0.0d, 247));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        iwv0 iwv0Var;
        if (zjeVar instanceof iwv0) {
            iwv0Var = (iwv0) zjeVar;
            int i = iwv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwv0Var.k = i - Integer.MIN_VALUE;
            } else {
                iwv0Var = new iwv0(this, zjeVar);
            }
        } else {
            iwv0Var = new iwv0(this, zjeVar);
        }
        Object obj = iwv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = iwv0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (!((mkt0) this.f).b()) {
                return Unit.f46060a;
            }
            vsg0 vsg0VarV = ydx.V(null, new jmv0(this, (byte) 10));
            b04 b04Var = new b04(2, yjeVar, (byte) 7);
            iwv0Var.k = 1;
            if (ntb.L(vsg0VarV, b04Var, iwv0Var) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object v(int i, long j, zje zjeVar, boolean z) {
        bsc0 bsc0Var;
        boolean z2;
        if (zjeVar instanceof bsc0) {
            bsc0Var = (bsc0) zjeVar;
            int i2 = bsc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bsc0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                bsc0Var = new bsc0(this, zjeVar);
            }
        } else {
            bsc0Var = new bsc0(this, zjeVar);
        }
        bsc0 bsc0Var2 = bsc0Var;
        Object objF = bsc0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = bsc0Var2.l;
        if (i3 == 0) {
            z1x.P(objF);
            jw20 jw20Var = (jw20) this.d;
            ooc0 ooc0Var = new ooc0(i, j);
            String strA = ((btt0) this.f).a();
            String strC = ((knf0) this.c).c();
            bsc0Var2.i = z;
            bsc0Var2.l = 1;
            objF = ((ufc0) ((rta0) jw20Var.b).invoke()).f(ooc0Var, strA, strC, "application/vnd.xenvelop+json", bsc0Var2);
            if (objF == wneVar) {
                return wneVar;
            }
            z2 = z;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = bsc0Var2.i;
            z1x.P(objF);
            z2 = z3;
        }
        e8c0 e8c0Var = (e8c0) ((dx5) objF).a();
        Integer num = e8c0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = e8c0Var.f7366a;
        if (str == null) {
            str = "";
        }
        Integer num2 = e8c0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str2 = e8c0Var.d;
        String str3 = str2 != null ? str2 : "";
        Integer num3 = e8c0Var.e;
        f8c0 f8c0Var = new f8c0(iIntValue, str, iIntValue2, str3, num3 != null ? num3.intValue() : 0, esr.NOTHING, 0L, z2, 0.0d);
        ((agc0) this.f27863a).f818a.clear();
        return f8c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object w(int i, long j, xg8 xg8Var, boolean z, zje zjeVar) {
        csc0 csc0Var;
        boolean z2;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof csc0) {
            csc0Var = (csc0) zjeVar;
            int i2 = csc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                csc0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                csc0Var = new csc0(this, zjeVar);
            }
        } else {
            csc0Var = new csc0(this, zjeVar);
        }
        csc0 csc0Var2 = csc0Var;
        Object objE = csc0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = csc0Var2.l;
        if (i3 == 0) {
            z1x.P(objE);
            jw20 jw20Var = (jw20) this.d;
            osj0 osj0Var = new osj0(xg8Var.f40824a, i, j);
            String strA = ((btt0) this.f).a();
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            z2 = z;
            csc0Var2.i = z2;
            csc0Var2.l = 1;
            objE = ((ufc0) ((rta0) jw20Var.b).invoke()).e(osj0Var, strA, strC, iB, 1357, 22, "application/vnd.xenvelop+json", csc0Var2);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = csc0Var2.i;
            z1x.P(objE);
        }
        boolean z3 = z2;
        ysj0 ysj0Var = (ysj0) ((dx5) objE).a();
        String str = ysj0Var.f;
        String str2 = str == null ? "" : str;
        Integer num = ysj0Var.f43171a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = ysj0Var.b;
        String str4 = str3 == null ? "" : str3;
        nek nekVar = esr.b;
        Integer num2 = ysj0Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        nekVar.getClass();
        esr esrVarF = nek.f(iIntValue2);
        Long l = ysj0Var.d;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d = ysj0Var.g;
        f8c0 f8c0Var = new f8c0(0, str2, iIntValue, str4, 0, esrVarF, jLongValue, z3, d != null ? d.doubleValue() : 0.0d);
        ((agc0) this.f27863a).f818a.clear();
        return f8c0Var;
    }

    public boolean x() {
        List listL;
        List listA;
        rpt rptVar = (rpt) this.e;
        List listL2 = rptVar.l(true);
        return (listL2 == null || listL2.isEmpty()) && ((listL = rptVar.l(false)) == null || listL.isEmpty()) && ((listA = ((i9u) this.c).a()) == null || listA.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object y(double d, long j, int i, zje zjeVar) {
        i840 i840Var;
        if (zjeVar instanceof i840) {
            i840Var = (i840) zjeVar;
            int i2 = i840Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i840Var.k = i2 - Integer.MIN_VALUE;
            } else {
                i840Var = new i840(this, zjeVar);
            }
        } else {
            i840Var = new i840(this, zjeVar);
        }
        i840 i840Var2 = i840Var;
        Object objE = i840Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = i840Var2.k;
        if (i3 == 0) {
            z1x.P(objE);
            gsj gsjVar = (gsj) this.b;
            String strA = ((btt0) this.e).a();
            Integer num = new Integer(i);
            i840Var2.k = 1;
            objE = gsjVar.a().e(strA, d, j, num, "application/vnd.xenvelop+json", i840Var2);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        Integer num2 = ((c840) ((dx5) objE).a()).b;
        return new Integer(num2 != null ? num2.intValue() : 0);
    }

    public void z(Throwable th) {
        xw3 xw3Var = (xw3) this.f;
        q99 q99Var = (q99) this.e;
        if (q99Var.e(th, false)) {
            for (Object objJ = q99Var.j(); !(objJ instanceof ytb); objJ = q99Var.j()) {
                ztb.c(objJ);
                xw3Var.addLast(objJ);
            }
            if (xw3Var.isEmpty()) {
                return;
            }
            ((Function1) this.b).invoke(new ArrayList(xw3Var));
            xw3Var.clear();
        }
    }

    public pzu(String str, String str2, String str3, String str4, String str5, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f27863a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public pzu(rou rouVar, lef0 lef0Var, rqj0 rqj0Var, g860 g860Var, wsf0 wsf0Var, kt2 kt2Var) {
        kt2Var.getClass();
        this.f27863a = rouVar;
        this.b = lef0Var;
        this.c = rqj0Var;
        this.d = g860Var;
        this.e = wsf0Var;
        this.f = kt2Var;
    }

    public pzu(emg0 emg0Var, ljf0 ljf0Var, knf0 knf0Var, rl70 rl70Var, mne mneVar, vby vbyVar) {
        emg0Var.getClass();
        knf0Var.getClass();
        vbyVar.getClass();
        this.f27863a = emg0Var;
        this.b = ljf0Var;
        this.c = knf0Var;
        this.d = rl70Var;
        this.e = mneVar;
        this.f = vbyVar;
    }

    public pzu(btt0 btt0Var, hqr0 hqr0Var, csr0 csr0Var, epi0 epi0Var, knf0 knf0Var, tgk tgkVar) {
        btt0Var.getClass();
        hqr0Var.getClass();
        csr0Var.getClass();
        knf0Var.getClass();
        tgkVar.getClass();
        this.f27863a = btt0Var;
        this.b = hqr0Var;
        this.c = csr0Var;
        this.d = epi0Var;
        this.e = knf0Var;
        this.f = tgkVar;
    }

    public pzu(lef0 lef0Var, tgk tgkVar, us3 us3Var, q7d0 q7d0Var, mne mneVar, btt0 btt0Var) {
        tgkVar.getClass();
        us3Var.getClass();
        q7d0Var.getClass();
        btt0Var.getClass();
        this.f27863a = lef0Var;
        this.b = tgkVar;
        this.c = us3Var;
        this.d = q7d0Var;
        this.e = mneVar;
        this.f = btt0Var;
    }

    public pzu(oeg0 oeg0Var, lme0 lme0Var, us00 us00Var, jh70 jh70Var, nv20 nv20Var, r990 r990Var, jh70 jh70Var2, pru pruVar, v6k v6kVar) {
        oeg0Var.getClass();
        this.f27863a = oeg0Var;
        this.b = us00Var;
        this.c = jh70Var;
        this.d = r990Var;
        this.e = jh70Var2;
        this.f = pruVar;
    }

    public pzu(mne mneVar, btt0 btt0Var, owp0 owp0Var, gkr0 gkr0Var, sd80 sd80Var, knf0 knf0Var) {
        btt0Var.getClass();
        gkr0Var.getClass();
        sd80Var.getClass();
        knf0Var.getClass();
        this.f27863a = mneVar;
        this.b = btt0Var;
        this.c = owp0Var;
        this.d = gkr0Var;
        this.e = sd80Var;
        this.f = knf0Var;
    }

    public pzu(h840 h840Var, gsj gsjVar, eio eioVar, knf0 knf0Var, btt0 btt0Var, mne mneVar) {
        h840Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f27863a = h840Var;
        this.b = gsjVar;
        this.c = eioVar;
        this.d = knf0Var;
        this.e = btt0Var;
        this.f = mneVar;
    }

    public pzu(agc0 agc0Var, bqc0 bqc0Var, knf0 knf0Var, jw20 jw20Var, cqc0 cqc0Var, btt0 btt0Var) {
        agc0Var.getClass();
        bqc0Var.getClass();
        knf0Var.getClass();
        cqc0Var.getClass();
        btt0Var.getClass();
        this.f27863a = agc0Var;
        this.b = bqc0Var;
        this.c = knf0Var;
        this.d = jw20Var;
        this.e = cqc0Var;
        this.f = btt0Var;
    }

    public pzu(abu abuVar, dzz dzzVar, xio xioVar, czz czzVar, btt0 btt0Var, knf0 knf0Var) {
        dzzVar.getClass();
        xioVar.getClass();
        czzVar.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f27863a = abuVar;
        this.b = dzzVar;
        this.c = xioVar;
        this.d = czzVar;
        this.e = btt0Var;
        this.f = knf0Var;
    }

    public pzu(eqx eqxVar, uzc uzcVar, edo edoVar, zfo zfoVar, cyu cyuVar, kt2 kt2Var, gii0 gii0Var, knf0 knf0Var, y78 y78Var, m1e m1eVar, mne mneVar, g2v g2vVar, duj dujVar, ctf0 ctf0Var, sjl0 sjl0Var) {
        uzcVar.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        kt2Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        sjl0Var.getClass();
        this.f27863a = cyuVar;
        this.b = kt2Var;
        this.c = y78Var;
        this.d = m1eVar;
        this.e = mneVar;
        this.f = ctf0Var;
    }

    public pzu(fsd fsdVar, lef0 lef0Var, uzc uzcVar, wdu wduVar, v7i v7iVar) {
        fsdVar.getClass();
        this.f27863a = fsdVar;
        this.b = lef0Var;
        this.c = uzcVar;
        this.d = wduVar;
        this.e = v7iVar;
        this.f = maz.b(new rcz(this, (byte) 25));
    }

    public pzu(rtu rtuVar, reu reuVar, pzu pzuVar, viu viuVar, ort ortVar, pru pruVar) {
        this.f27863a = rtuVar;
        this.f = reuVar;
        this.b = pzuVar;
        this.c = viuVar;
        this.d = ortVar;
        this.e = pruVar;
    }

    public pzu(knf0 knf0Var, tgk tgkVar, wxs0 wxs0Var, us3 us3Var, svu svuVar, wwb0 wwb0Var, mne mneVar) {
        knf0Var.getClass();
        tgkVar.getClass();
        us3Var.getClass();
        wwb0Var.getClass();
        this.f27863a = knf0Var;
        this.b = tgkVar;
        this.c = us3Var;
        this.d = svuVar;
        this.e = wwb0Var;
        this.f = mneVar;
    }

    public pzu(ieu ieuVar, abu abuVar, ocl oclVar, hnu hnuVar, pmi pmiVar, jru jruVar, reu reuVar) {
        this.f27863a = ieuVar;
        this.b = abuVar;
        this.c = oclVar;
        this.d = hnuVar;
        this.e = jruVar;
        this.f = reuVar;
    }

    public pzu(ok50 ok50Var, yk50 yk50Var, imb imbVar, knf0 knf0Var, sjl0 sjl0Var, kuy kuyVar) {
        knf0Var.getClass();
        sjl0Var.getClass();
        kuyVar.getClass();
        this.f27863a = ok50Var;
        this.b = yk50Var;
        this.c = imbVar;
        this.d = knf0Var;
        this.e = sjl0Var;
        this.f = kuyVar;
    }

    public /* synthetic */ pzu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f27863a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public pzu(prc0 prc0Var, k6d0 k6d0Var) {
        ljc0 ljc0Var = new ljc0((byte) 16);
        this.f27863a = prc0Var;
        this.b = ljc0Var;
        this.c = k6d0Var;
        this.d = o2e.X(false);
        this.e = vtb.d(Integer.MAX_VALUE, null, new v6d0(this, (byte) 1), 2);
        this.f = new xw3();
    }

    public pzu(nfq nfqVar, fd40 fd40Var, p5d0 p5d0Var, p5d0 p5d0Var2, dgq dgqVar) {
        nfqVar.a();
        cig0 cig0Var = new cig0(nfqVar.f23449a);
        this.f27863a = nfqVar;
        this.b = fd40Var;
        this.c = cig0Var;
        this.d = p5d0Var;
        this.e = p5d0Var2;
        this.f = dgqVar;
    }
}
