.class public final synthetic La/sv50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uv50;


# direct methods
.method public synthetic constructor <init>(La/uv50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sv50;->a:B

    iput-object p1, p0, La/sv50;->b:La/uv50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sv50;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/sv50;->b:La/uv50;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/uv50;->U1:La/xuz;

    .line 11
    .line 12
    invoke-virtual {v0}, La/uv50;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/yu50;->a:La/yu50;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/uv50;->U1:La/xuz;

    .line 25
    .line 26
    invoke-virtual {v0}, La/uv50;->G0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, La/av50;->a:La/av50;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    sget-object v1, La/uv50;->U1:La/xuz;

    .line 39
    .line 40
    new-instance v1, La/q0h0;

    .line 41
    .line 42
    iget-object v0, v0, La/uv50;->R1:La/n0o0;

    .line 43
    .line 44
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/ami;

    .line 49
    .line 50
    iget-object v0, v0, La/ami;->y:La/n5d0;

    .line 51
    .line 52
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/zli;

    .line 57
    .line 58
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_2
    sget-object v1, La/uv50;->U1:La/xuz;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    instance-of v2, v1, La/af3;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    check-cast v1, La/af3;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move-object v1, v3

    .line 84
    :goto_0
    const-class v2, La/ov50;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/o5d0;

    .line 97
    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/ze3;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move-object v1, v3

    .line 108
    :goto_1
    instance-of v4, v1, La/ov50;

    .line 109
    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    move-object v1, v3

    .line 113
    :cond_2
    check-cast v1, La/ov50;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    new-instance v2, La/o24;

    .line 122
    .line 123
    iget-object v3, v0, La/uv50;->L1:La/phf0;

    .line 124
    .line 125
    sget-object v4, La/uv50;->V1:[La/iiy;

    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    aget-object v5, v4, v5

    .line 129
    .line 130
    invoke-virtual {v3, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v5, v0, La/uv50;->M1:La/phf0;

    .line 135
    .line 136
    const/4 v6, 0x2

    .line 137
    aget-object v6, v4, v6

    .line 138
    .line 139
    invoke-virtual {v5, v0, v6}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    iget-object v6, v0, La/uv50;->O1:La/cgx0;

    .line 144
    .line 145
    const/4 v7, 0x4

    .line 146
    aget-object v7, v4, v7

    .line 147
    .line 148
    invoke-virtual {v6, v0, v7}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    iget-object v7, v0, La/uv50;->N1:La/yzn0;

    .line 157
    .line 158
    const/4 v8, 0x3

    .line 159
    aget-object v4, v4, v8

    .line 160
    .line 161
    invoke-virtual {v7, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, La/oo5;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object v3, v2, La/o24;->b:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v5, v2, La/o24;->c:Ljava/lang/Object;

    .line 179
    .line 180
    iput-boolean v6, v2, La/o24;->a:Z

    .line 181
    .line 182
    iput-object v0, v2, La/o24;->d:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object v6, v1, La/ov50;->a:La/lp4;

    .line 188
    .line 189
    iget-object v8, v1, La/ov50;->b:La/b3c0;

    .line 190
    .line 191
    iget-object v9, v1, La/ov50;->c:La/gst0;

    .line 192
    .line 193
    iget-object v10, v1, La/ov50;->d:La/wsz;

    .line 194
    .line 195
    iget-object v12, v1, La/ov50;->f:La/nv20;

    .line 196
    .line 197
    iget-object v7, v1, La/ov50;->h:La/ii;

    .line 198
    .line 199
    iget-object v13, v1, La/ov50;->g:La/btt0;

    .line 200
    .line 201
    iget-object v14, v1, La/ov50;->i:La/duj;

    .line 202
    .line 203
    iget-object v0, v1, La/ov50;->n:La/j1q0;

    .line 204
    .line 205
    iget-object v11, v1, La/ov50;->e:La/gii0;

    .line 206
    .line 207
    iget-object v15, v1, La/ov50;->j:La/m1e;

    .line 208
    .line 209
    iget-object v3, v1, La/ov50;->k:La/mne;

    .line 210
    .line 211
    iget-object v4, v1, La/ov50;->l:La/xnt;

    .line 212
    .line 213
    iget-object v5, v1, La/ov50;->m:La/ctf0;

    .line 214
    .line 215
    move-object/from16 v16, v0

    .line 216
    .line 217
    iget-object v0, v1, La/ov50;->o:La/nv20;

    .line 218
    .line 219
    move-object/from16 v20, v0

    .line 220
    .line 221
    iget-object v0, v1, La/ov50;->p:La/gle0;

    .line 222
    .line 223
    move-object/from16 v21, v0

    .line 224
    .line 225
    iget-object v0, v1, La/ov50;->q:La/grj;

    .line 226
    .line 227
    move-object/from16 v22, v0

    .line 228
    .line 229
    iget-object v0, v1, La/ov50;->r:La/tzi;

    .line 230
    .line 231
    move-object/from16 v23, v0

    .line 232
    .line 233
    iget-object v0, v1, La/ov50;->s:La/bzt;

    .line 234
    .line 235
    iget-object v1, v1, La/ov50;->t:La/yj;

    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-object/from16 v18, v4

    .line 268
    .line 269
    new-instance v4, La/ami;

    .line 270
    .line 271
    move-object/from16 v19, v5

    .line 272
    .line 273
    new-instance v5, La/evz;

    .line 274
    .line 275
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    move-object/from16 v25, v0

    .line 279
    .line 280
    move-object/from16 v26, v1

    .line 281
    .line 282
    move-object/from16 v24, v2

    .line 283
    .line 284
    move-object/from16 v16, v3

    .line 285
    .line 286
    invoke-direct/range {v4 .. v26}, La/ami;-><init>(La/evz;La/lp4;La/ii;La/b3c0;La/gst0;La/wsz;La/gii0;La/nv20;La/btt0;La/duj;La/m1e;La/mne;La/i1w0;La/xnt;La/ctf0;La/nv20;La/gle0;La/grj;La/tzi;La/o24;La/bzt;La/yj;)V

    .line 287
    .line 288
    .line 289
    move-object v3, v4

    .line 290
    goto :goto_2

    .line 291
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 292
    .line 293
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :goto_2
    return-object v3

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
