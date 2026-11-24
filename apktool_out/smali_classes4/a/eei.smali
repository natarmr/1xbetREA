.class public final La/eei;
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
    iput-object p1, p0, La/eei;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 19

    .line 1
    new-instance v0, La/gdg;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/eei;->a:La/dci;

    .line 6
    .line 7
    iget-object v1, v1, La/dci;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/fei;

    .line 10
    .line 11
    iget-object v2, v1, La/fei;->a:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 12
    .line 13
    new-instance v3, La/ywq0;

    .line 14
    .line 15
    iget-object v4, v1, La/fei;->b:La/pru;

    .line 16
    .line 17
    new-instance v5, La/edu;

    .line 18
    .line 19
    iget-object v6, v1, La/fei;->c:La/pyg;

    .line 20
    .line 21
    invoke-interface {v6}, La/pyg;->l()La/cu;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v8, v1, La/fei;->d:La/vqc;

    .line 29
    .line 30
    iget-object v8, v8, La/vqc;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v8, La/cih;

    .line 33
    .line 34
    invoke-virtual {v8}, La/cih;->a()La/uzc;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    const/4 v9, 0x0

    .line 39
    invoke-direct {v5, v7, v8, v9}, La/edu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v7, La/rtu;

    .line 43
    .line 44
    new-instance v8, La/rou;

    .line 45
    .line 46
    iget-object v10, v1, La/fei;->e:La/b3c0;

    .line 47
    .line 48
    invoke-direct {v8, v10, v9}, La/rou;-><init>(La/b3c0;B)V

    .line 49
    .line 50
    .line 51
    new-instance v10, La/x4v;

    .line 52
    .line 53
    iget-object v11, v1, La/fei;->f:La/gst0;

    .line 54
    .line 55
    invoke-direct {v10, v11, v9}, La/x4v;-><init>(La/gst0;B)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v7, v8, v10}, La/rtu;-><init>(La/rou;La/x4v;)V

    .line 59
    .line 60
    .line 61
    iget-object v8, v1, La/fei;->g:La/lsn;

    .line 62
    .line 63
    iget-object v8, v8, La/lsn;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, La/gbi;

    .line 66
    .line 67
    invoke-virtual {v8}, La/gbi;->k()La/v7i;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    iget-object v9, v1, La/fei;->h:La/iip;

    .line 72
    .line 73
    invoke-interface {v9}, La/iip;->V()La/j3c;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v10, La/fvt;

    .line 81
    .line 82
    invoke-interface {v6}, La/pyg;->e()La/udg;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v10, v11}, La/fvt;-><init>(La/udg;)V

    .line 90
    .line 91
    .line 92
    new-instance v11, La/zwt;

    .line 93
    .line 94
    invoke-interface {v6}, La/pyg;->e()La/udg;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v11, v6}, La/zwt;-><init>(La/udg;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v5, v3, La/ywq0;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v7, v3, La/ywq0;->b:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v8, v3, La/ywq0;->c:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v9, v3, La/ywq0;->d:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v10, v3, La/ywq0;->e:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v11, v3, La/ywq0;->f:Ljava/lang/Object;

    .line 118
    .line 119
    new-instance v5, La/b6u;

    .line 120
    .line 121
    const/16 v6, 0x13

    .line 122
    .line 123
    invoke-direct {v5, v4, v6}, La/b6u;-><init>(La/pru;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    iput-object v4, v3, La/ywq0;->g:Ljava/lang/Object;

    .line 131
    .line 132
    new-instance v4, La/cxt;

    .line 133
    .line 134
    iget-object v5, v1, La/fei;->c:La/pyg;

    .line 135
    .line 136
    invoke-interface {v5}, La/pyg;->e()La/udg;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v4, v6}, La/cxt;-><init>(La/udg;)V

    .line 144
    .line 145
    .line 146
    move-object v6, v5

    .line 147
    new-instance v5, La/yuu;

    .line 148
    .line 149
    new-instance v7, La/bxt;

    .line 150
    .line 151
    invoke-interface {v6}, La/pyg;->e()La/udg;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {v7, v8}, La/bxt;-><init>(La/udg;)V

    .line 159
    .line 160
    .line 161
    iget-object v8, v1, La/fei;->i:La/pmi;

    .line 162
    .line 163
    invoke-interface {v6}, La/pyg;->e()La/udg;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    const/4 v10, 0x7

    .line 171
    invoke-direct {v5, v7, v8, v9, v10}, La/yuu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    iget-object v7, v1, La/fei;->h:La/iip;

    .line 175
    .line 176
    invoke-interface {v7}, La/iip;->V()La/j3c;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object v8, v6

    .line 184
    move-object v6, v7

    .line 185
    new-instance v7, La/lsn;

    .line 186
    .line 187
    invoke-interface {v8}, La/pyg;->e()La/udg;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v7, v9}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    move-object v9, v8

    .line 198
    new-instance v8, La/fvt;

    .line 199
    .line 200
    invoke-interface {v9}, La/pyg;->e()La/udg;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-direct {v8, v10}, La/fvt;-><init>(La/udg;)V

    .line 208
    .line 209
    .line 210
    move-object v10, v9

    .line 211
    new-instance v9, La/qc3;

    .line 212
    .line 213
    iget-object v11, v1, La/fei;->j:La/rc3;

    .line 214
    .line 215
    iget-object v12, v1, La/fei;->k:La/xri;

    .line 216
    .line 217
    invoke-virtual {v12}, La/xri;->a()La/svu;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    new-instance v14, La/fxu;

    .line 225
    .line 226
    invoke-interface {v10}, La/pyg;->e()La/udg;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v14, v15}, La/fxu;-><init>(La/udg;)V

    .line 234
    .line 235
    .line 236
    iget-object v15, v1, La/fei;->l:La/oeg0;

    .line 237
    .line 238
    invoke-direct {v9, v11, v13, v14, v15}, La/qc3;-><init>(La/rc3;La/svu;La/fxu;La/oeg0;)V

    .line 239
    .line 240
    .line 241
    move-object v11, v10

    .line 242
    iget-object v10, v1, La/fei;->m:La/m1e;

    .line 243
    .line 244
    iget-object v13, v1, La/fei;->n:La/cad;

    .line 245
    .line 246
    iget-object v13, v13, La/cad;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v13, La/psc;

    .line 249
    .line 250
    invoke-virtual {v13}, La/psc;->h()La/mne;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    move-object v14, v12

    .line 258
    iget-object v12, v1, La/fei;->o:La/duj;

    .line 259
    .line 260
    invoke-virtual {v14}, La/xri;->a()La/svu;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    move-object v15, v11

    .line 268
    move-object v11, v13

    .line 269
    move-object v13, v14

    .line 270
    iget-object v14, v1, La/fei;->b:La/pru;

    .line 271
    .line 272
    move-object/from16 v16, v15

    .line 273
    .line 274
    new-instance v15, La/arc;

    .line 275
    .line 276
    move-object/from16 v17, v0

    .line 277
    .line 278
    invoke-interface/range {v16 .. v16}, La/pyg;->e()La/udg;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v15, v0}, La/arc;-><init>(La/udg;)V

    .line 286
    .line 287
    .line 288
    iget-object v0, v1, La/fei;->p:La/ctf0;

    .line 289
    .line 290
    move-object/from16 v16, v0

    .line 291
    .line 292
    new-instance v0, La/u58;

    .line 293
    .line 294
    move-object/from16 v18, v2

    .line 295
    .line 296
    iget-object v2, v1, La/fei;->q:La/kt2;

    .line 297
    .line 298
    move-object/from16 p0, v3

    .line 299
    .line 300
    const/4 v3, 0x1

    .line 301
    invoke-direct {v0, v2, v3}, La/u58;-><init>(La/kt2;B)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v1, La/fei;->r:La/zr1;

    .line 305
    .line 306
    move-object/from16 v2, v17

    .line 307
    .line 308
    move-object/from16 v17, v0

    .line 309
    .line 310
    move-object v0, v2

    .line 311
    move-object/from16 v3, p0

    .line 312
    .line 313
    move-object/from16 v2, v18

    .line 314
    .line 315
    move-object/from16 v18, v1

    .line 316
    .line 317
    move-object/from16 v1, p1

    .line 318
    .line 319
    invoke-direct/range {v0 .. v18}, La/gdg;-><init>(La/vzg0;Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/ywq0;La/cxt;La/yuu;La/j3c;La/lsn;La/fvt;La/qc3;La/m1e;La/mne;La/duj;La/svu;La/pru;La/arc;La/ctf0;La/u58;La/zr1;)V

    .line 320
    .line 321
    .line 322
    return-object v0
.end method
