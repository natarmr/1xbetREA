.class public final La/dsd0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/esd0;


# direct methods
.method public synthetic constructor <init>(La/esd0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dsd0;->i:B

    iput-object p1, p0, La/dsd0;->k:La/esd0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/dsd0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/dsd0;->k:La/esd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/dsd0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/dsd0;-><init>(La/esd0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/dsd0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/dsd0;-><init>(La/esd0;La/yje;B)V

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
    iput-boolean p0, v0, La/dsd0;->j:Z

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
    iget-byte v0, p0, La/dsd0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/dsd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dsd0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dsd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/dsd0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/dsd0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/dsd0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/dsd0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/dsd0;->k:La/esd0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v3, p0, La/dsd0;->j:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v2, La/esd0;->t:La/b8u;

    .line 32
    .line 33
    iget-object v3, v2, La/esd0;->r:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean v1, p0, La/dsd0;->j:Z

    .line 36
    .line 37
    iget-object p1, p1, La/b8u;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/zn00;

    .line 40
    .line 41
    invoke-virtual {p1, v3, p0}, La/zn00;->I0(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    move-object v6, p1

    .line 49
    check-cast v6, La/zsd0;

    .line 50
    .line 51
    sget p0, La/esd0;->v:I

    .line 52
    .line 53
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 54
    .line 55
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 56
    .line 57
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-object v3, p0

    .line 65
    check-cast v3, La/yrd0;

    .line 66
    .line 67
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    const/16 v9, 0x8

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-static/range {v3 .. v9}, La/yrd0;->a(La/yrd0;ZZLa/zsd0;JI)La/yrd0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    :goto_1
    return-object v0

    .line 86
    :pswitch_0
    iget-boolean p0, p0, La/dsd0;->j:Z

    .line 87
    .line 88
    sget-object v0, La/wne;->a:La/wne;

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    if-nez p0, :cond_4

    .line 95
    .line 96
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/yrd0;

    .line 101
    .line 102
    iget-boolean v0, v0, La/yrd0;->a:Z

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    move v0, v1

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move v0, p1

    .line 109
    :goto_2
    if-eqz p0, :cond_5

    .line 110
    .line 111
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, La/yrd0;

    .line 116
    .line 117
    iget-boolean p0, p0, La/yrd0;->b:Z

    .line 118
    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    move v1, p1

    .line 123
    :goto_3
    if-nez v0, :cond_6

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    :cond_6
    sget p0, La/esd0;->v:I

    .line 128
    .line 129
    invoke-virtual {v2}, La/esd0;->M()V

    .line 130
    .line 131
    .line 132
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
