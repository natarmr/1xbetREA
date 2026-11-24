.class public final La/v82;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/qno0;


# direct methods
.method public synthetic constructor <init>(La/yje;La/qno0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v82;->i:B

    iput-object p2, p0, La/v82;->m:La/qno0;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v82;->i:B

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
    new-instance v0, La/v82;

    .line 11
    .line 12
    iget-object p0, p0, La/v82;->m:La/qno0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p3, p0, v1}, La/v82;-><init>(La/yje;La/qno0;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/v82;->k:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/v82;->l:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/v82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/v82;

    .line 30
    .line 31
    iget-object p0, p0, La/v82;->m:La/qno0;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p3, p0, v1}, La/v82;-><init>(La/yje;La/qno0;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/v82;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/v82;->l:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/v82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/v82;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/v82;->m:La/qno0;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/v82;->k:La/kmq;

    .line 13
    .line 14
    iget-object v5, p0, La/v82;->l:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/v82;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v5, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v1, p1}, La/qno0;->a(I)La/ebo0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p1, p1, La/ebo0;->a:La/p7m0;

    .line 46
    .line 47
    iput-object v4, p0, La/v82;->k:La/kmq;

    .line 48
    .line 49
    iput-object v4, p0, La/v82;->l:Ljava/lang/Object;

    .line 50
    .line 51
    iput-boolean v3, p0, La/v82;->j:Z

    .line 52
    .line 53
    invoke-static {v0, p1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v6, :cond_2

    .line 58
    .line 59
    move-object v4, v6

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_1
    return-object v4

    .line 64
    :pswitch_0
    iget-object v0, p0, La/v82;->k:La/kmq;

    .line 65
    .line 66
    iget-object v5, p0, La/v82;->l:Ljava/lang/Object;

    .line 67
    .line 68
    sget-object v6, La/wne;->a:La/wne;

    .line 69
    .line 70
    iget-boolean v7, p0, La/v82;->j:Z

    .line 71
    .line 72
    if-eqz v7, :cond_4

    .line 73
    .line 74
    if-ne v7, v3, :cond_3

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    check-cast v5, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {v1, p1}, La/qno0;->a(I)La/ebo0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, La/ebo0;->a:La/p7m0;

    .line 98
    .line 99
    iput-object v4, p0, La/v82;->k:La/kmq;

    .line 100
    .line 101
    iput-object v4, p0, La/v82;->l:Ljava/lang/Object;

    .line 102
    .line 103
    iput-boolean v3, p0, La/v82;->j:Z

    .line 104
    .line 105
    invoke-static {v0, p1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v6, :cond_5

    .line 110
    .line 111
    move-object v4, v6

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v4

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
