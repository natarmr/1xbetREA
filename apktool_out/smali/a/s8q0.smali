.class public final La/s8q0;
.super La/zn00;
.source "SourceFile"


# instance fields
.field public final synthetic c:La/gb10;

.field public final synthetic d:La/zn00;

.field public final synthetic e:La/uxk;


# direct methods
.method public constructor <init>(La/gb10;La/zn00;La/uxk;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/s8q0;->c:La/gb10;

    .line 2
    .line 3
    iput-object p2, p0, La/s8q0;->d:La/zn00;

    .line 4
    .line 5
    iput-object p3, p0, La/s8q0;->e:La/uxk;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, La/zn00;-><init>(B)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K0(La/gb10;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p1, La/gb10;->a:F

    .line 2
    .line 3
    iget v1, p1, La/gb10;->b:F

    .line 4
    .line 5
    iget-object v2, p1, La/gb10;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/uxk;

    .line 8
    .line 9
    iget-object v2, v2, La/uxk;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p1, La/gb10;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/uxk;

    .line 14
    .line 15
    iget-object v3, v3, La/uxk;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget v4, p1, La/gb10;->c:F

    .line 18
    .line 19
    iget v5, p1, La/gb10;->d:F

    .line 20
    .line 21
    iget v6, p1, La/gb10;->e:F

    .line 22
    .line 23
    iget-object v7, p0, La/s8q0;->c:La/gb10;

    .line 24
    .line 25
    iput v0, v7, La/gb10;->a:F

    .line 26
    .line 27
    iput v1, v7, La/gb10;->b:F

    .line 28
    .line 29
    iput-object v2, v7, La/gb10;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v3, v7, La/gb10;->g:Ljava/lang/Object;

    .line 32
    .line 33
    iput v4, v7, La/gb10;->c:F

    .line 34
    .line 35
    iput v5, v7, La/gb10;->d:F

    .line 36
    .line 37
    iput v6, v7, La/gb10;->e:F

    .line 38
    .line 39
    iget-object v0, p0, La/s8q0;->d:La/zn00;

    .line 40
    .line 41
    iget-object v0, v0, La/zn00;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/ayj0;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    iget v1, p1, La/gb10;->d:F

    .line 48
    .line 49
    const/high16 v2, 0x3f800000    # 1.0f

    .line 50
    .line 51
    cmpl-float v1, v1, v2

    .line 52
    .line 53
    if-nez v1, :cond_0

    .line 54
    .line 55
    iget-object p1, p1, La/gb10;->g:Ljava/lang/Object;

    .line 56
    .line 57
    :goto_0
    check-cast p1, La/uxk;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    iget-object p1, p1, La/gb10;->f:Ljava/lang/Object;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_1
    iget-object v1, p1, La/uxk;->b:Ljava/lang/String;

    .line 64
    .line 65
    iget v2, p1, La/uxk;->c:F

    .line 66
    .line 67
    iget v3, p1, La/uxk;->d:I

    .line 68
    .line 69
    iget v4, p1, La/uxk;->e:I

    .line 70
    .line 71
    iget v5, p1, La/uxk;->f:F

    .line 72
    .line 73
    iget v6, p1, La/uxk;->g:F

    .line 74
    .line 75
    iget v7, p1, La/uxk;->h:I

    .line 76
    .line 77
    iget v8, p1, La/uxk;->i:I

    .line 78
    .line 79
    iget v9, p1, La/uxk;->j:F

    .line 80
    .line 81
    iget-boolean v10, p1, La/uxk;->k:Z

    .line 82
    .line 83
    iget-object v11, p1, La/uxk;->l:Landroid/graphics/PointF;

    .line 84
    .line 85
    iget-object p1, p1, La/uxk;->m:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget-object p0, p0, La/s8q0;->e:La/uxk;

    .line 88
    .line 89
    iput-object v0, p0, La/uxk;->a:Ljava/lang/String;

    .line 90
    .line 91
    iput-object v1, p0, La/uxk;->b:Ljava/lang/String;

    .line 92
    .line 93
    iput v2, p0, La/uxk;->c:F

    .line 94
    .line 95
    iput v3, p0, La/uxk;->d:I

    .line 96
    .line 97
    iput v4, p0, La/uxk;->e:I

    .line 98
    .line 99
    iput v5, p0, La/uxk;->f:F

    .line 100
    .line 101
    iput v6, p0, La/uxk;->g:F

    .line 102
    .line 103
    iput v7, p0, La/uxk;->h:I

    .line 104
    .line 105
    iput v8, p0, La/uxk;->i:I

    .line 106
    .line 107
    iput v9, p0, La/uxk;->j:F

    .line 108
    .line 109
    iput-boolean v10, p0, La/uxk;->k:Z

    .line 110
    .line 111
    iput-object v11, p0, La/uxk;->l:Landroid/graphics/PointF;

    .line 112
    .line 113
    iput-object p1, p0, La/uxk;->m:Landroid/graphics/PointF;

    .line 114
    .line 115
    return-object p0
.end method
