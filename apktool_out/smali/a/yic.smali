.class public abstract La/yic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kq00;


# instance fields
.field public final a:J

.field public final b:La/mbj;

.field public final c:B

.field public final d:Landroidx/media3/common/b;

.field public final e:I

.field public final f:Ljava/lang/Object;

.field public final g:J

.field public final h:J

.field public final i:La/enm0;


# direct methods
.method public constructor <init>(La/jbj;La/mbj;ILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p11, La/enm0;

    .line 5
    .line 6
    invoke-direct {p11, p1}, La/enm0;-><init>(La/jbj;)V

    .line 7
    .line 8
    .line 9
    iput-object p11, p0, La/yic;->i:La/enm0;

    .line 10
    .line 11
    iput-object p2, p0, La/yic;->b:La/mbj;

    .line 12
    .line 13
    iput-byte p3, p0, La/yic;->c:B

    .line 14
    .line 15
    iput-object p4, p0, La/yic;->d:Landroidx/media3/common/b;

    .line 16
    .line 17
    iput p5, p0, La/yic;->e:I

    .line 18
    .line 19
    iput-object p6, p0, La/yic;->f:Ljava/lang/Object;

    .line 20
    .line 21
    iput-wide p7, p0, La/yic;->g:J

    .line 22
    .line 23
    iput-wide p9, p0, La/yic;->h:J

    .line 24
    .line 25
    sget-object p1, La/wn00;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p0, La/yic;->a:J

    .line 32
    .line 33
    return-void
.end method
