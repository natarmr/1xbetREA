.class public final La/od60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/sd60;

.field public final synthetic m:La/zos;

.field public final synthetic n:Z

.field public o:La/kmq;


# direct methods
.method public constructor <init>(La/yje;La/sd60;La/zos;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/od60;->l:La/sd60;

    .line 2
    .line 3
    iput-object p3, p0, La/od60;->m:La/zos;

    .line 4
    .line 5
    iput-boolean p4, p0, La/od60;->n:Z

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p3, La/yje;

    .line 4
    .line 5
    new-instance v0, La/od60;

    .line 6
    .line 7
    iget-object v1, p0, La/od60;->m:La/zos;

    .line 8
    .line 9
    iget-boolean v2, p0, La/od60;->n:Z

    .line 10
    .line 11
    iget-object p0, p0, La/od60;->l:La/sd60;

    .line 12
    .line 13
    invoke-direct {v0, p3, p0, v1, v2}, La/od60;-><init>(La/yje;La/sd60;La/zos;Z)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/od60;->j:La/kmq;

    .line 17
    .line 18
    iput-object p2, v0, La/od60;->k:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/od60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/od60;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v4

    .line 24
    :cond_1
    iget-object v1, p0, La/od60;->o:La/kmq;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v10, p0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/od60;->j:La/kmq;

    .line 35
    .line 36
    iget-object p1, p0, La/od60;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/Long;

    .line 39
    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    sget-object p1, La/dun;->a:La/dun;

    .line 43
    .line 44
    move-object v10, p0

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    iput-object v4, p0, La/od60;->j:La/kmq;

    .line 51
    .line 52
    iput-object v4, p0, La/od60;->k:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v1, p0, La/od60;->o:La/kmq;

    .line 55
    .line 56
    iput-byte v3, p0, La/od60;->i:B

    .line 57
    .line 58
    iget-object v5, p0, La/od60;->l:La/sd60;

    .line 59
    .line 60
    iget-object v8, p0, La/od60;->m:La/zos;

    .line 61
    .line 62
    iget-boolean v9, p0, La/od60;->n:Z

    .line 63
    .line 64
    move-object v10, p0

    .line 65
    invoke-virtual/range {v5 .. v10}, La/sd60;->r(JLa/zos;ZLa/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast p1, La/gmq;

    .line 73
    .line 74
    new-instance p0, La/gsu;

    .line 75
    .line 76
    iget-object v3, v10, La/od60;->m:La/zos;

    .line 77
    .line 78
    invoke-direct {p0, v3, v4}, La/gsu;-><init>(La/zos;La/yje;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, La/a1g;

    .line 82
    .line 83
    const/16 v5, 0x14

    .line 84
    .line 85
    invoke-direct {v3, p1, p0, v5}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    move-object p1, v3

    .line 89
    :goto_1
    iput-object v4, v10, La/od60;->j:La/kmq;

    .line 90
    .line 91
    iput-object v4, v10, La/od60;->k:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v4, v10, La/od60;->o:La/kmq;

    .line 94
    .line 95
    iput-byte v2, v10, La/od60;->i:B

    .line 96
    .line 97
    invoke-static {v1, p1, v10}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-ne p0, v0, :cond_5

    .line 102
    .line 103
    :goto_2
    return-object v0

    .line 104
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0
.end method
