.class public final synthetic La/sy80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uy80;


# direct methods
.method public synthetic constructor <init>(La/uy80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sy80;->a:B

    iput-object p1, p0, La/sy80;->b:La/uy80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sy80;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/sy80;->b:La/uy80;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/uy80;->W1:La/jh70;

    .line 12
    .line 13
    invoke-virtual {v0}, La/uy80;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/dy80;->a:La/dy80;

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
    sget-object v1, La/uy80;->W1:La/jh70;

    .line 26
    .line 27
    invoke-virtual {v0}, La/uy80;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/ey80;->a:La/ey80;

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
    sget-object v1, La/uy80;->W1:La/jh70;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    instance-of v3, v1, La/af3;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    check-cast v1, La/af3;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v1, v2

    .line 60
    :goto_0
    const-class v3, La/vy80;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/o5d0;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/ze3;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object v1, v2

    .line 84
    :goto_1
    instance-of v4, v1, La/vy80;

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    move-object v1, v2

    .line 89
    :cond_2
    check-cast v1, La/vy80;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v2, v0, La/uy80;->Q1:La/phf0;

    .line 94
    .line 95
    sget-object v3, La/uy80;->X1:[La/iiy;

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    aget-object v4, v3, v4

    .line 99
    .line 100
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    iget-object v2, v0, La/uy80;->R1:La/r34;

    .line 105
    .line 106
    const/4 v4, 0x1

    .line 107
    aget-object v4, v3, v4

    .line 108
    .line 109
    invoke-virtual {v2, v0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v17

    .line 113
    iget-object v2, v0, La/uy80;->S1:La/cgx0;

    .line 114
    .line 115
    const/4 v4, 0x2

    .line 116
    aget-object v3, v3, v4

    .line 117
    .line 118
    invoke-virtual {v2, v0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v18

    .line 122
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v10, v1, La/vy80;->a:La/oeg0;

    .line 126
    .line 127
    iget-object v11, v1, La/vy80;->b:La/g2v;

    .line 128
    .line 129
    iget-object v12, v1, La/vy80;->c:La/duj;

    .line 130
    .line 131
    iget-object v6, v1, La/vy80;->d:La/cad;

    .line 132
    .line 133
    iget-object v13, v1, La/vy80;->e:La/m1e;

    .line 134
    .line 135
    iget-object v14, v1, La/vy80;->f:La/knf0;

    .line 136
    .line 137
    iget-object v15, v1, La/vy80;->g:La/gii0;

    .line 138
    .line 139
    iget-object v7, v1, La/vy80;->m:La/pyg;

    .line 140
    .line 141
    iget-object v0, v1, La/vy80;->h:La/cad;

    .line 142
    .line 143
    iget-object v8, v1, La/vy80;->k:La/iip;

    .line 144
    .line 145
    iget-object v2, v1, La/vy80;->i:La/gst0;

    .line 146
    .line 147
    iget-object v3, v1, La/vy80;->l:La/xri;

    .line 148
    .line 149
    iget-object v4, v1, La/vy80;->j:La/itr;

    .line 150
    .line 151
    iget-object v9, v1, La/vy80;->n:La/vqc;

    .line 152
    .line 153
    iget-object v5, v1, La/vy80;->o:La/b3c0;

    .line 154
    .line 155
    move-object/from16 v19, v0

    .line 156
    .line 157
    iget-object v0, v1, La/vy80;->p:La/btt0;

    .line 158
    .line 159
    move-object/from16 v20, v0

    .line 160
    .line 161
    iget-object v0, v1, La/vy80;->q:La/wdk0;

    .line 162
    .line 163
    move-object/from16 v22, v0

    .line 164
    .line 165
    iget-object v0, v1, La/vy80;->r:La/ctf0;

    .line 166
    .line 167
    move-object/from16 v23, v0

    .line 168
    .line 169
    iget-object v0, v1, La/vy80;->s:La/dnu;

    .line 170
    .line 171
    move-object/from16 v24, v0

    .line 172
    .line 173
    iget-object v0, v1, La/vy80;->t:La/poq0;

    .line 174
    .line 175
    move-object/from16 v25, v0

    .line 176
    .line 177
    iget-object v0, v1, La/vy80;->u:La/h3c;

    .line 178
    .line 179
    move-object/from16 v26, v0

    .line 180
    .line 181
    iget-object v0, v1, La/vy80;->v:La/kt2;

    .line 182
    .line 183
    move-object/from16 v27, v0

    .line 184
    .line 185
    iget-object v0, v1, La/vy80;->w:La/zr1;

    .line 186
    .line 187
    move-object/from16 v28, v0

    .line 188
    .line 189
    iget-object v0, v1, La/vy80;->x:La/bn6;

    .line 190
    .line 191
    iget-object v1, v1, La/vy80;->y:La/je;

    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-object/from16 v21, v5

    .line 236
    .line 237
    new-instance v5, La/hni;

    .line 238
    .line 239
    move-object/from16 v29, v0

    .line 240
    .line 241
    move-object/from16 v30, v1

    .line 242
    .line 243
    move-object/from16 v20, v2

    .line 244
    .line 245
    invoke-direct/range {v5 .. v30}, La/hni;-><init>(La/cad;La/pyg;La/iip;La/vqc;La/oeg0;La/g2v;La/duj;La/m1e;La/knf0;La/gii0;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;La/cad;La/gst0;La/b3c0;La/wdk0;La/ctf0;La/dnu;La/poq0;La/h3c;La/kt2;La/zr1;La/bn6;La/je;)V

    .line 246
    .line 247
    .line 248
    move-object v2, v5

    .line 249
    goto :goto_2

    .line 250
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 251
    .line 252
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :goto_2
    return-object v2

    .line 260
    :pswitch_2
    sget-object v1, La/uy80;->W1:La/jh70;

    .line 261
    .line 262
    iget-object v0, v0, La/uy80;->K1:La/fiu0;

    .line 263
    .line 264
    if-eqz v0, :cond_4

    .line 265
    .line 266
    return-object v0

    .line 267
    :cond_4
    const-string v0, "viewModelFactory"

    .line 268
    .line 269
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v2

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
