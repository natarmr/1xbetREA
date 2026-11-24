.class public final La/lqe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lqe;->i:B

    iput p1, p0, La/lqe;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lqe;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/lqe;

    .line 7
    .line 8
    iget p0, p0, La/lqe;->k:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lqe;-><init>(ILa/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/lqe;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/lqe;

    .line 18
    .line 19
    iget p0, p0, La/lqe;->k:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/lqe;-><init>(ILa/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/lqe;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lqe;->i:B

    .line 2
    .line 3
    check-cast p1, La/qpg0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lqe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lqe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lqe;->i:B

    .line 4
    .line 5
    iget v2, v0, La/lqe;->k:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v0, v0, La/lqe;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/qpg0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "delete from last_action where id = (select id from last_action where type = ? order by date asc limit 1)"

    .line 21
    .line 22
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    int-to-long v4, v2

    .line 27
    :try_start_0
    invoke-interface {v1, v3, v4, v5}, La/xpg0;->o(IJ)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "select * from country where country.id == ?"

    .line 50
    .line 51
    invoke-interface {v0, v1}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    int-to-long v4, v2

    .line 56
    :try_start_1
    invoke-interface {v1, v3, v4, v5}, La/xpg0;->o(IJ)V

    .line 57
    .line 58
    .line 59
    const-string v0, "id"

    .line 60
    .line 61
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const-string v2, "country_name"

    .line 66
    .line 67
    invoke-static {v1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const-string v3, "country_phone_code"

    .line 72
    .line 73
    invoke-static {v1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const-string v4, "country_code"

    .line 78
    .line 79
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const-string v5, "country_currency_id"

    .line 84
    .line 85
    invoke-static {v1, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    const-string v6, "country_image"

    .line 90
    .line 91
    invoke-static {v1, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    const-string v7, "phone_mask_max_length"

    .line 96
    .line 97
    invoke-static {v1, v7}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    const-string v8, "phone_mask_min_length"

    .line 102
    .line 103
    invoke-static {v1, v8}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const-string v9, "phone_mask"

    .line 108
    .line 109
    invoke-static {v1, v9}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_0

    .line 118
    .line 119
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 120
    .line 121
    .line 122
    move-result-wide v10

    .line 123
    long-to-int v13, v10

    .line 124
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    long-to-int v15, v2

    .line 133
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v16

    .line 137
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v17

    .line 141
    invoke-interface {v1, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v19

    .line 145
    invoke-interface {v1, v7}, La/xpg0;->getLong(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    long-to-int v0, v2

    .line 150
    invoke-interface {v1, v8}, La/xpg0;->getLong(I)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    long-to-int v2, v2

    .line 155
    invoke-interface {v1, v9}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v22

    .line 159
    new-instance v12, La/oqe;

    .line 160
    .line 161
    move/from16 v20, v0

    .line 162
    .line 163
    move/from16 v21, v2

    .line 164
    .line 165
    invoke-direct/range {v12 .. v22}, La/oqe;-><init>(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;IILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    .line 167
    .line 168
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 169
    .line 170
    .line 171
    return-object v12

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    goto :goto_0

    .line 174
    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    const-string v2, "The query result was empty, but expected a single row to return a NON-NULL object of type \'org.xplatform.onexdatabase.entity.CountryEntity\'."

    .line 177
    .line 178
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    :goto_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
