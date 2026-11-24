.class public final La/cfk;
.super La/pfk;
.source "SourceFile"


# instance fields
.field public final g:La/cty;

.field public final h:La/cu00;

.field public final i:La/cu00;

.field public final synthetic j:La/ffk;


# direct methods
.method public constructor <init>(La/ffk;La/cty;)V
    .locals 8

    .line 1
    iput-object p1, p0, La/cfk;->j:La/ffk;

    .line 2
    .line 3
    iget-object v1, p1, La/ffk;->l:La/g45;

    .line 4
    .line 5
    iget-object v0, p1, La/ffk;->e:La/s2d0;

    .line 6
    .line 7
    iget-object v2, v0, La/s2d0;->q:Ljava/util/List;

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    invoke-static {v3}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    move-object v5, v4

    .line 29
    check-cast v5, La/i3d0;

    .line 30
    .line 31
    sget-object v6, La/njq;->A:La/kjq;

    .line 32
    .line 33
    iget v5, v5, La/i3d0;->d:I

    .line 34
    .line 35
    invoke-virtual {v6, v5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v3, v0, La/s2d0;->r:Ljava/util/List;

    .line 50
    .line 51
    move-object v4, v3

    .line 52
    invoke-static {v4}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v6, v5

    .line 71
    check-cast v6, La/p3d0;

    .line 72
    .line 73
    sget-object v7, La/njq;->L:La/kjq;

    .line 74
    .line 75
    iget v6, v6, La/p3d0;->d:I

    .line 76
    .line 77
    invoke-virtual {v7, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_2

    .line 86
    .line 87
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    iget-object v4, v0, La/s2d0;->s:Ljava/util/List;

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, La/s2d0;->k:Ljava/util/List;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object p1, p1, La/ffk;->l:La/g45;

    .line 102
    .line 103
    iget-object p1, p1, La/g45;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, La/h950;

    .line 106
    .line 107
    new-instance v5, Ljava/util/ArrayList;

    .line 108
    .line 109
    const/16 v6, 0xa

    .line 110
    .line 111
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_4

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    check-cast v6, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-static {p1, v6}, La/ydx;->L(La/h950;I)La/g950;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    new-instance p1, La/zek;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    invoke-direct {p1, v5, v6}, La/zek;-><init>(Ljava/util/ArrayList;B)V

    .line 150
    .line 151
    .line 152
    move-object v0, p0

    .line 153
    move-object v5, p1

    .line 154
    invoke-direct/range {v0 .. v5}, La/pfk;-><init>(La/g45;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 155
    .line 156
    .line 157
    iget-object p0, v1, La/g45;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p0, La/f6i;

    .line 160
    .line 161
    iput-object p2, v0, La/cfk;->g:La/cty;

    .line 162
    .line 163
    iget-object p1, p0, La/f6i;->e:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, La/eu00;

    .line 166
    .line 167
    new-instance p2, La/afk;

    .line 168
    .line 169
    invoke-direct {p2, v0, v6}, La/afk;-><init>(La/cfk;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    new-instance v1, La/cu00;

    .line 176
    .line 177
    invoke-direct {v1, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, v0, La/cfk;->h:La/cu00;

    .line 181
    .line 182
    iget-object p0, p0, La/f6i;->e:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p0, La/eu00;

    .line 185
    .line 186
    new-instance p1, La/afk;

    .line 187
    .line 188
    const/4 p2, 0x1

    .line 189
    invoke-direct {p1, v0, p2}, La/afk;-><init>(La/cfk;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance p2, La/cu00;

    .line 196
    .line 197
    invoke-direct {p2, p0, p1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    iput-object p2, v0, La/cfk;->i:La/cu00;

    .line 201
    .line 202
    return-void
.end method


# virtual methods
.method public final a(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, La/cfk;->s(La/g950;La/ux50;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, La/pfk;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/cfk;->h:La/cu00;

    .line 5
    .line 6
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method public final d(La/g950;La/ux50;)La/foc;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/cfk;->s(La/g950;La/ux50;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/cfk;->j:La/ffk;

    .line 11
    .line 12
    iget-object v0, v0, La/ffk;->p:La/ali;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, La/ali;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/xg;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/wm40;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    invoke-super {p0, p1, p2}, La/pfk;->d(La/g950;La/ux50;)La/foc;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, La/cfk;->s(La/g950;La/ux50;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, La/pfk;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final h(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->p:La/ali;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, La/ali;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/g950;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, La/ali;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/xg;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/wm40;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    :cond_2
    if-nez v0, :cond_3

    .line 59
    .line 60
    sget-object v0, La/iun;->a:La/iun;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final j(La/g950;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/cfk;->i:La/cu00;

    .line 7
    .line 8
    invoke-virtual {v0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/wsy;

    .line 29
    .line 30
    invoke-virtual {v1}, La/wsy;->y()La/cr30;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v3, La/ux50;->c:La/ux50;

    .line 35
    .line 36
    invoke-interface {v1, p1, v3}, La/cr30;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, La/pfk;->b:La/g45;

    .line 45
    .line 46
    iget-object v1, v0, La/g45;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/f6i;

    .line 49
    .line 50
    iget-object v1, v1, La/f6i;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/fx;

    .line 53
    .line 54
    iget-object v3, p0, La/cfk;->j:La/ffk;

    .line 55
    .line 56
    invoke-interface {v1, p1, v3}, La/fx;->c(La/g950;La/wm40;)Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    new-instance v3, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/f6i;

    .line 71
    .line 72
    iget-object v0, v0, La/f6i;->s:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/km50;

    .line 75
    .line 76
    check-cast v0, La/lm50;

    .line 77
    .line 78
    iget-object v0, v0, La/lm50;->d:La/sf80;

    .line 79
    .line 80
    new-instance v5, La/bfk;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-direct {v5, p2, v1}, La/bfk;-><init>(Ljava/util/AbstractCollection;B)V

    .line 84
    .line 85
    .line 86
    iget-object v4, p0, La/cfk;->j:La/ffk;

    .line 87
    .line 88
    move-object v1, p1

    .line 89
    invoke-virtual/range {v0 .. v5}, La/sf80;->h(La/g950;Ljava/util/Collection;Ljava/util/Collection;La/wm40;La/g8x;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final k(La/g950;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/cfk;->i:La/cu00;

    .line 7
    .line 8
    invoke-virtual {v0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/wsy;

    .line 29
    .line 30
    invoke-virtual {v1}, La/wsy;->y()La/cr30;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v3, La/ux50;->c:La/ux50;

    .line 35
    .line 36
    invoke-interface {v1, p1, v3}, La/cr30;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/pfk;->b:La/g45;

    .line 50
    .line 51
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/f6i;

    .line 54
    .line 55
    iget-object v0, v0, La/f6i;->s:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, La/km50;

    .line 58
    .line 59
    check-cast v0, La/lm50;

    .line 60
    .line 61
    iget-object v0, v0, La/lm50;->d:La/sf80;

    .line 62
    .line 63
    new-instance v5, La/bfk;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v5, p2, v1}, La/bfk;-><init>(Ljava/util/AbstractCollection;B)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, La/cfk;->j:La/ffk;

    .line 70
    .line 71
    move-object v1, p1

    .line 72
    invoke-virtual/range {v0 .. v5}, La/sf80;->h(La/g950;Ljava/util/Collection;Ljava/util/Collection;La/wm40;La/g8x;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final l(La/g950;)La/qlc;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 5
    .line 6
    iget-object p0, p0, La/ffk;->h:La/qlc;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/qlc;->d(La/g950;)La/qlc;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final n()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->n:La/efk;

    .line 4
    .line 5
    invoke-virtual {p0}, La/r5;->g()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/wsy;

    .line 29
    .line 30
    invoke-virtual {v1}, La/wsy;->y()La/cr30;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/cr30;->e()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_0
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-object v0
.end method

.method public final o()Ljava/util/Set;
    .locals 4

    .line 1
    iget-object v0, p0, La/cfk;->j:La/ffk;

    .line 2
    .line 3
    iget-object v1, v0, La/ffk;->n:La/efk;

    .line 4
    .line 5
    invoke-virtual {v1}, La/r5;->g()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, La/wsy;

    .line 29
    .line 30
    invoke-virtual {v3}, La/wsy;->y()La/cr30;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3}, La/cr30;->c()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p0, p0, La/pfk;->b:La/g45;

    .line 45
    .line 46
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/f6i;

    .line 49
    .line 50
    iget-object p0, p0, La/f6i;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/fx;

    .line 53
    .line 54
    invoke-interface {p0, v0}, La/fx;->g(La/wm40;)Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    return-object v2
.end method

.method public final p()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->n:La/efk;

    .line 4
    .line 5
    invoke-virtual {p0}, La/r5;->g()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/wsy;

    .line 29
    .line 30
    invoke-virtual {v1}, La/wsy;->y()La/cr30;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/cr30;->g()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public final r(La/sfk;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/pfk;->b:La/g45;

    .line 2
    .line 3
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/f6i;

    .line 6
    .line 7
    iget-object v0, v0, La/f6i;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/qv90;

    .line 10
    .line 11
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 12
    .line 13
    invoke-interface {v0, p0, p1}, La/qv90;->f(La/wm40;La/sfk;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final s(La/g950;La/ux50;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/pfk;->b:La/g45;

    .line 8
    .line 9
    iget-object p1, p1, La/g45;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, La/f6i;

    .line 12
    .line 13
    iget-object p1, p1, La/f6i;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, La/gqw0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/cfk;->j:La/ffk;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-void
.end method
