.class public final La/h5m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/cgk0;

.field public final b:La/agk0;

.field public c:La/vne;

.field public d:La/bby;

.field public final e:La/c3d;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/h5m;->a:La/cgk0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    invoke-static {p1}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/h5m;->b:La/agk0;

    .line 23
    .line 24
    new-instance p1, La/c3d;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p1, p0, v0}, La/c3d;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/h5m;->e:La/c3d;

    .line 31
    .line 32
    return-void
.end method
