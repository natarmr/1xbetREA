.class public final La/t9b;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:La/pz40;

.field public final synthetic m:J

.field public final synthetic n:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(ZZLa/pz40;JLkotlin/jvm/functions/Function0;La/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/t9b;->j:Z

    .line 2
    .line 3
    iput-boolean p2, p0, La/t9b;->k:Z

    .line 4
    .line 5
    iput-object p3, p0, La/t9b;->l:La/pz40;

    .line 6
    .line 7
    iput-wide p4, p0, La/t9b;->m:J

    .line 8
    .line 9
    iput-object p6, p0, La/t9b;->n:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/t9b;

    .line 2
    .line 3
    iget-wide v4, p0, La/t9b;->m:J

    .line 4
    .line 5
    iget-object v6, p0, La/t9b;->n:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iget-boolean v1, p0, La/t9b;->j:Z

    .line 8
    .line 9
    iget-boolean v2, p0, La/t9b;->k:Z

    .line 10
    .line 11
    iget-object v3, p0, La/t9b;->l:La/pz40;

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, La/t9b;-><init>(ZZLa/pz40;JLkotlin/jvm/functions/Function0;La/yje;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/t9b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/t9b;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/t9b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/t9b;->i:Z

    .line 4
    .line 5
    iget-object v2, p0, La/t9b;->n:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/t9b;->l:La/pz40;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, La/t9b;->j:Z

    .line 29
    .line 30
    iget-boolean v1, p0, La/t9b;->k:Z

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-interface {v4, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v3, p0, La/t9b;->i:Z

    .line 42
    .line 43
    iget-wide v5, p0, La/t9b;->m:J

    .line 44
    .line 45
    invoke-static {v5, v6, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-interface {v4, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-interface {v4, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
