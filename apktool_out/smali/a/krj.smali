.class public final La/krj;
.super La/jrj;
.source "SourceFile"

# interfaces
.implements La/yje;


# instance fields
.field public a:La/sdy;

.field public b:Lkotlin/Unit;

.field public c:La/yje;

.field public d:Ljava/lang/Object;


# virtual methods
.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/krj;->c:La/yje;

    .line 3
    .line 4
    iput-object p1, p0, La/krj;->d:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
