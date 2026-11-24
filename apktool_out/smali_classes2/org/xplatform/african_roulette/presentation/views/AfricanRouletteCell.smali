.class public final Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:La/vd7;

.field public b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const p2, 0x7f0d007a

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    const p2, 0x7f0a077e

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/ImageView;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const p2, 0x7f0a12f8

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    new-instance p2, La/vd7;

    .line 48
    .line 49
    check-cast p1, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-direct {p2, p1, v0, v1, v2}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 56
    .line 57
    new-instance p1, La/b5;

    .line 58
    .line 59
    const/16 p2, 0xd

    .line 60
    .line 61
    invoke-direct {p1, p2}, La/b5;-><init>(B)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->b:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 67
    .line 68
    const/4 p2, -0x1

    .line 69
    invoke-direct {p1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "Missing required view with ID: "

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    throw p0
.end method


# virtual methods
.method public final a(La/z70;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 5
    .line 6
    iget-object v1, v0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast v1, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p1}, La/z70;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, La/vd7;->b:Landroid/view/ViewGroup;

    .line 18
    .line 19
    check-cast v0, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x3

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-eq v1, v3, :cond_0

    .line 30
    .line 31
    if-eq v1, v2, :cond_0

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    if-eq v1, v3, :cond_0

    .line 35
    .line 36
    const/4 v3, 0x7

    .line 37
    if-eq v1, v3, :cond_0

    .line 38
    .line 39
    const/16 v3, 0x9

    .line 40
    .line 41
    if-eq v1, v3, :cond_0

    .line 42
    .line 43
    const/16 v3, 0xb

    .line 44
    .line 45
    if-eq v1, v3, :cond_0

    .line 46
    .line 47
    packed-switch v1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    const v1, 0x7f080334

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_0
    const v1, 0x7f080335

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    const v1, 0x7f08033c

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    const v1, 0x7f080336

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    const v1, 0x7f080337

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const v1, 0x7f08033b

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const v1, 0x7f080339

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/wg;

    .line 81
    .line 82
    invoke-direct {v1, p0, p1, v2}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getBetType$african_roulette()La/z70;
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    packed-switch v0, :pswitch_data_1

    .line 23
    .line 24
    .line 25
    sparse-switch v0, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :sswitch_0
    const-string v0, "BLACK"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget-object p0, La/z70;->u:La/z70;

    .line 39
    .line 40
    return-object p0

    .line 41
    :sswitch_1
    const-string v0, "7-12"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    sget-object p0, La/z70;->p:La/z70;

    .line 50
    .line 51
    return-object p0

    .line 52
    :sswitch_2
    const-string v0, "RED"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    sget-object p0, La/z70;->t:La/z70;

    .line 61
    .line 62
    return-object p0

    .line 63
    :sswitch_3
    const-string v0, "MID"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    sget-object p0, La/z70;->r:La/z70;

    .line 72
    .line 73
    return-object p0

    .line 74
    :sswitch_4
    const-string v0, "1-6"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    sget-object p0, La/z70;->o:La/z70;

    .line 83
    .line 84
    return-object p0

    .line 85
    :sswitch_5
    const-string v0, "LO"

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    sget-object p0, La/z70;->q:La/z70;

    .line 94
    .line 95
    return-object p0

    .line 96
    :sswitch_6
    const-string v0, "HI"

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    sget-object p0, La/z70;->s:La/z70;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_0
    const-string v0, "12"

    .line 108
    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    .line 115
    sget-object p0, La/z70;->n:La/z70;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_1
    const-string v0, "11"

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_0

    .line 125
    .line 126
    sget-object p0, La/z70;->m:La/z70;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_2
    const-string v0, "10"

    .line 130
    .line 131
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    sget-object p0, La/z70;->l:La/z70;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_3
    const-string v0, "9"

    .line 141
    .line 142
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_0

    .line 147
    .line 148
    sget-object p0, La/z70;->k:La/z70;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_4
    const-string v0, "8"

    .line 152
    .line 153
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_0

    .line 158
    .line 159
    sget-object p0, La/z70;->j:La/z70;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_5
    const-string v0, "7"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_0

    .line 169
    .line 170
    sget-object p0, La/z70;->i:La/z70;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_6
    const-string v0, "6"

    .line 174
    .line 175
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_0

    .line 180
    .line 181
    sget-object p0, La/z70;->h:La/z70;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_7
    const-string v0, "5"

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_0

    .line 191
    .line 192
    sget-object p0, La/z70;->g:La/z70;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_8
    const-string v0, "4"

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_0

    .line 202
    .line 203
    sget-object p0, La/z70;->f:La/z70;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_9
    const-string v0, "3"

    .line 207
    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_0

    .line 213
    .line 214
    sget-object p0, La/z70;->e:La/z70;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_a
    const-string v0, "2"

    .line 218
    .line 219
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_0

    .line 224
    .line 225
    sget-object p0, La/z70;->d:La/z70;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_b
    const-string v0, "1"

    .line 229
    .line 230
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_0

    .line 235
    .line 236
    sget-object p0, La/z70;->c:La/z70;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_c
    const-string v0, "0"

    .line 240
    .line 241
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_0

    .line 246
    .line 247
    sget-object p0, La/z70;->b:La/z70;

    .line 248
    .line 249
    return-object p0

    .line 250
    :cond_0
    :goto_0
    const-string v0, "Unknown bet type: "

    .line 251
    .line 252
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 p0, 0x0

    .line 260
    return-object p0

    .line 261
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :pswitch_data_1
    .packed-switch 0x61f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    :sswitch_data_0
    .sparse-switch
        0x901 -> :sswitch_6
        0x983 -> :sswitch_5
        0xbd9a -> :sswitch_4
        0x12a28 -> :sswitch_3
        0x13c71 -> :sswitch_2
        0x19af77 -> :sswitch_1
        0x3c597df -> :sswitch_0
    .end sparse-switch
.end method

.method public final setCellClickListener$african_roulette(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/z70;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
