.class public final La/zai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ctf0;

.field public final b:La/i1w0;

.field public final c:La/cad;

.field public final d:La/iw20;

.field public final e:La/yo4;

.field public final f:La/s64;

.field public final g:La/j1q0;

.field public final h:La/f7i;

.field public final i:La/n5d0;


# direct methods
.method public constructor <init>(La/cad;La/iw20;La/i1w0;La/ctf0;La/yo4;La/s64;La/j1q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/zai;->a:La/ctf0;

    .line 5
    .line 6
    iput-object p3, p0, La/zai;->b:La/i1w0;

    .line 7
    .line 8
    iput-object p1, p0, La/zai;->c:La/cad;

    .line 9
    .line 10
    iput-object p2, p0, La/zai;->d:La/iw20;

    .line 11
    .line 12
    iput-object p5, p0, La/zai;->e:La/yo4;

    .line 13
    .line 14
    iput-object p6, p0, La/zai;->f:La/s64;

    .line 15
    .line 16
    iput-object p7, p0, La/zai;->g:La/j1q0;

    .line 17
    .line 18
    new-instance p1, La/f7i;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const/16 p3, 0xf

    .line 22
    .line 23
    invoke-direct {p1, p0, p2, p3}, La/f7i;-><init>(Ljava/lang/Object;IB)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/zai;->h:La/f7i;

    .line 27
    .line 28
    new-instance p1, La/f7i;

    .line 29
    .line 30
    const/4 p2, 0x1

    .line 31
    invoke-direct {p1, p0, p2, p3}, La/f7i;-><init>(Ljava/lang/Object;IB)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/zai;->i:La/n5d0;

    .line 39
    .line 40
    return-void
.end method
