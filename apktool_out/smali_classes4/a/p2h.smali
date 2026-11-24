.class public final La/p2h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:J

.field public synthetic n:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/yje;La/dgu;ILjava/util/List;J)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/p2h;->i:B

    .line 19
    iput-object p2, p0, La/p2h;->p:Ljava/lang/Object;

    iput p3, p0, La/p2h;->k:I

    iput-object p4, p0, La/p2h;->l:Ljava/util/List;

    iput-wide p5, p0, La/p2h;->m:J

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;IJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/p2h;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/p2h;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/p2h;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/p2h;->l:Ljava/util/List;

    .line 9
    .line 10
    iput p4, p0, La/p2h;->k:I

    .line 11
    .line 12
    iput-wide p5, p0, La/p2h;->m:J

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/p2h;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/p2h;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/kmq;

    .line 9
    .line 10
    move-object v3, p3

    .line 11
    check-cast v3, La/yje;

    .line 12
    .line 13
    new-instance v2, La/p2h;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/dgu;

    .line 17
    .line 18
    iget-object v6, p0, La/p2h;->l:Ljava/util/List;

    .line 19
    .line 20
    iget-wide v7, p0, La/p2h;->m:J

    .line 21
    .line 22
    iget v5, p0, La/p2h;->k:I

    .line 23
    .line 24
    invoke-direct/range {v2 .. v8}, La/p2h;-><init>(La/yje;La/dgu;ILjava/util/List;J)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v2, La/p2h;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p2, v2, La/p2h;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {v2, p0}, La/p2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, La/hhq0;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    move-object v9, p3

    .line 47
    check-cast v9, La/yje;

    .line 48
    .line 49
    new-instance v2, La/p2h;

    .line 50
    .line 51
    iget-object p3, p0, La/p2h;->o:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v3, p3

    .line 54
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 55
    .line 56
    move-object v4, v1

    .line 57
    check-cast v4, La/sip;

    .line 58
    .line 59
    iget v6, p0, La/p2h;->k:I

    .line 60
    .line 61
    iget-wide v7, p0, La/p2h;->m:J

    .line 62
    .line 63
    iget-object v5, p0, La/p2h;->l:Ljava/util/List;

    .line 64
    .line 65
    invoke-direct/range {v2 .. v9}, La/p2h;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;IJLa/yje;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v2, La/p2h;->n:Ljava/lang/Object;

    .line 69
    .line 70
    iput-boolean p2, v2, La/p2h;->j:Z

    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    invoke-virtual {v2, p0}, La/p2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p2h;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/p2h;->p:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, La/dgu;

    .line 12
    .line 13
    sget-object v1, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v4, v0, La/p2h;->j:Z

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    if-ne v4, v2, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v4, v0, La/p2h;->n:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, La/kmq;

    .line 39
    .line 40
    iget-object v6, v0, La/p2h;->o:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v15, v6

    .line 43
    check-cast v15, La/c3c0;

    .line 44
    .line 45
    iget-object v6, v3, La/dgu;->a:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v8, v6

    .line 48
    check-cast v8, La/z220;

    .line 49
    .line 50
    iget-object v6, v3, La/dgu;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, La/uzc;

    .line 53
    .line 54
    invoke-virtual {v6}, La/uzc;->b()La/jvn;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const/16 v20, 0x0

    .line 59
    .line 60
    const/16 v21, 0x3e

    .line 61
    .line 62
    iget-object v6, v0, La/p2h;->l:Ljava/util/List;

    .line 63
    .line 64
    const-string v17, ","

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const/16 v19, 0x0

    .line 69
    .line 70
    move-object/from16 v16, v6

    .line 71
    .line 72
    invoke-static/range {v16 .. v21}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    iget-object v3, v3, La/dgu;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, La/gst0;

    .line 79
    .line 80
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v3, v8, La/z220;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, La/sjh;

    .line 90
    .line 91
    iget-object v3, v3, La/sjh;->a:La/or30;

    .line 92
    .line 93
    sget-object v6, La/sip;->c:La/sip;

    .line 94
    .line 95
    invoke-static {v6}, La/kpb;->v(La/sip;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v17

    .line 99
    new-instance v20, La/cc40;

    .line 100
    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    iget v10, v0, La/p2h;->k:I

    .line 104
    .line 105
    iget-wide v12, v0, La/p2h;->m:J

    .line 106
    .line 107
    move-object/from16 v7, v20

    .line 108
    .line 109
    invoke-direct/range {v7 .. v16}, La/cc40;-><init>(La/z220;La/jvn;ILjava/lang/String;JZLa/c3c0;La/yje;)V

    .line 110
    .line 111
    .line 112
    const/16 v21, 0xfc

    .line 113
    .line 114
    move-object/from16 v16, v3

    .line 115
    .line 116
    invoke-static/range {v16 .. v21}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iput-object v5, v0, La/p2h;->n:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v5, v0, La/p2h;->o:Ljava/lang/Object;

    .line 123
    .line 124
    iput-boolean v2, v0, La/p2h;->j:Z

    .line 125
    .line 126
    invoke-static {v4, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-ne v0, v1, :cond_2

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_1
    return-object v1

    .line 136
    :pswitch_0
    iget-object v1, v0, La/p2h;->n:Ljava/lang/Object;

    .line 137
    .line 138
    move-object v8, v1

    .line 139
    check-cast v8, La/hhq0;

    .line 140
    .line 141
    iget-boolean v1, v0, La/p2h;->j:Z

    .line 142
    .line 143
    sget-object v4, La/wne;->a:La/wne;

    .line 144
    .line 145
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    new-instance v4, La/kmb;

    .line 149
    .line 150
    iget-object v5, v0, La/p2h;->o:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 153
    .line 154
    move-object v6, v3

    .line 155
    check-cast v6, La/sip;

    .line 156
    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    sget-object v1, La/sip;->c:La/sip;

    .line 160
    .line 161
    if-ne v6, v1, :cond_3

    .line 162
    .line 163
    :goto_2
    move v9, v2

    .line 164
    goto :goto_3

    .line 165
    :cond_3
    const/4 v2, 0x0

    .line 166
    goto :goto_2

    .line 167
    :goto_3
    iget v10, v0, La/p2h;->k:I

    .line 168
    .line 169
    iget-wide v11, v0, La/p2h;->m:J

    .line 170
    .line 171
    iget-object v7, v0, La/p2h;->l:Ljava/util/List;

    .line 172
    .line 173
    invoke-direct/range {v4 .. v12}, La/kmb;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;La/hhq0;ZIJ)V

    .line 174
    .line 175
    .line 176
    return-object v4

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
