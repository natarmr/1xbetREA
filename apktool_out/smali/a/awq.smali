.class public final La/awq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:I

.field public C:Z

.field public D:F

.field public E:[B

.field public F:I

.field public G:La/c4d;

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:La/b4x;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:La/ed40;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:Ljava/util/List;

.field public s:Landroidx/media3/common/DrmInitData;

.field public t:J

.field public u:Z

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/b4x;->b:La/v3x;

    .line 5
    .line 6
    sget-object v0, La/rcf0;->e:La/rcf0;

    .line 7
    .line 8
    iput-object v0, p0, La/awq;->c:La/b4x;

    .line 9
    .line 10
    const/high16 v0, -0x40800000    # -1.0f

    .line 11
    .line 12
    iput v0, p0, La/awq;->g:F

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, La/awq;->i:I

    .line 16
    .line 17
    iput v1, p0, La/awq;->j:I

    .line 18
    .line 19
    iput v1, p0, La/awq;->p:I

    .line 20
    .line 21
    iput v1, p0, La/awq;->q:I

    .line 22
    .line 23
    const-wide v2, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide v2, p0, La/awq;->t:J

    .line 29
    .line 30
    iput v1, p0, La/awq;->v:I

    .line 31
    .line 32
    iput v1, p0, La/awq;->w:I

    .line 33
    .line 34
    iput v1, p0, La/awq;->x:I

    .line 35
    .line 36
    iput v1, p0, La/awq;->y:I

    .line 37
    .line 38
    iput v1, p0, La/awq;->z:I

    .line 39
    .line 40
    iput v0, p0, La/awq;->A:F

    .line 41
    .line 42
    const/high16 v0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    iput v0, p0, La/awq;->D:F

    .line 45
    .line 46
    iput v1, p0, La/awq;->F:I

    .line 47
    .line 48
    iput v1, p0, La/awq;->H:I

    .line 49
    .line 50
    iput v1, p0, La/awq;->I:I

    .line 51
    .line 52
    iput v1, p0, La/awq;->J:I

    .line 53
    .line 54
    iput v1, p0, La/awq;->K:I

    .line 55
    .line 56
    iput v1, p0, La/awq;->L:I

    .line 57
    .line 58
    iput v1, p0, La/awq;->O:I

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput v0, p0, La/awq;->P:I

    .line 62
    .line 63
    iput v1, p0, La/awq;->Q:I

    .line 64
    .line 65
    iput v1, p0, La/awq;->R:I

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput v0, p0, La/awq;->S:I

    .line 69
    .line 70
    iput v0, p0, La/awq;->h:I

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    :goto_1
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 17
    .line 18
    .line 19
    iput p1, p0, La/awq;->A:F

    .line 20
    .line 21
    return-void
.end method
