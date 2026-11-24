.class public final synthetic La/rpg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/x0a0;
.implements La/fer;


# instance fields
.field public final synthetic a:La/vqg;


# direct methods
.method public constructor <init>(La/vqg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rpg;->a:La/vqg;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/rpg;->a:La/vqg;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/vlf;

    .line 14
    .line 15
    const/16 v2, 0x15

    .line 16
    .line 17
    invoke-direct {v1, v2}, La/vlf;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v4, La/e9g;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x6

    .line 24
    invoke-direct {v4, p0, p1, v2, v3}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    const/16 v5, 0xe

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final b()La/wdr;
    .locals 7

    .line 1
    new-instance v0, La/rer;

    .line 2
    .line 3
    const-string v5, "onSelectPlayer(Ljava/lang/String;)V"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, La/rpg;->a:La/vqg;

    .line 8
    .line 9
    const-class v3, La/vqg;

    .line 10
    .line 11
    const-string v4, "onSelectPlayer"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/x0a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, La/fer;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/rpg;->b()La/wdr;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p1, La/fer;

    .line 14
    .line 15
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rpg;->b()La/wdr;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
