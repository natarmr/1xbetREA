package a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class sek implements vde0, o3n, tyn, huo, qkn0, eer, d3h0 {
    public sek() {
        bm5 bm5Var = bm5.f2822a;
    }

    public static void p(Rect rect, View view) {
        rect.getClass();
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            rect.set(0, 0, 0, 0);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public static j6i0 r(j6i0 j6i0Var) {
        j6i0Var.getClass();
        Map map = j6i0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!list.isEmpty() && list.size() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new j6i0(linkedHashMap, j6i0Var.f15989a);
    }

    @Override // a.d3h0
    public String a() {
        return "0";
    }

    @Override // a.d3h0
    public String b() {
        return "0";
    }

    @Override // a.tyn
    public Object c(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // a.o3n
    public float e() {
        zcl zclVar = qmk.f28987a;
        return 12.0f;
    }

    @Override // a.huo
    public void f(fvh0 fvh0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // a.o3n
    public float g() {
        zcl zclVar = qmk.f28987a;
        return 4.0f;
    }

    @Override // a.vde0, a.b3u0
    public wsy getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // a.o3n
    public float h() {
        zcl zclVar = qmk.f28987a;
        return 56.0f;
    }

    @Override // a.d3h0
    public boolean i() {
        return false;
    }

    @Override // a.d3h0
    public boolean j() {
        return false;
    }

    @Override // a.o3n
    public int k() {
        return 5;
    }

    @Override // a.qkn0
    public rkn0 l(m9c m9cVar) {
        return new b8r((Context) m9cVar.c, (String) m9cVar.d, (y78) m9cVar.e, m9cVar.f21402a, m9cVar.b);
    }

    public wws m(GameBroadcastingParams gameBroadcastingParams, GameVideoUiConfig gameVideoUiConfig) {
        wws.S1.getClass();
        wws wwsVar = new wws();
        iiy[] iiyVarArr = wws.U1;
        wwsVar.P1.J(wwsVar, iiyVarArr[1], gameBroadcastingParams);
        wwsVar.Q1.J(wwsVar, iiyVarArr[2], gameVideoUiConfig);
        return wwsVar;
    }

    @Override // a.huo
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // a.huo
    public ncs0 q(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ sek(boolean z) {
    }

    @Override // a.eer
    /* JADX INFO: renamed from: apply */
    public Object mo11apply(Object obj) {
        return obj;
    }
}
