.class public final La/wgt0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xgt0;


# direct methods
.method public synthetic constructor <init>(La/xgt0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wgt0;->i:B

    iput-object p1, p0, La/wgt0;->k:La/xgt0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wgt0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wgt0;->k:La/xgt0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wgt0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wgt0;-><init>(La/xgt0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/wgt0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/wgt0;-><init>(La/xgt0;La/yje;B)V

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
    iput-boolean p0, v0, La/wgt0;->j:Z

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
    iget-byte v0, p0, La/wgt0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wgt0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wgt0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wgt0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/wgt0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/wgt0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/wgt0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/wgt0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/wgt0;->k:La/xgt0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/wgt0;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v3, La/xgt0;->q:La/xsu;

    .line 33
    .line 34
    iget-object v4, v3, La/xgt0;->p:Ljava/lang/String;

    .line 35
    .line 36
    iput-boolean v2, p0, La/wgt0;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, v4, p0}, La/xsu;->b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    move-object v0, p1

    .line 46
    check-cast v0, Ljava/util/List;

    .line 47
    .line 48
    sget p0, La/xgt0;->w:I

    .line 49
    .line 50
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 51
    .line 52
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 53
    .line 54
    :cond_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-object p1, p0

    .line 62
    check-cast p1, La/sgt0;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance p1, La/sgt0;

    .line 68
    .line 69
    invoke-direct {p1, v0, v1, v1}, La/sgt0;-><init>(Ljava/util/List;ZZ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_1
    return-object v0

    .line 81
    :pswitch_0
    iget-boolean p0, p0, La/wgt0;->j:Z

    .line 82
    .line 83
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    if-nez p0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, La/sgt0;

    .line 95
    .line 96
    iget-boolean p1, p1, La/sgt0;->a:Z

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    move p1, v2

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move p1, v1

    .line 103
    :goto_2
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/sgt0;

    .line 110
    .line 111
    iget-boolean p0, p0, La/sgt0;->b:Z

    .line 112
    .line 113
    if-eqz p0, :cond_5

    .line 114
    .line 115
    move v1, v2

    .line 116
    :cond_5
    if-nez p1, :cond_6

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    :cond_6
    sget p0, La/xgt0;->w:I

    .line 121
    .line 122
    invoke-virtual {v3}, La/xgt0;->M()V

    .line 123
    .line 124
    .line 125
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
