package org.xplatform.uikit_sport.eventcard.bottom;

import a.au20;
import a.bbo;
import a.bu20;
import a.cwr0;
import a.djj;
import a.dyb;
import a.ev20;
import a.g18;
import a.hie0;
import a.hny;
import a.ho8;
import a.io8;
import a.jmu0;
import a.jo8;
import a.kie0;
import a.oao;
import a.pao;
import a.pkm;
import a.pr20;
import a.q3d;
import a.qao;
import a.qr20;
import a.rao;
import a.sao;
import a.tao;
import a.uao;
import a.vao;
import a.xdr;
import a.ymx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.market.view.DsMarketBlocked;
import org.xplatform.uikit.components.market.view.DsMarketCoefficient;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardBottomMarketMultiline extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu20 f47289a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public jo8 g;
    public sao h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventCardBottomMarketMultiline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47289a = new bu20(this);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.size_48);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.size_18);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.space_8);
    }

    public static void b(ArrayList arrayList, DsMarketCoefficient dsMarketCoefficient, bbo bboVar, int i, int i2, int i3) {
        dsMarketCoefficient.setDescriptionMarket(bboVar.f2317a);
        CharSequence charSequence = bboVar.b;
        dsMarketCoefficient.setCoefficientMarket(charSequence);
        dsMarketCoefficient.setCoefficientState(bboVar.c);
        dsMarketCoefficient.setContentDescription(charSequence);
        boolean z = bboVar.d;
        qr20 qr20Var = dsMarketCoefficient.c;
        qr20Var.j(z);
        qr20Var.l(bboVar.e);
        boolean z2 = bboVar.f;
        qr20Var.i(z2);
        pr20 pr20Var = dsMarketCoefficient.f47252a;
        pr20Var.b = z2;
        pr20Var.f27444a.setEnabled(!z2);
        dsMarketCoefficient.setVisibility(0);
        arrayList.add(new uao(dsMarketCoefficient, i, i2, i3, vao.f37100a));
    }

    public final void a(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, bbo bboVar) {
        bu20 bu20Var = this.f47289a;
        LinkedHashMap linkedHashMap = bu20Var.d;
        List arrayList2 = (List) linkedHashMap.get(Integer.valueOf(i));
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = bu20Var.f3211a;
        DsMarketCoefficient dsMarketCoefficient = (DsMarketCoefficient) CollectionsKt.W(i2, arrayList2);
        if (dsMarketCoefficient == null) {
            Context context = eventCardBottomMarketMultiline.getContext();
            context.getClass();
            dsMarketCoefficient = new DsMarketCoefficient(context, null, 6);
            dsMarketCoefficient.setId(jmu0.d());
            dsMarketCoefficient.setTag("marketCoefficient");
            dsMarketCoefficient.setVisibility(8);
            dyb.b0(dsMarketCoefficient, ymx.INTERVAL_500, new au20(bu20Var, i, i2, (byte) 0));
            dsMarketCoefficient.setOnLongClickListener(new djj(new au20(bu20Var, i, i2, (byte) 1)));
            arrayList2.add(dsMarketCoefficient);
            eventCardBottomMarketMultiline.addView(dsMarketCoefficient);
        }
        linkedHashMap.put(Integer.valueOf(i), arrayList2);
        b(arrayList, dsMarketCoefficient, bboVar, i3, i4, i5);
    }

    public final void c(Function2 function2, Function2 function3) {
        bu20 bu20Var = this.f47289a;
        bu20Var.getClass();
        bu20Var.g = function2;
        bu20Var.h = function3;
    }

    public final bu20 getMarketGroupBindHelper() {
        return this.f47289a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        List<rao> list;
        char c;
        View view;
        int size = View.MeasureSpec.getSize(i);
        sao saoVar = this.h;
        int i3 = this.b;
        int i4 = this.d;
        int i5 = this.c;
        if (saoVar != null && (list = saoVar.f31896a) != null) {
            for (rao raoVar : list) {
                qao qaoVar = raoVar.f30146a;
                if (qaoVar != null && (view = qaoVar.f28406a) != null) {
                    int i6 = qaoVar.c;
                    int i7 = qaoVar.b;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (i7 * i3) + ((i5 + i4) * i6);
                    view.setLayoutParams(layoutParams2);
                    view.measure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                }
                List<uao> list2 = raoVar.b;
                int i8 = raoVar.c;
                int i9 = this.f;
                int i10 = (size - (((i8 - 1) * i9) + this.e)) / i8;
                for (uao uaoVar : list2) {
                    vao vaoVar = uaoVar.e;
                    int i11 = uaoVar.c;
                    int i12 = vaoVar == vao.c ? (i8 - i11) * i10 : i10;
                    View view2 = uaoVar.f35340a;
                    int i13 = i4;
                    int i14 = uaoVar.b;
                    int i15 = uaoVar.d;
                    try {
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            c = 0;
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        layoutParams4.gravity = 3;
                        layoutParams4.leftMargin = ((i11 + 1) * i9) + (i11 * i12);
                        layoutParams4.topMargin = ((i15 - 1) * i13) + (i5 * i15) + (i14 * i3);
                        view2.setLayoutParams(layoutParams4);
                        c = 0;
                        try {
                            view2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                        i4 = i13;
                        e = e;
                    } catch (Exception e2) {
                        e = e2;
                        c = 0;
                    }
                    e.printStackTrace();
                    i4 = i13;
                }
            }
        }
        int i16 = i4;
        sao saoVar2 = this.h;
        setMeasuredDimension(size, ((i5 + i16) * (saoVar2 != null ? saoVar2.d : 0)) + (i3 * (saoVar2 != null ? saoVar2.c : 0)));
    }

    public final void setExpandedListener(xdr xdrVar) {
        xdrVar.getClass();
        bu20 bu20Var = this.f47289a;
        bu20Var.getClass();
        xdrVar.getClass();
        bu20Var.j = xdrVar;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:139:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:149:0x0307  */
    /* JADX WARN: Code duplicated, block: B:151:0x030f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0313  */
    /* JADX WARN: Code duplicated, block: B:154:0x031e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0360  */
    /* JADX WARN: Code duplicated, block: B:162:0x0366  */
    /* JADX WARN: Code duplicated, block: B:163:0x038a  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03be  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:180:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:195:0x0487 A[LOOP:7: B:129:0x02cb->B:195:0x0487, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setMarkets(jo8 jo8Var) {
        ArrayList arrayList;
        boolean z;
        int i;
        Throwable th;
        int i2;
        sao saoVar;
        int i3;
        ArrayList arrayListQ0;
        int i4;
        View view;
        pao paoVar;
        qao qaoVar;
        int i5;
        ArrayList arrayList2;
        kie0 kie0Var;
        int i6;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        boolean z2;
        ArrayList arrayList3;
        int i11;
        kie0 kie0Var2;
        int i12;
        tao taoVar;
        hie0 hie0Var;
        qao qaoVar2;
        ArrayList arrayList4;
        ev20 ev20Var;
        int i13;
        int i14;
        bbo bboVar;
        bbo bboVar2;
        int i15;
        int i16;
        kie0 kie0Var3;
        int i17;
        boolean z3;
        tao taoVar2;
        List list2;
        ArrayList arrayList5;
        int i18;
        boolean z4;
        qao qaoVar3;
        hie0 hie0Var2;
        ev20 ev20Var2;
        List list3;
        DsMarketCoefficient dsMarketCoefficient;
        int i19;
        int i20;
        oao oaoVar;
        List list4;
        int i21;
        qao qaoVar4;
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = this;
        jo8Var.getClass();
        ArrayList<ev20> arrayList6 = jo8Var.f16844a;
        byte b = jo8Var.b;
        int size = 0;
        for (ev20 ev20Var3 : arrayList6) {
            size += CollectionsKt.K(ev20Var3.b, ev20Var3.c).size();
        }
        int i22 = 1;
        boolean z5 = arrayList6.size() + size > b;
        int i23 = 0;
        for (ev20 ev20Var4 : arrayList6) {
            int size2 = ev20Var4.b.size() / ev20Var4.c;
            int i24 = i23 + 1;
            if (i24 == 9) {
                if ((size2 != 1 || ev20Var4.b.size() != 1) && size2 == 1) {
                    z5 = false;
                    break;
                } else {
                    z5 = true;
                    break;
                }
            }
            i23 = i24 + size2;
        }
        boolean z6 = jo8Var.c && z5;
        boolean zIsEmpty = arrayList6.isEmpty();
        bu20 bu20Var = eventCardBottomMarketMultiline.f47289a;
        Throwable th2 = null;
        if (zIsEmpty && jo8Var.d) {
            ArrayList arrayList7 = new ArrayList();
            int i25 = 0;
            while (i25 < 3) {
                EventCardBottomMarketMultiline eventCardBottomMarketMultiline2 = bu20Var.f3211a;
                LinkedHashMap linkedHashMap = bu20Var.e;
                DsMarketBlocked dsMarketBlocked = (DsMarketBlocked) linkedHashMap.get(Integer.valueOf(i25));
                if (dsMarketBlocked == null) {
                    Context context = eventCardBottomMarketMultiline2.getContext();
                    context.getClass();
                    dsMarketBlocked = new DsMarketBlocked(context, null, 6);
                    linkedHashMap.put(Integer.valueOf(i25), dsMarketBlocked);
                    eventCardBottomMarketMultiline2.addView(dsMarketBlocked);
                }
                dsMarketBlocked.setVisibility(0);
                int i26 = i25;
                arrayList7.add(new uao(dsMarketBlocked, 0, i26, 1, vao.b));
                i25 = i26 + 1;
            }
            saoVar = new sao(a.c(new rao(null, arrayList7, 3, -1, vao.b)), tao.c, 1, 1);
            th = null;
            z = z6;
        } else {
            for (int i27 = 0; i27 < 3; i27++) {
                DsMarketBlocked dsMarketBlocked2 = (DsMarketBlocked) bu20Var.e.get(Integer.valueOf(i27));
                if (dsMarketBlocked2 != null) {
                    dsMarketBlocked2.setVisibility(8);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            hie0 hie0Var3 = new hie0();
            tao taoVar3 = tao.f33622a;
            Iterator it = arrayList6.iterator();
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            loop6: while (true) {
                if (!it.hasNext()) {
                    arrayList = arrayList8;
                    z = z6;
                    int i31 = i29;
                    i = i30;
                    th = th2;
                    i2 = i31;
                    break;
                }
                Object next = it.next();
                int i32 = i28 + 1;
                if (i28 < 0) {
                    Throwable th3 = th2;
                    q3d.p();
                    throw th3;
                }
                ev20 ev20Var5 = (ev20) next;
                if (i29 + i30 + i22 >= b) {
                    if (!z6 || hie0Var3.f13108a) {
                        i3 = i29;
                    } else {
                        pkm pkmVarA = bu20Var.a();
                        vao vaoVar = vao.c;
                        arrayList8.add(new rao(null, a.c(new uao(pkmVarA, i29, 0, i30, vaoVar)), 1, 0, vaoVar));
                        i3 = i29 + 1;
                    }
                    arrayList = arrayList8;
                    z = z6;
                    i2 = i3;
                    i = i30;
                    th = th2;
                    break;
                }
                int i33 = i29;
                int i34 = i30;
                jo8 jo8Var2 = eventCardBottomMarketMultiline.g;
                ev20 ev20Var6 = jo8Var2 != null ? (ev20) CollectionsKt.W(i28, jo8Var2.f16844a) : null;
                cwr0 cwr0Var = ev20Var5.f8449a;
                int i35 = ev20Var5.c;
                cwr0 cwr0Var2 = ev20Var6 != null ? ev20Var6.f8449a : null;
                if (ev20Var6 == null || (list4 = ev20Var6.b) == null) {
                    arrayListQ0 = null;
                } else {
                    int i36 = ev20Var6.c;
                    arrayListQ0 = CollectionsKt.Q0(list4, i36, i36);
                }
                ArrayList arrayListK = CollectionsKt.K(ev20Var5.b, i35);
                jo8 jo8Var3 = eventCardBottomMarketMultiline.g;
                Integer numValueOf = jo8Var3 != null ? Integer.valueOf(jo8Var3.b) : null;
                Integer numValueOf2 = ev20Var6 != null ? Integer.valueOf(ev20Var6.c) : null;
                int size3 = arrayListK.size();
                Integer numValueOf3 = arrayListQ0 != null ? Integer.valueOf(arrayListQ0.size()) : null;
                tao taoVar4 = (numValueOf != null && b == numValueOf.intValue() && numValueOf2 != null && i35 == numValueOf2.intValue() && numValueOf3 != null && size3 == numValueOf3.intValue()) ? tao.b : tao.c;
                if (taoVar4.ordinal() <= taoVar3.ordinal()) {
                    taoVar4 = taoVar3;
                }
                if (cwr0Var.equals(cwr0Var2) && taoVar4 == tao.f33622a) {
                    oaoVar = null;
                } else {
                    if ((cwr0Var instanceof io8 ? (io8) cwr0Var : null) != null) {
                        EventCardBottomMarketMultiline eventCardBottomMarketMultiline3 = bu20Var.f3211a;
                        LinkedHashMap linkedHashMap2 = bu20Var.b;
                        oao oaoVar2 = (oao) linkedHashMap2.get(Integer.valueOf(i34));
                        oao oaoVar3 = oaoVar2;
                        if (oaoVar2 == null) {
                            Context context2 = eventCardBottomMarketMultiline3.getContext();
                            context2.getClass();
                            oao oaoVar4 = new oao(context2);
                            linkedHashMap2.put(Integer.valueOf(i34), oaoVar4);
                            eventCardBottomMarketMultiline3.addView(oaoVar4);
                            oaoVar3 = oaoVar4;
                        }
                        oaoVar3.setVisibility(0);
                        io8 io8Var = (io8) cwr0Var;
                        String str = io8Var.q;
                        String str2 = io8Var.r;
                        str.getClass();
                        oaoVar3.e = str;
                        oaoVar3.f = str2;
                        oaoVar = oaoVar3;
                    } else if ((cwr0Var instanceof ho8 ? (ho8) cwr0Var : null) != null) {
                        EventCardBottomMarketMultiline eventCardBottomMarketMultiline4 = bu20Var.f3211a;
                        LinkedHashMap linkedHashMap3 = bu20Var.c;
                        pao paoVar2 = (pao) linkedHashMap3.get(Integer.valueOf(i34));
                        if (paoVar2 == null) {
                            Context context3 = eventCardBottomMarketMultiline4.getContext();
                            context3.getClass();
                            pao paoVar3 = new pao(context3);
                            linkedHashMap3.put(Integer.valueOf(i34), paoVar3);
                            i34 = i34;
                            dyb.b0(paoVar3, ymx.INTERVAL_500, new g18((Object) bu20Var, (Object) paoVar3, i34, (byte) 6));
                            eventCardBottomMarketMultiline4.addView(paoVar3);
                            paoVar = paoVar3;
                        } else {
                            i34 = i34;
                            paoVar = paoVar2;
                        }
                        i4 = 0;
                        paoVar.setVisibility(0);
                        paoVar.b(((ho8) cwr0Var).q);
                        view = paoVar;
                    } else {
                        arrayList8 = arrayList8;
                        i34 = i34;
                        i4 = 0;
                        i35 = i35;
                        view = null;
                    }
                    qaoVar = new qao(view, i33, i34, cwr0Var instanceof ho8);
                    i5 = i34 + 1;
                    arrayList2 = new ArrayList();
                    kie0Var = new kie0();
                    i6 = i33;
                    i7 = i4;
                    for (Object obj : arrayListK) {
                        i8 = i7 + 1;
                        if (i7 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        List list5 = (List) obj;
                        if (arrayListQ0 != null) {
                            list = (List) CollectionsKt.W(i7, arrayListQ0);
                        } else {
                            list = null;
                        }
                        i9 = i6 + i5;
                        if (i9 + 1 >= b) {
                            i10 = 1;
                        } else {
                            i10 = i4;
                        }
                        if (i9 + 2 >= b) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList3 = arrayListQ0;
                        int i37 = q3d.i(list5);
                        i11 = 0;
                        for (Object obj2 : list5) {
                            i14 = i11 + 1;
                            if (i11 >= 0) {
                                q3d.p();
                                throw null;
                            }
                            bboVar = (bbo) obj2;
                            if (list != null) {
                                bboVar2 = (bbo) CollectionsKt.W(i11, list);
                            } else {
                                bboVar2 = null;
                            }
                            i15 = (i7 * i35) + i11;
                            if (z6 || i10 == 0 || i37 != i11) {
                                i16 = i7;
                                if (taoVar4 == tao.c) {
                                    boolean z7 = z6;
                                    kie0Var3 = kie0Var;
                                    i17 = i28;
                                    z3 = z7;
                                    taoVar2 = taoVar4;
                                    list2 = list;
                                    arrayList5 = arrayList8;
                                    i18 = i16;
                                    z4 = z2;
                                    qaoVar3 = qaoVar;
                                    hie0Var2 = hie0Var3;
                                    ev20Var2 = ev20Var5;
                                    a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                                } else {
                                    boolean z8 = z6;
                                    kie0Var3 = kie0Var;
                                    i17 = i28;
                                    z3 = z8;
                                    taoVar2 = taoVar4;
                                    list2 = list;
                                    arrayList5 = arrayList8;
                                    i18 = i16;
                                    z4 = z2;
                                    qaoVar3 = qaoVar;
                                    hie0Var2 = hie0Var3;
                                    ev20Var2 = ev20Var5;
                                    if (taoVar2 == tao.b) {
                                        list3 = (List) bu20Var.d.get(Integer.valueOf(i17));
                                        if (list3 != null) {
                                            dsMarketCoefficient = (DsMarketCoefficient) CollectionsKt.W(i15, list3);
                                        } else {
                                            dsMarketCoefficient = null;
                                        }
                                        if (Intrinsics.d(bboVar, bboVar2) || dsMarketCoefficient == null || dsMarketCoefficient.getMeasuredWidth() == 0 || dsMarketCoefficient.getVisibility() != 0) {
                                            if (dsMarketCoefficient != null) {
                                                int i38 = i6;
                                                int i39 = i5;
                                                b(arrayList2, dsMarketCoefficient, bboVar, i38, i11, i39);
                                                i6 = i38;
                                                i5 = i39;
                                            } else {
                                                a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                hie0Var3.f13108a = true;
                                kie0Var.f18333a--;
                                arrayList2.add(new uao(bu20Var.a(), i6, i11, i5, vao.c));
                                boolean z9 = z6;
                                kie0Var3 = kie0Var;
                                i17 = i28;
                                z3 = z9;
                                taoVar2 = taoVar4;
                                list2 = list;
                                arrayList5 = arrayList8;
                                i18 = i7;
                                z4 = z2;
                                qaoVar3 = qaoVar;
                                hie0Var2 = hie0Var3;
                                ev20Var2 = ev20Var5;
                            }
                            if (z3 || ((i10 == 0 && !z4) || i37 >= i35 - 1)) {
                                i19 = i14;
                                i20 = 1;
                            } else {
                                i20 = 1;
                                hie0Var2.f13108a = true;
                                i19 = i14;
                                arrayList2.add(new uao(bu20Var.a(), i6, i19, i5, vao.c));
                            }
                            kie0Var3.f18333a += i20;
                            boolean z10 = z3;
                            i28 = i17;
                            kie0Var = kie0Var3;
                            z6 = z10;
                            i6 = i6;
                            i5 = i5;
                            taoVar4 = taoVar2;
                            hie0Var3 = hie0Var2;
                            ev20Var5 = ev20Var2;
                            z2 = z4;
                            i11 = i19;
                            i10 = i10;
                            qaoVar = qaoVar3;
                            arrayList8 = arrayList5;
                            i7 = i18;
                            list = list2;
                        }
                        boolean z11 = z6;
                        kie0Var2 = kie0Var;
                        i12 = i28;
                        z = z11;
                        th = null;
                        taoVar = taoVar4;
                        hie0Var = hie0Var3;
                        qaoVar2 = qaoVar;
                        arrayList4 = arrayList8;
                        eventCardBottomMarketMultiline = this;
                        ev20Var = ev20Var5;
                        i13 = i5;
                        i2 = i6 + 1;
                        if (i2 + i13 >= b) {
                            rao raoVar = new rao(qaoVar2, arrayList2, ev20Var.c, kie0Var2.f18333a - 1, vao.f37100a);
                            arrayList = arrayList4;
                            arrayList.add(raoVar);
                            i = i13;
                            taoVar3 = taoVar;
                            break loop6;
                        }
                        i28 = i12;
                        kie0Var = kie0Var2;
                        z6 = z;
                        i6 = i2;
                        i5 = i13;
                        taoVar4 = taoVar;
                        hie0Var3 = hie0Var;
                        ev20Var5 = ev20Var;
                        i7 = i8;
                        arrayListQ0 = arrayList3;
                        qaoVar = qaoVar2;
                        arrayList8 = arrayList4;
                        i4 = 0;
                    }
                    tao taoVar5 = taoVar4;
                    eventCardBottomMarketMultiline = this;
                    ArrayList arrayList9 = arrayList8;
                    arrayList9.add(new rao(qaoVar, arrayList2, ev20Var5.c, kie0Var.f18333a - 1, vao.f37100a));
                    arrayList8 = arrayList9;
                    i30 = i5;
                    taoVar3 = taoVar5;
                    i28 = i32;
                    th2 = null;
                    z6 = z6;
                    i22 = 1;
                    i29 = i6;
                    hie0Var3 = hie0Var3;
                }
                i4 = 0;
                i35 = i35;
                view = oaoVar;
                qaoVar = new qao(view, i33, i34, cwr0Var instanceof ho8);
                i5 = i34 + 1;
                arrayList2 = new ArrayList();
                kie0Var = new kie0();
                i6 = i33;
                i7 = i4;
                while (r22.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    List list6 = (List) obj;
                    if (arrayListQ0 != null) {
                        list = (List) CollectionsKt.W(i7, arrayListQ0);
                    } else {
                        list = null;
                    }
                    i9 = i6 + i5;
                    if (i9 + 1 >= b) {
                        i10 = 1;
                    } else {
                        i10 = i4;
                    }
                    if (i9 + 2 >= b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList3 = arrayListQ0;
                    int i310 = q3d.i(list6);
                    i11 = 0;
                    while (r33.hasNext()) {
                        i14 = i11 + 1;
                        if (i11 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        bboVar = (bbo) obj2;
                        if (list != null) {
                            bboVar2 = (bbo) CollectionsKt.W(i11, list);
                        } else {
                            bboVar2 = null;
                        }
                        i15 = (i7 * i35) + i11;
                        if (z6) {
                            i16 = i7;
                            if (taoVar4 == tao.c) {
                                boolean z12 = z6;
                                kie0Var3 = kie0Var;
                                i17 = i28;
                                z3 = z12;
                                taoVar2 = taoVar4;
                                list2 = list;
                                arrayList5 = arrayList8;
                                i18 = i16;
                                z4 = z2;
                                qaoVar3 = qaoVar;
                                hie0Var2 = hie0Var3;
                                ev20Var2 = ev20Var5;
                                a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                            } else {
                                boolean z13 = z6;
                                kie0Var3 = kie0Var;
                                i17 = i28;
                                z3 = z13;
                                taoVar2 = taoVar4;
                                list2 = list;
                                arrayList5 = arrayList8;
                                i18 = i16;
                                z4 = z2;
                                qaoVar3 = qaoVar;
                                hie0Var2 = hie0Var3;
                                ev20Var2 = ev20Var5;
                                if (taoVar2 == tao.b) {
                                    list3 = (List) bu20Var.d.get(Integer.valueOf(i17));
                                    if (list3 != null) {
                                        dsMarketCoefficient = (DsMarketCoefficient) CollectionsKt.W(i15, list3);
                                    } else {
                                        dsMarketCoefficient = null;
                                    }
                                    if (Intrinsics.d(bboVar, bboVar2)) {
                                    }
                                    if (dsMarketCoefficient != null) {
                                        int i311 = i6;
                                        int i312 = i5;
                                        b(arrayList2, dsMarketCoefficient, bboVar, i311, i11, i312);
                                        i6 = i311;
                                        i5 = i312;
                                    } else {
                                        a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                                    }
                                }
                            }
                        } else {
                            i16 = i7;
                            if (taoVar4 == tao.c) {
                                boolean z14 = z6;
                                kie0Var3 = kie0Var;
                                i17 = i28;
                                z3 = z14;
                                taoVar2 = taoVar4;
                                list2 = list;
                                arrayList5 = arrayList8;
                                i18 = i16;
                                z4 = z2;
                                qaoVar3 = qaoVar;
                                hie0Var2 = hie0Var3;
                                ev20Var2 = ev20Var5;
                                a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                            } else {
                                boolean z15 = z6;
                                kie0Var3 = kie0Var;
                                i17 = i28;
                                z3 = z15;
                                taoVar2 = taoVar4;
                                list2 = list;
                                arrayList5 = arrayList8;
                                i18 = i16;
                                z4 = z2;
                                qaoVar3 = qaoVar;
                                hie0Var2 = hie0Var3;
                                ev20Var2 = ev20Var5;
                                if (taoVar2 == tao.b) {
                                    list3 = (List) bu20Var.d.get(Integer.valueOf(i17));
                                    if (list3 != null) {
                                        dsMarketCoefficient = (DsMarketCoefficient) CollectionsKt.W(i15, list3);
                                    } else {
                                        dsMarketCoefficient = null;
                                    }
                                    if (Intrinsics.d(bboVar, bboVar2)) {
                                    }
                                    if (dsMarketCoefficient != null) {
                                        int i313 = i6;
                                        int i314 = i5;
                                        b(arrayList2, dsMarketCoefficient, bboVar, i313, i11, i314);
                                        i6 = i313;
                                        i5 = i314;
                                    } else {
                                        a(arrayList2, i17, i15, i6, i11, i5, bboVar);
                                    }
                                }
                            }
                        }
                        if (z3) {
                            i19 = i14;
                            i20 = 1;
                        } else {
                            i19 = i14;
                            i20 = 1;
                        }
                        kie0Var3.f18333a += i20;
                        boolean z16 = z3;
                        i28 = i17;
                        kie0Var = kie0Var3;
                        z6 = z16;
                        i6 = i6;
                        i5 = i5;
                        taoVar4 = taoVar2;
                        hie0Var3 = hie0Var2;
                        ev20Var5 = ev20Var2;
                        z2 = z4;
                        i11 = i19;
                        i10 = i10;
                        qaoVar = qaoVar3;
                        arrayList8 = arrayList5;
                        i7 = i18;
                        list = list2;
                    }
                    boolean z17 = z6;
                    kie0Var2 = kie0Var;
                    i12 = i28;
                    z = z17;
                    th = null;
                    taoVar = taoVar4;
                    hie0Var = hie0Var3;
                    qaoVar2 = qaoVar;
                    arrayList4 = arrayList8;
                    eventCardBottomMarketMultiline = this;
                    ev20Var = ev20Var5;
                    i13 = i5;
                    i2 = i6 + 1;
                    if (i2 + i13 >= b) {
                        rao raoVar2 = new rao(qaoVar2, arrayList2, ev20Var.c, kie0Var2.f18333a - 1, vao.f37100a);
                        arrayList = arrayList4;
                        arrayList.add(raoVar2);
                        i = i13;
                        taoVar3 = taoVar;
                        break loop6;
                    }
                    i28 = i12;
                    kie0Var = kie0Var2;
                    z6 = z;
                    i6 = i2;
                    i5 = i13;
                    taoVar4 = taoVar;
                    hie0Var3 = hie0Var;
                    ev20Var5 = ev20Var;
                    i7 = i8;
                    arrayListQ0 = arrayList3;
                    qaoVar = qaoVar2;
                    arrayList8 = arrayList4;
                    i4 = 0;
                }
                tao taoVar6 = taoVar4;
                eventCardBottomMarketMultiline = this;
                ArrayList arrayList10 = arrayList8;
                arrayList10.add(new rao(qaoVar, arrayList2, ev20Var5.c, kie0Var.f18333a - 1, vao.f37100a));
                arrayList8 = arrayList10;
                i30 = i5;
                taoVar3 = taoVar6;
                i28 = i32;
                th2 = null;
                z6 = z6;
                i22 = 1;
                i29 = i6;
                hie0Var3 = hie0Var3;
            }
            saoVar = new sao(arrayList, taoVar3, i2, i);
        }
        List list7 = saoVar.f31896a;
        int size4 = list7.size() - 1;
        LinkedHashMap linkedHashMap4 = bu20Var.d;
        LinkedHashMap linkedHashMap5 = bu20Var.c;
        LinkedHashMap linkedHashMap6 = bu20Var.b;
        int iMax = Math.max(linkedHashMap4.values().size(), linkedHashMap6.size());
        if (iMax >= 0) {
            int i40 = 0;
            while (true) {
                List list8 = (List) CollectionsKt.R(bu20Var.d.values(), i40);
                rao raoVar3 = (rao) CollectionsKt.W(i40, list7);
                int i41 = raoVar3 != null ? raoVar3.d : -1;
                rao raoVar4 = (rao) CollectionsKt.W(i40, list7);
                Object obj3 = raoVar4 != null ? raoVar4.e : th;
                boolean z18 = i40 <= size4 && (obj3 != vao.b && obj3 != vao.c);
                Object objValueOf = (raoVar3 == null || (qaoVar4 = raoVar3.f30146a) == null) ? th : Boolean.valueOf(qaoVar4.d);
                if (Intrinsics.d(objValueOf, Boolean.TRUE)) {
                    pao paoVar4 = (pao) linkedHashMap5.get(Integer.valueOf(i40));
                    if (paoVar4 != null) {
                        paoVar4.setVisibility(z18 ? 0 : 8);
                    }
                    oao oaoVar5 = (oao) linkedHashMap6.get(Integer.valueOf(i40));
                    i21 = 8;
                    if (oaoVar5 != null) {
                        oaoVar5.setVisibility(8);
                    }
                } else {
                    i21 = 8;
                    if (Intrinsics.d(objValueOf, Boolean.FALSE)) {
                        pao paoVar5 = (pao) linkedHashMap5.get(Integer.valueOf(i40));
                        if (paoVar5 != null) {
                            paoVar5.setVisibility(8);
                        }
                        oao oaoVar6 = (oao) linkedHashMap6.get(Integer.valueOf(i40));
                        if (oaoVar6 != null) {
                            oaoVar6.setVisibility(z18 ? 0 : 8);
                        }
                    } else {
                        oao oaoVar7 = (oao) linkedHashMap6.get(Integer.valueOf(i40));
                        if (oaoVar7 != null) {
                            oaoVar7.setVisibility(z18 ? 0 : 8);
                        }
                        pao paoVar6 = (pao) linkedHashMap5.get(Integer.valueOf(i40));
                        if (paoVar6 != null) {
                            paoVar6.setVisibility(z18 ? 0 : 8);
                        }
                    }
                }
                if (list8 != null) {
                    int i42 = 0;
                    for (Object obj4 : list8) {
                        int i43 = i42 + 1;
                        if (i42 < 0) {
                            q3d.p();
                            throw th;
                        }
                        ((DsMarketCoefficient) obj4).setVisibility((!z18 || i42 > i41) ? i21 : 0);
                        i42 = i43;
                    }
                }
                if (i40 == iMax) {
                    break;
                } else {
                    i40++;
                }
            }
        } else {
            i21 = 8;
        }
        bu20Var.a().setVisibility(z ? 0 : i21);
        eventCardBottomMarketMultiline.h = saoVar;
        eventCardBottomMarketMultiline.g = jo8Var;
        if (saoVar.b != tao.f33622a) {
            eventCardBottomMarketMultiline.requestLayout();
        }
    }

    public final void setShowMoreButtonListener(Function0<Unit> function0) {
        function0.getClass();
        bu20 bu20Var = this.f47289a;
        bu20Var.getClass();
        function0.getClass();
        bu20Var.i = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardBottomMarketMultiline(Context context) {
        this(context, null);
        context.getClass();
    }
}
