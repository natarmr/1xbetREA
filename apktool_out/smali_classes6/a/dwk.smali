.class public abstract La/dwk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/erq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/erq;

    .line 2
    .line 3
    sget-object v1, La/brq;->c:La/brq;

    .line 4
    .line 5
    sget-object v2, La/wxv;->b:La/wxv;

    .line 6
    .line 7
    sget-object v4, La/le60;->a:La/le60;

    .line 8
    .line 9
    new-instance v5, La/wqq;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v5, v3, v3, v3, v3}, La/wqq;-><init>(IIII)V

    .line 13
    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, La/erq;-><init>(La/brq;La/wxv;ZLa/le60;La/wqq;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/dwk;->a:La/erq;

    .line 19
    .line 20
    return-void
.end method

.method public static final a(La/ahk;)La/bwk;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/bwk;

    .line 5
    .line 6
    iget-object v1, p0, La/ahk;->a:Landroid/content/res/Configuration;

    .line 7
    .line 8
    iget v2, v1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 9
    .line 10
    iget-object v3, p0, La/ahk;->c:La/erq;

    .line 11
    .line 12
    iget v4, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    new-instance v2, La/thk;

    .line 18
    .line 19
    iget-object v6, v3, La/erq;->a:La/brq;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x1

    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    if-eq v6, v8, :cond_4

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    if-ne v6, v4, :cond_0

    .line 33
    .line 34
    :goto_0
    move v7, v8

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    return-object v5

    .line 40
    :cond_1
    sget-object v6, La/tjv0;->a:La/svs0;

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/16 v6, 0x19b

    .line 46
    .line 47
    if-ge v4, v6, :cond_2

    .line 48
    .line 49
    sget-object v4, La/tjv0;->b:La/tjv0;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/16 v6, 0x280

    .line 53
    .line 54
    if-ge v4, v6, :cond_3

    .line 55
    .line 56
    sget-object v4, La/tjv0;->c:La/tjv0;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object v4, La/tjv0;->d:La/tjv0;

    .line 60
    .line 61
    :goto_1
    sget-object v6, La/tjv0;->b:La/tjv0;

    .line 62
    .line 63
    if-ne v4, v6, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_2
    invoke-direct {v2, v7}, La/thk;-><init>(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    const/16 v4, 0x258

    .line 71
    .line 72
    if-lt v2, v4, :cond_6

    .line 73
    .line 74
    sget-object v2, La/xhk;->a:La/xhk;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_6
    sget-object v2, La/vhk;->a:La/vhk;

    .line 78
    .line 79
    :goto_3
    iget v4, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 80
    .line 81
    iget v6, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 82
    .line 83
    if-le v4, v6, :cond_7

    .line 84
    .line 85
    sget-object v7, La/la80;->b:La/la80;

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    sget-object v7, La/la80;->a:La/la80;

    .line 89
    .line 90
    :goto_4
    int-to-float v4, v4

    .line 91
    int-to-float v6, v6

    .line 92
    move-object v8, v5

    .line 93
    iget-object v5, p0, La/ahk;->b:La/w6k;

    .line 94
    .line 95
    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 96
    .line 97
    if-nez v3, :cond_9

    .line 98
    .line 99
    iget-boolean v3, p0, La/ahk;->f:Z

    .line 100
    .line 101
    if-eqz v3, :cond_8

    .line 102
    .line 103
    sget-object v3, La/dwk;->a:La/erq;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    move-object v3, v8

    .line 107
    :cond_9
    :goto_5
    iget-object v8, p0, La/ahk;->d:La/t9o0;

    .line 108
    .line 109
    iget-object v9, p0, La/ahk;->e:La/sly;

    .line 110
    .line 111
    const/high16 v10, 0x42600000    # 56.0f

    .line 112
    .line 113
    move v11, v6

    .line 114
    move v6, v1

    .line 115
    move-object v1, v2

    .line 116
    move-object v2, v7

    .line 117
    move-object v7, v3

    .line 118
    move v3, v4

    .line 119
    move v4, v11

    .line 120
    invoke-direct/range {v0 .. v10}, La/bwk;-><init>(La/zhk;La/la80;FFLa/w6k;FLa/erq;La/t9o0;La/sly;F)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method
