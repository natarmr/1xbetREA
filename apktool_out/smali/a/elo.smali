.class public final La/elo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final E:I

.field public static final F:Z


# instance fields
.field public A:Z

.field public final B:Ljava/lang/String;

.field public final C:Z

.field public final D:Z

.field public final a:Landroid/content/Context;

.field public final b:La/l9o0;

.field public final c:La/lin0;

.field public final d:La/lin0;

.field public final e:La/w24;

.field public final f:La/m44;

.field public final g:La/w24;

.field public final h:La/sd9;

.field public final i:Landroid/os/Looper;

.field public final j:I

.field public final k:La/m24;

.field public final l:Z

.field public final m:Z

.field public final n:La/gvh0;

.field public final o:La/uch0;

.field public final p:S

.field public final q:S

.field public final r:S

.field public final s:La/vvj;

.field public final t:S

.field public final u:S

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, La/j47;->H0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "emulator"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, "emu64a"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    const-string v1, "emu64x"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const-string v1, "generic"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    const-string v1, "vsoc"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/16 v0, 0x2710

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    const/16 v0, 0x7530

    .line 54
    .line 55
    :goto_1
    sput v0, La/elo;->E:I

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    sput-boolean v0, La/elo;->F:Z

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 161
    new-instance v0, La/w24;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, La/w24;-><init>(Landroid/content/Context;B)V

    new-instance v1, La/w24;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, La/w24;-><init>(Landroid/content/Context;B)V

    invoke-direct {p0, p1, v0, v1}, La/elo;-><init>(Landroid/content/Context;La/lin0;La/lin0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/gwj;)V
    .locals 3

    .line 160
    new-instance v0, La/w24;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La/w24;-><init>(Landroid/content/Context;B)V

    new-instance v2, La/fwj;

    invoke-direct {v2, p2, v1}, La/fwj;-><init>(Ljava/lang/Object;B)V

    invoke-direct {p0, p1, v0, v2}, La/elo;-><init>(Landroid/content/Context;La/lin0;La/lin0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/lin0;La/lin0;)V
    .locals 5

    .line 1
    new-instance v0, La/w24;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, p1, v1}, La/w24;-><init>(Landroid/content/Context;B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/m44;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, v2}, La/m44;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/w24;

    .line 14
    .line 15
    const/4 v3, 0x5

    .line 16
    invoke-direct {v2, p1, v3}, La/w24;-><init>(Landroid/content/Context;B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/sd9;

    .line 20
    .line 21
    invoke-direct {v4, v3}, La/sd9;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/elo;->a:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p2, p0, La/elo;->c:La/lin0;

    .line 33
    .line 34
    iput-object p3, p0, La/elo;->d:La/lin0;

    .line 35
    .line 36
    iput-object v0, p0, La/elo;->e:La/w24;

    .line 37
    .line 38
    iput-object v1, p0, La/elo;->f:La/m44;

    .line 39
    .line 40
    iput-object v2, p0, La/elo;->g:La/w24;

    .line 41
    .line 42
    iput-object v4, p0, La/elo;->h:La/sd9;

    .line 43
    .line 44
    invoke-static {}, La/vtt0;->u()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/elo;->i:Landroid/os/Looper;

    .line 49
    .line 50
    sget-object p1, La/m24;->b:La/m24;

    .line 51
    .line 52
    iput-object p1, p0, La/elo;->k:La/m24;

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    iput-boolean p1, p0, La/elo;->l:Z

    .line 56
    .line 57
    iput-boolean p1, p0, La/elo;->m:Z

    .line 58
    .line 59
    sget-object p2, La/gvh0;->d:La/gvh0;

    .line 60
    .line 61
    iput-object p2, p0, La/elo;->n:La/gvh0;

    .line 62
    .line 63
    const/16 p2, 0x1388

    .line 64
    .line 65
    iput-short p2, p0, La/elo;->p:S

    .line 66
    .line 67
    const/16 p2, 0x3a98

    .line 68
    .line 69
    iput-short p2, p0, La/elo;->q:S

    .line 70
    .line 71
    const/16 p2, 0xbb8

    .line 72
    .line 73
    iput-short p2, p0, La/elo;->r:S

    .line 74
    .line 75
    sget-object p2, La/uch0;->b:La/uch0;

    .line 76
    .line 77
    iput-object p2, p0, La/elo;->o:La/uch0;

    .line 78
    .line 79
    const-wide/16 p2, 0x14

    .line 80
    .line 81
    invoke-static {p2, p3}, La/vtt0;->M(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide p2

    .line 85
    const-wide/16 v0, 0x1f4

    .line 86
    .line 87
    invoke-static {v0, v1}, La/vtt0;->M(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    new-instance v2, La/vvj;

    .line 92
    .line 93
    invoke-direct {v2, p2, p3, v0, v1}, La/vvj;-><init>(JJ)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, La/elo;->s:La/vvj;

    .line 97
    .line 98
    sget-object p2, La/l9o0;->a:La/l9o0;

    .line 99
    .line 100
    iput-object p2, p0, La/elo;->b:La/l9o0;

    .line 101
    .line 102
    const/16 p2, 0x1f4

    .line 103
    .line 104
    iput-short p2, p0, La/elo;->t:S

    .line 105
    .line 106
    const/16 p2, 0x7d0

    .line 107
    .line 108
    iput-short p2, p0, La/elo;->u:S

    .line 109
    .line 110
    const p2, 0x927c0

    .line 111
    .line 112
    .line 113
    iput p2, p0, La/elo;->v:I

    .line 114
    .line 115
    const p3, 0x7fffffff

    .line 116
    .line 117
    .line 118
    sget-boolean v0, La/elo;->F:Z

    .line 119
    .line 120
    if-eqz v0, :cond_0

    .line 121
    .line 122
    sget v1, La/elo;->E:I

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    move v1, p3

    .line 126
    :goto_0
    iput v1, p0, La/elo;->w:I

    .line 127
    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    const p3, 0xea60

    .line 131
    .line 132
    .line 133
    :cond_1
    iput p3, p0, La/elo;->x:I

    .line 134
    .line 135
    iput p2, p0, La/elo;->y:I

    .line 136
    .line 137
    iput-boolean p1, p0, La/elo;->z:Z

    .line 138
    .line 139
    const-string p2, ""

    .line 140
    .line 141
    iput-object p2, p0, La/elo;->B:Ljava/lang/String;

    .line 142
    .line 143
    const/16 p2, -0x3e8

    .line 144
    .line 145
    iput p2, p0, La/elo;->j:I

    .line 146
    .line 147
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 148
    .line 149
    const/16 p3, 0x23

    .line 150
    .line 151
    if-lt p2, p3, :cond_2

    .line 152
    .line 153
    new-instance p2, La/qxj;

    .line 154
    .line 155
    :cond_2
    iput-boolean p1, p0, La/elo;->C:Z

    .line 156
    .line 157
    iput-boolean p1, p0, La/elo;->D:Z

    .line 158
    .line 159
    return-void
.end method


# virtual methods
.method public final a()La/ulo;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/elo;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, La/elo;->A:Z

    .line 9
    .line 10
    new-instance v0, La/ulo;

    .line 11
    .line 12
    invoke-direct {v0, p0}, La/ulo;-><init>(La/elo;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
