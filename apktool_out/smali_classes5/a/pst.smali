.class public final La/pst;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/uii;


# direct methods
.method public synthetic constructor <init>(La/yje;La/uii;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pst;->i:B

    iput-object p2, p0, La/pst;->m:La/uii;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pst;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/pst;

    .line 11
    .line 12
    iget-object p0, p0, La/pst;->m:La/uii;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p3, p0, v1}, La/pst;-><init>(La/yje;La/uii;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/pst;->k:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/pst;->l:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/pst;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/pst;

    .line 30
    .line 31
    iget-object p0, p0, La/pst;->m:La/uii;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p3, p0, v1}, La/pst;-><init>(La/yje;La/uii;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/pst;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/pst;->l:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/pst;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/pst;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pst;->m:La/uii;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/pst;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, La/pst;->k:La/kmq;

    .line 34
    .line 35
    iget-object v3, p0, La/pst;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    new-instance v1, La/eu4;

    .line 46
    .line 47
    sget-object v3, La/ll6;->a:La/ll6;

    .line 48
    .line 49
    invoke-direct {v1, v3, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object v2, v1, La/uii;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, La/lsn;

    .line 56
    .line 57
    iget-object v2, v2, La/lsn;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, La/bl6;

    .line 60
    .line 61
    iget-object v2, v2, La/bl6;->f:La/xi6;

    .line 62
    .line 63
    iget-object v2, v2, La/xi6;->a:La/p7m0;

    .line 64
    .line 65
    iget-object v3, v1, La/uii;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, La/rbu;

    .line 68
    .line 69
    invoke-virtual {v3}, La/rbu;->a()La/p7m0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    new-instance v6, La/wx4;

    .line 74
    .line 75
    const/16 v7, 0xe

    .line 76
    .line 77
    invoke-direct {v6, v1, v4, v7}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/p6d;

    .line 81
    .line 82
    invoke-direct {v1, v2, v3, v6, v5}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iput-object v4, p0, La/pst;->k:La/kmq;

    .line 86
    .line 87
    iput-object v4, p0, La/pst;->l:Ljava/lang/Object;

    .line 88
    .line 89
    iput-boolean v5, p0, La/pst;->j:Z

    .line 90
    .line 91
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v0, :cond_3

    .line 96
    .line 97
    move-object v4, v0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_2
    return-object v4

    .line 102
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget-boolean v6, p0, La/pst;->j:Z

    .line 105
    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    if-ne v6, v5, :cond_4

    .line 109
    .line 110
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, La/pst;->k:La/kmq;

    .line 122
    .line 123
    iget-object v3, p0, La/pst;->l:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_6

    .line 132
    .line 133
    new-instance v1, La/eu4;

    .line 134
    .line 135
    sget-object v3, La/nl6;->a:La/nl6;

    .line 136
    .line 137
    invoke-direct {v1, v3, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    iget-object v2, v1, La/uii;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, La/ocl;

    .line 144
    .line 145
    iget-object v2, v2, La/ocl;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, La/ik6;

    .line 148
    .line 149
    iget-object v2, v2, La/ik6;->a:La/hk6;

    .line 150
    .line 151
    iget-object v2, v2, La/hk6;->a:La/p7m0;

    .line 152
    .line 153
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    new-instance v3, La/pst;

    .line 158
    .line 159
    invoke-direct {v3, v4, v1, v5}, La/pst;-><init>(La/yje;La/uii;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :goto_3
    iput-object v4, p0, La/pst;->k:La/kmq;

    .line 167
    .line 168
    iput-object v4, p0, La/pst;->l:Ljava/lang/Object;

    .line 169
    .line 170
    iput-boolean v5, p0, La/pst;->j:Z

    .line 171
    .line 172
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v0, :cond_7

    .line 177
    .line 178
    move-object v4, v0

    .line 179
    goto :goto_5

    .line 180
    :cond_7
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_5
    return-object v4

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
