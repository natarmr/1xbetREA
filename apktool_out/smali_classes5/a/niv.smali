.class public final La/niv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[S

.field public b:S

.field public c:I

.field public d:I

.field public final e:[S

.field public final f:[[S

.field public g:I

.field public final h:[S

.field public final i:[S

.field public final j:[S

.field public final k:[S

.field public final l:[S

.field public final m:[S

.field public final n:[S

.field public final o:[S

.field public final p:[S

.field public final q:[I

.field public final r:[S

.field public final s:[S

.field public final t:[S

.field public final u:[S

.field public final v:La/lbu;


# direct methods
.method public constructor <init>()V
    .locals 5

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
    iput-object v0, p0, La/niv;->a:[S

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    new-array v1, v0, [S

    .line 13
    .line 14
    iput-object v1, p0, La/niv;->e:[S

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    new-array v2, v1, [[S

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v1, :cond_0

    .line 21
    .line 22
    new-array v4, v0, [S

    .line 23
    .line 24
    aput-object v4, v2, v3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object v2, p0, La/niv;->f:[[S

    .line 30
    .line 31
    const/16 v1, 0xa0

    .line 32
    .line 33
    new-array v1, v1, [S

    .line 34
    .line 35
    iput-object v1, p0, La/niv;->h:[S

    .line 36
    .line 37
    new-array v1, v0, [S

    .line 38
    .line 39
    iput-object v1, p0, La/niv;->i:[S

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    new-array v2, v1, [S

    .line 43
    .line 44
    iput-object v2, p0, La/niv;->j:[S

    .line 45
    .line 46
    new-array v2, v1, [S

    .line 47
    .line 48
    iput-object v2, p0, La/niv;->k:[S

    .line 49
    .line 50
    new-array v2, v1, [S

    .line 51
    .line 52
    iput-object v2, p0, La/niv;->l:[S

    .line 53
    .line 54
    new-array v1, v1, [S

    .line 55
    .line 56
    iput-object v1, p0, La/niv;->m:[S

    .line 57
    .line 58
    const/16 v1, 0x34

    .line 59
    .line 60
    new-array v1, v1, [S

    .line 61
    .line 62
    iput-object v1, p0, La/niv;->n:[S

    .line 63
    .line 64
    const/16 v1, 0x32

    .line 65
    .line 66
    new-array v1, v1, [S

    .line 67
    .line 68
    iput-object v1, p0, La/niv;->o:[S

    .line 69
    .line 70
    const/16 v1, 0x28

    .line 71
    .line 72
    new-array v1, v1, [S

    .line 73
    .line 74
    iput-object v1, p0, La/niv;->p:[S

    .line 75
    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    new-array v2, v1, [I

    .line 79
    .line 80
    iput-object v2, p0, La/niv;->q:[I

    .line 81
    .line 82
    new-array v2, v1, [S

    .line 83
    .line 84
    iput-object v2, p0, La/niv;->r:[S

    .line 85
    .line 86
    new-array v2, v1, [S

    .line 87
    .line 88
    iput-object v2, p0, La/niv;->s:[S

    .line 89
    .line 90
    new-array v1, v1, [S

    .line 91
    .line 92
    iput-object v1, p0, La/niv;->t:[S

    .line 93
    .line 94
    new-array v0, v0, [S

    .line 95
    .line 96
    iput-object v0, p0, La/niv;->u:[S

    .line 97
    .line 98
    new-instance v0, La/lbu;

    .line 99
    .line 100
    invoke-direct {v0}, La/lbu;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, La/niv;->v:La/lbu;

    .line 104
    .line 105
    return-void
.end method
