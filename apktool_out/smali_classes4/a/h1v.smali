.class public final La/h1v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cyu;JILa/lu0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/h1v;->i:B

    .line 17
    iput-object p1, p0, La/h1v;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/h1v;->k:J

    iput p4, p0, La/h1v;->l:I

    iput-object p5, p0, La/h1v;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/wdu;ILa/jvn;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/h1v;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/h1v;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/h1v;->l:I

    .line 7
    .line 8
    iput-object p3, p0, La/h1v;->n:Ljava/lang/Object;

    .line 9
    .line 10
    iput-wide p4, p0, La/h1v;->k:J

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte p1, p0, La/h1v;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/h1v;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/h1v;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/h1v;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, La/cyu;

    .line 14
    .line 15
    iget v6, p0, La/h1v;->l:I

    .line 16
    .line 17
    move-object v7, v0

    .line 18
    check-cast v7, La/lu0;

    .line 19
    .line 20
    iget-wide v4, p0, La/h1v;->k:J

    .line 21
    .line 22
    move-object v8, p2

    .line 23
    invoke-direct/range {v2 .. v8}, La/h1v;-><init>(La/cyu;JILa/lu0;La/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v8, p2

    .line 28
    new-instance v3, La/h1v;

    .line 29
    .line 30
    move-object v4, v1

    .line 31
    check-cast v4, La/wdu;

    .line 32
    .line 33
    move-object v6, v0

    .line 34
    check-cast v6, La/jvn;

    .line 35
    .line 36
    move-object v9, v8

    .line 37
    iget-wide v7, p0, La/h1v;->k:J

    .line 38
    .line 39
    iget v5, p0, La/h1v;->l:I

    .line 40
    .line 41
    invoke-direct/range {v3 .. v9}, La/h1v;-><init>(La/wdu;ILa/jvn;JLa/yje;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h1v;->i:B

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
    invoke-virtual {p0, p1, p2}, La/h1v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h1v;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/h1v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/h1v;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/h1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/h1v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/h1v;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/h1v;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
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
    iget-boolean v6, p0, La/h1v;->j:Z

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
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, La/cyu;

    .line 34
    .line 35
    iget-object p1, v2, La/cyu;->b:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    check-cast v6, La/dn0;

    .line 39
    .line 40
    move-object v10, v1

    .line 41
    check-cast v10, La/lu0;

    .line 42
    .line 43
    iput-boolean v5, p0, La/h1v;->j:Z

    .line 44
    .line 45
    iget-wide v7, p0, La/h1v;->k:J

    .line 46
    .line 47
    iget v9, p0, La/h1v;->l:I

    .line 48
    .line 49
    move-object v11, p0

    .line 50
    invoke-virtual/range {v6 .. v11}, La/dn0;->q(JILa/lu0;La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    :goto_1
    return-object v3

    .line 61
    :pswitch_0
    move-object v10, p0

    .line 62
    sget-object p0, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-boolean v0, v10, La/h1v;->j:Z

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v5, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object p1, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    check-cast v2, La/wdu;

    .line 83
    .line 84
    iget-object p1, v2, La/wdu;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, La/kvt;

    .line 87
    .line 88
    move-object v6, v1

    .line 89
    check-cast v6, La/jvn;

    .line 90
    .line 91
    sget-object v7, La/y9s;->a:La/y9s;

    .line 92
    .line 93
    iput-boolean v5, v10, La/h1v;->j:Z

    .line 94
    .line 95
    iget-object v4, p1, La/kvt;->a:La/w5z;

    .line 96
    .line 97
    iget v5, v10, La/h1v;->l:I

    .line 98
    .line 99
    iget-wide v8, v10, La/h1v;->k:J

    .line 100
    .line 101
    invoke-virtual/range {v4 .. v10}, La/w5z;->M(ILa/jvn;La/y9s;JLa/bnn0;)Ljava/io/Serializable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, p0, :cond_5

    .line 106
    .line 107
    move-object p1, p0

    .line 108
    :cond_5
    :goto_2
    return-object p1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
