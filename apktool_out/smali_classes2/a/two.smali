.class public abstract La/two;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/gi2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    sget-object v1, La/ske;->y:La/ske;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, La/ske;->z:La/ske;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    invoke-static {v0}, La/hdd;->a([Lkotlin/jvm/functions/Function1;)La/gi2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/two;->a:La/gi2;

    .line 19
    .line 20
    return-void
.end method

.method public static final a(La/kiy;Ljava/lang/String;)La/kiy;
    .locals 7

    .line 1
    instance-of v0, p0, La/v2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, La/v2;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, La/kiy;->o()La/fhy;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v2, v2, La/d2o;

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    instance-of v2, v0, La/wdk;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    check-cast v0, La/wdk;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_1
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget-object v0, v0, La/wdk;->b:La/wsy;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-static {v0}, La/bdx;->k0(La/wsy;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    :cond_2
    return-object p0

    .line 43
    :cond_3
    invoke-interface {p0}, La/kiy;->o()La/fhy;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    invoke-interface {p0}, La/kiy;->M()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v4, 0xa

    .line 56
    .line 57
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Lkotlin/reflect/KTypeProjection;

    .line 79
    .line 80
    iget-object v5, v4, Lkotlin/reflect/KTypeProjection;->b:La/kiy;

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    invoke-static {v5, p1}, La/two;->a(La/kiy;Ljava/lang/String;)La/kiy;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v5, v1

    .line 90
    :goto_3
    iget-object v4, v4, Lkotlin/reflect/KTypeProjection;->a:La/uiy;

    .line 91
    .line 92
    new-instance v6, Lkotlin/reflect/KTypeProjection;

    .line 93
    .line 94
    invoke-direct {v6, v5, v4}, Lkotlin/reflect/KTypeProjection;-><init>(La/kiy;La/uiy;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    invoke-interface {p0}, La/pgy;->getAnnotations()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const/16 p1, 0x8

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-static {v0, v3, v1, p0, p1}, La/x2x;->P(La/fhy;Ljava/util/List;ZLjava/util/List;I)La/v2;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v2, "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type \'"

    .line 118
    .line 119
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    sget-object v2, La/sre0;->a:La/tre0;

    .line 130
    .line 131
    invoke-virtual {v2, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string v2, "\' ("

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string p0, ") which belongs to member \'"

    .line 144
    .line 145
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const/16 p0, 0x27

    .line 152
    .line 153
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0
.end method

.method public static final b(La/xgy;La/k0o;)Ljava/util/ArrayList;
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, La/xgy;->b()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/kiy;

    .line 28
    .line 29
    invoke-interface {v2}, La/kiy;->o()La/fhy;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    instance-of v4, v3, La/sgy;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    check-cast v3, La/sgy;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 v3, 0x0

    .line 41
    :goto_1
    if-nez v3, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v4, La/siy;->c:La/siy;

    .line 45
    .line 46
    invoke-static {v2}, La/b5x;->x(La/kiy;)La/siy;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v3}, La/two;->c(La/sgy;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, La/dre0;

    .line 79
    .line 80
    instance-of v5, v4, La/gre0;

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    move-object v5, v4

    .line 85
    check-cast v5, La/gre0;

    .line 86
    .line 87
    move-object v6, v5

    .line 88
    check-cast v6, La/ere0;

    .line 89
    .line 90
    iget-object v6, v6, La/ere0;->a:La/rgy;

    .line 91
    .line 92
    invoke-virtual {v6, v2}, La/rgy;->d(La/siy;)La/rgy;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v4}, La/two;->d(La/dre0;)La/ihy;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-interface {v5}, La/qgy;->getTypeParameters()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-static {v4}, La/two;->f(La/dre0;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/16 v18, 0x3e3

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v14, 0x0

    .line 120
    const/4 v15, 0x0

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    invoke-static/range {v7 .. v18}, La/rgy;->a(La/rgy;La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZI)La/rgy;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    move-object/from16 v7, p0

    .line 128
    .line 129
    invoke-interface {v5, v7, v6}, La/dre0;->H(La/ihy;La/rgy;)La/dre0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    sget-object v6, La/j0o;->a:La/j0o;

    .line 134
    .line 135
    invoke-static {v5, v6}, La/two;->h(La/dre0;La/vtb;)La/k0o;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    move-object/from16 v6, p1

    .line 140
    .line 141
    invoke-virtual {v6, v5}, La/k0o;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_2

    .line 146
    .line 147
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    move-object/from16 v7, p0

    .line 152
    .line 153
    move-object/from16 v6, p1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move-object/from16 v7, p0

    .line 157
    .line 158
    move-object/from16 v6, p1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_5
    return-object v0
.end method

.method public static final c(La/sgy;)Ljava/util/Map;
    .locals 2

    .line 1
    instance-of v0, p0, La/xgy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, La/xgy;

    .line 6
    .line 7
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 8
    .line 9
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/vgy;

    .line 14
    .line 15
    iget-object p0, p0, La/vgy;->p:La/mre0;

    .line 16
    .line 17
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 18
    .line 19
    const/16 v1, 0xc

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p0, Ljava/util/Map;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    instance-of v0, p0, La/yx40;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    check-cast p0, La/yx40;

    .line 38
    .line 39
    invoke-interface {p0}, La/yx40;->w()La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, La/two;->c(La/sgy;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v0, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v0, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "Unknown type "

    .line 59
    .line 60
    invoke-static {p0, v0}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public static final d(La/dre0;)La/ihy;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, La/ere0;

    .line 3
    .line 4
    iget-object v0, v0, La/ere0;->a:La/rgy;

    .line 5
    .line 6
    iget-object v0, v0, La/rgy;->d:La/ihy;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, La/dre0;->K()La/ihy;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object v0
.end method

.method public static final e(La/xgy;La/dre0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, La/qgy;->getVisibility()La/viy;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/viy;->d:La/viy;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, La/two;->f(La/dre0;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/xgy;->V()La/rlc;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, La/rlc;->c:La/rlc;

    .line 26
    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    instance-of p0, p1, La/iiy;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    check-cast p1, La/iiy;

    .line 34
    .line 35
    invoke-static {p1}, La/uvw;->y(La/iiy;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    const-class p1, Lkotlin/Metadata;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public static final f(La/dre0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    check-cast v0, La/ere0;

    .line 6
    .line 7
    iget-object v0, v0, La/ere0;->a:La/rgy;

    .line 8
    .line 9
    iget-object v0, v0, La/rgy;->c:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    instance-of v0, p0, La/n9y;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v0, p0

    .line 24
    check-cast v0, La/n9y;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    :goto_0
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, La/n9y;->h:La/a8z;

    .line 31
    .line 32
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/List;

    .line 37
    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    :cond_2
    invoke-interface {p0}, La/dre0;->a()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/hre0;

    .line 49
    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, La/hre0;->n()La/aiy;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_4
    sget-object p0, La/aiy;->a:La/aiy;

    .line 57
    .line 58
    if-eq v1, p0, :cond_5

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_5
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public static final g(Ljava/util/List;Ljava/util/List;)La/siy;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p0, La/siy;->c:La/siy;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/16 p1, 0xa

    .line 33
    .line 34
    invoke-static {p0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, La/wp20;->a(I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/16 v0, 0x10

    .line 43
    .line 44
    if-ge p1, v0, :cond_2

    .line 45
    .line 46
    move p1, v0

    .line 47
    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lkotlin/Pair;

    .line 67
    .line 68
    iget-object v1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, La/miy;

    .line 71
    .line 72
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, La/miy;

    .line 75
    .line 76
    sget-object v3, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    .line 77
    .line 78
    const/4 v4, 0x7

    .line 79
    invoke-static {p1, v2, v4}, La/x2x;->N(La/fhy;Ljava/util/List;I)La/v2;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance p0, La/siy;

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-direct {p0, v0, p1}, La/siy;-><init>(Ljava/util/Map;Z)V

    .line 98
    .line 99
    .line 100
    return-object p0
.end method

.method public static final h(La/dre0;La/vtb;)La/k0o;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, La/n9y;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, La/n9y;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, v1, La/n9y;->h:La/a8z;

    .line 19
    .line 20
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-interface {v0}, La/dre0;->a()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    move-object v5, v4

    .line 52
    check-cast v5, La/hre0;

    .line 53
    .line 54
    invoke-virtual {v5}, La/hre0;->n()La/aiy;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    sget-object v6, La/aiy;->a:La/aiy;

    .line 59
    .line 60
    if-eq v5, v6, :cond_3

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    new-instance v12, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 v1, 0xa

    .line 69
    .line 70
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, La/hre0;

    .line 92
    .line 93
    invoke-virtual {v3}, La/hre0;->p()La/kiy;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    instance-of v1, v0, La/iiy;

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    move-object v3, v0

    .line 106
    check-cast v3, La/iiy;

    .line 107
    .line 108
    invoke-static {v3}, La/uvw;->y(La/iiy;)Ljava/lang/reflect/Field;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    const-class v4, Lkotlin/Metadata;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-eqz v3, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    sget-object v1, La/guj0;->c:La/guj0;

    .line 130
    .line 131
    :goto_3
    move-object v8, v1

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    .line 134
    .line 135
    sget-object v1, La/guj0;->b:La/guj0;

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    instance-of v1, v0, La/jhy;

    .line 139
    .line 140
    if-eqz v1, :cond_10

    .line 141
    .line 142
    sget-object v1, La/guj0;->a:La/guj0;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :goto_5
    instance-of v1, v0, La/jhy;

    .line 146
    .line 147
    if-eqz v1, :cond_9

    .line 148
    .line 149
    move-object v1, v0

    .line 150
    check-cast v1, La/jhy;

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_9
    move-object v1, v2

    .line 154
    :goto_6
    if-eqz v1, :cond_a

    .line 155
    .line 156
    invoke-static {v1}, La/uvw;->z(La/jhy;)Ljava/lang/reflect/Method;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    goto :goto_7

    .line 161
    :cond_a
    move-object v1, v2

    .line 162
    :goto_7
    if-eqz v1, :cond_b

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    goto :goto_8

    .line 169
    :cond_b
    move-object v3, v2

    .line 170
    :goto_8
    const/4 v4, 0x0

    .line 171
    if-nez v3, :cond_c

    .line 172
    .line 173
    new-array v3, v4, [Ljava/lang/reflect/Type;

    .line 174
    .line 175
    :cond_c
    invoke-static {v3}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    if-eqz v1, :cond_d

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    goto :goto_9

    .line 186
    :cond_d
    move-object v3, v2

    .line 187
    :goto_9
    if-nez v3, :cond_e

    .line 188
    .line 189
    new-array v3, v4, [Ljava/lang/Class;

    .line 190
    .line 191
    :cond_e
    invoke-static {v3}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    if-eqz v1, :cond_f

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    :cond_f
    move-object v10, v2

    .line 202
    new-instance v7, La/k0o;

    .line 203
    .line 204
    invoke-interface {v0}, La/qgy;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-interface {v0}, La/qgy;->getTypeParameters()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-static {v0}, La/two;->f(La/dre0;)Z

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    move-object/from16 v16, p1

    .line 217
    .line 218
    invoke-direct/range {v7 .. v16}, La/k0o;-><init>(La/guj0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLa/vtb;)V

    .line 219
    .line 220
    .line 221
    return-object v7

    .line 222
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sget-object v1, La/sre0;->a:La/tre0;

    .line 227
    .line 228
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const-string v1, "Unknown kind for "

    .line 233
    .line 234
    invoke-static {v0, v1}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-object v2
.end method
