.class public final La/lrd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public static a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "Expected ViewPager2 instance. Got: "

    .line 13
    .line 14
    invoke-static {p0, v0}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public b(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, La/lrd;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/f5r;

    .line 4
    .line 5
    iget-object v1, v0, La/f5r;->j:La/gnw0;

    .line 6
    .line 7
    iget-object v2, v0, La/f5r;->f:La/u710;

    .line 8
    .line 9
    iget-object v3, v0, La/f5r;->e:Landroidx/fragment/app/e;

    .line 10
    .line 11
    invoke-virtual {v3}, Landroidx/fragment/app/e;->a0()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    iget-object v4, p0, La/lrd;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_1
    invoke-virtual {v2}, La/u710;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_d

    .line 36
    .line 37
    invoke-virtual {v0}, La/yge0;->d()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_2
    iget-object v4, p0, La/lrd;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v0}, La/yge0;->d()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-lt v4, v5, :cond_3

    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v0, v4}, La/f5r;->e(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    iget-wide v6, p0, La/lrd;->a:J

    .line 66
    .line 67
    cmp-long v0, v4, v6

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_4
    invoke-virtual {v2, v4, v5}, La/u710;->b(J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 80
    .line 81
    if-eqz p1, :cond_d

    .line 82
    .line 83
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_5

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_5
    iput-wide v4, p0, La/lrd;->a:J

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance p1, La/zb5;

    .line 97
    .line 98
    invoke-direct {p1, v3}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    const/4 v4, 0x0

    .line 108
    move v5, v3

    .line 109
    :goto_0
    invoke-virtual {v2}, La/u710;->h()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-ge v5, v6, :cond_a

    .line 114
    .line 115
    invoke-virtual {v2, v5}, La/u710;->e(I)J

    .line 116
    .line 117
    .line 118
    move-result-wide v6

    .line 119
    invoke-virtual {v2, v5}, La/u710;->i(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Landroidx/fragment/app/Fragment;

    .line 124
    .line 125
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->N()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-nez v9, :cond_6

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    iget-wide v9, p0, La/lrd;->a:J

    .line 133
    .line 134
    cmp-long v9, v6, v9

    .line 135
    .line 136
    if-eqz v9, :cond_8

    .line 137
    .line 138
    sget-object v9, La/lkz;->d:La/lkz;

    .line 139
    .line 140
    invoke-virtual {p1, v8, v9}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v9, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    iget-object v10, v1, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-nez v11, :cond_7

    .line 162
    .line 163
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-static {v10}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    throw p0

    .line 172
    :cond_8
    move-object v4, v8

    .line 173
    :goto_1
    iget-wide v9, p0, La/lrd;->a:J

    .line 174
    .line 175
    cmp-long v6, v6, v9

    .line 176
    .line 177
    if-nez v6, :cond_9

    .line 178
    .line 179
    const/4 v6, 0x1

    .line 180
    goto :goto_2

    .line 181
    :cond_9
    move v6, v3

    .line 182
    :goto_2
    invoke-virtual {v8, v6}, Landroidx/fragment/app/Fragment;->u0(Z)V

    .line 183
    .line 184
    .line 185
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_a
    if-eqz v4, :cond_c

    .line 189
    .line 190
    sget-object p0, La/lkz;->e:La/lkz;

    .line 191
    .line 192
    invoke-virtual {p1, v4, p0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance p0, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    iget-object v2, v1, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_b

    .line 214
    .line 215
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_b
    invoke-static {v2}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    throw p0

    .line 224
    :cond_c
    :goto_4
    iget-object p0, p1, La/zb5;->a:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-nez p0, :cond_d

    .line 231
    .line 232
    invoke-virtual {p1}, La/zb5;->h()V

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_d

    .line 247
    .line 248
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    check-cast p1, Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, La/gnw0;->a(Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_d
    :goto_6
    return-void
.end method
