.class public final La/ukc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ukc0;",
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/hki;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:La/s0r;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ukc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoToolbarBinding;"

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
    sput-object v1, La/ukc0;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0540

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
    iput-object v0, p0, La/ukc0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/tkc0;->a:La/tkc0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/ukc0;->O1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/skc0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/skc0;-><init>(La/ukc0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/g8b0;

    .line 26
    .line 27
    const/16 v2, 0x15

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/g8b0;

    .line 35
    .line 36
    const/16 v4, 0x16

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/clc0;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/x6b0;

    .line 54
    .line 55
    const/16 v4, 0x18

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/x6b0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/x6b0;

    .line 61
    .line 62
    const/16 v5, 0x19

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/ukc0;->P1:La/kiu0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/ex60;

    .line 6
    .line 7
    const/16 v1, 0xf

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    const-string v1, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 13
    .line 14
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v0, 0x7f040b5f

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v0, La/ukc0;->Q1:[La/iiy;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    aget-object v0, v0, v1

    .line 39
    .line 40
    iget-object v2, p0, La/ukc0;->O1:La/s0r;

    .line 41
    .line 42
    invoke-virtual {v2, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v0, La/tuc0;

    .line 50
    .line 51
    iget-object v0, v0, La/tuc0;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 52
    .line 53
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const v3, 0x7f040b7b

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/skc0;

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-direct {v1, p0, v2}, La/skc0;-><init>(La/ukc0;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    new-instance v3, La/hc50;

    .line 79
    .line 80
    sget-object v5, La/ybg0;->a:La/ybg0;

    .line 81
    .line 82
    new-instance v7, La/skc0;

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    invoke-direct {v7, p0, v1}, La/skc0;-><init>(La/ukc0;B)V

    .line 86
    .line 87
    .line 88
    const/16 v8, 0x7f0

    .line 89
    .line 90
    const-string v4, "RULES_BUTTON"

    .line 91
    .line 92
    const v6, 0x7f080a97

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v3 .. v8}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 96
    .line 97
    .line 98
    filled-new-array {v3}, [La/hc50;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleColor(Landroid/content/res/ColorStateList;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setBackIconColor(Landroid/content/res/ColorStateList;)V

    .line 116
    .line 117
    .line 118
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
    iget-object v1, v0, La/kki;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/n5d0;

    .line 25
    .line 26
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, La/hki;

    .line 31
    .line 32
    iput-object v1, p0, La/ukc0;->L1:La/hki;

    .line 33
    .line 34
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, La/iyi;

    .line 37
    .line 38
    iget-object v0, v0, La/iyi;->a:La/g8i;

    .line 39
    .line 40
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, La/ukc0;->M1:La/ii;

    .line 45
    .line 46
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, La/ukc0;->N1:La/wdk0;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_1
    iget-object v1, v0, La/kki;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, La/n5d0;

    .line 59
    .line 60
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/hki;

    .line 65
    .line 66
    iput-object v1, p0, La/ukc0;->L1:La/hki;

    .line 67
    .line 68
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/nli;

    .line 71
    .line 72
    iget-object v0, v0, La/nli;->a:La/g8i;

    .line 73
    .line 74
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, La/ukc0;->M1:La/ii;

    .line 79
    .line 80
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/ukc0;->N1:La/wdk0;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_2
    iget-object v1, v0, La/kki;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, La/n5d0;

    .line 93
    .line 94
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/hki;

    .line 99
    .line 100
    iput-object v1, p0, La/ukc0;->L1:La/hki;

    .line 101
    .line 102
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/fki;

    .line 105
    .line 106
    iget-object v0, v0, La/fki;->a:La/g8i;

    .line 107
    .line 108
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, La/ukc0;->M1:La/ii;

    .line 113
    .line 114
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, La/ukc0;->N1:La/wdk0;

    .line 122
    .line 123
    :cond_1
    :goto_1
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final D0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/ukc0;->G0()La/clc0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/clc0;->q:La/p7m0;

    .line 6
    .line 7
    new-instance v4, La/s9c0;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-direct {v4, p0, v5, v0}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, La/p8c0;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-direct/range {v1 .. v6}, La/p8c0;-><init>(La/gmq;La/clz;La/s9c0;La/yje;C)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/ukc0;->G0()La/clc0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, La/clc0;->p:La/q99;

    .line 43
    .line 44
    invoke-static {v0}, La/xkb;->V(La/htb;)La/itb;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v6, La/jjc0;

    .line 49
    .line 50
    const/4 v12, 0x4

    .line 51
    const/4 v13, 0x4

    .line 52
    const/4 v7, 0x2

    .line 53
    const-class v9, La/ukc0;

    .line 54
    .line 55
    const-string v10, "handleChannelState"

    .line 56
    .line 57
    const-string v11, "handleChannelState(Lorg/xplatform/bonus_games/impl/core/presentation/holder/PromoGamesToolbarViewModel$ChannelViewState;)V"

    .line 58
    .line 59
    move-object v8, p0

    .line 60
    invoke-direct/range {v6 .. v13}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    invoke-static {v8}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v3, La/p8c0;

    .line 76
    .line 77
    invoke-direct {v3, v0, p0, v6, v5}, La/p8c0;-><init>(La/itb;La/clz;La/jjc0;La/yje;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v5, v5, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final G0()La/clc0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ukc0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/clc0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ukc0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
