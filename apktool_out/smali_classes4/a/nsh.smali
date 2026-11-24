.class public final La/nsh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/rsh;


# direct methods
.method public synthetic constructor <init>(La/rsh;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nsh;->i:B

    iput-object p1, p0, La/nsh;->k:La/rsh;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nsh;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nsh;->k:La/rsh;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/nsh;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/nsh;-><init>(La/rsh;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/nsh;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/nsh;-><init>(La/rsh;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/nsh;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nsh;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nsh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nsh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nsh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/nsh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/nsh;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/nsh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/nsh;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/nsh;->k:La/rsh;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v3, p0, La/nsh;->j:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v1, La/rsh;->c:La/hru;

    .line 33
    .line 34
    iget-object p1, p1, La/hru;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, La/udg;

    .line 37
    .line 38
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 39
    .line 40
    iget-object p1, p1, La/tcg;->c:La/a8z;

    .line 41
    .line 42
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/mz40;

    .line 47
    .line 48
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v5, La/aen;

    .line 53
    .line 54
    invoke-direct {v5, p1, v4}, La/aen;-><init>(La/vae0;B)V

    .line 55
    .line 56
    .line 57
    iget-object p1, v1, La/rsh;->m:La/p7m0;

    .line 58
    .line 59
    iget-object v3, v1, La/rsh;->n:La/p7m0;

    .line 60
    .line 61
    new-instance v6, La/t82;

    .line 62
    .line 63
    const/4 v7, 0x3

    .line 64
    invoke-direct {v6, v7, v2, v7}, La/t82;-><init>(ILa/yje;B)V

    .line 65
    .line 66
    .line 67
    move-object v7, v6

    .line 68
    new-instance v6, La/p6d;

    .line 69
    .line 70
    invoke-direct {v6, p1, v3, v7, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 71
    .line 72
    .line 73
    iget-object v7, v1, La/rsh;->o:La/p7m0;

    .line 74
    .line 75
    iget-object p1, v1, La/rsh;->i:La/gvt;

    .line 76
    .line 77
    iget-object p1, p1, La/gvt;->a:La/b2g;

    .line 78
    .line 79
    iget-object p1, p1, La/b2g;->a:La/ehf0;

    .line 80
    .line 81
    iget-object p1, p1, La/ehf0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, La/or30;

    .line 84
    .line 85
    iget-object p1, p1, La/or30;->a:La/p7m0;

    .line 86
    .line 87
    new-instance v3, La/h2c;

    .line 88
    .line 89
    const/16 v8, 0x10

    .line 90
    .line 91
    invoke-direct {v3, p1, v8}, La/h2c;-><init>(La/p7m0;B)V

    .line 92
    .line 93
    .line 94
    new-instance v8, La/i89;

    .line 95
    .line 96
    const/16 p1, 0x16

    .line 97
    .line 98
    invoke-direct {v8, v3, p1}, La/i89;-><init>(La/gmq;B)V

    .line 99
    .line 100
    .line 101
    new-instance p1, La/ex1;

    .line 102
    .line 103
    const/16 v3, 0x1c

    .line 104
    .line 105
    invoke-direct {p1, v1, v2, v3}, La/ex1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 106
    .line 107
    .line 108
    new-instance v9, La/vsg0;

    .line 109
    .line 110
    invoke-direct {v9, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    new-instance v10, La/psh;

    .line 114
    .line 115
    invoke-direct {v10, v1, v2}, La/psh;-><init>(La/rsh;La/yje;)V

    .line 116
    .line 117
    .line 118
    invoke-static/range {v5 .. v10}, La/dub;->d0(La/gmq;La/gmq;La/gmq;La/gmq;La/gmq;La/aer;)La/a1g;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-instance v3, La/wib;

    .line 123
    .line 124
    const/16 v5, 0x15

    .line 125
    .line 126
    invoke-direct {v3, v1, v2, v5}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    new-instance v1, La/fnq;

    .line 130
    .line 131
    invoke-direct {v1, p1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    iput-boolean v4, p0, La/nsh;->j:Z

    .line 135
    .line 136
    invoke-static {v1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-ne p0, v0, :cond_2

    .line 141
    .line 142
    move-object v2, v0

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    :goto_1
    return-object v2

    .line 147
    :pswitch_0
    iget-boolean p0, p0, La/nsh;->j:Z

    .line 148
    .line 149
    sget-object v0, La/wne;->a:La/wne;

    .line 150
    .line 151
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    if-eqz p0, :cond_3

    .line 155
    .line 156
    invoke-virtual {v1}, La/rsh;->w()V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    iget-object p0, v1, La/rsh;->q:La/esh;

    .line 161
    .line 162
    if-nez p0, :cond_4

    .line 163
    .line 164
    invoke-virtual {v1}, La/rsh;->x()V

    .line 165
    .line 166
    .line 167
    iget-object p0, v1, La/rsh;->r:La/bby;

    .line 168
    .line 169
    if-eqz p0, :cond_4

    .line 170
    .line 171
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 172
    .line 173
    .line 174
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
