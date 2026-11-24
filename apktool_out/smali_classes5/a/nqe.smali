.class public final La/nqe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zdg0;

.field public final b:La/sj3;

.field public final c:La/fu6;

.field public final d:La/wti;


# direct methods
.method public constructor <init>(La/zdg0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nqe;->a:La/zdg0;

    .line 5
    .line 6
    new-instance p1, La/sj3;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0}, La/sj3;-><init>(B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/nqe;->b:La/sj3;

    .line 13
    .line 14
    new-instance p1, La/fu6;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p1, v1}, La/fu6;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/nqe;->c:La/fu6;

    .line 21
    .line 22
    new-instance p1, La/wti;

    .line 23
    .line 24
    new-instance v1, La/sj3;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-direct {v1, v2}, La/sj3;-><init>(B)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/fu6;

    .line 31
    .line 32
    invoke-direct {v2, v0}, La/fu6;-><init>(B)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-direct {p1, v1, v2, v0}, La/wti;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/nqe;->d:La/wti;

    .line 41
    .line 42
    return-void
.end method
