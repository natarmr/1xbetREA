.class public final La/v63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u63;


# instance fields
.field public final a:La/pz40;

.field public final b:La/toj0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/qkx;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, La/qkx;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/v63;->a:La/pz40;

    .line 16
    .line 17
    new-instance v0, La/toj0;

    .line 18
    .line 19
    invoke-direct {v0}, La/toj0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/v63;->b:La/toj0;

    .line 23
    .line 24
    return-void
.end method
