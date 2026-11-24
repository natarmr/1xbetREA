.class public final Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final U1:La/hfk0;

.field public static final synthetic V1:[La/iiy;

.field public static final W1:Ljava/lang/String;


# instance fields
.field public K1:La/oll0;

.field public L1:La/x7i;

.field public M1:La/wdk0;

.field public N1:La/ujd;

.field public final O1:La/khf0;

.field public final P1:La/s0r;

.field public final Q1:La/n0o0;

.field public final R1:La/a8z;

.field public final S1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/hfk0;

    .line 33
    .line 34
    const/16 v2, 0x13

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/hfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->W1:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d008b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "ALL_EVENT_GAMES_SCREEN_PARAMS_BUNDLE_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->O1:La/khf0;

    .line 15
    .line 16
    sget-object v0, La/x22;->a:La/x22;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->P1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/w22;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/w22;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->Q1:La/n0o0;

    .line 35
    .line 36
    const-class v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/w22;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, v2}, La/w22;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;B)V

    .line 48
    .line 49
    .line 50
    const/16 v3, 0xe

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->R1:La/a8z;

    .line 58
    .line 59
    iput-boolean v2, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->S1:Z

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->N1:La/ujd;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v0, La/sr2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;->getEventId()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v0, v1}, La/ds2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v1, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance v0, La/vr2;

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;->getEventId()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-direct {v0, v1}, La/ds2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance v0, La/zr2;

    .line 50
    .line 51
    invoke-virtual {p0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;->getEventId()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-direct {v0, v1}, La/ds2;-><init>(I)V

    .line 60
    .line 61
    .line 62
    :goto_0
    new-instance v1, La/m51;

    .line 63
    .line 64
    const/16 v2, 0xd

    .line 65
    .line 66
    invoke-direct {v1, p0, v2}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0, v0, v1}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v0, La/k22;->a:La/k22;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->V1:[La/iiy;

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    aget-object p1, p1, v0

    .line 85
    .line 86
    iget-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->P1:La/s0r;

    .line 87
    .line 88
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast p1, La/ekd;

    .line 96
    .line 97
    iget-object p1, p1, La/ekd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 98
    .line 99
    iget-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->Q1:La/n0o0;

    .line 100
    .line 101
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/y7i;

    .line 106
    .line 107
    iget-object v1, v1, La/y7i;->u:La/ewk;

    .line 108
    .line 109
    iget-object v1, v1, La/ewk;->a:La/cy40;

    .line 110
    .line 111
    new-instance v2, La/tx;

    .line 112
    .line 113
    const/4 v3, 0x5

    .line 114
    invoke-direct {v2, p0, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    new-instance p0, La/ugd;

    .line 118
    .line 119
    const v3, 0xc7a3e8e

    .line 120
    .line 121
    .line 122
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v1, p0}, La/pkd;->k(Landroidx/compose/ui/platform/ComposeView;La/cy40;La/ugd;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    const-string p0, "composeGameCardFragmentDelegate"

    .line 134
    .line 135
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 p0, 0x0

    .line 139
    throw p0
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->Q1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/y7i;

    .line 8
    .line 9
    iget-object v1, v0, La/y7i;->a:La/zx10;

    .line 10
    .line 11
    iget-object v1, v1, La/zx10;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/g45;

    .line 14
    .line 15
    invoke-virtual {v1}, La/g45;->K()La/oll0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->K1:La/oll0;

    .line 20
    .line 21
    iget-object v1, v0, La/y7i;->v:La/n5d0;

    .line 22
    .line 23
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/x7i;

    .line 28
    .line 29
    iput-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->L1:La/x7i;

    .line 30
    .line 31
    iget-object v1, v0, La/y7i;->t:La/wdk0;

    .line 32
    .line 33
    iput-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->M1:La/wdk0;

    .line 34
    .line 35
    iget-object v0, v0, La/y7i;->p:La/itr;

    .line 36
    .line 37
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->N1:La/ujd;

    .line 45
    .line 46
    return-void
.end method

.method public final G0()Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;
    .locals 2

    .line 1
    sget-object v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->O1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->R1:La/a8z;

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

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->N1:La/ujd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, La/yx5;->Z()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->M1:La/wdk0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->S1:Z

    .line 12
    .line 13
    invoke-static {p1, p0, p2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "snackbarManager"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->S1:Z

    .line 2
    .line 3
    return p0
.end method
