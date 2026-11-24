.class public final La/b5r0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/b5r0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final t2:La/j6m0;

.field public static final synthetic u2:[La/iiy;

.field public static final v2:Ljava/lang/String;


# instance fields
.field public final k2:La/khf0;

.field public l2:Z

.field public m2:Z

.field public n2:La/wjk;

.field public o2:La/ndk0;

.field public final p2:La/n0o0;

.field public final q2:La/a8z;

.field public final r2:La/gw5;

.field public final s2:La/vr3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/b5r0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/b5r0;->u2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/j6m0;

    .line 21
    .line 22
    const/16 v2, 0x16

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/j6m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/b5r0;->t2:La/j6m0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, La/b5r0;->v2:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "TOP_GAMES_BY_STAT_SCREEN_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/b5r0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/a5r0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/a5r0;-><init>(La/b5r0;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/b5r0;->p2:La/n0o0;

    .line 24
    .line 25
    const-class v0, La/m5r0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/a5r0;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, La/a5r0;-><init>(La/b5r0;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/b5r0;->q2:La/a8z;

    .line 47
    .line 48
    new-instance v0, La/gw5;

    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    invoke-direct {v0, p0, v1}, La/gw5;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, La/b5r0;->r2:La/gw5;

    .line 55
    .line 56
    new-instance v0, La/vr3;

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    invoke-direct {v0, p0, v1}, La/vr3;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/b5r0;->s2:La/vr3;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, 0x7a808ab0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/b5r0;->Q0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v10, La/ukd;->a:La/cl5;

    .line 20
    .line 21
    if-ne v0, v10, :cond_0

    .line 22
    .line 23
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 24
    .line 25
    invoke-static {v0, v8}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v11, v0

    .line 33
    check-cast v11, La/vne;

    .line 34
    .line 35
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    if-ne v1, v10, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v6, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    new-instance v0, La/w6q0;

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/16 v7, 0x14

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    const-class v3, La/b5r0;

    .line 57
    .line 58
    const-string v4, "handleSideEffect"

    .line 59
    .line 60
    const-string v5, "handleSideEffect(Lorg/xplatform/feed/topgamesbystat/presentation/models/TopGamesByStatBottomSheetSideEffect;)V"

    .line 61
    .line 62
    invoke-direct/range {v0 .. v7}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 63
    .line 64
    .line 65
    move-object v6, v2

    .line 66
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v1, v0

    .line 70
    :goto_1
    check-cast v1, La/jhy;

    .line 71
    .line 72
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    or-int/2addr v2, v3

    .line 85
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    or-int/2addr v2, v3

    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    or-int/2addr v2, v3

    .line 96
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    if-ne v3, v10, :cond_4

    .line 103
    .line 104
    :cond_3
    new-instance v3, La/ggc0;

    .line 105
    .line 106
    const/16 v2, 0xd

    .line 107
    .line 108
    invoke-direct {v3, v11, v9, v1, v2}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    invoke-static {v0, v3, v8}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, La/b5r0;->Q0()La/k3t0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/i3t0;

    .line 124
    .line 125
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-nez v0, :cond_5

    .line 138
    .line 139
    if-ne v1, v10, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v1, La/a5r0;

    .line 142
    .line 143
    const/4 v0, 0x2

    .line 144
    invoke-direct {v1, v6, v0}, La/a5r0;-><init>(La/b5r0;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_6
    move-object v0, v1

    .line 151
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 152
    .line 153
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-nez v1, :cond_7

    .line 162
    .line 163
    if-ne v2, v10, :cond_8

    .line 164
    .line 165
    :cond_7
    new-instance v2, La/a5r0;

    .line 166
    .line 167
    const/4 v1, 0x3

    .line 168
    invoke-direct {v2, v6, v1}, La/a5r0;-><init>(La/b5r0;B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    move-object v1, v2

    .line 175
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    const/4 v5, 0x4

    .line 179
    const/4 v2, 0x0

    .line 180
    move-object v3, v8

    .line 181
    invoke-static/range {v0 .. v5}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 182
    .line 183
    .line 184
    new-instance v8, La/bw5;

    .line 185
    .line 186
    const/4 v0, 0x1

    .line 187
    invoke-static {v0, v3}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 192
    .line 193
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 198
    .line 199
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v14

    .line 203
    const/16 v16, 0x1f

    .line 204
    .line 205
    const/4 v10, 0x0

    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v13, 0x0

    .line 209
    invoke-static/range {v9 .. v16}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    new-instance v0, La/nhl0;

    .line 214
    .line 215
    const/16 v1, 0x17

    .line 216
    .line 217
    invoke-direct {v0, v7, v6, v1}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 218
    .line 219
    .line 220
    const v1, 0x70928f21

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v0, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    const/16 v13, 0xe

    .line 228
    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 236
    .line 237
    .line 238
    return-object v8
.end method

.method public final P0()La/nxi;
    .locals 0

    .line 1
    iget-object p0, p0, La/b5r0;->p2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nxi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b5r0;->q2:La/a8z;

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

.method public final R0(La/xdk0;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/b5r0;->o2:La/ndk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, La/b5r0;->P0()La/nxi;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, La/nxi;->p:La/wdk0;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 19
    .line 20
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    instance-of v4, v3, La/sik;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v4, v2

    .line 70
    check-cast v4, La/sik;

    .line 71
    .line 72
    instance-of v5, v4, La/i620;

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    move-object v2, v3

    .line 84
    :goto_1
    check-cast v2, La/sik;

    .line 85
    .line 86
    if-nez v2, :cond_5

    .line 87
    .line 88
    move-object v2, p0

    .line 89
    :cond_5
    invoke-virtual {v2}, La/sik;->A0()Landroid/app/Dialog;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    const v2, 0x1020002

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    move-object v3, v0

    .line 109
    check-cast v3, Landroid/view/ViewGroup;

    .line 110
    .line 111
    :cond_6
    move-object v5, v3

    .line 112
    const/4 v7, 0x0

    .line 113
    const/16 v8, 0x3f4

    .line 114
    .line 115
    const/4 v4, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    move-object v3, p0

    .line 118
    move-object v2, p1

    .line 119
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    iput-object p0, v3, La/b5r0;->o2:La/ndk0;

    .line 124
    .line 125
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/b5r0;->n2:La/wjk;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/b5r0;->n2:La/wjk;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/b5r0;->r2:La/gw5;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, La/b5r0;->s2:La/vr3;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->B0(La/q1r;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/b5r0;->P0()La/nxi;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/nxi;->c:La/itr;

    .line 26
    .line 27
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0}, La/iw5;->Z()V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/b5r0;->n2:La/wjk;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/b5r0;->n2:La/wjk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/wjk;->l(La/wjk;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, La/iw5;->e0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 18
    .line 19
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, La/b5r0;->r2:La/gw5;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y(La/po8;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, La/b5r0;->s2:La/vr3;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/b5r0;->P0()La/nxi;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/nxi;->c:La/itr;

    .line 31
    .line 32
    invoke-interface {p1}, La/itr;->d()La/ujd;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, La/ks2;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/nop0;

    .line 45
    .line 46
    const/16 v1, 0x19

    .line 47
    .line 48
    invoke-direct {v0, p0, v1}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0, p2, v0}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/b5r0;->m2:Z

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean v0, p0, La/b5r0;->l2:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, La/u4r0;->b:La/u4r0;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    sget-object v0, La/u4r0;->c:La/u4r0;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 26
    :goto_1
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_3
    invoke-virtual {p0}, La/b5r0;->Q0()La/k3t0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, La/p4r0;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/p4r0;-><init>(La/u4r0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
