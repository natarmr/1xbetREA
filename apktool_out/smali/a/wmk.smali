.class public final La/wmk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/es;

.field public final b:La/es;

.field public final c:La/es;


# direct methods
.method public constructor <init>(La/ycl;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/es;

    .line 5
    .line 6
    const-string v1, "base"

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, La/es;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/wmk;->a:La/es;

    .line 12
    .line 13
    new-instance p1, La/es;

    .line 14
    .line 15
    const-string p2, "min"

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, v0, v0, p2}, La/es;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/wmk;->b:La/es;

    .line 22
    .line 23
    new-instance p1, La/es;

    .line 24
    .line 25
    const-string p2, "max"

    .line 26
    .line 27
    invoke-direct {p1, v0, v0, p2}, La/es;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/wmk;->c:La/es;

    .line 31
    .line 32
    return-void
.end method
