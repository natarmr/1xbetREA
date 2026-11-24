package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class s5u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul9 f31672a;

    public s5u(ul9 ul9Var) {
        ul9Var.getClass();
        this.f31672a = ul9Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e6 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f1 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:114:0x021a A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0239 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:119:0x023e A[Catch: Exception -> 0x017c, TRY_LEAVE, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0254  */
    /* JADX WARN: Code duplicated, block: B:127:0x025d  */
    /* JADX WARN: Code duplicated, block: B:139:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01e4 A[EDGE_INSN: B:140:0x01e4->B:102:0x01e4 BREAK  A[LOOP:2: B:96:0x01c0->B:101:0x01e3, LOOP_LABEL: LOOP:2: B:96:0x01c0->B:101:0x01e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0237 A[EDGE_INSN: B:143:0x0237->B:117:0x0237 BREAK  A[LOOP:4: B:111:0x0213->B:116:0x0236, LOOP_LABEL: LOOP:4: B:111:0x0213->B:116:0x0236], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0177 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0192 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x019e A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01aa A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:77:0x015b, B:78:0x0166, B:80:0x016c, B:82:0x0177, B:86:0x017f, B:88:0x0192, B:89:0x0196, B:92:0x019e, B:103:0x01e6, B:95:0x01aa, B:97:0x01c1, B:99:0x01c7, B:107:0x01f1, B:118:0x0239, B:110:0x01fd, B:112:0x0214, B:114:0x021a, B:119:0x023e), top: B:130:0x015b }] */
    public final Object a(List list, CyberGamesPage cyberGamesPage, zje zjeVar) {
        r5u r5uVar;
        CyberGamesPage cyberGamesPage2;
        Object objA;
        Object next;
        int i;
        int iIntValue;
        ArrayList arrayList;
        Calendar calendar;
        long j;
        int i2;
        Iterator it;
        Integer numValueOf;
        Integer num;
        Iterator it2;
        Integer numValueOf2;
        Integer num2;
        int iIntValue2;
        Integer numValueOf3;
        Integer numValueOf4;
        if (zjeVar instanceof r5u) {
            r5uVar = (r5u) zjeVar;
            int i3 = r5uVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r5uVar.l = i3 - Integer.MIN_VALUE;
            } else {
                r5uVar = new r5u(this, zjeVar);
            }
        } else {
            r5uVar = new r5u(this, zjeVar);
        }
        Object obj = r5uVar.j;
        wne wneVar = wne.f39444a;
        int i4 = r5uVar.l;
        if (i4 == 0) {
            z1x.P(obj);
            cyberGamesPage2 = cyberGamesPage;
            r5uVar.i = cyberGamesPage2;
            r5uVar.l = 1;
            objA = this.f31672a.a(list, r5uVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CyberGamesPage cyberGamesPage3 = r5uVar.i;
            z1x.P(obj);
            cyberGamesPage2 = cyberGamesPage3;
            objA = obj;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) objA) {
            if (!((k4g) obj2).c.isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long j2 = ((k4g) next).b;
                do {
                    Object next2 = it3.next();
                    long j3 = ((k4g) next2).b;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        k4g k4gVar = (k4g) next;
        if (k4gVar == null) {
            return new itk(-1, -1, iun.f15405a, false);
        }
        try {
            try {
                Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                long j4 = k4gVar.b;
                List list2 = k4gVar.c;
                if (j4 != 1) {
                    if (j4 == 2) {
                        Iterator it4 = list2.iterator();
                        if (it4.hasNext()) {
                            numValueOf4 = Integer.valueOf(((d5g) it4.next()).f5503a);
                            while (it4.hasNext()) {
                                Integer numValueOf5 = Integer.valueOf(((d5g) it4.next()).f5503a);
                                if (numValueOf4.compareTo(numValueOf5) > 0) {
                                    numValueOf4 = numValueOf5;
                                }
                            }
                        } else {
                            numValueOf4 = null;
                        }
                        if (numValueOf4 != null) {
                            iIntValue2 = numValueOf4.intValue();
                        } else {
                            i = -1;
                        }
                    } else if (j4 == 3) {
                        Iterator it5 = list2.iterator();
                        if (it5.hasNext()) {
                            numValueOf3 = Integer.valueOf(((d5g) it5.next()).f5503a);
                            while (it5.hasNext()) {
                                Integer numValueOf6 = Integer.valueOf(((d5g) it5.next()).f5503a);
                                if (numValueOf3.compareTo(numValueOf6) < 0) {
                                    numValueOf3 = numValueOf6;
                                }
                            }
                        } else {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            iIntValue2 = numValueOf3.intValue();
                        } else {
                            i = -1;
                        }
                    } else {
                        iIntValue2 = calendar2.get(1);
                    }
                    List list3 = k4gVar.c;
                    arrayList = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((d5g) obj3).f5503a == i) {
                            arrayList.add(obj3);
                        }
                    }
                    calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                    j = k4gVar.b;
                    if (j == 1) {
                        if (j == 2) {
                            it2 = arrayList.iterator();
                            if (!it2.hasNext()) {
                                numValueOf2 = Integer.valueOf(((Number) CollectionsKt.l0(((d5g) it2.next()).b)).intValue());
                                loop2: while (true) {
                                    num2 = numValueOf2;
                                    do {
                                        if (it2.hasNext()) {
                                            break loop2;
                                        }
                                        numValueOf2 = Integer.valueOf(((Number) CollectionsKt.l0(((d5g) it2.next()).b)).intValue());
                                    } while (num2.compareTo(numValueOf2) <= 0);
                                }
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = -1;
                            }
                        } else if (j == 3) {
                            it = arrayList.iterator();
                            if (!it.hasNext()) {
                                numValueOf = Integer.valueOf(((Number) CollectionsKt.i0(((d5g) it.next()).b)).intValue());
                                loop4: while (true) {
                                    num = numValueOf;
                                    do {
                                        if (it.hasNext()) {
                                            break loop4;
                                        }
                                        numValueOf = Integer.valueOf(((Number) CollectionsKt.i0(((d5g) it.next()).b)).intValue());
                                    } while (num.compareTo(numValueOf) >= 0);
                                }
                            } else {
                                num = null;
                            }
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = -1;
                            }
                        } else {
                            i2 = calendar.get(2);
                        }
                        List listU = cs0.u(k4gVar.f17668a);
                        return new itk(i, iIntValue, listU, listU.isEmpty() && !Intrinsics.d(cyberGamesPage2, CyberGamesPage.OneXCyber.INSTANCE));
                    }
                    i2 = calendar.get(2);
                    iIntValue = i2 + 1;
                    List listU2 = cs0.u(k4gVar.f17668a);
                    return new itk(i, iIntValue, listU2, listU2.isEmpty() && !Intrinsics.d(cyberGamesPage2, CyberGamesPage.OneXCyber.INSTANCE));
                }
                iIntValue2 = calendar2.get(1);
                i = iIntValue2;
            } catch (Exception e) {
                e.printStackTrace();
            }
            List list4 = k4gVar.c;
            arrayList = new ArrayList();
            while (r0.hasNext()) {
                if (((d5g) obj3).f5503a == i) {
                    arrayList.add(obj3);
                }
            }
            calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
            j = k4gVar.b;
            if (j == 1) {
                if (j == 2) {
                    it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        numValueOf2 = Integer.valueOf(((Number) CollectionsKt.l0(((d5g) it2.next()).b)).intValue());
                        loop2: while (true) {
                            num2 = numValueOf2;
                            do {
                                if (it2.hasNext()) {
                                    break loop2;
                                    break loop2;
                                }
                                numValueOf2 = Integer.valueOf(((Number) CollectionsKt.l0(((d5g) it2.next()).b)).intValue());
                            } while (num2.compareTo(numValueOf2) <= 0);
                        }
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                } else if (j == 3) {
                    it = arrayList.iterator();
                    if (!it.hasNext()) {
                        numValueOf = Integer.valueOf(((Number) CollectionsKt.i0(((d5g) it.next()).b)).intValue());
                        loop4: while (true) {
                            num = numValueOf;
                            do {
                                if (it.hasNext()) {
                                    break loop4;
                                    break loop4;
                                }
                                numValueOf = Integer.valueOf(((Number) CollectionsKt.i0(((d5g) it.next()).b)).intValue());
                            } while (num.compareTo(numValueOf) >= 0);
                        }
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                } else {
                    i2 = calendar.get(2);
                }
                List listU3 = cs0.u(k4gVar.f17668a);
                return new itk(i, iIntValue, listU3, listU3.isEmpty() && !Intrinsics.d(cyberGamesPage2, CyberGamesPage.OneXCyber.INSTANCE));
            }
            i2 = calendar.get(2);
            iIntValue = i2 + 1;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        List listU4 = cs0.u(k4gVar.f17668a);
        return new itk(i, iIntValue, listU4, listU4.isEmpty() && !Intrinsics.d(cyberGamesPage2, CyberGamesPage.OneXCyber.INSTANCE));
    }
}
