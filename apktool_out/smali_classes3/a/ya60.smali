.class public final La/ya60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:I

.field public k:Z

.field public l:Z

.field public m:J

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/tzi;

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Z

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/tzi;Ljava/util/List;ZLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ya60;->p:La/tzi;

    .line 2
    .line 3
    iput-object p2, p0, La/ya60;->q:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, La/ya60;->r:Z

    .line 6
    .line 7
    iput-object p4, p0, La/ya60;->s:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ya60;

    .line 2
    .line 3
    iget-boolean v3, p0, La/ya60;->r:Z

    .line 4
    .line 5
    iget-object v4, p0, La/ya60;->s:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/ya60;->p:La/tzi;

    .line 8
    .line 9
    iget-object v2, p0, La/ya60;->q:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/ya60;-><init>(La/tzi;Ljava/util/List;ZLjava/lang/String;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/ya60;->o:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/ya60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ya60;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ya60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/ya60;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v10, v0

    .line 4
    check-cast v10, La/kmq;

    .line 5
    .line 6
    sget-object v11, La/wne;->a:La/wne;

    .line 7
    .line 8
    iget-byte v0, p0, La/ya60;->n:B

    .line 9
    .line 10
    const/4 v12, 0x4

    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x2

    .line 13
    iget-object v3, p0, La/ya60;->p:La/tzi;

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    if-eq v0, v4, :cond_3

    .line 20
    .line 21
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    if-ne v0, v12, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v13

    .line 38
    :cond_1
    iget-wide v0, p0, La/ya60;->m:J

    .line 39
    .line 40
    iget-boolean v2, p0, La/ya60;->l:Z

    .line 41
    .line 42
    iget v3, p0, La/ya60;->j:I

    .line 43
    .line 44
    iget-object v4, p0, La/ya60;->i:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v10, v4

    .line 47
    check-cast v10, La/kmq;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-wide v4, v0

    .line 53
    move-object v0, p1

    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_2
    iget v0, p0, La/ya60;->j:I

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v2, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    iget-boolean v4, p0, La/ya60;->k:Z

    .line 64
    .line 65
    iget v0, p0, La/ya60;->j:I

    .line 66
    .line 67
    iget-object v5, p0, La/ya60;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, La/rtu;

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v6, p1

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v3, La/tzi;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/uzc;

    .line 82
    .line 83
    invoke-virtual {v0}, La/uzc;->b()La/jvn;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, La/jvn;->getId()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v5, v3, La/tzi;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, La/rtu;

    .line 94
    .line 95
    iget-object v6, v3, La/tzi;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, La/ieu;

    .line 98
    .line 99
    iput-object v10, p0, La/ya60;->o:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v5, p0, La/ya60;->i:Ljava/lang/Object;

    .line 102
    .line 103
    iput v0, p0, La/ya60;->j:I

    .line 104
    .line 105
    iput-boolean v4, p0, La/ya60;->k:Z

    .line 106
    .line 107
    iput-byte v4, p0, La/ya60;->n:B

    .line 108
    .line 109
    invoke-virtual {v6, p0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    if-ne v6, v11, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    :goto_0
    check-cast v6, La/elt;

    .line 117
    .line 118
    iget v6, v6, La/elt;->e:I

    .line 119
    .line 120
    iput-object v10, p0, La/ya60;->o:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v13, p0, La/ya60;->i:Ljava/lang/Object;

    .line 123
    .line 124
    iput v0, p0, La/ya60;->j:I

    .line 125
    .line 126
    iput-byte v2, p0, La/ya60;->n:B

    .line 127
    .line 128
    invoke-virtual {v5, v4, v6, p0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-ne v2, v11, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    :goto_1
    check-cast v2, La/c3c0;

    .line 136
    .line 137
    iget-boolean v4, v2, La/c3c0;->b:Z

    .line 138
    .line 139
    iget-wide v5, v2, La/c3c0;->c:J

    .line 140
    .line 141
    iget-object v2, v3, La/tzi;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, La/w8u;

    .line 144
    .line 145
    iput-object v13, p0, La/ya60;->o:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v10, p0, La/ya60;->i:Ljava/lang/Object;

    .line 148
    .line 149
    iput v0, p0, La/ya60;->j:I

    .line 150
    .line 151
    iput-boolean v4, p0, La/ya60;->l:Z

    .line 152
    .line 153
    iput-wide v5, p0, La/ya60;->m:J

    .line 154
    .line 155
    iput-byte v1, p0, La/ya60;->n:B

    .line 156
    .line 157
    iget-object v1, v2, La/w8u;->a:La/wdu;

    .line 158
    .line 159
    move v2, v4

    .line 160
    move-wide v4, v5

    .line 161
    sget-object v6, La/j8p;->b:La/j8p;

    .line 162
    .line 163
    move v3, v0

    .line 164
    move-object v0, v1

    .line 165
    iget-object v1, p0, La/ya60;->q:Ljava/util/List;

    .line 166
    .line 167
    iget-boolean v7, p0, La/ya60;->r:Z

    .line 168
    .line 169
    iget-object v8, p0, La/ya60;->s:Ljava/lang/String;

    .line 170
    .line 171
    move-object v9, p0

    .line 172
    invoke-virtual/range {v0 .. v9}, La/wdu;->j(Ljava/util/List;ZIJLa/j8p;ZLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v11, :cond_7

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    :goto_2
    iput-object v13, p0, La/ya60;->o:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v13, p0, La/ya60;->i:Ljava/lang/Object;

    .line 182
    .line 183
    iput v3, p0, La/ya60;->j:I

    .line 184
    .line 185
    iput-boolean v2, p0, La/ya60;->l:Z

    .line 186
    .line 187
    iput-wide v4, p0, La/ya60;->m:J

    .line 188
    .line 189
    iput-byte v12, p0, La/ya60;->n:B

    .line 190
    .line 191
    invoke-interface {v10, v0, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v11, :cond_8

    .line 196
    .line 197
    :goto_3
    return-object v11

    .line 198
    :cond_8
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0
.end method
