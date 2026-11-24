.class public final synthetic La/eq00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lorg/xplatform/uikit/components/views/LoadableImageView;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eq00;->a:B

    iput-object p1, p0, La/eq00;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/eq00;->c:Lorg/xplatform/uikit/components/views/LoadableImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/views/LoadableImageView;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/eq00;->a:B

    iput-object p1, p0, La/eq00;->c:Lorg/xplatform/uikit/components/views/LoadableImageView;

    iput-object p2, p0, La/eq00;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/eq00;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/eq00;->c:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 6
    .line 7
    iget-object p0, p0, La/eq00;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    iget-object p0, v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v2

    .line 47
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 53
    .line 54
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 55
    .line 56
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_3

    .line 67
    .line 68
    iget-object p0, v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v1, v2

    .line 84
    :cond_3
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_5

    .line 107
    .line 108
    iget-object p0, v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

    .line 109
    .line 110
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    move v1, v2

    .line 124
    :cond_5
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 130
    .line 131
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 132
    .line 133
    new-instance v0, La/llo;

    .line 134
    .line 135
    const/16 v1, 0x10

    .line 136
    .line 137
    invoke-direct {v0, p0, p1, v1}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 141
    .line 142
    .line 143
    :goto_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_3
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 147
    .line 148
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v0, La/fq00;

    .line 154
    .line 155
    invoke-direct {v0, p0, p1, v1}, La/fq00;-><init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/drawable/Drawable;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :pswitch_4
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v0, La/fq00;

    .line 170
    .line 171
    invoke-direct {v0, p0, p1, v2}, La/fq00;-><init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/drawable/Drawable;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 179
    .line 180
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 181
    .line 182
    new-instance v0, La/b1;

    .line 183
    .line 184
    invoke-direct {v0, p0, p1, v3}, La/b1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;Lorg/xplatform/uikit/components/views/LoadableImageView;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :pswitch_6
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 192
    .line 193
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_7

    .line 209
    .line 210
    iget-object p0, v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

    .line 211
    .line 212
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    if-eqz p0, :cond_6

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_6
    move v1, v2

    .line 226
    :cond_7
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 232
    .line 233
    sget v0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 234
    .line 235
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    if-nez p0, :cond_9

    .line 246
    .line 247
    iget-object p0, v3, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    check-cast p0, Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-eqz p0, :cond_8

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_8
    move v1, v2

    .line 263
    :cond_9
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    nop

    .line 269
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
