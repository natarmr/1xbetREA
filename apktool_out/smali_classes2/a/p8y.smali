.class public final La/p8y;
.super La/flc;
.source "SourceFile"

# interfaces
.implements La/o8y;


# instance fields
.field public g1:Ljava/lang/Boolean;

.field public h1:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(La/wm40;La/p8y;La/g93;ZILa/gmk0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-eqz p3, :cond_2

    .line 5
    .line 6
    if-eqz p5, :cond_1

    .line 7
    .line 8
    if-eqz p6, :cond_0

    .line 9
    .line 10
    invoke-direct/range {p0 .. p6}, La/flc;-><init>(La/wm40;La/x4e;La/g93;ZILa/gmk0;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/p8y;->g1:Ljava/lang/Boolean;

    .line 14
    .line 15
    iput-object v0, p0, La/p8y;->h1:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 p0, 0x3

    .line 19
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :cond_1
    const/4 p0, 0x2

    .line 24
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_2
    const/4 p0, 0x1

    .line 29
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_3
    const/4 p0, 0x0

    .line 34
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public static F1(La/wm40;La/g93;ZLa/rog0;)La/p8y;
    .locals 7

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, La/p8y;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    move-object v1, p0

    .line 8
    move-object v3, p1

    .line 9
    move v4, p2

    .line 10
    move-object v6, p3

    .line 11
    invoke-direct/range {v0 .. v6}, La/p8y;-><init>(La/wm40;La/p8y;La/g93;ZILa/gmk0;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 p0, 0x4

    .line 16
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public static synthetic k0(I)V
    .locals 9

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    if-eq p0, v1, :cond_0

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    .line 13
    .line 14
    :goto_0
    const/4 v3, 0x2

    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v4, v3

    .line 22
    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v5, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor"

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    packed-switch p0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    const-string v7, "containingDeclaration"

    .line 31
    .line 32
    aput-object v7, v4, v6

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :pswitch_1
    const-string v7, "enhancedReturnType"

    .line 36
    .line 37
    aput-object v7, v4, v6

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :pswitch_2
    const-string v7, "enhancedValueParameterTypes"

    .line 41
    .line 42
    aput-object v7, v4, v6

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :pswitch_3
    const-string v7, "sourceElement"

    .line 46
    .line 47
    aput-object v7, v4, v6

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :pswitch_4
    aput-object v5, v4, v6

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :pswitch_5
    const-string v7, "newOwner"

    .line 54
    .line 55
    aput-object v7, v4, v6

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :pswitch_6
    const-string v7, "source"

    .line 59
    .line 60
    aput-object v7, v4, v6

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :pswitch_7
    const-string v7, "kind"

    .line 64
    .line 65
    aput-object v7, v4, v6

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :pswitch_8
    const-string v7, "annotations"

    .line 69
    .line 70
    aput-object v7, v4, v6

    .line 71
    .line 72
    :goto_2
    const-string v6, "createSubstitutedCopy"

    .line 73
    .line 74
    const-string v7, "enhance"

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    if-eq p0, v1, :cond_3

    .line 78
    .line 79
    if-eq p0, v0, :cond_2

    .line 80
    .line 81
    aput-object v5, v4, v8

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    aput-object v7, v4, v8

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    aput-object v6, v4, v8

    .line 88
    .line 89
    :goto_3
    packed-switch p0, :pswitch_data_1

    .line 90
    .line 91
    .line 92
    const-string v5, "<init>"

    .line 93
    .line 94
    aput-object v5, v4, v3

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :pswitch_9
    aput-object v7, v4, v3

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :pswitch_a
    const-string v5, "createDescriptor"

    .line 101
    .line 102
    aput-object v5, v4, v3

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :pswitch_b
    aput-object v6, v4, v3

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :pswitch_c
    const-string v5, "createJavaConstructor"

    .line 109
    .line 110
    aput-object v5, v4, v3

    .line 111
    .line 112
    :goto_4
    :pswitch_d
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eq p0, v1, :cond_4

    .line 117
    .line 118
    if-eq p0, v0, :cond_4

    .line 119
    .line 120
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_5
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_d
    .end packed-switch
.end method


# virtual methods
.method public final G1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/p8y;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    if-eqz p3, :cond_5

    .line 5
    .line 6
    if-eqz p4, :cond_4

    .line 7
    .line 8
    if-eqz p5, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p3, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne p3, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    new-instance p4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string p5, "Attempt at creating a constructor that is not a declaration: \ncopy from: "

    .line 22
    .line 23
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, "\nnewOwner: "

    .line 30
    .line 31
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {p3}, La/h97;->C(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "\nkind: "

    .line 42
    .line 43
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p2

    .line 57
    :cond_1
    :goto_0
    move-object v1, p1

    .line 58
    check-cast v1, La/wm40;

    .line 59
    .line 60
    move-object v2, p2

    .line 61
    check-cast v2, La/p8y;

    .line 62
    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    new-instance v0, La/p8y;

    .line 66
    .line 67
    iget-boolean v4, p0, La/flc;->f1:Z

    .line 68
    .line 69
    move v5, p3

    .line 70
    move-object v3, p4

    .line 71
    move-object v6, p5

    .line 72
    invoke-direct/range {v0 .. v6}, La/p8y;-><init>(La/wm40;La/p8y;La/g93;ZILa/gmk0;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, La/p8y;->g1:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iput-object p1, v0, La/p8y;->g1:Ljava/lang/Boolean;

    .line 81
    .line 82
    iget-object p0, p0, La/p8y;->h1:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iput-object p0, v0, La/p8y;->h1:Ljava/lang/Boolean;

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    const/16 p0, 0xd

    .line 91
    .line 92
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_3
    const/16 p0, 0xa

    .line 97
    .line 98
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :cond_4
    const/16 p0, 0x9

    .line 103
    .line 104
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_5
    const/16 p0, 0x8

    .line 109
    .line 110
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_6
    const/4 p0, 0x7

    .line 115
    invoke-static {p0}, La/p8y;->k0(I)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method

.method public final P()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/p8y;->h1:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final a0(La/wsy;Ljava/util/ArrayList;La/wsy;Lkotlin/Pair;)La/o8y;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p3, :cond_3

    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, La/flc;->A1()La/wm40;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-virtual/range {p0 .. p0}, La/oer;->l()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    invoke-virtual/range {p0 .. p0}, La/p4;->getAnnotations()La/g93;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    invoke-virtual/range {p0 .. p0}, La/yjj;->b()La/gmk0;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object/from16 v3, p0

    .line 26
    .line 27
    invoke-virtual/range {v3 .. v8}, La/p8y;->G1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/p8y;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    :goto_0
    move-object/from16 v3, p0

    .line 34
    .line 35
    move-object v10, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    sget-object v2, La/ujn;->c:La/f93;

    .line 38
    .line 39
    invoke-static {v9, v0, v2}, La/obb;->S(La/kp9;La/wsy;La/g93;)La/c8z;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_0

    .line 44
    :goto_1
    iget-object v11, v3, La/oer;->k:La/c8z;

    .line 45
    .line 46
    sget-object v12, La/iun;->a:La/iun;

    .line 47
    .line 48
    invoke-virtual {v3}, La/oer;->getTypeParameters()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    invoke-virtual {v3}, La/oer;->z()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object/from16 v2, p2

    .line 57
    .line 58
    invoke-static {v2, v0, v9}, La/pvm0;->o(Ljava/util/ArrayList;Ljava/util/List;La/mer;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    invoke-virtual {v3}, La/oer;->m()La/gm40;

    .line 63
    .line 64
    .line 65
    move-result-object v16

    .line 66
    invoke-virtual {v3}, La/oer;->getVisibility()La/tek;

    .line 67
    .line 68
    .line 69
    move-result-object v17

    .line 70
    move-object/from16 v15, p3

    .line 71
    .line 72
    invoke-virtual/range {v9 .. v17}, La/oer;->t1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;)V

    .line 73
    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object v0, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/ifk;

    .line 80
    .line 81
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v2, v9, La/oer;->Z:Ljava/util/Map;

    .line 84
    .line 85
    if-nez v2, :cond_1

    .line 86
    .line 87
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v2, v9, La/oer;->Z:Ljava/util/Map;

    .line 93
    .line 94
    :cond_1
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_2
    return-object v9

    .line 98
    :cond_3
    const/16 v0, 0x11

    .line 99
    .line 100
    invoke-static {v0}, La/p8y;->k0(I)V

    .line 101
    .line 102
    .line 103
    throw v2
.end method

.method public final bridge synthetic q1(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)La/oer;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, La/p8y;->G1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/p8y;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final v1(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, La/p8y;->g1:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public final w1(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, La/p8y;->h1:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public final bridge synthetic y1(ILa/g93;La/vjj;La/mer;La/g950;La/gmk0;)La/flc;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, La/p8y;->G1(La/vjj;La/mer;ILa/g93;La/gmk0;)La/p8y;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
