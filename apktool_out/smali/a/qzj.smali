.class public final La/qzj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/rzj;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:La/vt00;

.field public final synthetic o:La/z40;

.field public final synthetic p:J


# direct methods
.method public constructor <init>(La/rzj;La/yje;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qzj;->j:La/rzj;

    .line 2
    .line 3
    iput-object p3, p0, La/qzj;->k:Ljava/util/List;

    .line 4
    .line 5
    iput-object p4, p0, La/qzj;->l:Ljava/util/List;

    .line 6
    .line 7
    iput-object p5, p0, La/qzj;->m:Ljava/util/List;

    .line 8
    .line 9
    iput-object p6, p0, La/qzj;->n:La/vt00;

    .line 10
    .line 11
    iput-object p7, p0, La/qzj;->o:La/z40;

    .line 12
    .line 13
    iput-wide p8, p0, La/qzj;->p:J

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/qzj;

    .line 2
    .line 3
    iget-object v7, p0, La/qzj;->o:La/z40;

    .line 4
    .line 5
    iget-wide v8, p0, La/qzj;->p:J

    .line 6
    .line 7
    iget-object v1, p0, La/qzj;->j:La/rzj;

    .line 8
    .line 9
    iget-object v3, p0, La/qzj;->k:Ljava/util/List;

    .line 10
    .line 11
    iget-object v4, p0, La/qzj;->l:Ljava/util/List;

    .line 12
    .line 13
    iget-object v5, p0, La/qzj;->m:Ljava/util/List;

    .line 14
    .line 15
    iget-object v6, p0, La/qzj;->n:La/vt00;

    .line 16
    .line 17
    move-object v2, p2

    .line 18
    invoke-direct/range {v0 .. v9}, La/qzj;-><init>(La/rzj;La/yje;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/qzj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qzj;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qzj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/qzj;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/qzj;->j:La/rzj;

    .line 25
    .line 26
    invoke-virtual {p1}, La/rzj;->n()La/xot0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v8, p0, La/qzj;->o:La/z40;

    .line 31
    .line 32
    iget-wide v9, p0, La/qzj;->p:J

    .line 33
    .line 34
    iget-object v4, p0, La/qzj;->k:Ljava/util/List;

    .line 35
    .line 36
    iget-object v5, p0, La/qzj;->l:Ljava/util/List;

    .line 37
    .line 38
    iget-object v6, p0, La/qzj;->m:Ljava/util/List;

    .line 39
    .line 40
    iget-object v7, p0, La/qzj;->n:La/vt00;

    .line 41
    .line 42
    invoke-virtual/range {v3 .. v10}, La/xot0;->l(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/z40;J)La/jzj;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-boolean v2, p0, La/qzj;->i:Z

    .line 47
    .line 48
    check-cast p1, La/odd;

    .line 49
    .line 50
    invoke-virtual {p1, p0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    return-object p0
.end method
