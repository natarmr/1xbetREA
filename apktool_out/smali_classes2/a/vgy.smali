.class public final La/vgy;
.super La/hhy;
.source "SourceFile"


# static fields
.field public static final synthetic r:[La/iiy;


# instance fields
.field public final c:La/a8z;

.field public final d:La/mre0;

.field public final e:La/mre0;

.field public final f:La/mre0;

.field public final g:La/mre0;

.field public final h:La/mre0;

.field public final i:La/mre0;

.field public final j:La/mre0;

.field public final k:La/mre0;

.field public final l:La/a8z;

.field public final m:La/a8z;

.field public final n:La/mre0;

.field public final o:La/mre0;

.field public final p:La/mre0;

.field public final synthetic q:La/xgy;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vgy;

    .line 4
    .line 5
    const-string v2, "descriptor"

    .line 6
    .line 7
    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "annotations"

    .line 16
    .line 17
    const-string v5, "getAnnotations()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "simpleName"

    .line 25
    .line 26
    const-string v6, "getSimpleName()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "qualifiedName"

    .line 34
    .line 35
    const-string v7, "getQualifiedName()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "constructors"

    .line 43
    .line 44
    const-string v8, "getConstructors()Ljava/util/Collection;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/j0d0;

    .line 50
    .line 51
    const-string v8, "nestedClasses"

    .line 52
    .line 53
    const-string v9, "getNestedClasses()Ljava/util/Collection;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/j0d0;

    .line 59
    .line 60
    const-string v9, "typeParameters"

    .line 61
    .line 62
    const-string v10, "getTypeParameters()Ljava/util/List;"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v9, La/j0d0;

    .line 68
    .line 69
    const-string v10, "typeParameterTable"

    .line 70
    .line 71
    const-string v11, "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;"

    .line 72
    .line 73
    invoke-direct {v9, v1, v10, v11, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    new-instance v10, La/j0d0;

    .line 77
    .line 78
    const-string v11, "supertypes"

    .line 79
    .line 80
    const-string v12, "getSupertypes()Ljava/util/List;"

    .line 81
    .line 82
    invoke-direct {v10, v1, v11, v12, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    new-instance v11, La/j0d0;

    .line 86
    .line 87
    const-string v12, "sealedSubclasses"

    .line 88
    .line 89
    const-string v13, "getSealedSubclasses()Ljava/util/List;"

    .line 90
    .line 91
    invoke-direct {v11, v1, v12, v13, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    new-instance v12, La/j0d0;

    .line 95
    .line 96
    const-string v13, "declaredMembers"

    .line 97
    .line 98
    const-string v14, "getDeclaredMembers()Ljava/util/Collection;"

    .line 99
    .line 100
    invoke-direct {v12, v1, v13, v14, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    new-instance v13, La/j0d0;

    .line 104
    .line 105
    const-string v14, "allMembers"

    .line 106
    .line 107
    const-string v15, "getAllMembers()Ljava/util/Collection;"

    .line 108
    .line 109
    invoke-direct {v13, v1, v14, v15, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    new-instance v14, La/j0d0;

    .line 113
    .line 114
    const-string v15, "fakeOverrideMembers"

    .line 115
    .line 116
    move-object/from16 v16, v0

    .line 117
    .line 118
    const-string v0, "getFakeOverrideMembers()Ljava/util/Map;"

    .line 119
    .line 120
    invoke-direct {v14, v1, v15, v0, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    const/16 v0, 0xd

    .line 124
    .line 125
    new-array v0, v0, [La/iiy;

    .line 126
    .line 127
    aput-object v16, v0, v4

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    aput-object v2, v0, v1

    .line 131
    .line 132
    const/4 v1, 0x2

    .line 133
    aput-object v3, v0, v1

    .line 134
    .line 135
    const/4 v1, 0x3

    .line 136
    aput-object v5, v0, v1

    .line 137
    .line 138
    const/4 v1, 0x4

    .line 139
    aput-object v6, v0, v1

    .line 140
    .line 141
    const/4 v1, 0x5

    .line 142
    aput-object v7, v0, v1

    .line 143
    .line 144
    const/4 v1, 0x6

    .line 145
    aput-object v8, v0, v1

    .line 146
    .line 147
    const/4 v1, 0x7

    .line 148
    aput-object v9, v0, v1

    .line 149
    .line 150
    const/16 v1, 0x8

    .line 151
    .line 152
    aput-object v10, v0, v1

    .line 153
    .line 154
    const/16 v1, 0x9

    .line 155
    .line 156
    aput-object v11, v0, v1

    .line 157
    .line 158
    const/16 v1, 0xa

    .line 159
    .line 160
    aput-object v12, v0, v1

    .line 161
    .line 162
    const/16 v1, 0xb

    .line 163
    .line 164
    aput-object v13, v0, v1

    .line 165
    .line 166
    const/16 v1, 0xc

    .line 167
    .line 168
    aput-object v14, v0, v1

    .line 169
    .line 170
    sput-object v0, La/vgy;->r:[La/iiy;

    .line 171
    .line 172
    return-void
.end method

.method public constructor <init>(La/xgy;)V
    .locals 10

    .line 1
    iput-object p1, p0, La/vgy;->q:La/xgy;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, La/hhy;-><init>(La/ihy;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, La/wez;->a:La/wez;

    .line 7
    .line 8
    new-instance v1, La/ugy;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p1, p0, v3}, La/ugy;-><init>(La/xgy;La/vgy;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, La/vgy;->c:La/a8z;

    .line 19
    .line 20
    new-instance v1, La/tgy;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-direct {v1, p1, v3}, La/tgy;-><init>(La/xgy;B)V

    .line 24
    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, La/vgy;->d:La/mre0;

    .line 32
    .line 33
    new-instance v1, La/tgy;

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    invoke-direct {v1, p1, p0, v4}, La/tgy;-><init>(La/xgy;La/vgy;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, La/vgy;->e:La/mre0;

    .line 44
    .line 45
    new-instance v1, La/tgy;

    .line 46
    .line 47
    const/4 v9, 0x4

    .line 48
    invoke-direct {v1, p1, p0, v9}, La/tgy;-><init>(La/xgy;La/vgy;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p0, La/vgy;->f:La/mre0;

    .line 56
    .line 57
    new-instance v1, La/tgy;

    .line 58
    .line 59
    const/4 v5, 0x5

    .line 60
    invoke-direct {v1, p1, v5}, La/tgy;-><init>(La/xgy;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/vgy;->g:La/mre0;

    .line 68
    .line 69
    new-instance v1, La/ugy;

    .line 70
    .line 71
    invoke-direct {v1, p1, p0, v5}, La/ugy;-><init>(La/xgy;La/vgy;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, La/vgy;->h:La/mre0;

    .line 79
    .line 80
    new-instance v1, La/ugy;

    .line 81
    .line 82
    const/4 v5, 0x6

    .line 83
    invoke-direct {v1, p0, p1, v5}, La/ugy;-><init>(La/vgy;La/xgy;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 87
    .line 88
    .line 89
    new-instance v1, La/ugy;

    .line 90
    .line 91
    const/4 v5, 0x7

    .line 92
    invoke-direct {v1, p0, p1, v5}, La/ugy;-><init>(La/vgy;La/xgy;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 96
    .line 97
    .line 98
    new-instance v1, La/ugy;

    .line 99
    .line 100
    const/16 v5, 0x8

    .line 101
    .line 102
    invoke-direct {v1, p0, p1, v5}, La/ugy;-><init>(La/vgy;La/xgy;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, p0, La/vgy;->i:La/mre0;

    .line 110
    .line 111
    new-instance v1, La/ugy;

    .line 112
    .line 113
    const/16 v5, 0x9

    .line 114
    .line 115
    invoke-direct {v1, p0, p1, v5}, La/ugy;-><init>(La/vgy;La/xgy;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, p0, La/vgy;->j:La/mre0;

    .line 123
    .line 124
    new-instance v1, La/ugy;

    .line 125
    .line 126
    const/4 v5, 0x1

    .line 127
    invoke-direct {v1, p1, p0, v5}, La/ugy;-><init>(La/xgy;La/vgy;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iput-object v1, p0, La/vgy;->k:La/mre0;

    .line 135
    .line 136
    new-instance v1, La/ugy;

    .line 137
    .line 138
    invoke-direct {v1, p1, p0, v3}, La/ugy;-><init>(La/xgy;La/vgy;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v8, v1}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 142
    .line 143
    .line 144
    new-instance v1, La/ugy;

    .line 145
    .line 146
    invoke-direct {v1, p0, p1, v4}, La/ugy;-><init>(La/vgy;La/xgy;B)V

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iput-object v1, p0, La/vgy;->l:La/a8z;

    .line 154
    .line 155
    new-instance v1, La/tgy;

    .line 156
    .line 157
    invoke-direct {v1, p1, v5}, La/tgy;-><init>(La/xgy;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, La/vgy;->m:La/a8z;

    .line 165
    .line 166
    new-instance v0, La/o0t;

    .line 167
    .line 168
    const/4 v6, 0x1

    .line 169
    const/16 v7, 0xb

    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    const-class v3, La/ahy;

    .line 173
    .line 174
    const-string v4, "computeDeclaredMembers"

    .line 175
    .line 176
    const-string v5, "computeDeclaredMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;"

    .line 177
    .line 178
    move-object v2, p1

    .line 179
    invoke-direct/range {v0 .. v7}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 180
    .line 181
    .line 182
    invoke-static {v8, v0}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iput-object v0, p0, La/vgy;->n:La/mre0;

    .line 187
    .line 188
    new-instance v0, La/o0t;

    .line 189
    .line 190
    const/16 v7, 0xa

    .line 191
    .line 192
    const-string v4, "computeAllMembers"

    .line 193
    .line 194
    const-string v5, "computeAllMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;"

    .line 195
    .line 196
    invoke-direct/range {v0 .. v7}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 197
    .line 198
    .line 199
    invoke-static {v8, v0}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iput-object v0, p0, La/vgy;->o:La/mre0;

    .line 204
    .line 205
    new-instance v0, La/ugy;

    .line 206
    .line 207
    invoke-direct {v0, p1, p0, v9}, La/ugy;-><init>(La/xgy;La/vgy;B)V

    .line 208
    .line 209
    .line 210
    invoke-static {v8, v0}, La/bww;->S(La/mp9;Lkotlin/jvm/functions/Function0;)La/mre0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, p0, La/vgy;->p:La/mre0;

    .line 215
    .line 216
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 2

    .line 1
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    aget-object v0, v0, v1

    .line 6
    .line 7
    iget-object p0, p0, La/vgy;->n:La/mre0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/util/Collection;

    .line 17
    .line 18
    return-object p0
.end method

.method public final b()La/wm40;
    .locals 2

    .line 1
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/vgy;->d:La/mre0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/wm40;

    .line 16
    .line 17
    return-object p0
.end method

.method public final c()La/qpy;
    .locals 0

    .line 1
    iget-object p0, p0, La/vgy;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qpy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()La/nzs0;
    .locals 2

    .line 1
    sget-object v0, La/vgy;->r:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/vgy;->j:La/mre0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/nzs0;

    .line 16
    .line 17
    return-object p0
.end method
