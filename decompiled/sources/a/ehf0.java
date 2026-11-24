package a;

import a.a6s0;
import a.au1;
import a.bfe0;
import a.dm0;
import a.fs80;
import a.fvc0;
import a.iiy;
import a.je1;
import a.lk1;
import a.m19;
import a.m1r;
import a.mas0;
import a.mdp;
import a.mg10;
import a.n75;
import a.nf0;
import a.o450;
import a.on1;
import a.q91;
import a.rek0;
import a.rj1;
import a.s9s0;
import a.ty1;
import a.u250;
import a.ufx;
import a.v3s0;
import a.vfc;
import a.z6s0;
import a.ze10;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.daily_tasks.impl.di.DailyTasksScreenFactoryImpl$dailyTasksScreen$1;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorGiftsFragmentScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandGamesFragmentScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandInfoFragmentScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$PartTypeOneScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$PartTypeTwoGamesScreen;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class ehf0 implements spg0, nae0 {
    public static final Object d = new Object();
    public static oov0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7806a;
    public Object b;
    public Object c;

    public ehf0(m1e m1eVar, gii0 gii0Var, xzp xzpVar, xk0 xk0Var, r9s0 r9s0Var, btt0 btt0Var, mne mneVar, xex xexVar, khf0 khf0Var, j1q0 j1q0Var, q7d0 q7d0Var, ort ortVar, a9s0 a9s0Var, uqe uqeVar, j51 j51Var, knf0 knf0Var, ntu ntuVar, vby vbyVar, wsf0 wsf0Var, x2c0 x2c0Var, ctf0 ctf0Var, xmt xmtVar, pru pruVar, gst0 gst0Var, h0q0 h0q0Var, b3c0 b3c0Var, pmi pmiVar, bnt bntVar, wsf0 wsf0Var2, kuy kuyVar, ocl oclVar, r9u r9uVar, x0u x0uVar, ap0 ap0Var, z41 z41Var) {
        this.f7806a = (byte) 3;
        m1eVar.getClass();
        gii0Var.getClass();
        xk0Var.getClass();
        r9s0Var.getClass();
        btt0Var.getClass();
        j1q0Var.getClass();
        q7d0Var.getClass();
        j51Var.getClass();
        knf0Var.getClass();
        vbyVar.getClass();
        x2c0Var.getClass();
        ctf0Var.getClass();
        gst0Var.getClass();
        b3c0Var.getClass();
        kuyVar.getClass();
        r9uVar.getClass();
        ap0Var.getClass();
        z41Var.getClass();
        this.b = new i7i(wsf0Var, wsf0Var2, m1eVar, gii0Var, xzpVar, xk0Var, r9s0Var, btt0Var, mneVar, xexVar, khf0Var, j1q0Var, q7d0Var, j51Var, knf0Var, ntuVar, x2c0Var, ctf0Var, pruVar, gst0Var, h0q0Var, pmiVar, kuyVar, x0uVar, ap0Var, z41Var);
        this.c = a9s0Var;
    }

    public static Task c(Context context, Intent intent, boolean z) {
        oov0 oov0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            try {
                oov0Var = e;
                if (oov0Var == null) {
                    oov0Var = new oov0(context);
                    e = oov0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte b = 1;
        if (!z) {
            return oov0Var.b(intent).continueWith(new ew3(b), new udk((byte) 17));
        }
        if (mii0.u().z(context)) {
            synchronized (qjj.h) {
                try {
                    qjj.O(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        qjj.i.a();
                    }
                    oov0Var.b(intent).addOnCompleteListener(new ytt0(intent, b));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            oov0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:60:0x00b6, B:63:0x00b9, B:64:0x00d1), top: B:72:0x00b4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b9, please report this as an issue */
    @Override // a.spg0
    public qpg0 a(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        udg0 udg0Var = (udg0) this.c;
        if (!str.equals(":memory:")) {
            str = udg0Var.c.f30242a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        xjo xjoVar = new xjo(str, (udg0Var.f35477a || udg0Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = xjoVar.f40995a;
        reentrantLock.lock();
        jtj jtjVar = xjoVar.b;
        if (jtjVar != null) {
            try {
                jtjVar.n();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                if (udg0Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                qpg0 qpg0VarA = ((spg0) this.b).a(str);
                if (udg0Var.f35477a) {
                    if (udg0Var.c.g == ydg0.b) {
                        n2x.x(qpg0VarA, "PRAGMA synchronous = NORMAL");
                    } else {
                        n2x.x(qpg0VarA, "PRAGMA synchronous = FULL");
                    }
                    udg0.a(qpg0VarA);
                    udg0Var.d.t(qpg0VarA);
                } else {
                    try {
                        udg0Var.b = true;
                        udg0Var.b(qpg0VarA);
                        udg0Var.b = false;
                    } catch (Throwable th3) {
                        udg0Var.b = false;
                        throw th3;
                    }
                }
                if (jtjVar != null && (fileChannel2 = (FileChannel) jtjVar.c) != null) {
                    try {
                        fileChannel2.close();
                        jtjVar.c = null;
                    } catch (Throwable th4) {
                        jtjVar.c = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return qpg0VarA;
            } catch (Throwable th5) {
                th = th5;
                if (z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th6) {
            if (jtjVar != null && (fileChannel = (FileChannel) jtjVar.c) != null) {
                try {
                    fileChannel.close();
                } finally {
                    jtjVar.c = null;
                }
            }
            throw th6;
        }
    }

    public u83 d(p2d0 p2d0Var, h950 h950Var) {
        p2d0Var.getClass();
        h950Var.getClass();
        wm40 wm40VarX = obb.X((ym40) this.b, ydx.K(h950Var, p2d0Var.c), (n660) this.c);
        Map mapM = lun.f20680a;
        mapM.getClass();
        if (p2d0Var.d.size() != 0 && !f2o.f(wm40VarX)) {
            int i = oek.f25126a;
            if (oek.m(wm40VarX, slc.e)) {
                Collection collectionG = wm40VarX.g();
                collectionG.getClass();
                flc flcVar = (flc) CollectionsKt.w0(collectionG);
                if (flcVar != null) {
                    List listZ = flcVar.z();
                    listZ.getClass();
                    int iA = wp20.a(r3d.q(listZ, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : listZ) {
                        linkedHashMap.put(((k3u0) obj).getName(), obj);
                    }
                    List<n2d0> list = p2d0Var.d;
                    ArrayList arrayListU = twn.u(list);
                    for (n2d0 n2d0Var : list) {
                        n2d0Var.getClass();
                        k3u0 k3u0Var = (k3u0) linkedHashMap.get(g950.d(h950Var.getString(n2d0Var.c)));
                        Object pair = null;
                        if (k3u0Var != null) {
                            g950 g950VarD = g950.d(h950Var.getString(n2d0Var.c));
                            wsy type = k3u0Var.getType();
                            type.getClass();
                            m2d0 m2d0Var = n2d0Var.d;
                            m2d0Var.getClass();
                            r2e r2eVarT = t(type, m2d0Var, h950Var);
                            pair = e(r2eVarT, type, m2d0Var) ? r2eVarT : null;
                            if (pair == null) {
                                pair = new g2o("Unexpected argument value: actual type " + m2d0Var.c + " != expected type " + type);
                            }
                            pair = new Pair(g950VarD, pair);
                        }
                        if (pair != null) {
                            arrayListU.add(pair);
                        }
                    }
                    mapM = xp20.m(arrayListU);
                }
            }
        }
        return new u83(wm40VarX.I(), mapM, gmk0.x0);
    }

    public boolean e(r2e r2eVar, wsy wsyVar, m2d0 m2d0Var) {
        ym40 ym40Var = (ym40) this.b;
        l2d0 l2d0Var = m2d0Var.c;
        int i = l2d0Var == null ? -1 : v83.f36961a[l2d0Var.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return Intrinsics.d(r2eVar.a(ym40Var), wsyVar);
            }
            if (r2eVar instanceof mx3) {
                Object obj = ((mx3) r2eVar).f29728a;
                if (((List) obj).size() == m2d0Var.k.size()) {
                    wsy wsyVarG = ym40Var.c().g(wsyVar);
                    if (wsyVarG != null) {
                        Iterable iterableH = q3d.h((Collection) obj);
                        if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
                            return true;
                        }
                        Iterator it = iterableH.iterator();
                        while (((kkx) it).c) {
                            int iNextInt = ((bkx) it).nextInt();
                            r2e r2eVar2 = (r2e) ((List) obj).get(iNextInt);
                            m2d0 m2d0Var2 = (m2d0) m2d0Var.k.get(iNextInt);
                            m2d0Var2.getClass();
                            if (!e(r2eVar2, wsyVarG, m2d0Var2)) {
                            }
                        }
                        return true;
                    }
                }
            }
            hny.t(r2eVar, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        foc focVarN = wsyVar.S().n();
        wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
        if (wm40Var == null) {
            return true;
        }
        g950 g950Var = ary.e;
        if (ary.b(wm40Var, i4m0.Q)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(zje zjeVar) {
        ff ffVar;
        String str;
        if (zjeVar instanceof ff) {
            ffVar = (ff) zjeVar;
            int i = ffVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ffVar.k = i - Integer.MIN_VALUE;
            } else {
                ffVar = new ff(this, zjeVar);
            }
        } else {
            ffVar = new ff(this, zjeVar);
        }
        Object objA = ffVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ffVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            fvt0 fvt0Var = (fvt0) this.c;
            String strA = ((btt0) this.b).a();
            ffVar.k = 1;
            objA = ((ze) fvt0Var.f10231a).a(strA, new jf(), ffVar);
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
        mf mfVar = (mf) objA;
        mfVar.getClass();
        pf pfVar = mfVar.b;
        if (pfVar != null && (str = pfVar.f26876a) != null) {
            return str;
        }
        jf4.k(null);
        return null;
    }

    public hsj g() {
        i7i i7iVar = (i7i) this.b;
        return new hsj(new lhf0((khf0) i7iVar.r, (knf0) i7iVar.i, (mne) i7iVar.l), (j1q0) i7iVar.s);
    }

    public jtj h() {
        i7i i7iVar = (i7i) this.b;
        return new jtj((dn0) i7iVar.B.get(), (mne) i7iVar.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, String str2, String str3, zje zjeVar) {
        j4h j4hVar;
        if (zjeVar instanceof j4h) {
            j4hVar = (j4h) zjeVar;
            int i = j4hVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4hVar.k = i - Integer.MIN_VALUE;
            } else {
                j4hVar = new j4h(this, zjeVar);
            }
        } else {
            j4hVar = new j4h(this, zjeVar);
        }
        Object objA = j4hVar.i;
        wne wneVar = wne.f39444a;
        int i2 = j4hVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            y2h y2hVar = (y2h) ((e8g) this.c).invoke();
            j4hVar.k = 1;
            objA = y2hVar.a(str, str2, str3, j4hVar);
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
        return ((dx5) objA).a();
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Parcelable n(Fragment fragment, iiy iiyVar) {
        fragment.getClass();
        iiyVar.getClass();
        Parcelable parcelable = (Parcelable) this.c;
        if (parcelable == null) {
            Bundle bundle = fragment.g;
            parcelable = null;
            Parcelable parcelable2 = bundle != null ? bundle.getParcelable((String) this.b) : null;
            this.c = parcelable2;
            if (parcelable2 != null) {
                return parcelable2;
            }
            jf4.o("Returning value can not be null. Please, specify non null default value");
        }
        return parcelable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, zje zjeVar) {
        cv3 cv3Var;
        if (zjeVar instanceof cv3) {
            cv3Var = (cv3) zjeVar;
            int i = cv3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv3Var.k = i - Integer.MIN_VALUE;
            } else {
                cv3Var = new cv3(this, zjeVar);
            }
        } else {
            cv3Var = new cv3(this, zjeVar);
        }
        Object objA = cv3Var.i;
        Object obj = wne.f39444a;
        int i2 = cv3Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (j != 0) {
                nrt nrtVar = (nrt) this.c;
                cv3Var.k = 1;
                objA = nrt.a(nrtVar, j, cv3Var);
                if (objA == obj) {
                    return obj;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        ((ot) this.b).a(bm5.c, (ql5) objA);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r0.E(r2) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e7, code lost:
    
        if (r0 == r5) goto L71;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(a.zje r17) throws a.n7p {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ehf0.l(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, String str2, int i, ynb0 ynb0Var, zje zjeVar) {
        e48 e48Var;
        if (zjeVar instanceof e48) {
            e48Var = (e48) zjeVar;
            int i2 = e48Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e48Var.n = i2 - Integer.MIN_VALUE;
            } else {
                e48Var = new e48(this, zjeVar);
            }
        } else {
            e48Var = new e48(this, zjeVar);
        }
        Object obj = e48Var.l;
        wne wneVar = wne.f39444a;
        int i3 = e48Var.n;
        if (i3 == 0) {
            z1x.P(obj);
            ikt0 ikt0Var = (ikt0) this.b;
            e48Var.i = str2;
            e48Var.j = ynb0Var;
            e48Var.k = i;
            e48Var.n = 1;
            if (ikt0Var.a(str, str2, e48Var) != wneVar) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = e48Var.k;
        ynb0Var = e48Var.j;
        str2 = e48Var.i;
        z1x.P(obj);
        fvt0 fvt0Var = (fvt0) this.c;
        e48Var.i = null;
        e48Var.j = null;
        e48Var.k = i;
        e48Var.n = 2;
        Object objW = ((kd30) fvt0Var.f10231a).w(str2, i, ynb0Var, e48Var);
        return objW == wneVar ? wneVar : objW;
    }

    public void o() {
        i8i.D("option", "queue", ((ag3) this.b).f809a, "call_back_history_cancel_querry");
        b1j.v("queue", ((x20) this.c).f40143a, 10864L);
    }

    public void p(String str) {
        i8i.D("option", str, ((ag3) this.b).f809a, "call_back_history_cancel_querry_action");
        b1j.v(str, ((x20) this.c).f40143a, 10866L);
    }

    public Task q(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.b;
        ew3 ew3Var = (ew3) this.c;
        byte b = 1;
        boolean z = ufx.F() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(ew3Var, new ird(context, intent, b)).continueWithTask(ew3Var, new Continuation() { // from class: a.bgp
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (ufx.F() && ((Integer) task.getResult()).intValue() == 402) ? ehf0.c(context, intent, z2).continueWith(new ew3((byte) 1), new udk((byte) 16)) : task;
            }
        }) : c(context, intent, z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r8 == r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r8 == r12) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.String r9, java.lang.String r10, java.lang.String r11, a.zje r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            a.chf0 r0 = (a.chf0) r0
            java.lang.Object r0 = r0.c
            a.jwd r0 = (a.jwd) r0
            java.lang.Object r1 = r8.b
            a.ane0 r1 = (a.ane0) r1
            boolean r2 = r12 instanceof a.wwf
            if (r2 == 0) goto L1f
            r2 = r12
            a.wwf r2 = (a.wwf) r2
            int r3 = r2.k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1f
            int r3 = r3 - r4
            r2.k = r3
            goto L24
        L1f:
            a.wwf r2 = new a.wwf
            r2.<init>(r8, r12)
        L24:
            java.lang.Object r8 = r2.i
            a.wne r12 = a.wne.f39444a
            int r3 = r2.k
            java.lang.String r4 = "CUSTOM_REFERRAL_TAG"
            r5 = 2
            r6 = 1
            java.lang.String r7 = ""
            if (r3 == 0) goto L46
            if (r3 == r6) goto L42
            if (r3 != r5) goto L3b
            a.z1x.P(r8)
            goto La0
        L3b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L42:
            a.z1x.P(r8)
            goto L7a
        L46:
            a.z1x.P(r8)
            a.aoe0 r8 = r1.a()
            java.lang.String r8 = r8.d
            if (r8 != 0) goto L52
            r8 = r7
        L52:
            int r8 = r8.length()
            if (r8 <= 0) goto L59
            goto Lb0
        L59:
            int r8 = r9.length()
            if (r8 <= 0) goto L65
            a.vwb0 r8 = r1.b
            r8.h(r4, r9)
            goto Lb0
        L65:
            int r8 = r10.length()
            if (r8 <= 0) goto L8b
            r2.k = r6
            java.lang.Object r8 = r0.invoke()
            a.vwf r8 = (a.vwf) r8
            java.lang.Object r8 = r8.a(r10, r2)
            if (r8 != r12) goto L7a
            goto L9f
        L7a:
            a.lb5 r8 = (a.lb5) r8
            java.lang.String r8 = r8.f19739a
            if (r8 != 0) goto L81
            goto L82
        L81:
            r7 = r8
        L82:
            r1.getClass()
            a.vwb0 r8 = r1.b
            r8.h(r4, r7)
            goto Lb0
        L8b:
            int r8 = r11.length()
            if (r8 <= 0) goto Lb0
            r2.k = r5
            java.lang.Object r8 = r0.invoke()
            a.vwf r8 = (a.vwf) r8
            java.lang.Object r8 = r8.b(r11, r2)
            if (r8 != r12) goto La0
        L9f:
            return r12
        La0:
            a.lb5 r8 = (a.lb5) r8
            java.lang.String r8 = r8.f19739a
            if (r8 != 0) goto La7
            goto La8
        La7:
            r7 = r8
        La8:
            r1.getClass()
            a.vwb0 r8 = r1.b
            r8.h(r4, r7)
        Lb0:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ehf0.r(java.lang.String, java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(zje zjeVar) {
        cz6 cz6Var;
        Object g0g0Var;
        if (zjeVar instanceof cz6) {
            cz6Var = (cz6) zjeVar;
            int i = cz6Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz6Var.k = i - Integer.MIN_VALUE;
            } else {
                cz6Var = new cz6(this, zjeVar);
            }
        } else {
            cz6Var = new cz6(this, zjeVar);
        }
        Object objA = cz6Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cz6Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                zlt0 zlt0Var = (zlt0) this.c;
                cz6Var.k = 1;
                objA = ((sv6) ((lkr0) zlt0Var.b).invoke()).a(cz6Var);
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
            g0g0Var = uvw.Y((wx90) objA);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        List list = (List) g0g0Var;
        if (!list.isEmpty()) {
            zx6 zx6Var = (zx6) this.b;
            zx6Var.getClass();
            zx6Var.f45143a = list;
        }
        return (Serializable) g0g0Var;
    }

    public r2e t(wsy wsyVar, m2d0 m2d0Var, h950 h950Var) {
        wsyVar.getClass();
        m2d0Var.getClass();
        h950Var.getClass();
        boolean zBooleanValue = njq.U.e(m2d0Var.m).booleanValue();
        l2d0 l2d0Var = m2d0Var.c;
        switch (l2d0Var == null ? -1 : v83.f36961a[l2d0Var.ordinal()]) {
            case 1:
                byte b = (byte) m2d0Var.d;
                return zBooleanValue ? new u1t0(b) : new rg9(b);
            case 2:
                return new svb(Character.valueOf((char) m2d0Var.d));
            case 3:
                short s = (short) m2d0Var.d;
                return zBooleanValue ? new u1t0(s) : new bsj0(s);
            case 4:
                int i = (int) m2d0Var.d;
                return zBooleanValue ? new u1t0(i) : new vkx(i);
            case 5:
                long j = m2d0Var.d;
                return zBooleanValue ? new u1t0(j) : new x710(j);
            case 6:
                return new vm8(m2d0Var.e);
            case 7:
                return new vm8(m2d0Var.f);
            case 8:
                return new vm8(Boolean.valueOf(m2d0Var.d != 0));
            case 9:
                String string = h950Var.getString(m2d0Var.g);
                string.getClass();
                return new htm0(string);
            case 10:
                return new ehy(ydx.K(h950Var, m2d0Var.h), m2d0Var.l);
            case 11:
                return new h0o(ydx.K(h950Var, m2d0Var.h), g950.d(h950Var.getString(m2d0Var.i)));
            case 12:
                p2d0 p2d0Var = m2d0Var.j;
                p2d0Var.getClass();
                return new e93((Object) d(p2d0Var, h950Var));
            case 13:
                List<m2d0> list = m2d0Var.k;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (m2d0 m2d0Var2 : list) {
                    kzj0 kzj0VarE = ((ym40) this.b).c().e();
                    m2d0Var2.getClass();
                    arrayList.add(t(kzj0VarE, m2d0Var2, h950Var));
                }
                return new h0t0(arrayList, wsyVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + m2d0Var.c + " (expected " + wsyVar + ')').toString());
        }
    }

    public void u(Object obj) {
        obj.getClass();
        p7m0 p7m0Var = (p7m0) this.b;
        p7m0Var.o(null, new Pair(Integer.valueOf(((Number) ((Pair) p7m0Var.getValue()).f46059a).intValue() + 1), obj));
    }

    public void v(Fragment fragment, iiy iiyVar, Parcelable parcelable) {
        iiyVar.getClass();
        parcelable.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putParcelable((String) this.b, parcelable);
        this.c = parcelable;
    }

    public FragmentScreen w(tm1 tm1Var, AggregatorScreenModel aggregatorScreenModel, boolean z) {
        tm1Var.getClass();
        if (tm1Var instanceof jm1) {
            final fvc0 fvc0Var = z ? bvc0.f3273a : ((jm1) tm1Var).f16741a;
            return new FragmentScreen(fvc0Var) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorPromoScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final fvc0 f46290a;

                {
                    fvc0Var.getClass();
                    this.f46290a = fvc0Var;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    je1.S1.getClass();
                    fvc0 fvc0Var2 = this.f46290a;
                    fvc0Var2.getClass();
                    je1 je1Var = new je1();
                    je1Var.Q1.u(je1Var, je1.U1[1], fvc0Var2);
                    return je1Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof cm1) {
            final mdp mdpVar = ((cm1) tm1Var).f4586a;
            return new FragmentScreen(mdpVar) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorFavoritesScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final mdp f46286a;

                {
                    this.f46286a = mdpVar;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    dm0.S1.getClass();
                    dm0 dm0Var = new dm0();
                    dm0Var.Q1.u(dm0Var, dm0.U1[1], this.f46286a);
                    return dm0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return "AggregatorFavoritesFragment";
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        final long j = 0;
        if (tm1Var instanceof sm1) {
            j = z ? 0L : ((sm1) tm1Var).f32424a;
            return new FragmentScreen(j) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorTournamentsScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46298a;

                {
                    this.f46298a = j;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    ty1.R1.getClass();
                    ty1 ty1Var = new ty1();
                    ty1Var.K1.j(ty1Var, ty1.S1[0], this.f46298a);
                    return ty1Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof qm1) {
            qm1 qm1Var = (qm1) tm1Var;
            final long j2 = qm1Var.f28960a;
            final s9s0 s9s0Var = qm1Var.b;
            final String str = qm1Var.c;
            final boolean z2 = qm1Var.d;
            return new FragmentScreen(j2, s9s0Var, str, z2) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorTournamentFullInfoScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46295a;
                public final s9s0 b;
                public final String c;
                public final boolean d;

                {
                    s9s0Var.getClass();
                    str.getClass();
                    this.f46295a = j2;
                    this.b = s9s0Var;
                    this.c = str;
                    this.d = z2;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    au1.Z1.getClass();
                    String str2 = this.c;
                    str2.getClass();
                    s9s0 s9s0Var2 = this.b;
                    s9s0Var2.getClass();
                    au1 au1Var = new au1();
                    iiy[] iiyVarArr = au1.a2;
                    au1Var.S1.j(au1Var, iiyVarArr[1], this.f46295a);
                    au1Var.U1.x(au1Var, iiyVarArr[2], str2);
                    au1Var.V1.u(au1Var, iiyVarArr[3], s9s0Var2);
                    au1Var.W1.v(au1Var, iiyVarArr[4], this.d);
                    return au1Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof km1) {
            final long j3 = -1;
            final boolean z3 = false;
            return new FragmentScreen(z3, j3) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorCategoriesWithProvidersListScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46285a;
                public final boolean b;

                {
                    this.f46285a = j3;
                    this.b = z3;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    m19.U1.getClass();
                    m19 m19Var = new m19();
                    iiy[] iiyVarArr = m19.V1;
                    m19Var.R1.j(m19Var, iiyVarArr[1], this.f46285a);
                    m19Var.S1.v(m19Var, iiyVarArr[2], this.b);
                    return m19Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof zl1) {
            zl1 zl1Var = (zl1) tm1Var;
            final long j4 = zl1Var.f44559a;
            final boolean z4 = zl1Var.b;
            return new FragmentScreen(z4, j4) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorCategoriesWithProvidersListScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46285a;
                public final boolean b;

                {
                    this.f46285a = j4;
                    this.b = z4;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    m19.U1.getClass();
                    m19 m19Var = new m19();
                    iiy[] iiyVarArr = m19.V1;
                    m19Var.R1.j(m19Var, iiyVarArr[1], this.f46285a);
                    m19Var.S1.v(m19Var, iiyVarArr[2], this.b);
                    return m19Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof fm1) {
            boolean z5 = ((pru) this.c).a().b.P;
            if (z5 && z) {
                return new FragmentScreen(j, j) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$MyAggregatorScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46304a;
                    public final long b;

                    {
                        this.f46304a = j;
                        this.b = j;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        u250.V1.getClass();
                        u250 u250Var = new u250();
                        iiy[] iiyVarArr = u250.W1;
                        u250Var.K1.j(u250Var, iiyVarArr[0], this.f46304a);
                        u250Var.L1.j(u250Var, iiyVarArr[1], this.b);
                        return u250Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return vfc.I(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            }
            if (z5) {
                fm1 fm1Var = (fm1) tm1Var;
                final long j5 = fm1Var.f9764a;
                final long j6 = fm1Var.b;
                return new FragmentScreen(j5, j6) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$MyAggregatorScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46304a;
                    public final long b;

                    {
                        this.f46304a = j5;
                        this.b = j6;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        u250.V1.getClass();
                        u250 u250Var = new u250();
                        iiy[] iiyVarArr = u250.W1;
                        u250Var.K1.j(u250Var, iiyVarArr[0], this.f46304a);
                        u250Var.L1.j(u250Var, iiyVarArr[1], this.b);
                        return u250Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return vfc.I(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            }
            if (z) {
                return new FragmentScreen(j, j) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$MyAggregatorOldScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46303a;
                    public final long b;

                    {
                        this.f46303a = j;
                        this.b = j;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        o450.V1.getClass();
                        o450 o450Var = new o450();
                        iiy[] iiyVarArr = o450.W1;
                        o450Var.K1.j(o450Var, iiyVarArr[0], this.f46303a);
                        o450Var.L1.j(o450Var, iiyVarArr[1], this.b);
                        return o450Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return vfc.I(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            }
            fm1 fm1Var2 = (fm1) tm1Var;
            final long j7 = fm1Var2.f9764a;
            final long j8 = fm1Var2.b;
            return new FragmentScreen(j7, j8) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$MyAggregatorOldScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46303a;
                public final long b;

                {
                    this.f46303a = j7;
                    this.b = j8;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    o450.V1.getClass();
                    o450 o450Var = new o450();
                    iiy[] iiyVarArr = o450.W1;
                    o450Var.K1.j(o450Var, iiyVarArr[0], this.f46303a);
                    o450Var.L1.j(o450Var, iiyVarArr[1], this.b);
                    return o450Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof am1) {
            final fs80 fs80Var = z ? new fs80(null, 0L, null, null, 0L, false, 127) : ((am1) tm1Var).f1088a;
            final q91 q91Var = ((am1) tm1Var).b;
            return new FragmentScreen(fs80Var, q91Var) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorCategoriesScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final fs80 f46284a;
                public final q91 b;

                {
                    fs80Var.getClass();
                    q91Var.getClass();
                    this.f46284a = fs80Var;
                    this.b = q91Var;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    nf0.S1.getClass();
                    fs80 fs80Var2 = this.f46284a;
                    fs80Var2.getClass();
                    q91 q91Var2 = this.b;
                    q91Var2.getClass();
                    nf0 nf0Var = new nf0();
                    iiy[] iiyVarArr = nf0.U1;
                    nf0Var.K1.u(nf0Var, iiyVarArr[0], fs80Var2);
                    nf0Var.L1.u(nf0Var, iiyVarArr[1], q91Var2);
                    return nf0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return "AggregatorCategoriesFragment";
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof hm1) {
            return new AggregatorScreens$PartTypeOneScreen(aggregatorScreenModel);
        }
        if (tm1Var instanceof vl1) {
            final String str2 = aggregatorScreenModel.e.f39117a;
            return new FragmentScreen(str2) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorSearchScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f46294a;

                {
                    this.f46294a = str2;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    on1.S1.getClass();
                    on1 on1Var = new on1();
                    on1Var.O1.x(on1Var, on1.U1[0], this.f46294a);
                    return on1Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof lm1) {
            tm1 tm1Var2 = aggregatorScreenModel.d;
            tm1Var2.getClass();
            final long j9 = ((lm1) tm1Var2).f20273a;
            return new FragmentScreen(j9) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$RecommendedScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46307a;

                {
                    this.f46307a = j9;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    bfe0.R1.getClass();
                    bfe0 bfe0Var = new bfe0();
                    bfe0Var.Q1.j(bfe0Var, bfe0.S1[1], this.f46307a);
                    return bfe0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof im1) {
            im1 im1Var = (im1) tm1Var;
            return new AggregatorScreens$PartTypeTwoGamesScreen(aggregatorScreenModel, im1Var.f15003a, im1Var.b);
        }
        if (tm1Var instanceof dm1) {
            dm1 dm1Var = (dm1) tm1Var;
            return new AggregatorScreens$AggregatorGiftsFragmentScreen(dm1Var.f6304a, dm1Var.b, dm1Var.c, dm1Var.d);
        }
        if (tm1Var instanceof mm1) {
            return new RulesScreenFactoryImpl$getRulesFragmentScreen$1(new RuleData("rule_casino", 14, (Map) null, (String) null), R.string.rules, true, false, true);
        }
        if (tm1Var instanceof em1) {
            final xzt xztVarW = ((mii0) ((uf3) this.b).d.f25567a).w();
            final LoyaltyProgramScreenParams loyaltyProgramScreenParams = new LoyaltyProgramScreenParams(true);
            return new FragmentScreen() { // from class: org.xplatform.aggregator.loyalty_program.impl.navigation.LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1
                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    boolean z6 = xztVarW.f41770a.a().b.L;
                    LoyaltyProgramScreenParams loyaltyProgramScreenParams2 = loyaltyProgramScreenParams;
                    if (z6) {
                        mg10.Q1.getClass();
                        mg10 mg10Var = new mg10();
                        mg10Var.O1.J(mg10Var, mg10.R1[1], loyaltyProgramScreenParams2);
                        return mg10Var;
                    }
                    ze10.Q1.getClass();
                    ze10 ze10Var = new ze10();
                    ze10Var.O1.J(ze10Var, ze10.R1[1], loyaltyProgramScreenParams2);
                    return ze10Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof bm1) {
            return new DailyTasksScreenFactoryImpl$dailyTasksScreen$1();
        }
        if (tm1Var instanceof nm1) {
            nm1 nm1Var = (nm1) tm1Var;
            final long j10 = nm1Var.f23750a;
            final String str3 = nm1Var.b;
            return new FragmentScreen(j10, str3) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorTournamentPrizesAltDesignScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46296a;
                public final String b;

                {
                    str3.getClass();
                    this.f46296a = j10;
                    this.b = str3;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    v3s0.S1.getClass();
                    String str4 = this.b;
                    str4.getClass();
                    v3s0 v3s0Var = new v3s0();
                    iiy[] iiyVarArr = v3s0.U1;
                    v3s0Var.N1.j(v3s0Var, iiyVarArr[1], this.f46296a);
                    v3s0Var.O1.x(v3s0Var, iiyVarArr[2], str4);
                    v3s0Var.P1.j(v3s0Var, iiyVarArr[3], 0L);
                    return v3s0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof om1) {
            om1 om1Var = (om1) tm1Var;
            final long j11 = om1Var.f25481a;
            final String str4 = om1Var.b;
            final long j12 = om1Var.c;
            return new FragmentScreen(j11, j12, str4) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46297a;
                public final String b;
                public final long c;

                {
                    this.f46297a = j11;
                    this.b = str4;
                    this.c = j12;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    a6s0.S1.getClass();
                    a6s0 a6s0Var = new a6s0();
                    iiy[] iiyVarArr = a6s0.U1;
                    a6s0Var.N1.j(a6s0Var, iiyVarArr[1], this.f46297a);
                    a6s0Var.O1.x(a6s0Var, iiyVarArr[2], this.b);
                    a6s0Var.P1.j(a6s0Var, iiyVarArr[3], this.c);
                    return a6s0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof pm1) {
            pm1 pm1Var = (pm1) tm1Var;
            final long j13 = pm1Var.f27210a;
            final String str5 = pm1Var.b;
            return new FragmentScreen(j13, str5) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorTournamentsStageAltDesignScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46299a;
                public final String b;

                {
                    str5.getClass();
                    this.f46299a = j13;
                    this.b = str5;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    z6s0.S1.getClass();
                    String str6 = this.b;
                    str6.getClass();
                    z6s0 z6s0Var = new z6s0();
                    iiy[] iiyVarArr = z6s0.U1;
                    z6s0Var.N1.j(z6s0Var, iiyVarArr[1], this.f46299a);
                    z6s0Var.O1.x(z6s0Var, iiyVarArr[2], str6);
                    z6s0Var.P1.x(z6s0Var, iiyVarArr[3], "AGGREGATOR_TOURNAMENT_STAGES_CELL_STATIC_STYLE");
                    return z6s0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof rm1) {
            rm1 rm1Var = (rm1) tm1Var;
            final long j14 = rm1Var.f30723a;
            final String str6 = rm1Var.b;
            return new FragmentScreen(j14, str6) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$TournamentsProvidersAltDesignScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f46308a;
                public final String b;

                {
                    str6.getClass();
                    this.f46308a = j14;
                    this.b = str6;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    mas0.Q1.getClass();
                    String str7 = this.b;
                    str7.getClass();
                    mas0 mas0Var = new mas0();
                    iiy[] iiyVarArr = mas0.R1;
                    mas0Var.K1.j(mas0Var, iiyVarArr[0], this.f46308a);
                    mas0Var.L1.x(mas0Var, iiyVarArr[1], str7);
                    return mas0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return vfc.I(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (tm1Var instanceof xl1) {
            xl1 xl1Var = (xl1) tm1Var;
            long j15 = xl1Var.f41052a;
            long j16 = xl1Var.b;
            String str7 = xl1Var.c;
            String str8 = xl1Var.d;
            short s = xl1Var.e;
            boolean z6 = xl1Var.h;
            gz8 gz8Var = gz8.f12169a;
            return new AggregatorScreens$BrandGamesFragmentScreen(new uc0(s, j15, j16, str7, str8, xl1Var.g, xl1Var.f, z6, xl1Var.i));
        }
        if (tm1Var instanceof yl1) {
            yl1 yl1Var = (yl1) tm1Var;
            return new AggregatorScreens$BrandInfoFragmentScreen(yl1Var.f42818a, yl1Var.b, true);
        }
        if (tm1Var instanceof wl1) {
            wl1 wl1Var = (wl1) tm1Var;
            final int i = wl1Var.f39333a;
            final long j17 = wl1Var.b;
            return new FragmentScreen(i, j17) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AvailableGamesFragmentScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f46300a;
                public final long b;

                {
                    this.f46300a = i;
                    this.b = j17;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    n75.S1.getClass();
                    n75 n75Var = new n75();
                    iiy[] iiyVarArr = n75.U1;
                    n75Var.Q1.I(n75Var, iiyVarArr[1], this.f46300a);
                    n75Var.R1.j(n75Var, iiyVarArr[2], this.b);
                    return n75Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (!(tm1Var instanceof ul1)) {
            if (tm1Var instanceof gm1) {
                jf4.n("No screen for AggregatorScreenType.None");
                return null;
            }
            udk.e(tm1Var, "No screen for unexpected type ");
            return null;
        }
        ul1 ul1Var = (ul1) tm1Var;
        final long j18 = ul1Var.f35852a;
        final int i2 = ul1Var.b;
        final long j19 = ul1Var.c;
        rj1 rj1Var = rj1.f30569a;
        return new FragmentScreen(i2, j18, j19) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorPublishersFragmentScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f46293a;
            public final int b;
            public final long c;

            {
                rj1 rj1Var2 = rj1.f30569a;
                this.f46293a = j18;
                this.b = i2;
                this.c = j19;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                rek0 rek0Var = lk1.U1;
                rj1 rj1Var2 = rj1.b;
                rek0Var.getClass();
                lk1 lk1Var = new lk1();
                iiy[] iiyVarArr = lk1.V1;
                lk1Var.P1.j(lk1Var, iiyVarArr[2], this.f46293a);
                lk1Var.Q1.I(lk1Var, iiyVarArr[3], this.b);
                lk1Var.R1.j(lk1Var, iiyVarArr[4], this.c);
                lk1Var.S1.v(lk1Var, iiyVarArr[5], false);
                lk1Var.O1.u(lk1Var, iiyVarArr[1], rj1Var2);
                return lk1Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                return ufx.C(this);
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        };
    }

    public Object x(zje zjeVar) {
        List list = ((zx6) this.b).f45143a;
        if (!list.isEmpty()) {
            return list;
        }
        Serializable serializableS = s(zjeVar);
        return serializableS == wne.f39444a ? serializableS : (List) serializableS;
    }

    public /* synthetic */ ehf0(Object obj, Object obj2, byte b) {
        this.f7806a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ehf0(gr00 gr00Var, gst0 gst0Var) {
        this.f7806a = (byte) 16;
        gst0Var.getClass();
        this.b = gr00Var;
        this.c = gst0Var;
    }

    public ehf0(ane0 ane0Var, chf0 chf0Var) {
        this.f7806a = (byte) 25;
        ane0Var.getClass();
        this.b = ane0Var;
        this.c = chf0Var;
    }

    public ehf0(dn0 dn0Var, mne mneVar) {
        this.f7806a = (byte) 18;
        dn0Var.getClass();
        this.b = dn0Var;
        this.c = mneVar;
    }

    public ehf0(zx6 zx6Var, zlt0 zlt0Var) {
        this.f7806a = (byte) 11;
        zx6Var.getClass();
        this.b = zx6Var;
        this.c = zlt0Var;
    }

    public ehf0(btt0 btt0Var, fvt0 fvt0Var) {
        this.f7806a = (byte) 2;
        btt0Var.getClass();
        this.b = btt0Var;
        this.c = fvt0Var;
    }

    public ehf0(String str) {
        this.f7806a = (byte) 13;
        this.b = str;
    }

    public ehf0(gii0 gii0Var, byte b) {
        this.f7806a = b;
        gii0Var.getClass();
        switch (b) {
            case 17:
                this.b = gii0Var;
                this.c = new h8a(this, (byte) 7);
                break;
            case 21:
                this.b = gii0Var;
                this.c = new h8a(this, (byte) 25);
                break;
            case 23:
                this.b = gii0Var;
                this.c = new jwd(this, (byte) 12);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.b = gii0Var;
                this.c = new e8g(this, (byte) 13);
                break;
            default:
                this.b = gii0Var;
                this.c = new zo4(this, (byte) 4);
                break;
        }
    }

    public ehf0(uf3 uf3Var, gle0 gle0Var, q5j q5jVar, pru pruVar) {
        this.f7806a = (byte) 4;
        this.b = uf3Var;
        this.c = pruVar;
    }

    public ehf0(byte b) {
        this.f7806a = b;
        switch (b) {
            case 22:
                p7m0 p7m0VarA = q7m0.a(new Pair(Integer.MIN_VALUE, null));
                this.b = p7m0VarA;
                this.c = new h2c(p7m0VarA, (byte) 1);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.b = new or30();
                this.c = new or30();
                break;
            default:
                x0a x0aVar = new x0a();
                x0aVar.f40062a = o2e.Z(iun.f15405a);
                this.b = x0aVar;
                this.c = new chf0((byte) 15);
                break;
        }
    }

    public ehf0(ym40 ym40Var, n660 n660Var) {
        this.f7806a = (byte) 6;
        ym40Var.getClass();
        n660Var.getClass();
        this.b = ym40Var;
        this.c = n660Var;
    }

    public /* synthetic */ ehf0(byte b, boolean z) {
        this.f7806a = b;
    }

    public ehf0(wyu wyuVar) {
        this.f7806a = (byte) 29;
        this.b = wyuVar;
        this.c = new ugi(this, (byte) 23);
    }

    public ehf0(Context context) {
        this.f7806a = (byte) 1;
        this.b = context;
        this.c = new ew3((byte) 1);
    }

    public ehf0(udg0 udg0Var, spg0 spg0Var) {
        this.f7806a = (byte) 10;
        spg0Var.getClass();
        this.c = udg0Var;
        this.b = spg0Var;
    }

    public ehf0(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7806a = (byte) 24;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
