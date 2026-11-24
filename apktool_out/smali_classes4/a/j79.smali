.class public final La/j79;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/vbr;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0008\u00b2\u0006\u000c\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/j79;",
        "La/yx5;",
        "La/vbr;",
        "<init>",
        "()V",
        "a/kl5",
        "La/p79;",
        "uiState",
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
.field public static final O1:La/kl5;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/kiu0;

.field public final M1:La/khf0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/j79;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;"

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
    const-string v5, "getViewBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentBroadcastingZoneFullScreenBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/j79;->P1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kl5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/j79;->O1:La/kl5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d020d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f79;

    .line 8
    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/f79;-><init>(La/j79;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/h79;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v3, La/h79;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-class v2, La/s79;

    .line 33
    .line 34
    sget-object v3, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, La/rt6;

    .line 41
    .line 42
    const/16 v4, 0x10

    .line 43
    .line 44
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/rt6;

    .line 48
    .line 49
    const/16 v5, 0x11

    .line 50
    .line 51
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/j79;->L1:La/kiu0;

    .line 59
    .line 60
    new-instance v0, La/khf0;

    .line 61
    .line 62
    const-string v1, "KEY_PARAMS"

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/j79;->M1:La/khf0;

    .line 68
    .line 69
    sget-object v0, La/i79;->a:La/i79;

    .line 70
    .line 71
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/j79;->N1:La/s0r;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/j79;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/j79;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/uyq;

    .line 16
    .line 17
    iget-object v1, v1, La/uyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/f79;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, p0, v3}, La/f79;-><init>(La/j79;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast p1, La/uyq;

    .line 41
    .line 42
    iget-object p1, p1, La/uyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 43
    .line 44
    sget-object v1, La/qek0;->h:La/qek0;

    .line 45
    .line 46
    new-instance v2, La/tx;

    .line 47
    .line 48
    const/16 v3, 0xd

    .line 49
    .line 50
    invoke-direct {v2, p0, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance p0, La/ugd;

    .line 54
    .line 55
    const v3, 0x73e957d3

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/a89;

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
    instance-of v3, v0, La/a89;

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
    check-cast v2, La/a89;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/j79;->P1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/j79;->M1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, La/a89;->a(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;)La/v9i;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, La/fiu0;

    .line 73
    .line 74
    iget-object v2, v0, La/v9i;->x:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, La/r5i;

    .line 77
    .line 78
    iget-object v0, v0, La/v9i;->y:La/n5d0;

    .line 79
    .line 80
    check-cast v0, La/r5i;

    .line 81
    .line 82
    const-class v3, La/p89;

    .line 83
    .line 84
    const-class v4, La/s79;

    .line 85
    .line 86
    invoke-static {v3, v2, v4, v0}, La/wcf0;->g(Ljava/io/Serializable;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;)La/wcf0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    iput-object v1, p0, La/j79;->K1:La/fiu0;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/j79;->G0()La/s79;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/yp6;

    .line 10
    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, v3, v2}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/lkz;->a:La/lkz;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 20
    .line 21
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v4, La/l19;

    .line 26
    .line 27
    check-cast v0, La/i89;

    .line 28
    .line 29
    invoke-direct {v4, v0, p0, v1, v3}, La/l19;-><init>(La/i89;La/j79;La/yp6;La/yje;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x3

    .line 33
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final G0()La/s79;
    .locals 0

    .line 1
    iget-object p0, p0, La/j79;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s79;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0(Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "KEY_LANDSCAPE_ZONE_REQUEST"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 6
    .line 7
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-super {p0}, La/yx5;->Z()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {v0, v1}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v2, 0x1e

    .line 15
    .line 16
    if-lt v0, v2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v2, La/p59;

    .line 32
    .line 33
    invoke-direct {v2, p0, v1}, La/p59;-><init>(La/yx5;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, La/jar0;->V(La/kxq;Z)V

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
