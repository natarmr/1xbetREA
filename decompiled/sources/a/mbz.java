package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.feed.linelive.presentation.feeds.child.liveexpress.models.LiveExpressItemsScreenParams;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.tabbar.DsTabBar;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mbz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21527a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mbz(Object obj, Object obj2, byte b) {
        this.f21527a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ufz ufzVar;
        String strA;
        pfx pfxVarI;
        int i;
        byte b = this.f21527a;
        String strA2 = "";
        Object obj = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                xk80 xk80Var = (xk80) obj2;
                jk80 jk80Var = (jk80) ((zbk) obj3).getValue();
                return new kk80(xk80Var, jk80Var, new androidx.compose.foundation.lazy.layout.c((IntRange) ((lbz) xk80Var.d.f).getValue(), jk80Var));
            case 1:
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new ldz((fzg0) obj3, lunVar, (bzg0) obj2);
            case 2:
                mez mezVar = (mez) obj2;
                xdz xdzVar = (xdz) ((zbk) obj3).getValue();
                return new ydz(mezVar, xdzVar, new androidx.compose.foundation.lazy.layout.c((IntRange) ((lbz) mezVar.c.h).getValue(), xdzVar));
            case 3:
                pg4 pg4Var = (pg4) obj3;
                n0o0 n0o0Var = pg4Var.s;
                ihz ihzVar = (ihz) obj2;
                xhz xhzVar = ihzVar.d;
                long j = ihzVar.b;
                lc00 lc00VarB = kotlin.collections.a.b();
                int iOrdinal = xhzVar.ordinal();
                if (iOrdinal == 0) {
                    if (!((Collection) ((fee) n0o0Var.getValue()).b()).isEmpty() && (ufzVar = (ufz) ((fee) pg4Var.r.getValue()).b()) != null) {
                        lc00VarB.add(ufzVar);
                    }
                    lc00VarB.addAll((Collection) ((fee) n0o0Var.getValue()).b());
                } else if (iOrdinal == 1) {
                    lc00VarB.addAll((Collection) ((fee) ((n0o0) pg4Var.v).getValue()).b());
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    if (j == 1) {
                        lc00VarB.addAll((Collection) ((fee) pg4Var.t.getValue()).b());
                    } else if (j == 46) {
                        lc00VarB.addAll((Collection) ((fee) pg4Var.u.getValue()).b());
                    }
                }
                return dyb.o0(kotlin.collections.a.a(lc00VarB));
            case 4:
                ((Function1) obj3).invoke(new yvz(((vwz) obj2).f38177a));
                return Unit.f46060a;
            case 5:
                ((Function1) obj3).invoke(new yvz(((dwz) obj2).f6822a));
                return Unit.f46060a;
            case 6:
                uxz uxzVar = (uxz) obj3;
                String str = uxzVar.b;
                String str2 = (String) ((vzg0) obj2).a("LIMIT_VALUE");
                if (str2 == null) {
                    str2 = uxzVar.c;
                }
                return new wxz(uxzVar.f36463a, str, str2, uxzVar.d, uxzVar.e, false);
            case 7:
                LimitNeGroupEnum limitNeGroupEnum = (LimitNeGroupEnum) obj3;
                ctf0 ctf0Var = (ctf0) obj2;
                int iOrdinal2 = limitNeGroupEnum.ordinal();
                if (iOrdinal2 == 0) {
                    strA = ctf0Var.b.a(R.string.bet_limit_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 == 1) {
                    strA = ctf0Var.b.a(R.string.deposit_limits_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 == 2) {
                    strA = ctf0Var.b.a(R.string.session_time_limit_title, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                        t9f.b();
                        return null;
                    }
                    strA = "";
                }
                int iOrdinal3 = limitNeGroupEnum.ordinal();
                if (iOrdinal3 == 0) {
                    strA2 = ctf0Var.b.a(R.string.bet2_limit_confirm_request_description, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal3 == 1) {
                    strA2 = ctf0Var.b.a(R.string.deposit2_limit_confirm_request_description, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal3 == 2) {
                    strA2 = ctf0Var.b.a(R.string.session_time_limit_confirm_request_description, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal3 != 3 && iOrdinal3 != 4) {
                    t9f.b();
                    return null;
                }
                return new u000(strA, strA2);
            case 8:
                ((Function1) obj3).invoke(new t300(((p400) obj2).f26326a));
                return Unit.f46060a;
            case 9:
                ((Function1) obj3).invoke((nea0) obj2);
                return Unit.f46060a;
            case 10:
                Function1 function1 = (Function1) obj2;
                int i2 = ((gh00) obj3).b.c;
                if (i2 == 1) {
                    function1.invoke(m420.f21146a);
                } else if (i2 == 0) {
                    function1.invoke(w420.f38525a);
                } else if (i2 == 2) {
                    function1.invoke(b420.f1937a);
                }
                return Unit.f46060a;
            case 11:
                vzg0 vzg0Var = (vzg0) obj2;
                String str3 = ((LiveExpressItemsScreenParams) obj3).c;
                iun iunVar = iun.f15405a;
                ais aisVar = ais.f939a;
                String str4 = (String) vzg0Var.a("QUERY_STATE_KEY");
                String str5 = str4 == null ? "" : str4;
                Set set = (Set) vzg0Var.a("COLLAPSED_ITEMS_STATE_KEY");
                if (set == null) {
                    set = xun.f41520a;
                }
                return new nj00(str3, null, iunVar, aisVar, set, false, true, str5, false);
            case 12:
                ((bq00) obj3).O((g8d) obj2, null);
                return Unit.f46060a;
            case 13:
                int i3 = LoadableShapeableImageView.B;
                r0x r0xVar = new r0x((LoadableShapeableImageView) obj3);
                r0xVar.e((AttributeSet) obj2, 0);
                return r0xVar;
            case 14:
                dy00 dy00Var = (dy00) obj2;
                dy00Var.getClass();
                ((Function1) obj3).invoke(new gbj0(dy00Var));
                return Unit.f46060a;
            case 15:
                LottieView lottieView = (LottieView) obj3;
                View decorView = LottieView.A((Context) obj2).getDecorView();
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(decorView);
                int i4 = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
                View rootView = lottieView.getRootView();
                rootView.getClass();
                Iterator it = new ihu0((ViewGroup) rootView).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    View view = (View) next;
                    view.getClass();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
                    if (jhu0Var == null || !jhu0Var.hasNext()) {
                        while (!it.hasNext() && !arrayList.isEmpty()) {
                            it = (Iterator) CollectionsKt.d0(arrayList);
                            w3d.z(arrayList);
                        }
                    } else {
                        arrayList.add(it);
                        it = jhu0Var;
                    }
                    View view2 = (View) next;
                    if ((view2 instanceof DsTabBar) && view2.getVisibility() == 0) {
                        obj = next;
                        View view3 = (View) obj;
                        return Integer.valueOf(i4 + (view3 != null ? view3.getHeight() : 0));
                    }
                }
                View view4 = (View) obj;
                return Integer.valueOf(i4 + (view4 != null ? view4.getHeight() : 0));
            case 16:
                ((Function1) obj3).invoke(new jl10(((co10) obj2).f4680a));
                return Unit.f46060a;
            case 17:
                ((Function1) obj3).invoke(((vgl0) ((wgl0) obj2)).f37387a);
                return Unit.f46060a;
            case 18:
                ((Function1) obj3).invoke((xgl0) obj2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) obj3).invoke(((c530) obj2).d);
                return Unit.f46060a;
            case 20:
                ((Function1) obj3).invoke(new jn6(((ry20) obj2).b));
                return Unit.f46060a;
            case 21:
                return MatchInfoContainerView.L((MatchInfoContainerView) obj3, (mbz) obj2);
            case 22:
                return MatchInfoContainerView.C((MatchInfoContainerView) obj3, (ArrayList) obj2);
            case 23:
                Function0 function0 = (Function0) obj3;
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) obj2;
                int i5 = MatchInfoContainerView.t1;
                if (function0 != null) {
                    function0.invoke();
                }
                if (matchInfoContainerView.q1) {
                    matchInfoContainerView.q1 = false;
                    matchInfoContainerView.K();
                }
                return Unit.f46060a;
            case 24:
                vo30 vo30Var = (vo30) obj3;
                Function1 function2 = (Function1) obj2;
                if (!((to30) vo30Var).d) {
                    function2.invoke(vo30Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                iiy[] iiyVarArr = sr30.P1;
                ns30 ns30VarH0 = ((sr30) obj3).H0();
                gs30 gs30Var = (gs30) ((is30) obj2);
                int i6 = gs30Var.e;
                List list = gs30Var.c;
                List list2 = gs30Var.d;
                ht30 ht30Var = gs30Var.f;
                list.getClass();
                list2.getClass();
                switch (ht30Var.ordinal()) {
                    case 0:
                        i = R.string.football;
                        break;
                    case 1:
                        i = R.string.hockey;
                        break;
                    case 2:
                        i = R.string.basketball;
                        break;
                    case 3:
                        i = R.string.tennis;
                        break;
                    case 4:
                        i = R.string.box;
                        break;
                    case 5:
                        i = R.string.rugby;
                        break;
                    case 6:
                        i = R.string.american_footbol;
                        break;
                    case 7:
                        i = R.string.volleyball;
                        break;
                    case 8:
                        i = R.string.mix;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                ns30VarH0.z(new es30(i6, i, list, list2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                MemoryGameView memoryGameView = (MemoryGameView) obj3;
                int i7 = MemoryGameView.e;
                memoryGameView.postDelayed(new llo(memoryGameView, (mbz) obj2, (byte) 25), 300L);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((gt30) obj3).removeView((View) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj3).invoke((wy30) obj2);
                return Unit.f46060a;
            default:
                ((Function1) obj3).invoke(((ly30) obj2).d);
                return Unit.f46060a;
        }
    }
}
