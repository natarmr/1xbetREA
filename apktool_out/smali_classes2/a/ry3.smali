.class public final La/ry3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/miu0;


# instance fields
.field public final a:La/i1w0;

.field public final b:La/giu0;


# direct methods
.method public constructor <init>(La/i1w0;La/giu0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ry3;->a:La/i1w0;

    .line 11
    .line 12
    iput-object p2, p0, La/ry3;->b:La/giu0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)La/diu0;
    .locals 0

    .line 1
    iget-object p1, p0, La/ry3;->b:La/giu0;

    .line 2
    .line 3
    iget-object p0, p0, La/ry3;->a:La/i1w0;

    .line 4
    .line 5
    invoke-interface {p1, p0}, La/giu0;->c(Ljava/lang/Object;)La/diu0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
