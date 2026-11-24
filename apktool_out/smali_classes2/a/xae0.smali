.class public final La/xae0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n7m0;
.implements La/p5a;
.implements La/afr;


# instance fields
.field public final synthetic a:La/n7m0;

.field private final job:La/bby;


# direct methods
.method public constructor <init>(La/qz40;La/bby;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xae0;->a:La/n7m0;

    .line 5
    .line 6
    iput-object p2, p0, La/xae0;->job:La/bby;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/gmq;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, La/i99;->b:La/i99;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, La/roj0;->c(La/noj0;Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/gmq;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_1
    return-object p0
.end method

.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 2
    .line 3
    invoke-interface {p0}, La/noj0;->d()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 2
    .line 3
    invoke-interface {p0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
