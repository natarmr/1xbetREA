.class public final synthetic La/xc6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/xc6;->a:B

    iput p2, p0, La/xc6;->b:I

    iput p3, p0, La/xc6;->c:I

    iput-object p4, p0, La/xc6;->d:Ljava/lang/Object;

    iput-object p5, p0, La/xc6;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/xc6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/xc6;->d:Ljava/lang/Object;

    iput-object p4, p0, La/xc6;->e:Ljava/lang/Object;

    iput p1, p0, La/xc6;->b:I

    iput p2, p0, La/xc6;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;La/twk;IILandroid/graphics/Canvas;)V
    .locals 0

    .line 3
    const/4 p1, 0x1

    iput-byte p1, p0, La/xc6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/xc6;->d:Ljava/lang/Object;

    iput p3, p0, La/xc6;->b:I

    iput p4, p0, La/xc6;->c:I

    iput-object p5, p0, La/xc6;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/xc6;->a:B

    .line 2
    .line 3
    iget v1, p0, La/xc6;->c:I

    .line 4
    .line 5
    iget v2, p0, La/xc6;->b:I

    .line 6
    .line 7
    iget-object v3, p0, La/xc6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/xc6;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Ljava/util/ArrayList;

    .line 15
    .line 16
    check-cast v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    check-cast p1, La/ou90;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/pu90;

    .line 39
    .line 40
    iget v5, v0, La/pu90;->b:I

    .line 41
    .line 42
    sub-int v5, v2, v5

    .line 43
    .line 44
    div-int/lit8 v5, v5, 0x2

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual {p1, v0, v6, v5, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/pu90;

    .line 66
    .line 67
    iget v3, v0, La/pu90;->b:I

    .line 68
    .line 69
    sub-int v3, v2, v3

    .line 70
    .line 71
    div-int/lit8 v3, v3, 0x2

    .line 72
    .line 73
    invoke-virtual {p1, v0, v1, v3, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_0
    check-cast v4, La/cgk0;

    .line 81
    .line 82
    check-cast v3, La/l7m0;

    .line 83
    .line 84
    check-cast p1, La/w6k;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    div-int/2addr p0, v2

    .line 94
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    int-to-float v0, p0

    .line 105
    mul-float/2addr p1, v0

    .line 106
    sub-int/2addr p0, v1

    .line 107
    int-to-float p0, p0

    .line 108
    const/high16 v0, 0x40000000    # 2.0f

    .line 109
    .line 110
    div-float/2addr p0, v0

    .line 111
    add-float/2addr p0, p1

    .line 112
    invoke-static {p0}, La/si30;->b(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long p0, p0

    .line 117
    const/16 v0, 0x20

    .line 118
    .line 119
    shl-long/2addr p0, v0

    .line 120
    new-instance v0, La/ikx;

    .line 121
    .line 122
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_1
    check-cast v4, La/twk;

    .line 127
    .line 128
    check-cast v3, Landroid/graphics/Canvas;

    .line 129
    .line 130
    check-cast p1, Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p0, v4, La/twk;->c:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p0, Landroid/graphics/Rect;

    .line 138
    .line 139
    invoke-static {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->Y(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 140
    .line 141
    .line 142
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    add-int/2addr v0, p0

    .line 153
    iget-object p0, v4, La/twk;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    sub-int v5, v0, v5

    .line 162
    .line 163
    iget-object v4, v4, La/twk;->d:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Landroid/graphics/Rect;

    .line 166
    .line 167
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 168
    .line 169
    .line 170
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 171
    .line 172
    add-int/2addr v2, v6

    .line 173
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 174
    .line 175
    add-int/2addr v5, v6

    .line 176
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 177
    .line 178
    sub-int/2addr v1, v6

    .line 179
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 180
    .line 181
    sub-int/2addr v0, v4

    .line 182
    invoke-virtual {p0, v2, v5, v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    const/high16 v0, 0x437f0000    # 255.0f

    .line 190
    .line 191
    mul-float/2addr p1, v0

    .line 192
    float-to-int p1, p1

    .line 193
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_2
    check-cast v4, La/ao6;

    .line 203
    .line 204
    move-object v5, v3

    .line 205
    check-cast v5, La/bo6;

    .line 206
    .line 207
    move-object v1, p1

    .line 208
    check-cast v1, La/cp;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v0, La/yc6;

    .line 214
    .line 215
    iget v2, p0, La/xc6;->b:I

    .line 216
    .line 217
    iget v3, p0, La/xc6;->c:I

    .line 218
    .line 219
    invoke-direct/range {v0 .. v5}, La/yc6;-><init>(La/cp;IILa/ao6;La/bo6;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
