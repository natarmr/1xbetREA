package a;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
public final class shk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f32216a;
    public final cy40 b;

    public shk(Configuration configuration, boolean z, tkz tkzVar) {
        p7m0 p7m0VarA = q7m0.a(new ahk(configuration, new z6k(configuration.densityDpi / 160.0f, configuration.fontScale), null, new t9o0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), new sly(0.0f, 0.0f, false), z));
        this.f32216a = p7m0VarA;
        bwk bwkVarA = dwk.a((ahk) p7m0VarA.getValue());
        cy40 cy40Var = new cy40(bwkVarA);
        this.b = cy40Var;
        byte b = 4;
        vtb.h0(new fnq(i120.W(new h2c(p7m0VarA, b)), new d7e(2, cy40Var, cy40.class, "update", "update(Lorg/xplatform/uikit/compose/utils/display/model/display/DisplayState;)V", 4, (byte) 28), b), tkzVar, kpj0.f18679a, bwkVarA);
    }
}
