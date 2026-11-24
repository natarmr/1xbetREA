package a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.textclassifier.TextClassifier;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class o690 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o690(qrc0 qrc0Var, a570 a570Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.k = qrc0Var;
        this.l = a570Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new o690(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new o690((w46) obj2, yjeVar, (byte) 1);
            case 2:
                return new o690(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new o690(this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new o690(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new o690(this.k, obj2, yjeVar, (byte) 5);
            case 6:
                return new o690(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new o690(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new o690(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                return new o690(this.k, obj2, yjeVar, (byte) 9);
            case 10:
                return new o690(this.k, obj2, yjeVar, (byte) 10);
            case 11:
                return new o690(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                o690 o690Var = new o690((j5b0) obj2, this.j, yjeVar);
                o690Var.k = obj;
                return o690Var;
            case 13:
                return new o690(this.k, obj2, yjeVar, (byte) 13);
            case 14:
                o690 o690Var2 = new o690((w46) obj2, yjeVar, (byte) 14);
                o690Var2.k = obj;
                return o690Var2;
            case 15:
                return new o690(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new o690((w46) obj2, yjeVar, (byte) 16);
            case 17:
                return new o690((w46) obj2, yjeVar, (byte) 17);
            case 18:
                return new o690(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new o690(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new o690(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new o690(this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new o690(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new o690(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                return new o690((qrc0) this.k, (a570) obj2, this.j, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new o690((w46) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new o690(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new o690(this.k, obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new o690((w46) obj2, yjeVar, (byte) 28);
            default:
                o690 o690Var3 = new o690((w46) obj2, yjeVar, (byte) 29);
                o690Var3.k = obj;
                return o690Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((o690) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((o690) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o690) create((o1d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v32, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [a.stq] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [a.bjo0] */
    /* JADX WARN: Type inference failed for: r15v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v45, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v62, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [a.prq0] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25, types: [a.prq0] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30, types: [a.prq0[]] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [a.prq0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [a.prq0] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE;
        Object objA;
        p990 p990Var;
        Object objA2;
        List list;
        ?? arrayList;
        ?? arrayList2;
        Iterator it;
        int i;
        byte b;
        String str;
        yje yjeVar;
        int i2;
        iko0 iko0Var;
        List list2;
        ?? arrayList3;
        ?? arrayList4;
        List list3;
        ?? arrayList5;
        String str2;
        int i3;
        ?? arrayList6;
        Iterator it2;
        int i4;
        ?? r5;
        List list4;
        List list5;
        ptq ptqVar;
        Object objA3;
        ?? arrayList7;
        ?? arrayList8;
        ?? arrayList9;
        Object objK;
        Object value;
        Object objB;
        Object objK2;
        Object objA4;
        p7m0 p7m0Var;
        Object objA5;
        ol60 ol60Var;
        Object objA6;
        p7m0 p7m0Var2;
        Object objE2;
        Object objE3;
        Object objA7;
        sou souVar;
        Unit unit;
        byte b2 = this.i;
        byte b3 = 2;
        byte b4 = 4;
        byte b5 = 3;
        byte b6 = 10;
        String str3 = "";
        byte b7 = 0;
        Object obj2 = this.l;
        byte b8 = 1;
        yje yjeVar2 = null;
        ?? arrayList10 = 0;
        switch (b2) {
            case 0:
                s690 s690Var = (s690) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    dxk dxkVar = dxk.FULL_DOC_RULES;
                    this.j = true;
                    objE = s690Var.g.e((File) obj2, dxkVar, this);
                    if (objE == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                s690Var.y.f(new e690((File) objE));
                return Unit.f46060a;
            case 1:
                p990 p990Var2 = (p990) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nou nouVar = p990Var2.r;
                    this.k = p990Var2;
                    this.j = true;
                    objA = nouVar.a(tl5.c, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                    p990Var = p990Var2;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p990Var = (p990) this.k;
                    z1x.P(obj);
                    objA = obj;
                }
                p990Var.F = ((ql5) objA).f28916a;
                p990Var2.x();
                return Unit.f46060a;
            case 2:
                xcz xczVar = (xcz) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new a7s(xczVar, (byte) 23));
                    r980 r980Var = new r980((kie0) obj2, xczVar, (byte) 7);
                    this.j = true;
                    if (vsg0VarV.c(r980Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new gg90((xcz) this.k, b4));
                    mi80 mi80Var = new mi80((mg90) obj2, (byte) 24);
                    this.j = true;
                    if (vsg0VarV2.c(mi80Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                kt90 kt90Var = (kt90) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    nr00 nr00Var = kt90Var.b;
                    String strK = kng0.k("Cannot parse captcha image: ", wgm0.s((Throwable) obj2));
                    ony onyVar = (ony) nr00Var.f23980a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("captchaCalculatingError", ncy.c(strK));
                    ((rny) onyVar).a("captchaCalculatingError", new tny("event", xp20.n(linkedHashMap)));
                    qoj0 qoj0Var = kt90Var.d;
                    ht90 ht90Var = new ht90();
                    this.j = true;
                    if (qoj0Var.a(ht90Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    byte[] bArrDecode = Base64.decode(((i7a) this.k).b, 2);
                    bArrDecode.getClass();
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    bitmapDecodeByteArray.getClass();
                    qoj0 qoj0Var2 = ((kt90) obj2).d;
                    gt90 gt90Var = new gt90(bitmapDecodeByteArray);
                    this.j = true;
                    if (qoj0Var2.a(gt90Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                TextClassifier textClassifier = (TextClassifier) this.k;
                if (textClassifier == null) {
                    return null;
                }
                this.j = true;
                Object objInvoke = ((Function2) obj2).invoke(textClassifier, this);
                return objInvoke == wneVar7 ? wneVar7 : objInvoke;
            case 7:
                zz90 zz90Var = (zz90) this.k;
                sbx0 sbx0Var = zz90Var.c;
                knf0 knf0Var = zz90Var.d;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    int iB = knf0Var.b();
                    knf0Var.getClass();
                    LinkedHashMap linkedHashMapO = ofm0.o(iB, (String) obj2, knf0Var.c());
                    dq00 dq00Var = zz90Var.b;
                    this.j = true;
                    objA2 = ((oz90) ((pl70) dq00Var.c).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", this);
                    if (objA2 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                rz90 rz90Var = (rz90) ((dx5) objA2).a();
                wz90 wz90Var = rz90Var.e;
                Integer num = rz90Var.c;
                if (wz90Var == null || (list = wz90Var.f40014a) == null) {
                    jf4.k(null);
                    return null;
                }
                if (list.isEmpty()) {
                    jf4.k(null);
                    return null;
                }
                List list6 = rz90Var.f31348a;
                if (list6 != null) {
                    arrayList = new ArrayList(r3d.q(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(dnm0.q((gip0) it3.next()));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                ?? r17 = arrayList;
                List<b5s0> list7 = rz90Var.b;
                if (list7 != null) {
                    arrayList2 = new ArrayList(r3d.q(list7, 10));
                    for (b5s0 b5s0Var : list7) {
                        String str4 = b5s0Var.f2019a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = b5s0Var.b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList2.add(new p2s0(str4, str5));
                    }
                } else {
                    arrayList2 = iun.f15405a;
                }
                ?? r18 = arrayList2;
                int iIntValue = num != null ? num.intValue() : 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                ArrayList arrayList11 = new ArrayList(r3d.q(list, 10));
                Iterator it4 = list.iterator();
                int i5 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        ?? r21 = yjeVar2;
                        q3d.p();
                        throw r21;
                    }
                    gdo0 gdo0Var = (gdo0) next;
                    String str6 = gdo0Var.f11113a;
                    if (str6 == null) {
                        str6 = str3;
                    }
                    uko0 uko0Var = gdo0Var.b;
                    if (uko0Var != null) {
                        List list8 = uko0Var.d;
                        ?? r14 = (list8 == null || (ptqVar = (ptq) CollectionsKt.firstOrNull(list8)) == null) ? yjeVar2 : ptqVar.b;
                        ?? r15 = (r14 == 0 || (list4 = r14.c) == null || (list5 = (List) CollectionsKt.firstOrNull(list4)) == null) ? yjeVar2 : (bjo0) CollectionsKt.firstOrNull(list5);
                        List list9 = uko0Var.f35838a;
                        if (list9 == null) {
                            list9 = iun.f15405a;
                        }
                        List list10 = uko0Var.b;
                        if (list10 != null) {
                            yjeVar = yjeVar2;
                            ArrayList arrayList12 = new ArrayList(r3d.q(list10, b6));
                            Iterator it5 = list10.iterator();
                            while (it5.hasNext()) {
                                kmo0 kmo0Var = (kmo0) it5.next();
                                Long l = kmo0Var.f18551a;
                                long jLongValue = l != null ? l.longValue() : 0L;
                                List list11 = kmo0Var.b;
                                if (list11 != null) {
                                    str2 = str3;
                                    arrayList6 = new ArrayList(r3d.q(list11, 10));
                                    Iterator it6 = list11.iterator();
                                    while (it6.hasNext()) {
                                        a3u0 a3u0Var = (a3u0) it6.next();
                                        Long l2 = a3u0Var.f193a;
                                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                                        String str7 = a3u0Var.b;
                                        String str8 = str7 == null ? str2 : str7;
                                        Integer num2 = a3u0Var.c;
                                        if (num2 != null) {
                                            int iIntValue3 = num2.intValue();
                                            prq0.c.getClass();
                                            it2 = it6;
                                            ?? Values = prq0.values();
                                            i4 = iIntValue;
                                            int length = Values.length;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < length) {
                                                    int i8 = i7;
                                                    r5 = Values[i8];
                                                    int i9 = length;
                                                    if (r5.f27478a != iIntValue3) {
                                                        i7 = i8 + 1;
                                                        length = i9;
                                                    }
                                                } else {
                                                    r5 = yjeVar;
                                                }
                                            }
                                            if (r5 == 0) {
                                                r5 = prq0.d;
                                            }
                                        } else {
                                            it2 = it6;
                                            i4 = iIntValue;
                                            r5 = prq0.d;
                                        }
                                        ?? r30 = r5;
                                        String str9 = a3u0Var.d;
                                        arrayList6.add(new u2u0(jLongValue2, str8, r30, str9 == null ? str2 : str9));
                                        it6 = it2;
                                        iIntValue = i4;
                                    }
                                    i3 = iIntValue;
                                } else {
                                    str2 = str3;
                                    i3 = iIntValue;
                                    arrayList6 = iun.f15405a;
                                }
                                arrayList12.add(new bmo0(jLongValue, arrayList6));
                                it5 = it5;
                                it4 = it4;
                                i6 = i6;
                                str3 = str2;
                                iIntValue = i3;
                            }
                            it = it4;
                            i = i6;
                            str = str3;
                            i2 = iIntValue;
                            list2 = arrayList12;
                        } else {
                            it = it4;
                            i = i6;
                            str = str3;
                            yjeVar = yjeVar2;
                            i2 = iIntValue;
                            list2 = iun.f15405a;
                        }
                        List list12 = uko0Var.c;
                        if (list12 != null) {
                            int i10 = 10;
                            arrayList3 = new ArrayList(r3d.q(list12, 10));
                            Iterator it7 = list12.iterator();
                            while (it7.hasNext()) {
                                List list13 = (List) it7.next();
                                ArrayList arrayList13 = new ArrayList(r3d.q(list13, i10));
                                for (Iterator it8 = list13.iterator(); it8.hasNext(); it8 = it8) {
                                    bjo0 bjo0Var = (bjo0) it8.next();
                                    Long l3 = bjo0Var.f2716a;
                                    long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                                    List list14 = bjo0Var.b;
                                    if (list14 != null) {
                                        arrayList5 = new ArrayList(r3d.q(list14, 10));
                                        Iterator it9 = list14.iterator();
                                        while (it9.hasNext()) {
                                            arrayList5.add(efx.T((s2u0) it9.next()));
                                        }
                                    } else {
                                        arrayList5 = iun.f15405a;
                                    }
                                    arrayList13.add(new vio0(jLongValue3, arrayList5));
                                    it7 = it7;
                                }
                                arrayList3.add(arrayList13);
                                i10 = 10;
                            }
                        } else {
                            arrayList3 = iun.f15405a;
                        }
                        if (r15 == 0 || (list3 = r15.b) == null) {
                            b = 10;
                            arrayList4 = iun.f15405a;
                        } else {
                            b = 10;
                            arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it10 = list3.iterator();
                            while (it10.hasNext()) {
                                arrayList4.add(efx.T((s2u0) it10.next()));
                            }
                        }
                        iko0Var = new iko0(list9, list2, arrayList3, arrayList4);
                    } else {
                        it = it4;
                        i = i6;
                        b = b6;
                        str = str3;
                        yjeVar = yjeVar2;
                        i2 = iIntValue;
                        iko0Var = iko0.e;
                    }
                    arrayList11.add(new hva(i5, str6, iko0Var));
                    it4 = it;
                    b6 = b;
                    yjeVar2 = yjeVar;
                    i5 = i;
                    str3 = str;
                    iIntValue = i2;
                }
                new xz90(iIntValue, iIntValue2, r17, r18, arrayList11);
                ArrayList arrayList14 = (ArrayList) sbx0Var.c;
                arrayList14.clear();
                arrayList14.addAll(arrayList11);
                ArrayList arrayList15 = (ArrayList) sbx0Var.d;
                arrayList15.clear();
                arrayList15.addAll(r17);
                ArrayList arrayList16 = (ArrayList) sbx0Var.e;
                arrayList16.clear();
                arrayList16.addAll(r18);
                return arrayList11;
            case 8:
                w5z w5zVar = (w5z) this.k;
                knf0 knf0Var2 = (knf0) w5zVar.b;
                bca0 bca0Var = (bca0) w5zVar.c;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    cca0 cca0Var = bca0Var.f2347a;
                    if (cca0Var != null) {
                        return cca0Var;
                    }
                    nv20 nv20Var = (nv20) w5zVar.f38604a;
                    int iB2 = knf0Var2.b();
                    knf0Var2.getClass();
                    String strA = ((kuy) w5zVar.e).a();
                    this.j = true;
                    objA3 = ((vba0) ((tpv) nv20Var.f24171a).invoke()).a((String) obj2, strA, 1, iB2, this);
                    if (objA3 == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                gca0 gca0Var = (gca0) ((dx5) objA3).a();
                List<aca0> list15 = gca0Var.f11050a;
                if (list15 != null) {
                    arrayList7 = new ArrayList(r3d.q(list15, 10));
                    for (aca0 aca0Var : list15) {
                        aca0Var.getClass();
                        Integer num3 = aca0Var.f618a;
                        int iIntValue4 = num3 != null ? num3.intValue() : 0;
                        Long l4 = aca0Var.b;
                        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                        String str10 = aca0Var.c;
                        String str11 = str10 == null ? "" : str10;
                        List list16 = aca0Var.d;
                        if (list16 != null) {
                            arrayList9 = new ArrayList(r3d.q(list16, 10));
                            Iterator it11 = list16.iterator();
                            while (it11.hasNext()) {
                                arrayList9.add(vdb.m0((ydb) it11.next()));
                            }
                        } else {
                            arrayList9 = 0;
                        }
                        if (arrayList9 == 0) {
                            arrayList9 = iun.f15405a;
                        }
                        ?? r22 = arrayList9;
                        String str12 = aca0Var.e;
                        arrayList7.add(new xba0(iIntValue4, jLongValue4, str11, str12 == null ? "" : str12, r22));
                    }
                } else {
                    arrayList7 = 0;
                }
                if (arrayList7 == 0) {
                    arrayList7 = iun.f15405a;
                }
                List list17 = gca0Var.b;
                if (list17 != null) {
                    arrayList8 = new ArrayList(r3d.q(list17, 10));
                    Iterator it12 = list17.iterator();
                    while (it12.hasNext()) {
                        arrayList8.add(dnm0.q((gip0) it12.next()));
                    }
                } else {
                    arrayList8 = 0;
                }
                if (arrayList8 == 0) {
                    arrayList8 = iun.f15405a;
                }
                List list18 = gca0Var.c;
                if (list18 != null) {
                    arrayList10 = new ArrayList(r3d.q(list18, 10));
                    Iterator it13 = list18.iterator();
                    while (it13.hasNext()) {
                        arrayList10.add(q0x.S((haa0) it13.next()));
                    }
                }
                if (arrayList10 == 0) {
                    arrayList10 = iun.f15405a;
                }
                cca0 cca0Var2 = new cca0(arrayList7, arrayList8, arrayList10);
                bca0Var.getClass();
                bca0Var.f2347a = cca0Var2;
                return cca0Var2;
            case 9:
                ota0 ota0Var = (ota0) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    n4u n4uVar = ota0Var.o;
                    this.j = true;
                    objK = ((kd30) n4uVar.b).K((ArrayList) obj2, this);
                    if (objK == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                List list19 = (List) objK;
                int i11 = ota0.t;
                p7m0 p7m0Var3 = ota0Var.i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                } while (!p7m0Var3.m(value, hua0.a((hua0) value, list19, false, 1)));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    xva0 xva0Var = (xva0) this.k;
                    dhs0 dhs0Var = (dhs0) obj2;
                    if (dhs0Var == null) {
                        dhs0Var = dhs0.f6106a;
                    }
                    this.j = true;
                    if (xva0Var.e(dhs0Var, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                zgb zgbVar = (zgb) obj2;
                r4b0 r4b0Var = (r4b0) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    h3c h3cVar = r4b0Var.q;
                    long j = zgbVar.b;
                    this.j = true;
                    objB = h3cVar.b(j, this);
                    if (objB == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                r4b0Var.c.d(new r91((Object) r4b0Var, (Object) zgbVar, ((Boolean) objB).booleanValue(), (byte) 26));
                return Unit.f46060a;
            case 12:
                vne vneVar = (vne) this.k;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                j5b0 j5b0Var = (j5b0) obj2;
                boolean z13 = this.j;
                pwi pwiVar = j5b0Var.g;
                n0o0 n0o0Var = j5b0Var.r;
                boolean z14 = ((sff0) n0o0Var.getValue()).J1;
                pwiVar.getClass();
                sac.T(new fnq(new ak9(new vsg0(new d0v(pwiVar, z13, true, z14, null)), b5), new g5b0(j5b0Var, yjeVar2, b3), b4), vneVar, new h5b0(j5b0Var, vneVar, yjeVar2, b8));
                pwi pwiVar2 = j5b0Var.g;
                boolean z15 = ((sff0) n0o0Var.getValue()).J1;
                pwiVar2.getClass();
                sac.T(new fnq(new ak9(new vsg0(new d0v(pwiVar2, z13, false, z15, null)), b5), new g5b0(j5b0Var, yjeVar2, b8), b4), vneVar, new h5b0(j5b0Var, vneVar, yjeVar2, b7));
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    this.j = true;
                    if (((g9b0) this.k).c.a((Throwable) obj2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                Throwable th = (Throwable) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    xcc xccVar = ((g9b0) obj2).c;
                    this.k = null;
                    this.j = true;
                    if (xccVar.a(th, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                kgb0 kgb0Var = (kgb0) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    lbu lbuVar = kgb0Var.Q;
                    this.j = true;
                    objK2 = lbu.k(lbuVar, 0, this, 3);
                    if (objK2 == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                List list20 = (List) objK2;
                if (!list20.isEmpty()) {
                    if (list20.isEmpty()) {
                        b7 = 1;
                    } else {
                        Iterator it14 = list20.iterator();
                        do {
                            if (!it14.hasNext()) {
                                b7 = 1;
                            }
                        } while (((pbv) it14.next()).p);
                    }
                }
                boolean zF = kgb0Var.K.f();
                if (b7 != 0 || zF) {
                    throw new sq60();
                }
                ((ssa0) obj2).invoke();
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    g7c0 g7c0Var = (g7c0) obj2;
                    p7m0 p7m0Var4 = g7c0Var.C;
                    u4a u4aVar = g7c0Var.j;
                    this.k = p7m0Var4;
                    this.j = true;
                    objA4 = u4aVar.a(this);
                    if (objA4 == wneVar17) {
                        return wneVar17;
                    }
                    p7m0Var = p7m0Var4;
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0Var = (p7m0) this.k;
                    z1x.P(obj);
                    objA4 = obj;
                }
                dg5 dg5Var = new dg5(((Boolean) objA4).booleanValue());
                p7m0Var.getClass();
                p7m0Var.o(null, dg5Var);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    g7c0 g7c0Var2 = (g7c0) obj2;
                    ol60 ol60Var2 = g7c0Var2.z;
                    f3c f3cVar = g7c0Var2.p;
                    this.k = ol60Var2;
                    this.j = true;
                    objA5 = f3cVar.a(this);
                    if (objA5 == wneVar18) {
                        return wneVar18;
                    }
                    ol60Var = ol60Var2;
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ol60Var = (ol60) this.k;
                    z1x.P(obj);
                    objA5 = obj;
                }
                List listC = kotlin.collections.a.c(y860.g0((m97) objA5));
                q4f q4fVar = q4f.c;
                ol60Var.f(new o6c0(new ngc0(listC, q4fVar, q4fVar.a())));
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z21 = this.j;
                if (z21) {
                    if (z21) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0VarA = ((tpx) this.k).a();
                xic0 xic0Var = new xic0((hjc0) obj2, b7);
                this.j = true;
                qoj0VarA.c(xic0Var, this);
                return wneVar19;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    this.j = true;
                    if (((hjc0) this.k).c.m((i16) obj2, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    this.j = true;
                    if (((gkc0) this.k).f.m((i16) obj2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z24 = this.j;
                if (z24) {
                    if (z24) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0VarA2 = ((tpx) this.k).a();
                jz6 jz6Var = new jz6((nkc0) obj2, (byte) 9);
                this.j = true;
                qoj0VarA2.c(jz6Var, this);
                return wneVar22;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z25 = this.j;
                if (z25) {
                    if (z25) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0VarA3 = ((tpx) this.k).a();
                jz6 jz6Var2 = new jz6((clc0) obj2, b6);
                this.j = true;
                qoj0VarA3.c(jz6Var2, this);
                return wneVar23;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    this.j = true;
                    if (((clc0) this.k).j.m((i16) obj2, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                qrc0 qrc0Var = (qrc0) this.k;
                boolean z27 = this.j;
                int i12 = qrc0.K;
                oeg0 oeg0Var = qrc0Var.z;
                boolean z28 = ((a570) obj2) instanceof z470;
                uf3 uf3Var = qrc0Var.A;
                if (z28) {
                    long j2 = ((zqc0) qrc0Var.D()).m;
                    short s = ((zqc0) qrc0Var.D()).o.f8344a;
                    double d = ((zqc0) qrc0Var.D()).n;
                    bek bekVar = dsr.f6625a;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    uf3Var.getClass();
                    oct octVar = uf3Var.f35560a;
                    uk10.Companion.getClass();
                    uk10 uk10VarA = tk10.a(s);
                    de8.Companion.getClass();
                    FragmentScreen fragmentScreenB = octVar.b(j2, d5c.a0(new rk10(uk10VarA, j2, ce8.a(1), 1L, Double.valueOf(d), 32)), z27, string);
                    i1w0 i1w0VarC = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    if (fragmentScreenB instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    long j3 = ((zqc0) qrc0Var.D()).m;
                    short s2 = ((zqc0) qrc0Var.D()).o.f8344a;
                    double d2 = ((zqc0) qrc0Var.D()).n;
                    bek bekVar2 = dsr.f6625a;
                    uf3Var.getClass();
                    oct octVar2 = uf3Var.f35560a;
                    uk10.Companion.getClass();
                    uk10 uk10VarA2 = tk10.a(s2);
                    de8.Companion.getClass();
                    FragmentScreen fragmentScreenA = octVar2.a(j3, d5c.a0(new rk10(uk10VarA2, j3, ce8.a(1), 1L, Double.valueOf(d2), 32)), "");
                    if (fragmentScreenA != null) {
                        i1w0 i1w0VarC2 = oeg0Var.c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                        if (fragmentScreenA instanceof DialogScreen) {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
                        } else {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0VarC2, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0VarC2.a((oe50) pawVar2.next());
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    kvc0 kvc0Var = (kvc0) obj2;
                    p7m0 p7m0Var5 = kvc0Var.E;
                    mrt mrtVar = kvc0Var.w;
                    this.k = p7m0Var5;
                    this.j = true;
                    objA6 = mrtVar.a(this);
                    if (objA6 == wneVar26) {
                        return wneVar26;
                    }
                    p7m0Var2 = p7m0Var5;
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0Var2 = (p7m0) this.k;
                    z1x.P(obj);
                    objA6 = obj;
                }
                p7m0Var2.n(objA6);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gxc0 gxc0Var = (gxc0) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    dxk dxkVar2 = dxk.FULL_DOC_RULES;
                    this.j = true;
                    objE2 = gxc0Var.r.e((File) obj2, dxkVar2, this);
                    if (objE2 == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE2 = obj;
                }
                vwc0 vwc0Var = new vwc0((File) objE2);
                int i13 = gxc0.M;
                gxc0Var.G(vwc0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ayc0 ayc0Var = (ayc0) this.k;
                wne wneVar28 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    dxk dxkVar3 = dxk.FULL_DOC_RULES;
                    this.j = true;
                    objE3 = ayc0Var.q.e((File) obj2, dxkVar3, this);
                    if (objE3 == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE3 = obj;
                }
                oxc0 oxc0Var = new oxc0((File) objE3);
                int i14 = ayc0.O;
                ayc0Var.G(oxc0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qyc0 qyc0Var = (qyc0) obj2;
                p7m0 p7m0Var6 = qyc0Var.z;
                wne wneVar29 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, dfe.f5996a);
                    sou souVar2 = qyc0Var.h;
                    epu epuVar = qyc0Var.d;
                    this.k = souVar2;
                    this.j = true;
                    objA7 = epuVar.a(this);
                    if (objA7 == wneVar29) {
                        return wneVar29;
                    }
                    souVar = souVar2;
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    souVar = (sou) this.k;
                    z1x.P(obj);
                    objA7 = obj;
                }
                afe afeVar = new afe(souVar.a(((Boolean) objA7).booleanValue(), qyc0Var.e.a()));
                p7m0Var6.getClass();
                p7m0Var6.o(null, afeVar);
                return Unit.f46060a;
            default:
                o1d0 o1d0Var = (o1d0) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    g2d0 g2d0Var = (g2d0) obj2;
                    this.k = null;
                    this.j = true;
                    e2d0 e2d0Var = e2d0.b;
                    p7m0 p7m0Var7 = g2d0Var.f;
                    if (o1d0Var == null) {
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, e2d0Var);
                        unit = Unit.f46060a;
                    } else if (o1d0Var instanceof n1d0) {
                        n1d0 n1d0Var = (n1d0) o1d0Var;
                        d2d0 d2d0Var = new d2d0(n1d0Var.b, n1d0Var.c);
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, d2d0Var);
                        unit = Unit.f46060a;
                    } else if (o1d0Var instanceof k1d0) {
                        if ((!(((k1d0) o1d0Var).f17518a instanceof UnknownHostException) || g2d0Var.b.c()) && !(p7m0Var7.getValue() instanceof d2d0)) {
                            p7m0Var7.o(null, e2d0Var);
                            unit = Unit.f46060a;
                        } else {
                            unit = Unit.f46060a;
                        }
                        Unit unit2 = unit;
                        if (unit != wneVar30) {
                            unit = unit2;
                        }
                    } else {
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, e2d0Var);
                        unit = Unit.f46060a;
                    }
                    if (unit == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o690(j5b0 j5b0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        this.l = j5b0Var;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o690(w46 w46Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = w46Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o690(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
