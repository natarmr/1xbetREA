.class public final La/q3v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/p7m0;La/nc0;JIILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/q3v;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/q3v;->b:La/gmq;

    .line 8
    .line 9
    iput-object p2, p0, La/q3v;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p3, p0, La/q3v;->c:J

    .line 12
    .line 13
    iput p5, p0, La/q3v;->d:I

    .line 14
    .line 15
    iput-byte p6, p0, La/q3v;->e:B

    .line 16
    .line 17
    iput-object p7, p0, La/q3v;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/p7m0;Ljava/util/Date;La/y3v;JII)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/q3v;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, La/q3v;->b:La/gmq;

    iput-object p2, p0, La/q3v;->f:Ljava/lang/Object;

    iput-object p3, p0, La/q3v;->g:Ljava/lang/Object;

    iput-wide p4, p0, La/q3v;->c:J

    iput p6, p0, La/q3v;->d:I

    iput-byte p7, p0, La/q3v;->e:B

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/q3v;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/q3v;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/q3v;->b:La/gmq;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v2, v1, La/v3v;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/v3v;

    .line 26
    .line 27
    iget v9, v2, La/v3v;->j:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v2, La/v3v;->j:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/v3v;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/v3v;-><init>(La/q3v;La/yje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v2, La/v3v;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v7, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v9, v2, La/v3v;->j:I

    .line 47
    .line 48
    if-eqz v9, :cond_2

    .line 49
    .line 50
    if-ne v9, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v10, La/p3v;

    .line 64
    .line 65
    move-object v12, v3

    .line 66
    check-cast v12, Ljava/util/Date;

    .line 67
    .line 68
    iget-object v1, v0, La/q3v;->g:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v13, v1

    .line 71
    check-cast v13, La/y3v;

    .line 72
    .line 73
    iget v1, v0, La/q3v;->d:I

    .line 74
    .line 75
    iget-byte v3, v0, La/q3v;->e:B

    .line 76
    .line 77
    iget-wide v14, v0, La/q3v;->c:J

    .line 78
    .line 79
    move-object/from16 v11, p1

    .line 80
    .line 81
    move/from16 v16, v1

    .line 82
    .line 83
    move/from16 v17, v3

    .line 84
    .line 85
    invoke-direct/range {v10 .. v17}, La/p3v;-><init>(La/kmq;Ljava/util/Date;La/y3v;JII)V

    .line 86
    .line 87
    .line 88
    iput v8, v2, La/v3v;->j:I

    .line 89
    .line 90
    invoke-interface {v4, v10, v2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v7, :cond_3

    .line 95
    .line 96
    move-object v5, v7

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_2
    return-object v5

    .line 101
    :pswitch_0
    instance-of v2, v1, La/n3v;

    .line 102
    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    check-cast v2, La/n3v;

    .line 107
    .line 108
    iget v9, v2, La/n3v;->j:I

    .line 109
    .line 110
    and-int v10, v9, v7

    .line 111
    .line 112
    if-eqz v10, :cond_4

    .line 113
    .line 114
    sub-int/2addr v9, v7

    .line 115
    iput v9, v2, La/n3v;->j:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    new-instance v2, La/n3v;

    .line 119
    .line 120
    invoke-direct {v2, v0, v1}, La/n3v;-><init>(La/q3v;La/yje;)V

    .line 121
    .line 122
    .line 123
    :goto_3
    iget-object v1, v2, La/n3v;->i:Ljava/lang/Object;

    .line 124
    .line 125
    sget-object v7, La/wne;->a:La/wne;

    .line 126
    .line 127
    iget v9, v2, La/n3v;->j:I

    .line 128
    .line 129
    if-eqz v9, :cond_6

    .line 130
    .line 131
    if-ne v9, v8, :cond_5

    .line 132
    .line 133
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v9, La/p3v;

    .line 145
    .line 146
    move-object v11, v3

    .line 147
    check-cast v11, La/nc0;

    .line 148
    .line 149
    iget-byte v15, v0, La/q3v;->e:B

    .line 150
    .line 151
    iget-object v1, v0, La/q3v;->g:Ljava/lang/Object;

    .line 152
    .line 153
    iget-wide v12, v0, La/q3v;->c:J

    .line 154
    .line 155
    iget v14, v0, La/q3v;->d:I

    .line 156
    .line 157
    move-object/from16 v10, p1

    .line 158
    .line 159
    move-object/from16 v16, v1

    .line 160
    .line 161
    invoke-direct/range {v9 .. v16}, La/p3v;-><init>(La/kmq;La/nc0;JIILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput v8, v2, La/n3v;->j:I

    .line 165
    .line 166
    invoke-interface {v4, v9, v2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-ne v0, v7, :cond_7

    .line 171
    .line 172
    move-object v5, v7

    .line 173
    goto :goto_5

    .line 174
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    :goto_5
    return-object v5

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
