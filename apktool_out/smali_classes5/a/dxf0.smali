.class public final synthetic La/dxf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hxf0;


# direct methods
.method public synthetic constructor <init>(La/hxf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dxf0;->a:B

    iput-object p1, p0, La/dxf0;->b:La/hxf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dxf0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/dxf0;->b:La/hxf0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 12
    .line 13
    invoke-virtual {v2}, La/hxf0;->H0()La/sxf0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, La/sxf0;->v:La/bby;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, v0, La/sxf0;->s:La/p7m0;

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    sget-object v1, La/hxf0;->V1:La/zie0;

    .line 38
    .line 39
    iget-object v6, v0, La/dxf0;->b:La/hxf0;

    .line 40
    .line 41
    iget-object v4, v6, La/hxf0;->O1:La/wdk0;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    new-instance v5, La/xdk0;

    .line 46
    .line 47
    sget-object v8, La/rek0;->b:La/rek0;

    .line 48
    .line 49
    const v0, 0x7f130dca

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/4 v13, 0x0

    .line 60
    const/16 v14, 0x7c

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v12, 0x0

    .line 65
    move-object v7, v5

    .line 66
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 67
    .line 68
    .line 69
    const/16 v11, 0x3fc

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 75
    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    const-string v0, "snackbarManager"

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v3

    .line 86
    :pswitch_1
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :pswitch_2
    new-instance v0, La/t0h0;

    .line 94
    .line 95
    iget-object v1, v2, La/hxf0;->Q1:La/asi;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct {v0, v1, v2}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_2
    const-string v0, "viewModelFactory"

    .line 108
    .line 109
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v3

    .line 113
    :pswitch_3
    sget-object v0, La/hxf0;->V1:La/zie0;

    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    instance-of v1, v0, La/af3;

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    check-cast v0, La/af3;

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    move-object v0, v3

    .line 134
    :goto_0
    const-class v1, La/qwf0;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, La/o5d0;

    .line 147
    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/ze3;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_4
    move-object v0, v3

    .line 158
    :goto_1
    instance-of v4, v0, La/qwf0;

    .line 159
    .line 160
    if-nez v4, :cond_5

    .line 161
    .line 162
    move-object v0, v3

    .line 163
    :cond_5
    check-cast v0, La/qwf0;

    .line 164
    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    iget-object v1, v2, La/hxf0;->L1:La/phf0;

    .line 168
    .line 169
    sget-object v3, La/hxf0;->W1:[La/iiy;

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    aget-object v3, v3, v4

    .line 173
    .line 174
    invoke-virtual {v1, v2, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v19

    .line 178
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v9, v0, La/qwf0;->a:La/duj;

    .line 189
    .line 190
    iget-object v5, v0, La/qwf0;->b:La/cad;

    .line 191
    .line 192
    iget-object v6, v0, La/qwf0;->d:La/lef0;

    .line 193
    .line 194
    iget-object v7, v0, La/qwf0;->c:La/gst0;

    .line 195
    .line 196
    iget-object v10, v0, La/qwf0;->e:La/rjo;

    .line 197
    .line 198
    iget-object v11, v0, La/qwf0;->f:La/s31;

    .line 199
    .line 200
    iget-object v12, v0, La/qwf0;->g:La/cyh;

    .line 201
    .line 202
    iget-object v8, v0, La/qwf0;->l:La/ii;

    .line 203
    .line 204
    iget-object v13, v0, La/qwf0;->h:La/z4w0;

    .line 205
    .line 206
    iget-object v1, v0, La/qwf0;->i:La/d190;

    .line 207
    .line 208
    iget-object v14, v0, La/qwf0;->j:La/iqt;

    .line 209
    .line 210
    iget-object v15, v0, La/qwf0;->k:La/rou;

    .line 211
    .line 212
    iget-object v2, v0, La/qwf0;->m:La/gii0;

    .line 213
    .line 214
    iget-object v3, v0, La/qwf0;->n:La/btt0;

    .line 215
    .line 216
    iget-object v4, v0, La/qwf0;->o:La/ctf0;

    .line 217
    .line 218
    move-object/from16 v16, v1

    .line 219
    .line 220
    iget-object v1, v0, La/qwf0;->q:La/wdk0;

    .line 221
    .line 222
    move-object/from16 v17, v1

    .line 223
    .line 224
    iget-object v1, v0, La/qwf0;->r:La/at4;

    .line 225
    .line 226
    move-object/from16 v18, v1

    .line 227
    .line 228
    iget-object v1, v0, La/qwf0;->p:La/knf0;

    .line 229
    .line 230
    iget-object v0, v0, La/qwf0;->s:La/sek;

    .line 231
    .line 232
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object/from16 v16, v4

    .line 260
    .line 261
    new-instance v4, La/bsi;

    .line 262
    .line 263
    move-object/from16 v18, v0

    .line 264
    .line 265
    invoke-direct/range {v4 .. v19}, La/bsi;-><init>(La/cad;La/lef0;La/gst0;La/ii;La/duj;La/rjo;La/s31;La/cyh;La/z4w0;La/iqt;La/rou;La/ctf0;La/wdk0;La/sek;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    move-object v3, v4

    .line 269
    goto :goto_2

    .line 270
    :cond_6
    const-string v0, "Cannot create dependency "

    .line 271
    .line 272
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :goto_2
    return-object v3

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
