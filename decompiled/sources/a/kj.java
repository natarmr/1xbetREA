package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kj implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18361a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ wj c;

    public /* synthetic */ kj(kmq kmqVar, wj wjVar, byte b) {
        this.f18361a = b;
        this.b = kmqVar;
        this.c = wjVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        jj jjVar;
        tj tjVar;
        byte b = this.f18361a;
        wj wjVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof jj) {
                    jjVar = (jj) yjeVar;
                    int i = jjVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jjVar.j = i - Integer.MIN_VALUE;
                    } else {
                        jjVar = new jj(this, yjeVar);
                    }
                } else {
                    jjVar = new jj(this, yjeVar);
                }
                Object obj2 = jjVar.i;
                wne wneVar = wne.f39444a;
                int i2 = jjVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    yi yiVar = (yi) obj;
                    boolean z = wjVar.v;
                    ctf0 ctf0Var = wjVar.o;
                    yiVar.getClass();
                    ctf0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (yiVar.f42661a) {
                        arrayList.add(new mk(ctf0Var.b.a(R.string.statistic, Arrays.copyOf(new Object[0], 0))));
                    }
                    int i3 = yiVar.o ? R.drawable.ic_glyph_select_all_active : R.drawable.ic_glyph_select_all_inactive;
                    lsm0 lsm0Var = ctf0Var.b;
                    arrayList.add(new bk(i3, lsm0Var.a(R.string.information_block_settings, Arrays.copyOf(new Object[0], 0))));
                    if (yiVar.b) {
                        arrayList.add(new lk(yiVar.c ? R.drawable.ic_action_filter_applied : R.drawable.ic_setting_gray, lsm0Var.a(R.string.markets_settings, Arrays.copyOf(new Object[0], 0))));
                    }
                    arrayList.add(new fk(lsm0Var.a(R.string.change_markets_view, Arrays.copyOf(new Object[0], 0))));
                    if (yiVar.d) {
                        px7 px7Var = yiVar.m;
                        boolean zD = Intrinsics.d(px7Var, kx7.f19038a);
                        int i4 = R.drawable.ic_action_collapse;
                        if (zD) {
                            boolean z2 = yiVar.f;
                            if (z2) {
                                i4 = R.drawable.ic_action_expand;
                            }
                            arrayList.add(new ck(i4, z2 ? lsm0Var.a(R.string.expand_all_sub_games, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.collapse_all_sub_games, Arrays.copyOf(new Object[0], 0))));
                        } else if (Intrinsics.d(px7Var, ox7.f25998a) || Intrinsics.d(px7Var, mx7.f22539a)) {
                            boolean z3 = yiVar.e;
                            if (z3) {
                                i4 = R.drawable.ic_action_expand;
                            }
                            arrayList.add(new ck(i4, z3 ? lsm0Var.a(R.string.expand_all_markets, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.collapse_all_markets, Arrays.copyOf(new Object[0], 0))));
                        }
                    }
                    if (yiVar.g && !z) {
                        boolean z4 = yiVar.h;
                        arrayList.add(new dk(z4 ? R.drawable.ic_star_liked_new : R.drawable.ic_star_unliked_new, lsm0Var.a(z4 ? R.string.favorites_remove : R.string.favorites_add, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (yiVar.i && !z) {
                        arrayList.add(new kk(yiVar.j ? R.drawable.ic_notification_on : R.drawable.ic_notification_none_white, lsm0Var.a(R.string.subscriptions, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (yiVar.k) {
                        arrayList.add(new ek(lsm0Var.a(R.string.markets_move, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (yiVar.l) {
                        arrayList.add(new jk(lsm0Var.a(R.string.players_duel_title, Arrays.copyOf(new Object[0], 0))));
                    }
                    if (yiVar.n) {
                        arrayList.add(new ak(lsm0Var.a(R.string.bets_on_players_title, Arrays.copyOf(new Object[0], 0))));
                    }
                    jjVar.j = 1;
                    if (kmqVar.a(arrayList, jjVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof tj) {
                    tjVar = (tj) yjeVar;
                    int i5 = tjVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        tjVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        tjVar = new tj(this, yjeVar);
                    }
                } else {
                    tjVar = new tj(this, yjeVar);
                }
                Object obj3 = tjVar.i;
                wne wneVar2 = wne.f39444a;
                int i6 = tjVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((List) obj).contains(new Long(wjVar.b.d)));
                    tjVar.j = 1;
                    if (kmqVar.a(boolValueOf, tjVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
