.class public final La/xsq0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xsq0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final P1:La/y2m0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/xsq0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTitledGridMenuBinding;"

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
    sput-object v1, La/xsq0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/y2m0;

    .line 21
    .line 22
    const/16 v1, 0x16

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/xsq0;->P1:La/y2m0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02f6

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/xsq0;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/vsq0;->a:La/vsq0;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/xsq0;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/tsq0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/tsq0;-><init>(La/xsq0;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, La/xsq0;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v1, La/tsq0;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, La/tsq0;-><init>(La/xsq0;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/xsq0;->N1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/tsq0;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, p0, v1}, La/tsq0;-><init>(La/xsq0;B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/moq0;

    .line 50
    .line 51
    const/4 v3, 0x5

    .line 52
    invoke-direct {v1, v0, v3}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v0, La/moq0;

    .line 56
    .line 57
    const/4 v3, 0x6

    .line 58
    invoke-direct {v0, p0, v3}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance v3, La/moq0;

    .line 62
    .line 63
    const/4 v4, 0x7

    .line 64
    invoke-direct {v3, v0, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-class v2, La/xtq0;

    .line 72
    .line 73
    sget-object v3, La/sre0;->a:La/tre0;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v3, La/r5p0;

    .line 80
    .line 81
    const/16 v4, 0x1c

    .line 82
    .line 83
    invoke-direct {v3, v0, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 84
    .line 85
    .line 86
    new-instance v4, La/r5p0;

    .line 87
    .line 88
    const/16 v5, 0x1d

    .line 89
    .line 90
    invoke-direct {v4, v0, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/xsq0;->O1:La/kiu0;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, La/usq0;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v0, v3}, La/usq0;-><init>(La/xsq0;B)V

    .line 11
    .line 12
    .line 13
    const-string v4, ""

    .line 14
    .line 15
    invoke-static {v1, v0, v4, v2}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/xsq0;->G0()La/a6r;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, La/xsq0;->G0()La/a6r;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, La/xsq0;->G0()La/a6r;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    iget-object v4, v0, La/xsq0;->M1:La/a8z;

    .line 45
    .line 46
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, La/orq0;

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, La/xsq0;->G0()La/a6r;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const v6, 0x7f07072d

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const v6, 0x7f0701bb

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-static {}, La/cy7;->c()Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-class v5, La/cc;

    .line 88
    .line 89
    const-class v6, La/i140;

    .line 90
    .line 91
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    new-instance v7, La/fvl;

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    move v10, v9

    .line 103
    move v12, v11

    .line 104
    invoke-direct/range {v7 .. v14}, La/fvl;-><init>(IIIIIZLjava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, La/xsq0;->G0()La/a6r;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v1, v1, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 115
    .line 116
    sget-object v5, La/sre0;->a:La/tre0;

    .line 117
    .line 118
    const-class v6, La/g140;

    .line 119
    .line 120
    invoke-virtual {v5, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    const-class v7, La/w140;

    .line 125
    .line 126
    invoke-virtual {v5, v7}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    const-class v8, La/h140;

    .line 131
    .line 132
    invoke-virtual {v5, v8}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    const-class v9, La/l140;

    .line 137
    .line 138
    invoke-virtual {v5, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    const-class v10, La/k140;

    .line 143
    .line 144
    invoke-virtual {v5, v10}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    const-class v11, La/n140;

    .line 149
    .line 150
    invoke-virtual {v5, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    const-class v12, La/d240;

    .line 155
    .line 156
    invoke-virtual {v5, v12}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    const-class v13, La/a240;

    .line 161
    .line 162
    invoke-virtual {v5, v13}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    const-class v14, La/c240;

    .line 167
    .line 168
    invoke-virtual {v5, v14}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    const-class v15, La/m140;

    .line 173
    .line 174
    invoke-virtual {v5, v15}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    move/from16 p1, v3

    .line 179
    .line 180
    const-class v3, La/j140;

    .line 181
    .line 182
    invoke-virtual {v5, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    move/from16 v16, v2

    .line 187
    .line 188
    const-class v2, La/b240;

    .line 189
    .line 190
    invoke-virtual {v5, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-class v0, La/v140;

    .line 195
    .line 196
    invoke-virtual {v5, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const/16 v5, 0xd

    .line 201
    .line 202
    new-array v5, v5, [La/sgy;

    .line 203
    .line 204
    aput-object v6, v5, p1

    .line 205
    .line 206
    aput-object v7, v5, v16

    .line 207
    .line 208
    const/4 v6, 0x2

    .line 209
    aput-object v8, v5, v6

    .line 210
    .line 211
    const/4 v6, 0x3

    .line 212
    aput-object v9, v5, v6

    .line 213
    .line 214
    const/4 v6, 0x4

    .line 215
    aput-object v10, v5, v6

    .line 216
    .line 217
    const/4 v6, 0x5

    .line 218
    aput-object v11, v5, v6

    .line 219
    .line 220
    const/4 v6, 0x6

    .line 221
    aput-object v12, v5, v6

    .line 222
    .line 223
    const/4 v6, 0x7

    .line 224
    aput-object v13, v5, v6

    .line 225
    .line 226
    const/16 v6, 0x8

    .line 227
    .line 228
    aput-object v14, v5, v6

    .line 229
    .line 230
    const/16 v6, 0x9

    .line 231
    .line 232
    aput-object v15, v5, v6

    .line 233
    .line 234
    const/16 v6, 0xa

    .line 235
    .line 236
    aput-object v3, v5, v6

    .line 237
    .line 238
    const/16 v3, 0xb

    .line 239
    .line 240
    aput-object v2, v5, v3

    .line 241
    .line 242
    const/16 v2, 0xc

    .line 243
    .line 244
    aput-object v0, v5, v2

    .line 245
    .line 246
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, La/orq0;

    .line 255
    .line 256
    invoke-static {v1, v0, v2}, La/dtb;->u(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;La/qv5;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {p0 .. p0}, La/xsq0;->G0()La/a6r;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v0, v0, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 264
    .line 265
    move/from16 v1, v16

    .line 266
    .line 267
    invoke-static {v0, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 268
    .line 269
    .line 270
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/xsq0;->H0()La/xtq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/r040;->c:La/r040;

    .line 6
    .line 7
    sget-object v2, La/r040;->g:La/r040;

    .line 8
    .line 9
    sget-object v3, La/r040;->e:La/r040;

    .line 10
    .line 11
    sget-object v4, La/r040;->k:La/r040;

    .line 12
    .line 13
    sget-object v5, La/r040;->m:La/r040;

    .line 14
    .line 15
    sget-object v6, La/r040;->i:La/r040;

    .line 16
    .line 17
    filled-new-array/range {v1 .. v6}, [La/r040;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, La/xtq0;->c:La/pru;

    .line 29
    .line 30
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v2, v2, La/sff0;->d:La/q1w0;

    .line 35
    .line 36
    iget-object v2, v2, La/q1w0;->a:La/dyv0;

    .line 37
    .line 38
    iget-object v2, v2, La/dyv0;->b:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, v0, La/xtq0;->D0:La/p7m0;

    .line 41
    .line 42
    iget-object v4, v0, La/xtq0;->d0:La/pzt;

    .line 43
    .line 44
    invoke-virtual {v4}, La/pzt;->a()La/h2c;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-object v5, v0, La/xtq0;->c0:La/hqx;

    .line 49
    .line 50
    invoke-virtual {v5}, La/hqx;->a()La/p7m0;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, La/uu2;

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    invoke-direct {v6, v0, v1, v2, v11}, La/uu2;-><init>(La/xtq0;Ljava/util/List;Ljava/lang/String;La/yje;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3, v4, v5, v6}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, La/lkz;->a:La/lkz;

    .line 65
    .line 66
    new-instance v2, La/bdl0;

    .line 67
    .line 68
    iget-object v1, p0, La/xsq0;->M1:La/a8z;

    .line 69
    .line 70
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, La/orq0;

    .line 76
    .line 77
    const/4 v8, 0x4

    .line 78
    const/16 v9, 0x1c

    .line 79
    .line 80
    const/4 v3, 0x2

    .line 81
    const-class v5, La/orq0;

    .line 82
    .line 83
    const-string v6, "setItems"

    .line 84
    .line 85
    const-string v7, "setItems(Ljava/util/List;)V"

    .line 86
    .line 87
    invoke-direct/range {v2 .. v9}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 91
    .line 92
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v3, La/hlq0;

    .line 97
    .line 98
    invoke-direct {v3, v0, p0, v2, v11}, La/hlq0;-><init>(La/a1g;La/xsq0;La/bdl0;La/yje;)V

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x3

    .line 102
    invoke-static {v1, v11, v11, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, La/xsq0;->H0()La/xtq0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, La/xtq0;->B0:La/p7m0;

    .line 110
    .line 111
    new-instance v2, La/wsq0;

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-direct {v2, p0, v11, v3}, La/wsq0;-><init>(La/xsq0;La/yje;B)V

    .line 115
    .line 116
    .line 117
    sget-object v3, La/lkz;->a:La/lkz;

    .line 118
    .line 119
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    new-instance v5, La/hlq0;

    .line 132
    .line 133
    invoke-direct {v5, v1, v3, v2, v11}, La/hlq0;-><init>(La/gmq;La/clz;La/wsq0;La/yje;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v4, v11, v11, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, La/xsq0;->H0()La/xtq0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v8, v1, La/xtq0;->C0:La/ol60;

    .line 144
    .line 145
    new-instance v10, La/wsq0;

    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-direct {v10, p0, v11, v1}, La/wsq0;-><init>(La/xsq0;La/yje;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    new-instance v7, La/hlq0;

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    invoke-direct/range {v7 .. v12}, La/hlq0;-><init>(La/gmq;La/clz;La/wsq0;La/yje;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0, v11, v11, v7, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final G0()La/a6r;
    .locals 2

    .line 1
    sget-object v0, La/xsq0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/xsq0;->L1:La/s0r;

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
    check-cast p0, La/a6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/xtq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xsq0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xtq0;

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/b0l0;

    .line 9
    .line 10
    const/16 v1, 0x14

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "UPDATED_BALANCE_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xsq0;->G0()La/a6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/a6r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/xsq0;->H0()La/xtq0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/xtq0;->z()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/xsq0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
