.class public final synthetic La/i44;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sg00;
.implements La/xbf;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/i44;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/m1r;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p1, La/dm60;->P1:La/wsz;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p1, La/dm60;

    .line 12
    .line 13
    invoke-direct {p1}, La/dm60;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, La/i44;->a:J

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v0, Lkotlin/Pair;

    .line 23
    .line 24
    const-string v1, "OPEN_GAME_ID_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lkotlin/Pair;

    .line 30
    .line 31
    const-string v1, "OPEN_GAME_NAME_KEY"

    .line 32
    .line 33
    const-string v2, ""

    .line 34
    .line 35
    invoke-direct {p0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    filled-new-array {v0, p0}, [Lkotlin/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/ksj;

    .line 2
    .line 3
    iget-object v0, p1, La/ksj;->a:La/osj;

    .line 4
    .line 5
    iget-object v1, v0, La/osj;->j:La/ksj;

    .line 6
    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, v0, La/osj;->n:La/yox;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, La/yox;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, La/fm30;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p1, La/fm30;->x2:Z

    .line 20
    .line 21
    iget-object p1, p1, La/fm30;->l2:La/xex;

    .line 22
    .line 23
    iget-object v0, p1, La/xex;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/os/Handler;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v1, La/w34;

    .line 30
    .line 31
    iget-wide v2, p0, La/i44;->a:J

    .line 32
    .line 33
    invoke-direct {v1, p1, v2, v3}, La/w34;-><init>(La/xex;J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method
