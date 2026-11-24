.class public final synthetic La/i3o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k3o;


# direct methods
.method public synthetic constructor <init>(La/k3o;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i3o;->a:B

    iput-object p1, p0, La/i3o;->b:La/k3o;

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
    iget-byte v1, v0, La/i3o;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/i3o;->b:La/k3o;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/k3o;->R1:La/nek;

    .line 12
    .line 13
    invoke-virtual {v0}, La/k3o;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/p2o;->a:La/p2o;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/k3o;->R1:La/nek;

    .line 26
    .line 27
    invoke-virtual {v0}, La/k3o;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/q2o;->a:La/q2o;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget-object v1, La/k3o;->R1:La/nek;

    .line 40
    .line 41
    invoke-virtual {v0}, La/k3o;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/v2o;->a:La/v2o;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    sget-object v1, La/k3o;->R1:La/nek;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    instance-of v3, v1, La/af3;

    .line 67
    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    check-cast v1, La/af3;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move-object v1, v2

    .line 74
    :goto_0
    const-class v3, La/l3o;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, La/o5d0;

    .line 87
    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, La/ze3;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v1, v2

    .line 98
    :goto_1
    instance-of v4, v1, La/l3o;

    .line 99
    .line 100
    if-nez v4, :cond_2

    .line 101
    .line 102
    move-object v1, v2

    .line 103
    :cond_2
    check-cast v1, La/l3o;

    .line 104
    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    iget-object v2, v0, La/k3o;->P1:La/khf0;

    .line 108
    .line 109
    sget-object v3, La/k3o;->S1:[La/iiy;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    aget-object v3, v3, v4

    .line 113
    .line 114
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v11, v0

    .line 119
    check-cast v11, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 120
    .line 121
    iget-object v3, v1, La/l3o;->h:La/cad;

    .line 122
    .line 123
    iget-object v5, v1, La/l3o;->b:La/pyg;

    .line 124
    .line 125
    iget-object v6, v1, La/l3o;->d:La/itr;

    .line 126
    .line 127
    iget-object v7, v1, La/l3o;->e:La/lsn;

    .line 128
    .line 129
    iget-object v9, v1, La/l3o;->f:La/vqc;

    .line 130
    .line 131
    iget-object v4, v1, La/l3o;->a:La/ugf0;

    .line 132
    .line 133
    iget-object v8, v1, La/l3o;->c:La/iip;

    .line 134
    .line 135
    iget-object v10, v1, La/l3o;->g:La/epi0;

    .line 136
    .line 137
    iget-object v0, v1, La/l3o;->i:La/oeg0;

    .line 138
    .line 139
    iget-object v12, v1, La/l3o;->j:La/s31;

    .line 140
    .line 141
    iget-object v13, v1, La/l3o;->k:La/ctf0;

    .line 142
    .line 143
    iget-object v14, v1, La/l3o;->l:La/y78;

    .line 144
    .line 145
    iget-object v15, v1, La/l3o;->m:La/lbu;

    .line 146
    .line 147
    iget-object v2, v1, La/l3o;->n:La/pru;

    .line 148
    .line 149
    move-object/from16 v16, v0

    .line 150
    .line 151
    iget-object v0, v1, La/l3o;->o:La/m1e;

    .line 152
    .line 153
    move-object/from16 v17, v0

    .line 154
    .line 155
    iget-object v0, v1, La/l3o;->p:La/g2v;

    .line 156
    .line 157
    move-object/from16 v18, v0

    .line 158
    .line 159
    iget-object v0, v1, La/l3o;->q:La/gii0;

    .line 160
    .line 161
    move-object/from16 v19, v0

    .line 162
    .line 163
    iget-object v0, v1, La/l3o;->r:La/knf0;

    .line 164
    .line 165
    move-object/from16 v20, v0

    .line 166
    .line 167
    iget-object v0, v1, La/l3o;->s:La/cyu;

    .line 168
    .line 169
    move-object/from16 v21, v0

    .line 170
    .line 171
    iget-object v0, v1, La/l3o;->t:La/sjl0;

    .line 172
    .line 173
    move-object/from16 v22, v0

    .line 174
    .line 175
    iget-object v0, v1, La/l3o;->u:La/btt0;

    .line 176
    .line 177
    move-object/from16 v23, v0

    .line 178
    .line 179
    iget-object v0, v1, La/l3o;->v:La/gst0;

    .line 180
    .line 181
    move-object/from16 v24, v0

    .line 182
    .line 183
    iget-object v0, v1, La/l3o;->x:La/wdk0;

    .line 184
    .line 185
    move-object/from16 p0, v0

    .line 186
    .line 187
    iget-object v0, v1, La/l3o;->w:La/b3c0;

    .line 188
    .line 189
    move-object/from16 v25, v0

    .line 190
    .line 191
    iget-object v0, v1, La/l3o;->y:La/rtu;

    .line 192
    .line 193
    move-object/from16 v26, v0

    .line 194
    .line 195
    iget-object v0, v1, La/l3o;->z:La/vqc;

    .line 196
    .line 197
    iget-object v1, v1, La/l3o;->A:La/sb6;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object/from16 v16, v2

    .line 239
    .line 240
    new-instance v2, La/agi;

    .line 241
    .line 242
    move-object/from16 v22, v0

    .line 243
    .line 244
    move-object/from16 v19, v21

    .line 245
    .line 246
    move-object/from16 v20, v24

    .line 247
    .line 248
    move-object/from16 v23, v26

    .line 249
    .line 250
    move-object/from16 v21, p0

    .line 251
    .line 252
    move-object/from16 v24, v1

    .line 253
    .line 254
    invoke-direct/range {v2 .. v24}, La/agi;-><init>(La/cad;La/ugf0;La/pyg;La/itr;La/lsn;La/iip;La/vqc;La/epi0;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/s31;La/ctf0;La/y78;La/lbu;La/pru;La/m1e;La/g2v;La/cyu;La/gst0;La/wdk0;La/vqc;La/rtu;La/sb6;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 259
    .line 260
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :goto_2
    return-object v2

    .line 268
    :pswitch_3
    new-instance v1, La/q0h0;

    .line 269
    .line 270
    iget-object v0, v0, La/k3o;->K1:La/zfi;

    .line 271
    .line 272
    if-eqz v0, :cond_4

    .line 273
    .line 274
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 275
    .line 276
    .line 277
    return-object v1

    .line 278
    :cond_4
    const-string v0, "viewModelFactory"

    .line 279
    .line 280
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v2

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
