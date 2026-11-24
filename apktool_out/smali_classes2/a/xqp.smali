.class public final La/xqp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:B


# direct methods
.method public constructor <init>(ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/xqp;->a:Z

    .line 5
    .line 6
    iput-byte p2, p0, La/xqp;->b:B

    .line 7
    .line 8
    return-void
.end method

.method public static a(I)La/xqp;
    .locals 2

    .line 1
    new-instance v0, La/xqp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, La/xqp;-><init>(ZI)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static b(I)La/xqp;
    .locals 2

    .line 1
    new-instance v0, La/xqp;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, La/xqp;-><init>(ZI)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
