.class public final La/vic0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/vic0;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/gki;

.field public M1:Landroid/widget/PopupWindow;

.field public final N1:Landroid/graphics/Rect;

.field public O1:Landroid/animation/ValueAnimator;

.field public P1:Landroid/view/ViewPropertyAnimator;

.field public final Q1:La/s0r;

.field public final R1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vic0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGamesControlFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/vic0;->S1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d053a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/vic0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/vic0;->N1:Landroid/graphics/Rect;

    .line 17
    .line 18
    sget-object v0, La/tic0;->a:La/tic0;

    .line 19
    .line 20
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/vic0;->Q1:La/s0r;

    .line 25
    .line 26
    new-instance v0, La/ssa0;

    .line 27
    .line 28
    const/16 v1, 0x17

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, La/g8b0;

    .line 34
    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    sget-object v2, La/wez;->b:La/wez;

    .line 41
    .line 42
    new-instance v3, La/g8b0;

    .line 43
    .line 44
    const/16 v4, 0x12

    .line 45
    .line 46
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-class v2, La/hjc0;

    .line 54
    .line 55
    sget-object v3, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, La/x6b0;

    .line 62
    .line 63
    const/16 v4, 0x14

    .line 64
    .line 65
    invoke-direct {v3, v1, v4}, La/x6b0;-><init>(La/a8z;B)V

    .line 66
    .line 67
    .line 68
    new-instance v4, La/x6b0;

    .line 69
    .line 70
    const/16 v5, 0x15

    .line 71
    .line 72
    invoke-direct {v4, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/vic0;->R1:La/kiu0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/vic0;->G0()La/wic0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/wic0;->f:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    sget-object v0, La/ymx;->h:La/ymx;

    .line 8
    .line 9
    new-instance v1, La/sic0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, v2}, La/sic0;-><init>(La/vic0;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/vic0;->G0()La/wic0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/wic0;->c:Landroid/widget/FrameLayout;

    .line 23
    .line 24
    new-instance v1, La/sic0;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {v1, p0, v2}, La/sic0;-><init>(La/vic0;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, La/ex60;

    .line 42
    .line 43
    const/16 v2, 0xe

    .line 44
    .line 45
    invoke-direct {v1, p0, v2}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    const-string p0, "BONUS_BOUGHT_REQUEST_KEY"

    .line 49
    .line 50
    invoke-virtual {p1, p0, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/kjc0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/kjc0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/kjc0;->M1:La/kki;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-byte v1, v0, La/kki;->a:B

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    iget-object v0, v0, La/kki;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/n5d0;

    .line 25
    .line 26
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/gki;

    .line 31
    .line 32
    iput-object v0, p0, La/vic0;->L1:La/gki;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :pswitch_1
    iget-object v0, v0, La/kki;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/n5d0;

    .line 38
    .line 39
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/gki;

    .line 44
    .line 45
    iput-object v0, p0, La/vic0;->L1:La/gki;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :pswitch_2
    iget-object v0, v0, La/kki;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/n5d0;

    .line 51
    .line 52
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/gki;

    .line 57
    .line 58
    iput-object v0, p0, La/vic0;->L1:La/gki;

    .line 59
    .line 60
    :cond_1
    :goto_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/vic0;->H0()La/hjc0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/hjc0;->j:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/uic0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v3, v2}, La/uic0;-><init>(La/vic0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v5, La/p8c0;

    .line 29
    .line 30
    invoke-direct {v5, v0, v2, v1, v3}, La/p8c0;-><init>(La/gmq;La/clz;La/uic0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/vic0;->H0()La/hjc0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, v1, La/hjc0;->k:La/p7m0;

    .line 42
    .line 43
    new-instance v4, La/d7a0;

    .line 44
    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-direct {v4, v1, v3, v5}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/u6n0;

    .line 50
    .line 51
    invoke-direct {v1, v2, v4}, La/u6n0;-><init>(La/p7m0;Lkotlin/jvm/functions/Function2;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, La/uic0;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v2, p0, v3, v4}, La/uic0;-><init>(La/vic0;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v5, La/p8c0;

    .line 73
    .line 74
    invoke-direct {v5, v1, p0, v2, v3}, La/p8c0;-><init>(La/u6n0;La/clz;La/uic0;La/yje;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final G0()La/wic0;
    .locals 2

    .line 1
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vic0;->Q1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/wic0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/hjc0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vic0;->R1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hjc0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/vic0;->M1:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, La/vic0;->P1:Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object p0, p0, La/vic0;->O1:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vic0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
