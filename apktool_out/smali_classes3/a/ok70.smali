.class public La/ok70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/ok70;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/v6i;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ok70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/FragmentGamesGameEndedBinding;"

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
    sput-object v1, La/ok70;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0245

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
    iput-object v0, p0, La/ok70;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/lk70;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/lk70;-><init>(La/ok70;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/gg70;

    .line 18
    .line 19
    const/16 v2, 0xc

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/gg70;

    .line 27
    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/yk70;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/ph70;

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/ph70;

    .line 53
    .line 54
    const/16 v5, 0x9

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/ok70;->M1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/mk70;->a:La/mk70;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/ok70;->N1:La/s0r;

    .line 72
    .line 73
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
    invoke-interface {v0, p0}, La/h5t;->o(La/ok70;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final G0()La/k0r;
    .locals 2

    .line 1
    sget-object v0, La/ok70;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ok70;->N1:La/s0r;

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
    check-cast p0, La/k0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/yk70;
    .locals 0

    .line 1
    iget-object p0, p0, La/ok70;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yk70;

    .line 8
    .line 9
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
    new-instance p1, La/lk70;

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p0, p2}, La/lk70;-><init>(La/ok70;B)V

    .line 11
    .line 12
    .line 13
    const-string v0, "NOT_ENOUGH_FUNDS"

    .line 14
    .line 15
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/ok70;->G0()La/k0r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/k0r;->e:Landroidx/appcompat/widget/AppCompatButton;

    .line 23
    .line 24
    new-instance v0, La/kk70;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/kk70;-><init>(La/ok70;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/ok70;->G0()La/k0r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/k0r;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 38
    .line 39
    new-instance v0, La/kk70;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, La/kk70;-><init>(La/ok70;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/ok70;->H0()La/yk70;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, La/yk70;->x:La/p7m0;

    .line 52
    .line 53
    new-instance v0, La/nk70;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-direct {v0, p0, v6, v1}, La/nk70;-><init>(La/ok70;La/yje;B)V

    .line 57
    .line 58
    .line 59
    sget-object v1, La/lkz;->a:La/lkz;

    .line 60
    .line 61
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v3, La/az60;

    .line 74
    .line 75
    invoke-direct {v3, p1, v1, v0, v6}, La/az60;-><init>(La/gmq;La/clz;La/nk70;La/yje;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x3

    .line 79
    invoke-static {v2, v6, v6, v3, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, La/ok70;->H0()La/yk70;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, v0, La/yk70;->y:La/p7m0;

    .line 87
    .line 88
    new-instance v5, La/nk70;

    .line 89
    .line 90
    invoke-direct {v5, p0, v6, p2}, La/nk70;-><init>(La/ok70;La/yje;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    new-instance v2, La/az60;

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    invoke-direct/range {v2 .. v7}, La/az60;-><init>(La/gmq;La/clz;La/nk70;La/yje;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {p2, v6, v6, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, La/ok70;->H0()La/yk70;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    new-instance p1, La/qk70;

    .line 119
    .line 120
    iget-object p2, p0, La/yk70;->v:La/y5s;

    .line 121
    .line 122
    iget-boolean p2, p2, La/y5s;->f:Z

    .line 123
    .line 124
    invoke-direct {p1, p2}, La/qk70;-><init>(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, La/yk70;->y(La/rk70;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ok70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
