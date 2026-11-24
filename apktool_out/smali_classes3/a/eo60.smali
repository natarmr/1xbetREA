.class public final La/eo60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/eo60;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final O1:La/atz;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/l6i;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/eo60;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/OnexGameTitleFragmentBinding;"

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
    sput-object v1, La/eo60;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/atz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/eo60;->O1:La/atz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0502

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
    iput-object v0, p0, La/eo60;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/bo60;->a:La/bo60;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/eo60;->M1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/pu50;

    .line 20
    .line 21
    const/16 v1, 0x11

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/ej50;

    .line 27
    .line 28
    const/16 v2, 0xb

    .line 29
    .line 30
    invoke-direct {v1, p0, v2}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    sget-object v2, La/wez;->b:La/wez;

    .line 34
    .line 35
    new-instance v3, La/ej50;

    .line 36
    .line 37
    const/16 v4, 0xc

    .line 38
    .line 39
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-class v2, La/zo70;

    .line 47
    .line 48
    sget-object v3, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v3, La/co60;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/co60;

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/eo60;->N1:La/kiu0;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/bn70;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/bn70;

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
    iget-object v0, v0, La/bn70;->L1:La/h5t;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p0}, La/h5t;->f(La/eo60;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final G0()La/rm70;
    .locals 2

    .line 1
    sget-object v0, La/eo60;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/eo60;->M1:La/s0r;

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
    check-cast p0, La/rm70;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/eo60;->N1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/zo70;

    .line 14
    .line 15
    iget-object p2, p2, La/zo70;->g:La/q99;

    .line 16
    .line 17
    invoke-static {p2}, La/xkb;->V(La/htb;)La/itb;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, La/do60;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v2, v1}, La/do60;-><init>(La/eo60;La/yje;B)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/lkz;->a:La/lkz;

    .line 29
    .line 30
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v4, La/yd60;

    .line 43
    .line 44
    invoke-direct {v4, p2, v1, v0, v2}, La/yd60;-><init>(La/itb;La/clz;La/do60;La/yje;)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x3

    .line 48
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/zo70;

    .line 56
    .line 57
    iget-object v0, v0, La/zo70;->h:La/p7m0;

    .line 58
    .line 59
    new-instance v1, La/do60;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v1, p0, v2, v3}, La/do60;-><init>(La/eo60;La/yje;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    new-instance v4, La/yd60;

    .line 78
    .line 79
    invoke-direct {v4, v0, p0, v1, v2}, La/yd60;-><init>(La/gmq;La/clz;La/do60;La/yje;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/zo70;

    .line 90
    .line 91
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p2, p0, La/zo70;->f:La/ax5;

    .line 96
    .line 97
    new-instance v0, La/c670;

    .line 98
    .line 99
    const/4 v1, 0x5

    .line 100
    invoke-direct {v0, p0, v2, v1}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x2

    .line 104
    invoke-static {p1, p2, v2, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eo60;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
