.class public final La/nj50;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ylu0;

.field public final b:La/gle0;

.field public final c:La/yge0;

.field public final d:La/xzp;

.field public e:I


# direct methods
.method public constructor <init>(La/yge0;La/xzp;La/zlu0;La/gle0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/l5g;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p0, v1}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/nj50;->c:La/yge0;

    .line 11
    .line 12
    iput-object p2, p0, La/nj50;->d:La/xzp;

    .line 13
    .line 14
    invoke-interface {p3, p0}, La/zlu0;->a(La/nj50;)La/ylu0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, La/nj50;->a:La/ylu0;

    .line 19
    .line 20
    iput-object p4, p0, La/nj50;->b:La/gle0;

    .line 21
    .line 22
    invoke-virtual {p1}, La/yge0;->d()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, La/nj50;->e:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/yge0;->v(La/ahe0;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
