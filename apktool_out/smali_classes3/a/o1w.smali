.class public final synthetic La/o1w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s1w;


# direct methods
.method public synthetic constructor <init>(La/s1w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o1w;->a:B

    iput-object p1, p0, La/o1w;->b:La/s1w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o1w;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/o1w;->b:La/s1w;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Landroid/os/Bundle;

    .line 17
    .line 18
    sget-object v3, La/s1w;->d2:La/bst;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast v1, La/d4w;

    .line 38
    .line 39
    iget-object v2, v0, La/naw;->R:La/z4w;

    .line 40
    .line 41
    iget-object v0, v0, La/naw;->C0:La/ql5;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-wide v3, v0, La/ql5;->a:J

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v2, v1, v3, v4}, La/z4w;->z(La/d4w;J)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    move-object/from16 v1, p1

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    move-object/from16 v2, p2

    .line 61
    .line 62
    check-cast v2, Landroid/os/Bundle;

    .line 63
    .line 64
    sget-object v3, La/s1w;->d2:La/bst;

    .line 65
    .line 66
    const-string v3, "REQUEST_EDIT_COUPON_DIALOG"

    .line 67
    .line 68
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, v0, La/naw;->e:La/ort;

    .line 82
    .line 83
    iget-object v1, v1, La/ort;->a:La/gst0;

    .line 84
    .line 85
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    const/4 v1, 0x1

    .line 92
    invoke-virtual {v0, v1}, La/naw;->G(Z)V

    .line 93
    .line 94
    .line 95
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_1
    return-object v0

    .line 98
    :pswitch_1
    move-object/from16 v1, p1

    .line 99
    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    move-object/from16 v2, p2

    .line 103
    .line 104
    check-cast v2, Landroid/os/Bundle;

    .line 105
    .line 106
    sget-object v3, La/s1w;->d2:La/bst;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast v1, La/pdj;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, La/naw;->D(La/pdj;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_2
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    move-object/from16 v2, p2

    .line 138
    .line 139
    check-cast v2, Landroid/os/Bundle;

    .line 140
    .line 141
    sget-object v3, La/s1w;->d2:La/bst;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-object v4, v1

    .line 157
    check-cast v4, La/n3w;

    .line 158
    .line 159
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-wide v5, v4, La/n3w;->m:D

    .line 164
    .line 165
    iget-object v0, v3, La/naw;->l0:La/q37;

    .line 166
    .line 167
    iget-object v1, v0, La/q37;->b:La/b4j;

    .line 168
    .line 169
    sget-object v2, La/a1w;->l:La/a1w;

    .line 170
    .line 171
    sget-object v7, La/r6w;->k:La/r6w;

    .line 172
    .line 173
    invoke-static {v1, v2, v7}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v0, La/q37;->c:La/au0;

    .line 177
    .line 178
    invoke-virtual {v7}, La/r6w;->a()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, La/au0;->j(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v3, La/naw;->W0:La/p7m0;

    .line 186
    .line 187
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    move-object v7, v1

    .line 192
    check-cast v7, La/l9h0;

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    const/16 v21, 0x7ffd

    .line 197
    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x1

    .line 200
    const/4 v10, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    const/4 v12, 0x0

    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    invoke-static/range {v7 .. v21}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_3

    .line 223
    .line 224
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const-class v1, La/naw;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    const-string v2, ".onSaleConfirmed"

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    const-class v2, La/oqt0;

    .line 241
    .line 242
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    iget-object v2, v3, La/naw;->L:La/mne;

    .line 247
    .line 248
    iget-object v9, v2, La/mne;->b:La/dvj;

    .line 249
    .line 250
    new-instance v14, La/z8t;

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const/4 v8, 0x2

    .line 254
    move-object v2, v14

    .line 255
    invoke-direct/range {v2 .. v8}, La/z8t;-><init>(Ljava/lang/Object;Ljava/lang/Object;DLa/yje;B)V

    .line 256
    .line 257
    .line 258
    new-instance v2, La/p8w;

    .line 259
    .line 260
    invoke-direct {v2, v3, v4}, La/p8w;-><init>(La/naw;La/n3w;)V

    .line 261
    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    const/16 v19, 0x254

    .line 266
    .line 267
    move-object/from16 v16, v9

    .line 268
    .line 269
    const/4 v9, 0x3

    .line 270
    const-wide/16 v10, 0x0

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    move-object v7, v0

    .line 275
    move-object v8, v1

    .line 276
    move-object/from16 v17, v2

    .line 277
    .line 278
    invoke-static/range {v7 .. v19}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 279
    .line 280
    .line 281
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object v0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
