.class public final La/miv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[S

.field public b:I

.field public final c:[[S

.field public d:S

.field public final e:[S

.field public f:S

.field public final g:[S

.field public final h:[S

.field public final i:[S

.field public final j:[S

.field public final k:[S

.field public final l:[S

.field public final m:[S

.field public final n:[S

.field public final o:[S

.field public final p:La/g2v;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x118

    .line 5
    .line 6
    new-array v0, v0, [S

    .line 7
    .line 8
    iput-object v0, p0, La/miv;->a:[S

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    new-array v1, v0, [[S

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    const/16 v3, 0x8

    .line 15
    .line 16
    if-ge v2, v0, :cond_0

    .line 17
    .line 18
    new-array v3, v3, [S

    .line 19
    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-object v1, p0, La/miv;->c:[[S

    .line 26
    .line 27
    const/16 v0, 0x28

    .line 28
    .line 29
    iput-short v0, p0, La/miv;->d:S

    .line 30
    .line 31
    const/16 v1, 0x9

    .line 32
    .line 33
    new-array v1, v1, [S

    .line 34
    .line 35
    iput-object v1, p0, La/miv;->e:[S

    .line 36
    .line 37
    new-array v1, v3, [S

    .line 38
    .line 39
    iput-object v1, p0, La/miv;->g:[S

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    new-array v2, v1, [S

    .line 43
    .line 44
    iput-object v2, p0, La/miv;->h:[S

    .line 45
    .line 46
    new-array v2, v1, [S

    .line 47
    .line 48
    iput-object v2, p0, La/miv;->i:[S

    .line 49
    .line 50
    new-array v2, v1, [S

    .line 51
    .line 52
    iput-object v2, p0, La/miv;->j:[S

    .line 53
    .line 54
    new-array v1, v1, [S

    .line 55
    .line 56
    iput-object v1, p0, La/miv;->k:[S

    .line 57
    .line 58
    const/16 v1, 0x34

    .line 59
    .line 60
    new-array v1, v1, [S

    .line 61
    .line 62
    iput-object v1, p0, La/miv;->l:[S

    .line 63
    .line 64
    new-array v0, v0, [S

    .line 65
    .line 66
    iput-object v0, p0, La/miv;->m:[S

    .line 67
    .line 68
    const/16 v0, 0xa0

    .line 69
    .line 70
    new-array v0, v0, [S

    .line 71
    .line 72
    iput-object v0, p0, La/miv;->n:[S

    .line 73
    .line 74
    new-array v0, v3, [S

    .line 75
    .line 76
    iput-object v0, p0, La/miv;->o:[S

    .line 77
    .line 78
    new-instance v0, La/g2v;

    .line 79
    .line 80
    const/16 v1, 0x9

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/g2v;-><init>(B)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/miv;->p:La/g2v;

    .line 86
    .line 87
    return-void
.end method
