.class public final synthetic La/kjn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/widget/ImageView;Landroidx/recyclerview/widget/RecyclerView;La/zr50;La/ct5;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/kjn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kjn;->b:Ljava/lang/Object;

    iput-object p2, p0, La/kjn;->c:Ljava/lang/Object;

    iput-object p3, p0, La/kjn;->d:Ljava/lang/Object;

    iput-object p4, p0, La/kjn;->e:Ljava/lang/Object;

    iput-object p5, p0, La/kjn;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/kjn;->a:B

    iput-object p1, p0, La/kjn;->c:Ljava/lang/Object;

    iput-object p2, p0, La/kjn;->d:Ljava/lang/Object;

    iput-object p3, p0, La/kjn;->e:Ljava/lang/Object;

    iput-object p4, p0, La/kjn;->f:Ljava/lang/Object;

    iput-object p5, p0, La/kjn;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kjn;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/kjn;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/kjn;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/kjn;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/kjn;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, v0, La/kjn;->c:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v9, v0

    .line 20
    check-cast v9, Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    check-cast v6, La/lgn0;

    .line 23
    .line 24
    move-object v12, v5

    .line 25
    check-cast v12, Ljava/lang/String;

    .line 26
    .line 27
    check-cast v4, La/v1r;

    .line 28
    .line 29
    check-cast v3, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 30
    .line 31
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->N()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v7, v6, La/lgn0;->c:La/wdk0;

    .line 39
    .line 40
    new-instance v8, La/xdk0;

    .line 41
    .line 42
    sget-object v11, La/qek0;->a:La/qek0;

    .line 43
    .line 44
    new-instance v14, La/hdk0;

    .line 45
    .line 46
    iget-object v0, v6, La/lgn0;->d:La/ctf0;

    .line 47
    .line 48
    new-array v1, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 51
    .line 52
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const v2, 0x7f1309c6

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, La/o0k0;

    .line 64
    .line 65
    invoke-direct {v1, v6, v4, v3}, La/o0k0;-><init>(La/lgn0;La/v1r;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v14, v0, v1}, La/hdk0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    sget-object v15, La/jtv;->x:La/jtv;

    .line 72
    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    const/16 v17, 0x64

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    move-object v10, v8

    .line 79
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 80
    .line 81
    .line 82
    const/16 v14, 0x3fc

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v12, 0x0

    .line 87
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 88
    .line 89
    .line 90
    :goto_0
    return-void

    .line 91
    :pswitch_0
    check-cast v0, La/glo0;

    .line 92
    .line 93
    check-cast v6, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 94
    .line 95
    check-cast v5, La/iva;

    .line 96
    .line 97
    check-cast v4, La/pz40;

    .line 98
    .line 99
    check-cast v3, La/pz40;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v6}, La/glo0;->a(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 112
    .line 113
    if-eqz v0, :cond_1

    .line 114
    .line 115
    invoke-static {v0}, La/glo0;->a(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    iget-object v0, v5, La/iva;->d:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_2

    .line 125
    .line 126
    invoke-virtual {v6}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const/4 v1, 0x1

    .line 131
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_2

    .line 136
    .line 137
    move v2, v1

    .line 138
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_1
    check-cast v3, Landroid/view/View;

    .line 147
    .line 148
    move-object v7, v0

    .line 149
    check-cast v7, Landroid/widget/ImageView;

    .line 150
    .line 151
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 152
    .line 153
    check-cast v5, La/zr50;

    .line 154
    .line 155
    check-cast v4, La/ct5;

    .line 156
    .line 157
    invoke-virtual {v3}, Landroid/view/View;->getPaddingStart()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v3}, Landroid/view/View;->getPaddingEnd()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    add-int/2addr v1, v0

    .line 166
    int-to-float v0, v1

    .line 167
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 172
    .line 173
    int-to-float v1, v1

    .line 174
    const v2, 0x40251eb8    # 2.58f

    .line 175
    .line 176
    .line 177
    mul-float/2addr v1, v2

    .line 178
    add-float/2addr v1, v0

    .line 179
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    int-to-float v0, v0

    .line 184
    const v2, 0x3f6147ae    # 0.88f

    .line 185
    .line 186
    .line 187
    mul-float/2addr v0, v2

    .line 188
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    float-to-int v0, v0

    .line 197
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    iput-object v0, v5, La/zr50;->y:Ljava/lang/Object;

    .line 201
    .line 202
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 203
    .line 204
    iget-object v8, v4, La/ct5;->b:Ljava/lang/String;

    .line 205
    .line 206
    new-instance v0, La/j2x;

    .line 207
    .line 208
    const/16 v1, 0x10

    .line 209
    .line 210
    invoke-direct {v0, v1}, La/j2x;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    new-instance v12, La/rw40;

    .line 218
    .line 219
    const/16 v0, 0xd

    .line 220
    .line 221
    invoke-direct {v12, v5, v4, v0}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 222
    .line 223
    .line 224
    new-instance v13, La/b530;

    .line 225
    .line 226
    const/16 v0, 0x16

    .line 227
    .line 228
    invoke-direct {v13, v5, v0}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 229
    .line 230
    .line 231
    const/16 v14, 0x6c

    .line 232
    .line 233
    const v9, 0x7f080e2a

    .line 234
    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    invoke-static/range {v7 .. v14}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_2
    check-cast v0, La/tjn;

    .line 242
    .line 243
    move-object v1, v6

    .line 244
    check-cast v1, La/c9o0;

    .line 245
    .line 246
    move-object v2, v5

    .line 247
    check-cast v2, La/c9o0;

    .line 248
    .line 249
    check-cast v4, La/agd;

    .line 250
    .line 251
    check-cast v3, Landroid/view/View;

    .line 252
    .line 253
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object v5, v1, La/c9o0;->c:Lkotlin/jvm/functions/Function1;

    .line 261
    .line 262
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-interface {v5, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    check-cast v5, Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    iget-object v6, v2, La/c9o0;->c:Lkotlin/jvm/functions/Function1;

    .line 280
    .line 281
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    move-object/from16 v18, v4

    .line 299
    .line 300
    move-object v4, v3

    .line 301
    move-object/from16 v3, v18

    .line 302
    .line 303
    invoke-virtual/range {v0 .. v6}, La/tjn;->b(La/c9o0;La/c9o0;Landroid/view/Window;Landroid/view/View;ZZ)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
