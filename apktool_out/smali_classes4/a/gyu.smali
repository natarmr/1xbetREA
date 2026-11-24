.class public final La/gyu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/xzp;

.field public final synthetic m:La/sip;

.field public final synthetic n:J

.field public final synthetic o:J


# direct methods
.method public constructor <init>(La/yje;La/xzp;La/sip;JJ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/gyu;->l:La/xzp;

    .line 2
    .line 3
    iput-object p3, p0, La/gyu;->m:La/sip;

    .line 4
    .line 5
    iput-wide p4, p0, La/gyu;->n:J

    .line 6
    .line 7
    iput-wide p6, p0, La/gyu;->o:J

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/gyu;

    .line 7
    .line 8
    iget-wide v4, p0, La/gyu;->n:J

    .line 9
    .line 10
    iget-wide v6, p0, La/gyu;->o:J

    .line 11
    .line 12
    iget-object v2, p0, La/gyu;->l:La/xzp;

    .line 13
    .line 14
    iget-object v3, p0, La/gyu;->m:La/sip;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, La/gyu;-><init>(La/yje;La/xzp;La/sip;JJ)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/gyu;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/gyu;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/gyu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/gyu;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/gyu;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/gyu;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/c3c0;

    .line 32
    .line 33
    iget-object v6, v0, La/gyu;->l:La/xzp;

    .line 34
    .line 35
    iget-object v6, v6, La/xzp;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v6, La/u8u;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v7, v6, La/u8u;->b:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v9, v7

    .line 45
    check-cast v9, La/ouu;

    .line 46
    .line 47
    iget-object v6, v6, La/u8u;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, La/uzc;

    .line 50
    .line 51
    invoke-virtual {v6}, La/uzc;->b()La/jvn;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object v7, v9, La/ouu;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, La/knf0;

    .line 58
    .line 59
    invoke-virtual {v7}, La/knf0;->d()La/lnf0;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    new-instance v8, La/jo20;

    .line 64
    .line 65
    invoke-direct {v8}, La/jo20;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v8, v6}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 69
    .line 70
    .line 71
    iget v6, v5, La/c3c0;->a:I

    .line 72
    .line 73
    invoke-static {v6, v8}, La/qbt;->c(ILjava/util/Map;)V

    .line 74
    .line 75
    .line 76
    iget v6, v7, La/lnf0;->b:I

    .line 77
    .line 78
    invoke-static {v6, v8}, La/qbt;->g(ILjava/util/Map;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v8}, La/qbt;->h(Ljava/util/Map;)V

    .line 82
    .line 83
    .line 84
    iget-object v6, v7, La/lnf0;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v6, v8}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    iget-wide v6, v0, La/gyu;->o:J

    .line 90
    .line 91
    invoke-static {v8, v6, v7}, La/qbt;->k(La/jo20;J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v8}, La/qbt;->l(Ljava/util/Map;)V

    .line 95
    .line 96
    .line 97
    iget-wide v6, v0, La/gyu;->n:J

    .line 98
    .line 99
    invoke-static {v6, v7, v8}, La/qbt;->n(JLjava/util/Map;)V

    .line 100
    .line 101
    .line 102
    iget-boolean v6, v5, La/c3c0;->b:Z

    .line 103
    .line 104
    iget-wide v10, v5, La/c3c0;->c:J

    .line 105
    .line 106
    invoke-static {v8, v6, v10, v11}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 107
    .line 108
    .line 109
    invoke-static {v8}, La/qbt;->p(Ljava/util/Map;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8}, La/jo20;->b()La/jo20;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget-object v5, v9, La/ouu;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, La/cyu;

    .line 119
    .line 120
    iget-object v10, v0, La/gyu;->m:La/sip;

    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_3

    .line 127
    .line 128
    if-ne v6, v4, :cond_2

    .line 129
    .line 130
    iget-object v3, v5, La/cyu;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, La/or30;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 136
    .line 137
    .line 138
    return-object v3

    .line 139
    :cond_3
    iget-object v3, v5, La/cyu;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, La/or30;

    .line 142
    .line 143
    :goto_0
    invoke-static {v10}, La/kpb;->v(La/sip;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    new-instance v16, La/xg0;

    .line 148
    .line 149
    const/16 v13, 0x14

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    move-object/from16 v8, v16

    .line 153
    .line 154
    invoke-direct/range {v8 .. v13}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 155
    .line 156
    .line 157
    move-object v7, v12

    .line 158
    const/16 v17, 0xfc

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    move-object v12, v3

    .line 162
    move-wide v13, v5

    .line 163
    invoke-static/range {v12 .. v17}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iput-object v7, v0, La/gyu;->j:La/kmq;

    .line 168
    .line 169
    iput-object v7, v0, La/gyu;->k:Ljava/lang/Object;

    .line 170
    .line 171
    iput-boolean v4, v0, La/gyu;->i:Z

    .line 172
    .line 173
    invoke-static {v2, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v1, :cond_4

    .line 178
    .line 179
    return-object v1

    .line 180
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0
.end method
