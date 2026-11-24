.class public final La/gy90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final q:La/ew3;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/ey90;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:La/czj;

.field public final f:La/l9o0;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final h:J

.field public final i:La/veu0;

.field public j:La/tyc;

.field public k:La/q9o0;

.field public l:Landroid/util/Pair;

.field public m:I

.field public n:B

.field public o:J

.field public p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ew3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, La/ew3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/gy90;->q:La/ew3;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/by90;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/by90;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object v0, p0, La/gy90;->a:Landroid/content/Context;

    .line 7
    .line 8
    new-instance v0, La/tyc;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v0, v1}, La/tyc;-><init>(B)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/gy90;->j:La/tyc;

    .line 15
    .line 16
    iget-object v0, p1, La/by90;->c:La/ey90;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/gy90;->b:La/ey90;

    .line 22
    .line 23
    new-instance v0, Landroid/util/SparseArray;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/gy90;->c:Landroid/util/SparseArray;

    .line 29
    .line 30
    sget-object v0, La/b4x;->b:La/v3x;

    .line 31
    .line 32
    sget-object v0, La/rcf0;->e:La/rcf0;

    .line 33
    .line 34
    iget-boolean v0, p1, La/by90;->d:Z

    .line 35
    .line 36
    iput-boolean v0, p0, La/gy90;->d:Z

    .line 37
    .line 38
    iget-object v0, p1, La/by90;->e:La/l9o0;

    .line 39
    .line 40
    iput-object v0, p0, La/gy90;->f:La/l9o0;

    .line 41
    .line 42
    iget-wide v1, p1, La/by90;->g:J

    .line 43
    .line 44
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long v5, v1, v3

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    neg-long v1, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-wide v1, v3

    .line 56
    :goto_0
    iput-wide v1, p0, La/gy90;->h:J

    .line 57
    .line 58
    iget-object v1, p1, La/by90;->h:La/veu0;

    .line 59
    .line 60
    iput-object v1, p0, La/gy90;->i:La/veu0;

    .line 61
    .line 62
    new-instance v2, La/czj;

    .line 63
    .line 64
    iget-object p1, p1, La/by90;->b:La/ueu0;

    .line 65
    .line 66
    invoke-direct {v2, p1, v1, v0}, La/czj;-><init>(La/ueu0;La/veu0;La/l9o0;)V

    .line 67
    .line 68
    .line 69
    iput-object v2, p0, La/gy90;->e:La/czj;

    .line 70
    .line 71
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, La/gy90;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 77
    .line 78
    new-instance p1, La/awq;

    .line 79
    .line 80
    invoke-direct {p1}, La/awq;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v0, Landroidx/media3/common/b;

    .line 84
    .line 85
    invoke-direct {v0, p1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 86
    .line 87
    .line 88
    iput-wide v3, p0, La/gy90;->o:J

    .line 89
    .line 90
    const/4 p1, -0x1

    .line 91
    iput p1, p0, La/gy90;->p:I

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    iput-byte p1, p0, La/gy90;->n:B

    .line 95
    .line 96
    return-void
.end method
