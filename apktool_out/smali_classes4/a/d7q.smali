.class public final La/d7q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/h7q;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(La/h7q;IIILa/yje;)V
    .locals 1

    .line 1
    sget-object v0, La/ocq;->a:La/ocq;

    .line 2
    .line 3
    iput-object p1, p0, La/d7q;->j:La/h7q;

    .line 4
    .line 5
    iput p2, p0, La/d7q;->k:I

    .line 6
    .line 7
    iput p3, p0, La/d7q;->l:I

    .line 8
    .line 9
    iput p4, p0, La/d7q;->m:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/d7q;

    .line 2
    .line 3
    sget-object p1, La/ocq;->a:La/ocq;

    .line 4
    .line 5
    iget v3, p0, La/d7q;->l:I

    .line 6
    .line 7
    iget v4, p0, La/d7q;->m:I

    .line 8
    .line 9
    iget-object v1, p0, La/d7q;->j:La/h7q;

    .line 10
    .line 11
    iget v2, p0, La/d7q;->k:I

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/d7q;-><init>(La/h7q;IIILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/d7q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/d7q;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/d7q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/d7q;->i:Z

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
    iget-object v4, p0, La/d7q;->j:La/h7q;

    .line 25
    .line 26
    iget-object p1, v4, La/h7q;->f:La/mne;

    .line 27
    .line 28
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 29
    .line 30
    new-instance v3, La/c7q;

    .line 31
    .line 32
    sget-object v1, La/ocq;->a:La/ocq;

    .line 33
    .line 34
    iget v7, p0, La/d7q;->m:I

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    iget v5, p0, La/d7q;->k:I

    .line 38
    .line 39
    iget v6, p0, La/d7q;->l:I

    .line 40
    .line 41
    invoke-direct/range {v3 .. v8}, La/c7q;-><init>(La/h7q;IIILa/yje;)V

    .line 42
    .line 43
    .line 44
    iput-boolean v2, p0, La/d7q;->i:Z

    .line 45
    .line 46
    invoke-static {p1, v3, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    return-object p0
.end method
