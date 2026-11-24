.class public final La/kwz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/lzz;

.field public b:J

.field public c:Z

.field public final d:La/qoj0;

.field public e:J

.field public f:J

.field public g:I

.field public h:J

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/lzz;

    .line 5
    .line 6
    sget-object v1, La/iun;->a:La/iun;

    .line 7
    .line 8
    invoke-direct {v0, v1, v1}, La/lzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/kwz;->a:La/lzz;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x6

    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/kwz;->d:La/qoj0;

    .line 22
    .line 23
    return-void
.end method
