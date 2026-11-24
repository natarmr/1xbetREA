.class public abstract La/bag0;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:B


# direct methods
.method public constructor <init>(La/vkr0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 3
    .line 4
    .line 5
    iput-byte p2, p0, La/bag0;->c:B

    .line 6
    .line 7
    if-ltz p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "retryLimit must be >= 0"

    .line 11
    .line 12
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method
