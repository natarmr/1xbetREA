.class public abstract synthetic La/aoq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-wide/16 v2, 0x1

    .line 2
    .line 3
    const-wide/32 v4, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    const-string v6, "kotlinx.coroutines.flow.defaultConcurrency"

    .line 9
    .line 10
    invoke-static/range {v0 .. v6}, La/ktt0;->y(JJJLjava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    long-to-int v0, v0

    .line 15
    sput v0, La/aoq;->a:I

    .line 16
    .line 17
    return-void
.end method

.method public static final a(La/gmq;Lkotlin/jvm/functions/Function2;)La/utb;
    .locals 3

    .line 1
    new-instance v0, La/kh1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x5

    .line 5
    invoke-direct {v0, p1, v1, v2}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final varargs b([La/gmq;)La/ltb;
    .locals 6

    .line 1
    invoke-static {p0}, La/tx3;->s([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v0, La/ltb;

    .line 6
    .line 7
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 8
    .line 9
    sget-object v4, La/i99;->a:La/i99;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v3, -0x2

    .line 13
    invoke-direct/range {v0 .. v5}, La/ltb;-><init>(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;ILa/i99;B)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final c(La/gmq;La/xdr;)La/utb;
    .locals 6

    .line 1
    new-instance v0, La/utb;

    .line 2
    .line 3
    sget-object v3, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 4
    .line 5
    const/4 v4, -0x2

    .line 6
    sget-object v5, La/i99;->a:La/i99;

    .line 7
    .line 8
    move-object v2, p0

    .line 9
    move-object v1, p1

    .line 10
    invoke-direct/range {v0 .. v5}, La/utb;-><init>(La/xdr;La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
