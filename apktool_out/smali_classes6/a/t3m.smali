.class public final La/t3m;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Z

.field public final synthetic m:La/pz40;


# direct methods
.method public constructor <init>(ZLa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/t3m;->l:Z

    .line 2
    .line 3
    iput-object p2, p0, La/t3m;->m:La/pz40;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/zzf0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/t3m;

    .line 2
    .line 3
    iget-boolean v1, p0, La/t3m;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/t3m;->m:La/pz40;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/t3m;-><init>(ZLa/pz40;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/t3m;->k:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/inn0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/t3m;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/t3m;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/t3m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, La/t3m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/inn0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v2, p0, La/t3m;->j:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

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
    return-object v3

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, La/t3m;->k:Ljava/lang/Object;

    .line 29
    .line 30
    iput-boolean v4, p0, La/t3m;->j:Z

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-static {v0, p1, p0, v2}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    :goto_0
    iget-boolean p1, p0, La/t3m;->l:Z

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    sget-object p1, La/w3m;->a:La/uts0;

    .line 46
    .line 47
    iget-object p0, p0, La/t3m;->m:La/pz40;

    .line 48
    .line 49
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 54
    .line 55
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0
.end method
