.class public final La/yyj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vne;
.implements La/jbi0;


# instance fields
.field public final synthetic a:La/vne;

.field public final b:La/q99;


# direct methods
.method public constructor <init>(La/vne;La/q99;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yyj0;->a:La/vne;

    .line 8
    .line 9
    iput-object p2, p0, La/yyj0;->b:La/q99;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yyj0;->b:La/q99;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/q99;->c(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/yyj0;->b:La/q99;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getCoroutineContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, La/yyj0;->a:La/vne;

    .line 2
    .line 3
    invoke-interface {p0}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/yyj0;->b:La/q99;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
