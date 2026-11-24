.class public final synthetic La/e2j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w5j0;


# direct methods
.method public synthetic constructor <init>(La/w5j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e2j0;->a:B

    iput-object p1, p0, La/e2j0;->b:La/w5j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/e2j0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, La/e2j0;->b:La/w5j0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/cp;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v4}, La/xhe0;->q(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    check-cast v0, La/c6j0;

    .line 23
    .line 24
    iget-object v0, v0, La/c6j0;->c:La/dc3;

    .line 25
    .line 26
    iget-object v0, v0, La/dc3;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 29
    .line 30
    new-instance v1, La/f2j0;

    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-direct {v1, p0, v2}, La/f2j0;-><init>(La/w5j0;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/ctv;

    .line 40
    .line 41
    const/16 v0, 0x1b

    .line 42
    .line 43
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p1, La/h4j0;->c:La/h4j0;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/w5j0;->B(La/h4j0;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object p1, La/h4j0;->b:La/h4j0;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/w5j0;->B(La/h4j0;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-object p1, La/h4j0;->a:La/h4j0;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, La/w5j0;->B(La/h4j0;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_3
    check-cast p1, La/cp;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, La/xhe0;->q(Z)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 100
    .line 101
    check-cast v0, La/s3j0;

    .line 102
    .line 103
    iget-object v1, v0, La/s3j0;->c:La/dc3;

    .line 104
    .line 105
    iget-object v1, v1, La/dc3;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 108
    .line 109
    new-instance v2, La/f2j0;

    .line 110
    .line 111
    const/4 v3, 0x4

    .line 112
    invoke-direct {v2, p0, v3}, La/f2j0;-><init>(La/w5j0;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, La/s3j0;->b:La/dc3;

    .line 119
    .line 120
    iget-object v0, v0, La/dc3;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 123
    .line 124
    new-instance v1, La/f2j0;

    .line 125
    .line 126
    const/4 v2, 0x5

    .line 127
    invoke-direct {v1, p0, v2}, La/f2j0;-><init>(La/w5j0;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 131
    .line 132
    .line 133
    new-instance p0, La/ctv;

    .line 134
    .line 135
    const/16 v0, 0x1a

    .line 136
    .line 137
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_4
    check-cast p1, La/cp;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v4}, La/xhe0;->q(Z)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 155
    .line 156
    check-cast v0, La/k3j0;

    .line 157
    .line 158
    iget-object v4, v0, La/k3j0;->d:La/dc3;

    .line 159
    .line 160
    iget-object v4, v4, La/dc3;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 163
    .line 164
    new-instance v5, La/f2j0;

    .line 165
    .line 166
    invoke-direct {v5, p0, v3}, La/f2j0;-><init>(La/w5j0;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v0, La/k3j0;->c:La/dc3;

    .line 173
    .line 174
    iget-object v3, v3, La/dc3;->e:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 177
    .line 178
    new-instance v4, La/f2j0;

    .line 179
    .line 180
    invoke-direct {v4, p0, v2}, La/f2j0;-><init>(La/w5j0;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, La/k3j0;->b:La/dc3;

    .line 187
    .line 188
    iget-object v0, v0, La/dc3;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 191
    .line 192
    new-instance v2, La/f2j0;

    .line 193
    .line 194
    invoke-direct {v2, p0, v1}, La/f2j0;-><init>(La/w5j0;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 198
    .line 199
    .line 200
    new-instance p0, La/ctv;

    .line 201
    .line 202
    const/16 v0, 0x19

    .line 203
    .line 204
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object p1, La/d5j0;->a:La/d5j0;

    .line 219
    .line 220
    invoke-virtual {p0, p1}, La/w5j0;->F(La/j5j0;)V

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_6
    check-cast p1, La/cp;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 232
    .line 233
    check-cast v0, La/h2j0;

    .line 234
    .line 235
    iget-object v5, v0, La/h2j0;->d:La/dc3;

    .line 236
    .line 237
    iget-object v5, v5, La/dc3;->e:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 240
    .line 241
    new-instance v6, La/n2j0;

    .line 242
    .line 243
    invoke-direct {v6, v0, p1, p0, v4}, La/n2j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    .line 248
    .line 249
    iget-object v4, v0, La/h2j0;->b:La/dc3;

    .line 250
    .line 251
    iget-object v4, v4, La/dc3;->e:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v4, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 254
    .line 255
    new-instance v5, La/n2j0;

    .line 256
    .line 257
    invoke-direct {v5, v0, p1, p0, v3}, La/n2j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    .line 262
    .line 263
    iget-object v3, v0, La/h2j0;->c:La/dc3;

    .line 264
    .line 265
    iget-object v3, v3, La/dc3;->e:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 268
    .line 269
    new-instance v4, La/n2j0;

    .line 270
    .line 271
    invoke-direct {v4, v0, p1, p0, v2}, La/n2j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    .line 276
    .line 277
    new-instance p0, La/kzi0;

    .line 278
    .line 279
    invoke-direct {p0, p1, v1}, La/kzi0;-><init>(La/cp;B)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 283
    .line 284
    .line 285
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_7
    check-cast p1, La/cp;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v4}, La/xhe0;->q(Z)V

    .line 294
    .line 295
    .line 296
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 297
    .line 298
    check-cast v0, La/g2j0;

    .line 299
    .line 300
    iget-object v0, v0, La/g2j0;->c:La/dc3;

    .line 301
    .line 302
    iget-object v0, v0, La/dc3;->e:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 305
    .line 306
    new-instance v1, La/f2j0;

    .line 307
    .line 308
    invoke-direct {v1, p0, v4}, La/f2j0;-><init>(La/w5j0;B)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 312
    .line 313
    .line 314
    new-instance p0, La/ctv;

    .line 315
    .line 316
    const/16 v0, 0x18

    .line 317
    .line 318
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 322
    .line 323
    .line 324
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object p0

    .line 327
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
