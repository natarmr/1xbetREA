package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class teo0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f33831a;
    public final int b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    public teo0(keo0 keo0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.f33831a = ctf0Var;
        this.b = keo0Var.j;
        this.c = bkb.H(keo0Var.d);
        this.d = bkb.H(Boolean.valueOf(keo0Var.e));
        this.e = bkb.H(Integer.valueOf(keo0Var.f18163a));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(keo0Var.f));
        this.f = n0o0VarH;
        final byte b = 0;
        this.g = bkb.G(a().d, new Function1(this) { // from class: a.seo0
            public final /* synthetic */ teo0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long backgroundContent;
                byte b2 = b;
                p9r0 p9r0Var = null;
                int i = 0;
                teo0 teo0Var = this.b;
                switch (b2) {
                    case 0:
                        ((String) obj).getClass();
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.e;
                        int i2 = teo0Var.b;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 1:
                        List<x8r0> list = (List) obj;
                        list.getClass();
                        if (((String) teo0Var.a().c()).length() >= 3) {
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (x8r0 x8r0Var : list) {
                                boolean zO = StringsKt.O(x8r0Var.c, (CharSequence) teo0Var.a().c(), true);
                                String str = x8r0Var.f40475a;
                                String str2 = x8r0Var.c;
                                int i3 = x8r0Var.d;
                                String str3 = x8r0Var.e;
                                zqe zqeVar = x8r0Var.f;
                                String str4 = x8r0Var.g;
                                Map map = x8r0Var.h;
                                zqeVar.getClass();
                                arrayList.add(new x8r0(str, zO, str2, i3, str3, zqeVar, str4, map));
                            }
                            list = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                        for (Object obj2 : list) {
                            int i4 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            x8r0 x8r0Var2 = (x8r0) obj2;
                            String str5 = x8r0Var2.f40475a;
                            String strValueOf = String.valueOf(i4);
                            c280 c280Var = new c280(vsm0.t(x8r0Var2.g), R.drawable.ic_glyph_placeholder_player);
                            d4d d4dVar = d4d.SECONDARY60;
                            u6n u6nVar = new u6n(d4dVar, w6n.e, c280Var);
                            String str6 = x8r0Var2.c;
                            zqe zqeVar2 = x8r0Var2.f;
                            String str7 = zqeVar2.f44804a;
                            t6n t6nVar = new t6n(d4dVar, w6n.l, new c280(vsm0.t(zqeVar2.b), R.drawable.ic_glyph_language));
                            boolean z = x8r0Var2.b;
                            Map map2 = x8r0Var2.h;
                            if (z) {
                                pz40 pz40Var = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getPrimary60();
                            } else if (i4 % 2 == 0) {
                                pz40 pz40Var2 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundGroup();
                            } else {
                                pz40 pz40Var3 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            }
                            arrayList2.add(new deo0(str5, strValueOf, u6nVar, str6, str7, t6nVar, z, backgroundContent, map2));
                            i = i4;
                        }
                        return dyb.o0(arrayList2);
                    case 2:
                        List list2 = (List) obj;
                        list2.getClass();
                        if (((String) teo0Var.a().c()).length() < 3) {
                            return iun.f15405a;
                        }
                        rx3 rx3VarS0 = CollectionsKt.S0(list2);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = rx3VarS0.iterator();
                        while (true) {
                            iil iilVar = (iil) it;
                            if (!iilVar.b.hasNext()) {
                                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                                }
                                return arrayList4;
                            }
                            Object next = iilVar.next();
                            if (StringsKt.O(((x8r0) ((IndexedValue) next).b).c, (CharSequence) teo0Var.a().c(), true)) {
                                arrayList3.add(next);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        List list3 = (List) ((fee) teo0Var.i.getValue()).b();
                        if (!list3.isEmpty()) {
                            int iD = l1e0.d(iIntValue, 0, list3.size() - 1) + 1;
                            int size = list3.size();
                            p9r0Var = new p9r0(teo0Var.f33831a.b.a(R.string.promo_weekly_reward_amount, Arrays.copyOf(new Object[]{String.valueOf(iD), String.valueOf(size)}, 2)), iD > 1, iD < size);
                        }
                        return p9r0Var;
                }
            }
        });
        List list = keo0Var.c;
        final byte b2 = 1;
        this.h = maz.b(new yw9(list, new Function1(this) { // from class: a.seo0
            public final /* synthetic */ teo0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long backgroundContent;
                byte b3 = b2;
                p9r0 p9r0Var = null;
                int i = 0;
                teo0 teo0Var = this.b;
                switch (b3) {
                    case 0:
                        ((String) obj).getClass();
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.e;
                        int i2 = teo0Var.b;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 1:
                        List<x8r0> list2 = (List) obj;
                        list2.getClass();
                        if (((String) teo0Var.a().c()).length() >= 3) {
                            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                            for (x8r0 x8r0Var : list2) {
                                boolean zO = StringsKt.O(x8r0Var.c, (CharSequence) teo0Var.a().c(), true);
                                String str = x8r0Var.f40475a;
                                String str2 = x8r0Var.c;
                                int i3 = x8r0Var.d;
                                String str3 = x8r0Var.e;
                                zqe zqeVar = x8r0Var.f;
                                String str4 = x8r0Var.g;
                                Map map = x8r0Var.h;
                                zqeVar.getClass();
                                arrayList.add(new x8r0(str, zO, str2, i3, str3, zqeVar, str4, map));
                            }
                            list2 = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i4 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            x8r0 x8r0Var2 = (x8r0) obj2;
                            String str5 = x8r0Var2.f40475a;
                            String strValueOf = String.valueOf(i4);
                            c280 c280Var = new c280(vsm0.t(x8r0Var2.g), R.drawable.ic_glyph_placeholder_player);
                            d4d d4dVar = d4d.SECONDARY60;
                            u6n u6nVar = new u6n(d4dVar, w6n.e, c280Var);
                            String str6 = x8r0Var2.c;
                            zqe zqeVar2 = x8r0Var2.f;
                            String str7 = zqeVar2.f44804a;
                            t6n t6nVar = new t6n(d4dVar, w6n.l, new c280(vsm0.t(zqeVar2.b), R.drawable.ic_glyph_language));
                            boolean z = x8r0Var2.b;
                            Map map2 = x8r0Var2.h;
                            if (z) {
                                pz40 pz40Var = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getPrimary60();
                            } else if (i4 % 2 == 0) {
                                pz40 pz40Var2 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundGroup();
                            } else {
                                pz40 pz40Var3 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            }
                            arrayList2.add(new deo0(str5, strValueOf, u6nVar, str6, str7, t6nVar, z, backgroundContent, map2));
                            i = i4;
                        }
                        return dyb.o0(arrayList2);
                    case 2:
                        List list3 = (List) obj;
                        list3.getClass();
                        if (((String) teo0Var.a().c()).length() < 3) {
                            return iun.f15405a;
                        }
                        rx3 rx3VarS0 = CollectionsKt.S0(list3);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = rx3VarS0.iterator();
                        while (true) {
                            iil iilVar = (iil) it;
                            if (!iilVar.b.hasNext()) {
                                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                                }
                                return arrayList4;
                            }
                            Object next = iilVar.next();
                            if (StringsKt.O(((x8r0) ((IndexedValue) next).b).c, (CharSequence) teo0Var.a().c(), true)) {
                                arrayList3.add(next);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        List list4 = (List) ((fee) teo0Var.i.getValue()).b();
                        if (!list4.isEmpty()) {
                            int iD = l1e0.d(iIntValue, 0, list4.size() - 1) + 1;
                            int size = list4.size();
                            p9r0Var = new p9r0(teo0Var.f33831a.b.a(R.string.promo_weekly_reward_amount, Arrays.copyOf(new Object[]{String.valueOf(iD), String.valueOf(size)}, 2)), iD > 1, iD < size);
                        }
                        return p9r0Var;
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.i = maz.b(new yw9(list, new Function1(this) { // from class: a.seo0
            public final /* synthetic */ teo0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long backgroundContent;
                byte b4 = b3;
                p9r0 p9r0Var = null;
                int i = 0;
                teo0 teo0Var = this.b;
                switch (b4) {
                    case 0:
                        ((String) obj).getClass();
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.e;
                        int i2 = teo0Var.b;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 1:
                        List<x8r0> list2 = (List) obj;
                        list2.getClass();
                        if (((String) teo0Var.a().c()).length() >= 3) {
                            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                            for (x8r0 x8r0Var : list2) {
                                boolean zO = StringsKt.O(x8r0Var.c, (CharSequence) teo0Var.a().c(), true);
                                String str = x8r0Var.f40475a;
                                String str2 = x8r0Var.c;
                                int i3 = x8r0Var.d;
                                String str3 = x8r0Var.e;
                                zqe zqeVar = x8r0Var.f;
                                String str4 = x8r0Var.g;
                                Map map = x8r0Var.h;
                                zqeVar.getClass();
                                arrayList.add(new x8r0(str, zO, str2, i3, str3, zqeVar, str4, map));
                            }
                            list2 = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i4 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            x8r0 x8r0Var2 = (x8r0) obj2;
                            String str5 = x8r0Var2.f40475a;
                            String strValueOf = String.valueOf(i4);
                            c280 c280Var = new c280(vsm0.t(x8r0Var2.g), R.drawable.ic_glyph_placeholder_player);
                            d4d d4dVar = d4d.SECONDARY60;
                            u6n u6nVar = new u6n(d4dVar, w6n.e, c280Var);
                            String str6 = x8r0Var2.c;
                            zqe zqeVar2 = x8r0Var2.f;
                            String str7 = zqeVar2.f44804a;
                            t6n t6nVar = new t6n(d4dVar, w6n.l, new c280(vsm0.t(zqeVar2.b), R.drawable.ic_glyph_language));
                            boolean z = x8r0Var2.b;
                            Map map2 = x8r0Var2.h;
                            if (z) {
                                pz40 pz40Var = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getPrimary60();
                            } else if (i4 % 2 == 0) {
                                pz40 pz40Var2 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundGroup();
                            } else {
                                pz40 pz40Var3 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            }
                            arrayList2.add(new deo0(str5, strValueOf, u6nVar, str6, str7, t6nVar, z, backgroundContent, map2));
                            i = i4;
                        }
                        return dyb.o0(arrayList2);
                    case 2:
                        List list3 = (List) obj;
                        list3.getClass();
                        if (((String) teo0Var.a().c()).length() < 3) {
                            return iun.f15405a;
                        }
                        rx3 rx3VarS0 = CollectionsKt.S0(list3);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = rx3VarS0.iterator();
                        while (true) {
                            iil iilVar = (iil) it;
                            if (!iilVar.b.hasNext()) {
                                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                                }
                                return arrayList4;
                            }
                            Object next = iilVar.next();
                            if (StringsKt.O(((x8r0) ((IndexedValue) next).b).c, (CharSequence) teo0Var.a().c(), true)) {
                                arrayList3.add(next);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        List list4 = (List) ((fee) teo0Var.i.getValue()).b();
                        if (!list4.isEmpty()) {
                            int iD = l1e0.d(iIntValue, 0, list4.size() - 1) + 1;
                            int size = list4.size();
                            p9r0Var = new p9r0(teo0Var.f33831a.b.a(R.string.promo_weekly_reward_amount, Arrays.copyOf(new Object[]{String.valueOf(iD), String.valueOf(size)}, 2)), iD > 1, iD < size);
                        }
                        return p9r0Var;
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.j = maz.b(new yw9(keo0Var.b, new meo0((byte) 3), (byte) 20));
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.seo0
            public final /* synthetic */ teo0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long backgroundContent;
                byte b5 = b4;
                p9r0 p9r0Var = null;
                int i = 0;
                teo0 teo0Var = this.b;
                switch (b5) {
                    case 0:
                        ((String) obj).getClass();
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.e;
                        int i2 = teo0Var.b;
                        xuzVar.getClass();
                        return new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                    case 1:
                        List<x8r0> list2 = (List) obj;
                        list2.getClass();
                        if (((String) teo0Var.a().c()).length() >= 3) {
                            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                            for (x8r0 x8r0Var : list2) {
                                boolean zO = StringsKt.O(x8r0Var.c, (CharSequence) teo0Var.a().c(), true);
                                String str = x8r0Var.f40475a;
                                String str2 = x8r0Var.c;
                                int i3 = x8r0Var.d;
                                String str3 = x8r0Var.e;
                                zqe zqeVar = x8r0Var.f;
                                String str4 = x8r0Var.g;
                                Map map = x8r0Var.h;
                                zqeVar.getClass();
                                arrayList.add(new x8r0(str, zO, str2, i3, str3, zqeVar, str4, map));
                            }
                            list2 = arrayList;
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i4 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            x8r0 x8r0Var2 = (x8r0) obj2;
                            String str5 = x8r0Var2.f40475a;
                            String strValueOf = String.valueOf(i4);
                            c280 c280Var = new c280(vsm0.t(x8r0Var2.g), R.drawable.ic_glyph_placeholder_player);
                            d4d d4dVar = d4d.SECONDARY60;
                            u6n u6nVar = new u6n(d4dVar, w6n.e, c280Var);
                            String str6 = x8r0Var2.c;
                            zqe zqeVar2 = x8r0Var2.f;
                            String str7 = zqeVar2.f44804a;
                            t6n t6nVar = new t6n(d4dVar, w6n.l, new c280(vsm0.t(zqeVar2.b), R.drawable.ic_glyph_language));
                            boolean z = x8r0Var2.b;
                            Map map2 = x8r0Var2.h;
                            if (z) {
                                pz40 pz40Var = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getPrimary60();
                            } else if (i4 % 2 == 0) {
                                pz40 pz40Var2 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundGroup();
                            } else {
                                pz40 pz40Var3 = s6t0.f31722a;
                                backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                            }
                            arrayList2.add(new deo0(str5, strValueOf, u6nVar, str6, str7, t6nVar, z, backgroundContent, map2));
                            i = i4;
                        }
                        return dyb.o0(arrayList2);
                    case 2:
                        List list3 = (List) obj;
                        list3.getClass();
                        if (((String) teo0Var.a().c()).length() < 3) {
                            return iun.f15405a;
                        }
                        rx3 rx3VarS0 = CollectionsKt.S0(list3);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = rx3VarS0.iterator();
                        while (true) {
                            iil iilVar = (iil) it;
                            if (!iilVar.b.hasNext()) {
                                ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Integer.valueOf(((IndexedValue) it2.next()).f46061a));
                                }
                                return arrayList4;
                            }
                            Object next = iilVar.next();
                            if (StringsKt.O(((x8r0) ((IndexedValue) next).b).c, (CharSequence) teo0Var.a().c(), true)) {
                                arrayList3.add(next);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        List list4 = (List) ((fee) teo0Var.i.getValue()).b();
                        if (!list4.isEmpty()) {
                            int iD = l1e0.d(iIntValue, 0, list4.size() - 1) + 1;
                            int size = list4.size();
                            p9r0Var = new p9r0(teo0Var.f33831a.b.a(R.string.promo_weekly_reward_amount, Arrays.copyOf(new Object[]{String.valueOf(iD), String.valueOf(size)}, 2)), iD > 1, iD < size);
                        }
                        return p9r0Var;
                }
            }
        });
    }

    public final fee a() {
        return (fee) this.c.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        keo0 keo0Var = (keo0) obj;
        keo0Var.getClass();
        a().d(keo0Var.d);
        n0o0 n0o0Var = this.d;
        ((fee) n0o0Var.getValue()).d(Boolean.valueOf(keo0Var.e));
        n0o0 n0o0Var2 = this.e;
        ((fee) n0o0Var2.getValue()).d(Integer.valueOf(keo0Var.f18163a));
        n0o0 n0o0Var3 = this.f;
        ((fee) n0o0Var3.getValue()).d(Integer.valueOf(keo0Var.f));
        n0o0 n0o0Var4 = this.h;
        fee feeVar = (fee) n0o0Var4.getValue();
        List list = keo0Var.c;
        feeVar.d(list);
        n0o0 n0o0Var5 = this.i;
        ((fee) n0o0Var5.getValue()).d(list);
        n0o0 n0o0Var6 = this.j;
        ((fee) n0o0Var6.getValue()).d(keo0Var.b);
        if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
            return veo0.f37296a;
        }
        if (((String) a().c()).length() >= 3 && ((List) ((fee) n0o0Var5.getValue()).b()).isEmpty()) {
            return new weo0((mdm) ((fee) this.g.getValue()).b());
        }
        List list2 = (List) ((fee) n0o0Var5.getValue()).b();
        return new ueo0(((Number) ((fee) n0o0Var2.getValue()).c()).intValue(), (a4x) ((fee) n0o0Var4.getValue()).b(), list2.isEmpty() ? -1 : ((Number) list2.get(l1e0.d(((Number) ((fee) n0o0Var3.getValue()).c()).intValue(), 0, list2.size() - 1))).intValue(), (p9r0) ((fee) this.k.getValue()).b(), (a4x) ((fee) n0o0Var6.getValue()).b());
    }
}
