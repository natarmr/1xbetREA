.class public final La/jb60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/util/List;

.field public final synthetic l:La/pzu;

.field public final synthetic m:I

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(ILa/yje;La/pzu;Z)V
    .locals 0

    .line 1
    iput-object p3, p0, La/jb60;->l:La/pzu;

    .line 2
    .line 3
    iput p1, p0, La/jb60;->m:I

    .line 4
    .line 5
    iput-boolean p4, p0, La/jb60;->n:Z

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/jb60;

    .line 8
    .line 9
    iget v1, p0, La/jb60;->m:I

    .line 10
    .line 11
    iget-boolean v2, p0, La/jb60;->n:Z

    .line 12
    .line 13
    iget-object p0, p0, La/jb60;->l:La/pzu;

    .line 14
    .line 15
    invoke-direct {v0, v1, p3, p0, v2}, La/jb60;-><init>(ILa/yje;La/pzu;Z)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/jb60;->j:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/jb60;->k:Ljava/util/List;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/jb60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/jb60;->j:La/kmq;

    .line 4
    .line 5
    iget-object v4, v0, La/jb60;->k:Ljava/util/List;

    .line 6
    .line 7
    sget-object v8, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v2, v0, La/jb60;->i:B

    .line 10
    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v10, :cond_1

    .line 16
    .line 17
    if-ne v2, v9, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v6, 0x0

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    sget-object v2, La/iun;->a:La/iun;

    .line 43
    .line 44
    iput-object v6, v0, La/jb60;->j:La/kmq;

    .line 45
    .line 46
    iput-object v6, v0, La/jb60;->k:Ljava/util/List;

    .line 47
    .line 48
    iput-byte v10, v0, La/jb60;->i:B

    .line 49
    .line 50
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, v8, :cond_4

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_3
    iget-object v11, v0, La/jb60;->l:La/pzu;

    .line 59
    .line 60
    iget-object v2, v11, La/pzu;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, La/a7q;

    .line 63
    .line 64
    iget-object v2, v2, La/a7q;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, La/kki;

    .line 67
    .line 68
    iget-object v2, v2, La/kki;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, La/f8p;

    .line 71
    .line 72
    iget-object v2, v2, La/f8p;->b:La/ir30;

    .line 73
    .line 74
    invoke-virtual {v2}, La/ir30;->c()La/p6d;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-instance v3, La/fb60;

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    invoke-direct {v3, v11, v6, v12}, La/fb60;-><init>(La/pzu;La/yje;B)V

    .line 82
    .line 83
    .line 84
    new-instance v5, La/eb60;

    .line 85
    .line 86
    const/4 v7, 0x3

    .line 87
    invoke-direct {v5, v7, v6, v10}, La/eb60;-><init>(ILa/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v3, v5}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v13, La/i89;

    .line 95
    .line 96
    const/16 v14, 0x16

    .line 97
    .line 98
    invoke-direct {v13, v2, v14}, La/i89;-><init>(La/gmq;B)V

    .line 99
    .line 100
    .line 101
    new-instance v15, La/hie0;

    .line 102
    .line 103
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-boolean v2, v0, La/jb60;->n:Z

    .line 107
    .line 108
    iput-boolean v2, v15, La/hie0;->a:Z

    .line 109
    .line 110
    iget-object v2, v11, La/pzu;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, La/f4u;

    .line 113
    .line 114
    iget-object v2, v2, La/f4u;->b:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v3, v2

    .line 117
    check-cast v3, La/kki;

    .line 118
    .line 119
    new-instance v2, La/fs;

    .line 120
    .line 121
    const/4 v7, 0x5

    .line 122
    iget v5, v0, La/jb60;->m:I

    .line 123
    .line 124
    invoke-direct/range {v2 .. v7}, La/fs;-><init>(Ljava/lang/Object;Ljava/util/List;ILa/yje;B)V

    .line 125
    .line 126
    .line 127
    new-instance v3, La/vsg0;

    .line 128
    .line 129
    invoke-direct {v3, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    new-instance v2, La/qqu;

    .line 133
    .line 134
    const/16 v4, 0x10

    .line 135
    .line 136
    invoke-direct {v2, v3, v15, v4}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 137
    .line 138
    .line 139
    new-instance v3, La/lqu;

    .line 140
    .line 141
    const/16 v4, 0x11

    .line 142
    .line 143
    invoke-direct {v3, v15, v4}, La/lqu;-><init>(La/hie0;B)V

    .line 144
    .line 145
    .line 146
    new-instance v4, La/fb60;

    .line 147
    .line 148
    invoke-direct {v4, v11, v6, v10}, La/fb60;-><init>(La/pzu;La/yje;B)V

    .line 149
    .line 150
    .line 151
    new-instance v5, La/ib60;

    .line 152
    .line 153
    invoke-direct {v5, v11, v6, v12}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 154
    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const/16 v23, 0x28

    .line 159
    .line 160
    const-wide/16 v18, 0x3c

    .line 161
    .line 162
    move-object/from16 v16, v2

    .line 163
    .line 164
    move-object/from16 v17, v3

    .line 165
    .line 166
    move-object/from16 v20, v4

    .line 167
    .line 168
    move-object/from16 v21, v5

    .line 169
    .line 170
    invoke-static/range {v16 .. v23}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    new-instance v3, La/i89;

    .line 175
    .line 176
    invoke-direct {v3, v2, v14}, La/i89;-><init>(La/gmq;B)V

    .line 177
    .line 178
    .line 179
    new-array v2, v9, [La/gmq;

    .line 180
    .line 181
    aput-object v13, v2, v12

    .line 182
    .line 183
    aput-object v3, v2, v10

    .line 184
    .line 185
    invoke-static {v2}, La/aoq;->b([La/gmq;)La/ltb;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    iput-object v6, v0, La/jb60;->j:La/kmq;

    .line 190
    .line 191
    iput-object v6, v0, La/jb60;->k:Ljava/util/List;

    .line 192
    .line 193
    iput-byte v9, v0, La/jb60;->i:B

    .line 194
    .line 195
    invoke-static {v1, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-ne v0, v8, :cond_4

    .line 200
    .line 201
    :goto_1
    return-object v8

    .line 202
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0
.end method
