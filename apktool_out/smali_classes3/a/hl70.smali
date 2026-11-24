.class public La/hl70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hl70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
        "core"
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
.field public static final Q1:La/fl70;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/x6i;

.field public M1:La/ii;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/hl70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/FragmentGamesInstantBetBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "raiseGame"

    .line 16
    .line 17
    const-string v5, "getRaiseGame()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/hl70;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/fl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/hl70;->Q1:La/fl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0246

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
    iput-object v0, p0, La/hl70;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/gl70;->a:La/gl70;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/hl70;->N1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/el70;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/el70;-><init>(La/hl70;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/gg70;

    .line 26
    .line 27
    const/16 v2, 0x10

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/gg70;

    .line 35
    .line 36
    const/16 v4, 0x11

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/ol70;

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
    new-instance v3, La/ph70;

    .line 54
    .line 55
    const/16 v4, 0xc

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/ph70;

    .line 61
    .line 62
    const/16 v5, 0xd

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/hl70;->O1:La/kiu0;

    .line 72
    .line 73
    new-instance v0, La/cgx0;

    .line 74
    .line 75
    const-string v1, "RAISE_GAME_BUNDLE"

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/hl70;->P1:La/cgx0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, La/bn70;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, La/bn70;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v1, La/bn70;->L1:La/h5t;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {v0, p0}, La/h5t;->d(La/hl70;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final G0()La/l0r;
    .locals 2

    .line 1
    sget-object v0, La/hl70;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hl70;->N1:La/s0r;

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
    check-cast p0, La/l0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/hl70;->G0()La/l0r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/l0r;->e:Landroidx/appcompat/widget/AppCompatButton;

    .line 12
    .line 13
    sget-object p2, La/ymx;->e:La/ymx;

    .line 14
    .line 15
    new-instance v0, La/dl70;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/dl70;-><init>(La/hl70;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, La/hl70;->G0()La/l0r;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p1, p1, La/l0r;->d:Landroidx/appcompat/widget/AppCompatButton;

    .line 29
    .line 30
    new-instance v0, La/dl70;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, v1}, La/dl70;-><init>(La/hl70;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/hl70;->G0()La/l0r;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p1, p1, La/l0r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 44
    .line 45
    new-instance v0, La/dl70;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v0, p0, v2}, La/dl70;-><init>(La/hl70;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, La/hl70;->O1:La/kiu0;

    .line 55
    .line 56
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, La/ol70;

    .line 61
    .line 62
    iget-object p1, p1, La/ol70;->o:La/q99;

    .line 63
    .line 64
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v5, La/nf60;

    .line 69
    .line 70
    const/16 p1, 0x18

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    invoke-direct {v5, p0, v6, p1}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 74
    .line 75
    .line 76
    sget-object p1, La/lkz;->a:La/lkz;

    .line 77
    .line 78
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v2, La/az60;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    invoke-direct/range {v2 .. v7}, La/az60;-><init>(La/itb;La/clz;La/nf60;La/yje;I)V

    .line 94
    .line 95
    .line 96
    const/4 p2, 0x3

    .line 97
    invoke-static {p1, v6, v6, v2, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 98
    .line 99
    .line 100
    new-instance p1, La/el70;

    .line 101
    .line 102
    invoke-direct {p1, p0, v1}, La/el70;-><init>(La/hl70;B)V

    .line 103
    .line 104
    .line 105
    const-string p2, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY"

    .line 106
    .line 107
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hl70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
