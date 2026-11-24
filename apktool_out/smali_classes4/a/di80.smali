.class public final La/di80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/m91;

.field public final b:Ljava/lang/Object;

.field public final c:La/el80;

.field public final d:La/ehf0;

.field public final e:La/ehf0;

.field public final f:La/gmq;


# direct methods
.method public constructor <init>(La/m91;La/dfs0;La/el80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/di80;->a:La/m91;

    .line 5
    .line 6
    iput-object p2, p0, La/di80;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/di80;->c:La/el80;

    .line 9
    .line 10
    new-instance p1, La/ehf0;

    .line 11
    .line 12
    const/16 p2, 0x16

    .line 13
    .line 14
    invoke-direct {p1, p2}, La/ehf0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/di80;->d:La/ehf0;

    .line 18
    .line 19
    new-instance p1, La/ehf0;

    .line 20
    .line 21
    invoke-direct {p1, p2}, La/ehf0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/di80;->e:La/ehf0;

    .line 25
    .line 26
    new-instance p1, La/wk70;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p1, p0, p3, p2}, La/wk70;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/idx;->S(Lkotlin/jvm/functions/Function2;)La/gmq;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/di80;->f:La/gmq;

    .line 37
    .line 38
    return-void
.end method

.method public static b(La/di80;)V
    .locals 3

    .line 1
    sget-object v0, La/zh80;->b:La/zh80;

    .line 2
    .line 3
    iget-object p0, p0, La/di80;->d:La/ehf0;

    .line 4
    .line 5
    new-instance v1, La/yh80;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2, v0}, La/yh80;-><init>(ZLa/b5x;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, La/ehf0;->u(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/m06;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v1, p2, La/ci80;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    move-object v1, p2

    .line 6
    check-cast v1, La/ci80;

    .line 7
    .line 8
    iget v3, v1, La/ci80;->l:I

    .line 9
    .line 10
    const/high16 v4, -0x80000000

    .line 11
    .line 12
    and-int v5, v3, v4

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    sub-int/2addr v3, v4

    .line 17
    iput v3, v1, La/ci80;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, La/ci80;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2}, La/ci80;-><init>(La/di80;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v1, La/ci80;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v3, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v4, v1, La/ci80;->l:I

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x1

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    if-ne v4, v9, :cond_1

    .line 36
    .line 37
    iget-object v1, v1, La/ci80;->i:La/m06;

    .line 38
    .line 39
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v10, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v8

    .line 50
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/di80;->a:La/m91;

    .line 54
    .line 55
    iput-object p1, v1, La/ci80;->i:La/m06;

    .line 56
    .line 57
    iput v9, v1, La/ci80;->l:I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/m91;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v3, :cond_3

    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_3
    move-object v10, p1

    .line 67
    :goto_1
    move-object v11, v0

    .line 68
    check-cast v11, La/m06;

    .line 69
    .line 70
    if-eq v11, v10, :cond_a

    .line 71
    .line 72
    new-instance v0, La/cz60;

    .line 73
    .line 74
    const-class v3, La/di80;

    .line 75
    .line 76
    const-string v4, "invalidate"

    .line 77
    .line 78
    const-string v5, "invalidate()V"

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/16 v7, 0xc

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    move-object v2, p0

    .line 85
    invoke-direct/range {v0 .. v7}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v1, v11, La/m06;->a:La/o24;

    .line 92
    .line 93
    iget-boolean v2, v1, La/o24;->a:Z

    .line 94
    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    iget-object v1, v1, La/o24;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, La/r580;

    .line 100
    .line 101
    invoke-virtual {v1, v0}, La/r580;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    iget-object v2, v1, La/o24;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, La/s9m0;

    .line 108
    .line 109
    monitor-enter v2

    .line 110
    :try_start_0
    iget-boolean v4, v1, La/o24;->a:Z

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    iget-object v4, v1, La/o24;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 120
    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    :goto_2
    monitor-exit v2

    .line 124
    if-eqz v9, :cond_6

    .line 125
    .line 126
    iget-object v1, v1, La/o24;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, La/r580;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, La/r580;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_6
    :goto_3
    if-eqz v10, :cond_7

    .line 134
    .line 135
    new-instance v0, La/cz60;

    .line 136
    .line 137
    const-string v4, "invalidate"

    .line 138
    .line 139
    const-string v5, "invalidate()V"

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    const/16 v7, 0xd

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    move-object v2, p0

    .line 146
    invoke-direct/range {v0 .. v7}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v10, La/m06;->a:La/o24;

    .line 150
    .line 151
    iget-object v2, v1, La/o24;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, La/s9m0;

    .line 154
    .line 155
    monitor-enter v2

    .line 156
    :try_start_1
    iget-object v1, v1, La/o24;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    monitor-exit v2

    .line 164
    goto :goto_4

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    monitor-exit v2

    .line 167
    throw v0

    .line 168
    :cond_7
    :goto_4
    if-eqz v10, :cond_8

    .line 169
    .line 170
    invoke-virtual {v10}, La/m06;->c()V

    .line 171
    .line 172
    .line 173
    :cond_8
    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    const-string v0, "Paging"

    .line 178
    .line 179
    const/4 v1, 0x3

    .line 180
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v1, "Generated new PagingSource "

    .line 189
    .line 190
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v1, "Paging"

    .line 201
    .line 202
    invoke-static {v1, v0, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 203
    .line 204
    .line 205
    :cond_9
    return-object v11

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    monitor-exit v2

    .line 208
    throw v0

    .line 209
    :cond_a
    const-string v0, "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."

    .line 210
    .line 211
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v8
.end method
