.class public final synthetic La/vjl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:La/bkl;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:La/pz40;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;La/bkl;Landroid/content/Context;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/vjl;->a:B

    iput-object p1, p0, La/vjl;->b:Ljava/util/Map;

    iput-object p2, p0, La/vjl;->c:La/bkl;

    iput-object p3, p0, La/vjl;->d:Landroid/content/Context;

    iput-object p4, p0, La/vjl;->e:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/vjl;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/vjl;->e:La/pz40;

    .line 6
    .line 7
    iget-object v4, p0, La/vjl;->d:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v5, p0, La/vjl;->c:La/bkl;

    .line 10
    .line 11
    iget-object p0, p0, La/vjl;->b:Ljava/util/Map;

    .line 12
    .line 13
    check-cast p1, La/kz3;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v6, v5, La/bkl;->a:J

    .line 22
    .line 23
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/y3d;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 42
    .line 43
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object p1, v1

    .line 64
    :goto_0
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_2
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    div-int/2addr p1, v2

    .line 83
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p1}, La/fbc;->d(I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    iget-wide v4, v5, La/bkl;->a:J

    .line 92
    .line 93
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v2, La/y3d;

    .line 98
    .line 99
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    new-instance p0, La/y3d;

    .line 106
    .line 107
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_1
    return-object p0

    .line 116
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-wide v6, v5, La/bkl;->a:J

    .line 120
    .line 121
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La/y3d;

    .line 130
    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 140
    .line 141
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 155
    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    move-object p1, v1

    .line 162
    :goto_2
    if-eqz p1, :cond_6

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_6

    .line 169
    .line 170
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :cond_6
    if-eqz v1, :cond_7

    .line 175
    .line 176
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    div-int/2addr p1, v2

    .line 181
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-static {p1}, La/fbc;->d(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v0

    .line 189
    iget-wide v4, v5, La/bkl;->a:J

    .line 190
    .line 191
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v2, La/y3d;

    .line 196
    .line 197
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    new-instance p0, La/y3d;

    .line 204
    .line 205
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_3
    return-object p0

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
