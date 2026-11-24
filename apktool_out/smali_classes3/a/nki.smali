.class public final La/nki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/rii;


# direct methods
.method public constructor <init>(La/rii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nki;->a:La/rii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 24

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, La/i1w0;

    .line 4
    .line 5
    new-instance v0, La/bo10;

    .line 6
    .line 7
    move-object/from16 v2, p0

    .line 8
    .line 9
    iget-object v2, v2, La/nki;->a:La/rii;

    .line 10
    .line 11
    iget-object v2, v2, La/rii;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/pki;

    .line 14
    .line 15
    iget-object v3, v2, La/pki;->a:La/g8i;

    .line 16
    .line 17
    invoke-virtual {v3}, La/g8i;->L8()La/ctf0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v2, La/pki;->a:La/g8i;

    .line 25
    .line 26
    invoke-virtual {v4}, La/g8i;->v1()La/mne;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, v2, La/pki;->V:La/n5d0;

    .line 31
    .line 32
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, La/xcc;

    .line 37
    .line 38
    move-object v6, v3

    .line 39
    move-object v3, v4

    .line 40
    move-object v4, v5

    .line 41
    new-instance v5, La/y3v;

    .line 42
    .line 43
    iget-object v7, v2, La/pki;->d0:La/n5d0;

    .line 44
    .line 45
    invoke-interface {v7}, La/o5d0;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, La/go10;

    .line 50
    .line 51
    iget-object v8, v2, La/pki;->k:La/n5d0;

    .line 52
    .line 53
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, La/gmt;

    .line 58
    .line 59
    iget-object v9, v2, La/pki;->a:La/g8i;

    .line 60
    .line 61
    invoke-virtual {v9}, La/g8i;->f0()La/wsf0;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-direct {v5, v7, v8, v10}, La/y3v;-><init>(La/go10;La/gmt;La/wsf0;)V

    .line 66
    .line 67
    .line 68
    move-object v7, v6

    .line 69
    invoke-virtual {v2}, La/pki;->e()La/n660;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    iget-object v8, v2, La/pki;->y:La/n5d0;

    .line 74
    .line 75
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, La/fq;

    .line 80
    .line 81
    move-object v10, v7

    .line 82
    move-object v7, v8

    .line 83
    invoke-virtual {v2}, La/pki;->d()La/ycu;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    iget-object v11, v2, La/pki;->g0:La/n5d0;

    .line 88
    .line 89
    invoke-interface {v11}, La/o5d0;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    check-cast v11, La/ucu;

    .line 94
    .line 95
    iget-object v12, v2, La/pki;->h0:La/n5d0;

    .line 96
    .line 97
    invoke-interface {v12}, La/o5d0;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    check-cast v12, La/dcu;

    .line 102
    .line 103
    move-object v13, v11

    .line 104
    new-instance v11, La/gxu;

    .line 105
    .line 106
    iget-object v14, v2, La/pki;->d0:La/n5d0;

    .line 107
    .line 108
    invoke-interface {v14}, La/o5d0;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    check-cast v14, La/go10;

    .line 113
    .line 114
    iget-object v15, v2, La/pki;->k:La/n5d0;

    .line 115
    .line 116
    invoke-interface {v15}, La/o5d0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    check-cast v15, La/gmt;

    .line 121
    .line 122
    move-object/from16 p1, v0

    .line 123
    .line 124
    invoke-virtual {v9}, La/g8i;->f0()La/wsf0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {v11, v14, v15, v0}, La/gxu;-><init>(La/go10;La/gmt;La/wsf0;)V

    .line 129
    .line 130
    .line 131
    move-object v0, v10

    .line 132
    move-object v10, v12

    .line 133
    new-instance v12, La/yfu;

    .line 134
    .line 135
    iget-object v14, v2, La/pki;->d0:La/n5d0;

    .line 136
    .line 137
    invoke-interface {v14}, La/o5d0;->get()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    check-cast v14, La/go10;

    .line 142
    .line 143
    invoke-direct {v12, v14}, La/yfu;-><init>(La/go10;)V

    .line 144
    .line 145
    .line 146
    iget-object v14, v2, La/pki;->W:La/n5d0;

    .line 147
    .line 148
    invoke-interface {v14}, La/o5d0;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    check-cast v14, La/qqc;

    .line 153
    .line 154
    move-object v15, v13

    .line 155
    move-object v13, v14

    .line 156
    invoke-virtual {v9}, La/g8i;->q1()La/m1e;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v16, v15

    .line 164
    .line 165
    invoke-virtual {v9}, La/g8i;->W3()La/z4u;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    move-object/from16 p0, v0

    .line 170
    .line 171
    iget-object v0, v2, La/pki;->i0:La/n5d0;

    .line 172
    .line 173
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, La/bpi0;

    .line 178
    .line 179
    move-object/from16 v17, v0

    .line 180
    .line 181
    iget-object v0, v9, La/g8i;->C3:La/n5d0;

    .line 182
    .line 183
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, La/d1p;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-interface {v0}, La/d1p;->B()La/je;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v9}, La/g8i;->F7()La/hs60;

    .line 197
    .line 198
    .line 199
    move-result-object v18

    .line 200
    move-object/from16 v19, v0

    .line 201
    .line 202
    new-instance v0, La/dmt;

    .line 203
    .line 204
    move-object/from16 v20, v1

    .line 205
    .line 206
    invoke-virtual {v9}, La/g8i;->c5()La/pru;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-direct {v0, v1}, La/dmt;-><init>(La/pru;)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La/ih5;

    .line 214
    .line 215
    move-object/from16 v21, v0

    .line 216
    .line 217
    iget-object v0, v9, La/g8i;->A1:La/n5d0;

    .line 218
    .line 219
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, La/kt2;

    .line 224
    .line 225
    move-object/from16 v22, v3

    .line 226
    .line 227
    const/4 v3, 0x3

    .line 228
    invoke-direct {v1, v0, v3}, La/ih5;-><init>(La/kt2;B)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v2, La/pki;->j0:La/n5d0;

    .line 232
    .line 233
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, La/ipu;

    .line 238
    .line 239
    invoke-virtual {v9}, La/g8i;->z4()La/lbu;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v2}, La/pki;->c()La/oct;

    .line 244
    .line 245
    .line 246
    move-result-object v23

    .line 247
    move-object/from16 v2, v20

    .line 248
    .line 249
    move-object/from16 v20, v1

    .line 250
    .line 251
    move-object v1, v2

    .line 252
    move-object/from16 v2, v22

    .line 253
    .line 254
    move-object/from16 v22, v3

    .line 255
    .line 256
    move-object v3, v2

    .line 257
    move-object/from16 v2, p0

    .line 258
    .line 259
    move-object/from16 v9, v16

    .line 260
    .line 261
    move-object/from16 v16, v17

    .line 262
    .line 263
    move-object/from16 v17, v19

    .line 264
    .line 265
    move-object/from16 v19, v21

    .line 266
    .line 267
    move-object/from16 v21, v0

    .line 268
    .line 269
    move-object/from16 v0, p1

    .line 270
    .line 271
    invoke-direct/range {v0 .. v23}, La/bo10;-><init>(La/i1w0;La/ctf0;La/mne;La/xcc;La/y3v;La/n660;La/fq;La/ycu;La/ucu;La/dcu;La/gxu;La/yfu;La/qqc;La/m1e;La/z4u;La/bpi0;La/je;La/hs60;La/dmt;La/ih5;La/ipu;La/lbu;La/oct;)V

    .line 272
    .line 273
    .line 274
    return-object v0
.end method
