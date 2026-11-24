package a;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.message.Response;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w9x {
    /* JADX WARN: Code duplicated, block: B:113:0x031c  */
    /* JADX WARN: Code duplicated, block: B:220:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e7  */
    public static final l250 A(List list, Set set, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, boolean z4, pt0 pt0Var, ypl yplVar, lq5 lq5Var) {
        Iterator it;
        Iterable iterableA;
        Object obj;
        List list2;
        int i;
        char c;
        Object objPrevious;
        i0i i0iVar;
        int i2;
        char c2;
        int i3;
        int i4;
        char c3;
        char c4;
        String str;
        int i5;
        int i6;
        int i7;
        char c5;
        char c6;
        int i8;
        int i9;
        char c7;
        ozh ozhVarM;
        lq5 lq5Var2 = lq5Var;
        set.getClass();
        ctf0Var.getClass();
        pt0Var.getClass();
        yplVar.getClass();
        lq5Var2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jge jgeVar = (jge) it2.next();
            jgeVar.getClass();
            if (jgeVar instanceof yfe) {
                yfe yfeVar = (yfe) jgeVar;
                ha8 ha8Var = yfeVar.f42537a;
                iterableA = ((ha8Var instanceof x98) || (ha8Var instanceof ca8) || (ha8Var instanceof ea8)) ? kotlin.collections.a.c(new x150(yfeVar.getKey())) : iun.f15405a;
            } else {
                if (jgeVar instanceof zfe) {
                    zfe zfeVar = (zfe) jgeVar;
                    ha8 ha8Var2 = zfeVar.f44298a;
                    if ((ha8Var2 instanceof x98) || (ha8Var2 instanceof ca8) || (ha8Var2 instanceof ea8)) {
                        iterableA = kotlin.collections.a.c(new y150(zfeVar.getKey(), mzh.f22655a));
                    } else if (!(ha8Var2 instanceof da8) || (ozhVarM = fxb.M((d3j) ((da8) ha8Var2).b, ctf0Var)) == null || (iterableA = kotlin.collections.a.c(new y150(zfeVar.getKey(), ozhVarM))) == null) {
                        iterableA = iun.f15405a;
                    }
                } else {
                    boolean z5 = jgeVar instanceof age;
                    p0s n0sVar = o0s.f24443a;
                    if (z5) {
                        age ageVar = (age) jgeVar;
                        List list3 = o250.f24516a;
                        ha8 ha8Var3 = ageVar.f819a;
                        if (((xi0) ha8Var3.a()).g != pc0.VERTICAL) {
                            it = it2;
                            if ((ha8Var3 instanceof x98) || (ha8Var3 instanceof ca8) || (ha8Var3 instanceof ea8)) {
                                lc00 lc00VarB = kotlin.collections.a.b();
                                if (!(((xi0) ha8Var3.a()).b instanceof qi0)) {
                                    lc00VarB.add(new z150(ohs0.n(ageVar.getKey(), "_HEADER"), new ijm()));
                                }
                                lc00VarB.add(new a250(ageVar.getKey(), new aml(pt0Var, new wll(n0sVar), true)));
                                iterableA = kotlin.collections.a.a(lc00VarB);
                            } else if (ha8Var3 instanceof da8) {
                                da8 da8Var = (da8) ha8Var3;
                                Object obj2 = da8Var.b;
                                Object obj3 = da8Var.f5734a;
                                if (((Collection) obj2).isEmpty()) {
                                    iterableA = iun.f15405a;
                                } else {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    xi0 xi0Var = (xi0) obj3;
                                    ti0 ti0Var = xi0Var.b;
                                    int i10 = xi0Var.d;
                                    if (!(ti0Var instanceof qi0)) {
                                        lc00VarB2.add(new z150(ohs0.n(ageVar.getKey(), "_HEADER"), new hjm(ucx.Y(xi0Var.b, ctf0Var), null, null, null, null, null, false, null, null, false, o250.a(xi0Var, ctf0Var), null, 7166)));
                                    }
                                    String key = ageVar.getKey();
                                    boolean z6 = xi0Var.f;
                                    if ((!z6 || i10 >= 8) && z6) {
                                        n0sVar = new n0s(i10);
                                    }
                                    wll wllVar = new wll(n0sVar);
                                    List<mlr> listD0 = CollectionsKt.D0((Iterable) obj2, i10);
                                    ArrayList arrayList2 = new ArrayList(r3d.q(listD0, 10));
                                    for (mlr mlrVar : listD0) {
                                        arrayList2.add(ccq0.Z(mlrVar, ctf0Var, z, z2, set.contains(Long.valueOf(mlrVar.f22006a)), pt0Var, xi0Var.c));
                                        wllVar = wllVar;
                                        xi0Var = xi0Var;
                                    }
                                    lc00VarB2.add(new a250(key, new zll(pt0Var, wllVar, arrayList2)));
                                    iterableA = kotlin.collections.a.a(lc00VarB2);
                                }
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if ((ha8Var3 instanceof x98) || (ha8Var3 instanceof ca8) || (ha8Var3 instanceof ea8)) {
                            it = it2;
                            lc00 lc00VarB3 = kotlin.collections.a.b();
                            if (!(((xi0) ha8Var3.a()).b instanceof qi0)) {
                                lc00VarB3.add(new z150(ohs0.n(ageVar.getKey(), "_HEADER"), new ijm()));
                            }
                            String key2 = ageVar.getKey();
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            for (int i11 = 0; i11 < 13; i11++) {
                                lc00VarB4.add(fzh.f10407a);
                            }
                            lc00VarB3.add(new j250(dyb.r0(kotlin.collections.a.a(lc00VarB4)), key2));
                            iterableA = kotlin.collections.a.a(lc00VarB3);
                        } else if (ha8Var3 instanceof da8) {
                            da8 da8Var2 = (da8) ha8Var3;
                            Object obj4 = da8Var2.b;
                            Object obj5 = da8Var2.f5734a;
                            if (((Collection) obj4).isEmpty()) {
                                it = it2;
                                iterableA = iun.f15405a;
                            } else {
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                xi0 xi0Var2 = (xi0) obj5;
                                if (!(xi0Var2.b instanceof qi0)) {
                                    lc00VarB5.add(new z150(ohs0.n(ageVar.getKey(), "_HEADER"), new hjm(ucx.Y(xi0Var2.b, ctf0Var), null, null, null, null, null, false, null, null, false, o250.a(xi0Var2, ctf0Var), null, 7166)));
                                }
                                String key3 = ageVar.getKey();
                                Iterable iterable = (Iterable) obj4;
                                ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    mlr mlrVar2 = (mlr) it3.next();
                                    long j = mlrVar2.f22006a;
                                    String str2 = mlrVar2.e;
                                    Iterator it4 = it3;
                                    Iterator it5 = it2;
                                    StringBuilder sb = new StringBuilder(ujn.h);
                                    String str3 = mlrVar2.h;
                                    str3.getClass();
                                    if (str3.length() == 0) {
                                        sb.setLength(0);
                                    } else {
                                        if (StringsKt.O(str3, ujn.h, false)) {
                                            i8 = 0;
                                        } else if (kotlin.text.c.x(str3, "https://", false)) {
                                            i8 = 0;
                                        } else {
                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i9 = 1;
                                                c7 = '/';
                                            } else {
                                                sb.append('/');
                                                c7 = '/';
                                                i9 = 1;
                                            }
                                            char[] cArr = new char[i9];
                                            cArr[0] = c7;
                                            sb.append(StringsKt.y0(str3, cArr));
                                        }
                                        sb.setLength(i8);
                                        sb.append(str3);
                                    }
                                    arrayList3.add(new ezh(j, str2, new n0x(sb.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6)));
                                    it3 = it4;
                                    it2 = it5;
                                }
                                it = it2;
                                lc00VarB5.add(new j250(dyb.r0(arrayList3), key3));
                                iterableA = kotlin.collections.a.a(lc00VarB5);
                            }
                        } else {
                            it = it2;
                            iterableA = iun.f15405a;
                        }
                    } else {
                        it = it2;
                        boolean z7 = jgeVar instanceof bge;
                        gkl gklVar = gkl.f11450a;
                        if (z7) {
                            bge bgeVar = (bge) jgeVar;
                            ha8 ha8Var4 = bgeVar.f2550a;
                            if ((ha8Var4 instanceof x98) || (ha8Var4 instanceof ca8) || (ha8Var4 instanceof ea8)) {
                                iterableA = kotlin.collections.a.c(new b250(bgeVar.getKey(), gklVar));
                            } else if (ha8Var4 instanceof da8) {
                                String key4 = bgeVar.getKey();
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int i12 = 0;
                                if (StringsKt.O("/static/img/android/casino/jackpot/jackpot_banner.webp", ujn.h, false)) {
                                    sb2.setLength(i12);
                                    sb2.append("/static/img/android/casino/jackpot/jackpot_banner.webp");
                                } else if (kotlin.text.c.x("/static/img/android/casino/jackpot/jackpot_banner.webp", "https://", false)) {
                                    i12 = 0;
                                    sb2.setLength(i12);
                                    sb2.append("/static/img/android/casino/jackpot/jackpot_banner.webp");
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c6 = '/';
                                    } else {
                                        c6 = '/';
                                        sb2.append('/');
                                    }
                                    i12 = 0;
                                    sb2.append(StringsKt.y0("/static/img/android/casino/jackpot/jackpot_banner.webp", c6));
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                String str4 = ((g8y) ((da8) ha8Var4).b).f10886a;
                                String strA = ctf0Var.b.a(R.string.JACKPOT, Arrays.copyOf(new Object[i12], i12));
                                ekl eklVar = ekl.f7957a;
                                pz40 pz40Var = s6t0.f31722a;
                                iterableA = kotlin.collections.a.c(new b250(key4, new fkl(hi0.h, n0xVar, null, str4, strA, dyb.g0(dkl.b, dkl.f6236a, dkl.c), 128)));
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if (jgeVar instanceof cge) {
                            iterableA = x9x.X((cge) jgeVar, z3, z4, ctf0Var);
                        } else if (jgeVar instanceof dge) {
                            dge dgeVar = (dge) jgeVar;
                            ha8 ha8Var5 = dgeVar.f6037a;
                            if ((ha8Var5 instanceof x98) || (ha8Var5 instanceof ca8) || (ha8Var5 instanceof ea8)) {
                                lc00 lc00VarB6 = kotlin.collections.a.b();
                                if (!(((aj0) ha8Var5.a()).b instanceof qi0)) {
                                    lc00VarB6.add(new z150(ohs0.n(dgeVar.getKey(), "_HEADER"), new ijm()));
                                }
                                lc00VarB6.add(new e250(dgeVar.getKey(), new szc0(lq5Var2)));
                                iterableA = kotlin.collections.a.a(lc00VarB6);
                            } else if (ha8Var5 instanceof da8) {
                                da8 da8Var3 = (da8) ha8Var5;
                                Object obj6 = da8Var3.f5734a;
                                Object obj7 = da8Var3.b;
                                if (((Collection) obj7).isEmpty()) {
                                    iterableA = iun.f15405a;
                                } else {
                                    lc00 lc00VarB7 = kotlin.collections.a.b();
                                    aj0 aj0Var = (aj0) obj6;
                                    if (aj0Var.b instanceof qi0) {
                                        dgeVar = dgeVar;
                                    } else {
                                        lc00VarB7.add(new z150(ohs0.n(dgeVar.getKey(), "_HEADER"), new hjm(ucx.Y(aj0Var.b, ctf0Var), null, null, null, null, null, false, null, null, false, z4 != 0 ? new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))) : null, null, 7166)));
                                    }
                                    String key5 = dgeVar.getKey();
                                    Iterable iterable2 = (Iterable) obj7;
                                    ArrayList arrayList4 = new ArrayList(r3d.q(iterable2, 10));
                                    Iterator it6 = iterable2.iterator();
                                    while (it6.hasNext()) {
                                        lr5 lr5Var = (lr5) it6.next();
                                        int i13 = lr5Var.f20512a;
                                        Iterator it7 = it6;
                                        StringBuilder sb3 = new StringBuilder(ujn.h);
                                        if (lq5Var2.equals(gq5.f11714a) || lq5Var2.equals(fq5.f9956a)) {
                                            str = lr5Var.c;
                                        } else if (lq5Var2.equals(hq5.f13470a) || lq5Var2.equals(iq5.f15191a) || lq5Var2.equals(kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                            str = lr5Var.b;
                                        } else {
                                            if (!lq5Var2.equals(dq5.f6497a) && !lq5Var2.equals(eq5.f8219a) && !lq5Var2.equals(cq5.f4775a)) {
                                                t9f.b();
                                                return null;
                                            }
                                            str = lr5Var.d;
                                        }
                                        str.getClass();
                                        if (str.length() == 0) {
                                            sb3.setLength(0);
                                            i5 = i13;
                                        } else {
                                            i5 = i13;
                                            if (StringsKt.O(str, ujn.h, false)) {
                                                i6 = 0;
                                            } else if (kotlin.text.c.x(str, "https://", false)) {
                                                i6 = 0;
                                            } else {
                                                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                                    i7 = 1;
                                                    c5 = '/';
                                                } else {
                                                    sb3.append('/');
                                                    c5 = '/';
                                                    i7 = 1;
                                                }
                                                char[] cArr2 = new char[i7];
                                                cArr2[0] = c5;
                                                sb3.append(StringsKt.y0(str, cArr2));
                                            }
                                            sb3.setLength(i6);
                                            sb3.append(str);
                                        }
                                        arrayList4.add(new fr5(i5, new n0x(sb3.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                                        it6 = it7;
                                    }
                                    lc00VarB7.add(new e250(key5, new rzc0(lq5Var2, dyb.r0(arrayList4))));
                                    iterableA = kotlin.collections.a.a(lc00VarB7);
                                }
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if (jgeVar instanceof ege) {
                            ege egeVar = (ege) jgeVar;
                            ha8 ha8Var6 = egeVar.f7760a;
                            if ((ha8Var6 instanceof x98) || (ha8Var6 instanceof ca8) || (ha8Var6 instanceof ea8)) {
                                iterableA = kotlin.collections.a.c(new f250(egeVar.getKey(), gklVar));
                            } else if (ha8Var6 instanceof da8) {
                                String key6 = egeVar.getKey();
                                pz40 pz40Var2 = s6t0.f31722a;
                                long j2 = hi0.T;
                                StringBuilder sb4 = new StringBuilder(ujn.h);
                                int i14 = 0;
                                if (StringsKt.O("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", ujn.h, false)) {
                                    sb4.setLength(i14);
                                    sb4.append("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp");
                                } else if (kotlin.text.c.x("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", "https://", false)) {
                                    i14 = 0;
                                    sb4.setLength(i14);
                                    sb4.append("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp");
                                } else {
                                    if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                        c4 = '/';
                                    } else {
                                        c4 = '/';
                                        sb4.append('/');
                                    }
                                    i14 = 0;
                                    sb4.append(StringsKt.y0("/static/img/android/casino/my_casino/Banner_Registration_Bonus.webp", c4));
                                }
                                n0x n0xVar2 = new n0x(sb4.toString());
                                String strA2 = ctf0Var.b.a(R.string.my_aggregator_bonus_banner_label, Arrays.copyOf(new Object[i14], i14));
                                BonusInfoModel bonusInfoModel = (BonusInfoModel) ((da8) ha8Var6).b;
                                iterableA = kotlin.collections.a.c(new f250(key6, new fkl(j2, n0xVar2, strA2, bonusInfoModel.b, bonusInfoModel.c, null, Response.UNSUPPORTED_URI_SCHEME)));
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if (jgeVar instanceof fge) {
                            fge fgeVar = (fge) jgeVar;
                            ha8 ha8Var7 = fgeVar.f9487a;
                            if ((ha8Var7 instanceof x98) || (ha8Var7 instanceof ca8) || (ha8Var7 instanceof ea8)) {
                                iterableA = kotlin.collections.a.c(new g250(fgeVar.getKey(), rzh.f31360a));
                            } else if (ha8Var7 instanceof da8) {
                                Integer numValueOf = Integer.valueOf(R.string.aggregator_spinner_auth_subtitle);
                                if (!z) {
                                    numValueOf = null;
                                }
                                int iIntValue = numValueOf != null ? numValueOf.intValue() : R.string.aggregator_spinner_subtitle;
                                lsm0 lsm0Var = ctf0Var.b;
                                String strA3 = lsm0Var.a(iIntValue, Arrays.copyOf(new Object[0], 0));
                                String key7 = fgeVar.getKey();
                                String strA4 = lsm0Var.a(R.string.aggregator_spinner_title, Arrays.copyOf(new Object[0], 0));
                                if (ctf0Var.j()) {
                                    strA3 = kotlin.text.c.r(strA3, Separators.RETURN, Separators.SP, false);
                                }
                                String strA5 = lsm0Var.a(R.string.app_win_rotate_text, Arrays.copyOf(new Object[0], 0));
                                Iterable iterable3 = (Iterable) ((da8) ha8Var7).b;
                                ArrayList arrayList5 = new ArrayList(r3d.q(iterable3, 10));
                                Iterator it8 = iterable3.iterator();
                                while (it8.hasNext()) {
                                    mlr mlrVar3 = (mlr) it8.next();
                                    long j3 = mlrVar3.f22006a;
                                    Iterator it9 = it8;
                                    String str5 = mlrVar3.e;
                                    StringBuilder sb5 = new StringBuilder(ujn.h);
                                    String str6 = mlrVar3.h;
                                    str6.getClass();
                                    if (str6.length() == 0) {
                                        sb5.setLength(0);
                                    } else {
                                        if (StringsKt.O(str6, ujn.h, false)) {
                                            i3 = 0;
                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                            i3 = 0;
                                        } else {
                                            if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                                i4 = 1;
                                                c3 = '/';
                                            } else {
                                                sb5.append('/');
                                                c3 = '/';
                                                i4 = 1;
                                            }
                                            char[] cArr3 = new char[i4];
                                            cArr3[0] = c3;
                                            sb5.append(StringsKt.y0(str6, cArr3));
                                        }
                                        sb5.setLength(i3);
                                        sb5.append(str6);
                                    }
                                    arrayList5.add(new ezh(j3, str5, new n0x(sb5.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6)));
                                    it8 = it9;
                                }
                                iterableA = kotlin.collections.a.c(new g250(key7, new qzh(strA4, strA3, strA5, dyb.r0(arrayList5))));
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if (jgeVar instanceof gge) {
                            gge ggeVar = (gge) jgeVar;
                            ha8 ha8Var8 = ggeVar.f11249a;
                            if ((ha8Var8 instanceof x98) || (ha8Var8 instanceof ca8) || (ha8Var8 instanceof ea8)) {
                                lc00 lc00VarB8 = kotlin.collections.a.b();
                                if (!(((dj0) ha8Var8.a()).b instanceof qi0)) {
                                    lc00VarB8.add(new z150(ohs0.n(ggeVar.getKey(), "_HEADER"), new ijm()));
                                }
                                lc00VarB8.add(new h250(ggeVar.getKey(), g0i.f10460a));
                                iterableA = kotlin.collections.a.a(lc00VarB8);
                            } else if (ha8Var8 instanceof da8) {
                                da8 da8Var4 = (da8) ha8Var8;
                                Object obj8 = da8Var4.b;
                                List list4 = (List) obj8;
                                myr0 myr0Var = (myr0) CollectionsKt.firstOrNull(list4);
                                if (myr0Var != null) {
                                    z150 z150Var = new z150(ohs0.n(ggeVar.getKey(), "_HEADER"), new hjm(ucx.Y(((dj0) da8Var4.f5734a).b, ctf0Var), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166));
                                    String key8 = ggeVar.getKey();
                                    long j4 = myr0Var.f22617a;
                                    String strL = kcx.L(myr0Var);
                                    String strK = kcx.K(myr0Var);
                                    StringBuilder sb6 = new StringBuilder(ujn.h);
                                    String str7 = myr0Var.e.b;
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    if (str7.length() == 0) {
                                        obj = obj8;
                                        sb6.setLength(0);
                                        list2 = list4;
                                    } else {
                                        obj = obj8;
                                        list2 = list4;
                                        int i15 = 0;
                                        if (StringsKt.O(str7, ujn.h, false)) {
                                            sb6.setLength(i15);
                                            sb6.append(str7);
                                        } else if (kotlin.text.c.x(str7, "https://", false)) {
                                            i15 = 0;
                                            sb6.setLength(i15);
                                            sb6.append(str7);
                                        } else {
                                            if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                                i = 1;
                                                c = '/';
                                            } else {
                                                sb6.append('/');
                                                c = '/';
                                                i = 1;
                                            }
                                            char[] cArr4 = new char[i];
                                            cArr4[0] = c;
                                            sb6.append(StringsKt.y0(str7, cArr4));
                                        }
                                    }
                                    i0i i0iVar2 = new i0i(j4, strL, strK, new n0x(sb6.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6));
                                    List listD1 = CollectionsKt.D0((Iterable) obj, 2);
                                    ListIterator listIterator = listD1.listIterator(listD1.size());
                                    do {
                                        if (!listIterator.hasPrevious()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = listIterator.previous();
                                    } while (list2.size() < 2);
                                    myr0 myr0Var2 = (myr0) objPrevious;
                                    if (myr0Var2 != null) {
                                        long j5 = myr0Var2.f22617a;
                                        String strL2 = kcx.L(myr0Var2);
                                        String strK2 = kcx.K(myr0Var2);
                                        StringBuilder sb7 = new StringBuilder(ujn.h);
                                        String str8 = myr0Var2.e.b;
                                        String str9 = str8 != null ? str8 : "";
                                        if (str9.length() == 0) {
                                            sb7.setLength(0);
                                        } else {
                                            if (StringsKt.O(str9, ujn.h, false)) {
                                                i2 = 0;
                                            } else if (kotlin.text.c.x(str9, "https://", false)) {
                                                i2 = 0;
                                            } else {
                                                if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                                                    c2 = '/';
                                                } else {
                                                    c2 = '/';
                                                    sb7.append('/');
                                                }
                                                sb7.append(StringsKt.y0(str9, c2));
                                            }
                                            sb7.setLength(i2);
                                            sb7.append(str9);
                                        }
                                        i0iVar = new i0i(j5, strL2, strK2, new n0x(sb7.toString()), new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6));
                                    } else {
                                        i0iVar = null;
                                    }
                                    iterableA = q3d.j(z150Var, new h250(key8, new f0i(i0iVar2, i0iVar)));
                                    if (iterableA == null) {
                                        iterableA = iun.f15405a;
                                    }
                                } else {
                                    iterableA = iun.f15405a;
                                }
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else if (jgeVar instanceof hge) {
                            ha8 ha8Var9 = ((hge) jgeVar).f13014a;
                            if ((ha8Var9 instanceof x98) || (ha8Var9 instanceof ca8) || (ha8Var9 instanceof ea8)) {
                                lc00 lc00VarB9 = kotlin.collections.a.b();
                                lc00VarB9.add(new i250(ha8Var9.getKey(), yplVar, aql.f1301a));
                                iterableA = kotlin.collections.a.a(lc00VarB9);
                            } else if (ha8Var9 instanceof da8) {
                                da8 da8Var5 = (da8) ha8Var9;
                                String key9 = da8Var5.getKey();
                                String strY = ucx.Y(((ej0) da8Var5.f5734a).b, ctf0Var);
                                String strA6 = ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                                Iterable<myr0> iterable4 = (Iterable) da8Var5.b;
                                ArrayList arrayList6 = new ArrayList(r3d.q(iterable4, 10));
                                for (myr0 myr0Var3 : iterable4) {
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    arrayList6.add(d5c.V(myr0Var3, yplVar, ctf0Var, locale));
                                }
                                iterableA = kotlin.collections.a.c(new i250(key9, yplVar, new zpl(dyb.r0(arrayList6), strY, strA6)));
                            } else {
                                iterableA = iun.f15405a;
                            }
                        } else {
                            if (!(jgeVar instanceof ige)) {
                                t9f.b();
                                return null;
                            }
                            ha8 ha8Var10 = ((ige) jgeVar).f14731a;
                            if ((ha8Var10 instanceof x98) || (ha8Var10 instanceof ca8) || (ha8Var10 instanceof ea8)) {
                                lc00 lc00VarB10 = kotlin.collections.a.b();
                                for (int i16 = 0; i16 < 5; i16++) {
                                    String str10 = ha8Var10.getKey() + BundleUtil.UNDERLINE_TAG + i16;
                                    lc00VarB10.add(new z150(str10.concat("_HEADER"), new ijm()));
                                    lc00VarB10.add(new a250(str10.concat("_HEADER"), new aml(pt0Var, new wll(n0sVar), true)));
                                }
                                iterableA = kotlin.collections.a.a(lc00VarB10);
                            } else {
                                iterableA = iun.f15405a;
                            }
                        }
                    }
                }
                w3d.u(arrayList, iterableA);
                lq5Var2 = lq5Var;
                it2 = it;
            }
            it = it2;
            w3d.u(arrayList, iterableA);
            lq5Var2 = lq5Var;
            it2 = it;
        }
        return new l250(dyb.r0(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lc00 B(pry pryVar, List list, fqy fqyVar, List list2, nzs0 nzs0Var, boolean z) {
        list.getClass();
        list2.getClass();
        nzs0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (z) {
            Object objK = pryVar.K();
            if (objK instanceof xgy) {
                if (fre0.X(pryVar)) {
                    if (((xgy) objK).i()) {
                        Class<?> declaringClass = azw.G((sgy) objK).getDeclaringClass();
                        declaringClass.getClass();
                        lc00VarB.add(new ajx(pryVar, sre0.f32672a.b(declaringClass)));
                    }
                } else if (!(pryVar instanceof osy) || !xvw.R((ire0) pryVar)) {
                    StringBuilder sb = new StringBuilder("Only top-level callables are supported for now: ");
                    sb.append(objK);
                    String name = pryVar.getName();
                    sb.append('/');
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lc00VarB.add(new csy(pryVar, (jqy) it.next(), lc00VarB.b(), aiy.b, nzs0Var));
            }
            if (fqyVar != null) {
                String strB = lxk0.d.b();
                strB.getClass();
                jqy jqyVar = new jqy(0, strB);
                jqyVar.c = fqyVar;
                lc00VarB.add(new csy(pryVar, jqyVar, lc00VarB.b(), aiy.c, nzs0Var));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            lc00VarB.add(new csy(pryVar, (jqy) it2.next(), lc00VarB.b(), aiy.d, nzs0Var));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final dem C(l2g0 l2g0Var, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        List list = l2g0Var.y;
        if (list.isEmpty()) {
            return null;
        }
        return new dem(l2g0Var.f19307a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), ahb.U(list), z);
    }

    public static final fem D(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new fem(ahb.U(list));
    }

    public static final gem E(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new gem(ahb.U(list));
    }

    public static final String F(ssh0 ssh0Var) {
        ssh0Var.getClass();
        int iOrdinal = ssh0Var.ordinal();
        if (iOrdinal == 0) {
            return "phone";
        }
        if (iOrdinal == 1) {
            return ParameterNames.PASSWORD;
        }
        if (iOrdinal == 2) {
            return "question";
        }
        if (iOrdinal == 3) {
            return "2f_auth";
        }
        if (iOrdinal == 4) {
            return "pers_data";
        }
        if (iOrdinal == 5) {
            return "email_auth";
        }
        t9f.b();
        return null;
    }

    public static final String G(String str, boolean z) {
        String str2 = z ? "tablet" : "mob";
        StringBuilder sb = new StringBuilder(ujn.h);
        String strK = b1j.k("/static/img/ImgDefault/Esports/Valorant/Last/", str2, Separators.SLASH, str, ".png");
        if (strK.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strK, ujn.h, false) || kotlin.text.c.x(strK, "https://", false)) {
            sb.setLength(0);
            sb.append(strK);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strK, '/'));
        }
        return sb.toString();
    }

    public static final fem H(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new fem(ahb.U(list));
    }

    public static final eem I(l2g0 l2g0Var, boolean z) {
        List list = l2g0Var.y;
        if (list.isEmpty() || !z) {
            return null;
        }
        return new eem(ahb.U(list));
    }

    public static void J(final Context context) {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (x9x.R(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.forResult(null);
            return;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new Runnable() { // from class: a.b6d0
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor editorEdit = x9x.R(context2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    taskCompletionSource2.trySetResult(null);
                }
            }
        }.run();
        taskCompletionSource.getTask();
    }

    public static final xiu0 K(riu0 riu0Var, fet fetVar, int i) {
        if ((i & 1) != 0 && (riu0Var = ms00.a(fetVar)) == null) {
            jf4.n("CompositionLocal LocalViewModelStoreOwner not present");
            return null;
        }
        riu0 riu0Var2 = riu0Var;
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        wbf wbfVarO = u4n0.o(riu0Var2);
        miu0 miu0VarP = u4n0.p(riu0Var2);
        Long lValueOf = Long.valueOf(fetVar.T);
        boolean zG = fetVar.g(riu0Var2) | fetVar.g(lValueOf);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            Object xiu0Var = new xiu0(riu0Var2, lValueOf, bundleV, wbfVarO, miu0VarP);
            fetVar.o0(xiu0Var);
            objP = xiu0Var;
        }
        xiu0 xiu0Var2 = (xiu0) objP;
        Object objX = ((clz) fetVar.k(or00.f25714a)).x();
        boolean zI = fetVar.i(xiu0Var2) | fetVar.i(objX);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            objP2 = new dff0(xiu0Var2, objX, (byte) 3);
            fetVar.o0(objP2);
        }
        m0x0.n(xiu0Var2, objX, (Function1) objP2, fetVar);
        return xiu0Var2;
    }

    public static final hfx L(InputStream inputStream) {
        inputStream.getClass();
        return new hfx(inputStream, new fmq0());
    }

    public static final String M(aq30 aq30Var, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        fe30 fe30Var = aq30Var.e;
        if (fe30Var instanceof ee30) {
            ee30 ee30Var = (ee30) fe30Var;
            return ctf0Var.f(R.string.placeholder_score_two_teams, Integer.valueOf(ee30Var.f7650a), Integer.valueOf(ee30Var.b));
        }
        if (!(fe30Var instanceof de30)) {
            t9f.b();
            return null;
        }
        zg30 zg30Var = ((de30) fe30Var).f5928a;
        if (zg30Var.equals(vg30.f37363a)) {
            return ctf0Var.f(R.string.draw_game, new Object[0]);
        }
        boolean z = zg30Var instanceof wg30;
        int i = R.string.lose;
        if (z) {
            if (((wg30) zg30Var).f39094a.equals(str)) {
                i = R.string.dt_prizes;
            }
            return ctf0Var.f(i, new Object[0]);
        }
        if (zg30Var instanceof xg30) {
            if (((xg30) zg30Var).f40821a.equals(str)) {
                i = R.string.dt_prizes;
            }
            return ctf0Var.f(i, new Object[0]);
        }
        if (zg30Var.equals(yg30.f42568a)) {
            return ctf0Var.f(R.string.vs, new Object[0]);
        }
        t9f.b();
        return null;
    }

    public static final z6c0 N(czc0 czc0Var, ctf0 ctf0Var, boolean z) {
        vyc0 vyc0Var;
        czc0Var.getClass();
        ctf0Var.getClass();
        tyc0 tyc0Var = czc0Var.f5218a;
        zyc0 zyc0Var = new zyc0(tyc0Var.f34747a, tyc0Var.b, tyc0Var.c, true, tyc0Var.d, tyc0Var.e);
        if (z) {
            vyc0Var = vyc0.b;
        } else {
            int iOrdinal = czc0Var.b.ordinal();
            if (iOrdinal == 0) {
                vyc0Var = vyc0.f38241a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                vyc0Var = vyc0.b;
            }
        }
        qlc0 qlc0Var = czc0Var.c;
        double d = qlc0Var.f28928a;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        String str = qlc0Var.c;
        p3u0 p3u0Var = p3u0.c;
        tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false), new llc0(lsm0Var.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), qlc0Var.b, false), qlc0Var.f ? new llc0(lsm0Var.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(qlc0Var.e, str, p3u0Var)), true) : null, qlc0Var.g ? new llc0(lsm0Var.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((qlc0Var.d - 1.0d) * d, str, p3u0Var)), true) : null})), qlc0Var.h);
        boolean z2 = czc0Var.d;
        String strA2 = lsm0Var.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
        String strConcat = z2 ? Separators.RETURN.concat(lsm0Var.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA2.concat(strConcat));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    public static final ArrayList O(t4h t4hVar, int i) {
        ?? arrayList;
        ?? arrayList2;
        t4hVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        List list = t4hVar.f33319a;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Long l = ((w3h) obj).f38502a;
                if (l != null && l.longValue() != 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = iun.f15405a;
        }
        List list2 = t4hVar.b;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((Number) obj2).longValue() != 0) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        int i2 = 0;
        for (Object obj3 : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            long jLongValue = ((Number) obj3).longValue();
            StringBuilder sb = new StringBuilder(ujn.h);
            String strH = axq.h(jLongValue, "/sfiles/sppic1/cyber/lol/champions/", ".png");
            if (strH.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strH, ujn.h, false) || kotlin.text.c.x(strH, "https://", false)) {
                sb.setLength(0);
                sb.append(strH);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strH, '/'));
            }
            arrayList3.add(new gah(i, i3, jLongValue, sb.toString(), true));
            i2 = i3;
        }
        int i4 = 0;
        for (Object obj4 : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                q3d.p();
                throw null;
            }
            w3h w3hVar = (w3h) obj4;
            Long l2 = w3hVar.f38502a;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            StringBuilder sb2 = new StringBuilder(ujn.h);
            Long l3 = w3hVar.f38502a;
            String strH2 = axq.h(l3 != null ? l3.longValue() : 0L, "/sfiles/sppic1/cyber/lol/champions/", ".png");
            if (strH2.length() == 0) {
                sb2.setLength(0);
            } else if (StringsKt.O(strH2, ujn.h, false) || kotlin.text.c.x(strH2, "https://", false)) {
                sb2.setLength(0);
                sb2.append(strH2);
            } else {
                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0(strH2, '/'));
            }
            arrayList3.add(new gah(i, i5, jLongValue2, sb2.toString(), false));
            i4 = i5;
        }
        return arrayList3;
    }

    public static final oea0 P(a9a0 a9a0Var, boolean z, String str) {
        a9a0Var.getClass();
        str.getClass();
        return new oea0(a9a0Var.a(), new c280(kng0.l(str, Separators.SLASH, a9a0Var.d()), R.drawable.ic_glyph_placeholder_player), a9a0Var.getName(), a9a0Var.c() instanceof laa0, z, !a9a0Var.e());
    }

    public static final lib0 Q(jib0 jib0Var) {
        jib0Var.getClass();
        int iOrdinal = jib0Var.ordinal();
        if (iOrdinal == 0) {
            return lib0.f20096a;
        }
        if (iOrdinal == 1) {
            return lib0.b;
        }
        if (iOrdinal == 2) {
            return lib0.c;
        }
        if (iOrdinal == 3) {
            return lib0.d;
        }
        t9f.b();
        return null;
    }

    public static final epd0 R(nnd0 nnd0Var, String str, ctf0 ctf0Var, boolean z) {
        String upperCase = null;
        if (!nnd0Var.f23816a) {
            return null;
        }
        boolean z2 = nnd0Var.e && !z;
        pn40 pn40Var = pn40.f27267a;
        double d = nnd0Var.b;
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        String strC2 = pn40.c(nnd0Var.c, p3u0Var);
        String strC3 = pn40.c(nnd0Var.d, p3u0Var);
        if (nnd0Var.f) {
            upperCase = ctf0Var.b.a(R.string.maximum, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        return new epd0(strC, strC2, strC3, str, upperCase, z2);
    }

    public static final qcm S(aea0 aea0Var, boolean z) {
        if (aea0Var.e == fks0.Retirement) {
            return new pcm(ncm.RETIREMENT);
        }
        if (z && aea0Var.b.length() == 0) {
            return new pcm(ncm.FREE);
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strConcat = "cyberstatistic/v1/image/".concat(aea0Var.c);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        return new ocm(new n0x(sb.toString()));
    }

    public static final ucm T(aea0 aea0Var, ctf0 ctf0Var, qcm qcmVar) {
        String strA;
        tcm rcmVar;
        boolean z = aea0Var.f;
        String str = aea0Var.b;
        fks0 fks0Var = aea0Var.e;
        long j = z ? aea0Var.f718a : -1L;
        if (fks0Var.a() && str.length() == 0) {
            strA = ctf0Var.b.a(R.string.cyber_games_free_agent_transfer, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = fks0Var == fks0.Retirement ? ctf0Var.b.a(R.string.retirement, Arrays.copyOf(new Object[0], 0)) : str;
        }
        String str2 = aea0Var.d;
        if (str.length() <= 0 || !fks0Var.b()) {
            rcmVar = (str.length() <= 0 || str2.length() <= 0) ? scm.f31992a : new rcm(str2);
        } else {
            rcmVar = new rcm(ctf0Var.b.a(fks0Var.f9708a, Arrays.copyOf(new Object[0], 0)));
        }
        return new ucm(j, qcmVar, strA, rcmVar, true);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, String str, Function1 function1) {
        byte b;
        l7m0Var.getClass();
        str.getClass();
        function1.getClass();
        fetVar.g0(-190949436);
        int i2 = i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ziw(l7m0Var, (byte) 15);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), (gmm) l7m0VarY.getValue(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                b = 0;
                objP2 = new u9x(function1, b);
                fetVar.o0(objP2);
            } else {
                b = 0;
            }
            Function0 function0 = (Function0) objP2;
            byte b2 = i3 == 2048 ? (byte) 1 : b;
            Object objP3 = fetVar.P();
            if (b2 != 0 || objP3 == cl5Var) {
                objP3 = new dht(function1, (byte) 29);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v9x(mm40Var, l7m0Var, str, function1, i);
        }
    }

    public static final void b(mm40 mm40Var, pz40 pz40Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(939706621);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pz40Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            qzb.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), new wul(iul.e, oe9.d, new se9(R.drawable.ic_glyph_plus_small), true, false, true), function0, fetVar, i2 & 896, 0);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-440049831, new w6y(b, pz40Var, function1), fetVar), fetVar, 56);
            if (((ln5) pz40Var.getValue()).c) {
                fetVar.e0(-898944657);
                mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                boolean z = (i2 & 7168) == 2048;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new dbn(function1, (byte) 26);
                    fetVar.o0(objP);
                }
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar), null, y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(-898417719);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x6y(mm40Var, pz40Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void c(mm40 mm40Var, xw00 xw00Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        float f2;
        fetVar.g0(-1500404291);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xw00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40Var, backgroundContent, ljcVar), "LOGIN_CONTENT");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            f9x f9xVar = xw00Var.f41587a;
            if (f9xVar == null) {
                fetVar.e0(1774679835);
                fetVar.r(false);
            } else {
                fetVar.e0(1774679836);
                zcl zclVar = qmk.f28987a;
                d9x.b(0, 0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), f9xVar.f9177a);
                fetVar.r(false);
            }
            wul wulVar = xw00Var.b;
            cl5 cl5Var = ukd.f35823a;
            if (wulVar == null) {
                fetVar.e0(1774912087);
                fetVar.r(false);
                f2 = 8.0f;
                f = 16.0f;
            } else {
                fetVar.e0(1774912088);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new ia30(function1, (byte) 14);
                    fetVar.o0(objP);
                }
                f = 16.0f;
                f2 = 8.0f;
                qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar, 0, 0);
                fetVar.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarK2 = s5x0.K(mm40VarD2, f, f2);
            wul wulVar2 = xw00Var.c;
            boolean z2 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ia30(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarK2, wulVar2, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) xw00Var, (Object) function1, i, (byte) 7);
        }
    }

    public static final void d(mm40 mm40Var, kz20 kz20Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ugd ugdVar2 = ugdVar;
        function1.getClass();
        fetVar.g0(2120357487);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kz20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = kz20Var.e;
            pzn pznVarA = kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3));
            alo aloVarA = kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3));
            ugd ugdVarM = u1c.M(-1857240351, new fz20(kz20Var, f, function1), fetVar);
            int i3 = i2;
            y5d y5dVar = y5d.f42040a;
            b34.e(y5dVar, z, null, pznVarA, aloVarA, null, ugdVarM, fetVar, 1600518, 18);
            b34.e(y5dVar, kz20Var.g, null, kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(-1051399414, new fz20(kz20Var, function1, f), fetVar), fetVar, 1600518, 18);
            b34.e(y5dVar, kz20Var.j != null, s5x0.L(i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), ljcVar), f, 0.0f, 2), kzn.c(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(Response.OK, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(-1187426711, new gz20(kz20Var, function1, (byte) 7), fetVar), fetVar, 1600518, 16);
            ugdVar2 = ugdVar;
            ugdVar2.F(Long.valueOf(kz20Var.c), fetVar, Integer.valueOf((i3 >> 6) & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hz20(mm40Var, kz20Var, function1, ugdVar2, i, (byte) 3);
        }
    }

    public static final void e(mm40 mm40Var, final jp30 jp30Var, final Function1 function1, Function1 function2, Function2 function3, Function2 function4, fet fetVar, int i) {
        int i2;
        Function1 function5;
        wdr wdrVar;
        Function2 function6;
        boolean z;
        jm40 jm40Var;
        ugd ugdVar;
        cl5 cl5Var;
        boolean z2;
        float f;
        ljc ljcVar = jd8.n;
        jp30Var.getClass();
        xw00 xw00Var = jp30Var.g;
        function1.getClass();
        function2.getClass();
        fetVar.g0(1111240023);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jp30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        int i3 = i2 | 221184;
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            ugd ugdVarM = u1c.M(477075920, new Function2() { // from class: a.hp30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    cl5 cl5Var2 = ukd.f35823a;
                    jm40 jm40Var2 = jm40.b;
                    Function1 function7 = function1;
                    jp30 jp30Var2 = jp30Var;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                t820 t820Var = jp30Var2.f16883a;
                                if (t820Var != null) {
                                    if (t820Var instanceof n820) {
                                        fetVar2.e0(522057735);
                                        long backgroundGroupSecondary = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroupSecondary();
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarQ = i120.Q(jm40Var2, backgroundGroupSecondary, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
                                        dye dyeVar = ((n820) t820Var).f23068a;
                                        boolean zG = fetVar2.g(function7);
                                        Object objP = fetVar2.P();
                                        if (zG || objP == cl5Var2) {
                                            objP = new ia30(function7, (byte) 7);
                                            fetVar2.o0(objP);
                                        }
                                        Function0 function0 = (Function0) objP;
                                        boolean zG2 = fetVar2.g(function7);
                                        Object objP2 = fetVar2.P();
                                        if (zG2 || objP2 == cl5Var2) {
                                            objP2 = new ia30(function7, (byte) 8);
                                            fetVar2.o0(objP2);
                                        }
                                        lmc.e(mm40VarQ, dyeVar, function0, (Function0) objP2, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (t820Var instanceof q820) {
                                        fetVar2.e0(522782112);
                                        xy6 xy6Var = ((q820) t820Var).f28279a;
                                        boolean zG3 = fetVar2.g(function7);
                                        Object objP3 = fetVar2.P();
                                        if (zG3 || objP3 == cl5Var2) {
                                            objP3 = new ia30(function7, (byte) 9);
                                            fetVar2.o0(objP3);
                                        }
                                        Function0 function8 = (Function0) objP3;
                                        boolean zG4 = fetVar2.g(function7);
                                        Object objP4 = fetVar2.P();
                                        if (zG4 || objP4 == cl5Var2) {
                                            objP4 = new ia30(function7, (byte) 10);
                                            fetVar2.o0(objP4);
                                        }
                                        Function0 function9 = (Function0) objP4;
                                        boolean zG5 = fetVar2.g(function7);
                                        Object objP5 = fetVar2.P();
                                        if (zG5 || objP5 == cl5Var2) {
                                            objP5 = new ia30(function7, (byte) 11);
                                            fetVar2.o0(objP5);
                                        }
                                        Function0 function10 = (Function0) objP5;
                                        boolean zG6 = fetVar2.g(function7);
                                        Object objP6 = fetVar2.P();
                                        if (zG6 || objP6 == cl5Var2) {
                                            objP6 = new ia30(function7, (byte) 12);
                                            fetVar2.o0(objP6);
                                        }
                                        nnw0.b(null, xy6Var, function8, function9, function10, (Function0) objP6, fetVar2, 0);
                                        fetVar2.r(false);
                                    }
                                }
                                throw b1j.f(-1091539880, fetVar2, false);
                            }
                            fetVar2.X();
                            return Unit.f46060a;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fetVar3.X();
                            } else if (jp30Var2.i != null) {
                                fetVar3.e0(-2116300928);
                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var2);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(e7z.u1);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, x5dVarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarE0 = o2e.e0(epv0.N(s5x0.K(mm40VarD, 16.0f, 8.0f), 1.0f - jp30Var2.h), "COLLAPSED_MAKE_BET_BUTTON");
                                wul wulVar = jp30Var2.i;
                                boolean zG7 = fetVar3.g(function7);
                                Object objP7 = fetVar3.P();
                                if (zG7 || objP7 == cl5Var2) {
                                    objP7 = new ia30(function7, (byte) 13);
                                    fetVar3.o0(objP7);
                                }
                                qzb.n(mm40VarE0, wulVar, (Function0) objP7, fetVar3, 0, 0);
                                fetVar3.r(true);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-2115776222);
                                fetVar3.r(false);
                            }
                            return Unit.f46060a;
                    }
                }
            }, fetVar);
            ugd ugdVarM2 = u1c.M(1284771648, new Function2() { // from class: a.hp30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    cl5 cl5Var2 = ukd.f35823a;
                    jm40 jm40Var2 = jm40.b;
                    Function1 function7 = function1;
                    jp30 jp30Var2 = jp30Var;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                t820 t820Var = jp30Var2.f16883a;
                                if (t820Var != null) {
                                    if (t820Var instanceof n820) {
                                        fetVar2.e0(522057735);
                                        long backgroundGroupSecondary = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroupSecondary();
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarQ = i120.Q(jm40Var2, backgroundGroupSecondary, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
                                        dye dyeVar = ((n820) t820Var).f23068a;
                                        boolean zG = fetVar2.g(function7);
                                        Object objP = fetVar2.P();
                                        if (zG || objP == cl5Var2) {
                                            objP = new ia30(function7, (byte) 7);
                                            fetVar2.o0(objP);
                                        }
                                        Function0 function0 = (Function0) objP;
                                        boolean zG2 = fetVar2.g(function7);
                                        Object objP2 = fetVar2.P();
                                        if (zG2 || objP2 == cl5Var2) {
                                            objP2 = new ia30(function7, (byte) 8);
                                            fetVar2.o0(objP2);
                                        }
                                        lmc.e(mm40VarQ, dyeVar, function0, (Function0) objP2, fetVar2, 0);
                                        fetVar2.r(false);
                                    } else if (t820Var instanceof q820) {
                                        fetVar2.e0(522782112);
                                        xy6 xy6Var = ((q820) t820Var).f28279a;
                                        boolean zG3 = fetVar2.g(function7);
                                        Object objP3 = fetVar2.P();
                                        if (zG3 || objP3 == cl5Var2) {
                                            objP3 = new ia30(function7, (byte) 9);
                                            fetVar2.o0(objP3);
                                        }
                                        Function0 function8 = (Function0) objP3;
                                        boolean zG4 = fetVar2.g(function7);
                                        Object objP4 = fetVar2.P();
                                        if (zG4 || objP4 == cl5Var2) {
                                            objP4 = new ia30(function7, (byte) 10);
                                            fetVar2.o0(objP4);
                                        }
                                        Function0 function9 = (Function0) objP4;
                                        boolean zG5 = fetVar2.g(function7);
                                        Object objP5 = fetVar2.P();
                                        if (zG5 || objP5 == cl5Var2) {
                                            objP5 = new ia30(function7, (byte) 11);
                                            fetVar2.o0(objP5);
                                        }
                                        Function0 function10 = (Function0) objP5;
                                        boolean zG6 = fetVar2.g(function7);
                                        Object objP6 = fetVar2.P();
                                        if (zG6 || objP6 == cl5Var2) {
                                            objP6 = new ia30(function7, (byte) 12);
                                            fetVar2.o0(objP6);
                                        }
                                        nnw0.b(null, xy6Var, function8, function9, function10, (Function0) objP6, fetVar2, 0);
                                        fetVar2.r(false);
                                    }
                                }
                                throw b1j.f(-1091539880, fetVar2, false);
                            }
                            fetVar2.X();
                            return Unit.f46060a;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fetVar3.X();
                            } else if (jp30Var2.i != null) {
                                fetVar3.e0(-2116300928);
                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var2);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(e7z.u1);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, x5dVarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarE0 = o2e.e0(epv0.N(s5x0.K(mm40VarD, 16.0f, 8.0f), 1.0f - jp30Var2.h), "COLLAPSED_MAKE_BET_BUTTON");
                                wul wulVar = jp30Var2.i;
                                boolean zG7 = fetVar3.g(function7);
                                Object objP7 = fetVar3.P();
                                if (zG7 || objP7 == cl5Var2) {
                                    objP7 = new ia30(function7, (byte) 13);
                                    fetVar3.o0(objP7);
                                }
                                qzb.n(mm40VarE0, wulVar, (Function0) objP7, fetVar3, 0, 0);
                                fetVar3.r(true);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-2115776222);
                                fetVar3.r(false);
                            }
                            return Unit.f46060a;
                    }
                }
            }, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var2) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var2) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var2) {
                objP4 = jgk0.b(new g8l(cgk0Var, cgk0Var2, cgk0Var3, (byte) 24));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var = (l7m0) objP4;
            Integer numValueOf = Integer.valueOf(((Number) l7m0Var.getValue()).intValue());
            boolean z3 = (i3 & 7168) == 2048;
            Object objP5 = fetVar.P();
            boolean z4 = z3;
            yje yjeVar = null;
            if (z4 || objP5 == cl5Var2) {
                objP5 = new gll((byte) 2, yjeVar, l7m0Var, function2);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP5);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "MEDIUM_CUSTOM_BACKGROUND_MAKE_BET_CONTENT");
            boolean z5 = (i3 & 112) == 32;
            Object objP6 = fetVar.P();
            if (z5 || objP6 == cl5Var2) {
                objP6 = new b530((Object) jp30Var, (byte) 6);
                fetVar.o0(objP6);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP6);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf2, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var2) {
                z = false;
                objP7 = new ip30(cgk0Var, (byte) 0);
                fetVar.o0(objP7);
            } else {
                z = false;
            }
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD0 = ro4.d0(jm40Var2, (Function1) objP7);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, z);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(923877723);
            ugdVarM.invoke(fetVar, Integer.valueOf((i3 >> 12) & 14));
            fetVar.r(false);
            fetVar.r(true);
            float f2 = jp30Var.h;
            if (xw00Var != null) {
                fetVar.e0(-634752999);
                Object objP8 = fetVar.P();
                if (objP8 == cl5Var2) {
                    objP8 = new ip30(cgk0Var2, (byte) 1);
                    fetVar.o0(objP8);
                }
                jm40Var = jm40Var2;
                mm40 mm40VarD1 = ro4.d0(jm40Var, (Function1) objP8);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                cl5Var = cl5Var2;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD1);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                c(null, xw00Var, function1, fetVar, i3 & 896);
                fetVar.r(true);
                z2 = false;
                fetVar.r(false);
                function5 = function1;
                ugdVar = ugdVarM2;
            } else {
                jm40Var = jm40Var2;
                fetVar.e0(-634374365);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                mm40 mm40VarH = k7n0.H(jm40Var, f2 < 0.5f ? 1.0f : 0.0f);
                Object objP9 = fetVar.P();
                if (objP9 == cl5Var2) {
                    objP9 = new ip30(cgk0Var2, (byte) 2);
                    fetVar.o0(objP9);
                }
                mm40 mm40VarD2 = ro4.d0(mm40VarH, (Function1) objP9);
                tj30 tj30VarC4 = zq8.c(zx7Var, false);
                int iHashCode5 = Long.hashCode(fetVar.T);
                bh90 bh90VarM5 = fetVar.m();
                mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC4, shdVar);
                jpm0.o(fetVar, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC4, shdVar4);
                fetVar.e0(604045157);
                ugdVar = ugdVarM2;
                ugdVar.invoke(fetVar, Integer.valueOf((i3 >> 15) & 14));
                fetVar.r(false);
                fetVar.r(true);
                function5 = function1;
                j(epv0.N(jm40Var, f2), jp30Var, function5, fetVar, i3 & 1008);
                if (f2 < 0.5f) {
                    fetVar.e0(1159598123);
                    mm40 mm40VarA2 = jr8.f16991a.a(jm40Var);
                    Object objP10 = fetVar.P();
                    cl5Var = cl5Var2;
                    if (objP10 == cl5Var) {
                        objP10 = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP10;
                    Object objP11 = fetVar.P();
                    if (objP11 == cl5Var) {
                        objP11 = new gj30((byte) 5);
                        fetVar.o0(objP11);
                    }
                    z2 = false;
                    zq8.a(0, fetVar, y860.W(mm40VarA2, gy40Var, null, false, null, (Function0) objP11, 28));
                    fetVar.r(false);
                } else {
                    cl5Var = cl5Var2;
                    z2 = false;
                    fetVar.e0(1159997899);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(z2);
            }
            tj30 tj30VarC5 = zq8.c(zx7Var, z2);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC5, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            Object objP12 = fetVar.P();
            if (objP12 == cl5Var) {
                objP12 = new ip30(cgk0Var3, (byte) 3);
                fetVar.o0(objP12);
            }
            mm40 mm40VarQ2 = i120.Q(ro4.d0(jm40Var, (Function1) objP12), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
            t820 t820Var = jp30Var.f16883a;
            if (t820Var != null) {
                if (t820Var instanceof n820) {
                    zcl zclVar = qmk.f28987a;
                    f = 24.0f;
                } else if (t820Var instanceof q820) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 8.0f;
                }
                wvb.o(mm40VarQ2, f, 0L, fetVar, 0, 4);
                fetVar.r(true);
                fetVar.r(true);
                function6 = ugdVar;
                wdrVar = ugdVarM;
            }
            t9f.b();
            return;
        }
        function5 = function1;
        fetVar.X();
        wdrVar = function3;
        function6 = function4;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) jp30Var, function5, function2, wdrVar, (wdr) function6, i, (byte) 24);
        }
    }

    public static final void f(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(1436775478);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 32.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            b = 1;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, b);
        }
    }

    public static final void g(c280 c280Var, String str, c280 c280Var2, String str2, String str3, long j, String str4, long j2, fet fetVar, int i) {
        c280 c280Var3;
        String str5 = str3;
        long j3 = j;
        String str6 = str4;
        long j4 = j2;
        fetVar.g0(-1305688708);
        int i2 = i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(c280Var2) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.f(j3) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 64.0f), true);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            f(c280Var, str, fetVar, i2 & 126);
            c280Var3 = c280Var2;
            f(c280Var3, str2, fetVar, (i2 >> 6) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            str5 = str3;
            j3 = j;
            t(str5, j3, fetVar, (i2 >> 12) & 126);
            str6 = str4;
            j4 = j2;
            t(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            c280Var3 = c280Var2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o5l0(c280Var, str, c280Var3, str2, str5, j3, str6, j4, i, (byte) 1);
        }
    }

    public static final void h(mm40 mm40Var, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(1276856004);
        byte b = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new rip(pz40Var, (byte) 15);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new rip(pz40Var, b);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            zcl zclVar = qmk.f28987a;
            z1x.m(s5x0.L(mm40Var, 12.0f, 0.0f, 2), new qw3(8.0f, true, new jf4((byte) 14)), null, u1c.M(-1529347783, new e280(l7m0VarY2, function1, pz40Var, b2), fetVar), u1c.M(942432250, new tft(l7m0VarY, (byte) 8), fetVar), null, fetVar, 27648, 36);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ugv(mm40Var, pz40Var, function1, i, (byte) 3);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v13 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r0v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v15 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r13v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v10 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r13v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v8 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r17v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v10 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r17v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v11 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r17v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v13 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r17v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v14 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r6v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v12 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: int
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
    /* JADX WARN: Failed to set immutable type for var: r57v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r57v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r58v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r59v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r59v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void i(a.mm40 r43, a.xk80 r44, a.hh80 r45, a.afk0 r46, boolean r47, a.vf80 r48, int r49, float r50, a.yi80 r51, a.vj50 r52, kotlin.jvm.functions.Function1 r53, a.yx7 r54, a.ifk0 r55, a.ugd r56, a.fet r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w9x.i(a.mm40, a.xk80, a.hh80, a.afk0, boolean, a.vf80, int, float, a.yi80, a.vj50, kotlin.jvm.functions.Function1, a.yx7, a.ifk0, a.ugd, a.fet, int, int):void");
    }

    public static final void j(mm40 mm40Var, jp30 jp30Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        kwj kwjVar;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(678445632);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jp30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            vwh0 vwh0Var = jp30Var.b;
            int i3 = vwh0Var.b;
            a4x a4xVar = vwh0Var.f38150a;
            boolean zG = fetVar2.g(vwh0Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new rx00(vwh0Var, (byte) 29);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar2, 0, 2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP3);
            }
            vne vneVar2 = (vne) objP3;
            rwj rwjVar = tvk.f34603a;
            vs10 vs10Var = ys10.f43147a;
            boolean zG2 = fetVar2.g(kwjVarB) | fetVar2.g(vwh0Var);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new mq10((Object) kwjVarB, (Object) vwh0Var, (yje) null, (byte) 22);
                fetVar2.o0(objP4);
            }
            sac.V(vneVar2, null, null, vs10Var, (Function2) objP4, 11);
            boolean zE = fetVar2.e(a4xVar.size());
            Object objP5 = fetVar2.P();
            if (zE || objP5 == cl5Var) {
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                Iterator<E> it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nj80) it.next()).b);
                }
                objP5 = dyb.o0(arrayList);
                fetVar2.o0(objP5);
            }
            a4x a4xVar2 = (a4x) objP5;
            if (a4xVar2.size() > 1) {
                fetVar2.e0(-572569910);
                dxh0 dxh0Var = vwh0Var.c;
                boolean zG3 = fetVar2.g(kwjVarB);
                Object objP6 = fetVar2.P();
                if (zG3 || objP6 == cl5Var) {
                    objP6 = new s39(kwjVarB, (byte) 23);
                    fetVar2.o0(objP6);
                }
                Function0 function0 = (Function0) objP6;
                boolean zI = ((i2 & 896) == 256) | fetVar2.i(vneVar) | fetVar2.g(kwjVarB) | fetVar2.g(vwh0Var);
                Object objP7 = fetVar2.P();
                if (zI || objP7 == cl5Var) {
                    enm enmVar = new enm((Object) vneVar, (Object) function1, (Object) vwh0Var, (Object) kwjVarB, (byte) 20);
                    kwjVar = kwjVarB;
                    fetVar2.o0(enmVar);
                    objP7 = enmVar;
                } else {
                    kwjVar = kwjVarB;
                }
                z = true;
                function2 = function1;
                ntb.n(null, a4xVar2, null, dxh0Var, null, 0L, function0, (Function1) objP7, fetVar2, 0, 53);
                mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                wvb.o(mm40VarQ, 12.0f, 0L, fetVar2, 0, 4);
                fetVar2.r(false);
            } else {
                function2 = function1;
                kwjVar = kwjVarB;
                z = true;
                fetVar2.e0(-571891444);
                fetVar2.r(false);
            }
            q5x.e(kwjVar, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1104347401, new n82(vwh0Var, jp30Var, function2, (byte) 18), fetVar2), fetVar, 100663296, 24576, 16126);
            fetVar2 = fetVar;
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) jp30Var, (Object) function1, i, (byte) 6);
        }
    }

    public static final void k(mm40 mm40Var, jx80 jx80Var, boolean z, qdz qdzVar, Function1 function1, Function1 function2, Function2 function3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        jx80Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar2.g0(894947895);
        int i2 = i | (fetVar2.g(jx80Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.g(qdzVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536) | (fetVar2.i(function3) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 8.0f, 0.0f, 10), "PARTNER_TOP_INFO");
            sx80 sx80Var = jx80Var.c;
            dx80 dx80Var = jx80Var.e;
            dx80 dx80Var2 = dx80.b;
            boolean z2 = dx80Var == dx80Var2;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 57344) == 16384);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new qw80((Object) function1, (Object) jx80Var, (byte) 2);
                fetVar2.o0(objP);
            }
            ucx.y(mm40VarE0, sx80Var, z2, (Function0) objP, fetVar2, 0);
            if (dx80Var == dx80Var2) {
                fetVar2.e0(184723773);
                int i3 = i2 >> 3;
                e9x.r(o2e.e0(hp4.B(jm40Var), "PARTNER_BOTTOM_INFO"), jx80Var.d, qdzVar, z, function2, function3, fetVar2, (i3 & 458752) | (i3 & 896) | ((i2 << 3) & 7168) | (i3 & 57344));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(185095029);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, (Object) jx80Var, z, (Object) qdzVar, function1, function2, function3, i, (byte) 14);
        }
    }

    public static final void l(final float f, float f2, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        fetVar.g0(1406789554);
        int i3 = (fetVar.d(f) ? 4 : 2) | i | (((i2 & 2) == 0 && fetVar.d(f2)) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            } else if ((i2 & 2) != 0) {
                zcl zclVar = qmk.f28987a;
                f2 = 0.0f;
            }
            fetVar.s();
            n(qbc.i(f2, f), ugdVar, fetVar, 48);
        } else {
            fetVar.X();
        }
        final float f3 = f2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(f, f3, ugdVar, i, i2) { // from class: a.vg40

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f37364a;
                public final /* synthetic */ float b;
                public final /* synthetic */ ugd c;
                public final /* synthetic */ byte d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(385);
                    w9x.l(this.f37364a, this.b, this.c, (fet) obj, iL, this.d);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(1361186680);
        int i2 = (fetVar.d(40.0f) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n(qbc.i(40.0f, 40.0f), ugdVar, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, (byte) 22);
        }
    }

    public static final void n(long j, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1073218728);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.runtime.d dVar = bmd.t;
            wgu0 wgu0Var = (wgu0) fetVar.k(dVar);
            boolean zG = fetVar.g(wgu0Var) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new wg40(wgu0Var, j);
                fetVar.o0(objP);
            }
            obc.d(dVar.a((wg40) objP), ugdVar, fetVar, i2 & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tam(j, ugdVar, i);
        }
    }

    public static final void o(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        fr5Var.getClass();
        function2.getClass();
        fetVar2.g0(202245168);
        int i3 = i2 | 6 | (fetVar2.g(fr5Var) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.g(num) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 96.0f, 128.0f);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new pia(function2, fr5Var, pz40Var, (byte) 3);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarP, null, null, false, null, (Function0) objP2, 28), "RectangleVerticalBannerItem_Box");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE1 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "VERTICAL_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new ryc0(pz40Var, (byte) 5);
                fetVar2.o0(objP3);
            }
            int i4 = i3 << 3;
            etl.a(mm40VarE1, o0xVar, o0xVar3, i, num, null, 32.0f, (Function1) objP3, fetVar2, (i4 & 57344) | (i4 & 7168) | 12582912, 32);
            if (o0xVar2 != null) {
                fetVar2.e0(-123620573);
                z = false;
                etl.d(lgb.J(jr8Var.b(jm40Var, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar2, 0);
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-123354376);
                fetVar2.r(false);
            }
            etl.f(6, fetVar2, null);
            mm40 mm40VarE2 = o2e.e0(s5x0.N(s5x0.L(o7k0.u(jr8Var.b(jm40Var, gqw0.g), 0.0f, 96.0f, 1), 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), "VERTICAL_BANNER_TEXT");
            String str = fr5Var.d;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE2, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.a(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (er5Var != null) {
                fetVar2.e0(-122754340);
                etl.c(o7k0.u(jm40Var, 0.0f, 98.0f, 1), er5Var, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-122625256);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void p(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ?? r12;
        boolean z;
        fr5Var.getClass();
        function2.getClass();
        fetVar.g0(1831376615);
        int i3 = i2 | 6 | (fetVar.g(fr5Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(num) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 96.0f, 128.0f);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new pia(function2, fr5Var, pz40Var, (byte) 4);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarP, null, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "VERTICAL_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new ryc0(pz40Var, (byte) 6);
                fetVar.o0(objP3);
            }
            int i4 = i3 << 3;
            etl.a(mm40VarE0, o0xVar, o0xVar3, i, num, null, 32.0f, (Function1) objP3, fetVar, (i4 & 57344) | (i4 & 7168) | 12582912, 32);
            if (o0xVar2 != null) {
                fetVar.e0(2002934336);
                r12 = 0;
                etl.d(lgb.J(jr8Var.b(jm40Var, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar, 0);
                fetVar.r(false);
            } else {
                r12 = 0;
                fetVar.e0(2003200533);
                fetVar.r(false);
            }
            if (er5Var != null) {
                fetVar.e0(2003250009);
                z = true;
                etl.c(o7k0.u(jm40Var, 0.0f, 98.0f, 1), er5Var, fetVar, r12, r12);
                fetVar.r(r12);
            } else {
                z = true;
                fetVar.e0(2003379093);
                fetVar.r(r12);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 4);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1837551012);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            etl.b(0, fetVar, lgb.J(o7k0.p(jm40Var, 96.0f, 128.0f), vgg0.a(16.0f)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 14);
        }
    }

    public static final void r(ogg0 ogg0Var, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        int i2;
        i4 i4Var = ogg0Var.c;
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-826812931);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ogg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qdzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarB = qdzVar.b("ROUND_STATISTIC", new vtf0(b), fetVar, (i2 << 3) & 896);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f, 0.0f, 8.0f, 4), "ROUND_STATISTIC");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            yje yjeVar = null;
            ucx.D(0, fetVar, null, ogg0Var.f25217a, ogg0Var.b);
            t9x.t(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), xczVarB, i4Var, fetVar, 512);
            fetVar.r(true);
            Boolean boolValueOf = Boolean.valueOf(ogg0Var.d);
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | fetVar.g(xczVarB);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new k6d0((Object) ogg0Var, (Object) xczVarB, yjeVar, (byte) 21);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            Integer numValueOf = Integer.valueOf(i4Var.size());
            boolean z = ((i2 & 896) == 256) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new tye0(function1, ogg0Var, yjeVar, (byte) 16);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) ogg0Var, (Object) qdzVar, (Object) function1, i, (byte) 2);
        }
    }

    public static final void s(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1505584908);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.b(j83Var, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 18) & 234881024) | 24576, 245758);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3h0(mm40Var, j83Var, y9q0Var, i, (byte) 1);
        }
    }

    public static final void t(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2021031483);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.i().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.i(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 6);
        }
    }

    public static final void u(a4x a4xVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        fetVar.g0(-1591514912);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c(o7k0.d(jm40.b, 1.0f), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(new lh80(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 24.0f), fetVar);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                function2 = function1;
                objP = new a7j0(a4xVar, function2, b);
                fetVar.o0(objP);
            } else {
                function2 = function1;
            }
            b8k0.e(null, xczVar, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.VERSION_NOT_SUPPORTED);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b7j0(a4xVar, xczVar, function2, i, (byte) 0);
        }
    }

    public static final void v(l7m0 l7m0Var, adz adzVar, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        adzVar.getClass();
        function1.getClass();
        fetVar.g0(-1263352227);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(adzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                fetVar.o0(function1);
                objP = function1;
            }
            Function1 function2 = (Function1) objP;
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            byte b = 10;
            if (z || objP2 == obj) {
                objP2 = new f7f0(l7m0Var, b);
                fetVar.o0(objP2);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP2, fetVar, 0, 3);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                a4x<ewi0> a4xVar = ((ucj0) l7m0Var.getValue()).d;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (ewi0 ewi0Var : a4xVar) {
                    arrayList.add(new s4i(ewi0Var.f8528a, ewi0Var.b, 0, false, 8));
                }
                fetVar.o0(arrayList);
                objP3 = arrayList;
            }
            List list = (List) objP3;
            k6z k6zVar = ((ucj0) l7m0Var.getValue()).f35433a ? k6z.b : k6z.f17794a;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP4);
            }
            vne vneVar = (vne) objP4;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6zVar), u1c.M(-1101662105, new fn0(l7m0Var, function1, list, vneVar, kwjVarB, adzVar, function2), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0((byte) 6, i, (Object) l7m0Var, (Object) adzVar, function1);
        }
    }

    public static final void w(mm40 mm40Var, ddk0 ddk0Var, Function1 function1, fet fetVar, int i) {
        cqq cqqVar;
        ddk0Var.getClass();
        function1.getClass();
        fetVar.g0(1995401375);
        int i2 = i | 6 | (fetVar.g(ddk0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar2 = (cqq) objP;
            Object obj2 = (wpq) fetVar.k(bmd.i);
            Object obj3 = (pkk0) fetVar.k(bmd.q);
            rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
            Boolean boolValueOf = Boolean.valueOf(ddk0Var.g);
            yez yezVar = (yez) rhv0Var;
            Boolean boolValueOf2 = Boolean.valueOf(yezVar.c());
            boolean zG = ((i2 & 112) == 32) | fetVar.g(yezVar) | fetVar.g(obj3) | fetVar.i(obj2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                cqqVar = cqqVar2;
                Object jv0Var = new jv0(ddk0Var, yezVar, cqqVar, obj3, obj2, null, (byte) 13);
                fetVar.o0(jv0Var);
                objP2 = jv0Var;
            } else {
                cqqVar = cqqVar2;
            }
            m0x0.v(boolValueOf, boolValueOf2, (Function2) objP2, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            x(ddk0Var, cqqVar, function1, fetVar, ((i2 >> 3) & 14) | 48 | (i2 & 896));
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, ddk0Var, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(ddk0 ddk0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        boolean z;
        cl5 cl5Var;
        fet fetVar2;
        fet fetVar3;
        byte b;
        fetVar.g0(91066618);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ddk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cqqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB0 = y860.b0(jm40Var, cqqVar);
            g7n g7nVar = ddk0Var.b;
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP == cl5Var2) {
                objP = new abh0(function1, (byte) 22);
                fetVar.o0(objP);
            }
            jwb.j(mm40VarB0, g7nVar, (Function1) objP, fetVar, 0, 4);
            zcl zclVar = qmk.f28987a;
            fet fetVar4 = fetVar;
            wvb.o(null, 28.0f, 0L, fetVar4, 0, 5);
            if (ddk0Var.e) {
                fetVar4.e0(-1453048817);
                vul vulVar = vul.f38053a;
                wul wulVar = ddk0Var.j;
                boolean z3 = i4 == 256;
                Object objP2 = fetVar4.P();
                if (z3 || objP2 == cl5Var2) {
                    objP2 = new nrj0(function1, (byte) 29);
                    fetVar4.o0(objP2);
                }
                i3 = i4;
                ckb.i(null, vulVar, wulVar, 0L, (Function0) objP2, fetVar, 48, 9);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                cl5Var = cl5Var2;
                b = 0;
                fetVar3 = fetVar5;
            } else {
                i3 = i4;
                fetVar4.e0(-1452759742);
                String str = ddk0Var.f;
                if (str == null) {
                    fetVar4.e0(-1452729115);
                    fetVar4.r(false);
                    cl5Var = cl5Var2;
                    z = false;
                    fetVar2 = fetVar4;
                } else {
                    fetVar4.e0(-1452729114);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    long secondary = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary();
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    z = false;
                    cl5Var = cl5Var2;
                    v8q0.a(str, mm40VarD, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 48, 0, 130040);
                    fet fetVar6 = fetVar;
                    fetVar6.r(false);
                    fetVar2 = fetVar6;
                }
                wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(z);
                b = z;
                fetVar3 = fetVar2;
            }
            wvb.o(null, 16.0f, 0L, fetVar3, 0, 5);
            vul vulVar2 = vul.b;
            wul wulVar2 = ddk0Var.h;
            wul wulVar3 = ddk0Var.i;
            int i5 = i3;
            char c = i5 == 256 ? (char) 1 : b;
            Object objP3 = fetVar3.P();
            if (c != 0 || objP3 == cl5Var) {
                objP3 = new uck0(function1, b);
                fetVar3.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            char c2 = i5 == 256 ? (char) 1 : b;
            Object objP4 = fetVar3.P();
            if (c2 != 0 || objP4 == cl5Var) {
                objP4 = new uck0(function1, (byte) 1);
                fetVar3.o0(objP4);
            }
            gkb.i(null, vulVar2, wulVar2, wulVar3, 0L, function0, (Function0) objP4, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) ddk0Var, (Object) cqqVar, (Object) function1, i, (byte) 19);
        }
    }

    public static final void y(mm40 mm40Var, xtm xtmVar, fet fetVar, int i) {
        int i2;
        String str = xtmVar.k;
        String str2 = xtmVar.j;
        fetVar.g0(-1719746274);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xtmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            g(xtmVar.d, xtmVar.f41470a, xtmVar.e, xtmVar.f, xtmVar.b, xtmVar.c, xtmVar.g, xtmVar.h, fetVar, 0);
            if (str2.length() <= 0 && str.length() <= 0 && xtmVar.i.length() <= 0) {
                fetVar.e0(1878784270);
                fetVar.r(false);
            } else {
                fetVar.e0(1878556513);
                sj3.p(6, 0, fetVar, jm40.b, xtmVar.i, str2, str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) xtmVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0214 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x021e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0221  */
    /* JADX WARN: Code duplicated, block: B:135:0x0230  */
    /* JADX WARN: Code duplicated, block: B:139:0x0240  */
    /* JADX WARN: Code duplicated, block: B:142:0x0287  */
    /* JADX WARN: Code duplicated, block: B:143:0x0289  */
    /* JADX WARN: Code duplicated, block: B:146:0x0299  */
    /* JADX WARN: Code duplicated, block: B:147:0x029c  */
    /* JADX WARN: Code duplicated, block: B:154:0x032d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    public static final void z(mm40 mm40Var, final j43 j43Var, final k43 k43Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        wz40 wz40Var;
        boolean z;
        final boolean z2;
        boolean z3;
        Object objP;
        final wz40 wz40Var2;
        Object objP2;
        final wz40 wz40Var3;
        Object objP3;
        final t33 t33Var;
        Object objP4;
        final t33 t33Var2;
        Object objP5;
        final wz40 wz40Var4;
        Object objP6;
        final t33 t33Var3;
        Object objP7;
        final wz40 wz40Var5;
        Object objP8;
        final t33 t33Var4;
        boolean zE;
        Object objP9;
        final t33 t33Var5;
        Object objP10;
        final wz40 wz40Var6;
        Object objP11;
        final t33 t33Var6;
        Object objP12;
        final wz40 wz40Var7;
        boolean zG;
        Object objP13;
        boolean z4;
        Object objC;
        final t33 t33Var7;
        Object objP14;
        final wz40 wz40Var8;
        final gzc gzcVarL;
        final gzc gzcVarM;
        final s4u0 s4u0VarO;
        final s4u0 s4u0VarO2;
        final long jN;
        final boolean z5;
        boolean z6;
        boolean z7;
        boolean zE2;
        Object obj;
        int i3;
        Object obj2;
        fetVar.g0(1648989957);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j43Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(k43Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            final c0d c0dVar = j43Var.c;
            Object obj3 = j43Var.f15865a;
            Object objP15 = fetVar.P();
            Object obj4 = ukd.f35823a;
            if (objP15 == obj4) {
                objP15 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP15);
            }
            final vne vneVar = (vne) objP15;
            final k6z k6zVar = (k6z) fetVar.k(bmd.n);
            final g9q0 g9q0VarN = pym0.n(fetVar);
            Object objP16 = fetVar.P();
            if (objP16 == obj4) {
                objP16 = new wz40(c0d.f3518a);
                fetVar.o0(objP16);
            }
            final wz40 wz40Var9 = (wz40) objP16;
            Object objP17 = fetVar.P();
            if (objP17 == obj4) {
                objP17 = new wz40(j43Var.b);
                fetVar.o0(objP17);
            }
            wz40 wz40Var10 = (wz40) objP17;
            c0d c0dVar2 = c0d.f3518a;
            boolean z8 = c0dVar == c0dVar2 && ((obj2 = wz40Var9.f40005a) == c0d.b || obj2 == c0d.c);
            c0d c0dVar3 = c0d.d;
            if (c0dVar == c0dVar3) {
                wz40Var = wz40Var10;
                boolean z9 = wz40Var9.f40005a == c0d.e;
                if (c0dVar != c0d.b || c0dVar == c0d.c || c0dVar == c0d.e) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z10 = z;
                if (c0dVar == c0dVar2 || wz40Var9.f40005a != c0dVar2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && (z10 || z8 || z9)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = fetVar.P();
                if (objP == obj4) {
                    objP = new wz40(Boolean.TRUE);
                    fetVar.o0(objP);
                }
                wz40Var2 = (wz40) objP;
                objP2 = fetVar.P();
                if (objP2 == obj4) {
                    objP2 = new wz40(s5m0.f31661a);
                    fetVar.o0(objP2);
                }
                wz40Var3 = (wz40) objP2;
                objP3 = fetVar.P();
                if (objP3 == obj4) {
                    objP3 = xf0.c(0.0f);
                    fetVar.o0(objP3);
                }
                t33Var = (t33) objP3;
                objP4 = fetVar.P();
                if (objP4 == obj4) {
                    objP4 = xf0.c(0.0f);
                    fetVar.o0(objP4);
                }
                t33Var2 = (t33) objP4;
                objP5 = fetVar.P();
                if (objP5 == obj4) {
                    objP5 = new wz40(xf0.c(1.0f));
                    fetVar.o0(objP5);
                }
                wz40Var4 = (wz40) objP5;
                objP6 = fetVar.P();
                if (objP6 == obj4) {
                    objP6 = m5k0.a(k43Var.d());
                    fetVar.o0(objP6);
                }
                t33Var3 = (t33) objP6;
                objP7 = fetVar.P();
                if (objP7 == obj4) {
                    objP7 = new wz40(m5k0.a(k43Var.d()));
                    fetVar.o0(objP7);
                }
                wz40Var5 = (wz40) objP7;
                objP8 = fetVar.P();
                if (objP8 == obj4) {
                    objP8 = xf0.c(0.0f);
                    fetVar.o0(objP8);
                }
                t33Var4 = (t33) objP8;
                zE = fetVar.e(c0dVar.ordinal()) | fetVar.g(obj3);
                objP9 = fetVar.P();
                if (zE || objP9 == obj4) {
                    objP9 = xf0.c(0.0f);
                    fetVar.o0(objP9);
                }
                t33Var5 = (t33) objP9;
                objP10 = fetVar.P();
                if (objP10 == obj4) {
                    objP10 = new wz40(xf0.c(0.0f));
                    fetVar.o0(objP10);
                }
                wz40Var6 = (wz40) objP10;
                objP11 = fetVar.P();
                if (objP11 == obj4) {
                    objP11 = xf0.c(0.0f);
                    fetVar.o0(objP11);
                }
                t33Var6 = (t33) objP11;
                objP12 = fetVar.P();
                if (objP12 == obj4) {
                    objP12 = new wz40(xf0.c(1.0f));
                    fetVar.o0(objP12);
                }
                wz40Var7 = (wz40) objP12;
                c0d c0dVar4 = (c0d) wz40Var9.f40005a;
                zG = fetVar.g(obj3) | fetVar.e(c0dVar.ordinal());
                objP13 = fetVar.P();
                if (zG || objP13 == obj4) {
                    if (c0dVar == c0dVar2 || !(c0dVar4 == c0dVar3 || c0dVar4 == c0d.e)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (c0dVar != c0dVar3 || c0dVar == c0d.e || z4 || c0dVar == c0dVar2) {
                        objC = xf0.c(1.0f);
                    } else {
                        objC = xf0.c(0.0f);
                    }
                    objP13 = objC;
                    fetVar.o0(objP13);
                }
                t33Var7 = (t33) objP13;
                objP14 = fetVar.P();
                if (objP14 == obj4) {
                    objP14 = new wz40(null);
                    fetVar.o0(objP14);
                }
                wz40Var8 = (wz40) objP14;
                gzcVarL = wha0.L(c0dVar, (c0d) wz40Var9.f40005a, k43Var.f());
                gzcVarM = wha0.M(c0dVar, (c0d) wz40Var9.f40005a, k43Var.f(), fetVar);
                s4u0VarO = wha0.O(gzcVarL, fetVar);
                s4u0VarO2 = wha0.O(gzcVarM, fetVar);
                jN = wha0.N(c0dVar, k43Var, fetVar);
                boolean zH = fetVar.h(z8) | fetVar.h(z9);
                z5 = z9;
                if ((i2 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zH2 = zH | z6 | fetVar.h(z2);
                if ((i2 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zE2 = fetVar.e(c0dVar.ordinal()) | zH2 | z7 | fetVar.h(z3) | fetVar.g(g9q0VarN) | fetVar.i(s4u0VarO) | fetVar.i(t33Var) | fetVar.i(gzcVarL) | fetVar.i(s4u0VarO2) | fetVar.i(gzcVarM) | fetVar.i(t33Var2) | fetVar.i(t33Var6) | fetVar.i(t33Var7) | fetVar.i(t33Var4) | fetVar.i(t33Var3) | fetVar.i(t33Var5) | fetVar.e(k6zVar.ordinal()) | fetVar.i(vneVar) | fetVar.f(jN);
                Object objP18 = fetVar.P();
                if (!zE2 || objP18 == obj4) {
                    final boolean z11 = z8;
                    final wz40 wz40Var11 = wz40Var;
                    i3 = 0;
                    final boolean z12 = z3;
                    obj = new Function2() { // from class: a.k5m0
                        /* JADX WARN: Code duplicated, block: B:121:0x034f  */
                        /* JADX WARN: Code duplicated, block: B:122:0x0358  */
                        /* JADX WARN: Code duplicated, block: B:125:0x0362  */
                        /* JADX WARN: Code duplicated, block: B:128:0x0374  */
                        /* JADX WARN: Code duplicated, block: B:131:0x037b  */
                        /* JADX WARN: Code duplicated, block: B:133:0x0389  */
                        /* JADX WARN: Code duplicated, block: B:35:0x0110  */
                        /* JADX WARN: Code duplicated, block: B:36:0x0115  */
                        /* JADX WARN: Code duplicated, block: B:38:0x0119  */
                        /* JADX WARN: Code duplicated, block: B:39:0x011e  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x012a  */
                        /* JADX WARN: Code duplicated, block: B:47:0x013c  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0178  */
                        /* JADX WARN: Code duplicated, block: B:51:0x0186  */
                        /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
                        /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:56:0x01b0  */
                        /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
                        /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
                        /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
                        /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
                        /* JADX WARN: Code duplicated, block: B:66:0x020d  */
                        /* JADX WARN: Code duplicated, block: B:67:0x021b  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0221  */
                        /* JADX WARN: Code duplicated, block: B:71:0x022c  */
                        /* JADX WARN: Code duplicated, block: B:72:0x0231  */
                        /* JADX WARN: Code duplicated, block: B:74:0x0235  */
                        /* JADX WARN: Code duplicated, block: B:76:0x023a  */
                        /* JADX WARN: Code duplicated, block: B:79:0x028f  */
                        /* JADX WARN: Code duplicated, block: B:84:0x029a  */
                        /* JADX WARN: Code duplicated, block: B:87:0x02a2  */
                        /* JADX WARN: Code duplicated, block: B:89:0x02a6  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i4;
                            pu90 pu90VarS;
                            int i5;
                            int i6;
                            c0d c0dVar5;
                            c0d c0dVar6;
                            int i7;
                            y9q0 y9q0VarB;
                            final t33 t33Var8;
                            final t33 t33Var9;
                            t33 t33Var10;
                            pu90 pu90Var;
                            c0d c0dVar7;
                            pu90 pu90Var2;
                            wz40 wz40Var12;
                            wz40 wz40Var13;
                            wz40 wz40Var14;
                            t33 t33Var11;
                            int i8;
                            int i9;
                            final t33 t33Var12;
                            boolean z13;
                            boolean z14;
                            t33 t33Var13;
                            long j;
                            wz40 wz40Var15;
                            pu90 pu90VarS2;
                            int i10;
                            int i11;
                            boolean zBooleanValue;
                            wz40 wz40Var16;
                            t33 t33Var14;
                            wz40 wz40Var17;
                            String str;
                            t33 t33Var15;
                            t33 t33Var16;
                            y9q0 y9q0VarB2;
                            t33 t33Var17;
                            pu90 pu90Var3;
                            wz40 wz40Var18;
                            t33 t33Var18;
                            int i12;
                            pu90 pu90VarS3;
                            int i13;
                            int i14;
                            k6z k6zVar2;
                            int i15;
                            boolean zBooleanValue2;
                            final c0d c0dVar8;
                            boolean z15;
                            j43 j43Var2;
                            t33 t33Var19;
                            wz40 wz40Var19;
                            wz40 wz40Var20;
                            Object r5m0Var;
                            float fW0;
                            float f;
                            k6z k6zVar3;
                            float fW1;
                            float fW2;
                            pj30 pj30Var;
                            pj30 pj30Var2;
                            j43 j43Var3 = j43Var;
                            String str2 = j43Var3.b;
                            c5n0 c5n0Var = (c5n0) obj5;
                            p4e p4eVar = (p4e) obj6;
                            c5n0Var.getClass();
                            boolean z16 = z11;
                            boolean z17 = z5;
                            wz40 wz40Var21 = wz40Var4;
                            wz40 wz40Var22 = wz40Var5;
                            final k43 k43Var2 = k43Var;
                            wz40 wz40Var23 = wz40Var7;
                            if (!z16 && !z17) {
                                wz40Var21.f40005a = xf0.c(1.0f);
                                wz40Var22.f40005a = m5k0.a(k43Var2.d());
                                wz40Var23.f40005a = xf0.c(1.0f);
                            }
                            float fW3 = 0.0f;
                            if (z2) {
                                wz40Var21.f40005a = xf0.c(0.0f);
                            }
                            wz40 wz40Var24 = wz40Var6;
                            if (!z16) {
                                wz40Var24.f40005a = xf0.c(0.0f);
                            }
                            long j2 = p4eVar.f26347a;
                            int i16 = p4e.i(j2);
                            wz40 wz40Var25 = wz40Var11;
                            String str3 = !z16 ? str2 : (String) wz40Var25.f40005a;
                            String str4 = j43Var3.f15865a;
                            boolean z18 = z12;
                            wz40 wz40Var26 = wz40Var2;
                            long jQ = wha0.Q(c5n0Var, k43Var2, z18, i16, str3, str4, wz40Var26, g9q0VarN);
                            t33 t33Var20 = (t33) wz40Var24.f40005a;
                            s4u0 s4u0Var = s4u0VarO;
                            t33 t33Var21 = t33Var;
                            pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("ARROW_ICON_LAYOUT_ID", new ugd(845420449, true, new m5m0(s4u0Var, t33Var20, t33Var21, gzcVarL))));
                            pu90 pu90VarS4 = pj30Var3 != null ? pj30Var3.S(r4e.b(0, 0, 0, 0, 15)) : null;
                            int i17 = pu90VarS4 != null ? pu90VarS4.f27604a : 0;
                            int i18 = pu90VarS4 != null ? pu90VarS4.b : 0;
                            s4u0 s4u0Var2 = s4u0VarO2;
                            t33 t33Var22 = t33Var2;
                            t33 t33Var23 = t33Var6;
                            if (s4u0Var2 != null) {
                                pj30 pj30Var4 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("BLOCKED_ICON_LAYOUT_ID", new ugd(-1396051194, true, new m5m0(t33Var22, t33Var23, gzcVarM, s4u0Var2))));
                                if (pj30Var4 != null) {
                                    pu90VarS4 = pu90VarS4;
                                    t33Var23 = t33Var23;
                                    i4 = 0;
                                    pu90VarS = pj30Var4.S(r4e.b(0, 0, 0, 0, 15));
                                } else {
                                    i4 = 0;
                                }
                                if (pu90VarS != null) {
                                    i5 = pu90VarS.f27604a;
                                } else {
                                    i5 = i4;
                                }
                                if (pu90VarS != null) {
                                    i6 = pu90VarS.b;
                                } else {
                                    i6 = i4;
                                }
                                c0dVar5 = c0d.f;
                                c0dVar6 = c0dVar;
                                if (c0dVar6 != c0dVar5) {
                                    i7 = 1;
                                } else {
                                    i7 = i4;
                                }
                                y9q0VarB = k43Var2.b();
                                t33Var8 = t33Var7;
                                t33Var9 = t33Var4;
                                t33Var10 = t33Var3;
                                if (i7 != 0) {
                                    pu90Var = pu90VarS;
                                    c0dVar7 = c0dVar6;
                                    pu90Var2 = null;
                                    wz40Var12 = wz40Var21;
                                    wz40Var13 = wz40Var23;
                                    wz40Var14 = wz40Var25;
                                    t33Var11 = t33Var23;
                                    i8 = i18;
                                    i9 = i6;
                                    t33Var12 = t33Var22;
                                    z13 = z16;
                                    z14 = z17;
                                    t33Var13 = t33Var21;
                                    j = j2;
                                    wz40Var15 = wz40Var24;
                                    pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                                    if (pj30Var2 != null) {
                                        pu90VarS2 = pj30Var2.S(r4e.b(i4, i4, i4, i4, 15));
                                    }
                                    if (pu90VarS2 != null) {
                                        i10 = pu90VarS2.f27604a;
                                    } else {
                                        i10 = i4;
                                    }
                                    if (pu90VarS2 != null) {
                                        i11 = pu90VarS2.b;
                                    } else {
                                        i11 = i4;
                                    }
                                    zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    wz40Var16 = wz40Var12;
                                    t33Var14 = (t33) wz40Var16.f40005a;
                                    if (z13) {
                                        wz40Var17 = wz40Var14;
                                        str = (String) wz40Var17.f40005a;
                                    } else {
                                        str = str2;
                                        wz40Var17 = wz40Var14;
                                    }
                                    t33Var15 = (t33) wz40Var22.f40005a;
                                    final wz40 wz40Var27 = wz40Var13;
                                    t33Var16 = (t33) wz40Var27.f40005a;
                                    y9q0VarB2 = k43Var2.b();
                                    t33Var17 = t33Var5;
                                    if (zBooleanValue) {
                                        t33Var18 = t33Var17;
                                        pu90Var3 = pu90VarS2;
                                        wz40Var18 = wz40Var16;
                                        pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                        if (pj30Var != null) {
                                            t33Var8 = t33Var8;
                                            i12 = 0;
                                            pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                        }
                                        if (pu90VarS3 != null) {
                                            i13 = pu90VarS3.f27604a;
                                        } else {
                                            i13 = i12;
                                        }
                                        if (pu90VarS3 != null) {
                                            i14 = pu90VarS3.b;
                                        } else {
                                            i14 = i12;
                                        }
                                        int i19 = i9;
                                        int i20 = i8;
                                        int iC = idd.c(new int[]{i19, i14, i11}, i20);
                                        zcl zclVar = qmk.f28987a;
                                        int i21 = i14;
                                        int iW0 = (((int) c5n0Var.w0(2.0f)) * 2) + iC;
                                        int i22 = p4e.i(j);
                                        k6zVar2 = k6zVar;
                                        final i43 i43Var = new i43(i22, iW0, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i21, i20, i19, k6zVar2);
                                        i15 = i13;
                                        int i23 = i5;
                                        final wz40 wz40Var28 = wz40Var9;
                                        c0d c0dVar9 = (c0d) wz40Var28.f40005a;
                                        zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                        c0dVar9.getClass();
                                        c0dVar8 = c0dVar7;
                                        if (c0dVar8 == c0d.f3518a || !(c0dVar9 == c0d.d || c0dVar9 == c0d.e)) {
                                            z15 = false;
                                        } else {
                                            z15 = true;
                                        }
                                        if (c0dVar8 != c0d.b || c0dVar8 == c0d.c) {
                                            j43Var2 = j43Var3;
                                            wz40Var17 = wz40Var17;
                                            t33Var19 = t33Var10;
                                            wz40Var19 = wz40Var22;
                                            wz40Var20 = wz40Var26;
                                            if (zBooleanValue2) {
                                                fW0 = c5n0Var.w0(k43Var2.h());
                                            } else {
                                                fW0 = 0.0f;
                                            }
                                            f = i15 + i17 + fW0;
                                            k6zVar3 = k6z.b;
                                            if (k6zVar2 == k6zVar3) {
                                                f *= -1.0f;
                                            }
                                            fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                            if (k6zVar2 == k6zVar3) {
                                                fW1 *= -1.0f;
                                            }
                                            if (zBooleanValue2) {
                                                fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                                if (k6zVar2 == k6zVar3) {
                                                    fW3 *= -1.0f;
                                                }
                                            }
                                            r5m0Var = new r5m0(f, fW1, fW3);
                                        } else {
                                            c0d c0dVar10 = c0d.e;
                                            if (c0dVar8 == c0dVar10) {
                                                j43Var2 = j43Var3;
                                                float f2 = i15;
                                                float fW4 = c5n0Var.w0(2.0f) + c5n0Var.w0(k43Var2.f().a().f) + (zBooleanValue2 ? c5n0Var.w0(k43Var2.h()) : 0.0f) + f2;
                                                k6z k6zVar4 = k6z.b;
                                                if (k6zVar2 == k6zVar4) {
                                                    fW4 *= -1.0f;
                                                }
                                                t33Var19 = t33Var10;
                                                float f3 = fW4;
                                                wz40Var19 = wz40Var22;
                                                float F = x9x.F(c5n0Var, i43Var, k43Var2);
                                                wz40Var20 = wz40Var26;
                                                if (c0dVar9 == c0d.d || c0dVar9 == c0dVar10) {
                                                    fW2 = c5n0Var.w0(2.0f) + (-i23);
                                                } else {
                                                    fW2 = 0.0f;
                                                }
                                                if (k6zVar2 == k6zVar4) {
                                                    fW2 *= -1.0f;
                                                }
                                                if (zBooleanValue2) {
                                                    fW3 = c5n0Var.w0(k43Var2.h()) + f2;
                                                    if (k6zVar2 == k6zVar4) {
                                                        fW3 *= -1.0f;
                                                    }
                                                }
                                                r5m0Var = new q5m0(f3, F, fW2, fW3);
                                            } else {
                                                j43Var2 = j43Var3;
                                                wz40Var17 = wz40Var17;
                                                t33Var19 = t33Var10;
                                                wz40Var19 = wz40Var22;
                                                wz40Var20 = wz40Var26;
                                                if (c0dVar8 == c0d.d) {
                                                    r5m0Var = new p5m0(x9x.F(c5n0Var, i43Var, k43Var2));
                                                } else {
                                                    r5m0Var = z15 ? t5m0.f33375a : s5m0.f31661a;
                                                }
                                            }
                                        }
                                        final wz40 wz40Var29 = wz40Var3;
                                        wz40Var29.f40005a = r5m0Var;
                                        int i24 = p4e.i(j);
                                        final wz40 wz40Var30 = wz40Var8;
                                        final vne vneVar2 = vneVar;
                                        final long j3 = jN;
                                        final j43 j43Var4 = j43Var2;
                                        final boolean z19 = z13;
                                        final boolean z20 = z14;
                                        final wz40 wz40Var31 = wz40Var15;
                                        final t33 t33Var24 = t33Var13;
                                        final t33 t33Var25 = t33Var18;
                                        final wz40 wz40Var32 = wz40Var19;
                                        final t33 t33Var26 = t33Var19;
                                        final wz40 wz40Var33 = wz40Var20;
                                        final wz40 wz40Var34 = wz40Var18;
                                        final wz40 wz40Var35 = wz40Var17;
                                        final t33 t33Var27 = t33Var11;
                                        return vj30.x(c5n0Var, i24, iW0, new Function1() { // from class: a.l5m0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj7) {
                                                int density;
                                                int density2;
                                                c0d c0dVar11;
                                                ou90 ou90Var = (ou90) obj7;
                                                ou90Var.getClass();
                                                wz40 wz40Var36 = wz40Var28;
                                                c0d c0dVar12 = (c0d) wz40Var36.f40005a;
                                                boolean zBooleanValue3 = ((Boolean) wz40Var33.f40005a).booleanValue();
                                                k43 k43Var3 = k43Var2;
                                                if (zBooleanValue3) {
                                                    density = (int) (ou90Var.getDensity() * k43Var3.h());
                                                } else {
                                                    density = 0;
                                                }
                                                c0d c0dVar13 = c0d.e;
                                                c0d c0dVar14 = c0dVar8;
                                                i43 i43Var2 = i43Var;
                                                if (c0dVar14 == c0dVar13 && (c0dVar12 == c0d.d || c0dVar12 == c0dVar13)) {
                                                    density2 = i43Var2.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                                } else {
                                                    density2 = 0;
                                                }
                                                pu90 pu90Var4 = i43Var2.c;
                                                int i25 = i43Var2.b;
                                                if (pu90Var4 != null) {
                                                    ou90Var.m(pu90Var4, 0, (i25 / 2) - (i43Var2.k / 2), 0.0f);
                                                }
                                                pu90 pu90Var5 = i43Var2.e;
                                                if (pu90Var5 != null) {
                                                    ou90Var.m(pu90Var5, i43Var2.h + density, (i25 / 2) - (i43Var2.m / 2), 0.0f);
                                                }
                                                pu90 pu90Var6 = i43Var2.d;
                                                if (pu90Var6 != null) {
                                                    ou90Var.m(pu90Var6, density2, (i25 / 2) - (i43Var2.l / 2), 0.0f);
                                                }
                                                pu90 pu90Var7 = i43Var2.f;
                                                if (pu90Var7 != null) {
                                                    ou90Var.m(pu90Var7, 0, (i25 / 2) - (i43Var2.n / 2), 0.0f);
                                                }
                                                if (c0dVar14 == c0dVar13 || !(z19 || z20)) {
                                                    wz40 wz40Var37 = wz40Var30;
                                                    bby bbyVar = (bby) wz40Var37.f40005a;
                                                    if (bbyVar != null) {
                                                        bbyVar.cancel(null);
                                                    }
                                                    t33 t33Var28 = (t33) wz40Var34.f40005a;
                                                    t33 t33Var29 = (t33) wz40Var32.f40005a;
                                                    t33 t33Var30 = (t33) wz40Var31.f40005a;
                                                    t33 t33Var31 = (t33) wz40Var27.f40005a;
                                                    c0d c0dVar15 = (c0d) wz40Var36.f40005a;
                                                    u5m0 u5m0Var = (u5m0) wz40Var29.f40005a;
                                                    vne vneVar3 = vneVar2;
                                                    vneVar3.getClass();
                                                    c0dVar15.getClass();
                                                    u5m0Var.getClass();
                                                    t33 t33Var32 = t33Var24;
                                                    t33Var32.getClass();
                                                    t33 t33Var33 = t33Var12;
                                                    t33Var33.getClass();
                                                    t33Var28.getClass();
                                                    t33 t33Var34 = t33Var8;
                                                    t33Var34.getClass();
                                                    t33 t33Var35 = t33Var26;
                                                    t33Var35.getClass();
                                                    t33Var29.getClass();
                                                    t33 t33Var36 = t33Var9;
                                                    t33Var36.getClass();
                                                    t33 t33Var37 = t33Var25;
                                                    t33Var37.getClass();
                                                    t33Var30.getClass();
                                                    t33 t33Var38 = t33Var27;
                                                    t33Var38.getClass();
                                                    t33Var31.getClass();
                                                    c0dVar11 = c0dVar14;
                                                    wz40Var37.f40005a = qjj.W(vneVar3, null, null, new z5m0(u5m0Var, k43Var3, j3, t33Var32, t33Var28, t33Var34, t33Var35, t33Var29, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar15, t33Var33, t33Var38, null), 3);
                                                } else {
                                                    c0dVar11 = c0dVar14;
                                                }
                                                wz40Var36.f40005a = c0dVar11;
                                                wz40Var35.f40005a = j43Var4.b;
                                                return Unit.f46060a;
                                            }
                                        });
                                    }
                                    pu90Var3 = pu90VarS2;
                                    wz40Var18 = wz40Var16;
                                    t33Var18 = t33Var17;
                                    i12 = 0;
                                    pu90VarS3 = pu90Var2;
                                    if (pu90VarS3 != null) {
                                        i13 = pu90VarS3.f27604a;
                                    } else {
                                        i13 = i12;
                                    }
                                    if (pu90VarS3 != null) {
                                        i14 = pu90VarS3.b;
                                    } else {
                                        i14 = i12;
                                    }
                                    int i110 = i9;
                                    int i25 = i8;
                                    int iC2 = idd.c(new int[]{i110, i14, i11}, i25);
                                    zcl zclVar2 = qmk.f28987a;
                                    int i26 = i14;
                                    int iW1 = (((int) c5n0Var.w0(2.0f)) * 2) + iC2;
                                    int i27 = p4e.i(j);
                                    k6zVar2 = k6zVar;
                                    final i43 i43Var2 = new i43(i27, iW1, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i26, i25, i110, k6zVar2);
                                    i15 = i13;
                                    int i28 = i5;
                                    final wz40 wz40Var210 = wz40Var9;
                                    c0d c0dVar11 = (c0d) wz40Var210.f40005a;
                                    zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    c0dVar11.getClass();
                                    c0dVar8 = c0dVar7;
                                    if (c0dVar8 == c0d.f3518a) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    if (c0dVar8 != c0d.b) {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    } else {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    }
                                    final wz40 wz40Var211 = wz40Var3;
                                    wz40Var211.f40005a = r5m0Var;
                                    int i29 = p4e.i(j);
                                    final wz40 wz40Var36 = wz40Var8;
                                    final vne vneVar3 = vneVar;
                                    final long j4 = jN;
                                    final j43 j43Var5 = j43Var2;
                                    final boolean z110 = z13;
                                    final boolean z21 = z14;
                                    final wz40 wz40Var37 = wz40Var15;
                                    final t33 t33Var28 = t33Var13;
                                    final t33 t33Var29 = t33Var18;
                                    final wz40 wz40Var38 = wz40Var19;
                                    final t33 t33Var210 = t33Var19;
                                    final wz40 wz40Var39 = wz40Var20;
                                    final wz40 wz40Var310 = wz40Var18;
                                    final wz40 wz40Var311 = wz40Var17;
                                    final t33 t33Var211 = t33Var11;
                                    return vj30.x(c5n0Var, i29, iW1, new Function1() { // from class: a.l5m0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            int density;
                                            int density2;
                                            c0d c0dVar12;
                                            ou90 ou90Var = (ou90) obj7;
                                            ou90Var.getClass();
                                            wz40 wz40Var312 = wz40Var210;
                                            c0d c0dVar13 = (c0d) wz40Var312.f40005a;
                                            boolean zBooleanValue3 = ((Boolean) wz40Var39.f40005a).booleanValue();
                                            k43 k43Var3 = k43Var2;
                                            if (zBooleanValue3) {
                                                density = (int) (ou90Var.getDensity() * k43Var3.h());
                                            } else {
                                                density = 0;
                                            }
                                            c0d c0dVar14 = c0d.e;
                                            c0d c0dVar15 = c0dVar8;
                                            i43 i43Var3 = i43Var2;
                                            if (c0dVar15 == c0dVar14 && (c0dVar13 == c0d.d || c0dVar13 == c0dVar14)) {
                                                density2 = i43Var3.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                            } else {
                                                density2 = 0;
                                            }
                                            pu90 pu90Var4 = i43Var3.c;
                                            int i210 = i43Var3.b;
                                            if (pu90Var4 != null) {
                                                ou90Var.m(pu90Var4, 0, (i210 / 2) - (i43Var3.k / 2), 0.0f);
                                            }
                                            pu90 pu90Var5 = i43Var3.e;
                                            if (pu90Var5 != null) {
                                                ou90Var.m(pu90Var5, i43Var3.h + density, (i210 / 2) - (i43Var3.m / 2), 0.0f);
                                            }
                                            pu90 pu90Var6 = i43Var3.d;
                                            if (pu90Var6 != null) {
                                                ou90Var.m(pu90Var6, density2, (i210 / 2) - (i43Var3.l / 2), 0.0f);
                                            }
                                            pu90 pu90Var7 = i43Var3.f;
                                            if (pu90Var7 != null) {
                                                ou90Var.m(pu90Var7, 0, (i210 / 2) - (i43Var3.n / 2), 0.0f);
                                            }
                                            if (c0dVar15 == c0dVar14 || !(z110 || z21)) {
                                                wz40 wz40Var313 = wz40Var36;
                                                bby bbyVar = (bby) wz40Var313.f40005a;
                                                if (bbyVar != null) {
                                                    bbyVar.cancel(null);
                                                }
                                                t33 t33Var212 = (t33) wz40Var310.f40005a;
                                                t33 t33Var213 = (t33) wz40Var38.f40005a;
                                                t33 t33Var30 = (t33) wz40Var37.f40005a;
                                                t33 t33Var31 = (t33) wz40Var27.f40005a;
                                                c0d c0dVar16 = (c0d) wz40Var312.f40005a;
                                                u5m0 u5m0Var = (u5m0) wz40Var211.f40005a;
                                                vne vneVar4 = vneVar3;
                                                vneVar4.getClass();
                                                c0dVar16.getClass();
                                                u5m0Var.getClass();
                                                t33 t33Var32 = t33Var28;
                                                t33Var32.getClass();
                                                t33 t33Var33 = t33Var12;
                                                t33Var33.getClass();
                                                t33Var212.getClass();
                                                t33 t33Var34 = t33Var8;
                                                t33Var34.getClass();
                                                t33 t33Var35 = t33Var210;
                                                t33Var35.getClass();
                                                t33Var213.getClass();
                                                t33 t33Var36 = t33Var9;
                                                t33Var36.getClass();
                                                t33 t33Var37 = t33Var29;
                                                t33Var37.getClass();
                                                t33Var30.getClass();
                                                t33 t33Var38 = t33Var211;
                                                t33Var38.getClass();
                                                t33Var31.getClass();
                                                c0dVar12 = c0dVar15;
                                                wz40Var313.f40005a = qjj.W(vneVar4, null, null, new z5m0(u5m0Var, k43Var3, j4, t33Var32, t33Var212, t33Var34, t33Var35, t33Var213, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar16, t33Var33, t33Var38, null), 3);
                                            } else {
                                                c0dVar12 = c0dVar15;
                                            }
                                            wz40Var312.f40005a = c0dVar12;
                                            wz40Var311.f40005a = j43Var5.b;
                                            return Unit.f46060a;
                                        }
                                    });
                                }
                                pu90Var = pu90VarS;
                                c0dVar7 = c0dVar6;
                                pu90Var2 = null;
                                wz40Var12 = wz40Var21;
                                wz40Var13 = wz40Var23;
                                wz40Var14 = wz40Var25;
                                t33Var11 = t33Var23;
                                i8 = i18;
                                i9 = i6;
                                t33Var12 = t33Var22;
                                z13 = z16;
                                z14 = z17;
                                t33Var13 = t33Var21;
                                j = j2;
                                wz40Var15 = wz40Var24;
                                pu90VarS2 = pu90Var2;
                                if (pu90VarS2 != null) {
                                    i10 = pu90VarS2.f27604a;
                                } else {
                                    i10 = i4;
                                }
                                if (pu90VarS2 != null) {
                                    i11 = pu90VarS2.b;
                                } else {
                                    i11 = i4;
                                }
                                zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                                wz40Var16 = wz40Var12;
                                t33Var14 = (t33) wz40Var16.f40005a;
                                if (z13) {
                                    str = str2;
                                    wz40Var17 = wz40Var14;
                                } else {
                                    wz40Var17 = wz40Var14;
                                    str = (String) wz40Var17.f40005a;
                                }
                                t33Var15 = (t33) wz40Var22.f40005a;
                                final wz40 wz40Var212 = wz40Var13;
                                t33Var16 = (t33) wz40Var212.f40005a;
                                y9q0VarB2 = k43Var2.b();
                                t33Var17 = t33Var5;
                                if (zBooleanValue) {
                                    t33Var18 = t33Var17;
                                    pu90Var3 = pu90VarS2;
                                    wz40Var18 = wz40Var16;
                                    pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                    if (pj30Var != null) {
                                        t33Var8 = t33Var8;
                                        i12 = 0;
                                        pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                    }
                                    if (pu90VarS3 != null) {
                                        i13 = pu90VarS3.f27604a;
                                    } else {
                                        i13 = i12;
                                    }
                                    if (pu90VarS3 != null) {
                                        i14 = pu90VarS3.b;
                                    } else {
                                        i14 = i12;
                                    }
                                    int i111 = i9;
                                    int i210 = i8;
                                    int iC3 = idd.c(new int[]{i111, i14, i11}, i210);
                                    zcl zclVar3 = qmk.f28987a;
                                    int i211 = i14;
                                    int iW2 = (((int) c5n0Var.w0(2.0f)) * 2) + iC3;
                                    int i212 = p4e.i(j);
                                    k6zVar2 = k6zVar;
                                    final i43 i43Var3 = new i43(i212, iW2, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i211, i210, i111, k6zVar2);
                                    i15 = i13;
                                    int i213 = i5;
                                    final wz40 wz40Var213 = wz40Var9;
                                    c0d c0dVar12 = (c0d) wz40Var213.f40005a;
                                    zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    c0dVar12.getClass();
                                    c0dVar8 = c0dVar7;
                                    if (c0dVar8 == c0d.f3518a) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    if (c0dVar8 != c0d.b) {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    } else {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    }
                                    final wz40 wz40Var214 = wz40Var3;
                                    wz40Var214.f40005a = r5m0Var;
                                    int i214 = p4e.i(j);
                                    final wz40 wz40Var312 = wz40Var8;
                                    final vne vneVar4 = vneVar;
                                    final long j5 = jN;
                                    final j43 j43Var6 = j43Var2;
                                    final boolean z111 = z13;
                                    final boolean z22 = z14;
                                    final wz40 wz40Var313 = wz40Var15;
                                    final t33 t33Var212 = t33Var13;
                                    final t33 t33Var213 = t33Var18;
                                    final wz40 wz40Var314 = wz40Var19;
                                    final t33 t33Var214 = t33Var19;
                                    final wz40 wz40Var315 = wz40Var20;
                                    final wz40 wz40Var316 = wz40Var18;
                                    final wz40 wz40Var317 = wz40Var17;
                                    final t33 t33Var215 = t33Var11;
                                    return vj30.x(c5n0Var, i214, iW2, new Function1() { // from class: a.l5m0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            int density;
                                            int density2;
                                            c0d c0dVar13;
                                            ou90 ou90Var = (ou90) obj7;
                                            ou90Var.getClass();
                                            wz40 wz40Var318 = wz40Var213;
                                            c0d c0dVar14 = (c0d) wz40Var318.f40005a;
                                            boolean zBooleanValue3 = ((Boolean) wz40Var315.f40005a).booleanValue();
                                            k43 k43Var3 = k43Var2;
                                            if (zBooleanValue3) {
                                                density = (int) (ou90Var.getDensity() * k43Var3.h());
                                            } else {
                                                density = 0;
                                            }
                                            c0d c0dVar15 = c0d.e;
                                            c0d c0dVar16 = c0dVar8;
                                            i43 i43Var4 = i43Var3;
                                            if (c0dVar16 == c0dVar15 && (c0dVar14 == c0d.d || c0dVar14 == c0dVar15)) {
                                                density2 = i43Var4.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                            } else {
                                                density2 = 0;
                                            }
                                            pu90 pu90Var4 = i43Var4.c;
                                            int i215 = i43Var4.b;
                                            if (pu90Var4 != null) {
                                                ou90Var.m(pu90Var4, 0, (i215 / 2) - (i43Var4.k / 2), 0.0f);
                                            }
                                            pu90 pu90Var5 = i43Var4.e;
                                            if (pu90Var5 != null) {
                                                ou90Var.m(pu90Var5, i43Var4.h + density, (i215 / 2) - (i43Var4.m / 2), 0.0f);
                                            }
                                            pu90 pu90Var6 = i43Var4.d;
                                            if (pu90Var6 != null) {
                                                ou90Var.m(pu90Var6, density2, (i215 / 2) - (i43Var4.l / 2), 0.0f);
                                            }
                                            pu90 pu90Var7 = i43Var4.f;
                                            if (pu90Var7 != null) {
                                                ou90Var.m(pu90Var7, 0, (i215 / 2) - (i43Var4.n / 2), 0.0f);
                                            }
                                            if (c0dVar16 == c0dVar15 || !(z111 || z22)) {
                                                wz40 wz40Var319 = wz40Var312;
                                                bby bbyVar = (bby) wz40Var319.f40005a;
                                                if (bbyVar != null) {
                                                    bbyVar.cancel(null);
                                                }
                                                t33 t33Var216 = (t33) wz40Var316.f40005a;
                                                t33 t33Var217 = (t33) wz40Var314.f40005a;
                                                t33 t33Var30 = (t33) wz40Var313.f40005a;
                                                t33 t33Var31 = (t33) wz40Var212.f40005a;
                                                c0d c0dVar17 = (c0d) wz40Var318.f40005a;
                                                u5m0 u5m0Var = (u5m0) wz40Var214.f40005a;
                                                vne vneVar5 = vneVar4;
                                                vneVar5.getClass();
                                                c0dVar17.getClass();
                                                u5m0Var.getClass();
                                                t33 t33Var32 = t33Var212;
                                                t33Var32.getClass();
                                                t33 t33Var33 = t33Var12;
                                                t33Var33.getClass();
                                                t33Var216.getClass();
                                                t33 t33Var34 = t33Var8;
                                                t33Var34.getClass();
                                                t33 t33Var35 = t33Var214;
                                                t33Var35.getClass();
                                                t33Var217.getClass();
                                                t33 t33Var36 = t33Var9;
                                                t33Var36.getClass();
                                                t33 t33Var37 = t33Var213;
                                                t33Var37.getClass();
                                                t33Var30.getClass();
                                                t33 t33Var38 = t33Var215;
                                                t33Var38.getClass();
                                                t33Var31.getClass();
                                                c0dVar13 = c0dVar16;
                                                wz40Var319.f40005a = qjj.W(vneVar5, null, null, new z5m0(u5m0Var, k43Var3, j5, t33Var32, t33Var216, t33Var34, t33Var35, t33Var217, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar17, t33Var33, t33Var38, null), 3);
                                            } else {
                                                c0dVar13 = c0dVar16;
                                            }
                                            wz40Var318.f40005a = c0dVar13;
                                            wz40Var317.f40005a = j43Var6.b;
                                            return Unit.f46060a;
                                        }
                                    });
                                }
                                pu90Var3 = pu90VarS2;
                                wz40Var18 = wz40Var16;
                                t33Var18 = t33Var17;
                                i12 = 0;
                                pu90VarS3 = pu90Var2;
                                if (pu90VarS3 != null) {
                                    i13 = pu90VarS3.f27604a;
                                } else {
                                    i13 = i12;
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.b;
                                } else {
                                    i14 = i12;
                                }
                                int i112 = i9;
                                int i215 = i8;
                                int iC4 = idd.c(new int[]{i112, i14, i11}, i215);
                                zcl zclVar4 = qmk.f28987a;
                                int i216 = i14;
                                int iW3 = (((int) c5n0Var.w0(2.0f)) * 2) + iC4;
                                int i217 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var4 = new i43(i217, iW3, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i216, i215, i112, k6zVar2);
                                i15 = i13;
                                int i218 = i5;
                                final wz40 wz40Var215 = wz40Var9;
                                c0d c0dVar13 = (c0d) wz40Var215.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar13.getClass();
                                c0dVar8 = c0dVar7;
                                if (c0dVar8 == c0d.f3518a) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (c0dVar8 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var216 = wz40Var3;
                                wz40Var216.f40005a = r5m0Var;
                                int i219 = p4e.i(j);
                                final wz40 wz40Var318 = wz40Var8;
                                final vne vneVar5 = vneVar;
                                final long j6 = jN;
                                final j43 j43Var7 = j43Var2;
                                final boolean z112 = z13;
                                final boolean z23 = z14;
                                final wz40 wz40Var319 = wz40Var15;
                                final t33 t33Var216 = t33Var13;
                                final t33 t33Var217 = t33Var18;
                                final wz40 wz40Var3110 = wz40Var19;
                                final t33 t33Var218 = t33Var19;
                                final wz40 wz40Var3111 = wz40Var20;
                                final wz40 wz40Var3112 = wz40Var18;
                                final wz40 wz40Var3113 = wz40Var17;
                                final t33 t33Var219 = t33Var11;
                                return vj30.x(c5n0Var, i219, iW3, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar14;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var3114 = wz40Var215;
                                        c0d c0dVar15 = (c0d) wz40Var3114.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var3111.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar16 = c0d.e;
                                        c0d c0dVar17 = c0dVar8;
                                        i43 i43Var5 = i43Var4;
                                        if (c0dVar17 == c0dVar16 && (c0dVar15 == c0d.d || c0dVar15 == c0dVar16)) {
                                            density2 = i43Var5.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var5.c;
                                        int i2110 = i43Var5.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i2110 / 2) - (i43Var5.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var5.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var5.h + density, (i2110 / 2) - (i43Var5.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var5.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i2110 / 2) - (i43Var5.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var5.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i2110 / 2) - (i43Var5.n / 2), 0.0f);
                                        }
                                        if (c0dVar17 == c0dVar16 || !(z112 || z23)) {
                                            wz40 wz40Var3115 = wz40Var318;
                                            bby bbyVar = (bby) wz40Var3115.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var2110 = (t33) wz40Var3112.f40005a;
                                            t33 t33Var2111 = (t33) wz40Var3110.f40005a;
                                            t33 t33Var30 = (t33) wz40Var319.f40005a;
                                            t33 t33Var31 = (t33) wz40Var212.f40005a;
                                            c0d c0dVar18 = (c0d) wz40Var3114.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var216.f40005a;
                                            vne vneVar6 = vneVar5;
                                            vneVar6.getClass();
                                            c0dVar18.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var216;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var2110.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var218;
                                            t33Var35.getClass();
                                            t33Var2111.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var217;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var219;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar14 = c0dVar17;
                                            wz40Var3115.f40005a = qjj.W(vneVar6, null, null, new z5m0(u5m0Var, k43Var3, j6, t33Var32, t33Var2110, t33Var34, t33Var35, t33Var2111, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar18, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar14 = c0dVar17;
                                        }
                                        wz40Var3114.f40005a = c0dVar14;
                                        wz40Var3113.f40005a = j43Var7.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            i4 = 0;
                            pu90VarS = null;
                            if (pu90VarS != null) {
                                i5 = pu90VarS.f27604a;
                            } else {
                                i5 = i4;
                            }
                            if (pu90VarS != null) {
                                i6 = pu90VarS.b;
                            } else {
                                i6 = i4;
                            }
                            c0dVar5 = c0d.f;
                            c0dVar6 = c0dVar;
                            if (c0dVar6 != c0dVar5) {
                                i7 = 1;
                            } else {
                                i7 = i4;
                            }
                            y9q0VarB = k43Var2.b();
                            t33Var8 = t33Var7;
                            t33Var9 = t33Var4;
                            t33Var10 = t33Var3;
                            if (i7 != 0) {
                                pu90Var = pu90VarS;
                                c0dVar7 = c0dVar6;
                                pu90Var2 = null;
                                wz40Var12 = wz40Var21;
                                wz40Var13 = wz40Var23;
                                wz40Var14 = wz40Var25;
                                t33Var11 = t33Var23;
                                i8 = i18;
                                i9 = i6;
                                t33Var12 = t33Var22;
                                z13 = z16;
                                z14 = z17;
                                t33Var13 = t33Var21;
                                j = j2;
                                wz40Var15 = wz40Var24;
                                pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                                if (pj30Var2 != null) {
                                    pu90VarS2 = pj30Var2.S(r4e.b(i4, i4, i4, i4, 15));
                                }
                                if (pu90VarS2 != null) {
                                    i10 = pu90VarS2.f27604a;
                                } else {
                                    i10 = i4;
                                }
                                if (pu90VarS2 != null) {
                                    i11 = pu90VarS2.b;
                                } else {
                                    i11 = i4;
                                }
                                zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                                wz40Var16 = wz40Var12;
                                t33Var14 = (t33) wz40Var16.f40005a;
                                if (z13) {
                                    str = str2;
                                    wz40Var17 = wz40Var14;
                                } else {
                                    wz40Var17 = wz40Var14;
                                    str = (String) wz40Var17.f40005a;
                                }
                                t33Var15 = (t33) wz40Var22.f40005a;
                                final wz40 wz40Var217 = wz40Var13;
                                t33Var16 = (t33) wz40Var217.f40005a;
                                y9q0VarB2 = k43Var2.b();
                                t33Var17 = t33Var5;
                                if (zBooleanValue) {
                                    t33Var18 = t33Var17;
                                    pu90Var3 = pu90VarS2;
                                    wz40Var18 = wz40Var16;
                                    pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                    if (pj30Var != null) {
                                        t33Var8 = t33Var8;
                                        i12 = 0;
                                        pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                    }
                                    if (pu90VarS3 != null) {
                                        i13 = pu90VarS3.f27604a;
                                    } else {
                                        i13 = i12;
                                    }
                                    if (pu90VarS3 != null) {
                                        i14 = pu90VarS3.b;
                                    } else {
                                        i14 = i12;
                                    }
                                    int i113 = i9;
                                    int i2110 = i8;
                                    int iC5 = idd.c(new int[]{i113, i14, i11}, i2110);
                                    zcl zclVar5 = qmk.f28987a;
                                    int i2111 = i14;
                                    int iW4 = (((int) c5n0Var.w0(2.0f)) * 2) + iC5;
                                    int i2112 = p4e.i(j);
                                    k6zVar2 = k6zVar;
                                    final i43 i43Var5 = new i43(i2112, iW4, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i2111, i2110, i113, k6zVar2);
                                    i15 = i13;
                                    int i2113 = i5;
                                    final wz40 wz40Var218 = wz40Var9;
                                    c0d c0dVar14 = (c0d) wz40Var218.f40005a;
                                    zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    c0dVar14.getClass();
                                    c0dVar8 = c0dVar7;
                                    if (c0dVar8 == c0d.f3518a) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    if (c0dVar8 != c0d.b) {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    } else {
                                        j43Var2 = j43Var3;
                                        wz40Var17 = wz40Var17;
                                        t33Var19 = t33Var10;
                                        wz40Var19 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i15 + i17 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    }
                                    final wz40 wz40Var219 = wz40Var3;
                                    wz40Var219.f40005a = r5m0Var;
                                    int i2114 = p4e.i(j);
                                    final wz40 wz40Var3114 = wz40Var8;
                                    final vne vneVar6 = vneVar;
                                    final long j7 = jN;
                                    final j43 j43Var8 = j43Var2;
                                    final boolean z113 = z13;
                                    final boolean z24 = z14;
                                    final wz40 wz40Var3115 = wz40Var15;
                                    final t33 t33Var2110 = t33Var13;
                                    final t33 t33Var2111 = t33Var18;
                                    final wz40 wz40Var3116 = wz40Var19;
                                    final t33 t33Var2112 = t33Var19;
                                    final wz40 wz40Var3117 = wz40Var20;
                                    final wz40 wz40Var3118 = wz40Var18;
                                    final wz40 wz40Var3119 = wz40Var17;
                                    final t33 t33Var2113 = t33Var11;
                                    return vj30.x(c5n0Var, i2114, iW4, new Function1() { // from class: a.l5m0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            int density;
                                            int density2;
                                            c0d c0dVar15;
                                            ou90 ou90Var = (ou90) obj7;
                                            ou90Var.getClass();
                                            wz40 wz40Var31110 = wz40Var218;
                                            c0d c0dVar16 = (c0d) wz40Var31110.f40005a;
                                            boolean zBooleanValue3 = ((Boolean) wz40Var3117.f40005a).booleanValue();
                                            k43 k43Var3 = k43Var2;
                                            if (zBooleanValue3) {
                                                density = (int) (ou90Var.getDensity() * k43Var3.h());
                                            } else {
                                                density = 0;
                                            }
                                            c0d c0dVar17 = c0d.e;
                                            c0d c0dVar18 = c0dVar8;
                                            i43 i43Var6 = i43Var5;
                                            if (c0dVar18 == c0dVar17 && (c0dVar16 == c0d.d || c0dVar16 == c0dVar17)) {
                                                density2 = i43Var6.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                            } else {
                                                density2 = 0;
                                            }
                                            pu90 pu90Var4 = i43Var6.c;
                                            int i2115 = i43Var6.b;
                                            if (pu90Var4 != null) {
                                                ou90Var.m(pu90Var4, 0, (i2115 / 2) - (i43Var6.k / 2), 0.0f);
                                            }
                                            pu90 pu90Var5 = i43Var6.e;
                                            if (pu90Var5 != null) {
                                                ou90Var.m(pu90Var5, i43Var6.h + density, (i2115 / 2) - (i43Var6.m / 2), 0.0f);
                                            }
                                            pu90 pu90Var6 = i43Var6.d;
                                            if (pu90Var6 != null) {
                                                ou90Var.m(pu90Var6, density2, (i2115 / 2) - (i43Var6.l / 2), 0.0f);
                                            }
                                            pu90 pu90Var7 = i43Var6.f;
                                            if (pu90Var7 != null) {
                                                ou90Var.m(pu90Var7, 0, (i2115 / 2) - (i43Var6.n / 2), 0.0f);
                                            }
                                            if (c0dVar18 == c0dVar17 || !(z113 || z24)) {
                                                wz40 wz40Var31111 = wz40Var3114;
                                                bby bbyVar = (bby) wz40Var31111.f40005a;
                                                if (bbyVar != null) {
                                                    bbyVar.cancel(null);
                                                }
                                                t33 t33Var2114 = (t33) wz40Var3118.f40005a;
                                                t33 t33Var2115 = (t33) wz40Var3116.f40005a;
                                                t33 t33Var30 = (t33) wz40Var3115.f40005a;
                                                t33 t33Var31 = (t33) wz40Var217.f40005a;
                                                c0d c0dVar19 = (c0d) wz40Var31110.f40005a;
                                                u5m0 u5m0Var = (u5m0) wz40Var219.f40005a;
                                                vne vneVar7 = vneVar6;
                                                vneVar7.getClass();
                                                c0dVar19.getClass();
                                                u5m0Var.getClass();
                                                t33 t33Var32 = t33Var2110;
                                                t33Var32.getClass();
                                                t33 t33Var33 = t33Var12;
                                                t33Var33.getClass();
                                                t33Var2114.getClass();
                                                t33 t33Var34 = t33Var8;
                                                t33Var34.getClass();
                                                t33 t33Var35 = t33Var2112;
                                                t33Var35.getClass();
                                                t33Var2115.getClass();
                                                t33 t33Var36 = t33Var9;
                                                t33Var36.getClass();
                                                t33 t33Var37 = t33Var2111;
                                                t33Var37.getClass();
                                                t33Var30.getClass();
                                                t33 t33Var38 = t33Var2113;
                                                t33Var38.getClass();
                                                t33Var31.getClass();
                                                c0dVar15 = c0dVar18;
                                                wz40Var31111.f40005a = qjj.W(vneVar7, null, null, new z5m0(u5m0Var, k43Var3, j7, t33Var32, t33Var2114, t33Var34, t33Var35, t33Var2115, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar19, t33Var33, t33Var38, null), 3);
                                            } else {
                                                c0dVar15 = c0dVar18;
                                            }
                                            wz40Var31110.f40005a = c0dVar15;
                                            wz40Var3119.f40005a = j43Var8.b;
                                            return Unit.f46060a;
                                        }
                                    });
                                }
                                pu90Var3 = pu90VarS2;
                                wz40Var18 = wz40Var16;
                                t33Var18 = t33Var17;
                                i12 = 0;
                                pu90VarS3 = pu90Var2;
                                if (pu90VarS3 != null) {
                                    i13 = pu90VarS3.f27604a;
                                } else {
                                    i13 = i12;
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.b;
                                } else {
                                    i14 = i12;
                                }
                                int i114 = i9;
                                int i2115 = i8;
                                int iC6 = idd.c(new int[]{i114, i14, i11}, i2115);
                                zcl zclVar6 = qmk.f28987a;
                                int i2116 = i14;
                                int iW5 = (((int) c5n0Var.w0(2.0f)) * 2) + iC6;
                                int i2117 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var6 = new i43(i2117, iW5, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i2116, i2115, i114, k6zVar2);
                                i15 = i13;
                                int i2118 = i5;
                                final wz40 wz40Var2110 = wz40Var9;
                                c0d c0dVar15 = (c0d) wz40Var2110.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar15.getClass();
                                c0dVar8 = c0dVar7;
                                if (c0dVar8 == c0d.f3518a) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (c0dVar8 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var2111 = wz40Var3;
                                wz40Var2111.f40005a = r5m0Var;
                                int i2119 = p4e.i(j);
                                final wz40 wz40Var31110 = wz40Var8;
                                final vne vneVar7 = vneVar;
                                final long j8 = jN;
                                final j43 j43Var9 = j43Var2;
                                final boolean z114 = z13;
                                final boolean z25 = z14;
                                final wz40 wz40Var31111 = wz40Var15;
                                final t33 t33Var2114 = t33Var13;
                                final t33 t33Var2115 = t33Var18;
                                final wz40 wz40Var31112 = wz40Var19;
                                final t33 t33Var2116 = t33Var19;
                                final wz40 wz40Var31113 = wz40Var20;
                                final wz40 wz40Var31114 = wz40Var18;
                                final wz40 wz40Var31115 = wz40Var17;
                                final t33 t33Var2117 = t33Var11;
                                return vj30.x(c5n0Var, i2119, iW5, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar16;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var31116 = wz40Var2110;
                                        c0d c0dVar17 = (c0d) wz40Var31116.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var31113.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar18 = c0d.e;
                                        c0d c0dVar19 = c0dVar8;
                                        i43 i43Var7 = i43Var6;
                                        if (c0dVar19 == c0dVar18 && (c0dVar17 == c0d.d || c0dVar17 == c0dVar18)) {
                                            density2 = i43Var7.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var7.c;
                                        int i21110 = i43Var7.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i21110 / 2) - (i43Var7.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var7.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var7.h + density, (i21110 / 2) - (i43Var7.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var7.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i21110 / 2) - (i43Var7.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var7.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i21110 / 2) - (i43Var7.n / 2), 0.0f);
                                        }
                                        if (c0dVar19 == c0dVar18 || !(z114 || z25)) {
                                            wz40 wz40Var31117 = wz40Var31110;
                                            bby bbyVar = (bby) wz40Var31117.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var2118 = (t33) wz40Var31114.f40005a;
                                            t33 t33Var2119 = (t33) wz40Var31112.f40005a;
                                            t33 t33Var30 = (t33) wz40Var31111.f40005a;
                                            t33 t33Var31 = (t33) wz40Var217.f40005a;
                                            c0d c0dVar110 = (c0d) wz40Var31116.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var2111.f40005a;
                                            vne vneVar8 = vneVar7;
                                            vneVar8.getClass();
                                            c0dVar110.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var2114;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var2118.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var2116;
                                            t33Var35.getClass();
                                            t33Var2119.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var2115;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var2117;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar16 = c0dVar19;
                                            wz40Var31117.f40005a = qjj.W(vneVar8, null, null, new z5m0(u5m0Var, k43Var3, j8, t33Var32, t33Var2118, t33Var34, t33Var35, t33Var2119, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar110, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar16 = c0dVar19;
                                        }
                                        wz40Var31116.f40005a = c0dVar16;
                                        wz40Var31115.f40005a = j43Var9.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var = pu90VarS;
                            c0dVar7 = c0dVar6;
                            pu90Var2 = null;
                            wz40Var12 = wz40Var21;
                            wz40Var13 = wz40Var23;
                            wz40Var14 = wz40Var25;
                            t33Var11 = t33Var23;
                            i8 = i18;
                            i9 = i6;
                            t33Var12 = t33Var22;
                            z13 = z16;
                            z14 = z17;
                            t33Var13 = t33Var21;
                            j = j2;
                            wz40Var15 = wz40Var24;
                            pu90VarS2 = pu90Var2;
                            if (pu90VarS2 != null) {
                                i10 = pu90VarS2.f27604a;
                            } else {
                                i10 = i4;
                            }
                            if (pu90VarS2 != null) {
                                i11 = pu90VarS2.b;
                            } else {
                                i11 = i4;
                            }
                            zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                            wz40Var16 = wz40Var12;
                            t33Var14 = (t33) wz40Var16.f40005a;
                            if (z13) {
                                str = str2;
                                wz40Var17 = wz40Var14;
                            } else {
                                wz40Var17 = wz40Var14;
                                str = (String) wz40Var17.f40005a;
                            }
                            t33Var15 = (t33) wz40Var22.f40005a;
                            final wz40 wz40Var2112 = wz40Var13;
                            t33Var16 = (t33) wz40Var2112.f40005a;
                            y9q0VarB2 = k43Var2.b();
                            t33Var17 = t33Var5;
                            if (zBooleanValue) {
                                t33Var18 = t33Var17;
                                pu90Var3 = pu90VarS2;
                                wz40Var18 = wz40Var16;
                                pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                if (pj30Var != null) {
                                    t33Var8 = t33Var8;
                                    i12 = 0;
                                    pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                }
                                if (pu90VarS3 != null) {
                                    i13 = pu90VarS3.f27604a;
                                } else {
                                    i13 = i12;
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.b;
                                } else {
                                    i14 = i12;
                                }
                                int i115 = i9;
                                int i21110 = i8;
                                int iC7 = idd.c(new int[]{i115, i14, i11}, i21110);
                                zcl zclVar7 = qmk.f28987a;
                                int i21111 = i14;
                                int iW6 = (((int) c5n0Var.w0(2.0f)) * 2) + iC7;
                                int i21112 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var7 = new i43(i21112, iW6, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i21111, i21110, i115, k6zVar2);
                                i15 = i13;
                                int i21113 = i5;
                                final wz40 wz40Var2113 = wz40Var9;
                                c0d c0dVar16 = (c0d) wz40Var2113.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar16.getClass();
                                c0dVar8 = c0dVar7;
                                if (c0dVar8 == c0d.f3518a) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (c0dVar8 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var17 = wz40Var17;
                                    t33Var19 = t33Var10;
                                    wz40Var19 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i15 + i17 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var2114 = wz40Var3;
                                wz40Var2114.f40005a = r5m0Var;
                                int i21114 = p4e.i(j);
                                final wz40 wz40Var31116 = wz40Var8;
                                final vne vneVar8 = vneVar;
                                final long j9 = jN;
                                final j43 j43Var10 = j43Var2;
                                final boolean z115 = z13;
                                final boolean z26 = z14;
                                final wz40 wz40Var31117 = wz40Var15;
                                final t33 t33Var2118 = t33Var13;
                                final t33 t33Var2119 = t33Var18;
                                final wz40 wz40Var31118 = wz40Var19;
                                final t33 t33Var21110 = t33Var19;
                                final wz40 wz40Var31119 = wz40Var20;
                                final wz40 wz40Var311110 = wz40Var18;
                                final wz40 wz40Var311111 = wz40Var17;
                                final t33 t33Var21111 = t33Var11;
                                return vj30.x(c5n0Var, i21114, iW6, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar17;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var311112 = wz40Var2113;
                                        c0d c0dVar18 = (c0d) wz40Var311112.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var31119.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar19 = c0d.e;
                                        c0d c0dVar110 = c0dVar8;
                                        i43 i43Var8 = i43Var7;
                                        if (c0dVar110 == c0dVar19 && (c0dVar18 == c0d.d || c0dVar18 == c0dVar19)) {
                                            density2 = i43Var8.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var8.c;
                                        int i21115 = i43Var8.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i21115 / 2) - (i43Var8.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var8.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var8.h + density, (i21115 / 2) - (i43Var8.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var8.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i21115 / 2) - (i43Var8.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var8.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i21115 / 2) - (i43Var8.n / 2), 0.0f);
                                        }
                                        if (c0dVar110 == c0dVar19 || !(z115 || z26)) {
                                            wz40 wz40Var311113 = wz40Var31116;
                                            bby bbyVar = (bby) wz40Var311113.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var21112 = (t33) wz40Var311110.f40005a;
                                            t33 t33Var21113 = (t33) wz40Var31118.f40005a;
                                            t33 t33Var30 = (t33) wz40Var31117.f40005a;
                                            t33 t33Var31 = (t33) wz40Var2112.f40005a;
                                            c0d c0dVar111 = (c0d) wz40Var311112.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var2114.f40005a;
                                            vne vneVar9 = vneVar8;
                                            vneVar9.getClass();
                                            c0dVar111.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var2118;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var21112.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var21110;
                                            t33Var35.getClass();
                                            t33Var21113.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var2119;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var21111;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar17 = c0dVar110;
                                            wz40Var311113.f40005a = qjj.W(vneVar9, null, null, new z5m0(u5m0Var, k43Var3, j9, t33Var32, t33Var21112, t33Var34, t33Var35, t33Var21113, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar111, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar17 = c0dVar110;
                                        }
                                        wz40Var311112.f40005a = c0dVar17;
                                        wz40Var311111.f40005a = j43Var10.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var3 = pu90VarS2;
                            wz40Var18 = wz40Var16;
                            t33Var18 = t33Var17;
                            i12 = 0;
                            pu90VarS3 = pu90Var2;
                            if (pu90VarS3 != null) {
                                i13 = pu90VarS3.f27604a;
                            } else {
                                i13 = i12;
                            }
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.b;
                            } else {
                                i14 = i12;
                            }
                            int i116 = i9;
                            int i21115 = i8;
                            int iC8 = idd.c(new int[]{i116, i14, i11}, i21115);
                            zcl zclVar8 = qmk.f28987a;
                            int i21116 = i14;
                            int iW7 = (((int) c5n0Var.w0(2.0f)) * 2) + iC8;
                            int i21117 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var8 = new i43(i21117, iW7, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i10, i13, i17, i5, i11, i21116, i21115, i116, k6zVar2);
                            i15 = i13;
                            int i21118 = i5;
                            final wz40 wz40Var2115 = wz40Var9;
                            c0d c0dVar17 = (c0d) wz40Var2115.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar17.getClass();
                            c0dVar8 = c0dVar7;
                            if (c0dVar8 == c0d.f3518a) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (c0dVar8 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var17 = wz40Var17;
                                t33Var19 = t33Var10;
                                wz40Var19 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i15 + i17 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var17 = wz40Var17;
                                t33Var19 = t33Var10;
                                wz40Var19 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i15 + i17 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i15) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var2116 = wz40Var3;
                            wz40Var2116.f40005a = r5m0Var;
                            int i21119 = p4e.i(j);
                            final wz40 wz40Var311112 = wz40Var8;
                            final vne vneVar9 = vneVar;
                            final long j10 = jN;
                            final j43 j43Var11 = j43Var2;
                            final boolean z116 = z13;
                            final boolean z27 = z14;
                            final wz40 wz40Var311113 = wz40Var15;
                            final t33 t33Var21112 = t33Var13;
                            final t33 t33Var21113 = t33Var18;
                            final wz40 wz40Var311114 = wz40Var19;
                            final t33 t33Var21114 = t33Var19;
                            final wz40 wz40Var311115 = wz40Var20;
                            final wz40 wz40Var311116 = wz40Var18;
                            final wz40 wz40Var311117 = wz40Var17;
                            final t33 t33Var21115 = t33Var11;
                            return vj30.x(c5n0Var, i21119, iW7, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar18;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var311118 = wz40Var2115;
                                    c0d c0dVar19 = (c0d) wz40Var311118.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var311115.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar110 = c0d.e;
                                    c0d c0dVar111 = c0dVar8;
                                    i43 i43Var9 = i43Var8;
                                    if (c0dVar111 == c0dVar110 && (c0dVar19 == c0d.d || c0dVar19 == c0dVar110)) {
                                        density2 = i43Var9.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var9.c;
                                    int i211110 = i43Var9.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i211110 / 2) - (i43Var9.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var9.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var9.h + density, (i211110 / 2) - (i43Var9.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var9.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i211110 / 2) - (i43Var9.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var9.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i211110 / 2) - (i43Var9.n / 2), 0.0f);
                                    }
                                    if (c0dVar111 == c0dVar110 || !(z116 || z27)) {
                                        wz40 wz40Var311119 = wz40Var311112;
                                        bby bbyVar = (bby) wz40Var311119.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var21116 = (t33) wz40Var311116.f40005a;
                                        t33 t33Var21117 = (t33) wz40Var311114.f40005a;
                                        t33 t33Var30 = (t33) wz40Var311113.f40005a;
                                        t33 t33Var31 = (t33) wz40Var2112.f40005a;
                                        c0d c0dVar112 = (c0d) wz40Var311118.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var2116.f40005a;
                                        vne vneVar10 = vneVar9;
                                        vneVar10.getClass();
                                        c0dVar112.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var21112;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var21116.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var21114;
                                        t33Var35.getClass();
                                        t33Var21117.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var21113;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var21115;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar18 = c0dVar111;
                                        wz40Var311119.f40005a = qjj.W(vneVar10, null, null, new z5m0(u5m0Var, k43Var3, j10, t33Var32, t33Var21116, t33Var34, t33Var35, t33Var21117, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar112, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar18 = c0dVar111;
                                    }
                                    wz40Var311118.f40005a = c0dVar18;
                                    wz40Var311117.f40005a = j43Var11.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                    };
                    fetVar.o0(obj);
                } else {
                    obj = objP18;
                    i3 = 0;
                }
                int i4 = i2 & 14;
                mm40Var2 = mm40Var;
                x4n0.a(mm40Var2, (Function2) obj, fetVar, i4, i3);
            } else {
                wz40Var = wz40Var10;
            }
            if (c0dVar != c0d.b) {
                z = true;
            } else {
                z = true;
            }
            boolean z13 = z;
            if (c0dVar == c0dVar2) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                z3 = false;
            } else {
                z3 = false;
            }
            objP = fetVar.P();
            if (objP == obj4) {
                objP = new wz40(Boolean.TRUE);
                fetVar.o0(objP);
            }
            wz40Var2 = (wz40) objP;
            objP2 = fetVar.P();
            if (objP2 == obj4) {
                objP2 = new wz40(s5m0.f31661a);
                fetVar.o0(objP2);
            }
            wz40Var3 = (wz40) objP2;
            objP3 = fetVar.P();
            if (objP3 == obj4) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33Var = (t33) objP3;
            objP4 = fetVar.P();
            if (objP4 == obj4) {
                objP4 = xf0.c(0.0f);
                fetVar.o0(objP4);
            }
            t33Var2 = (t33) objP4;
            objP5 = fetVar.P();
            if (objP5 == obj4) {
                objP5 = new wz40(xf0.c(1.0f));
                fetVar.o0(objP5);
            }
            wz40Var4 = (wz40) objP5;
            objP6 = fetVar.P();
            if (objP6 == obj4) {
                objP6 = m5k0.a(k43Var.d());
                fetVar.o0(objP6);
            }
            t33Var3 = (t33) objP6;
            objP7 = fetVar.P();
            if (objP7 == obj4) {
                objP7 = new wz40(m5k0.a(k43Var.d()));
                fetVar.o0(objP7);
            }
            wz40Var5 = (wz40) objP7;
            objP8 = fetVar.P();
            if (objP8 == obj4) {
                objP8 = xf0.c(0.0f);
                fetVar.o0(objP8);
            }
            t33Var4 = (t33) objP8;
            zE = fetVar.e(c0dVar.ordinal()) | fetVar.g(obj3);
            objP9 = fetVar.P();
            if (zE) {
                objP9 = xf0.c(0.0f);
                fetVar.o0(objP9);
            } else {
                objP9 = xf0.c(0.0f);
                fetVar.o0(objP9);
            }
            t33Var5 = (t33) objP9;
            objP10 = fetVar.P();
            if (objP10 == obj4) {
                objP10 = new wz40(xf0.c(0.0f));
                fetVar.o0(objP10);
            }
            wz40Var6 = (wz40) objP10;
            objP11 = fetVar.P();
            if (objP11 == obj4) {
                objP11 = xf0.c(0.0f);
                fetVar.o0(objP11);
            }
            t33Var6 = (t33) objP11;
            objP12 = fetVar.P();
            if (objP12 == obj4) {
                objP12 = new wz40(xf0.c(1.0f));
                fetVar.o0(objP12);
            }
            wz40Var7 = (wz40) objP12;
            c0d c0dVar5 = (c0d) wz40Var9.f40005a;
            zG = fetVar.g(obj3) | fetVar.e(c0dVar.ordinal());
            objP13 = fetVar.P();
            if (zG) {
                if (c0dVar == c0dVar2) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (c0dVar != c0dVar3) {
                    objC = xf0.c(1.0f);
                } else {
                    objC = xf0.c(1.0f);
                }
                objP13 = objC;
                fetVar.o0(objP13);
            } else {
                if (c0dVar == c0dVar2) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (c0dVar != c0dVar3) {
                    objC = xf0.c(1.0f);
                } else {
                    objC = xf0.c(1.0f);
                }
                objP13 = objC;
                fetVar.o0(objP13);
            }
            t33Var7 = (t33) objP13;
            objP14 = fetVar.P();
            if (objP14 == obj4) {
                objP14 = new wz40(null);
                fetVar.o0(objP14);
            }
            wz40Var8 = (wz40) objP14;
            gzcVarL = wha0.L(c0dVar, (c0d) wz40Var9.f40005a, k43Var.f());
            gzcVarM = wha0.M(c0dVar, (c0d) wz40Var9.f40005a, k43Var.f(), fetVar);
            s4u0VarO = wha0.O(gzcVarL, fetVar);
            s4u0VarO2 = wha0.O(gzcVarM, fetVar);
            jN = wha0.N(c0dVar, k43Var, fetVar);
            boolean zH3 = fetVar.h(z8) | fetVar.h(z9);
            z5 = z9;
            if ((i2 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zH4 = zH3 | z6 | fetVar.h(z2);
            if ((i2 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            zE2 = fetVar.e(c0dVar.ordinal()) | zH4 | z7 | fetVar.h(z3) | fetVar.g(g9q0VarN) | fetVar.i(s4u0VarO) | fetVar.i(t33Var) | fetVar.i(gzcVarL) | fetVar.i(s4u0VarO2) | fetVar.i(gzcVarM) | fetVar.i(t33Var2) | fetVar.i(t33Var6) | fetVar.i(t33Var7) | fetVar.i(t33Var4) | fetVar.i(t33Var3) | fetVar.i(t33Var5) | fetVar.e(k6zVar.ordinal()) | fetVar.i(vneVar) | fetVar.f(jN);
            Object objP19 = fetVar.P();
            if (zE2) {
                final boolean z14 = z8;
                final wz40 wz40Var12 = wz40Var;
                i3 = 0;
                final boolean z15 = z3;
                obj = new Function2() { // from class: a.k5m0
                    /* JADX WARN: Code duplicated, block: B:121:0x034f  */
                    /* JADX WARN: Code duplicated, block: B:122:0x0358  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0362  */
                    /* JADX WARN: Code duplicated, block: B:128:0x0374  */
                    /* JADX WARN: Code duplicated, block: B:131:0x037b  */
                    /* JADX WARN: Code duplicated, block: B:133:0x0389  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
                    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
                    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
                    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:56:0x01b0  */
                    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
                    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
                    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
                    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
                    /* JADX WARN: Code duplicated, block: B:67:0x021b  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0221  */
                    /* JADX WARN: Code duplicated, block: B:71:0x022c  */
                    /* JADX WARN: Code duplicated, block: B:72:0x0231  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
                    /* JADX WARN: Code duplicated, block: B:76:0x023a  */
                    /* JADX WARN: Code duplicated, block: B:79:0x028f  */
                    /* JADX WARN: Code duplicated, block: B:84:0x029a  */
                    /* JADX WARN: Code duplicated, block: B:87:0x02a2  */
                    /* JADX WARN: Code duplicated, block: B:89:0x02a6  */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i5;
                        pu90 pu90VarS;
                        int i6;
                        int i7;
                        c0d c0dVar6;
                        c0d c0dVar7;
                        int i8;
                        y9q0 y9q0VarB;
                        final t33 t33Var8;
                        final t33 t33Var9;
                        t33 t33Var10;
                        pu90 pu90Var;
                        c0d c0dVar8;
                        pu90 pu90Var2;
                        wz40 wz40Var13;
                        wz40 wz40Var14;
                        wz40 wz40Var15;
                        t33 t33Var11;
                        int i9;
                        int i10;
                        final t33 t33Var12;
                        boolean z16;
                        boolean z17;
                        t33 t33Var13;
                        long j;
                        wz40 wz40Var16;
                        pu90 pu90VarS2;
                        int i11;
                        int i12;
                        boolean zBooleanValue;
                        wz40 wz40Var17;
                        t33 t33Var14;
                        wz40 wz40Var18;
                        String str;
                        t33 t33Var15;
                        t33 t33Var16;
                        y9q0 y9q0VarB2;
                        t33 t33Var17;
                        pu90 pu90Var3;
                        wz40 wz40Var19;
                        t33 t33Var18;
                        int i13;
                        pu90 pu90VarS3;
                        int i14;
                        int i15;
                        k6z k6zVar2;
                        int i16;
                        boolean zBooleanValue2;
                        final c0d c0dVar9;
                        boolean z18;
                        j43 j43Var2;
                        t33 t33Var19;
                        wz40 wz40Var110;
                        wz40 wz40Var20;
                        Object r5m0Var;
                        float fW0;
                        float f;
                        k6z k6zVar3;
                        float fW1;
                        float fW2;
                        pj30 pj30Var;
                        pj30 pj30Var2;
                        j43 j43Var3 = j43Var;
                        String str2 = j43Var3.b;
                        c5n0 c5n0Var = (c5n0) obj5;
                        p4e p4eVar = (p4e) obj6;
                        c5n0Var.getClass();
                        boolean z19 = z14;
                        boolean z110 = z5;
                        wz40 wz40Var21 = wz40Var4;
                        wz40 wz40Var22 = wz40Var5;
                        final k43 k43Var2 = k43Var;
                        wz40 wz40Var23 = wz40Var7;
                        if (!z19 && !z110) {
                            wz40Var21.f40005a = xf0.c(1.0f);
                            wz40Var22.f40005a = m5k0.a(k43Var2.d());
                            wz40Var23.f40005a = xf0.c(1.0f);
                        }
                        float fW3 = 0.0f;
                        if (z2) {
                            wz40Var21.f40005a = xf0.c(0.0f);
                        }
                        wz40 wz40Var24 = wz40Var6;
                        if (!z19) {
                            wz40Var24.f40005a = xf0.c(0.0f);
                        }
                        long j2 = p4eVar.f26347a;
                        int i17 = p4e.i(j2);
                        wz40 wz40Var25 = wz40Var12;
                        String str3 = !z19 ? str2 : (String) wz40Var25.f40005a;
                        String str4 = j43Var3.f15865a;
                        boolean z111 = z15;
                        wz40 wz40Var26 = wz40Var2;
                        long jQ = wha0.Q(c5n0Var, k43Var2, z111, i17, str3, str4, wz40Var26, g9q0VarN);
                        t33 t33Var20 = (t33) wz40Var24.f40005a;
                        s4u0 s4u0Var = s4u0VarO;
                        t33 t33Var21 = t33Var;
                        pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("ARROW_ICON_LAYOUT_ID", new ugd(845420449, true, new m5m0(s4u0Var, t33Var20, t33Var21, gzcVarL))));
                        pu90 pu90VarS4 = pj30Var3 != null ? pj30Var3.S(r4e.b(0, 0, 0, 0, 15)) : null;
                        int i18 = pu90VarS4 != null ? pu90VarS4.f27604a : 0;
                        int i19 = pu90VarS4 != null ? pu90VarS4.b : 0;
                        s4u0 s4u0Var2 = s4u0VarO2;
                        t33 t33Var22 = t33Var2;
                        t33 t33Var23 = t33Var6;
                        if (s4u0Var2 != null) {
                            pj30 pj30Var4 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("BLOCKED_ICON_LAYOUT_ID", new ugd(-1396051194, true, new m5m0(t33Var22, t33Var23, gzcVarM, s4u0Var2))));
                            if (pj30Var4 != null) {
                                pu90VarS4 = pu90VarS4;
                                t33Var23 = t33Var23;
                                i5 = 0;
                                pu90VarS = pj30Var4.S(r4e.b(0, 0, 0, 0, 15));
                            } else {
                                i5 = 0;
                            }
                            if (pu90VarS != null) {
                                i6 = pu90VarS.f27604a;
                            } else {
                                i6 = i5;
                            }
                            if (pu90VarS != null) {
                                i7 = pu90VarS.b;
                            } else {
                                i7 = i5;
                            }
                            c0dVar6 = c0d.f;
                            c0dVar7 = c0dVar;
                            if (c0dVar7 != c0dVar6) {
                                i8 = 1;
                            } else {
                                i8 = i5;
                            }
                            y9q0VarB = k43Var2.b();
                            t33Var8 = t33Var7;
                            t33Var9 = t33Var4;
                            t33Var10 = t33Var3;
                            if (i8 != 0) {
                                pu90Var = pu90VarS;
                                c0dVar8 = c0dVar7;
                                pu90Var2 = null;
                                wz40Var13 = wz40Var21;
                                wz40Var14 = wz40Var23;
                                wz40Var15 = wz40Var25;
                                t33Var11 = t33Var23;
                                i9 = i19;
                                i10 = i7;
                                t33Var12 = t33Var22;
                                z16 = z19;
                                z17 = z110;
                                t33Var13 = t33Var21;
                                j = j2;
                                wz40Var16 = wz40Var24;
                                pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                                if (pj30Var2 != null) {
                                    pu90VarS2 = pj30Var2.S(r4e.b(i5, i5, i5, i5, 15));
                                }
                                if (pu90VarS2 != null) {
                                    i11 = pu90VarS2.f27604a;
                                } else {
                                    i11 = i5;
                                }
                                if (pu90VarS2 != null) {
                                    i12 = pu90VarS2.b;
                                } else {
                                    i12 = i5;
                                }
                                zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                                wz40Var17 = wz40Var13;
                                t33Var14 = (t33) wz40Var17.f40005a;
                                if (z16) {
                                    wz40Var18 = wz40Var15;
                                    str = (String) wz40Var18.f40005a;
                                } else {
                                    str = str2;
                                    wz40Var18 = wz40Var15;
                                }
                                t33Var15 = (t33) wz40Var22.f40005a;
                                final wz40 wz40Var2112 = wz40Var14;
                                t33Var16 = (t33) wz40Var2112.f40005a;
                                y9q0VarB2 = k43Var2.b();
                                t33Var17 = t33Var5;
                                if (zBooleanValue) {
                                    t33Var18 = t33Var17;
                                    pu90Var3 = pu90VarS2;
                                    wz40Var19 = wz40Var17;
                                    pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                    if (pj30Var != null) {
                                        t33Var8 = t33Var8;
                                        i13 = 0;
                                        pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                    }
                                    if (pu90VarS3 != null) {
                                        i14 = pu90VarS3.f27604a;
                                    } else {
                                        i14 = i13;
                                    }
                                    if (pu90VarS3 != null) {
                                        i15 = pu90VarS3.b;
                                    } else {
                                        i15 = i13;
                                    }
                                    int i116 = i10;
                                    int i21115 = i9;
                                    int iC8 = idd.c(new int[]{i116, i15, i12}, i21115);
                                    zcl zclVar8 = qmk.f28987a;
                                    int i21116 = i15;
                                    int iW7 = (((int) c5n0Var.w0(2.0f)) * 2) + iC8;
                                    int i21117 = p4e.i(j);
                                    k6zVar2 = k6zVar;
                                    final i43 i43Var8 = new i43(i21117, iW7, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i21116, i21115, i116, k6zVar2);
                                    i16 = i14;
                                    int i21118 = i6;
                                    final wz40 wz40Var2115 = wz40Var9;
                                    c0d c0dVar17 = (c0d) wz40Var2115.f40005a;
                                    zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    c0dVar17.getClass();
                                    c0dVar9 = c0dVar8;
                                    if (c0dVar9 == c0d.f3518a || !(c0dVar17 == c0d.d || c0dVar17 == c0d.e)) {
                                        z18 = false;
                                    } else {
                                        z18 = true;
                                    }
                                    if (c0dVar9 != c0d.b || c0dVar9 == c0d.c) {
                                        j43Var2 = j43Var3;
                                        wz40Var18 = wz40Var18;
                                        t33Var19 = t33Var10;
                                        wz40Var110 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i16 + i18 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    } else {
                                        c0d c0dVar10 = c0d.e;
                                        if (c0dVar9 == c0dVar10) {
                                            j43Var2 = j43Var3;
                                            float f2 = i16;
                                            float fW4 = c5n0Var.w0(2.0f) + c5n0Var.w0(k43Var2.f().a().f) + (zBooleanValue2 ? c5n0Var.w0(k43Var2.h()) : 0.0f) + f2;
                                            k6z k6zVar4 = k6z.b;
                                            if (k6zVar2 == k6zVar4) {
                                                fW4 *= -1.0f;
                                            }
                                            t33Var19 = t33Var10;
                                            float f3 = fW4;
                                            wz40Var110 = wz40Var22;
                                            float F = x9x.F(c5n0Var, i43Var8, k43Var2);
                                            wz40Var20 = wz40Var26;
                                            if (c0dVar17 == c0d.d || c0dVar17 == c0dVar10) {
                                                fW2 = c5n0Var.w0(2.0f) + (-i21118);
                                            } else {
                                                fW2 = 0.0f;
                                            }
                                            if (k6zVar2 == k6zVar4) {
                                                fW2 *= -1.0f;
                                            }
                                            if (zBooleanValue2) {
                                                fW3 = c5n0Var.w0(k43Var2.h()) + f2;
                                                if (k6zVar2 == k6zVar4) {
                                                    fW3 *= -1.0f;
                                                }
                                            }
                                            r5m0Var = new q5m0(f3, F, fW2, fW3);
                                        } else {
                                            j43Var2 = j43Var3;
                                            wz40Var18 = wz40Var18;
                                            t33Var19 = t33Var10;
                                            wz40Var110 = wz40Var22;
                                            wz40Var20 = wz40Var26;
                                            if (c0dVar9 == c0d.d) {
                                                r5m0Var = new p5m0(x9x.F(c5n0Var, i43Var8, k43Var2));
                                            } else {
                                                r5m0Var = z18 ? t5m0.f33375a : s5m0.f31661a;
                                            }
                                        }
                                    }
                                    final wz40 wz40Var2116 = wz40Var3;
                                    wz40Var2116.f40005a = r5m0Var;
                                    int i21119 = p4e.i(j);
                                    final wz40 wz40Var311112 = wz40Var8;
                                    final vne vneVar9 = vneVar;
                                    final long j10 = jN;
                                    final j43 j43Var11 = j43Var2;
                                    final boolean z116 = z16;
                                    final boolean z27 = z17;
                                    final wz40 wz40Var311113 = wz40Var16;
                                    final t33 t33Var21112 = t33Var13;
                                    final t33 t33Var21113 = t33Var18;
                                    final wz40 wz40Var311114 = wz40Var110;
                                    final t33 t33Var21114 = t33Var19;
                                    final wz40 wz40Var311115 = wz40Var20;
                                    final wz40 wz40Var311116 = wz40Var19;
                                    final wz40 wz40Var311117 = wz40Var18;
                                    final t33 t33Var21115 = t33Var11;
                                    return vj30.x(c5n0Var, i21119, iW7, new Function1() { // from class: a.l5m0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            int density;
                                            int density2;
                                            c0d c0dVar18;
                                            ou90 ou90Var = (ou90) obj7;
                                            ou90Var.getClass();
                                            wz40 wz40Var311118 = wz40Var2115;
                                            c0d c0dVar19 = (c0d) wz40Var311118.f40005a;
                                            boolean zBooleanValue3 = ((Boolean) wz40Var311115.f40005a).booleanValue();
                                            k43 k43Var3 = k43Var2;
                                            if (zBooleanValue3) {
                                                density = (int) (ou90Var.getDensity() * k43Var3.h());
                                            } else {
                                                density = 0;
                                            }
                                            c0d c0dVar110 = c0d.e;
                                            c0d c0dVar111 = c0dVar9;
                                            i43 i43Var9 = i43Var8;
                                            if (c0dVar111 == c0dVar110 && (c0dVar19 == c0d.d || c0dVar19 == c0dVar110)) {
                                                density2 = i43Var9.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                            } else {
                                                density2 = 0;
                                            }
                                            pu90 pu90Var4 = i43Var9.c;
                                            int i211110 = i43Var9.b;
                                            if (pu90Var4 != null) {
                                                ou90Var.m(pu90Var4, 0, (i211110 / 2) - (i43Var9.k / 2), 0.0f);
                                            }
                                            pu90 pu90Var5 = i43Var9.e;
                                            if (pu90Var5 != null) {
                                                ou90Var.m(pu90Var5, i43Var9.h + density, (i211110 / 2) - (i43Var9.m / 2), 0.0f);
                                            }
                                            pu90 pu90Var6 = i43Var9.d;
                                            if (pu90Var6 != null) {
                                                ou90Var.m(pu90Var6, density2, (i211110 / 2) - (i43Var9.l / 2), 0.0f);
                                            }
                                            pu90 pu90Var7 = i43Var9.f;
                                            if (pu90Var7 != null) {
                                                ou90Var.m(pu90Var7, 0, (i211110 / 2) - (i43Var9.n / 2), 0.0f);
                                            }
                                            if (c0dVar111 == c0dVar110 || !(z116 || z27)) {
                                                wz40 wz40Var311119 = wz40Var311112;
                                                bby bbyVar = (bby) wz40Var311119.f40005a;
                                                if (bbyVar != null) {
                                                    bbyVar.cancel(null);
                                                }
                                                t33 t33Var21116 = (t33) wz40Var311116.f40005a;
                                                t33 t33Var21117 = (t33) wz40Var311114.f40005a;
                                                t33 t33Var30 = (t33) wz40Var311113.f40005a;
                                                t33 t33Var31 = (t33) wz40Var2112.f40005a;
                                                c0d c0dVar112 = (c0d) wz40Var311118.f40005a;
                                                u5m0 u5m0Var = (u5m0) wz40Var2116.f40005a;
                                                vne vneVar10 = vneVar9;
                                                vneVar10.getClass();
                                                c0dVar112.getClass();
                                                u5m0Var.getClass();
                                                t33 t33Var32 = t33Var21112;
                                                t33Var32.getClass();
                                                t33 t33Var33 = t33Var12;
                                                t33Var33.getClass();
                                                t33Var21116.getClass();
                                                t33 t33Var34 = t33Var8;
                                                t33Var34.getClass();
                                                t33 t33Var35 = t33Var21114;
                                                t33Var35.getClass();
                                                t33Var21117.getClass();
                                                t33 t33Var36 = t33Var9;
                                                t33Var36.getClass();
                                                t33 t33Var37 = t33Var21113;
                                                t33Var37.getClass();
                                                t33Var30.getClass();
                                                t33 t33Var38 = t33Var21115;
                                                t33Var38.getClass();
                                                t33Var31.getClass();
                                                c0dVar18 = c0dVar111;
                                                wz40Var311119.f40005a = qjj.W(vneVar10, null, null, new z5m0(u5m0Var, k43Var3, j10, t33Var32, t33Var21116, t33Var34, t33Var35, t33Var21117, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar112, t33Var33, t33Var38, null), 3);
                                            } else {
                                                c0dVar18 = c0dVar111;
                                            }
                                            wz40Var311118.f40005a = c0dVar18;
                                            wz40Var311117.f40005a = j43Var11.b;
                                            return Unit.f46060a;
                                        }
                                    });
                                }
                                pu90Var3 = pu90VarS2;
                                wz40Var19 = wz40Var17;
                                t33Var18 = t33Var17;
                                i13 = 0;
                                pu90VarS3 = pu90Var2;
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i117 = i10;
                                int i211110 = i9;
                                int iC9 = idd.c(new int[]{i117, i15, i12}, i211110);
                                zcl zclVar9 = qmk.f28987a;
                                int i211111 = i15;
                                int iW8 = (((int) c5n0Var.w0(2.0f)) * 2) + iC9;
                                int i211112 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var9 = new i43(i211112, iW8, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111, i211110, i117, k6zVar2);
                                i16 = i14;
                                int i211113 = i6;
                                final wz40 wz40Var2117 = wz40Var9;
                                c0d c0dVar18 = (c0d) wz40Var2117.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar18.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var2118 = wz40Var3;
                                wz40Var2118.f40005a = r5m0Var;
                                int i211114 = p4e.i(j);
                                final wz40 wz40Var311118 = wz40Var8;
                                final vne vneVar10 = vneVar;
                                final long j11 = jN;
                                final j43 j43Var12 = j43Var2;
                                final boolean z117 = z16;
                                final boolean z28 = z17;
                                final wz40 wz40Var311119 = wz40Var16;
                                final t33 t33Var21116 = t33Var13;
                                final t33 t33Var21117 = t33Var18;
                                final wz40 wz40Var3111110 = wz40Var110;
                                final t33 t33Var21118 = t33Var19;
                                final wz40 wz40Var3111111 = wz40Var20;
                                final wz40 wz40Var3111112 = wz40Var19;
                                final wz40 wz40Var3111113 = wz40Var18;
                                final t33 t33Var21119 = t33Var11;
                                return vj30.x(c5n0Var, i211114, iW8, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar19;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var3111114 = wz40Var2117;
                                        c0d c0dVar110 = (c0d) wz40Var3111114.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var3111111.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar111 = c0d.e;
                                        c0d c0dVar112 = c0dVar9;
                                        i43 i43Var10 = i43Var9;
                                        if (c0dVar112 == c0dVar111 && (c0dVar110 == c0d.d || c0dVar110 == c0dVar111)) {
                                            density2 = i43Var10.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var10.c;
                                        int i211115 = i43Var10.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i211115 / 2) - (i43Var10.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var10.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var10.h + density, (i211115 / 2) - (i43Var10.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var10.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i211115 / 2) - (i43Var10.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var10.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i211115 / 2) - (i43Var10.n / 2), 0.0f);
                                        }
                                        if (c0dVar112 == c0dVar111 || !(z117 || z28)) {
                                            wz40 wz40Var3111115 = wz40Var311118;
                                            bby bbyVar = (bby) wz40Var3111115.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var211110 = (t33) wz40Var3111112.f40005a;
                                            t33 t33Var211111 = (t33) wz40Var3111110.f40005a;
                                            t33 t33Var30 = (t33) wz40Var311119.f40005a;
                                            t33 t33Var31 = (t33) wz40Var2112.f40005a;
                                            c0d c0dVar113 = (c0d) wz40Var3111114.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var2118.f40005a;
                                            vne vneVar11 = vneVar10;
                                            vneVar11.getClass();
                                            c0dVar113.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var21116;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var211110.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var21118;
                                            t33Var35.getClass();
                                            t33Var211111.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var21117;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var21119;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar19 = c0dVar112;
                                            wz40Var3111115.f40005a = qjj.W(vneVar11, null, null, new z5m0(u5m0Var, k43Var3, j11, t33Var32, t33Var211110, t33Var34, t33Var35, t33Var211111, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar113, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar19 = c0dVar112;
                                        }
                                        wz40Var3111114.f40005a = c0dVar19;
                                        wz40Var3111113.f40005a = j43Var12.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var = pu90VarS;
                            c0dVar8 = c0dVar7;
                            pu90Var2 = null;
                            wz40Var13 = wz40Var21;
                            wz40Var14 = wz40Var23;
                            wz40Var15 = wz40Var25;
                            t33Var11 = t33Var23;
                            i9 = i19;
                            i10 = i7;
                            t33Var12 = t33Var22;
                            z16 = z19;
                            z17 = z110;
                            t33Var13 = t33Var21;
                            j = j2;
                            wz40Var16 = wz40Var24;
                            pu90VarS2 = pu90Var2;
                            if (pu90VarS2 != null) {
                                i11 = pu90VarS2.f27604a;
                            } else {
                                i11 = i5;
                            }
                            if (pu90VarS2 != null) {
                                i12 = pu90VarS2.b;
                            } else {
                                i12 = i5;
                            }
                            zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                            wz40Var17 = wz40Var13;
                            t33Var14 = (t33) wz40Var17.f40005a;
                            if (z16) {
                                str = str2;
                                wz40Var18 = wz40Var15;
                            } else {
                                wz40Var18 = wz40Var15;
                                str = (String) wz40Var18.f40005a;
                            }
                            t33Var15 = (t33) wz40Var22.f40005a;
                            final wz40 wz40Var2113 = wz40Var14;
                            t33Var16 = (t33) wz40Var2113.f40005a;
                            y9q0VarB2 = k43Var2.b();
                            t33Var17 = t33Var5;
                            if (zBooleanValue) {
                                t33Var18 = t33Var17;
                                pu90Var3 = pu90VarS2;
                                wz40Var19 = wz40Var17;
                                pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                if (pj30Var != null) {
                                    t33Var8 = t33Var8;
                                    i13 = 0;
                                    pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i118 = i10;
                                int i211115 = i9;
                                int iC10 = idd.c(new int[]{i118, i15, i12}, i211115);
                                zcl zclVar10 = qmk.f28987a;
                                int i211116 = i15;
                                int iW9 = (((int) c5n0Var.w0(2.0f)) * 2) + iC10;
                                int i211117 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var10 = new i43(i211117, iW9, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211116, i211115, i118, k6zVar2);
                                i16 = i14;
                                int i211118 = i6;
                                final wz40 wz40Var2119 = wz40Var9;
                                c0d c0dVar19 = (c0d) wz40Var2119.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar19.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var21110 = wz40Var3;
                                wz40Var21110.f40005a = r5m0Var;
                                int i211119 = p4e.i(j);
                                final wz40 wz40Var3111114 = wz40Var8;
                                final vne vneVar11 = vneVar;
                                final long j12 = jN;
                                final j43 j43Var13 = j43Var2;
                                final boolean z118 = z16;
                                final boolean z29 = z17;
                                final wz40 wz40Var3111115 = wz40Var16;
                                final t33 t33Var211110 = t33Var13;
                                final t33 t33Var211111 = t33Var18;
                                final wz40 wz40Var3111116 = wz40Var110;
                                final t33 t33Var211112 = t33Var19;
                                final wz40 wz40Var3111117 = wz40Var20;
                                final wz40 wz40Var3111118 = wz40Var19;
                                final wz40 wz40Var3111119 = wz40Var18;
                                final t33 t33Var211113 = t33Var11;
                                return vj30.x(c5n0Var, i211119, iW9, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar110;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var31111110 = wz40Var2119;
                                        c0d c0dVar111 = (c0d) wz40Var31111110.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var3111117.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar112 = c0d.e;
                                        c0d c0dVar113 = c0dVar9;
                                        i43 i43Var11 = i43Var10;
                                        if (c0dVar113 == c0dVar112 && (c0dVar111 == c0d.d || c0dVar111 == c0dVar112)) {
                                            density2 = i43Var11.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var11.c;
                                        int i2111110 = i43Var11.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i2111110 / 2) - (i43Var11.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var11.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var11.h + density, (i2111110 / 2) - (i43Var11.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var11.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i2111110 / 2) - (i43Var11.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var11.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i2111110 / 2) - (i43Var11.n / 2), 0.0f);
                                        }
                                        if (c0dVar113 == c0dVar112 || !(z118 || z29)) {
                                            wz40 wz40Var31111111 = wz40Var3111114;
                                            bby bbyVar = (bby) wz40Var31111111.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var211114 = (t33) wz40Var3111118.f40005a;
                                            t33 t33Var211115 = (t33) wz40Var3111116.f40005a;
                                            t33 t33Var30 = (t33) wz40Var3111115.f40005a;
                                            t33 t33Var31 = (t33) wz40Var2113.f40005a;
                                            c0d c0dVar114 = (c0d) wz40Var31111110.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var21110.f40005a;
                                            vne vneVar12 = vneVar11;
                                            vneVar12.getClass();
                                            c0dVar114.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var211110;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var211114.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var211112;
                                            t33Var35.getClass();
                                            t33Var211115.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var211111;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var211113;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar110 = c0dVar113;
                                            wz40Var31111111.f40005a = qjj.W(vneVar12, null, null, new z5m0(u5m0Var, k43Var3, j12, t33Var32, t33Var211114, t33Var34, t33Var35, t33Var211115, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar114, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar110 = c0dVar113;
                                        }
                                        wz40Var31111110.f40005a = c0dVar110;
                                        wz40Var3111119.f40005a = j43Var13.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var3 = pu90VarS2;
                            wz40Var19 = wz40Var17;
                            t33Var18 = t33Var17;
                            i13 = 0;
                            pu90VarS3 = pu90Var2;
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i119 = i10;
                            int i2111110 = i9;
                            int iC11 = idd.c(new int[]{i119, i15, i12}, i2111110);
                            zcl zclVar11 = qmk.f28987a;
                            int i2111111 = i15;
                            int iW10 = (((int) c5n0Var.w0(2.0f)) * 2) + iC11;
                            int i2111112 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var11 = new i43(i2111112, iW10, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i2111111, i2111110, i119, k6zVar2);
                            i16 = i14;
                            int i2111113 = i6;
                            final wz40 wz40Var21111 = wz40Var9;
                            c0d c0dVar110 = (c0d) wz40Var21111.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar110.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var21112 = wz40Var3;
                            wz40Var21112.f40005a = r5m0Var;
                            int i2111114 = p4e.i(j);
                            final wz40 wz40Var31111110 = wz40Var8;
                            final vne vneVar12 = vneVar;
                            final long j13 = jN;
                            final j43 j43Var14 = j43Var2;
                            final boolean z119 = z16;
                            final boolean z210 = z17;
                            final wz40 wz40Var31111111 = wz40Var16;
                            final t33 t33Var211114 = t33Var13;
                            final t33 t33Var211115 = t33Var18;
                            final wz40 wz40Var31111112 = wz40Var110;
                            final t33 t33Var211116 = t33Var19;
                            final wz40 wz40Var31111113 = wz40Var20;
                            final wz40 wz40Var31111114 = wz40Var19;
                            final wz40 wz40Var31111115 = wz40Var18;
                            final t33 t33Var211117 = t33Var11;
                            return vj30.x(c5n0Var, i2111114, iW10, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar111;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var31111116 = wz40Var21111;
                                    c0d c0dVar112 = (c0d) wz40Var31111116.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var31111113.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar113 = c0d.e;
                                    c0d c0dVar114 = c0dVar9;
                                    i43 i43Var12 = i43Var11;
                                    if (c0dVar114 == c0dVar113 && (c0dVar112 == c0d.d || c0dVar112 == c0dVar113)) {
                                        density2 = i43Var12.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var12.c;
                                    int i2111115 = i43Var12.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i2111115 / 2) - (i43Var12.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var12.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var12.h + density, (i2111115 / 2) - (i43Var12.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var12.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i2111115 / 2) - (i43Var12.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var12.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i2111115 / 2) - (i43Var12.n / 2), 0.0f);
                                    }
                                    if (c0dVar114 == c0dVar113 || !(z119 || z210)) {
                                        wz40 wz40Var31111117 = wz40Var31111110;
                                        bby bbyVar = (bby) wz40Var31111117.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var211118 = (t33) wz40Var31111114.f40005a;
                                        t33 t33Var211119 = (t33) wz40Var31111112.f40005a;
                                        t33 t33Var30 = (t33) wz40Var31111111.f40005a;
                                        t33 t33Var31 = (t33) wz40Var2113.f40005a;
                                        c0d c0dVar115 = (c0d) wz40Var31111116.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var21112.f40005a;
                                        vne vneVar13 = vneVar12;
                                        vneVar13.getClass();
                                        c0dVar115.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var211114;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var211118.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var211116;
                                        t33Var35.getClass();
                                        t33Var211119.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var211115;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var211117;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar111 = c0dVar114;
                                        wz40Var31111117.f40005a = qjj.W(vneVar13, null, null, new z5m0(u5m0Var, k43Var3, j13, t33Var32, t33Var211118, t33Var34, t33Var35, t33Var211119, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar115, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar111 = c0dVar114;
                                    }
                                    wz40Var31111116.f40005a = c0dVar111;
                                    wz40Var31111115.f40005a = j43Var14.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        i5 = 0;
                        pu90VarS = null;
                        if (pu90VarS != null) {
                            i6 = pu90VarS.f27604a;
                        } else {
                            i6 = i5;
                        }
                        if (pu90VarS != null) {
                            i7 = pu90VarS.b;
                        } else {
                            i7 = i5;
                        }
                        c0dVar6 = c0d.f;
                        c0dVar7 = c0dVar;
                        if (c0dVar7 != c0dVar6) {
                            i8 = 1;
                        } else {
                            i8 = i5;
                        }
                        y9q0VarB = k43Var2.b();
                        t33Var8 = t33Var7;
                        t33Var9 = t33Var4;
                        t33Var10 = t33Var3;
                        if (i8 != 0) {
                            pu90Var = pu90VarS;
                            c0dVar8 = c0dVar7;
                            pu90Var2 = null;
                            wz40Var13 = wz40Var21;
                            wz40Var14 = wz40Var23;
                            wz40Var15 = wz40Var25;
                            t33Var11 = t33Var23;
                            i9 = i19;
                            i10 = i7;
                            t33Var12 = t33Var22;
                            z16 = z19;
                            z17 = z110;
                            t33Var13 = t33Var21;
                            j = j2;
                            wz40Var16 = wz40Var24;
                            pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                            if (pj30Var2 != null) {
                                pu90VarS2 = pj30Var2.S(r4e.b(i5, i5, i5, i5, 15));
                            }
                            if (pu90VarS2 != null) {
                                i11 = pu90VarS2.f27604a;
                            } else {
                                i11 = i5;
                            }
                            if (pu90VarS2 != null) {
                                i12 = pu90VarS2.b;
                            } else {
                                i12 = i5;
                            }
                            zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                            wz40Var17 = wz40Var13;
                            t33Var14 = (t33) wz40Var17.f40005a;
                            if (z16) {
                                str = str2;
                                wz40Var18 = wz40Var15;
                            } else {
                                wz40Var18 = wz40Var15;
                                str = (String) wz40Var18.f40005a;
                            }
                            t33Var15 = (t33) wz40Var22.f40005a;
                            final wz40 wz40Var2114 = wz40Var14;
                            t33Var16 = (t33) wz40Var2114.f40005a;
                            y9q0VarB2 = k43Var2.b();
                            t33Var17 = t33Var5;
                            if (zBooleanValue) {
                                t33Var18 = t33Var17;
                                pu90Var3 = pu90VarS2;
                                wz40Var19 = wz40Var17;
                                pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                if (pj30Var != null) {
                                    t33Var8 = t33Var8;
                                    i13 = 0;
                                    pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i1110 = i10;
                                int i2111115 = i9;
                                int iC12 = idd.c(new int[]{i1110, i15, i12}, i2111115);
                                zcl zclVar12 = qmk.f28987a;
                                int i2111116 = i15;
                                int iW11 = (((int) c5n0Var.w0(2.0f)) * 2) + iC12;
                                int i2111117 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var12 = new i43(i2111117, iW11, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i2111116, i2111115, i1110, k6zVar2);
                                i16 = i14;
                                int i2111118 = i6;
                                final wz40 wz40Var21113 = wz40Var9;
                                c0d c0dVar111 = (c0d) wz40Var21113.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar111.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var18 = wz40Var18;
                                    t33Var19 = t33Var10;
                                    wz40Var110 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var21114 = wz40Var3;
                                wz40Var21114.f40005a = r5m0Var;
                                int i2111119 = p4e.i(j);
                                final wz40 wz40Var31111116 = wz40Var8;
                                final vne vneVar13 = vneVar;
                                final long j14 = jN;
                                final j43 j43Var15 = j43Var2;
                                final boolean z1110 = z16;
                                final boolean z211 = z17;
                                final wz40 wz40Var31111117 = wz40Var16;
                                final t33 t33Var211118 = t33Var13;
                                final t33 t33Var211119 = t33Var18;
                                final wz40 wz40Var31111118 = wz40Var110;
                                final t33 t33Var2111110 = t33Var19;
                                final wz40 wz40Var31111119 = wz40Var20;
                                final wz40 wz40Var311111110 = wz40Var19;
                                final wz40 wz40Var311111111 = wz40Var18;
                                final t33 t33Var2111111 = t33Var11;
                                return vj30.x(c5n0Var, i2111119, iW11, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar112;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var311111112 = wz40Var21113;
                                        c0d c0dVar113 = (c0d) wz40Var311111112.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var31111119.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar114 = c0d.e;
                                        c0d c0dVar115 = c0dVar9;
                                        i43 i43Var13 = i43Var12;
                                        if (c0dVar115 == c0dVar114 && (c0dVar113 == c0d.d || c0dVar113 == c0dVar114)) {
                                            density2 = i43Var13.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var13.c;
                                        int i21111110 = i43Var13.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i21111110 / 2) - (i43Var13.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var13.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var13.h + density, (i21111110 / 2) - (i43Var13.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var13.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i21111110 / 2) - (i43Var13.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var13.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i21111110 / 2) - (i43Var13.n / 2), 0.0f);
                                        }
                                        if (c0dVar115 == c0dVar114 || !(z1110 || z211)) {
                                            wz40 wz40Var311111113 = wz40Var31111116;
                                            bby bbyVar = (bby) wz40Var311111113.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var2111112 = (t33) wz40Var311111110.f40005a;
                                            t33 t33Var2111113 = (t33) wz40Var31111118.f40005a;
                                            t33 t33Var30 = (t33) wz40Var31111117.f40005a;
                                            t33 t33Var31 = (t33) wz40Var2114.f40005a;
                                            c0d c0dVar116 = (c0d) wz40Var311111112.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var21114.f40005a;
                                            vne vneVar14 = vneVar13;
                                            vneVar14.getClass();
                                            c0dVar116.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var211118;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var2111112.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var2111110;
                                            t33Var35.getClass();
                                            t33Var2111113.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var211119;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var2111111;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar112 = c0dVar115;
                                            wz40Var311111113.f40005a = qjj.W(vneVar14, null, null, new z5m0(u5m0Var, k43Var3, j14, t33Var32, t33Var2111112, t33Var34, t33Var35, t33Var2111113, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar116, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar112 = c0dVar115;
                                        }
                                        wz40Var311111112.f40005a = c0dVar112;
                                        wz40Var311111111.f40005a = j43Var15.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var3 = pu90VarS2;
                            wz40Var19 = wz40Var17;
                            t33Var18 = t33Var17;
                            i13 = 0;
                            pu90VarS3 = pu90Var2;
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i1111 = i10;
                            int i21111110 = i9;
                            int iC13 = idd.c(new int[]{i1111, i15, i12}, i21111110);
                            zcl zclVar13 = qmk.f28987a;
                            int i21111111 = i15;
                            int iW12 = (((int) c5n0Var.w0(2.0f)) * 2) + iC13;
                            int i21111112 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var13 = new i43(i21111112, iW12, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i21111111, i21111110, i1111, k6zVar2);
                            i16 = i14;
                            int i21111113 = i6;
                            final wz40 wz40Var21115 = wz40Var9;
                            c0d c0dVar112 = (c0d) wz40Var21115.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar112.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var21116 = wz40Var3;
                            wz40Var21116.f40005a = r5m0Var;
                            int i21111114 = p4e.i(j);
                            final wz40 wz40Var311111112 = wz40Var8;
                            final vne vneVar14 = vneVar;
                            final long j15 = jN;
                            final j43 j43Var16 = j43Var2;
                            final boolean z1111 = z16;
                            final boolean z212 = z17;
                            final wz40 wz40Var311111113 = wz40Var16;
                            final t33 t33Var2111112 = t33Var13;
                            final t33 t33Var2111113 = t33Var18;
                            final wz40 wz40Var311111114 = wz40Var110;
                            final t33 t33Var2111114 = t33Var19;
                            final wz40 wz40Var311111115 = wz40Var20;
                            final wz40 wz40Var311111116 = wz40Var19;
                            final wz40 wz40Var311111117 = wz40Var18;
                            final t33 t33Var2111115 = t33Var11;
                            return vj30.x(c5n0Var, i21111114, iW12, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar113;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var311111118 = wz40Var21115;
                                    c0d c0dVar114 = (c0d) wz40Var311111118.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var311111115.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar115 = c0d.e;
                                    c0d c0dVar116 = c0dVar9;
                                    i43 i43Var14 = i43Var13;
                                    if (c0dVar116 == c0dVar115 && (c0dVar114 == c0d.d || c0dVar114 == c0dVar115)) {
                                        density2 = i43Var14.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var14.c;
                                    int i21111115 = i43Var14.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i21111115 / 2) - (i43Var14.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var14.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var14.h + density, (i21111115 / 2) - (i43Var14.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var14.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i21111115 / 2) - (i43Var14.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var14.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i21111115 / 2) - (i43Var14.n / 2), 0.0f);
                                    }
                                    if (c0dVar116 == c0dVar115 || !(z1111 || z212)) {
                                        wz40 wz40Var311111119 = wz40Var311111112;
                                        bby bbyVar = (bby) wz40Var311111119.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var2111116 = (t33) wz40Var311111116.f40005a;
                                        t33 t33Var2111117 = (t33) wz40Var311111114.f40005a;
                                        t33 t33Var30 = (t33) wz40Var311111113.f40005a;
                                        t33 t33Var31 = (t33) wz40Var2114.f40005a;
                                        c0d c0dVar117 = (c0d) wz40Var311111118.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var21116.f40005a;
                                        vne vneVar15 = vneVar14;
                                        vneVar15.getClass();
                                        c0dVar117.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var2111112;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var2111116.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var2111114;
                                        t33Var35.getClass();
                                        t33Var2111117.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var2111113;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var2111115;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar113 = c0dVar116;
                                        wz40Var311111119.f40005a = qjj.W(vneVar15, null, null, new z5m0(u5m0Var, k43Var3, j15, t33Var32, t33Var2111116, t33Var34, t33Var35, t33Var2111117, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar117, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar113 = c0dVar116;
                                    }
                                    wz40Var311111118.f40005a = c0dVar113;
                                    wz40Var311111117.f40005a = j43Var16.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        pu90Var = pu90VarS;
                        c0dVar8 = c0dVar7;
                        pu90Var2 = null;
                        wz40Var13 = wz40Var21;
                        wz40Var14 = wz40Var23;
                        wz40Var15 = wz40Var25;
                        t33Var11 = t33Var23;
                        i9 = i19;
                        i10 = i7;
                        t33Var12 = t33Var22;
                        z16 = z19;
                        z17 = z110;
                        t33Var13 = t33Var21;
                        j = j2;
                        wz40Var16 = wz40Var24;
                        pu90VarS2 = pu90Var2;
                        if (pu90VarS2 != null) {
                            i11 = pu90VarS2.f27604a;
                        } else {
                            i11 = i5;
                        }
                        if (pu90VarS2 != null) {
                            i12 = pu90VarS2.b;
                        } else {
                            i12 = i5;
                        }
                        zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                        wz40Var17 = wz40Var13;
                        t33Var14 = (t33) wz40Var17.f40005a;
                        if (z16) {
                            str = str2;
                            wz40Var18 = wz40Var15;
                        } else {
                            wz40Var18 = wz40Var15;
                            str = (String) wz40Var18.f40005a;
                        }
                        t33Var15 = (t33) wz40Var22.f40005a;
                        final wz40 wz40Var21117 = wz40Var14;
                        t33Var16 = (t33) wz40Var21117.f40005a;
                        y9q0VarB2 = k43Var2.b();
                        t33Var17 = t33Var5;
                        if (zBooleanValue) {
                            t33Var18 = t33Var17;
                            pu90Var3 = pu90VarS2;
                            wz40Var19 = wz40Var17;
                            pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                            if (pj30Var != null) {
                                t33Var8 = t33Var8;
                                i13 = 0;
                                pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                            }
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i1112 = i10;
                            int i21111115 = i9;
                            int iC14 = idd.c(new int[]{i1112, i15, i12}, i21111115);
                            zcl zclVar14 = qmk.f28987a;
                            int i21111116 = i15;
                            int iW13 = (((int) c5n0Var.w0(2.0f)) * 2) + iC14;
                            int i21111117 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var14 = new i43(i21111117, iW13, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i21111116, i21111115, i1112, k6zVar2);
                            i16 = i14;
                            int i21111118 = i6;
                            final wz40 wz40Var21118 = wz40Var9;
                            c0d c0dVar113 = (c0d) wz40Var21118.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar113.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var18 = wz40Var18;
                                t33Var19 = t33Var10;
                                wz40Var110 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var21119 = wz40Var3;
                            wz40Var21119.f40005a = r5m0Var;
                            int i21111119 = p4e.i(j);
                            final wz40 wz40Var311111118 = wz40Var8;
                            final vne vneVar15 = vneVar;
                            final long j16 = jN;
                            final j43 j43Var17 = j43Var2;
                            final boolean z1112 = z16;
                            final boolean z213 = z17;
                            final wz40 wz40Var311111119 = wz40Var16;
                            final t33 t33Var2111116 = t33Var13;
                            final t33 t33Var2111117 = t33Var18;
                            final wz40 wz40Var3111111110 = wz40Var110;
                            final t33 t33Var2111118 = t33Var19;
                            final wz40 wz40Var3111111111 = wz40Var20;
                            final wz40 wz40Var3111111112 = wz40Var19;
                            final wz40 wz40Var3111111113 = wz40Var18;
                            final t33 t33Var2111119 = t33Var11;
                            return vj30.x(c5n0Var, i21111119, iW13, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar114;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var3111111114 = wz40Var21118;
                                    c0d c0dVar115 = (c0d) wz40Var3111111114.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var3111111111.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar116 = c0d.e;
                                    c0d c0dVar117 = c0dVar9;
                                    i43 i43Var15 = i43Var14;
                                    if (c0dVar117 == c0dVar116 && (c0dVar115 == c0d.d || c0dVar115 == c0dVar116)) {
                                        density2 = i43Var15.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var15.c;
                                    int i211111110 = i43Var15.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i211111110 / 2) - (i43Var15.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var15.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var15.h + density, (i211111110 / 2) - (i43Var15.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var15.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i211111110 / 2) - (i43Var15.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var15.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i211111110 / 2) - (i43Var15.n / 2), 0.0f);
                                    }
                                    if (c0dVar117 == c0dVar116 || !(z1112 || z213)) {
                                        wz40 wz40Var3111111115 = wz40Var311111118;
                                        bby bbyVar = (bby) wz40Var3111111115.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var21111110 = (t33) wz40Var3111111112.f40005a;
                                        t33 t33Var21111111 = (t33) wz40Var3111111110.f40005a;
                                        t33 t33Var30 = (t33) wz40Var311111119.f40005a;
                                        t33 t33Var31 = (t33) wz40Var21117.f40005a;
                                        c0d c0dVar118 = (c0d) wz40Var3111111114.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var21119.f40005a;
                                        vne vneVar16 = vneVar15;
                                        vneVar16.getClass();
                                        c0dVar118.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var2111116;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var21111110.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var2111118;
                                        t33Var35.getClass();
                                        t33Var21111111.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var2111117;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var2111119;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar114 = c0dVar117;
                                        wz40Var3111111115.f40005a = qjj.W(vneVar16, null, null, new z5m0(u5m0Var, k43Var3, j16, t33Var32, t33Var21111110, t33Var34, t33Var35, t33Var21111111, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar118, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar114 = c0dVar117;
                                    }
                                    wz40Var3111111114.f40005a = c0dVar114;
                                    wz40Var3111111113.f40005a = j43Var17.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        pu90Var3 = pu90VarS2;
                        wz40Var19 = wz40Var17;
                        t33Var18 = t33Var17;
                        i13 = 0;
                        pu90VarS3 = pu90Var2;
                        if (pu90VarS3 != null) {
                            i14 = pu90VarS3.f27604a;
                        } else {
                            i14 = i13;
                        }
                        if (pu90VarS3 != null) {
                            i15 = pu90VarS3.b;
                        } else {
                            i15 = i13;
                        }
                        int i1113 = i10;
                        int i211111110 = i9;
                        int iC15 = idd.c(new int[]{i1113, i15, i12}, i211111110);
                        zcl zclVar15 = qmk.f28987a;
                        int i211111111 = i15;
                        int iW14 = (((int) c5n0Var.w0(2.0f)) * 2) + iC15;
                        int i211111112 = p4e.i(j);
                        k6zVar2 = k6zVar;
                        final i43 i43Var15 = new i43(i211111112, iW14, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111111, i211111110, i1113, k6zVar2);
                        i16 = i14;
                        int i211111113 = i6;
                        final wz40 wz40Var211110 = wz40Var9;
                        c0d c0dVar114 = (c0d) wz40Var211110.f40005a;
                        zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                        c0dVar114.getClass();
                        c0dVar9 = c0dVar8;
                        if (c0dVar9 == c0d.f3518a) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (c0dVar9 != c0d.b) {
                            j43Var2 = j43Var3;
                            wz40Var18 = wz40Var18;
                            t33Var19 = t33Var10;
                            wz40Var110 = wz40Var22;
                            wz40Var20 = wz40Var26;
                            if (zBooleanValue2) {
                                fW0 = c5n0Var.w0(k43Var2.h());
                            } else {
                                fW0 = 0.0f;
                            }
                            f = i16 + i18 + fW0;
                            k6zVar3 = k6z.b;
                            if (k6zVar2 == k6zVar3) {
                                f *= -1.0f;
                            }
                            fW1 = c5n0Var.w0(k43Var2.f().c().f);
                            if (k6zVar2 == k6zVar3) {
                                fW1 *= -1.0f;
                            }
                            if (zBooleanValue2) {
                                fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                if (k6zVar2 == k6zVar3) {
                                    fW3 *= -1.0f;
                                }
                            }
                            r5m0Var = new r5m0(f, fW1, fW3);
                        } else {
                            j43Var2 = j43Var3;
                            wz40Var18 = wz40Var18;
                            t33Var19 = t33Var10;
                            wz40Var110 = wz40Var22;
                            wz40Var20 = wz40Var26;
                            if (zBooleanValue2) {
                                fW0 = c5n0Var.w0(k43Var2.h());
                            } else {
                                fW0 = 0.0f;
                            }
                            f = i16 + i18 + fW0;
                            k6zVar3 = k6z.b;
                            if (k6zVar2 == k6zVar3) {
                                f *= -1.0f;
                            }
                            fW1 = c5n0Var.w0(k43Var2.f().c().f);
                            if (k6zVar2 == k6zVar3) {
                                fW1 *= -1.0f;
                            }
                            if (zBooleanValue2) {
                                fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                if (k6zVar2 == k6zVar3) {
                                    fW3 *= -1.0f;
                                }
                            }
                            r5m0Var = new r5m0(f, fW1, fW3);
                        }
                        final wz40 wz40Var211111 = wz40Var3;
                        wz40Var211111.f40005a = r5m0Var;
                        int i211111114 = p4e.i(j);
                        final wz40 wz40Var3111111114 = wz40Var8;
                        final vne vneVar16 = vneVar;
                        final long j17 = jN;
                        final j43 j43Var18 = j43Var2;
                        final boolean z1113 = z16;
                        final boolean z214 = z17;
                        final wz40 wz40Var3111111115 = wz40Var16;
                        final t33 t33Var21111110 = t33Var13;
                        final t33 t33Var21111111 = t33Var18;
                        final wz40 wz40Var3111111116 = wz40Var110;
                        final t33 t33Var21111112 = t33Var19;
                        final wz40 wz40Var3111111117 = wz40Var20;
                        final wz40 wz40Var3111111118 = wz40Var19;
                        final wz40 wz40Var3111111119 = wz40Var18;
                        final t33 t33Var21111113 = t33Var11;
                        return vj30.x(c5n0Var, i211111114, iW14, new Function1() { // from class: a.l5m0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int density;
                                int density2;
                                c0d c0dVar115;
                                ou90 ou90Var = (ou90) obj7;
                                ou90Var.getClass();
                                wz40 wz40Var31111111110 = wz40Var211110;
                                c0d c0dVar116 = (c0d) wz40Var31111111110.f40005a;
                                boolean zBooleanValue3 = ((Boolean) wz40Var3111111117.f40005a).booleanValue();
                                k43 k43Var3 = k43Var2;
                                if (zBooleanValue3) {
                                    density = (int) (ou90Var.getDensity() * k43Var3.h());
                                } else {
                                    density = 0;
                                }
                                c0d c0dVar117 = c0d.e;
                                c0d c0dVar118 = c0dVar9;
                                i43 i43Var16 = i43Var15;
                                if (c0dVar118 == c0dVar117 && (c0dVar116 == c0d.d || c0dVar116 == c0dVar117)) {
                                    density2 = i43Var16.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                } else {
                                    density2 = 0;
                                }
                                pu90 pu90Var4 = i43Var16.c;
                                int i211111115 = i43Var16.b;
                                if (pu90Var4 != null) {
                                    ou90Var.m(pu90Var4, 0, (i211111115 / 2) - (i43Var16.k / 2), 0.0f);
                                }
                                pu90 pu90Var5 = i43Var16.e;
                                if (pu90Var5 != null) {
                                    ou90Var.m(pu90Var5, i43Var16.h + density, (i211111115 / 2) - (i43Var16.m / 2), 0.0f);
                                }
                                pu90 pu90Var6 = i43Var16.d;
                                if (pu90Var6 != null) {
                                    ou90Var.m(pu90Var6, density2, (i211111115 / 2) - (i43Var16.l / 2), 0.0f);
                                }
                                pu90 pu90Var7 = i43Var16.f;
                                if (pu90Var7 != null) {
                                    ou90Var.m(pu90Var7, 0, (i211111115 / 2) - (i43Var16.n / 2), 0.0f);
                                }
                                if (c0dVar118 == c0dVar117 || !(z1113 || z214)) {
                                    wz40 wz40Var31111111111 = wz40Var3111111114;
                                    bby bbyVar = (bby) wz40Var31111111111.f40005a;
                                    if (bbyVar != null) {
                                        bbyVar.cancel(null);
                                    }
                                    t33 t33Var21111114 = (t33) wz40Var3111111118.f40005a;
                                    t33 t33Var21111115 = (t33) wz40Var3111111116.f40005a;
                                    t33 t33Var30 = (t33) wz40Var3111111115.f40005a;
                                    t33 t33Var31 = (t33) wz40Var21117.f40005a;
                                    c0d c0dVar119 = (c0d) wz40Var31111111110.f40005a;
                                    u5m0 u5m0Var = (u5m0) wz40Var211111.f40005a;
                                    vne vneVar17 = vneVar16;
                                    vneVar17.getClass();
                                    c0dVar119.getClass();
                                    u5m0Var.getClass();
                                    t33 t33Var32 = t33Var21111110;
                                    t33Var32.getClass();
                                    t33 t33Var33 = t33Var12;
                                    t33Var33.getClass();
                                    t33Var21111114.getClass();
                                    t33 t33Var34 = t33Var8;
                                    t33Var34.getClass();
                                    t33 t33Var35 = t33Var21111112;
                                    t33Var35.getClass();
                                    t33Var21111115.getClass();
                                    t33 t33Var36 = t33Var9;
                                    t33Var36.getClass();
                                    t33 t33Var37 = t33Var21111111;
                                    t33Var37.getClass();
                                    t33Var30.getClass();
                                    t33 t33Var38 = t33Var21111113;
                                    t33Var38.getClass();
                                    t33Var31.getClass();
                                    c0dVar115 = c0dVar118;
                                    wz40Var31111111111.f40005a = qjj.W(vneVar17, null, null, new z5m0(u5m0Var, k43Var3, j17, t33Var32, t33Var21111114, t33Var34, t33Var35, t33Var21111115, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar119, t33Var33, t33Var38, null), 3);
                                } else {
                                    c0dVar115 = c0dVar118;
                                }
                                wz40Var31111111110.f40005a = c0dVar115;
                                wz40Var3111111119.f40005a = j43Var18.b;
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar.o0(obj);
            } else {
                final boolean z16 = z8;
                final wz40 wz40Var13 = wz40Var;
                i3 = 0;
                final boolean z17 = z3;
                obj = new Function2() { // from class: a.k5m0
                    /* JADX WARN: Code duplicated, block: B:121:0x034f  */
                    /* JADX WARN: Code duplicated, block: B:122:0x0358  */
                    /* JADX WARN: Code duplicated, block: B:125:0x0362  */
                    /* JADX WARN: Code duplicated, block: B:128:0x0374  */
                    /* JADX WARN: Code duplicated, block: B:131:0x037b  */
                    /* JADX WARN: Code duplicated, block: B:133:0x0389  */
                    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
                    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
                    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
                    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
                    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:56:0x01b0  */
                    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
                    /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
                    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
                    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
                    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
                    /* JADX WARN: Code duplicated, block: B:67:0x021b  */
                    /* JADX WARN: Code duplicated, block: B:69:0x0221  */
                    /* JADX WARN: Code duplicated, block: B:71:0x022c  */
                    /* JADX WARN: Code duplicated, block: B:72:0x0231  */
                    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
                    /* JADX WARN: Code duplicated, block: B:76:0x023a  */
                    /* JADX WARN: Code duplicated, block: B:79:0x028f  */
                    /* JADX WARN: Code duplicated, block: B:84:0x029a  */
                    /* JADX WARN: Code duplicated, block: B:87:0x02a2  */
                    /* JADX WARN: Code duplicated, block: B:89:0x02a6  */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i5;
                        pu90 pu90VarS;
                        int i6;
                        int i7;
                        c0d c0dVar6;
                        c0d c0dVar7;
                        int i8;
                        y9q0 y9q0VarB;
                        final t33 t33Var8;
                        final t33 t33Var9;
                        t33 t33Var10;
                        pu90 pu90Var;
                        c0d c0dVar8;
                        pu90 pu90Var2;
                        wz40 wz40Var14;
                        wz40 wz40Var15;
                        wz40 wz40Var16;
                        t33 t33Var11;
                        int i9;
                        int i10;
                        final t33 t33Var12;
                        boolean z18;
                        boolean z19;
                        t33 t33Var13;
                        long j;
                        wz40 wz40Var17;
                        pu90 pu90VarS2;
                        int i11;
                        int i12;
                        boolean zBooleanValue;
                        wz40 wz40Var18;
                        t33 t33Var14;
                        wz40 wz40Var19;
                        String str;
                        t33 t33Var15;
                        t33 t33Var16;
                        y9q0 y9q0VarB2;
                        t33 t33Var17;
                        pu90 pu90Var3;
                        wz40 wz40Var110;
                        t33 t33Var18;
                        int i13;
                        pu90 pu90VarS3;
                        int i14;
                        int i15;
                        k6z k6zVar2;
                        int i16;
                        boolean zBooleanValue2;
                        final c0d c0dVar9;
                        boolean z110;
                        j43 j43Var2;
                        t33 t33Var19;
                        wz40 wz40Var111;
                        wz40 wz40Var20;
                        Object r5m0Var;
                        float fW0;
                        float f;
                        k6z k6zVar3;
                        float fW1;
                        float fW2;
                        pj30 pj30Var;
                        pj30 pj30Var2;
                        j43 j43Var3 = j43Var;
                        String str2 = j43Var3.b;
                        c5n0 c5n0Var = (c5n0) obj5;
                        p4e p4eVar = (p4e) obj6;
                        c5n0Var.getClass();
                        boolean z111 = z16;
                        boolean z112 = z5;
                        wz40 wz40Var21 = wz40Var4;
                        wz40 wz40Var22 = wz40Var5;
                        final k43 k43Var2 = k43Var;
                        wz40 wz40Var23 = wz40Var7;
                        if (!z111 && !z112) {
                            wz40Var21.f40005a = xf0.c(1.0f);
                            wz40Var22.f40005a = m5k0.a(k43Var2.d());
                            wz40Var23.f40005a = xf0.c(1.0f);
                        }
                        float fW3 = 0.0f;
                        if (z2) {
                            wz40Var21.f40005a = xf0.c(0.0f);
                        }
                        wz40 wz40Var24 = wz40Var6;
                        if (!z111) {
                            wz40Var24.f40005a = xf0.c(0.0f);
                        }
                        long j2 = p4eVar.f26347a;
                        int i17 = p4e.i(j2);
                        wz40 wz40Var25 = wz40Var13;
                        String str3 = !z111 ? str2 : (String) wz40Var25.f40005a;
                        String str4 = j43Var3.f15865a;
                        boolean z113 = z17;
                        wz40 wz40Var26 = wz40Var2;
                        long jQ = wha0.Q(c5n0Var, k43Var2, z113, i17, str3, str4, wz40Var26, g9q0VarN);
                        t33 t33Var20 = (t33) wz40Var24.f40005a;
                        s4u0 s4u0Var = s4u0VarO;
                        t33 t33Var21 = t33Var;
                        pj30 pj30Var3 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("ARROW_ICON_LAYOUT_ID", new ugd(845420449, true, new m5m0(s4u0Var, t33Var20, t33Var21, gzcVarL))));
                        pu90 pu90VarS4 = pj30Var3 != null ? pj30Var3.S(r4e.b(0, 0, 0, 0, 15)) : null;
                        int i18 = pu90VarS4 != null ? pu90VarS4.f27604a : 0;
                        int i19 = pu90VarS4 != null ? pu90VarS4.b : 0;
                        s4u0 s4u0Var2 = s4u0VarO2;
                        t33 t33Var22 = t33Var2;
                        t33 t33Var23 = t33Var6;
                        if (s4u0Var2 != null) {
                            pj30 pj30Var4 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("BLOCKED_ICON_LAYOUT_ID", new ugd(-1396051194, true, new m5m0(t33Var22, t33Var23, gzcVarM, s4u0Var2))));
                            if (pj30Var4 != null) {
                                pu90VarS4 = pu90VarS4;
                                t33Var23 = t33Var23;
                                i5 = 0;
                                pu90VarS = pj30Var4.S(r4e.b(0, 0, 0, 0, 15));
                            } else {
                                i5 = 0;
                            }
                            if (pu90VarS != null) {
                                i6 = pu90VarS.f27604a;
                            } else {
                                i6 = i5;
                            }
                            if (pu90VarS != null) {
                                i7 = pu90VarS.b;
                            } else {
                                i7 = i5;
                            }
                            c0dVar6 = c0d.f;
                            c0dVar7 = c0dVar;
                            if (c0dVar7 != c0dVar6) {
                                i8 = 1;
                            } else {
                                i8 = i5;
                            }
                            y9q0VarB = k43Var2.b();
                            t33Var8 = t33Var7;
                            t33Var9 = t33Var4;
                            t33Var10 = t33Var3;
                            if (i8 != 0) {
                                pu90Var = pu90VarS;
                                c0dVar8 = c0dVar7;
                                pu90Var2 = null;
                                wz40Var14 = wz40Var21;
                                wz40Var15 = wz40Var23;
                                wz40Var16 = wz40Var25;
                                t33Var11 = t33Var23;
                                i9 = i19;
                                i10 = i7;
                                t33Var12 = t33Var22;
                                z18 = z111;
                                z19 = z112;
                                t33Var13 = t33Var21;
                                j = j2;
                                wz40Var17 = wz40Var24;
                                pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                                if (pj30Var2 != null) {
                                    pu90VarS2 = pj30Var2.S(r4e.b(i5, i5, i5, i5, 15));
                                }
                                if (pu90VarS2 != null) {
                                    i11 = pu90VarS2.f27604a;
                                } else {
                                    i11 = i5;
                                }
                                if (pu90VarS2 != null) {
                                    i12 = pu90VarS2.b;
                                } else {
                                    i12 = i5;
                                }
                                zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                                wz40Var18 = wz40Var14;
                                t33Var14 = (t33) wz40Var18.f40005a;
                                if (z18) {
                                    wz40Var19 = wz40Var16;
                                    str = (String) wz40Var19.f40005a;
                                } else {
                                    str = str2;
                                    wz40Var19 = wz40Var16;
                                }
                                t33Var15 = (t33) wz40Var22.f40005a;
                                final wz40 wz40Var21117 = wz40Var15;
                                t33Var16 = (t33) wz40Var21117.f40005a;
                                y9q0VarB2 = k43Var2.b();
                                t33Var17 = t33Var5;
                                if (zBooleanValue) {
                                    t33Var18 = t33Var17;
                                    pu90Var3 = pu90VarS2;
                                    wz40Var110 = wz40Var18;
                                    pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                    if (pj30Var != null) {
                                        t33Var8 = t33Var8;
                                        i13 = 0;
                                        pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                    }
                                    if (pu90VarS3 != null) {
                                        i14 = pu90VarS3.f27604a;
                                    } else {
                                        i14 = i13;
                                    }
                                    if (pu90VarS3 != null) {
                                        i15 = pu90VarS3.b;
                                    } else {
                                        i15 = i13;
                                    }
                                    int i1113 = i10;
                                    int i211111110 = i9;
                                    int iC15 = idd.c(new int[]{i1113, i15, i12}, i211111110);
                                    zcl zclVar15 = qmk.f28987a;
                                    int i211111111 = i15;
                                    int iW14 = (((int) c5n0Var.w0(2.0f)) * 2) + iC15;
                                    int i211111112 = p4e.i(j);
                                    k6zVar2 = k6zVar;
                                    final i43 i43Var15 = new i43(i211111112, iW14, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111111, i211111110, i1113, k6zVar2);
                                    i16 = i14;
                                    int i211111113 = i6;
                                    final wz40 wz40Var211110 = wz40Var9;
                                    c0d c0dVar114 = (c0d) wz40Var211110.f40005a;
                                    zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                    c0dVar114.getClass();
                                    c0dVar9 = c0dVar8;
                                    if (c0dVar9 == c0d.f3518a || !(c0dVar114 == c0d.d || c0dVar114 == c0d.e)) {
                                        z110 = false;
                                    } else {
                                        z110 = true;
                                    }
                                    if (c0dVar9 != c0d.b || c0dVar9 == c0d.c) {
                                        j43Var2 = j43Var3;
                                        wz40Var19 = wz40Var19;
                                        t33Var19 = t33Var10;
                                        wz40Var111 = wz40Var22;
                                        wz40Var20 = wz40Var26;
                                        if (zBooleanValue2) {
                                            fW0 = c5n0Var.w0(k43Var2.h());
                                        } else {
                                            fW0 = 0.0f;
                                        }
                                        f = i16 + i18 + fW0;
                                        k6zVar3 = k6z.b;
                                        if (k6zVar2 == k6zVar3) {
                                            f *= -1.0f;
                                        }
                                        fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                        if (k6zVar2 == k6zVar3) {
                                            fW1 *= -1.0f;
                                        }
                                        if (zBooleanValue2) {
                                            fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                            if (k6zVar2 == k6zVar3) {
                                                fW3 *= -1.0f;
                                            }
                                        }
                                        r5m0Var = new r5m0(f, fW1, fW3);
                                    } else {
                                        c0d c0dVar10 = c0d.e;
                                        if (c0dVar9 == c0dVar10) {
                                            j43Var2 = j43Var3;
                                            float f2 = i16;
                                            float fW4 = c5n0Var.w0(2.0f) + c5n0Var.w0(k43Var2.f().a().f) + (zBooleanValue2 ? c5n0Var.w0(k43Var2.h()) : 0.0f) + f2;
                                            k6z k6zVar4 = k6z.b;
                                            if (k6zVar2 == k6zVar4) {
                                                fW4 *= -1.0f;
                                            }
                                            t33Var19 = t33Var10;
                                            float f3 = fW4;
                                            wz40Var111 = wz40Var22;
                                            float F = x9x.F(c5n0Var, i43Var15, k43Var2);
                                            wz40Var20 = wz40Var26;
                                            if (c0dVar114 == c0d.d || c0dVar114 == c0dVar10) {
                                                fW2 = c5n0Var.w0(2.0f) + (-i211111113);
                                            } else {
                                                fW2 = 0.0f;
                                            }
                                            if (k6zVar2 == k6zVar4) {
                                                fW2 *= -1.0f;
                                            }
                                            if (zBooleanValue2) {
                                                fW3 = c5n0Var.w0(k43Var2.h()) + f2;
                                                if (k6zVar2 == k6zVar4) {
                                                    fW3 *= -1.0f;
                                                }
                                            }
                                            r5m0Var = new q5m0(f3, F, fW2, fW3);
                                        } else {
                                            j43Var2 = j43Var3;
                                            wz40Var19 = wz40Var19;
                                            t33Var19 = t33Var10;
                                            wz40Var111 = wz40Var22;
                                            wz40Var20 = wz40Var26;
                                            if (c0dVar9 == c0d.d) {
                                                r5m0Var = new p5m0(x9x.F(c5n0Var, i43Var15, k43Var2));
                                            } else {
                                                r5m0Var = z110 ? t5m0.f33375a : s5m0.f31661a;
                                            }
                                        }
                                    }
                                    final wz40 wz40Var211111 = wz40Var3;
                                    wz40Var211111.f40005a = r5m0Var;
                                    int i211111114 = p4e.i(j);
                                    final wz40 wz40Var3111111114 = wz40Var8;
                                    final vne vneVar16 = vneVar;
                                    final long j17 = jN;
                                    final j43 j43Var18 = j43Var2;
                                    final boolean z1113 = z18;
                                    final boolean z214 = z19;
                                    final wz40 wz40Var3111111115 = wz40Var17;
                                    final t33 t33Var21111110 = t33Var13;
                                    final t33 t33Var21111111 = t33Var18;
                                    final wz40 wz40Var3111111116 = wz40Var111;
                                    final t33 t33Var21111112 = t33Var19;
                                    final wz40 wz40Var3111111117 = wz40Var20;
                                    final wz40 wz40Var3111111118 = wz40Var110;
                                    final wz40 wz40Var3111111119 = wz40Var19;
                                    final t33 t33Var21111113 = t33Var11;
                                    return vj30.x(c5n0Var, i211111114, iW14, new Function1() { // from class: a.l5m0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            int density;
                                            int density2;
                                            c0d c0dVar115;
                                            ou90 ou90Var = (ou90) obj7;
                                            ou90Var.getClass();
                                            wz40 wz40Var31111111110 = wz40Var211110;
                                            c0d c0dVar116 = (c0d) wz40Var31111111110.f40005a;
                                            boolean zBooleanValue3 = ((Boolean) wz40Var3111111117.f40005a).booleanValue();
                                            k43 k43Var3 = k43Var2;
                                            if (zBooleanValue3) {
                                                density = (int) (ou90Var.getDensity() * k43Var3.h());
                                            } else {
                                                density = 0;
                                            }
                                            c0d c0dVar117 = c0d.e;
                                            c0d c0dVar118 = c0dVar9;
                                            i43 i43Var16 = i43Var15;
                                            if (c0dVar118 == c0dVar117 && (c0dVar116 == c0d.d || c0dVar116 == c0dVar117)) {
                                                density2 = i43Var16.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                            } else {
                                                density2 = 0;
                                            }
                                            pu90 pu90Var4 = i43Var16.c;
                                            int i211111115 = i43Var16.b;
                                            if (pu90Var4 != null) {
                                                ou90Var.m(pu90Var4, 0, (i211111115 / 2) - (i43Var16.k / 2), 0.0f);
                                            }
                                            pu90 pu90Var5 = i43Var16.e;
                                            if (pu90Var5 != null) {
                                                ou90Var.m(pu90Var5, i43Var16.h + density, (i211111115 / 2) - (i43Var16.m / 2), 0.0f);
                                            }
                                            pu90 pu90Var6 = i43Var16.d;
                                            if (pu90Var6 != null) {
                                                ou90Var.m(pu90Var6, density2, (i211111115 / 2) - (i43Var16.l / 2), 0.0f);
                                            }
                                            pu90 pu90Var7 = i43Var16.f;
                                            if (pu90Var7 != null) {
                                                ou90Var.m(pu90Var7, 0, (i211111115 / 2) - (i43Var16.n / 2), 0.0f);
                                            }
                                            if (c0dVar118 == c0dVar117 || !(z1113 || z214)) {
                                                wz40 wz40Var31111111111 = wz40Var3111111114;
                                                bby bbyVar = (bby) wz40Var31111111111.f40005a;
                                                if (bbyVar != null) {
                                                    bbyVar.cancel(null);
                                                }
                                                t33 t33Var21111114 = (t33) wz40Var3111111118.f40005a;
                                                t33 t33Var21111115 = (t33) wz40Var3111111116.f40005a;
                                                t33 t33Var30 = (t33) wz40Var3111111115.f40005a;
                                                t33 t33Var31 = (t33) wz40Var21117.f40005a;
                                                c0d c0dVar119 = (c0d) wz40Var31111111110.f40005a;
                                                u5m0 u5m0Var = (u5m0) wz40Var211111.f40005a;
                                                vne vneVar17 = vneVar16;
                                                vneVar17.getClass();
                                                c0dVar119.getClass();
                                                u5m0Var.getClass();
                                                t33 t33Var32 = t33Var21111110;
                                                t33Var32.getClass();
                                                t33 t33Var33 = t33Var12;
                                                t33Var33.getClass();
                                                t33Var21111114.getClass();
                                                t33 t33Var34 = t33Var8;
                                                t33Var34.getClass();
                                                t33 t33Var35 = t33Var21111112;
                                                t33Var35.getClass();
                                                t33Var21111115.getClass();
                                                t33 t33Var36 = t33Var9;
                                                t33Var36.getClass();
                                                t33 t33Var37 = t33Var21111111;
                                                t33Var37.getClass();
                                                t33Var30.getClass();
                                                t33 t33Var38 = t33Var21111113;
                                                t33Var38.getClass();
                                                t33Var31.getClass();
                                                c0dVar115 = c0dVar118;
                                                wz40Var31111111111.f40005a = qjj.W(vneVar17, null, null, new z5m0(u5m0Var, k43Var3, j17, t33Var32, t33Var21111114, t33Var34, t33Var35, t33Var21111115, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar119, t33Var33, t33Var38, null), 3);
                                            } else {
                                                c0dVar115 = c0dVar118;
                                            }
                                            wz40Var31111111110.f40005a = c0dVar115;
                                            wz40Var3111111119.f40005a = j43Var18.b;
                                            return Unit.f46060a;
                                        }
                                    });
                                }
                                pu90Var3 = pu90VarS2;
                                wz40Var110 = wz40Var18;
                                t33Var18 = t33Var17;
                                i13 = 0;
                                pu90VarS3 = pu90Var2;
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i1114 = i10;
                                int i211111115 = i9;
                                int iC16 = idd.c(new int[]{i1114, i15, i12}, i211111115);
                                zcl zclVar16 = qmk.f28987a;
                                int i211111116 = i15;
                                int iW15 = (((int) c5n0Var.w0(2.0f)) * 2) + iC16;
                                int i211111117 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var16 = new i43(i211111117, iW15, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111116, i211111115, i1114, k6zVar2);
                                i16 = i14;
                                int i211111118 = i6;
                                final wz40 wz40Var211112 = wz40Var9;
                                c0d c0dVar115 = (c0d) wz40Var211112.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar115.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z110 = false;
                                } else {
                                    z110 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var211113 = wz40Var3;
                                wz40Var211113.f40005a = r5m0Var;
                                int i211111119 = p4e.i(j);
                                final wz40 wz40Var31111111110 = wz40Var8;
                                final vne vneVar17 = vneVar;
                                final long j18 = jN;
                                final j43 j43Var19 = j43Var2;
                                final boolean z1114 = z18;
                                final boolean z215 = z19;
                                final wz40 wz40Var31111111111 = wz40Var17;
                                final t33 t33Var21111114 = t33Var13;
                                final t33 t33Var21111115 = t33Var18;
                                final wz40 wz40Var31111111112 = wz40Var111;
                                final t33 t33Var21111116 = t33Var19;
                                final wz40 wz40Var31111111113 = wz40Var20;
                                final wz40 wz40Var31111111114 = wz40Var110;
                                final wz40 wz40Var31111111115 = wz40Var19;
                                final t33 t33Var21111117 = t33Var11;
                                return vj30.x(c5n0Var, i211111119, iW15, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar116;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var31111111116 = wz40Var211112;
                                        c0d c0dVar117 = (c0d) wz40Var31111111116.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var31111111113.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar118 = c0d.e;
                                        c0d c0dVar119 = c0dVar9;
                                        i43 i43Var17 = i43Var16;
                                        if (c0dVar119 == c0dVar118 && (c0dVar117 == c0d.d || c0dVar117 == c0dVar118)) {
                                            density2 = i43Var17.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var17.c;
                                        int i2111111110 = i43Var17.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i2111111110 / 2) - (i43Var17.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var17.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var17.h + density, (i2111111110 / 2) - (i43Var17.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var17.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i2111111110 / 2) - (i43Var17.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var17.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i2111111110 / 2) - (i43Var17.n / 2), 0.0f);
                                        }
                                        if (c0dVar119 == c0dVar118 || !(z1114 || z215)) {
                                            wz40 wz40Var31111111117 = wz40Var31111111110;
                                            bby bbyVar = (bby) wz40Var31111111117.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var21111118 = (t33) wz40Var31111111114.f40005a;
                                            t33 t33Var21111119 = (t33) wz40Var31111111112.f40005a;
                                            t33 t33Var30 = (t33) wz40Var31111111111.f40005a;
                                            t33 t33Var31 = (t33) wz40Var21117.f40005a;
                                            c0d c0dVar1110 = (c0d) wz40Var31111111116.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var211113.f40005a;
                                            vne vneVar18 = vneVar17;
                                            vneVar18.getClass();
                                            c0dVar1110.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var21111114;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var21111118.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var21111116;
                                            t33Var35.getClass();
                                            t33Var21111119.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var21111115;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var21111117;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar116 = c0dVar119;
                                            wz40Var31111111117.f40005a = qjj.W(vneVar18, null, null, new z5m0(u5m0Var, k43Var3, j18, t33Var32, t33Var21111118, t33Var34, t33Var35, t33Var21111119, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1110, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar116 = c0dVar119;
                                        }
                                        wz40Var31111111116.f40005a = c0dVar116;
                                        wz40Var31111111115.f40005a = j43Var19.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var = pu90VarS;
                            c0dVar8 = c0dVar7;
                            pu90Var2 = null;
                            wz40Var14 = wz40Var21;
                            wz40Var15 = wz40Var23;
                            wz40Var16 = wz40Var25;
                            t33Var11 = t33Var23;
                            i9 = i19;
                            i10 = i7;
                            t33Var12 = t33Var22;
                            z18 = z111;
                            z19 = z112;
                            t33Var13 = t33Var21;
                            j = j2;
                            wz40Var17 = wz40Var24;
                            pu90VarS2 = pu90Var2;
                            if (pu90VarS2 != null) {
                                i11 = pu90VarS2.f27604a;
                            } else {
                                i11 = i5;
                            }
                            if (pu90VarS2 != null) {
                                i12 = pu90VarS2.b;
                            } else {
                                i12 = i5;
                            }
                            zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                            wz40Var18 = wz40Var14;
                            t33Var14 = (t33) wz40Var18.f40005a;
                            if (z18) {
                                str = str2;
                                wz40Var19 = wz40Var16;
                            } else {
                                wz40Var19 = wz40Var16;
                                str = (String) wz40Var19.f40005a;
                            }
                            t33Var15 = (t33) wz40Var22.f40005a;
                            final wz40 wz40Var21118 = wz40Var15;
                            t33Var16 = (t33) wz40Var21118.f40005a;
                            y9q0VarB2 = k43Var2.b();
                            t33Var17 = t33Var5;
                            if (zBooleanValue) {
                                t33Var18 = t33Var17;
                                pu90Var3 = pu90VarS2;
                                wz40Var110 = wz40Var18;
                                pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                if (pj30Var != null) {
                                    t33Var8 = t33Var8;
                                    i13 = 0;
                                    pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i1115 = i10;
                                int i2111111110 = i9;
                                int iC17 = idd.c(new int[]{i1115, i15, i12}, i2111111110);
                                zcl zclVar17 = qmk.f28987a;
                                int i2111111111 = i15;
                                int iW16 = (((int) c5n0Var.w0(2.0f)) * 2) + iC17;
                                int i2111111112 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var17 = new i43(i2111111112, iW16, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i2111111111, i2111111110, i1115, k6zVar2);
                                i16 = i14;
                                int i2111111113 = i6;
                                final wz40 wz40Var211114 = wz40Var9;
                                c0d c0dVar116 = (c0d) wz40Var211114.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar116.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z110 = false;
                                } else {
                                    z110 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var211115 = wz40Var3;
                                wz40Var211115.f40005a = r5m0Var;
                                int i2111111114 = p4e.i(j);
                                final wz40 wz40Var31111111116 = wz40Var8;
                                final vne vneVar18 = vneVar;
                                final long j19 = jN;
                                final j43 j43Var110 = j43Var2;
                                final boolean z1115 = z18;
                                final boolean z216 = z19;
                                final wz40 wz40Var31111111117 = wz40Var17;
                                final t33 t33Var21111118 = t33Var13;
                                final t33 t33Var21111119 = t33Var18;
                                final wz40 wz40Var31111111118 = wz40Var111;
                                final t33 t33Var211111110 = t33Var19;
                                final wz40 wz40Var31111111119 = wz40Var20;
                                final wz40 wz40Var311111111110 = wz40Var110;
                                final wz40 wz40Var311111111111 = wz40Var19;
                                final t33 t33Var211111111 = t33Var11;
                                return vj30.x(c5n0Var, i2111111114, iW16, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar117;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var311111111112 = wz40Var211114;
                                        c0d c0dVar118 = (c0d) wz40Var311111111112.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var31111111119.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar119 = c0d.e;
                                        c0d c0dVar1110 = c0dVar9;
                                        i43 i43Var18 = i43Var17;
                                        if (c0dVar1110 == c0dVar119 && (c0dVar118 == c0d.d || c0dVar118 == c0dVar119)) {
                                            density2 = i43Var18.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var18.c;
                                        int i2111111115 = i43Var18.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i2111111115 / 2) - (i43Var18.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var18.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var18.h + density, (i2111111115 / 2) - (i43Var18.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var18.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i2111111115 / 2) - (i43Var18.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var18.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i2111111115 / 2) - (i43Var18.n / 2), 0.0f);
                                        }
                                        if (c0dVar1110 == c0dVar119 || !(z1115 || z216)) {
                                            wz40 wz40Var311111111113 = wz40Var31111111116;
                                            bby bbyVar = (bby) wz40Var311111111113.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var211111112 = (t33) wz40Var311111111110.f40005a;
                                            t33 t33Var211111113 = (t33) wz40Var31111111118.f40005a;
                                            t33 t33Var30 = (t33) wz40Var31111111117.f40005a;
                                            t33 t33Var31 = (t33) wz40Var21118.f40005a;
                                            c0d c0dVar1111 = (c0d) wz40Var311111111112.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var211115.f40005a;
                                            vne vneVar19 = vneVar18;
                                            vneVar19.getClass();
                                            c0dVar1111.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var21111118;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var211111112.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var211111110;
                                            t33Var35.getClass();
                                            t33Var211111113.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var21111119;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var211111111;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar117 = c0dVar1110;
                                            wz40Var311111111113.f40005a = qjj.W(vneVar19, null, null, new z5m0(u5m0Var, k43Var3, j19, t33Var32, t33Var211111112, t33Var34, t33Var35, t33Var211111113, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1111, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar117 = c0dVar1110;
                                        }
                                        wz40Var311111111112.f40005a = c0dVar117;
                                        wz40Var311111111111.f40005a = j43Var110.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var3 = pu90VarS2;
                            wz40Var110 = wz40Var18;
                            t33Var18 = t33Var17;
                            i13 = 0;
                            pu90VarS3 = pu90Var2;
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i1116 = i10;
                            int i2111111115 = i9;
                            int iC18 = idd.c(new int[]{i1116, i15, i12}, i2111111115);
                            zcl zclVar18 = qmk.f28987a;
                            int i2111111116 = i15;
                            int iW17 = (((int) c5n0Var.w0(2.0f)) * 2) + iC18;
                            int i2111111117 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var18 = new i43(i2111111117, iW17, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i2111111116, i2111111115, i1116, k6zVar2);
                            i16 = i14;
                            int i2111111118 = i6;
                            final wz40 wz40Var211116 = wz40Var9;
                            c0d c0dVar117 = (c0d) wz40Var211116.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar117.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z110 = false;
                            } else {
                                z110 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var211117 = wz40Var3;
                            wz40Var211117.f40005a = r5m0Var;
                            int i2111111119 = p4e.i(j);
                            final wz40 wz40Var311111111112 = wz40Var8;
                            final vne vneVar19 = vneVar;
                            final long j110 = jN;
                            final j43 j43Var111 = j43Var2;
                            final boolean z1116 = z18;
                            final boolean z217 = z19;
                            final wz40 wz40Var311111111113 = wz40Var17;
                            final t33 t33Var211111112 = t33Var13;
                            final t33 t33Var211111113 = t33Var18;
                            final wz40 wz40Var311111111114 = wz40Var111;
                            final t33 t33Var211111114 = t33Var19;
                            final wz40 wz40Var311111111115 = wz40Var20;
                            final wz40 wz40Var311111111116 = wz40Var110;
                            final wz40 wz40Var311111111117 = wz40Var19;
                            final t33 t33Var211111115 = t33Var11;
                            return vj30.x(c5n0Var, i2111111119, iW17, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar118;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var311111111118 = wz40Var211116;
                                    c0d c0dVar119 = (c0d) wz40Var311111111118.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var311111111115.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar1110 = c0d.e;
                                    c0d c0dVar1111 = c0dVar9;
                                    i43 i43Var19 = i43Var18;
                                    if (c0dVar1111 == c0dVar1110 && (c0dVar119 == c0d.d || c0dVar119 == c0dVar1110)) {
                                        density2 = i43Var19.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var19.c;
                                    int i21111111110 = i43Var19.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i21111111110 / 2) - (i43Var19.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var19.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var19.h + density, (i21111111110 / 2) - (i43Var19.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var19.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i21111111110 / 2) - (i43Var19.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var19.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i21111111110 / 2) - (i43Var19.n / 2), 0.0f);
                                    }
                                    if (c0dVar1111 == c0dVar1110 || !(z1116 || z217)) {
                                        wz40 wz40Var311111111119 = wz40Var311111111112;
                                        bby bbyVar = (bby) wz40Var311111111119.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var211111116 = (t33) wz40Var311111111116.f40005a;
                                        t33 t33Var211111117 = (t33) wz40Var311111111114.f40005a;
                                        t33 t33Var30 = (t33) wz40Var311111111113.f40005a;
                                        t33 t33Var31 = (t33) wz40Var21118.f40005a;
                                        c0d c0dVar1112 = (c0d) wz40Var311111111118.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var211117.f40005a;
                                        vne vneVar110 = vneVar19;
                                        vneVar110.getClass();
                                        c0dVar1112.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var211111112;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var211111116.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var211111114;
                                        t33Var35.getClass();
                                        t33Var211111117.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var211111113;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var211111115;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar118 = c0dVar1111;
                                        wz40Var311111111119.f40005a = qjj.W(vneVar110, null, null, new z5m0(u5m0Var, k43Var3, j110, t33Var32, t33Var211111116, t33Var34, t33Var35, t33Var211111117, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1112, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar118 = c0dVar1111;
                                    }
                                    wz40Var311111111118.f40005a = c0dVar118;
                                    wz40Var311111111117.f40005a = j43Var111.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        i5 = 0;
                        pu90VarS = null;
                        if (pu90VarS != null) {
                            i6 = pu90VarS.f27604a;
                        } else {
                            i6 = i5;
                        }
                        if (pu90VarS != null) {
                            i7 = pu90VarS.b;
                        } else {
                            i7 = i5;
                        }
                        c0dVar6 = c0d.f;
                        c0dVar7 = c0dVar;
                        if (c0dVar7 != c0dVar6) {
                            i8 = 1;
                        } else {
                            i8 = i5;
                        }
                        y9q0VarB = k43Var2.b();
                        t33Var8 = t33Var7;
                        t33Var9 = t33Var4;
                        t33Var10 = t33Var3;
                        if (i8 != 0) {
                            pu90Var = pu90VarS;
                            c0dVar8 = c0dVar7;
                            pu90Var2 = null;
                            wz40Var14 = wz40Var21;
                            wz40Var15 = wz40Var23;
                            wz40Var16 = wz40Var25;
                            t33Var11 = t33Var23;
                            i9 = i19;
                            i10 = i7;
                            t33Var12 = t33Var22;
                            z18 = z111;
                            z19 = z112;
                            t33Var13 = t33Var21;
                            j = j2;
                            wz40Var17 = wz40Var24;
                            pj30Var2 = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("CUR_COEFFICIENT_LAYOUT_ID", new ugd(-1304704348, true, new jx1((byte) 3, jQ, (Object) t33Var8, (Object) t33Var9, (Object) j43Var3, (Object) y9q0VarB, (Object) t33Var10))));
                            if (pj30Var2 != null) {
                                pu90VarS2 = pj30Var2.S(r4e.b(i5, i5, i5, i5, 15));
                            }
                            if (pu90VarS2 != null) {
                                i11 = pu90VarS2.f27604a;
                            } else {
                                i11 = i5;
                            }
                            if (pu90VarS2 != null) {
                                i12 = pu90VarS2.b;
                            } else {
                                i12 = i5;
                            }
                            zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                            wz40Var18 = wz40Var14;
                            t33Var14 = (t33) wz40Var18.f40005a;
                            if (z18) {
                                str = str2;
                                wz40Var19 = wz40Var16;
                            } else {
                                wz40Var19 = wz40Var16;
                                str = (String) wz40Var19.f40005a;
                            }
                            t33Var15 = (t33) wz40Var22.f40005a;
                            final wz40 wz40Var21119 = wz40Var15;
                            t33Var16 = (t33) wz40Var21119.f40005a;
                            y9q0VarB2 = k43Var2.b();
                            t33Var17 = t33Var5;
                            if (zBooleanValue) {
                                t33Var18 = t33Var17;
                                pu90Var3 = pu90VarS2;
                                wz40Var110 = wz40Var18;
                                pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                                if (pj30Var != null) {
                                    t33Var8 = t33Var8;
                                    i13 = 0;
                                    pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                                }
                                if (pu90VarS3 != null) {
                                    i14 = pu90VarS3.f27604a;
                                } else {
                                    i14 = i13;
                                }
                                if (pu90VarS3 != null) {
                                    i15 = pu90VarS3.b;
                                } else {
                                    i15 = i13;
                                }
                                int i1117 = i10;
                                int i21111111110 = i9;
                                int iC19 = idd.c(new int[]{i1117, i15, i12}, i21111111110);
                                zcl zclVar19 = qmk.f28987a;
                                int i21111111111 = i15;
                                int iW18 = (((int) c5n0Var.w0(2.0f)) * 2) + iC19;
                                int i21111111112 = p4e.i(j);
                                k6zVar2 = k6zVar;
                                final i43 i43Var19 = new i43(i21111111112, iW18, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i21111111111, i21111111110, i1117, k6zVar2);
                                i16 = i14;
                                int i21111111113 = i6;
                                final wz40 wz40Var211118 = wz40Var9;
                                c0d c0dVar118 = (c0d) wz40Var211118.f40005a;
                                zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                                c0dVar118.getClass();
                                c0dVar9 = c0dVar8;
                                if (c0dVar9 == c0d.f3518a) {
                                    z110 = false;
                                } else {
                                    z110 = false;
                                }
                                if (c0dVar9 != c0d.b) {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                } else {
                                    j43Var2 = j43Var3;
                                    wz40Var19 = wz40Var19;
                                    t33Var19 = t33Var10;
                                    wz40Var111 = wz40Var22;
                                    wz40Var20 = wz40Var26;
                                    if (zBooleanValue2) {
                                        fW0 = c5n0Var.w0(k43Var2.h());
                                    } else {
                                        fW0 = 0.0f;
                                    }
                                    f = i16 + i18 + fW0;
                                    k6zVar3 = k6z.b;
                                    if (k6zVar2 == k6zVar3) {
                                        f *= -1.0f;
                                    }
                                    fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                    if (k6zVar2 == k6zVar3) {
                                        fW1 *= -1.0f;
                                    }
                                    if (zBooleanValue2) {
                                        fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                        if (k6zVar2 == k6zVar3) {
                                            fW3 *= -1.0f;
                                        }
                                    }
                                    r5m0Var = new r5m0(f, fW1, fW3);
                                }
                                final wz40 wz40Var211119 = wz40Var3;
                                wz40Var211119.f40005a = r5m0Var;
                                int i21111111114 = p4e.i(j);
                                final wz40 wz40Var311111111118 = wz40Var8;
                                final vne vneVar110 = vneVar;
                                final long j111 = jN;
                                final j43 j43Var112 = j43Var2;
                                final boolean z1117 = z18;
                                final boolean z218 = z19;
                                final wz40 wz40Var311111111119 = wz40Var17;
                                final t33 t33Var211111116 = t33Var13;
                                final t33 t33Var211111117 = t33Var18;
                                final wz40 wz40Var3111111111110 = wz40Var111;
                                final t33 t33Var211111118 = t33Var19;
                                final wz40 wz40Var3111111111111 = wz40Var20;
                                final wz40 wz40Var3111111111112 = wz40Var110;
                                final wz40 wz40Var3111111111113 = wz40Var19;
                                final t33 t33Var211111119 = t33Var11;
                                return vj30.x(c5n0Var, i21111111114, iW18, new Function1() { // from class: a.l5m0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        int density;
                                        int density2;
                                        c0d c0dVar119;
                                        ou90 ou90Var = (ou90) obj7;
                                        ou90Var.getClass();
                                        wz40 wz40Var3111111111114 = wz40Var211118;
                                        c0d c0dVar1110 = (c0d) wz40Var3111111111114.f40005a;
                                        boolean zBooleanValue3 = ((Boolean) wz40Var3111111111111.f40005a).booleanValue();
                                        k43 k43Var3 = k43Var2;
                                        if (zBooleanValue3) {
                                            density = (int) (ou90Var.getDensity() * k43Var3.h());
                                        } else {
                                            density = 0;
                                        }
                                        c0d c0dVar1111 = c0d.e;
                                        c0d c0dVar1112 = c0dVar9;
                                        i43 i43Var110 = i43Var19;
                                        if (c0dVar1112 == c0dVar1111 && (c0dVar1110 == c0d.d || c0dVar1110 == c0dVar1111)) {
                                            density2 = i43Var110.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                        } else {
                                            density2 = 0;
                                        }
                                        pu90 pu90Var4 = i43Var110.c;
                                        int i21111111115 = i43Var110.b;
                                        if (pu90Var4 != null) {
                                            ou90Var.m(pu90Var4, 0, (i21111111115 / 2) - (i43Var110.k / 2), 0.0f);
                                        }
                                        pu90 pu90Var5 = i43Var110.e;
                                        if (pu90Var5 != null) {
                                            ou90Var.m(pu90Var5, i43Var110.h + density, (i21111111115 / 2) - (i43Var110.m / 2), 0.0f);
                                        }
                                        pu90 pu90Var6 = i43Var110.d;
                                        if (pu90Var6 != null) {
                                            ou90Var.m(pu90Var6, density2, (i21111111115 / 2) - (i43Var110.l / 2), 0.0f);
                                        }
                                        pu90 pu90Var7 = i43Var110.f;
                                        if (pu90Var7 != null) {
                                            ou90Var.m(pu90Var7, 0, (i21111111115 / 2) - (i43Var110.n / 2), 0.0f);
                                        }
                                        if (c0dVar1112 == c0dVar1111 || !(z1117 || z218)) {
                                            wz40 wz40Var3111111111115 = wz40Var311111111118;
                                            bby bbyVar = (bby) wz40Var3111111111115.f40005a;
                                            if (bbyVar != null) {
                                                bbyVar.cancel(null);
                                            }
                                            t33 t33Var2111111110 = (t33) wz40Var3111111111112.f40005a;
                                            t33 t33Var2111111111 = (t33) wz40Var3111111111110.f40005a;
                                            t33 t33Var30 = (t33) wz40Var311111111119.f40005a;
                                            t33 t33Var31 = (t33) wz40Var21119.f40005a;
                                            c0d c0dVar1113 = (c0d) wz40Var3111111111114.f40005a;
                                            u5m0 u5m0Var = (u5m0) wz40Var211119.f40005a;
                                            vne vneVar111 = vneVar110;
                                            vneVar111.getClass();
                                            c0dVar1113.getClass();
                                            u5m0Var.getClass();
                                            t33 t33Var32 = t33Var211111116;
                                            t33Var32.getClass();
                                            t33 t33Var33 = t33Var12;
                                            t33Var33.getClass();
                                            t33Var2111111110.getClass();
                                            t33 t33Var34 = t33Var8;
                                            t33Var34.getClass();
                                            t33 t33Var35 = t33Var211111118;
                                            t33Var35.getClass();
                                            t33Var2111111111.getClass();
                                            t33 t33Var36 = t33Var9;
                                            t33Var36.getClass();
                                            t33 t33Var37 = t33Var211111117;
                                            t33Var37.getClass();
                                            t33Var30.getClass();
                                            t33 t33Var38 = t33Var211111119;
                                            t33Var38.getClass();
                                            t33Var31.getClass();
                                            c0dVar119 = c0dVar1112;
                                            wz40Var3111111111115.f40005a = qjj.W(vneVar111, null, null, new z5m0(u5m0Var, k43Var3, j111, t33Var32, t33Var2111111110, t33Var34, t33Var35, t33Var2111111111, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1113, t33Var33, t33Var38, null), 3);
                                        } else {
                                            c0dVar119 = c0dVar1112;
                                        }
                                        wz40Var3111111111114.f40005a = c0dVar119;
                                        wz40Var3111111111113.f40005a = j43Var112.b;
                                        return Unit.f46060a;
                                    }
                                });
                            }
                            pu90Var3 = pu90VarS2;
                            wz40Var110 = wz40Var18;
                            t33Var18 = t33Var17;
                            i13 = 0;
                            pu90VarS3 = pu90Var2;
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i1118 = i10;
                            int i21111111115 = i9;
                            int iC110 = idd.c(new int[]{i1118, i15, i12}, i21111111115);
                            zcl zclVar110 = qmk.f28987a;
                            int i21111111116 = i15;
                            int iW19 = (((int) c5n0Var.w0(2.0f)) * 2) + iC110;
                            int i21111111117 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var110 = new i43(i21111111117, iW19, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i21111111116, i21111111115, i1118, k6zVar2);
                            i16 = i14;
                            int i21111111118 = i6;
                            final wz40 wz40Var2111110 = wz40Var9;
                            c0d c0dVar119 = (c0d) wz40Var2111110.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar119.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z110 = false;
                            } else {
                                z110 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var2111111 = wz40Var3;
                            wz40Var2111111.f40005a = r5m0Var;
                            int i21111111119 = p4e.i(j);
                            final wz40 wz40Var3111111111114 = wz40Var8;
                            final vne vneVar111 = vneVar;
                            final long j112 = jN;
                            final j43 j43Var113 = j43Var2;
                            final boolean z1118 = z18;
                            final boolean z219 = z19;
                            final wz40 wz40Var3111111111115 = wz40Var17;
                            final t33 t33Var2111111110 = t33Var13;
                            final t33 t33Var2111111111 = t33Var18;
                            final wz40 wz40Var3111111111116 = wz40Var111;
                            final t33 t33Var2111111112 = t33Var19;
                            final wz40 wz40Var3111111111117 = wz40Var20;
                            final wz40 wz40Var3111111111118 = wz40Var110;
                            final wz40 wz40Var3111111111119 = wz40Var19;
                            final t33 t33Var2111111113 = t33Var11;
                            return vj30.x(c5n0Var, i21111111119, iW19, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar1110;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var31111111111110 = wz40Var2111110;
                                    c0d c0dVar1111 = (c0d) wz40Var31111111111110.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var3111111111117.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar1112 = c0d.e;
                                    c0d c0dVar1113 = c0dVar9;
                                    i43 i43Var111 = i43Var110;
                                    if (c0dVar1113 == c0dVar1112 && (c0dVar1111 == c0d.d || c0dVar1111 == c0dVar1112)) {
                                        density2 = i43Var111.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var111.c;
                                    int i211111111110 = i43Var111.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i211111111110 / 2) - (i43Var111.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var111.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var111.h + density, (i211111111110 / 2) - (i43Var111.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var111.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i211111111110 / 2) - (i43Var111.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var111.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i211111111110 / 2) - (i43Var111.n / 2), 0.0f);
                                    }
                                    if (c0dVar1113 == c0dVar1112 || !(z1118 || z219)) {
                                        wz40 wz40Var31111111111111 = wz40Var3111111111114;
                                        bby bbyVar = (bby) wz40Var31111111111111.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var2111111114 = (t33) wz40Var3111111111118.f40005a;
                                        t33 t33Var2111111115 = (t33) wz40Var3111111111116.f40005a;
                                        t33 t33Var30 = (t33) wz40Var3111111111115.f40005a;
                                        t33 t33Var31 = (t33) wz40Var21119.f40005a;
                                        c0d c0dVar1114 = (c0d) wz40Var31111111111110.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var2111111.f40005a;
                                        vne vneVar112 = vneVar111;
                                        vneVar112.getClass();
                                        c0dVar1114.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var2111111110;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var2111111114.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var2111111112;
                                        t33Var35.getClass();
                                        t33Var2111111115.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var2111111111;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var2111111113;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar1110 = c0dVar1113;
                                        wz40Var31111111111111.f40005a = qjj.W(vneVar112, null, null, new z5m0(u5m0Var, k43Var3, j112, t33Var32, t33Var2111111114, t33Var34, t33Var35, t33Var2111111115, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1114, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar1110 = c0dVar1113;
                                    }
                                    wz40Var31111111111110.f40005a = c0dVar1110;
                                    wz40Var3111111111119.f40005a = j43Var113.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        pu90Var = pu90VarS;
                        c0dVar8 = c0dVar7;
                        pu90Var2 = null;
                        wz40Var14 = wz40Var21;
                        wz40Var15 = wz40Var23;
                        wz40Var16 = wz40Var25;
                        t33Var11 = t33Var23;
                        i9 = i19;
                        i10 = i7;
                        t33Var12 = t33Var22;
                        z18 = z111;
                        z19 = z112;
                        t33Var13 = t33Var21;
                        j = j2;
                        wz40Var17 = wz40Var24;
                        pu90VarS2 = pu90Var2;
                        if (pu90VarS2 != null) {
                            i11 = pu90VarS2.f27604a;
                        } else {
                            i11 = i5;
                        }
                        if (pu90VarS2 != null) {
                            i12 = pu90VarS2.b;
                        } else {
                            i12 = i5;
                        }
                        zBooleanValue = ((Boolean) wz40Var26.f40005a).booleanValue();
                        wz40Var18 = wz40Var14;
                        t33Var14 = (t33) wz40Var18.f40005a;
                        if (z18) {
                            str = str2;
                            wz40Var19 = wz40Var16;
                        } else {
                            wz40Var19 = wz40Var16;
                            str = (String) wz40Var19.f40005a;
                        }
                        t33Var15 = (t33) wz40Var22.f40005a;
                        final wz40 wz40Var211120 = wz40Var15;
                        t33Var16 = (t33) wz40Var211120.f40005a;
                        y9q0VarB2 = k43Var2.b();
                        t33Var17 = t33Var5;
                        if (zBooleanValue) {
                            t33Var18 = t33Var17;
                            pu90Var3 = pu90VarS2;
                            wz40Var110 = wz40Var18;
                            pj30Var = (pj30) CollectionsKt.firstOrNull(c5n0Var.k("OLD_COEFFICIENT_LAYOUT_ID", new ugd(-1743167967, true, new n5m0(t33Var15, t33Var14, t33Var18, t33Var16, y9q0VarB2, jQ, str))));
                            if (pj30Var != null) {
                                t33Var8 = t33Var8;
                                i13 = 0;
                                pu90VarS3 = pj30Var.S(r4e.b(0, 0, 0, 0, 15));
                            }
                            if (pu90VarS3 != null) {
                                i14 = pu90VarS3.f27604a;
                            } else {
                                i14 = i13;
                            }
                            if (pu90VarS3 != null) {
                                i15 = pu90VarS3.b;
                            } else {
                                i15 = i13;
                            }
                            int i1119 = i10;
                            int i211111111110 = i9;
                            int iC111 = idd.c(new int[]{i1119, i15, i12}, i211111111110);
                            zcl zclVar111 = qmk.f28987a;
                            int i211111111111 = i15;
                            int iW110 = (((int) c5n0Var.w0(2.0f)) * 2) + iC111;
                            int i211111111112 = p4e.i(j);
                            k6zVar2 = k6zVar;
                            final i43 i43Var111 = new i43(i211111111112, iW110, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111111111, i211111111110, i1119, k6zVar2);
                            i16 = i14;
                            int i211111111113 = i6;
                            final wz40 wz40Var2111112 = wz40Var9;
                            c0d c0dVar1110 = (c0d) wz40Var2111112.f40005a;
                            zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                            c0dVar1110.getClass();
                            c0dVar9 = c0dVar8;
                            if (c0dVar9 == c0d.f3518a) {
                                z110 = false;
                            } else {
                                z110 = false;
                            }
                            if (c0dVar9 != c0d.b) {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            } else {
                                j43Var2 = j43Var3;
                                wz40Var19 = wz40Var19;
                                t33Var19 = t33Var10;
                                wz40Var111 = wz40Var22;
                                wz40Var20 = wz40Var26;
                                if (zBooleanValue2) {
                                    fW0 = c5n0Var.w0(k43Var2.h());
                                } else {
                                    fW0 = 0.0f;
                                }
                                f = i16 + i18 + fW0;
                                k6zVar3 = k6z.b;
                                if (k6zVar2 == k6zVar3) {
                                    f *= -1.0f;
                                }
                                fW1 = c5n0Var.w0(k43Var2.f().c().f);
                                if (k6zVar2 == k6zVar3) {
                                    fW1 *= -1.0f;
                                }
                                if (zBooleanValue2) {
                                    fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                    if (k6zVar2 == k6zVar3) {
                                        fW3 *= -1.0f;
                                    }
                                }
                                r5m0Var = new r5m0(f, fW1, fW3);
                            }
                            final wz40 wz40Var2111113 = wz40Var3;
                            wz40Var2111113.f40005a = r5m0Var;
                            int i211111111114 = p4e.i(j);
                            final wz40 wz40Var31111111111110 = wz40Var8;
                            final vne vneVar112 = vneVar;
                            final long j113 = jN;
                            final j43 j43Var114 = j43Var2;
                            final boolean z1119 = z18;
                            final boolean z2110 = z19;
                            final wz40 wz40Var31111111111111 = wz40Var17;
                            final t33 t33Var2111111114 = t33Var13;
                            final t33 t33Var2111111115 = t33Var18;
                            final wz40 wz40Var31111111111112 = wz40Var111;
                            final t33 t33Var2111111116 = t33Var19;
                            final wz40 wz40Var31111111111113 = wz40Var20;
                            final wz40 wz40Var31111111111114 = wz40Var110;
                            final wz40 wz40Var31111111111115 = wz40Var19;
                            final t33 t33Var2111111117 = t33Var11;
                            return vj30.x(c5n0Var, i211111111114, iW110, new Function1() { // from class: a.l5m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    int density;
                                    int density2;
                                    c0d c0dVar1111;
                                    ou90 ou90Var = (ou90) obj7;
                                    ou90Var.getClass();
                                    wz40 wz40Var31111111111116 = wz40Var2111112;
                                    c0d c0dVar1112 = (c0d) wz40Var31111111111116.f40005a;
                                    boolean zBooleanValue3 = ((Boolean) wz40Var31111111111113.f40005a).booleanValue();
                                    k43 k43Var3 = k43Var2;
                                    if (zBooleanValue3) {
                                        density = (int) (ou90Var.getDensity() * k43Var3.h());
                                    } else {
                                        density = 0;
                                    }
                                    c0d c0dVar1113 = c0d.e;
                                    c0d c0dVar1114 = c0dVar9;
                                    i43 i43Var112 = i43Var111;
                                    if (c0dVar1114 == c0dVar1113 && (c0dVar1112 == c0d.d || c0dVar1112 == c0dVar1113)) {
                                        density2 = i43Var112.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                    } else {
                                        density2 = 0;
                                    }
                                    pu90 pu90Var4 = i43Var112.c;
                                    int i211111111115 = i43Var112.b;
                                    if (pu90Var4 != null) {
                                        ou90Var.m(pu90Var4, 0, (i211111111115 / 2) - (i43Var112.k / 2), 0.0f);
                                    }
                                    pu90 pu90Var5 = i43Var112.e;
                                    if (pu90Var5 != null) {
                                        ou90Var.m(pu90Var5, i43Var112.h + density, (i211111111115 / 2) - (i43Var112.m / 2), 0.0f);
                                    }
                                    pu90 pu90Var6 = i43Var112.d;
                                    if (pu90Var6 != null) {
                                        ou90Var.m(pu90Var6, density2, (i211111111115 / 2) - (i43Var112.l / 2), 0.0f);
                                    }
                                    pu90 pu90Var7 = i43Var112.f;
                                    if (pu90Var7 != null) {
                                        ou90Var.m(pu90Var7, 0, (i211111111115 / 2) - (i43Var112.n / 2), 0.0f);
                                    }
                                    if (c0dVar1114 == c0dVar1113 || !(z1119 || z2110)) {
                                        wz40 wz40Var31111111111117 = wz40Var31111111111110;
                                        bby bbyVar = (bby) wz40Var31111111111117.f40005a;
                                        if (bbyVar != null) {
                                            bbyVar.cancel(null);
                                        }
                                        t33 t33Var2111111118 = (t33) wz40Var31111111111114.f40005a;
                                        t33 t33Var2111111119 = (t33) wz40Var31111111111112.f40005a;
                                        t33 t33Var30 = (t33) wz40Var31111111111111.f40005a;
                                        t33 t33Var31 = (t33) wz40Var211120.f40005a;
                                        c0d c0dVar1115 = (c0d) wz40Var31111111111116.f40005a;
                                        u5m0 u5m0Var = (u5m0) wz40Var2111113.f40005a;
                                        vne vneVar113 = vneVar112;
                                        vneVar113.getClass();
                                        c0dVar1115.getClass();
                                        u5m0Var.getClass();
                                        t33 t33Var32 = t33Var2111111114;
                                        t33Var32.getClass();
                                        t33 t33Var33 = t33Var12;
                                        t33Var33.getClass();
                                        t33Var2111111118.getClass();
                                        t33 t33Var34 = t33Var8;
                                        t33Var34.getClass();
                                        t33 t33Var35 = t33Var2111111116;
                                        t33Var35.getClass();
                                        t33Var2111111119.getClass();
                                        t33 t33Var36 = t33Var9;
                                        t33Var36.getClass();
                                        t33 t33Var37 = t33Var2111111115;
                                        t33Var37.getClass();
                                        t33Var30.getClass();
                                        t33 t33Var38 = t33Var2111111117;
                                        t33Var38.getClass();
                                        t33Var31.getClass();
                                        c0dVar1111 = c0dVar1114;
                                        wz40Var31111111111117.f40005a = qjj.W(vneVar113, null, null, new z5m0(u5m0Var, k43Var3, j113, t33Var32, t33Var2111111118, t33Var34, t33Var35, t33Var2111111119, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1115, t33Var33, t33Var38, null), 3);
                                    } else {
                                        c0dVar1111 = c0dVar1114;
                                    }
                                    wz40Var31111111111116.f40005a = c0dVar1111;
                                    wz40Var31111111111115.f40005a = j43Var114.b;
                                    return Unit.f46060a;
                                }
                            });
                        }
                        pu90Var3 = pu90VarS2;
                        wz40Var110 = wz40Var18;
                        t33Var18 = t33Var17;
                        i13 = 0;
                        pu90VarS3 = pu90Var2;
                        if (pu90VarS3 != null) {
                            i14 = pu90VarS3.f27604a;
                        } else {
                            i14 = i13;
                        }
                        if (pu90VarS3 != null) {
                            i15 = pu90VarS3.b;
                        } else {
                            i15 = i13;
                        }
                        int i11110 = i10;
                        int i211111111115 = i9;
                        int iC112 = idd.c(new int[]{i11110, i15, i12}, i211111111115);
                        zcl zclVar112 = qmk.f28987a;
                        int i211111111116 = i15;
                        int iW111 = (((int) c5n0Var.w0(2.0f)) * 2) + iC112;
                        int i211111111117 = p4e.i(j);
                        k6zVar2 = k6zVar;
                        final i43 i43Var112 = new i43(i211111111117, iW111, pu90Var3, pu90VarS3, pu90VarS4, pu90Var, i11, i14, i18, i6, i12, i211111111116, i211111111115, i11110, k6zVar2);
                        i16 = i14;
                        int i211111111118 = i6;
                        final wz40 wz40Var2111114 = wz40Var9;
                        c0d c0dVar1111 = (c0d) wz40Var2111114.f40005a;
                        zBooleanValue2 = ((Boolean) wz40Var26.f40005a).booleanValue();
                        c0dVar1111.getClass();
                        c0dVar9 = c0dVar8;
                        if (c0dVar9 == c0d.f3518a) {
                            z110 = false;
                        } else {
                            z110 = false;
                        }
                        if (c0dVar9 != c0d.b) {
                            j43Var2 = j43Var3;
                            wz40Var19 = wz40Var19;
                            t33Var19 = t33Var10;
                            wz40Var111 = wz40Var22;
                            wz40Var20 = wz40Var26;
                            if (zBooleanValue2) {
                                fW0 = c5n0Var.w0(k43Var2.h());
                            } else {
                                fW0 = 0.0f;
                            }
                            f = i16 + i18 + fW0;
                            k6zVar3 = k6z.b;
                            if (k6zVar2 == k6zVar3) {
                                f *= -1.0f;
                            }
                            fW1 = c5n0Var.w0(k43Var2.f().c().f);
                            if (k6zVar2 == k6zVar3) {
                                fW1 *= -1.0f;
                            }
                            if (zBooleanValue2) {
                                fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                if (k6zVar2 == k6zVar3) {
                                    fW3 *= -1.0f;
                                }
                            }
                            r5m0Var = new r5m0(f, fW1, fW3);
                        } else {
                            j43Var2 = j43Var3;
                            wz40Var19 = wz40Var19;
                            t33Var19 = t33Var10;
                            wz40Var111 = wz40Var22;
                            wz40Var20 = wz40Var26;
                            if (zBooleanValue2) {
                                fW0 = c5n0Var.w0(k43Var2.h());
                            } else {
                                fW0 = 0.0f;
                            }
                            f = i16 + i18 + fW0;
                            k6zVar3 = k6z.b;
                            if (k6zVar2 == k6zVar3) {
                                f *= -1.0f;
                            }
                            fW1 = c5n0Var.w0(k43Var2.f().c().f);
                            if (k6zVar2 == k6zVar3) {
                                fW1 *= -1.0f;
                            }
                            if (zBooleanValue2) {
                                fW3 = (-i16) - c5n0Var.w0(k43Var2.h());
                                if (k6zVar2 == k6zVar3) {
                                    fW3 *= -1.0f;
                                }
                            }
                            r5m0Var = new r5m0(f, fW1, fW3);
                        }
                        final wz40 wz40Var2111115 = wz40Var3;
                        wz40Var2111115.f40005a = r5m0Var;
                        int i211111111119 = p4e.i(j);
                        final wz40 wz40Var31111111111116 = wz40Var8;
                        final vne vneVar113 = vneVar;
                        final long j114 = jN;
                        final j43 j43Var115 = j43Var2;
                        final boolean z11110 = z18;
                        final boolean z2111 = z19;
                        final wz40 wz40Var31111111111117 = wz40Var17;
                        final t33 t33Var2111111118 = t33Var13;
                        final t33 t33Var2111111119 = t33Var18;
                        final wz40 wz40Var31111111111118 = wz40Var111;
                        final t33 t33Var21111111110 = t33Var19;
                        final wz40 wz40Var31111111111119 = wz40Var20;
                        final wz40 wz40Var311111111111110 = wz40Var110;
                        final wz40 wz40Var311111111111111 = wz40Var19;
                        final t33 t33Var21111111111 = t33Var11;
                        return vj30.x(c5n0Var, i211111111119, iW111, new Function1() { // from class: a.l5m0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int density;
                                int density2;
                                c0d c0dVar1112;
                                ou90 ou90Var = (ou90) obj7;
                                ou90Var.getClass();
                                wz40 wz40Var311111111111112 = wz40Var2111114;
                                c0d c0dVar1113 = (c0d) wz40Var311111111111112.f40005a;
                                boolean zBooleanValue3 = ((Boolean) wz40Var31111111111119.f40005a).booleanValue();
                                k43 k43Var3 = k43Var2;
                                if (zBooleanValue3) {
                                    density = (int) (ou90Var.getDensity() * k43Var3.h());
                                } else {
                                    density = 0;
                                }
                                c0d c0dVar1114 = c0d.e;
                                c0d c0dVar1115 = c0dVar9;
                                i43 i43Var113 = i43Var112;
                                if (c0dVar1115 == c0dVar1114 && (c0dVar1113 == c0d.d || c0dVar1113 == c0dVar1114)) {
                                    density2 = i43Var113.j + ((int) (ou90Var.getDensity() * k43Var3.k()));
                                } else {
                                    density2 = 0;
                                }
                                pu90 pu90Var4 = i43Var113.c;
                                int i2111111111110 = i43Var113.b;
                                if (pu90Var4 != null) {
                                    ou90Var.m(pu90Var4, 0, (i2111111111110 / 2) - (i43Var113.k / 2), 0.0f);
                                }
                                pu90 pu90Var5 = i43Var113.e;
                                if (pu90Var5 != null) {
                                    ou90Var.m(pu90Var5, i43Var113.h + density, (i2111111111110 / 2) - (i43Var113.m / 2), 0.0f);
                                }
                                pu90 pu90Var6 = i43Var113.d;
                                if (pu90Var6 != null) {
                                    ou90Var.m(pu90Var6, density2, (i2111111111110 / 2) - (i43Var113.l / 2), 0.0f);
                                }
                                pu90 pu90Var7 = i43Var113.f;
                                if (pu90Var7 != null) {
                                    ou90Var.m(pu90Var7, 0, (i2111111111110 / 2) - (i43Var113.n / 2), 0.0f);
                                }
                                if (c0dVar1115 == c0dVar1114 || !(z11110 || z2111)) {
                                    wz40 wz40Var311111111111113 = wz40Var31111111111116;
                                    bby bbyVar = (bby) wz40Var311111111111113.f40005a;
                                    if (bbyVar != null) {
                                        bbyVar.cancel(null);
                                    }
                                    t33 t33Var21111111112 = (t33) wz40Var311111111111110.f40005a;
                                    t33 t33Var21111111113 = (t33) wz40Var31111111111118.f40005a;
                                    t33 t33Var30 = (t33) wz40Var31111111111117.f40005a;
                                    t33 t33Var31 = (t33) wz40Var211120.f40005a;
                                    c0d c0dVar1116 = (c0d) wz40Var311111111111112.f40005a;
                                    u5m0 u5m0Var = (u5m0) wz40Var2111115.f40005a;
                                    vne vneVar114 = vneVar113;
                                    vneVar114.getClass();
                                    c0dVar1116.getClass();
                                    u5m0Var.getClass();
                                    t33 t33Var32 = t33Var2111111118;
                                    t33Var32.getClass();
                                    t33 t33Var33 = t33Var12;
                                    t33Var33.getClass();
                                    t33Var21111111112.getClass();
                                    t33 t33Var34 = t33Var8;
                                    t33Var34.getClass();
                                    t33 t33Var35 = t33Var21111111110;
                                    t33Var35.getClass();
                                    t33Var21111111113.getClass();
                                    t33 t33Var36 = t33Var9;
                                    t33Var36.getClass();
                                    t33 t33Var37 = t33Var2111111119;
                                    t33Var37.getClass();
                                    t33Var30.getClass();
                                    t33 t33Var38 = t33Var21111111111;
                                    t33Var38.getClass();
                                    t33Var31.getClass();
                                    c0dVar1112 = c0dVar1115;
                                    wz40Var311111111111113.f40005a = qjj.W(vneVar114, null, null, new z5m0(u5m0Var, k43Var3, j114, t33Var32, t33Var21111111112, t33Var34, t33Var35, t33Var21111111113, t33Var36, t33Var30, t33Var31, t33Var37, c0dVar1116, t33Var33, t33Var38, null), 3);
                                } else {
                                    c0dVar1112 = c0dVar1115;
                                }
                                wz40Var311111111111112.f40005a = c0dVar1112;
                                wz40Var311111111111111.f40005a = j43Var115.b;
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar.o0(obj);
            }
            int i5 = i2 & 14;
            mm40Var2 = mm40Var;
            x4n0.a(mm40Var2, (Function2) obj, fetVar, i5, i3);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jxn(mm40Var2, j43Var, k43Var, i, (byte) 1);
        }
    }
}
