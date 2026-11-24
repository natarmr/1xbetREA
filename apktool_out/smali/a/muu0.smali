.class public abstract La/muu0;
.super La/gms0;
.source "SourceFile"


# static fields
.field public static final k1:[Ljava/lang/String;


# instance fields
.field public j1:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "android:visibility:visibility"

    .line 2
    .line 3
    const-string v1, "android:visibility:parent"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, La/muu0;->k1:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, La/gms0;-><init>()V

    const/4 v0, 0x3

    .line 32
    iput v0, p0, La/muu0;->j1:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, La/gms0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, La/muu0;->j1:I

    .line 6
    .line 7
    sget-object v0, La/x4d0;->i:[I

    .line 8
    .line 9
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p2, Landroid/content/res/XmlResourceParser;

    .line 14
    .line 15
    const-string v0, "transitionVisibilityMode"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {p1, p2, v0, v1, v1}, La/zsm0;->p(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p2}, La/muu0;->Y(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static U(La/mns0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/mns0;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p0, p0, La/mns0;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v2, "android:visibility:visibility"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v1, "android:visibility:parent"

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "android:visibility:screenLocation"

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static V(La/mns0;La/mns0;)La/ujf0;
    .locals 8

    .line 1
    new-instance v0, La/ujf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, La/ujf0;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, La/ujf0;->b:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, -0x1

    .line 13
    const-string v4, "android:visibility:parent"

    .line 14
    .line 15
    const-string v5, "android:visibility:visibility"

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object v6, p0, La/mns0;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v7, v0, La/ujf0;->c:I

    .line 38
    .line 39
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroid/view/ViewGroup;

    .line 44
    .line 45
    iput-object v6, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v3, v0, La/ujf0;->c:I

    .line 49
    .line 50
    iput-object v2, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 51
    .line 52
    :goto_0
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v6, p1, La/mns0;->a:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, v0, La/ujf0;->d:I

    .line 73
    .line 74
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/view/ViewGroup;

    .line 79
    .line 80
    iput-object v2, v0, La/ujf0;->f:Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iput v3, v0, La/ujf0;->d:I

    .line 84
    .line 85
    iput-object v2, v0, La/ujf0;->f:Ljava/lang/Object;

    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x1

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iget p0, v0, La/ujf0;->c:I

    .line 93
    .line 94
    iget p1, v0, La/ujf0;->d:I

    .line 95
    .line 96
    if-ne p0, p1, :cond_2

    .line 97
    .line 98
    iget-object v3, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Landroid/view/ViewGroup;

    .line 101
    .line 102
    iget-object v4, v0, La/ujf0;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-ne v3, v4, :cond_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    if-eq p0, p1, :cond_4

    .line 110
    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iput-boolean v1, v0, La/ujf0;->b:Z

    .line 114
    .line 115
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_3
    if-nez p1, :cond_8

    .line 119
    .line 120
    iput-boolean v2, v0, La/ujf0;->b:Z

    .line 121
    .line 122
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_4
    iget-object p0, v0, La/ujf0;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-nez p0, :cond_5

    .line 130
    .line 131
    iput-boolean v1, v0, La/ujf0;->b:Z

    .line 132
    .line 133
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_5
    iget-object p0, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Landroid/view/ViewGroup;

    .line 139
    .line 140
    if-nez p0, :cond_8

    .line 141
    .line 142
    iput-boolean v2, v0, La/ujf0;->b:Z

    .line 143
    .line 144
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_6
    if-nez p0, :cond_7

    .line 148
    .line 149
    iget p0, v0, La/ujf0;->d:I

    .line 150
    .line 151
    if-nez p0, :cond_7

    .line 152
    .line 153
    iput-boolean v2, v0, La/ujf0;->b:Z

    .line 154
    .line 155
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_7
    if-nez p1, :cond_8

    .line 159
    .line 160
    iget p0, v0, La/ujf0;->c:I

    .line 161
    .line 162
    if-nez p0, :cond_8

    .line 163
    .line 164
    iput-boolean v1, v0, La/ujf0;->b:Z

    .line 165
    .line 166
    iput-boolean v2, v0, La/ujf0;->a:Z

    .line 167
    .line 168
    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final C(La/mns0;La/mns0;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p0, p2, La/mns0;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v0, "android:visibility:visibility"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v1, p1, La/mns0;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1, p2}, La/muu0;->V(La/mns0;La/mns0;)La/ujf0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-boolean p1, p0, La/ujf0;->a:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget p1, p0, La/ujf0;->c:I

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p0, p0, La/ujf0;->d:I

    .line 40
    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    :cond_2
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public abstract W(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;
.end method

.method public abstract X(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;
.end method

.method public final Y(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, -0x4

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, La/muu0;->j1:I

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Only MODE_IN and MODE_OUT flags are allowed"

    .line 9
    .line 10
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public f(La/mns0;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/muu0;->U(La/mns0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public o(Landroid/view/ViewGroup;La/mns0;La/mns0;)Landroid/animation/Animator;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-static/range {p2 .. p3}, La/muu0;->V(La/mns0;La/mns0;)La/ujf0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-boolean v5, v4, La/ujf0;->a:Z

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    iget-object v5, v4, La/ujf0;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 31
    .line 32
    goto/16 :goto_d

    .line 33
    .line 34
    :cond_1
    :goto_1
    iget-boolean v5, v4, La/ujf0;->b:Z

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v5, :cond_4

    .line 39
    .line 40
    iget v4, v0, La/muu0;->j1:I

    .line 41
    .line 42
    and-int/2addr v4, v7

    .line 43
    if-ne v4, v7, :cond_0

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v4, v3, La/mns0;->b:Landroid/view/View;

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v0, v5, v8}, La/gms0;->v(Landroid/view/View;Z)La/mns0;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v0, v5, v8}, La/gms0;->A(Landroid/view/View;Z)La/mns0;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v7, v5}, La/muu0;->V(La/mns0;La/mns0;)La/ujf0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-boolean v5, v5, La/ujf0;->a:Z

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {v0, v1, v4, v2, v3}, La/muu0;->W(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :cond_4
    iget v4, v4, La/ujf0;->d:I

    .line 81
    .line 82
    iget v5, v0, La/muu0;->j1:I

    .line 83
    .line 84
    const/4 v9, 0x2

    .line 85
    and-int/2addr v5, v9

    .line 86
    if-eq v5, v9, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    if-nez v2, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    iget-object v5, v2, La/mns0;->b:Landroid/view/View;

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    iget-object v10, v3, La/mns0;->b:Landroid/view/View;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    const/4 v10, 0x0

    .line 100
    :goto_2
    const v11, 0x7f0a0cbd

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v11}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, Landroid/view/View;

    .line 108
    .line 109
    if-eqz v12, :cond_8

    .line 110
    .line 111
    move/from16 v22, v4

    .line 112
    .line 113
    move/from16 v17, v7

    .line 114
    .line 115
    move/from16 v18, v8

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    goto/16 :goto_c

    .line 121
    .line 122
    :cond_8
    if-eqz v10, :cond_c

    .line 123
    .line 124
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    if-nez v12, :cond_9

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    const/4 v12, 0x4

    .line 132
    if-ne v4, v12, :cond_a

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_a
    if-ne v5, v10, :cond_b

    .line 136
    .line 137
    :goto_3
    move v13, v8

    .line 138
    move-object v12, v10

    .line 139
    const/4 v10, 0x0

    .line 140
    goto :goto_6

    .line 141
    :cond_b
    move v13, v7

    .line 142
    const/4 v10, 0x0

    .line 143
    :goto_4
    const/4 v12, 0x0

    .line 144
    goto :goto_6

    .line 145
    :cond_c
    :goto_5
    if-eqz v10, :cond_b

    .line 146
    .line 147
    move v13, v8

    .line 148
    goto :goto_4

    .line 149
    :goto_6
    if-eqz v13, :cond_15

    .line 150
    .line 151
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    if-nez v13, :cond_d

    .line 156
    .line 157
    move/from16 v22, v4

    .line 158
    .line 159
    move/from16 v17, v7

    .line 160
    .line 161
    move v7, v8

    .line 162
    move/from16 v18, v7

    .line 163
    .line 164
    move-object v6, v12

    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    move-object v12, v5

    .line 168
    goto/16 :goto_c

    .line 169
    .line 170
    :cond_d
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    instance-of v13, v13, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v13, :cond_15

    .line 177
    .line 178
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    check-cast v13, Landroid/view/View;

    .line 183
    .line 184
    invoke-virtual {v0, v13, v7}, La/gms0;->A(Landroid/view/View;Z)La/mns0;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-virtual {v0, v13, v7}, La/gms0;->v(Landroid/view/View;Z)La/mns0;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    invoke-static {v14, v15}, La/muu0;->V(La/mns0;La/mns0;)La/ujf0;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    iget-boolean v14, v14, La/ujf0;->a:Z

    .line 197
    .line 198
    if-nez v14, :cond_14

    .line 199
    .line 200
    sget-boolean v10, La/lns0;->a:Z

    .line 201
    .line 202
    new-instance v10, Landroid/graphics/Matrix;

    .line 203
    .line 204
    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v13}, Landroid/view/View;->getScrollX()I

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    neg-int v14, v14

    .line 212
    int-to-float v14, v14

    .line 213
    invoke-virtual {v13}, Landroid/view/View;->getScrollY()I

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    neg-int v13, v13

    .line 218
    int-to-float v13, v13

    .line 219
    invoke-virtual {v10, v14, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 220
    .line 221
    .line 222
    sget-object v13, La/bmu0;->a:La/hmu0;

    .line 223
    .line 224
    invoke-virtual {v13, v5, v10}, La/hmu0;->K(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13, v1, v10}, La/hmu0;->L(Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V

    .line 228
    .line 229
    .line 230
    new-instance v13, Landroid/graphics/RectF;

    .line 231
    .line 232
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    int-to-float v14, v14

    .line 237
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    int-to-float v15, v15

    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    invoke-direct {v13, v6, v6, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v13}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 249
    .line 250
    .line 251
    iget v6, v13, Landroid/graphics/RectF;->left:F

    .line 252
    .line 253
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    iget v14, v13, Landroid/graphics/RectF;->top:F

    .line 258
    .line 259
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    iget v15, v13, Landroid/graphics/RectF;->right:F

    .line 264
    .line 265
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    move/from16 v17, v7

    .line 270
    .line 271
    iget v7, v13, Landroid/graphics/RectF;->bottom:F

    .line 272
    .line 273
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    move/from16 v18, v8

    .line 278
    .line 279
    new-instance v8, Landroid/widget/ImageView;

    .line 280
    .line 281
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    invoke-direct {v8, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 286
    .line 287
    .line 288
    sget-object v11, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 289
    .line 290
    invoke-virtual {v8, v11}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 298
    .line 299
    .line 300
    move-result v19

    .line 301
    if-nez v11, :cond_f

    .line 302
    .line 303
    if-nez v19, :cond_e

    .line 304
    .line 305
    move/from16 v22, v4

    .line 306
    .line 307
    move-object/from16 v21, v12

    .line 308
    .line 309
    move-object/from16 v0, v16

    .line 310
    .line 311
    goto/16 :goto_9

    .line 312
    .line 313
    :cond_e
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 314
    .line 315
    .line 316
    move-result-object v19

    .line 317
    move-object/from16 v9, v19

    .line 318
    .line 319
    check-cast v9, Landroid/view/ViewGroup;

    .line 320
    .line 321
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 322
    .line 323
    .line 324
    move-result v19

    .line 325
    move-object/from16 v20, v9

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-virtual {v9, v5}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    move/from16 v9, v19

    .line 335
    .line 336
    move/from16 v19, v11

    .line 337
    .line 338
    move v11, v9

    .line 339
    move-object/from16 v9, v20

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_f
    move/from16 v19, v11

    .line 343
    .line 344
    move-object/from16 v9, v16

    .line 345
    .line 346
    move/from16 v11, v18

    .line 347
    .line 348
    :goto_7
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 349
    .line 350
    .line 351
    move-result v20

    .line 352
    move-object/from16 v21, v12

    .line 353
    .line 354
    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->round(F)I

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 359
    .line 360
    .line 361
    move-result v20

    .line 362
    move/from16 v22, v4

    .line 363
    .line 364
    invoke-static/range {v20 .. v20}, Ljava/lang/Math;->round(F)I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    if-lez v12, :cond_11

    .line 369
    .line 370
    if-lez v4, :cond_11

    .line 371
    .line 372
    mul-int v0, v12, v4

    .line 373
    .line 374
    int-to-float v0, v0

    .line 375
    const/high16 v20, 0x49800000    # 1048576.0f

    .line 376
    .line 377
    div-float v0, v20, v0

    .line 378
    .line 379
    const/high16 v3, 0x3f800000    # 1.0f

    .line 380
    .line 381
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    int-to-float v3, v12

    .line 386
    mul-float/2addr v3, v0

    .line 387
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    int-to-float v4, v4

    .line 392
    mul-float/2addr v4, v0

    .line 393
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    iget v12, v13, Landroid/graphics/RectF;->left:F

    .line 398
    .line 399
    neg-float v12, v12

    .line 400
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 401
    .line 402
    neg-float v13, v13

    .line 403
    invoke-virtual {v10, v12, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 404
    .line 405
    .line 406
    invoke-virtual {v10, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 407
    .line 408
    .line 409
    sget-boolean v0, La/lns0;->a:Z

    .line 410
    .line 411
    if-eqz v0, :cond_10

    .line 412
    .line 413
    new-instance v0, Landroid/graphics/Picture;

    .line 414
    .line 415
    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    .line 429
    .line 430
    .line 431
    invoke-static {v0}, La/jns0;->a(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    goto :goto_8

    .line 436
    :cond_10
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 437
    .line 438
    invoke-static {v3, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    new-instance v3, Landroid/graphics/Canvas;

    .line 443
    .line 444
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 451
    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_11
    move-object/from16 v0, v16

    .line 455
    .line 456
    :goto_8
    if-nez v19, :cond_12

    .line 457
    .line 458
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    invoke-virtual {v3, v5}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v9, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 466
    .line 467
    .line 468
    :cond_12
    :goto_9
    if-eqz v0, :cond_13

    .line 469
    .line 470
    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 471
    .line 472
    .line 473
    :cond_13
    sub-int v0, v15, v6

    .line 474
    .line 475
    const/high16 v3, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    sub-int v4, v7, v14

    .line 482
    .line 483
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    invoke-virtual {v8, v0, v3}, Landroid/view/View;->measure(II)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v8, v6, v14, v15, v7}, Landroid/view/View;->layout(IIII)V

    .line 491
    .line 492
    .line 493
    move-object v12, v8

    .line 494
    :goto_a
    move/from16 v7, v18

    .line 495
    .line 496
    move-object/from16 v6, v21

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_14
    move/from16 v22, v4

    .line 500
    .line 501
    move/from16 v17, v7

    .line 502
    .line 503
    move/from16 v18, v8

    .line 504
    .line 505
    move-object/from16 v21, v12

    .line 506
    .line 507
    const/16 v16, 0x0

    .line 508
    .line 509
    invoke-virtual {v13}, Landroid/view/View;->getId()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    if-nez v3, :cond_16

    .line 518
    .line 519
    const/4 v3, -0x1

    .line 520
    if-eq v0, v3, :cond_16

    .line 521
    .line 522
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 523
    .line 524
    .line 525
    goto :goto_b

    .line 526
    :cond_15
    move/from16 v22, v4

    .line 527
    .line 528
    move/from16 v17, v7

    .line 529
    .line 530
    move/from16 v18, v8

    .line 531
    .line 532
    move-object/from16 v21, v12

    .line 533
    .line 534
    const/16 v16, 0x0

    .line 535
    .line 536
    :cond_16
    :goto_b
    move-object v12, v10

    .line 537
    goto :goto_a

    .line 538
    :goto_c
    if-eqz v12, :cond_1a

    .line 539
    .line 540
    if-nez v7, :cond_17

    .line 541
    .line 542
    iget-object v0, v2, La/mns0;->a:Ljava/util/HashMap;

    .line 543
    .line 544
    const-string v3, "android:visibility:screenLocation"

    .line 545
    .line 546
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, [I

    .line 551
    .line 552
    aget v3, v0, v18

    .line 553
    .line 554
    aget v0, v0, v17

    .line 555
    .line 556
    const/4 v4, 0x2

    .line 557
    new-array v4, v4, [I

    .line 558
    .line 559
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 560
    .line 561
    .line 562
    aget v6, v4, v18

    .line 563
    .line 564
    sub-int/2addr v3, v6

    .line 565
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    sub-int/2addr v3, v6

    .line 570
    invoke-virtual {v12, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 571
    .line 572
    .line 573
    aget v3, v4, v17

    .line 574
    .line 575
    sub-int/2addr v0, v3

    .line 576
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    sub-int/2addr v0, v3

    .line 581
    invoke-virtual {v12, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0, v12}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 589
    .line 590
    .line 591
    :cond_17
    move-object/from16 v0, p0

    .line 592
    .line 593
    move-object/from16 v3, p3

    .line 594
    .line 595
    invoke-virtual {v0, v1, v12, v2, v3}, La/muu0;->X(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    if-nez v7, :cond_19

    .line 600
    .line 601
    if-nez v2, :cond_18

    .line 602
    .line 603
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0, v12}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 608
    .line 609
    .line 610
    return-object v2

    .line 611
    :cond_18
    const v3, 0x7f0a0cbd

    .line 612
    .line 613
    .line 614
    invoke-virtual {v5, v3, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    new-instance v3, La/luu0;

    .line 618
    .line 619
    invoke-direct {v3, v0, v1, v12, v5}, La/luu0;-><init>(La/muu0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0}, La/gms0;->w()La/gms0;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0, v3}, La/gms0;->a(La/dms0;)V

    .line 633
    .line 634
    .line 635
    :cond_19
    return-object v2

    .line 636
    :cond_1a
    move-object/from16 v0, p0

    .line 637
    .line 638
    move-object/from16 v3, p3

    .line 639
    .line 640
    if-eqz v6, :cond_1c

    .line 641
    .line 642
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    move/from16 v5, v18

    .line 647
    .line 648
    invoke-static {v6, v5}, La/bmu0;->c(Landroid/view/View;I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0, v1, v6, v2, v3}, La/muu0;->X(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    if-eqz v1, :cond_1b

    .line 656
    .line 657
    new-instance v2, La/kuu0;

    .line 658
    .line 659
    move/from16 v3, v22

    .line 660
    .line 661
    invoke-direct {v2, v6, v3}, La/kuu0;-><init>(Landroid/view/View;I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, La/gms0;->w()La/gms0;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v0, v2}, La/gms0;->a(La/dms0;)V

    .line 672
    .line 673
    .line 674
    return-object v1

    .line 675
    :cond_1b
    invoke-static {v6, v4}, La/bmu0;->c(Landroid/view/View;I)V

    .line 676
    .line 677
    .line 678
    return-object v1

    .line 679
    :cond_1c
    :goto_d
    return-object v16
.end method

.method public final z()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, La/muu0;->k1:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
