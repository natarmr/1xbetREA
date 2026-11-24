.class public final La/d7u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i89;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i89;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ZZB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/d7u;->a:B

    iput-object p1, p0, La/d7u;->b:La/i89;

    iput-object p2, p0, La/d7u;->g:Ljava/lang/Object;

    iput-object p3, p0, La/d7u;->c:Ljava/util/List;

    iput-object p4, p0, La/d7u;->d:Ljava/util/List;

    iput-boolean p5, p0, La/d7u;->e:Z

    iput-boolean p6, p0, La/d7u;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iget-byte v2, v0, La/d7u;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/d7u;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/d7u;->b:La/i89;

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
    instance-of v2, v1, La/agu;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/agu;

    .line 26
    .line 27
    iget v9, v2, La/agu;->j:I

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
    iput v9, v2, La/agu;->j:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/agu;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/agu;-><init>(La/d7u;La/yje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v2, La/agu;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v7, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v9, v2, La/agu;->j:I

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
    new-instance v10, La/b3g;

    .line 64
    .line 65
    move-object v12, v3

    .line 66
    check-cast v12, La/dgu;

    .line 67
    .line 68
    iget-boolean v1, v0, La/d7u;->f:Z

    .line 69
    .line 70
    const/16 v17, 0x2

    .line 71
    .line 72
    iget-object v13, v0, La/d7u;->c:Ljava/util/List;

    .line 73
    .line 74
    iget-object v14, v0, La/d7u;->d:Ljava/util/List;

    .line 75
    .line 76
    iget-boolean v15, v0, La/d7u;->e:Z

    .line 77
    .line 78
    move-object/from16 v11, p1

    .line 79
    .line 80
    move/from16 v16, v1

    .line 81
    .line 82
    invoke-direct/range {v10 .. v17}, La/b3g;-><init>(La/kmq;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ZZB)V

    .line 83
    .line 84
    .line 85
    iput v8, v2, La/agu;->j:I

    .line 86
    .line 87
    invoke-virtual {v4, v10, v2}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne v0, v7, :cond_3

    .line 92
    .line 93
    move-object v5, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_2
    return-object v5

    .line 98
    :pswitch_0
    instance-of v2, v1, La/b7u;

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    move-object v2, v1

    .line 103
    check-cast v2, La/b7u;

    .line 104
    .line 105
    iget v9, v2, La/b7u;->j:I

    .line 106
    .line 107
    and-int v10, v9, v7

    .line 108
    .line 109
    if-eqz v10, :cond_4

    .line 110
    .line 111
    sub-int/2addr v9, v7

    .line 112
    iput v9, v2, La/b7u;->j:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    new-instance v2, La/b7u;

    .line 116
    .line 117
    invoke-direct {v2, v0, v1}, La/b7u;-><init>(La/d7u;La/yje;)V

    .line 118
    .line 119
    .line 120
    :goto_3
    iget-object v1, v2, La/b7u;->i:Ljava/lang/Object;

    .line 121
    .line 122
    sget-object v7, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget v9, v2, La/b7u;->j:I

    .line 125
    .line 126
    if-eqz v9, :cond_6

    .line 127
    .line 128
    if-ne v9, v8, :cond_5

    .line 129
    .line 130
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    new-instance v9, La/b3g;

    .line 142
    .line 143
    move-object v11, v3

    .line 144
    check-cast v11, La/f7u;

    .line 145
    .line 146
    iget-boolean v15, v0, La/d7u;->f:Z

    .line 147
    .line 148
    const/16 v16, 0x1

    .line 149
    .line 150
    iget-object v12, v0, La/d7u;->c:Ljava/util/List;

    .line 151
    .line 152
    iget-object v13, v0, La/d7u;->d:Ljava/util/List;

    .line 153
    .line 154
    iget-boolean v14, v0, La/d7u;->e:Z

    .line 155
    .line 156
    move-object/from16 v10, p1

    .line 157
    .line 158
    invoke-direct/range {v9 .. v16}, La/b3g;-><init>(La/kmq;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ZZB)V

    .line 159
    .line 160
    .line 161
    iput v8, v2, La/b7u;->j:I

    .line 162
    .line 163
    invoke-virtual {v4, v9, v2}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v7, :cond_7

    .line 168
    .line 169
    move-object v5, v7

    .line 170
    goto :goto_5

    .line 171
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    :goto_5
    return-object v5

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
