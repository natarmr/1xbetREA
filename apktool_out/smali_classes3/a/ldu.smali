.class public final La/ldu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:Z

.field public final synthetic k:La/wdu;

.field public final synthetic l:B

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:La/sff0;


# direct methods
.method public constructor <init>(ZLa/wdu;IZZZZLa/sff0;La/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/ldu;->j:Z

    .line 2
    .line 3
    iput-object p2, p0, La/ldu;->k:La/wdu;

    .line 4
    .line 5
    iput-byte p3, p0, La/ldu;->l:B

    .line 6
    .line 7
    iput-boolean p4, p0, La/ldu;->m:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/ldu;->n:Z

    .line 10
    .line 11
    iput-boolean p6, p0, La/ldu;->o:Z

    .line 12
    .line 13
    iput-boolean p7, p0, La/ldu;->p:Z

    .line 14
    .line 15
    iput-object p8, p0, La/ldu;->q:La/sff0;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/ldu;

    .line 2
    .line 3
    iget-boolean v7, p0, La/ldu;->p:Z

    .line 4
    .line 5
    iget-object v8, p0, La/ldu;->q:La/sff0;

    .line 6
    .line 7
    iget-boolean v1, p0, La/ldu;->j:Z

    .line 8
    .line 9
    iget-object v2, p0, La/ldu;->k:La/wdu;

    .line 10
    .line 11
    iget-byte v3, p0, La/ldu;->l:B

    .line 12
    .line 13
    iget-boolean v4, p0, La/ldu;->m:Z

    .line 14
    .line 15
    iget-boolean v5, p0, La/ldu;->n:Z

    .line 16
    .line 17
    iget-boolean v6, p0, La/ldu;->o:Z

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, La/ldu;-><init>(ZLa/wdu;IZZZZLa/sff0;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ldu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ldu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ldu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/ldu;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    :cond_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, La/j0g0;

    .line 17
    .line 18
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, La/ldu;->j:Z

    .line 32
    .line 33
    iget-object v4, p0, La/ldu;->k:La/wdu;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iput-byte v3, p0, La/ldu;->i:B

    .line 38
    .line 39
    iget-byte p1, p0, La/ldu;->l:B

    .line 40
    .line 41
    iget-boolean v1, p0, La/ldu;->m:Z

    .line 42
    .line 43
    iget-boolean v2, p0, La/ldu;->n:Z

    .line 44
    .line 45
    invoke-virtual {v4, p1, v1, v2, p0}, La/wdu;->G(IZZLa/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_4

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object p1, p0, La/ldu;->q:La/sff0;

    .line 53
    .line 54
    iget-object p1, p1, La/sff0;->b:La/hl1;

    .line 55
    .line 56
    iget-boolean v8, p1, La/hl1;->N:Z

    .line 57
    .line 58
    iput-byte v2, p0, La/ldu;->i:B

    .line 59
    .line 60
    iget-boolean v5, p0, La/ldu;->o:Z

    .line 61
    .line 62
    iget-boolean v6, p0, La/ldu;->p:Z

    .line 63
    .line 64
    iget-boolean v7, p0, La/ldu;->m:Z

    .line 65
    .line 66
    move-object v9, p0

    .line 67
    invoke-virtual/range {v4 .. v9}, La/wdu;->B(ZZZZLa/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, v0, :cond_4

    .line 72
    .line 73
    :goto_0
    return-object v0

    .line 74
    :cond_4
    :goto_1
    new-instance p1, La/j0g0;

    .line 75
    .line 76
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method
