.class public final La/yjs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zjs0;


# direct methods
.method public synthetic constructor <init>(La/zjs0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yjs0;->i:B

    iput-object p1, p0, La/yjs0;->k:La/zjs0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yjs0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yjs0;->k:La/zjs0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yjs0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yjs0;-><init>(La/zjs0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/yjs0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/yjs0;-><init>(La/zjs0;La/yje;B)V

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
    iput-boolean p0, v0, La/yjs0;->j:Z

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
    iget-byte v0, p0, La/yjs0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yjs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yjs0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yjs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/yjs0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/yjs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/yjs0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/yjs0;->k:La/zjs0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/yjs0;->j:Z

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
    iget-object p1, v3, La/zjs0;->p:La/x4u;

    .line 33
    .line 34
    iget-object v4, v3, La/zjs0;->r:Ljava/lang/String;

    .line 35
    .line 36
    iput-boolean v2, p0, La/yjs0;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, v4, p0}, La/x4u;->b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

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
    sget p0, La/zjs0;->t:I

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
    check-cast p1, La/tjs0;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    new-instance v2, La/tjs0;

    .line 69
    .line 70
    invoke-direct {v2, v0, v1, v1, p1}, La/tjs0;-><init>(Ljava/util/List;ZZZ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    return-object v0

    .line 82
    :pswitch_0
    iget-boolean p0, p0, La/yjs0;->j:Z

    .line 83
    .line 84
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, La/tjs0;

    .line 96
    .line 97
    iget-boolean p1, p1, La/tjs0;->a:Z

    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    move p1, v2

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move p1, v1

    .line 104
    :goto_2
    if-eqz p0, :cond_6

    .line 105
    .line 106
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/tjs0;

    .line 111
    .line 112
    iget-boolean p0, p0, La/tjs0;->b:Z

    .line 113
    .line 114
    if-nez p0, :cond_5

    .line 115
    .line 116
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/tjs0;

    .line 121
    .line 122
    iget-boolean p0, p0, La/tjs0;->c:Z

    .line 123
    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    :cond_5
    move v1, v2

    .line 127
    :cond_6
    if-nez p1, :cond_7

    .line 128
    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    :cond_7
    sget p0, La/zjs0;->t:I

    .line 132
    .line 133
    invoke-virtual {v3}, La/zjs0;->M()V

    .line 134
    .line 135
    .line 136
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
