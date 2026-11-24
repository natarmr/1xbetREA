package a;

import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/rxo0;", "La/nw5;", "La/ojk;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rxo0 extends nw5<ojk> {
    public final nae0 e2 = ltt0.p(this, qxo0.f29495a);
    public final phf0 f2 = new phf0("EXTRA_REQUEST_KEY");
    public final zz2 g2 = new zz2("EXTRA_CURRENT_TEAM");
    public final zz2 h2 = new zz2("EXTRA_GAME_ID");
    public final zz2 i2 = new zz2("EXTRA_PLAYER_ID");
    public static final /* synthetic */ iiy[] k2 = {new j0d0(rxo0.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/DialogTeamActionBinding;", 0), new ez40(rxo0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(rxo0.class, "currentTeam", "getCurrentTeam()I", 0), new ez40(rxo0.class, "gameId", "getGameId()I", 0), new ez40(rxo0.class, "playerId", "getPlayerId()I", 0)};
    public static final y2m0 j2 = new y2m0((byte) 13);

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.e2.n(k2[0], this);
        objN.getClass();
        return (ojk) objN;
    }

    @Override // a.nw5
    public final void O0() {
        iiy[] iiyVarArr = k2;
        Object objN = this.e2.n(iiyVarArr[0], this);
        objN.getClass();
        ojk ojkVar = (ojk) objN;
        int iIntValue = this.g2.n(this, iiyVarArr[2]).intValue();
        m6m0 m6m0Var = bop0.b;
        int i = iIntValue != 1 ? 1 : 2;
        ojkVar.e.setText(I(R.string.move_to_team_new_v2, Integer.valueOf(i)));
        dyb.O(ojkVar.c, new z08((Object) this, i, (byte) 21));
        dyb.O(ojkVar.b, new ttn0(this, (byte) 15));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.select_action);
        string.getClass();
        return string;
    }

    public final void T0(int i) {
        iiy[] iiyVarArr = k2;
        vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_ACTION_LISTENER_KEY", new ojp0(this.h2.n(this, iiyVarArr[3]).intValue(), this.i2.n(this, iiyVarArr[4]).intValue(), i))), this, this.f2.n(this, iiyVarArr[1]));
        x0();
    }
}
