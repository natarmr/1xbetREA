.class public final La/weq0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/weq0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s9m0",
        "tile_matching"
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
.field public static final Q1:La/s9m0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/exi;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;

.field public O1:Ljava/util/List;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/weq0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/tile_matching/databinding/FragmentTileMatchingBinding;"

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
    sput-object v1, La/weq0;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s9m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/weq0;->Q1:La/s9m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02f2

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
    iput-object v0, p0, La/weq0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/teq0;->a:La/teq0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/weq0;->M1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/seq0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/seq0;-><init>(La/weq0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/mfo0;

    .line 26
    .line 27
    const/16 v2, 0x17

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/mfo0;

    .line 35
    .line 36
    const/16 v4, 0x18

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/wfq0;

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
    new-instance v3, La/r5p0;

    .line 54
    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/r5p0;

    .line 61
    .line 62
    const/16 v5, 0x11

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/weq0;->N1:La/kiu0;

    .line 72
    .line 73
    sget-object v0, La/iun;->a:La/iun;

    .line 74
    .line 75
    iput-object v0, p0, La/weq0;->O1:Ljava/util/List;

    .line 76
    .line 77
    new-instance v0, La/seq0;

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    invoke-direct {v0, p0, v1}, La/seq0;-><init>(La/weq0;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/weq0;->P1:La/n0o0;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/wfq0;->x()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, La/wfq0;->z:La/p7m0;

    .line 9
    .line 10
    new-instance v1, La/efq0;

    .line 11
    .line 12
    iget-object v2, p1, La/wfq0;->r:La/y5s;

    .line 13
    .line 14
    iget-object v3, v2, La/y5s;->a:La/s470;

    .line 15
    .line 16
    invoke-direct {v1, v3}, La/efq0;-><init>(La/s470;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p1, La/wfq0;->x:La/p7m0;

    .line 27
    .line 28
    new-instance v1, La/bfq0;

    .line 29
    .line 30
    iget-object v2, v2, La/y5s;->a:La/s470;

    .line 31
    .line 32
    invoke-direct {v1, v2}, La/bfq0;-><init>(La/s470;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, La/wfq0;->y:La/p7m0;

    .line 42
    .line 43
    new-instance v0, La/ifq0;

    .line 44
    .line 45
    invoke-direct {v0, v2}, La/ifq0;-><init>(La/s470;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p1, La/w5r;->f:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 59
    .line 60
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, p1, La/w5r;->i:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 65
    .line 66
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v2, p1, La/w5r;->h:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 71
    .line 72
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v3, p1, La/w5r;->e:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 77
    .line 78
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v4, p1, La/w5r;->d:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 83
    .line 84
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object v5, p1, La/w5r;->g:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 89
    .line 90
    filled-new-array/range {v0 .. v5}, [Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/weq0;->O1:Ljava/util/List;

    .line 99
    .line 100
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/qeq0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/qeq0;

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
    iget-object v0, v0, La/qeq0;->X1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/gxi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v0, La/gxi;->j0:La/n5d0;

    .line 24
    .line 25
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/exi;

    .line 30
    .line 31
    iput-object v0, p0, La/weq0;->L1:La/exi;

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/wfq0;->w:La/p7m0;

    .line 6
    .line 7
    new-instance v4, La/veq0;

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {v4, p0, v9, v0}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La/lkz;->a:La/lkz;

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
    move-result-object v1

    .line 24
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    new-instance v1, La/lto0;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v5, v9

    .line 32
    invoke-direct/range {v1 .. v6}, La/lto0;-><init>(La/gmq;La/clz;La/veq0;La/yje;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v7, v9, v9, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, La/wfq0;->x:La/p7m0;

    .line 43
    .line 44
    new-instance v2, La/veq0;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v2, p0, v9, v3}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    new-instance v5, La/lto0;

    .line 63
    .line 64
    invoke-direct {v5, v1, v3, v2, v9}, La/lto0;-><init>(La/gmq;La/clz;La/veq0;La/yje;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v6, v1, La/wfq0;->y:La/p7m0;

    .line 75
    .line 76
    new-instance v8, La/veq0;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v8, p0, v9, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v5, La/lto0;

    .line 95
    .line 96
    const/4 v10, 0x0

    .line 97
    invoke-direct/range {v5 .. v10}, La/lto0;-><init>(La/gmq;La/clz;La/veq0;La/yje;C)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v6, v1, La/wfq0;->z:La/p7m0;

    .line 108
    .line 109
    new-instance v8, La/veq0;

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-direct {v8, p0, v9, v1}, La/veq0;-><init>(La/weq0;La/yje;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    new-instance v5, La/lto0;

    .line 128
    .line 129
    invoke-direct/range {v5 .. v10}, La/lto0;-><init>(La/gmq;La/clz;La/veq0;La/yje;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {p0, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final G0(DIZ)V
    .locals 4

    .line 1
    iget-object p0, p0, La/weq0;->O1:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 8
    .line 9
    iget-object p3, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    iget-object p0, p3, La/iab;->h:Landroid/view/View;

    .line 14
    .line 15
    check-cast p0, Landroid/widget/TextView;

    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 24
    .line 25
    rem-double v0, p1, v0

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    cmpg-double p4, v0, v2

    .line 30
    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    invoke-static {p1, p2}, La/si30;->a(D)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    const/4 p2, 0x0

    .line 47
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iget-object p3, p3, La/iab;->h:Landroid/view/View;

    .line 56
    .line 57
    check-cast p3, Landroid/widget/TextView;

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const p1, 0x7f1302b4

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const p2, 0x7f13084d

    .line 78
    .line 79
    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :goto_1
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final H0(ILa/s470;)V
    .locals 9

    .line 1
    new-instance v0, La/r3e;

    .line 2
    .line 3
    invoke-direct {v0}, La/r3e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, La/w5r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/r3e;->e(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 13
    .line 14
    .line 15
    const v1, 0x7f0a10b3

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, v0, La/r3e;->g:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, -0x1

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, La/m3e;

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v3, v3, La/m3e;->e:La/n3e;

    .line 41
    .line 42
    iput v4, v3, La/n3e;->n:I

    .line 43
    .line 44
    iput v4, v3, La/n3e;->m:I

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    iput v5, v3, La/n3e;->I:I

    .line 48
    .line 49
    const/high16 v5, -0x80000000

    .line 50
    .line 51
    iput v5, v3, La/n3e;->O:I

    .line 52
    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const-class v6, La/s470;

    .line 62
    .line 63
    const/16 v7, 0x10

    .line 64
    .line 65
    const/16 v8, 0xf

    .line 66
    .line 67
    if-eq v5, v8, :cond_3

    .line 68
    .line 69
    if-ne v5, v7, :cond_2

    .line 70
    .line 71
    const v5, 0x7f070705

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    new-instance p0, Ljava/lang/EnumConstantNotPresentException;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, v6, p1}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_3
    const v5, 0x7f0706e2

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    add-int/2addr v3, p1

    .line 93
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    new-instance p1, La/m3e;

    .line 100
    .line 101
    invoke-direct {p1}, La/m3e;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, La/m3e;

    .line 112
    .line 113
    if-nez p1, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    iget-object p1, p1, La/m3e;->e:La/n3e;

    .line 117
    .line 118
    const v1, 0x7f0a0360

    .line 119
    .line 120
    .line 121
    iput v1, p1, La/n3e;->n:I

    .line 122
    .line 123
    iput v4, p1, La/n3e;->m:I

    .line 124
    .line 125
    iput v4, p1, La/n3e;->q:I

    .line 126
    .line 127
    iput v4, p1, La/n3e;->r:I

    .line 128
    .line 129
    iput v4, p1, La/n3e;->s:I

    .line 130
    .line 131
    iput v3, p1, La/n3e;->I:I

    .line 132
    .line 133
    :goto_2
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object p1, p1, La/w5r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget-object p1, p1, La/w5r;->m:Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eq v0, v8, :cond_7

    .line 153
    .line 154
    if-ne v0, v7, :cond_6

    .line 155
    .line 156
    const p2, 0x7f130916

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    new-instance p0, Ljava/lang/EnumConstantNotPresentException;

    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-direct {p0, v6, p1}, Ljava/lang/EnumConstantNotPresentException;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_7
    const p2, 0x7f130e54

    .line 171
    .line 172
    .line 173
    :goto_3
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final I0()La/w5r;
    .locals 2

    .line 1
    sget-object v0, La/weq0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/weq0;->M1:La/s0r;

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
    check-cast p0, La/w5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/wfq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/weq0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wfq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/iun;->a:La/iun;

    .line 5
    .line 6
    iput-object v0, p0, La/weq0;->O1:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/weq0;->I0()La/w5r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/w5r;->e:Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La/weq0;->P1:La/n0o0;

    .line 12
    .line 13
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/ueq0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 24
    .line 25
    return-void
.end method

.method public final e0()V
    .locals 8

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/wfq0;->z:La/p7m0;

    .line 9
    .line 10
    iget-object v1, p0, La/wfq0;->w:La/p7m0;

    .line 11
    .line 12
    iget-object v2, p0, La/wfq0;->y:La/p7m0;

    .line 13
    .line 14
    invoke-virtual {p0}, La/wfq0;->x()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, La/wfq0;->x:La/p7m0;

    .line 18
    .line 19
    new-instance v4, La/bfq0;

    .line 20
    .line 21
    iget-object v5, p0, La/wfq0;->r:La/y5s;

    .line 22
    .line 23
    iget-object v5, v5, La/y5s;->a:La/s470;

    .line 24
    .line 25
    invoke-direct {v4, v5}, La/bfq0;-><init>(La/s470;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-virtual {v3, v5, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, La/wfq0;->i:La/svu;

    .line 36
    .line 37
    iget-object v3, v3, La/svu;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, La/kgq0;

    .line 40
    .line 41
    iget-object v3, v3, La/kgq0;->c:La/beq0;

    .line 42
    .line 43
    iget-object v3, v3, La/beq0;->a:La/xfq0;

    .line 44
    .line 45
    iget-object v3, v3, La/xfq0;->b:La/xeq0;

    .line 46
    .line 47
    iget-object v4, p0, La/wfq0;->n:La/vcu;

    .line 48
    .line 49
    invoke-virtual {v4}, La/vcu;->a()La/vrs;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/4 v6, 0x1

    .line 58
    const/4 v7, 0x0

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    if-eq v4, v6, :cond_1

    .line 62
    .line 63
    const/4 v6, 0x2

    .line 64
    if-ne v4, v6, :cond_0

    .line 65
    .line 66
    iget-object v4, v3, La/xeq0;->b:Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {p0, v4}, La/wfq0;->w(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, La/nfq0;

    .line 72
    .line 73
    iget-object v3, v3, La/xeq0;->a:Ljava/util/List;

    .line 74
    .line 75
    invoke-direct {p0, v3}, La/nfq0;-><init>(Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    new-instance p0, La/qfq0;

    .line 85
    .line 86
    invoke-direct {p0, v7}, La/qfq0;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    new-instance p0, La/gfq0;

    .line 96
    .line 97
    invoke-direct {p0, v7}, La/gfq0;-><init>(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    iget-object v4, v3, La/xeq0;->b:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {p0, v4}, La/wfq0;->w(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    new-instance p0, La/nfq0;

    .line 117
    .line 118
    iget-object v4, v3, La/xeq0;->a:Ljava/util/List;

    .line 119
    .line 120
    iget-object v3, v3, La/xeq0;->c:Ljava/util/List;

    .line 121
    .line 122
    invoke-direct {p0, v4, v3}, La/nfq0;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    new-instance p0, La/qfq0;

    .line 132
    .line 133
    invoke-direct {p0, v7}, La/qfq0;-><init>(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    new-instance p0, La/gfq0;

    .line 143
    .line 144
    invoke-direct {p0, v6}, La/gfq0;-><init>(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_2
    iget-object v4, v3, La/xeq0;->b:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {p0, v4}, La/wfq0;->w(Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    new-instance p0, La/nfq0;

    .line 160
    .line 161
    iget-object v3, v3, La/xeq0;->a:Ljava/util/List;

    .line 162
    .line 163
    invoke-direct {p0, v3}, La/nfq0;-><init>(Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    new-instance p0, La/qfq0;

    .line 173
    .line 174
    invoke-direct {p0, v6}, La/qfq0;-><init>(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    new-instance p0, La/gfq0;

    .line 184
    .line 185
    invoke-direct {p0, v7}, La/gfq0;-><init>(Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/weq0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
