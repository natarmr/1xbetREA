.class public final La/kai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kai;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 34

    .line 1
    new-instance v0, La/jm8;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/kai;->a:La/n8i;

    .line 6
    .line 7
    iget-object v1, v1, La/n8i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/mai;

    .line 10
    .line 11
    new-instance v2, La/nr;

    .line 12
    .line 13
    new-instance v3, La/ivn;

    .line 14
    .line 15
    new-instance v4, La/phf0;

    .line 16
    .line 17
    new-instance v5, La/h03;

    .line 18
    .line 19
    iget-object v6, v1, La/mai;->b:La/gii0;

    .line 20
    .line 21
    const/16 v7, 0x12

    .line 22
    .line 23
    invoke-direct {v5, v6, v7}, La/h03;-><init>(La/gii0;B)V

    .line 24
    .line 25
    .line 26
    new-instance v6, La/xr;

    .line 27
    .line 28
    const/16 v7, 0xd

    .line 29
    .line 30
    invoke-direct {v6, v7}, La/xr;-><init>(B)V

    .line 31
    .line 32
    .line 33
    iget-object v7, v1, La/mai;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, La/btt0;

    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v5, v4, La/phf0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object v6, v4, La/phf0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object v7, v4, La/phf0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-direct {v3, v4}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v4, v1, La/mai;->l:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, La/cdu;

    .line 55
    .line 56
    iget-object v5, v1, La/mai;->m:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, La/ntu;

    .line 59
    .line 60
    const/16 v6, 0x16

    .line 61
    .line 62
    invoke-direct {v2, v3, v4, v5, v6}, La/nr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v3, La/nr;

    .line 66
    .line 67
    new-instance v4, La/ipu;

    .line 68
    .line 69
    iget-object v5, v1, La/mai;->n:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, La/pbt;

    .line 72
    .line 73
    iget-object v6, v1, La/mai;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, La/gst0;

    .line 76
    .line 77
    invoke-direct {v4, v5, v6}, La/ipu;-><init>(La/pbt;La/gst0;)V

    .line 78
    .line 79
    .line 80
    new-instance v7, La/scu;

    .line 81
    .line 82
    invoke-direct {v7, v5, v6}, La/scu;-><init>(La/pbt;La/gst0;)V

    .line 83
    .line 84
    .line 85
    iget-object v8, v1, La/mai;->m:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, La/ntu;

    .line 88
    .line 89
    const/16 v9, 0x17

    .line 90
    .line 91
    invoke-direct {v3, v4, v7, v8, v9}, La/nr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    iget-object v4, v1, La/mai;->o:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, La/ls;

    .line 97
    .line 98
    iget-object v7, v1, La/mai;->p:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, La/k9c;

    .line 101
    .line 102
    iget-object v9, v1, La/mai;->q:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, La/p4u;

    .line 105
    .line 106
    iget-object v10, v1, La/mai;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v10, La/wsf0;

    .line 109
    .line 110
    iget-object v11, v10, La/wsf0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v11, La/g45;

    .line 113
    .line 114
    invoke-virtual {v11}, La/g45;->y()La/ahu;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    iget-object v12, v1, La/mai;->r:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v12, La/kyg0;

    .line 121
    .line 122
    move-object v13, v9

    .line 123
    invoke-virtual {v10}, La/wsf0;->b()La/ot;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    move-object v14, v10

    .line 128
    invoke-virtual {v14}, La/wsf0;->q()La/jyg0;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    iget-object v15, v1, La/mai;->s:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v15, La/yoc;

    .line 135
    .line 136
    move-object/from16 v16, v0

    .line 137
    .line 138
    iget-object v0, v1, La/mai;->t:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, La/yoc;

    .line 141
    .line 142
    move-object/from16 v17, v13

    .line 143
    .line 144
    new-instance v13, La/pbu;

    .line 145
    .line 146
    move-object/from16 p0, v0

    .line 147
    .line 148
    new-instance v0, La/scu;

    .line 149
    .line 150
    invoke-direct {v0, v5, v6}, La/scu;-><init>(La/pbt;La/gst0;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v13, v0, v8}, La/pbu;-><init>(La/scu;La/ntu;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v1, La/mai;->u:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/iw20;

    .line 159
    .line 160
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/uii;

    .line 163
    .line 164
    invoke-virtual {v0}, La/uii;->r()La/pru;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v5, v1, La/mai;->v:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, La/lbu;

    .line 171
    .line 172
    iget-object v6, v1, La/mai;->w:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, La/ycu;

    .line 175
    .line 176
    iget-object v8, v1, La/mai;->x:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v8, La/dcu;

    .line 179
    .line 180
    invoke-virtual {v14}, La/wsf0;->s()La/trm0;

    .line 181
    .line 182
    .line 183
    move-result-object v18

    .line 184
    new-instance v14, La/uxs0;

    .line 185
    .line 186
    move-object/from16 v19, v0

    .line 187
    .line 188
    const/16 v0, 0xc

    .line 189
    .line 190
    invoke-direct {v14, v0}, La/uxs0;-><init>(B)V

    .line 191
    .line 192
    .line 193
    iget-object v0, v1, La/mai;->y:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, La/mct;

    .line 196
    .line 197
    invoke-interface {v0}, La/mct;->c()La/oct;

    .line 198
    .line 199
    .line 200
    move-result-object v20

    .line 201
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v1, La/mai;->z:Ljava/lang/Object;

    .line 205
    .line 206
    move-object/from16 v21, v0

    .line 207
    .line 208
    check-cast v21, La/v88;

    .line 209
    .line 210
    iget-object v0, v1, La/mai;->A:Ljava/lang/Object;

    .line 211
    .line 212
    move-object/from16 v22, v0

    .line 213
    .line 214
    check-cast v22, La/ix0;

    .line 215
    .line 216
    iget-object v0, v1, La/mai;->B:Ljava/lang/Object;

    .line 217
    .line 218
    move-object/from16 v23, v0

    .line 219
    .line 220
    check-cast v23, La/l7k;

    .line 221
    .line 222
    iget-object v0, v1, La/mai;->C:Ljava/lang/Object;

    .line 223
    .line 224
    move-object/from16 v24, v0

    .line 225
    .line 226
    check-cast v24, La/cmt;

    .line 227
    .line 228
    iget-object v0, v1, La/mai;->D:Ljava/lang/Object;

    .line 229
    .line 230
    move-object/from16 v25, v0

    .line 231
    .line 232
    check-cast v25, La/ih5;

    .line 233
    .line 234
    iget-object v0, v1, La/mai;->E:Ljava/lang/Object;

    .line 235
    .line 236
    move-object/from16 v26, v0

    .line 237
    .line 238
    check-cast v26, La/hs60;

    .line 239
    .line 240
    iget-object v0, v1, La/mai;->F:Ljava/lang/Object;

    .line 241
    .line 242
    move-object/from16 v27, v0

    .line 243
    .line 244
    check-cast v27, La/ih5;

    .line 245
    .line 246
    iget-object v0, v1, La/mai;->f:Ljava/lang/Object;

    .line 247
    .line 248
    move-object/from16 v28, v0

    .line 249
    .line 250
    check-cast v28, La/duj;

    .line 251
    .line 252
    iget-object v0, v1, La/mai;->g:La/ctf0;

    .line 253
    .line 254
    move-object/from16 v29, v0

    .line 255
    .line 256
    iget-object v0, v1, La/mai;->i:Ljava/lang/Object;

    .line 257
    .line 258
    move-object/from16 v30, v0

    .line 259
    .line 260
    check-cast v30, La/ocl;

    .line 261
    .line 262
    iget-object v0, v1, La/mai;->h:La/m1e;

    .line 263
    .line 264
    move-object/from16 v31, v0

    .line 265
    .line 266
    iget-object v0, v1, La/mai;->a:La/cad;

    .line 267
    .line 268
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, La/psc;

    .line 271
    .line 272
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 273
    .line 274
    .line 275
    move-result-object v32

    .line 276
    invoke-static/range {v32 .. v32}, La/x1x;->x(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v1, La/mai;->e:La/i1w0;

    .line 280
    .line 281
    move-object v1, v15

    .line 282
    move-object v15, v5

    .line 283
    move-object v5, v7

    .line 284
    move-object v7, v11

    .line 285
    move-object v11, v1

    .line 286
    move-object/from16 v1, v19

    .line 287
    .line 288
    move-object/from16 v19, v14

    .line 289
    .line 290
    move-object v14, v1

    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    move-object/from16 v33, v0

    .line 294
    .line 295
    move-object/from16 v0, v16

    .line 296
    .line 297
    move-object/from16 v16, v6

    .line 298
    .line 299
    move-object/from16 v6, v17

    .line 300
    .line 301
    move-object/from16 v17, v8

    .line 302
    .line 303
    move-object v8, v12

    .line 304
    move-object/from16 v12, p0

    .line 305
    .line 306
    invoke-direct/range {v0 .. v33}, La/jm8;-><init>(La/vzg0;La/nr;La/nr;La/ls;La/k9c;La/p4u;La/ahu;La/kyg0;La/ot;La/jyg0;La/yoc;La/yoc;La/pbu;La/pru;La/lbu;La/ycu;La/dcu;La/trm0;La/uxs0;La/oct;La/v88;La/ix0;La/l7k;La/cmt;La/ih5;La/hs60;La/ih5;La/duj;La/ctf0;La/ocl;La/m1e;La/mne;La/i1w0;)V

    .line 307
    .line 308
    .line 309
    return-object v0
.end method
