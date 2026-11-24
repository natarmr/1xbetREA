.class public interface abstract La/afr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# direct methods
.method public static synthetic e(La/afr;Lkotlin/coroutines/CoroutineContext;ILa/i99;I)La/gmq;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p2, -0x3

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    sget-object p3, La/i99;->a:La/i99;

    .line 17
    .line 18
    :cond_2
    invoke-interface {p0, p1, p2, p3}, La/afr;->b(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/gmq;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public abstract b(Lkotlin/coroutines/CoroutineContext;ILa/i99;)La/gmq;
.end method
