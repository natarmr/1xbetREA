.class public final La/j3v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/nc0;

.field public final synthetic n:J

.field public final synthetic o:I

.field public final synthetic p:B

.field public final synthetic q:Ljava/util/Date;


# direct methods
.method public constructor <init>(La/nc0;JIILjava/util/Date;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/j3v;->m:La/nc0;

    .line 2
    .line 3
    iput-wide p2, p0, La/j3v;->n:J

    .line 4
    .line 5
    iput p4, p0, La/j3v;->o:I

    .line 6
    .line 7
    iput-byte p5, p0, La/j3v;->p:B

    .line 8
    .line 9
    iput-object p6, p0, La/j3v;->q:Ljava/util/Date;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/j3v;

    .line 2
    .line 3
    iget-byte v5, p0, La/j3v;->p:B

    .line 4
    .line 5
    iget-object v6, p0, La/j3v;->q:Ljava/util/Date;

    .line 6
    .line 7
    iget-object v1, p0, La/j3v;->m:La/nc0;

    .line 8
    .line 9
    iget-wide v2, p0, La/j3v;->n:J

    .line 10
    .line 11
    iget v4, p0, La/j3v;->o:I

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, La/j3v;-><init>(La/nc0;JIILjava/util/Date;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/j3v;->l:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/j3v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j3v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/j3v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/j3v;->l:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v7, v0

    .line 4
    check-cast v7, La/kmq;

    .line 5
    .line 6
    sget-object v8, La/wne;->a:La/wne;

    .line 7
    .line 8
    iget-byte v0, p0, La/j3v;->k:B

    .line 9
    .line 10
    iget-object v9, p0, La/j3v;->m:La/nc0;

    .line 11
    .line 12
    const/4 v10, 0x3

    .line 13
    const/4 v11, 0x2

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v12, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    if-eq v0, v11, :cond_1

    .line 21
    .line 22
    if-ne v0, v10, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v12

    .line 35
    :cond_1
    iget-object v0, p0, La/j3v;->j:La/kmq;

    .line 36
    .line 37
    iget-object v1, p0, La/j3v;->i:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, La/j3v;->i:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, v0

    .line 47
    check-cast v7, La/kmq;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v0, p1

    .line 53
    check-cast v0, La/j0g0;

    .line 54
    .line 55
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v9, La/nc0;->l:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La/svu;

    .line 64
    .line 65
    iput-object v12, p0, La/j3v;->l:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v7, p0, La/j3v;->i:Ljava/lang/Object;

    .line 68
    .line 69
    iput-byte v1, p0, La/j3v;->k:B

    .line 70
    .line 71
    iget v1, p0, La/j3v;->o:I

    .line 72
    .line 73
    iget-byte v2, p0, La/j3v;->p:B

    .line 74
    .line 75
    iget-wide v3, p0, La/j3v;->n:J

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    move-object v5, p0

    .line 79
    invoke-virtual/range {v0 .. v6}, La/svu;->m(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v8, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 87
    .line 88
    instance-of v1, v0, La/g0g0;

    .line 89
    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    :try_start_0
    check-cast v0, La/vdg;

    .line 93
    .line 94
    iget-object v0, v0, La/vdg;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 99
    .line 100
    new-instance v1, La/g0g0;

    .line 101
    .line 102
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    move-object v0, v1

    .line 106
    :cond_5
    :goto_1
    move-object v1, v0

    .line 107
    nop

    .line 108
    instance-of v0, v1, La/g0g0;

    .line 109
    .line 110
    if-nez v0, :cond_7

    .line 111
    .line 112
    move-object v0, v1

    .line 113
    check-cast v0, Ljava/util/List;

    .line 114
    .line 115
    iget-object v2, p0, La/j3v;->q:Ljava/util/Date;

    .line 116
    .line 117
    if-nez v2, :cond_7

    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Ljava/util/Date;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    iget-object v2, v9, La/nc0;->m:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/pmi0;

    .line 130
    .line 131
    iput-object v12, p0, La/j3v;->l:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v1, p0, La/j3v;->i:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v7, p0, La/j3v;->j:La/kmq;

    .line 136
    .line 137
    iput-byte v11, p0, La/j3v;->k:B

    .line 138
    .line 139
    iget-object v2, v2, La/pmi0;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, La/epi0;

    .line 142
    .line 143
    iget-object v2, v2, La/epi0;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, La/eat0;

    .line 146
    .line 147
    iget-object v2, v2, La/eat0;->a:La/p7m0;

    .line 148
    .line 149
    invoke-virtual {v2, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    sget-object v2, La/wne;->a:La/wne;

    .line 155
    .line 156
    if-ne v0, v8, :cond_6

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    move-object v0, v7

    .line 160
    :goto_2
    move-object v7, v0

    .line 161
    :cond_7
    new-instance v0, La/j0g0;

    .line 162
    .line 163
    invoke-direct {v0, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iput-object v12, p0, La/j3v;->l:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v12, p0, La/j3v;->i:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v12, p0, La/j3v;->j:La/kmq;

    .line 171
    .line 172
    iput-byte v10, p0, La/j3v;->k:B

    .line 173
    .line 174
    invoke-interface {v7, v0, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v8, :cond_8

    .line 179
    .line 180
    :goto_3
    return-object v8

    .line 181
    :cond_8
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0
.end method
