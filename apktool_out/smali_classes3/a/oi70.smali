.class public La/oi70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/oi70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final P1:La/mi70;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/p6i;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/oi70;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/oi70;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/mi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/oi70;->P1:La/mi70;

    .line 26
    .line 27
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
    iput-object v0, p0, La/oi70;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/ki70;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/ki70;-><init>(La/oi70;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/gg70;

    .line 18
    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/gg70;

    .line 26
    .line 27
    const/4 v4, 0x7

    .line 28
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v2, La/vi70;

    .line 36
    .line 37
    sget-object v3, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/ph70;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v3, v1, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/ph70;

    .line 50
    .line 51
    const/4 v5, 0x3

    .line 52
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/oi70;->N1:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/ni70;->a:La/ni70;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/oi70;->O1:La/s0r;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/sac;->O(Landroidx/fragment/app/Fragment;)La/h5t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/h5t;->l(La/oi70;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final G0()La/l0r;
    .locals 2

    .line 1
    sget-object v0, La/oi70;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/oi70;->O1:La/s0r;

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
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/oi70;->G0()La/l0r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p1, La/l0r;->e:Landroidx/appcompat/widget/AppCompatButton;

    .line 12
    .line 13
    sget-object v0, La/ymx;->e:La/ymx;

    .line 14
    .line 15
    new-instance v1, La/li70;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/li70;-><init>(La/oi70;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 22
    .line 23
    .line 24
    iget-object p2, p1, La/l0r;->d:Landroidx/appcompat/widget/AppCompatButton;

    .line 25
    .line 26
    new-instance v1, La/li70;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/li70;-><init>(La/oi70;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, La/l0r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 36
    .line 37
    new-instance p2, La/li70;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {p2, p0, v1}, La/li70;-><init>(La/oi70;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0, p2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, La/oi70;->N1:La/kiu0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, La/vi70;

    .line 53
    .line 54
    iget-object p1, p1, La/vi70;->l:La/q99;

    .line 55
    .line 56
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v6, La/nf60;

    .line 61
    .line 62
    const/16 p1, 0x15

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-direct {v6, p0, v7, p1}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    sget-object p1, La/lkz;->a:La/lkz;

    .line 69
    .line 70
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v3, La/az60;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    invoke-direct/range {v3 .. v8}, La/az60;-><init>(La/itb;La/clz;La/nf60;La/yje;C)V

    .line 86
    .line 87
    .line 88
    const/4 p2, 0x3

    .line 89
    invoke-static {p1, v7, v7, v3, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 90
    .line 91
    .line 92
    new-instance p1, La/ki70;

    .line 93
    .line 94
    invoke-direct {p1, p0, v2}, La/ki70;-><init>(La/oi70;B)V

    .line 95
    .line 96
    .line 97
    const-string p2, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY"

    .line 98
    .line 99
    invoke-static {p0, p2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oi70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
