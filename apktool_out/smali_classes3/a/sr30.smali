.class public final La/sr30;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/sr30;",
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
.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

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
    const-class v1, La/sr30;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentMemoryBinding;"

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
    sput-object v1, La/sr30;->P1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0267

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
    iput-object v0, p0, La/sr30;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/np30;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p0, v1}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/pv10;

    .line 18
    .line 19
    const/16 v2, 0x15

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/pv10;

    .line 27
    .line 28
    const/16 v4, 0x16

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/ns30;

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
    new-instance v3, La/y620;

    .line 46
    .line 47
    const/16 v4, 0xc

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/y620;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/y620;

    .line 53
    .line 54
    const/16 v5, 0xd

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/sr30;->N1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/rr30;->a:La/rr30;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/sr30;->O1:La/s0r;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/sr30;->G0()La/b2r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/b2r;->e:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;

    .line 6
    .line 7
    new-instance v0, La/qr30;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/qr30;-><init>(La/sr30;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;->setListener(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/sr30;->G0()La/b2r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/b2r;->d:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 21
    .line 22
    new-instance v0, La/qr30;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, v1}, La/qr30;-><init>(La/sr30;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->setListener(Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/o0t;

    .line 32
    .line 33
    invoke-virtual {p0}, La/sr30;->H0()La/ns30;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v8, 0x0

    .line 38
    const/16 v9, 0x1c

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const-class v5, La/ns30;

    .line 42
    .line 43
    const-string v6, "onUnfinishedGameDialogDismissed"

    .line 44
    .line 45
    const-string v7, "onUnfinishedGameDialogDismissed()V"

    .line 46
    .line 47
    invoke-direct/range {v2 .. v9}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    const-string p1, "MEMORY_UNFINISHED_GAME_DIALOG"

    .line 51
    .line 52
    invoke-static {p0, p1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/us30;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/us30;

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
    iget-object v0, v0, La/us30;->S1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/nli;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/ns30;

    .line 26
    .line 27
    iget-object v3, v0, La/nli;->h:La/gji;

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/sr30;->L1:La/fiu0;

    .line 37
    .line 38
    iget-object v0, v0, La/nli;->a:La/g8i;

    .line 39
    .line 40
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/sr30;->M1:La/ii;

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/sr30;->H0()La/ns30;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/ns30;->n:La/ol60;

    .line 6
    .line 7
    new-instance v3, La/vf20;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/4 v10, 0x4

    .line 11
    const/4 v4, 0x2

    .line 12
    const-class v14, La/sr30;

    .line 13
    .line 14
    const-string v7, "handleChannelState"

    .line 15
    .line 16
    const-string v8, "handleChannelState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$ChannelViewState;)V"

    .line 17
    .line 18
    move-object/from16 v5, p0

    .line 19
    .line 20
    move-object v6, v14

    .line 21
    invoke-direct/range {v3 .. v10}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    sget-object v0, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/mw20;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    move-object v5, v11

    .line 44
    invoke-direct/range {v1 .. v6}, La/mw20;-><init>(La/gmq;La/clz;La/vf20;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, La/sr30;->H0()La/ns30;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v8, v0, La/ns30;->o:La/p7m0;

    .line 56
    .line 57
    new-instance v10, La/vf20;

    .line 58
    .line 59
    const/16 v17, 0x4

    .line 60
    .line 61
    const/16 v18, 0x5

    .line 62
    .line 63
    const/4 v12, 0x2

    .line 64
    const-string v15, "handleCellsState"

    .line 65
    .line 66
    const-string v16, "handleCellsState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$CellsState;)V"

    .line 67
    .line 68
    move-object/from16 v13, p0

    .line 69
    .line 70
    move-object v11, v10

    .line 71
    invoke-direct/range {v11 .. v18}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v7, La/mw20;

    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    move-object v11, v5

    .line 90
    invoke-direct/range {v7 .. v12}, La/mw20;-><init>(La/gmq;La/clz;La/vf20;La/yje;C)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {p0 .. p0}, La/sr30;->H0()La/ns30;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v8, v0, La/ns30;->p:La/p7m0;

    .line 101
    .line 102
    new-instance v10, La/vf20;

    .line 103
    .line 104
    const/16 v18, 0x6

    .line 105
    .line 106
    const/4 v12, 0x2

    .line 107
    const-string v15, "handleSportCellsState"

    .line 108
    .line 109
    const-string v16, "handleSportCellsState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$SportCellState;)V"

    .line 110
    .line 111
    move-object v11, v10

    .line 112
    invoke-direct/range {v11 .. v18}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v7, La/mw20;

    .line 128
    .line 129
    const/4 v12, 0x0

    .line 130
    move-object v11, v5

    .line 131
    invoke-direct/range {v7 .. v12}, La/mw20;-><init>(La/gmq;La/clz;La/vf20;La/yje;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {p0 .. p0}, La/sr30;->H0()La/ns30;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v8, v0, La/ns30;->q:La/p7m0;

    .line 142
    .line 143
    new-instance v10, La/vf20;

    .line 144
    .line 145
    const/16 v18, 0x7

    .line 146
    .line 147
    const/4 v12, 0x2

    .line 148
    const-string v15, "handleViewSate"

    .line 149
    .line 150
    const-string v16, "handleViewSate(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$ViewState;)V"

    .line 151
    .line 152
    move-object v11, v10

    .line 153
    invoke-direct/range {v11 .. v18}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 154
    .line 155
    .line 156
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v7, La/mw20;

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    move-object v11, v5

    .line 172
    invoke-direct/range {v7 .. v12}, La/mw20;-><init>(La/gmq;La/clz;La/vf20;La/yje;S)V

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final G0()La/b2r;
    .locals 2

    .line 1
    sget-object v0, La/sr30;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/sr30;->O1:La/s0r;

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
    check-cast p0, La/b2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ns30;
    .locals 0

    .line 1
    iget-object p0, p0, La/sr30;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ns30;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/sr30;->G0()La/b2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/b2r;->e:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x4

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/sr30;->G0()La/b2r;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/b2r;->d:Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sr30;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
