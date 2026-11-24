.class public abstract La/ijj0;
.super La/t89;
.source "SourceFile"


# instance fields
.field public a:La/zas0;

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, La/ijj0;->b:J

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(FJLa/ucs0;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/ijj0;->a:La/zas0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, La/ijj0;->b:J

    .line 7
    .line 8
    invoke-static {v2, v3, p2, p3}, La/h7k0;->b(JJ)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    :cond_0
    invoke-static {p2, p3}, La/h7k0;->f(J)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iput-object v1, p0, La/ijj0;->a:La/zas0;

    .line 21
    .line 22
    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iput-wide p2, p0, La/ijj0;->b:J

    .line 28
    .line 29
    move-object v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, La/ijj0;->a:La/zas0;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    new-instance v0, La/zas0;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v0, v2, v3}, La/zas0;-><init>(BZ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/ijj0;->a:La/zas0;

    .line 43
    .line 44
    :cond_2
    invoke-virtual {p0, p2, p3}, La/ijj0;->b(J)Landroid/graphics/Shader;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, v0, La/zas0;->b:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v0, p0, La/ijj0;->a:La/zas0;

    .line 51
    .line 52
    iput-wide p2, p0, La/ijj0;->b:J

    .line 53
    .line 54
    :cond_3
    :goto_0
    invoke-virtual {p4}, La/ucs0;->l()J

    .line 55
    .line 56
    .line 57
    move-result-wide p2

    .line 58
    sget-wide v2, La/y3d;->b:J

    .line 59
    .line 60
    invoke-static {p2, p3, v2, v3}, La/h2t0;->a(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p4, v2, v3}, La/ucs0;->s(J)V

    .line 67
    .line 68
    .line 69
    :cond_4
    iget-object p0, p4, La/ucs0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Landroid/graphics/Shader;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget-object p2, v0, La/zas0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p2, Landroid/graphics/Shader;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    move-object p2, v1

    .line 81
    :goto_1
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_7

    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    iget-object p0, v0, La/zas0;->b:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v1, p0

    .line 92
    check-cast v1, Landroid/graphics/Shader;

    .line 93
    .line 94
    :cond_6
    invoke-virtual {p4, v1}, La/ucs0;->w(Landroid/graphics/Shader;)V

    .line 95
    .line 96
    .line 97
    :cond_7
    iget-object p0, p4, La/ucs0;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Landroid/graphics/Paint;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/graphics/Paint;->getAlpha()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    int-to-float p0, p0

    .line 106
    const/high16 p2, 0x437f0000    # 255.0f

    .line 107
    .line 108
    div-float/2addr p0, p2

    .line 109
    cmpg-float p0, p0, p1

    .line 110
    .line 111
    if-nez p0, :cond_8

    .line 112
    .line 113
    return-void

    .line 114
    :cond_8
    invoke-virtual {p4, p1}, La/ucs0;->q(F)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
