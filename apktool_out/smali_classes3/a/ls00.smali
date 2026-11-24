.class public final La/ls00;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/o2z;

.field public c:La/sje;


# direct methods
.method public constructor <init>(La/us00;La/o2z;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ls00;->a:La/us00;

    .line 8
    .line 9
    iput-object p2, p0, La/ls00;->b:La/o2z;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La/ls00;->c:La/sje;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v2, La/tvk;->a:La/rwj;

    .line 18
    .line 19
    sget-object v2, La/dvj;->c:La/dvj;

    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/ls00;->c:La/sje;

    .line 30
    .line 31
    new-instance v2, La/ks00;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v2, p0, v3, v1}, La/ks00;-><init>(La/ls00;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    invoke-static {v0, v3, v3, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    return-void
.end method
