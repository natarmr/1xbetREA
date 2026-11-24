.class public final La/co00;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/co00;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final R1:La/xuz;

.field public static final synthetic S1:[La/iiy;

.field public static final U1:Ljava/lang/String;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/k8i;

.field public N1:La/wdk0;

.field public O1:La/zav;

.field public final P1:La/a8z;

.field public Q1:La/ndk0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/co00;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/co00;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/co00;->R1:La/xuz;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/co00;->U1:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/co00;->K1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/bo00;->a:La/bo00;

    .line 20
    .line 21
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/co00;->L1:La/s0r;

    .line 26
    .line 27
    const-class v0, La/bq00;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/ao00;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, La/ao00;-><init>(La/co00;B)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xe

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/co00;->P1:La/a8z;

    .line 49
    .line 50
    new-instance v0, La/xn;

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/rg3;

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    invoke-direct {v1, v2}, La/rg3;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 63
    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/fg3;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/fg3;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/fg3;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/co00;->U1:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, v0, v1}, La/fg3;->a(La/i1w0;Ljava/lang/String;)La/l8i;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, v0, La/l8i;->l1:La/n5d0;

    .line 66
    .line 67
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/k8i;

    .line 72
    .line 73
    iput-object v1, p0, La/co00;->M1:La/k8i;

    .line 74
    .line 75
    iget-object v1, v0, La/l8i;->L0:La/wdk0;

    .line 76
    .line 77
    iput-object v1, p0, La/co00;->N1:La/wdk0;

    .line 78
    .line 79
    iget-object v0, v0, La/l8i;->X:La/ok50;

    .line 80
    .line 81
    iget-object v0, v0, La/ok50;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/vqc;

    .line 84
    .line 85
    invoke-virtual {v0}, La/vqc;->f()La/zav;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/co00;->O1:La/zav;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 96
    .line 97
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/co00;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, La/mk00;->a:La/mk00;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-static {p0, p1}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/kk00;->a:La/kk00;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/jk00;->a:La/jk00;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/qk00;->a:La/qk00;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, La/rn;

    .line 21
    .line 22
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const v1, 0x7f040ae3

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {p0, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y1:Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v1, v1, La/sn;->b:Landroid/widget/FrameLayout;

    .line 49
    .line 50
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 51
    .line 52
    invoke-direct {v2, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/pk00;->a:La/pk00;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/co00;->G0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, La/ok00;->a:La/ok00;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 17
    .line 18
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object p1, La/tvk;->a:La/rwj;

    .line 23
    .line 24
    sget-object p1, La/ys10;->a:La/vs10;

    .line 25
    .line 26
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, La/kaw;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    const/16 p2, 0x17

    .line 34
    .line 35
    invoke-direct {v4, p0, p1, p2}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    const/16 v5, 0xb

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 43
    .line 44
    .line 45
    sget-object v0, La/co00;->S1:[La/iiy;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    iget-object v1, p0, La/co00;->L1:La/s0r;

    .line 51
    .line 52
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v0, La/aid;

    .line 60
    .line 61
    iget-object v0, v0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 62
    .line 63
    new-instance v1, La/owp0;

    .line 64
    .line 65
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/tx;

    .line 69
    .line 70
    invoke-direct {v2, p0, p2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    new-instance p0, La/ugd;

    .line 74
    .line 75
    const p2, -0x539612b

    .line 76
    .line 77
    .line 78
    const/4 v3, 0x1

    .line 79
    invoke-direct {p0, p2, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1, p1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/co00;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
