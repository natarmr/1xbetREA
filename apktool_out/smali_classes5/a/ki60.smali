.class public final La/ki60;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ki60;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/htz",
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
.field public static final q2:La/htz;

.field public static final synthetic r2:[La/iiy;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;

.field public final m2:La/cgx0;

.field public final n2:La/zz2;

.field public final o2:La/phf0;

.field public p2:Lkotlin/jvm/functions/Function0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ki60;

    .line 4
    .line 5
    const-string v2, "fromOnboardScreen"

    .line 6
    .line 7
    const-string v3, "getFromOnboardScreen()Z"

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
    const-string v3, "onboardSectionId"

    .line 16
    .line 17
    const-string v5, "getOnboardSectionId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "openedScreenName"

    .line 25
    .line 26
    const-string v6, "getOpenedScreenName()Ljava/lang/String;"

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
    sput-object v1, La/ki60;->r2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/htz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/ki60;->q2:La/htz;

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
    new-instance v0, La/hi60;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/hi60;-><init>(La/ki60;B)V

    .line 8
    .line 9
    .line 10
    sget-object v2, La/wez;->b:La/wez;

    .line 11
    .line 12
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/ki60;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/oi60;

    .line 19
    .line 20
    sget-object v2, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, La/hi60;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v2, p0, v3}, La/hi60;-><init>(La/ki60;B)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0xe

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static {p0, v0, v4, v2, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/ki60;->l2:La/a8z;

    .line 40
    .line 41
    new-instance v0, La/cgx0;

    .line 42
    .line 43
    const-string v2, "BUNDLE_FROM_ONBOARD_SECTION"

    .line 44
    .line 45
    invoke-direct {v0, v2, v1}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/ki60;->m2:La/cgx0;

    .line 49
    .line 50
    new-instance v0, La/zz2;

    .line 51
    .line 52
    const-string v1, "BUNDLE_ONBOARD_SECTION_ID"

    .line 53
    .line 54
    const/4 v2, -0x1

    .line 55
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/ki60;->n2:La/zz2;

    .line 59
    .line 60
    new-instance v0, La/phf0;

    .line 61
    .line 62
    const-string v1, "BUNDLE_OPENED_SCREEN_NAME"

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/ki60;->o2:La/phf0;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    const v1, 0x7c0725d5

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/ki60;->P0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v1}, La/i3t0;->C()La/gmq;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v9, 0x0

    .line 30
    sget-object v11, La/ukd;->a:La/cl5;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    if-ne v3, v11, :cond_1

    .line 35
    .line 36
    :cond_0
    new-instance v3, La/j940;

    .line 37
    .line 38
    const/16 v2, 0x18

    .line 39
    .line 40
    invoke-direct {v3, v0, v9, v2}, La/j940;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    move-object v8, v3

    .line 47
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 48
    .line 49
    sget-object v2, La/lkz;->a:La/lkz;

    .line 50
    .line 51
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v5, La/ji60;

    .line 64
    .line 65
    move-object v6, v1

    .line 66
    check-cast v6, La/i89;

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    invoke-direct/range {v5 .. v10}, La/ji60;-><init>(La/i89;La/clz;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x3

    .line 73
    invoke-static {v2, v9, v9, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, La/ki60;->P0()La/k3t0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/i3t0;

    .line 81
    .line 82
    invoke-virtual {v1, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/vi60;

    .line 91
    .line 92
    iget v1, v1, La/vi60;->e:I

    .line 93
    .line 94
    invoke-virtual {v4, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const/16 v5, 0xe

    .line 103
    .line 104
    if-nez v2, :cond_2

    .line 105
    .line 106
    if-ne v3, v11, :cond_3

    .line 107
    .line 108
    :cond_2
    new-instance v3, La/rip;

    .line 109
    .line 110
    invoke-direct {v3, v7, v5}, La/rip;-><init>(La/pz40;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v2, 0x2

    .line 120
    invoke-static {v1, v3, v4, v8, v2}, La/zk80;->b(ILkotlin/jvm/functions/Function0;La/fet;II)La/kwj;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    or-int/2addr v1, v3

    .line 133
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    if-nez v1, :cond_4

    .line 138
    .line 139
    if-ne v3, v11, :cond_5

    .line 140
    .line 141
    :cond_4
    new-instance v3, La/a540;

    .line 142
    .line 143
    invoke-direct {v3, v0, v9, v5}, La/a540;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 150
    .line 151
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    or-int/2addr v1, v5

    .line 160
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    if-nez v1, :cond_6

    .line 165
    .line 166
    if-ne v5, v11, :cond_7

    .line 167
    .line 168
    :cond_6
    new-instance v5, La/a540;

    .line 169
    .line 170
    const/16 v1, 0xf

    .line 171
    .line 172
    invoke-direct {v5, v0, v3, v1}, La/a540;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    move-object v1, v5

    .line 179
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 180
    .line 181
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    if-nez v3, :cond_8

    .line 190
    .line 191
    if-ne v5, v11, :cond_9

    .line 192
    .line 193
    :cond_8
    new-instance v5, La/hi60;

    .line 194
    .line 195
    invoke-direct {v5, v0, v2}, La/hi60;-><init>(La/ki60;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    move-object v2, v5

    .line 202
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 203
    .line 204
    const/4 v5, 0x0

    .line 205
    const/4 v6, 0x4

    .line 206
    const/4 v3, 0x0

    .line 207
    invoke-static/range {v1 .. v6}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 208
    .line 209
    .line 210
    new-instance v10, La/bw5;

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    invoke-static {v1, v4}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    const-wide/16 v16, 0x0

    .line 218
    .line 219
    const/16 v18, 0x3b

    .line 220
    .line 221
    const/4 v12, 0x0

    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    invoke-static/range {v11 .. v18}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    new-instance v1, La/ngz;

    .line 230
    .line 231
    const/16 v2, 0x17

    .line 232
    .line 233
    invoke-direct {v1, v7, v9, v2}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 234
    .line 235
    .line 236
    const v2, -0x5e1e0bfa

    .line 237
    .line 238
    .line 239
    invoke-static {v2, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    new-instance v1, La/eyn;

    .line 244
    .line 245
    const/16 v2, 0x1a

    .line 246
    .line 247
    invoke-direct {v1, v7, v9, v0, v2}, La/eyn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 248
    .line 249
    .line 250
    const v0, -0x6181be3c

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    const/16 v15, 0xa

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    invoke-direct/range {v10 .. v15}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4, v8}, La/fet;->r(Z)V

    .line 264
    .line 265
    .line 266
    return-object v10
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ki60;->l2:La/a8z;

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

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

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

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ki60;->p2:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
