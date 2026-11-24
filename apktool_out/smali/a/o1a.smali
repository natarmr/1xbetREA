.class public abstract La/o1a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/z04;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, La/o2e;->Y(I)La/z04;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, La/o1a;->a:La/z04;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(La/i1a;)La/m1a;
    .locals 2

    .line 1
    const-string v0, "CameraPipe"

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ok50;

    .line 7
    .line 8
    invoke-direct {v0, p0}, La/ok50;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/y78;

    .line 12
    .line 13
    iget-object p0, p0, La/i1a;->b:La/k1a;

    .line 14
    .line 15
    invoke-direct {v1, p0}, La/y78;-><init>(La/k1a;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, La/hbi;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, La/hbi;-><init>(La/ok50;La/y78;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/m1a;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/m1a;-><init>(La/hbi;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 34
    .line 35
    .line 36
    throw p0
.end method
