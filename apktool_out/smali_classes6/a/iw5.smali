.class public abstract La/iw5;
.super La/yo8;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\t\u00b2\u0006\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "La/iw5;",
        "La/yo8;",
        "<init>",
        "()V",
        "a/dw5",
        "a/cw5",
        "a/bw5",
        "Landroidx/compose/ui/platform/ComposeView;",
        "container",
        "uikit"
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
.field public static final synthetic j2:[La/iiy;


# instance fields
.field public final Y1:La/fw5;

.field public final Z1:La/fw5;

.field public a2:Z

.field public b2:Z

.field public c2:Z

.field public d2:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public e2:Z

.field public f2:Landroid/view/View;

.field public g2:Z

.field public final h2:La/fvt0;

.field public final i2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/iw5;

    .line 4
    .line 5
    const-string v2, "fullScreenAnimationFix"

    .line 6
    .line 7
    const-string v3, "getFullScreenAnimationFix()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/iw5;->j2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/yo8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fw5;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/fw5;-><init>(La/iw5;B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/iw5;->Y1:La/fw5;

    .line 11
    .line 12
    new-instance v0, La/fw5;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, La/fw5;-><init>(La/iw5;B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/iw5;->Z1:La/fw5;

    .line 19
    .line 20
    iput-boolean v1, p0, La/iw5;->a2:Z

    .line 21
    .line 22
    new-instance v0, La/fvt0;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/iw5;->h2:La/fvt0;

    .line 28
    .line 29
    new-instance v0, La/zo4;

    .line 30
    .line 31
    const/16 v1, 0xd

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v1, La/wez;->b:La/wez;

    .line 37
    .line 38
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/iw5;->i2:La/a8z;

    .line 43
    .line 44
    return-void
.end method

.method public static K0(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a0388

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of v0, p0, Landroid/view/View;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p0, v1

    .line 24
    :goto_0
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-static {p0}, La/iw5;->K0(Landroid/view/View;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    return-object v1
.end method

.method public static O0(ILa/fet;)La/cw5;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p0, v0

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :goto_0
    move v3, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :goto_1
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    new-instance v1, La/cw5;

    .line 18
    .line 19
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 20
    .line 21
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 26
    .line 27
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 28
    .line 29
    .line 30
    move-result-wide v7

    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, La/kel;->a:La/kel;

    .line 35
    .line 36
    invoke-direct/range {v1 .. v8}, La/cw5;-><init>(ZZZZLa/lel;J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p0, v1

    .line 43
    :cond_1
    check-cast p0, La/cw5;

    .line 44
    .line 45
    return-object p0
.end method


# virtual methods
.method public C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/hw5;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, La/hw5;-><init>(La/iw5;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final I0(La/bw5;La/fet;I)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move/from16 v2, p3

    .line 8
    .line 9
    const v4, -0x1dfe5b87

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v4}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v4, 0x2

    .line 24
    :goto_0
    or-int/2addr v4, v2

    .line 25
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    const/16 v5, 0x20

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v5, 0x10

    .line 35
    .line 36
    :goto_1
    or-int/2addr v4, v5

    .line 37
    and-int/lit8 v5, v4, 0x13

    .line 38
    .line 39
    const/16 v6, 0x12

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eq v5, v6, :cond_2

    .line 44
    .line 45
    move v5, v7

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v5, v8

    .line 48
    :goto_2
    and-int/2addr v4, v7

    .line 49
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_19

    .line 54
    .line 55
    invoke-virtual {v0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-object v4, v3, La/bw5;->a:La/cw5;

    .line 60
    .line 61
    iget-boolean v6, v4, La/cw5;->d:Z

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    const v6, 0x3ecccccd    # 0.4f

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/4 v6, 0x0

    .line 70
    :goto_3
    invoke-virtual {v0}, La/sik;->D0()Landroid/app/Dialog;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v9}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    if-eqz v9, :cond_4

    .line 79
    .line 80
    invoke-virtual {v9, v6}, Landroid/view/Window;->setDimAmount(F)V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget-boolean v6, v4, La/cw5;->d:Z

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    if-nez v6, :cond_7

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    instance-of v10, v6, Landroid/view/ViewGroup;

    .line 97
    .line 98
    if-eqz v10, :cond_5

    .line 99
    .line 100
    check-cast v6, Landroid/view/ViewGroup;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move-object v6, v9

    .line 104
    :goto_4
    if-eqz v6, :cond_7

    .line 105
    .line 106
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    instance-of v10, v6, Landroid/view/ViewGroup;

    .line 117
    .line 118
    if-eqz v10, :cond_6

    .line 119
    .line 120
    check-cast v6, Landroid/view/ViewGroup;

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_6
    move-object v6, v9

    .line 124
    :goto_5
    if-eqz v6, :cond_7

    .line 125
    .line 126
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 130
    .line 131
    .line 132
    :cond_7
    iget-object v6, v3, La/bw5;->d:La/xdr;

    .line 133
    .line 134
    if-eqz v6, :cond_8

    .line 135
    .line 136
    move/from16 v19, v7

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_8
    move/from16 v19, v8

    .line 140
    .line 141
    :goto_6
    iget-boolean v6, v4, La/cw5;->a:Z

    .line 142
    .line 143
    iget-boolean v10, v4, La/cw5;->b:Z

    .line 144
    .line 145
    move v11, v10

    .line 146
    iget-boolean v10, v4, La/cw5;->c:Z

    .line 147
    .line 148
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    sget-object v13, La/ukd;->a:La/cl5;

    .line 153
    .line 154
    if-ne v12, v13, :cond_9

    .line 155
    .line 156
    const v12, 0x3dcccccd    # 0.1f

    .line 157
    .line 158
    .line 159
    invoke-static {v12}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_9
    check-cast v12, La/agk0;

    .line 167
    .line 168
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    if-nez v14, :cond_a

    .line 177
    .line 178
    if-ne v15, v13, :cond_b

    .line 179
    .line 180
    :cond_a
    new-instance v15, La/qo5;

    .line 181
    .line 182
    const/16 v14, 0x9

    .line 183
    .line 184
    invoke-direct {v15, v5, v12, v14}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_b
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 191
    .line 192
    sget-object v14, La/jm40;->b:La/jm40;

    .line 193
    .line 194
    invoke-static {v14, v15}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    const-string v15, "BOTTOM_SHEET_DIALOG"

    .line 199
    .line 200
    invoke-static {v14, v15}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    iget-boolean v15, v4, La/cw5;->d:Z

    .line 205
    .line 206
    xor-int/2addr v15, v7

    .line 207
    move/from16 v16, v8

    .line 208
    .line 209
    if-eqz v19, :cond_c

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_c
    move v8, v6

    .line 213
    :goto_7
    move-object/from16 v17, v9

    .line 214
    .line 215
    if-eqz v19, :cond_d

    .line 216
    .line 217
    move/from16 v9, v16

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_d
    move v9, v11

    .line 221
    :goto_8
    if-eqz v19, :cond_e

    .line 222
    .line 223
    move/from16 v7, v16

    .line 224
    .line 225
    :goto_9
    move v1, v11

    .line 226
    goto :goto_b

    .line 227
    :cond_e
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 228
    .line 229
    const/16 v1, 0x1d

    .line 230
    .line 231
    if-le v7, v1, :cond_f

    .line 232
    .line 233
    const/4 v1, 0x1

    .line 234
    goto :goto_a

    .line 235
    :cond_f
    move/from16 v1, v16

    .line 236
    .line 237
    :goto_a
    move v7, v1

    .line 238
    goto :goto_9

    .line 239
    :goto_b
    iget-object v11, v4, La/cw5;->e:La/lel;

    .line 240
    .line 241
    move-object/from16 v20, v5

    .line 242
    .line 243
    iget-wide v4, v4, La/cw5;->f:J

    .line 244
    .line 245
    move-object/from16 v21, v13

    .line 246
    .line 247
    move-wide/from16 v25, v4

    .line 248
    .line 249
    move-object v5, v12

    .line 250
    move-wide/from16 v12, v25

    .line 251
    .line 252
    move-object v4, v14

    .line 253
    iget-object v14, v3, La/bw5;->b:La/xdr;

    .line 254
    .line 255
    move/from16 v22, v6

    .line 256
    .line 257
    move v6, v15

    .line 258
    iget-object v15, v3, La/bw5;->c:La/xdr;

    .line 259
    .line 260
    move/from16 v23, v1

    .line 261
    .line 262
    iget-object v1, v3, La/bw5;->e:La/ugd;

    .line 263
    .line 264
    const/16 v24, 0x1

    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    move-object/from16 v24, v20

    .line 269
    .line 270
    move-object/from16 v20, v5

    .line 271
    .line 272
    move-object/from16 v5, v24

    .line 273
    .line 274
    move/from16 v24, v23

    .line 275
    .line 276
    move/from16 v23, v16

    .line 277
    .line 278
    move-object/from16 v16, v1

    .line 279
    .line 280
    move-object/from16 v1, v21

    .line 281
    .line 282
    move-object/from16 v21, v17

    .line 283
    .line 284
    move-object/from16 v17, p2

    .line 285
    .line 286
    invoke-static/range {v4 .. v18}, La/i4w0;->j(La/mm40;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;ZZZZZLa/lel;JLa/xdr;La/xdr;La/xdr;La/fet;I)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v8, v17

    .line 290
    .line 291
    iput-boolean v10, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v20}, La/agk0;->l()F

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    iput v4, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:F

    .line 298
    .line 299
    if-eqz v19, :cond_18

    .line 300
    .line 301
    const v4, -0x62b74282

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-ne v4, v1, :cond_10

    .line 312
    .line 313
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-static {v4}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_10
    check-cast v4, La/qz40;

    .line 325
    .line 326
    sget-object v5, La/dy2;->f:La/zfn;

    .line 327
    .line 328
    invoke-virtual {v8, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    check-cast v5, Landroid/view/View;

    .line 333
    .line 334
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    if-ne v6, v1, :cond_11

    .line 339
    .line 340
    invoke-static/range {v21 .. v21}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_11
    check-cast v6, La/pz40;

    .line 348
    .line 349
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    check-cast v7, Landroidx/compose/ui/platform/ComposeView;

    .line 354
    .line 355
    if-nez v7, :cond_14

    .line 356
    .line 357
    const v7, -0x62b51aaf

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v7}, La/fet;->e0(I)V

    .line 361
    .line 362
    .line 363
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    invoke-virtual {v8, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v9

    .line 369
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    if-nez v9, :cond_13

    .line 374
    .line 375
    if-ne v10, v1, :cond_12

    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_12
    move-object/from16 v11, v21

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_13
    :goto_c
    new-instance v10, La/cm3;

    .line 382
    .line 383
    const/16 v9, 0x15

    .line 384
    .line 385
    move-object/from16 v11, v21

    .line 386
    .line 387
    invoke-direct {v10, v0, v6, v11, v9}, La/cm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :goto_d
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 394
    .line 395
    invoke-static {v8, v7, v10}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    move/from16 v9, v23

    .line 399
    .line 400
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_e

    .line 404
    :cond_14
    move-object/from16 v11, v21

    .line 405
    .line 406
    move/from16 v9, v23

    .line 407
    .line 408
    const v7, -0x62b3d057

    .line 409
    .line 410
    .line 411
    invoke-virtual {v8, v7}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 415
    .line 416
    .line 417
    :goto_e
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    move-object v10, v6

    .line 422
    check-cast v10, Landroidx/compose/ui/platform/ComposeView;

    .line 423
    .line 424
    if-nez v10, :cond_15

    .line 425
    .line 426
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    if-eqz v1, :cond_1a

    .line 434
    .line 435
    new-instance v4, La/zv5;

    .line 436
    .line 437
    invoke-direct {v4, v0, v3, v2, v9}, La/zv5;-><init>(La/iw5;La/bw5;IB)V

    .line 438
    .line 439
    .line 440
    iput-object v4, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 441
    .line 442
    return-void

    .line 443
    :cond_15
    invoke-virtual {v8, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v7

    .line 451
    or-int/2addr v6, v7

    .line 452
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v7

    .line 456
    or-int/2addr v6, v7

    .line 457
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    if-nez v6, :cond_16

    .line 462
    .line 463
    if-ne v7, v1, :cond_17

    .line 464
    .line 465
    :cond_16
    new-instance v7, La/on;

    .line 466
    .line 467
    const/16 v1, 0x17

    .line 468
    .line 469
    invoke-direct {v7, v5, v10, v4, v1}, La/on;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :cond_17
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 476
    .line 477
    invoke-static {v5, v7, v8}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 478
    .line 479
    .line 480
    sget-object v1, La/bmd;->h:La/zfn;

    .line 481
    .line 482
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    check-cast v1, La/w6k;

    .line 487
    .line 488
    sget-object v1, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 489
    .line 490
    invoke-static {v8}, La/zcm0;->i(La/fet;)La/djv0;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    iget-object v1, v1, La/djv0;->e:La/q33;

    .line 495
    .line 496
    invoke-virtual {v1}, La/q33;->e()La/pfx;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    iget v6, v1, La/pfx;->d:I

    .line 501
    .line 502
    new-instance v1, La/aw5;

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    move v12, v2

    .line 506
    move-object v2, v4

    .line 507
    move/from16 v4, v22

    .line 508
    .line 509
    move/from16 v5, v24

    .line 510
    .line 511
    invoke-direct/range {v1 .. v7}, La/aw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZIB)V

    .line 512
    .line 513
    .line 514
    const v2, 0x68c901a8

    .line 515
    .line 516
    .line 517
    invoke-static {v2, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-static {v10, v11, v1}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 525
    .line 526
    .line 527
    goto :goto_f

    .line 528
    :cond_18
    move v12, v2

    .line 529
    move/from16 v9, v23

    .line 530
    .line 531
    const v1, -0x62955037

    .line 532
    .line 533
    .line 534
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 538
    .line 539
    .line 540
    goto :goto_f

    .line 541
    :cond_19
    move-object v8, v1

    .line 542
    move v12, v2

    .line 543
    invoke-virtual {v8}, La/fet;->X()V

    .line 544
    .line 545
    .line 546
    :goto_f
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    if-eqz v1, :cond_1a

    .line 551
    .line 552
    new-instance v2, La/zv5;

    .line 553
    .line 554
    const/4 v4, 0x1

    .line 555
    invoke-direct {v2, v0, v3, v12, v4}, La/zv5;-><init>(La/iw5;La/bw5;IB)V

    .line 556
    .line 557
    .line 558
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 559
    .line 560
    :cond_1a
    return-void
.end method

.method public abstract J0(La/fet;)La/bw5;
.end method

.method public final L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 1

    .line 1
    iget-object p0, p0, La/iw5;->Y1:La/fw5;

    .line 2
    .line 3
    iget-object v0, p0, La/dw5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/fw5;->i()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, La/dw5;->b:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    return-object v0
.end method

.method public M0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, La/iw5;->g2:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v2}, La/iw5;->K0(Landroid/view/View;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v3, v4

    .line 29
    :goto_0
    instance-of v5, v3, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, Landroid/view/View;

    .line 35
    .line 36
    :cond_1
    iput-object v4, p0, La/iw5;->f2:Landroid/view/View;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v3, La/yv5;

    .line 41
    .line 42
    invoke-direct {v3, p0, v0, v1}, La/yv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    const/16 v4, 0x23

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    if-lt v3, v4, :cond_3

    .line 54
    .line 55
    move v1, v5

    .line 56
    :cond_3
    xor-int/2addr v1, v5

    .line 57
    new-instance v3, La/o24;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-boolean v1, v3, La/o24;->a:Z

    .line 63
    .line 64
    iput-object p0, v3, La/o24;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v2, v3, La/o24;->c:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v0, v3, La/o24;->d:Ljava/lang/Object;

    .line 69
    .line 70
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-static {v2, v3}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    return-void
.end method

.method public N0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 20
    .line 21
    .line 22
    new-instance p3, La/wv5;

    .line 23
    .line 24
    invoke-direct {p3, p0, p2}, La/wv5;-><init>(La/iw5;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const p2, 0x759636a1

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {p0, p2, v1, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public Z()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/iw5;->d2:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, La/iw5;->i2:La/a8z;

    .line 9
    .line 10
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/po8;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/iw5;->Y1:La/fw5;

    .line 22
    .line 23
    iput-object v0, v1, La/dw5;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p0, La/iw5;->Z1:La/fw5;

    .line 26
    .line 27
    iput-object v0, v1, La/dw5;->b:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v1, p0, La/iw5;->f2:Landroid/view/View;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-object v0, p0, La/iw5;->f2:Landroid/view/View;

    .line 37
    .line 38
    iget-boolean v0, p0, La/iw5;->b2:Z

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v2, La/ani0;

    .line 58
    .line 59
    invoke-direct {v2, v1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v3, 0x23

    .line 65
    .line 66
    if-lt v1, v3, :cond_1

    .line 67
    .line 68
    new-instance v1, La/bjv0;

    .line 69
    .line 70
    invoke-direct {v1, v0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/16 v3, 0x1e

    .line 75
    .line 76
    if-lt v1, v3, :cond_2

    .line 77
    .line 78
    new-instance v1, La/ajv0;

    .line 79
    .line 80
    invoke-direct {v1, v0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/16 v3, 0x1a

    .line 85
    .line 86
    if-lt v1, v3, :cond_3

    .line 87
    .line 88
    new-instance v1, La/ziv0;

    .line 89
    .line 90
    invoke-direct {v1, v0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance v1, La/yiv0;

    .line 95
    .line 96
    invoke-direct {v1, v0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    const/16 v0, 0x207

    .line 100
    .line 101
    invoke-virtual {v1, v0}, La/ycm0;->s(I)V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-super {p0}, La/sik;->Z()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public e0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-static {p0, v0}, La/hfm0;->u(Landroid/view/Window;Landroid/view/Window;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/iw5;->c2:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const v1, 0x7f1405a3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, La/iw5;->c2:Z

    .line 27
    .line 28
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const v1, 0x7f1405a2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, La/iw5;->K0(Landroid/view/View;)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-string v0, "Current screen: "

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "onCreateDialog"

    .line 19
    .line 20
    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/mjv0;->a:La/ljv0;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, La/ljv0;->b:La/njv0;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, La/njv0;->b(Landroid/content/Context;)La/kjv0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/kjv0;->a:La/tq8;

    .line 46
    .line 47
    invoke-virtual {v0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    int-to-float v0, v0

    .line 56
    const v1, 0x3f2aaaab

    .line 57
    .line 58
    .line 59
    mul-float/2addr v0, v1

    .line 60
    float-to-int v0, v0

    .line 61
    invoke-virtual {p2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(I)V

    .line 62
    .line 63
    .line 64
    new-instance p2, La/xv5;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-direct {p2, p1, v0}, La/xv5;-><init>(Landroid/view/View;B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 71
    .line 72
    .line 73
    const/4 p2, 0x1

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 78
    .line 79
    .line 80
    new-instance p1, La/kie0;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x4

    .line 86
    iput v1, p1, La/kie0;->a:I

    .line 87
    .line 88
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, La/ew5;

    .line 93
    .line 94
    invoke-direct {v2, p1, p0}, La/ew5;-><init>(La/kie0;La/iw5;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y(La/po8;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget p1, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 109
    .line 110
    iget-object v1, p0, La/iw5;->Y1:La/fw5;

    .line 111
    .line 112
    iget-object v1, v1, La/dw5;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 115
    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    const/16 v2, 0x258

    .line 119
    .line 120
    if-lt p1, v2, :cond_0

    .line 121
    .line 122
    const/16 p1, 0x200

    .line 123
    .line 124
    invoke-static {p1}, La/f7k;->M(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const/4 p1, -0x1

    .line 130
    :goto_0
    iput p1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 131
    .line 132
    :cond_1
    invoke-virtual {p0}, La/iw5;->M0()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, La/iw5;->N0()V

    .line 136
    .line 137
    .line 138
    sget-object p1, La/iw5;->j2:[La/iiy;

    .line 139
    .line 140
    aget-object v1, p1, v0

    .line 141
    .line 142
    iget-object v2, p0, La/iw5;->h2:La/fvt0;

    .line 143
    .line 144
    invoke-virtual {v2, p0, v1}, La/fvt0;->t(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_2

    .line 153
    .line 154
    goto/16 :goto_2

    .line 155
    .line 156
    :cond_2
    aget-object p1, p1, v0

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 162
    .line 163
    if-nez p1, :cond_3

    .line 164
    .line 165
    new-instance p1, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    const-string v0, "FULL_SCREEN_ANIMATION_FIX"

    .line 174
    .line 175
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 176
    .line 177
    .line 178
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 179
    .line 180
    iput-object p1, v2, La/fvt0;->a:Ljava/lang/Object;

    .line 181
    .line 182
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 198
    .line 199
    invoke-static {p1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-eqz p1, :cond_7

    .line 204
    .line 205
    iget-object p1, p1, La/xiv0;->a:La/uiv0;

    .line 206
    .line 207
    invoke-virtual {p1, p2}, La/uiv0;->u(I)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-nez p1, :cond_7

    .line 212
    .line 213
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    if-eqz p1, :cond_7

    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v1, La/ani0;

    .line 228
    .line 229
    invoke-direct {v1, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 233
    .line 234
    const/16 v2, 0x23

    .line 235
    .line 236
    if-lt v0, v2, :cond_4

    .line 237
    .line 238
    new-instance v0, La/bjv0;

    .line 239
    .line 240
    invoke-direct {v0, p1, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_4
    const/16 v2, 0x1e

    .line 245
    .line 246
    if-lt v0, v2, :cond_5

    .line 247
    .line 248
    new-instance v0, La/ajv0;

    .line 249
    .line 250
    invoke-direct {v0, p1, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_5
    const/16 v2, 0x1a

    .line 255
    .line 256
    if-lt v0, v2, :cond_6

    .line 257
    .line 258
    new-instance v0, La/ziv0;

    .line 259
    .line 260
    invoke-direct {v0, p1, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_6
    new-instance v0, La/yiv0;

    .line 265
    .line 266
    invoke-direct {v0, p1, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 267
    .line 268
    .line 269
    :goto_1
    const/16 p1, 0x207

    .line 270
    .line 271
    invoke-virtual {v0, p1}, La/ycm0;->s(I)V

    .line 272
    .line 273
    .line 274
    const/4 p1, 0x2

    .line 275
    invoke-virtual {v0, p1}, La/ycm0;->x(I)V

    .line 276
    .line 277
    .line 278
    iput-boolean p2, p0, La/iw5;->b2:Z

    .line 279
    .line 280
    :cond_7
    :goto_2
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    iget p1, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 8
    .line 9
    iget-object p0, p0, La/iw5;->Y1:La/fw5;

    .line 10
    .line 11
    iget-object p0, p0, La/dw5;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x258

    .line 18
    .line 19
    if-lt p1, v0, :cond_0

    .line 20
    .line 21
    const/16 p1, 0x200

    .line 22
    .line 23
    invoke-static {p1}, La/f7k;->M(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, -0x1

    .line 29
    :goto_0
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method
