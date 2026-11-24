.class public final La/d2b0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/tah0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/d2b0;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final S1:La/rl70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public P1:La/roq0;

.field public final Q1:Z

.field public R1:La/tah0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/d2b0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/popular/classic/impl/databinding/FragmentPopularClassicAggregatorBinding;"

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
    sput-object v1, La/d2b0;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/d2b0;->S1:La/rl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0287

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/v3b0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/ssa0;

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-direct {v1, p0, v2}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/d2b0;->L1:La/a8z;

    .line 26
    .line 27
    sget-object v0, La/c2b0;->a:La/c2b0;

    .line 28
    .line 29
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/d2b0;->M1:La/s0r;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, La/d2b0;->Q1:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 38

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
    const-class v2, La/iza0;

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
    instance-of v4, v1, La/iza0;

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
    check-cast v3, La/iza0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v7, v3, La/iza0;->b:La/ok50;

    .line 65
    .line 66
    iget-object v6, v3, La/iza0;->c:La/jw20;

    .line 67
    .line 68
    iget-object v12, v3, La/iza0;->d:La/poq0;

    .line 69
    .line 70
    iget-object v5, v3, La/iza0;->a:La/cad;

    .line 71
    .line 72
    iget-object v15, v3, La/iza0;->f:La/m1e;

    .line 73
    .line 74
    iget-object v1, v3, La/iza0;->g:La/duj;

    .line 75
    .line 76
    iget-object v13, v3, La/iza0;->x:La/ii;

    .line 77
    .line 78
    iget-object v8, v3, La/iza0;->w:La/wsf0;

    .line 79
    .line 80
    iget-object v2, v3, La/iza0;->i:La/iqt;

    .line 81
    .line 82
    iget-object v4, v3, La/iza0;->j:La/kc60;

    .line 83
    .line 84
    iget-object v9, v3, La/iza0;->k:La/u58;

    .line 85
    .line 86
    iget-object v10, v3, La/iza0;->l:La/bn6;

    .line 87
    .line 88
    iget-object v11, v3, La/iza0;->m:La/pru;

    .line 89
    .line 90
    move-object/from16 v16, v1

    .line 91
    .line 92
    iget-object v1, v3, La/iza0;->e:La/gii0;

    .line 93
    .line 94
    move-object/from16 v22, v1

    .line 95
    .line 96
    iget-object v1, v3, La/iza0;->h:La/uyu;

    .line 97
    .line 98
    move-object/from16 v23, v1

    .line 99
    .line 100
    iget-object v1, v3, La/iza0;->n:La/oeg0;

    .line 101
    .line 102
    move-object/from16 v17, v1

    .line 103
    .line 104
    iget-object v1, v3, La/iza0;->o:La/btt0;

    .line 105
    .line 106
    move-object/from16 v18, v1

    .line 107
    .line 108
    iget-object v1, v3, La/iza0;->p:La/ctf0;

    .line 109
    .line 110
    move-object/from16 v24, v1

    .line 111
    .line 112
    iget-object v1, v3, La/iza0;->q:La/knf0;

    .line 113
    .line 114
    move-object/from16 v25, v1

    .line 115
    .line 116
    iget-object v1, v3, La/iza0;->r:La/j1q0;

    .line 117
    .line 118
    move-object/from16 v26, v1

    .line 119
    .line 120
    iget-object v1, v3, La/iza0;->s:La/gg5;

    .line 121
    .line 122
    move-object/from16 v27, v1

    .line 123
    .line 124
    iget-object v1, v3, La/iza0;->t:La/ix0;

    .line 125
    .line 126
    move-object/from16 v28, v1

    .line 127
    .line 128
    iget-object v1, v3, La/iza0;->y:La/x2c0;

    .line 129
    .line 130
    move-object/from16 v29, v1

    .line 131
    .line 132
    iget-object v1, v3, La/iza0;->z:La/b3c0;

    .line 133
    .line 134
    move-object/from16 v20, v9

    .line 135
    .line 136
    iget-object v9, v3, La/iza0;->u:La/peg0;

    .line 137
    .line 138
    move-object/from16 v19, v1

    .line 139
    .line 140
    iget-object v1, v3, La/iza0;->A:La/wdk0;

    .line 141
    .line 142
    move-object/from16 v21, v19

    .line 143
    .line 144
    move-object/from16 v19, v10

    .line 145
    .line 146
    iget-object v10, v3, La/iza0;->B:La/nr00;

    .line 147
    .line 148
    move-object/from16 v30, v1

    .line 149
    .line 150
    iget-object v1, v3, La/iza0;->C:La/ouu;

    .line 151
    .line 152
    move-object/from16 v31, v1

    .line 153
    .line 154
    iget-object v1, v3, La/iza0;->v:La/kib0;

    .line 155
    .line 156
    move-object/from16 v32, v21

    .line 157
    .line 158
    move-object/from16 v21, v11

    .line 159
    .line 160
    iget-object v11, v3, La/iza0;->D:La/wsf0;

    .line 161
    .line 162
    move-object/from16 v33, v1

    .line 163
    .line 164
    iget-object v1, v3, La/iza0;->E:La/r9u;

    .line 165
    .line 166
    move-object/from16 v34, v1

    .line 167
    .line 168
    iget-object v1, v3, La/iza0;->F:La/bzt;

    .line 169
    .line 170
    move-object/from16 v35, v1

    .line 171
    .line 172
    iget-object v1, v3, La/iza0;->G:La/c5k;

    .line 173
    .line 174
    move-object/from16 v36, v1

    .line 175
    .line 176
    iget-object v1, v3, La/iza0;->H:La/nw20;

    .line 177
    .line 178
    move-object/from16 v37, v1

    .line 179
    .line 180
    iget-object v1, v3, La/iza0;->I:La/jdk0;

    .line 181
    .line 182
    iget-object v3, v3, La/iza0;->J:La/ytt;

    .line 183
    .line 184
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object/from16 v18, v4

    .line 224
    .line 225
    new-instance v4, La/o9i;

    .line 226
    .line 227
    move-object/from16 v17, v2

    .line 228
    .line 229
    move-object/from16 v32, v35

    .line 230
    .line 231
    move-object/from16 v33, v36

    .line 232
    .line 233
    move-object/from16 v34, v37

    .line 234
    .line 235
    move-object/from16 v35, v1

    .line 236
    .line 237
    move-object/from16 v36, v3

    .line 238
    .line 239
    invoke-direct/range {v4 .. v36}, La/o9i;-><init>(La/cad;La/jw20;La/ok50;La/wsf0;La/peg0;La/nr00;La/wsf0;La/poq0;La/ii;La/i1w0;La/m1e;La/duj;La/iqt;La/kc60;La/bn6;La/u58;La/pru;La/gii0;La/uyu;La/ctf0;La/knf0;La/j1q0;La/gg5;La/ix0;La/x2c0;La/wdk0;La/ouu;La/bzt;La/c5k;La/nw20;La/jdk0;La/ytt;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v1, v30

    .line 243
    .line 244
    new-instance v2, La/fiu0;

    .line 245
    .line 246
    iget-object v3, v4, La/o9i;->D:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v3, La/eni;

    .line 249
    .line 250
    const-class v4, La/v3b0;

    .line 251
    .line 252
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 257
    .line 258
    .line 259
    iput-object v2, v0, La/d2b0;->K1:La/fiu0;

    .line 260
    .line 261
    iput-object v13, v0, La/d2b0;->N1:La/ii;

    .line 262
    .line 263
    iput-object v1, v0, La/d2b0;->O1:La/wdk0;

    .line 264
    .line 265
    iget-object v1, v9, La/peg0;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, La/yzn0;

    .line 268
    .line 269
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    new-instance v1, La/roq0;

    .line 277
    .line 278
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object v1, v0, La/d2b0;->P1:La/roq0;

    .line 282
    .line 283
    return-void

    .line 284
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 285
    .line 286
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, La/yx5;->Z()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance p2, La/ex60;

    .line 16
    .line 17
    const/16 v0, 0xb

    .line 18
    .line 19
    invoke-direct {p2, p0, v0}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    const-string v0, "REQUEST_KEY_CLOSE_GAME"

    .line 23
    .line 24
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, La/d2b0;->U1:[La/iiy;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    aget-object p1, p1, p2

    .line 31
    .line 32
    iget-object p2, p0, La/d2b0;->M1:La/s0r;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast p1, La/u2r;

    .line 42
    .line 43
    iget-object p1, p1, La/u2r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 44
    .line 45
    new-instance p2, La/owp0;

    .line 46
    .line 47
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/lma0;

    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    invoke-direct {v0, p0, v1}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance p0, La/ugd;

    .line 57
    .line 58
    const v1, -0x1c0a1669

    .line 59
    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final p()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/d2b0;->R1:La/tah0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-interface {p0}, La/tah0;->p()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p0, v1, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    return v0
.end method

.method public final w()V
    .locals 0

    .line 1
    iget-object p0, p0, La/d2b0;->R1:La/tah0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/tah0;->w()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/d2b0;->Q1:Z

    .line 2
    .line 3
    return p0
.end method
