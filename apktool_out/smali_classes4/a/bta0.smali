.class public final synthetic La/bta0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eta0;


# direct methods
.method public synthetic constructor <init>(La/eta0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bta0;->a:B

    iput-object p1, p0, La/bta0;->b:La/eta0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bta0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/bta0;->b:La/eta0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/eta0;->P1:La/xi70;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/eta0;->M1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/moi;

    .line 21
    .line 22
    iget-object v0, v0, La/moi;->C:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/loi;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/eta0;->P1:La/xi70;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v2, v1, La/af3;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, La/af3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v3

    .line 56
    :goto_0
    const-class v2, La/lra0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/o5d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ze3;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v1, v3

    .line 80
    :goto_1
    instance-of v4, v1, La/lra0;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/lra0;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v18

    .line 93
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v9, v1, La/lra0;->d:La/sue;

    .line 97
    .line 98
    iget-object v0, v1, La/lra0;->e:La/itr;

    .line 99
    .line 100
    iget-object v10, v1, La/lra0;->c:La/lsn;

    .line 101
    .line 102
    iget-object v5, v1, La/lra0;->b:La/bwl;

    .line 103
    .line 104
    iget-object v6, v1, La/lra0;->f:La/a1d;

    .line 105
    .line 106
    iget-object v7, v1, La/lra0;->a:La/mne;

    .line 107
    .line 108
    iget-object v8, v1, La/lra0;->j:La/m1e;

    .line 109
    .line 110
    iget-object v15, v1, La/lra0;->h:La/lbu;

    .line 111
    .line 112
    iget-object v14, v1, La/lra0;->g:La/qv2;

    .line 113
    .line 114
    iget-object v2, v1, La/lra0;->i:La/g2v;

    .line 115
    .line 116
    iget-object v11, v1, La/lra0;->k:La/duj;

    .line 117
    .line 118
    iget-object v12, v1, La/lra0;->m:La/iip;

    .line 119
    .line 120
    iget-object v3, v1, La/lra0;->w:La/pru;

    .line 121
    .line 122
    iget-object v4, v1, La/lra0;->x:La/pyg;

    .line 123
    .line 124
    iget-object v13, v1, La/lra0;->y:La/wdk0;

    .line 125
    .line 126
    move-object/from16 v16, v0

    .line 127
    .line 128
    iget-object v0, v1, La/lra0;->z:La/d1p;

    .line 129
    .line 130
    move-object/from16 v17, v0

    .line 131
    .line 132
    iget-object v0, v1, La/lra0;->A:La/viu;

    .line 133
    .line 134
    move-object/from16 v23, v0

    .line 135
    .line 136
    iget-object v0, v1, La/lra0;->u:La/j1q0;

    .line 137
    .line 138
    move-object/from16 v20, v0

    .line 139
    .line 140
    iget-object v0, v1, La/lra0;->r:La/peg0;

    .line 141
    .line 142
    move-object/from16 v19, v0

    .line 143
    .line 144
    iget-object v0, v1, La/lra0;->q:La/zfo;

    .line 145
    .line 146
    move-object/from16 v26, v0

    .line 147
    .line 148
    iget-object v0, v1, La/lra0;->B:La/gst0;

    .line 149
    .line 150
    move-object/from16 v31, v0

    .line 151
    .line 152
    iget-object v0, v1, La/lra0;->C:La/rtu;

    .line 153
    .line 154
    move-object/from16 v24, v0

    .line 155
    .line 156
    iget-object v0, v1, La/lra0;->D:La/r9u;

    .line 157
    .line 158
    move-object/from16 v25, v0

    .line 159
    .line 160
    iget-object v0, v1, La/lra0;->E:La/h3c;

    .line 161
    .line 162
    move-object/from16 v32, v0

    .line 163
    .line 164
    iget-object v0, v1, La/lra0;->v:La/oeg0;

    .line 165
    .line 166
    move-object/from16 v21, v0

    .line 167
    .line 168
    iget-object v0, v1, La/lra0;->l:La/ctf0;

    .line 169
    .line 170
    move-object/from16 v22, v0

    .line 171
    .line 172
    iget-object v0, v1, La/lra0;->n:La/fsd;

    .line 173
    .line 174
    move-object/from16 v27, v0

    .line 175
    .line 176
    iget-object v0, v1, La/lra0;->o:La/edo;

    .line 177
    .line 178
    move-object/from16 v28, v0

    .line 179
    .line 180
    iget-object v0, v1, La/lra0;->p:La/qj9;

    .line 181
    .line 182
    move-object/from16 v29, v0

    .line 183
    .line 184
    iget-object v0, v1, La/lra0;->s:La/nvu;

    .line 185
    .line 186
    move-object/from16 v30, v0

    .line 187
    .line 188
    iget-object v0, v1, La/lra0;->t:La/ulk;

    .line 189
    .line 190
    iget-object v1, v1, La/lra0;->F:La/vqc;

    .line 191
    .line 192
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance v4, La/moi;

    .line 238
    .line 239
    move-object/from16 v16, v2

    .line 240
    .line 241
    move-object/from16 v21, v3

    .line 242
    .line 243
    move-object/from16 v17, v22

    .line 244
    .line 245
    move-object/from16 v27, v29

    .line 246
    .line 247
    move-object/from16 v29, v30

    .line 248
    .line 249
    move-object/from16 v30, v0

    .line 250
    .line 251
    move-object/from16 v22, v13

    .line 252
    .line 253
    move-object v13, v1

    .line 254
    invoke-direct/range {v4 .. v32}, La/moi;-><init>(La/bwl;La/a1d;La/mne;La/m1e;La/sue;La/lsn;La/duj;La/iip;La/vqc;La/qv2;La/lbu;La/g2v;La/ctf0;La/i1w0;La/peg0;La/j1q0;La/pru;La/wdk0;La/viu;La/rtu;La/r9u;La/zfo;La/qj9;La/edo;La/nvu;La/ulk;La/gst0;La/h3c;)V

    .line 255
    .line 256
    .line 257
    move-object v3, v4

    .line 258
    goto :goto_2

    .line 259
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 260
    .line 261
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    :goto_2
    return-object v3

    .line 269
    :pswitch_1
    sget-object v1, La/eta0;->P1:La/xi70;

    .line 270
    .line 271
    invoke-virtual {v0}, La/eta0;->G0()La/k3t0;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    sget-object v1, La/cqa0;->a:La/cqa0;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
