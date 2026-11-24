.class public final La/wsd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:La/rwj;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:La/s2m0;

.field public final e:La/cad;

.field public final f:La/std;


# direct methods
.method public constructor <init>(La/usd;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p1, La/tvk;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1, v0}, La/rwj;->w(I)La/lne;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/obb;->I(La/lne;)Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/wsd;->a:Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    iput-object p1, p0, La/wsd;->b:La/rwj;

    .line 36
    .line 37
    invoke-static {p1}, La/obb;->I(La/lne;)Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/wsd;->c:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    new-instance p1, La/s2m0;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/wsd;->d:La/s2m0;

    .line 49
    .line 50
    new-instance p1, La/cad;

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    invoke-direct {p1, v0}, La/cad;-><init>(B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, La/wsd;->e:La/cad;

    .line 58
    .line 59
    new-instance p1, La/std;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, La/wsd;->f:La/std;

    .line 65
    .line 66
    return-void
.end method
