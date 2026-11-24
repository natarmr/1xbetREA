.class public final La/v0j;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/v0j;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/nwd",
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
.field public static final p2:La/nwd;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public final k2:La/zz2;

.field public final l2:La/zz2;

.field public final m2:La/r34;

.field public n2:La/fiu0;

.field public final o2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/v0j;

    .line 4
    .line 5
    const-string v2, "taskKindId"

    .line 6
    .line 7
    const-string v3, "getTaskKindId()I"

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
    const-string v3, "progress"

    .line 16
    .line 17
    const-string v5, "getProgress()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "productId"

    .line 25
    .line 26
    const-string v6, "getProductId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/v0j;->q2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/nwd;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/v0j;->p2:La/nwd;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zz2;

    .line 5
    .line 6
    const-string v1, "BUNDLE_TASK_KIND_ID"

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/v0j;->k2:La/zz2;

    .line 13
    .line 14
    new-instance v0, La/zz2;

    .line 15
    .line 16
    const-string v1, "BUNDLE_PROGRESS_KEY"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/v0j;->l2:La/zz2;

    .line 23
    .line 24
    new-instance v0, La/r34;

    .line 25
    .line 26
    const-string v1, "BUNDLE_PRODUCT_ID"

    .line 27
    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    invoke-direct {v0, v1, v3, v4}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/v0j;->m2:La/r34;

    .line 34
    .line 35
    const-class v0, La/c1j;

    .line 36
    .line 37
    sget-object v1, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, La/u0j;

    .line 44
    .line 45
    invoke-direct {v1, p0, v2}, La/u0j;-><init>(La/v0j;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/v0j;->o2:La/a8z;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 12

    .line 1
    const v0, -0x1ed9235b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/v0j;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, La/ukd;->a:La/cl5;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v6, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    new-instance v4, La/y6h;

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x5

    .line 32
    const/4 v5, 0x1

    .line 33
    const-class v7, La/v0j;

    .line 34
    .line 35
    const-string v8, "handleSideEffect"

    .line 36
    .line 37
    const-string v9, "handleSideEffect(Lorg/xplatform/aggregator/daily_tasks/impl/presentation/moreinfo/models/DailyTaskMoreInfoSideEffect;)V"

    .line 38
    .line 39
    move-object v6, p0

    .line 40
    invoke-direct/range {v4 .. v11}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v2, v4

    .line 47
    :goto_1
    check-cast v2, La/jhy;

    .line 48
    .line 49
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    sget-object p0, La/lkz;->a:La/lkz;

    .line 52
    .line 53
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    or-int/2addr v1, v2

    .line 66
    const/4 v2, 0x3

    .line 67
    invoke-virtual {p1, v2}, La/fet;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    or-int/2addr v1, v4

    .line 72
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    or-int/2addr v1, v4

    .line 77
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    if-ne v4, v3, :cond_3

    .line 84
    .line 85
    :cond_2
    new-instance v4, La/g6g;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v4, v0, v6, p0, v1}, La/g6g;-><init>(La/k3t0;La/v0j;La/pz40;La/yje;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    invoke-static {p1, v6, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, La/v0j;->P0()La/k3t0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/i3t0;

    .line 104
    .line 105
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/a1j;

    .line 114
    .line 115
    new-instance v3, La/bw5;

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    new-instance v0, La/rgh;

    .line 123
    .line 124
    invoke-direct {v0, p0, v6, v2}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    const p0, 0x79c06914

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    const/16 v8, 0xe

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    invoke-direct/range {v3 .. v8}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 143
    .line 144
    .line 145
    return-object v3
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v0j;->o2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/h4j;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/h4j;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/h4j;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v1, p1}, La/h4j;->a(La/i1w0;)La/v9i;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, La/v9i;->e()La/fiu0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/v0j;->n2:La/fiu0;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 74
    .line 75
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/v0j;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, La/q0j;

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    sget-object v1, La/v0j;->q2:[La/iiy;

    .line 15
    .line 16
    aget-object v0, v1, v0

    .line 17
    .line 18
    iget-object v2, p0, La/v0j;->m2:La/r34;

    .line 19
    .line 20
    invoke-virtual {v2, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const/4 v0, 0x0

    .line 29
    aget-object v0, v1, v0

    .line 30
    .line 31
    iget-object v4, p0, La/v0j;->k2:La/zz2;

    .line 32
    .line 33
    invoke-virtual {v4, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v4, 0x1

    .line 42
    aget-object v1, v1, v4

    .line 43
    .line 44
    iget-object v5, p0, La/v0j;->l2:La/zz2;

    .line 45
    .line 46
    invoke-virtual {v5, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-direct {p2, v0, v1, v2, v3}, La/q0j;-><init>(IIJ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 p2, 0x3

    .line 65
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iput-boolean v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 73
    .line 74
    return-void
.end method
