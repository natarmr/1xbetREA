.class public final Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final q:La/dc3;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public t:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v2, p2

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v1, v0, v2, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const v5, 0x7f0d0699

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    const v2, 0x7f0a045c

    .line 32
    .line 33
    .line 34
    move v5, v2

    .line 35
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    const v5, 0x7f0a04a6

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 49
    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    const v5, 0x7f0a05bc

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 60
    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    const v5, 0x7f0a0604

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    const v5, 0x7f0a0a9d

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    check-cast v9, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 82
    .line 83
    if-eqz v9, :cond_1

    .line 84
    .line 85
    const v5, 0x7f0a0ac9

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    check-cast v10, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 93
    .line 94
    if-eqz v10, :cond_1

    .line 95
    .line 96
    const v5, 0x7f0a0b3a

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PicCodeEditField;

    .line 104
    .line 105
    if-eqz v11, :cond_1

    .line 106
    .line 107
    const v5, 0x7f0a0b3b

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    check-cast v12, Landroid/widget/TextView;

    .line 115
    .line 116
    if-eqz v12, :cond_1

    .line 117
    .line 118
    const v5, 0x7f0a0c14

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    check-cast v13, Landroid/widget/ImageView;

    .line 126
    .line 127
    if-eqz v13, :cond_1

    .line 128
    .line 129
    const v5, 0x7f0a0d9d

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v14

    .line 136
    check-cast v14, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 137
    .line 138
    if-eqz v14, :cond_1

    .line 139
    .line 140
    const v5, 0x7f0a0e19

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    check-cast v15, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 148
    .line 149
    if-eqz v15, :cond_1

    .line 150
    .line 151
    const v5, 0x7f0a0fa2

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    check-cast v16, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 159
    .line 160
    if-eqz v16, :cond_1

    .line 161
    .line 162
    const v5, 0x7f0a12ed

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v17

    .line 169
    check-cast v17, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 170
    .line 171
    if-eqz v17, :cond_1

    .line 172
    .line 173
    const v5, 0x7f0a1475

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v18

    .line 180
    check-cast v18, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;

    .line 181
    .line 182
    if-eqz v18, :cond_1

    .line 183
    .line 184
    new-instance v0, La/dc3;

    .line 185
    .line 186
    move-object v3, v6

    .line 187
    move-object v4, v7

    .line 188
    move-object v5, v8

    .line 189
    move-object v6, v9

    .line 190
    move-object v7, v10

    .line 191
    move-object v8, v11

    .line 192
    move-object v9, v12

    .line 193
    move-object v10, v13

    .line 194
    move-object v11, v14

    .line 195
    move-object v12, v15

    .line 196
    move-object/from16 v13, v16

    .line 197
    .line 198
    move-object/from16 v14, v17

    .line 199
    .line 200
    move-object/from16 v15, v18

    .line 201
    .line 202
    invoke-direct/range {v0 .. v15}, La/dc3;-><init>(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;Landroid/view/View;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PicCodeEditField;Landroid/widget/TextView;Landroid/widget/ImageView;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 203
    .line 204
    .line 205
    iput-object v0, v1, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->q:La/dc3;

    .line 206
    .line 207
    new-instance v9, La/ryl;

    .line 208
    .line 209
    move-object/from16 v16, v8

    .line 210
    .line 211
    const/16 v8, 0xc

    .line 212
    .line 213
    move-object/from16 v17, v10

    .line 214
    .line 215
    move-object/from16 v10, p1

    .line 216
    .line 217
    invoke-direct {v9, v10, v8}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 218
    .line 219
    .line 220
    invoke-static {v9}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    iput-object v8, v1, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->r:La/n0o0;

    .line 225
    .line 226
    new-instance v8, La/ryl;

    .line 227
    .line 228
    const/16 v9, 0xd

    .line 229
    .line 230
    invoke-direct {v8, v10, v9}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 231
    .line 232
    .line 233
    invoke-static {v8}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    iput-object v8, v1, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->s:La/n0o0;

    .line 238
    .line 239
    invoke-direct {v1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->getNotActiveDividerState()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    invoke-virtual {v2, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v1, v7}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 247
    .line 248
    .line 249
    invoke-direct {v1, v14}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v1, v13}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, v5}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 256
    .line 257
    .line 258
    invoke-direct {v1, v4}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {v1, v12}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v1, v11}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 265
    .line 266
    .line 267
    invoke-direct {v1, v3}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 268
    .line 269
    .line 270
    invoke-direct {v1, v6}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v1, v15}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V

    .line 274
    .line 275
    .line 276
    sget-object v2, La/ymx;->b:La/ymx;

    .line 277
    .line 278
    new-instance v3, La/yhn;

    .line 279
    .line 280
    const/16 v4, 0x8

    .line 281
    .line 282
    invoke-direct {v3, v0, v4}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v10, v17

    .line 286
    .line 287
    invoke-static {v10, v2, v3}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 288
    .line 289
    .line 290
    new-instance v2, La/qzn;

    .line 291
    .line 292
    const/4 v3, 0x0

    .line 293
    invoke-direct {v2, v1, v0, v3}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v8, v16

    .line 297
    .line 298
    invoke-virtual {v8, v2}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PicCodeEditField;->setPinCodeChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_1
    move v2, v5

    .line 303
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v1, "Missing required view with ID: "

    .line 312
    .line 313
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v3
.end method

.method private final getActiveDividerState()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getNotActiveDividerState()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final setNumberButtonListener(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PinCodeSymbolButton;)V
    .locals 3

    .line 1
    sget-object v0, La/ymx;->b:La/ymx;

    .line 2
    .line 3
    new-instance v1, La/dpl;

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, v2}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final u(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;La/dc3;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->t:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p1, La/dc3;->c:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->getNotActiveDividerState()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->getActiveDividerState()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->q:La/dc3;

    .line 5
    .line 6
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PicCodeEditField;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/PicCodeEditField;->h:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    return-void
.end method

.method public final setError(I)V
    .locals 1

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setError(Ljava/lang/String;)V

    return-void
.end method

.method public final setError(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setTitle(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->q:La/dc3;

    .line 8
    .line 9
    iget-object p1, p1, La/dc3;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v0, 0x7f040b77

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setPinCodeChangedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->t:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->q:La/dc3;

    .line 5
    .line 6
    iget-object v1, v0, La/dc3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, v0, La/dc3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const v0, 0x7f040b0b

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
