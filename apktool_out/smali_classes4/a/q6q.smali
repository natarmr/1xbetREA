.class public final La/q6q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public b:F

.field public c:J

.field public final d:La/p7m0;

.field public e:Ljava/util/List;

.field public final f:La/qoj0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/q6q;->a:La/p7m0;

    .line 14
    .line 15
    sget-object v1, La/iun;->a:La/iun;

    .line 16
    .line 17
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, La/q6q;->d:La/p7m0;

    .line 22
    .line 23
    iput-object v1, p0, La/q6q;->e:Ljava/util/List;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x7

    .line 27
    invoke-static {v0, v0, v1, v2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/q6q;->f:La/qoj0;

    .line 32
    .line 33
    return-void
.end method
