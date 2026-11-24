package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cashback.impl.navigation.CashbackScreenFactoryImpl$getCashbackScreen$1;
import org.xplatform.coinplay_sport_cashback_impl.navigation.CoinplaySportCashbackScreenFactoryImpl$getScreen$1;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelTitle;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCheckScreen$1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;
import org.xplatform.promo.impl.settings.presentation.components.PromoAdditionalCardCollection;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wyb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39967a;

    public /* synthetic */ wyb0(byte b) {
        this.f39967a = b;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x03a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ydc0 ydc0Var;
        byte b = 12;
        z = false;
        boolean z = false;
        switch (this.f39967a) {
            case 0:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 1:
                fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
                obj.getClass();
                if ((obj instanceof ProfileEditUiModel) && ((ProfileEditUiModel) obj).getG()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                fl70 fl70Var2 = org.xplatform.personal.impl.presentation.edit.a.X1;
                obj.getClass();
                return Boolean.valueOf((obj instanceof ProfileEditUiModelItem) || (obj instanceof ProfileEditUiModelItemClickable));
            case 3:
                fl70 fl70Var3 = org.xplatform.personal.impl.presentation.edit.a.X1;
                return Boolean.valueOf(obj instanceof ProfileEditUiModelTitle);
            case 4:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ui80(cpVar, b));
                return Unit.f46060a;
            case 5:
                imy imyVar = (imy) obj;
                imyVar.f15048a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                imyVar.a(300, fValueOf).b = bu40.f3214a;
                imyVar.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                imyVar.a(1800, fValueOf2);
                imyVar.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                imyVar.a(3300, fValueOf3);
                imyVar.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                imyVar.a(4800, fValueOf4);
                imyVar.a(6000, fValueOf4);
                return Unit.f46060a;
            case 6:
                yai0.d((abi0) obj, g3c0.c);
                return Unit.f46060a;
            case 7:
                obj.getClass();
                return (Set) obj;
            case 8:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                k2k k2kVar = (k2k) cpVar2.u;
                CardView cardView = k2kVar.f17577a;
                cardView.getClass();
                x0x.s(cardView);
                PromoAdditionalCardCollection promoAdditionalCardCollection = k2kVar.b;
                ArrayList arrayList2 = new ArrayList();
                int iM = CollectionsKt.M(l1e0.o(0, promoAdditionalCardCollection.s2));
                for (int i2 = 0; i2 < iM; i2++) {
                    arrayList2.add(bqj0.f3034a);
                }
                yge0 adapter = promoAdditionalCardCollection.getAdapter();
                adapter.getClass();
                ((j4c0) adapter).G(arrayList2);
                return Unit.f46060a;
            case 9:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                x0x.s(((m2k) cpVar3.u).f21064a);
                return Unit.f46060a;
            case 10:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                LinearLayout linearLayout = ((q2k) cpVar4.u).f28002a;
                linearLayout.getClass();
                x0x.s(linearLayout);
                cpVar4.t(new ctv(cpVar4, cpVar4, b));
                return Unit.f46060a;
            case 11:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                x0x.s(((y2k) cpVar5.u).f41908a);
                return Unit.f46060a;
            case 12:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                LinearLayout linearLayout2 = ((s2k) cpVar6.u).f31504a;
                linearLayout2.getClass();
                x0x.s(linearLayout2);
                cpVar6.t(new ctv(cpVar6, cpVar6, (byte) 16));
                return Unit.f46060a;
            case 13:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 14:
                cp cpVar7 = (cp) obj;
                cpVar7.getClass();
                x0x.s(((u2k) cpVar7.u).f34950a);
                return Unit.f46060a;
            case 15:
                cp cpVar8 = (cp) obj;
                cpVar8.getClass();
                LinearLayout linearLayout3 = ((w2k) cpVar8.u).f38452a;
                linearLayout3.getClass();
                x0x.s(linearLayout3);
                return Unit.f46060a;
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 17:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new PromoScreenFactoryImpl$getPromoCodesScreen$1()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(new PromoScreenFactoryImpl$getPromoCheckScreen$1()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar3 = (c8d) k0w0Var3.h(new CashbackScreenFactoryImpl$getCashbackScreen$1()).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 20:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar4 = (c8d) k0w0Var4.h(new CoinplaySportCashbackScreenFactoryImpl$getScreen$1()).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                return Unit.f46060a;
            case 21:
                bec0 bec0Var = (bec0) obj;
                bec0Var.getClass();
                a4x a4xVar = bec0Var.f2443a;
                boolean z2 = bec0Var.d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : a4xVar) {
                    ydc0 ydc0Var2 = ((aec0) obj2).d;
                    ydc0 ydc0Var3 = ydc0.ALL;
                    if (ydc0Var2 != ydc0Var3 && (ydc0Var2 == (ydc0Var = bec0Var.b) || ydc0Var == ydc0Var3)) {
                        arrayList3.add(obj2);
                    }
                }
                a4x a4xVarO0 = dyb.o0(arrayList3);
                Object[] objArr = bec0Var.e || !(bec0Var.o || z2);
                kdc0 kdc0Var = bec0Var.p;
                ldc0 ldc0Var = kdc0Var.f18099a ? new ldc0(true, new se(kdc0Var.e, new oe(String.valueOf(kdc0Var.c), kdc0Var.f), kdc0Var.b ? new le(new ue9(kdc0Var.g), lul.e, kdc0Var.d) : null)) : new ldc0(false, null);
                if (z2) {
                    return mec0.f21638a;
                }
                if (objArr == true) {
                    return new lec0(bec0Var.i);
                }
                a4x a4xVar2 = bec0Var.c;
                boolean z3 = bec0Var.f;
                mdm mdmVar = bec0Var.j;
                List list = bec0Var.l;
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList4.add(s0x.e0((vrc0) it.next()));
                }
                return new kec0(a4xVar2, z3, a4xVarO0, mdmVar, dyb.o0(arrayList4), bec0Var.m, bec0Var.n, ldc0Var);
            case 22:
                kgc0 kgc0Var = (kgc0) obj;
                kgc0Var.getClass();
                return new wgc0(kgc0Var.f18232a, kgc0Var.b, kgc0Var.c, kgc0Var.d, kgc0Var.e, kgc0Var.f, kgc0Var.g, kgc0Var.h);
            case 23:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                iiy[] iiyVarArr = kjc0.P1;
                List listP = ((Fragment) obj).C().c.p();
                listP.getClass();
                return new sx3(listP, (byte) 1);
            default:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ wyb0(tac0 tac0Var, byte b) {
        this.f39967a = b;
    }
}
