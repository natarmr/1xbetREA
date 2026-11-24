.class public final La/lkf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:La/kkz;

.field public final synthetic b:La/mie0;

.field public final synthetic c:La/vne;

.field public final synthetic d:La/kkz;

.field public final synthetic e:La/n5a;

.field public final synthetic f:La/k050;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/kkz;La/mie0;La/vne;La/kkz;La/n5a;La/k050;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lkf0;->a:La/kkz;

    .line 5
    .line 6
    iput-object p2, p0, La/lkf0;->b:La/mie0;

    .line 7
    .line 8
    iput-object p3, p0, La/lkf0;->c:La/vne;

    .line 9
    .line 10
    iput-object p4, p0, La/lkf0;->d:La/kkz;

    .line 11
    .line 12
    iput-object p5, p0, La/lkf0;->e:La/n5a;

    .line 13
    .line 14
    iput-object p6, p0, La/lkf0;->f:La/k050;

    .line 15
    .line 16
    iput-object p7, p0, La/lkf0;->g:Lkotlin/jvm/functions/Function2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/lkf0;->a:La/kkz;

    .line 2
    .line 3
    iget-object v0, p0, La/lkf0;->b:La/mie0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    new-instance p1, La/pnd0;

    .line 9
    .line 10
    iget-object p2, p0, La/lkf0;->g:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    iget-object v3, p0, La/lkf0;->f:La/k050;

    .line 15
    .line 16
    invoke-direct {p1, v3, p2, v1, v2}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    iget-object p0, p0, La/lkf0;->c:La/vne;

    .line 21
    .line 22
    invoke-static {p0, v1, v1, p1, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iput-object p0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, La/lkf0;->d:La/kkz;

    .line 30
    .line 31
    if-ne p2, p1, :cond_2

    .line 32
    .line 33
    iget-object p1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/bby;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-interface {p1, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_2
    sget-object p1, La/kkz;->ON_DESTROY:La/kkz;

    .line 45
    .line 46
    if-ne p2, p1, :cond_3

    .line 47
    .line 48
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    iget-object p0, p0, La/lkf0;->e:La/n5a;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method
