.class public final La/kq8;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public b:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 25
    const/4 v0, 0x3

    iput-byte v0, p0, La/kq8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 24
    iput-byte p2, p0, La/kq8;->a:B

    iput p1, p0, La/kq8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/kq8;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x7f070705

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, La/kq8;->b:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/kq8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 18
    .line 19
    iput v2, p1, Landroid/graphics/Rect;->right:I

    .line 20
    .line 21
    iget p0, p0, La/kq8;->b:I

    .line 22
    .line 23
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 24
    .line 25
    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget p4, p0, La/kq8;->b:I

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    if-ne p4, v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const p4, 0x7f070717

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    iput p4, p0, La/kq8;->b:I

    .line 52
    .line 53
    :cond_0
    iput p4, p1, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 56
    .line 57
    iput p4, p1, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->V(Landroid/view/View;)I

    .line 60
    .line 61
    .line 62
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    iget p0, p0, La/kq8;->b:I

    .line 66
    .line 67
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 68
    .line 69
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 70
    .line 71
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_2
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    instance-of v0, p4, La/cp;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    check-cast p4, La/cp;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object p4, v3

    .line 89
    :goto_0
    if-nez p4, :cond_2

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_2
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    instance-of v0, v0, La/zz3;

    .line 98
    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_3
    invoke-virtual {p4}, La/cp;->u()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    instance-of v0, v0, La/nsv;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget p0, p0, La/kq8;->b:I

    .line 112
    .line 113
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 114
    .line 115
    :cond_4
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    check-cast p1, La/cyv;

    .line 127
    .line 128
    iget-object p1, p1, La/zz3;->e:La/yz3;

    .line 129
    .line 130
    iget-object p1, p1, La/yz3;->f:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    add-int/lit8 p2, p0, -0x1

    .line 136
    .line 137
    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    instance-of p1, p1, La/nsv;

    .line 142
    .line 143
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    check-cast p2, La/cyv;

    .line 151
    .line 152
    iget-object p2, p2, La/zz3;->e:La/yz3;

    .line 153
    .line 154
    iget-object p2, p2, La/yz3;->f:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    add-int/2addr p0, v1

    .line 160
    invoke-static {p0, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    instance-of p2, p2, La/nsv;

    .line 165
    .line 166
    if-nez p2, :cond_6

    .line 167
    .line 168
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    if-eqz p2, :cond_5

    .line 173
    .line 174
    invoke-virtual {p2}, La/yge0;->d()I

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-ne p0, p2, :cond_5

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_5
    move p0, v2

    .line 182
    goto :goto_2

    .line 183
    :cond_6
    :goto_1
    move p0, v1

    .line 184
    :goto_2
    iget-object p2, p4, La/cp;->u:La/yfu0;

    .line 185
    .line 186
    invoke-interface {p2}, La/yfu0;->getRoot()Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    instance-of p3, p2, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 191
    .line 192
    if-eqz p3, :cond_7

    .line 193
    .line 194
    move-object v3, p2

    .line 195
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 196
    .line 197
    :cond_7
    if-nez v3, :cond_8

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_8
    if-eqz p1, :cond_9

    .line 201
    .line 202
    if-eqz p0, :cond_9

    .line 203
    .line 204
    invoke-virtual {v3, v1}, La/tw5;->setFirst(Z)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v1}, La/tw5;->setLast(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_9
    if-eqz p1, :cond_a

    .line 212
    .line 213
    invoke-virtual {v3, v1}, La/tw5;->setFirst(Z)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v2}, La/tw5;->setLast(Z)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_a
    if-eqz p0, :cond_b

    .line 221
    .line 222
    invoke-virtual {v3, v2}, La/tw5;->setFirst(Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v1}, La/tw5;->setLast(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_b
    invoke-virtual {v3, v2}, La/tw5;->setFirst(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v2}, La/tw5;->setLast(Z)V

    .line 233
    .line 234
    .line 235
    :goto_3
    return-void

    .line 236
    :pswitch_3
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    if-eqz p3, :cond_d

    .line 241
    .line 242
    invoke-virtual {p3}, La/yge0;->d()I

    .line 243
    .line 244
    .line 245
    move-result p3

    .line 246
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    sub-int/2addr p3, v1

    .line 251
    if-ne p2, p3, :cond_c

    .line 252
    .line 253
    iget p0, p0, La/kq8;->b:I

    .line 254
    .line 255
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_c
    iput v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 259
    .line 260
    :cond_d
    :goto_4
    return-void

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
