.class public abstract La/mhk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:La/kpd0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, La/ipd0;->c:La/ipd0;

    .line 2
    .line 3
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, La/jhk;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v2, v3}, La/jhk;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/ipd0;->a:La/hng;

    .line 14
    .line 15
    new-instance v3, La/y1a;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, v2, v4}, La/y1a;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v3}, La/hng;->b(Ljava/util/concurrent/Executor;La/ca60;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final a()La/kpd0;
    .locals 1

    .line 1
    sget-object v0, La/mhk;->a:La/kpd0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "all"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method
