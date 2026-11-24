package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesCollection;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_web_games.top_games_collection.WebGamesTopGamesCollection;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/h8b0;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/rl70", "popular_classic"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h8b0 extends yx5 implements tah0 {
    public final boolean K1;
    public api L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final d930 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(h8b0.class, "binding", "getBinding()Lorg/xplatform/games_section/feature/popular_classic/databinding/FragmentPopularClassicOneXGamesBinding;", 0)};
    public static final rl70 R1 = new rl70();

    public h8b0() {
        super(R.layout.fragment_popular_classic_one_x_games);
        final byte b = 1;
        this.K1 = true;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.d8b0
            public final /* synthetic */ h8b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                h8b0 h8b0Var = this.b;
                switch (b3) {
                    case 0:
                        api apiVar = h8b0Var.L1;
                        if (apiVar != null) {
                            return new t0h0(apiVar, a4n0.f(h8b0Var));
                        }
                        Intrinsics.h("popularOneXGamesViewModelFactory");
                        throw null;
                    default:
                        rl70 rl70Var = h8b0.R1;
                        final g9b0 g9b0VarH0 = h8b0Var.H0();
                        final d930 d930Var = h8b0Var.P1;
                        final String simpleName = h8b0.class.getSimpleName();
                        d930Var.getClass();
                        ceb0 ceb0Var = new ceb0();
                        final byte b4 = 2;
                        gbn gbnVar = new gbn(new v1x((byte) 29), new tvx(3, (byte) 3), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b5 = b4;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b6 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b5) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b7 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b8 = b7;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b8) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b8 = b7;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b8) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b8 = b6;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b8) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b8 = b6;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b8) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, gvy.b);
                        dp dpVar = ceb0Var.d;
                        dpVar.b(gbnVar);
                        final byte b5 = 1;
                        final byte b6 = 0;
                        dpVar.b(new gbn(new hvy((byte) 1), new tvx(3, (byte) 4), new Function1() { // from class: a.ivy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b6;
                                String str = simpleName;
                                g9b0 g9b0Var = g9b0VarH0;
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        dyb.c0(view, new c5t((byte) 3, cpVar, g9b0Var, str));
                                        cpVar.t(new b1w(cpVar, (byte) 13));
                                        break;
                                    default:
                                        View view2 = cpVar.f40887a;
                                        view2.getClass();
                                        dyb.c0(view2, new zga0(g9b0Var, str, cpVar));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        sj3.L0(view2, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_16), dimensionPixelSize, 0, 8);
                                        cpVar.t(new ui80(cpVar, (byte) 11));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, gvy.c));
                        dpVar.b(new gbn(new s3t((byte) 1), new atq(3, (byte) 25), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b6;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b8 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b9 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b9;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b8;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fvr.s));
                        dpVar.b(new gbn(new s3t((byte) 3), new atq(3, (byte) 27), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b5;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b8 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b9 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b9;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b8;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fvr.u));
                        dpVar.b(new gbn(new j3b0((byte) 3), new iv60(3, (byte) 20), new Function1() { // from class: a.ivy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b5;
                                String str = simpleName;
                                g9b0 g9b0Var = g9b0VarH0;
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        dyb.c0(view, new c5t((byte) 3, cpVar, g9b0Var, str));
                                        cpVar.t(new b1w(cpVar, (byte) 13));
                                        break;
                                    default:
                                        View view2 = cpVar.f40887a;
                                        view2.getClass();
                                        dyb.c0(view2, new zga0(g9b0Var, str, cpVar));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        sj3.L0(view2, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_16), dimensionPixelSize, 0, 8);
                                        cpVar.t(new ui80(cpVar, (byte) 11));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.w));
                        dpVar.b(new gbn(new s3t((byte) 2), new atq(3, (byte) 26), new vls((byte) 10), fvr.t));
                        return ceb0Var;
                }
            }
        };
        g8b0 g8b0Var = new g8b0(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new g8b0(g8b0Var, (byte) 1));
        this.N1 = agc.G(this, sre0.f32672a.b(g9b0.class), new x6b0(a8zVarA, (byte) 2), new x6b0(a8zVarA, (byte) 3), function0);
        this.O1 = ltt0.o(this, e8b0.f7365a);
        this.P1 = new d930((byte) 1);
        this.Q1 = maz.a(wezVar, new Function0(this) { // from class: a.d8b0
            public final /* synthetic */ h8b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                h8b0 h8b0Var = this.b;
                switch (b3) {
                    case 0:
                        api apiVar = h8b0Var.L1;
                        if (apiVar != null) {
                            return new t0h0(apiVar, a4n0.f(h8b0Var));
                        }
                        Intrinsics.h("popularOneXGamesViewModelFactory");
                        throw null;
                    default:
                        rl70 rl70Var = h8b0.R1;
                        final g9b0 g9b0VarH0 = h8b0Var.H0();
                        final d930 d930Var = h8b0Var.P1;
                        final String simpleName = h8b0.class.getSimpleName();
                        d930Var.getClass();
                        ceb0 ceb0Var = new ceb0();
                        final byte b4 = 2;
                        gbn gbnVar = new gbn(new v1x((byte) 29), new tvx(3, (byte) 3), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b4;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b8 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b9 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b9;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b8;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, gvy.b);
                        dp dpVar = ceb0Var.d;
                        dpVar.b(gbnVar);
                        final byte b5 = 1;
                        final byte b6 = 0;
                        dpVar.b(new gbn(new hvy((byte) 1), new tvx(3, (byte) 4), new Function1() { // from class: a.ivy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b6;
                                String str = simpleName;
                                g9b0 g9b0Var = g9b0VarH0;
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        dyb.c0(view, new c5t((byte) 3, cpVar, g9b0Var, str));
                                        cpVar.t(new b1w(cpVar, (byte) 13));
                                        break;
                                    default:
                                        View view2 = cpVar.f40887a;
                                        view2.getClass();
                                        dyb.c0(view2, new zga0(g9b0Var, str, cpVar));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        sj3.L0(view2, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_16), dimensionPixelSize, 0, 8);
                                        cpVar.t(new ui80(cpVar, (byte) 11));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, gvy.c));
                        dpVar.b(new gbn(new s3t((byte) 1), new atq(3, (byte) 25), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b6;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b8 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b9 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b9;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b8;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fvr.s));
                        dpVar.b(new gbn(new s3t((byte) 3), new atq(3, (byte) 27), new Function1() { // from class: a.a5t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b5;
                                final d930 d930Var2 = d930Var;
                                final String str = simpleName;
                                final g9b0 g9b0Var = g9b0VarH0;
                                final byte b8 = 1;
                                final cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        q7b0 q7b0Var = (q7b0) cpVar.u;
                                        final byte b9 = 0;
                                        q7b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b9;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(q7b0Var.b, new c5t((byte) 0, cpVar, g9b0Var, str));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        sj3.L0(view, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, 0, 8);
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b9;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 0, cpVar, d930Var2));
                                        break;
                                    case 1:
                                        v6b0 v6b0Var = (v6b0) cpVar.u;
                                        v6b0Var.b.setOnItemClickListener(new xdr() { // from class: a.b5t
                                            @Override // a.xdr
                                            public final Object F(Object obj2, Object obj3, Object obj4) {
                                                byte b10 = b8;
                                                String str2 = str;
                                                g9b0 g9b0Var2 = g9b0Var;
                                                cp cpVar2 = cpVar;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                String str3 = (String) obj4;
                                                ((u4s) obj2).getClass();
                                                switch (b10) {
                                                    case 0:
                                                        g9b0Var2.D(str2, (mo60) ((qv60) cpVar2.u()).e.get(iIntValue), ((qv60) cpVar2.u()).b, str3);
                                                        break;
                                                    default:
                                                        g9b0Var2.D(str2, (mo60) ((pv60) cpVar2.u()).c.get(iIntValue), ((pv60) cpVar2.u()).b, str3);
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        dyb.c0(v6b0Var.b, new c5t((byte) 1, cpVar, g9b0Var, str));
                                        DsHeader dsHeader = v6b0Var.c;
                                        c5t c5tVar = new c5t((byte) 2, cpVar, g9b0Var, str);
                                        ymx ymxVar = ivb0.b;
                                        ymxVar.getClass();
                                        dsHeader.setButtonClickListener(new cjj(ymxVar, true, new olh(c5tVar, (byte) 15)));
                                        cpVar.t(new kgh(cpVar, (byte) 22));
                                        cpVar.z(new e5t((byte) 1, cpVar, d930Var2));
                                        break;
                                    default:
                                        ((r7b0) cpVar.u).b.setOnItemClickListener(new hpr(cpVar, g9b0Var, str, (byte) 22));
                                        cpVar.t(new Function1() { // from class: a.d5t
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                byte b10 = b8;
                                                d930 d930Var3 = d930Var2;
                                                cp cpVar2 = cpVar;
                                                List list = (List) obj2;
                                                switch (b10) {
                                                    case 0:
                                                        list.getClass();
                                                        WebGamesTopGamesCollection webGamesTopGamesCollection = ((q7b0) cpVar2.u).b;
                                                        webGamesTopGamesCollection.setBackgroundResource(((qv60) cpVar2.u()).c);
                                                        webGamesTopGamesCollection.setBackgroundPictureResource(((qv60) cpVar2.u()).d);
                                                        webGamesTopGamesCollection.setTitle(((qv60) cpVar2.u()).f29374a.f24024a);
                                                        ArrayList arrayList = ((qv60) cpVar2.u()).f;
                                                        llo lloVar = new llo(d930Var3, cpVar2, (byte) 4);
                                                        yge0 adapter = webGamesTopGamesCollection.i.getAdapter();
                                                        adapter.getClass();
                                                        ((o4s) adapter).H(arrayList, lloVar);
                                                        break;
                                                    default:
                                                        list.getClass();
                                                        yfu0 yfu0Var = cpVar2.u;
                                                        ((r7b0) yfu0Var).c.setModel(((sv60) cpVar2.u()).f32852a);
                                                        LargeBannerGamesCollection largeBannerGamesCollection = ((r7b0) yfu0Var).b;
                                                        ArrayList arrayList2 = ((sv60) cpVar2.u()).b;
                                                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                                        Iterator it = arrayList2.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList3.add(((rv60) it.next()).f31157a);
                                                        }
                                                        e5t e5tVar = new e5t((byte) 3, cpVar2, d930Var3);
                                                        yge0 adapter2 = largeBannerGamesCollection.getAdapter();
                                                        bvy bvyVar = adapter2 instanceof bvy ? (bvy) adapter2 : null;
                                                        if (bvyVar != null) {
                                                            bvyVar.H(arrayList3, new wss(e5tVar, (byte) 3));
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        });
                                        cpVar.z(new e5t((byte) 2, cpVar, d930Var2));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fvr.u));
                        dpVar.b(new gbn(new j3b0((byte) 3), new iv60(3, (byte) 20), new Function1() { // from class: a.ivy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b7 = b5;
                                String str = simpleName;
                                g9b0 g9b0Var = g9b0VarH0;
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                switch (b7) {
                                    case 0:
                                        View view = cpVar.f40887a;
                                        view.getClass();
                                        dyb.c0(view, new c5t((byte) 3, cpVar, g9b0Var, str));
                                        cpVar.t(new b1w(cpVar, (byte) 13));
                                        break;
                                    default:
                                        View view2 = cpVar.f40887a;
                                        view2.getClass();
                                        dyb.c0(view2, new zga0(g9b0Var, str, cpVar));
                                        Context context = cpVar.w;
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                                        sj3.L0(view2, dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.space_16), dimensionPixelSize, 0, 8);
                                        cpVar.t(new ui80(cpVar, (byte) 11));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, xk60.w));
                        dpVar.b(new gbn(new s3t((byte) 2), new atq(3, (byte) 26), new vls((byte) 10), fvr.t));
                        return ceb0Var;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.e(F(), this, new wma0(1, H0(), g9b0.class, "onOneXGamesGameUMResultReceive", "onOneXGamesGameUMResultReceive$popular_classic(J)V", 0, (byte) 26), new cz60(0, H0(), g9b0.class, "onOneXGamesUMResultReceive", "onOneXGamesUMResultReceive$popular_classic()V", 0, (byte) 27), null, 18);
        G0().d.setAdapter((ceb0) this.Q1.getValue());
        vvw.o(G0().d, true, 1);
        G0().b.setButtonOnClickListener(new cz60(0, H0(), g9b0.class, "onLottieButtonClick", "onLottieButtonClick()V", 0, (byte) 26));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.PopularClassicOneXGamesDependencies");
            return;
        }
        this.L1 = (api) ((n5d0) new pmi(new jh70(), g8iVarC).e).get();
        wdk0 wdk0VarI9 = g8iVarC.I9();
        x1x.x(wdk0VarI9);
        this.M1 = wdk0VarI9;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        g9b0 g9b0VarH0 = H0();
        dnq dnqVar = new dnq(new fnq(new fnq(g9b0VarH0.F, new a9b0(g9b0VarH0, null, (byte) 0), (byte) 4), new d7a0(g9b0VarH0, null, (byte) 4)), new gbv(g9b0VarH0, null, (byte) 23), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        p6b0 p6b0Var = new p6b0(2, this, h8b0.class, "handleViewState", "handleViewState(Lorg/xplatform/games_section/feature/popular_classic/presentation/PopularClassicOneXGamesViewModel$ViewState;)V", 4, (byte) 16);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new f8b0(dnqVar, clzVarW, p6b0Var, (yje) null), 3);
        xae0 xae0Var = H0().V;
        p6b0 p6b0Var2 = new p6b0(2, this, h8b0.class, "handleGamesContent", "handleGamesContent(Ljava/util/List;)V", 4, (byte) 17);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new f8b0((gmq) xae0Var, clzVarW2, p6b0Var2, (yje) null), 3);
        ol60 ol60Var = H0().G;
        s980 s980Var = new s980(this, null, (byte) 25);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new f8b0(ol60Var, clzVarW3, s980Var, (yje) null), 3);
        ol60 ol60Var2 = H0().H;
        p6b0 p6b0Var3 = new p6b0(2, this, h8b0.class, "handleBannerEvent", "handleBannerEvent(Lorg/xplatform/games_section/feature/popular_classic/presentation/PopularClassicOneXGamesViewModel$ActionBannerEvent;)V", 4, (byte) 18);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new f8b0((gmq) ol60Var2, clzVarW4, p6b0Var3, (yje) null, (byte) 0), 3);
    }

    public final y2r G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (y2r) objN;
    }

    public final g9b0 H0() {
        return (g9b0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().d.setAdapter(null);
        o2t.a(F());
    }

    @Override // a.tah0
    public final boolean p() {
        return G0().d.canScrollVertically(-1);
    }

    @Override // a.tah0
    public final void w() {
        kcx.G(G0().d, 0);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
