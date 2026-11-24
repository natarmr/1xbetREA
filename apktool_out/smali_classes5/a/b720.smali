.class public final La/b720;
.super La/iw5;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/b720;",
        "La/iw5;",
        "La/i620;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final w2:La/evz;

.field public static final synthetic x2:[La/iiy;


# instance fields
.field public k2:La/mli;

.field public l2:La/ii;

.field public m2:La/lgn0;

.field public n2:La/iw20;

.field public o2:La/ynb;

.field public p2:La/wdk0;

.field public q2:La/vq;

.field public r2:La/mdk0;

.field public final s2:La/yzn0;

.field public final t2:La/yzn0;

.field public u2:La/wjk;

.field public final v2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/b720;

    .line 4
    .line 5
    const-string v2, "simpleBetGame"

    .line 6
    .line 7
    const-string v3, "getSimpleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;"

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
    const-string v3, "entryPointType"

    .line 16
    .line 17
    const-string v5, "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;"

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
    sput-object v1, La/b720;->x2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/evz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/b720;->w2:La/evz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "SIMPLE_BET_GAME_BUNDLE_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/b720;->s2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "ANALYTICS_ENTRY_POINT_TYPE_BUNDLE_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/b720;->t2:La/yzn0;

    .line 21
    .line 22
    const-class v0, La/nn20;

    .line 23
    .line 24
    sget-object v1, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/m620;

    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-direct {v1, p0, v2}, La/m620;-><init>(La/b720;B)V

    .line 34
    .line 35
    .line 36
    const/16 v2, 0xe

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/b720;->v2:La/a8z;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, -0x3f39bc01

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/b720;->Q0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v10, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    if-ne v1, v10, :cond_1

    .line 28
    .line 29
    :cond_0
    new-instance v0, La/yw10;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x7

    .line 33
    const/4 v1, 0x1

    .line 34
    const-class v3, La/b720;

    .line 35
    .line 36
    const-string v4, "handleSideEffect"

    .line 37
    .line 38
    const-string v5, "handleSideEffect(Lorg/xplatform/make_bet/impl/presentation/ui_state/MakeBetSideEffect;)V"

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v1, v0

    .line 47
    :cond_1
    check-cast v1, La/jhy;

    .line 48
    .line 49
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    sget-object v0, La/lkz;->a:La/lkz;

    .line 52
    .line 53
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    or-int/2addr v1, v3

    .line 66
    const/4 v3, 0x3

    .line 67
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    or-int/2addr v1, v3

    .line 72
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    or-int/2addr v1, v3

    .line 77
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/4 v4, 0x0

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    if-ne v3, v10, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v3, La/khx;

    .line 87
    .line 88
    invoke-direct {v3, v9, v2, v0, v4}, La/khx;-><init>(La/k3t0;La/b720;La/pz40;La/yje;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, La/b720;->Q0()La/k3t0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/i3t0;

    .line 104
    .line 105
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-ne v1, v10, :cond_4

    .line 114
    .line 115
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, La/d820;

    .line 120
    .line 121
    iget-object v1, v1, La/d820;->a:La/ug20;

    .line 122
    .line 123
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    check-cast v1, La/ug20;

    .line 127
    .line 128
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, La/d820;

    .line 133
    .line 134
    iget-object v3, v3, La/d820;->d:La/zbr;

    .line 135
    .line 136
    new-instance v9, La/bw5;

    .line 137
    .line 138
    const/4 v5, 0x1

    .line 139
    invoke-static {v5, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_7

    .line 148
    .line 149
    if-eq v6, v5, :cond_6

    .line 150
    .line 151
    const/4 v5, 0x2

    .line 152
    if-ne v6, v5, :cond_5

    .line 153
    .line 154
    sget-object v5, La/iel;->a:La/iel;

    .line 155
    .line 156
    :goto_0
    move-object v14, v5

    .line 157
    goto :goto_1

    .line 158
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    return-object v4

    .line 162
    :cond_6
    sget-object v5, La/jel;->a:La/jel;

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_7
    sget-object v5, La/kel;->a:La/kel;

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :goto_1
    sget-object v5, La/ug20;->c:La/ug20;

    .line 169
    .line 170
    if-ne v1, v5, :cond_8

    .line 171
    .line 172
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 173
    .line 174
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 179
    .line 180
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    :goto_2
    move-wide v15, v6

    .line 185
    goto :goto_3

    .line 186
    :cond_8
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 187
    .line 188
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 193
    .line 194
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    goto :goto_2

    .line 199
    :goto_3
    const/4 v13, 0x0

    .line 200
    const/16 v17, 0x6

    .line 201
    .line 202
    const/4 v11, 0x1

    .line 203
    const/4 v12, 0x0

    .line 204
    invoke-static/range {v10 .. v17}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    const/4 v6, 0x0

    .line 209
    if-ne v1, v5, :cond_9

    .line 210
    .line 211
    if-eqz v3, :cond_9

    .line 212
    .line 213
    const v1, 0x6075c1cc

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 217
    .line 218
    .line 219
    new-instance v1, La/ngz;

    .line 220
    .line 221
    const/16 v4, 0x9

    .line 222
    .line 223
    invoke-direct {v1, v3, v2, v4}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    const v3, 0x2581c11

    .line 227
    .line 228
    .line 229
    invoke-static {v3, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 234
    .line 235
    .line 236
    :goto_4
    move-object v12, v4

    .line 237
    goto :goto_5

    .line 238
    :cond_9
    const v1, 0x6079009e

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :goto_5
    new-instance v1, La/ngz;

    .line 249
    .line 250
    const/16 v3, 0xa

    .line 251
    .line 252
    invoke-direct {v1, v0, v2, v3}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    const v0, -0x3924d150

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    const/4 v14, 0x6

    .line 263
    const/4 v11, 0x0

    .line 264
    invoke-direct/range {v9 .. v14}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 268
    .line 269
    .line 270
    return-object v9
.end method

.method public final P0()La/ms2;
    .locals 2

    .line 1
    sget-object v0, La/b720;->x2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b720;->t2:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ms2;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b720;->v2:La/a8z;

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

.method public final R0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/b720;->l2:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f1307bb

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f13032f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v10, La/n12;->b:La/n12;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/16 v12, 0x5d0

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    move-object v3, p1

    .line 30
    move-object v7, p2

    .line 31
    move-object/from16 v4, p3

    .line 32
    .line 33
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p0, "actionDialogManager"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0
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
    iput-object p1, p0, La/b720;->u2:La/wjk;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/gp30;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/gp30;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/gp30;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/b720;->x2:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/b720;->s2:La/yzn0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object/from16 v21, v1

    .line 69
    .line 70
    check-cast v21, La/m0k0;

    .line 71
    .line 72
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 73
    .line 74
    .line 75
    move-result-object v23

    .line 76
    invoke-virtual {v0}, La/b720;->P0()La/ms2;

    .line 77
    .line 78
    .line 79
    move-result-object v22

    .line 80
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v5, v3, La/gp30;->a:La/cad;

    .line 84
    .line 85
    iget-object v11, v3, La/gp30;->b:La/d1p;

    .line 86
    .line 87
    iget-object v9, v3, La/gp30;->e:La/wsf0;

    .line 88
    .line 89
    iget-object v15, v3, La/gp30;->c:La/iip;

    .line 90
    .line 91
    iget-object v1, v3, La/gp30;->d:La/drm0;

    .line 92
    .line 93
    iget-object v7, v3, La/gp30;->g:La/sue;

    .line 94
    .line 95
    iget-object v14, v3, La/gp30;->h:La/vqc;

    .line 96
    .line 97
    iget-object v8, v3, La/gp30;->i:La/clc;

    .line 98
    .line 99
    iget-object v12, v3, La/gp30;->j:La/bzu;

    .line 100
    .line 101
    iget-object v10, v3, La/gp30;->k:La/iw20;

    .line 102
    .line 103
    iget-object v6, v3, La/gp30;->l:La/o2j0;

    .line 104
    .line 105
    iget-object v2, v3, La/gp30;->m:La/nr00;

    .line 106
    .line 107
    iget-object v4, v3, La/gp30;->p:La/onv;

    .line 108
    .line 109
    iget-object v13, v3, La/gp30;->q:La/duj;

    .line 110
    .line 111
    move-object/from16 v16, v1

    .line 112
    .line 113
    iget-object v1, v3, La/gp30;->r:La/m1e;

    .line 114
    .line 115
    move-object/from16 v25, v1

    .line 116
    .line 117
    iget-object v1, v3, La/gp30;->o:La/ouu;

    .line 118
    .line 119
    move-object/from16 v24, v13

    .line 120
    .line 121
    iget-object v13, v3, La/gp30;->n:La/onv;

    .line 122
    .line 123
    move-object/from16 v34, v1

    .line 124
    .line 125
    iget-object v1, v3, La/gp30;->s:La/ctf0;

    .line 126
    .line 127
    move-object/from16 v26, v1

    .line 128
    .line 129
    iget-object v1, v3, La/gp30;->t:La/wdk0;

    .line 130
    .line 131
    move-object/from16 v27, v1

    .line 132
    .line 133
    iget-object v1, v3, La/gp30;->v:La/ii;

    .line 134
    .line 135
    move-object/from16 v28, v1

    .line 136
    .line 137
    iget-object v1, v3, La/gp30;->u:La/lgn0;

    .line 138
    .line 139
    move-object/from16 v29, v1

    .line 140
    .line 141
    iget-object v1, v3, La/gp30;->w:La/nb7;

    .line 142
    .line 143
    move-object/from16 v30, v1

    .line 144
    .line 145
    iget-object v1, v3, La/gp30;->x:La/h0f;

    .line 146
    .line 147
    move-object/from16 v31, v1

    .line 148
    .line 149
    iget-object v1, v3, La/gp30;->y:La/gst0;

    .line 150
    .line 151
    move-object/from16 v32, v1

    .line 152
    .line 153
    iget-object v1, v3, La/gp30;->z:La/zlt0;

    .line 154
    .line 155
    move-object/from16 v33, v1

    .line 156
    .line 157
    iget-object v1, v3, La/gp30;->A:La/mii0;

    .line 158
    .line 159
    move-object/from16 v35, v1

    .line 160
    .line 161
    iget-object v1, v3, La/gp30;->C:La/vqc;

    .line 162
    .line 163
    move-object/from16 v37, v1

    .line 164
    .line 165
    iget-object v1, v3, La/gp30;->B:La/yo4;

    .line 166
    .line 167
    move-object/from16 v36, v1

    .line 168
    .line 169
    iget-object v1, v3, La/gp30;->D:La/x0u;

    .line 170
    .line 171
    move-object/from16 v38, v1

    .line 172
    .line 173
    iget-object v1, v3, La/gp30;->E:La/h3c;

    .line 174
    .line 175
    move-object/from16 v39, v1

    .line 176
    .line 177
    iget-object v1, v3, La/gp30;->F:La/lbu;

    .line 178
    .line 179
    move-object/from16 v40, v1

    .line 180
    .line 181
    iget-object v1, v3, La/gp30;->G:La/dzu;

    .line 182
    .line 183
    move-object/from16 v41, v1

    .line 184
    .line 185
    iget-object v1, v3, La/gp30;->H:La/v88;

    .line 186
    .line 187
    move-object/from16 v42, v1

    .line 188
    .line 189
    iget-object v1, v3, La/gp30;->f:La/peg0;

    .line 190
    .line 191
    move-object/from16 v18, v1

    .line 192
    .line 193
    iget-object v1, v3, La/gp30;->I:La/wyu;

    .line 194
    .line 195
    move-object/from16 v43, v1

    .line 196
    .line 197
    iget-object v1, v3, La/gp30;->K:La/pyu;

    .line 198
    .line 199
    move-object/from16 v44, v1

    .line 200
    .line 201
    iget-object v1, v3, La/gp30;->J:La/q4u;

    .line 202
    .line 203
    move-object/from16 v45, v1

    .line 204
    .line 205
    iget-object v1, v3, La/gp30;->L:La/rou;

    .line 206
    .line 207
    move-object/from16 v46, v1

    .line 208
    .line 209
    iget-object v1, v3, La/gp30;->M:La/sjl0;

    .line 210
    .line 211
    move-object/from16 v47, v1

    .line 212
    .line 213
    iget-object v1, v3, La/gp30;->N:La/ih5;

    .line 214
    .line 215
    move-object/from16 v48, v1

    .line 216
    .line 217
    iget-object v1, v3, La/gp30;->O:La/ih5;

    .line 218
    .line 219
    move-object/from16 v49, v1

    .line 220
    .line 221
    iget-object v1, v3, La/gp30;->P:La/iqt;

    .line 222
    .line 223
    move-object/from16 v50, v1

    .line 224
    .line 225
    iget-object v1, v3, La/gp30;->Q:La/ntu;

    .line 226
    .line 227
    move-object/from16 v51, v1

    .line 228
    .line 229
    iget-object v1, v3, La/gp30;->R:La/epi0;

    .line 230
    .line 231
    move-object/from16 v20, v1

    .line 232
    .line 233
    iget-object v1, v3, La/gp30;->S:La/edo;

    .line 234
    .line 235
    iget-object v3, v3, La/gp30;->T:La/zfo;

    .line 236
    .line 237
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object/from16 v19, v4

    .line 283
    .line 284
    new-instance v4, La/qfi;

    .line 285
    .line 286
    move-object/from16 v52, v1

    .line 287
    .line 288
    move-object/from16 v17, v2

    .line 289
    .line 290
    move-object/from16 v53, v3

    .line 291
    .line 292
    invoke-direct/range {v4 .. v53}, La/qfi;-><init>(La/cad;La/o2j0;La/sue;La/clc;La/wsf0;La/iw20;La/d1p;La/bzu;La/onv;La/vqc;La/iip;La/drm0;La/nr00;La/peg0;La/onv;La/epi0;La/m0k0;La/ms2;La/i1w0;La/duj;La/m1e;La/ctf0;La/wdk0;La/ii;La/lgn0;La/nb7;La/h0f;La/gst0;La/zlt0;La/ouu;La/mii0;La/yo4;La/vqc;La/x0u;La/h3c;La/lbu;La/dzu;La/v88;La/wyu;La/pyu;La/q4u;La/rou;La/sjl0;La/ih5;La/ih5;La/iqt;La/ntu;La/edo;La/zfo;)V

    .line 293
    .line 294
    .line 295
    move-object v6, v4

    .line 296
    move-object/from16 v1, v17

    .line 297
    .line 298
    move-object/from16 v5, v18

    .line 299
    .line 300
    move-object/from16 v2, v27

    .line 301
    .line 302
    move-object/from16 v3, v28

    .line 303
    .line 304
    move-object/from16 v4, v29

    .line 305
    .line 306
    iget-object v6, v6, La/qfi;->a:La/n5d0;

    .line 307
    .line 308
    invoke-interface {v6}, La/o5d0;->get()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    check-cast v6, La/mli;

    .line 313
    .line 314
    iput-object v6, v0, La/b720;->k2:La/mli;

    .line 315
    .line 316
    iput-object v3, v0, La/b720;->l2:La/ii;

    .line 317
    .line 318
    iput-object v4, v0, La/b720;->m2:La/lgn0;

    .line 319
    .line 320
    iget-object v1, v1, La/nr00;->a:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v1, La/clc;

    .line 323
    .line 324
    invoke-virtual {v1}, La/clc;->f()La/iw20;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iput-object v1, v0, La/b720;->n2:La/iw20;

    .line 329
    .line 330
    iget-object v1, v5, La/peg0;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, La/yzn0;

    .line 333
    .line 334
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iput-object v1, v0, La/b720;->o2:La/ynb;

    .line 342
    .line 343
    iput-object v2, v0, La/b720;->p2:La/wdk0;

    .line 344
    .line 345
    invoke-interface {v7}, La/sue;->w()La/vq;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iput-object v1, v0, La/b720;->q2:La/vq;

    .line 353
    .line 354
    invoke-super/range {p0 .. p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 359
    .line 360
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/b720;->u2:La/wjk;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/b720;->u2:La/wjk;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 19
    .line 20
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
