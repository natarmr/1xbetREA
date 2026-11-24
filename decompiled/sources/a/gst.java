package a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class gst implements gm80, rmv {
    public gst(r9u r9uVar) {
        r9uVar.getClass();
    }

    public static w1w d(String str) {
        str.getClass();
        for (w1w w1wVar : w1w.values()) {
            w1wVar.getClass();
            if ("1".equals(str)) {
                return w1wVar;
            }
        }
        return null;
    }

    public static ArrayList e(List list, ktk0 ktk0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d0t d0tVar = (d0t) obj;
            long j = ktk0Var.b;
            if (j == -321 || d0tVar.v == j) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (f(((d0t) obj2).s).equals(ktk0Var.f18871a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static Date f(long j) {
        Date date = new Date(TimeUnit.SECONDS.toMillis(j));
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    public static krz g(String str) {
        str.getClass();
        krz krzVar = krz.b;
        if (str.equals("ACTIVE")) {
            return krzVar;
        }
        krz krzVar2 = krz.c;
        if (str.equals("PENDING")) {
            return krzVar2;
        }
        krz krzVar3 = krz.d;
        str.equals("INACTIVE");
        return krzVar3;
    }

    public static qrz h(String str) {
        str.getClass();
        qrz qrzVar = qrz.b;
        if (str.equals("ACTIVE")) {
            return qrzVar;
        }
        qrz qrzVar2 = qrz.c;
        if (str.equals("PENDING")) {
            return qrzVar2;
        }
        qrz qrzVar3 = qrz.d;
        str.equals("INACTIVE");
        return qrzVar3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170 A[DONT_INVERT, PHI: r11
  0x0170: PHI (r11v7 a.ar20) = (r11v6 a.ar20), (r11v9 a.ar20), (r11v10 a.ar20) binds: [B:70:0x015d, B:73:0x0166, B:77:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a9  */
    public static vr00 i(wvq0 wvq0Var, qb00 qb00Var) {
        wvq0 wvq0VarA;
        vr00 vr00Var;
        wvq0 wvq0VarA2;
        vr00 vr00Var2;
        vr00 vr00VarM;
        Collection collection;
        Collection collection2;
        wvq0 wvq0VarA3;
        ar20 ar20Var = wb.A;
        ar20 ar20Var2 = cy2.I;
        ar20 ar20Var3 = cy2.D;
        ar20 ar20Var4 = cy2.E;
        ar20 ar20Var5 = cy2.M;
        wvq0Var.getClass();
        int i = wvq0Var.f39851a;
        int i2 = 0;
        if (qb00Var != null) {
            wvq0VarA = qb00Var.a(wvq0Var, qb00Var.b, 0);
        } else {
            vr00 vr00VarM2 = gfx.M(wvq0Var);
            wvq0VarA = vr00VarM2 != null ? vr00VarM2.f37876a : null;
        }
        if (wvq0VarA != null && Intrinsics.d(wvq0VarA.g(), ar20Var3)) {
            wvq0 wvq0VarA4 = wvq0VarA.a().a();
            if (Intrinsics.d(wvq0VarA4.e(), ar20Var5)) {
                wvq0VarA4 = wvq0VarA4.a();
            }
            if (Intrinsics.d(wvq0VarA4.e(), ar20Var5) || Intrinsics.d(wvq0VarA4.e(), ar20Var4)) {
                vr00Var = null;
            } else {
                int i3 = wvq0VarA4.f39851a;
                boolean zD = Intrinsics.d(wvq0VarA4.e(), cy2.H);
                if (qb00Var != null) {
                    if (zD) {
                        ar20Var2.getClass();
                        wvq0VarA3 = qb00Var.a(wvq0VarA4, (int[]) ((a8z) xp20.d(qb00Var.d, ar20Var2)).getValue(), 1);
                    } else {
                        wvq0VarA3 = qb00Var.a(wvq0VarA4, (int[]) qb00Var.c.getValue(), 0);
                    }
                    if (wvq0VarA3 == null) {
                        vr00Var = null;
                    } else {
                        List listC = kotlin.collections.a.c(new sgi0(new IntRange(i3, wvq0VarA3.f39851a + 1, 1), ar20Var));
                        listC.getClass();
                        vr00Var = new vr00(wvq0VarA3, listC, iun.f15405a);
                    }
                } else {
                    wvq0 wvq0VarA5 = zD ? wvq0VarA4.a() : wvq0VarA4;
                    while (wvq0VarA5.e() != null && (!zD || !Intrinsics.d(wvq0VarA5.e(), ar20Var2))) {
                        if (!zD) {
                            if (Intrinsics.d(wvq0VarA5.e(), ar20Var3)) {
                                i2++;
                            }
                            ar20 ar20VarG = wvq0VarA5.g();
                            char cB = wvq0VarA5.b(1);
                            if (cB == 0 || Character.isSpaceChar(cB) || CharsKt.d(cB) || ar20VarG == null) {
                                break;
                            }
                            if (!ar20VarG.equals(ar20Var4)) {
                                continue;
                            } else {
                                if (i2 == 0) {
                                    break;
                                }
                                i2--;
                            }
                        }
                        wvq0VarA5 = wvq0VarA5.a();
                    }
                    if (wvq0VarA5.e() == null || i2 != 0) {
                        vr00Var = null;
                    } else {
                        List listC2 = kotlin.collections.a.c(new sgi0(new IntRange(i3, wvq0VarA5.f39851a + 1, 1), ar20Var));
                        listC2.getClass();
                        vr00Var = new vr00(wvq0VarA5, listC2, iun.f15405a);
                    }
                }
            }
            if (vr00Var != null) {
                wvq0VarA4 = vr00Var.f37876a.a();
                if (Intrinsics.d(wvq0VarA4.e(), ar20Var5)) {
                    wvq0VarA4 = wvq0VarA4.a();
                }
            }
            if (Intrinsics.d(wvq0VarA4.e(), ar20Var5)) {
                vr00Var2 = null;
            } else {
                int i4 = wvq0VarA4.f39851a;
                ar20 ar20VarE = wvq0VarA4.e();
                ar20 ar20Var6 = cy2.B;
                if (Intrinsics.d(ar20VarE, ar20Var6)) {
                    if (qb00Var != null) {
                        ar20Var6.getClass();
                        wvq0VarA2 = qb00Var.a(wvq0VarA4, (int[]) ((a8z) xp20.d(qb00Var.d, ar20Var6)).getValue(), 1);
                        if (wvq0VarA2 == null) {
                            vr00Var2 = null;
                        }
                    } else {
                        wvq0VarA2 = wvq0VarA4.a();
                        while (wvq0VarA2.e() != null && !Intrinsics.d(wvq0VarA2.e(), ar20Var6)) {
                            wvq0VarA2 = wvq0VarA2.a();
                        }
                    }
                    if (wvq0VarA2.e() != null) {
                        List listC3 = kotlin.collections.a.c(new sgi0(new IntRange(i4, wvq0VarA2.f39851a + 1, 1), wb.B));
                        listC3.getClass();
                        vr00Var2 = new vr00(wvq0VarA2, listC3, iun.f15405a);
                    } else {
                        vr00Var2 = null;
                    }
                } else {
                    ar20Var6 = cy2.C;
                    if (Intrinsics.d(ar20VarE, ar20Var6)) {
                        if (qb00Var != null) {
                            ar20Var6.getClass();
                            wvq0VarA2 = qb00Var.a(wvq0VarA4, (int[]) ((a8z) xp20.d(qb00Var.d, ar20Var6)).getValue(), 1);
                            if (wvq0VarA2 == null) {
                                vr00Var2 = null;
                            }
                        } else {
                            wvq0VarA2 = wvq0VarA4.a();
                            while (wvq0VarA2.e() != null) {
                                wvq0VarA2 = wvq0VarA2.a();
                            }
                        }
                        if (wvq0VarA2.e() != null) {
                            List listC4 = kotlin.collections.a.c(new sgi0(new IntRange(i4, wvq0VarA2.f39851a + 1, 1), wb.B));
                            listC4.getClass();
                            vr00Var2 = new vr00(wvq0VarA2, listC4, iun.f15405a);
                        } else {
                            vr00Var2 = null;
                        }
                    } else if (Intrinsics.d(ar20VarE, ar20Var3)) {
                        ar20Var6 = ar20Var4;
                        if (qb00Var != null) {
                            ar20Var6.getClass();
                            wvq0VarA2 = qb00Var.a(wvq0VarA4, (int[]) ((a8z) xp20.d(qb00Var.d, ar20Var6)).getValue(), 1);
                            if (wvq0VarA2 == null) {
                                vr00Var2 = null;
                            }
                        } else {
                            wvq0VarA2 = wvq0VarA4.a();
                            while (wvq0VarA2.e() != null) {
                                wvq0VarA2 = wvq0VarA2.a();
                            }
                        }
                        if (wvq0VarA2.e() != null) {
                            List listC5 = kotlin.collections.a.c(new sgi0(new IntRange(i4, wvq0VarA2.f39851a + 1, 1), wb.B));
                            listC5.getClass();
                            vr00Var2 = new vr00(wvq0VarA2, listC5, iun.f15405a);
                        } else {
                            vr00Var2 = null;
                        }
                    } else {
                        vr00Var2 = null;
                    }
                }
            }
            if (vr00Var2 != null) {
                wvq0VarA4 = vr00Var2.f37876a.a();
                if (Intrinsics.d(wvq0VarA4.e(), ar20Var5)) {
                    wvq0VarA4 = wvq0VarA4.a();
                }
            }
            if (Intrinsics.d(wvq0VarA4.e(), ar20Var4) && (vr00VarM = gfx.M(wvq0Var)) != null) {
                return new vr00(wvq0VarA4, CollectionsKt.r0(CollectionsKt.q0(CollectionsKt.q0(vr00VarM.b, (vr00Var == null || (collection2 = vr00Var.b) == null) ? iun.f15405a : collection2), (vr00Var2 == null || (collection = vr00Var2.b) == null) ? iun.f15405a : collection), new sgi0(new IntRange(i, wvq0VarA4.f39851a + 1, 1), wb.D)), vr00VarM.c);
            }
        }
        return null;
    }

    @Override // a.rmv
    public boolean a() {
        boolean z;
        synchronized (fzp.f10418a) {
            try {
                int i = fzp.c;
                fzp.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > fzp.d + 30000) {
                    fzp.c = 0;
                    fzp.d = SystemClock.uptimeMillis();
                    String[] list = fzp.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    fzp.e = list.length < 800;
                }
                z = fzp.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // a.gm80
    public fm80 b(List list) {
        String strD;
        list.getClass();
        Object objF0 = CollectionsKt.f0(list);
        Long lT0 = null;
        a5w a5wVar = objF0 instanceof a5w ? (a5w) objF0 : null;
        if (a5wVar != null && (strD = a5wVar.d()) != null) {
            lT0 = StringsKt.t0(strD);
        }
        return new v1z(lT0);
    }

    @Override // a.rmv
    public boolean c(f7k0 f7k0Var) {
        umk umkVar = f7k0Var.f9062a;
        if ((umkVar instanceof rmk ? ((rmk) umkVar).f30747a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        umk umkVar2 = f7k0Var.b;
        return (umkVar2 instanceof rmk ? ((rmk) umkVar2).f30747a : Integer.MAX_VALUE) > 100;
    }

    public /* synthetic */ gst(Object obj) {
    }
}
