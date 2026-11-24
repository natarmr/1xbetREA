.class public final synthetic La/zrw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bbl0;


# direct methods
.method public synthetic constructor <init>(La/bbl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zrw;->a:B

    iput-object p1, p0, La/zrw;->b:La/bbl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/zrw;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zrw;->b:La/bbl0;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    check-cast p1, La/cp;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/gkz;

    .line 15
    .line 16
    sget-object v2, La/prj0;->j:La/pn20;

    .line 17
    .line 18
    invoke-direct {v0, v2}, La/zz3;-><init>(La/dtb;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/ogj0;

    .line 22
    .line 23
    const/16 v3, 0xf

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/ogj0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v3, La/thj0;

    .line 29
    .line 30
    const/16 v4, 0x9

    .line 31
    .line 32
    invoke-direct {v3, v4}, La/thj0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/gsh0;

    .line 36
    .line 37
    const/16 v5, 0x1c

    .line 38
    .line 39
    invoke-direct {v4, v1, v5}, La/gsh0;-><init>(IB)V

    .line 40
    .line 41
    .line 42
    sget-object v5, La/wjj0;->e:La/wjj0;

    .line 43
    .line 44
    new-instance v6, La/gbn;

    .line 45
    .line 46
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, La/zz3;->d:La/dp;

    .line 50
    .line 51
    invoke-virtual {v2, v6}, La/dp;->b(La/gbn;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p1, La/cp;->u:La/yfu0;

    .line 55
    .line 56
    check-cast v2, La/wsx;

    .line 57
    .line 58
    iget-object v3, v2, La/wsx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p1, La/cp;->w:Landroid/content/Context;

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const v4, 0x7f07072d

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iget-object v4, v2, La/wsx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    new-instance v5, La/qmk0;

    .line 79
    .line 80
    invoke-direct {v5, v3}, La/qmk0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, v2, La/wsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 87
    .line 88
    sget-object v3, La/ymx;->d:La/ymx;

    .line 89
    .line 90
    new-instance v4, La/asw;

    .line 91
    .line 92
    invoke-direct {v4, p0, p1, v1}, La/asw;-><init>(La/bbl0;La/cp;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v3, v4}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 96
    .line 97
    .line 98
    new-instance p0, La/if6;

    .line 99
    .line 100
    invoke-direct {p0, v0, p1, v0, p1}, La/if6;-><init>(La/gkz;La/cp;La/gkz;La/cp;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 104
    .line 105
    .line 106
    new-instance p0, La/bb;

    .line 107
    .line 108
    const/16 v0, 0x11

    .line 109
    .line 110
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v0, La/gkz;

    .line 123
    .line 124
    sget-object v2, La/xrw;->g:La/ek5;

    .line 125
    .line 126
    invoke-direct {v0, v2}, La/zz3;-><init>(La/dtb;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, La/x2w;

    .line 130
    .line 131
    const/16 v3, 0x19

    .line 132
    .line 133
    invoke-direct {v2, v3}, La/x2w;-><init>(B)V

    .line 134
    .line 135
    .line 136
    new-instance v3, La/h7w;

    .line 137
    .line 138
    const/16 v4, 0xb

    .line 139
    .line 140
    invoke-direct {v3, v4}, La/h7w;-><init>(B)V

    .line 141
    .line 142
    .line 143
    new-instance v4, La/pkv;

    .line 144
    .line 145
    const/16 v5, 0x12

    .line 146
    .line 147
    invoke-direct {v4, v1, v5}, La/pkv;-><init>(IB)V

    .line 148
    .line 149
    .line 150
    sget-object v1, La/btv;->n:La/btv;

    .line 151
    .line 152
    new-instance v5, La/gbn;

    .line 153
    .line 154
    invoke-direct {v5, v2, v4, v3, v1}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 158
    .line 159
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, p1, La/cp;->u:La/yfu0;

    .line 163
    .line 164
    check-cast v1, La/rsx;

    .line 165
    .line 166
    iget-object v2, v1, La/rsx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 167
    .line 168
    new-instance v3, La/qmk0;

    .line 169
    .line 170
    iget-object v4, p1, La/cp;->w:Landroid/content/Context;

    .line 171
    .line 172
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const v6, 0x7f070705

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    const/4 v11, 0x0

    .line 200
    const/16 v12, 0x1ca

    .line 201
    .line 202
    move v4, v5

    .line 203
    const/4 v5, 0x0

    .line 204
    move v6, v7

    .line 205
    const/4 v7, 0x0

    .line 206
    const/4 v9, 0x1

    .line 207
    const/4 v10, 0x0

    .line 208
    invoke-direct/range {v3 .. v12}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 212
    .line 213
    .line 214
    iget-object v2, v1, La/rsx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 215
    .line 216
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 217
    .line 218
    .line 219
    iget-object v1, v1, La/rsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 220
    .line 221
    sget-object v2, La/ymx;->d:La/ymx;

    .line 222
    .line 223
    new-instance v3, La/asw;

    .line 224
    .line 225
    const/4 v4, 0x0

    .line 226
    invoke-direct {v3, p0, p1, v4}, La/asw;-><init>(La/bbl0;La/cp;B)V

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v2, v3}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 230
    .line 231
    .line 232
    new-instance p0, La/xg;

    .line 233
    .line 234
    const/4 v1, 0x7

    .line 235
    invoke-direct {p0, p1, v0, p1, v1}, La/xg;-><init>(La/cp;Ljava/lang/Object;La/cp;B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 239
    .line 240
    .line 241
    new-instance p0, La/bb;

    .line 242
    .line 243
    const/16 v0, 0x8

    .line 244
    .line 245
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 249
    .line 250
    .line 251
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
