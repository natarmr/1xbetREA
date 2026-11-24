.class public final La/drx;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/tzi;

.field public final synthetic m:Z

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Z

.field public final synthetic p:J


# direct methods
.method public constructor <init>(La/yje;La/tzi;ZLjava/util/List;ZJ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/drx;->l:La/tzi;

    .line 2
    .line 3
    iput-boolean p3, p0, La/drx;->m:Z

    .line 4
    .line 5
    iput-object p4, p0, La/drx;->n:Ljava/util/List;

    .line 6
    .line 7
    iput-boolean p5, p0, La/drx;->o:Z

    .line 8
    .line 9
    iput-wide p6, p0, La/drx;->p:J

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/drx;

    .line 7
    .line 8
    iget-boolean v5, p0, La/drx;->o:Z

    .line 9
    .line 10
    iget-wide v6, p0, La/drx;->p:J

    .line 11
    .line 12
    iget-object v2, p0, La/drx;->l:La/tzi;

    .line 13
    .line 14
    iget-boolean v3, p0, La/drx;->m:Z

    .line 15
    .line 16
    iget-object v4, p0, La/drx;->n:Ljava/util/List;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, La/drx;-><init>(La/yje;La/tzi;ZLjava/util/List;ZJ)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/drx;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/drx;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/drx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/drx;->i:Z

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
    iget-object p1, p0, La/drx;->j:La/kmq;

    .line 25
    .line 26
    iget-object v1, p0, La/drx;->k:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v11, v1

    .line 29
    check-cast v11, La/jvn;

    .line 30
    .line 31
    new-instance v4, La/crx;

    .line 32
    .line 33
    iget-wide v9, p0, La/drx;->p:J

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    iget-object v5, p0, La/drx;->l:La/tzi;

    .line 37
    .line 38
    iget-boolean v6, p0, La/drx;->m:Z

    .line 39
    .line 40
    iget-object v7, p0, La/drx;->n:Ljava/util/List;

    .line 41
    .line 42
    iget-boolean v8, p0, La/drx;->o:Z

    .line 43
    .line 44
    invoke-direct/range {v4 .. v12}, La/crx;-><init>(La/tzi;ZLjava/util/List;ZJLa/jvn;La/yje;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, La/vsg0;

    .line 48
    .line 49
    invoke-direct {v1, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, La/drx;->j:La/kmq;

    .line 53
    .line 54
    iput-object v2, p0, La/drx;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iput-boolean v3, p0, La/drx;->i:Z

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
