.class public final La/qja0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/yfu;

.field public final p:La/zlt0;

.field public final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/yfu;La/nmo;La/zlt0;Ljava/lang/String;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/qw80;

    .line 5
    .line 6
    const/16 v0, 0x16

    .line 7
    .line 8
    invoke-direct {v2, p2, p4, v0}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    sget-object v3, La/pja0;->a:La/pja0;

    .line 12
    .line 13
    iget-object p2, p5, La/mne;->a:La/rwj;

    .line 14
    .line 15
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/qja0;->o:La/yfu;

    .line 26
    .line 27
    iput-object p3, v0, La/qja0;->p:La/zlt0;

    .line 28
    .line 29
    iput-object p4, v0, La/qja0;->q:Ljava/lang/String;

    .line 30
    .line 31
    new-instance p0, La/er90;

    .line 32
    .line 33
    const/16 p1, 0x1c

    .line 34
    .line 35
    invoke-direct {p0, p1}, La/er90;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/m91;

    .line 39
    .line 40
    const/16 p2, 0x10

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, v0, p3, p2}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-static {v0, p3, p0, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final M(La/kja0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, La/kja0;->a:La/ria0;

    .line 8
    .line 9
    iget p1, p1, La/ria0;->a:I

    .line 10
    .line 11
    iget-object v0, p0, La/qja0;->p:La/zlt0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/qja0;->q:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, p0, v1}, La/zlt0;->g(Ljava/lang/String;Z)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, p0, v2}, La/zlt0;->g(Ljava/lang/String;Z)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v0, v0, La/zlt0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/z220;

    .line 34
    .line 35
    iget-object v0, v0, La/z220;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/eja0;

    .line 38
    .line 39
    iget-object v3, v0, La/eja0;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, 0x0

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    move-object v7, v5

    .line 57
    check-cast v7, La/k5i0;

    .line 58
    .line 59
    iget-object v7, v7, La/k5i0;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v7, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object v5, v6

    .line 69
    :goto_0
    check-cast v5, La/k5i0;

    .line 70
    .line 71
    if-eqz v5, :cond_a

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    move-object v5, v4

    .line 88
    check-cast v5, La/m5i0;

    .line 89
    .line 90
    iget v5, v5, La/m5i0;->a:I

    .line 91
    .line 92
    if-ne v5, p1, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-object v4, v6

    .line 96
    :goto_1
    check-cast v4, La/m5i0;

    .line 97
    .line 98
    const/4 v1, -0x1

    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_5

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v7, v5

    .line 116
    check-cast v7, La/m5i0;

    .line 117
    .line 118
    iget-object v7, v7, La/m5i0;->c:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v8, v4, La/m5i0;->c:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_4

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    move-object v5, v6

    .line 130
    :goto_2
    check-cast v5, La/m5i0;

    .line 131
    .line 132
    if-eqz v5, :cond_6

    .line 133
    .line 134
    iget v2, v5, La/m5i0;->a:I

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    move v2, v1

    .line 138
    :goto_3
    new-instance v4, Ljava/util/ArrayList;

    .line 139
    .line 140
    const/16 v5, 0xa

    .line 141
    .line 142
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_9

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, La/k5i0;

    .line 164
    .line 165
    iget-object v7, v5, La/k5i0;->b:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v8, v5, La/k5i0;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v7, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_7

    .line 174
    .line 175
    new-instance v5, La/k5i0;

    .line 176
    .line 177
    invoke-direct {v5, p1, v8}, La/k5i0;-><init>(ILjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_7
    if-eq v2, v1, :cond_8

    .line 182
    .line 183
    new-instance v5, La/k5i0;

    .line 184
    .line 185
    invoke-direct {v5, v2, v8}, La/k5i0;-><init>(ILjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_5
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    iget-object p0, v0, La/eja0;->a:La/p7m0;

    .line 193
    .line 194
    invoke-virtual {p0, v6, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    iget-object p0, v0, La/eja0;->c:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 203
    .line 204
    .line 205
    :cond_a
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/kja0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qja0;->M(La/kja0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
