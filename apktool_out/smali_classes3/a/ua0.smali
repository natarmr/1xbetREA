.class public final La/ua0;
.super La/rs3;
.source "SourceFile"


# instance fields
.field public final f:La/i1w0;

.field public final g:La/f8;


# direct methods
.method public constructor <init>(La/kxq;Landroidx/fragment/app/e;La/i1w0;La/f8;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/fragment/app/e;->S()La/m1r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v1, 0x7f0a060f

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, v1, p2, v0}, La/rs3;-><init>(La/kxq;ILandroidx/fragment/app/e;La/m1r;)V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, La/ua0;->f:La/i1w0;

    .line 21
    .line 22
    iput-object p4, p0, La/ua0;->g:La/f8;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/t7d;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/dwq;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, La/dwq;

    .line 11
    .line 12
    iget-object v0, v0, La/dwq;->a:La/m7h0;

    .line 13
    .line 14
    instance-of v2, v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, La/ua0;->f:La/i1w0;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    new-instance v2, La/e1w0;

    .line 36
    .line 37
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 38
    .line 39
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, La/c8d;

    .line 43
    .line 44
    sget-object v3, La/y7d;->a:La/v7d;

    .line 45
    .line 46
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v2, La/w0w0;

    .line 54
    .line 55
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, La/c8d;

    .line 59
    .line 60
    sget-object v3, La/y7d;->a:La/v7d;

    .line 61
    .line 62
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_1
    move-object v0, p1

    .line 73
    check-cast v0, La/paw;

    .line 74
    .line 75
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/oe50;

    .line 86
    .line 87
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    return-void

    .line 92
    :cond_2
    instance-of v0, p1, La/tb50;

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    iget-object v3, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    check-cast p1, La/tb50;

    .line 100
    .line 101
    iget-object v0, p1, La/tb50;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 102
    .line 103
    iget-object p1, p1, La/tb50;->b:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p0, La/rs3;->d:La/m1r;

    .line 106
    .line 107
    invoke-interface {v0, v1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v4, La/zb5;

    .line 115
    .line 116
    invoke-direct {v4, v3}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 117
    .line 118
    .line 119
    iput-boolean v2, v4, La/zb5;->p:Z

    .line 120
    .line 121
    iget v5, p0, La/rs3;->b:I

    .line 122
    .line 123
    invoke-virtual {v3, v5}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {p0, v0, v4, v3, v1}, La/ua0;->i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->g()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    invoke-virtual {v4, v5, v1, p1}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-virtual {v4, v5, v1, p1, v2}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    :goto_2
    invoke-virtual {v4, p1}, La/zb5;->c(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object p0, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, La/zb5;->f()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_4
    instance-of v0, p1, La/ryg0;

    .line 156
    .line 157
    if-eqz v0, :cond_5

    .line 158
    .line 159
    check-cast p1, La/ryg0;

    .line 160
    .line 161
    iget-object p0, p1, La/ryg0;->b:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    new-instance p1, Landroidx/fragment/app/d;

    .line 167
    .line 168
    invoke-direct {p1, v3, p0}, Landroidx/fragment/app/d;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, p1, v1}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_5
    instance-of v0, p1, La/szf0;

    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    check-cast p1, La/szf0;

    .line 180
    .line 181
    iget-object p0, p1, La/szf0;->b:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance p1, La/p1r;

    .line 187
    .line 188
    invoke-direct {p1, v3, p0, v2}, La/p1r;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;B)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, p1, v1}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_6
    instance-of v0, p1, La/asc;

    .line 196
    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    check-cast p1, La/asc;

    .line 200
    .line 201
    iget-object p0, p1, La/asc;->b:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance p1, La/p1r;

    .line 207
    .line 208
    invoke-direct {p1, v3, p0, v1}, La/p1r;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, p1, v1}, Landroidx/fragment/app/e;->A(La/s1r;Z)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_7
    invoke-super {p0, p1}, La/rs3;->a(La/t7d;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-le v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, La/ua0;->g:La/f8;

    .line 11
    .line 12
    invoke-virtual {v0}, La/f8;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-super {p0}, La/rs3;->c()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/ua0;->f:La/i1w0;

    .line 35
    .line 36
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/c8d;

    .line 41
    .line 42
    sget-object v2, La/y7d;->a:La/v7d;

    .line 43
    .line 44
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 45
    .line 46
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_1
    move-object v1, v0

    .line 55
    check-cast v1, La/paw;

    .line 56
    .line 57
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/oe50;

    .line 68
    .line 69
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    return-void
.end method

.method public final d(La/m7h0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/rs3;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/rs3;->c:Landroidx/fragment/app/e;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/e;->P()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-lt p1, v0, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, La/zb5;->i:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget v0, v0, La/zb5;->t:I

    .line 35
    .line 36
    invoke-virtual {p0, v0, p1, p1}, Landroidx/fragment/app/e;->e0(IIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/e;->f0(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final i(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;La/zb5;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const p0, 0x7f010033

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const p3, 0x7f010030

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3, p0, p1, p1}, La/zb5;->p(IIII)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
