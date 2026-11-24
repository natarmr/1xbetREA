package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public final class t2e {
    public static final /* synthetic */ iiy[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33210a;
    public final bh9 b;
    public final xr d;
    public final xr e;
    public final yzn0 f;
    public final xr g;
    public final xr h;
    public final yzn0 i;
    public final u2e c = new u2e("parent");
    public final s2e j = new s2e(this, new wmk(null, "wrap"));
    public final s2e k = new s2e(this, new wmk(null, "wrap"));
    public final s2e l = new s2e(this);

    static {
        ez40 ez40Var = new ez40(t2e.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        tre0 tre0Var = sre0.f32672a;
        m = new iiy[]{tre0Var.e(ez40Var), tre0Var.e(new ez40(t2e.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), tre0Var.e(new ez40(t2e.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), tre0Var.e(new ez40(t2e.class, "scaleX", "getScaleX()F", 0)), tre0Var.e(new ez40(t2e.class, "scaleY", "getScaleY()F", 0)), tre0Var.e(new ez40(t2e.class, "rotationX", "getRotationX()F", 0)), tre0Var.e(new ez40(t2e.class, "rotationY", "getRotationY()F", 0)), tre0Var.e(new ez40(t2e.class, "rotationZ", "getRotationZ()F", 0)), tre0Var.e(new ez40(t2e.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), tre0Var.e(new ez40(t2e.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), tre0Var.e(new ez40(t2e.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), tre0Var.e(new ez40(t2e.class, "pivotX", "getPivotX()F", 0)), tre0Var.e(new ez40(t2e.class, "pivotY", "getPivotY()F", 0)), tre0Var.e(new ez40(t2e.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), tre0Var.e(new ez40(t2e.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    }

    public t2e(Object obj, bh9 bh9Var) {
        this.f33210a = obj;
        this.b = bh9Var;
        this.d = new xr(bh9Var, -2);
        this.e = new xr(bh9Var, 0);
        this.f = new yzn0(bh9Var, 0);
        this.g = new xr(bh9Var, -1);
        this.h = new xr(bh9Var, 1);
        this.i = new yzn0(bh9Var, 1);
    }

    public static void a(t2e t2eVar, u2e u2eVar) {
        b3e b3eVar = u2eVar.e;
        b3e b3eVar2 = u2eVar.h;
        t2eVar.f.o(b3eVar, 0.0f);
        t2eVar.i.o(b3eVar2, 0.0f);
        t2eVar.b.F("vBias", new zg9(0.5f));
    }

    public final void b(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.b.F("alpha", new zg9(f));
    }

    public final void c(wmk wmkVar) {
        this.k.h(m[1], wmkVar);
    }

    public final void d(ouu0 ouu0Var) {
        this.l.h(m[2], ouu0Var);
    }

    public final void e(wmk wmkVar) {
        this.j.h(m[0], wmkVar);
    }
}
