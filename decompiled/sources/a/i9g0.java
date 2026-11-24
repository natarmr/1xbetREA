package a;

import android.javax.sip.message.Response;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class i9g0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f14384a;
    public final Locale b;
    public final int c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;

    public i9g0(e9g0 e9g0Var, ctf0 ctf0Var, Locale locale, int i) {
        ctf0Var.getClass();
        this.f14384a = ctf0Var;
        this.b = locale;
        this.c = i;
        this.d = bkb.H(Integer.valueOf(e9g0Var.f7419a));
        this.e = bkb.H(e9g0Var.l);
        this.f = bkb.H(e9g0Var.c);
        this.g = bkb.H(e9g0Var.k);
        this.h = bkb.H(Boolean.valueOf(e9g0Var.n));
        final byte b = 0;
        this.i = maz.b(new yw9(e9g0Var.g, new Function1(this) { // from class: a.h9g0
            public final /* synthetic */ i9g0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d2w d2wVar;
                String strA;
                byte b2 = b;
                int i2 = 0;
                i9g0 i9g0Var = this.b;
                switch (b2) {
                    case 0:
                        List<d2w> list = (List) obj;
                        ArrayList arrayListU = twn.u(list);
                        for (d2w d2wVar2 : list) {
                            int iIntValue = ((Number) ((fee) i9g0Var.d.getValue()).c()).intValue();
                            ctf0 ctf0Var2 = i9g0Var.f14384a;
                            boolean zContains = ((Set) ((fee) i9g0Var.f.getValue()).c()).contains(Long.valueOf(d2wVar2.b()));
                            boolean zBooleanValue = ((Boolean) ((fee) i9g0Var.j.getValue()).c()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) ((fee) i9g0Var.k.getValue()).c()).booleanValue();
                            v5l0 v5l0Var = (v5l0) ((fee) i9g0Var.g.getValue()).c();
                            wcb wcbVar = (wcb) ((fee) i9g0Var.e.getValue()).c();
                            if (wcbVar != null) {
                                d2wVar = d2wVar2;
                                strA = wcbVar.a(d2wVar2.d(), d2wVar.g());
                            } else {
                                d2wVar = d2wVar2;
                                strA = null;
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            lla llaVarG0 = s0x.g0(d2wVar, iIntValue, ctf0Var2, zContains, zBooleanValue, zBooleanValue2, v5l0Var, strA, (String) ((fee) i9g0Var.l.getValue()).c(), ((Boolean) ((fee) i9g0Var.h.getValue()).c()).booleanValue());
                            if (llaVarG0 != null) {
                                arrayListU.add(llaVarG0);
                            }
                        }
                        return arrayListU;
                    case 1:
                        yl9 yl9Var = (yl9) obj;
                        yl9Var.getClass();
                        Locale locale2 = i9g0Var.b;
                        Set set = yl9Var.f42829a;
                        int iX = CollectionsKt.X(set, yl9Var.b);
                        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
                        int i3 = 0;
                        for (Object obj2 : set) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Date date = (Date) obj2;
                            String str = new SimpleDateFormat("dd", locale2).format(date);
                            String str2 = new SimpleDateFormat("MMMM", locale2).format(date);
                            String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", locale2).format(date) : null;
                            str.getClass();
                            str2.getClass();
                            arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iX == i3));
                            i3 = i4;
                        }
                        return new apm(dyb.r0(arrayList), vcg0.f37186a, iX, false);
                    case 2:
                        int i5 = i9g0Var.c;
                        q5g0 q5g0Var = (q5g0) obj;
                        q5g0Var.getClass();
                        int iOrdinal = q5g0Var.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal == 2) {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.g;
                            xuzVar2.getClass();
                            return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        return new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 3:
                        String str4 = (String) obj;
                        str4.getClass();
                        return new ad50(i9g0Var.f14384a.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), str4);
                    default:
                        n0o0 n0o0Var = i9g0Var.p;
                        List list2 = (List) obj;
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(tfx.N((dok0) it.next(), ((Number) ((fee) n0o0Var.getValue()).c()).longValue(), i9g0Var.f14384a));
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((dok0) it2.next()).a() == ((Number) ((fee) n0o0Var.getValue()).c()).longValue()) {
                                return new t3r0(i4VarR0, i2);
                            }
                            i2++;
                        }
                        i2 = -1;
                        return new t3r0(i4VarR0, i2);
                }
            }
        }, (byte) 20));
        this.j = bkb.H(Boolean.valueOf(e9g0Var.d));
        this.k = bkb.H(Boolean.valueOf(e9g0Var.e));
        this.l = bkb.H(e9g0Var.f);
        final byte b2 = 1;
        this.m = maz.b(new yw9(e9g0Var.m, new Function1(this) { // from class: a.h9g0
            public final /* synthetic */ i9g0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d2w d2wVar;
                String strA;
                byte b3 = b2;
                int i2 = 0;
                i9g0 i9g0Var = this.b;
                switch (b3) {
                    case 0:
                        List<d2w> list = (List) obj;
                        ArrayList arrayListU = twn.u(list);
                        for (d2w d2wVar2 : list) {
                            int iIntValue = ((Number) ((fee) i9g0Var.d.getValue()).c()).intValue();
                            ctf0 ctf0Var2 = i9g0Var.f14384a;
                            boolean zContains = ((Set) ((fee) i9g0Var.f.getValue()).c()).contains(Long.valueOf(d2wVar2.b()));
                            boolean zBooleanValue = ((Boolean) ((fee) i9g0Var.j.getValue()).c()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) ((fee) i9g0Var.k.getValue()).c()).booleanValue();
                            v5l0 v5l0Var = (v5l0) ((fee) i9g0Var.g.getValue()).c();
                            wcb wcbVar = (wcb) ((fee) i9g0Var.e.getValue()).c();
                            if (wcbVar != null) {
                                d2wVar = d2wVar2;
                                strA = wcbVar.a(d2wVar2.d(), d2wVar.g());
                            } else {
                                d2wVar = d2wVar2;
                                strA = null;
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            lla llaVarG0 = s0x.g0(d2wVar, iIntValue, ctf0Var2, zContains, zBooleanValue, zBooleanValue2, v5l0Var, strA, (String) ((fee) i9g0Var.l.getValue()).c(), ((Boolean) ((fee) i9g0Var.h.getValue()).c()).booleanValue());
                            if (llaVarG0 != null) {
                                arrayListU.add(llaVarG0);
                            }
                        }
                        return arrayListU;
                    case 1:
                        yl9 yl9Var = (yl9) obj;
                        yl9Var.getClass();
                        Locale locale2 = i9g0Var.b;
                        Set set = yl9Var.f42829a;
                        int iX = CollectionsKt.X(set, yl9Var.b);
                        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
                        int i3 = 0;
                        for (Object obj2 : set) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Date date = (Date) obj2;
                            String str = new SimpleDateFormat("dd", locale2).format(date);
                            String str2 = new SimpleDateFormat("MMMM", locale2).format(date);
                            String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", locale2).format(date) : null;
                            str.getClass();
                            str2.getClass();
                            arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iX == i3));
                            i3 = i4;
                        }
                        return new apm(dyb.r0(arrayList), vcg0.f37186a, iX, false);
                    case 2:
                        int i5 = i9g0Var.c;
                        q5g0 q5g0Var = (q5g0) obj;
                        q5g0Var.getClass();
                        int iOrdinal = q5g0Var.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal == 2) {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.g;
                            xuzVar2.getClass();
                            return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        return new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 3:
                        String str4 = (String) obj;
                        str4.getClass();
                        return new ad50(i9g0Var.f14384a.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), str4);
                    default:
                        n0o0 n0o0Var = i9g0Var.p;
                        List list2 = (List) obj;
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(tfx.N((dok0) it.next(), ((Number) ((fee) n0o0Var.getValue()).c()).longValue(), i9g0Var.f14384a));
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((dok0) it2.next()).a() == ((Number) ((fee) n0o0Var.getValue()).c()).longValue()) {
                                return new t3r0(i4VarR0, i2);
                            }
                            i2++;
                        }
                        i2 = -1;
                        return new t3r0(i4VarR0, i2);
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.n = maz.b(new yw9(e9g0Var.h, new Function1(this) { // from class: a.h9g0
            public final /* synthetic */ i9g0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d2w d2wVar;
                String strA;
                byte b4 = b3;
                int i2 = 0;
                i9g0 i9g0Var = this.b;
                switch (b4) {
                    case 0:
                        List<d2w> list = (List) obj;
                        ArrayList arrayListU = twn.u(list);
                        for (d2w d2wVar2 : list) {
                            int iIntValue = ((Number) ((fee) i9g0Var.d.getValue()).c()).intValue();
                            ctf0 ctf0Var2 = i9g0Var.f14384a;
                            boolean zContains = ((Set) ((fee) i9g0Var.f.getValue()).c()).contains(Long.valueOf(d2wVar2.b()));
                            boolean zBooleanValue = ((Boolean) ((fee) i9g0Var.j.getValue()).c()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) ((fee) i9g0Var.k.getValue()).c()).booleanValue();
                            v5l0 v5l0Var = (v5l0) ((fee) i9g0Var.g.getValue()).c();
                            wcb wcbVar = (wcb) ((fee) i9g0Var.e.getValue()).c();
                            if (wcbVar != null) {
                                d2wVar = d2wVar2;
                                strA = wcbVar.a(d2wVar2.d(), d2wVar.g());
                            } else {
                                d2wVar = d2wVar2;
                                strA = null;
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            lla llaVarG0 = s0x.g0(d2wVar, iIntValue, ctf0Var2, zContains, zBooleanValue, zBooleanValue2, v5l0Var, strA, (String) ((fee) i9g0Var.l.getValue()).c(), ((Boolean) ((fee) i9g0Var.h.getValue()).c()).booleanValue());
                            if (llaVarG0 != null) {
                                arrayListU.add(llaVarG0);
                            }
                        }
                        return arrayListU;
                    case 1:
                        yl9 yl9Var = (yl9) obj;
                        yl9Var.getClass();
                        Locale locale2 = i9g0Var.b;
                        Set set = yl9Var.f42829a;
                        int iX = CollectionsKt.X(set, yl9Var.b);
                        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
                        int i3 = 0;
                        for (Object obj2 : set) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Date date = (Date) obj2;
                            String str = new SimpleDateFormat("dd", locale2).format(date);
                            String str2 = new SimpleDateFormat("MMMM", locale2).format(date);
                            String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", locale2).format(date) : null;
                            str.getClass();
                            str2.getClass();
                            arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iX == i3));
                            i3 = i4;
                        }
                        return new apm(dyb.r0(arrayList), vcg0.f37186a, iX, false);
                    case 2:
                        int i5 = i9g0Var.c;
                        q5g0 q5g0Var = (q5g0) obj;
                        q5g0Var.getClass();
                        int iOrdinal = q5g0Var.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal == 2) {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.g;
                            xuzVar2.getClass();
                            return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        return new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 3:
                        String str4 = (String) obj;
                        str4.getClass();
                        return new ad50(i9g0Var.f14384a.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), str4);
                    default:
                        n0o0 n0o0Var = i9g0Var.p;
                        List list2 = (List) obj;
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(tfx.N((dok0) it.next(), ((Number) ((fee) n0o0Var.getValue()).c()).longValue(), i9g0Var.f14384a));
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((dok0) it2.next()).a() == ((Number) ((fee) n0o0Var.getValue()).c()).longValue()) {
                                return new t3r0(i4VarR0, i2);
                            }
                            i2++;
                        }
                        i2 = -1;
                        return new t3r0(i4VarR0, i2);
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.o = maz.b(new yw9(e9g0Var.b, new Function1(this) { // from class: a.h9g0
            public final /* synthetic */ i9g0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d2w d2wVar;
                String strA;
                byte b5 = b4;
                int i2 = 0;
                i9g0 i9g0Var = this.b;
                switch (b5) {
                    case 0:
                        List<d2w> list = (List) obj;
                        ArrayList arrayListU = twn.u(list);
                        for (d2w d2wVar2 : list) {
                            int iIntValue = ((Number) ((fee) i9g0Var.d.getValue()).c()).intValue();
                            ctf0 ctf0Var2 = i9g0Var.f14384a;
                            boolean zContains = ((Set) ((fee) i9g0Var.f.getValue()).c()).contains(Long.valueOf(d2wVar2.b()));
                            boolean zBooleanValue = ((Boolean) ((fee) i9g0Var.j.getValue()).c()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) ((fee) i9g0Var.k.getValue()).c()).booleanValue();
                            v5l0 v5l0Var = (v5l0) ((fee) i9g0Var.g.getValue()).c();
                            wcb wcbVar = (wcb) ((fee) i9g0Var.e.getValue()).c();
                            if (wcbVar != null) {
                                d2wVar = d2wVar2;
                                strA = wcbVar.a(d2wVar2.d(), d2wVar.g());
                            } else {
                                d2wVar = d2wVar2;
                                strA = null;
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            lla llaVarG0 = s0x.g0(d2wVar, iIntValue, ctf0Var2, zContains, zBooleanValue, zBooleanValue2, v5l0Var, strA, (String) ((fee) i9g0Var.l.getValue()).c(), ((Boolean) ((fee) i9g0Var.h.getValue()).c()).booleanValue());
                            if (llaVarG0 != null) {
                                arrayListU.add(llaVarG0);
                            }
                        }
                        return arrayListU;
                    case 1:
                        yl9 yl9Var = (yl9) obj;
                        yl9Var.getClass();
                        Locale locale2 = i9g0Var.b;
                        Set set = yl9Var.f42829a;
                        int iX = CollectionsKt.X(set, yl9Var.b);
                        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
                        int i3 = 0;
                        for (Object obj2 : set) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Date date = (Date) obj2;
                            String str = new SimpleDateFormat("dd", locale2).format(date);
                            String str2 = new SimpleDateFormat("MMMM", locale2).format(date);
                            String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", locale2).format(date) : null;
                            str.getClass();
                            str2.getClass();
                            arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iX == i3));
                            i3 = i4;
                        }
                        return new apm(dyb.r0(arrayList), vcg0.f37186a, iX, false);
                    case 2:
                        int i5 = i9g0Var.c;
                        q5g0 q5g0Var = (q5g0) obj;
                        q5g0Var.getClass();
                        int iOrdinal = q5g0Var.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal == 2) {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.g;
                            xuzVar2.getClass();
                            return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        return new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 3:
                        String str4 = (String) obj;
                        str4.getClass();
                        return new ad50(i9g0Var.f14384a.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), str4);
                    default:
                        n0o0 n0o0Var = i9g0Var.p;
                        List list2 = (List) obj;
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(tfx.N((dok0) it.next(), ((Number) ((fee) n0o0Var.getValue()).c()).longValue(), i9g0Var.f14384a));
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((dok0) it2.next()).a() == ((Number) ((fee) n0o0Var.getValue()).c()).longValue()) {
                                return new t3r0(i4VarR0, i2);
                            }
                            i2++;
                        }
                        i2 = -1;
                        return new t3r0(i4VarR0, i2);
                }
            }
        }, (byte) 20));
        this.p = bkb.H(Long.valueOf(e9g0Var.i));
        final byte b5 = 4;
        this.q = maz.b(new yw9(e9g0Var.j, new Function1(this) { // from class: a.h9g0
            public final /* synthetic */ i9g0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d2w d2wVar;
                String strA;
                byte b6 = b5;
                int i2 = 0;
                i9g0 i9g0Var = this.b;
                switch (b6) {
                    case 0:
                        List<d2w> list = (List) obj;
                        ArrayList arrayListU = twn.u(list);
                        for (d2w d2wVar2 : list) {
                            int iIntValue = ((Number) ((fee) i9g0Var.d.getValue()).c()).intValue();
                            ctf0 ctf0Var2 = i9g0Var.f14384a;
                            boolean zContains = ((Set) ((fee) i9g0Var.f.getValue()).c()).contains(Long.valueOf(d2wVar2.b()));
                            boolean zBooleanValue = ((Boolean) ((fee) i9g0Var.j.getValue()).c()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) ((fee) i9g0Var.k.getValue()).c()).booleanValue();
                            v5l0 v5l0Var = (v5l0) ((fee) i9g0Var.g.getValue()).c();
                            wcb wcbVar = (wcb) ((fee) i9g0Var.e.getValue()).c();
                            if (wcbVar != null) {
                                d2wVar = d2wVar2;
                                strA = wcbVar.a(d2wVar2.d(), d2wVar.g());
                            } else {
                                d2wVar = d2wVar2;
                                strA = null;
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            lla llaVarG0 = s0x.g0(d2wVar, iIntValue, ctf0Var2, zContains, zBooleanValue, zBooleanValue2, v5l0Var, strA, (String) ((fee) i9g0Var.l.getValue()).c(), ((Boolean) ((fee) i9g0Var.h.getValue()).c()).booleanValue());
                            if (llaVarG0 != null) {
                                arrayListU.add(llaVarG0);
                            }
                        }
                        return arrayListU;
                    case 1:
                        yl9 yl9Var = (yl9) obj;
                        yl9Var.getClass();
                        Locale locale2 = i9g0Var.b;
                        Set set = yl9Var.f42829a;
                        int iX = CollectionsKt.X(set, yl9Var.b);
                        ArrayList arrayList = new ArrayList(r3d.q(set, 10));
                        int i3 = 0;
                        for (Object obj2 : set) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Date date = (Date) obj2;
                            String str = new SimpleDateFormat("dd", locale2).format(date);
                            String str2 = new SimpleDateFormat("MMMM", locale2).format(date);
                            String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", locale2).format(date) : null;
                            str.getClass();
                            str2.getClass();
                            arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iX == i3));
                            i3 = i4;
                        }
                        return new apm(dyb.r0(arrayList), vcg0.f37186a, iX, false);
                    case 2:
                        int i5 = i9g0Var.c;
                        q5g0 q5g0Var = (q5g0) obj;
                        q5g0Var.getClass();
                        int iOrdinal = q5g0Var.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, i5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal == 2) {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.g;
                            xuzVar2.getClass();
                            return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        return new mdm(xuz.a(pb10Var3, i5), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 3:
                        String str4 = (String) obj;
                        str4.getClass();
                        return new ad50(i9g0Var.f14384a.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), str4);
                    default:
                        n0o0 n0o0Var = i9g0Var.p;
                        List list2 = (List) obj;
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(tfx.N((dok0) it.next(), ((Number) ((fee) n0o0Var.getValue()).c()).longValue(), i9g0Var.f14384a));
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((dok0) it2.next()).a() == ((Number) ((fee) n0o0Var.getValue()).c()).longValue()) {
                                return new t3r0(i4VarR0, i2);
                            }
                            i2++;
                        }
                        i2 = -1;
                        return new t3r0(i4VarR0, i2);
                }
            }
        }, (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        jje uieVar;
        e9g0 e9g0Var = (e9g0) obj;
        e9g0Var.getClass();
        ((fee) this.d.getValue()).d(Integer.valueOf(e9g0Var.f7419a));
        n0o0 n0o0Var = this.o;
        ((fee) n0o0Var.getValue()).d(e9g0Var.b);
        ((fee) this.f.getValue()).d(e9g0Var.c);
        ((fee) this.j.getValue()).d(Boolean.valueOf(e9g0Var.d));
        ((fee) this.k.getValue()).d(Boolean.valueOf(e9g0Var.e));
        n0o0 n0o0Var2 = this.i;
        ((fee) n0o0Var2.getValue()).d(e9g0Var.g);
        n0o0 n0o0Var3 = this.n;
        ((fee) n0o0Var3.getValue()).d(e9g0Var.h);
        n0o0 n0o0Var4 = this.m;
        ((fee) n0o0Var4.getValue()).d(e9g0Var.m);
        ((fee) this.p.getValue()).d(Long.valueOf(e9g0Var.i));
        n0o0 n0o0Var5 = this.q;
        ((fee) n0o0Var5.getValue()).d(e9g0Var.j);
        ((fee) this.g.getValue()).d(e9g0Var.k);
        ((fee) this.e.getValue()).d(e9g0Var.l);
        n0o0 n0o0Var6 = this.h;
        ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(e9g0Var.n));
        mdm mdmVar = (mdm) ((fee) n0o0Var3.getValue()).b();
        if (((fee) n0o0Var3.getValue()).c() == q5g0.f28150a || mdmVar == null) {
            uieVar = !((Collection) ((fee) n0o0Var2.getValue()).c()).isEmpty() ? new uie(dyb.r0((Iterable) ((fee) n0o0Var2.getValue()).b()), (cpm) ((fee) n0o0Var4.getValue()).b(), (t3r0) ((fee) n0o0Var5.getValue()).b(), ((Boolean) ((fee) n0o0Var6.getValue()).c()).booleanValue()) : cje.f4456a;
        } else {
            uieVar = new yie(mdmVar);
        }
        return new g9g0((ad50) ((fee) n0o0Var.getValue()).b(), uieVar);
    }
}
