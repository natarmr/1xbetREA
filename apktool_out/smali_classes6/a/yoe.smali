.class public final La/yoe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public c:Lorg/xplatform/uikit/components/counter/DsCounter;

.field public d:La/r0m;

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yoe;->a:Landroid/view/View;

    .line 8
    .line 9
    iput-object p2, p0, La/yoe;->b:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    sget-object p1, La/r0m;->l:La/r0m;

    .line 12
    .line 13
    iput-object p1, p0, La/yoe;->d:La/r0m;

    .line 14
    .line 15
    const p1, 0x800055

    .line 16
    .line 17
    .line 18
    iput p1, p0, La/yoe;->e:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/yoe;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, La/bqd0;->y:[I

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x2

    .line 17
    iget v1, p0, La/yoe;->e:I

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, La/yoe;->e:I

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    const/4 v1, 0x7

    .line 27
    invoke-static {p1, v0, v1}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, La/yoe;->f:I

    .line 32
    .line 33
    const/4 v0, 0x6

    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    invoke-static {p1, v0, v1}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, La/yoe;->g:I

    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sget-object v2, La/r0m;->t:La/c0o;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/r0m;

    .line 55
    .line 56
    iput-object v0, p0, La/yoe;->d:La/r0m;

    .line 57
    .line 58
    iget-object v0, p0, La/yoe;->h:Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v0, v1

    .line 68
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/16 v1, 0x9

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    iget-object v1, p0, La/yoe;->i:Ljava/lang/String;

    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0, v0, v1}, La/yoe;->d(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    iget v1, p0, La/yoe;->e:I

    .line 94
    .line 95
    iget v2, p0, La/yoe;->f:I

    .line 96
    .line 97
    iget p0, p0, La/yoe;->g:I

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2, p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->g(III)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/yoe;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, La/bqd0;->y:[I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x2

    .line 18
    iget v0, p0, La/yoe;->e:I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, La/yoe;->e:I

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    const/4 v0, 0x7

    .line 28
    invoke-static {p1, p2, v0}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iput p2, p0, La/yoe;->f:I

    .line 33
    .line 34
    const/4 p2, 0x6

    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-static {p1, p2, v0}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iput p2, p0, La/yoe;->g:I

    .line 42
    .line 43
    const/4 p2, 0x3

    .line 44
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    sget-object v0, La/r0m;->t:La/c0o;

    .line 49
    .line 50
    invoke-virtual {v0, p2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, La/r0m;

    .line 55
    .line 56
    iput-object p2, p0, La/yoe;->d:La/r0m;

    .line 57
    .line 58
    :try_start_0
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 59
    .line 60
    invoke-static {p1, v2}, La/tnq0;->i(Landroid/content/res/TypedArray;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p2

    .line 73
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 74
    .line 75
    new-instance v0, La/g0g0;

    .line 76
    .line 77
    invoke-direct {v0, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object p2, v0

    .line 81
    :goto_0
    nop

    .line 82
    instance-of v0, p2, La/g0g0;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    move-object p2, v1

    .line 88
    :cond_0
    check-cast p2, Ljava/lang/Integer;

    .line 89
    .line 90
    const/16 v0, 0x9

    .line 91
    .line 92
    :try_start_1
    invoke-static {p1, v0}, La/tnq0;->i(Landroid/content/res/TypedArray;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const-string v0, "Attribute value could not be coerced to String."

    .line 103
    .line 104
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 112
    .line 113
    new-instance v2, La/g0g0;

    .line 114
    .line 115
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v0, v2

    .line 119
    :goto_1
    nop

    .line 120
    instance-of v2, v0, La/g0g0;

    .line 121
    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    move-object v1, v0

    .line 126
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0, p2, v1}, La/yoe;->d(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final c(Ljava/lang/Integer;)V
    .locals 5

    .line 1
    iput-object p1, p0, La/yoe;->h:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 10
    .line 11
    iget-object v1, p0, La/yoe;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x6

    .line 22
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/yoe;->d:La/r0m;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 28
    .line 29
    .line 30
    iget v2, p0, La/yoe;->e:I

    .line 31
    .line 32
    iget v3, p0, La/yoe;->f:I

    .line 33
    .line 34
    iget v4, p0, La/yoe;->g:I

    .line 35
    .line 36
    invoke-virtual {v0, v2, v3, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;->g(III)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, La/yoe;->b:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, La/yoe;->j:Ljava/lang/Integer;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iput-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 56
    .line 57
    :cond_1
    iget-object p0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public final d(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/yoe;->c(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput-object p1, p0, La/yoe;->h:Ljava/lang/Integer;

    .line 8
    .line 9
    iput-object p2, p0, La/yoe;->i:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    new-instance v0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 18
    .line 19
    iget-object v1, p0, La/yoe;->a:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x6

    .line 30
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, La/yoe;->d:La/r0m;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 36
    .line 37
    .line 38
    iget v2, p0, La/yoe;->e:I

    .line 39
    .line 40
    iget v3, p0, La/yoe;->f:I

    .line 41
    .line 42
    iget v4, p0, La/yoe;->g:I

    .line 43
    .line 44
    invoke-virtual {v0, v2, v3, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;->g(III)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, La/yoe;->b:Lkotlin/jvm/functions/Function0;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, La/yoe;->j:Ljava/lang/Integer;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iput-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 64
    .line 65
    :cond_2
    iget-object p0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/uikit/components/counter/DsCounter;->d(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public final e(Ljava/lang/Integer;II)V
    .locals 5

    .line 1
    iput-object p1, p0, La/yoe;->h:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 10
    .line 11
    iget-object v1, p0, La/yoe;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x6

    .line 22
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/yoe;->d:La/r0m;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 28
    .line 29
    .line 30
    iget v2, p0, La/yoe;->e:I

    .line 31
    .line 32
    invoke-virtual {v0, v2, p2, p3}, Lorg/xplatform/uikit/components/counter/DsCounter;->g(III)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, La/yoe;->b:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-virtual {v0, v1, p2}, Lorg/xplatform/uikit/components/counter/DsCounter;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, La/yoe;->j:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {v0, p2}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iput-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 52
    .line 53
    :cond_1
    iget-object p0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 54
    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/yoe;->j:Ljava/lang/Integer;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method
