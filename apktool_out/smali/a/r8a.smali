.class public final La/r8a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/by9;


# instance fields
.field public final synthetic a:La/g9a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public constructor <init>(La/g9a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r8a;->a:La/g9a;

    .line 5
    .line 6
    iput p2, p0, La/r8a;->b:I

    .line 7
    .line 8
    iput p3, p0, La/r8a;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()La/ig00;
    .locals 8

    .line 1
    iget-object v3, p0, La/r8a;->a:La/g9a;

    .line 2
    .line 3
    iget-object v0, v3, La/g9a;->e:La/tpt0;

    .line 4
    .line 5
    iget-object v7, v0, La/tpt0;->a:La/sje;

    .line 6
    .line 7
    iget v4, p0, La/r8a;->b:I

    .line 8
    .line 9
    iget v5, p0, La/r8a;->c:I

    .line 10
    .line 11
    new-instance v1, La/tu9;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance p0, La/msf0;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p0, v1, La/tu9;->c:La/msf0;

    .line 22
    .line 23
    new-instance p0, La/wu9;

    .line 24
    .line 25
    invoke-direct {p0, v1}, La/wu9;-><init>(La/tu9;)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v1, La/tu9;->b:La/wu9;

    .line 29
    .line 30
    const-class v0, La/q8a;

    .line 31
    .line 32
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;

    .line 33
    .line 34
    :try_start_0
    new-instance v0, La/o8a;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-direct/range {v0 .. v6}, La/o8a;-><init>(La/tu9;La/yje;La/g9a;IIB)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v7, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    return-object p0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    invoke-virtual {p0, v0}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 52
    .line 53
    .line 54
    return-object p0
.end method

.method public final b()La/ig00;
    .locals 8

    .line 1
    iget-object v3, p0, La/r8a;->a:La/g9a;

    .line 2
    .line 3
    iget-object v0, v3, La/g9a;->e:La/tpt0;

    .line 4
    .line 5
    iget-object v7, v0, La/tpt0;->a:La/sje;

    .line 6
    .line 7
    iget v4, p0, La/r8a;->b:I

    .line 8
    .line 9
    iget v5, p0, La/r8a;->c:I

    .line 10
    .line 11
    new-instance v1, La/tu9;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance p0, La/msf0;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p0, v1, La/tu9;->c:La/msf0;

    .line 22
    .line 23
    new-instance p0, La/wu9;

    .line 24
    .line 25
    invoke-direct {p0, v1}, La/wu9;-><init>(La/tu9;)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v1, La/tu9;->b:La/wu9;

    .line 29
    .line 30
    const-class v0, La/p8a;

    .line 31
    .line 32
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;

    .line 33
    .line 34
    :try_start_0
    new-instance v0, La/o8a;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct/range {v0 .. v6}, La/o8a;-><init>(La/tu9;La/yje;La/g9a;IIB)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v7, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    return-object p0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    invoke-virtual {p0, v0}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 52
    .line 53
    .line 54
    return-object p0
.end method
