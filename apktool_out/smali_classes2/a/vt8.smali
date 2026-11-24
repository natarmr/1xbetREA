.class public final synthetic La/vt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vt8;->a:B

    iput-object p1, p0, La/vt8;->b:Landroid/view/Window;

    iput-boolean p2, p0, La/vt8;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/vt8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    const v3, 0x7f040b5d

    .line 6
    .line 7
    .line 8
    const v4, 0x7f040ae3

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-boolean v6, p0, La/vt8;->c:Z

    .line 13
    .line 14
    iget-object p0, p0, La/vt8;->b:Landroid/view/Window;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, La/lwk;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    if-eqz v6, :cond_2

    .line 27
    .line 28
    sget-object p1, La/nkk0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-static {}, La/a8k0;->A()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const/16 p1, 0x10

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p1, 0x30

    .line 40
    .line 41
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v0, La/nkk0;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    new-instance v1, La/mkk0;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 59
    .line 60
    invoke-direct {v1, v2}, La/mkk0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_1
    check-cast v1, La/mkk0;

    .line 67
    .line 68
    iget v0, v1, La/mkk0;->b:I

    .line 69
    .line 70
    add-int/2addr v0, v5

    .line 71
    iput v0, v1, La/mkk0;->b:I

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    new-instance p1, La/uwv0;

    .line 77
    .line 78
    invoke-direct {p1, p0, v6}, La/uwv0;-><init>(Landroid/view/Window;Z)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_0
    check-cast p1, La/lwk;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    if-eqz p0, :cond_a

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/4 v0, 0x0

    .line 94
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 95
    .line 96
    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 97
    .line 98
    and-int/lit8 v0, v0, -0x3

    .line 99
    .line 100
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, La/exv0;->a:Ljava/util/WeakHashMap;

    .line 109
    .line 110
    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const/16 v1, 0x1a

    .line 115
    .line 116
    const/16 v2, 0x1e

    .line 117
    .line 118
    const/16 v3, 0x23

    .line 119
    .line 120
    if-nez v0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    new-instance v4, La/ani0;

    .line 127
    .line 128
    invoke-direct {v4, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v0, v3, :cond_3

    .line 134
    .line 135
    new-instance v0, La/bjv0;

    .line 136
    .line 137
    invoke-direct {v0, p0, v4}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    if-lt v0, v2, :cond_4

    .line 142
    .line 143
    new-instance v0, La/ajv0;

    .line 144
    .line 145
    invoke-direct {v0, p0, v4}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_4
    if-lt v0, v1, :cond_5

    .line 150
    .line 151
    new-instance v0, La/ziv0;

    .line 152
    .line 153
    invoke-direct {v0, p0, v4}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    new-instance v0, La/yiv0;

    .line 158
    .line 159
    invoke-direct {v0, p0, v4}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 160
    .line 161
    .line 162
    :goto_1
    new-instance v4, La/dxv0;

    .line 163
    .line 164
    invoke-virtual {v0}, La/ycm0;->u()Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    invoke-virtual {v0}, La/ycm0;->t()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-direct {v4, v7, v0}, La/dxv0;-><init>(ZZ)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p0, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-object v0, v4

    .line 179
    :cond_6
    check-cast v0, La/dxv0;

    .line 180
    .line 181
    iget p1, v0, La/dxv0;->c:I

    .line 182
    .line 183
    add-int/2addr p1, v5

    .line 184
    iput p1, v0, La/dxv0;->c:I

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance v0, La/ani0;

    .line 191
    .line 192
    invoke-direct {v0, p1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 193
    .line 194
    .line 195
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 196
    .line 197
    if-lt p1, v3, :cond_7

    .line 198
    .line 199
    new-instance p1, La/bjv0;

    .line 200
    .line 201
    invoke-direct {p1, p0, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    if-lt p1, v2, :cond_8

    .line 206
    .line 207
    new-instance p1, La/ajv0;

    .line 208
    .line 209
    invoke-direct {p1, p0, v0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_8
    if-lt p1, v1, :cond_9

    .line 214
    .line 215
    new-instance p1, La/ziv0;

    .line 216
    .line 217
    invoke-direct {p1, p0, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_9
    new-instance p1, La/yiv0;

    .line 222
    .line 223
    invoke-direct {p1, p0, v0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 224
    .line 225
    .line 226
    :goto_2
    invoke-virtual {p1, v6}, La/ycm0;->w(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v6}, La/ycm0;->v(Z)V

    .line 230
    .line 231
    .line 232
    :cond_a
    new-instance p1, La/taf0;

    .line 233
    .line 234
    invoke-direct {p1, p0, v5}, La/taf0;-><init>(Landroid/view/Window;B)V

    .line 235
    .line 236
    .line 237
    return-object p1

    .line 238
    :pswitch_1
    check-cast p1, La/ilz;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    if-eqz p0, :cond_c

    .line 244
    .line 245
    if-eqz v6, :cond_b

    .line 246
    .line 247
    move v3, v4

    .line 248
    :cond_b
    invoke-static {p0, v3, v2, v1}, La/ofm0;->x(Landroid/view/Window;ILandroid/content/Context;I)V

    .line 249
    .line 250
    .line 251
    :cond_c
    new-instance p0, La/pa2;

    .line 252
    .line 253
    const/4 p1, 0x4

    .line 254
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_2
    check-cast p1, La/ilz;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    if-eqz p0, :cond_e

    .line 264
    .line 265
    if-eqz v6, :cond_d

    .line 266
    .line 267
    move v3, v4

    .line 268
    :cond_d
    invoke-static {p0, v3, v2, v1}, La/ofm0;->x(Landroid/view/Window;ILandroid/content/Context;I)V

    .line 269
    .line 270
    .line 271
    :cond_e
    new-instance p0, La/pa2;

    .line 272
    .line 273
    const/4 p1, 0x3

    .line 274
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 275
    .line 276
    .line 277
    return-object p0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
