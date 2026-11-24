package a;

import a.j79;
import a.m1r;
import a.ufx;
import a.z79;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class ali implements nae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1068a;
    public final Object b;
    public Object c;
    public final Object d;

    public ali(ffk ffkVar) {
        this.d = ffkVar;
        List list = ffkVar.e.t;
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        byte b = 16;
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(ydx.L((h950) ffkVar.l.b, ((d3d0) obj).d), obj);
        }
        this.f1068a = linkedHashMap;
        ffk ffkVar2 = (ffk) this.d;
        this.b = ((eu00) ((f6i) ffkVar2.l.f10647a).e).d(new vtf(this, ffkVar2, b));
        eu00 eu00Var = (eu00) ((f6i) ((ffk) this.d).l.f10647a).e;
        v9k v9kVar = new v9k(this, (byte) 11);
        eu00Var.getClass();
        this.c = new cu00(eu00Var, v9kVar);
    }

    public rxu A() {
        return new rxu(h());
    }

    public void B() {
        zsr zsrVar = (zsr) this.b;
        Context context = zsrVar.f44918a;
        context.getClass();
        if (Settings.canDrawOverlays(context)) {
            if (zsrVar.b.a()) {
                int i = GameVideoWindowService.k;
                Intent intent = new Intent(context, (Class<?>) GameVideoWindowService.class);
                intent.setAction("ACTION_START");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    context.startService(intent);
                } catch (Throwable unused) {
                    e0g0 e0g0Var2 = j0g0.b;
                }
                int i2 = GameZoneWindowService.g;
                u1c.P(context);
                return;
            }
            if (zsrVar.c.c()) {
                int i3 = GameZoneWindowService.g;
                Intent intent2 = new Intent(context, (Class<?>) GameZoneWindowService.class);
                intent2.setAction("ACTION_START");
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    context.startService(intent2);
                } catch (Throwable unused2) {
                    e0g0 e0g0Var4 = j0g0.b;
                }
                int i4 = GameVideoWindowService.k;
                pzb.o0(context);
            }
        }
    }

    public void C(final BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams) {
        r9u r9uVar = (r9u) this.d;
        ygp ygpVar = ygp.i1;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        oeg0 oeg0Var = (oeg0) this.f1068a;
        if (zD) {
            i1w0 i1w0VarC = oeg0Var.c();
            k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
            k0w0VarI.h(new FragmentScreen() { // from class: org.xplatform.game_broadcasting.impl.navigation.BroadcastingZoneFullScreenFactory$getScreen$1
                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    j79.O1.getClass();
                    j79 j79Var = new j79();
                    j79Var.M1.J(j79Var, j79.P1[0], broadcastingZoneLandscapeParams);
                    return j79Var;
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
            });
            ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            i1w0 i1w0VarC2 = oeg0Var.c();
            k0w0 k0w0VarI2 = cs0.i(i1w0VarC2, i1w0VarC2);
            k0w0VarI2.h(new FragmentScreen() { // from class: org.xplatform.game_broadcasting.impl.navigation.BroadcastingZoneLandscapeScreenFactory$getScreen$1
                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    z79.O1.getClass();
                    z79 z79Var = new z79();
                    z79Var.N1.J(z79Var, z79.P1[1], broadcastingZoneLandscapeParams);
                    return z79Var;
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
            });
            ListIterator listIteratorO2 = b1j.o(i1w0VarC2, k0w0VarI2.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public yqc a() {
        return new yqc(h(), (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b(long j, csr csrVar, long j2, double d, zje zjeVar) {
        oin oinVar;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof oin) {
            oinVar = (oin) zjeVar;
            int i = oinVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oinVar.k = i - Integer.MIN_VALUE;
            } else {
                oinVar = new oin(this, zjeVar);
            }
        } else {
            oinVar = new oin(this, zjeVar);
        }
        Object objC = oinVar.i;
        wne wneVar = wne.f39444a;
        int i2 = oinVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            wti wtiVar = (wti) this.f1068a;
            String strA = ((btt0) this.d).a();
            bg8.Companion.getClass();
            bg8 bg8VarA = ag8.a(csrVar);
            uin uinVar = new uin(new Long(j), bg8VarA, new Long(j2), csrVar.f4905a.f3145a.a() ? null : new Double(d), new Integer(22), knf0Var.c(), cs0.u(s470.EASTEN_NIGHT.a()));
            oinVar.k = 1;
            objC = ((phn) ((ntl) wtiVar.c).invoke()).c(strA, uinVar, oinVar);
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
        cjn cjnVarU = obc.U((fjn) ((q16) objC).a());
        nin ninVar = (nin) this.b;
        ninVar.getClass();
        ninVar.f23598a = cjnVarU;
        return cjnVarU;
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            itt0.k("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((nuj0) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void d() {
        i1w0 i1w0VarC = ((oeg0) this.f1068a).c();
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
    public Object e(zje zjeVar) {
        pin pinVar;
        if (zjeVar instanceof pin) {
            pinVar = (pin) zjeVar;
            int i = pinVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pinVar.k = i - Integer.MIN_VALUE;
            } else {
                pinVar = new pin(this, zjeVar);
            }
        } else {
            pinVar = new pin(this, zjeVar);
        }
        Object objB = pinVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pinVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            wti wtiVar = (wti) this.f1068a;
            String strA = ((btt0) this.d).a();
            ohn ohnVar = new ohn(((knf0) this.c).c(), cs0.u(s470.EASTEN_NIGHT.a()));
            pinVar.k = 1;
            objB = ((phn) ((ntl) wtiVar.c).invoke()).b(strA, ohnVar, pinVar);
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
        cjn cjnVarU = obc.U((fjn) ((q16) objB).a());
        nin ninVar = (nin) this.b;
        ninVar.getClass();
        ninVar.f23598a = cjnVarU;
        return cjnVarU;
    }

    public List f() {
        try {
            String strC = ((vwb0) this.f1068a).c("USER_DEFAULT_BET_SUM_PREF_KEY", "");
            if (strC.length() == 0) {
                return iun.f15405a;
            }
            vby vbyVar = (vby) this.b;
            vbyVar.getClass();
            return (List) vbyVar.b(new zw3(usj.Companion.serializer(), (byte) 0), strC);
        } catch (Exception unused) {
            return iun.f15405a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, zje zjeVar) {
        syk sykVar;
        if (zjeVar instanceof syk) {
            sykVar = (syk) zjeVar;
            int i2 = sykVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sykVar.k = i2 - Integer.MIN_VALUE;
            } else {
                sykVar = new syk(this, zjeVar);
            }
        } else {
            sykVar = new syk(this, zjeVar);
        }
        Object objA = sykVar.i;
        wne wneVar = wne.f39444a;
        int i3 = sykVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            hsj hsjVar = (hsj) this.f1068a;
            sykVar.k = 1;
            objA = ((lyk) ((ucj) hsjVar.b).invoke()).a(kcx.N("2" + i + "0lanNKIS$BdDpWhb8%zp~k|6ZHaKAsQ6"), i, sykVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str = ((jo) objA).f16834a;
        if (str != null) {
            return str;
        }
        jf4.k(null);
        return null;
    }

    public dgu h() {
        return new dgu(new xfu((gii0) this.f1068a), (ovo0) this.b, (knf0) this.c, (kuy) this.d);
    }

    public rxu i() {
        return new rxu(h());
    }

    public reu j() {
        return new reu(h(), (byte) 19);
    }

    public hru k() {
        return new hru(h());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(int i, long j, zje zjeVar) {
        qin qinVar;
        if (zjeVar instanceof qin) {
            qinVar = (qin) zjeVar;
            int i2 = qinVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qinVar.k = i2 - Integer.MIN_VALUE;
            } else {
                qinVar = new qin(this, zjeVar);
            }
        } else {
            qinVar = new qin(this, zjeVar);
        }
        Object objA = qinVar.i;
        wne wneVar = wne.f39444a;
        int i3 = qinVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            wti wtiVar = (wti) this.f1068a;
            String strA = ((btt0) this.d).a();
            thn thnVar = new thn(new Long(j), new Integer(i), ((knf0) this.c).c(), cs0.u(s470.EASTEN_NIGHT.a()));
            qinVar.k = 1;
            objA = ((phn) ((ntl) wtiVar.c).invoke()).a(strA, thnVar, qinVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        cjn cjnVarU = obc.U((fjn) ((q16) objA).a());
        nin ninVar = (nin) this.b;
        ninVar.getClass();
        ninVar.f23598a = cjnVarU;
        return cjnVarU;
    }

    public boolean m() {
        return ua80.x((vwb0) this.f1068a, "HAS_DEFAULT_BET_SUM_ENABLED_PREF_KEY", false);
    }

    @Override // a.nae0
    public Object n(iiy iiyVar, Object obj) {
        glz glzVar;
        sik sikVar = (sik) this.f1068a;
        ((Fragment) obj).getClass();
        iiyVar.getClass();
        yfu0 yfu0Var = (yfu0) this.c;
        if (yfu0Var != null) {
            return yfu0Var;
        }
        Function1 function1 = (Function1) this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(sikVar.o0());
        layoutInflaterFrom.getClass();
        yfu0 yfu0Var2 = (yfu0) function1.invoke(layoutInflaterFrom);
        this.c = yfu0Var2;
        if ((sikVar instanceof u0i) || (sikVar instanceof ix5)) {
            glzVar = sikVar.u1;
        } else {
            n6r n6rVarK = sikVar.K();
            n6rVarK.b();
            glzVar = n6rVarK.c;
        }
        glzVar.getClass();
        glzVar.a(new tvj(null, null, new cxj(glzVar, this, (byte) 5), 31));
        return yfu0Var2;
    }

    public gmq o() {
        return ((jtj) this.f1068a).i(((ntu) this.b).a(), ((iqt) this.d).f15225a.a(), ((pru) this.c).a().b.N);
    }

    public ewt p(boolean z) {
        pbt pbtVar = (pbt) this.f1068a;
        if (!((iqt) this.d).f15225a.a()) {
            pbtVar.k.Q(iun.f15405a);
        }
        return new ewt(new fnq((p7m0) pbtVar.k.d, new tu3(z, pbtVar, (yje) null)), this, (byte) 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object q(m97 m97Var, long j, zje zjeVar) {
        gtt gttVar;
        wne wneVar;
        int i;
        Object objJ;
        gtt gttVar2;
        long j2;
        cit0 cit0Var;
        long j3;
        if (zjeVar instanceof gtt) {
            gttVar = (gtt) zjeVar;
            int i2 = gttVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gttVar.n = i2 - Integer.MIN_VALUE;
            } else {
                gttVar = new gtt(this, zjeVar);
            }
        } else {
            gttVar = new gtt(this, zjeVar);
        }
        Object objA = gttVar.l;
        wne wneVar2 = wne.f39444a;
        int i3 = gttVar.n;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = gttVar.j;
                z1x.P(objA);
                wneVar = wneVar2;
                gttVar2 = gttVar;
                objJ = objA;
                i = 2;
            } else {
                if (i3 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j4 = gttVar.k;
                cit0Var = gttVar.i;
                z1x.P(objA);
                j3 = j4;
            }
            String str = ((ql5) objA).f;
            cit0Var.getClass();
            str.getClass();
            return new vf7(j3, cit0Var.F, cit0Var.E, cit0Var.B, cit0Var.C, str, false, cit0Var.M, cit0Var.N, cit0Var.T);
        }
        z1x.P(objA);
        fht0 fht0Var = (fht0) this.f1068a;
        long jA = ((x1u) this.d).a();
        m97Var.getClass();
        String strValueOf = String.valueOf(m97Var.l);
        double d = m97Var.l;
        long j5 = m97Var.f21398a;
        tqt tqtVar = uoy.b;
        int i4 = m97Var.b;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(i4);
        double d2 = m97Var.k;
        long j6 = m97Var.f;
        long j7 = m97Var.h;
        std stdVar = gwe.b;
        List listC = kotlin.collections.a.c(new ru6(-1L, strValueOf, d, j5, uoyVarJ, d2, j6, j7, 0, (Double) null, (String) null, 3328));
        iun iunVar = iun.f15405a;
        q4f q4fVar = q4f.c;
        int iA = q4fVar.a();
        byte b = ((pru) this.c).a().I1.f26017a;
        gttVar.j = j;
        gttVar.n = 1;
        wneVar = wneVar2;
        gtt gttVar3 = gttVar;
        i = 2;
        objJ = fht0Var.j(jA, j, listC, iunVar, 0L, q4fVar, iA, false, false, false, null, null, b, false, gttVar3);
        gttVar2 = gttVar3;
        if (objJ != wneVar) {
            j2 = j;
        }
        return wneVar;
        cit0Var = (cit0) CollectionsKt.U((List) objJ);
        nrt nrtVar = (nrt) this.b;
        gttVar2.i = cit0Var;
        gttVar2.j = j2;
        gttVar2.k = j2;
        gttVar2.n = i;
        objA = nrt.a(nrtVar, j2, gttVar2);
        if (objA != wneVar) {
            j3 = j2;
            String str2 = ((ql5) objA).f;
            cit0Var.getClass();
            str2.getClass();
            return new vf7(j3, cit0Var.F, cit0Var.E, cit0Var.B, cit0Var.C, str2, false, cit0Var.M, cit0Var.N, cit0Var.T);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:1: B:47:0x00dc->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(boolean z, yje yjeVar) {
        lpt lptVar;
        List list;
        Object objB;
        List list2;
        Object objI;
        List list3;
        List list4;
        Serializable serializableX;
        int iIntValue;
        ArrayList<qkt> arrayList;
        ArrayList arrayList2;
        boolean z2;
        qkt qktVar;
        Iterator it;
        if (yjeVar instanceof lpt) {
            lptVar = (lpt) yjeVar;
            int i = lptVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                lptVar.n = i - Integer.MIN_VALUE;
            } else {
                lptVar = new lpt(this, yjeVar);
            }
        } else {
            lptVar = new lpt(this, yjeVar);
        }
        Object objD = lptVar.l;
        wne wneVar = wne.f39444a;
        int i2 = lptVar.n;
        if (i2 == 0) {
            z1x.P(objD);
            bot botVar = (bot) this.f1068a;
            lptVar.i = z;
            lptVar.n = 1;
            objD = botVar.f2951a.d(lptVar);
            if (objD != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    list4 = lptVar.k;
                    list3 = lptVar.j;
                    z1x.P(objD);
                    iIntValue = ((Number) objD).intValue();
                    arrayList = new ArrayList();
                    for (Object obj : list3) {
                        qktVar = (qkt) obj;
                        if (list4 != null) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (qkt qktVar2 : arrayList) {
                        if (iIntValue == qktVar2.f28902a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                    }
                    return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
                }
                if (i2 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list4 = lptVar.k;
                list3 = lptVar.j;
                z1x.P(objD);
                iIntValue = ((elt) objD).e;
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    qktVar = (qkt) obj;
                    if (list4 != null || !list4.isEmpty()) {
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                while (r10.hasNext()) {
                    if (iIntValue == qktVar2.f28902a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                }
                return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
            }
            z = lptVar.i;
            List list5 = lptVar.j;
            z1x.P(objD);
            objB = objD;
            list = list5;
            list2 = (List) objB;
            if (z) {
                pmi pmiVar = (pmi) this.d;
                lptVar.j = list;
                lptVar.k = list2;
                lptVar.i = z;
                lptVar.n = 3;
                serializableX = pmiVar.x(lptVar);
                if (serializableX != wneVar) {
                    list3 = list;
                    objD = serializableX;
                    list4 = list2;
                    iIntValue = ((Number) objD).intValue();
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        qktVar = (qkt) obj;
                        if (list4 != null) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r10.hasNext()) {
                        if (iIntValue == qktVar2.f28902a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                    }
                    return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
                }
            } else {
                ieu ieuVar = (ieu) this.c;
                lptVar.j = list;
                lptVar.k = list2;
                lptVar.i = z;
                lptVar.n = 4;
                objI = ieuVar.i(lptVar);
                if (objI != wneVar) {
                    list3 = list;
                    objD = objI;
                    list4 = list2;
                    iIntValue = ((elt) objD).e;
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        qktVar = (qkt) obj;
                        if (list4 != null) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r10.hasNext()) {
                        if (iIntValue == qktVar2.f28902a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                    }
                    return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
                }
            }
            return wneVar;
        }
        z = lptVar.i;
        z1x.P(objD);
        list = (List) objD;
        kpt kptVar = (kpt) this.b;
        lptVar.j = list;
        lptVar.i = z;
        lptVar.n = 2;
        objB = kptVar.f18690a.b(lptVar);
        if (objB != wneVar) {
            list2 = (List) objB;
            if (z) {
                pmi pmiVar2 = (pmi) this.d;
                lptVar.j = list;
                lptVar.k = list2;
                lptVar.i = z;
                lptVar.n = 3;
                serializableX = pmiVar2.x(lptVar);
                if (serializableX != wneVar) {
                    list3 = list;
                    objD = serializableX;
                    list4 = list2;
                    iIntValue = ((Number) objD).intValue();
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        qktVar = (qkt) obj;
                        if (list4 != null) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r10.hasNext()) {
                        if (iIntValue == qktVar2.f28902a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                    }
                    return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
                }
            } else {
                ieu ieuVar2 = (ieu) this.c;
                lptVar.j = list;
                lptVar.k = list2;
                lptVar.i = z;
                lptVar.n = 4;
                objI = ieuVar2.i(lptVar);
                if (objI != wneVar) {
                    list3 = list;
                    objD = objI;
                    list4 = list2;
                    iIntValue = ((elt) objD).e;
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        qktVar = (qkt) obj;
                        if (list4 != null) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (qktVar.f28902a == ((p52) it.next()).f26383a) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r10.hasNext()) {
                        if (iIntValue == qktVar2.f28902a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z2, 191));
                    }
                    return CollectionsKt.A0(arrayList2, new e3l((byte) 24));
                }
            }
        }
        return wneVar;
    }

    public pyu s() {
        ovo0 ovo0Var = (ovo0) this.b;
        ovo0Var.getClass();
        pyu pyuVar = new pyu();
        pyuVar.f27815a = ovo0Var;
        return pyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public Object t(zje zjeVar) {
        g0j g0jVar;
        ?? arrayList;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof g0j) {
            g0jVar = (g0j) zjeVar;
            int i = g0jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0jVar.k = i - Integer.MIN_VALUE;
            } else {
                g0jVar = new g0j(this, zjeVar);
            }
        } else {
            g0jVar = new g0j(this, zjeVar);
        }
        Object objC = g0jVar.i;
        wne wneVar = wne.f39444a;
        int i2 = g0jVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            j0j j0jVar = (j0j) ((n0o0) this.d).getValue();
            String strA = ((btt0) this.f1068a).a();
            m16 m16Var = new m16(knf0Var.c());
            g0jVar.k = 1;
            objC = j0jVar.c(strA, m16Var, g0jVar);
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
        e0j e0jVar = (e0j) ((u2t) objC).a();
        ((yzi) this.b).d = System.currentTimeMillis();
        Collection<d0j> collection = e0jVar.f6992a;
        if (collection == null) {
            collection = iun.f15405a;
        }
        if (collection.isEmpty()) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(collection, 10));
            for (d0j d0jVar : collection) {
                d0jVar.getClass();
                String str = d0jVar.f5269a;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                String str2 = d0jVar.b;
                if (str2 == null) {
                    jf4.k(null);
                    return null;
                }
                arrayList.add(new wxb0(str, str2));
            }
        }
        Integer num = e0jVar.b;
        return new p6j(num != null ? num.intValue() : 0, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        h0j h0jVar;
        if (zjeVar instanceof h0j) {
            h0jVar = (h0j) zjeVar;
            int i = h0jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0jVar.k = i - Integer.MIN_VALUE;
            } else {
                h0jVar = new h0j(this, zjeVar);
            }
        } else {
            h0jVar = new h0j(this, zjeVar);
        }
        Object objA = h0jVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h0jVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            j0j j0jVar = (j0j) ((n0o0) this.d).getValue();
            String strA = ((btt0) this.f1068a).a();
            m16 m16Var = new m16(((knf0) this.c).c());
            h0jVar.k = 1;
            objA = j0jVar.a(strA, m16Var, h0jVar);
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
        r7j r7jVar = (r7j) CollectionsKt.firstOrNull((List) ((u2t) objA).a());
        if (r7jVar == null) {
            r7jVar = new r7j();
        }
        Float f = r7jVar.f29977a;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        String str = r7jVar.b;
        if (str == null) {
            str = "";
        }
        Long l = r7jVar.c;
        return new y6j(fFloatValue, l != null ? l.longValue() : 0L, str);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable v(zje zjeVar) {
        i0j i0jVar;
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        if (zjeVar instanceof i0j) {
            i0jVar = (i0j) zjeVar;
            int i = i0jVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0jVar.k = i - Integer.MIN_VALUE;
            } else {
                i0jVar = new i0j(this, zjeVar);
            }
        } else {
            i0jVar = new i0j(this, zjeVar);
        }
        Object objB = i0jVar.i;
        wne wneVar = wne.f39444a;
        int i2 = i0jVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            j0j j0jVar = (j0j) ((n0o0) this.d).getValue();
            String strA = ((btt0) this.f1068a).a();
            v7j v7jVar = new v7j(((knf0) this.c).c());
            i0jVar.k = 1;
            objB = j0jVar.b(strA, v7jVar, i0jVar);
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
        Iterable<e8j> iterable = (Iterable) ((u2t) objB).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (e8j e8jVar : iterable) {
            e8jVar.getClass();
            a8j a8jVar = e8jVar.f7374a;
            int iIntValue = 0;
            if (a8jVar == null || (obj = a8jVar.c) == null) {
                obj = 0;
            }
            if (obj.equals(0)) {
                str = "";
            } else {
                if (a8jVar == null || (obj2 = a8jVar.b) == null) {
                    obj2 = 0;
                }
                if (obj2.equals(0)) {
                    str = "";
                } else {
                    if (a8jVar == null || (obj3 = a8jVar.f427a) == null) {
                        obj3 = 0;
                    }
                    if (obj3.equals(0)) {
                        str = "";
                    } else {
                        Integer numValueOf = Integer.valueOf((a8jVar == null || (str4 = a8jVar.c) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue());
                        Integer numValueOf2 = Integer.valueOf((a8jVar == null || (str3 = a8jVar.b) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue());
                        if (a8jVar != null && (str2 = a8jVar.f427a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                            iIntValue = intOrNull.intValue();
                        }
                        str = String.format("%02d.%02d.%d", Arrays.copyOf(new Object[]{numValueOf, numValueOf2, Integer.valueOf(iIntValue)}, 3));
                    }
                }
            }
            Iterable<d8j> iterable2 = e8jVar.b;
            if (iterable2 == null) {
                iterable2 = iun.f15405a;
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
            for (d8j d8jVar : iterable2) {
                d8jVar.getClass();
                Float f = d8jVar.f5651a;
                float fFloatValue = f != null ? f.floatValue() : 0.0f;
                String str5 = d8jVar.b;
                String str6 = str5 == null ? "" : str5;
                String str7 = d8jVar.c;
                String str8 = str7 == null ? "" : str7;
                Long l = d8jVar.d;
                arrayList2.add(new bkv0(fFloatValue, str6, str8, l != null ? l.longValue() : 0L));
            }
            arrayList.add(new g7j(str, arrayList2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(int i, int i2, long j, zje zjeVar) {
        rin rinVar;
        if (zjeVar instanceof rin) {
            rinVar = (rin) zjeVar;
            int i3 = rinVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rinVar.k = i3 - Integer.MIN_VALUE;
            } else {
                rinVar = new rin(this, zjeVar);
            }
        } else {
            rinVar = new rin(this, zjeVar);
        }
        Object objD = rinVar.i;
        wne wneVar = wne.f39444a;
        int i4 = rinVar.k;
        if (i4 == 0) {
            z1x.P(objD);
            wti wtiVar = (wti) this.f1068a;
            String strA = ((btt0) this.d).a();
            lhn lhnVar = new lhn(new Long(j), new Integer(i), new Integer(i2), ((knf0) this.c).c(), cs0.u(s470.EASTEN_NIGHT.a()));
            rinVar.k = 1;
            objD = ((phn) ((ntl) wtiVar.c).invoke()).d(strA, lhnVar, rinVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        cjn cjnVarU = obc.U((fjn) ((q16) objD).a());
        nin ninVar = (nin) this.b;
        ninVar.getClass();
        ninVar.f23598a = cjnVarU;
        return cjnVarU;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable x(List list, zje zjeVar) {
        q9u q9uVar;
        ArrayList arrayList;
        if (zjeVar instanceof q9u) {
            q9uVar = (q9u) zjeVar;
            int i = q9uVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9uVar.m = i - Integer.MIN_VALUE;
            } else {
                q9uVar = new q9u(this, zjeVar);
            }
        } else {
            q9uVar = new q9u(this, zjeVar);
        }
        Object obj = q9uVar.k;
        wne wneVar = wne.f39444a;
        int i2 = q9uVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axq.t(((i8p) it.next()).f14350a, arrayList2);
            }
            String strA = ((ntu) this.c).a();
            cdu cduVar = (cdu) this.b;
            q9uVar.i = list;
            q9uVar.j = arrayList2;
            q9uVar.m = 1;
            Serializable serializableC = cdu.c(cduVar, 0, strA, q9uVar, 8);
            if (serializableC == wneVar) {
                return wneVar;
            }
            obj = serializableC;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = q9uVar.j;
            list = q9uVar.i;
            z1x.P(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (arrayList.contains(new Long(x1x.D(((pbv) obj2).e)))) {
                arrayList3.add(obj2);
            }
        }
        return new Pair(list, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(String str, String str2, zje zjeVar) {
        tyk tykVar;
        if (zjeVar instanceof tyk) {
            tykVar = (tyk) zjeVar;
            int i = tykVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tykVar.l = i - Integer.MIN_VALUE;
            } else {
                tykVar = new tyk(this, zjeVar);
            }
        } else {
            tykVar = new tyk(this, zjeVar);
        }
        Object objU = tykVar.j;
        wne wneVar = wne.f39444a;
        int i2 = tykVar.l;
        if (i2 == 0) {
            z1x.P(objU);
            hsj hsjVar = (hsj) this.f1068a;
            ((knf0) this.b).getClass();
            tykVar.i = str2;
            tykVar.l = 1;
            objU = hsjVar.u(1357, tykVar, str);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = tykVar.i;
            z1x.P(objU);
        }
        q930 q930Var = (q930) objU;
        String str3 = q930Var.f28328a;
        String str4 = q930Var.b;
        String str5 = "";
        if (str3 != null && str4 != null) {
            ref refVar = (ref) this.d;
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            refVar.getClass();
            try {
                e0g0 e0g0Var = j0g0.b;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(zvv.c(str4));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(zvv.c(str3));
                bArrDoFinal.getClass();
                String strM = kotlin.text.c.m(bArrDoFinal);
                Arrays.fill(bytes, (byte) 0);
                vby vbyVar = (vby) this.c;
                vbyVar.getClass();
                String str6 = ((vrw) vbyVar.b(vrw.Companion.serializer(), strM)).f37921a;
                if (str6 != null) {
                    str5 = str6;
                }
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                Throwable thA = j0g0.a(new g0g0(th));
                if (thA == null) {
                    csj.b();
                    return null;
                }
                String str7 = new String(bytes, Charsets.UTF_8);
                String message = thA.getMessage();
                StringBuilder sbN = b1j.n("Config decryption error: vector: ", str4, ", decryptKey: ", str7, ", value: ");
                sbN.append(str3);
                sbN.append(Separators.SP);
                sbN.append(message);
                throw new IllegalStateException(sbN.toString().toString());
            }
        }
        if (str5.length() != 0) {
            return str5;
        }
        jf4.k(null);
        return null;
    }

    public e720 z() {
        nb7 nb7Var = (nb7) this.f1068a;
        return new e720(new loi0(new h03(nb7Var)), new ani0(new h03(nb7Var)), (lbu) this.b, new lk5((pru) this.c, (r9u) this.d, (byte) 3));
    }

    public /* synthetic */ ali(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1068a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public ali(hsj hsjVar, knf0 knf0Var, vby vbyVar, ref refVar) {
        knf0Var.getClass();
        vbyVar.getClass();
        refVar.getClass();
        this.f1068a = hsjVar;
        this.b = knf0Var;
        this.c = vbyVar;
        this.d = refVar;
    }

    public ali(vwb0 vwb0Var, vby vbyVar) {
        vwb0Var.getClass();
        vbyVar.getClass();
        this.f1068a = vwb0Var;
        this.b = vbyVar;
        this.c = q7m0.a(null);
        this.d = q7m0.a(Boolean.valueOf(m()));
    }

    public ali(oeg0 oeg0Var, yk5 yk5Var, kj5 kj5Var, gl5 gl5Var, zsr zsrVar, mi70 mi70Var, r9u r9uVar) {
        oeg0Var.getClass();
        mi70Var.getClass();
        r9uVar.getClass();
        this.f1068a = oeg0Var;
        this.b = zsrVar;
        this.c = mi70Var;
        this.d = r9uVar;
    }

    public ali(bwl bwlVar, o8o o8oVar, knf0 knf0Var, kuy kuyVar) {
        knf0Var.getClass();
        kuyVar.getClass();
        this.f1068a = bwlVar;
        this.b = o8oVar;
        this.c = knf0Var;
        this.d = kuyVar;
    }

    public ali(pbt pbtVar, cdu cduVar, ntu ntuVar, iqt iqtVar) {
        pbtVar.getClass();
        this.f1068a = pbtVar;
        this.b = cduVar;
        this.c = ntuVar;
        this.d = iqtVar;
    }

    public ali(btt0 btt0Var, mne mneVar, ulk ulkVar, gii0 gii0Var) {
        btt0Var.getClass();
        gii0Var.getClass();
        this.f1068a = btt0Var;
        this.b = mneVar;
        this.c = ulkVar;
        this.d = new wgn(gii0Var, (byte) 13);
    }

    public ali(iqi iqiVar, wti wtiVar, pru pruVar, wyu wyuVar) {
        wyuVar.getClass();
        this.f1068a = iqiVar;
        this.b = wtiVar;
        this.c = pruVar;
        this.d = wyuVar;
    }

    public ali(wti wtiVar, nin ninVar, knf0 knf0Var, btt0 btt0Var) {
        ninVar.getClass();
        this.f1068a = wtiVar;
        this.b = ninVar;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public ali(btt0 btt0Var, yzi yziVar, knf0 knf0Var, gii0 gii0Var) {
        yziVar.getClass();
        this.f1068a = btt0Var;
        this.b = yziVar;
        this.c = knf0Var;
        this.d = maz.b(new sza(gii0Var, (byte) 23));
    }

    public ali() {
        this.f1068a = new awa0(10);
        this.b = new nuj0(0);
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public ali(cad cadVar, ctf0 ctf0Var) {
        this.f1068a = ctf0Var;
        this.b = cadVar;
        byte b = 12;
        this.c = n0k0.a(new gji(this, 0, b));
        this.d = n0k0.a(new gji(this, 1, b));
    }

    public ali(c1d0 c1d0Var, m1e m1eVar, mne mneVar) {
        this.f1068a = m1eVar;
        this.b = c1d0Var;
        this.c = mneVar;
        this.d = new ppi(this, (byte) 3);
    }

    public ali(cad cadVar, duj dujVar, ctf0 ctf0Var) {
        this.f1068a = dujVar;
        this.b = cadVar;
        this.c = ctf0Var;
        this.d = new yxi(this, (byte) 25);
    }

    public ali(knf0 knf0Var, wsf0 wsf0Var, gii0 gii0Var, btt0 btt0Var) {
        this.f1068a = gii0Var;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = wsf0Var;
    }

    public ali(cad cadVar, ioi ioiVar, o8f o8fVar) {
        this.f1068a = cadVar;
        this.b = ioiVar;
        this.c = o8fVar;
        this.d = new eni(this, (byte) 7);
    }

    public ali(r9u r9uVar, nb7 nb7Var, pru pruVar, lbu lbuVar) {
        this.f1068a = nb7Var;
        this.b = lbuVar;
        this.c = pruVar;
        this.d = r9uVar;
    }

    public ali(knf0 knf0Var, ovo0 ovo0Var, gii0 gii0Var, kuy kuyVar) {
        this.f1068a = gii0Var;
        this.b = ovo0Var;
        this.c = knf0Var;
        this.d = kuyVar;
    }

    public ali(sik sikVar, Function1 function1) {
        function1.getClass();
        this.f1068a = sikVar;
        this.b = function1;
        this.d = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ ali(Object obj, Object obj2, Object obj3, pru pruVar) {
        this.f1068a = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = pruVar;
    }
}
