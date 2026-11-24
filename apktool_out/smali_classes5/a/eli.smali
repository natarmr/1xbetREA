.class public final La/eli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eli;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 28

    .line 1
    new-instance v0, La/uz20;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/eli;->a:La/rki;

    .line 6
    .line 7
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/fli;

    .line 10
    .line 11
    iget-object v2, v1, La/fli;->a:La/i1w0;

    .line 12
    .line 13
    iget-object v3, v1, La/fli;->b:Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 14
    .line 15
    new-instance v4, La/j1u;

    .line 16
    .line 17
    iget-object v5, v1, La/fli;->c:La/pcl0;

    .line 18
    .line 19
    invoke-interface {v5}, La/pcl0;->C()La/as20;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    invoke-direct {v4, v5, v6}, La/j1u;-><init>(La/as20;B)V

    .line 28
    .line 29
    .line 30
    iget-object v5, v1, La/fli;->c:La/pcl0;

    .line 31
    .line 32
    move-object v6, v5

    .line 33
    invoke-interface {v6}, La/pcl0;->x()La/s1u;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v7, v6

    .line 41
    invoke-interface {v7}, La/pcl0;->r()La/lku;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v8, v7

    .line 49
    invoke-interface {v8}, La/pcl0;->t()La/s1u;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v9, v8

    .line 57
    iget-object v8, v1, La/fli;->d:La/ctf0;

    .line 58
    .line 59
    move-object v10, v9

    .line 60
    iget-object v9, v1, La/fli;->e:La/evz;

    .line 61
    .line 62
    move-object v11, v10

    .line 63
    invoke-interface {v11}, La/pcl0;->E()La/s1u;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v12, v11

    .line 71
    new-instance v11, La/dq00;

    .line 72
    .line 73
    new-instance v13, La/bn6;

    .line 74
    .line 75
    iget-object v14, v1, La/fli;->f:La/gst0;

    .line 76
    .line 77
    iget-object v15, v1, La/fli;->g:La/kt2;

    .line 78
    .line 79
    move-object/from16 v19, v0

    .line 80
    .line 81
    iget-object v0, v1, La/fli;->h:La/knf0;

    .line 82
    .line 83
    move-object/from16 v16, v0

    .line 84
    .line 85
    iget-object v0, v1, La/fli;->i:La/peg0;

    .line 86
    .line 87
    const/16 v18, 0x1

    .line 88
    .line 89
    move-object/from16 v17, v0

    .line 90
    .line 91
    invoke-direct/range {v13 .. v18}, La/bn6;-><init>(La/gst0;La/kt2;La/knf0;La/peg0;B)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v1, La/fli;->j:La/je;

    .line 95
    .line 96
    const/4 v14, 0x4

    .line 97
    invoke-direct {v11, v13, v0, v14}, La/dq00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    move-object v0, v12

    .line 101
    iget-object v12, v1, La/fli;->k:La/pru;

    .line 102
    .line 103
    iget-object v13, v1, La/fli;->l:La/sue;

    .line 104
    .line 105
    invoke-interface {v13}, La/sue;->x()La/ik9;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, La/pcl0;->V()La/tpp;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v0}, La/pcl0;->U()La/pqc;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 p0, v0

    .line 127
    .line 128
    iget-object v0, v1, La/fli;->m:La/cl5;

    .line 129
    .line 130
    invoke-interface/range {p0 .. p0}, La/pcl0;->v()La/r1u;

    .line 131
    .line 132
    .line 133
    move-result-object v17

    .line 134
    invoke-static/range {v17 .. v17}, La/x1x;->x(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-interface/range {p0 .. p0}, La/pcl0;->D()La/ntt;

    .line 138
    .line 139
    .line 140
    move-result-object v18

    .line 141
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 v16, v0

    .line 145
    .line 146
    move-object/from16 v0, v19

    .line 147
    .line 148
    invoke-interface/range {p0 .. p0}, La/pcl0;->N()La/abu;

    .line 149
    .line 150
    .line 151
    move-result-object v19

    .line 152
    invoke-static/range {v19 .. v19}, La/x1x;->x(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-interface/range {p0 .. p0}, La/pcl0;->c()La/reu;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v21, v0

    .line 163
    .line 164
    new-instance v0, La/cmt;

    .line 165
    .line 166
    move-object/from16 v22, v2

    .line 167
    .line 168
    new-instance v2, La/yk50;

    .line 169
    .line 170
    move-object/from16 v23, v3

    .line 171
    .line 172
    new-instance v3, La/of6;

    .line 173
    .line 174
    move-object/from16 v24, v4

    .line 175
    .line 176
    iget-object v4, v1, La/fli;->n:La/q7d0;

    .line 177
    .line 178
    move-object/from16 v25, v5

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    invoke-direct {v3, v4, v5}, La/of6;-><init>(La/q7d0;B)V

    .line 182
    .line 183
    .line 184
    const/16 v5, 0xc

    .line 185
    .line 186
    invoke-direct {v2, v3, v5}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    const/4 v3, 0x6

    .line 190
    invoke-direct {v0, v2, v3}, La/cmt;-><init>(Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    new-instance v2, La/iw20;

    .line 194
    .line 195
    new-instance v3, La/yk50;

    .line 196
    .line 197
    move-object/from16 v26, v0

    .line 198
    .line 199
    new-instance v0, La/of6;

    .line 200
    .line 201
    move-object/from16 v27, v6

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    invoke-direct {v0, v4, v6}, La/of6;-><init>(La/q7d0;B)V

    .line 205
    .line 206
    .line 207
    invoke-direct {v3, v0, v5}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v2, v3}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v3, v23

    .line 214
    .line 215
    invoke-interface/range {p0 .. p0}, La/pcl0;->i()La/nvu;

    .line 216
    .line 217
    .line 218
    move-result-object v23

    .line 219
    invoke-static/range {v23 .. v23}, La/x1x;->x(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-interface/range {p0 .. p0}, La/pcl0;->b0()La/uii;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object v1, v1, La/fli;->o:La/cad;

    .line 230
    .line 231
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, La/psc;

    .line 234
    .line 235
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v4, v22

    .line 243
    .line 244
    move-object/from16 v22, v2

    .line 245
    .line 246
    move-object v2, v4

    .line 247
    move-object/from16 v4, v24

    .line 248
    .line 249
    move-object/from16 v5, v25

    .line 250
    .line 251
    move-object/from16 v6, v27

    .line 252
    .line 253
    move-object/from16 v24, v0

    .line 254
    .line 255
    move-object/from16 v25, v1

    .line 256
    .line 257
    move-object/from16 v0, v21

    .line 258
    .line 259
    move-object/from16 v21, v26

    .line 260
    .line 261
    move-object/from16 v1, p1

    .line 262
    .line 263
    invoke-direct/range {v0 .. v25}, La/uz20;-><init>(La/vzg0;La/i1w0;Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;La/j1u;La/s1u;La/lku;La/s1u;La/ctf0;La/evz;La/s1u;La/dq00;La/pru;La/ik9;La/tpp;La/pqc;La/cl5;La/r1u;La/ntt;La/abu;La/reu;La/cmt;La/iw20;La/nvu;La/uii;La/mne;)V

    .line 264
    .line 265
    .line 266
    return-object v0
.end method
