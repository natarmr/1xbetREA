.class public final La/j5u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/gmq;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/utb;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/q5u;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/j5u;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/j5u;->c:La/gmq;

    .line 8
    .line 9
    iput-object p2, p0, La/j5u;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p3, p0, La/j5u;->b:J

    .line 12
    .line 13
    iput-object p5, p0, La/j5u;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/vsg0;La/sd60;La/sgs;J)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/j5u;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, La/j5u;->c:La/gmq;

    iput-object p2, p0, La/j5u;->d:Ljava/lang/Object;

    iput-object p3, p0, La/j5u;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/j5u;->b:J

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/j5u;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/j5u;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/j5u;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/j5u;->c:La/gmq;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    const/high16 v8, -0x80000000

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, La/pd60;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, La/pd60;

    .line 28
    .line 29
    iget v10, v2, La/pd60;->j:I

    .line 30
    .line 31
    and-int v11, v10, v8

    .line 32
    .line 33
    if-eqz v11, :cond_0

    .line 34
    .line 35
    sub-int/2addr v10, v8

    .line 36
    iput v10, v2, La/pd60;->j:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v2, La/pd60;

    .line 40
    .line 41
    invoke-direct {v2, v0, v1}, La/pd60;-><init>(La/j5u;La/yje;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object v1, v2, La/pd60;->i:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object v8, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget v10, v2, La/pd60;->j:I

    .line 49
    .line 50
    if-eqz v10, :cond_2

    .line 51
    .line 52
    if-ne v10, v9, :cond_1

    .line 53
    .line 54
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v5, La/vsg0;

    .line 66
    .line 67
    new-instance v10, La/i5u;

    .line 68
    .line 69
    move-object v12, v4

    .line 70
    check-cast v12, La/sd60;

    .line 71
    .line 72
    move-object v13, v3

    .line 73
    check-cast v13, La/sgs;

    .line 74
    .line 75
    iget-wide v14, v0, La/j5u;->b:J

    .line 76
    .line 77
    const/16 v16, 0x2

    .line 78
    .line 79
    move-object/from16 v11, p1

    .line 80
    .line 81
    invoke-direct/range {v10 .. v16}, La/i5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 82
    .line 83
    .line 84
    iput v9, v2, La/pd60;->j:I

    .line 85
    .line 86
    invoke-virtual {v5, v10, v2}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v8, :cond_3

    .line 91
    .line 92
    move-object v6, v8

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    :goto_1
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    :goto_2
    return-object v6

    .line 97
    :pswitch_0
    instance-of v2, v1, La/g5u;

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    move-object v2, v1

    .line 102
    check-cast v2, La/g5u;

    .line 103
    .line 104
    iget v10, v2, La/g5u;->j:I

    .line 105
    .line 106
    and-int v11, v10, v8

    .line 107
    .line 108
    if-eqz v11, :cond_4

    .line 109
    .line 110
    sub-int/2addr v10, v8

    .line 111
    iput v10, v2, La/g5u;->j:I

    .line 112
    .line 113
    :goto_3
    move-object v8, v2

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    new-instance v2, La/g5u;

    .line 116
    .line 117
    invoke-direct {v2, v0, v1}, La/g5u;-><init>(La/j5u;La/yje;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_4
    iget-object v1, v8, La/g5u;->i:Ljava/lang/Object;

    .line 122
    .line 123
    sget-object v10, La/wne;->a:La/wne;

    .line 124
    .line 125
    iget v2, v8, La/g5u;->j:I

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    if-ne v2, v9, :cond_5

    .line 130
    .line 131
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_5
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v6, v5

    .line 143
    check-cast v6, La/utb;

    .line 144
    .line 145
    new-instance v1, La/i5u;

    .line 146
    .line 147
    move-object v2, v4

    .line 148
    check-cast v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 149
    .line 150
    iget-wide v4, v0, La/j5u;->b:J

    .line 151
    .line 152
    check-cast v3, La/q5u;

    .line 153
    .line 154
    move-wide/from16 v17, v4

    .line 155
    .line 156
    move-object v5, v3

    .line 157
    move-wide/from16 v3, v17

    .line 158
    .line 159
    move-object v0, v1

    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    invoke-direct/range {v0 .. v5}, La/i5u;-><init>(La/kmq;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/q5u;)V

    .line 163
    .line 164
    .line 165
    iput v9, v8, La/g5u;->j:I

    .line 166
    .line 167
    invoke-virtual {v6, v0, v8}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-ne v0, v10, :cond_7

    .line 172
    .line 173
    move-object v6, v10

    .line 174
    goto :goto_6

    .line 175
    :cond_7
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    :goto_6
    return-object v6

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
