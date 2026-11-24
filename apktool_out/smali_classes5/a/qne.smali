.class public final La/qne;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Throwable;

.field public synthetic k:J

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qne;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, La/qne;->m:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/qne;->j:Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-wide v1, p0, La/qne;->k:J

    .line 4
    .line 5
    sget-object v3, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v4, p0, La/qne;->i:Z

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    if-ne v4, v6, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v5

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v7, 0x0

    .line 29
    .line 30
    cmp-long p1, v1, v7

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, La/qne;->l:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, La/qne;->m:Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iput-object v5, p0, La/qne;->j:Ljava/lang/Throwable;

    .line 54
    .line 55
    iput-wide v1, p0, La/qne;->k:J

    .line 56
    .line 57
    iput-boolean v6, p0, La/qne;->i:Z

    .line 58
    .line 59
    const-wide/16 v0, 0x1f40

    .line 60
    .line 61
    invoke-static {v0, v1, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v3, :cond_3

    .line 66
    .line 67
    return-object v3

    .line 68
    :cond_2
    const/4 v6, 0x0

    .line 69
    :cond_3
    :goto_0
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    check-cast p4, La/yje;

    .line 12
    .line 13
    new-instance p1, La/qne;

    .line 14
    .line 15
    iget-object p3, p0, La/qne;->l:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iget-object p0, p0, La/qne;->m:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    invoke-direct {p1, p3, p0, p4}, La/qne;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p1, La/qne;->j:Ljava/lang/Throwable;

    .line 23
    .line 24
    iput-wide v0, p1, La/qne;->k:J

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/qne;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
