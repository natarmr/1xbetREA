.class public abstract La/lhk;
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
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v3}, La/jhk;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/ipd0;->a:La/hng;

    .line 14
    .line 15
    new-instance v4, La/y1a;

    .line 16
    .line 17
    invoke-direct {v4, v2, v3}, La/y1a;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v4}, La/hng;->b(Ljava/util/concurrent/Executor;La/ca60;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
