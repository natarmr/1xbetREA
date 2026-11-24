.class public final La/srq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/rrq;


# instance fields
.field public final a:La/phf0;

.field public final b:La/sje;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/lwf;->h:La/lwf;

    .line 2
    .line 3
    new-instance v1, La/rrq;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, La/rrq;-><init>(Lkotlin/coroutines/f;B)V

    .line 7
    .line 8
    .line 9
    sput-object v1, La/srq;->c:La/rrq;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/phf0;)V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/srq;->a:La/phf0;

    .line 7
    .line 8
    sget-object p1, La/svk;->a:La/vs10;

    .line 9
    .line 10
    sget-object v1, La/srq;->c:La/rrq;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/kin0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, La/dby;-><init>(La/bby;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/srq;->b:La/sje;

    .line 41
    .line 42
    return-void
.end method
