.class public final La/m3v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/nc0;

.field public final synthetic m:J

.field public final synthetic n:I

.field public final synthetic o:B


# direct methods
.method public constructor <init>(La/yje;La/nc0;JII)V
    .locals 0

    .line 1
    iput-object p2, p0, La/m3v;->l:La/nc0;

    .line 2
    .line 3
    iput-wide p3, p0, La/m3v;->m:J

    .line 4
    .line 5
    iput p5, p0, La/m3v;->n:I

    .line 6
    .line 7
    iput-byte p6, p0, La/m3v;->o:B

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/m3v;

    .line 7
    .line 8
    iget v5, p0, La/m3v;->n:I

    .line 9
    .line 10
    iget-byte v6, p0, La/m3v;->o:B

    .line 11
    .line 12
    iget-object v2, p0, La/m3v;->l:La/nc0;

    .line 13
    .line 14
    iget-wide v3, p0, La/m3v;->m:J

    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, La/m3v;-><init>(La/yje;La/nc0;JII)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/m3v;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/m3v;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/m3v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/m3v;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/m3v;->j:La/kmq;

    .line 25
    .line 26
    iget-object v1, p0, La/m3v;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/j0g0;

    .line 29
    .line 30
    iget-object v11, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v6, p0, La/m3v;->l:La/nc0;

    .line 33
    .line 34
    iget-object v1, v6, La/nc0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/uyn;

    .line 37
    .line 38
    iget-object v1, v1, La/uyn;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/epi0;

    .line 41
    .line 42
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/eat0;

    .line 45
    .line 46
    iget-object v5, v1, La/eat0;->a:La/p7m0;

    .line 47
    .line 48
    new-instance v4, La/q3v;

    .line 49
    .line 50
    iget v9, p0, La/m3v;->n:I

    .line 51
    .line 52
    iget-byte v10, p0, La/m3v;->o:B

    .line 53
    .line 54
    iget-wide v7, p0, La/m3v;->m:J

    .line 55
    .line 56
    invoke-direct/range {v4 .. v11}, La/q3v;-><init>(La/p7m0;La/nc0;JIILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, La/m3v;->j:La/kmq;

    .line 60
    .line 61
    iput-object v2, p0, La/m3v;->k:Ljava/lang/Object;

    .line 62
    .line 63
    iput-boolean v3, p0, La/m3v;->i:Z

    .line 64
    .line 65
    invoke-static {p1, v4, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0
.end method
