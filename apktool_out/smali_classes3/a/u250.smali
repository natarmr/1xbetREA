.class public final La/u250;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/d9o0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/u250;",
        "La/yx5;",
        "La/d9o0;",
        "<init>",
        "()V",
        "a/wsz",
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
.field public static final V1:La/wsz;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/r34;

.field public final L1:La/r34;

.field public final M1:La/s0r;

.field public N1:La/fiu0;

.field public O1:La/ii;

.field public P1:La/wdk0;

.field public Q1:La/ynb;

.field public R1:La/roq0;

.field public final S1:Z

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/u250;

    .line 4
    .line 5
    const-string v2, "idToOpen"

    .line 6
    .line 7
    const-string v3, "getIdToOpen()J"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "partitionId"

    .line 16
    .line 17
    const-string v5, "getPartitionId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/MyAggregatorFragmentBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/u250;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/wsz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/u250;->V1:La/wsz;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d04e9

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/r34;

    .line 8
    .line 9
    const-string v1, "GAME_TO_OPEN_ITEM"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/u250;->K1:La/r34;

    .line 15
    .line 16
    new-instance v0, La/r34;

    .line 17
    .line 18
    const-string v1, "PARTITION_ID"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/u250;->L1:La/r34;

    .line 24
    .line 25
    sget-object v0, La/t250;->a:La/t250;

    .line 26
    .line 27
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/u250;->M1:La/s0r;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, La/u250;->S1:Z

    .line 35
    .line 36
    const-class v0, La/p850;

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
    new-instance v1, La/s250;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p0, v2}, La/s250;-><init>(La/u250;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/u250;->U1:La/a8z;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/s250;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/s250;-><init>(La/u250;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v1, La/r250;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, La/r250;-><init>(La/u250;B)V

    .line 23
    .line 24
    .line 25
    const-string v2, "GAME_CLOSED_KEY"

    .line 26
    .line 27
    invoke-virtual {p1, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/u250;->G0()La/k3t0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v1, La/s050;->a:La/s050;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, La/u250;->W1:[La/iiy;

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    aget-object p1, p1, v1

    .line 43
    .line 44
    iget-object v1, p0, La/u250;->M1:La/s0r;

    .line 45
    .line 46
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast p1, La/v250;

    .line 54
    .line 55
    iget-object p1, p1, La/v250;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 56
    .line 57
    new-instance v1, La/owp0;

    .line 58
    .line 59
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, La/pi40;

    .line 63
    .line 64
    const/16 v3, 0x9

    .line 65
    .line 66
    invoke-direct {v2, p0, v3}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance p0, La/ugd;

    .line 70
    .line 71
    const v3, -0x3e9c6482

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final C0()V
    .locals 8

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
    const-class v1, La/p250;

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
    instance-of v3, v0, La/p250;

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
    check-cast v2, La/p250;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v0, La/q250;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    sget-object v3, La/u250;->W1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v3, v1

    .line 61
    .line 62
    iget-object v4, p0, La/u250;->K1:La/r34;

    .line 63
    .line 64
    invoke-virtual {v4, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    const/4 v1, 0x1

    .line 73
    aget-object v1, v3, v1

    .line 74
    .line 75
    iget-object v3, p0, La/u250;->L1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v3, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    invoke-direct {v0, v4, v5, v6, v7}, La/q250;-><init>(JJ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v0}, La/p250;->a(La/q250;)La/mdi;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, La/mdi;->t()La/fiu0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iput-object v1, p0, La/u250;->N1:La/fiu0;

    .line 97
    .line 98
    iget-object v1, v0, La/mdi;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, La/ii;

    .line 101
    .line 102
    iput-object v1, p0, La/u250;->O1:La/ii;

    .line 103
    .line 104
    iget-object v1, v0, La/mdi;->b0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, La/wdk0;

    .line 107
    .line 108
    iput-object v1, p0, La/u250;->P1:La/wdk0;

    .line 109
    .line 110
    iget-object v0, v0, La/mdi;->a0:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/peg0;

    .line 113
    .line 114
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/yzn0;

    .line 117
    .line 118
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/u250;->Q1:La/ynb;

    .line 126
    .line 127
    new-instance v0, La/roq0;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/u250;->R1:La/roq0;

    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 136
    .line 137
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u250;->U1:La/a8z;

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
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/r250;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/r250;-><init>(La/u250;B)V

    .line 16
    .line 17
    .line 18
    const-string v1, "LOYALTY_PROGRAM_CASHBACK_UPDATED_RESULT_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 21
    .line 22
    .line 23
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
    invoke-virtual {p0}, La/u250;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/t050;->a:La/t050;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/u250;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/u050;->a:La/u050;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final m(I)V
    .locals 2

    .line 1
    sget-object v0, La/u250;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/u250;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/v250;

    .line 16
    .line 17
    iget-object v0, v0, La/v250;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {p0, p1, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/u250;->S1:Z

    .line 2
    .line 3
    return p0
.end method
