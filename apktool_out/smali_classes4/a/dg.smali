.class public final synthetic La/dg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/rmb0;Lkotlin/jvm/functions/Function0;La/wmb0;Ljava/lang/String;La/k6z;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/dg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dg;->c:Ljava/lang/Object;

    iput-object p2, p0, La/dg;->f:Ljava/lang/Object;

    iput-object p3, p0, La/dg;->d:Ljava/lang/Object;

    iput-object p4, p0, La/dg;->b:Ljava/lang/Object;

    iput-object p5, p0, La/dg;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/w940;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;La/k9h0;)V
    .locals 1

    .line 1
    const/16 v0, 0x16

    iput-byte v0, p0, La/dg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dg;->d:Ljava/lang/Object;

    iput-object p2, p0, La/dg;->e:Ljava/lang/Object;

    iput-object p3, p0, La/dg;->b:Ljava/lang/Object;

    iput-object p4, p0, La/dg;->c:Ljava/lang/Object;

    iput-object p5, p0, La/dg;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/dg;->a:B

    iput-object p1, p0, La/dg;->b:Ljava/lang/Object;

    iput-object p2, p0, La/dg;->c:Ljava/lang/Object;

    iput-object p3, p0, La/dg;->d:Ljava/lang/Object;

    iput-object p4, p0, La/dg;->e:Ljava/lang/Object;

    iput-object p5, p0, La/dg;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dg;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/cp;

    .line 6
    .line 7
    iget-object v2, v0, La/dg;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, v0, La/dg;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/gkz;

    .line 14
    .line 15
    iget-object v4, v0, La/dg;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/List;

    .line 18
    .line 19
    iget-object v0, v0, La/dg;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/bbl0;

    .line 22
    .line 23
    move-object/from16 v5, p1

    .line 24
    .line 25
    check-cast v5, Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v5, v1, La/cp;->u:La/yfu0;

    .line 31
    .line 32
    check-cast v5, La/xsx;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, La/qwl0;

    .line 43
    .line 44
    iget-object v7, v7, La/qwl0;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    iget-object v8, v5, La/xsx;->b:Landroid/widget/ImageView;

    .line 51
    .line 52
    iget-object v5, v5, La/xsx;->l:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    check-cast v9, La/qwl0;

    .line 59
    .line 60
    iget-object v9, v9, La/qwl0;->a:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    const/4 v11, 0x0

    .line 67
    if-nez v9, :cond_0

    .line 68
    .line 69
    move v9, v11

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/16 v9, 0x8

    .line 72
    .line 73
    :goto_0
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move v8, v11

    .line 81
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_5

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    add-int/lit8 v12, v8, 0x1

    .line 92
    .line 93
    if-ltz v8, :cond_4

    .line 94
    .line 95
    move-object v13, v9

    .line 96
    check-cast v13, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 97
    .line 98
    if-ge v8, v7, :cond_1

    .line 99
    .line 100
    invoke-virtual {v13, v11}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 104
    .line 105
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    check-cast v9, La/qwl0;

    .line 110
    .line 111
    iget-object v9, v9, La/qwl0;->a:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    move-object v14, v9

    .line 118
    check-cast v14, Ljava/lang/String;

    .line 119
    .line 120
    new-instance v9, La/g18;

    .line 121
    .line 122
    const/16 v15, 0x12

    .line 123
    .line 124
    invoke-direct {v9, v13, v4, v8, v15}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 125
    .line 126
    .line 127
    new-instance v15, La/z08;

    .line 128
    .line 129
    const/16 v10, 0x14

    .line 130
    .line 131
    invoke-direct {v15, v4, v8, v10}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 132
    .line 133
    .line 134
    const/16 v20, 0x7e

    .line 135
    .line 136
    move-object/from16 v19, v15

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    move-object/from16 v18, v9

    .line 144
    .line 145
    invoke-static/range {v13 .. v20}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 146
    .line 147
    .line 148
    new-instance v9, La/g18;

    .line 149
    .line 150
    const/16 v10, 0x13

    .line 151
    .line 152
    invoke-direct {v9, v0, v8, v1, v10}, La/g18;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {v13, v9}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_1
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const/4 v9, 0x4

    .line 163
    if-eqz v8, :cond_2

    .line 164
    .line 165
    move v10, v9

    .line 166
    goto :goto_2

    .line 167
    :cond_2
    move v10, v11

    .line 168
    :goto_2
    invoke-virtual {v13, v10}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    check-cast v10, Landroid/view/View;

    .line 179
    .line 180
    if-eqz v8, :cond_3

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_3
    move v9, v11

    .line 184
    :goto_3
    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    :goto_4
    move v8, v12

    .line 188
    goto :goto_1

    .line 189
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 190
    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    throw v0

    .line 194
    :cond_5
    if-le v7, v6, :cond_6

    .line 195
    .line 196
    sub-int/2addr v7, v6

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v2, "+"

    .line 200
    .line 201
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v11}, Landroid/view/View;->setVisibility(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_6
    const/16 v0, 0x8

    .line 219
    .line 220
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    :goto_5
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/qwl0;

    .line 228
    .line 229
    iget-object v0, v0, La/qwl0;->b:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {v3, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 232
    .line 233
    .line 234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/dg;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/yx5;

    .line 4
    .line 5
    iget-object v1, p0, La/dg;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 8
    .line 9
    iget-object v2, p0, La/dg;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/ujd;

    .line 12
    .line 13
    iget-object v3, p0, La/dg;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, La/dcv0;

    .line 16
    .line 17
    iget-object p0, p0, La/dg;->f:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v6, p0

    .line 20
    check-cast v6, La/i3t0;

    .line 21
    .line 22
    check-cast p1, La/lwk;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v4, La/ndn0;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/16 v11, 0x1a

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    const-class v7, La/k3t0;

    .line 34
    .line 35
    const-string v8, "onAction"

    .line 36
    .line 37
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 38
    .line 39
    invoke-direct/range {v4 .. v11}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 40
    .line 41
    .line 42
    iget-object p0, v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 43
    .line 44
    iget p1, v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a(I)La/ms2;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v5, La/yao0;

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-direct {v5, v4, v6}, La/yao0;-><init>(La/ndn0;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0, v1, v5}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a(I)La/ms2;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p1, La/yao0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {p1, v4, v1}, La/yao0;-><init>(La/ndn0;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v0, p0, p1}, La/dcv0;->b(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, La/u43;

    .line 73
    .line 74
    const/16 p1, 0x9

    .line 75
    .line 76
    invoke-direct {p0, v2, v0, v3, p1}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dg;->a:B

    .line 4
    .line 5
    const/16 v9, 0x16

    .line 6
    .line 7
    const/4 v11, 0x5

    .line 8
    const/4 v12, 0x4

    .line 9
    const/16 v13, 0x13

    .line 10
    .line 11
    const/4 v14, 0x3

    .line 12
    const/16 v15, 0x8

    .line 13
    .line 14
    const/16 v16, 0x20

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const-wide v17, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x1

    .line 24
    iget-object v3, v0, La/dg;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v4, v0, La/dg;->f:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v10, v0, La/dg;->e:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v5, v0, La/dg;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v6, v0, La/dg;->c:Ljava/lang/Object;

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    check-cast v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 38
    .line 39
    move-object v13, v6

    .line 40
    check-cast v13, La/ctf0;

    .line 41
    .line 42
    move-object v14, v5

    .line 43
    check-cast v14, La/g2v;

    .line 44
    .line 45
    move-object v15, v10

    .line 46
    check-cast v15, La/y78;

    .line 47
    .line 48
    check-cast v4, La/wiu;

    .line 49
    .line 50
    move-object/from16 v12, p1

    .line 51
    .line 52
    check-cast v12, La/mbp0;

    .line 53
    .line 54
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v0, v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 58
    .line 59
    const-wide/16 v2, 0x2e

    .line 60
    .line 61
    cmp-long v2, v0, v2

    .line 62
    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    new-instance v11, La/bsf;

    .line 66
    .line 67
    invoke-virtual {v4}, La/wiu;->a()Ljava/util/Locale;

    .line 68
    .line 69
    .line 70
    move-result-object v16

    .line 71
    const/16 v17, 0x0

    .line 72
    .line 73
    invoke-direct/range {v11 .. v17}, La/bsf;-><init>(La/mbp0;La/ctf0;La/g2v;La/y78;Ljava/util/Locale;B)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-wide/16 v2, 0x1

    .line 78
    .line 79
    cmp-long v2, v0, v2

    .line 80
    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    new-instance v11, La/z19;

    .line 84
    .line 85
    invoke-virtual {v4}, La/wiu;->a()Ljava/util/Locale;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    invoke-direct/range {v11 .. v16}, La/z19;-><init>(La/mbp0;La/ctf0;La/g2v;La/y78;Ljava/util/Locale;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-wide/16 v2, 0x2

    .line 94
    .line 95
    cmp-long v2, v0, v2

    .line 96
    .line 97
    if-nez v2, :cond_2

    .line 98
    .line 99
    new-instance v11, La/bsf;

    .line 100
    .line 101
    invoke-virtual {v4}, La/wiu;->a()Ljava/util/Locale;

    .line 102
    .line 103
    .line 104
    move-result-object v16

    .line 105
    const/16 v17, 0x1

    .line 106
    .line 107
    invoke-direct/range {v11 .. v17}, La/bsf;-><init>(La/mbp0;La/ctf0;La/g2v;La/y78;Ljava/util/Locale;B)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const-wide/16 v2, 0xf

    .line 112
    .line 113
    cmp-long v2, v0, v2

    .line 114
    .line 115
    if-nez v2, :cond_3

    .line 116
    .line 117
    new-instance v11, La/bsf;

    .line 118
    .line 119
    invoke-virtual {v4}, La/wiu;->a()Ljava/util/Locale;

    .line 120
    .line 121
    .line 122
    move-result-object v16

    .line 123
    const/16 v17, 0x2

    .line 124
    .line 125
    invoke-direct/range {v11 .. v17}, La/bsf;-><init>(La/mbp0;La/ctf0;La/g2v;La/y78;Ljava/util/Locale;B)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    const-wide/16 v2, 0x1b

    .line 130
    .line 131
    cmp-long v0, v0, v2

    .line 132
    .line 133
    if-nez v0, :cond_4

    .line 134
    .line 135
    new-instance v11, La/bsf;

    .line 136
    .line 137
    invoke-virtual {v4}, La/wiu;->a()Ljava/util/Locale;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    const/16 v17, 0x3

    .line 142
    .line 143
    invoke-direct/range {v11 .. v17}, La/bsf;-><init>(La/mbp0;La/ctf0;La/g2v;La/y78;Ljava/util/Locale;B)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    new-instance v11, La/zun;

    .line 148
    .line 149
    invoke-direct {v11, v14}, La/zun;-><init>(La/g2v;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    return-object v11

    .line 153
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/dg;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/dg;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_2
    check-cast v3, La/qsm;

    .line 164
    .line 165
    move-object/from16 v18, v6

    .line 166
    .line 167
    check-cast v18, La/xdr;

    .line 168
    .line 169
    move-object/from16 v19, v5

    .line 170
    .line 171
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    move-object/from16 v20, v10

    .line 174
    .line 175
    check-cast v20, La/ngk0;

    .line 176
    .line 177
    move-object/from16 v21, v4

    .line 178
    .line 179
    check-cast v21, La/pz40;

    .line 180
    .line 181
    move-object/from16 v0, p1

    .line 182
    .line 183
    check-cast v0, La/hcz;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v1, v3, La/qsm;->c:La/a4x;

    .line 189
    .line 190
    new-instance v2, La/jak0;

    .line 191
    .line 192
    invoke-direct {v2, v9}, La/jak0;-><init>(B)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    new-instance v4, La/o3l0;

    .line 200
    .line 201
    invoke-direct {v4, v2, v1, v11}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 202
    .line 203
    .line 204
    new-instance v2, La/y9k0;

    .line 205
    .line 206
    invoke-direct {v2, v1, v15}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 207
    .line 208
    .line 209
    new-instance v16, La/vll;

    .line 210
    .line 211
    const/16 v22, 0x3

    .line 212
    .line 213
    move-object/from16 v17, v1

    .line 214
    .line 215
    invoke-direct/range {v16 .. v22}, La/vll;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    move-object/from16 v1, v16

    .line 219
    .line 220
    new-instance v5, La/ugd;

    .line 221
    .line 222
    const v6, 0x799532c4

    .line 223
    .line 224
    .line 225
    invoke-direct {v5, v6, v8, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v3, v4, v2, v5}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_3
    check-cast v3, La/frc0;

    .line 235
    .line 236
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 239
    .line 240
    check-cast v10, La/nuc0;

    .line 241
    .line 242
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 243
    .line 244
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, La/hcz;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v1, La/rqc0;

    .line 252
    .line 253
    invoke-direct {v1, v3, v2}, La/rqc0;-><init>(Ljava/lang/Object;B)V

    .line 254
    .line 255
    .line 256
    new-instance v9, La/ugd;

    .line 257
    .line 258
    const v11, -0xf62b56

    .line 259
    .line 260
    .line 261
    invoke-direct {v9, v11, v8, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v7, v7, v9, v14}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 265
    .line 266
    .line 267
    new-instance v1, La/sqc0;

    .line 268
    .line 269
    invoke-direct {v1, v3, v6, v5, v2}, La/sqc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 270
    .line 271
    .line 272
    new-instance v2, La/ugd;

    .line 273
    .line 274
    const v3, -0x7b5ea9ed

    .line 275
    .line 276
    .line 277
    invoke-direct {v2, v3, v8, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v7, v7, v2, v14}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 281
    .line 282
    .line 283
    new-instance v1, La/in80;

    .line 284
    .line 285
    invoke-direct {v1, v10, v4, v15}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 286
    .line 287
    .line 288
    new-instance v2, La/ugd;

    .line 289
    .line 290
    const v3, -0x1769518e

    .line 291
    .line 292
    .line 293
    invoke-direct {v2, v3, v8, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v7, v7, v2, v14}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_4
    check-cast v3, La/clz;

    .line 303
    .line 304
    move-object v15, v6

    .line 305
    check-cast v15, La/nac0;

    .line 306
    .line 307
    move-object/from16 v16, v5

    .line 308
    .line 309
    check-cast v16, La/cqq;

    .line 310
    .line 311
    move-object/from16 v17, v10

    .line 312
    .line 313
    check-cast v17, La/pkk0;

    .line 314
    .line 315
    move-object/from16 v18, v4

    .line 316
    .line 317
    check-cast v18, La/pz40;

    .line 318
    .line 319
    move-object/from16 v0, p1

    .line 320
    .line 321
    check-cast v0, La/lwk;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    new-instance v14, La/co;

    .line 327
    .line 328
    const/16 v19, 0x1

    .line 329
    .line 330
    invoke-direct/range {v14 .. v19}, La/co;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0, v14}, La/glz;->a(La/blz;)V

    .line 338
    .line 339
    .line 340
    new-instance v0, La/pr0;

    .line 341
    .line 342
    invoke-direct {v0, v3, v14, v13}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 343
    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_5
    check-cast v3, La/iu40;

    .line 347
    .line 348
    check-cast v6, La/mie0;

    .line 349
    .line 350
    check-cast v5, La/jie0;

    .line 351
    .line 352
    check-cast v10, La/sch0;

    .line 353
    .line 354
    check-cast v4, La/hie0;

    .line 355
    .line 356
    move-object/from16 v0, p1

    .line 357
    .line 358
    check-cast v0, Ljava/lang/Float;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    iget-object v1, v3, La/iu40;->g:La/q99;

    .line 365
    .line 366
    invoke-static {v1}, La/iu40;->g(La/q99;)La/eu40;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    if-eqz v1, :cond_5

    .line 371
    .line 372
    iget-object v3, v3, La/d660;->e:La/zri;

    .line 373
    .line 374
    iget-wide v11, v1, La/eu40;->b:J

    .line 375
    .line 376
    iget-wide v13, v1, La/eu40;->a:J

    .line 377
    .line 378
    iget-object v7, v3, La/zri;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v7, La/i6u0;

    .line 381
    .line 382
    move/from16 v24, v8

    .line 383
    .line 384
    shr-long v8, v13, v16

    .line 385
    .line 386
    long-to-int v8, v8

    .line 387
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    invoke-virtual {v7, v8, v11, v12}, La/i6u0;->a(FJ)V

    .line 392
    .line 393
    .line 394
    iget-object v3, v3, La/zri;->c:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v3, La/i6u0;

    .line 397
    .line 398
    and-long v7, v13, v17

    .line 399
    .line 400
    long-to-int v7, v7

    .line 401
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    invoke-virtual {v3, v7, v11, v12}, La/i6u0;->a(FJ)V

    .line 406
    .line 407
    .line 408
    iget-object v3, v6, La/mie0;->a:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v3, La/eu40;

    .line 411
    .line 412
    invoke-virtual {v3, v1}, La/eu40;->a(La/eu40;)La/eu40;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    iput-object v3, v6, La/mie0;->a:Ljava/lang/Object;

    .line 417
    .line 418
    iget-wide v6, v3, La/eu40;->a:J

    .line 419
    .line 420
    invoke-virtual {v10, v6, v7}, La/sch0;->f(J)J

    .line 421
    .line 422
    .line 423
    move-result-wide v6

    .line 424
    invoke-virtual {v10, v6, v7}, La/sch0;->j(J)F

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    iput v3, v5, La/jie0;->a:F

    .line 429
    .line 430
    sub-float/2addr v3, v0

    .line 431
    invoke-static {v3}, La/k7x;->Q(F)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    xor-int/lit8 v0, v0, 0x1

    .line 436
    .line 437
    iput-boolean v0, v4, La/hie0;->a:Z

    .line 438
    .line 439
    goto :goto_1

    .line 440
    :cond_5
    move/from16 v24, v8

    .line 441
    .line 442
    :goto_1
    if-eqz v1, :cond_6

    .line 443
    .line 444
    move/from16 v2, v24

    .line 445
    .line 446
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    return-object v0

    .line 451
    :pswitch_6
    check-cast v5, La/w940;

    .line 452
    .line 453
    move-object v12, v10

    .line 454
    check-cast v12, Landroid/content/Intent;

    .line 455
    .line 456
    move-object v13, v3

    .line 457
    check-cast v13, Ljava/lang/String;

    .line 458
    .line 459
    move-object v14, v6

    .line 460
    check-cast v14, Ljava/lang/String;

    .line 461
    .line 462
    check-cast v4, La/k9h0;

    .line 463
    .line 464
    move-object/from16 v16, p1

    .line 465
    .line 466
    check-cast v16, Landroid/graphics/Bitmap;

    .line 467
    .line 468
    iget-object v0, v5, La/w940;->g:La/h760;

    .line 469
    .line 470
    invoke-interface {v0}, La/h760;->a()La/t760;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    invoke-static {v4}, La/xvw;->I(La/k9h0;)I

    .line 475
    .line 476
    .line 477
    move-result v15

    .line 478
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v18

    .line 482
    const/16 v20, 0x0

    .line 483
    .line 484
    const/16 v21, 0x3a0

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/16 v19, 0x0

    .line 489
    .line 490
    invoke-static/range {v11 .. v21}, La/t760;->a(La/t760;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/util/List;I)V

    .line 491
    .line 492
    .line 493
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object v0

    .line 496
    :pswitch_7
    move/from16 v24, v8

    .line 497
    .line 498
    check-cast v3, La/r0x;

    .line 499
    .line 500
    check-cast v6, La/o0x;

    .line 501
    .line 502
    check-cast v5, La/o0x;

    .line 503
    .line 504
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 505
    .line 506
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 507
    .line 508
    move-object/from16 v0, p1

    .line 509
    .line 510
    check-cast v0, Landroid/content/Context;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3, v6}, La/r0x;->a(La/o0x;)V

    .line 516
    .line 517
    .line 518
    iget-object v0, v3, La/r0x;->a:Landroid/widget/ImageView;

    .line 519
    .line 520
    invoke-interface {v6}, La/o0x;->c()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    if-eqz v1, :cond_7

    .line 525
    .line 526
    if-eqz v5, :cond_8

    .line 527
    .line 528
    :cond_7
    move v15, v2

    .line 529
    :cond_8
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 530
    .line 531
    .line 532
    invoke-static {v6}, La/s0x;->X(La/o0x;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-static {v2}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    new-instance v6, La/k1x;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-direct {v6, v8}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 551
    .line 552
    .line 553
    iput-object v1, v6, La/k1x;->c:Ljava/lang/Object;

    .line 554
    .line 555
    invoke-static {v6, v0}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 556
    .line 557
    .line 558
    sget-object v1, La/vi9;->c:La/vi9;

    .line 559
    .line 560
    iput-object v1, v6, La/k1x;->n:La/vi9;

    .line 561
    .line 562
    iput-object v1, v6, La/k1x;->m:La/vi9;

    .line 563
    .line 564
    iput-object v1, v6, La/k1x;->o:La/vi9;

    .line 565
    .line 566
    if-eqz v5, :cond_9

    .line 567
    .line 568
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-static {v5, v1}, La/s0x;->Y(La/o0x;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    goto :goto_2

    .line 580
    :cond_9
    move-object v1, v7

    .line 581
    :goto_2
    invoke-static {v6, v1}, La/t1x;->g(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 582
    .line 583
    .line 584
    if-eqz v5, :cond_a

    .line 585
    .line 586
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-static {v5, v0}, La/s0x;->Y(La/o0x;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    :cond_a
    invoke-static {v6, v7}, La/t1x;->d(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 598
    .line 599
    .line 600
    new-instance v0, La/ywu;

    .line 601
    .line 602
    invoke-direct {v0, v10, v3, v4, v12}, La/ywu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 603
    .line 604
    .line 605
    iput-object v0, v6, La/k1x;->e:La/n1x;

    .line 606
    .line 607
    move/from16 v0, v24

    .line 608
    .line 609
    invoke-static {v6, v0}, La/t1x;->b(La/k1x;Z)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v6}, La/k1x;->a()La/o1x;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v2, v0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    return-object v0

    .line 621
    :pswitch_8
    check-cast v3, La/w6k;

    .line 622
    .line 623
    check-cast v6, La/zls;

    .line 624
    .line 625
    check-cast v5, La/pz40;

    .line 626
    .line 627
    check-cast v10, La/pz40;

    .line 628
    .line 629
    check-cast v4, La/pz40;

    .line 630
    .line 631
    move-object/from16 v0, p1

    .line 632
    .line 633
    check-cast v0, La/a9q0;

    .line 634
    .line 635
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    iget-wide v7, v0, La/a9q0;->c:J

    .line 639
    .line 640
    and-long v7, v7, v17

    .line 641
    .line 642
    long-to-int v1, v7

    .line 643
    invoke-interface {v3, v1}, La/w6k;->r0(I)F

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    check-cast v3, La/ycl;

    .line 652
    .line 653
    iget v3, v3, La/ycl;->a:F

    .line 654
    .line 655
    const/high16 v7, 0x7fc00000    # Float.NaN

    .line 656
    .line 657
    invoke-static {v3, v7}, La/ycl;->b(FF)Z

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    if-eqz v3, :cond_b

    .line 662
    .line 663
    iget-boolean v3, v6, La/zls;->b:Z

    .line 664
    .line 665
    if-nez v3, :cond_b

    .line 666
    .line 667
    invoke-virtual {v0}, La/a9q0;->f()Z

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    if-eqz v0, :cond_d

    .line 672
    .line 673
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 674
    .line 675
    invoke-interface {v10, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    new-instance v0, La/ycl;

    .line 679
    .line 680
    invoke-direct {v0, v1}, La/ycl;-><init>(F)V

    .line 681
    .line 682
    .line 683
    invoke-interface {v5, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    goto :goto_3

    .line 687
    :cond_b
    new-instance v3, La/ycl;

    .line 688
    .line 689
    invoke-direct {v3, v1}, La/ycl;-><init>(F)V

    .line 690
    .line 691
    .line 692
    invoke-interface {v4, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    iget-object v0, v0, La/a9q0;->b:La/bw40;

    .line 696
    .line 697
    iget v0, v0, La/bw40;->f:I

    .line 698
    .line 699
    if-le v0, v11, :cond_c

    .line 700
    .line 701
    const/4 v2, 0x1

    .line 702
    :cond_c
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-interface {v10, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    :cond_d
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    return-object v0

    .line 712
    :pswitch_9
    check-cast v3, La/o0x;

    .line 713
    .line 714
    check-cast v6, La/o0x;

    .line 715
    .line 716
    check-cast v5, La/s4s;

    .line 717
    .line 718
    check-cast v10, La/ljc0;

    .line 719
    .line 720
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 721
    .line 722
    move-object/from16 v0, p1

    .line 723
    .line 724
    check-cast v0, Ljava/lang/Throwable;

    .line 725
    .line 726
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    if-nez v0, :cond_e

    .line 731
    .line 732
    invoke-virtual {v5}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v1, v5, La/s4s;->b:La/o0x;

    .line 737
    .line 738
    new-instance v3, La/p4s;

    .line 739
    .line 740
    const/4 v7, 0x1

    .line 741
    invoke-direct {v3, v5, v6, v4, v7}, La/p4s;-><init>(La/s4s;La/o0x;Lkotlin/jvm/functions/Function2;B)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0, v6, v1, v3, v10}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->h(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 745
    .line 746
    .line 747
    goto :goto_4

    .line 748
    :cond_e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 749
    .line 750
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    return-object v0

    .line 759
    :pswitch_a
    check-cast v3, Landroid/content/Context;

    .line 760
    .line 761
    check-cast v6, La/p8o0;

    .line 762
    .line 763
    check-cast v5, Ljava/util/List;

    .line 764
    .line 765
    check-cast v10, Ljava/util/List;

    .line 766
    .line 767
    check-cast v4, Landroid/view/animation/Animation;

    .line 768
    .line 769
    move-object/from16 v0, p1

    .line 770
    .line 771
    check-cast v0, La/n8o0;

    .line 772
    .line 773
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    iget-object v1, v0, La/n8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 777
    .line 778
    iget-object v8, v0, La/n8o0;->c:Landroid/widget/ImageView;

    .line 779
    .line 780
    iget v9, v6, La/p8o0;->d:I

    .line 781
    .line 782
    invoke-static {v9, v3}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 787
    .line 788
    .line 789
    iget-object v1, v0, La/n8o0;->d:Landroid/widget/FrameLayout;

    .line 790
    .line 791
    iget-object v3, v6, La/p8o0;->c:Ljava/util/ArrayList;

    .line 792
    .line 793
    new-instance v9, La/ihu0;

    .line 794
    .line 795
    invoke-direct {v9, v1}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v9}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 799
    .line 800
    .line 801
    move-result-object v9

    .line 802
    move v11, v2

    .line 803
    :goto_5
    move-object v12, v9

    .line 804
    check-cast v12, La/jhu0;

    .line 805
    .line 806
    invoke-virtual {v12}, La/jhu0;->hasNext()Z

    .line 807
    .line 808
    .line 809
    move-result v13

    .line 810
    if-eqz v13, :cond_11

    .line 811
    .line 812
    invoke-virtual {v12}, La/jhu0;->next()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v12

    .line 816
    add-int/lit8 v13, v11, 0x1

    .line 817
    .line 818
    if-ltz v11, :cond_10

    .line 819
    .line 820
    check-cast v12, Landroid/view/View;

    .line 821
    .line 822
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 823
    .line 824
    .line 825
    move-result v14

    .line 826
    if-ge v11, v14, :cond_f

    .line 827
    .line 828
    move v11, v2

    .line 829
    goto :goto_6

    .line 830
    :cond_f
    move v11, v15

    .line 831
    :goto_6
    invoke-virtual {v12, v11}, Landroid/view/View;->setVisibility(I)V

    .line 832
    .line 833
    .line 834
    move v11, v13

    .line 835
    goto :goto_5

    .line 836
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 837
    .line 838
    .line 839
    throw v7

    .line 840
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    move v9, v2

    .line 845
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 846
    .line 847
    .line 848
    move-result v11

    .line 849
    if-eqz v11, :cond_16

    .line 850
    .line 851
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    add-int/lit8 v12, v9, 0x1

    .line 856
    .line 857
    if-ltz v9, :cond_15

    .line 858
    .line 859
    check-cast v11, Ljava/lang/String;

    .line 860
    .line 861
    invoke-static {v9, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v13

    .line 865
    check-cast v13, La/o8o0;

    .line 866
    .line 867
    if-nez v13, :cond_13

    .line 868
    .line 869
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 870
    .line 871
    .line 872
    move-result-object v13

    .line 873
    invoke-static {v13}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 874
    .line 875
    .line 876
    move-result-object v13

    .line 877
    const v14, 0x7f0d05ef

    .line 878
    .line 879
    .line 880
    invoke-virtual {v13, v14, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 881
    .line 882
    .line 883
    move-result-object v13

    .line 884
    const v14, 0x7f0a088a

    .line 885
    .line 886
    .line 887
    invoke-static {v13, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 888
    .line 889
    .line 890
    move-result-object v16

    .line 891
    move-object/from16 v25, v7

    .line 892
    .line 893
    move-object/from16 v7, v16

    .line 894
    .line 895
    check-cast v7, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 896
    .line 897
    if-eqz v7, :cond_12

    .line 898
    .line 899
    new-instance v14, La/o8o0;

    .line 900
    .line 901
    check-cast v13, Landroid/widget/FrameLayout;

    .line 902
    .line 903
    invoke-direct {v14, v13, v7}, La/o8o0;-><init>(Landroid/widget/FrameLayout;Lcom/google/android/material/imageview/ShapeableImageView;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    check-cast v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 914
    .line 915
    const/16 v16, 0x10

    .line 916
    .line 917
    invoke-static/range {v16 .. v16}, La/sj3;->X(I)I

    .line 918
    .line 919
    .line 920
    move-result v16

    .line 921
    mul-int v9, v9, v16

    .line 922
    .line 923
    invoke-virtual {v7, v9, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v13, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 930
    .line 931
    .line 932
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    move-object v13, v14

    .line 936
    goto :goto_8

    .line 937
    :cond_12
    invoke-virtual {v13}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v0, v14}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    const-string v1, "Missing required view with ID: "

    .line 946
    .line 947
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    move-object/from16 v7, v25

    .line 955
    .line 956
    goto/16 :goto_e

    .line 957
    .line 958
    :cond_13
    move-object/from16 v25, v7

    .line 959
    .line 960
    :goto_8
    iget-object v7, v13, La/o8o0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 961
    .line 962
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 963
    .line 964
    .line 965
    move-result v9

    .line 966
    if-lez v9, :cond_14

    .line 967
    .line 968
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 969
    .line 970
    sget-object v9, La/qzw;->a:La/qzw;

    .line 971
    .line 972
    const/16 v9, 0xa

    .line 973
    .line 974
    invoke-static {v7, v11, v2, v9}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    .line 978
    .line 979
    .line 980
    goto :goto_9

    .line 981
    :cond_14
    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    .line 982
    .line 983
    .line 984
    :goto_9
    move v9, v12

    .line 985
    move-object/from16 v7, v25

    .line 986
    .line 987
    goto/16 :goto_7

    .line 988
    .line 989
    :cond_15
    move-object/from16 v25, v7

    .line 990
    .line 991
    invoke-static {}, La/q3d;->p()V

    .line 992
    .line 993
    .line 994
    throw v25

    .line 995
    :cond_16
    move-object/from16 v25, v7

    .line 996
    .line 997
    iget-object v1, v0, La/n8o0;->e:Landroid/widget/TextView;

    .line 998
    .line 999
    iget-object v3, v6, La/p8o0;->b:Ljava/lang/String;

    .line 1000
    .line 1001
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1002
    .line 1003
    .line 1004
    iget-object v0, v0, La/n8o0;->b:Landroid/widget/LinearLayout;

    .line 1005
    .line 1006
    iget-object v1, v6, La/p8o0;->e:Ljava/util/ArrayList;

    .line 1007
    .line 1008
    new-instance v3, La/ihu0;

    .line 1009
    .line 1010
    invoke-direct {v3, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v3}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    move v5, v2

    .line 1018
    :goto_a
    move-object v7, v3

    .line 1019
    check-cast v7, La/jhu0;

    .line 1020
    .line 1021
    invoke-virtual {v7}, La/jhu0;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v9

    .line 1025
    if-eqz v9, :cond_19

    .line 1026
    .line 1027
    invoke-virtual {v7}, La/jhu0;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v7

    .line 1031
    add-int/lit8 v9, v5, 0x1

    .line 1032
    .line 1033
    if-ltz v5, :cond_18

    .line 1034
    .line 1035
    check-cast v7, Landroid/view/View;

    .line 1036
    .line 1037
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1038
    .line 1039
    .line 1040
    move-result v11

    .line 1041
    if-ge v5, v11, :cond_17

    .line 1042
    .line 1043
    move v5, v2

    .line 1044
    goto :goto_b

    .line 1045
    :cond_17
    move v5, v15

    .line 1046
    :goto_b
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1047
    .line 1048
    .line 1049
    move v5, v9

    .line 1050
    goto :goto_a

    .line 1051
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 1052
    .line 1053
    .line 1054
    throw v25

    .line 1055
    :cond_19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    move v3, v2

    .line 1060
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v5

    .line 1064
    if-eqz v5, :cond_1c

    .line 1065
    .line 1066
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    add-int/lit8 v7, v3, 0x1

    .line 1071
    .line 1072
    if-ltz v3, :cond_1b

    .line 1073
    .line 1074
    check-cast v5, Ljava/lang/String;

    .line 1075
    .line 1076
    invoke-static {v3, v10}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    check-cast v3, La/sth;

    .line 1081
    .line 1082
    if-nez v3, :cond_1a

    .line 1083
    .line 1084
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    invoke-static {v3, v0}, La/sth;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/sth;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    iget-object v9, v3, La/sth;->a:Landroid/widget/TextView;

    .line 1097
    .line 1098
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    :cond_1a
    iget-object v3, v3, La/sth;->b:Landroid/widget/TextView;

    .line 1105
    .line 1106
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1107
    .line 1108
    .line 1109
    move v3, v7

    .line 1110
    goto :goto_c

    .line 1111
    :cond_1b
    invoke-static {}, La/q3d;->p()V

    .line 1112
    .line 1113
    .line 1114
    throw v25

    .line 1115
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    iget-boolean v0, v6, La/p8o0;->f:Z

    .line 1119
    .line 1120
    if-eqz v0, :cond_1d

    .line 1121
    .line 1122
    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v8, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_d

    .line 1129
    :cond_1d
    invoke-virtual {v8, v15}, Landroid/view/View;->setVisibility(I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v8}, Landroid/view/View;->clearAnimation()V

    .line 1133
    .line 1134
    .line 1135
    :goto_d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1136
    .line 1137
    :goto_e
    return-object v7

    .line 1138
    :pswitch_b
    check-cast v3, Landroid/content/Context;

    .line 1139
    .line 1140
    check-cast v6, La/cjj0;

    .line 1141
    .line 1142
    check-cast v5, Ljava/util/List;

    .line 1143
    .line 1144
    check-cast v10, Ljava/util/List;

    .line 1145
    .line 1146
    check-cast v4, La/clz;

    .line 1147
    .line 1148
    move-object/from16 v0, p1

    .line 1149
    .line 1150
    check-cast v0, La/e8o0;

    .line 1151
    .line 1152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    iget-object v1, v0, La/e8o0;->g:Landroid/widget/TextView;

    .line 1156
    .line 1157
    iget-object v2, v6, La/cjj0;->a:La/zij0;

    .line 1158
    .line 1159
    iget-object v7, v2, La/zij0;->a:La/ank0;

    .line 1160
    .line 1161
    invoke-virtual {v7, v3}, La/ank0;->c(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v7

    .line 1165
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1166
    .line 1167
    .line 1168
    iget v2, v2, La/zij0;->b:I

    .line 1169
    .line 1170
    invoke-virtual {v3, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v2

    .line 1174
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v1, v0, La/e8o0;->f:Landroid/widget/TextView;

    .line 1178
    .line 1179
    iget-object v2, v6, La/cjj0;->b:La/wij0;

    .line 1180
    .line 1181
    iget-object v7, v2, La/wij0;->a:La/ank0;

    .line 1182
    .line 1183
    invoke-virtual {v7, v3}, La/ank0;->c(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v7

    .line 1187
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1188
    .line 1189
    .line 1190
    iget v2, v2, La/wij0;->b:I

    .line 1191
    .line 1192
    invoke-virtual {v3, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v0, v6}, La/acb;->I(La/e8o0;La/cjj0;)V

    .line 1200
    .line 1201
    .line 1202
    iget-object v1, v0, La/e8o0;->d:Landroid/widget/FrameLayout;

    .line 1203
    .line 1204
    iget-object v2, v6, La/cjj0;->c:Ljava/util/ArrayList;

    .line 1205
    .line 1206
    invoke-static {v1, v2, v5}, La/acb;->H(Landroid/widget/FrameLayout;Ljava/util/List;Ljava/util/List;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v1, v0, La/e8o0;->b:Landroid/widget/FrameLayout;

    .line 1210
    .line 1211
    iget-object v2, v6, La/cjj0;->d:Ljava/util/List;

    .line 1212
    .line 1213
    invoke-static {v1, v2, v10}, La/acb;->H(Landroid/widget/FrameLayout;Ljava/util/List;Ljava/util/List;)V

    .line 1214
    .line 1215
    .line 1216
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1217
    .line 1218
    iget-object v7, v0, La/e8o0;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1219
    .line 1220
    iget-object v8, v6, La/cjj0;->f:Ljava/lang/String;

    .line 1221
    .line 1222
    const/4 v13, 0x0

    .line 1223
    const/16 v14, 0x1fe

    .line 1224
    .line 1225
    const/4 v9, 0x0

    .line 1226
    const/4 v10, 0x0

    .line 1227
    const/4 v11, 0x0

    .line 1228
    const/4 v12, 0x0

    .line 1229
    invoke-static/range {v7 .. v14}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1230
    .line 1231
    .line 1232
    invoke-static {v4}, La/g1x;->u(La/clz;)La/tkz;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    invoke-static {v0, v1, v6}, La/acb;->J(La/e8o0;La/tkz;La/cjj0;)V

    .line 1237
    .line 1238
    .line 1239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1240
    .line 1241
    return-object v0

    .line 1242
    :pswitch_c
    move-object/from16 v25, v7

    .line 1243
    .line 1244
    check-cast v3, La/ejm;

    .line 1245
    .line 1246
    check-cast v6, La/ezj;

    .line 1247
    .line 1248
    check-cast v5, La/gy40;

    .line 1249
    .line 1250
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 1251
    .line 1252
    move-object v7, v4

    .line 1253
    check-cast v7, La/ngk0;

    .line 1254
    .line 1255
    move-object/from16 v11, p1

    .line 1256
    .line 1257
    check-cast v11, La/hcz;

    .line 1258
    .line 1259
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1260
    .line 1261
    .line 1262
    instance-of v0, v3, La/djm;

    .line 1263
    .line 1264
    if-eqz v0, :cond_1f

    .line 1265
    .line 1266
    move-object v0, v3

    .line 1267
    check-cast v0, La/djm;

    .line 1268
    .line 1269
    iget-object v0, v0, La/djm;->a:La/xim;

    .line 1270
    .line 1271
    sget-object v1, La/xim;->a:La/xim;

    .line 1272
    .line 1273
    if-ne v0, v1, :cond_1e

    .line 1274
    .line 1275
    const/16 v0, 0xc

    .line 1276
    .line 1277
    :goto_f
    move v12, v0

    .line 1278
    goto :goto_10

    .line 1279
    :cond_1e
    const/4 v0, 0x6

    .line 1280
    goto :goto_f

    .line 1281
    :goto_10
    new-instance v0, La/awh;

    .line 1282
    .line 1283
    const/16 v1, 0x1c

    .line 1284
    .line 1285
    invoke-direct {v0, v3, v1}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 1286
    .line 1287
    .line 1288
    new-instance v15, La/ugd;

    .line 1289
    .line 1290
    const v1, -0x332e354c    # -1.0999133E8f

    .line 1291
    .line 1292
    .line 1293
    const/4 v7, 0x1

    .line 1294
    invoke-direct {v15, v1, v7, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    const/16 v16, 0x6

    .line 1298
    .line 1299
    const/4 v13, 0x0

    .line 1300
    const/4 v14, 0x0

    .line 1301
    invoke-static/range {v11 .. v16}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_11

    .line 1305
    :cond_1f
    instance-of v0, v3, La/cjm;

    .line 1306
    .line 1307
    if-eqz v0, :cond_20

    .line 1308
    .line 1309
    move-object v0, v3

    .line 1310
    check-cast v0, La/cjm;

    .line 1311
    .line 1312
    iget-object v2, v0, La/cjm;->a:La/i4;

    .line 1313
    .line 1314
    new-instance v0, La/aim;

    .line 1315
    .line 1316
    const/16 v1, 0x18

    .line 1317
    .line 1318
    invoke-direct {v0, v1}, La/aim;-><init>(B)V

    .line 1319
    .line 1320
    .line 1321
    invoke-static {v2, v0}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1326
    .line 1327
    .line 1328
    move-result v9

    .line 1329
    new-instance v12, La/v2m;

    .line 1330
    .line 1331
    const/16 v1, 0x11

    .line 1332
    .line 1333
    invoke-direct {v12, v0, v1}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 1334
    .line 1335
    .line 1336
    new-instance v0, La/pn7;

    .line 1337
    .line 1338
    const/4 v13, 0x1

    .line 1339
    invoke-direct {v0, v2, v13}, La/pn7;-><init>(La/i4;B)V

    .line 1340
    .line 1341
    .line 1342
    new-instance v1, La/w2m;

    .line 1343
    .line 1344
    const/4 v8, 0x1

    .line 1345
    move-object v4, v6

    .line 1346
    move-object v6, v10

    .line 1347
    invoke-direct/range {v1 .. v8}, La/w2m;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/wdr;Ljava/lang/Object;B)V

    .line 1348
    .line 1349
    .line 1350
    new-instance v2, La/ugd;

    .line 1351
    .line 1352
    const v3, -0x4e295cff

    .line 1353
    .line 1354
    .line 1355
    invoke-direct {v2, v3, v13, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v11, v9, v12, v0, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1359
    .line 1360
    .line 1361
    :goto_11
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1362
    .line 1363
    goto :goto_12

    .line 1364
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 1365
    .line 1366
    .line 1367
    move-object/from16 v7, v25

    .line 1368
    .line 1369
    :goto_12
    return-object v7

    .line 1370
    :pswitch_d
    move-object/from16 v25, v7

    .line 1371
    .line 1372
    move-object v1, v3

    .line 1373
    check-cast v1, La/cp;

    .line 1374
    .line 1375
    move-object v2, v6

    .line 1376
    check-cast v2, La/x6f;

    .line 1377
    .line 1378
    move-object v3, v5

    .line 1379
    check-cast v3, La/oye;

    .line 1380
    .line 1381
    check-cast v10, La/mhc;

    .line 1382
    .line 1383
    move-object v5, v4

    .line 1384
    check-cast v5, La/x6f;

    .line 1385
    .line 1386
    move-object/from16 v0, p1

    .line 1387
    .line 1388
    check-cast v0, Ljava/util/List;

    .line 1389
    .line 1390
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 1394
    .line 1395
    check-cast v0, La/vjd;

    .line 1396
    .line 1397
    iget-object v7, v0, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 1398
    .line 1399
    sget-object v8, La/pek0;->g:La/pek0;

    .line 1400
    .line 1401
    new-instance v0, La/cqk;

    .line 1402
    .line 1403
    const/16 v6, 0xa

    .line 1404
    .line 1405
    move-object v4, v10

    .line 1406
    invoke-direct/range {v0 .. v6}, La/cqk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1407
    .line 1408
    .line 1409
    new-instance v1, La/ugd;

    .line 1410
    .line 1411
    const v2, -0x63a3d1f7

    .line 1412
    .line 1413
    .line 1414
    const/4 v13, 0x1

    .line 1415
    invoke-direct {v1, v2, v13, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1416
    .line 1417
    .line 1418
    move-object/from16 v0, v25

    .line 1419
    .line 1420
    invoke-static {v7, v8, v0, v1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1421
    .line 1422
    .line 1423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1424
    .line 1425
    return-object v0

    .line 1426
    :pswitch_e
    move-object v2, v3

    .line 1427
    check-cast v2, Ljava/util/List;

    .line 1428
    .line 1429
    move-object v3, v6

    .line 1430
    check-cast v3, La/pt0;

    .line 1431
    .line 1432
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1433
    .line 1434
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1435
    .line 1436
    move-object v6, v4

    .line 1437
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1438
    .line 1439
    move-object/from16 v16, p1

    .line 1440
    .line 1441
    check-cast v16, La/i8z;

    .line 1442
    .line 1443
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1444
    .line 1445
    .line 1446
    new-instance v0, La/j2l;

    .line 1447
    .line 1448
    const/16 v1, 0xe

    .line 1449
    .line 1450
    invoke-direct {v0, v1}, La/j2l;-><init>(B)V

    .line 1451
    .line 1452
    .line 1453
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1454
    .line 1455
    .line 1456
    move-result v17

    .line 1457
    new-instance v8, La/vtf;

    .line 1458
    .line 1459
    const/16 v1, 0x19

    .line 1460
    .line 1461
    invoke-direct {v8, v0, v2, v1}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1462
    .line 1463
    .line 1464
    new-instance v0, La/bzh;

    .line 1465
    .line 1466
    invoke-direct {v0, v2, v15}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 1467
    .line 1468
    .line 1469
    new-instance v1, La/vll;

    .line 1470
    .line 1471
    const/4 v7, 0x0

    .line 1472
    move-object v4, v5

    .line 1473
    move-object v5, v10

    .line 1474
    invoke-direct/range {v1 .. v7}, La/vll;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1475
    .line 1476
    .line 1477
    new-instance v2, La/ugd;

    .line 1478
    .line 1479
    const v3, -0x73c450aa

    .line 1480
    .line 1481
    .line 1482
    const/4 v7, 0x1

    .line 1483
    invoke-direct {v2, v3, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    const/16 v19, 0x0

    .line 1487
    .line 1488
    move-object/from16 v20, v0

    .line 1489
    .line 1490
    move-object/from16 v21, v2

    .line 1491
    .line 1492
    move-object/from16 v18, v8

    .line 1493
    .line 1494
    invoke-virtual/range {v16 .. v21}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 1495
    .line 1496
    .line 1497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1498
    .line 1499
    return-object v0

    .line 1500
    :pswitch_f
    move-object v3, v6

    .line 1501
    check-cast v3, Ljava/util/Set;

    .line 1502
    .line 1503
    check-cast v5, Ljava/util/Set;

    .line 1504
    .line 1505
    check-cast v10, La/pz40;

    .line 1506
    .line 1507
    move-object v6, v4

    .line 1508
    check-cast v6, La/pz40;

    .line 1509
    .line 1510
    move-object/from16 v1, p1

    .line 1511
    .line 1512
    check-cast v1, La/lwk;

    .line 1513
    .line 1514
    new-instance v1, La/elj;

    .line 1515
    .line 1516
    iget-object v2, v0, La/dg;->b:Ljava/lang/Object;

    .line 1517
    .line 1518
    move-object v4, v5

    .line 1519
    move-object v5, v10

    .line 1520
    invoke-direct/range {v1 .. v6}, La/elj;-><init>(Ljava/lang/Object;Ljava/util/Set;Ljava/util/Set;La/pz40;La/pz40;)V

    .line 1521
    .line 1522
    .line 1523
    return-object v1

    .line 1524
    :pswitch_10
    check-cast v3, La/pz40;

    .line 1525
    .line 1526
    check-cast v6, Ljava/util/Calendar;

    .line 1527
    .line 1528
    check-cast v5, La/pz40;

    .line 1529
    .line 1530
    check-cast v10, La/pz40;

    .line 1531
    .line 1532
    check-cast v4, La/pz40;

    .line 1533
    .line 1534
    move-object/from16 v0, p1

    .line 1535
    .line 1536
    check-cast v0, Ljava/lang/Long;

    .line 1537
    .line 1538
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1539
    .line 1540
    .line 1541
    move-result-wide v0

    .line 1542
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v2

    .line 1546
    check-cast v2, Ljava/lang/Boolean;

    .line 1547
    .line 1548
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1549
    .line 1550
    .line 1551
    move-result v2

    .line 1552
    if-nez v2, :cond_21

    .line 1553
    .line 1554
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1555
    .line 1556
    goto :goto_14

    .line 1557
    :cond_21
    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1558
    .line 1559
    .line 1560
    new-instance v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 1561
    .line 1562
    const/4 v7, 0x1

    .line 1563
    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    .line 1564
    .line 1565
    .line 1566
    move-result v1

    .line 1567
    const/4 v2, 0x2

    .line 1568
    invoke-virtual {v6, v2}, Ljava/util/Calendar;->get(I)I

    .line 1569
    .line 1570
    .line 1571
    move-result v2

    .line 1572
    add-int/2addr v2, v7

    .line 1573
    invoke-virtual {v6, v11}, Ljava/util/Calendar;->get(I)I

    .line 1574
    .line 1575
    .line 1576
    move-result v3

    .line 1577
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 1578
    .line 1579
    .line 1580
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v1

    .line 1584
    check-cast v1, La/am;

    .line 1585
    .line 1586
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1587
    .line 1588
    .line 1589
    move-result v1

    .line 1590
    if-eqz v1, :cond_23

    .line 1591
    .line 1592
    if-ne v1, v7, :cond_22

    .line 1593
    .line 1594
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v1

    .line 1598
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1599
    .line 1600
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1601
    .line 1602
    .line 1603
    goto :goto_13

    .line 1604
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1605
    .line 1606
    .line 1607
    const/4 v7, 0x0

    .line 1608
    goto :goto_14

    .line 1609
    :cond_23
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v1

    .line 1613
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1614
    .line 1615
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    :goto_13
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1619
    .line 1620
    :goto_14
    return-object v7

    .line 1621
    :pswitch_11
    check-cast v3, La/ujd;

    .line 1622
    .line 1623
    check-cast v6, La/ooq0;

    .line 1624
    .line 1625
    move-object v11, v5

    .line 1626
    check-cast v11, La/wdk0;

    .line 1627
    .line 1628
    move-object v13, v10

    .line 1629
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 1630
    .line 1631
    check-cast v4, La/k3t0;

    .line 1632
    .line 1633
    move-object/from16 v0, p1

    .line 1634
    .line 1635
    check-cast v0, La/ujw;

    .line 1636
    .line 1637
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1638
    .line 1639
    .line 1640
    instance-of v1, v0, La/qjw;

    .line 1641
    .line 1642
    if-eqz v1, :cond_24

    .line 1643
    .line 1644
    check-cast v0, La/qjw;

    .line 1645
    .line 1646
    iget-object v0, v0, La/qjw;->a:La/sjd;

    .line 1647
    .line 1648
    invoke-virtual {v3, v13, v0}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1649
    .line 1650
    .line 1651
    goto :goto_15

    .line 1652
    :cond_24
    instance-of v1, v0, La/tjw;

    .line 1653
    .line 1654
    if-eqz v1, :cond_25

    .line 1655
    .line 1656
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1661
    .line 1662
    .line 1663
    invoke-static {v0}, La/tdc;->T(Landroidx/fragment/app/e;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v0

    .line 1667
    if-nez v0, :cond_26

    .line 1668
    .line 1669
    invoke-interface {v6}, La/ooq0;->a()La/roq0;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    sget-object v2, La/fk60;->b:La/uuz;

    .line 1681
    .line 1682
    const/4 v2, 0x7

    .line 1683
    const-string v3, ""

    .line 1684
    .line 1685
    invoke-virtual {v0, v1, v2, v3}, La/roq0;->d(Landroidx/fragment/app/e;ILjava/lang/String;)V

    .line 1686
    .line 1687
    .line 1688
    goto :goto_15

    .line 1689
    :cond_25
    instance-of v1, v0, La/sjw;

    .line 1690
    .line 1691
    if-eqz v1, :cond_27

    .line 1692
    .line 1693
    check-cast v0, La/sjw;

    .line 1694
    .line 1695
    iget-object v12, v0, La/sjw;->a:La/xdk0;

    .line 1696
    .line 1697
    const/16 v17, 0x0

    .line 1698
    .line 1699
    const/16 v18, 0x3fc

    .line 1700
    .line 1701
    const/4 v14, 0x0

    .line 1702
    const/4 v15, 0x0

    .line 1703
    const/16 v16, 0x0

    .line 1704
    .line 1705
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1706
    .line 1707
    .line 1708
    :cond_26
    :goto_15
    sget-object v0, La/bgw;->a:La/bgw;

    .line 1709
    .line 1710
    invoke-virtual {v4, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1711
    .line 1712
    .line 1713
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1714
    .line 1715
    goto :goto_16

    .line 1716
    :cond_27
    invoke-static {}, La/t9f;->b()V

    .line 1717
    .line 1718
    .line 1719
    const/4 v7, 0x0

    .line 1720
    :goto_16
    return-object v7

    .line 1721
    :pswitch_12
    check-cast v3, La/a4x;

    .line 1722
    .line 1723
    check-cast v6, La/xcz;

    .line 1724
    .line 1725
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 1726
    .line 1727
    check-cast v10, Ljava/util/Map;

    .line 1728
    .line 1729
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 1730
    .line 1731
    move-object/from16 v0, p1

    .line 1732
    .line 1733
    check-cast v0, La/hcz;

    .line 1734
    .line 1735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1736
    .line 1737
    .line 1738
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v1

    .line 1742
    if-eqz v1, :cond_28

    .line 1743
    .line 1744
    invoke-virtual {v1}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v7

    .line 1748
    goto :goto_17

    .line 1749
    :cond_28
    const/4 v7, 0x0

    .line 1750
    :goto_17
    invoke-static {v1}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v8

    .line 1754
    :try_start_0
    invoke-virtual {v6}, La/xcz;->h()I

    .line 1755
    .line 1756
    .line 1757
    move-result v9

    .line 1758
    invoke-virtual {v6}, La/xcz;->i()I

    .line 1759
    .line 1760
    .line 1761
    move-result v11

    .line 1762
    invoke-virtual {v6, v9, v11}, La/xcz;->k(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1763
    .line 1764
    .line 1765
    invoke-static {v1, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 1766
    .line 1767
    .line 1768
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v1

    .line 1772
    move v3, v2

    .line 1773
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1774
    .line 1775
    .line 1776
    move-result v6

    .line 1777
    if-eqz v6, :cond_2e

    .line 1778
    .line 1779
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v6

    .line 1783
    add-int/lit8 v7, v3, 0x1

    .line 1784
    .line 1785
    if-ltz v3, :cond_2d

    .line 1786
    .line 1787
    move-object v15, v6

    .line 1788
    check-cast v15, La/wbg;

    .line 1789
    .line 1790
    iget-object v13, v15, La/wbg;->a:La/h7h;

    .line 1791
    .line 1792
    iget-wide v8, v13, La/h7h;->a:J

    .line 1793
    .line 1794
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v6

    .line 1798
    invoke-static {v5, v6}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v6

    .line 1802
    move-object v14, v6

    .line 1803
    check-cast v14, La/l7m0;

    .line 1804
    .line 1805
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v6

    .line 1809
    invoke-interface {v10, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v11

    .line 1813
    if-nez v11, :cond_29

    .line 1814
    .line 1815
    new-instance v11, La/ngk0;

    .line 1816
    .line 1817
    invoke-direct {v11}, La/ngk0;-><init>()V

    .line 1818
    .line 1819
    .line 1820
    invoke-interface {v10, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    :cond_29
    move-object/from16 v16, v11

    .line 1824
    .line 1825
    check-cast v16, La/ngk0;

    .line 1826
    .line 1827
    if-lez v3, :cond_2a

    .line 1828
    .line 1829
    const-string v3, "_gap"

    .line 1830
    .line 1831
    invoke-static {v8, v9, v3}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v3

    .line 1835
    sget-object v6, La/fre0;->a:La/ugd;

    .line 1836
    .line 1837
    const-string v11, "sub_game_gap"

    .line 1838
    .line 1839
    invoke-virtual {v0, v3, v11, v6}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 1840
    .line 1841
    .line 1842
    :cond_2a
    const-string v3, "_header"

    .line 1843
    .line 1844
    invoke-static {v8, v9, v3}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v3

    .line 1848
    new-instance v6, La/ab4;

    .line 1849
    .line 1850
    const/16 v11, 0x1c

    .line 1851
    .line 1852
    invoke-direct {v6, v15, v4, v11}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1853
    .line 1854
    .line 1855
    new-instance v11, La/ugd;

    .line 1856
    .line 1857
    const v12, 0x2268a451

    .line 1858
    .line 1859
    .line 1860
    const/4 v2, 0x1

    .line 1861
    invoke-direct {v11, v12, v2, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1862
    .line 1863
    .line 1864
    const-string v2, "sub_game_header"

    .line 1865
    .line 1866
    invoke-virtual {v0, v3, v2, v11}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 1867
    .line 1868
    .line 1869
    iget-object v2, v13, La/h7h;->g:La/a4x;

    .line 1870
    .line 1871
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v2

    .line 1875
    const/4 v12, 0x0

    .line 1876
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1877
    .line 1878
    .line 1879
    move-result v3

    .line 1880
    if-eqz v3, :cond_2c

    .line 1881
    .line 1882
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v3

    .line 1886
    add-int/lit8 v6, v12, 0x1

    .line 1887
    .line 1888
    if-ltz v12, :cond_2b

    .line 1889
    .line 1890
    check-cast v3, La/b7h;

    .line 1891
    .line 1892
    move-object/from16 p0, v1

    .line 1893
    .line 1894
    move-object/from16 p1, v2

    .line 1895
    .line 1896
    iget-wide v1, v3, La/b7h;->a:J

    .line 1897
    .line 1898
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1899
    .line 1900
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1904
    .line 1905
    .line 1906
    move-object/from16 v17, v3

    .line 1907
    .line 1908
    const-string v3, "_"

    .line 1909
    .line 1910
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1914
    .line 1915
    .line 1916
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {v11, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v1

    .line 1926
    new-instance v11, La/rbg;

    .line 1927
    .line 1928
    move-object/from16 v18, v4

    .line 1929
    .line 1930
    invoke-direct/range {v11 .. v18}, La/rbg;-><init>(ILa/h7h;La/l7m0;La/wbg;La/ngk0;La/b7h;Lkotlin/jvm/functions/Function1;)V

    .line 1931
    .line 1932
    .line 1933
    new-instance v2, La/ugd;

    .line 1934
    .line 1935
    const v3, 0xa1bb48e

    .line 1936
    .line 1937
    .line 1938
    const/4 v4, 0x1

    .line 1939
    invoke-direct {v2, v3, v4, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1940
    .line 1941
    .line 1942
    const-string v3, "market_group"

    .line 1943
    .line 1944
    invoke-virtual {v0, v1, v3, v2}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 1945
    .line 1946
    .line 1947
    move-object/from16 v1, p0

    .line 1948
    .line 1949
    move-object/from16 v2, p1

    .line 1950
    .line 1951
    move v12, v6

    .line 1952
    move-object/from16 v4, v18

    .line 1953
    .line 1954
    goto :goto_19

    .line 1955
    :cond_2b
    invoke-static {}, La/q3d;->p()V

    .line 1956
    .line 1957
    .line 1958
    const/16 v25, 0x0

    .line 1959
    .line 1960
    throw v25

    .line 1961
    :cond_2c
    move-object/from16 p0, v1

    .line 1962
    .line 1963
    move-object/from16 v18, v4

    .line 1964
    .line 1965
    const-string v1, "_footer"

    .line 1966
    .line 1967
    invoke-static {v8, v9, v1}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v1

    .line 1971
    new-instance v2, La/v7i0;

    .line 1972
    .line 1973
    const/16 v3, 0x15

    .line 1974
    .line 1975
    invoke-direct {v2, v14, v3}, La/v7i0;-><init>(La/l7m0;B)V

    .line 1976
    .line 1977
    .line 1978
    new-instance v3, La/ugd;

    .line 1979
    .line 1980
    const v4, 0x23695e3a

    .line 1981
    .line 1982
    .line 1983
    const/4 v13, 0x1

    .line 1984
    invoke-direct {v3, v4, v13, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1985
    .line 1986
    .line 1987
    const-string v2, "sub_game_footer"

    .line 1988
    .line 1989
    invoke-virtual {v0, v1, v2, v3}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 1990
    .line 1991
    .line 1992
    move-object/from16 v1, p0

    .line 1993
    .line 1994
    move v3, v7

    .line 1995
    move-object/from16 v4, v18

    .line 1996
    .line 1997
    const/4 v2, 0x0

    .line 1998
    goto/16 :goto_18

    .line 1999
    .line 2000
    :cond_2d
    invoke-static {}, La/q3d;->p()V

    .line 2001
    .line 2002
    .line 2003
    const/16 v25, 0x0

    .line 2004
    .line 2005
    throw v25

    .line 2006
    :cond_2e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2007
    .line 2008
    return-object v0

    .line 2009
    :catchall_0
    move-exception v0

    .line 2010
    invoke-static {v1, v8, v7}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 2011
    .line 2012
    .line 2013
    throw v0

    .line 2014
    :pswitch_13
    check-cast v3, La/vne;

    .line 2015
    .line 2016
    check-cast v6, La/pz40;

    .line 2017
    .line 2018
    check-cast v5, La/pz40;

    .line 2019
    .line 2020
    check-cast v10, La/d9d0;

    .line 2021
    .line 2022
    check-cast v4, La/pz40;

    .line 2023
    .line 2024
    move-object/from16 v0, p1

    .line 2025
    .line 2026
    check-cast v0, Ljava/lang/Boolean;

    .line 2027
    .line 2028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2029
    .line 2030
    .line 2031
    new-instance v1, La/obd;

    .line 2032
    .line 2033
    const/4 v2, 0x0

    .line 2034
    const/4 v7, 0x0

    .line 2035
    invoke-direct {v1, v10, v4, v7, v2}, La/obd;-><init>(La/d9d0;La/pz40;La/yje;B)V

    .line 2036
    .line 2037
    .line 2038
    invoke-static {v3, v7, v7, v1, v14}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2039
    .line 2040
    .line 2041
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2042
    .line 2043
    invoke-interface {v6, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2044
    .line 2045
    .line 2046
    invoke-interface {v5, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2047
    .line 2048
    .line 2049
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2050
    .line 2051
    return-object v0

    .line 2052
    :pswitch_14
    check-cast v3, La/l7m0;

    .line 2053
    .line 2054
    check-cast v6, La/w03;

    .line 2055
    .line 2056
    check-cast v5, La/jge0;

    .line 2057
    .line 2058
    check-cast v10, La/ucs0;

    .line 2059
    .line 2060
    check-cast v4, Ljava/util/List;

    .line 2061
    .line 2062
    move-object/from16 v0, p1

    .line 2063
    .line 2064
    check-cast v0, La/g7z;

    .line 2065
    .line 2066
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2067
    .line 2068
    .line 2069
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v1

    .line 2073
    check-cast v1, La/nn8;

    .line 2074
    .line 2075
    invoke-virtual {v6}, La/w03;->i()V

    .line 2076
    .line 2077
    .line 2078
    iget-object v2, v0, La/g7z;->a:La/a6a;

    .line 2079
    .line 2080
    invoke-interface {v2}, La/fhl;->d()J

    .line 2081
    .line 2082
    .line 2083
    move-result-wide v7

    .line 2084
    const-wide/16 v11, 0x0

    .line 2085
    .line 2086
    invoke-static {v11, v12, v7, v8}, La/k9x;->r(JJ)La/jge0;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v19

    .line 2090
    iget v3, v1, La/nn8;->d:F

    .line 2091
    .line 2092
    iget v7, v1, La/nn8;->b:F

    .line 2093
    .line 2094
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2095
    .line 2096
    .line 2097
    move-result v8

    .line 2098
    int-to-long v8, v8

    .line 2099
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2100
    .line 2101
    .line 2102
    move-result v3

    .line 2103
    int-to-long v11, v3

    .line 2104
    shl-long v8, v8, v16

    .line 2105
    .line 2106
    and-long v11, v11, v17

    .line 2107
    .line 2108
    or-long v20, v8, v11

    .line 2109
    .line 2110
    iget v3, v1, La/nn8;->d:F

    .line 2111
    .line 2112
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2113
    .line 2114
    .line 2115
    move-result v8

    .line 2116
    int-to-long v8, v8

    .line 2117
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2118
    .line 2119
    .line 2120
    move-result v3

    .line 2121
    int-to-long v11, v3

    .line 2122
    shl-long v8, v8, v16

    .line 2123
    .line 2124
    and-long v11, v11, v17

    .line 2125
    .line 2126
    or-long v22, v8, v11

    .line 2127
    .line 2128
    const-wide/16 v26, 0x0

    .line 2129
    .line 2130
    const-wide/16 v24, 0x0

    .line 2131
    .line 2132
    invoke-static/range {v19 .. v27}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v3

    .line 2136
    invoke-static {v6, v3}, La/w03;->b(La/w03;La/wfg0;)V

    .line 2137
    .line 2138
    .line 2139
    iget-object v3, v2, La/a6a;->b:La/nr;

    .line 2140
    .line 2141
    invoke-virtual {v3}, La/nr;->p()J

    .line 2142
    .line 2143
    .line 2144
    move-result-wide v8

    .line 2145
    invoke-virtual {v3}, La/nr;->i()La/x5a;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v11

    .line 2149
    invoke-interface {v11}, La/x5a;->l()V

    .line 2150
    .line 2151
    .line 2152
    :try_start_1
    iget-object v11, v3, La/nr;->b:Ljava/lang/Object;

    .line 2153
    .line 2154
    check-cast v11, La/fvt0;

    .line 2155
    .line 2156
    invoke-virtual {v11, v6}, La/fvt0;->i(La/w03;)V

    .line 2157
    .line 2158
    .line 2159
    const/4 v6, 0x0

    .line 2160
    cmpl-float v11, v7, v6

    .line 2161
    .line 2162
    if-lez v11, :cond_2f

    .line 2163
    .line 2164
    sget-object v12, La/s6t0;->a:La/pz40;

    .line 2165
    .line 2166
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v12

    .line 2170
    iget-object v12, v12, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2171
    .line 2172
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 2173
    .line 2174
    .line 2175
    move-result-wide v20

    .line 2176
    const/16 v29, 0x0

    .line 2177
    .line 2178
    const/16 v30, 0x7e

    .line 2179
    .line 2180
    const-wide/16 v22, 0x0

    .line 2181
    .line 2182
    const-wide/16 v24, 0x0

    .line 2183
    .line 2184
    const/16 v26, 0x0

    .line 2185
    .line 2186
    const/16 v27, 0x0

    .line 2187
    .line 2188
    const/16 v28, 0x0

    .line 2189
    .line 2190
    move-object/from16 v19, v0

    .line 2191
    .line 2192
    invoke-static/range {v19 .. v30}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 2193
    .line 2194
    .line 2195
    goto :goto_1a

    .line 2196
    :catchall_1
    move-exception v0

    .line 2197
    goto :goto_1d

    .line 2198
    :cond_2f
    move-object/from16 v19, v0

    .line 2199
    .line 2200
    :goto_1a
    invoke-interface {v2}, La/fhl;->d()J

    .line 2201
    .line 2202
    .line 2203
    move-result-wide v12

    .line 2204
    and-long v12, v12, v17

    .line 2205
    .line 2206
    long-to-int v0, v12

    .line 2207
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2208
    .line 2209
    .line 2210
    move-result v0

    .line 2211
    if-lez v11, :cond_30

    .line 2212
    .line 2213
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2214
    .line 2215
    sub-float/2addr v1, v7

    .line 2216
    goto :goto_1b

    .line 2217
    :cond_30
    iget v1, v1, La/nn8;->a:F

    .line 2218
    .line 2219
    :goto_1b
    mul-float/2addr v0, v1

    .line 2220
    cmpl-float v1, v0, v6

    .line 2221
    .line 2222
    if-lez v1, :cond_31

    .line 2223
    .line 2224
    iget-object v1, v2, La/a6a;->b:La/nr;

    .line 2225
    .line 2226
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v1

    .line 2230
    invoke-interface {v1, v5, v10}, La/x5a;->r(La/jge0;La/ucs0;)V

    .line 2231
    .line 2232
    .line 2233
    invoke-virtual/range {v19 .. v19}, La/g7z;->a()V

    .line 2234
    .line 2235
    .line 2236
    invoke-interface {v2}, La/fhl;->d()J

    .line 2237
    .line 2238
    .line 2239
    move-result-wide v5

    .line 2240
    and-long v5, v5, v17

    .line 2241
    .line 2242
    long-to-int v1, v5

    .line 2243
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2244
    .line 2245
    .line 2246
    move-result v1

    .line 2247
    sub-float/2addr v1, v0

    .line 2248
    invoke-interface {v2}, La/fhl;->d()J

    .line 2249
    .line 2250
    .line 2251
    move-result-wide v5

    .line 2252
    and-long v5, v5, v17

    .line 2253
    .line 2254
    long-to-int v0, v5

    .line 2255
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2256
    .line 2257
    .line 2258
    move-result v0

    .line 2259
    invoke-static {v4, v1, v0, v15}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v20

    .line 2263
    const/16 v28, 0x6

    .line 2264
    .line 2265
    const/16 v29, 0x3e

    .line 2266
    .line 2267
    const-wide/16 v21, 0x0

    .line 2268
    .line 2269
    const-wide/16 v23, 0x0

    .line 2270
    .line 2271
    const/16 v25, 0x0

    .line 2272
    .line 2273
    const/16 v26, 0x0

    .line 2274
    .line 2275
    const/16 v27, 0x0

    .line 2276
    .line 2277
    invoke-static/range {v19 .. v29}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 2278
    .line 2279
    .line 2280
    iget-object v0, v2, La/a6a;->b:La/nr;

    .line 2281
    .line 2282
    invoke-virtual {v0}, La/nr;->i()La/x5a;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v0

    .line 2286
    invoke-interface {v0}, La/x5a;->i()V

    .line 2287
    .line 2288
    .line 2289
    goto :goto_1c

    .line 2290
    :cond_31
    invoke-virtual/range {v19 .. v19}, La/g7z;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2291
    .line 2292
    .line 2293
    :goto_1c
    invoke-static {v3, v8, v9}, Lc;->g(La/nr;J)V

    .line 2294
    .line 2295
    .line 2296
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2297
    .line 2298
    return-object v0

    .line 2299
    :goto_1d
    invoke-static {v3, v8, v9}, Lc;->g(La/nr;J)V

    .line 2300
    .line 2301
    .line 2302
    throw v0

    .line 2303
    :pswitch_15
    check-cast v3, La/cbl0;

    .line 2304
    .line 2305
    check-cast v6, La/bbl0;

    .line 2306
    .line 2307
    check-cast v5, La/bbl0;

    .line 2308
    .line 2309
    check-cast v10, La/cbl0;

    .line 2310
    .line 2311
    check-cast v4, La/bbl0;

    .line 2312
    .line 2313
    move-object/from16 v0, p1

    .line 2314
    .line 2315
    check-cast v0, La/cp;

    .line 2316
    .line 2317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2318
    .line 2319
    .line 2320
    new-instance v1, La/vqa;

    .line 2321
    .line 2322
    sget-object v2, La/lwf;->f:La/ek5;

    .line 2323
    .line 2324
    invoke-direct {v1, v2}, La/zz3;-><init>(La/dtb;)V

    .line 2325
    .line 2326
    .line 2327
    new-instance v2, La/ogj0;

    .line 2328
    .line 2329
    invoke-direct {v2, v13}, La/ogj0;-><init>(B)V

    .line 2330
    .line 2331
    .line 2332
    new-instance v7, La/zrw;

    .line 2333
    .line 2334
    const/4 v8, 0x1

    .line 2335
    invoke-direct {v7, v4, v8}, La/zrw;-><init>(La/bbl0;B)V

    .line 2336
    .line 2337
    .line 2338
    new-instance v8, La/asj0;

    .line 2339
    .line 2340
    const/4 v15, 0x0

    .line 2341
    invoke-direct {v8, v14, v15}, La/asj0;-><init>(IB)V

    .line 2342
    .line 2343
    .line 2344
    sget-object v15, La/wjj0;->g:La/wjj0;

    .line 2345
    .line 2346
    new-instance v13, La/gbn;

    .line 2347
    .line 2348
    invoke-direct {v13, v2, v8, v7, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2349
    .line 2350
    .line 2351
    iget-object v2, v1, La/zz3;->d:La/dp;

    .line 2352
    .line 2353
    invoke-virtual {v2, v13}, La/dp;->b(La/gbn;)V

    .line 2354
    .line 2355
    .line 2356
    new-instance v7, La/shq0;

    .line 2357
    .line 2358
    invoke-direct {v7, v11}, La/shq0;-><init>(B)V

    .line 2359
    .line 2360
    .line 2361
    new-instance v8, La/t6q0;

    .line 2362
    .line 2363
    const/16 v11, 0x12

    .line 2364
    .line 2365
    invoke-direct {v8, v11}, La/t6q0;-><init>(B)V

    .line 2366
    .line 2367
    .line 2368
    new-instance v13, La/d8q0;

    .line 2369
    .line 2370
    invoke-direct {v13, v14, v14}, La/d8q0;-><init>(IB)V

    .line 2371
    .line 2372
    .line 2373
    sget-object v15, La/pfo0;->l:La/pfo0;

    .line 2374
    .line 2375
    new-instance v9, La/gbn;

    .line 2376
    .line 2377
    invoke-direct {v9, v7, v13, v8, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2378
    .line 2379
    .line 2380
    invoke-virtual {v2, v9}, La/dp;->b(La/gbn;)V

    .line 2381
    .line 2382
    .line 2383
    new-instance v7, La/jbp;

    .line 2384
    .line 2385
    const/16 v8, 0x1a

    .line 2386
    .line 2387
    invoke-direct {v7, v8}, La/jbp;-><init>(B)V

    .line 2388
    .line 2389
    .line 2390
    new-instance v9, La/rnp;

    .line 2391
    .line 2392
    invoke-direct {v9, v11}, La/rnp;-><init>(B)V

    .line 2393
    .line 2394
    .line 2395
    new-instance v11, La/atq;

    .line 2396
    .line 2397
    const/4 v15, 0x0

    .line 2398
    invoke-direct {v11, v14, v15}, La/atq;-><init>(IB)V

    .line 2399
    .line 2400
    .line 2401
    sget-object v13, La/gzn;->x:La/gzn;

    .line 2402
    .line 2403
    new-instance v15, La/gbn;

    .line 2404
    .line 2405
    invoke-direct {v15, v7, v11, v9, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2406
    .line 2407
    .line 2408
    invoke-virtual {v2, v15}, La/dp;->b(La/gbn;)V

    .line 2409
    .line 2410
    .line 2411
    new-instance v7, La/ht80;

    .line 2412
    .line 2413
    const/16 v9, 0x1d

    .line 2414
    .line 2415
    invoke-direct {v7, v9}, La/ht80;-><init>(B)V

    .line 2416
    .line 2417
    .line 2418
    new-instance v9, La/ev80;

    .line 2419
    .line 2420
    const/16 v11, 0x17

    .line 2421
    .line 2422
    invoke-direct {v9, v11}, La/ev80;-><init>(B)V

    .line 2423
    .line 2424
    .line 2425
    new-instance v11, La/iv60;

    .line 2426
    .line 2427
    invoke-direct {v11, v14, v12}, La/iv60;-><init>(IB)V

    .line 2428
    .line 2429
    .line 2430
    sget-object v13, La/xk60;->g:La/xk60;

    .line 2431
    .line 2432
    new-instance v15, La/gbn;

    .line 2433
    .line 2434
    invoke-direct {v15, v7, v11, v9, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2435
    .line 2436
    .line 2437
    invoke-virtual {v2, v15}, La/dp;->b(La/gbn;)V

    .line 2438
    .line 2439
    .line 2440
    new-instance v7, La/ei20;

    .line 2441
    .line 2442
    const/16 v9, 0x14

    .line 2443
    .line 2444
    invoke-direct {v7, v9}, La/ei20;-><init>(B)V

    .line 2445
    .line 2446
    .line 2447
    new-instance v9, La/bw20;

    .line 2448
    .line 2449
    invoke-direct {v9, v3, v4, v12}, La/bw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2450
    .line 2451
    .line 2452
    new-instance v3, La/tvx;

    .line 2453
    .line 2454
    const/16 v11, 0x17

    .line 2455
    .line 2456
    invoke-direct {v3, v14, v11}, La/tvx;-><init>(IB)V

    .line 2457
    .line 2458
    .line 2459
    sget-object v11, La/gvy;->y:La/gvy;

    .line 2460
    .line 2461
    new-instance v13, La/gbn;

    .line 2462
    .line 2463
    invoke-direct {v13, v7, v3, v9, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual {v2, v13}, La/dp;->b(La/gbn;)V

    .line 2467
    .line 2468
    .line 2469
    new-instance v3, La/kyz;

    .line 2470
    .line 2471
    const/16 v7, 0xc

    .line 2472
    .line 2473
    invoke-direct {v3, v7}, La/kyz;-><init>(B)V

    .line 2474
    .line 2475
    .line 2476
    new-instance v7, La/u400;

    .line 2477
    .line 2478
    invoke-direct {v7, v10, v4, v14}, La/u400;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2479
    .line 2480
    .line 2481
    new-instance v9, La/tvx;

    .line 2482
    .line 2483
    const/16 v10, 0xf

    .line 2484
    .line 2485
    invoke-direct {v9, v14, v10}, La/tvx;-><init>(IB)V

    .line 2486
    .line 2487
    .line 2488
    sget-object v10, La/gvy;->p:La/gvy;

    .line 2489
    .line 2490
    new-instance v11, La/gbn;

    .line 2491
    .line 2492
    invoke-direct {v11, v3, v9, v7, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v2, v11}, La/dp;->b(La/gbn;)V

    .line 2496
    .line 2497
    .line 2498
    new-instance v3, La/ht80;

    .line 2499
    .line 2500
    const/16 v7, 0x16

    .line 2501
    .line 2502
    invoke-direct {v3, v7}, La/ht80;-><init>(B)V

    .line 2503
    .line 2504
    .line 2505
    new-instance v7, La/vca;

    .line 2506
    .line 2507
    invoke-direct {v7, v5, v12}, La/vca;-><init>(La/bbl0;B)V

    .line 2508
    .line 2509
    .line 2510
    new-instance v5, La/iv60;

    .line 2511
    .line 2512
    const/4 v9, 0x2

    .line 2513
    invoke-direct {v5, v14, v9}, La/iv60;-><init>(IB)V

    .line 2514
    .line 2515
    .line 2516
    sget-object v9, La/xk60;->e:La/xk60;

    .line 2517
    .line 2518
    new-instance v10, La/gbn;

    .line 2519
    .line 2520
    invoke-direct {v10, v3, v5, v7, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2521
    .line 2522
    .line 2523
    invoke-virtual {v2, v10}, La/dp;->b(La/gbn;)V

    .line 2524
    .line 2525
    .line 2526
    new-instance v3, La/b4u0;

    .line 2527
    .line 2528
    const/16 v5, 0x18

    .line 2529
    .line 2530
    invoke-direct {v3, v5}, La/b4u0;-><init>(B)V

    .line 2531
    .line 2532
    .line 2533
    new-instance v5, La/d4u0;

    .line 2534
    .line 2535
    const/16 v7, 0x11

    .line 2536
    .line 2537
    invoke-direct {v5, v7}, La/d4u0;-><init>(B)V

    .line 2538
    .line 2539
    .line 2540
    new-instance v7, La/d8q0;

    .line 2541
    .line 2542
    invoke-direct {v7, v14, v8}, La/d8q0;-><init>(IB)V

    .line 2543
    .line 2544
    .line 2545
    sget-object v9, La/mnu0;->e:La/mnu0;

    .line 2546
    .line 2547
    new-instance v10, La/gbn;

    .line 2548
    .line 2549
    invoke-direct {v10, v3, v7, v5, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2550
    .line 2551
    .line 2552
    invoke-virtual {v2, v10}, La/dp;->b(La/gbn;)V

    .line 2553
    .line 2554
    .line 2555
    new-instance v3, La/gcl0;

    .line 2556
    .line 2557
    const/16 v9, 0x14

    .line 2558
    .line 2559
    invoke-direct {v3, v9}, La/gcl0;-><init>(B)V

    .line 2560
    .line 2561
    .line 2562
    new-instance v5, La/j1l0;

    .line 2563
    .line 2564
    const/16 v9, 0xa

    .line 2565
    .line 2566
    invoke-direct {v5, v6, v9}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 2567
    .line 2568
    .line 2569
    new-instance v6, La/asj0;

    .line 2570
    .line 2571
    const/16 v7, 0x9

    .line 2572
    .line 2573
    invoke-direct {v6, v14, v7}, La/asj0;-><init>(IB)V

    .line 2574
    .line 2575
    .line 2576
    sget-object v7, La/wjj0;->p:La/wjj0;

    .line 2577
    .line 2578
    new-instance v9, La/gbn;

    .line 2579
    .line 2580
    invoke-direct {v9, v3, v6, v5, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2581
    .line 2582
    .line 2583
    invoke-virtual {v2, v9}, La/dp;->b(La/gbn;)V

    .line 2584
    .line 2585
    .line 2586
    new-instance v3, La/x2w;

    .line 2587
    .line 2588
    invoke-direct {v3, v8}, La/x2w;-><init>(B)V

    .line 2589
    .line 2590
    .line 2591
    new-instance v5, La/zrw;

    .line 2592
    .line 2593
    const/4 v15, 0x0

    .line 2594
    invoke-direct {v5, v4, v15}, La/zrw;-><init>(La/bbl0;B)V

    .line 2595
    .line 2596
    .line 2597
    new-instance v4, La/pkv;

    .line 2598
    .line 2599
    const/16 v6, 0x13

    .line 2600
    .line 2601
    invoke-direct {v4, v14, v6}, La/pkv;-><init>(IB)V

    .line 2602
    .line 2603
    .line 2604
    sget-object v6, La/btv;->o:La/btv;

    .line 2605
    .line 2606
    new-instance v7, La/gbn;

    .line 2607
    .line 2608
    invoke-direct {v7, v3, v4, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 2609
    .line 2610
    .line 2611
    invoke-virtual {v2, v7}, La/dp;->b(La/gbn;)V

    .line 2612
    .line 2613
    .line 2614
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 2615
    .line 2616
    new-instance v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/adapters/gameinfo/main/viewholders/CardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1;

    .line 2617
    .line 2618
    invoke-direct {v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 2619
    .line 2620
    .line 2621
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 2622
    .line 2623
    check-cast v2, La/atx;

    .line 2624
    .line 2625
    iget-object v4, v2, La/atx;->b:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 2626
    .line 2627
    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 2628
    .line 2629
    .line 2630
    iget-object v2, v2, La/atx;->b:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 2631
    .line 2632
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 2633
    .line 2634
    .line 2635
    new-instance v2, La/op7;

    .line 2636
    .line 2637
    const/16 v7, 0x16

    .line 2638
    .line 2639
    invoke-direct {v2, v1, v0, v7}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2640
    .line 2641
    .line 2642
    invoke-virtual {v0, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2643
    .line 2644
    .line 2645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2646
    .line 2647
    return-object v0

    .line 2648
    :pswitch_16
    check-cast v3, La/x3w0;

    .line 2649
    .line 2650
    check-cast v6, La/pz40;

    .line 2651
    .line 2652
    check-cast v5, La/pz40;

    .line 2653
    .line 2654
    check-cast v10, La/pz40;

    .line 2655
    .line 2656
    check-cast v4, La/pz40;

    .line 2657
    .line 2658
    move-object/from16 v0, p1

    .line 2659
    .line 2660
    check-cast v0, Landroid/content/Context;

    .line 2661
    .line 2662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2663
    .line 2664
    .line 2665
    new-instance v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 2666
    .line 2667
    const/4 v7, 0x0

    .line 2668
    invoke-direct {v1, v0, v7}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2669
    .line 2670
    .line 2671
    new-instance v0, La/xx;

    .line 2672
    .line 2673
    const/16 v7, 0x11

    .line 2674
    .line 2675
    invoke-direct {v0, v6, v7}, La/xx;-><init>(La/pz40;B)V

    .line 2676
    .line 2677
    .line 2678
    invoke-virtual {v1, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnMediaFileReddy(Lkotlin/jvm/functions/Function0;)V

    .line 2679
    .line 2680
    .line 2681
    new-instance v0, La/xx;

    .line 2682
    .line 2683
    const/16 v11, 0x12

    .line 2684
    .line 2685
    invoke-direct {v0, v5, v11}, La/xx;-><init>(La/pz40;B)V

    .line 2686
    .line 2687
    .line 2688
    invoke-virtual {v1, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnError(Lkotlin/jvm/functions/Function0;)V

    .line 2689
    .line 2690
    .line 2691
    new-instance v0, La/xx;

    .line 2692
    .line 2693
    const/16 v6, 0x13

    .line 2694
    .line 2695
    invoke-direct {v0, v10, v6}, La/xx;-><init>(La/pz40;B)V

    .line 2696
    .line 2697
    .line 2698
    invoke-virtual {v1, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnInternalError(Lkotlin/jvm/functions/Function0;)V

    .line 2699
    .line 2700
    .line 2701
    invoke-virtual {v1, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setJavascriptInterface(La/r0t;)V

    .line 2702
    .line 2703
    .line 2704
    invoke-interface {v4, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2705
    .line 2706
    .line 2707
    return-object v1

    .line 2708
    :pswitch_17
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayer;

    .line 2709
    .line 2710
    check-cast v6, La/cgk0;

    .line 2711
    .line 2712
    check-cast v5, La/dfu0;

    .line 2713
    .line 2714
    check-cast v10, La/pz40;

    .line 2715
    .line 2716
    check-cast v4, La/pz40;

    .line 2717
    .line 2718
    move-object/from16 v0, p1

    .line 2719
    .line 2720
    check-cast v0, La/lwk;

    .line 2721
    .line 2722
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2723
    .line 2724
    .line 2725
    new-instance v0, La/l69;

    .line 2726
    .line 2727
    invoke-direct {v0, v6, v5, v10, v4}, La/l69;-><init>(La/cgk0;La/dfu0;La/pz40;La/pz40;)V

    .line 2728
    .line 2729
    .line 2730
    move-object v1, v3

    .line 2731
    check-cast v1, La/ulo;

    .line 2732
    .line 2733
    iget-object v1, v1, La/ulo;->m:La/vg00;

    .line 2734
    .line 2735
    invoke-virtual {v1, v0}, La/vg00;->a(Ljava/lang/Object;)V

    .line 2736
    .line 2737
    .line 2738
    new-instance v1, La/pr0;

    .line 2739
    .line 2740
    invoke-direct {v1, v3, v0, v12}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2741
    .line 2742
    .line 2743
    return-object v1

    .line 2744
    :pswitch_18
    check-cast v3, La/a4x;

    .line 2745
    .line 2746
    check-cast v6, La/jjm;

    .line 2747
    .line 2748
    check-cast v5, La/rqm;

    .line 2749
    .line 2750
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 2751
    .line 2752
    check-cast v4, La/jjm;

    .line 2753
    .line 2754
    move-object/from16 v0, p1

    .line 2755
    .line 2756
    check-cast v0, La/hcz;

    .line 2757
    .line 2758
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2759
    .line 2760
    .line 2761
    new-instance v1, La/yz8;

    .line 2762
    .line 2763
    const/4 v15, 0x0

    .line 2764
    invoke-direct {v1, v6, v15}, La/yz8;-><init>(La/jjm;B)V

    .line 2765
    .line 2766
    .line 2767
    new-instance v2, La/ugd;

    .line 2768
    .line 2769
    const v6, -0x5dc778e3

    .line 2770
    .line 2771
    .line 2772
    const/4 v7, 0x1

    .line 2773
    invoke-direct {v2, v6, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2774
    .line 2775
    .line 2776
    const-string v1, "DEFAULT_LANGUAGES_HEADER_KEY"

    .line 2777
    .line 2778
    const/4 v8, 0x0

    .line 2779
    const/4 v9, 0x2

    .line 2780
    invoke-static {v0, v1, v8, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2781
    .line 2782
    .line 2783
    new-instance v1, La/ab4;

    .line 2784
    .line 2785
    const/16 v2, 0xa

    .line 2786
    .line 2787
    invoke-direct {v1, v5, v10, v2}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2788
    .line 2789
    .line 2790
    new-instance v2, La/ugd;

    .line 2791
    .line 2792
    const v5, 0x3e04d614

    .line 2793
    .line 2794
    .line 2795
    invoke-direct {v2, v5, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2796
    .line 2797
    .line 2798
    const-string v1, "ALL_LANGUAGES_CELL_KEY"

    .line 2799
    .line 2800
    invoke-static {v0, v1, v8, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2801
    .line 2802
    .line 2803
    new-instance v1, La/yz8;

    .line 2804
    .line 2805
    invoke-direct {v1, v4, v7}, La/yz8;-><init>(La/jjm;B)V

    .line 2806
    .line 2807
    .line 2808
    new-instance v2, La/ugd;

    .line 2809
    .line 2810
    const v4, 0x5e962055

    .line 2811
    .line 2812
    .line 2813
    invoke-direct {v2, v4, v7, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2814
    .line 2815
    .line 2816
    const-string v1, "AVAILABLE_LANGUAGES_HEADER_KEY"

    .line 2817
    .line 2818
    invoke-static {v0, v1, v8, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 2819
    .line 2820
    .line 2821
    new-instance v1, La/cp8;

    .line 2822
    .line 2823
    const/16 v6, 0x13

    .line 2824
    .line 2825
    invoke-direct {v1, v6}, La/cp8;-><init>(B)V

    .line 2826
    .line 2827
    .line 2828
    new-instance v2, La/cp8;

    .line 2829
    .line 2830
    const/16 v9, 0x14

    .line 2831
    .line 2832
    invoke-direct {v2, v9}, La/cp8;-><init>(B)V

    .line 2833
    .line 2834
    .line 2835
    invoke-static {v3, v1}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2836
    .line 2837
    .line 2838
    move-result-object v1

    .line 2839
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2840
    .line 2841
    .line 2842
    move-result v4

    .line 2843
    new-instance v5, La/dx8;

    .line 2844
    .line 2845
    invoke-direct {v5, v1, v7}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 2846
    .line 2847
    .line 2848
    new-instance v1, La/at7;

    .line 2849
    .line 2850
    const/4 v6, 0x7

    .line 2851
    invoke-direct {v1, v2, v3, v6}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2852
    .line 2853
    .line 2854
    new-instance v2, La/vb;

    .line 2855
    .line 2856
    const/16 v6, 0xe

    .line 2857
    .line 2858
    invoke-direct {v2, v3, v10, v6}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 2859
    .line 2860
    .line 2861
    new-instance v3, La/ugd;

    .line 2862
    .line 2863
    const v6, -0x4e295cff

    .line 2864
    .line 2865
    .line 2866
    invoke-direct {v3, v6, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2867
    .line 2868
    .line 2869
    invoke-virtual {v0, v4, v5, v1, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2870
    .line 2871
    .line 2872
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2873
    .line 2874
    return-object v0

    .line 2875
    :pswitch_19
    check-cast v3, La/ctf0;

    .line 2876
    .line 2877
    check-cast v6, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 2878
    .line 2879
    check-cast v5, La/ntu;

    .line 2880
    .line 2881
    check-cast v10, La/pru;

    .line 2882
    .line 2883
    check-cast v4, La/bzt;

    .line 2884
    .line 2885
    move-object/from16 v2, p1

    .line 2886
    .line 2887
    check-cast v2, La/pu7;

    .line 2888
    .line 2889
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2890
    .line 2891
    .line 2892
    new-instance v1, La/ru7;

    .line 2893
    .line 2894
    iget-wide v6, v6, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;->c:J

    .line 2895
    .line 2896
    invoke-virtual {v5}, La/ntu;->a()Ljava/lang/String;

    .line 2897
    .line 2898
    .line 2899
    move-result-object v0

    .line 2900
    invoke-virtual {v10}, La/pru;->a()La/sff0;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v5

    .line 2904
    iget-object v5, v5, La/sff0;->g:La/mum0;

    .line 2905
    .line 2906
    iget-object v4, v4, La/bzt;->a:La/fsd;

    .line 2907
    .line 2908
    invoke-virtual {v4}, La/fsd;->a()La/v8d;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v4

    .line 2912
    iget v8, v4, La/v8d;->r:I

    .line 2913
    .line 2914
    move-wide/from16 v31, v6

    .line 2915
    .line 2916
    move-object v7, v5

    .line 2917
    move-wide/from16 v4, v31

    .line 2918
    .line 2919
    move-object v6, v0

    .line 2920
    invoke-direct/range {v1 .. v8}, La/ru7;-><init>(La/pu7;La/ctf0;JLjava/lang/String;La/mum0;I)V

    .line 2921
    .line 2922
    .line 2923
    return-object v1

    .line 2924
    :pswitch_1a
    check-cast v6, La/rmb0;

    .line 2925
    .line 2926
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 2927
    .line 2928
    check-cast v5, La/wmb0;

    .line 2929
    .line 2930
    check-cast v3, Ljava/lang/String;

    .line 2931
    .line 2932
    check-cast v10, La/k6z;

    .line 2933
    .line 2934
    move-object/from16 v0, p1

    .line 2935
    .line 2936
    check-cast v0, La/lwk;

    .line 2937
    .line 2938
    iget-object v0, v6, La/rmb0;->p:Landroid/view/WindowManager;

    .line 2939
    .line 2940
    iget-object v1, v6, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 2941
    .line 2942
    invoke-interface {v0, v6, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2943
    .line 2944
    .line 2945
    invoke-virtual {v6, v4, v5, v3, v10}, La/rmb0;->o(Lkotlin/jvm/functions/Function0;La/wmb0;Ljava/lang/String;La/k6z;)V

    .line 2946
    .line 2947
    .line 2948
    new-instance v0, La/ty2;

    .line 2949
    .line 2950
    const/4 v7, 0x1

    .line 2951
    invoke-direct {v0, v6, v7}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 2952
    .line 2953
    .line 2954
    return-object v0

    .line 2955
    :pswitch_1b
    move-object v8, v7

    .line 2956
    check-cast v3, La/a8q0;

    .line 2957
    .line 2958
    check-cast v6, La/e03;

    .line 2959
    .line 2960
    check-cast v5, La/k3x;

    .line 2961
    .line 2962
    check-cast v10, La/nej0;

    .line 2963
    .line 2964
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 2965
    .line 2966
    move-object/from16 v0, p1

    .line 2967
    .line 2968
    check-cast v0, La/ejz;

    .line 2969
    .line 2970
    iget-object v1, v6, La/e03;->a:La/uiz;

    .line 2971
    .line 2972
    iput-object v3, v0, La/ejz;->h:La/a8q0;

    .line 2973
    .line 2974
    iput-object v5, v0, La/ejz;->i:La/k3x;

    .line 2975
    .line 2976
    iput-object v10, v0, La/ejz;->c:Lkotlin/jvm/functions/Function1;

    .line 2977
    .line 2978
    iput-object v4, v0, La/ejz;->d:Lkotlin/jvm/functions/Function1;

    .line 2979
    .line 2980
    if-eqz v1, :cond_32

    .line 2981
    .line 2982
    iget-object v2, v1, La/uiz;->p:La/djz;

    .line 2983
    .line 2984
    goto :goto_1e

    .line 2985
    :cond_32
    move-object v2, v8

    .line 2986
    :goto_1e
    iput-object v2, v0, La/ejz;->e:La/djz;

    .line 2987
    .line 2988
    if-eqz v1, :cond_33

    .line 2989
    .line 2990
    iget-object v2, v1, La/uiz;->q:La/k7q0;

    .line 2991
    .line 2992
    goto :goto_1f

    .line 2993
    :cond_33
    move-object v2, v8

    .line 2994
    :goto_1f
    iput-object v2, v0, La/ejz;->f:La/k7q0;

    .line 2995
    .line 2996
    if-eqz v1, :cond_34

    .line 2997
    .line 2998
    sget-object v2, La/bmd;->t:La/zfn;

    .line 2999
    .line 3000
    invoke-static {v1, v2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v1

    .line 3004
    move-object v7, v1

    .line 3005
    check-cast v7, La/wgu0;

    .line 3006
    .line 3007
    goto :goto_20

    .line 3008
    :cond_34
    move-object v7, v8

    .line 3009
    :goto_20
    iput-object v7, v0, La/ejz;->g:La/wgu0;

    .line 3010
    .line 3011
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3012
    .line 3013
    return-object v0

    .line 3014
    :pswitch_1c
    check-cast v3, Ljava/lang/String;

    .line 3015
    .line 3016
    check-cast v6, Ljava/lang/String;

    .line 3017
    .line 3018
    check-cast v5, Ljava/lang/String;

    .line 3019
    .line 3020
    check-cast v10, Ljava/lang/String;

    .line 3021
    .line 3022
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 3023
    .line 3024
    move-object/from16 v0, p1

    .line 3025
    .line 3026
    check-cast v0, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 3027
    .line 3028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3029
    .line 3030
    .line 3031
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonText(Ljava/lang/CharSequence;)V

    .line 3032
    .line 3033
    .line 3034
    const v1, 0x7f08081b

    .line 3035
    .line 3036
    .line 3037
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonIconRes(I)V

    .line 3038
    .line 3039
    .line 3040
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setLabel(Ljava/lang/CharSequence;)V

    .line 3041
    .line 3042
    .line 3043
    new-instance v1, La/ke;

    .line 3044
    .line 3045
    sget-object v2, La/pn40;->a:La/pn40;

    .line 3046
    .line 3047
    invoke-static {v5}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v2

    .line 3051
    if-eqz v2, :cond_35

    .line 3052
    .line 3053
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 3054
    .line 3055
    .line 3056
    move-result-wide v2

    .line 3057
    goto :goto_21

    .line 3058
    :cond_35
    const-wide/16 v2, 0x0

    .line 3059
    .line 3060
    :goto_21
    const-string v5, ""

    .line 3061
    .line 3062
    invoke-static {v5, v2, v3}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 3063
    .line 3064
    .line 3065
    move-result-object v2

    .line 3066
    invoke-direct {v1, v2, v10}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3067
    .line 3068
    .line 3069
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setModel(La/ke;)V

    .line 3070
    .line 3071
    .line 3072
    new-instance v1, La/c0;

    .line 3073
    .line 3074
    const/4 v9, 0x2

    .line 3075
    invoke-direct {v1, v4, v9}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 3076
    .line 3077
    .line 3078
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 3079
    .line 3080
    .line 3081
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3082
    .line 3083
    return-object v0

    .line 3084
    nop

    .line 3085
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
