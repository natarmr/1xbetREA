.class public final La/yly;
.super La/oyc;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/b9o0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/yly;->c:B

    .line 3
    .line 4
    iput-object p1, p0, La/yly;->e:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, La/oyc;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/yly;->d:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/zly;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/yly;->c:B

    iput-object p1, p0, La/yly;->d:Ljava/lang/Object;

    iput-object p2, p0, La/yly;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, La/oyc;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(La/div0;)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/yly;->c:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/yly;->d:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/yly;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/b9o0;

    .line 12
    .line 13
    iget-object p0, p0, La/b9o0;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v0, p1, La/div0;->a:La/civ0;

    .line 16
    .line 17
    invoke-virtual {v0}, La/civ0;->d()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    and-int/lit16 v0, v0, 0x207

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast v2, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v0, 0x1

    .line 35
    sub-int/2addr p1, v0

    .line 36
    :goto_0
    if-ltz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/i2d0;

    .line 43
    .line 44
    iget v3, v2, La/i2d0;->e:I

    .line 45
    .line 46
    if-lez v3, :cond_0

    .line 47
    .line 48
    move v4, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v4, v1

    .line 51
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 52
    .line 53
    iput v3, v2, La/i2d0;->e:I

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v2}, La/i2d0;->c()V

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-void

    .line 66
    :pswitch_0
    check-cast v2, La/zly;

    .line 67
    .line 68
    iget-object p0, p1, La/div0;->a:La/civ0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/civ0;->d()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    and-int/lit8 p0, p0, 0x8

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    iput-boolean v1, v2, La/zly;->A:Z

    .line 79
    .line 80
    :cond_3
    invoke-virtual {v2}, La/zly;->a1()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(La/div0;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/yly;->c:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/yly;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/b9o0;

    .line 10
    .line 11
    iget-object p0, p0, La/b9o0;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 14
    .line 15
    invoke-virtual {p1}, La/civ0;->d()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit16 p1, p1, 0x207

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sub-int/2addr p1, v1

    .line 28
    :goto_0
    if-ltz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/i2d0;

    .line 35
    .line 36
    iget v2, v0, La/i2d0;->e:I

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    iput v2, v0, La/i2d0;->e:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 46
    .line 47
    invoke-virtual {p1}, La/civ0;->d()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    and-int/lit8 p1, p1, 0x8

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, La/yly;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, La/zly;

    .line 58
    .line 59
    iput-boolean v1, p0, La/zly;->A:Z

    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(La/xiv0;Ljava/util/List;)La/xiv0;
    .locals 9

    .line 1
    iget-byte v0, p0, La/yly;->c:B

    .line 2
    .line 3
    iget-object v1, p0, La/yly;->d:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, La/yly;->e:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/b9o0;

    .line 13
    .line 14
    iget-object p0, p0, La/b9o0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/RectF;

    .line 17
    .line 18
    const/high16 v4, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-direct {v0, v4, v4, v4, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    sub-int/2addr v4, v2

    .line 28
    move v5, v3

    .line 29
    :goto_0
    if-ltz v4, :cond_5

    .line 30
    .line 31
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, La/div0;

    .line 36
    .line 37
    move-object v7, v1

    .line 38
    check-cast v7, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, Ljava/lang/Integer;

    .line 45
    .line 46
    if-eqz v7, :cond_4

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    iget-object v6, v6, La/div0;->a:La/civ0;

    .line 53
    .line 54
    invoke-virtual {v6}, La/civ0;->a()F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    and-int/lit8 v8, v7, 0x1

    .line 59
    .line 60
    if-eqz v8, :cond_0

    .line 61
    .line 62
    iput v6, v0, Landroid/graphics/RectF;->left:F

    .line 63
    .line 64
    :cond_0
    and-int/lit8 v8, v7, 0x2

    .line 65
    .line 66
    if-eqz v8, :cond_1

    .line 67
    .line 68
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    :cond_1
    and-int/lit8 v8, v7, 0x4

    .line 71
    .line 72
    if-eqz v8, :cond_2

    .line 73
    .line 74
    iput v6, v0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    :cond_2
    and-int/lit8 v8, v7, 0x8

    .line 77
    .line 78
    if-eqz v8, :cond_3

    .line 79
    .line 80
    iput v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 81
    .line 82
    :cond_3
    or-int/2addr v5, v7

    .line 83
    :cond_4
    add-int/lit8 v4, v4, -0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    const/16 p2, 0x207

    .line 87
    .line 88
    iget-object v0, p1, La/xiv0;->a:La/uiv0;

    .line 89
    .line 90
    invoke-virtual {v0, p2}, La/uiv0;->i(I)La/pfx;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/16 v0, 0x40

    .line 95
    .line 96
    iget-object v1, p1, La/xiv0;->a:La/uiv0;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, La/uiv0;->i(I)La/pfx;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p2, v0}, La/pfx;->b(La/pfx;La/pfx;)La/pfx;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    sub-int/2addr p2, v2

    .line 110
    :goto_1
    if-ltz p2, :cond_8

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/i2d0;

    .line 117
    .line 118
    iget-object v1, v0, La/i2d0;->d:La/pfx;

    .line 119
    .line 120
    iget-object v0, v0, La/i2d0;->a:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v1, v2

    .line 127
    :goto_2
    if-ltz v1, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, La/p4d;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    and-int v4, v3, v5

    .line 139
    .line 140
    if-nez v4, :cond_6

    .line 141
    .line 142
    add-int/lit8 v1, v1, -0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const/4 p0, 0x0

    .line 146
    throw p0

    .line 147
    :cond_7
    add-int/lit8 p2, p2, -0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    return-object p1

    .line 151
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object p2, p1, La/xiv0;->a:La/uiv0;

    .line 158
    .line 159
    const/16 v0, 0x8

    .line 160
    .line 161
    invoke-virtual {p2, v0}, La/uiv0;->u(I)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_9

    .line 166
    .line 167
    check-cast p0, Landroid/view/View;

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_9

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_9
    move v2, v3

    .line 177
    :goto_3
    if-eqz v2, :cond_a

    .line 178
    .line 179
    invoke-virtual {p2, v0}, La/uiv0;->i(I)La/pfx;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    iget p0, p0, La/pfx;->d:I

    .line 184
    .line 185
    int-to-float p0, p0

    .line 186
    goto :goto_4

    .line 187
    :cond_a
    const/4 p0, 0x0

    .line 188
    :goto_4
    check-cast v1, La/zly;

    .line 189
    .line 190
    invoke-virtual {v1, p0, v2}, La/zly;->Z0(FZ)V

    .line 191
    .line 192
    .line 193
    return-object p1

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(La/div0;La/hcp0;)La/hcp0;
    .locals 5

    .line 1
    iget-byte v0, p0, La/yly;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-object p2

    .line 7
    :pswitch_0
    iget-object v0, p1, La/div0;->a:La/civ0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/civ0;->d()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v0, v0, 0x207

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object v0, p2, La/hcp0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/pfx;

    .line 20
    .line 21
    iget-object v1, p2, La/hcp0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/pfx;

    .line 24
    .line 25
    iget v2, v0, La/pfx;->a:I

    .line 26
    .line 27
    iget v3, v1, La/pfx;->a:I

    .line 28
    .line 29
    if-eq v2, v3, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    iget v3, v0, La/pfx;->b:I

    .line 35
    .line 36
    iget v4, v1, La/pfx;->b:I

    .line 37
    .line 38
    if-eq v3, v4, :cond_1

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    :cond_1
    iget v3, v0, La/pfx;->c:I

    .line 43
    .line 44
    iget v4, v1, La/pfx;->c:I

    .line 45
    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x4

    .line 49
    .line 50
    :cond_2
    iget v0, v0, La/pfx;->d:I

    .line 51
    .line 52
    iget v1, v1, La/pfx;->d:I

    .line 53
    .line 54
    if-eq v0, v1, :cond_3

    .line 55
    .line 56
    or-int/lit8 v2, v2, 0x8

    .line 57
    .line 58
    :cond_3
    iget-object p0, p0, La/yly;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_4
    return-object p2

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
