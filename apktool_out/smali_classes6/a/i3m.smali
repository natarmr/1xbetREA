.class public final La/i3m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ngk0;

.field public final b:La/agk0;

.field public final c:La/pz40;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ngk0;

    .line 5
    .line 6
    invoke-direct {v0}, La/ngk0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/i3m;->a:La/ngk0;

    .line 10
    .line 11
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/i3m;->b:La/agk0;

    .line 18
    .line 19
    sget v0, La/j3m;->b:F

    .line 20
    .line 21
    new-instance v1, La/ycl;

    .line 22
    .line 23
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/i3m;->c:La/pz40;

    .line 31
    .line 32
    return-void
.end method
