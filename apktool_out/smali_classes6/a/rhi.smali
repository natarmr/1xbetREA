.class public final La/rhi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/dci;


# direct methods
.method public constructor <init>(La/dci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rhi;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 34

    .line 1
    new-instance v0, La/c0t;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/rhi;->a:La/dci;

    .line 6
    .line 7
    iget-object v1, v1, La/dci;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/shi;

    .line 10
    .line 11
    iget-object v2, v1, La/shi;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v1, La/shi;->b:La/cad;

    .line 14
    .line 15
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/psc;

    .line 18
    .line 19
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, La/shi;->c:Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 27
    .line 28
    iget-object v5, v1, La/shi;->d:La/xhi;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    invoke-virtual {v6}, La/xhi;->b()La/tzi;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    move-object v7, v6

    .line 36
    invoke-virtual {v7}, La/xhi;->h()La/iw20;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    move-object v8, v7

    .line 41
    invoke-virtual {v8}, La/xhi;->k()La/drm0;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    move-object v9, v8

    .line 46
    invoke-virtual {v9}, La/xhi;->j()La/sbu;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    iget-object v10, v1, La/shi;->e:La/clc;

    .line 51
    .line 52
    iget-object v11, v10, La/clc;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v11, La/v7i;

    .line 55
    .line 56
    invoke-virtual {v11}, La/v7i;->h()La/a7q;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    iget-object v12, v10, La/clc;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, La/v7i;

    .line 63
    .line 64
    invoke-virtual {v12}, La/v7i;->e()La/rus;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    move-object v13, v9

    .line 69
    move-object v9, v11

    .line 70
    invoke-virtual {v13}, La/xhi;->g()La/g3j;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-virtual {v13}, La/xhi;->c()La/xpr;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    move-object v14, v12

    .line 79
    move-object v12, v13

    .line 80
    new-instance v13, La/e1u;

    .line 81
    .line 82
    iget-object v15, v1, La/shi;->v:La/n5d0;

    .line 83
    .line 84
    invoke-interface {v15}, La/o5d0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v15

    .line 88
    check-cast v15, La/d4t0;

    .line 89
    .line 90
    invoke-direct {v13, v15}, La/e1u;-><init>(La/d4t0;)V

    .line 91
    .line 92
    .line 93
    move-object v15, v14

    .line 94
    new-instance v14, La/b8u;

    .line 95
    .line 96
    move-object/from16 v16, v0

    .line 97
    .line 98
    iget-object v0, v1, La/shi;->v:La/n5d0;

    .line 99
    .line 100
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/d4t0;

    .line 105
    .line 106
    invoke-direct {v14, v0}, La/b8u;-><init>(La/d4t0;)V

    .line 107
    .line 108
    .line 109
    move-object v0, v15

    .line 110
    new-instance v15, La/reu;

    .line 111
    .line 112
    move-object/from16 p0, v0

    .line 113
    .line 114
    iget-object v0, v1, La/shi;->w:La/n5d0;

    .line 115
    .line 116
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/nov;

    .line 121
    .line 122
    invoke-direct {v15, v0}, La/reu;-><init>(La/nov;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v1, La/shi;->h:La/rmd0;

    .line 126
    .line 127
    invoke-interface {v0}, La/rmd0;->a()La/vpu;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v17, v0

    .line 135
    .line 136
    iget-object v0, v1, La/shi;->i:La/a1d;

    .line 137
    .line 138
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, La/qv2;

    .line 141
    .line 142
    invoke-virtual {v0}, La/qv2;->i()La/hqc;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move-object/from16 v18, v0

    .line 147
    .line 148
    iget-object v0, v1, La/shi;->j:La/iip;

    .line 149
    .line 150
    invoke-interface {v0}, La/iip;->V()La/j3c;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v19, v0

    .line 158
    .line 159
    new-instance v0, La/e1u;

    .line 160
    .line 161
    iget-object v10, v10, La/clc;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v10, La/v7i;

    .line 164
    .line 165
    invoke-virtual {v10}, La/v7i;->d()La/wrh;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v20, v2

    .line 173
    .line 174
    const/4 v2, 0x1

    .line 175
    invoke-direct {v0, v10, v2}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    iget-object v10, v1, La/shi;->k:La/ivn;

    .line 179
    .line 180
    iget-object v2, v10, La/ivn;->a:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, La/v5i;

    .line 183
    .line 184
    invoke-virtual {v2}, La/v5i;->e()La/zsr;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object/from16 v22, v0

    .line 189
    .line 190
    iget-object v0, v10, La/ivn;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, La/v5i;

    .line 193
    .line 194
    invoke-virtual {v0}, La/v5i;->d()La/rpt;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v23, v0

    .line 199
    .line 200
    iget-object v0, v10, La/ivn;->a:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, La/v5i;

    .line 203
    .line 204
    invoke-virtual {v0}, La/v5i;->b()La/kut;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v10, v10, La/ivn;->a:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v10, La/v5i;

    .line 211
    .line 212
    invoke-virtual {v10}, La/v5i;->f()La/lbu;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    move-object/from16 v24, v0

    .line 217
    .line 218
    iget-object v0, v1, La/shi;->l:La/m1e;

    .line 219
    .line 220
    move-object/from16 v25, v0

    .line 221
    .line 222
    iget-object v0, v1, La/shi;->m:La/oeg0;

    .line 223
    .line 224
    move-object/from16 v26, v0

    .line 225
    .line 226
    new-instance v0, La/kys0;

    .line 227
    .line 228
    move-object/from16 v27, v2

    .line 229
    .line 230
    const/4 v2, 0x1

    .line 231
    invoke-direct {v0, v2}, La/kys0;-><init>(B)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v21, v0

    .line 235
    .line 236
    new-instance v0, La/uxs0;

    .line 237
    .line 238
    invoke-direct {v0, v2}, La/uxs0;-><init>(B)V

    .line 239
    .line 240
    .line 241
    iget-object v2, v1, La/shi;->n:La/dwu;

    .line 242
    .line 243
    move-object/from16 v28, v0

    .line 244
    .line 245
    iget-object v0, v1, La/shi;->o:La/r9u;

    .line 246
    .line 247
    move-object/from16 v29, v0

    .line 248
    .line 249
    iget-object v0, v1, La/shi;->p:La/ctf0;

    .line 250
    .line 251
    move-object/from16 v30, v0

    .line 252
    .line 253
    iget-object v0, v1, La/shi;->q:La/lbu;

    .line 254
    .line 255
    move-object/from16 v31, v0

    .line 256
    .line 257
    iget-object v0, v1, La/shi;->r:La/pru;

    .line 258
    .line 259
    iget-object v1, v1, La/shi;->s:La/g2v;

    .line 260
    .line 261
    move-object/from16 v32, v28

    .line 262
    .line 263
    move-object/from16 v28, v2

    .line 264
    .line 265
    move-object/from16 v2, v20

    .line 266
    .line 267
    move-object/from16 v20, v27

    .line 268
    .line 269
    move-object/from16 v27, v32

    .line 270
    .line 271
    move-object/from16 v32, v0

    .line 272
    .line 273
    move-object/from16 v33, v1

    .line 274
    .line 275
    move-object/from16 v0, v16

    .line 276
    .line 277
    move-object/from16 v16, v17

    .line 278
    .line 279
    move-object/from16 v17, v18

    .line 280
    .line 281
    move-object/from16 v18, v19

    .line 282
    .line 283
    move-object/from16 v19, v22

    .line 284
    .line 285
    move-object/from16 v22, v24

    .line 286
    .line 287
    move-object/from16 v24, v25

    .line 288
    .line 289
    move-object/from16 v25, v26

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    move-object/from16 v26, v21

    .line 294
    .line 295
    move-object/from16 v21, v23

    .line 296
    .line 297
    move-object/from16 v23, v10

    .line 298
    .line 299
    move-object/from16 v10, p0

    .line 300
    .line 301
    invoke-direct/range {v0 .. v33}, La/c0t;-><init>(La/vzg0;Ljava/lang/String;La/mne;Lorg/xplatform/ufc/api/game/UfcGameParams;La/tzi;La/iw20;La/drm0;La/sbu;La/a7q;La/rus;La/g3j;La/xpr;La/e1u;La/b8u;La/reu;La/vpu;La/hqc;La/j3c;La/e1u;La/zsr;La/rpt;La/kut;La/lbu;La/m1e;La/oeg0;La/kys0;La/uxs0;La/dwu;La/r9u;La/ctf0;La/lbu;La/pru;La/g2v;)V

    .line 302
    .line 303
    .line 304
    return-object v0
.end method
