package a;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.tabs.DsTabs;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class mii0 implements nry, mry {
    public static mii0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21848a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public mii0(byte b) {
        this.f21848a = b;
        switch (b) {
            case 18:
                break;
            case 22:
                this.b = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public static synchronized mii0 u() {
        mii0 mii0Var;
        mii0Var = f;
        if (mii0Var == null) {
            mii0Var = new mii0((byte) 0);
            f = mii0Var;
        }
        return mii0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(long j, zje zjeVar, String str) {
        v47 v47Var;
        if (zjeVar instanceof v47) {
            v47Var = (v47) zjeVar;
            int i = v47Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v47Var.k = i - Integer.MIN_VALUE;
            } else {
                v47Var = new v47(this, zjeVar);
            }
        } else {
            v47Var = new v47(this, zjeVar);
        }
        Object obj = v47Var.i;
        wne wneVar = wne.f39444a;
        int i2 = v47Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            yzn0 yzn0Var = (yzn0) this.b;
            String strA = ((btt0) this.c).a();
            rqt0 rqt0Var = new rqt0(null, str, j);
            v47Var.k = 1;
            if (((s37) ((zo4) yzn0Var.b).invoke()).e(strA, rqt0Var, v47Var) == wneVar) {
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
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (V(r11, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r10, a.cn7 r11, a.zje r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof a.w47
            if (r0 == 0) goto L13
            r0 = r12
            a.w47 r0 = (a.w47) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.w47 r0 = new a.w47
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r12)
            goto L6d
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L31:
            a.cn7 r11 = r0.i
            a.z1x.P(r12)
            goto L62
        L37:
            a.z1x.P(r12)
            java.lang.Object r12 = r9.b
            a.yzn0 r12 = (a.yzn0) r12
            java.lang.Object r2 = r9.c
            a.btt0 r2 = (a.btt0) r2
            java.lang.String r2 = r2.a()
            long r6 = r11.b
            a.rqt0 r8 = new a.rqt0
            r8.<init>(r5, r10, r6)
            r0.i = r11
            r0.l = r4
            java.lang.Object r10 = r12.b
            a.zo4 r10 = (a.zo4) r10
            java.lang.Object r10 = r10.invoke()
            a.s37 r10 = (a.s37) r10
            java.lang.Object r10 = r10.e(r2, r8, r0)
            if (r10 != r1) goto L62
            goto L6c
        L62:
            r0.i = r5
            r0.l = r3
            java.lang.Object r9 = r9.V(r11, r0)
            if (r9 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mii0.B(java.lang.String, a.cn7, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(long j, long j2, zje zjeVar) {
        x47 x47Var;
        if (zjeVar instanceof x47) {
            x47Var = (x47) zjeVar;
            int i = x47Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x47Var.k = i - Integer.MIN_VALUE;
            } else {
                x47Var = new x47(this, zjeVar);
            }
        } else {
            x47Var = new x47(this, zjeVar);
        }
        Object obj = x47Var.i;
        wne wneVar = wne.f39444a;
        int i2 = x47Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            yzn0 yzn0Var = (yzn0) this.b;
            String strA = ((btt0) this.c).a();
            rqt0 rqt0Var = new rqt0(new Long(j), null, j2);
            x47Var.k = 1;
            if (((s37) ((zo4) yzn0Var.b).invoke()).e(strA, rqt0Var, x47Var) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0092 -> B:38:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b7 -> B:31:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object D(a.zje r21) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mii0.D(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0163 A[EDGE_INSN: B:104:0x0163->B:66:0x0163 BREAK  A[LOOP:5: B:63:0x0145->B:65:0x0150], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a A[LOOP:4: B:56:0x0114->B:58:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150 A[LOOP:5: B:63:0x0145->B:65:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Code duplicated, block: B:78:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[LOOP:1: B:36:0x00ac->B:96:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0107 A[EDGE_INSN: B:97:0x0107->B:55:0x0107 BREAK  A[LOOP:2: B:42:0x00d1->B:54:0x00fd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public Object E(qkt qktVar, zje zjeVar) {
        c0c c0cVar;
        qkt qktVar2;
        List list;
        k0j0 k0j0Var;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean z;
        ArrayList arrayList3;
        Iterator it2;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it3;
        iil iilVar;
        List listA0;
        Iterator it4;
        String str;
        List list3;
        List list4;
        boolean zContains;
        qkt qktVar3;
        Iterator it5;
        Object next;
        p52 p52Var;
        qkt qktVar4;
        Iterator it6;
        Object[] objArr;
        if (zjeVar instanceof c0c) {
            c0cVar = (c0c) zjeVar;
            int i = c0cVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0cVar.n = i - Integer.MIN_VALUE;
            } else {
                c0cVar = new c0c(this, zjeVar);
            }
        } else {
            c0cVar = new c0c(this, zjeVar);
        }
        Object objD = c0cVar.l;
        wne wneVar = wne.f39444a;
        int i2 = c0cVar.n;
        boolean z2 = true;
        if (i2 == 0) {
            z1x.P(objD);
            if (((bzt) this.e).f3488a.a().S) {
                return Boolean.TRUE;
            }
            bot botVar = (bot) this.b;
            c0cVar.i = qktVar;
            c0cVar.n = 1;
            objD = botVar.f2951a.d(c0cVar);
            if (objD != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            qktVar = c0cVar.i;
            z1x.P(objD);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k0j0Var = c0cVar.k;
            list = c0cVar.j;
            qktVar2 = c0cVar.i;
            z1x.P(objD);
        }
        list2 = (List) objD;
        arrayList = new ArrayList();
        for (Object obj : list) {
            qktVar4 = (qkt) obj;
            if (list2 != null || !list2.isEmpty()) {
                it6 = list2.iterator();
                while (it6.hasNext()) {
                    if (qktVar4.f28902a == ((p52) it6.next()).f26383a) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        it = arrayList.iterator();
        while (true) {
            z = false;
            objArr = 0;
            if (it.hasNext()) {
                break;
            }
            qktVar3 = (qkt) it.next();
            it5 = list2.iterator();
            do {
                if (it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (qktVar3.f28902a != ((p52) next).f26383a);
            p52Var = (p52) next;
            if (p52Var != null) {
                z = p52Var.e;
            }
            arrayList2.add(qkt.a(qktVar3, null, z, 191));
        }
        arrayList3 = new ArrayList(r3d.q(list2, 10));
        it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new Integer(((p52) it2.next()).f26383a));
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
        iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it3 = rx3VarS0.iterator();
        while (true) {
            iilVar = (iil) it3;
            if (iilVar.b.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put(indexedValue.b, new Integer(indexedValue.f46061a));
        }
        listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, objArr == true ? 1 : 0));
        if (listA0 == null && listA0.isEmpty()) {
            z2 = false;
        } else {
            it4 = listA0.iterator();
            while (it4.hasNext()) {
                if (((qkt) it4.next()).f28902a == qktVar2.f28902a) {
                    str = qktVar2.d;
                    list3 = k0j0Var.b;
                    list4 = k0j0Var.c;
                    if (!list3.isEmpty()) {
                        zContains = list3.contains(str);
                    } else if (list4.isEmpty() && list4.contains(str)) {
                        zContains = false;
                    } else {
                        zContains = true;
                    }
                    if (zContains) {
                    }
                }
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
        List list5 = (List) objD;
        k0j0 k0j0VarB = ((czt) this.d).f5239a.b();
        kpt kptVar = (kpt) this.c;
        c0cVar.i = qktVar;
        c0cVar.j = list5;
        c0cVar.k = k0j0VarB;
        c0cVar.n = 2;
        Object objB = kptVar.f18690a.b(c0cVar);
        if (objB != wneVar) {
            qktVar2 = qktVar;
            list = list5;
            objD = objB;
            k0j0Var = k0j0VarB;
            list2 = (List) objD;
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                qktVar4 = (qkt) obj;
                if (list2 != null) {
                }
                it6 = list2.iterator();
                while (it6.hasNext()) {
                    if (qktVar4.f28902a == ((p52) it6.next()).f26383a) {
                        arrayList.add(obj);
                        break;
                        break;
                    }
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            it = arrayList.iterator();
            while (true) {
                z = false;
                objArr = 0;
                if (it.hasNext()) {
                    break;
                    break;
                }
                qktVar3 = (qkt) it.next();
                it5 = list2.iterator();
                do {
                    if (it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (qktVar3.f28902a != ((p52) next).f26383a);
                p52Var = (p52) next;
                if (p52Var != null) {
                    z = p52Var.e;
                }
                arrayList2.add(qkt.a(qktVar3, null, z, 191));
            }
            arrayList3 = new ArrayList(r3d.q(list2, 10));
            it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Integer(((p52) it2.next()).f26383a));
            }
            rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
            iA = wp20.a(r3d.q(rx3VarS1, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            it3 = rx3VarS1.iterator();
            while (true) {
                iilVar = (iil) it3;
                if (iilVar.b.hasNext()) {
                    break;
                    break;
                }
                IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
                linkedHashMap.put(indexedValue2.b, new Integer(indexedValue2.f46061a));
            }
            listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, objArr == true ? 1 : 0));
            if (listA0 == null) {
                it4 = listA0.iterator();
                while (it4.hasNext()) {
                    if (((qkt) it4.next()).f28902a == qktVar2.f28902a) {
                        str = qktVar2.d;
                        list3 = k0j0Var.b;
                        list4 = k0j0Var.c;
                        if (!list3.isEmpty()) {
                            zContains = list3.contains(str);
                        } else if (list4.isEmpty()) {
                            zContains = true;
                        } else {
                            zContains = true;
                        }
                        if (zContains) {
                        }
                    }
                }
                z2 = false;
            } else {
                it4 = listA0.iterator();
                while (it4.hasNext()) {
                    if (((qkt) it4.next()).f28902a == qktVar2.f28902a) {
                        str = qktVar2.d;
                        list3 = k0j0Var.b;
                        list4 = k0j0Var.c;
                        if (!list3.isEmpty()) {
                            zContains = list3.contains(str);
                        } else if (list4.isEmpty()) {
                            zContains = true;
                        } else {
                            zContains = true;
                        }
                        if (zContains) {
                        }
                    }
                }
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
        return wneVar;
    }

    public jru F() {
        g8i g8iVar = (g8i) this.b;
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        ieu ieuVar = new ieu(gii0VarJ9, (byte) 21);
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        mne mneVarV1 = g8iVar.v1();
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        return new jru(new e7y(ieuVar, btt0VarO8, mneVarV1, knf0VarJ8));
    }

    public void G(long j, long j2, String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        jo20Var.put("action", "add");
        if (j2 > 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str != null) {
            jo20Var.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", jo20Var.b());
    }

    public void H(long j, String str) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("action", "add"));
        if (str != null) {
            linkedHashMapH.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", linkedHashMapH);
    }

    public void I(long j, long j2, String str, boolean z, boolean z2) {
        String str2 = z ? "1" : "0";
        kt2 kt2Var = (kt2) this.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j2 > 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        jo20Var.put("action", str2);
        if (z2) {
            jo20Var.put("option", "live");
        } else {
            jo20Var.put("option", "line");
        }
        if (str.length() > 0) {
            jo20Var.put("screen", str);
        }
        kt2Var.a("bet_add_favor", jo20Var.b());
    }

    public void J(long j, long j2) {
        ((kt2) this.b).a("coupon_add_event", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("game_id", Long.valueOf(j2))));
    }

    public void K(long j, long j2, long j3) {
        ((kt2) this.b).a("coupon_add_event", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("game_id", Long.valueOf(j2)), new Pair("sub_sport_id", Long.valueOf(j3))));
    }

    public void L(long j, long j2, long j3, long j4, String str, boolean z) {
        kt2 kt2Var = (kt2) this.b;
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        if (j2 != -1) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        jo20Var.put("screen", str);
        jo20Var.put("tab_id", Long.valueOf(j3));
        if (j4 != -1) {
            jo20Var.put("championship_id", Long.valueOf(j4));
        }
        if (z) {
            jo20Var.put("option", "live");
        } else {
            jo20Var.put("option", "line");
        }
        kt2Var.a("bet_call_bottom_sheet", jo20Var.b());
    }

    public void M(String str) {
        str.getClass();
        i8i.D("option", str, (kt2) this.b, "bet_sell_history_bet_done");
    }

    public void N(cxo cxoVar) {
        i8i.D("option", cxoVar.f5130a, (kt2) this.b, "amount_change_fast_bet");
    }

    public void O(long j, long j2, String str) {
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        jo20Var.put("action", "remove");
        if (j2 > 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str != null) {
            jo20Var.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", jo20Var.b());
    }

    public void P(long j, String str) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("action", "remove"));
        if (str != null) {
            linkedHashMapH.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", linkedHashMapH);
    }

    public void Q(String str, String str2, String str3, boolean z) {
        str3.getClass();
        kt2 kt2Var = (kt2) this.b;
        Pair pair = new Pair("option", str);
        Pair pair2 = new Pair("promocode", str2);
        Pair pair3 = new Pair("oneclick", Boolean.valueOf(z));
        Pair pair4 = new Pair("id_user", Long.valueOf(((gst0) this.e).f11847a.a().f18785a));
        Pair pair5 = new Pair("bet_id", str3);
        Pair pair6 = new Pair("af_id", ((knf0) this.c).a());
        ((peg0) this.d).i();
        kt2Var.a("finbet_bet_done", xp20.f(pair, pair2, pair3, pair4, pair5, pair6, new Pair("af_dev_key", "iGjRWepvHRRUkVX6DYuTPC")));
    }

    public void R(String str, long j, boolean z) {
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("action", z ? "follow" : "unfollow"));
        if (str != null) {
            linkedHashMapH.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", linkedHashMapH);
    }

    public void S(boolean z, String str, long j, long j2) {
        String str2 = z ? "follow" : "unfollow";
        jo20 jo20Var = new jo20();
        jo20Var.put("sport_id", Long.valueOf(j));
        jo20Var.put("action", str2);
        if (j2 > 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j2));
        }
        if (str != null) {
            jo20Var.put("screen", str);
        }
        ((kt2) this.b).a("bet_follow_add", jo20Var.b());
    }

    public void T(long j, String str) {
        ((kt2) this.b).a("option_bet_info_call", xp20.f(new Pair("option", Long.valueOf(j)), new Pair("screen", str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object U(int i, zje zjeVar, String str) {
        zc8 zc8Var;
        if (zjeVar instanceof zc8) {
            zc8Var = (zc8) zjeVar;
            int i2 = zc8Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zc8Var.l = i2 - Integer.MIN_VALUE;
            } else {
                zc8Var = new zc8(this, zjeVar);
            }
        } else {
            zc8Var = new zc8(this, zjeVar);
        }
        Object objC = zc8Var.j;
        wne wneVar = wne.f39444a;
        int i3 = zc8Var.l;
        if (i3 == 0) {
            z1x.P(objC);
            ok50 ok50Var = (ok50) this.d;
            String strA = ((btt0) this.c).a();
            int iX = wvb.X(str);
            tob tobVar = new tob(i);
            zc8Var.i = i;
            zc8Var.l = 1;
            objC = ((gc8) ((zm) ok50Var.f25390a).invoke()).c(strA, iX, tobVar, zc8Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = zc8Var.i;
            z1x.P(objC);
        }
        Boolean bool = ((qob) objC).f29065a;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            hc8 hc8Var = (hc8) this.e;
            ic8 ic8Var = hc8Var.f12808a;
            List<rb8> list = ic8Var.c;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (rb8 rb8Var : list) {
                int i4 = rb8Var.f30171a;
                boolean z = i4 == i;
                int i5 = rb8Var.b;
                String str2 = rb8Var.c;
                String str3 = rb8Var.d;
                boolean z2 = rb8Var.f;
                str2.getClass();
                str3.getClass();
                arrayList.add(new rb8(i4, i5, str2, str3, z, z2));
            }
            hc8Var.f12808a = new ic8(arrayList, ic8Var.f14523a, ic8Var.b);
        }
        return Boolean.valueOf(Intrinsics.d(bool, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r2 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (r2 == r6) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(a.cn7 r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mii0.V(a.cn7, a.zje):java.lang.Object");
    }

    public xzp W(int i, qlc qlcVar, zpe0 zpe0Var) {
        er30 er30Var = new er30(((er30) this.b).f8263a + '@' + i);
        chf0 chf0Var = (chf0) this.e;
        HashMap map = (HashMap) chf0Var.c;
        List arrayList = (List) map.get(er30Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(er30Var, arrayList);
        }
        return ((esg0) chf0Var.b).d0(qlcVar, zpe0Var, arrayList);
    }

    @Override // a.mry
    public void a() {
        switch (this.f21848a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((chf0) this.d).c).put((er30) this.b, arrayList);
                }
                break;
            default:
                xzp xzpVar = (xzp) this.e;
                g950 g950Var = (g950) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                k3u0 k3u0VarM0 = rcb.m0(g950Var, (wm40) xzpVar.d);
                if (k3u0VarM0 != null) {
                    HashMap map = (HashMap) xzpVar.b;
                    List listI = d5c.I(arrayList2);
                    wsy type = k3u0VarM0.getType();
                    type.getClass();
                    listI.getClass();
                    map.put(g950Var, new h0t0(listI, type));
                    break;
                } else if (((esg0) xzpVar.c).a0((qlc) xzpVar.e) && Intrinsics.d(g950Var.b(), "value")) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (obj instanceof e93) {
                            arrayList3.add(obj);
                        }
                    }
                    List list = (List) xzpVar.f;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        list.add((t83) ((e93) it.next()).f29728a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // a.nry
    public lry b(qlc qlcVar, zpe0 zpe0Var) {
        return ((esg0) ((chf0) this.d).b).d0(qlcVar, zpe0Var, (ArrayList) this.c);
    }

    @Override // a.mry
    public void c(tlc tlcVar) {
        ((ArrayList) this.b).add(new ehy(new chy(tlcVar)));
    }

    @Override // a.mry
    public void d(qlc qlcVar, g950 g950Var) {
        ((ArrayList) this.b).add(new h0o(qlcVar, g950Var));
    }

    @Override // a.mry
    public void e(Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        esg0 esg0Var = (esg0) this.c;
        g950 g950Var = (g950) this.d;
        Object objG0 = jtv.G0((zm40) esg0Var.c, obj);
        if (objG0 == null) {
            objG0 = new g2o("Unsupported annotation argument: " + g950Var);
        }
        arrayList.add(objG0);
    }

    @Override // a.mry
    public lry f(qlc qlcVar) {
        ArrayList arrayList = new ArrayList();
        return new nhf0(((esg0) this.c).c0(qlcVar, gmk0.x0, arrayList), this, arrayList);
    }

    public mii0 g() {
        return new mii0((mne) this.b, new r7v((gii0) this.c, (byte) 14), (ev7) this.d, (btt0) this.e);
    }

    public h03 h() {
        return new h03((Object) g(), (byte) 4);
    }

    public fvt0 i() {
        return new fvt0(g());
    }

    public nsc j() {
        return new nsc(g());
    }

    public rrc k() {
        return new rrc(g(), (byte) 19);
    }

    public nsc l() {
        return new nsc(g());
    }

    public yzn0 m() {
        Intent intent = (Intent) this.b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (((SparseArray) this.d) != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.d);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ActivityOptions activityOptionsMakeBasic = (ActivityOptions) this.c;
            if (activityOptionsMakeBasic == null) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
                this.c = activityOptionsMakeBasic;
            }
            r6.r(activityOptionsMakeBasic);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.c) == null) {
                this.c = ActivityOptions.makeBasic();
            }
            g7.e((ActivityOptions) this.c, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.c;
        return new yzn0(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:169|57|58|59|60|61|150|62|63|161|64|(9:67|68|163|79|80|167|129|138|(1:175)(1:141))) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:165|50) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:155|18|19|20|124|153|42|(9:45|171|46|47|157|48|(2:165|50)|55|(12:169|57|58|59|60|61|150|62|63|161|64|(9:67|68|163|79|80|167|129|138|(1:175)(1:141)))(8:78|163|79|80|167|129|138|(1:175)(1:141)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:67|68|163|79|80|(2:167|129)|138|(1:175)(1:141)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:45|171|46|47|157|48|(2:165|50)|55|(12:169|57|58|59|60|61|150|62|63|161|64|(9:67|68|163|79|80|167|129|138|(1:175)(1:141)))(8:78|163|79|80|167|129|138|(1:175)(1:141))) */
    /* JADX WARN: Code duplicated, block: B:109:0x0260  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:165:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x0234 A[Catch: all -> 0x023e, TryCatch #14 {all -> 0x023e, blocks: (B:89:0x0230, B:91:0x0234, B:97:0x0243, B:99:0x0247, B:102:0x024d, B:104:0x0251, B:106:0x0258, B:114:0x026c, B:118:0x0275, B:111:0x0265), top: B:173:0x0230 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0247 A[Catch: all -> 0x023e, TryCatch #14 {all -> 0x023e, blocks: (B:89:0x0230, B:91:0x0234, B:97:0x0243, B:99:0x0247, B:102:0x024d, B:104:0x0251, B:106:0x0258, B:114:0x026c, B:118:0x0275, B:111:0x0265), top: B:173:0x0230 }] */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0328, code lost:
    
        if (r0 == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0176, code lost:
    
        r7 = r10;
        r10 = r2;
        r2 = r15;
        r15 = r7;
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017c, code lost:
    
        r11 = r5;
        r5 = r14;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d2, code lost:
    
        r15 = r10;
        r7 = r11;
        r14 = r12;
        r2 = r17;
        r6 = r20;
        r10 = r22;
        r12 = r4;
        r11 = r5;
        r5 = r18;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e4, code lost:
    
        r22 = r2;
        r19 = r6;
        r20 = r13;
        r18 = r14;
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f4, code lost:
    
        r20 = r13;
        r18 = r14;
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0214, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0215, code lost:
    
        r7 = r10;
        r10 = r2;
        r2 = r15;
        r15 = r7;
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021d, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0224, code lost:
    
        r15 = r7;
        r7 = r11;
        r11 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022a, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Path cross not found for [B:173:0x0230, B:96:0x0242], limit reached: 171 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x02bb -> B:20:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r26, a.mi0 r27, java.lang.Integer r28, int r29, java.lang.String r30, a.zje r31) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mii0.n(java.lang.String, a.mi0, java.lang.Integer, int, java.lang.String, a.zje):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x00e9: INVOKE (r1v16 ?? I:java.util.ArrayList), (r11v0 ?? I:java.lang.Object) VIRTUAL call: java.util.ArrayList.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:234)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.lang.Object o(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x00e9: INVOKE (r1v16 ?? I:java.util.ArrayList), (r11v0 ?? I:java.lang.Object) VIRTUAL call: java.util.ArrayList.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:234)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    public lrc p() {
        return new lrc((qi10) ((n5d0) this.e).get());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable q(long j, zje zjeVar) throws zhi0 {
        to2 to2Var;
        if (zjeVar instanceof to2) {
            to2Var = (to2) zjeVar;
            int i = to2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                to2Var.k = i - Integer.MIN_VALUE;
            } else {
                to2Var = new to2(this, zjeVar);
            }
        } else {
            to2Var = new to2(this, zjeVar);
        }
        to2 to2Var2 = to2Var;
        Object objD0 = to2Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = to2Var2.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.b).b;
            ey eyVar = new ey((Object) this, j, yjeVar, (byte) 6);
            to2Var2.k = 1;
            objD0 = qjj.d0(dvjVar, eyVar, to2Var2);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        zo2 zo2Var = (zo2) objD0;
        String str = zo2Var.b;
        if (str != null && str.length() > 0) {
            throw new zhi0(zo2Var.b, zo2Var.c, (Integer) null, 12);
        }
        List list = zo2Var.f44698a;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pd6 pd6Var = (pd6) it.next();
            pd6Var.getClass();
            Long l = pd6Var.f26793a;
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = pd6Var.b;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Long l3 = pd6Var.c;
            long jLongValue3 = l3 != null ? l3.longValue() : 0L;
            Long l4 = pd6Var.d;
            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
            String str2 = pd6Var.e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = pd6Var.f;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = pd6Var.g;
            if (str4 == null) {
                str4 = "";
            }
            Iterator it2 = it;
            Long l5 = pd6Var.h;
            long jLongValue5 = l5 != null ? l5.longValue() : 0L;
            String str5 = pd6Var.j;
            String str6 = str5 == null ? "" : str5;
            List list2 = pd6Var.i;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list3 = list2;
            Long l6 = pd6Var.k;
            long jLongValue6 = l6 != null ? l6.longValue() : 0L;
            String str7 = pd6Var.m;
            String str8 = str7 == null ? "" : str7;
            List list4 = pd6Var.l;
            if (list4 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            Boolean bool = pd6Var.n;
            int iIntValue = 0;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            String str9 = pd6Var.o;
            String str10 = str9 == null ? "" : str9;
            Integer num = pd6Var.p;
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = pd6Var.q;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            long j2 = jLongValue3;
            String str11 = str2;
            long j3 = jLongValue4;
            String str12 = str3;
            String str13 = str4;
            long j4 = jLongValue;
            long j5 = jLongValue2;
            arrayList.add(new so2(j4, j5, j2, j3, str11, str12, str13, jLongValue5, str6, list3, jLongValue6, str8, list5, zBooleanValue, str10, iIntValue2, iIntValue));
            it = it2;
        }
        return arrayList;
    }

    public p4u r() {
        return new p4u((qi10) ((n5d0) this.e).get());
    }

    public xfu s() {
        return new xfu((qi10) ((n5d0) this.e).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object t(zje zjeVar) {
        opc opcVar;
        double d;
        ql5 ql5Var;
        ave aveVar = (ave) ((g45) this.b).c;
        etj etjVar = (etj) this.e;
        if (zjeVar instanceof opc) {
            opcVar = (opc) zjeVar;
            int i = opcVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                opcVar.k = i - Integer.MIN_VALUE;
            } else {
                opcVar = new opc(this, zjeVar);
            }
        } else {
            opcVar = new opc(this, zjeVar);
        }
        Object objA = opcVar.i;
        wne wneVar = wne.f39444a;
        int i2 = opcVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (!etjVar.f8378a.m() || (ql5Var = ((xre) this.c).f41366a.c) == null) {
                d = aveVar.e;
            } else {
                opcVar.k = 1;
                objA = etjVar.a(ql5Var, opcVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Double(d);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        d = ((c3j0) objA).b;
        return new Double(d);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable v(mi0 mi0Var, String str, Integer num, zje zjeVar) throws g2 {
        b51 b51Var;
        int iB;
        String strC;
        mii0 mii0Var;
        Throwable th;
        Object g0g0Var;
        Iterable iterable;
        HashSet hashSet;
        ArrayList<jj0> arrayList;
        ArrayList arrayList2;
        Object g0g0Var2;
        gj0 gj0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof b51) {
            b51Var = (b51) zjeVar;
            int i = b51Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                b51Var.o = i - Integer.MIN_VALUE;
            } else {
                b51Var = new b51(this, zjeVar);
            }
        } else {
            b51Var = new b51(this, zjeVar);
        }
        b51 b51Var2 = b51Var;
        Object objN = b51Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = b51Var2.o;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = b51Var2.l;
            String str2 = b51Var2.k;
            String str3 = b51Var2.j;
            mi0 mi0Var2 = b51Var2.i;
            try {
                z1x.P(objN);
                mii0Var = this;
                iB = i3;
                strC = str2;
                str = str3;
                mi0Var = mi0Var2;
                try {
                    g0g0Var = (f51) objN;
                    e0g0 e0g0Var = j0g0.b;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } catch (Throwable th3) {
                th = th3;
                mii0Var = this;
                iB = i3;
                strC = str2;
                str = str3;
                mi0Var = mi0Var2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (j0g0.a(g0g0Var) != null) {
                g0g0Var = ((z41) mii0Var.b).c(str, mi0Var, iB, strC);
            }
            iterable = ((f51) g0g0Var).f8937a;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (hashSet.add(((jj0) obj).f16598a)) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList();
            for (jj0 jj0Var : arrayList) {
                try {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = j120.i0(jj0Var, mi0Var);
                } catch (Throwable th4) {
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var2 = new g0g0(th4);
                }
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = null;
                }
                gj0Var = (gj0) g0g0Var2;
                if (gj0Var != null) {
                    arrayList2.add(gj0Var);
                }
            }
            if (arrayList2.isEmpty()) {
                throw new g2((byte) 2);
            }
            return arrayList2;
        }
        z1x.P(objN);
        iB = knf0Var.b();
        strC = knf0Var.c();
        try {
            e0g0 e0g0Var6 = j0g0.b;
            b51Var2.i = mi0Var;
            b51Var2.j = str;
            b51Var2.k = strC;
            b51Var2.l = iB;
            b51Var2.o = 1;
            mii0Var = this;
            try {
                objN = mii0Var.n(str, mi0Var, num, iB, strC, b51Var2);
                if (objN == wneVar) {
                    return wneVar;
                }
                str = str;
                mi0Var = mi0Var;
                g0g0Var = (f51) objN;
                e0g0 e0g0Var7 = j0g0.b;
                if (j0g0.a(g0g0Var) != null) {
                    g0g0Var = ((z41) mii0Var.b).c(str, mi0Var, iB, strC);
                }
                iterable = ((f51) g0g0Var).f8937a;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                hashSet = new HashSet();
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (hashSet.add(((jj0) obj).f16598a)) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList();
                while (r12.hasNext()) {
                    e0g0 e0g0Var8 = j0g0.b;
                    g0g0Var2 = j120.i0(jj0Var, mi0Var);
                    if (g0g0Var2 instanceof g0g0) {
                        g0g0Var2 = null;
                    }
                    gj0Var = (gj0) g0g0Var2;
                    if (gj0Var != null) {
                        arrayList2.add(gj0Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return arrayList2;
                }
                throw new g2((byte) 2);
            } catch (Throwable th5) {
                th = th5;
                str = str;
                mi0Var = mi0Var;
                e0g0 e0g0Var9 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } catch (Throwable th6) {
            th = th6;
            mii0Var = this;
            th = th;
            e0g0 e0g0Var10 = j0g0.b;
            g0g0Var = new g0g0(th);
            if (j0g0.a(g0g0Var) != null) {
                g0g0Var = ((z41) mii0Var.b).c(str, mi0Var, iB, strC);
            }
            iterable = ((f51) g0g0Var).f8937a;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            hashSet = new HashSet();
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (hashSet.add(((jj0) obj).f16598a)) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList();
            while (r12.hasNext()) {
                e0g0 e0g0Var11 = j0g0.b;
                g0g0Var2 = j120.i0(jj0Var, mi0Var);
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = null;
                }
                gj0Var = (gj0) g0g0Var2;
                if (gj0Var != null) {
                    arrayList2.add(gj0Var);
                }
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            throw new g2((byte) 2);
        }
        e0g0 e0g0Var12 = j0g0.b;
        g0g0Var = new g0g0(th);
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = ((z41) mii0Var.b).c(str, mi0Var, iB, strC);
        }
        iterable = ((f51) g0g0Var).f8937a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        hashSet = new HashSet();
        arrayList = new ArrayList();
        while (r10.hasNext()) {
            if (hashSet.add(((jj0) obj).f16598a)) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList();
        while (r12.hasNext()) {
            e0g0 e0g0Var13 = j0g0.b;
            g0g0Var2 = j120.i0(jj0Var, mi0Var);
            if (g0g0Var2 instanceof g0g0) {
                g0g0Var2 = null;
            }
            gj0Var = (gj0) g0g0Var2;
            if (gj0Var != null) {
                arrayList2.add(gj0Var);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        throw new g2((byte) 2);
    }

    public xzt w() {
        return new xzt((pru) this.b, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(zje zjeVar) {
        yc8 yc8Var;
        if (zjeVar instanceof yc8) {
            yc8Var = (yc8) zjeVar;
            int i = yc8Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yc8Var.k = i - Integer.MIN_VALUE;
            } else {
                yc8Var = new yc8(this, zjeVar);
            }
        } else {
            yc8Var = new yc8(this, zjeVar);
        }
        Object objA = yc8Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yc8Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ok50 ok50Var = (ok50) this.d;
            String strA = ((btt0) this.c).a();
            String strC = ((knf0) this.b).c();
            yc8Var.k = 1;
            objA = ((gc8) ((zm) ok50Var.f25390a).invoke()).a(strA, strC, yc8Var);
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
        vqt0 vqt0Var = (vqt0) ((q16) objA).a();
        Long l = vqt0Var.f37869a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = vqt0Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = vqt0Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Boolean bool = vqt0Var.d;
        return new sqt0(iIntValue, iIntValue2, jLongValue, bool != null ? bool.booleanValue() : false);
    }

    public boolean y(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean z(Context context) {
        Boolean boolValueOf = (Boolean) this.c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.c = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public mii0(DsTabs dsTabs, ViewPager2 viewPager2, Function1 function1) {
        this.f21848a = (byte) 23;
        viewPager2.getClass();
        this.b = dsTabs;
        this.c = viewPager2;
        this.d = function1;
        xp6 xp6Var = new xp6(this, (byte) 4);
        this.e = xp6Var;
        viewPager2.c(xp6Var);
    }

    public mii0(mne mneVar, r7v r7vVar, ev7 ev7Var, btt0 btt0Var) {
        this.f21848a = (byte) 10;
        ev7Var.getClass();
        btt0Var.getClass();
        this.b = mneVar;
        this.c = r7vVar;
        this.d = ev7Var;
        this.e = btt0Var;
    }

    public mii0(kt2 kt2Var, knf0 knf0Var, peg0 peg0Var, gst0 gst0Var) {
        this.f21848a = (byte) 7;
        kt2Var.getClass();
        knf0Var.getClass();
        peg0Var.getClass();
        gst0Var.getClass();
        this.b = kt2Var;
        this.c = knf0Var;
        this.d = peg0Var;
        this.e = gst0Var;
    }

    public mii0(clc clcVar, itt ittVar, gmt gmtVar, ztt zttVar) {
        this.f21848a = (byte) 21;
        ittVar.getClass();
        gmtVar.getClass();
        zttVar.getClass();
        this.b = clcVar;
        this.c = ittVar;
        this.d = gmtVar;
        this.e = zttVar;
    }

    public mii0(mne mneVar, yk50 yk50Var, knf0 knf0Var, btt0 btt0Var) {
        this.f21848a = (byte) 3;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = mneVar;
        this.c = yk50Var;
        this.d = knf0Var;
        this.e = btt0Var;
    }

    public mii0(g45 g45Var, xre xreVar, oif0 oif0Var, etj etjVar) {
        this.f21848a = (byte) 17;
        etjVar.getClass();
        this.b = g45Var;
        this.c = xreVar;
        this.d = oif0Var;
        this.e = etjVar;
    }

    public mii0(c5k c5kVar, gs6 gs6Var, mne mneVar, knf0 knf0Var) {
        this.f21848a = (byte) 8;
        gs6Var.getClass();
        knf0Var.getClass();
        this.b = c5kVar;
        this.c = gs6Var;
        this.d = mneVar;
        this.e = knf0Var;
    }

    public mii0(krv0 krv0Var, psc pscVar, mne mneVar, hk3 hk3Var) {
        this.f21848a = (byte) 4;
        krv0Var.getClass();
        hk3Var.getClass();
        this.b = krv0Var;
        this.c = pscVar;
        this.d = mneVar;
        this.e = hk3Var;
    }

    public mii0(rou rouVar, knf0 knf0Var, btt0 btt0Var, ok50 ok50Var, hc8 hc8Var) {
        this.f21848a = (byte) 12;
        knf0Var.getClass();
        btt0Var.getClass();
        hc8Var.getClass();
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = ok50Var;
        this.e = hc8Var;
    }

    public mii0(z41 z41Var, xr xrVar, knf0 knf0Var, btt0 btt0Var) {
        this.f21848a = (byte) 2;
        z41Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = z41Var;
        this.c = xrVar;
        this.d = knf0Var;
        this.e = btt0Var;
    }

    public mii0(mne mneVar, ok50 ok50Var, knf0 knf0Var, btt0 btt0Var) {
        this.f21848a = (byte) 20;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = mneVar;
        this.c = ok50Var;
        this.d = knf0Var;
        this.e = btt0Var;
    }

    public mii0(knf0 knf0Var, bbw0 bbw0Var, jmb jmbVar, chg chgVar) {
        this.f21848a = (byte) 14;
        knf0Var.getClass();
        chgVar.getClass();
        this.b = knf0Var;
        this.c = bbw0Var;
        this.d = jmbVar;
        this.e = chgVar;
    }

    public mii0(yzn0 yzn0Var, btt0 btt0Var, knf0 knf0Var, t47 t47Var) {
        this.f21848a = (byte) 9;
        btt0Var.getClass();
        knf0Var.getClass();
        t47Var.getClass();
        this.b = yzn0Var;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = t47Var;
    }

    public mii0(ctf0 ctf0Var, n3w n3wVar, Double d) {
        this.f21848a = (byte) 27;
        this.b = ctf0Var;
        this.c = n3wVar;
        this.d = d;
        this.e = new uci(this, (byte) 3);
    }

    public mii0(cad cadVar, BonusAccountScreenParams bonusAccountScreenParams, ctf0 ctf0Var) {
        this.f21848a = (byte) 25;
        this.b = bonusAccountScreenParams;
        this.c = ctf0Var;
        this.d = cadVar;
        this.e = new n8i(this, (byte) 26);
    }

    public mii0(cad cadVar, ioi ioiVar, ctf0 ctf0Var) {
        this.f21848a = (byte) 26;
        this.b = cadVar;
        this.c = ctf0Var;
        this.d = ioiVar;
        this.e = new pai(this, (byte) 24);
    }

    public mii0(rqt rqtVar, g8i g8iVar, i1w0 i1w0Var) {
        this.f21848a = (byte) 28;
        this.b = g8iVar;
        this.c = i1w0Var;
        byte b = 0;
        this.d = n0k0.a(new gji(this, b, b));
        this.e = new gji(this, 1, b);
    }

    public mii0(btt0 btt0Var, gii0 gii0Var, pru pruVar) {
        this.f21848a = (byte) 29;
        this.b = pruVar;
        this.c = gii0Var;
        this.d = btt0Var;
        this.e = mbl.b(new tii(this, (byte) 29));
    }

    public mii0(mne mneVar, btt0 btt0Var, gii0 gii0Var, ev7 ev7Var) {
        this.f21848a = (byte) 24;
        this.b = mneVar;
        this.c = gii0Var;
        this.d = ev7Var;
        this.e = btt0Var;
    }

    public mii0(Context context) {
        this.f21848a = (byte) 6;
        this.b = context != null ? context.getApplicationContext() : null;
        this.d = m2a.j;
        if (context == null) {
            this.e = q24.f;
        }
    }

    public mii0(chf0 chf0Var, er30 er30Var) {
        this.f21848a = (byte) 1;
        this.e = chf0Var;
        this.f21848a = (byte) 1;
        this.d = chf0Var;
        this.b = er30Var;
        this.c = new ArrayList();
    }

    public /* synthetic */ mii0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f21848a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public mii0(o5d0 o5d0Var, qcq0 qcq0Var, bby bbyVar) {
        this.f21848a = (byte) 13;
        o5d0Var.getClass();
        qcq0Var.getClass();
        bbyVar.getClass();
        this.b = o5d0Var;
        this.c = qcq0Var;
        this.d = bbyVar;
        this.e = nkb.y(new d09((Object) this, (yje) null, (byte) 12));
    }

    public mii0(esg0 esg0Var, g950 g950Var, xzp xzpVar) {
        this.f21848a = (byte) 11;
        this.c = esg0Var;
        this.d = g950Var;
        this.e = xzpVar;
        this.b = new ArrayList();
    }

    public mii0(androidx.media3.common.b bVar) {
        this.f21848a = (byte) 5;
        this.b = bVar;
        this.c = null;
        this.d = bmq0.f2849a;
        this.e = null;
    }
}
