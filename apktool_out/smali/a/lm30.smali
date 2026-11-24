.class public final La/lm30;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:La/lm30;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:La/tyc;

.field public e:J

.field public f:I

.field public g:Z

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/lm30;

    .line 2
    .line 3
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-direct/range {v0 .. v9}, La/lm30;-><init>(IJJJJ)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/lm30;->i:La/lm30;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(IJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, La/lm30;->a:J

    .line 5
    .line 6
    iput-wide p4, p0, La/lm30;->b:J

    .line 7
    .line 8
    iput-wide p6, p0, La/lm30;->c:J

    .line 9
    .line 10
    iput-wide p8, p0, La/lm30;->e:J

    .line 11
    .line 12
    iput p1, p0, La/lm30;->f:I

    .line 13
    .line 14
    new-instance p1, La/tyc;

    .line 15
    .line 16
    const/4 p2, 0x7

    .line 17
    invoke-direct {p1, p2}, La/tyc;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/lm30;->d:La/tyc;

    .line 21
    .line 22
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide p1, p0, La/lm30;->h:J

    .line 28
    .line 29
    return-void
.end method
