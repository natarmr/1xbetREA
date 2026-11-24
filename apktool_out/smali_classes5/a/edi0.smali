.class public final La/edi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/ldi0;

.field public m:La/kmq;

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/yje;La/ldi0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/edi0;->l:La/ldi0;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p3, La/yje;

    .line 4
    .line 5
    new-instance v0, La/edi0;

    .line 6
    .line 7
    iget-object p0, p0, La/edi0;->l:La/ldi0;

    .line 8
    .line 9
    invoke-direct {v0, p3, p0}, La/edi0;-><init>(La/yje;La/ldi0;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/edi0;->j:La/kmq;

    .line 13
    .line 14
    iput-object p2, v0, La/edi0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, La/edi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/edi0;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/edi0;->l:La/ldi0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v5

    .line 26
    :cond_1
    iget-object v1, p0, La/edi0;->n:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, p0, La/edi0;->m:La/kmq;

    .line 29
    .line 30
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, La/edi0;->j:La/kmq;

    .line 38
    .line 39
    iget-object v1, p0, La/edi0;->k:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v6

    .line 47
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v6, v2, La/ldi0;->q:La/rou;

    .line 52
    .line 53
    iput-object v5, p0, La/edi0;->j:La/kmq;

    .line 54
    .line 55
    iput-object v5, p0, La/edi0;->k:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object p1, p0, La/edi0;->m:La/kmq;

    .line 58
    .line 59
    iput-object v1, p0, La/edi0;->n:Ljava/lang/String;

    .line 60
    .line 61
    iput-byte v4, p0, La/edi0;->i:B

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-virtual {v6, v4, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-ne v4, v0, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object v8, v4

    .line 72
    move-object v4, p1

    .line 73
    move-object p1, v8

    .line 74
    :goto_0
    check-cast p1, La/m2c0;

    .line 75
    .line 76
    iget-object p1, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v6, La/zl60;

    .line 79
    .line 80
    invoke-direct {v6, v1, p1}, La/zl60;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v2, La/ldi0;->h:La/cyh;

    .line 84
    .line 85
    invoke-virtual {p1, v6}, La/cyh;->a(La/v0;)La/p5a;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v1, La/m430;

    .line 90
    .line 91
    const/16 v2, 0x1c

    .line 92
    .line 93
    invoke-direct {v1, p1, v6, v2}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iput-object v5, p0, La/edi0;->j:La/kmq;

    .line 97
    .line 98
    iput-object v5, p0, La/edi0;->k:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, p0, La/edi0;->m:La/kmq;

    .line 101
    .line 102
    iput-object v5, p0, La/edi0;->n:Ljava/lang/String;

    .line 103
    .line 104
    iput-byte v3, p0, La/edi0;->i:B

    .line 105
    .line 106
    invoke-static {v4, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v0, :cond_4

    .line 111
    .line 112
    :goto_1
    return-object v0

    .line 113
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method
