.class public final synthetic La/cns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gns;


# direct methods
.method public synthetic constructor <init>(La/gns;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cns;->a:B

    iput-object p1, p0, La/cns;->b:La/gns;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cns;->a:B

    .line 4
    .line 5
    sget-object v2, La/yms;->a:La/yms;

    .line 6
    .line 7
    iget-object v0, v0, La/cns;->b:La/gns;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/gns;->R1:La/pek;

    .line 13
    .line 14
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/sms;

    .line 19
    .line 20
    const-class v2, La/gns;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, v2}, La/sms;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    sget-object v1, La/gns;->R1:La/pek;

    .line 36
    .line 37
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v3, La/vms;->a:La/vms;

    .line 42
    .line 43
    invoke-virtual {v1, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    sget-object v1, La/gns;->R1:La/pek;

    .line 57
    .line 58
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, La/wms;->a:La/wms;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, La/gns;->O1:La/ywq;

    .line 68
    .line 69
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/ywq;->a(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_2
    sget-object v1, La/gns;->R1:La/pek;

    .line 76
    .line 77
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_3
    sget-object v1, La/gns;->R1:La/pek;

    .line 88
    .line 89
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v1, La/tms;->a:La/tms;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_4
    sget-object v1, La/gns;->R1:La/pek;

    .line 102
    .line 103
    new-instance v1, La/q0h0;

    .line 104
    .line 105
    iget-object v0, v0, La/gns;->M1:La/a8z;

    .line 106
    .line 107
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/whi;

    .line 112
    .line 113
    iget-object v0, v0, La/whi;->t:La/n5d0;

    .line 114
    .line 115
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/vhi;

    .line 120
    .line 121
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_5
    sget-object v1, La/gns;->R1:La/pek;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    instance-of v2, v1, La/af3;

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    if-eqz v2, :cond_0

    .line 142
    .line 143
    check-cast v1, La/af3;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    move-object v1, v3

    .line 147
    :goto_0
    const-class v2, La/bns;

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, La/o5d0;

    .line 160
    .line 161
    if-eqz v1, :cond_1

    .line 162
    .line 163
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, La/ze3;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_1
    move-object v1, v3

    .line 171
    :goto_1
    instance-of v4, v1, La/bns;

    .line 172
    .line 173
    if-nez v4, :cond_2

    .line 174
    .line 175
    move-object v1, v3

    .line 176
    :cond_2
    check-cast v1, La/bns;

    .line 177
    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    iget-object v2, v0, La/gns;->Q1:La/khf0;

    .line 185
    .line 186
    sget-object v3, La/gns;->S1:[La/iiy;

    .line 187
    .line 188
    const/4 v4, 0x1

    .line 189
    aget-object v3, v3, v4

    .line 190
    .line 191
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    move-object v10, v0

    .line 196
    check-cast v10, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 197
    .line 198
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v11, v1, La/bns;->a:La/m1e;

    .line 202
    .line 203
    iget-object v8, v1, La/bns;->b:La/ii;

    .line 204
    .line 205
    iget-object v5, v1, La/bns;->c:La/mne;

    .line 206
    .line 207
    iget-object v6, v1, La/bns;->d:La/iip;

    .line 208
    .line 209
    iget-object v12, v1, La/bns;->e:La/wdk0;

    .line 210
    .line 211
    iget-object v13, v1, La/bns;->f:La/hru;

    .line 212
    .line 213
    iget-object v14, v1, La/bns;->g:La/rjo;

    .line 214
    .line 215
    iget-object v7, v1, La/bns;->h:La/wdd0;

    .line 216
    .line 217
    iget-object v15, v1, La/bns;->i:La/duj;

    .line 218
    .line 219
    iget-object v0, v1, La/bns;->j:La/ctf0;

    .line 220
    .line 221
    iget-object v2, v1, La/bns;->k:La/gst0;

    .line 222
    .line 223
    iget-object v3, v1, La/bns;->l:La/kt2;

    .line 224
    .line 225
    iget-object v4, v1, La/bns;->m:La/bzt;

    .line 226
    .line 227
    move-object/from16 v16, v0

    .line 228
    .line 229
    iget-object v0, v1, La/bns;->n:La/knf0;

    .line 230
    .line 231
    move-object/from16 v20, v0

    .line 232
    .line 233
    iget-object v0, v1, La/bns;->o:La/peg0;

    .line 234
    .line 235
    move-object/from16 v21, v0

    .line 236
    .line 237
    iget-object v0, v1, La/bns;->p:La/ix0;

    .line 238
    .line 239
    iget-object v1, v1, La/bns;->q:La/sd60;

    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-object/from16 v19, v4

    .line 269
    .line 270
    new-instance v4, La/whi;

    .line 271
    .line 272
    move-object/from16 v22, v0

    .line 273
    .line 274
    move-object/from16 v23, v1

    .line 275
    .line 276
    move-object/from16 v17, v2

    .line 277
    .line 278
    move-object/from16 v18, v3

    .line 279
    .line 280
    invoke-direct/range {v4 .. v23}, La/whi;-><init>(La/mne;La/iip;La/wdd0;La/ii;La/i1w0;Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;La/m1e;La/wdk0;La/hru;La/rjo;La/duj;La/ctf0;La/gst0;La/kt2;La/bzt;La/knf0;La/peg0;La/ix0;La/sd60;)V

    .line 281
    .line 282
    .line 283
    move-object v3, v4

    .line 284
    goto :goto_2

    .line 285
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 286
    .line 287
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    :goto_2
    return-object v3

    .line 295
    :pswitch_6
    sget-object v1, La/gns;->R1:La/pek;

    .line 296
    .line 297
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    sget-object v1, La/zms;->a:La/zms;

    .line 302
    .line 303
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_7
    sget-object v1, La/gns;->R1:La/pek;

    .line 310
    .line 311
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    sget-object v1, La/xms;->a:La/xms;

    .line 316
    .line 317
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
