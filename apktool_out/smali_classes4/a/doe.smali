.class public final La/doe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:I


# direct methods
.method public constructor <init>(JILa/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/doe;->l:J

    .line 2
    .line 3
    iput p3, p0, La/doe;->m:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/doe;

    .line 2
    .line 3
    iget-wide v1, p0, La/doe;->l:J

    .line 4
    .line 5
    iget p0, p0, La/doe;->m:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p0, p2}, La/doe;-><init>(JILa/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/doe;->k:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/doe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/doe;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/doe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, La/wne;->a:La/wne;

    .line 17
    .line 18
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/doe;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/kmq;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/doe;->j:B

    .line 8
    .line 9
    const-wide/16 v3, 0x3e8

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v6, :cond_1

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    iget-wide v7, p0, La/doe;->i:J

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    iget-wide v7, p0, La/doe;->i:J

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-wide v7, p0, La/doe;->l:J

    .line 42
    .line 43
    :goto_0
    new-instance p1, Ljava/lang/Long;

    .line 44
    .line 45
    invoke-direct {p1, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/doe;->k:Ljava/lang/Object;

    .line 49
    .line 50
    iput-wide v7, p0, La/doe;->i:J

    .line 51
    .line 52
    iput-byte v6, p0, La/doe;->j:B

    .line 53
    .line 54
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    :goto_1
    iput-object v0, p0, La/doe;->k:Ljava/lang/Object;

    .line 62
    .line 63
    iput-wide v7, p0, La/doe;->i:J

    .line 64
    .line 65
    iput-byte v5, p0, La/doe;->j:B

    .line 66
    .line 67
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    :goto_2
    return-object v1

    .line 74
    :cond_4
    :goto_3
    iget p1, p0, La/doe;->m:I

    .line 75
    .line 76
    int-to-long v9, p1

    .line 77
    mul-long/2addr v9, v3

    .line 78
    add-long/2addr v7, v9

    .line 79
    goto :goto_0
.end method
