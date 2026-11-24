.class public final La/mw0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:I

.field public final synthetic l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;IILa/w6k;La/pz40;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/mw0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/mw0;->j:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, La/mw0;->k:I

    .line 7
    .line 8
    iput p3, p0, La/mw0;->l:I

    .line 9
    .line 10
    iput-object p4, p0, La/mw0;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/mw0;->n:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/view/View;ILandroid/view/View;ILa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/mw0;->i:B

    .line 19
    iput-object p1, p0, La/mw0;->j:Landroid/view/View;

    iput p2, p0, La/mw0;->k:I

    iput-object p3, p0, La/mw0;->n:Ljava/lang/Object;

    iput p4, p0, La/mw0;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/mw0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mw0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/mw0;

    .line 9
    .line 10
    move-object v5, v1

    .line 11
    check-cast v5, Landroid/view/View;

    .line 12
    .line 13
    iget v6, p0, La/mw0;->l:I

    .line 14
    .line 15
    iget-object v3, p0, La/mw0;->j:Landroid/view/View;

    .line 16
    .line 17
    iget v4, p0, La/mw0;->k:I

    .line 18
    .line 19
    move-object v7, p2

    .line 20
    invoke-direct/range {v2 .. v7}, La/mw0;-><init>(Landroid/view/View;ILandroid/view/View;ILa/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v2, La/mw0;->m:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    move-object v7, p2

    .line 27
    new-instance v3, La/mw0;

    .line 28
    .line 29
    iget-object p1, p0, La/mw0;->m:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/w6k;

    .line 32
    .line 33
    move-object v8, v1

    .line 34
    check-cast v8, La/pz40;

    .line 35
    .line 36
    iget-object v4, p0, La/mw0;->j:Landroid/view/View;

    .line 37
    .line 38
    iget v5, p0, La/mw0;->k:I

    .line 39
    .line 40
    iget v6, p0, La/mw0;->l:I

    .line 41
    .line 42
    move-object v9, v7

    .line 43
    move-object v7, p1

    .line 44
    invoke-direct/range {v3 .. v9}, La/mw0;-><init>(Landroid/view/View;IILa/w6k;La/pz40;La/yje;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mw0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/cgx;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mw0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mw0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mw0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mw0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mw0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mw0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/mw0;->i:B

    .line 2
    .line 3
    iget v1, p0, La/mw0;->l:I

    .line 4
    .line 5
    iget-object v2, p0, La/mw0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, La/mw0;->k:I

    .line 8
    .line 9
    iget-object v4, p0, La/mw0;->j:Landroid/view/View;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/mw0;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/cgx;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, La/cgx;->c:Z

    .line 24
    .line 25
    iget v0, p0, La/cgx;->a:I

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget p1, p0, La/cgx;->b:I

    .line 30
    .line 31
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v4}, Landroid/view/View;->getPaddingRight()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    add-int/2addr v3, v0

    .line 48
    invoke-virtual {v4, p1, v5, v6, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 49
    .line 50
    .line 51
    check-cast v2, Landroid/view/View;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-boolean p0, p0, La/cgx;->c:Z

    .line 68
    .line 69
    if-eqz p0, :cond_1

    .line 70
    .line 71
    add-int/2addr v1, v0

    .line 72
    :cond_1
    invoke-virtual {v2, p1, v3, v4, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 73
    .line 74
    .line 75
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-static {v4}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    iget-object p1, p1, La/xiv0;->a:La/uiv0;

    .line 92
    .line 93
    invoke-virtual {p1}, La/uiv0;->h()La/vvk;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 v4, 0x1c

    .line 102
    .line 103
    if-lt v0, v4, :cond_3

    .line 104
    .line 105
    iget-object p1, p1, La/vvk;->a:Landroid/view/DisplayCutout;

    .line 106
    .line 107
    invoke-static {p1}, La/ia3;->i(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 113
    .line 114
    :goto_0
    if-eqz p1, :cond_7

    .line 115
    .line 116
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Landroid/graphics/Rect;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    iget-object p0, p0, La/mw0;->m:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/w6k;

    .line 127
    .line 128
    check-cast v2, La/pz40;

    .line 129
    .line 130
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    div-int/lit8 v4, v4, 0x2

    .line 137
    .line 138
    add-int/2addr v4, v0

    .line 139
    div-int/lit8 v0, v3, 0x4

    .line 140
    .line 141
    iget v5, p1, Landroid/graphics/Rect;->top:I

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    div-int/lit8 v6, v6, 0x2

    .line 148
    .line 149
    add-int/2addr v6, v5

    .line 150
    int-to-float v5, v1

    .line 151
    sget-object v7, La/qmk;->a:La/zcl;

    .line 152
    .line 153
    const/high16 v7, 0x42600000    # 56.0f

    .line 154
    .line 155
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    mul-float/2addr v8, v7

    .line 160
    add-float/2addr v8, v5

    .line 161
    const/4 v5, 0x0

    .line 162
    if-gt v1, v6, :cond_4

    .line 163
    .line 164
    float-to-int v1, v8

    .line 165
    if-gt v6, v1, :cond_4

    .line 166
    .line 167
    const/4 v5, 0x1

    .line 168
    :cond_4
    const/4 v1, 0x0

    .line 169
    if-ltz v4, :cond_5

    .line 170
    .line 171
    if-gt v4, v0, :cond_5

    .line 172
    .line 173
    if-eqz v5, :cond_5

    .line 174
    .line 175
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    int-to-float p1, p1

    .line 180
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    div-float/2addr p1, p0

    .line 185
    new-instance p0, La/fh80;

    .line 186
    .line 187
    const/16 v0, 0xe

    .line 188
    .line 189
    invoke-direct {p0, p1, v1, v0}, La/fh80;-><init>(FFI)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_5
    sub-int v0, v3, v0

    .line 197
    .line 198
    if-gt v0, v4, :cond_6

    .line 199
    .line 200
    if-gt v4, v3, :cond_6

    .line 201
    .line 202
    if-eqz v5, :cond_6

    .line 203
    .line 204
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    int-to-float p1, p1

    .line 209
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    div-float/2addr p1, p0

    .line 214
    new-instance p0, La/fh80;

    .line 215
    .line 216
    const/16 v0, 0xb

    .line 217
    .line 218
    invoke-direct {p0, v1, p1, v0}, La/fh80;-><init>(FFI)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_6
    new-instance p0, La/fh80;

    .line 226
    .line 227
    const/16 p1, 0xf

    .line 228
    .line 229
    invoke-direct {p0, v1, v1, p1}, La/fh80;-><init>(FFI)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_7
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
