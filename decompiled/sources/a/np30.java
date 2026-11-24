package a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.flexbox.FlexboxLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.ui_core.viewcomponents.views.MultiLineChipsListView;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class np30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23894a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np30(Object obj, byte b) {
        this.f23894a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f23894a;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        boolean z5 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                return kcx.C(((op30) obj).b);
            case 1:
                return d5c.a(kotlin.coroutines.e.c(qem0.e(), ((ir30) obj).f15237a));
            case 2:
                iiy[] iiyVarArr = sr30.P1;
                fiu0 fiu0Var = ((sr30) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("memoryViewModelFactory");
                throw null;
            case 3:
                ((MemoryGameView) obj).d = true;
                return Unit.f46060a;
            case 4:
                return (gr30) ((gii0) ((zn00) obj).f44650a).b(sre0.f32672a.b(gr30.class));
            case 5:
                aa40 aa40Var = (aa40) obj;
                StringBuilder sb = new StringBuilder();
                lvu0 lvu0Var = aa40Var.f507a;
                sb.append(lvu0Var.b);
                lvu0Var.getClass();
                if (!TextUtils.isEmpty("")) {
                    sb.insert(sb.length() - 1, ':');
                    sb.insert(sb.length() - 1, "");
                    sb.append("supp/external");
                }
                String string = sb.toString();
                jw20 jw20Var = aa40Var.i;
                OkHttpClient okHttpClient = aa40Var.b;
                kwf0 kwf0Var = lvu0Var.f20731a;
                return new guc(jw20Var, okHttpClient, string, kwf0Var.f19000a, kwf0Var.b, lvu0Var.b);
            case 6:
                wf40 wf40Var = (wf40) obj;
                wf40Var.k.clearFocus();
                wf40Var.k.c();
                return Unit.f46060a;
            case 7:
                tli tliVar = ((ai40) obj).L1;
                if (tliVar != null) {
                    return new q0h0(tliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                ((ql40) obj).i.o(null, i8d.c);
                return Unit.f46060a;
            case 9:
                ((wl40) obj).e.invoke();
                return Unit.f46060a;
            case 10:
                qm40 qm40Var = (qm40) obj;
                qm40Var.f = false;
                HashSet hashSet = new HashSet();
                vy40 vy40Var = qm40Var.d;
                if (vy40Var != null) {
                    Object[] objArr = vy40Var.f38232a;
                    int i = vy40Var.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        e7z e7zVar = (e7z) objArr[i2];
                        vy40 vy40Var2 = qm40Var.e;
                        if (vy40Var2 == null) {
                            vy40Var2 = new vy40();
                            qm40Var.e = vy40Var2;
                        }
                        i5d0 i5d0Var = (i5d0) vy40Var2.g(i2);
                        lm40 lm40Var = (lm40) e7zVar.h1.g;
                        if (lm40Var.n) {
                            qm40.b(lm40Var, i5d0Var);
                        }
                    }
                    vy40Var.d();
                    vy40 vy40Var3 = qm40Var.e;
                    if (vy40Var3 != null) {
                        vy40Var3.d();
                    }
                }
                vy40 vy40Var4 = qm40Var.b;
                if (vy40Var4 != null) {
                    Object[] objArr2 = vy40Var4.f38232a;
                    int i3 = vy40Var4.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        df5 df5Var = (df5) objArr2[i4];
                        vy40 vy40Var5 = qm40Var.c;
                        if (vy40Var5 == null) {
                            vy40Var5 = new vy40();
                            qm40Var.c = vy40Var5;
                        }
                        i5d0 i5d0Var2 = (i5d0) vy40Var5.g(i4);
                        if (df5Var.n) {
                            qm40.b(df5Var, i5d0Var2);
                        }
                    }
                    vy40Var4.d();
                    vy40 vy40Var6 = qm40Var.c;
                    if (vy40Var6 != null) {
                        vy40Var6.d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((df5) it.next()).b1();
                }
                return Unit.f46060a;
            case 11:
                wsz wszVar = en40.N1;
                fiu0 fiu0Var2 = ((en40) obj).L1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                ((gn40) ((e1u) obj).b).getClass();
                List<ojt> list = njt.f23652a;
                ArrayList<cn40> arrayList = new ArrayList(r3d.q(list, 10));
                for (ojt ojtVar : list) {
                    arrayList.add(new cn40(ojtVar.f25376a, ojtVar.b, ojtVar.c));
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (cn40 cn40Var : arrayList) {
                    arrayList2.add(new fn40(cn40Var.f4636a, cn40Var.b, cn40Var.c));
                }
                return new hn40(arrayList2);
            case 13:
                ip40 ip40Var = (ip40) obj;
                p7m0 p7m0Var = ip40Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ip40Var.f.getClass();
                } while (!p7m0Var.m(value, gp40.a((gp40) value, null, false, null, 0, 0, 0L, false, 507)));
                return Unit.f46060a;
            case 14:
                MultiLineChipsListView multiLineChipsListView = (MultiLineChipsListView) obj;
                int i5 = MultiLineChipsListView.x;
                Context context = multiLineChipsListView.getContext();
                context.getClass();
                DsHeader dsHeader = new DsHeader(context, null, 6);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, multiLineChipsListView.v, 0, 0);
                dsHeader.setLayoutParams(layoutParams);
                dsHeader.setTag("ds_header_multi_line_tag");
                dsHeader.setType(vrv.b);
                CharSequence text = dsHeader.getContext().getText(R.string.popular_search);
                text.getClass();
                dsHeader.setModel(new nrv(text, false, null, null, null, null, null, 254));
                return dsHeader;
            case 15:
                ((nwk) obj).a();
                return Unit.f46060a;
            case 16:
                wh80 wh80Var = (wh80) CollectionsKt.firstOrNull(((akq) ((zz2) ((jx40) obj).b.f11760a).b).b());
                if (wh80Var == null || !(wh80Var instanceof rh80)) {
                    return null;
                }
                rh80 rh80Var = (rh80) wh80Var;
                if (rh80Var.f30479a == gp00.f11660a) {
                    return rh80Var;
                }
                return null;
            case 17:
                fiu0 fiu0Var3 = ((fj50) obj).f2;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                return ((yj50) obj).d;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ek50) obj).Z0();
            case 20:
                return (bbe0) ((gbe0) obj).f11014a.e.getValue();
            case 21:
                return (sn50) ((gii0) ((zpu) obj).b).b(sre0.f32672a.b(sn50.class));
            case 22:
                atz atzVar = in50.R1;
                fiu0 fiu0Var4 = ((in50) obj).P1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                ip50 ip50Var = (ip50) obj;
                if (!ip50Var.p && ip50Var.x.a().O0) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 24:
                xp50 xp50Var = (xp50) obj;
                if (!xp50Var.p && xp50Var.x.a().O0) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((sq50) obj).r.a().O0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qr50 qr50Var = (qr50) obj;
                if (!qr50Var.p && qr50Var.w.a().O0) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gt50 gt50Var = (gt50) obj;
                if (!gt50Var.p && gt50Var.x.a().O0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ut50 ut50Var = (ut50) obj;
                if (!ut50Var.c && ut50Var.k.a().O0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                htz htzVar = du50.P1;
                fiu0 fiu0Var5 = ((du50) obj).M1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
