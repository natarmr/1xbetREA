.class public final La/e26;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:B

.field public final synthetic j:La/yjo;

.field public final synthetic k:La/hie0;

.field public final synthetic l:La/tdg0;

.field public final synthetic m:La/spg0;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public p:La/qpg0;


# direct methods
.method public constructor <init>(La/yjo;La/hie0;La/yje;La/tdg0;La/spg0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/e26;->j:La/yjo;

    .line 2
    .line 3
    iput-object p2, p0, La/e26;->k:La/hie0;

    .line 4
    .line 5
    iput-object p4, p0, La/e26;->l:La/tdg0;

    .line 6
    .line 7
    iput-object p5, p0, La/e26;->m:La/spg0;

    .line 8
    .line 9
    iput-object p6, p0, La/e26;->n:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p7, p0, La/e26;->o:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/e26;

    .line 2
    .line 3
    iget-object v6, p0, La/e26;->n:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v7, p0, La/e26;->o:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/e26;->j:La/yjo;

    .line 8
    .line 9
    iget-object v2, p0, La/e26;->k:La/hie0;

    .line 10
    .line 11
    iget-object v4, p0, La/e26;->l:La/tdg0;

    .line 12
    .line 13
    iget-object v5, p0, La/e26;->m:La/spg0;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    invoke-direct/range {v0 .. v7}, La/e26;-><init>(La/yjo;La/hie0;La/yje;La/tdg0;La/spg0;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/e26;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e26;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/e26;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/e26;->j:La/yjo;

    .line 2
    .line 3
    iget-object v0, v0, La/yjo;->b:La/fhj;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/e26;->i:B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    iget-object v5, p0, La/e26;->k:La/hie0;

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    iget-object v7, p0, La/e26;->l:La/tdg0;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    if-eq v2, v8, :cond_1

    .line 20
    .line 21
    if-ne v2, v6, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, La/e26;->p:La/qpg0;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_4

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    iget-object v1, p0, La/e26;->p:La/qpg0;

    .line 39
    .line 40
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    :try_start_2
    invoke-virtual {v0}, La/fhj;->z()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_2
    move-exception p1

    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    :cond_3
    :goto_0
    :try_start_3
    iput-boolean v8, v5, La/hie0;->a:Z

    .line 59
    .line 60
    iget-boolean p1, v7, La/tdg0;->b:Z

    .line 61
    .line 62
    if-nez p1, :cond_9

    .line 63
    .line 64
    iget-object p1, p0, La/e26;->m:La/spg0;

    .line 65
    .line 66
    iget-object v2, p0, La/e26;->n:Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {p1, v2}, La/spg0;->a(Ljava/lang/String;)La/qpg0;

    .line 69
    .line 70
    .line 71
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 72
    :try_start_4
    iget-boolean v2, v7, La/tdg0;->a:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 73
    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    :try_start_5
    iput-boolean v8, v7, La/tdg0;->b:Z

    .line 77
    .line 78
    iput-object p1, p0, La/e26;->p:La/qpg0;

    .line 79
    .line 80
    iput-byte v8, p0, La/e26;->i:B

    .line 81
    .line 82
    invoke-virtual {v7, p1, p0}, La/tdg0;->d(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 86
    if-ne v2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v1, p1

    .line 90
    :goto_1
    :try_start_6
    iput-boolean v4, v7, La/tdg0;->b:Z

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :catchall_3
    move-exception v1

    .line 94
    move-object v9, v1

    .line 95
    move-object v1, p1

    .line 96
    move-object p1, v9

    .line 97
    :goto_2
    iput-boolean v4, v7, La/tdg0;->b:Z

    .line 98
    .line 99
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 100
    :cond_5
    :try_start_7
    iput-object p1, p0, La/e26;->p:La/qpg0;

    .line 101
    .line 102
    iput-byte v6, p0, La/e26;->i:B

    .line 103
    .line 104
    invoke-virtual {v7, p1, p0}, La/tdg0;->b(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 108
    if-ne v2, v1, :cond_6

    .line 109
    .line 110
    :goto_3
    return-object v1

    .line 111
    :cond_6
    move-object v1, p1

    .line 112
    :goto_4
    if-eqz v0, :cond_8

    .line 113
    .line 114
    :try_start_8
    iget-object p1, v0, La/fhj;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Ljava/nio/channels/FileChannel;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 117
    .line 118
    if-nez p1, :cond_7

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    :try_start_9
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 122
    .line 123
    .line 124
    :try_start_a
    iput-object v3, v0, La/fhj;->b:Ljava/lang/Object;

    .line 125
    .line 126
    return-object v1

    .line 127
    :catchall_4
    move-exception p1

    .line 128
    iput-object v3, v0, La/fhj;->b:Ljava/lang/Object;

    .line 129
    .line 130
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 131
    :cond_8
    :goto_5
    return-object v1

    .line 132
    :catchall_5
    move-exception v1

    .line 133
    move-object v9, v1

    .line 134
    move-object v1, p1

    .line 135
    move-object p1, v9

    .line 136
    :goto_6
    :try_start_b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :catchall_6
    move-exception p1

    .line 141
    goto :goto_7

    .line 142
    :cond_9
    const-string p1, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    .line 143
    .line 144
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 150
    :goto_7
    if-eqz v0, :cond_b

    .line 151
    .line 152
    :try_start_c
    iget-object v1, v0, La/fhj;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Ljava/nio/channels/FileChannel;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 155
    .line 156
    if-nez v1, :cond_a

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_a
    :try_start_d
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 160
    .line 161
    .line 162
    :try_start_e
    iput-object v3, v0, La/fhj;->b:Ljava/lang/Object;

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :catchall_7
    move-exception p1

    .line 166
    iput-object v3, v0, La/fhj;->b:Ljava/lang/Object;

    .line 167
    .line 168
    throw p1

    .line 169
    :cond_b
    :goto_8
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 170
    :goto_9
    iget-boolean v0, v5, La/hie0;->a:Z

    .line 171
    .line 172
    if-nez v0, :cond_c

    .line 173
    .line 174
    const-string v0, "Unable to open database \'"

    .line 175
    .line 176
    const-string v1, "\'. Was a proper path / name used in Room\'s database builder?"

    .line 177
    .line 178
    iget-object p0, p0, La/e26;->o:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v0, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0, p1}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :cond_c
    throw p1
.end method
