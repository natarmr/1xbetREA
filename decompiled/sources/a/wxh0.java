package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wxh0 f39931a;
    public static final wxh0 b;
    public static final wxh0 c;
    public static final wxh0 d;
    public static final wxh0 e;
    public static final wxh0 f;
    public static final wxh0 g;
    public static final /* synthetic */ wxh0[] h;

    static {
        wxh0 wxh0Var = new wxh0("WAIT_FIRST_CARD", 0);
        f39931a = wxh0Var;
        wxh0 wxh0Var2 = new wxh0("WAIT_SECOND_CARD", 1);
        b = wxh0Var2;
        wxh0 wxh0Var3 = new wxh0("WAIT_THIRD_CARD", 2);
        c = wxh0Var3;
        wxh0 wxh0Var4 = new wxh0("PLAYER_ONE_WINS", 3);
        d = wxh0Var4;
        wxh0 wxh0Var5 = new wxh0("PLAYER_TWO_WINS", 4);
        e = wxh0Var5;
        wxh0 wxh0Var6 = new wxh0("DRAW", 5);
        f = wxh0Var6;
        wxh0 wxh0Var7 = new wxh0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        g = wxh0Var7;
        h = new wxh0[]{wxh0Var, wxh0Var2, wxh0Var3, wxh0Var4, wxh0Var5, wxh0Var6, wxh0Var7};
    }

    public static wxh0 valueOf(String str) {
        return (wxh0) Enum.valueOf(wxh0.class, str);
    }

    public static wxh0[] values() {
        return (wxh0[]) h.clone();
    }
}
