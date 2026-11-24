.class public final La/a4q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/d4q0;


# direct methods
.method public synthetic constructor <init>(La/d4q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a4q0;->i:B

    iput-object p1, p0, La/a4q0;->k:La/d4q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a4q0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a4q0;->k:La/d4q0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/a4q0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/a4q0;-><init>(La/d4q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/a4q0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/a4q0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/a4q0;-><init>(La/d4q0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/a4q0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a4q0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a4q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a4q0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a4q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/r3q0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/a4q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/a4q0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/a4q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a4q0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/a4q0;->k:La/d4q0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/a4q0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v7, v0

    .line 13
    check-cast v7, La/uaq0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v2, La/d4q0;->x:La/fhj;

    .line 21
    .line 22
    iget-object v4, v2, La/d4q0;->o:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v5, v2, La/d4q0;->p:J

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    invoke-virtual/range {v3 .. v9}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 29
    .line 30
    .line 31
    move-result-object v17

    .line 32
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 33
    .line 34
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-object v10, v0

    .line 44
    check-cast v10, La/s3q0;

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v18, 0x3f

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    const/4 v15, 0x0

    .line 55
    invoke-static/range {v10 .. v18}, La/s3q0;->a(La/s3q0;ZZZILjava/util/List;La/zdm0;La/nc5;I)La/s3q0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 69
    .line 70
    iget-object v2, v2, La/i3t0;->i:La/ocj;

    .line 71
    .line 72
    iget-object v0, v0, La/a4q0;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/r3q0;

    .line 75
    .line 76
    sget-object v3, La/wne;->a:La/wne;

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    instance-of v3, v0, La/q3q0;

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    move-object v3, v0

    .line 88
    check-cast v3, La/q3q0;

    .line 89
    .line 90
    sget v0, La/d4q0;->A:I

    .line 91
    .line 92
    iget-object v4, v2, La/ocj;->a:La/p7m0;

    .line 93
    .line 94
    :cond_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object v5, v0

    .line 102
    check-cast v5, La/s3q0;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v10, v3, La/q3q0;->a:Ljava/util/List;

    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    const/16 v13, 0x69

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    invoke-static/range {v5 .. v13}, La/s3q0;->a(La/s3q0;ZZZILjava/util/List;La/zdm0;La/nc5;I)La/s3q0;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v4, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_2
    instance-of v0, v0, La/p3q0;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    sget v0, La/d4q0;->A:I

    .line 133
    .line 134
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 135
    .line 136
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object v2, v1

    .line 144
    check-cast v2, La/s3q0;

    .line 145
    .line 146
    const/4 v9, 0x0

    .line 147
    const/16 v10, 0x79

    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    const/4 v4, 0x0

    .line 151
    const/4 v5, 0x1

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    invoke-static/range {v2 .. v10}, La/s3q0;->a(La/s3q0;ZZZILjava/util/List;La/zdm0;La/nc5;I)La/s3q0;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_3

    .line 164
    .line 165
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 169
    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    :goto_1
    return-object v0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
